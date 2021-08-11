/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import io.netty.bootstrap.ServerBootstrap;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelException;
/*     */ import io.netty.channel.ChannelFuture;
/*     */ import io.netty.channel.ChannelHandler;
/*     */ import io.netty.channel.ChannelInitializer;
/*     */ import io.netty.channel.ChannelOption;
/*     */ import io.netty.channel.EventLoopGroup;
/*     */ import io.netty.channel.epoll.Epoll;
/*     */ import io.netty.channel.epoll.EpollEventLoopGroup;
/*     */ import io.netty.channel.epoll.EpollServerSocketChannel;
/*     */ import io.netty.channel.local.LocalAddress;
/*     */ import io.netty.channel.local.LocalServerChannel;
/*     */ import io.netty.channel.nio.NioEventLoopGroup;
/*     */ import io.netty.channel.socket.nio.NioServerSocketChannel;
/*     */ import io.netty.handler.timeout.ReadTimeoutHandler;
/*     */ import io.netty.util.concurrent.Future;
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.SocketAddress;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aax
/*     */ {
/*  54 */   private static final Logger d = LogManager.getLogger();
/*  55 */   public static final afi<NioEventLoopGroup> a = new afi<>(() -> new NioEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Server IO #%d").setDaemon(true).build()));
/*     */ 
/*     */   
/*  58 */   public static final afi<EpollEventLoopGroup> b = new afi<>(() -> new EpollEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build()));
/*     */   
/*     */   private final MinecraftServer e;
/*     */   
/*     */   public volatile boolean c;
/*     */   
/*  64 */   private final List<ChannelFuture> f = Collections.synchronizedList(Lists.newArrayList());
/*  65 */   private final List<nd> g = Collections.synchronizedList(Lists.newArrayList());
/*     */   
/*     */   public aax(MinecraftServer ☃) {
/*  68 */     this.e = ☃;
/*  69 */     this.c = true;
/*     */   }
/*     */   
/*     */   public void a(@Nullable InetAddress ☃, int i) throws IOException {
/*  73 */     synchronized (this.f) {
/*     */       Class<NioServerSocketChannel> clazz;
/*     */       afi<NioEventLoopGroup> afi1;
/*  76 */       if (Epoll.isAvailable() && this.e.l()) {
/*  77 */         Class<EpollServerSocketChannel> clazz1 = EpollServerSocketChannel.class;
/*  78 */         afi<EpollEventLoopGroup> afi2 = b;
/*  79 */         d.info("Using epoll channel type");
/*     */       } else {
/*  81 */         clazz = NioServerSocketChannel.class;
/*  82 */         afi1 = a;
/*  83 */         d.info("Using default channel type");
/*     */       } 
/*     */       
/*  86 */       this.f.add(((ServerBootstrap)((ServerBootstrap)(new ServerBootstrap())
/*  87 */           .channel(clazz))
/*  88 */           .childHandler((ChannelHandler)new ChannelInitializer<Channel>(this)
/*     */             {
/*     */               protected void initChannel(Channel ☃) throws Exception {
/*     */                 try {
/*  92 */                   ☃.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
/*  93 */                 } catch (ChannelException channelException) {}
/*     */ 
/*     */                 
/*  96 */                 ☃.pipeline()
/*  97 */                   .addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30))
/*  98 */                   .addLast("legacy_query", (ChannelHandler)new aav(this.a))
/*     */                   
/* 100 */                   .addLast("splitter", (ChannelHandler)new nl())
/* 101 */                   .addLast("decoder", (ChannelHandler)new ng(ok.a))
/*     */                   
/* 103 */                   .addLast("prepender", (ChannelHandler)new nm())
/* 104 */                   .addLast("encoder", (ChannelHandler)new nh(ok.b));
/*     */                 
/* 106 */                 int i = aax.a(this.a).k();
/* 107 */                 nd nd = (i > 0) ? new nj(i) : new nd(ok.a);
/* 108 */                 aax.b(this.a).add(nd);
/* 109 */                 ☃.pipeline().addLast("packet_handler", (ChannelHandler)nd);
/* 110 */                 nd.a(new aaz(aax.a(this.a), nd));
/*     */               }
/* 113 */             }).group((EventLoopGroup)afi1.a())
/* 114 */           .localAddress(☃, i))
/* 115 */           .bind()
/* 116 */           .syncUninterruptibly());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public SocketAddress a() {
/*     */     ChannelFuture ☃;
/* 123 */     synchronized (this.f) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 141 */       ☃ = ((ServerBootstrap)((ServerBootstrap)(new ServerBootstrap()).channel(LocalServerChannel.class)).childHandler((ChannelHandler)new ChannelInitializer<Channel>(this) { protected void initChannel(Channel ☃) throws Exception { nd nd = new nd(ok.a); nd.a(new aaw(aax.a(this.a), nd)); aax.b(this.a).add(nd); ☃.pipeline().addLast("packet_handler", (ChannelHandler)nd); } }).group((EventLoopGroup)a.a()).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly();
/*     */       
/* 143 */       this.f.add(☃);
/*     */     } 
/*     */     
/* 146 */     return ☃.channel().localAddress();
/*     */   }
/*     */   
/*     */   public void b() {
/* 150 */     this.c = false;
/*     */     
/* 152 */     for (ChannelFuture ☃ : this.f) {
/*     */       try {
/* 154 */         ☃.channel().close().sync();
/* 155 */       } catch (InterruptedException interruptedException) {
/* 156 */         d.error("Interrupted whilst closing channel");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void c() {
/* 162 */     synchronized (this.g) {
/* 163 */       Iterator<nd> ☃ = this.g.iterator();
/*     */       
/* 165 */       while (☃.hasNext()) {
/* 166 */         nd nd = ☃.next();
/*     */         
/* 168 */         if (nd.i()) {
/*     */           continue;
/*     */         }
/* 171 */         if (nd.h()) {
/*     */           try {
/* 173 */             nd.a();
/* 174 */           } catch (Exception exception) {
/* 175 */             if (nd.d()) {
/* 176 */               throw new u(l.a(exception, "Ticking memory connection"));
/*     */             }
/* 178 */             d.warn("Failed to handle packet for {}", nd.c(), exception);
/* 179 */             nr nr = new oe("Internal server error");
/* 180 */             nd.a(new pm(nr), future -> ☃.a(nr1));
/* 181 */             nd.l();
/*     */           } 
/*     */           continue;
/*     */         } 
/* 185 */         ☃.remove();
/* 186 */         nd.m();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public MinecraftServer d() {
/* 193 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */