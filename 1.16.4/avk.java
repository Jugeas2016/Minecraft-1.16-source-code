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
/*    */ public class avk
/*    */   extends awj
/*    */ {
/*    */   private final bab g;
/*    */   
/*    */   public avk(bab ☃, double d) {
/* 18 */     super(☃, d, 8);
/* 19 */     this.g = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 24 */     return (this.g.eK() && !this.g.eO() && super.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 29 */     super.c();
/* 30 */     this.g.v(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 35 */     super.d();
/* 36 */     this.g.v(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 41 */     super.e();
/*    */     
/* 43 */     this.g.v(l());
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(brz ☃, fx fx1) {
/* 48 */     if (!☃.w(fx1.b())) {
/* 49 */       return false;
/*    */     }
/*    */     
/* 52 */     ceh ceh = ☃.d_(fx1);
/*    */ 
/*    */     
/* 55 */     if (ceh.a(bup.bR))
/* 56 */       return (ccn.a(☃, fx1) < 1); 
/* 57 */     if (ceh.a(bup.bY) && ((Boolean)ceh.c(bwy.b)).booleanValue()) {
/* 58 */       return true;
/*    */     }
/* 60 */     return ceh.a(aed.L, ☃ -> ((Boolean)☃.d(buj.a).map(()).orElse(Boolean.valueOf(true))).booleanValue());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */