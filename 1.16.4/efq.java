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
/*     */ public class efq
/*     */   extends eeu<aql>
/*     */ {
/*     */   public efq(eet ☃) {
/*  16 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aql ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  21 */     float[] arrayOfFloat1 = new float[8];
/*  22 */     float[] arrayOfFloat2 = new float[8];
/*  23 */     float f3 = 0.0F;
/*  24 */     float f4 = 0.0F;
/*     */     
/*  26 */     Random random = new Random(☃.b);
/*  27 */     for (int j = 7; j >= 0; j--) {
/*  28 */       arrayOfFloat1[j] = f3;
/*  29 */       arrayOfFloat2[j] = f4;
/*  30 */       f3 += (random.nextInt(11) - 5);
/*  31 */       f4 += (random.nextInt(11) - 5);
/*     */     } 
/*     */ 
/*     */     
/*  35 */     dfq dfq = eag1.getBuffer(eao.r());
/*  36 */     b b = dfm1.c().a();
/*  37 */     for (int k = 0; k < 4; k++) {
/*  38 */       Random random1 = new Random(☃.b);
/*  39 */       for (int m = 0; m < 3; m++) {
/*  40 */         int n = 7;
/*  41 */         int i1 = 0;
/*  42 */         if (m > 0) {
/*  43 */           n = 7 - m;
/*     */         }
/*  45 */         if (m > 0) {
/*  46 */           i1 = n - 2;
/*     */         }
/*  48 */         float f5 = arrayOfFloat1[n] - f3;
/*  49 */         float f6 = arrayOfFloat2[n] - f4;
/*  50 */         for (int i2 = n; i2 >= i1; i2--) {
/*  51 */           float f7 = f5;
/*  52 */           float f8 = f6;
/*  53 */           if (m == 0) {
/*  54 */             f5 += (random1.nextInt(11) - 5);
/*  55 */             f6 += (random1.nextInt(11) - 5);
/*     */           } else {
/*  57 */             f5 += (random1.nextInt(31) - 15);
/*  58 */             f6 += (random1.nextInt(31) - 15);
/*     */           } 
/*     */           
/*  61 */           float f9 = 0.5F;
/*  62 */           float f10 = 0.45F;
/*  63 */           float f11 = 0.45F;
/*  64 */           float f12 = 0.5F;
/*     */           
/*  66 */           float f13 = 0.1F + k * 0.2F;
/*  67 */           if (m == 0) {
/*  68 */             f13 = (float)(f13 * (i2 * 0.1D + 1.0D));
/*     */           }
/*     */           
/*  71 */           float f14 = 0.1F + k * 0.2F;
/*  72 */           if (m == 0) {
/*  73 */             f14 *= (i2 - 1) * 0.1F + 1.0F;
/*     */           }
/*     */           
/*  76 */           a(b, dfq, f5, f6, i2, f7, f8, 0.45F, 0.45F, 0.5F, f13, f14, false, false, true, false);
/*  77 */           a(b, dfq, f5, f6, i2, f7, f8, 0.45F, 0.45F, 0.5F, f13, f14, true, false, true, true);
/*  78 */           a(b, dfq, f5, f6, i2, f7, f8, 0.45F, 0.45F, 0.5F, f13, f14, true, true, false, true);
/*  79 */           a(b, dfq, f5, f6, i2, f7, f8, 0.45F, 0.45F, 0.5F, f13, f14, false, true, false, false);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(b ☃, dfq dfq1, float f1, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/*  86 */     dfq1
/*  87 */       .a(☃, f1 + (bool1 ? f9 : -f9), (i * 16), f2 + (bool2 ? f9 : -f9))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  93 */       .a(f5, f6, f7, 0.3F)
/*  94 */       .d();
/*     */     
/*  96 */     dfq1
/*  97 */       .a(☃, f3 + (bool1 ? f8 : -f8), ((i + 1) * 16), f4 + (bool2 ? f8 : -f8))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 103 */       .a(f5, f6, f7, 0.3F)
/* 104 */       .d();
/*     */     
/* 106 */     dfq1
/* 107 */       .a(☃, f3 + (bool3 ? f8 : -f8), ((i + 1) * 16), f4 + (bool4 ? f8 : -f8))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 113 */       .a(f5, f6, f7, 0.3F)
/* 114 */       .d();
/*     */     
/* 116 */     dfq1
/* 117 */       .a(☃, f1 + (bool3 ? f9 : -f9), (i * 16), f2 + (bool4 ? f9 : -f9))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 123 */       .a(f5, f6, f7, 0.3F)
/* 124 */       .d();
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(aql ☃) {
/* 129 */     return ekb.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */