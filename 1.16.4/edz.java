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
/*    */ public abstract class edz<T extends bga>
/*    */   extends eeu<T>
/*    */ {
/*    */   public edz(eet ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 21 */     dfm1.a();
/*    */     
/* 23 */     dfm1.a(g.d.a(afm.g(f2, ((bga)☃).r, ((bga)☃).p) - 90.0F));
/* 24 */     dfm1.a(g.f.a(afm.g(f2, ((bga)☃).s, ((bga)☃).q)));
/*    */     
/* 26 */     int j = 0;
/*    */     
/* 28 */     float f3 = 0.0F;
/* 29 */     float f4 = 0.5F;
/* 30 */     float f5 = 0.0F;
/* 31 */     float f6 = 0.15625F;
/*    */     
/* 33 */     float f7 = 0.0F;
/* 34 */     float f8 = 0.15625F;
/* 35 */     float f9 = 0.15625F;
/* 36 */     float f10 = 0.3125F;
/* 37 */     float f11 = 0.05625F;
/* 38 */     float f12 = ((bga)☃).e - f2;
/* 39 */     if (f12 > 0.0F) {
/* 40 */       float f = -afm.a(f12 * 3.0F) * f12;
/* 41 */       dfm1.a(g.f.a(f));
/*    */     } 
/* 43 */     dfm1.a(g.b.a(45.0F));
/* 44 */     dfm1.a(0.05625F, 0.05625F, 0.05625F);
/*    */     
/* 46 */     dfm1.a(-4.0D, 0.0D, 0.0D);
/*    */     
/* 48 */     dfq dfq = eag1.getBuffer(eao.c(a(☃)));
/*    */     
/* 50 */     dfm.a a = dfm1.c();
/* 51 */     b b = a.a();
/* 52 */     a a1 = a.b();
/*    */     
/* 54 */     a(b, a1, dfq, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, i);
/* 55 */     a(b, a1, dfq, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, i);
/* 56 */     a(b, a1, dfq, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, i);
/* 57 */     a(b, a1, dfq, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, i);
/*    */     
/* 59 */     a(b, a1, dfq, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, i);
/* 60 */     a(b, a1, dfq, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, i);
/* 61 */     a(b, a1, dfq, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, i);
/* 62 */     a(b, a1, dfq, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, i);
/*    */     
/* 64 */     for (int k = 0; k < 4; k++) {
/* 65 */       dfm1.a(g.b.a(90.0F));
/* 66 */       a(b, a1, dfq, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, i);
/* 67 */       a(b, a1, dfq, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, i);
/* 68 */       a(b, a1, dfq, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, i);
/* 69 */       a(b, a1, dfq, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, i);
/*    */     } 
/*    */     
/* 72 */     dfm1.b();
/*    */     
/* 74 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */   
/*    */   public void a(b ☃, a a1, dfq dfq1, int i, int j, int k, float f1, float f2, int m, int n, int i1, int i2) {
/* 78 */     dfq1.a(☃, i, j, k).a(255, 255, 255, 255).a(f1, f2).b(ejw.a).a(i2).a(a1, m, i1, n).d();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */