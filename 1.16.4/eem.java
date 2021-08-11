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
/*    */ public class eem
/*    */   extends eeu<bgd>
/*    */ {
/* 17 */   private static final vk a = new vk("textures/entity/enderdragon/dragon_fireball.png");
/* 18 */   private static final eao e = eao.d(a);
/*    */   
/*    */   public eem(eet ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(bgd ☃, fx fx1) {
/* 26 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bgd ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 31 */     dfm1.a();
/* 32 */     dfm1.a(2.0F, 2.0F, 2.0F);
/*    */     
/* 34 */     dfm1.a(this.b.b());
/* 35 */     dfm1.a(g.d.a(180.0F));
/*    */     
/* 37 */     dfm.a a = dfm1.c();
/* 38 */     b b = a.a();
/* 39 */     a a1 = a.b();
/*    */     
/* 41 */     dfq dfq = eag1.getBuffer(e);
/*    */     
/* 43 */     a(dfq, b, a1, i, 0.0F, 0, 0, 1);
/* 44 */     a(dfq, b, a1, i, 1.0F, 0, 1, 1);
/* 45 */     a(dfq, b, a1, i, 1.0F, 1, 1, 0);
/* 46 */     a(dfq, b, a1, i, 0.0F, 1, 0, 0);
/*    */     
/* 48 */     dfm1.b();
/*    */     
/* 50 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */   
/*    */   private static void a(dfq ☃, b b1, a a1, int i, float f, int j, int k, int m) {
/* 54 */     ☃.a(b1, f - 0.5F, j - 0.25F, 0.0F).a(255, 255, 255, 255).a(k, m).b(ejw.a).a(i).a(a1, 0.0F, 1.0F, 0.0F).d();
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bgd ☃) {
/* 59 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */