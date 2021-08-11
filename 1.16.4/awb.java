/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awb
/*    */   extends avv
/*    */ {
/*    */   private final aqn a;
/*    */   private aqm b;
/*    */   private final float c;
/*    */   
/*    */   public awb(aqn ☃, float f) {
/* 16 */     this.a = ☃;
/* 17 */     this.c = f;
/* 18 */     a(EnumSet.of(avv.a.c, avv.a.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 23 */     if (this.a.bs()) {
/* 24 */       return false;
/*    */     }
/* 26 */     this.b = this.a.A();
/* 27 */     if (this.b == null) {
/* 28 */       return false;
/*    */     }
/* 30 */     double ☃ = this.a.h(this.b);
/* 31 */     if (☃ < 4.0D || ☃ > 16.0D) {
/* 32 */       return false;
/*    */     }
/* 34 */     if (!this.a.ao()) {
/* 35 */       return false;
/*    */     }
/* 37 */     if (this.a.cY().nextInt(5) != 0) {
/* 38 */       return false;
/*    */     }
/* 40 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 45 */     return !this.a.ao();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void c() {
/* 51 */     dcn ☃ = this.a.cC();
/* 52 */     dcn dcn1 = new dcn(this.b.cD() - this.a.cD(), 0.0D, this.b.cH() - this.a.cH());
/* 53 */     if (dcn1.g() > 1.0E-7D) {
/* 54 */       dcn1 = dcn1.d().a(0.4D).e(☃.a(0.2D));
/*    */     }
/*    */     
/* 57 */     this.a.n(dcn1.b, this.c, dcn1.d);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */