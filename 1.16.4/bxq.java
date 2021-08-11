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
/*    */ public class bxq
/*    */   extends bvt
/*    */ {
/*    */   protected bxq(ceg.c ☃) {
/* 19 */     super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, ☃);
/* 20 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 25 */     brc brc = ☃.p();
/* 26 */     fx fx1 = ☃.a();
/* 27 */     cux cux = ☃.p().b(☃.a());
/*    */     
/* 29 */     fx fx2 = fx1.d();
/* 30 */     fx fx3 = fx1.e();
/* 31 */     fx fx4 = fx1.f();
/* 32 */     fx fx5 = fx1.g();
/*    */     
/* 34 */     ceh ceh1 = brc.d_(fx2);
/* 35 */     ceh ceh2 = brc.d_(fx3);
/* 36 */     ceh ceh3 = brc.d_(fx4);
/* 37 */     ceh ceh4 = brc.d_(fx5);
/*    */     
/* 39 */     return n()
/* 40 */       .a(a, Boolean.valueOf(a(ceh1, ceh1.d(brc, fx2, gc.d))))
/* 41 */       .a(c, Boolean.valueOf(a(ceh2, ceh2.d(brc, fx3, gc.c))))
/* 42 */       .a(d, Boolean.valueOf(a(ceh3, ceh3.d(brc, fx4, gc.f))))
/* 43 */       .a(b, Boolean.valueOf(a(ceh4, ceh4.d(brc, fx5, gc.e))))
/* 44 */       .a(e, Boolean.valueOf((cux.a() == cuy.c)));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 50 */     if (((Boolean)☃.c(e)).booleanValue()) {
/* 51 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*    */     }
/* 53 */     if (gc1.n().d()) {
/* 54 */       return ☃.a(f.get(gc1), Boolean.valueOf(a(ceh1, ceh1.d(bry1, fx2, gc1.f()))));
/*    */     }
/* 56 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh a(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 61 */     return dde.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, ceh ceh1, gc gc1) {
/* 66 */     if (ceh1.a(this)) {
/* 67 */       if (!gc1.n().d()) {
/* 68 */         return true;
/*    */       }
/* 70 */       if (((Boolean)☃.c(f.get(gc1))).booleanValue() && ((Boolean)ceh1.c(f.get(gc1.f()))).booleanValue()) {
/* 71 */         return true;
/*    */       }
/*    */     } 
/* 74 */     return super.a(☃, ceh1, gc1);
/*    */   }
/*    */   
/*    */   public final boolean a(ceh ☃, boolean bool) {
/* 78 */     buo buo = ☃.b();
/* 79 */     return ((!b(buo) && bool) || buo instanceof bxq || buo.a(aed.F));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 84 */     ☃.a((cfj<?>[])new cfj[] { a, b, d, c, e });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */