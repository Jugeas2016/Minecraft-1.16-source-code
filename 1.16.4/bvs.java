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
/*     */ public class bvs
/*     */   extends buu
/*     */   implements buq
/*     */ {
/*  26 */   public static final cfg b = cex.ai;
/*     */   
/*  28 */   private static final ddh[] a = new ddh[] {
/*  29 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
/*  30 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
/*  31 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), 
/*  32 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
/*  33 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), 
/*  34 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), 
/*  35 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), 
/*  36 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)
/*     */     };
/*     */   
/*     */   protected bvs(ceg.c ☃) {
/*  40 */     super(☃);
/*  41 */     j(((ceh)this.n.b()).a(c(), Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  46 */     return a[((Integer)☃.c(c())).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(ceh ☃, brc brc1, fx fx1) {
/*  51 */     return ☃.a(bup.bX);
/*     */   }
/*     */   
/*     */   public cfg c() {
/*  55 */     return b;
/*     */   }
/*     */   
/*     */   public int d() {
/*  59 */     return 7;
/*     */   }
/*     */   
/*     */   protected int g(ceh ☃) {
/*  63 */     return ((Integer)☃.c(c())).intValue();
/*     */   }
/*     */   
/*     */   public ceh b(int ☃) {
/*  67 */     return n().a(c(), Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean h(ceh ☃) {
/*  71 */     return (((Integer)☃.c(c())).intValue() >= d());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/*  76 */     return !h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  81 */     if (aag1.b(fx1, 0) >= 9) {
/*  82 */       int i = g(☃);
/*  83 */       if (i < d()) {
/*  84 */         float f = a(this, aag1, fx1);
/*     */         
/*  86 */         if (random.nextInt((int)(25.0F / f) + 1) == 0) {
/*  87 */           aag1.a(fx1, b(i + 1), 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1) {
/*  94 */     int i = g(ceh1) + a(☃);
/*  95 */     int j = d();
/*  96 */     if (i > j) {
/*  97 */       i = j;
/*     */     }
/*  99 */     ☃.a(fx1, b(i), 2);
/*     */   }
/*     */   
/*     */   protected int a(brx ☃) {
/* 103 */     return afm.a(☃.t, 2, 5);
/*     */   }
/*     */   
/*     */   protected static float a(buo ☃, brc brc1, fx fx1) {
/* 107 */     float f = 1.0F;
/*     */     
/* 109 */     fx fx2 = fx1.c();
/* 110 */     for (int i = -1; i <= 1; i++) {
/* 111 */       for (int j = -1; j <= 1; j++) {
/* 112 */         float f1 = 0.0F;
/*     */         
/* 114 */         ceh ceh = brc1.d_(fx2.b(i, 0, j));
/* 115 */         if (ceh.a(bup.bX)) {
/* 116 */           f1 = 1.0F;
/* 117 */           if (((Integer)ceh.c(bwp.a)).intValue() > 0) {
/* 118 */             f1 = 3.0F;
/*     */           }
/*     */         } 
/*     */         
/* 122 */         if (i != 0 || j != 0) {
/* 123 */           f1 /= 4.0F;
/*     */         }
/*     */         
/* 126 */         f += f1;
/*     */       } 
/*     */     } 
/*     */     
/* 130 */     fx fx3 = fx1.d();
/* 131 */     fx fx4 = fx1.e();
/* 132 */     fx fx5 = fx1.f();
/* 133 */     fx fx6 = fx1.g();
/*     */     
/* 135 */     boolean bool1 = (☃ == brc1.d_(fx5).b() || ☃ == brc1.d_(fx6).b());
/* 136 */     boolean bool2 = (☃ == brc1.d_(fx3).b() || ☃ == brc1.d_(fx4).b());
/*     */     
/* 138 */     if (bool1 && bool2) {
/* 139 */       f /= 2.0F;
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 145 */       boolean bool = (☃ == brc1.d_(fx5.d()).b() || ☃ == brc1.d_(fx6.d()).b() || ☃ == brc1.d_(fx6.e()).b() || ☃ == brc1.d_(fx5.e()).b());
/*     */       
/* 147 */       if (bool) {
/* 148 */         f /= 2.0F;
/*     */       }
/*     */     } 
/*     */     
/* 152 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 157 */     return ((brz1.b(fx1, 0) >= 8 || brz1.e(fx1)) && super.a(☃, brz1, fx1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/* 162 */     if (aqa1 instanceof bdv && brx1.V().b(brt.b)) {
/* 163 */       brx1.a(fx1, true, aqa1);
/*     */     }
/* 165 */     super.a(☃, brx1, fx1, aqa1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected brw e() {
/* 170 */     return bmd.kV;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 175 */     return new bmb(e());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 180 */     return !h(ceh1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 185 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 190 */     a(☃, fx1, ceh1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 195 */     ☃.a((cfj<?>[])new cfj[] { b });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */