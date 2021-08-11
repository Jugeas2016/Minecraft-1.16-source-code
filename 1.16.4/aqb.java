/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqb
/*    */ {
/*    */   public final float a;
/*    */   public final float b;
/*    */   public final boolean c;
/*    */   
/*    */   public aqb(float ☃, float f1, boolean bool) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = f1;
/* 14 */     this.c = bool;
/*    */   }
/*    */   
/*    */   public dci a(dcn ☃) {
/* 18 */     return a(☃.b, ☃.c, ☃.d);
/*    */   }
/*    */   
/*    */   public dci a(double ☃, double d1, double d2) {
/* 22 */     float f1 = this.a / 2.0F;
/* 23 */     float f2 = this.b;
/* 24 */     return new dci(☃ - f1, d1, d2 - f1, ☃ + f1, d1 + f2, d2 + f1);
/*    */   }
/*    */   
/*    */   public aqb a(float ☃) {
/* 28 */     return a(☃, ☃);
/*    */   }
/*    */   
/*    */   public aqb a(float ☃, float f1) {
/* 32 */     if (this.c || (☃ == 1.0F && f1 == 1.0F)) {
/* 33 */       return this;
/*    */     }
/* 35 */     return b(this.a * ☃, this.b * f1);
/*    */   }
/*    */ 
/*    */   
/*    */   public static aqb b(float ☃, float f1) {
/* 40 */     return new aqb(☃, f1, false);
/*    */   }
/*    */   
/*    */   public static aqb c(float ☃, float f1) {
/* 44 */     return new aqb(☃, f1, true);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     return "EntityDimensions w=" + this.a + ", h=" + this.b + ", fixed=" + this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */