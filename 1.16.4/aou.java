/*    */ 
/*    */ public enum aou
/*    */ {
/*  4 */   a,
/*  5 */   b,
/*  6 */   c,
/*  7 */   d;
/*    */   
/*    */   public boolean a() {
/* 10 */     return (this == a || this == b);
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 14 */     return (this == a);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static aou a(boolean ☃) {
/* 22 */     return ☃ ? a : b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aou.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */