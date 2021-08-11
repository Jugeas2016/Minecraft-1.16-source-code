/*    */ import java.util.EnumSet;
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
/*    */ public class avh
/*    */   extends avv
/*    */ {
/*    */   private final aqu a;
/*    */   
/*    */   public avh(aqu ☃) {
/* 20 */     this.a = ☃;
/* 21 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 26 */     return (this.a.bI() < 140);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 31 */     return a();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean C_() {
/* 36 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 41 */     g();
/*    */   }
/*    */   
/*    */   private void g() {
/* 45 */     Iterable<fx> ☃ = fx.b(
/* 46 */         afm.c(this.a.cD() - 1.0D), 
/* 47 */         afm.c(this.a.cE()), 
/* 48 */         afm.c(this.a.cH() - 1.0D), 
/* 49 */         afm.c(this.a.cD() + 1.0D), 
/* 50 */         afm.c(this.a.cE() + 8.0D), 
/* 51 */         afm.c(this.a.cH() + 1.0D));
/*    */ 
/*    */     
/* 54 */     fx fx = null;
/* 55 */     for (fx fx1 : ☃) {
/* 56 */       if (a(this.a.l, fx1)) {
/* 57 */         fx = fx1;
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 62 */     if (fx == null) {
/* 63 */       fx = new fx(this.a.cD(), this.a.cE() + 8.0D, this.a.cH());
/*    */     }
/*    */     
/* 66 */     this.a.x().a(fx.u(), (fx.v() + 1), fx.w(), 1.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 71 */     g();
/*    */     
/* 73 */     this.a.a(0.02F, new dcn(this.a.aR, this.a.aS, this.a.aT));
/* 74 */     this.a.a(aqr.a, this.a.cC());
/*    */   }
/*    */   
/*    */   private boolean a(brz ☃, fx fx1) {
/* 78 */     ceh ceh = ☃.d_(fx1);
/* 79 */     return ((☃.b(fx1).c() || ceh.a(bup.lc)) && ceh.a(☃, fx1, cxe.a));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */