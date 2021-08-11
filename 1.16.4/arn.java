/*    */ 
/*    */ 
/*    */ public class arn
/*    */   extends arg
/*    */ {
/*    */   private final double a;
/*    */   private final double b;
/*    */   
/*    */   public arn(String ☃, double d1, double d2, double d3) {
/* 10 */     super(☃, d1);
/* 11 */     this.a = d2;
/* 12 */     this.b = d3;
/*    */     
/* 14 */     if (d2 > d3) {
/* 15 */       throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
/*    */     }
/* 17 */     if (d1 < d2) {
/* 18 */       throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
/*    */     }
/* 20 */     if (d1 > d3) {
/* 21 */       throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public double a(double ☃) {
/* 35 */     ☃ = afm.a(☃, this.a, this.b);
/*    */     
/* 37 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */