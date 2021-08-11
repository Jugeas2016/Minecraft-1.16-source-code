/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eds
/*    */   implements edh.a
/*    */ {
/*    */   private final djz a;
/*    */   
/*    */   public eds(djz ☃) {
/* 17 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 22 */     fx fx = this.a.s.cB();
/* 23 */     brz brz = this.a.s.l;
/*    */     
/* 25 */     RenderSystem.enableBlend();
/* 26 */     RenderSystem.defaultBlendFunc();
/* 27 */     RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
/* 28 */     RenderSystem.disableTexture();
/* 29 */     RenderSystem.lineWidth(6.0F);
/*    */     
/* 31 */     for (fx fx1 : fx.a(fx.b(-10, -10, -10), fx.b(10, 10, 10))) {
/* 32 */       cux cux = brz.b(fx1);
/* 33 */       if (cux.a(aef.b)) {
/* 34 */         double d = (fx1.v() + cux.a(brz, fx1));
/*    */         
/* 36 */         edh.a((new dci((fx1
/* 37 */               .u() + 0.01F), (fx1
/* 38 */               .v() + 0.01F), (fx1
/* 39 */               .w() + 0.01F), (fx1
/* 40 */               .u() + 0.99F), d, (fx1
/*    */               
/* 42 */               .w() + 0.99F)))
/* 43 */             .d(-d1, -d2, -d3), 1.0F, 1.0F, 1.0F, 0.2F);
/*    */       } 
/*    */     } 
/*    */     
/* 47 */     for (fx fx1 : fx.a(fx.b(-10, -10, -10), fx.b(10, 10, 10))) {
/* 48 */       cux cux = brz.b(fx1);
/* 49 */       if (cux.a(aef.b)) {
/* 50 */         edh.a(
/* 51 */             String.valueOf(cux.e()), fx1
/* 52 */             .u() + 0.5D, (fx1
/* 53 */             .v() + cux.a(brz, fx1)), fx1
/* 54 */             .w() + 0.5D, -16777216);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 59 */     RenderSystem.enableTexture();
/* 60 */     RenderSystem.disableBlend();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eds.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */