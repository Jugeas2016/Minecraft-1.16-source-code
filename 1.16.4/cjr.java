/*     */ import com.mojang.serialization.Codec;
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
/*     */ public class cjr
/*     */   extends cjl<cjq>
/*     */ {
/*     */   public cjr(Codec<cjq> ☃) {
/*  22 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cjq cjq1) {
/*  27 */     buo buo1 = cjq1.f.b();
/*  28 */     fx fx2 = null;
/*     */     
/*  30 */     buo buo2 = ☃.d_(fx1.c()).b();
/*  31 */     if (buo2 == buo1) {
/*  32 */       fx2 = fx1;
/*     */     }
/*     */     
/*  35 */     if (fx2 == null) {
/*  36 */       return false;
/*     */     }
/*     */     
/*  39 */     int i = afm.a(random, 4, 13);
/*  40 */     if (random.nextInt(12) == 0) {
/*  41 */       i *= 2;
/*     */     }
/*     */     
/*  44 */     if (!cjq1.j) {
/*  45 */       int j = cfy1.e();
/*  46 */       if (fx2.v() + i + 1 >= j) {
/*  47 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  51 */     boolean bool = (!cjq1.j && random.nextFloat() < 0.06F);
/*     */     
/*  53 */     ☃.a(fx1, bup.a.n(), 4);
/*     */     
/*  55 */     a(☃, random, cjq1, fx2, i, bool);
/*  56 */     b(☃, random, cjq1, fx2, i, bool);
/*     */     
/*  58 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean a(bry ☃, fx fx1, boolean bool) {
/*  62 */     return ☃.a(fx1, ceh1 -> {
/*     */           cva cva = ceh1.c();
/*  64 */           return (ceh1.c().e() || (☃ && cva == cva.e));
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(bry ☃, Random random, cjq cjq1, fx fx1, int i, boolean bool) {
/*  70 */     fx.a a = new fx.a();
/*  71 */     ceh ceh = cjq1.g;
/*  72 */     int j = bool ? 1 : 0;
/*     */     
/*  74 */     for (int k = -j; k <= j; k++) {
/*  75 */       for (int m = -j; m <= j; m++) {
/*  76 */         boolean bool1 = (bool && afm.a(k) == j && afm.a(m) == j);
/*     */         
/*  78 */         for (int n = 0; n < i; n++) {
/*  79 */           a.a(fx1, k, n, m);
/*  80 */           if (a(☃, a, true)) {
/*  81 */             if (cjq1.j) {
/*  82 */               if (!☃.d_(a.c()).g()) {
/*  83 */                 ☃.b(a, true);
/*     */               }
/*     */               
/*  86 */               ☃.a(a, ceh, 3);
/*     */             }
/*  88 */             else if (bool1) {
/*  89 */               if (random.nextFloat() < 0.1F) {
/*  90 */                 a(☃, a, ceh);
/*     */               }
/*     */             } else {
/*  93 */               a(☃, a, ceh);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(bry ☃, Random random, cjq cjq1, fx fx1, int i, boolean bool) {
/* 103 */     fx.a a = new fx.a();
/* 104 */     boolean bool1 = cjq1.h.a(bup.iK);
/* 105 */     int j = Math.min(random.nextInt(1 + i / 3) + 5, i);
/* 106 */     int k = i - j;
/* 107 */     for (int m = k; m <= i; m++) {
/* 108 */       int n = (m < i - random.nextInt(3)) ? 2 : 1;
/* 109 */       if (j > 8 && m < k + 4) {
/* 110 */         n = 3;
/*     */       }
/*     */       
/* 113 */       if (bool) {
/* 114 */         n++;
/*     */       }
/*     */       
/* 117 */       for (int i1 = -n; i1 <= n; i1++) {
/* 118 */         for (int i2 = -n; i2 <= n; i2++) {
/* 119 */           boolean bool2 = (i1 == -n || i1 == n);
/* 120 */           boolean bool3 = (i2 == -n || i2 == n);
/* 121 */           boolean bool4 = (!bool2 && !bool3 && m != i);
/* 122 */           boolean bool5 = (bool2 && bool3);
/* 123 */           boolean bool6 = (m < k + 3);
/*     */           
/* 125 */           a.a(fx1, i1, m, i2);
/* 126 */           if (a(☃, a, false)) {
/* 127 */             if (cjq1.j && !☃.d_(a.c()).g()) {
/* 128 */               ☃.b(a, true);
/*     */             }
/*     */             
/* 131 */             if (bool6) {
/* 132 */               if (!bool4) {
/* 133 */                 a(☃, random, a, cjq1.h, bool1);
/*     */               }
/* 135 */             } else if (bool4) {
/* 136 */               a(☃, random, cjq1, a, 0.1F, 0.2F, bool1 ? 0.1F : 0.0F);
/* 137 */             } else if (bool5) {
/* 138 */               a(☃, random, cjq1, a, 0.01F, 0.7F, bool1 ? 0.083F : 0.0F);
/*     */             } else {
/* 140 */               a(☃, random, cjq1, a, 5.0E-4F, 0.98F, bool1 ? 0.07F : 0.0F);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bry ☃, Random random, cjq cjq1, fx.a a1, float f1, float f2, float f3) {
/* 149 */     if (random.nextFloat() < f1) {
/* 150 */       a(☃, a1, cjq1.i);
/* 151 */     } else if (random.nextFloat() < f2) {
/* 152 */       a(☃, a1, cjq1.h);
/* 153 */       if (random.nextFloat() < f3) {
/* 154 */         a(a1, ☃, random);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bry ☃, Random random, fx fx1, ceh ceh1, boolean bool) {
/* 160 */     if (☃.d_(fx1.c()).a(ceh1.b())) {
/* 161 */       a(☃, fx1, ceh1);
/* 162 */     } else if (random.nextFloat() < 0.15D) {
/* 163 */       a(☃, fx1, ceh1);
/* 164 */       if (bool && random.nextInt(11) == 0) {
/* 165 */         a(fx1, ☃, random);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(fx ☃, bry bry1, Random random) {
/* 171 */     fx.a a = ☃.i().c(gc.a);
/*     */     
/* 173 */     if (!bry1.w(a)) {
/*     */       return;
/*     */     }
/*     */     
/* 177 */     int i = afm.a(random, 1, 5);
/* 178 */     if (random.nextInt(7) == 0) {
/* 179 */       i *= 2;
/*     */     }
/*     */     
/* 182 */     int j = 23;
/* 183 */     int k = 25;
/* 184 */     cli.a(bry1, random, a, i, 23, 25);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */