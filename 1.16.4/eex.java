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
/*    */ public class eex
/*    */   extends eeu<aqg>
/*    */ {
/* 18 */   private static final vk a = new vk("textures/entity/experience_orb.png");
/* 19 */   private static final eao e = eao.f(a);
/*    */   
/*    */   public eex(eet ☃) {
/* 22 */     super(☃);
/* 23 */     this.c = 0.15F;
/* 24 */     this.d = 0.75F;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(aqg ☃, fx fx1) {
/* 29 */     return afm.a(super.a(☃, fx1) + 7, 0, 15);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aqg ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 34 */     dfm1.a();
/*    */     
/* 36 */     int j = ☃.h();
/* 37 */     float f3 = (j % 4 * 16 + 0) / 64.0F;
/* 38 */     float f4 = (j % 4 * 16 + 16) / 64.0F;
/* 39 */     float f5 = (j / 4 * 16 + 0) / 64.0F;
/* 40 */     float f6 = (j / 4 * 16 + 16) / 64.0F;
/*    */     
/* 42 */     float f7 = 1.0F;
/* 43 */     float f8 = 0.5F;
/* 44 */     float f9 = 0.25F;
/*    */     
/* 46 */     float f10 = 255.0F;
/* 47 */     float f11 = (☃.b + f2) / 2.0F;
/* 48 */     int k = (int)((afm.a(f11 + 0.0F) + 1.0F) * 0.5F * 255.0F);
/* 49 */     int m = 255;
/* 50 */     int n = (int)((afm.a(f11 + 4.1887903F) + 1.0F) * 0.1F * 255.0F);
/*    */     
/* 52 */     dfm1.a(0.0D, 0.10000000149011612D, 0.0D);
/* 53 */     dfm1.a(this.b.b());
/* 54 */     dfm1.a(g.d.a(180.0F));
/*    */     
/* 56 */     float f12 = 0.3F;
/* 57 */     dfm1.a(0.3F, 0.3F, 0.3F);
/*    */     
/* 59 */     dfq dfq = eag1.getBuffer(e);
/*    */     
/* 61 */     dfm.a a = dfm1.c();
/* 62 */     b b = a.a();
/* 63 */     a a1 = a.b();
/*    */     
/* 65 */     a(dfq, b, a1, -0.5F, -0.25F, k, 255, n, f3, f6, i);
/* 66 */     a(dfq, b, a1, 0.5F, -0.25F, k, 255, n, f4, f6, i);
/* 67 */     a(dfq, b, a1, 0.5F, 0.75F, k, 255, n, f4, f5, i);
/* 68 */     a(dfq, b, a1, -0.5F, 0.75F, k, 255, n, f3, f5, i);
/*    */     
/* 70 */     dfm1.b();
/*    */     
/* 72 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */   
/*    */   private static void a(dfq ☃, b b1, a a1, float f1, float f2, int i, int j, int k, float f3, float f4, int m) {
/* 76 */     ☃.a(b1, f1, f2, 0.0F).a(i, j, k, 128).a(f3, f4).b(ejw.a).a(m).a(a1, 0.0F, 1.0F, 0.0F).d();
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(aqg ☃) {
/* 81 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */