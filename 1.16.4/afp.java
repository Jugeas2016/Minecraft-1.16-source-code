/*    */ 
/*    */ public class afp
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   
/*    */   public double a(double ☃, double d1) {
/*  9 */     this.a += ☃;
/*    */     
/* 11 */     double d2 = this.a - this.b;
/*    */     
/* 13 */     double d3 = afm.d(0.5D, this.c, d2);
/*    */ 
/*    */     
/* 16 */     double d4 = Math.signum(d2);
/* 17 */     if (d4 * d2 > d4 * this.c) {
/* 18 */       d2 = d3;
/*    */     }
/*    */     
/* 21 */     this.c = d3;
/* 22 */     this.b += d2 * d1;
/*    */     
/* 24 */     return d2 * d1;
/*    */   }
/*    */   
/*    */   public void a() {
/* 28 */     this.a = 0.0D;
/* 29 */     this.b = 0.0D;
/* 30 */     this.c = 0.0D;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */