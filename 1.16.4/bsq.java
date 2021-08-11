/*    */ 
/*    */ public enum bsq
/*    */ {
/*  4 */   a(-3),
/*  5 */   b(-2),
/*  6 */   c(-1),
/*  7 */   d(0),
/*  8 */   e(1),
/*  9 */   f(2),
/* 10 */   g(3);
/*    */   
/*    */   private final int h;
/*    */ 
/*    */   
/*    */   bsq(int ☃) {
/* 16 */     this.h = ☃;
/*    */   }
/*    */   
/*    */   public static bsq a(int ☃) {
/* 20 */     for (bsq bsq1 : values()) {
/* 21 */       if (bsq1.h == ☃) {
/* 22 */         return bsq1;
/*    */       }
/*    */     } 
/* 25 */     if (☃ < a.h) {
/* 26 */       return a;
/*    */     }
/* 28 */     return g;
/*    */   }
/*    */   
/*    */   public int a() {
/* 32 */     return this.h;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */