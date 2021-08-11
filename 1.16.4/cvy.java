/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cvy
/*    */   implements cwl
/*    */ {
/*  8 */   a;
/*    */ 
/*    */   
/*    */   public int a(cvk ☃, int i, int j) {
/* 12 */     ctz ctz = ☃.b();
/* 13 */     double d = ctz.a(i / 8.0D, j / 8.0D, 0.0D, 0.0D, 0.0D);
/*    */     
/* 15 */     if (d > 0.4D) {
/* 16 */       return 44;
/*    */     }
/*    */     
/* 19 */     if (d > 0.2D) {
/* 20 */       return 45;
/*    */     }
/*    */     
/* 23 */     if (d < -0.4D) {
/* 24 */       return 10;
/*    */     }
/*    */     
/* 27 */     if (d < -0.2D) {
/* 28 */       return 46;
/*    */     }
/*    */     
/* 31 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */