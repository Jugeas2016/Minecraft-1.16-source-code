/*    */ import java.nio.charset.StandardCharsets;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adf
/*    */ {
/*  7 */   public static final char[] a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
/*    */ 
/*    */ 
/*    */   
/*    */   public static String a(byte[] ☃, int i, int j) {
/* 12 */     int k = j - 1;
/* 13 */     int m = (i > k) ? k : i;
/* 14 */     while (0 != ☃[m] && m < k) {
/* 15 */       m++;
/*    */     }
/*    */     
/* 18 */     return new String(☃, i, m - i, StandardCharsets.UTF_8);
/*    */   }
/*    */   
/*    */   public static int a(byte[] ☃, int i) {
/* 22 */     return b(☃, i, ☃.length);
/*    */   }
/*    */   
/*    */   public static int b(byte[] ☃, int i, int j) {
/* 26 */     if (0 > j - i - 4)
/*    */     {
/*    */       
/* 29 */       return 0;
/*    */     }
/* 31 */     return ☃[i + 3] << 24 | (☃[i + 2] & 0xFF) << 16 | (☃[i + 1] & 0xFF) << 8 | ☃[i] & 0xFF;
/*    */   }
/*    */   
/*    */   public static int c(byte[] ☃, int i, int j) {
/* 35 */     if (0 > j - i - 4)
/*    */     {
/*    */       
/* 38 */       return 0;
/*    */     }
/* 40 */     return ☃[i] << 24 | (☃[i + 1] & 0xFF) << 16 | (☃[i + 2] & 0xFF) << 8 | ☃[i + 3] & 0xFF;
/*    */   }
/*    */   
/*    */   public static String a(byte ☃) {
/* 44 */     return "" + a[(☃ & 0xF0) >>> 4] + a[☃ & 0xF];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */