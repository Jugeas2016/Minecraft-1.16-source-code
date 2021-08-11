/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ public enum dfx
/*    */ {
/*  6 */   a,
/*  7 */   b,
/*  8 */   c,
/*  9 */   d;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static dfx a(long ☃) {
/* 15 */     if (☃ < 1024L) {
/* 16 */       return a;
/*    */     }
/*    */     
/*    */     try {
/* 20 */       int i = (int)(Math.log(☃) / Math.log(1024.0D));
/* 21 */       String str = String.valueOf("KMGTPE".charAt(i - 1));
/*    */       
/* 23 */       return valueOf(str + "B");
/* 24 */     } catch (Exception exception) {
/* 25 */       return d;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static double a(long ☃, dfx dfx1) {
/* 30 */     if (dfx1 == a) {
/* 31 */       return ☃;
/*    */     }
/*    */     
/* 34 */     return ☃ / Math.pow(1024.0D, dfx1.ordinal());
/*    */   }
/*    */   
/*    */   public static String b(long ☃) {
/* 38 */     int i = 1024;
/* 39 */     if (☃ < 1024L) {
/* 40 */       return ☃ + " B";
/*    */     }
/* 42 */     int j = (int)(Math.log(☃) / Math.log(1024.0D));
/* 43 */     String str = "KMGTPE".charAt(j - 1) + "";
/* 44 */     return String.format(Locale.ROOT, "%.1f %sB", new Object[] { Double.valueOf(☃ / Math.pow(1024.0D, j)), str });
/*    */   }
/*    */   
/*    */   public static String b(long ☃, dfx dfx1) {
/* 48 */     return String.format("%." + ((dfx1 == d) ? "1" : "0") + "f %s", new Object[] { Double.valueOf(a(☃, dfx1)), dfx1.name() });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */