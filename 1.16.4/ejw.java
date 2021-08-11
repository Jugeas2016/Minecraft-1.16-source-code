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
/*    */ public class ejw
/*    */   implements AutoCloseable
/*    */ {
/* 16 */   public static final int a = a(0, 10);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 21 */   private final ejs b = new ejs(16, 16, false); public ejw() {
/* 22 */     det ☃ = this.b.e();
/*    */     
/* 24 */     for (int i = 0; i < 16; i++) {
/* 25 */       for (int j = 0; j < 16; j++) {
/* 26 */         if (i < 8) {
/*    */           
/* 28 */           ☃.a(j, i, -1308622593);
/*    */         } else {
/*    */           
/* 31 */           int k = (int)((1.0F - j / 15.0F * 0.75F) * 255.0F);
/* 32 */           ☃.a(j, i, k << 24 | 0xFFFFFF);
/*    */         } 
/*    */       } 
/*    */     } 
/* 36 */     RenderSystem.activeTexture(33985);
/* 37 */     this.b.d();
/*    */     
/* 39 */     RenderSystem.matrixMode(5890);
/* 40 */     RenderSystem.loadIdentity();
/* 41 */     float f = 0.06666667F;
/* 42 */     RenderSystem.scalef(0.06666667F, 0.06666667F, 0.06666667F);
/* 43 */     RenderSystem.matrixMode(5888);
/*    */     
/* 45 */     this.b.d();
/* 46 */     ☃.a(0, 0, 0, 0, 0, ☃.a(), ☃.b(), false, true, false, false);
/* 47 */     RenderSystem.activeTexture(33984);
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() {
/* 52 */     this.b.close();
/*    */   }
/*    */   
/*    */   public void a() {
/* 56 */     RenderSystem.setupOverlayColor(this.b::b, 16);
/*    */   }
/*    */   
/*    */   public static int a(float ☃) {
/* 60 */     return (int)(☃ * 15.0F);
/*    */   }
/*    */   
/*    */   public static int a(boolean ☃) {
/* 64 */     return ☃ ? 3 : 10;
/*    */   }
/*    */   
/*    */   public static int a(int ☃, int i) {
/* 68 */     return ☃ | i << 16;
/*    */   }
/*    */   
/*    */   public static int a(float ☃, boolean bool) {
/* 72 */     return a(a(☃), a(bool));
/*    */   }
/*    */   
/*    */   public void b() {
/* 76 */     RenderSystem.teardownOverlayColor();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */