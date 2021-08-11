/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import io.netty.bootstrap.Bootstrap;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelException;
/*     */ import io.netty.channel.ChannelFutureListener;
/*     */ import io.netty.channel.ChannelHandler;
/*     */ import io.netty.channel.ChannelHandlerContext;
/*     */ import io.netty.channel.ChannelInitializer;
/*     */ import io.netty.channel.ChannelOption;
/*     */ import io.netty.channel.EventLoopGroup;
/*     */ import io.netty.channel.SimpleChannelInboundHandler;
/*     */ import io.netty.channel.socket.nio.NioSocketChannel;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.net.InetAddress;
/*     */ import java.net.UnknownHostException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.apache.commons.lang3.ArrayUtils;
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
/*     */ public class dxb
/*     */ {
/*  47 */   private static final Splitter a = Splitter.on(false).limit(6);
/*  48 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  50 */   private final List<nd> c = Collections.synchronizedList(Lists.newArrayList());
/*     */   
/*     */   public void a(dwz ☃, Runnable runnable) throws UnknownHostException {
/*  53 */     dwy dwy = dwy.a(☃.b);
/*  54 */     nd nd = nd.a(InetAddress.getByName(dwy.a()), dwy.b(), false);
/*     */     
/*  56 */     this.c.add(nd);
/*     */     
/*  58 */     ☃.d = new of("multiplayer.status.pinging");
/*  59 */     ☃.e = -1L;
/*  60 */     ☃.i = null;
/*     */     
/*  62 */     nd.a(new uk(this, nd, ☃, runnable)
/*     */         {
/*     */           private boolean e;
/*     */           private boolean f;
/*     */           private long g;
/*     */           
/*     */           public void a(um ☃) {
/*  69 */             if (this.f) {
/*  70 */               this.a.a(new of("multiplayer.status.unrequested"));
/*     */               return;
/*     */             } 
/*  73 */             this.f = true;
/*  74 */             un un = ☃.b();
/*     */             
/*  76 */             if (un.a() != null) {
/*  77 */               this.b.d = un.a();
/*     */             } else {
/*  79 */               this.b.d = oe.d;
/*     */             } 
/*     */             
/*  82 */             if (un.c() != null) {
/*  83 */               this.b.g = new oe(un.c().a());
/*  84 */               this.b.f = un.c().b();
/*     */             } else {
/*  86 */               this.b.g = new of("multiplayer.status.old");
/*  87 */               this.b.f = 0;
/*     */             } 
/*     */             
/*  90 */             if (un.b() != null) {
/*  91 */               this.b.c = dxb.a(un.b().b(), un.b().a());
/*     */               
/*  93 */               List<nr> list = Lists.newArrayList();
/*  94 */               if (ArrayUtils.isNotEmpty((Object[])un.b().c())) {
/*  95 */                 for (GameProfile gameProfile : un.b().c()) {
/*  96 */                   list.add(new oe(gameProfile.getName()));
/*     */                 }
/*  98 */                 if ((un.b().c()).length < un.b().b()) {
/*  99 */                   list.add(new of("multiplayer.status.and_more", new Object[] { Integer.valueOf(un.b().b() - (un.b().c()).length) }));
/*     */                 }
/* 101 */                 this.b.i = list;
/*     */               } 
/*     */             } else {
/* 104 */               this.b.c = (new of("multiplayer.status.unknown")).a(k.i);
/*     */             } 
/*     */             
/* 107 */             String str = null;
/* 108 */             if (un.d() != null) {
/* 109 */               String str1 = un.d();
/* 110 */               if (str1.startsWith("data:image/png;base64,")) {
/* 111 */                 str = str1.substring("data:image/png;base64,".length());
/*     */               } else {
/* 113 */                 dxb.c().error("Invalid server icon (unknown format)");
/*     */               } 
/*     */             } 
/* 116 */             if (!Objects.equals(str, this.b.c())) {
/* 117 */               this.b.a(str);
/* 118 */               this.c.run();
/*     */             } 
/*     */             
/* 121 */             this.g = x.b();
/* 122 */             this.a.a(new up(this.g));
/* 123 */             this.e = true;
/*     */           }
/*     */ 
/*     */           
/*     */           public void a(ul ☃) {
/* 128 */             long l1 = this.g;
/* 129 */             long l2 = x.b();
/* 130 */             this.b.e = l2 - l1;
/*     */             
/* 132 */             this.a.a(new of("multiplayer.status.finished"));
/*     */           }
/*     */ 
/*     */           
/*     */           public void a(nr ☃) {
/* 137 */             if (!this.e) {
/* 138 */               dxb.c().error("Can't ping {}: {}", this.b.b, ☃.getString());
/* 139 */               this.b.d = (new of("multiplayer.status.cannot_connect")).a(k.e);
/* 140 */               this.b.c = oe.d;
/*     */               
/* 142 */               dxb.a(this.d, this.b);
/*     */             } 
/*     */           }
/*     */ 
/*     */           
/*     */           public nd a() {
/* 148 */             return this.a;
/*     */           }
/*     */         });
/*     */     
/*     */     try {
/* 153 */       nd.a(new tv(dwy.a(), dwy.b(), ne.c));
/* 154 */       nd.a(new uq());
/* 155 */     } catch (Throwable throwable) {
/* 156 */       b.error(throwable);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dwz ☃) {
/* 161 */     dwy dwy = dwy.a(☃.b);
/*     */     
/* 163 */     ((Bootstrap)((Bootstrap)((Bootstrap)(new Bootstrap())
/* 164 */       .group((EventLoopGroup)nd.d.a()))
/* 165 */       .handler((ChannelHandler)new ChannelInitializer<Channel>(this, dwy, ☃)
/*     */         {
/*     */           protected void initChannel(Channel ☃) throws Exception
/*     */           {
/*     */             try {
/* 170 */               ☃.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
/* 171 */             } catch (ChannelException channelException) {}
/*     */ 
/*     */             
/* 174 */             ☃.pipeline().addLast(new ChannelHandler[] { (ChannelHandler)new SimpleChannelInboundHandler<ByteBuf>(this)
/*     */                   {
/*     */                     public void channelActive(ChannelHandlerContext ☃) throws Exception
/*     */                     {
/* 178 */                       super.channelActive(☃);
/* 179 */                       ByteBuf byteBuf = Unpooled.buffer();
/*     */                       try {
/* 181 */                         byteBuf.writeByte(254);
/* 182 */                         byteBuf.writeByte(1);
/* 183 */                         byteBuf.writeByte(250);
/*     */                         
/* 185 */                         char[] arrayOfChar = "MC|PingHost".toCharArray();
/* 186 */                         byteBuf.writeShort(arrayOfChar.length);
/* 187 */                         for (char c : arrayOfChar) {
/* 188 */                           byteBuf.writeChar(c);
/*     */                         }
/* 190 */                         byteBuf.writeShort(7 + 2 * this.a.a.a().length());
/* 191 */                         byteBuf.writeByte(127);
/* 192 */                         arrayOfChar = this.a.a.a().toCharArray();
/* 193 */                         byteBuf.writeShort(arrayOfChar.length);
/* 194 */                         for (char c : arrayOfChar) {
/* 195 */                           byteBuf.writeChar(c);
/*     */                         }
/* 197 */                         byteBuf.writeInt(this.a.a.b());
/*     */                         
/* 199 */                         ☃.channel().writeAndFlush(byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
/*     */                       } finally {
/* 201 */                         byteBuf.release();
/*     */                       } 
/*     */                     }
/*     */ 
/*     */                     
/*     */                     protected void a(ChannelHandlerContext ☃, ByteBuf byteBuf) throws Exception {
/* 207 */                       short s = byteBuf.readUnsignedByte();
/*     */                       
/* 209 */                       if (s == 255) {
/* 210 */                         String str = new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), StandardCharsets.UTF_16BE);
/* 211 */                         String[] arrayOfString = (String[])Iterables.toArray(dxb.d().split(str), String.class);
/*     */                         
/* 213 */                         if ("§1".equals(arrayOfString[0])) {
/* 214 */                           int i = afm.a(arrayOfString[1], 0);
/* 215 */                           String str1 = arrayOfString[2];
/* 216 */                           String str2 = arrayOfString[3];
/* 217 */                           int j = afm.a(arrayOfString[4], -1);
/* 218 */                           int k = afm.a(arrayOfString[5], -1);
/*     */                           
/* 220 */                           this.a.b.f = -1;
/* 221 */                           this.a.b.g = new oe(str1);
/* 222 */                           this.a.b.d = new oe(str2);
/* 223 */                           this.a.b.c = dxb.a(j, k);
/*     */                         } 
/*     */                       } 
/*     */                       
/* 227 */                       ☃.close();
/*     */                     }
/*     */ 
/*     */                     
/*     */                     public void exceptionCaught(ChannelHandlerContext ☃, Throwable throwable) throws Exception {
/* 232 */                       ☃.close();
/*     */                     }
/*     */                   }
/*     */                 
/*     */                 });
/*     */           }
/* 238 */         })).channel(NioSocketChannel.class))
/* 239 */       .connect(dwy.a(), dwy.b());
/*     */   }
/*     */   
/*     */   private static nr b(int ☃, int i) {
/* 243 */     return (new oe(Integer.toString(☃))).a((new oe("/")).a(k.i)).c(Integer.toString(i)).a(k.h);
/*     */   }
/*     */   
/*     */   public void a() {
/* 247 */     synchronized (this.c) {
/* 248 */       Iterator<nd> ☃ = this.c.iterator();
/* 249 */       while (☃.hasNext()) {
/* 250 */         nd nd = ☃.next();
/*     */         
/* 252 */         if (nd.h()) {
/* 253 */           nd.a(); continue;
/*     */         } 
/* 255 */         ☃.remove();
/* 256 */         nd.m();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 263 */     synchronized (this.c) {
/* 264 */       Iterator<nd> ☃ = this.c.iterator();
/* 265 */       while (☃.hasNext()) {
/* 266 */         nd nd = ☃.next();
/*     */         
/* 268 */         if (nd.h()) {
/* 269 */           ☃.remove();
/* 270 */           nd.a(new of("multiplayer.status.cancelled"));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */