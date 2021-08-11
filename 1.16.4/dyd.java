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
/*    */ public class dyd
/*    */   extends dyg
/*    */ {
/* 20 */   private final duv a = new duh();
/* 21 */   private final eao b = eao.h(eeo.a);
/*    */   
/*    */   private dyd(dwt ☃, double d1, double d2, double d3) {
/* 24 */     super(☃, d1, d2, d3);
/* 25 */     this.u = 0.0F;
/* 26 */     this.t = 30;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 31 */     return dyk.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfq ☃, djk djk1, float f) {
/* 36 */     float f1 = (this.s + f) / this.t;
/* 37 */     float f2 = 0.05F + 0.5F * afm.a(f1 * 3.1415927F);
/*    */     
/* 39 */     dfm dfm = new dfm();
/*    */     
/* 41 */     dfm.a(djk1.f());
/* 42 */     dfm.a(g.b.a(150.0F * f1 - 60.0F));
/*    */     
/* 44 */     dfm.a(-1.0F, -1.0F, 1.0F);
/* 45 */     dfm.a(0.0D, -1.1009999513626099D, 1.5D);
/*    */     
/* 47 */     eag.a a = djz.C().aE().b();
/* 48 */     dfq dfq1 = a.getBuffer(this.b);
/* 49 */     this.a.a(dfm, dfq1, 15728880, ejw.a, 1.0F, 1.0F, 1.0F, f2);
/*    */     
/* 51 */     a.a();
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements dyj<hi> {
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 57 */       return new dyd(dwt1, d1, d2, d3);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */