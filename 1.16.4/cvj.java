/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cvj<R extends cvf>
/*    */   extends cvk
/*    */ {
/*    */   void a(long paramLong1, long paramLong2);
/*    */   
/*    */   R a(cwv paramcwv);
/*    */   
/*    */   default R a(cwv ☃, R r) {
/* 14 */     return a(☃);
/*    */   }
/*    */   
/*    */   default R a(cwv ☃, R r1, R r2) {
/* 18 */     return a(☃);
/*    */   }
/*    */   
/*    */   default int a(int ☃, int i) {
/* 22 */     return (a(2) == 0) ? ☃ : i;
/*    */   }
/*    */   
/*    */   default int a(int ☃, int i, int j, int k) {
/* 26 */     int m = a(4);
/* 27 */     if (m == 0) {
/* 28 */       return ☃;
/*    */     }
/* 30 */     if (m == 1) {
/* 31 */       return i;
/*    */     }
/* 33 */     if (m == 2) {
/* 34 */       return j;
/*    */     }
/* 36 */     return k;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */