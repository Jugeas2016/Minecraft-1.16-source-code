/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cwq
/*    */   extends cwm, cwt
/*    */ {
/*    */   int a(cvk paramcvk, int paramInt);
/*    */   
/*    */   default int a(cvj<?> ☃, cvf cvf1, int i, int j) {
/* 12 */     int k = cvf1.a(a(i + 1), b(j + 1));
/* 13 */     return a(☃, k);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cwq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */