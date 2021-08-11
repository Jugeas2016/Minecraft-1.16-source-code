/*     */ import javax.annotation.Nullable;
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
/*     */ public class bxv
/*     */   extends buo
/*     */   implements bzu
/*     */ {
/*  22 */   public static final cfb a = bxm.aq;
/*  23 */   public static final cey b = cex.C;
/*     */   
/*  25 */   protected static final ddh c = buo.a(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
/*  26 */   protected static final ddh d = buo.a(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  27 */   protected static final ddh e = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
/*  28 */   protected static final ddh f = buo.a(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   protected bxv(ceg.c ☃) {
/*  31 */     super(☃);
/*  32 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  37 */     switch (null.a[((gc)☃.c(a)).ordinal()]) {
/*     */       case 1:
/*  39 */         return f;
/*     */       case 2:
/*  41 */         return e;
/*     */       case 3:
/*  43 */         return d;
/*     */     } 
/*     */     
/*  46 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean a(brc ☃, fx fx1, gc gc1) {
/*  51 */     ceh ceh = ☃.d_(fx1);
/*  52 */     return ceh.d(☃, fx1, gc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  57 */     gc gc = (gc)☃.c(a);
/*  58 */     return a(brz1, fx1.a(gc.f()), gc);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  63 */     if (gc1.f() == ☃.c(a) && !☃.a(bry1, fx1)) {
/*  64 */       return bup.a.n();
/*     */     }
/*  66 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  67 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/*     */     
/*  70 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/*  77 */     if (!☃.c()) {
/*  78 */       ceh ceh1 = ☃.p().d_(☃.a().a(☃.j().f()));
/*  79 */       if (ceh1.a(this) && ceh1.c(a) == ☃.j()) {
/*  80 */         return null;
/*     */       }
/*     */     } 
/*     */     
/*  84 */     ceh ceh = n();
/*     */     
/*  86 */     brz brz = ☃.p();
/*  87 */     fx fx = ☃.a();
/*  88 */     cux cux = ☃.p().b(☃.a());
/*     */     
/*  90 */     for (gc gc : ☃.e()) {
/*  91 */       if (gc.n().d()) {
/*  92 */         ceh = ceh.a(a, gc.f());
/*  93 */         if (ceh.a(brz, fx)) {
/*  94 */           return ceh.a(b, Boolean.valueOf((cux.a() == cuy.c)));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  99 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 104 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 109 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 114 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 119 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 120 */       return cuy.c.a(false);
/*     */     }
/* 122 */     return super.d(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */