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
/* 18 */   a(0),
/* 19 */   b(1),
/* 20 */   c(2); private static final a[] d;
/*    */   static {
/* 22 */     d = new a[] { a, b, c };
/*    */   }
/*    */   private final int e;
/*    */   
/*    */   a(int ☃) {
/* 27 */     this.e = ☃;
/*    */   }
/*    */   
/*    */   public int a() {
/* 31 */     return this.e;
/*    */   }
/*    */   
/*    */   public static a a(int ☃) {
/* 35 */     if (☃ < 0 || ☃ >= d.length) {
/* 36 */       throw new IllegalArgumentException("No operation with value " + ☃);
/*    */     }
/*    */     
/* 39 */     return d[☃];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */