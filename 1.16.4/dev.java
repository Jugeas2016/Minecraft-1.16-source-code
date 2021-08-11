/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*    */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*    */ import javax.annotation.Nullable;
/*    */ import org.lwjgl.PointerBuffer;
/*    */ import org.lwjgl.glfw.GLFW;
/*    */ import org.lwjgl.glfw.GLFWMonitorCallback;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dev
/*    */ {
/* 14 */   private final Long2ObjectMap<der> a = (Long2ObjectMap<der>)new Long2ObjectOpenHashMap();
/*    */   private final des b;
/*    */   
/*    */   public dev(des ☃) {
/* 18 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 19 */     this.b = ☃;
/* 20 */     GLFW.glfwSetMonitorCallback(this::a);
/* 21 */     PointerBuffer pointerBuffer = GLFW.glfwGetMonitors();
/* 22 */     if (pointerBuffer != null) {
/* 23 */       for (int i = 0; i < pointerBuffer.limit(); i++) {
/* 24 */         long l = pointerBuffer.get(i);
/* 25 */         this.a.put(l, ☃.createMonitor(l));
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   private void a(long ☃, int i) {
/* 31 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 32 */     if (i == 262145) {
/* 33 */       this.a.put(☃, this.b.createMonitor(☃));
/* 34 */     } else if (i == 262146) {
/* 35 */       this.a.remove(☃);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public der a(long ☃) {
/* 41 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 42 */     return (der)this.a.get(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public der a(dez ☃) {
/* 48 */     long l = GLFW.glfwGetWindowMonitor(☃.i());
/* 49 */     if (l != 0L) {
/* 50 */       return a(l);
/*    */     }
/*    */     
/* 53 */     int i = ☃.q();
/* 54 */     int j = i + ☃.m();
/* 55 */     int k = ☃.r();
/* 56 */     int m = k + ☃.n();
/*    */     
/* 58 */     int n = -1;
/* 59 */     der der = null;
/* 60 */     for (ObjectIterator<der> objectIterator = this.a.values().iterator(); objectIterator.hasNext(); ) { der der1 = objectIterator.next();
/* 61 */       int i1 = der1.c();
/* 62 */       int i2 = i1 + der1.b().a();
/* 63 */       int i3 = der1.d();
/* 64 */       int i4 = i3 + der1.b().b();
/*    */       
/* 66 */       int i5 = a(i, i1, i2);
/* 67 */       int i6 = a(j, i1, i2);
/* 68 */       int i7 = a(k, i3, i4);
/* 69 */       int i8 = a(m, i3, i4);
/*    */       
/* 71 */       int i9 = Math.max(0, i6 - i5);
/* 72 */       int i10 = Math.max(0, i8 - i7);
/* 73 */       int i11 = i9 * i10;
/* 74 */       if (i11 > n) {
/* 75 */         der = der1;
/* 76 */         n = i11;
/*    */       }  }
/*    */     
/* 79 */     return der;
/*    */   }
/*    */   
/*    */   public static int a(int ☃, int i, int j) {
/* 83 */     if (☃ < i) {
/* 84 */       return i;
/*    */     }
/* 86 */     if (☃ > j) {
/* 87 */       return j;
/*    */     }
/* 89 */     return ☃;
/*    */   }
/*    */   
/*    */   public void a() {
/* 93 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 94 */     GLFWMonitorCallback ☃ = GLFW.glfwSetMonitorCallback(null);
/* 95 */     if (☃ != null)
/* 96 */       ☃.free(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */