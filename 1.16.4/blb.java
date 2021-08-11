/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface blb
/*     */ {
/*     */   default boolean a(bmb ☃) {
/*  14 */     md md = ☃.b("display");
/*  15 */     return (md != null && md.c("color", 99));
/*     */   }
/*     */   
/*     */   default int b(bmb ☃) {
/*  19 */     md md = ☃.b("display");
/*  20 */     if (md != null && md.c("color", 99)) {
/*  21 */       return md.h("color");
/*     */     }
/*  23 */     return 10511680;
/*     */   }
/*     */   
/*     */   default void c(bmb ☃) {
/*  27 */     md md = ☃.b("display");
/*  28 */     if (md != null && md.e("color")) {
/*  29 */       md.r("color");
/*     */     }
/*     */   }
/*     */   
/*     */   default void a(bmb ☃, int i) {
/*  34 */     ☃.a("display").b("color", i);
/*     */   }
/*     */   
/*     */   static bmb a(bmb ☃, List<bky> list) {
/*  38 */     bmb bmb1 = bmb.b;
/*  39 */     int[] arrayOfInt = new int[3];
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     blb blb1 = null;
/*     */     
/*  44 */     blx blx = ☃.b();
/*  45 */     if (blx instanceof blb) {
/*  46 */       blb1 = (blb)blx;
/*     */       
/*  48 */       bmb1 = ☃.i();
/*  49 */       bmb1.e(1);
/*     */ 
/*     */       
/*  52 */       if (blb1.a(☃)) {
/*  53 */         int i2 = blb1.b(bmb1);
/*  54 */         float f3 = (i2 >> 16 & 0xFF) / 255.0F;
/*  55 */         float f4 = (i2 >> 8 & 0xFF) / 255.0F;
/*  56 */         float f5 = (i2 & 0xFF) / 255.0F;
/*     */         
/*  58 */         i = (int)(i + Math.max(f3, Math.max(f4, f5)) * 255.0F);
/*     */         
/*  60 */         arrayOfInt[0] = (int)(arrayOfInt[0] + f3 * 255.0F);
/*  61 */         arrayOfInt[1] = (int)(arrayOfInt[1] + f4 * 255.0F);
/*  62 */         arrayOfInt[2] = (int)(arrayOfInt[2] + f5 * 255.0F);
/*  63 */         j++;
/*     */       } 
/*     */ 
/*     */       
/*  67 */       for (bky bky : list) {
/*  68 */         float[] arrayOfFloat = bky.d().e();
/*  69 */         int i2 = (int)(arrayOfFloat[0] * 255.0F);
/*  70 */         int i3 = (int)(arrayOfFloat[1] * 255.0F);
/*  71 */         int i4 = (int)(arrayOfFloat[2] * 255.0F);
/*     */         
/*  73 */         i += Math.max(i2, Math.max(i3, i4));
/*     */         
/*  75 */         arrayOfInt[0] = arrayOfInt[0] + i2;
/*  76 */         arrayOfInt[1] = arrayOfInt[1] + i3;
/*  77 */         arrayOfInt[2] = arrayOfInt[2] + i4;
/*  78 */         j++;
/*     */       } 
/*     */     } 
/*     */     
/*  82 */     if (blb1 == null) {
/*  83 */       return bmb.b;
/*     */     }
/*     */     
/*  86 */     int k = arrayOfInt[0] / j;
/*  87 */     int m = arrayOfInt[1] / j;
/*  88 */     int n = arrayOfInt[2] / j;
/*     */     
/*  90 */     float f1 = i / j;
/*  91 */     float f2 = Math.max(k, Math.max(m, n));
/*     */     
/*  93 */     k = (int)(k * f1 / f2);
/*  94 */     m = (int)(m * f1 / f2);
/*  95 */     n = (int)(n * f1 / f2);
/*     */     
/*  97 */     int i1 = k;
/*  98 */     i1 = (i1 << 8) + m;
/*  99 */     i1 = (i1 << 8) + n;
/*     */     
/* 101 */     blb1.a(bmb1, i1);
/* 102 */     return bmb1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */