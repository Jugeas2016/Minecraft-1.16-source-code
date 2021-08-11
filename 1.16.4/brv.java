/*    */ 
/*    */ public class brv
/*    */ {
/*  4 */   private static int[] a = new int[65536];
/*    */   
/*    */   public static void a(int[] ☃) {
/*  7 */     a = ☃;
/*    */   }
/*    */   
/*    */   public static int a(double ☃, double d1) {
/* 11 */     d1 *= ☃;
/* 12 */     int i = (int)((1.0D - ☃) * 255.0D);
/* 13 */     int j = (int)((1.0D - d1) * 255.0D);
/* 14 */     int k = j << 8 | i;
/* 15 */     if (k > a.length) {
/* 16 */       return -65281;
/*    */     }
/* 18 */     return a[k];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */