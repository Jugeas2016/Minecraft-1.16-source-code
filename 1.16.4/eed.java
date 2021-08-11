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
/*    */ public class eed
/*    */   extends eeu<bhn>
/*    */ {
/* 16 */   private static final vk[] e = new vk[] { new vk("textures/entity/boat/oak.png"), new vk("textures/entity/boat/spruce.png"), new vk("textures/entity/boat/birch.png"), new vk("textures/entity/boat/jungle.png"), new vk("textures/entity/boat/acacia.png"), new vk("textures/entity/boat/dark_oak.png") };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 24 */   protected final dtn a = new dtn();
/*    */   
/*    */   public eed(eet ☃) {
/* 27 */     super(☃);
/* 28 */     this.c = 0.8F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bhn ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 33 */     dfm1.a();
/*    */     
/* 35 */     dfm1.a(0.0D, 0.375D, 0.0D);
/* 36 */     dfm1.a(g.d.a(180.0F - f1));
/* 37 */     float f3 = ☃.n() - f2;
/* 38 */     float f4 = ☃.m() - f2;
/* 39 */     if (f4 < 0.0F) {
/* 40 */       f4 = 0.0F;
/*    */     }
/* 42 */     if (f3 > 0.0F) {
/* 43 */       dfm1.a(g.b.a(afm.a(f3) * f3 * f4 / 10.0F * ☃.o()));
/*    */     }
/*    */     
/* 46 */     float f5 = ☃.b(f2);
/* 47 */     if (!afm.a(f5, 0.0F))
/*    */     {
/* 49 */       dfm1.a(new d(new g(1.0F, 0.0F, 1.0F), ☃.b(f2), true));
/*    */     }
/*    */     
/* 52 */     dfm1.a(-1.0F, -1.0F, 1.0F);
/*    */     
/* 54 */     dfm1.a(g.d.a(90.0F));
/* 55 */     this.a.a(☃, f2, 0.0F, -0.1F, 0.0F, 0.0F);
/*    */     
/* 57 */     dfq dfq = eag1.getBuffer(this.a.a(a(☃)));
/* 58 */     this.a.a(dfm1, dfq, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 60 */     if (!☃.aI()) {
/* 61 */       dfq dfq1 = eag1.getBuffer(eao.j());
/* 62 */       this.a.c().a(dfm1, dfq1, i, ejw.a);
/*    */     } 
/*    */     
/* 65 */     dfm1.b();
/*    */     
/* 67 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bhn ☃) {
/* 72 */     return e[☃.p().ordinal()];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */