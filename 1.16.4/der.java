/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import org.lwjgl.glfw.GLFW;
/*    */ import org.lwjgl.glfw.GLFWVidMode;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class der
/*    */ {
/*    */   private final long a;
/*    */   private final List<dey> b;
/*    */   private dey c;
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   public der(long ☃) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = Lists.newArrayList();
/* 21 */     a();
/*    */   }
/*    */   
/*    */   public void a() {
/* 25 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 26 */     this.b.clear();
/* 27 */     GLFWVidMode.Buffer ☃ = GLFW.glfwGetVideoModes(this.a);
/* 28 */     for (int i = ☃.limit() - 1; i >= 0; i--) {
/* 29 */       ☃.position(i);
/* 30 */       dey dey1 = new dey(☃);
/* 31 */       if (dey1.c() >= 8 && dey1.d() >= 8 && dey1.e() >= 8) {
/* 32 */         this.b.add(dey1);
/*    */       }
/*    */     } 
/* 35 */     int[] arrayOfInt1 = new int[1];
/* 36 */     int[] arrayOfInt2 = new int[1];
/* 37 */     GLFW.glfwGetMonitorPos(this.a, arrayOfInt1, arrayOfInt2);
/* 38 */     this.d = arrayOfInt1[0];
/* 39 */     this.e = arrayOfInt2[0];
/* 40 */     GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode(this.a);
/* 41 */     this.c = new dey(gLFWVidMode);
/*    */   }
/*    */   
/*    */   public dey a(Optional<dey> ☃) {
/* 45 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 46 */     if (☃.isPresent()) {
/* 47 */       dey dey1 = ☃.get();
/*    */       
/* 49 */       for (dey dey2 : this.b) {
/* 50 */         if (dey2.equals(dey1)) {
/* 51 */           return dey2;
/*    */         }
/*    */       } 
/*    */     } 
/* 55 */     return b();
/*    */   }
/*    */   
/*    */   public int a(dey ☃) {
/* 59 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 60 */     return this.b.indexOf(☃);
/*    */   }
/*    */   
/*    */   public dey b() {
/* 64 */     return this.c;
/*    */   }
/*    */   
/*    */   public int c() {
/* 68 */     return this.d;
/*    */   }
/*    */   
/*    */   public int d() {
/* 72 */     return this.e;
/*    */   }
/*    */   
/*    */   public dey a(int ☃) {
/* 76 */     return this.b.get(☃);
/*    */   }
/*    */   
/*    */   public int e() {
/* 80 */     return this.b.size();
/*    */   }
/*    */   
/*    */   public long f() {
/* 84 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 89 */     return String.format("Monitor[%s %sx%s %s]", new Object[] { Long.valueOf(this.a), Integer.valueOf(this.d), Integer.valueOf(this.e), this.c });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\der.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */