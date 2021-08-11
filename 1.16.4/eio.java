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
/*    */ public class eio
/*    */   extends eit<bbe, dus<bbe>>
/*    */ {
/* 15 */   private static final vk[] a = new vk[] { new vk("textures/entity/llama/decor/white.png"), new vk("textures/entity/llama/decor/orange.png"), new vk("textures/entity/llama/decor/magenta.png"), new vk("textures/entity/llama/decor/light_blue.png"), new vk("textures/entity/llama/decor/yellow.png"), new vk("textures/entity/llama/decor/lime.png"), new vk("textures/entity/llama/decor/pink.png"), new vk("textures/entity/llama/decor/gray.png"), new vk("textures/entity/llama/decor/light_gray.png"), new vk("textures/entity/llama/decor/cyan.png"), new vk("textures/entity/llama/decor/purple.png"), new vk("textures/entity/llama/decor/blue.png"), new vk("textures/entity/llama/decor/brown.png"), new vk("textures/entity/llama/decor/green.png"), new vk("textures/entity/llama/decor/red.png"), new vk("textures/entity/llama/decor/black.png") };
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
/*    */ 
/*    */   
/* 34 */   private static final vk b = new vk("textures/entity/llama/decor/trader_llama.png");
/*    */   
/* 36 */   private final dus<bbe> c = new dus<>(0.5F);
/*    */   
/*    */   public eio(egk<bbe, dus<bbe>> ☃) {
/* 39 */     super(☃);
/*    */   }
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, bbe bbe1, float f1, float f2, float f3, float f4, float f5, float f6) {
/*    */     vk vk1;
/* 44 */     bkx bkx = bbe1.fy();
/*    */     
/* 46 */     if (bkx != null) {
/* 47 */       vk1 = a[bkx.b()];
/* 48 */     } else if (bbe1.fu()) {
/* 49 */       vk1 = b;
/*    */     } else {
/*    */       return;
/*    */     } 
/*    */     
/* 54 */     aC_().a(this.c);
/* 55 */     this.c.a(bbe1, f1, f2, f4, f5, f6);
/* 56 */     dfq dfq = eag1.getBuffer(eao.d(vk1));
/* 57 */     this.c.a(☃, dfq, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */