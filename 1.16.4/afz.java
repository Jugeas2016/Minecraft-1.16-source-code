/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afz
/*    */ {
/*    */   public static int a(List<? extends a> ☃) {
/* 10 */     int i = 0;
/* 11 */     for (int j = 0, k = ☃.size(); j < k; j++) {
/* 12 */       a a = ☃.get(j);
/* 13 */       i += a.a;
/*    */     } 
/* 15 */     return i;
/*    */   }
/*    */   
/*    */   public static <T extends a> T a(Random ☃, List<T> list, int i) {
/* 19 */     if (i <= 0) {
/* 20 */       throw (IllegalArgumentException)x.c(new IllegalArgumentException());
/*    */     }
/*    */     
/* 23 */     int j = ☃.nextInt(i);
/* 24 */     return a(list, j);
/*    */   }
/*    */   
/*    */   public static <T extends a> T a(List<T> ☃, int i) {
/* 28 */     for (int j = 0, k = ☃.size(); j < k; j++) {
/* 29 */       a a = (a)☃.get(j);
/* 30 */       i -= a.a;
/* 31 */       if (i < 0) {
/* 32 */         return (T)a;
/*    */       }
/*    */     } 
/* 35 */     return null;
/*    */   }
/*    */   
/*    */   public static <T extends a> T a(Random ☃, List<T> list) {
/* 39 */     return a(☃, list, a(list));
/*    */   }
/*    */   
/*    */   public static class a {
/*    */     protected final int a;
/*    */     
/*    */     public a(int ☃) {
/* 46 */       this.a = ☃;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */