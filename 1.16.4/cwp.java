/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cwp
/*    */   extends cwm, cws
/*    */ {
/*    */   int a(cvk paramcvk, int paramInt);
/*    */   
/*    */   default int a(cvj<?> ☃, cvf cvf1, int i, int j) {
/* 12 */     return a(☃, cvf1.a(a(i), b(j)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cwp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */