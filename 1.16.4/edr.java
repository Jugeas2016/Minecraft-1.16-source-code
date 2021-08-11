/*    */ import com.google.common.collect.Sets;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.Set;
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
/*    */ public class edr
/*    */   implements edh.a
/*    */ {
/* 18 */   private final Set<gp> a = Sets.newHashSet();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {
/* 25 */     this.a.clear();
/*    */   }
/*    */   
/*    */   public void a(gp ☃) {
/* 29 */     this.a.add(☃);
/*    */   }
/*    */   
/*    */   public void b(gp ☃) {
/* 33 */     this.a.remove(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 38 */     RenderSystem.pushMatrix();
/* 39 */     RenderSystem.enableBlend();
/* 40 */     RenderSystem.defaultBlendFunc();
/* 41 */     RenderSystem.disableTexture();
/*    */     
/* 43 */     a(d1, d2, d3);
/*    */     
/* 45 */     RenderSystem.enableTexture();
/* 46 */     RenderSystem.disableBlend();
/* 47 */     RenderSystem.popMatrix();
/*    */   }
/*    */   
/*    */   private void a(double ☃, double d1, double d2) {
/* 51 */     fx fx = new fx(☃, d1, d2);
/*    */     
/* 53 */     this.a.forEach(gp1 -> {
/*    */           if (☃.a(gp1.q(), 60.0D)) {
/*    */             c(gp1);
/*    */           }
/*    */         });
/*    */   }
/*    */   
/*    */   private static void c(gp ☃) {
/* 61 */     float f = 1.0F;
/* 62 */     fx fx1 = ☃.q();
/* 63 */     fx fx2 = fx1.a(-1.0D, -1.0D, -1.0D);
/* 64 */     fx fx3 = fx1.a(1.0D, 1.0D, 1.0D);
/*    */     
/* 66 */     edh.a(fx2, fx3, 0.2F, 1.0F, 0.2F, 0.15F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */