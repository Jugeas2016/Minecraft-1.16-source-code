/*    */ 
/*    */ public interface dea
/*    */ {
/*    */   float getAdvance();
/*    */   
/*    */   default float a(boolean ☃) {
/*  7 */     return getAdvance() + (☃ ? b() : 0.0F);
/*    */   }
/*    */   
/*    */   default float a() {
/* 11 */     return 0.0F;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default float b() {
/* 19 */     return 1.0F;
/*    */   }
/*    */   
/*    */   default float c() {
/* 23 */     return 1.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */