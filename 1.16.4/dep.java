/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dep
/*    */ {
/*  9 */   private static final g a = x.<g>a(new g(0.2F, 1.0F, -0.7F), g::d);
/* 10 */   private static final g b = x.<g>a(new g(-0.2F, 1.0F, 0.7F), g::d);
/*    */   
/* 12 */   private static final g c = x.<g>a(new g(0.2F, 1.0F, -0.7F), g::d);
/* 13 */   private static final g d = x.<g>a(new g(-0.2F, -1.0F, 0.7F), g::d);
/*    */   
/*    */   public static void a() {
/* 16 */     RenderSystem.enableLighting();
/* 17 */     RenderSystem.enableColorMaterial();
/* 18 */     RenderSystem.colorMaterial(1032, 5634);
/*    */   }
/*    */   
/*    */   public static void b() {
/* 22 */     RenderSystem.disableLighting();
/* 23 */     RenderSystem.disableColorMaterial();
/*    */   }
/*    */   
/*    */   public static void a(b ☃) {
/* 27 */     RenderSystem.setupLevelDiffuseLighting(c, d, ☃);
/*    */   }
/*    */   
/*    */   public static void b(b ☃) {
/* 31 */     RenderSystem.setupLevelDiffuseLighting(a, b, ☃);
/*    */   }
/*    */   
/*    */   public static void c() {
/* 35 */     RenderSystem.setupGuiFlatDiffuseLighting(a, b);
/*    */   }
/*    */   
/*    */   public static void d() {
/* 39 */     RenderSystem.setupGui3DDiffuseLighting(a, b);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */