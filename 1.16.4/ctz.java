/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ctz
/*    */ {
/*    */   private final byte[] d;
/*    */   public final double a;
/*    */   public final double b;
/*    */   public final double c;
/*    */   
/*    */   public ctz(Random ☃) {
/* 16 */     this.a = ☃.nextDouble() * 256.0D;
/* 17 */     this.b = ☃.nextDouble() * 256.0D;
/* 18 */     this.c = ☃.nextDouble() * 256.0D;
/*    */     
/* 20 */     this.d = new byte[256];
/*    */     int i;
/* 22 */     for (i = 0; i < 256; i++) {
/* 23 */       this.d[i] = (byte)i;
/*    */     }
/*    */     
/* 26 */     for (i = 0; i < 256; i++) {
/* 27 */       int j = ☃.nextInt(256 - i);
/* 28 */       byte b = this.d[i];
/* 29 */       this.d[i] = this.d[i + j];
/* 30 */       this.d[i + j] = b;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(double ☃, double d1, double d2, double d3, double d4) {
/* 36 */     double d14, d5 = ☃ + this.a;
/* 37 */     double d6 = d1 + this.b;
/* 38 */     double d7 = d2 + this.c;
/*    */     
/* 40 */     int i = afm.c(d5);
/* 41 */     int j = afm.c(d6);
/* 42 */     int k = afm.c(d7);
/*    */ 
/*    */     
/* 45 */     double d8 = d5 - i;
/* 46 */     double d9 = d6 - j;
/* 47 */     double d10 = d7 - k;
/*    */ 
/*    */     
/* 50 */     double d11 = afm.j(d8);
/* 51 */     double d12 = afm.j(d9);
/* 52 */     double d13 = afm.j(d10);
/*    */ 
/*    */     
/* 55 */     if (d3 != 0.0D) {
/* 56 */       double d = Math.min(d4, d9);
/* 57 */       d14 = afm.c(d / d3) * d3;
/*    */     } else {
/* 59 */       d14 = 0.0D;
/*    */     } 
/*    */     
/* 62 */     return a(i, j, k, d8, d9 - d14, d10, d11, d12, d13);
/*    */   }
/*    */   
/*    */   private static double a(int ☃, double d1, double d2, double d3) {
/* 66 */     int i = ☃ & 0xF;
/* 67 */     return cud.a(cud.a[i], d1, d2, d3);
/*    */   }
/*    */   
/*    */   private int a(int ☃) {
/* 71 */     return this.d[☃ & 0xFF] & 0xFF;
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(int ☃, int i, int j, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 76 */     int k = a(☃) + i;
/* 77 */     int m = a(k) + j;
/* 78 */     int n = a(k + 1) + j;
/*    */     
/* 80 */     int i1 = a(☃ + 1) + i;
/* 81 */     int i2 = a(i1) + j;
/* 82 */     int i3 = a(i1 + 1) + j;
/*    */ 
/*    */     
/* 85 */     double d7 = a(a(m), d1, d2, d3);
/* 86 */     double d8 = a(a(i2), d1 - 1.0D, d2, d3);
/* 87 */     double d9 = a(a(n), d1, d2 - 1.0D, d3);
/* 88 */     double d10 = a(a(i3), d1 - 1.0D, d2 - 1.0D, d3);
/* 89 */     double d11 = a(a(m + 1), d1, d2, d3 - 1.0D);
/* 90 */     double d12 = a(a(i2 + 1), d1 - 1.0D, d2, d3 - 1.0D);
/* 91 */     double d13 = a(a(n + 1), d1, d2 - 1.0D, d3 - 1.0D);
/* 92 */     double d14 = a(a(i3 + 1), d1 - 1.0D, d2 - 1.0D, d3 - 1.0D);
/*    */ 
/*    */     
/* 95 */     return afm.a(d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */