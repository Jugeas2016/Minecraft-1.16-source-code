/*    */ import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
/*    */ 
/*    */ public class dct
/*    */   extends AbstractDoubleList
/*    */ {
/*    */   private final int a;
/*    */   
/*    */   dct(int ☃) {
/*  9 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getDouble(int ☃) {
/* 14 */     return ☃ / this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public int size() {
/* 19 */     return this.a + 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */