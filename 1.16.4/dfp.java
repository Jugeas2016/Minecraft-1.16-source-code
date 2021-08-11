/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dfp
/*    */   implements AutoCloseable
/*    */ {
/*    */   private int a;
/*    */   private final dfr b;
/*    */   private int c;
/*    */   
/*    */   public dfp(dfr ☃) {
/* 17 */     this.b = ☃;
/* 18 */     RenderSystem.glGenBuffers(☃ -> this.a = ☃.intValue());
/*    */   }
/*    */   
/*    */   public void a() {
/* 22 */     RenderSystem.glBindBuffer(34962, () -> Integer.valueOf(this.a));
/*    */   }
/*    */   
/*    */   public void a(dfh ☃) {
/* 26 */     if (!RenderSystem.isOnRenderThread()) {
/* 27 */       RenderSystem.recordRenderCall(() -> c(☃));
/*    */     }
/*    */     else {
/*    */       
/* 31 */       c(☃);
/*    */     } 
/*    */   }
/*    */   
/*    */   public CompletableFuture<Void> b(dfh ☃) {
/* 36 */     if (!RenderSystem.isOnRenderThread()) {
/* 37 */       return CompletableFuture.runAsync(() -> c(☃), ☃ -> RenderSystem.recordRenderCall(☃::run));
/*    */     }
/* 39 */     c(☃);
/* 40 */     return CompletableFuture.completedFuture(null);
/*    */   }
/*    */ 
/*    */   
/*    */   private void c(dfh ☃) {
/* 45 */     Pair<dfh.a, ByteBuffer> pair = ☃.f();
/* 46 */     if (this.a == -1) {
/*    */       return;
/*    */     }
/* 49 */     ByteBuffer byteBuffer = (ByteBuffer)pair.getSecond();
/* 50 */     this.c = byteBuffer.remaining() / this.b.b();
/* 51 */     a();
/* 52 */     RenderSystem.glBufferData(34962, byteBuffer, 35044);
/* 53 */     b();
/*    */   }
/*    */   
/*    */   public void a(b ☃, int i) {
/* 57 */     RenderSystem.pushMatrix();
/* 58 */     RenderSystem.loadIdentity();
/* 59 */     RenderSystem.multMatrix(☃);
/* 60 */     RenderSystem.drawArrays(i, 0, this.c);
/* 61 */     RenderSystem.popMatrix();
/*    */   }
/*    */   
/*    */   public static void b() {
/* 65 */     RenderSystem.glBindBuffer(34962, () -> Integer.valueOf(0));
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() {
/* 70 */     if (this.a >= 0) {
/* 71 */       RenderSystem.glDeleteBuffers(this.a);
/* 72 */       this.a = -1;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */