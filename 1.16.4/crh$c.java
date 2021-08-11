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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ abstract class c
/*    */   extends cru
/*    */ {
/*    */   protected ckb.b a;
/*    */   
/*    */   public c(clb ☃, int i, ckb.b b1) {
/* 47 */     super(☃, i);
/* 48 */     this.a = b1;
/*    */   }
/*    */   
/*    */   public c(clb ☃, md md1) {
/* 52 */     super(☃, md1);
/* 53 */     this.a = ckb.b.a(md1.h("MST"));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(md ☃) {
/* 58 */     ☃.b("MST", this.a.ordinal());
/*    */   }
/*    */   
/*    */   protected ceh a() {
/* 62 */     switch (crh.null.a[this.a.ordinal()])
/*    */     
/*    */     { default:
/* 65 */         return bup.n.n();
/*    */       case 2:
/* 67 */         break; }  return bup.s.n();
/*    */   }
/*    */ 
/*    */   
/*    */   protected ceh b() {
/* 72 */     switch (crh.null.a[this.a.ordinal()])
/*    */     
/*    */     { default:
/* 75 */         return bup.cJ.n();
/*    */       case 2:
/* 77 */         break; }  return bup.iq.n();
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(brc ☃, cra cra1, int i, int j, int k, int m) {
/* 82 */     for (int n = i; n <= j; n++) {
/* 83 */       if (a(☃, n, k + 1, m, cra1).g()) {
/* 84 */         return false;
/*    */       }
/*    */     } 
/* 87 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crh$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */