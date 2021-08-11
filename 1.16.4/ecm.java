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
/*    */ public class ecm
/*    */   extends ece<cde>
/*    */ {
/*    */   private final dvq<?> a;
/*    */   
/*    */   public ecm(dvq<?> ☃, ecd ecd1) {
/* 21 */     super(ecd1);
/* 22 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cde ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/*    */     elr elr;
/* 28 */     gc gc = gc.b;
/* 29 */     if (☃.n()) {
/* 30 */       ceh ceh = ☃.v().d_(☃.o());
/* 31 */       if (ceh.b() instanceof bzs) {
/* 32 */         gc = (gc)ceh.c(bzs.a);
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 38 */     bkx bkx = ☃.k();
/* 39 */     if (bkx == null) {
/* 40 */       elr = ear.g;
/*    */     } else {
/* 42 */       elr = ear.h.get(bkx.b());
/*    */     } 
/*    */     
/* 45 */     dfm1.a();
/*    */     
/* 47 */     dfm1.a(0.5D, 0.5D, 0.5D);
/* 48 */     float f1 = 0.9995F;
/* 49 */     dfm1.a(0.9995F, 0.9995F, 0.9995F);
/*    */     
/* 51 */     dfm1.a(gc.b());
/*    */     
/* 53 */     dfm1.a(1.0F, -1.0F, -1.0F);
/* 54 */     dfm1.a(0.0D, -1.0D, 0.0D);
/*    */     
/* 56 */     dfq dfq = elr.a(eag1, eao::d);
/* 57 */     this.a.b().a(dfm1, dfq, i, j);
/* 58 */     dfm1.a(0.0D, (-☃.a(f) * 0.5F), 0.0D);
/* 59 */     dfm1.a(g.d.a(270.0F * ☃.a(f)));
/* 60 */     this.a.c().a(dfm1, dfq, i, j);
/*    */     
/* 62 */     dfm1.b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */