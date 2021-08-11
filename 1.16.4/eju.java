/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eju
/*     */ {
/*     */   private static final float[] a;
/*     */   
/*     */   static {
/*  13 */     a = x.<float[]>a(new float[256], ☃ -> {
/*     */           for (int i = 0; i < ☃.length; i++)
/*     */             ☃[i] = (float)Math.pow((i / 255.0F), 2.2D); 
/*     */         });
/*     */   }
/*     */   
/*     */   public static det[] a(det ☃, int i) {
/*  20 */     det[] arrayOfDet = new det[i + 1];
/*  21 */     arrayOfDet[0] = ☃;
/*     */     
/*  23 */     if (i > 0) {
/*     */       
/*  25 */       boolean bool = false;
/*     */       int j;
/*  27 */       label33: for (j = 0; j < ☃.a(); j++) {
/*  28 */         for (int k = 0; k < ☃.b(); k++) {
/*  29 */           if (☃.a(j, k) >> 24 == 0) {
/*  30 */             bool = true;
/*     */             
/*     */             break label33;
/*     */           } 
/*     */         } 
/*     */       } 
/*  36 */       for (j = 1; j <= i; j++) {
/*  37 */         det det1 = arrayOfDet[j - 1];
/*  38 */         det det2 = new det(det1.a() >> 1, det1.b() >> 1, false);
/*     */         
/*  40 */         int k = det2.a();
/*  41 */         int m = det2.b();
/*     */         
/*  43 */         for (int n = 0; n < k; n++) {
/*  44 */           for (int i1 = 0; i1 < m; i1++) {
/*  45 */             det2.a(n, i1, a(det1
/*  46 */                   .a(n * 2 + 0, i1 * 2 + 0), det1
/*  47 */                   .a(n * 2 + 1, i1 * 2 + 0), det1
/*  48 */                   .a(n * 2 + 0, i1 * 2 + 1), det1
/*  49 */                   .a(n * 2 + 1, i1 * 2 + 1), bool));
/*     */           }
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/*  55 */         arrayOfDet[j] = det2;
/*     */       } 
/*     */     } 
/*     */     
/*  59 */     return arrayOfDet;
/*     */   }
/*     */   
/*     */   private static int a(int ☃, int i, int j, int k, boolean bool) {
/*  63 */     if (bool) {
/*  64 */       float f1 = 0.0F;
/*  65 */       float f2 = 0.0F;
/*  66 */       float f3 = 0.0F;
/*  67 */       float f4 = 0.0F;
/*     */       
/*  69 */       if (☃ >> 24 != 0) {
/*  70 */         f1 += a(☃ >> 24);
/*  71 */         f2 += a(☃ >> 16);
/*  72 */         f3 += a(☃ >> 8);
/*  73 */         f4 += a(☃ >> 0);
/*     */       } 
/*  75 */       if (i >> 24 != 0) {
/*  76 */         f1 += a(i >> 24);
/*  77 */         f2 += a(i >> 16);
/*  78 */         f3 += a(i >> 8);
/*  79 */         f4 += a(i >> 0);
/*     */       } 
/*  81 */       if (j >> 24 != 0) {
/*  82 */         f1 += a(j >> 24);
/*  83 */         f2 += a(j >> 16);
/*  84 */         f3 += a(j >> 8);
/*  85 */         f4 += a(j >> 0);
/*     */       } 
/*  87 */       if (k >> 24 != 0) {
/*  88 */         f1 += a(k >> 24);
/*  89 */         f2 += a(k >> 16);
/*  90 */         f3 += a(k >> 8);
/*  91 */         f4 += a(k >> 0);
/*     */       } 
/*     */       
/*  94 */       f1 /= 4.0F;
/*  95 */       f2 /= 4.0F;
/*  96 */       f3 /= 4.0F;
/*  97 */       f4 /= 4.0F;
/*     */       
/*  99 */       int i3 = (int)(Math.pow(f1, 0.45454545454545453D) * 255.0D);
/* 100 */       int i4 = (int)(Math.pow(f2, 0.45454545454545453D) * 255.0D);
/* 101 */       int i5 = (int)(Math.pow(f3, 0.45454545454545453D) * 255.0D);
/* 102 */       int i6 = (int)(Math.pow(f4, 0.45454545454545453D) * 255.0D);
/*     */       
/* 104 */       if (i3 < 96) {
/* 105 */         i3 = 0;
/*     */       }
/* 107 */       return i3 << 24 | i4 << 16 | i5 << 8 | i6;
/*     */     } 
/* 109 */     int m = a(☃, i, j, k, 24);
/* 110 */     int n = a(☃, i, j, k, 16);
/* 111 */     int i1 = a(☃, i, j, k, 8);
/* 112 */     int i2 = a(☃, i, j, k, 0);
/*     */     
/* 114 */     return m << 24 | n << 16 | i1 << 8 | i2;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(int ☃, int i, int j, int k, int m) {
/* 119 */     float f1 = a(☃ >> m);
/* 120 */     float f2 = a(i >> m);
/* 121 */     float f3 = a(j >> m);
/* 122 */     float f4 = a(k >> m);
/* 123 */     float f5 = (float)(float)Math.pow((f1 + f2 + f3 + f4) * 0.25D, 0.45454545454545453D);
/*     */     
/* 125 */     return (int)(f5 * 255.0D);
/*     */   }
/*     */   
/*     */   private static float a(int ☃) {
/* 129 */     return a[☃ & 0xFF];
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eju.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */