/*     */ import java.util.Random;
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
/*     */ public class bxx
/*     */   extends buo
/*     */ {
/*  25 */   public static final cfg a = cex.an;
/*  26 */   public static final cey b = cex.v;
/*     */ 
/*     */ 
/*     */   
/*     */   public bxx(ceg.c ☃) {
/*  31 */     super(☃);
/*  32 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(7)).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh e(ceh ☃, brc brc1, fx fx1) {
/*  37 */     return dde.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/*  42 */     return (((Integer)☃.c(a)).intValue() == 7 && !((Boolean)☃.c(b)).booleanValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  47 */     if (!((Boolean)☃.c(b)).booleanValue() && ((Integer)☃.c(a)).intValue() == 7) {
/*  48 */       c(☃, aag1, fx1);
/*  49 */       aag1.a(fx1, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  55 */     aag1.a(fx1, a(☃, aag1, fx1), 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public int f(ceh ☃, brc brc1, fx fx1) {
/*  60 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  65 */     int i = h(ceh1) + 1;
/*  66 */     if (i != 1 || ((Integer)☃.c(a)).intValue() != i) {
/*  67 */       bry1.J().a(fx1, this, 1);
/*     */     }
/*  69 */     return ☃;
/*     */   }
/*     */   
/*     */   private static ceh a(ceh ☃, bry bry1, fx fx1) {
/*  73 */     int i = 7;
/*  74 */     fx.a a = new fx.a();
/*  75 */     for (gc gc : gc.values()) {
/*  76 */       a.a(fx1, gc);
/*  77 */       i = Math.min(i, h(bry1.d_(a)) + 1);
/*  78 */       if (i == 1) {
/*     */         break;
/*     */       }
/*     */     } 
/*  82 */     return ☃.a(a, Integer.valueOf(i));
/*     */   }
/*     */   
/*     */   private static int h(ceh ☃) {
/*  86 */     if (aed.s.a(☃.b())) {
/*  87 */       return 0;
/*     */     }
/*  89 */     if (☃.b() instanceof bxx) {
/*  90 */       return ((Integer)☃.c(a)).intValue();
/*     */     }
/*  92 */     return 7;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/*  97 */     if (!brx1.t(fx1.b())) {
/*     */       return;
/*     */     }
/*     */     
/* 101 */     if (random.nextInt(15) != 1) {
/*     */       return;
/*     */     }
/*     */     
/* 105 */     fx fx2 = fx1.c();
/* 106 */     ceh ceh1 = brx1.d_(fx2);
/* 107 */     if (ceh1.l() && ceh1.d(brx1, fx2, gc.b)) {
/*     */       return;
/*     */     }
/*     */     
/* 111 */     double d1 = fx1.u() + random.nextDouble();
/* 112 */     double d2 = fx1.v() - 0.05D;
/* 113 */     double d3 = fx1.w() + random.nextDouble();
/*     */     
/* 115 */     brx1.a(hh.m, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 120 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 125 */     return a(n().a(b, Boolean.valueOf(true)), ☃.p(), ☃.a());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */