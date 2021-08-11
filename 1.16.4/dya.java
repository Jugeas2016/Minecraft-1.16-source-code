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
/*    */ public class dya
/*    */   extends dyg
/*    */ {
/*    */   private final eam a;
/*    */   private final aqa b;
/*    */   private final aqa B;
/*    */   private int C;
/*    */   private final eet D;
/*    */   
/*    */   public dya(eet ☃, eam eam1, dwt dwt1, aqa aqa1, aqa aqa2) {
/* 25 */     this(☃, eam1, dwt1, aqa1, aqa2, aqa1.cC());
/*    */   }
/*    */   
/*    */   private dya(eet ☃, eam eam1, dwt dwt1, aqa aqa1, aqa aqa2, dcn dcn1) {
/* 29 */     super(dwt1, aqa1.cD(), aqa1.cE(), aqa1.cH(), dcn1.b, dcn1.c, dcn1.d);
/* 30 */     this.a = eam1;
/* 31 */     this.b = a(aqa1);
/* 32 */     this.B = aqa2;
/* 33 */     this.D = ☃;
/*    */   }
/*    */   
/*    */   private aqa a(aqa ☃) {
/* 37 */     if (!(☃ instanceof bcv)) {
/* 38 */       return ☃;
/*    */     }
/*    */     
/* 41 */     return ((bcv)☃).t();
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 46 */     return dyk.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfq ☃, djk djk1, float f) {
/* 51 */     float f1 = (this.C + f) / 3.0F;
/* 52 */     f1 *= f1;
/*    */     
/* 54 */     double d1 = afm.d(f, this.B.D, this.B.cD());
/* 55 */     double d2 = afm.d(f, this.B.E, this.B.cE()) + 0.5D;
/* 56 */     double d3 = afm.d(f, this.B.F, this.B.cH());
/*    */     
/* 58 */     double d4 = afm.d(f1, this.b.cD(), d1);
/* 59 */     double d5 = afm.d(f1, this.b.cE(), d2);
/* 60 */     double d6 = afm.d(f1, this.b.cH(), d3);
/*    */     
/* 62 */     eag.a a = this.a.b();
/* 63 */     dcn dcn = djk1.b();
/* 64 */     this.D.a(this.b, d4 - dcn.a(), d5 - dcn.b(), d6 - dcn.c(), this.b.p, f, new dfm(), a, this.D.a(this.b, f));
/* 65 */     a.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 70 */     this.C++;
/* 71 */     if (this.C == 3)
/* 72 */       j(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dya.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */