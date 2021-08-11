/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dll
/*    */   extends dld
/*    */ {
/* 13 */   private static final vk a = new vk("textures/gui/checkbox.png");
/*    */   
/*    */   private boolean b;
/*    */   
/*    */   private final boolean c;
/*    */   
/*    */   public dll(int ☃, int i, int j, int k, nr nr1, boolean bool) {
/* 20 */     this(☃, i, j, k, nr1, bool, true);
/*    */   }
/*    */   
/*    */   public dll(int ☃, int i, int j, int k, nr nr1, boolean bool1, boolean bool2) {
/* 24 */     super(☃, i, j, k, nr1);
/* 25 */     this.b = bool1;
/* 26 */     this.c = bool2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 31 */     this.b = !this.b;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 35 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(dfm ☃, int i, int j, float f) {
/* 40 */     djz djz = djz.C();
/* 41 */     djz.M().a(a);
/* 42 */     RenderSystem.enableDepthTest();
/* 43 */     dku dku = djz.g;
/*    */     
/* 45 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.q);
/*    */     
/* 47 */     RenderSystem.enableBlend();
/* 48 */     RenderSystem.defaultBlendFunc();
/* 49 */     RenderSystem.blendFunc(dem.r.l, dem.j.j);
/* 50 */     a(☃, this.l, this.m, j() ? 20.0F : 0.0F, this.b ? 20.0F : 0.0F, 20, this.k, 64, 64);
/*    */     
/* 52 */     a(☃, djz, i, j);
/*    */     
/* 54 */     if (this.c)
/* 55 */       b(☃, dku, i(), this.l + 24, this.m + (this.k - 8) / 2, 0xE0E0E0 | afm.f(this.q * 255.0F) << 24); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dll.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */