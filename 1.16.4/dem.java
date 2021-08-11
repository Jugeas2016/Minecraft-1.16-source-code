/*      */ import com.mojang.blaze3d.platform.GLX;
/*      */ import com.mojang.blaze3d.systems.RenderSystem;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.nio.IntBuffer;
/*      */ import java.util.stream.IntStream;
/*      */ import javax.annotation.Nullable;
/*      */ import org.lwjgl.opengl.ARBFramebufferObject;
/*      */ import org.lwjgl.opengl.EXTFramebufferBlit;
/*      */ import org.lwjgl.opengl.EXTFramebufferObject;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.GL13;
/*      */ import org.lwjgl.opengl.GL14;
/*      */ import org.lwjgl.opengl.GL15;
/*      */ import org.lwjgl.opengl.GL20;
/*      */ import org.lwjgl.opengl.GL30;
/*      */ import org.lwjgl.opengl.GLCapabilities;
/*      */ import org.lwjgl.system.MemoryUtil;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class dem
/*      */ {
/*      */   private static final FloatBuffer a;
/*      */   
/*      */   static {
/*   36 */     a = (FloatBuffer)GLX.make(MemoryUtil.memAllocFloat(16), ☃ -> dei.a(MemoryUtil.memAddress(☃)));
/*      */   }
/*   38 */   private static final a b = new a();
/*      */   private static final c[] d;
/*   40 */   private static final c c = new c(2896); static {
/*   41 */     d = (c[])IntStream.range(0, 8).mapToObj(☃ -> new c(16384 + ☃)).toArray(☃ -> new c[☃]);
/*      */   }
/*   43 */   private static final g e = new g();
/*      */   
/*   45 */   private static final b f = new b();
/*   46 */   private static final i g = new i();
/*   47 */   private static final n h = new n();
/*   48 */   private static final h i = new h();
/*   49 */   private static final p j = new p();
/*   50 */   private static final e k = new e();
/*   51 */   private static final w l = new w();
/*   52 */   private static final t m = new t();
/*   53 */   private static final q n = new q();
/*      */   
/*   55 */   private static final FloatBuffer o = deq.b(4); private static int p; private static final x[] q;
/*      */   
/*      */   static {
/*   58 */     q = (x[])IntStream.range(0, 12).mapToObj(☃ -> new x()).toArray(☃ -> new x[☃]);
/*      */   }
/*   60 */   private static int r = 7425;
/*   61 */   private static final c s = new c(32826);
/*      */   
/*   63 */   private static final f t = new f();
/*      */   
/*   65 */   private static final d u = new d();
/*      */ 
/*      */   
/*      */   private static l v;
/*      */ 
/*      */   
/*      */   private static k w;
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void a() {
/*   76 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*   77 */     GL11.glPushAttrib(8256);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void b() {
/*   82 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*   83 */     GL11.glPushAttrib(270336);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void c() {
/*   88 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*   89 */     GL11.glPopAttrib();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void d() {
/*   94 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*   95 */     b.a.a();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void e() {
/*  100 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  101 */     b.a.b();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃, float f1) {
/*  106 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  107 */     if (☃ != b.b || f1 != b.c) {
/*  108 */       b.b = ☃;
/*  109 */       b.c = f1;
/*  110 */       GL11.glAlphaFunc(☃, f1);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void f() {
/*  116 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  117 */     c.b();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void g() {
/*  122 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  123 */     c.a();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃) {
/*  128 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  129 */     d[☃].b();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void h() {
/*  140 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  141 */     e.a.b();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void i() {
/*  146 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  147 */     e.a.a();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃, int j) {
/*  152 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  153 */     if (☃ != e.b || j != e.c) {
/*  154 */       e.b = ☃;
/*  155 */       e.c = j;
/*  156 */       GL11.glColorMaterial(☃, j);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃, int j, FloatBuffer floatBuffer) {
/*  162 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  163 */     GL11.glLightfv(☃, j, floatBuffer);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃, FloatBuffer floatBuffer) {
/*  168 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  169 */     GL11.glLightModelfv(☃, floatBuffer);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(float ☃, float f1, float f2) {
/*  174 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  175 */     GL11.glNormal3f(☃, f1, f2);
/*      */   }
/*      */   
/*      */   public static void j() {
/*  179 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  180 */     n.a.a();
/*      */   }
/*      */   
/*      */   public static void k() {
/*  184 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  185 */     n.a.b();
/*      */   }
/*      */   
/*      */   public static void a(int ☃, int j, int m, int i1) {
/*  189 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  190 */     GL20.glScissor(☃, j, m, i1);
/*      */   }
/*      */   
/*      */   public static void l() {
/*  194 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  195 */     g.a.a();
/*      */   }
/*      */   
/*      */   public static void m() {
/*  199 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  200 */     g.a.b();
/*      */   }
/*      */   
/*      */   public static void b(int ☃) {
/*  204 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  205 */     if (☃ != g.c) {
/*  206 */       g.c = ☃;
/*  207 */       GL11.glDepthFunc(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void a(boolean ☃) {
/*  212 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  213 */     if (☃ != g.b) {
/*  214 */       g.b = ☃;
/*  215 */       GL11.glDepthMask(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void n() {
/*  220 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  221 */     f.a.a();
/*      */   }
/*      */   
/*      */   public static void o() {
/*  225 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  226 */     f.a.b();
/*      */   }
/*      */   
/*      */   public static void b(int ☃, int j) {
/*  230 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  231 */     if (☃ != f.b || j != f.c) {
/*  232 */       f.b = ☃;
/*  233 */       f.c = j;
/*  234 */       GL11.glBlendFunc(☃, j);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void b(int ☃, int j, int m, int i1) {
/*  239 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  240 */     if (☃ != f.b || j != f.c || m != f.d || i1 != f.e) {
/*  241 */       f.b = ☃;
/*  242 */       f.c = j;
/*  243 */       f.d = m;
/*  244 */       f.e = i1;
/*  245 */       c(☃, j, m, i1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void a(float ☃, float f1, float f2, float f3) {
/*  250 */     GL14.glBlendColor(☃, f1, f2, f3);
/*      */   }
/*      */   
/*      */   public static void c(int ☃) {
/*  254 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  255 */     GL14.glBlendEquation(☃);
/*      */   }
/*      */   
/*      */   public static String a(GLCapabilities ☃) {
/*  259 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/*  260 */     if (☃.OpenGL30) {
/*  261 */       w = k.a;
/*  262 */     } else if (☃.GL_EXT_framebuffer_blit) {
/*  263 */       w = k.b;
/*      */     } else {
/*  265 */       w = k.c;
/*      */     } 
/*      */     
/*  268 */     if (☃.OpenGL30) {
/*  269 */       v = l.a;
/*  270 */       dek.a = 36160;
/*  271 */       dek.b = 36161;
/*  272 */       dek.c = 36064;
/*  273 */       dek.d = 36096;
/*  274 */       dek.e = 36053;
/*  275 */       dek.f = 36054;
/*  276 */       dek.g = 36055;
/*  277 */       dek.h = 36059;
/*  278 */       dek.i = 36060;
/*  279 */       return "OpenGL 3.0";
/*  280 */     }  if (☃.GL_ARB_framebuffer_object) {
/*  281 */       v = l.b;
/*  282 */       dek.a = 36160;
/*  283 */       dek.b = 36161;
/*  284 */       dek.c = 36064;
/*  285 */       dek.d = 36096;
/*  286 */       dek.e = 36053;
/*  287 */       dek.g = 36055;
/*  288 */       dek.f = 36054;
/*  289 */       dek.h = 36059;
/*  290 */       dek.i = 36060;
/*  291 */       return "ARB_framebuffer_object extension";
/*  292 */     }  if (☃.GL_EXT_framebuffer_object) {
/*  293 */       v = l.c;
/*  294 */       dek.a = 36160;
/*  295 */       dek.b = 36161;
/*  296 */       dek.c = 36064;
/*  297 */       dek.d = 36096;
/*  298 */       dek.e = 36053;
/*  299 */       dek.g = 36055;
/*  300 */       dek.f = 36054;
/*  301 */       dek.h = 36059;
/*  302 */       dek.i = 36060;
/*  303 */       return "EXT_framebuffer_object extension";
/*      */     } 
/*  305 */     throw new IllegalStateException("Could not initialize framebuffer support.");
/*      */   }
/*      */   
/*      */   public static int c(int ☃, int j) {
/*  309 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  310 */     return GL20.glGetProgrami(☃, j);
/*      */   }
/*      */   
/*      */   public static void d(int ☃, int j) {
/*  314 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  315 */     GL20.glAttachShader(☃, j);
/*      */   }
/*      */   
/*      */   public static void d(int ☃) {
/*  319 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  320 */     GL20.glDeleteShader(☃);
/*      */   }
/*      */   
/*      */   public static int e(int ☃) {
/*  324 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  325 */     return GL20.glCreateShader(☃);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, CharSequence charSequence) {
/*  329 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  330 */     GL20.glShaderSource(☃, charSequence);
/*      */   }
/*      */   
/*      */   public static void f(int ☃) {
/*  334 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  335 */     GL20.glCompileShader(☃);
/*      */   }
/*      */   
/*      */   public static int e(int ☃, int j) {
/*  339 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  340 */     return GL20.glGetShaderi(☃, j);
/*      */   }
/*      */   
/*      */   public static void g(int ☃) {
/*  344 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  345 */     GL20.glUseProgram(☃);
/*      */   }
/*      */   
/*      */   public static int p() {
/*  349 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  350 */     return GL20.glCreateProgram();
/*      */   }
/*      */   
/*      */   public static void h(int ☃) {
/*  354 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  355 */     GL20.glDeleteProgram(☃);
/*      */   }
/*      */   
/*      */   public static void i(int ☃) {
/*  359 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  360 */     GL20.glLinkProgram(☃);
/*      */   }
/*      */   
/*      */   public static int b(int ☃, CharSequence charSequence) {
/*  364 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  365 */     return GL20.glGetUniformLocation(☃, charSequence);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, IntBuffer intBuffer) {
/*  369 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  370 */     GL20.glUniform1iv(☃, intBuffer);
/*      */   }
/*      */   
/*      */   public static void f(int ☃, int j) {
/*  374 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  375 */     GL20.glUniform1i(☃, j);
/*      */   }
/*      */   
/*      */   public static void b(int ☃, FloatBuffer floatBuffer) {
/*  379 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  380 */     GL20.glUniform1fv(☃, floatBuffer);
/*      */   }
/*      */   
/*      */   public static void b(int ☃, IntBuffer intBuffer) {
/*  384 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  385 */     GL20.glUniform2iv(☃, intBuffer);
/*      */   }
/*      */   
/*      */   public static void c(int ☃, FloatBuffer floatBuffer) {
/*  389 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  390 */     GL20.glUniform2fv(☃, floatBuffer);
/*      */   }
/*      */   
/*      */   public static void c(int ☃, IntBuffer intBuffer) {
/*  394 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  395 */     GL20.glUniform3iv(☃, intBuffer);
/*      */   }
/*      */   
/*      */   public static void d(int ☃, FloatBuffer floatBuffer) {
/*  399 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  400 */     GL20.glUniform3fv(☃, floatBuffer);
/*      */   }
/*      */   
/*      */   public static void d(int ☃, IntBuffer intBuffer) {
/*  404 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  405 */     GL20.glUniform4iv(☃, intBuffer);
/*      */   }
/*      */   
/*      */   public static void e(int ☃, FloatBuffer floatBuffer) {
/*  409 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  410 */     GL20.glUniform4fv(☃, floatBuffer);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, boolean bool, FloatBuffer floatBuffer) {
/*  414 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  415 */     GL20.glUniformMatrix2fv(☃, bool, floatBuffer);
/*      */   }
/*      */   
/*      */   public static void b(int ☃, boolean bool, FloatBuffer floatBuffer) {
/*  419 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  420 */     GL20.glUniformMatrix3fv(☃, bool, floatBuffer);
/*      */   }
/*      */   
/*      */   public static void c(int ☃, boolean bool, FloatBuffer floatBuffer) {
/*  424 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  425 */     GL20.glUniformMatrix4fv(☃, bool, floatBuffer);
/*      */   }
/*      */   
/*      */   public static int c(int ☃, CharSequence charSequence) {
/*  429 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  430 */     return GL20.glGetAttribLocation(☃, charSequence);
/*      */   }
/*      */   
/*      */   public static int q() {
/*  434 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  435 */     return GL15.glGenBuffers();
/*      */   }
/*      */   
/*      */   public static void g(int ☃, int j) {
/*  439 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  440 */     GL15.glBindBuffer(☃, j);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, ByteBuffer byteBuffer, int j) {
/*  444 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  445 */     GL15.glBufferData(☃, byteBuffer, j);
/*      */   }
/*      */   
/*      */   public static void j(int ☃) {
/*  449 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  450 */     GL15.glDeleteBuffers(☃);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, int j, int m, int i1, int i2, int i3, int i4, int i5) {
/*  454 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  455 */     GL20.glCopyTexSubImage2D(☃, j, m, i1, i2, i3, i4, i5);
/*      */   }
/*      */   
/*      */   public static void h(int ☃, int j) {
/*  459 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  460 */     switch (null.a[v.ordinal()]) {
/*      */       case 1:
/*  462 */         GL30.glBindFramebuffer(☃, j);
/*      */         break;
/*      */       case 2:
/*  465 */         ARBFramebufferObject.glBindFramebuffer(☃, j);
/*      */         break;
/*      */       case 3:
/*  468 */         EXTFramebufferObject.glBindFramebufferEXT(☃, j);
/*      */         break;
/*      */     } 
/*      */   }
/*      */   
/*      */   public static int r() {
/*  474 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  475 */     switch (null.a[v.ordinal()]) {
/*      */       case 1:
/*  477 */         if (GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
/*  478 */           return GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
/*      */         }
/*      */         break;
/*      */       case 2:
/*  482 */         if (ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
/*  483 */           return ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
/*      */         }
/*      */         break;
/*      */       case 3:
/*  487 */         if (EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36048) == 5890) {
/*  488 */           return EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36049);
/*      */         }
/*      */         break;
/*      */     } 
/*  492 */     return 0;
/*      */   }
/*      */   
/*      */   public static void a(int ☃, int j, int m, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
/*  496 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  497 */     switch (null.b[w.ordinal()]) {
/*      */       case 1:
/*  499 */         GL30.glBlitFramebuffer(☃, j, m, i1, i2, i3, i4, i5, i6, i7);
/*      */         break;
/*      */       case 2:
/*  502 */         EXTFramebufferBlit.glBlitFramebufferEXT(☃, j, m, i1, i2, i3, i4, i5, i6, i7);
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void k(int ☃) {
/*  540 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  541 */     switch (null.a[v.ordinal()]) {
/*      */       case 1:
/*  543 */         GL30.glDeleteFramebuffers(☃);
/*      */         break;
/*      */       case 2:
/*  546 */         ARBFramebufferObject.glDeleteFramebuffers(☃);
/*      */         break;
/*      */       case 3:
/*  549 */         EXTFramebufferObject.glDeleteFramebuffersEXT(☃);
/*      */         break;
/*      */     } 
/*      */   }
/*      */   
/*      */   public static int s() {
/*  555 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  556 */     switch (null.a[v.ordinal()]) {
/*      */       case 1:
/*  558 */         return GL30.glGenFramebuffers();
/*      */       case 2:
/*  560 */         return ARBFramebufferObject.glGenFramebuffers();
/*      */       case 3:
/*  562 */         return EXTFramebufferObject.glGenFramebuffersEXT();
/*      */     } 
/*  564 */     return -1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int l(int ☃) {
/*  611 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  612 */     switch (null.a[v.ordinal()]) {
/*      */       case 1:
/*  614 */         return GL30.glCheckFramebufferStatus(☃);
/*      */       case 2:
/*  616 */         return ARBFramebufferObject.glCheckFramebufferStatus(☃);
/*      */       case 3:
/*  618 */         return EXTFramebufferObject.glCheckFramebufferStatusEXT(☃);
/*      */     } 
/*  620 */     return -1;
/*      */   }
/*      */   
/*      */   public static void a(int ☃, int j, int m, int i1, int i2) {
/*  624 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  625 */     switch (null.a[v.ordinal()]) {
/*      */       case 1:
/*  627 */         GL30.glFramebufferTexture2D(☃, j, m, i1, i2);
/*      */         break;
/*      */       case 2:
/*  630 */         ARBFramebufferObject.glFramebufferTexture2D(☃, j, m, i1, i2);
/*      */         break;
/*      */       case 3:
/*  633 */         EXTFramebufferObject.glFramebufferTexture2DEXT(☃, j, m, i1, i2);
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static int t() {
/*  653 */     return (q[p]).b;
/*      */   }
/*      */   
/*      */   public static void m(int ☃) {
/*  657 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  658 */     GL13.glActiveTexture(☃);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void n(int ☃) {
/*  663 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  664 */     GL13.glClientActiveTexture(☃);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃, float f1, float f2) {
/*  669 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  670 */     GL13.glMultiTexCoord2f(☃, f1, f2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void c(int ☃, int j, int m, int i1) {
/*  680 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  681 */     GL14.glBlendFuncSeparate(☃, j, m, i1);
/*      */   }
/*      */   
/*      */   public static String i(int ☃, int j) {
/*  685 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  686 */     return GL20.glGetShaderInfoLog(☃, j);
/*      */   }
/*      */   
/*      */   public static String j(int ☃, int j) {
/*  690 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  691 */     return GL20.glGetProgramInfoLog(☃, j);
/*      */   }
/*      */   
/*      */   public static void u() {
/*  695 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*      */ 
/*      */     
/*  698 */     a(8960, 8704, 34160);
/*  699 */     o(7681, 34168);
/*      */   }
/*      */   
/*      */   public static void v() {
/*  703 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*      */ 
/*      */     
/*  706 */     a(8960, 8704, 8448);
/*  707 */     e(8448, 5890, 34168, 34166);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void k(int ☃, int j) {
/*  712 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*      */ 
/*      */     
/*  715 */     q(33985);
/*  716 */     K();
/*  717 */     w(5890);
/*  718 */     P();
/*  719 */     float f1 = 1.0F / (j - 1);
/*  720 */     b(f1, f1, f1);
/*  721 */     w(5888);
/*      */     
/*  723 */     s(☃);
/*  724 */     b(3553, 10241, 9728);
/*  725 */     b(3553, 10240, 9728);
/*  726 */     b(3553, 10242, 10496);
/*  727 */     b(3553, 10243, 10496);
/*      */ 
/*      */     
/*  730 */     a(8960, 8704, 34160);
/*  731 */     e(34165, 34168, 5890, 5890);
/*  732 */     p(7681, 34168);
/*      */ 
/*      */     
/*  735 */     q(33984);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void w() {
/*  740 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*      */     
/*  742 */     q(33985);
/*  743 */     L();
/*  744 */     q(33984);
/*      */   }
/*      */   
/*      */   private static void o(int ☃, int j) {
/*  748 */     a(8960, 34161, ☃);
/*      */     
/*  750 */     a(8960, 34176, j);
/*  751 */     a(8960, 34192, 768);
/*      */   }
/*      */   
/*      */   private static void e(int ☃, int j, int m, int i1) {
/*  755 */     a(8960, 34161, ☃);
/*      */     
/*  757 */     a(8960, 34176, j);
/*  758 */     a(8960, 34192, 768);
/*      */     
/*  760 */     a(8960, 34177, m);
/*  761 */     a(8960, 34193, 768);
/*      */     
/*  763 */     a(8960, 34178, i1);
/*  764 */     a(8960, 34194, 770);
/*      */   }
/*      */   
/*      */   private static void p(int ☃, int j) {
/*  768 */     a(8960, 34162, ☃);
/*  769 */     a(8960, 34184, j);
/*  770 */     a(8960, 34200, 770);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(g ☃, g g1, b b1) {
/*  871 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  872 */     Q();
/*  873 */     P();
/*  874 */     a(0);
/*  875 */     a(1);
/*      */     
/*  877 */     h h1 = new h(☃);
/*  878 */     h1.a(b1);
/*      */     
/*  880 */     a(16384, 4611, e(h1.a(), h1.b(), h1.c(), 0.0F));
/*  881 */     float f1 = 0.6F;
/*  882 */     a(16384, 4609, e(0.6F, 0.6F, 0.6F, 1.0F));
/*  883 */     a(16384, 4608, e(0.0F, 0.0F, 0.0F, 1.0F));
/*  884 */     a(16384, 4610, e(0.0F, 0.0F, 0.0F, 1.0F));
/*      */     
/*  886 */     h h2 = new h(g1);
/*  887 */     h2.a(b1);
/*      */     
/*  889 */     a(16385, 4611, e(h2.a(), h2.b(), h2.c(), 0.0F));
/*  890 */     a(16385, 4609, e(0.6F, 0.6F, 0.6F, 1.0F));
/*  891 */     a(16385, 4608, e(0.0F, 0.0F, 0.0F, 1.0F));
/*  892 */     a(16385, 4610, e(0.0F, 0.0F, 0.0F, 1.0F));
/*      */     
/*  894 */     t(7424);
/*  895 */     float f2 = 0.4F;
/*  896 */     a(2899, e(0.4F, 0.4F, 0.4F, 1.0F));
/*  897 */     R();
/*      */   }
/*      */   
/*      */   public static void a(g ☃, g g1) {
/*  901 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*      */     
/*  903 */     b b1 = new b();
/*  904 */     b1.a();
/*  905 */     b1.a(b.a(1.0F, -1.0F, 1.0F));
/*  906 */     b1.a(g.d.a(-22.5F));
/*  907 */     b1.a(g.b.a(135.0F));
/*  908 */     a(☃, g1, b1);
/*      */   }
/*      */   
/*      */   public static void b(g ☃, g g1) {
/*  912 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*      */     
/*  914 */     b b1 = new b();
/*  915 */     b1.a();
/*      */ 
/*      */     
/*  918 */     b1.a(g.d.a(62.0F));
/*  919 */     b1.a(g.b.a(185.5F));
/*      */     
/*  921 */     b1.a(b.a(1.0F, -1.0F, 1.0F));
/*  922 */     b1.a(g.d.a(-22.5F));
/*  923 */     b1.a(g.b.a(135.0F));
/*  924 */     a(☃, g1, b1);
/*      */   }
/*      */   
/*      */   private static FloatBuffer e(float ☃, float f1, float f2, float f3) {
/*  928 */     o.clear();
/*  929 */     o.put(☃).put(f1).put(f2).put(f3);
/*  930 */     o.flip();
/*  931 */     return o;
/*      */   }
/*      */   
/*      */   public static void x() {
/*  935 */     a(u.a, 9216);
/*  936 */     a(u.b, 9216);
/*  937 */     a(u.c, 9216);
/*  938 */     a(u.a, 9474, e(1.0F, 0.0F, 0.0F, 0.0F));
/*  939 */     a(u.b, 9474, e(0.0F, 1.0F, 0.0F, 0.0F));
/*  940 */     a(u.c, 9474, e(0.0F, 0.0F, 1.0F, 0.0F));
/*  941 */     a(u.a);
/*  942 */     a(u.b);
/*  943 */     a(u.c);
/*      */   }
/*      */   
/*      */   public static void y() {
/*  947 */     b(u.a);
/*  948 */     b(u.b);
/*  949 */     b(u.c);
/*      */   }
/*      */   
/*      */   public static void z() {
/*  953 */     f(2983, a);
/*  954 */     a(a);
/*      */     
/*  956 */     f(2982, a);
/*  957 */     a(a);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public enum m
/*      */   {
/*  971 */     a(9729),
/*  972 */     b(2048),
/*  973 */     c(2049);
/*      */     
/*      */     public final int d;
/*      */ 
/*      */     
/*      */     m(int ☃) {
/*  979 */       this.d = ☃;
/*      */     }
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void A() {
/*  985 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  986 */     h.a.b();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void B() {
/*  991 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  992 */     h.a.a();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void o(int ☃) {
/*  997 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  998 */     if (☃ != h.b) {
/*  999 */       h.b = ☃;
/* 1000 */       l(2917, ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(float ☃) {
/* 1006 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1007 */     if (☃ != h.c) {
/* 1008 */       h.c = ☃;
/* 1009 */       GL11.glFogf(2914, ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void b(float ☃) {
/* 1015 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1016 */     if (☃ != h.d) {
/* 1017 */       h.d = ☃;
/* 1018 */       GL11.glFogf(2915, ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void c(float ☃) {
/* 1024 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1025 */     if (☃ != h.e) {
/* 1026 */       h.e = ☃;
/* 1027 */       GL11.glFogf(2916, ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃, float[] arrayOfFloat) {
/* 1033 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1034 */     GL11.glFogfv(☃, arrayOfFloat);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void l(int ☃, int j) {
/* 1039 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1040 */     GL11.glFogi(☃, j);
/*      */   }
/*      */   
/*      */   public static void C() {
/* 1044 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1045 */     i.a.b();
/*      */   }
/*      */   
/*      */   public static void D() {
/* 1049 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1050 */     i.a.a();
/*      */   }
/*      */   
/*      */   public static void m(int ☃, int j) {
/* 1054 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1055 */     GL11.glPolygonMode(☃, j);
/*      */   }
/*      */   
/*      */   public static void E() {
/* 1059 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1060 */     j.a.b();
/*      */   }
/*      */   
/*      */   public static void F() {
/* 1064 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1065 */     j.a.a();
/*      */   }
/*      */   
/*      */   public static void G() {
/* 1069 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1070 */     j.b.b();
/*      */   }
/*      */   
/*      */   public static void H() {
/* 1074 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1075 */     j.b.a();
/*      */   }
/*      */   
/*      */   public static void a(float ☃, float f1) {
/* 1079 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1080 */     if (☃ != j.c || f1 != j.d) {
/* 1081 */       j.c = ☃;
/* 1082 */       j.d = f1;
/* 1083 */       GL11.glPolygonOffset(☃, f1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public enum o
/*      */   {
/* 1089 */     a(5377),
/* 1090 */     b(5380),
/* 1091 */     c(5378),
/* 1092 */     d(5376),
/* 1093 */     e(5379),
/* 1094 */     f(5388),
/* 1095 */     g(5385),
/* 1096 */     h(5386),
/* 1097 */     i(5390),
/* 1098 */     j(5381),
/* 1099 */     k(5384),
/* 1100 */     l(5383),
/* 1101 */     m(5389),
/* 1102 */     n(5387),
/* 1103 */     o(5391),
/* 1104 */     p(5382);
/*      */     
/*      */     public final int q;
/*      */ 
/*      */     
/*      */     o(int ☃) {
/* 1110 */       this.q = ☃;
/*      */     }
/*      */   }
/*      */   
/*      */   public static void I() {
/* 1115 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1116 */     k.a.b();
/*      */   }
/*      */   
/*      */   public static void J() {
/* 1120 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1121 */     k.a.a();
/*      */   }
/*      */   
/*      */   public static void p(int ☃) {
/* 1125 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1126 */     if (☃ != k.b) {
/* 1127 */       k.b = ☃;
/* 1128 */       GL11.glLogicOp(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(u ☃) {
/* 1134 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1135 */     (c(☃)).a.b();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void b(u ☃) {
/* 1140 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1141 */     (c(☃)).a.a();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(u ☃, int j) {
/* 1146 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1147 */     v v = c(☃);
/* 1148 */     if (j != v.c) {
/* 1149 */       v.c = j;
/* 1150 */       GL11.glTexGeni(v.b, 9472, j);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(u ☃, int j, FloatBuffer floatBuffer) {
/* 1156 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1157 */     GL11.glTexGenfv((c(☃)).b, j, floatBuffer);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   private static v c(u ☃) {
/* 1162 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1163 */     switch (null.c[☃.ordinal()]) {
/*      */       case 1:
/* 1165 */         return l.a;
/*      */       case 2:
/* 1167 */         return l.b;
/*      */       case 3:
/* 1169 */         return l.c;
/*      */       case 4:
/* 1171 */         return l.d;
/*      */     } 
/* 1173 */     return l.a;
/*      */   }
/*      */   
/*      */   public static void q(int ☃) {
/* 1177 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1178 */     if (p != ☃ - 33984) {
/* 1179 */       p = ☃ - 33984;
/* 1180 */       m(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void K() {
/* 1185 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1186 */     (q[p]).a.b();
/*      */   }
/*      */   
/*      */   public static void L() {
/* 1190 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1191 */     (q[p]).a.a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃, int j, int m) {
/* 1202 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1203 */     GL11.glTexEnvi(☃, j, m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(int ☃, int j, float f1) {
/* 1213 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1214 */     GL11.glTexParameterf(☃, j, f1);
/*      */   }
/*      */   
/*      */   public static void b(int ☃, int j, int m) {
/* 1218 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1219 */     GL11.glTexParameteri(☃, j, m);
/*      */   }
/*      */   
/*      */   public static int c(int ☃, int j, int m) {
/* 1223 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 1224 */     return GL11.glGetTexLevelParameteri(☃, j, m);
/*      */   }
/*      */   
/*      */   public static int M() {
/* 1228 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1229 */     return GL11.glGenTextures();
/*      */   }
/*      */   
/*      */   public static void a(int[] ☃) {
/* 1233 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1234 */     GL11.glGenTextures(☃);
/*      */   }
/*      */   
/*      */   public static void r(int ☃) {
/* 1238 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1239 */     GL11.glDeleteTextures(☃);
/* 1240 */     for (x x1 : q) {
/* 1241 */       if (x1.b == ☃) {
/* 1242 */         x1.b = -1;
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void b(int[] ☃) {
/* 1248 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1249 */     for (x x1 : q) {
/* 1250 */       for (int j : ☃) {
/* 1251 */         if (x1.b == j) {
/* 1252 */           x1.b = -1;
/*      */         }
/*      */       } 
/*      */     } 
/* 1256 */     GL11.glDeleteTextures(☃);
/*      */   }
/*      */   
/*      */   public static void s(int ☃) {
/* 1260 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1261 */     if (☃ != (q[p]).b) {
/* 1262 */       (q[p]).b = ☃;
/* 1263 */       GL11.glBindTexture(3553, ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void a(int ☃, int j, int m, int i1, int i2, int i3, int i4, int i5, @Nullable IntBuffer intBuffer) {
/* 1268 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1269 */     GL11.glTexImage2D(☃, j, m, i1, i2, i3, i4, i5, intBuffer);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, int j, int m, int i1, int i2, int i3, int i4, int i5, long l1) {
/* 1273 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1274 */     GL11.glTexSubImage2D(☃, j, m, i1, i2, i3, i4, i5, l1);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, int j, int m, int i1, long l1) {
/* 1278 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1279 */     GL11.glGetTexImage(☃, j, m, i1, l1);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void t(int ☃) {
/* 1284 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1285 */     if (☃ != r) {
/* 1286 */       r = ☃;
/* 1287 */       GL11.glShadeModel(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void N() {
/* 1293 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1294 */     s.b();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void O() {
/* 1299 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1300 */     s.a();
/*      */   }
/*      */   
/*      */   public static void d(int ☃, int j, int m, int i1) {
/* 1304 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1305 */     y.a.b = ☃;
/* 1306 */     y.a.c = j;
/* 1307 */     y.a.d = m;
/* 1308 */     y.a.e = i1;
/* 1309 */     GL11.glViewport(☃, j, m, i1);
/*      */   }
/*      */   
/*      */   public static void a(boolean ☃, boolean bool1, boolean bool2, boolean bool3) {
/* 1313 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1314 */     if (☃ != t.a || bool1 != t.b || bool2 != t.c || bool3 != t.d) {
/* 1315 */       t.a = ☃;
/* 1316 */       t.b = bool1;
/* 1317 */       t.c = bool2;
/* 1318 */       t.d = bool3;
/* 1319 */       GL11.glColorMask(☃, bool1, bool2, bool3);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void d(int ☃, int j, int m) {
/* 1324 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1325 */     if (☃ != m.a.a || ☃ != m.a.b || ☃ != m.a.c) {
/* 1326 */       m.a.a = ☃;
/* 1327 */       m.a.b = j;
/* 1328 */       m.a.c = m;
/* 1329 */       GL11.glStencilFunc(☃, j, m);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void u(int ☃) {
/* 1334 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1335 */     if (☃ != m.b) {
/* 1336 */       m.b = ☃;
/* 1337 */       GL11.glStencilMask(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void e(int ☃, int j, int m) {
/* 1342 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1343 */     if (☃ != m.c || j != m.d || m != m.e) {
/* 1344 */       m.c = ☃;
/* 1345 */       m.d = j;
/* 1346 */       m.e = m;
/* 1347 */       GL11.glStencilOp(☃, j, m);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void a(double ☃) {
/* 1352 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1353 */     GL11.glClearDepth(☃);
/*      */   }
/*      */   
/*      */   public static void b(float ☃, float f1, float f2, float f3) {
/* 1357 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1358 */     GL11.glClearColor(☃, f1, f2, f3);
/*      */   }
/*      */   
/*      */   public static void v(int ☃) {
/* 1362 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1363 */     GL11.glClearStencil(☃);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, boolean bool) {
/* 1367 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1368 */     GL11.glClear(☃);
/*      */     
/* 1370 */     if (bool) {
/* 1371 */       T();
/*      */     }
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void w(int ☃) {
/* 1377 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1378 */     GL11.glMatrixMode(☃);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void P() {
/* 1383 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1384 */     GL11.glLoadIdentity();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void Q() {
/* 1389 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1390 */     GL11.glPushMatrix();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void R() {
/* 1395 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1396 */     GL11.glPopMatrix();
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void f(int ☃, FloatBuffer floatBuffer) {
/* 1401 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1402 */     GL11.glGetFloatv(☃, floatBuffer);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/* 1407 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1408 */     GL11.glOrtho(☃, d1, d2, d3, d4, d5);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void c(float ☃, float f1, float f2, float f3) {
/* 1413 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1414 */     GL11.glRotatef(☃, f1, f2, f3);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void b(float ☃, float f1, float f2) {
/* 1419 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1420 */     GL11.glScalef(☃, f1, f2);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(double ☃, double d1, double d2) {
/* 1425 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1426 */     GL11.glScaled(☃, d1, d2);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void c(float ☃, float f1, float f2) {
/* 1431 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1432 */     GL11.glTranslatef(☃, f1, f2);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void b(double ☃, double d1, double d2) {
/* 1437 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1438 */     GL11.glTranslated(☃, d1, d2);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(FloatBuffer ☃) {
/* 1443 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1444 */     GL11.glMultMatrixf(☃);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(b ☃) {
/* 1449 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1450 */     ☃.a(a);
/* 1451 */     a.rewind();
/* 1452 */     a(a);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void d(float ☃, float f1, float f2, float f3) {
/* 1457 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1458 */     if (☃ != u.a || f1 != u.b || f2 != u.c || f3 != u.d) {
/* 1459 */       u.a = ☃;
/* 1460 */       u.b = f1;
/* 1461 */       u.c = f2;
/* 1462 */       u.d = f3;
/* 1463 */       GL11.glColor4f(☃, f1, f2, f3);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void S() {
/* 1469 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1475 */     u.a = -1.0F;
/* 1476 */     u.b = -1.0F;
/* 1477 */     u.c = -1.0F;
/* 1478 */     u.d = -1.0F;
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃, int j, long l1) {
/* 1483 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1484 */     GL11.glNormalPointer(☃, j, l1);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void a(int ☃, int j, int m, long l1) {
/* 1489 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1490 */     GL11.glTexCoordPointer(☃, j, m, l1);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void b(int ☃, int j, int m, long l1) {
/* 1495 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1496 */     GL11.glVertexPointer(☃, j, m, l1);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void c(int ☃, int j, int m, long l1) {
/* 1501 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1502 */     GL11.glColorPointer(☃, j, m, l1);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, int j, int m, boolean bool, int i1, long l1) {
/* 1506 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1507 */     GL20.glVertexAttribPointer(☃, j, m, bool, i1, l1);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void x(int ☃) {
/* 1512 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1513 */     GL11.glEnableClientState(☃);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static void y(int ☃) {
/* 1518 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1519 */     GL11.glDisableClientState(☃);
/*      */   }
/*      */   
/*      */   public static void z(int ☃) {
/* 1523 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1524 */     GL20.glEnableVertexAttribArray(☃);
/*      */   }
/*      */   
/*      */   public static void A(int ☃) {
/* 1528 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1529 */     GL20.glEnableVertexAttribArray(☃);
/*      */   }
/*      */   
/*      */   public static void f(int ☃, int j, int m) {
/* 1533 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1534 */     GL11.glDrawArrays(☃, j, m);
/*      */   }
/*      */   
/*      */   public static void d(float ☃) {
/* 1538 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1539 */     GL11.glLineWidth(☃);
/*      */   }
/*      */   
/*      */   public static void n(int ☃, int j) {
/* 1543 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1544 */     GL11.glPixelStorei(☃, j);
/*      */   }
/*      */   
/*      */   public static void b(int ☃, float f1) {
/* 1548 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1549 */     GL11.glPixelTransferf(☃, f1);
/*      */   }
/*      */   
/*      */   public static void a(int ☃, int j, int m, int i1, int i2, int i3, ByteBuffer byteBuffer) {
/* 1553 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1554 */     GL11.glReadPixels(☃, j, m, i1, i2, i3, byteBuffer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int T() {
/* 1563 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1564 */     return GL11.glGetError();
/*      */   }
/*      */   
/*      */   public static String B(int ☃) {
/* 1568 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 1569 */     return GL11.glGetString(☃);
/*      */   }
/*      */   
/*      */   public static int C(int ☃) {
/* 1573 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1574 */     return GL11.glGetInteger(☃);
/*      */   }
/*      */   
/*      */   public enum y
/*      */   {
/* 1579 */     a;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected int e;
/*      */ 
/*      */ 
/*      */     
/*      */     protected int d;
/*      */ 
/*      */ 
/*      */     
/*      */     protected int c;
/*      */ 
/*      */ 
/*      */     
/*      */     protected int b;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum l
/*      */   {
/* 1604 */     a, b, c;
/*      */   }
/*      */   
/*      */   public enum k
/*      */   {
/* 1609 */     a, b, c;
/*      */   }
/*      */   
/*      */   public static boolean U() {
/* 1613 */     return (w != k.c);
/*      */   }
/*      */   static class x { private x() {}
/*      */     
/* 1617 */     public final dem.c a = new dem.c(3553);
/*      */     public int b; }
/*      */   
/*      */   @Deprecated
/*      */   static class a { private a() {}
/*      */     
/* 1623 */     public final dem.c a = new dem.c(3008);
/* 1624 */     public int b = 519;
/* 1625 */     public float c = -1.0F; }
/*      */   
/*      */   @Deprecated
/*      */   static class g { private g() {}
/*      */     
/* 1630 */     public final dem.c a = new dem.c(2903);
/* 1631 */     public int b = 1032;
/* 1632 */     public int c = 5634; }
/*      */   
/*      */   static class b { private b() {}
/*      */     
/* 1636 */     public final dem.c a = new dem.c(3042);
/* 1637 */     public int b = 1;
/* 1638 */     public int c = 0;
/* 1639 */     public int d = 1;
/* 1640 */     public int e = 0; }
/*      */   
/*      */   static class i { private i() {}
/*      */     
/* 1644 */     public final dem.c a = new dem.c(2929);
/*      */     public boolean b = true;
/* 1646 */     public int c = 513; }
/*      */   
/*      */   @Deprecated
/*      */   static class n { private n() {}
/*      */     
/* 1651 */     public final dem.c a = new dem.c(2912);
/* 1652 */     public int b = 2048;
/* 1653 */     public float c = 1.0F;
/*      */     public float d;
/* 1655 */     public float e = 1.0F; }
/*      */   
/*      */   static class h { private h() {}
/*      */     
/* 1659 */     public final dem.c a = new dem.c(2884);
/* 1660 */     public int b = 1029; }
/*      */   
/*      */   static class p { private p() {}
/*      */     
/* 1664 */     public final dem.c a = new dem.c(32823);
/* 1665 */     public final dem.c b = new dem.c(10754);
/*      */     public float c;
/*      */     public float d; }
/*      */   
/*      */   static class e { private e() {}
/*      */     
/* 1671 */     public final dem.c a = new dem.c(3058);
/* 1672 */     public int b = 5379; }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static class s
/*      */   {
/*      */     private s() {}
/*      */ 
/*      */     
/* 1682 */     public int a = 519;
/*      */     public int b;
/* 1684 */     public int c = -1; }
/*      */   
/*      */   static class t { private t() {}
/*      */     
/* 1688 */     public final dem.s a = new dem.s();
/* 1689 */     public int b = -1;
/* 1690 */     public int c = 7680;
/* 1691 */     public int d = 7680;
/* 1692 */     public int e = 7680; }
/*      */   
/*      */   static class q { private q() {}
/*      */     
/* 1696 */     public final dem.c a = new dem.c(3089); }
/*      */   
/*      */   @Deprecated
/*      */   static class w { private w() {}
/*      */     
/* 1701 */     public final dem.v a = new dem.v(8192, 3168);
/* 1702 */     public final dem.v b = new dem.v(8193, 3169);
/* 1703 */     public final dem.v c = new dem.v(8194, 3170);
/* 1704 */     public final dem.v d = new dem.v(8195, 3171); }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   static class v {
/*      */     public final dem.c a;
/*      */     public final int b;
/* 1711 */     public int c = -1;
/*      */     
/*      */     public v(int ☃, int i) {
/* 1714 */       this.b = ☃;
/* 1715 */       this.a = new dem.c(i);
/*      */     }
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public enum u {
/* 1721 */     a, b, c, d;
/*      */   }
/*      */   
/*      */   static class f { private f() {}
/*      */     
/*      */     public boolean a = true;
/*      */     public boolean b = true;
/*      */     public boolean c = true;
/*      */     public boolean d = true; }
/*      */   
/*      */   @Deprecated
/*      */   static class d {
/* 1733 */     public float a = 1.0F;
/* 1734 */     public float b = 1.0F;
/* 1735 */     public float c = 1.0F;
/* 1736 */     public float d = 1.0F;
/*      */     
/*      */     public d() {
/* 1739 */       this(1.0F, 1.0F, 1.0F, 1.0F);
/*      */     }
/*      */     
/*      */     public d(float ☃, float f1, float f2, float f3) {
/* 1743 */       this.a = ☃;
/* 1744 */       this.b = f1;
/* 1745 */       this.c = f2;
/* 1746 */       this.d = f3;
/*      */     }
/*      */   }
/*      */   
/*      */   static class c {
/*      */     private final int a;
/*      */     private boolean b;
/*      */     
/*      */     public c(int ☃) {
/* 1755 */       this.a = ☃;
/*      */     }
/*      */     
/*      */     public void a() {
/* 1759 */       a(false);
/*      */     }
/*      */     
/*      */     public void b() {
/* 1763 */       a(true);
/*      */     }
/*      */     
/*      */     public void a(boolean ☃) {
/* 1767 */       RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 1768 */       if (☃ != this.b) {
/* 1769 */         this.b = ☃;
/* 1770 */         if (☃) {
/* 1771 */           GL11.glEnable(this.a);
/*      */         } else {
/* 1773 */           GL11.glDisable(this.a);
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public enum r
/*      */   {
/* 1781 */     a(32771),
/* 1782 */     b(32769),
/* 1783 */     c(772),
/* 1784 */     d(774),
/* 1785 */     e(1),
/* 1786 */     f(32772),
/* 1787 */     g(32770),
/* 1788 */     h(773),
/* 1789 */     i(775),
/* 1790 */     j(771),
/* 1791 */     k(769),
/* 1792 */     l(770),
/* 1793 */     m(776),
/* 1794 */     n(768),
/* 1795 */     o(0);
/*      */     
/*      */     public final int p;
/*      */ 
/*      */     
/*      */     r(int ☃) {
/* 1801 */       this.p = ☃;
/*      */     }
/*      */   }
/*      */   
/*      */   public enum j
/*      */   {
/* 1807 */     a(32771),
/* 1808 */     b(32769),
/* 1809 */     c(772),
/* 1810 */     d(774),
/* 1811 */     e(1),
/* 1812 */     f(32772),
/* 1813 */     g(32770),
/* 1814 */     h(773),
/* 1815 */     i(775),
/* 1816 */     j(771),
/* 1817 */     k(769),
/* 1818 */     l(770),
/* 1819 */     m(768),
/* 1820 */     n(0);
/*      */     
/*      */     public final int o;
/*      */ 
/*      */     
/*      */     j(int ☃) {
/* 1826 */       this.o = ☃;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */