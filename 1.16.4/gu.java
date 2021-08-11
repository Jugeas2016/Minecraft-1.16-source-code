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
/*    */ public class gu
/*    */   extends gv
/*    */ {
/* 14 */   private final gv b = new gv();
/*    */   private final bhn.b c;
/*    */   
/*    */   public gu(bhn.b ☃) {
/* 18 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public bmb a(fy ☃, bmb bmb1) {
/*    */     double d4;
/* 23 */     gc gc = (gc)☃.e().c(bwa.a);
/* 24 */     brx brx = ☃.h();
/*    */ 
/*    */     
/* 27 */     double d1 = ☃.a() + (gc.i() * 1.125F);
/* 28 */     double d2 = ☃.b() + (gc.j() * 1.125F);
/* 29 */     double d3 = ☃.c() + (gc.k() * 1.125F);
/*    */     
/* 31 */     fx fx = ☃.d().a(gc);
/*    */ 
/*    */     
/* 34 */     if (brx.b(fx).a(aef.b)) {
/* 35 */       d4 = 1.0D;
/* 36 */     } else if (brx.d_(fx).g() && brx.b(fx.c()).a(aef.b)) {
/* 37 */       d4 = 0.0D;
/*    */     } else {
/* 39 */       return this.b.dispense(☃, bmb1);
/*    */     } 
/*    */     
/* 42 */     bhn bhn = new bhn(brx, d1, d2 + d4, d3);
/* 43 */     bhn.a(this.c);
/* 44 */     bhn.p = gc.o();
/* 45 */     brx.c(bhn);
/*    */     
/* 47 */     bmb1.g(1);
/* 48 */     return bmb1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(fy ☃) {
/* 53 */     ☃.h().c(1000, ☃.d(), 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */