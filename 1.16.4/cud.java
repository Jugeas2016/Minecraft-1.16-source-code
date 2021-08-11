/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cud
/*     */ {
/*   8 */   protected static final int[][] a = new int[][] { { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, { 0, 1, -1 }, { 0, -1, -1 }, { 1, 1, 0 }, { 0, -1, 1 }, { -1, 1, 0 }, { 0, -1, -1 } };
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
/*  27 */   private static final double e = Math.sqrt(3.0D);
/*  28 */   private static final double f = 0.5D * (e - 1.0D);
/*  29 */   private static final double g = (3.0D - e) / 6.0D;
/*     */   
/*  31 */   private final int[] h = new int[512];
/*     */   
/*     */   public final double b;
/*     */   public final double c;
/*     */   public final double d;
/*     */   
/*     */   public cud(Random ☃) {
/*  38 */     this.b = ☃.nextDouble() * 256.0D;
/*  39 */     this.c = ☃.nextDouble() * 256.0D;
/*  40 */     this.d = ☃.nextDouble() * 256.0D; int i;
/*  41 */     for (i = 0; i < 256; i++) {
/*  42 */       this.h[i] = i;
/*     */     }
/*     */     
/*  45 */     for (i = 0; i < 256; i++) {
/*  46 */       int j = ☃.nextInt(256 - i);
/*  47 */       int k = this.h[i];
/*  48 */       this.h[i] = this.h[j + i];
/*  49 */       this.h[j + i] = k;
/*     */     } 
/*     */   }
/*     */   
/*     */   private int a(int ☃) {
/*  54 */     return this.h[☃ & 0xFF];
/*     */   }
/*     */   
/*     */   protected static double a(int[] ☃, double d1, double d2, double d3) {
/*  58 */     return ☃[0] * d1 + ☃[1] * d2 + ☃[2] * d3;
/*     */   }
/*     */ 
/*     */   
/*     */   private double a(int ☃, double d1, double d2, double d3, double d4) {
/*  63 */     double d5, d6 = d4 - d1 * d1 - d2 * d2 - d3 * d3;
/*  64 */     if (d6 < 0.0D) {
/*  65 */       d5 = 0.0D;
/*     */     } else {
/*  67 */       d6 *= d6;
/*  68 */       d5 = d6 * d6 * a(a[☃], d1, d2, d3);
/*     */     } 
/*  70 */     return d5;
/*     */   }
/*     */ 
/*     */   
/*     */   public double a(double ☃, double d1) {
/*     */     int k, m;
/*  76 */     double d2 = (☃ + d1) * f;
/*  77 */     int i = afm.c(☃ + d2);
/*  78 */     int j = afm.c(d1 + d2);
/*     */ 
/*     */     
/*  81 */     double d3 = (i + j) * g;
/*  82 */     double d4 = i - d3;
/*  83 */     double d5 = j - d3;
/*     */ 
/*     */     
/*  86 */     double d6 = ☃ - d4;
/*  87 */     double d7 = d1 - d5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     if (d6 > d7) {
/*     */       
/*  97 */       k = 1;
/*  98 */       m = 0;
/*     */     } else {
/*     */       
/* 101 */       k = 0;
/* 102 */       m = 1;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     double d8 = d6 - k + g;
/* 110 */     double d9 = d7 - m + g;
/*     */ 
/*     */     
/* 113 */     double d10 = d6 - 1.0D + 2.0D * g;
/* 114 */     double d11 = d7 - 1.0D + 2.0D * g;
/*     */ 
/*     */     
/* 117 */     int n = i & 0xFF;
/* 118 */     int i1 = j & 0xFF;
/*     */     
/* 120 */     int i2 = a(n + a(i1)) % 12;
/* 121 */     int i3 = a(n + k + a(i1 + m)) % 12;
/* 122 */     int i4 = a(n + 1 + a(i1 + 1)) % 12;
/*     */ 
/*     */ 
/*     */     
/* 126 */     double d12 = a(i2, d6, d7, 0.0D, 0.5D);
/* 127 */     double d13 = a(i3, d8, d9, 0.0D, 0.5D);
/* 128 */     double d14 = a(i4, d10, d11, 0.0D, 0.5D);
/*     */ 
/*     */ 
/*     */     
/* 132 */     return 70.0D * (d12 + d13 + d14);
/*     */   }
/*     */   
/*     */   public double a(double ☃, double d1, double d2) {
/*     */     int m, n, i1, i2, i3, i4;
/* 137 */     double d3 = 0.3333333333333333D;
/* 138 */     double d4 = (☃ + d1 + d2) * 0.3333333333333333D;
/*     */     
/* 140 */     int i = afm.c(☃ + d4);
/* 141 */     int j = afm.c(d1 + d4);
/* 142 */     int k = afm.c(d2 + d4);
/* 143 */     double d5 = 0.16666666666666666D;
/* 144 */     double d6 = (i + j + k) * 0.16666666666666666D;
/*     */     
/* 146 */     double d7 = i - d6;
/* 147 */     double d8 = j - d6;
/* 148 */     double d9 = k - d6;
/*     */     
/* 150 */     double d10 = ☃ - d7;
/* 151 */     double d11 = d1 - d8;
/* 152 */     double d12 = d2 - d9;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     if (d10 >= d11) {
/* 162 */       if (d11 >= d12) {
/*     */         
/* 164 */         m = 1;
/* 165 */         n = 0;
/* 166 */         i1 = 0;
/* 167 */         i2 = 1;
/* 168 */         i3 = 1;
/* 169 */         i4 = 0;
/* 170 */       } else if (d10 >= d12) {
/*     */         
/* 172 */         m = 1;
/* 173 */         n = 0;
/* 174 */         i1 = 0;
/* 175 */         i2 = 1;
/* 176 */         i3 = 0;
/* 177 */         i4 = 1;
/*     */       } else {
/*     */         
/* 180 */         m = 0;
/* 181 */         n = 0;
/* 182 */         i1 = 1;
/* 183 */         i2 = 1;
/* 184 */         i3 = 0;
/* 185 */         i4 = 1;
/*     */       }
/*     */     
/*     */     }
/* 189 */     else if (d11 < d12) {
/*     */       
/* 191 */       m = 0;
/* 192 */       n = 0;
/* 193 */       i1 = 1;
/* 194 */       i2 = 0;
/* 195 */       i3 = 1;
/* 196 */       i4 = 1;
/* 197 */     } else if (d10 < d12) {
/*     */       
/* 199 */       m = 0;
/* 200 */       n = 1;
/* 201 */       i1 = 0;
/* 202 */       i2 = 0;
/* 203 */       i3 = 1;
/* 204 */       i4 = 1;
/*     */     } else {
/*     */       
/* 207 */       m = 0;
/* 208 */       n = 1;
/* 209 */       i1 = 0;
/* 210 */       i2 = 1;
/* 211 */       i3 = 1;
/* 212 */       i4 = 0;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     double d13 = d10 - m + 0.16666666666666666D;
/* 222 */     double d14 = d11 - n + 0.16666666666666666D;
/* 223 */     double d15 = d12 - i1 + 0.16666666666666666D;
/*     */ 
/*     */     
/* 226 */     double d16 = d10 - i2 + 0.3333333333333333D;
/* 227 */     double d17 = d11 - i3 + 0.3333333333333333D;
/* 228 */     double d18 = d12 - i4 + 0.3333333333333333D;
/*     */ 
/*     */     
/* 231 */     double d19 = d10 - 1.0D + 0.5D;
/* 232 */     double d20 = d11 - 1.0D + 0.5D;
/* 233 */     double d21 = d12 - 1.0D + 0.5D;
/*     */ 
/*     */     
/* 236 */     int i5 = i & 0xFF;
/* 237 */     int i6 = j & 0xFF;
/* 238 */     int i7 = k & 0xFF;
/*     */     
/* 240 */     int i8 = a(i5 + a(i6 + a(i7))) % 12;
/* 241 */     int i9 = a(i5 + m + a(i6 + n + a(i7 + i1))) % 12;
/* 242 */     int i10 = a(i5 + i2 + a(i6 + i3 + a(i7 + i4))) % 12;
/* 243 */     int i11 = a(i5 + 1 + a(i6 + 1 + a(i7 + 1))) % 12;
/*     */ 
/*     */     
/* 246 */     double d22 = a(i8, d10, d11, d12, 0.6D);
/* 247 */     double d23 = a(i9, d13, d14, d15, 0.6D);
/* 248 */     double d24 = a(i10, d16, d17, d18, 0.6D);
/* 249 */     double d25 = a(i11, d19, d20, d21, 0.6D);
/*     */ 
/*     */ 
/*     */     
/* 253 */     return 32.0D * (d22 + d23 + d24 + d25);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cud.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */