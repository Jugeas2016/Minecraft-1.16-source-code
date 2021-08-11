/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*     */ import io.netty.channel.ChannelFuture;
/*     */ import io.netty.util.concurrent.Future;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.math.BigInteger;
/*     */ import java.net.InetAddress;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.SocketAddress;
/*     */ import java.security.PrivateKey;
/*     */ import java.util.Arrays;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import javax.annotation.Nullable;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ public class aba
/*     */   implements ue
/*     */ {
/*  42 */   private static final AtomicInteger b = new AtomicInteger(0);
/*  43 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*  45 */   private static final Random d = new Random();
/*     */   
/*  47 */   private final byte[] e = new byte[4];
/*     */   private final MinecraftServer f;
/*     */   public final nd a;
/*  50 */   private a g = a.a;
/*     */   private int h;
/*     */   private GameProfile i;
/*  53 */   private final String j = "";
/*     */   private SecretKey k;
/*     */   private aah l;
/*     */   
/*     */   public aba(MinecraftServer ☃, nd nd1) {
/*  58 */     this.f = ☃;
/*  59 */     this.a = nd1;
/*  60 */     d.nextBytes(this.e);
/*     */   }
/*     */   
/*     */   public void b() {
/*  64 */     if (this.g == a.e) {
/*  65 */       c();
/*  66 */     } else if (this.g == a.f) {
/*  67 */       aah ☃ = this.f.ae().a(this.i.getId());
/*  68 */       if (☃ == null) {
/*  69 */         this.g = a.e;
/*  70 */         this.f.ae().a(this.a, this.l);
/*  71 */         this.l = null;
/*     */       } 
/*     */     } 
/*  74 */     if (this.h++ == 600) {
/*  75 */       b(new of("multiplayer.disconnect.slow_login"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public nd a() {
/*  81 */     return this.a;
/*     */   }
/*     */   
/*     */   public void b(nr ☃) {
/*     */     try {
/*  86 */       c.info("Disconnecting {}: {}", d(), ☃.getString());
/*  87 */       this.a.a(new ud(☃));
/*  88 */       this.a.a(☃);
/*  89 */     } catch (Exception exception) {
/*  90 */       c.error("Error whilst disconnecting player", exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void c() {
/*  95 */     if (!this.i.isComplete()) {
/*  96 */       this.i = a(this.i);
/*     */     }
/*     */     
/*  99 */     nr ☃ = this.f.ae().a(this.a.c(), this.i);
/* 100 */     if (☃ != null) {
/* 101 */       b(☃);
/*     */     } else {
/* 103 */       this.g = a.g;
/* 104 */       if (this.f.ax() >= 0 && !this.a.d()) {
/* 105 */         this.a.a(new uc(this.f.ax()), (GenericFutureListener<? extends Future<? super Void>>)(☃ -> this.a.a(this.f.ax())));
/*     */       }
/* 107 */       this.a.a(new ua(this.i));
/* 108 */       aah aah1 = this.f.ae().a(this.i.getId());
/* 109 */       if (aah1 != null) {
/* 110 */         this.g = a.f;
/* 111 */         this.l = this.f.ae().g(this.i);
/*     */       } else {
/* 113 */         this.f.ae().a(this.a, this.f.ae().g(this.i));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nr ☃) {
/* 120 */     c.info("{} lost connection: {}", d(), ☃.getString());
/*     */   }
/*     */   
/*     */   public String d() {
/* 124 */     if (this.i != null) {
/* 125 */       return this.i + " (" + this.a.c() + ")";
/*     */     }
/* 127 */     return String.valueOf(this.a.c());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ug ☃) {
/* 132 */     Validate.validState((this.g == a.a), "Unexpected hello packet", new Object[0]);
/* 133 */     this.i = ☃.b();
/*     */     
/* 135 */     if (this.f.V() && !this.a.d()) {
/* 136 */       this.g = a.b;
/* 137 */       this.a.a(new ub("", this.f.L().getPublic().getEncoded(), this.e));
/*     */     } else {
/* 139 */       this.g = a.e;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(uh ☃) {
/*     */     String str;
/* 145 */     Validate.validState((this.g == a.b), "Unexpected key packet", new Object[0]);
/* 146 */     PrivateKey privateKey = this.f.L().getPrivate();
/*     */ 
/*     */     
/*     */     try {
/* 150 */       if (!Arrays.equals(this.e, ☃.b(privateKey))) {
/* 151 */         throw new IllegalStateException("Protocol error");
/*     */       }
/* 153 */       this.k = ☃.a(privateKey);
/* 154 */       Cipher cipher1 = aeu.a(2, this.k);
/* 155 */       Cipher cipher2 = aeu.a(1, this.k);
/* 156 */       str = (new BigInteger(aeu.a("", this.f.L().getPublic(), this.k))).toString(16);
/*     */       
/* 158 */       this.g = a.c;
/* 159 */       this.a.a(cipher1, cipher2);
/* 160 */     } catch (aev aev) {
/* 161 */       throw new IllegalStateException("Protocol error", aev);
/*     */     } 
/*     */     
/* 164 */     Thread thread = new Thread(this, "User Authenticator #" + b.incrementAndGet(), str)
/*     */       {
/*     */         public void run() {
/* 167 */           GameProfile ☃ = aba.a(this.b);
/*     */           try {
/* 169 */             aba.a(this.b, aba.b(this.b).ap().hasJoinedServer(new GameProfile(null, ☃.getName()), this.a, a()));
/*     */             
/* 171 */             if (aba.a(this.b) != null) {
/* 172 */               aba.e().info("UUID of player {} is {}", aba.a(this.b).getName(), aba.a(this.b).getId());
/* 173 */               aba.a(this.b, aba.a.e);
/* 174 */             } else if (aba.b(this.b).O()) {
/* 175 */               aba.e().warn("Failed to verify username but will let them in anyway!");
/* 176 */               aba.a(this.b, this.b.a(☃));
/* 177 */               aba.a(this.b, aba.a.e);
/*     */             } else {
/* 179 */               this.b.b(new of("multiplayer.disconnect.unverified_username"));
/* 180 */               aba.e().error("Username '{}' tried to join with an invalid session", ☃.getName());
/*     */             } 
/* 182 */           } catch (AuthenticationUnavailableException authenticationUnavailableException) {
/* 183 */             if (aba.b(this.b).O()) {
/* 184 */               aba.e().warn("Authentication servers are down but will let them in anyway!");
/* 185 */               aba.a(this.b, this.b.a(☃));
/* 186 */               aba.a(this.b, aba.a.e);
/*     */             } else {
/* 188 */               this.b.b(new of("multiplayer.disconnect.authservers_down"));
/* 189 */               aba.e().error("Couldn't verify username because servers are unavailable");
/*     */             } 
/*     */           } 
/*     */         }
/*     */         
/*     */         @Nullable
/*     */         private InetAddress a() {
/* 196 */           SocketAddress ☃ = this.b.a.c();
/* 197 */           return (aba.b(this.b).W() && ☃ instanceof InetSocketAddress) ? ((InetSocketAddress)☃).getAddress() : null;
/*     */         }
/*     */       };
/* 200 */     thread.setUncaughtExceptionHandler(new o(c));
/* 201 */     thread.start();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(uf ☃) {
/* 206 */     b(new of("multiplayer.disconnect.unexpected_query_response"));
/*     */   }
/*     */   
/*     */   protected GameProfile a(GameProfile ☃) {
/* 210 */     UUID uUID = bfw.c(☃.getName());
/* 211 */     return new GameProfile(uUID, ☃.getName());
/*     */   }
/*     */   
/*     */   enum a {
/* 215 */     a, b, c, d, e, f, g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */