/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/*    */   private static final a[] f;
/* 44 */   a(0, "small_ball"),
/* 45 */   b(1, "large_ball"),
/* 46 */   c(2, "star"),
/* 47 */   d(3, "creeper"),
/* 48 */   e(4, "burst");
/*    */   
/*    */   static {
/* 51 */     f = (a[])Arrays.<a>stream(values()).sorted(Comparator.comparingInt(☃ -> ☃.g)).toArray(☃ -> new a[☃]);
/*    */   }
/*    */   
/*    */   private final int g;
/*    */   
/*    */   a(int ☃, String str1) {
/* 57 */     this.g = ☃;
/* 58 */     this.h = str1;
/*    */   }
/*    */   private final String h;
/*    */   public int a() {
/* 62 */     return this.g;
/*    */   }
/*    */   
/*    */   public String b() {
/* 66 */     return this.h;
/*    */   }
/*    */   
/*    */   public static a a(int ☃) {
/* 70 */     if (☃ < 0 || ☃ >= f.length) {
/* 71 */       return a;
/*    */     }
/* 73 */     return f[☃];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */