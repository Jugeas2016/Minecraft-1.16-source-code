/*    */ import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ 
/*    */ public class ddd
/*    */   extends AbstractDoubleList
/*    */ {
/*    */   private final DoubleList a;
/*    */   private final double b;
/*    */   
/*    */   public ddd(DoubleList ☃, double d) {
/* 11 */     this.a = ☃;
/* 12 */     this.b = d;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getDouble(int ☃) {
/* 17 */     return this.a.getDouble(☃) + this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public int size() {
/* 22 */     return this.a.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */