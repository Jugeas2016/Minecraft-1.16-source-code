/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/*    */   public static int a(int ☃) {
/*  6 */     return ☃ >>> 24;
/*    */   }
/*    */   
/*    */   public static int b(int ☃) {
/* 10 */     return ☃ >> 16 & 0xFF;
/*    */   }
/*    */   
/*    */   public static int c(int ☃) {
/* 14 */     return ☃ >> 8 & 0xFF;
/*    */   }
/*    */   
/*    */   public static int d(int ☃) {
/* 18 */     return ☃ & 0xFF;
/*    */   }
/*    */   
/*    */   public static int a(int ☃, int i, int j, int k) {
/* 22 */     return ☃ << 24 | i << 16 | j << 8 | k;
/*    */   }
/*    */   
/*    */   public static int a(int ☃, int i) {
/* 26 */     return a(
/* 27 */         a(☃) * a(i) / 255, 
/* 28 */         b(☃) * b(i) / 255, 
/* 29 */         c(☃) * c(i) / 255, 
/* 30 */         d(☃) * d(i) / 255);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aez$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */