/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.io.IOException;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class zf
/*     */   extends acu
/*     */ {
/*  13 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   public zf(zg ☃, gn.b b1, cyk cyk1) {
/*  16 */     super(☃, b1, cyk1, (☃.g_()).K);
/*     */     
/*  18 */     zh zh = ☃.g_();
/*  19 */     a(zh.J);
/*  20 */     super.a(((Boolean)zh.V.get()).booleanValue());
/*     */     
/*  22 */     y();
/*  23 */     w();
/*  24 */     x();
/*  25 */     v();
/*  26 */     z();
/*  27 */     B();
/*  28 */     A();
/*  29 */     if (!i().b().exists()) {
/*  30 */       C();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/*  36 */     super.a(☃);
/*  37 */     b().j(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(GameProfile ☃) {
/*  42 */     super.a(☃);
/*  43 */     A();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(GameProfile ☃) {
/*  48 */     super.b(☃);
/*  49 */     A();
/*     */   }
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
/*     */   public void a() {
/*  66 */     B();
/*     */   }
/*     */   
/*     */   private void v() {
/*     */     try {
/*  71 */       g().e();
/*  72 */     } catch (IOException ☃) {
/*  73 */       a.warn("Failed to save ip banlist: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void w() {
/*     */     try {
/*  79 */       f().e();
/*  80 */     } catch (IOException ☃) {
/*  81 */       a.warn("Failed to save user banlist: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void x() {
/*     */     try {
/*  87 */       g().f();
/*  88 */     } catch (IOException ☃) {
/*  89 */       a.warn("Failed to load ip banlist: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void y() {
/*     */     try {
/*  95 */       f().f();
/*  96 */     } catch (IOException ☃) {
/*  97 */       a.warn("Failed to load user banlist: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void z() {
/*     */     try {
/* 103 */       k().f();
/* 104 */     } catch (Exception ☃) {
/* 105 */       a.warn("Failed to load operators list: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void A() {
/*     */     try {
/* 111 */       k().e();
/* 112 */     } catch (Exception ☃) {
/* 113 */       a.warn("Failed to save operators list: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void B() {
/*     */     try {
/* 119 */       i().f();
/* 120 */     } catch (Exception ☃) {
/* 121 */       a.warn("Failed to load white-list: ", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void C() {
/*     */     try {
/* 127 */       i().e();
/* 128 */     } catch (Exception ☃) {
/* 129 */       a.warn("Failed to save white-list: ", ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(GameProfile ☃) {
/* 135 */     return (!o() || h(☃) || i().a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public zg b() {
/* 140 */     return (zg)super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(GameProfile ☃) {
/* 145 */     return k().b(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */