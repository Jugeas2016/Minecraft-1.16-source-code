/*     */ import com.google.common.collect.Queues;
/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import io.netty.bootstrap.Bootstrap;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelException;
/*     */ import io.netty.channel.ChannelFuture;
/*     */ import io.netty.channel.ChannelFutureListener;
/*     */ import io.netty.channel.ChannelHandler;
/*     */ import io.netty.channel.ChannelHandlerContext;
/*     */ import io.netty.channel.ChannelInitializer;
/*     */ import io.netty.channel.ChannelOption;
/*     */ import io.netty.channel.DefaultEventLoopGroup;
/*     */ import io.netty.channel.EventLoopGroup;
/*     */ import io.netty.channel.SimpleChannelInboundHandler;
/*     */ import io.netty.channel.epoll.Epoll;
/*     */ import io.netty.channel.epoll.EpollEventLoopGroup;
/*     */ import io.netty.channel.epoll.EpollSocketChannel;
/*     */ import io.netty.channel.local.LocalChannel;
/*     */ import io.netty.channel.nio.NioEventLoopGroup;
/*     */ import io.netty.channel.socket.nio.NioSocketChannel;
/*     */ import io.netty.handler.timeout.ReadTimeoutHandler;
/*     */ import io.netty.util.AttributeKey;
/*     */ import io.netty.util.concurrent.Future;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.net.InetAddress;
/*     */ import java.net.SocketAddress;
/*     */ import java.util.Queue;
/*     */ import javax.annotation.Nullable;
/*     */ import javax.crypto.Cipher;
/*     */ import org.apache.commons.lang3.Validate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.Marker;
/*     */ import org.apache.logging.log4j.MarkerManager;
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
/*     */ public class nd
/*     */   extends SimpleChannelInboundHandler<oj<?>>
/*     */ {
/*  55 */   private static final Logger g = LogManager.getLogger();
/*  56 */   public static final Marker a = MarkerManager.getMarker("NETWORK");
/*     */   
/*  58 */   public static final Marker b = MarkerManager.getMarker("NETWORK_PACKETS", a);
/*  59 */   public static final AttributeKey<ne> c = AttributeKey.valueOf("protocol");
/*  60 */   public static final afi<NioEventLoopGroup> d = new afi<>(() -> new NioEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Client IO #%d").setDaemon(true).build()));
/*     */ 
/*     */   
/*  63 */   public static final afi<EpollEventLoopGroup> e = new afi<>(() -> new EpollEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build()));
/*     */ 
/*     */   
/*  66 */   public static final afi<DefaultEventLoopGroup> f = new afi<>(() -> new DefaultEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Local Client IO #%d").setDaemon(true).build()));
/*     */ 
/*     */   
/*     */   private final ok h;
/*     */   
/*  71 */   private final Queue<a> i = Queues.newConcurrentLinkedQueue();
/*     */   private Channel j;
/*     */   private SocketAddress k;
/*     */   private ni l;
/*     */   private nr m;
/*     */   private boolean n;
/*     */   private boolean o;
/*     */   private int p;
/*     */   private int q;
/*     */   private float r;
/*     */   private float s;
/*     */   private int t;
/*     */   private boolean u;
/*     */   
/*     */   public nd(ok ☃) {
/*  86 */     this.h = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void channelActive(ChannelHandlerContext ☃) throws Exception {
/*  91 */     super.channelActive(☃);
/*  92 */     this.j = ☃.channel();
/*  93 */     this.k = this.j.remoteAddress();
/*     */     try {
/*  95 */       a(ne.a);
/*  96 */     } catch (Throwable throwable) {
/*  97 */       g.fatal(throwable);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(ne ☃) {
/* 102 */     this.j.attr(c).set(☃);
/* 103 */     this.j.config().setAutoRead(true);
/* 104 */     g.debug("Enabled auto read");
/*     */   }
/*     */ 
/*     */   
/*     */   public void channelInactive(ChannelHandlerContext ☃) throws Exception {
/* 109 */     a(new of("disconnect.endOfStream"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void exceptionCaught(ChannelHandlerContext ☃, Throwable throwable) {
/* 114 */     if (throwable instanceof nk) {
/* 115 */       g.debug("Skipping packet due to errors", throwable.getCause());
/*     */       
/*     */       return;
/*     */     } 
/* 119 */     boolean bool = !this.u;
/* 120 */     this.u = true;
/*     */     
/* 122 */     if (!this.j.isOpen()) {
/*     */       return;
/*     */     }
/*     */     
/* 126 */     if (throwable instanceof io.netty.handler.timeout.TimeoutException) {
/* 127 */       g.debug("Timeout", throwable);
/* 128 */       a(new of("disconnect.timeout"));
/*     */     } else {
/* 130 */       nr nr1 = new of("disconnect.genericReason", new Object[] { "Internal Exception: " + throwable });
/*     */       
/* 132 */       if (bool) {
/* 133 */         g.debug("Failed to sent packet", throwable);
/* 134 */         a(new pm(nr1), future -> a(☃));
/* 135 */         l();
/*     */       } else {
/* 137 */         g.debug("Double fault", throwable);
/* 138 */         a(nr1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ChannelHandlerContext ☃, oj<?> oj1) throws Exception {
/* 145 */     if (this.j.isOpen()) {
/*     */       try {
/* 147 */         a(oj1, this.l);
/* 148 */       } catch (vu vu) {}
/*     */       
/* 150 */       this.p++;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static <T extends ni> void a(oj<T> ☃, ni ni1) {
/* 156 */     ☃.a((T)ni1);
/*     */   }
/*     */   
/*     */   public void a(ni ☃) {
/* 160 */     Validate.notNull(☃, "packetListener", new Object[0]);
/* 161 */     this.l = ☃;
/*     */   }
/*     */   
/*     */   public void a(oj<?> ☃) {
/* 165 */     a(☃, (GenericFutureListener<? extends Future<? super Void>>)null);
/*     */   }
/*     */   
/*     */   public void a(oj<?> ☃, @Nullable GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
/* 169 */     if (h()) {
/* 170 */       p();
/* 171 */       b(☃, genericFutureListener);
/*     */     } else {
/* 173 */       this.i.add(new a(☃, genericFutureListener));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(oj<?> ☃, @Nullable GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
/* 178 */     ne ne1 = ne.a(☃);
/* 179 */     ne ne2 = (ne)this.j.attr(c).get();
/* 180 */     this.q++;
/*     */     
/* 182 */     if (ne2 != ne1) {
/* 183 */       g.debug("Disabled auto read");
/* 184 */       this.j.config().setAutoRead(false);
/*     */     } 
/*     */     
/* 187 */     if (this.j.eventLoop().inEventLoop()) {
/* 188 */       if (ne1 != ne2) {
/* 189 */         a(ne1);
/*     */       }
/* 191 */       ChannelFuture channelFuture = this.j.writeAndFlush(☃);
/* 192 */       if (genericFutureListener != null) {
/* 193 */         channelFuture.addListener(genericFutureListener);
/*     */       }
/* 195 */       channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
/*     */     } else {
/* 197 */       this.j.eventLoop().execute(() -> {
/*     */             if (☃ != ne1) {
/*     */               a(☃);
/*     */             }
/*     */             ChannelFuture channelFuture = this.j.writeAndFlush(oj1);
/*     */             if (genericFutureListener != null) {
/*     */               channelFuture.addListener(genericFutureListener);
/*     */             }
/*     */             channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
/*     */           });
/*     */     } 
/*     */   }
/*     */   
/*     */   private void p() {
/* 211 */     if (this.j == null || !this.j.isOpen()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 216 */     synchronized (this.i) {
/*     */       a ☃;
/* 218 */       while ((☃ = this.i.poll()) != null) {
/* 219 */         b(a.a(☃), a.b(☃));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/* 225 */     p();
/*     */     
/* 227 */     if (this.l instanceof aba) {
/* 228 */       ((aba)this.l).b();
/*     */     }
/*     */     
/* 231 */     if (this.l instanceof aay) {
/* 232 */       ((aay)this.l).b();
/*     */     }
/*     */     
/* 235 */     if (this.j != null) {
/* 236 */       this.j.flush();
/*     */     }
/*     */     
/* 239 */     if (this.t++ % 20 == 0) {
/* 240 */       b();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b() {
/* 245 */     this.s = afm.g(0.75F, this.q, this.s);
/* 246 */     this.r = afm.g(0.75F, this.p, this.r);
/* 247 */     this.q = 0;
/* 248 */     this.p = 0;
/*     */   }
/*     */   
/*     */   public SocketAddress c() {
/* 252 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(nr ☃) {
/* 256 */     if (this.j.isOpen()) {
/* 257 */       this.j.close().awaitUninterruptibly();
/*     */       
/* 259 */       this.m = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 264 */     return (this.j instanceof LocalChannel || this.j instanceof io.netty.channel.local.LocalServerChannel);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static nd a(InetAddress ☃, int i, boolean bool) {
/*     */     Class<NioSocketChannel> clazz;
/*     */     afi<NioEventLoopGroup> afi1;
/* 276 */     nd nd1 = new nd(ok.b);
/*     */ 
/*     */ 
/*     */     
/* 280 */     if (Epoll.isAvailable() && bool) {
/* 281 */       Class<EpollSocketChannel> clazz1 = EpollSocketChannel.class;
/* 282 */       afi<EpollEventLoopGroup> afi2 = e;
/*     */     } else {
/* 284 */       clazz = NioSocketChannel.class;
/* 285 */       afi1 = d;
/*     */     } 
/*     */     
/* 288 */     ((Bootstrap)((Bootstrap)((Bootstrap)(new Bootstrap()).group((EventLoopGroup)afi1.a())).handler((ChannelHandler)new ChannelInitializer<Channel>(nd1)
/*     */         {
/*     */           protected void initChannel(Channel ☃) throws Exception {
/*     */             try {
/* 292 */               ☃.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
/* 293 */             } catch (ChannelException channelException) {}
/*     */ 
/*     */             
/* 296 */             ☃.pipeline()
/* 297 */               .addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30))
/*     */ 
/*     */               
/* 300 */               .addLast("splitter", (ChannelHandler)new nl())
/*     */               
/* 302 */               .addLast("decoder", (ChannelHandler)new ng(ok.b))
/*     */ 
/*     */               
/* 305 */               .addLast("prepender", (ChannelHandler)new nm())
/*     */               
/* 307 */               .addLast("encoder", (ChannelHandler)new nh(ok.a))
/*     */               
/* 309 */               .addLast("packet_handler", (ChannelHandler)this.a);
/*     */           }
/* 311 */         })).channel(clazz)).connect(☃, i).syncUninterruptibly();
/*     */     
/* 313 */     return nd1;
/*     */   }
/*     */   
/*     */   public static nd a(SocketAddress ☃) {
/* 317 */     nd nd1 = new nd(ok.b);
/*     */     
/* 319 */     ((Bootstrap)((Bootstrap)((Bootstrap)(new Bootstrap()).group((EventLoopGroup)f.a())).handler((ChannelHandler)new ChannelInitializer<Channel>(nd1)
/*     */         {
/*     */           protected void initChannel(Channel ☃) throws Exception {
/* 322 */             ☃.pipeline().addLast("packet_handler", (ChannelHandler)this.a);
/*     */           }
/* 324 */         })).channel(LocalChannel.class)).connect(☃).syncUninterruptibly();
/*     */     
/* 326 */     return nd1;
/*     */   }
/*     */   
/*     */   public void a(Cipher ☃, Cipher cipher1) {
/* 330 */     this.n = true;
/* 331 */     this.j.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new mz(☃));
/* 332 */     this.j.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new na(cipher1));
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 336 */     return this.n;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 340 */     return (this.j != null && this.j.isOpen());
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 344 */     return (this.j == null);
/*     */   }
/*     */   
/*     */   public ni j() {
/* 348 */     return this.l;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public nr k() {
/* 353 */     return this.m;
/*     */   }
/*     */   
/*     */   public void l() {
/* 357 */     this.j.config().setAutoRead(false);
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 361 */     if (☃ >= 0) {
/* 362 */       if (this.j.pipeline().get("decompress") instanceof nb) {
/* 363 */         ((nb)this.j.pipeline().get("decompress")).a(☃);
/*     */       } else {
/* 365 */         this.j.pipeline().addBefore("decoder", "decompress", (ChannelHandler)new nb(☃));
/*     */       } 
/*     */       
/* 368 */       if (this.j.pipeline().get("compress") instanceof nc) {
/* 369 */         ((nc)this.j.pipeline().get("compress")).a(☃);
/*     */       } else {
/* 371 */         this.j.pipeline().addBefore("encoder", "compress", (ChannelHandler)new nc(☃));
/*     */       } 
/*     */     } else {
/* 374 */       if (this.j.pipeline().get("decompress") instanceof nb) {
/* 375 */         this.j.pipeline().remove("decompress");
/*     */       }
/*     */       
/* 378 */       if (this.j.pipeline().get("compress") instanceof nc) {
/* 379 */         this.j.pipeline().remove("compress");
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void m() {
/* 385 */     if (this.j == null || this.j.isOpen()) {
/*     */       return;
/*     */     }
/*     */     
/* 389 */     if (this.o) {
/* 390 */       g.warn("handleDisconnection() called twice");
/*     */     } else {
/* 392 */       this.o = true;
/* 393 */       if (k() != null) {
/* 394 */         j().a(k());
/* 395 */       } else if (j() != null) {
/* 396 */         j().a(new of("multiplayer.disconnect.generic"));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public float n() {
/* 402 */     return this.r;
/*     */   }
/*     */   
/*     */   public float o() {
/* 406 */     return this.s;
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final oj<?> a;
/*     */     @Nullable
/*     */     private final GenericFutureListener<? extends Future<? super Void>> b;
/*     */     
/*     */     public a(oj<?> ☃, @Nullable GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
/* 415 */       this.a = ☃;
/* 416 */       this.b = genericFutureListener;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */