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
/*    */ public class egn
/*    */   extends eeu<bgo>
/*    */ {
/* 17 */   private static final vk a = new vk("textures/entity/shulker/spark.png");
/* 18 */   private static final eao e = eao.h(a);
/*    */   
/* 20 */   private final dvp<bgo> f = new dvp<>();
/*    */   
/*    */   public egn(eet ☃) {
/* 23 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(bgo ☃, fx fx1) {
/* 28 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bgo ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 33 */     dfm1.a();
/*    */     
/* 35 */     float f3 = afm.j(☃.r, ☃.p, f2);
/* 36 */     float f4 = afm.g(f2, ☃.s, ☃.q);
/* 37 */     float f5 = ☃.K + f2;
/*    */     
/* 39 */     dfm1.a(0.0D, 0.15000000596046448D, 0.0D);
/* 40 */     dfm1.a(g.d.a(afm.a(f5 * 0.1F) * 180.0F));
/* 41 */     dfm1.a(g.b.a(afm.b(f5 * 0.1F) * 180.0F));
/* 42 */     dfm1.a(g.f.a(afm.a(f5 * 0.15F) * 360.0F));
/*    */     
/* 44 */     dfm1.a(-0.5F, -0.5F, 0.5F);
/*    */     
/* 46 */     this.f.a(☃, 0.0F, 0.0F, 0.0F, f3, f4);
/*    */     
/* 48 */     dfq dfq1 = eag1.getBuffer(this.f.a(a));
/* 49 */     this.f.a(dfm1, dfq1, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 51 */     dfm1.a(1.5F, 1.5F, 1.5F);
/*    */     
/* 53 */     dfq dfq2 = eag1.getBuffer(e);
/* 54 */     this.f.a(dfm1, dfq2, i, ejw.a, 1.0F, 1.0F, 1.0F, 0.15F);
/*    */     
/* 56 */     dfm1.b();
/*    */     
/* 58 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bgo ☃) {
/* 63 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\egn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */