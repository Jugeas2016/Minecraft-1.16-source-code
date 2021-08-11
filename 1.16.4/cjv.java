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
/*     */ public class cjv
/*     */   extends cjl<cls>
/*     */ {
/*     */   public cjv(Codec<cls> ☃) {
/*  20 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cls cls1) {
/*  25 */     fx1 = new fx(fx1.u(), cfy1.f(), fx1.w());
/*  26 */     boolean bool1 = (random.nextDouble() > 0.7D);
/*  27 */     ceh ceh = cls1.b;
/*     */ 
/*     */     
/*  30 */     double d = random.nextDouble() * 2.0D * Math.PI;
/*  31 */     int i = 11 - random.nextInt(5);
/*  32 */     int j = 3 + random.nextInt(3);
/*  33 */     boolean bool2 = (random.nextDouble() > 0.7D);
/*     */     
/*  35 */     int k = 11;
/*  36 */     int m = bool2 ? (random.nextInt(6) + 6) : (random.nextInt(15) + 3);
/*  37 */     if (!bool2 && random.nextDouble() > 0.9D) {
/*  38 */       m += random.nextInt(19) + 7;
/*     */     }
/*     */     
/*  41 */     int n = Math.min(m + random.nextInt(11), 18);
/*  42 */     int i1 = Math.min(m + random.nextInt(7) - random.nextInt(5), 11);
/*  43 */     int i2 = bool2 ? i : 11;
/*     */     
/*     */     int i3;
/*  46 */     for (i3 = -i2; i3 < i2; i3++) {
/*  47 */       for (int i4 = -i2; i4 < i2; i4++) {
/*  48 */         for (int i5 = 0; i5 < m; i5++) {
/*  49 */           int i6 = bool2 ? b(i5, m, i1) : a(random, i5, m, i1);
/*  50 */           if (bool2 || i3 < i6)
/*     */           {
/*     */             
/*  53 */             a(☃, random, fx1, m, i3, i5, i4, i6, i2, bool2, j, d, bool1, ceh);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  59 */     a(☃, fx1, i1, m, bool2, i);
/*     */ 
/*     */     
/*  62 */     for (i3 = -i2; i3 < i2; i3++) {
/*  63 */       for (int i4 = -i2; i4 < i2; i4++) {
/*  64 */         for (int i5 = -1; i5 > -n; i5--) {
/*  65 */           int i6 = bool2 ? afm.f(i2 * (1.0F - (float)Math.pow(i5, 2.0D) / n * 8.0F)) : i2;
/*  66 */           int i7 = b(random, -i5, n, i1);
/*  67 */           if (i3 < i7)
/*     */           {
/*     */             
/*  70 */             a(☃, random, fx1, n, i3, i5, i4, i7, i6, bool2, j, d, bool1, ceh);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  76 */     boolean bool3 = bool2 ? ((random.nextDouble() > 0.1D)) : ((random.nextDouble() > 0.7D));
/*  77 */     if (bool3) {
/*  78 */       a(random, ☃, i1, m, fx1, bool2, i, d, j);
/*     */     }
/*     */     
/*  81 */     return true;
/*     */   }
/*     */   
/*     */   private void a(Random ☃, bry bry1, int i, int j, fx fx1, boolean bool, int k, double d, int m) {
/*  85 */     int n = ☃.nextBoolean() ? -1 : 1;
/*  86 */     int i1 = ☃.nextBoolean() ? -1 : 1;
/*     */     
/*  88 */     int i2 = ☃.nextInt(Math.max(i / 2 - 2, 1));
/*  89 */     if (☃.nextBoolean()) {
/*  90 */       i2 = i / 2 + 1 - ☃.nextInt(Math.max(i - i / 2 - 1, 1));
/*     */     }
/*  92 */     int i3 = ☃.nextInt(Math.max(i / 2 - 2, 1));
/*  93 */     if (☃.nextBoolean()) {
/*  94 */       i3 = i / 2 + 1 - ☃.nextInt(Math.max(i - i / 2 - 1, 1));
/*     */     }
/*     */     
/*  97 */     if (bool) {
/*  98 */       i2 = i3 = ☃.nextInt(Math.max(k - 5, 1));
/*     */     }
/*     */     
/* 101 */     fx fx2 = new fx(n * i2, 0, i1 * i3);
/* 102 */     double d1 = bool ? (d + 1.5707963267948966D) : (☃.nextDouble() * 2.0D * Math.PI);
/*     */     int i4;
/* 104 */     for (i4 = 0; i4 < j - 3; i4++) {
/* 105 */       int i5 = a(☃, i4, j, i);
/* 106 */       a(i5, i4, fx1, bry1, false, d1, fx2, k, m);
/*     */     } 
/*     */     
/* 109 */     for (i4 = -1; i4 > -j + ☃.nextInt(5); i4--) {
/* 110 */       int i5 = b(☃, -i4, j, i);
/* 111 */       a(i5, i4, fx1, bry1, true, d1, fx2, k, m);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, fx fx1, bry bry1, boolean bool, double d, fx fx2, int j, int k) {
/* 116 */     int m = ☃ + 1 + j / 3;
/* 117 */     int n = Math.min(☃ - 3, 3) + k / 2 - 1;
/*     */     
/* 119 */     for (int i1 = -m; i1 < m; i1++) {
/* 120 */       for (int i2 = -m; i2 < m; i2++) {
/* 121 */         double d1 = a(i1, i2, fx2, m, n, d);
/* 122 */         if (d1 < 0.0D) {
/* 123 */           fx fx3 = fx1.b(i1, i, i2);
/* 124 */           buo buo = bry1.d_(fx3).b();
/* 125 */           if (c(buo) || buo == bup.cE) {
/* 126 */             if (bool) {
/* 127 */               a(bry1, fx3, bup.A.n());
/*     */             } else {
/* 129 */               a(bry1, fx3, bup.a.n());
/* 130 */               a(bry1, fx3);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bry ☃, fx fx1) {
/* 139 */     if (☃.d_(fx1.b()).a(bup.cC)) {
/* 140 */       a(☃, fx1.b(), bup.a.n());
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(bry ☃, Random random, fx fx1, int i, int j, int k, int m, int n, int i1, boolean bool1, int i2, double d, boolean bool2, ceh ceh1) {
/* 145 */     double d1 = bool1 ? a(j, m, fx.b, i1, a(k, i, i2), d) : a(j, m, fx.b, n, random);
/* 146 */     if (d1 < 0.0D) {
/* 147 */       fx fx2 = fx1.b(j, k, m);
/* 148 */       double d2 = bool1 ? -0.5D : (-6 - random.nextInt(3));
/* 149 */       if (d1 > d2 && random.nextDouble() > 0.9D) {
/*     */         return;
/*     */       }
/* 152 */       a(fx2, ☃, random, i - k, i, bool1, bool2, ceh1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(fx ☃, bry bry1, Random random, int i, int j, boolean bool1, boolean bool2, ceh ceh1) {
/* 157 */     ceh ceh2 = bry1.d_(☃);
/* 158 */     if (ceh2.c() == cva.a || ceh2.a(bup.cE) || ceh2.a(bup.cD) || ceh2.a(bup.A)) {
/* 159 */       boolean bool = (!bool1 || random.nextDouble() > 0.05D);
/* 160 */       int k = bool1 ? 3 : 2;
/* 161 */       if (bool2 && !ceh2.a(bup.A) && i <= random.nextInt(Math.max(1, j / k)) + j * 0.6D && bool) {
/* 162 */         a(bry1, ☃, bup.cE.n());
/*     */       } else {
/* 164 */         a(bry1, ☃, ceh1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i, int j) {
/* 170 */     int k = j;
/* 171 */     if (☃ > 0 && i - ☃ <= 3) {
/* 172 */       k -= 4 - i - ☃;
/*     */     }
/*     */     
/* 175 */     return k;
/*     */   }
/*     */   
/*     */   private double a(int ☃, int i, fx fx1, int j, Random random) {
/* 179 */     float f = 10.0F * afm.a(random.nextFloat(), 0.2F, 0.8F) / j;
/* 180 */     return f + Math.pow((☃ - fx1.u()), 2.0D) + Math.pow((i - fx1.w()), 2.0D) - Math.pow(j, 2.0D);
/*     */   }
/*     */   
/*     */   private double a(int ☃, int i, fx fx1, int j, int k, double d) {
/* 184 */     return Math.pow(((☃ - fx1.u()) * Math.cos(d) - (i - fx1.w()) * Math.sin(d)) / j, 2.0D) + Math.pow(((☃ - fx1.u()) * Math.sin(d) + (i - fx1.w()) * Math.cos(d)) / k, 2.0D) - 1.0D;
/*     */   }
/*     */   
/*     */   private int a(Random ☃, int i, int j, int k) {
/* 188 */     float f1 = 3.5F - ☃.nextFloat();
/* 189 */     float f2 = (1.0F - (float)Math.pow(i, 2.0D) / j * f1) * k;
/*     */     
/* 191 */     if (j > 15 + ☃.nextInt(5)) {
/* 192 */       int m = (i < 3 + ☃.nextInt(6)) ? (i / 2) : i;
/* 193 */       f2 = (1.0F - m / j * f1 * 0.4F) * k;
/*     */     } 
/*     */     
/* 196 */     return afm.f(f2 / 2.0F);
/*     */   }
/*     */   
/*     */   private int b(int ☃, int i, int j) {
/* 200 */     float f1 = 1.0F;
/* 201 */     float f2 = (1.0F - (float)Math.pow(☃, 2.0D) / i * 1.0F) * j;
/* 202 */     return afm.f(f2 / 2.0F);
/*     */   }
/*     */   
/*     */   private int b(Random ☃, int i, int j, int k) {
/* 206 */     float f1 = 1.0F + ☃.nextFloat() / 2.0F;
/* 207 */     float f2 = (1.0F - i / j * f1) * k;
/* 208 */     return afm.f(f2 / 2.0F);
/*     */   }
/*     */   
/*     */   private boolean c(buo ☃) {
/* 212 */     return (☃ == bup.gT || ☃ == bup.cE || ☃ == bup.kV);
/*     */   }
/*     */   
/*     */   private boolean a(brc ☃, fx fx1) {
/* 216 */     return (☃.d_(fx1.c()).c() == cva.a);
/*     */   }
/*     */   
/*     */   private void a(bry ☃, fx fx1, int i, int j, boolean bool, int k) {
/* 220 */     int m = bool ? k : (i / 2);
/*     */     
/* 222 */     for (int n = -m; n <= m; n++) {
/* 223 */       for (int i1 = -m; i1 <= m; i1++) {
/* 224 */         for (int i2 = 0; i2 <= j; i2++) {
/* 225 */           fx fx2 = fx1.b(n, i2, i1);
/* 226 */           buo buo = ☃.d_(fx2).b();
/*     */ 
/*     */           
/* 229 */           if (c(buo) || buo == bup.cC)
/* 230 */             if (a(☃, fx2)) {
/* 231 */               a(☃, fx2, bup.a.n());
/* 232 */               a(☃, fx2.b(), bup.a.n());
/*     */ 
/*     */             
/*     */             }
/* 236 */             else if (c(buo)) {
/*     */               
/* 238 */               buo[] arrayOfBuo = { ☃.d_(fx2.f()).b(), ☃.d_(fx2.g()).b(), ☃.d_(fx2.d()).b(), ☃.d_(fx2.e()).b() };
/* 239 */               int i3 = 0;
/* 240 */               for (buo buo1 : arrayOfBuo) {
/* 241 */                 if (!c(buo1)) {
/* 242 */                   i3++;
/*     */                 }
/*     */               } 
/* 245 */               if (i3 >= 3)
/* 246 */                 a(☃, fx2, bup.a.n()); 
/*     */             }  
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */