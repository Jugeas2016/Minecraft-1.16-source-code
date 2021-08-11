/*      */ package com.mojang.blaze3d.systems;
/*      */ 
/*      */ import b;
/*      */ import com.google.common.collect.Queues;
/*      */ import com.mojang.blaze3d.platform.GLX;
/*      */ import dee;
/*      */ import dem;
/*      */ import dfo;
/*      */ import djt;
/*      */ import djz;
/*      */ import dkd;
/*      */ import g;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.nio.IntBuffer;
/*      */ import java.util.concurrent.ConcurrentLinkedQueue;
/*      */ import java.util.function.Consumer;
/*      */ import java.util.function.IntSupplier;
/*      */ import java.util.function.LongSupplier;
/*      */ import java.util.function.Supplier;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import org.lwjgl.glfw.GLFW;
/*      */ import org.lwjgl.glfw.GLFWErrorCallbackI;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class RenderSystem
/*      */ {
/*   32 */   private static final Logger LOGGER = LogManager.getLogger();
/*   33 */   private static final ConcurrentLinkedQueue<dee> recordingQueue = Queues.newConcurrentLinkedQueue();
/*   34 */   private static final dfo RENDER_THREAD_TESSELATOR = new dfo();
/*      */   
/*      */   public static final float DEFAULTALPHACUTOFF = 0.1F;
/*      */   private static final int MINIMUM_ATLAS_TEXTURE_SIZE = 1024;
/*      */   private static boolean isReplayingQueue;
/*      */   private static Thread gameThread;
/*      */   private static Thread renderThread;
/*   41 */   private static int MAX_SUPPORTED_TEXTURE_SIZE = -1;
/*      */   
/*      */   private static boolean isInInit;
/*   44 */   private static double lastDrawTime = Double.MIN_VALUE;
/*      */   
/*      */   public static void initRenderThread() {
/*   47 */     if (renderThread != null || gameThread == Thread.currentThread()) {
/*   48 */       throw new IllegalStateException("Could not initialize render thread");
/*      */     }
/*   50 */     renderThread = Thread.currentThread();
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isOnRenderThread() {
/*   55 */     return (Thread.currentThread() == renderThread);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isOnRenderThreadOrInit() {
/*   61 */     return (isInInit || isOnRenderThread());
/*      */   }
/*      */   
/*      */   public static void initGameThread(boolean ☃) {
/*   65 */     boolean bool = (renderThread == Thread.currentThread());
/*   66 */     if (gameThread != null || renderThread == null || bool == ☃) {
/*   67 */       throw new IllegalStateException("Could not initialize tick thread");
/*      */     }
/*   69 */     gameThread = Thread.currentThread();
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isOnGameThread() {
/*   74 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isOnGameThreadOrInit() {
/*   80 */     return (isInInit || isOnGameThread());
/*      */   }
/*      */   
/*      */   public static void assertThread(Supplier<Boolean> ☃) {
/*   84 */     if (!((Boolean)☃.get()).booleanValue()) {
/*   85 */       throw new IllegalStateException("Rendersystem called from wrong thread");
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isInInitPhase() {
/*   91 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void recordRenderCall(dee ☃) {
/*   97 */     recordingQueue.add(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void flipFrame(long ☃) {
/*  102 */     GLFW.glfwPollEvents();
/*  103 */     replayQueue();
/*      */ 
/*      */     
/*  106 */     dfo.a().c().g();
/*      */     
/*  108 */     GLFW.glfwSwapBuffers(☃);
/*  109 */     GLFW.glfwPollEvents();
/*      */   }
/*      */   
/*      */   public static void replayQueue() {
/*  113 */     isReplayingQueue = true;
/*  114 */     while (!recordingQueue.isEmpty()) {
/*  115 */       dee ☃ = recordingQueue.poll();
/*  116 */       ☃.execute();
/*      */     } 
/*  118 */     isReplayingQueue = false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void limitDisplayFPS(int ☃) {
/*  124 */     double d1 = lastDrawTime + 1.0D / ☃;
/*  125 */     double d2 = GLFW.glfwGetTime();
/*  126 */     while (d2 < d1) {
/*  127 */       GLFW.glfwWaitEventsTimeout(d1 - d2);
/*  128 */       d2 = GLFW.glfwGetTime();
/*      */     } 
/*  130 */     lastDrawTime = d2;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void pushLightingAttributes() {
/*  136 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  140 */     dem.a();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void pushTextureAttributes() {
/*  147 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  151 */     dem.b();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void popAttributes() {
/*  157 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  161 */     dem.c();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void disableAlphaTest() {
/*  168 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  172 */     dem.d();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void enableAlphaTest() {
/*  178 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  182 */     dem.e();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void alphaFunc(int ☃, float f) {
/*  188 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  194 */     dem.a(☃, f);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void enableLighting() {
/*  201 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  205 */     dem.f();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void disableLighting() {
/*  211 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  215 */     dem.g();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void enableColorMaterial() {
/*  222 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  226 */     dem.h();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void disableColorMaterial() {
/*  232 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  236 */     dem.i();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void colorMaterial(int ☃, int i) {
/*  242 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  248 */     dem.a(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void normal3f(float ☃, float f1, float f2) {
/*  254 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  260 */     dem.a(☃, f1, f2);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void disableDepthTest() {
/*  266 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  270 */     dem.l();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void enableDepthTest() {
/*  275 */     assertThread(RenderSystem::isOnGameThreadOrInit);
/*      */ 
/*      */ 
/*      */     
/*  279 */     dem.m();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void enableScissor(int ☃, int i, int j, int k) {
/*  284 */     assertThread(RenderSystem::isOnGameThreadOrInit);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  291 */     dem.k();
/*  292 */     dem.a(☃, i, j, k);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void disableScissor() {
/*  297 */     assertThread(RenderSystem::isOnGameThreadOrInit);
/*      */ 
/*      */ 
/*      */     
/*  301 */     dem.j();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void depthFunc(int ☃) {
/*  306 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  312 */     dem.b(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void depthMask(boolean ☃) {
/*  317 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  323 */     dem.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void enableBlend() {
/*  328 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  332 */     dem.o();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void disableBlend() {
/*  338 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  342 */     dem.n();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void blendFunc(dem.r ☃, dem.j j1) {
/*  347 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  353 */     dem.b(☃.p, j1.o);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void blendFunc(int ☃, int i) {
/*  358 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  364 */     dem.b(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void blendFuncSeparate(dem.r ☃, dem.j j1, dem.r r1, dem.j j2) {
/*  369 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  375 */     dem.b(☃.p, j1.o, r1.p, j2.o);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void blendFuncSeparate(int ☃, int i, int j, int k) {
/*  380 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  386 */     dem.b(☃, i, j, k);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void blendEquation(int ☃) {
/*  391 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  397 */     dem.c(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void blendColor(float ☃, float f1, float f2, float f3) {
/*  402 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  408 */     dem.a(☃, f1, f2, f3);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void enableFog() {
/*  414 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  418 */     dem.A();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void disableFog() {
/*  424 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  428 */     dem.B();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void fogMode(dem.m ☃) {
/*  434 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  440 */     dem.o(☃.d);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void fogMode(int ☃) {
/*  446 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  452 */     dem.o(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void fogDensity(float ☃) {
/*  458 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  464 */     dem.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void fogStart(float ☃) {
/*  470 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  476 */     dem.b(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void fogEnd(float ☃) {
/*  482 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  488 */     dem.c(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void fog(int ☃, float f1, float f2, float f3, float f4) {
/*  494 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  500 */     dem.a(☃, new float[] { f1, f2, f3, f4 });
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void fogi(int ☃, int i) {
/*  506 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  512 */     dem.l(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void enableCull() {
/*  517 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  521 */     dem.C();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void disableCull() {
/*  526 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  530 */     dem.D();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void polygonMode(int ☃, int i) {
/*  536 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  542 */     dem.m(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void enablePolygonOffset() {
/*  547 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  551 */     dem.E();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void disablePolygonOffset() {
/*  556 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  560 */     dem.F();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void enableLineOffset() {
/*  565 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  569 */     dem.G();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void disableLineOffset() {
/*  574 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  578 */     dem.H();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void polygonOffset(float ☃, float f1) {
/*  583 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  589 */     dem.a(☃, f1);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void enableColorLogicOp() {
/*  594 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  598 */     dem.I();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void disableColorLogicOp() {
/*  603 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  607 */     dem.J();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void logicOp(dem.o ☃) {
/*  612 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  618 */     dem.p(☃.q);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void activeTexture(int ☃) {
/*  624 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  630 */     dem.q(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void enableTexture() {
/*  635 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  639 */     dem.K();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void disableTexture() {
/*  644 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  648 */     dem.L();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void texParameter(int ☃, int i, int j) {
/*  659 */     dem.b(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void deleteTexture(int ☃) {
/*  664 */     assertThread(RenderSystem::isOnGameThreadOrInit);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  670 */     dem.r(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void bindTexture(int ☃) {
/*  681 */     dem.s(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void shadeModel(int ☃) {
/*  687 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  693 */     dem.t(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void enableRescaleNormal() {
/*  699 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  703 */     dem.N();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void disableRescaleNormal() {
/*  709 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  713 */     dem.O();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void viewport(int ☃, int i, int j, int k) {
/*  718 */     assertThread(RenderSystem::isOnGameThreadOrInit);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  724 */     dem.d(☃, i, j, k);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void colorMask(boolean ☃, boolean bool1, boolean bool2, boolean bool3) {
/*  730 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  736 */     dem.a(☃, bool1, bool2, bool3);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void stencilFunc(int ☃, int i, int j) {
/*  742 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  748 */     dem.d(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void stencilMask(int ☃) {
/*  753 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  759 */     dem.u(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void stencilOp(int ☃, int i, int j) {
/*  764 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  770 */     dem.e(☃, i, j);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void clearDepth(double ☃) {
/*  776 */     assertThread(RenderSystem::isOnGameThreadOrInit);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  782 */     dem.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void clearColor(float ☃, float f1, float f2, float f3) {
/*  787 */     assertThread(RenderSystem::isOnGameThreadOrInit);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  793 */     dem.b(☃, f1, f2, f3);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void clearStencil(int ☃) {
/*  798 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  804 */     dem.v(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void clear(int ☃, boolean bool) {
/*  809 */     assertThread(RenderSystem::isOnGameThreadOrInit);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  815 */     dem.a(☃, bool);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void matrixMode(int ☃) {
/*  822 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  828 */     dem.w(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void loadIdentity() {
/*  834 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  838 */     dem.P();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void pushMatrix() {
/*  844 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  848 */     dem.Q();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void popMatrix() {
/*  854 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  858 */     dem.R();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void ortho(double ☃, double d1, double d2, double d3, double d4, double d5) {
/*  864 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  870 */     dem.a(☃, d1, d2, d3, d4, d5);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void rotatef(float ☃, float f1, float f2, float f3) {
/*  876 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  882 */     dem.c(☃, f1, f2, f3);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void scalef(float ☃, float f1, float f2) {
/*  888 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  894 */     dem.b(☃, f1, f2);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void scaled(double ☃, double d1, double d2) {
/*  900 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  906 */     dem.a(☃, d1, d2);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void translatef(float ☃, float f1, float f2) {
/*  912 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  918 */     dem.c(☃, f1, f2);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void translated(double ☃, double d1, double d2) {
/*  924 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  930 */     dem.b(☃, d1, d2);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void multMatrix(b ☃) {
/*  936 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  943 */     dem.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void color4f(float ☃, float f1, float f2, float f3) {
/*  949 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  955 */     dem.d(☃, f1, f2, f3);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void color3f(float ☃, float f1, float f2) {
/*  961 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  967 */     dem.d(☃, f1, f2, 1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void clearCurrentColor() {
/*  973 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/*  977 */     dem.S();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void drawArrays(int ☃, int i, int j) {
/*  982 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  988 */     dem.f(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void lineWidth(float ☃) {
/*  993 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  999 */     dem.d(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void pixelStore(int ☃, int i) {
/* 1004 */     assertThread(RenderSystem::isOnGameThreadOrInit);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1010 */     dem.n(☃, i);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void pixelTransfer(int ☃, float f) {
/* 1021 */     dem.b(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void readPixels(int ☃, int i, int j, int k, int m, int n, ByteBuffer byteBuffer) {
/* 1026 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1032 */     dem.a(☃, i, j, k, m, n, byteBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void getString(int ☃, Consumer<String> consumer) {
/* 1037 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1044 */     consumer.accept(dem.B(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public static String getBackendDescription() {
/* 1049 */     assertThread(RenderSystem::isInInitPhase);
/* 1050 */     return String.format("LWJGL version %s", new Object[] { GLX._getLWJGLVersion() });
/*      */   }
/*      */   
/*      */   public static String getApiDescription() {
/* 1054 */     assertThread(RenderSystem::isInInitPhase);
/* 1055 */     return GLX.getOpenGLVersionString();
/*      */   }
/*      */   
/*      */   public static LongSupplier initBackendSystem() {
/* 1059 */     assertThread(RenderSystem::isInInitPhase);
/* 1060 */     return GLX._initGlfw();
/*      */   }
/*      */   
/*      */   public static void initRenderer(int ☃, boolean bool) {
/* 1064 */     assertThread(RenderSystem::isInInitPhase);
/* 1065 */     GLX._init(☃, bool);
/*      */   }
/*      */   
/*      */   public static void setErrorCallback(GLFWErrorCallbackI ☃) {
/* 1069 */     assertThread(RenderSystem::isInInitPhase);
/* 1070 */     GLX._setGlfwErrorCallback(☃);
/*      */   }
/*      */   
/*      */   public static void renderCrosshair(int ☃) {
/* 1074 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1080 */     GLX._renderCrosshair(☃, true, true, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setupNvFogDistance() {
/* 1085 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1089 */     GLX._setupNvFogDistance();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void glMultiTexCoord2f(int ☃, float f1, float f2) {
/* 1095 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1101 */     dem.a(☃, f1, f2);
/*      */   }
/*      */ 
/*      */   
/*      */   public static String getCapsString() {
/* 1106 */     assertThread(RenderSystem::isOnGameThread);
/* 1107 */     return GLX._getCapsString();
/*      */   }
/*      */   
/*      */   public static void setupDefaultState(int ☃, int i, int j, int k) {
/* 1111 */     assertThread(RenderSystem::isInInitPhase);
/* 1112 */     dem.K();
/* 1113 */     dem.t(7425);
/* 1114 */     dem.a(1.0D);
/* 1115 */     dem.m();
/* 1116 */     dem.b(515);
/* 1117 */     dem.e();
/* 1118 */     dem.a(516, 0.1F);
/*      */     
/* 1120 */     dem.w(5889);
/* 1121 */     dem.P();
/* 1122 */     dem.w(5888);
/*      */     
/* 1124 */     dem.d(☃, i, j, k);
/*      */   }
/*      */   
/*      */   public static int maxSupportedTextureSize() {
/* 1128 */     assertThread(RenderSystem::isInInitPhase);
/* 1129 */     if (MAX_SUPPORTED_TEXTURE_SIZE == -1) {
/* 1130 */       int ☃ = dem.C(3379);
/* 1131 */       for (int i = Math.max(32768, ☃); i >= 1024; i >>= 1) {
/* 1132 */         dem.a(32868, 0, 6408, i, i, 0, 6408, 5121, null);
/* 1133 */         int j = dem.c(32868, 0, 4096);
/* 1134 */         if (j != 0) {
/* 1135 */           MAX_SUPPORTED_TEXTURE_SIZE = i;
/* 1136 */           return i;
/*      */         } 
/*      */       } 
/* 1139 */       MAX_SUPPORTED_TEXTURE_SIZE = Math.max(☃, 1024);
/* 1140 */       LOGGER.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", Integer.valueOf(MAX_SUPPORTED_TEXTURE_SIZE));
/*      */     } 
/*      */ 
/*      */     
/* 1144 */     return MAX_SUPPORTED_TEXTURE_SIZE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void glBindBuffer(int ☃, Supplier<Integer> supplier) {
/* 1154 */     dem.g(☃, ((Integer)supplier.get()).intValue());
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glBufferData(int ☃, ByteBuffer byteBuffer, int i) {
/* 1159 */     assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1160 */     dem.a(☃, byteBuffer, i);
/*      */   }
/*      */   
/*      */   public static void glDeleteBuffers(int ☃) {
/* 1164 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1170 */     dem.j(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniform1i(int ☃, int i) {
/* 1175 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1181 */     dem.f(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniform1(int ☃, IntBuffer intBuffer) {
/* 1186 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1192 */     dem.a(☃, intBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniform2(int ☃, IntBuffer intBuffer) {
/* 1197 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1203 */     dem.b(☃, intBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniform3(int ☃, IntBuffer intBuffer) {
/* 1208 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1214 */     dem.c(☃, intBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniform4(int ☃, IntBuffer intBuffer) {
/* 1219 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1225 */     dem.d(☃, intBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniform1(int ☃, FloatBuffer floatBuffer) {
/* 1230 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1236 */     dem.b(☃, floatBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniform2(int ☃, FloatBuffer floatBuffer) {
/* 1241 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1247 */     dem.c(☃, floatBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniform3(int ☃, FloatBuffer floatBuffer) {
/* 1252 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1258 */     dem.d(☃, floatBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniform4(int ☃, FloatBuffer floatBuffer) {
/* 1263 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1269 */     dem.e(☃, floatBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniformMatrix2(int ☃, boolean bool, FloatBuffer floatBuffer) {
/* 1274 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1280 */     dem.a(☃, bool, floatBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniformMatrix3(int ☃, boolean bool, FloatBuffer floatBuffer) {
/* 1285 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1291 */     dem.b(☃, bool, floatBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glUniformMatrix4(int ☃, boolean bool, FloatBuffer floatBuffer) {
/* 1296 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1302 */     dem.c(☃, bool, floatBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setupOutline() {
/* 1307 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1311 */     dem.u();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void teardownOutline() {
/* 1316 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1320 */     dem.v();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setupOverlayColor(IntSupplier ☃, int i) {
/* 1325 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1331 */     dem.k(☃.getAsInt(), i);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void teardownOverlayColor() {
/* 1336 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1340 */     dem.w();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setupLevelDiffuseLighting(g ☃, g g1, b b1) {
/* 1345 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1349 */     dem.a(☃, g1, b1);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setupGuiFlatDiffuseLighting(g ☃, g g1) {
/* 1354 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1358 */     dem.a(☃, g1);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setupGui3DDiffuseLighting(g ☃, g g1) {
/* 1363 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1367 */     dem.b(☃, g1);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void mulTextureByProjModelView() {
/* 1372 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1376 */     dem.z();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setupEndPortalTexGen() {
/* 1381 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1385 */     dem.x();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void clearTexGen() {
/* 1390 */     assertThread(RenderSystem::isOnGameThread);
/*      */ 
/*      */ 
/*      */     
/* 1394 */     dem.y();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void beginInitialization() {
/* 1399 */     isInInit = true;
/*      */   }
/*      */   
/*      */   public static void finishInitialization() {
/* 1403 */     isInInit = false;
/* 1404 */     if (!recordingQueue.isEmpty()) {
/* 1405 */       replayQueue();
/*      */     }
/* 1407 */     if (!recordingQueue.isEmpty()) {
/* 1408 */       throw new IllegalStateException("Recorded to render queue during initialization");
/*      */     }
/*      */   }
/*      */   
/*      */   public static void glGenBuffers(Consumer<Integer> ☃) {
/* 1413 */     if (!isOnRenderThread()) {
/* 1414 */       recordRenderCall(() -> ☃.accept(Integer.valueOf(dem.q())));
/*      */     }
/*      */     else {
/*      */       
/* 1418 */       ☃.accept(Integer.valueOf(dem.q()));
/*      */     } 
/*      */   }
/*      */   
/*      */   public static dfo renderThreadTesselator() {
/* 1423 */     assertThread(RenderSystem::isOnRenderThread);
/* 1424 */     return RENDER_THREAD_TESSELATOR;
/*      */   }
/*      */   
/*      */   public static void defaultBlendFunc() {
/* 1428 */     blendFuncSeparate(dem.r.l, dem.j.j, dem.r.e, dem.j.n);
/*      */   }
/*      */   
/*      */   public static void defaultAlphaFunc() {
/* 1432 */     alphaFunc(516, 0.1F);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void runAsFancy(Runnable ☃) {
/* 1437 */     boolean bool = djz.A();
/* 1438 */     if (!bool) {
/* 1439 */       ☃.run();
/*      */       
/*      */       return;
/*      */     } 
/* 1443 */     dkd dkd = (djz.C()).k;
/* 1444 */     djt djt = dkd.f;
/*      */     
/* 1446 */     dkd.f = djt.b;
/* 1447 */     ☃.run();
/* 1448 */     dkd.f = djt;
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\com\mojang\blaze3d\systems\RenderSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */