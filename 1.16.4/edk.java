/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ public class edk
/*    */   implements edh.a
/*    */ {
/*    */   private final djz a;
/*    */   
/*    */   public edk(djz ☃) {
/* 28 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 33 */     bry bry = this.a.r;
/*    */     
/* 35 */     RenderSystem.pushMatrix();
/*    */     
/* 37 */     RenderSystem.disableBlend();
/* 38 */     RenderSystem.disableTexture();
/* 39 */     RenderSystem.enableDepthTest();
/*    */     
/* 41 */     fx fx = new fx(d1, 0.0D, d3);
/*    */     
/* 43 */     dfo dfo = dfo.a();
/* 44 */     dfh dfh = dfo.c();
/* 45 */     dfh.a(5, dfk.l);
/*    */     
/* 47 */     for (int i = -32; i <= 32; i += 16) {
/* 48 */       for (int j = -32; j <= 32; j += 16) {
/* 49 */         cfw cfw = bry.z(fx.b(i, 0, j));
/* 50 */         for (Map.Entry<chn.a, chn> entry : cfw.f()) {
/* 51 */           chn.a a1 = entry.getKey();
/* 52 */           brd brd = cfw.g();
/* 53 */           g g = a(a1);
/* 54 */           for (int k = 0; k < 16; k++) {
/* 55 */             for (int m = 0; m < 16; m++) {
/* 56 */               int n = brd.b * 16 + k;
/* 57 */               int i1 = brd.c * 16 + m;
/* 58 */               float f = (float)((bry.a(a1, n, i1) + a1.ordinal() * 0.09375F) - d2);
/* 59 */               eae.a(dfh, (n + 0.25F) - d1, f, (i1 + 0.25F) - d3, (n + 0.75F) - d1, (f + 0.09375F), (i1 + 0.75F) - d3, g.a(), g.b(), g.c(), 1.0F);
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 66 */     dfo.b();
/*    */     
/* 68 */     RenderSystem.enableTexture();
/* 69 */     RenderSystem.popMatrix();
/*    */   }
/*    */   
/*    */   private g a(chn.a ☃) {
/* 73 */     switch (null.a[☃.ordinal()]) {
/*    */       case 1:
/* 75 */         return new g(1.0F, 1.0F, 0.0F);
/*    */       case 2:
/* 77 */         return new g(1.0F, 0.0F, 1.0F);
/*    */       case 3:
/* 79 */         return new g(0.0F, 0.7F, 0.0F);
/*    */       case 4:
/* 81 */         return new g(0.0F, 0.0F, 0.5F);
/*    */       case 5:
/* 83 */         return new g(0.0F, 0.3F, 0.3F);
/*    */       case 6:
/* 85 */         return new g(0.0F, 0.5F, 0.5F);
/*    */     } 
/* 87 */     return new g(0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */