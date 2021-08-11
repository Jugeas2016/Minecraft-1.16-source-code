/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.io.IOException;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dff
/*    */ {
/* 12 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   public static void a(int ☃) {
/* 15 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 16 */     dem.g(☃);
/*    */   }
/*    */   
/*    */   public static void a(dfd ☃) {
/* 20 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 21 */     ☃.d().a();
/* 22 */     ☃.c().a();
/*    */     
/* 24 */     dem.h(☃.a());
/*    */   }
/*    */   
/*    */   public static int a() throws IOException {
/* 28 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 29 */     int ☃ = dem.p();
/*    */     
/* 31 */     if (☃ <= 0) {
/* 32 */       throw new IOException("Could not create shader program (returned program ID " + ☃ + ")");
/*    */     }
/*    */     
/* 35 */     return ☃;
/*    */   }
/*    */   
/*    */   public static void b(dfd ☃) throws IOException {
/* 39 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 40 */     ☃.d().a(☃);
/* 41 */     ☃.c().a(☃);
/*    */     
/* 43 */     dem.i(☃.a());
/* 44 */     int i = dem.c(☃.a(), 35714);
/* 45 */     if (i == 0) {
/* 46 */       a.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", ☃.c().b(), ☃.d().b());
/* 47 */       a.warn(dem.j(☃.a(), 32768));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */