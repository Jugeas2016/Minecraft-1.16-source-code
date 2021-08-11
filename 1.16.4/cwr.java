/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cwr
/*    */   extends cwm, cwt
/*    */ {
/*    */   int a(cvk paramcvk, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*    */   
/*    */   default int a(cvj<?> ☃, cvf cvf1, int i, int j) {
/* 12 */     return a(☃, cvf1
/*    */         
/* 14 */         .a(a(i + 1), b(j + 0)), cvf1
/* 15 */         .a(a(i + 2), b(j + 1)), cvf1
/* 16 */         .a(a(i + 1), b(j + 2)), cvf1
/* 17 */         .a(a(i + 0), b(j + 1)), cvf1
/* 18 */         .a(a(i + 1), b(j + 1)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cwr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */