/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
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
/*    */ public class edl
/*    */   implements edh.a
/*    */ {
/*    */   private final djz a;
/*    */   
/*    */   public edl(djz ☃) {
/* 20 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 25 */     brx brx = this.a.r;
/*    */     
/* 27 */     RenderSystem.pushMatrix();
/*    */     
/* 29 */     RenderSystem.enableBlend();
/* 30 */     RenderSystem.defaultBlendFunc();
/* 31 */     RenderSystem.disableTexture();
/*    */     
/* 33 */     fx fx = new fx(d1, d2, d3);
/*    */     
/* 35 */     LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
/*    */     
/* 37 */     for (fx fx1 : fx.a(fx.b(-10, -10, -10), fx.b(10, 10, 10))) {
/* 38 */       int i = brx.a(bsf.a, fx1);
/*    */       
/* 40 */       float f = (15 - i) / 15.0F * 0.5F + 0.16F;
/* 41 */       int j = afm.f(f, 0.9F, 0.9F);
/*    */       
/* 43 */       long l = gp.e(fx1.a());
/* 44 */       if (longOpenHashSet.add(l)) {
/* 45 */         edh.a(brx.H().l().a(bsf.a, gp.a(l)), (gp.b(l) * 16 + 8), (gp.c(l) * 16 + 8), (gp.d(l) * 16 + 8), 16711680, 0.3F);
/*    */       }
/* 47 */       if (i != 15) {
/* 48 */         edh.a(String.valueOf(i), fx1.u() + 0.5D, fx1.v() + 0.25D, fx1.w() + 0.5D, j);
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 58 */     RenderSystem.enableTexture();
/* 59 */     RenderSystem.popMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */