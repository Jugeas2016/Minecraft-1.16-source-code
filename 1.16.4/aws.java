/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aws
/*    */   extends avv
/*    */ {
/*    */   private final aqn a;
/*    */   private double b;
/*    */   private double c;
/*    */   private int d;
/*    */   
/*    */   public aws(aqn ☃) {
/* 14 */     this.a = ☃;
/* 15 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 20 */     return (this.a.cY().nextFloat() < 0.02F);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 25 */     return (this.d >= 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 30 */     double ☃ = 6.283185307179586D * this.a.cY().nextDouble();
/* 31 */     this.b = Math.cos(☃);
/* 32 */     this.c = Math.sin(☃);
/* 33 */     this.d = 20 + this.a.cY().nextInt(20);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 38 */     this.d--;
/* 39 */     this.a.t().a(this.a.cD() + this.b, this.a.cG(), this.a.cH() + this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aws.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */