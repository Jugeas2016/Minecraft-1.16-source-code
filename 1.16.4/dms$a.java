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
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/* 73 */   a(0, 0),
/* 74 */   b(1, 0),
/* 75 */   c(2, 0),
/* 76 */   d(0, 1),
/* 77 */   e(1, 1),
/* 78 */   f(2, 1);
/*    */   
/*    */   private final int g;
/*    */   
/*    */   private final int h;
/*    */   
/*    */   a(int ☃, int i) {
/* 85 */     this.g = ☃;
/* 86 */     this.h = i;
/*    */   }
/*    */   
/*    */   public void a(dfm ☃, dkw dkw1, int i, int j) {
/* 90 */     RenderSystem.enableBlend();
/* 91 */     dkw1.b(☃, i, j, 176 + this.g * 20, this.h * 20, 20, 20);
/* 92 */     RenderSystem.enableBlend();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dms$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */