/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface bse
/*    */ {
/*    */   boolean a(fx paramfx, ceh paramceh, int paramInt1, int paramInt2);
/*    */   
/*    */   default boolean a(fx ☃, ceh ceh1, int i) {
/* 15 */     return a(☃, ceh1, i, 512);
/*    */   }
/*    */ 
/*    */   
/*    */   boolean a(fx paramfx, boolean paramBoolean);
/*    */   
/*    */   default boolean b(fx ☃, boolean bool) {
/* 22 */     return a(☃, bool, (aqa)null);
/*    */   }
/*    */ 
/*    */   
/*    */   default boolean a(fx ☃, boolean bool, @Nullable aqa aqa1) {
/* 27 */     return a(☃, bool, aqa1, 512);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   boolean a(fx paramfx, boolean paramBoolean, @Nullable aqa paramaqa, int paramInt);
/*    */ 
/*    */   
/*    */   default boolean c(aqa ☃) {
/* 36 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */