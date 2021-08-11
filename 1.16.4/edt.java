/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.List;
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
/*    */ public class edt
/*    */   implements edh.a
/*    */ {
/* 17 */   private final List<fx> a = Lists.newArrayList();
/* 18 */   private final List<Float> b = Lists.newArrayList();
/* 19 */   private final List<Float> c = Lists.newArrayList();
/* 20 */   private final List<Float> d = Lists.newArrayList();
/* 21 */   private final List<Float> e = Lists.newArrayList();
/* 22 */   private final List<Float> f = Lists.newArrayList();
/*    */   
/*    */   public void a(fx ☃, float f1, float f2, float f3, float f4, float f5) {
/* 25 */     this.a.add(☃);
/* 26 */     this.b.add(Float.valueOf(f1));
/* 27 */     this.c.add(Float.valueOf(f5));
/* 28 */     this.d.add(Float.valueOf(f2));
/* 29 */     this.e.add(Float.valueOf(f3));
/* 30 */     this.f.add(Float.valueOf(f4));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 35 */     RenderSystem.pushMatrix();
/*    */     
/* 37 */     RenderSystem.enableBlend();
/* 38 */     RenderSystem.defaultBlendFunc();
/* 39 */     RenderSystem.disableTexture();
/*    */     
/* 41 */     dfo dfo = dfo.a();
/* 42 */     dfh dfh = dfo.c();
/* 43 */     dfh.a(5, dfk.l);
/*    */     
/* 45 */     for (int i = 0; i < this.a.size(); i++) {
/* 46 */       fx fx = this.a.get(i);
/* 47 */       Float float_ = this.b.get(i);
/*    */       
/* 49 */       float f = float_.floatValue() / 2.0F;
/* 50 */       eae.a(dfh, (fx
/*    */           
/* 52 */           .u() + 0.5F - f) - d1, (fx
/* 53 */           .v() + 0.5F - f) - d2, (fx
/* 54 */           .w() + 0.5F - f) - d3, (fx
/* 55 */           .u() + 0.5F + f) - d1, (fx
/* 56 */           .v() + 0.5F + f) - d2, (fx
/* 57 */           .w() + 0.5F + f) - d3, ((Float)this.d
/* 58 */           .get(i)).floatValue(), ((Float)this.e
/* 59 */           .get(i)).floatValue(), ((Float)this.f
/* 60 */           .get(i)).floatValue(), ((Float)this.c
/* 61 */           .get(i)).floatValue());
/*    */     } 
/*    */ 
/*    */     
/* 65 */     dfo.b();
/*    */     
/* 67 */     RenderSystem.enableTexture();
/* 68 */     RenderSystem.popMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */