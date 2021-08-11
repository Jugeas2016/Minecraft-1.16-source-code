/*    */ 
/*    */ 
/*    */ public enum bte
/*    */   implements bta
/*    */ {
/*  6 */   a;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public bsv a(long ☃, int i, int j, int k, bsx.a a1) {
/* 14 */     int m = i - 2;
/* 15 */     int n = j - 2;
/* 16 */     int i1 = k - 2;
/*    */     
/* 18 */     int i2 = m >> 2;
/* 19 */     int i3 = n >> 2;
/* 20 */     int i4 = i1 >> 2;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     double d1 = (m & 0x3) / 4.0D;
/* 26 */     double d2 = (n & 0x3) / 4.0D;
/* 27 */     double d3 = (i1 & 0x3) / 4.0D;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     double[] arrayOfDouble = new double[8];
/*    */     int i5;
/* 34 */     for (i5 = 0; i5 < 8; i5++) {
/* 35 */       boolean bool1 = ((i5 & 0x4) == 0);
/* 36 */       boolean bool2 = ((i5 & 0x2) == 0);
/* 37 */       boolean bool3 = ((i5 & 0x1) == 0);
/*    */       
/* 39 */       int i9 = bool1 ? i2 : (i2 + 1);
/* 40 */       int i10 = bool2 ? i3 : (i3 + 1);
/* 41 */       int i11 = bool3 ? i4 : (i4 + 1);
/*    */       
/* 43 */       double d5 = bool1 ? d1 : (d1 - 1.0D);
/* 44 */       double d6 = bool2 ? d2 : (d2 - 1.0D);
/* 45 */       double d7 = bool3 ? d3 : (d3 - 1.0D);
/*    */       
/* 47 */       arrayOfDouble[i5] = a(☃, i9, i10, i11, d5, d6, d7);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 52 */     i5 = 0;
/* 53 */     double d4 = arrayOfDouble[0]; int i6;
/* 54 */     for (i6 = 1; i6 < 8; i6++) {
/* 55 */       if (d4 > arrayOfDouble[i6]) {
/* 56 */         i5 = i6;
/* 57 */         d4 = arrayOfDouble[i6];
/*    */       } 
/*    */     } 
/*    */     
/* 61 */     i6 = ((i5 & 0x4) == 0) ? i2 : (i2 + 1);
/* 62 */     int i7 = ((i5 & 0x2) == 0) ? i3 : (i3 + 1);
/* 63 */     int i8 = ((i5 & 0x1) == 0) ? i4 : (i4 + 1);
/*    */     
/* 65 */     return a1.b(i6, i7, i8);
/*    */   }
/*    */   
/*    */   private static double a(long ☃, int i, int j, int k, double d1, double d2, double d3) {
/* 69 */     long l = ☃;
/*    */     
/* 71 */     l = afk.a(l, i);
/* 72 */     l = afk.a(l, j);
/* 73 */     l = afk.a(l, k);
/* 74 */     l = afk.a(l, i);
/* 75 */     l = afk.a(l, j);
/* 76 */     l = afk.a(l, k);
/*    */     
/* 78 */     double d4 = a(l);
/*    */     
/* 80 */     l = afk.a(l, ☃);
/*    */     
/* 82 */     double d5 = a(l);
/*    */     
/* 84 */     l = afk.a(l, ☃);
/*    */     
/* 86 */     double d6 = a(l);
/*    */     
/* 88 */     return a(d3 + d6) + a(d2 + d5) + a(d1 + d4);
/*    */   }
/*    */   
/*    */   private static double a(long ☃) {
/* 92 */     double d = (int)Math.floorMod(☃ >> 24L, 1024L) / 1024.0D;
/* 93 */     return (d - 0.5D) * 0.9D;
/*    */   }
/*    */   
/*    */   private static double a(double ☃) {
/* 97 */     return ☃ * ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bte.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */