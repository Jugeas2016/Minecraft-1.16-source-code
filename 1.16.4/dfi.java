/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.nio.ByteBuffer;
/*    */ import org.lwjgl.system.MemoryUtil;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dfi
/*    */ {
/*    */   public static void a(dfh ☃) {
/* 15 */     if (!RenderSystem.isOnRenderThread()) {
/* 16 */       RenderSystem.recordRenderCall(() -> {
/*    */             Pair<dfh.a, ByteBuffer> pair = ☃.f();
/*    */             dfh.a a = (dfh.a)pair.getFirst();
/*    */             a((ByteBuffer)pair.getSecond(), a.c(), a.a(), a.b());
/*    */           });
/*    */     } else {
/* 22 */       Pair<dfh.a, ByteBuffer> pair = ☃.f();
/* 23 */       dfh.a a = (dfh.a)pair.getFirst();
/* 24 */       a((ByteBuffer)pair.getSecond(), a.c(), a.a(), a.b());
/*    */     } 
/*    */   }
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
/*    */   private static void a(ByteBuffer ☃, int i, dfr dfr1, int j) {
/* 39 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 40 */     ☃.clear();
/* 41 */     if (j <= 0) {
/*    */       return;
/*    */     }
/*    */     
/* 45 */     dfr1.a(MemoryUtil.memAddress(☃));
/* 46 */     dem.f(i, 0, j);
/* 47 */     dfr1.d();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */