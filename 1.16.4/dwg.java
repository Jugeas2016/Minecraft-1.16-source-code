/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dwg<T extends aqa>
/*    */   extends dwf<T>
/*    */ {
/*    */   private boolean m;
/*    */   private final dwn n;
/*    */   
/*    */   public dwg(float ☃) {
/* 12 */     super(☃, 64, 128);
/*    */     
/* 14 */     this.n = (new dwn(this)).b(64, 128);
/* 15 */     this.n.a(0.0F, -2.0F, 0.0F);
/* 16 */     this.n.a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, -0.25F);
/* 17 */     this.l.b(this.n);
/*    */     
/* 19 */     this.a = (new dwn(this)).b(64, 128);
/* 20 */     this.a.a(0.0F, 0.0F, 0.0F);
/* 21 */     this.a.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, ☃);
/* 22 */     this.b = (new dwn(this)).b(64, 128);
/* 23 */     this.b.a(-5.0F, -10.03125F, -5.0F);
/* 24 */     this.b.a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F);
/* 25 */     this.a.b(this.b);
/* 26 */     this.a.b(this.l);
/*    */     
/* 28 */     dwn dwn1 = (new dwn(this)).b(64, 128);
/* 29 */     dwn1.a(1.75F, -4.0F, 2.0F);
/* 30 */     dwn1.a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F);
/* 31 */     dwn1.d = -0.05235988F;
/* 32 */     dwn1.f = 0.02617994F;
/* 33 */     this.b.b(dwn1);
/*    */     
/* 35 */     dwn dwn2 = (new dwn(this)).b(64, 128);
/* 36 */     dwn2.a(1.75F, -4.0F, 2.0F);
/* 37 */     dwn2.a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F);
/* 38 */     dwn2.d = -0.10471976F;
/* 39 */     dwn2.f = 0.05235988F;
/* 40 */     dwn1.b(dwn2);
/*    */     
/* 42 */     dwn dwn3 = (new dwn(this)).b(64, 128);
/* 43 */     dwn3.a(1.75F, -2.0F, 2.0F);
/* 44 */     dwn3.a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.25F);
/* 45 */     dwn3.d = -0.20943952F;
/* 46 */     dwn3.f = 0.10471976F;
/* 47 */     dwn2.b(dwn3);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 52 */     super.a(☃, f1, f2, f3, f4, f5);
/*    */     
/* 54 */     this.l.a(0.0F, -2.0F, 0.0F);
/*    */     
/* 56 */     float f = 0.01F * (☃.Y() % 10);
/* 57 */     this.l.d = afm.a(((aqa)☃).K * f) * 4.5F * 0.017453292F;
/* 58 */     this.l.e = 0.0F;
/* 59 */     this.l.f = afm.b(((aqa)☃).K * f) * 2.5F * 0.017453292F;
/*    */     
/* 61 */     if (this.m) {
/* 62 */       this.l.a(0.0F, 1.0F, -1.5F);
/* 63 */       this.l.d = -0.9F;
/*    */     } 
/*    */   }
/*    */   
/*    */   public dwn b() {
/* 68 */     return this.l;
/*    */   }
/*    */   
/*    */   public void b(boolean ☃) {
/* 72 */     this.m = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */