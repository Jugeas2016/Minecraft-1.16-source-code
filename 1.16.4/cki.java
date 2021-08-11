/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.BitSet;
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
/*     */ public class cki
/*     */   extends cjl<cmj>
/*     */ {
/*     */   public cki(Codec<cmj> ☃) {
/*  18 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmj cmj1) {
/*  23 */     float f1 = random.nextFloat() * 3.1415927F;
/*     */     
/*  25 */     float f2 = cmj1.c / 8.0F;
/*  26 */     int i = afm.f((cmj1.c / 16.0F * 2.0F + 1.0F) / 2.0F);
/*  27 */     double d1 = fx1.u() + Math.sin(f1) * f2;
/*  28 */     double d2 = fx1.u() - Math.sin(f1) * f2;
/*  29 */     double d3 = fx1.w() + Math.cos(f1) * f2;
/*  30 */     double d4 = fx1.w() - Math.cos(f1) * f2;
/*     */     
/*  32 */     int j = 2;
/*  33 */     double d5 = (fx1.v() + random.nextInt(3) - 2);
/*  34 */     double d6 = (fx1.v() + random.nextInt(3) - 2);
/*     */     
/*  36 */     int k = fx1.u() - afm.f(f2) - i;
/*  37 */     int m = fx1.v() - 2 - i;
/*  38 */     int n = fx1.w() - afm.f(f2) - i;
/*  39 */     int i1 = 2 * (afm.f(f2) + i);
/*  40 */     int i2 = 2 * (2 + i);
/*     */ 
/*     */     
/*  43 */     for (int i3 = k; i3 <= k + i1; i3++) {
/*  44 */       for (int i4 = n; i4 <= n + i1; i4++) {
/*  45 */         if (m <= ☃.a(chn.a.c, i3, i4)) {
/*  46 */           return a(☃, random, cmj1, d1, d2, d3, d4, d5, d6, k, m, n, i1, i2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  51 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(bry ☃, Random random, cmj cmj1, double d1, double d2, double d3, double d4, double d5, double d6, int i, int j, int k, int m, int n) {
/*  55 */     int i1 = 0;
/*     */     
/*  57 */     BitSet bitSet = new BitSet(m * n * m);
/*  58 */     fx.a a = new fx.a();
/*  59 */     int i2 = cmj1.c;
/*  60 */     double[] arrayOfDouble = new double[i2 * 4];
/*     */     int i3;
/*  62 */     for (i3 = 0; i3 < i2; i3++) {
/*  63 */       float f = i3 / i2;
/*  64 */       double d7 = afm.d(f, d1, d2);
/*  65 */       double d8 = afm.d(f, d5, d6);
/*  66 */       double d9 = afm.d(f, d3, d4);
/*     */       
/*  68 */       double d10 = random.nextDouble() * i2 / 16.0D;
/*  69 */       double d11 = ((afm.a(3.1415927F * f) + 1.0F) * d10 + 1.0D) / 2.0D;
/*     */       
/*  71 */       arrayOfDouble[i3 * 4 + 0] = d7;
/*  72 */       arrayOfDouble[i3 * 4 + 1] = d8;
/*  73 */       arrayOfDouble[i3 * 4 + 2] = d9;
/*  74 */       arrayOfDouble[i3 * 4 + 3] = d11;
/*     */     } 
/*     */     
/*  77 */     for (i3 = 0; i3 < i2 - 1; i3++) {
/*  78 */       if (arrayOfDouble[i3 * 4 + 3] > 0.0D)
/*     */       {
/*     */ 
/*     */         
/*  82 */         for (int i4 = i3 + 1; i4 < i2; i4++) {
/*  83 */           if (arrayOfDouble[i4 * 4 + 3] > 0.0D) {
/*     */ 
/*     */ 
/*     */             
/*  87 */             double d7 = arrayOfDouble[i3 * 4 + 0] - arrayOfDouble[i4 * 4 + 0];
/*  88 */             double d8 = arrayOfDouble[i3 * 4 + 1] - arrayOfDouble[i4 * 4 + 1];
/*  89 */             double d9 = arrayOfDouble[i3 * 4 + 2] - arrayOfDouble[i4 * 4 + 2];
/*  90 */             double d10 = arrayOfDouble[i3 * 4 + 3] - arrayOfDouble[i4 * 4 + 3];
/*     */             
/*  92 */             if (d10 * d10 > d7 * d7 + d8 * d8 + d9 * d9)
/*  93 */               if (d10 > 0.0D) {
/*  94 */                 arrayOfDouble[i4 * 4 + 3] = -1.0D;
/*     */               } else {
/*  96 */                 arrayOfDouble[i3 * 4 + 3] = -1.0D;
/*     */               }  
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/* 102 */     for (i3 = 0; i3 < i2; i3++) {
/* 103 */       double d = arrayOfDouble[i3 * 4 + 3];
/* 104 */       if (d >= 0.0D) {
/*     */ 
/*     */ 
/*     */         
/* 108 */         double d7 = arrayOfDouble[i3 * 4 + 0];
/* 109 */         double d8 = arrayOfDouble[i3 * 4 + 1];
/* 110 */         double d9 = arrayOfDouble[i3 * 4 + 2];
/*     */ 
/*     */         
/* 113 */         int i4 = Math.max(afm.c(d7 - d), i);
/* 114 */         int i5 = Math.max(afm.c(d8 - d), j);
/* 115 */         int i6 = Math.max(afm.c(d9 - d), k);
/*     */         
/* 117 */         int i7 = Math.max(afm.c(d7 + d), i4);
/* 118 */         int i8 = Math.max(afm.c(d8 + d), i5);
/* 119 */         int i9 = Math.max(afm.c(d9 + d), i6);
/*     */         
/* 121 */         for (int i10 = i4; i10 <= i7; i10++) {
/* 122 */           double d10 = (i10 + 0.5D - d7) / d;
/* 123 */           if (d10 * d10 < 1.0D)
/* 124 */             for (int i11 = i5; i11 <= i8; i11++) {
/* 125 */               double d11 = (i11 + 0.5D - d8) / d;
/* 126 */               if (d10 * d10 + d11 * d11 < 1.0D) {
/* 127 */                 for (int i12 = i6; i12 <= i9; i12++) {
/* 128 */                   double d12 = (i12 + 0.5D - d9) / d;
/* 129 */                   if (d10 * d10 + d11 * d11 + d12 * d12 < 1.0D) {
/* 130 */                     int i13 = i10 - i + (i11 - j) * m + (i12 - k) * m * n;
/* 131 */                     if (!bitSet.get(i13)) {
/*     */ 
/*     */                       
/* 134 */                       bitSet.set(i13);
/*     */                       
/* 136 */                       a.d(i10, i11, i12);
/* 137 */                       if (cmj1.b.a(☃.d_(a), random)) {
/* 138 */                         ☃.a(a, cmj1.d, 2);
/* 139 */                         i1++;
/*     */                       } 
/*     */                     } 
/*     */                   } 
/*     */                 } 
/*     */               }
/*     */             }  
/*     */         } 
/*     */       } 
/*     */     } 
/* 149 */     return (i1 > 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cki.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */