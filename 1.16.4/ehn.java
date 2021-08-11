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
/*    */ public class ehn
/*    */   extends eeu<bgz>
/*    */ {
/* 15 */   private static final vk a = new vk("textures/entity/wither/wither_invulnerable.png");
/* 16 */   private static final vk e = new vk("textures/entity/wither/wither.png");
/*    */   
/* 18 */   private final dvt f = new dvt();
/*    */   
/*    */   public ehn(eet ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(bgz ☃, fx fx1) {
/* 26 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bgz ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 31 */     dfm1.a();
/*    */     
/* 33 */     dfm1.a(-1.0F, -1.0F, 1.0F);
/*    */     
/* 35 */     float f3 = afm.j(☃.r, ☃.p, f2);
/* 36 */     float f4 = afm.g(f2, ☃.s, ☃.q);
/*    */     
/* 38 */     dfq dfq = eag1.getBuffer(this.f.a(a(☃)));
/* 39 */     this.f.a(0.0F, f3, f4);
/* 40 */     this.f.a(dfm1, dfq, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 42 */     dfm1.b();
/*    */     
/* 44 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bgz ☃) {
/* 49 */     return ☃.k() ? a : e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ehn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */