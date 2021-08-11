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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bur
/*     */   extends bud
/*     */ {
/*  30 */   public static final cey[] a = new cey[] { cex.k, cex.l, cex.m };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  36 */   protected static final ddh b = dde.a(
/*  37 */       buo.a(1.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D), 
/*  38 */       buo.a(7.0D, 0.0D, 7.0D, 9.0D, 14.0D, 9.0D));
/*     */ 
/*     */   
/*     */   public bur(ceg.c ☃) {
/*  42 */     super(☃);
/*  43 */     j(((ceh)this.n.b()).a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  48 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/*  53 */     return new ccl();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  58 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  63 */     if (brx1.v) {
/*  64 */       return aou.a;
/*     */     }
/*     */     
/*  67 */     ccj ccj = brx1.c(fx1);
/*  68 */     if (ccj instanceof ccl) {
/*  69 */       bfw1.a((ccl)ccj);
/*  70 */       bfw1.a(aea.Z);
/*     */     } 
/*     */     
/*  73 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/*  78 */     if (bmb1.t()) {
/*  79 */       ccj ccj = ☃.c(fx1);
/*  80 */       if (ccj instanceof ccl) {
/*  81 */         ((ccl)ccj).a(bmb1.r());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/*  88 */     double d1 = fx1.u() + 0.4D + random.nextFloat() * 0.2D;
/*  89 */     double d2 = fx1.v() + 0.7D + random.nextFloat() * 0.3D;
/*  90 */     double d3 = fx1.w() + 0.4D + random.nextFloat() * 0.2D;
/*     */     
/*  92 */     brx1.a(hh.S, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  97 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 100 */     ccj ccj = brx1.c(fx1);
/* 101 */     if (ccj instanceof ccl) {
/* 102 */       aoq.a(brx1, fx1, (ccl)ccj);
/*     */     }
/* 104 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 109 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 114 */     return bic.a(brx1.c(fx1));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 119 */     ☃.a((cfj<?>[])new cfj[] { a[0], a[1], a[2] });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 124 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bur.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */