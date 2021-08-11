/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.io.IOException;
/*    */ import java.util.concurrent.Executor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ejq
/*    */   implements AutoCloseable
/*    */ {
/* 15 */   protected int a = -1;
/*    */   protected boolean b;
/*    */   
/*    */   public void a(boolean ☃, boolean bool1) {
/*    */     int i, j;
/* 20 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 21 */     this.b = ☃;
/* 22 */     this.c = bool1;
/*    */ 
/*    */ 
/*    */     
/* 26 */     if (☃) {
/* 27 */       i = bool1 ? 9987 : 9729;
/* 28 */       j = 9729;
/*    */     } else {
/* 30 */       i = bool1 ? 9986 : 9728;
/* 31 */       j = 9728;
/*    */     } 
/* 33 */     dem.b(3553, 10241, i);
/* 34 */     dem.b(3553, 10240, j);
/*    */   }
/*    */   protected boolean c;
/*    */   public int b() {
/* 38 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 39 */     if (this.a == -1) {
/* 40 */       this.a = dex.a();
/*    */     }
/*    */     
/* 43 */     return this.a;
/*    */   }
/*    */   
/*    */   public void c() {
/* 47 */     if (!RenderSystem.isOnRenderThread()) {
/* 48 */       RenderSystem.recordRenderCall(() -> {
/*    */             if (this.a != -1) {
/*    */               dex.a(this.a);
/*    */               
/*    */               this.a = -1;
/*    */             } 
/*    */           });
/* 55 */     } else if (this.a != -1) {
/* 56 */       dex.a(this.a);
/* 57 */       this.a = -1;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void d() {
/* 65 */     if (!RenderSystem.isOnRenderThreadOrInit()) {
/* 66 */       RenderSystem.recordRenderCall(() -> dem.s(b()));
/*    */     }
/*    */     else {
/*    */       
/* 70 */       dem.s(b());
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(ekd ☃, ach ach1, vk vk1, Executor executor) {
/* 75 */     ☃.a(vk1, this);
/*    */   }
/*    */   
/*    */   public void close() {}
/*    */   
/*    */   public abstract void a(ach paramach) throws IOException;
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */