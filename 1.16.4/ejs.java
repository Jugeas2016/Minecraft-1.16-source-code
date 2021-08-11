/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ejs
/*    */   extends ejq
/*    */ {
/* 14 */   private static final Logger d = LogManager.getLogger();
/*    */   @Nullable
/*    */   private det e;
/*    */   
/*    */   public ejs(det ☃) {
/* 19 */     this.e = ☃;
/* 20 */     if (!RenderSystem.isOnRenderThread()) {
/* 21 */       RenderSystem.recordRenderCall(() -> {
/*    */             dex.a(b(), this.e.a(), this.e.b());
/*    */             a();
/*    */           });
/*    */     } else {
/* 26 */       dex.a(b(), this.e.a(), this.e.b());
/* 27 */       a();
/*    */     } 
/*    */   }
/*    */   
/*    */   public ejs(int ☃, int i, boolean bool) {
/* 32 */     RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
/* 33 */     this.e = new det(☃, i, bool);
/* 34 */     dex.a(b(), this.e.a(), this.e.b());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(ach ☃) {}
/*    */ 
/*    */   
/*    */   public void a() {
/* 43 */     if (this.e != null) {
/* 44 */       d();
/* 45 */       this.e.a(0, 0, 0, false);
/*    */     } else {
/* 47 */       d.warn("Trying to upload disposed texture {}", Integer.valueOf(b()));
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public det e() {
/* 53 */     return this.e;
/*    */   }
/*    */   
/*    */   public void a(det ☃) {
/* 57 */     if (this.e != null) {
/* 58 */       this.e.close();
/*    */     }
/* 60 */     this.e = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() {
/* 65 */     if (this.e != null) {
/* 66 */       this.e.close();
/* 67 */       c();
/* 68 */       this.e = null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */