/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.exceptions.AuthenticationException;
/*     */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*     */ import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
/*     */ import com.mojang.authlib.exceptions.InvalidCredentialsException;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import io.netty.util.concurrent.Future;
/*     */ import java.math.BigInteger;
/*     */ import java.security.PublicKey;
/*     */ import java.util.function.Consumer;
/*     */ import javax.annotation.Nullable;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
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
/*     */ public class dws
/*     */   implements ty
/*     */ {
/*  41 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final djz b;
/*     */   @Nullable
/*     */   private final dot c;
/*     */   private final Consumer<nr> d;
/*     */   private final nd e;
/*     */   private GameProfile f;
/*     */   
/*     */   public dws(nd ☃, djz djz1, @Nullable dot dot1, Consumer<nr> consumer) {
/*  51 */     this.e = ☃;
/*  52 */     this.b = djz1;
/*  53 */     this.c = dot1;
/*  54 */     this.d = consumer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ub ☃) {
/*     */     Cipher cipher1, cipher2;
/*     */     String str;
/*     */     uh uh;
/*     */     try {
/*  65 */       SecretKey secretKey = aeu.a();
/*  66 */       PublicKey publicKey = ☃.c();
/*     */       
/*  68 */       str = (new BigInteger(aeu.a(☃.b(), publicKey, secretKey))).toString(16);
/*     */       
/*  70 */       cipher1 = aeu.a(2, secretKey);
/*  71 */       cipher2 = aeu.a(1, secretKey);
/*     */       
/*  73 */       uh = new uh(secretKey, publicKey, ☃.d());
/*  74 */     } catch (aev aev) {
/*  75 */       throw new IllegalStateException("Protocol error", aev);
/*     */     } 
/*     */     
/*  78 */     this.d.accept(new of("connect.authorizing"));
/*     */     
/*  80 */     aff.a.submit(() -> {
/*     */           nr nr = a(☃);
/*     */           if (nr != null) {
/*     */             if (this.b.E() != null && this.b.E().d()) {
/*     */               a.warn(nr.getString());
/*     */             } else {
/*     */               this.e.a(nr);
/*     */               return;
/*     */             } 
/*     */           }
/*     */           this.d.accept(new of("connect.encrypting"));
/*     */           this.e.a(uh1, ());
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private nr a(String ☃) {
/*     */     try {
/*  99 */       b().joinServer(this.b.J().e(), this.b.J().d(), ☃);
/* 100 */     } catch (AuthenticationUnavailableException authenticationUnavailableException) {
/* 101 */       return new of("disconnect.loginFailedInfo", new Object[] { new of("disconnect.loginFailedInfo.serversUnavailable") });
/* 102 */     } catch (InvalidCredentialsException invalidCredentialsException) {
/* 103 */       return new of("disconnect.loginFailedInfo", new Object[] { new of("disconnect.loginFailedInfo.invalidSession") });
/* 104 */     } catch (InsufficientPrivilegesException insufficientPrivilegesException) {
/* 105 */       return new of("disconnect.loginFailedInfo", new Object[] { new of("disconnect.loginFailedInfo.insufficientPrivileges") });
/* 106 */     } catch (AuthenticationException authenticationException) {
/* 107 */       return new of("disconnect.loginFailedInfo", new Object[] { authenticationException.getMessage() });
/*     */     } 
/*     */     
/* 110 */     return null;
/*     */   }
/*     */   
/*     */   private MinecraftSessionService b() {
/* 114 */     return this.b.Y();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ua ☃) {
/* 119 */     this.d.accept(new of("connect.joining"));
/* 120 */     this.f = ☃.b();
/* 121 */     this.e.a(ne.b);
/* 122 */     this.e.a(new dwu(this.b, this.c, this.e, this.f));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nr ☃) {
/* 127 */     if (this.c != null && this.c instanceof eoo) {
/* 128 */       this.b.a(new eoi(this.c, nq.i, ☃));
/*     */     } else {
/* 130 */       this.b.a(new doa(this.c, nq.i, ☃));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public nd a() {
/* 136 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ud ☃) {
/* 141 */     this.e.a(☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(uc ☃) {
/* 146 */     if (!this.e.d()) {
/* 147 */       this.e.a(☃.b());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(tz ☃) {
/* 153 */     this.d.accept(new of("connect.negotiating"));
/* 154 */     this.e.a(new uf(☃.b(), null));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dws.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */