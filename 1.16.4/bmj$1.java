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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   extends gv
/*    */ {
/* 21 */   private final gv b = new gv();
/*    */   
/*    */   public bmb a(fy ☃, bmb bmb1) {
/*    */     double d4;
/* 25 */     gc gc = (gc)☃.e().c(bwa.a);
/* 26 */     brx brx = ☃.h();
/*    */ 
/*    */ 
/*    */     
/* 30 */     double d1 = ☃.a() + gc.i() * 1.125D;
/* 31 */     double d2 = Math.floor(☃.b()) + gc.j();
/* 32 */     double d3 = ☃.c() + gc.k() * 1.125D;
/*    */     
/* 34 */     fx fx = ☃.d().a(gc);
/* 35 */     ceh ceh = brx.d_(fx);
/* 36 */     cfk cfk = (ceh.b() instanceof bug) ? (cfk)ceh.c(((bug)ceh.b()).d()) : cfk.a;
/*    */ 
/*    */     
/* 39 */     if (ceh.a(aed.H)) {
/* 40 */       if (cfk.c()) {
/* 41 */         d4 = 0.6D;
/*    */       } else {
/* 43 */         d4 = 0.1D;
/*    */       } 
/* 45 */     } else if (ceh.g() && brx.d_(fx.c()).a(aed.H)) {
/* 46 */       ceh ceh1 = brx.d_(fx.c());
/* 47 */       cfk cfk1 = (ceh1.b() instanceof bug) ? (cfk)ceh1.c(((bug)ceh1.b()).d()) : cfk.a;
/* 48 */       if (gc == gc.a || !cfk1.c()) {
/* 49 */         d4 = -0.9D;
/*    */       } else {
/* 51 */         d4 = -0.4D;
/*    */       } 
/*    */     } else {
/* 54 */       return this.b.dispense(☃, bmb1);
/*    */     } 
/*    */     
/* 57 */     bhl bhl = bhl.a(brx, d1, d2 + d4, d3, bmj.a((bmj)bmb1.b()));
/* 58 */     if (bmb1.t()) {
/* 59 */       bhl.a(bmb1.r());
/*    */     }
/* 61 */     brx.c(bhl);
/*    */     
/* 63 */     bmb1.g(1);
/* 64 */     return bmb1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(fy ☃) {
/* 69 */     ☃.h().c(1000, ☃.d(), 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmj$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */