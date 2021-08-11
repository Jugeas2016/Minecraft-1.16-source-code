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
/*    */ public class blt
/*    */   extends blx
/*    */ {
/*    */   private final aqe<? extends bco> a;
/*    */   
/*    */   public blt(aqe<? extends bco> ☃, blx.a a1) {
/* 19 */     super(a1);
/* 20 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public aou a(boa ☃) {
/*    */     bco bco;
/* 25 */     fx fx1 = ☃.a();
/* 26 */     gc gc = ☃.j();
/*    */     
/* 28 */     fx fx2 = fx1.a(gc);
/* 29 */     bfw bfw = ☃.n();
/* 30 */     bmb bmb = ☃.m();
/*    */     
/* 32 */     if (bfw != null && !a(bfw, gc, bmb, fx2)) {
/* 33 */       return aou.d;
/*    */     }
/*    */     
/* 36 */     brx brx = ☃.p();
/*    */     
/* 38 */     if (this.a == aqe.ad) {
/* 39 */       bco = new bcs(brx, fx2, gc);
/* 40 */     } else if (this.a == aqe.M) {
/* 41 */       bco = new bcp(brx, fx2, gc);
/*    */     } else {
/* 43 */       return aou.a(brx.v);
/*    */     } 
/*    */     
/* 46 */     md md = bmb.o();
/* 47 */     if (md != null) {
/* 48 */       aqe.a(brx, bfw, bco, md);
/*    */     }
/*    */     
/* 51 */     if (bco.h()) {
/* 52 */       if (!brx.v) {
/* 53 */         bco.m();
/* 54 */         brx.c(bco);
/*    */       } 
/* 56 */       bmb.g(1);
/* 57 */       return aou.a(brx.v);
/*    */     } 
/*    */     
/* 60 */     return aou.b;
/*    */   }
/*    */   
/*    */   protected boolean a(bfw ☃, gc gc1, bmb bmb1, fx fx1) {
/* 64 */     return (!gc1.n().c() && ☃.a(fx1, gc1, bmb1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */