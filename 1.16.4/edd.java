/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.List;
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
/*    */ public class edd
/*    */   implements edh.a
/*    */ {
/* 21 */   private final Map<fx, fx> a = Maps.newHashMap();
/* 22 */   private final Map<fx, Float> b = Maps.newHashMap();
/* 23 */   private final List<fx> c = Lists.newArrayList();
/*    */   
/*    */   public void a(fx ☃, List<fx> list, List<Float> list1) {
/* 26 */     for (int i = 0; i < list.size(); i++) {
/* 27 */       this.a.put(list.get(i), ☃);
/* 28 */       this.b.put(list.get(i), list1.get(i));
/*    */     } 
/*    */     
/* 31 */     this.c.add(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 36 */     RenderSystem.pushMatrix();
/*    */     
/* 38 */     RenderSystem.enableBlend();
/* 39 */     RenderSystem.defaultBlendFunc();
/* 40 */     RenderSystem.disableTexture();
/*    */     
/* 42 */     fx fx = new fx(d1, 0.0D, d3);
/*    */     
/* 44 */     dfo dfo = dfo.a();
/* 45 */     dfh dfh = dfo.c();
/* 46 */     dfh.a(5, dfk.l);
/*    */     
/* 48 */     for (Map.Entry<fx, fx> entry : this.a.entrySet()) {
/* 49 */       fx fx1 = entry.getKey();
/*    */       
/* 51 */       fx fx2 = entry.getValue();
/* 52 */       float f1 = (fx2.u() * 128 % 256) / 256.0F;
/* 53 */       float f2 = (fx2.v() * 128 % 256) / 256.0F;
/* 54 */       float f3 = (fx2.w() * 128 % 256) / 256.0F;
/*    */       
/* 56 */       float f4 = ((Float)this.b.get(fx1)).floatValue();
/*    */       
/* 58 */       if (fx.a(fx1, 160.0D)) {
/* 59 */         eae.a(dfh, (fx1
/*    */             
/* 61 */             .u() + 0.5F) - d1 - f4, (fx1
/* 62 */             .v() + 0.5F) - d2 - f4, (fx1
/* 63 */             .w() + 0.5F) - d3 - f4, (fx1
/* 64 */             .u() + 0.5F) - d1 + f4, (fx1
/* 65 */             .v() + 0.5F) - d2 + f4, (fx1
/* 66 */             .w() + 0.5F) - d3 + f4, f1, f2, f3, 0.5F);
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 75 */     for (fx fx1 : this.c) {
/* 76 */       if (fx.a(fx1, 160.0D)) {
/* 77 */         eae.a(dfh, fx1.u() - d1, fx1.v() - d2, fx1.w() - d3, (fx1.u() + 1.0F) - d1, (fx1.v() + 1.0F) - d2, (fx1.w() + 1.0F) - d3, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */       }
/*    */     } 
/*    */     
/* 81 */     dfo.b();
/*    */     
/* 83 */     RenderSystem.enableDepthTest();
/* 84 */     RenderSystem.enableTexture();
/* 85 */     RenderSystem.popMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */