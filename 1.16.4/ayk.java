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
/*    */ public class ayk
/*    */   extends ayi
/*    */ {
/*    */   private fx p;
/*    */   
/*    */   public ayk(aqn ☃, brx brx1) {
/* 21 */     super(☃, brx1);
/*    */   }
/*    */ 
/*    */   
/*    */   public cxd a(fx ☃, int i) {
/* 26 */     this.p = ☃;
/* 27 */     return super.a(☃, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public cxd a(aqa ☃, int i) {
/* 32 */     this.p = ☃.cB();
/* 33 */     return super.a(☃, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aqa ☃, double d) {
/* 38 */     cxd cxd = a(☃, 0);
/* 39 */     if (cxd != null) {
/* 40 */       return a(cxd, d);
/*    */     }
/* 42 */     this.p = ☃.cB();
/* 43 */     this.d = d;
/* 44 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void c() {
/* 50 */     if (m()) {
/* 51 */       if (this.p != null)
/*    */       {
/* 53 */         if (this.p.a(this.a.cA(), this.a.cy()) || (this.a.cE() > this.p.v() && (new fx(this.p.u(), this.a.cE(), this.p.w())).a(this.a.cA(), this.a.cy()))) {
/* 54 */           this.p = null;
/*    */         } else {
/* 56 */           this.a.u().a(this.p.u(), this.p.v(), this.p.w(), this.d);
/*    */         } 
/*    */       }
/*    */       return;
/*    */     } 
/* 61 */     super.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */