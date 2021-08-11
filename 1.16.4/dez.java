/*     */ import com.mojang.blaze3d.platform.GLX;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.Optional;
/*     */ import java.util.function.BiConsumer;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.PointerBuffer;
/*     */ import org.lwjgl.glfw.Callbacks;
/*     */ import org.lwjgl.glfw.GLFW;
/*     */ import org.lwjgl.glfw.GLFWErrorCallback;
/*     */ import org.lwjgl.glfw.GLFWErrorCallbackI;
/*     */ import org.lwjgl.glfw.GLFWImage;
/*     */ import org.lwjgl.opengl.GL;
/*     */ import org.lwjgl.stb.STBImage;
/*     */ import org.lwjgl.system.MemoryStack;
/*     */ import org.lwjgl.system.MemoryUtil;
/*     */ import org.lwjgl.util.tinyfd.TinyFileDialogs;
/*     */ 
/*     */ public final class dez
/*     */   implements AutoCloseable
/*     */ {
/*  28 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  30 */   private final GLFWErrorCallback b = GLFWErrorCallback.create(this::a);
/*     */   
/*     */   private final dfa c;
/*     */   private final dev d;
/*     */   private final long e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private Optional<dey> j;
/*     */   private boolean k;
/*     */   private boolean l;
/*     */   private int m;
/*     */   private int n;
/*     */   private int o;
/*     */   private int p;
/*     */   private int q;
/*     */   private int r;
/*     */   private int s;
/*     */   private int t;
/*     */   private double u;
/*  51 */   private String v = "";
/*     */   
/*     */   private boolean w;
/*     */   private int x;
/*     */   private boolean y;
/*     */   
/*     */   public dez(dfa ☃, dev dev1, dej dej1, @Nullable String str1, String str2) {
/*  58 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/*  59 */     this.d = dev1;
/*     */     
/*  61 */     u();
/*  62 */     a("Pre startup");
/*     */     
/*  64 */     this.c = ☃;
/*     */     
/*  66 */     Optional<dey> optional = dey.a(str1);
/*  67 */     if (optional.isPresent()) {
/*  68 */       this.j = optional;
/*  69 */     } else if (dej1.c.isPresent() && dej1.d.isPresent()) {
/*  70 */       this.j = Optional.of(new dey(dej1.c.getAsInt(), dej1.d.getAsInt(), 8, 8, 8, 60));
/*     */     } else {
/*  72 */       this.j = Optional.empty();
/*     */     } 
/*  74 */     this.l = this.k = dej1.e;
/*     */ 
/*     */     
/*  77 */     der der = dev1.a(GLFW.glfwGetPrimaryMonitor());
/*     */     
/*  79 */     this.h = this.o = (dej1.a > 0) ? dej1.a : 1;
/*  80 */     this.i = this.p = (dej1.b > 0) ? dej1.b : 1;
/*     */     
/*  82 */     GLFW.glfwDefaultWindowHints();
/*     */     
/*  84 */     GLFW.glfwWindowHint(139265, 196609);
/*  85 */     GLFW.glfwWindowHint(139275, 221185);
/*  86 */     GLFW.glfwWindowHint(139266, 2);
/*  87 */     GLFW.glfwWindowHint(139267, 0);
/*  88 */     GLFW.glfwWindowHint(139272, 0);
/*     */     
/*  90 */     this.e = GLFW.glfwCreateWindow(this.o, this.p, str2, (this.k && der != null) ? der.f() : 0L, 0L);
/*     */     
/*  92 */     if (der != null) {
/*  93 */       dey dey = der.a(this.k ? this.j : Optional.<dey>empty());
/*  94 */       this.f = this.m = der.c() + dey.a() / 2 - this.o / 2;
/*  95 */       this.g = this.n = der.d() + dey.b() / 2 - this.p / 2;
/*     */     } else {
/*  97 */       int[] arrayOfInt1 = new int[1];
/*  98 */       int[] arrayOfInt2 = new int[1];
/*  99 */       GLFW.glfwGetWindowPos(this.e, arrayOfInt1, arrayOfInt2);
/* 100 */       this.f = this.m = arrayOfInt1[0];
/* 101 */       this.g = this.n = arrayOfInt2[0];
/*     */     } 
/*     */     
/* 104 */     GLFW.glfwMakeContextCurrent(this.e);
/*     */     
/* 106 */     GL.createCapabilities();
/*     */     
/* 108 */     w();
/*     */     
/* 110 */     v();
/*     */     
/* 112 */     GLFW.glfwSetFramebufferSizeCallback(this.e, this::b);
/* 113 */     GLFW.glfwSetWindowPosCallback(this.e, this::a);
/* 114 */     GLFW.glfwSetWindowSizeCallback(this.e, this::c);
/* 115 */     GLFW.glfwSetWindowFocusCallback(this.e, this::a);
/* 116 */     GLFW.glfwSetCursorEnterCallback(this.e, this::b);
/*     */   }
/*     */   
/*     */   public int a() {
/* 120 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 121 */     return GLX._getRefreshRate(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 126 */     return GLX._shouldClose(this);
/*     */   }
/*     */   
/*     */   public static void a(BiConsumer<Integer, String> ☃) {
/* 130 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 131 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/* 132 */       PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
/* 133 */       int i = GLFW.glfwGetError(pointerBuffer);
/* 134 */       if (i != 0) {
/* 135 */         long l = pointerBuffer.get();
/* 136 */         String str = (l == 0L) ? "" : MemoryUtil.memUTF8(l);
/* 137 */         ☃.accept(Integer.valueOf(i), str);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(InputStream ☃, InputStream inputStream1) {
/* 143 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/*     */     
/* 145 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/*     */       
/* 147 */       if (☃ == null) {
/* 148 */         throw new FileNotFoundException("icons/icon_16x16.png");
/*     */       }
/* 150 */       if (inputStream1 == null) {
/* 151 */         throw new FileNotFoundException("icons/icon_32x32.png");
/*     */       }
/* 153 */       IntBuffer intBuffer1 = memoryStack.mallocInt(1);
/* 154 */       IntBuffer intBuffer2 = memoryStack.mallocInt(1);
/* 155 */       IntBuffer intBuffer3 = memoryStack.mallocInt(1);
/* 156 */       GLFWImage.Buffer buffer = GLFWImage.mallocStack(2, memoryStack);
/*     */       
/* 158 */       ByteBuffer byteBuffer1 = a(☃, intBuffer1, intBuffer2, intBuffer3);
/*     */       
/* 160 */       if (byteBuffer1 == null) {
/* 161 */         throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
/*     */       }
/* 163 */       buffer.position(0);
/* 164 */       buffer.width(intBuffer1.get(0));
/* 165 */       buffer.height(intBuffer2.get(0));
/* 166 */       buffer.pixels(byteBuffer1);
/*     */       
/* 168 */       ByteBuffer byteBuffer2 = a(inputStream1, intBuffer1, intBuffer2, intBuffer3);
/* 169 */       if (byteBuffer2 == null) {
/* 170 */         throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
/*     */       }
/* 172 */       buffer.position(1);
/* 173 */       buffer.width(intBuffer1.get(0));
/* 174 */       buffer.height(intBuffer2.get(0));
/* 175 */       buffer.pixels(byteBuffer2);
/*     */       
/* 177 */       buffer.position(0);
/* 178 */       GLFW.glfwSetWindowIcon(this.e, buffer);
/* 179 */       STBImage.stbi_image_free(byteBuffer1);
/* 180 */       STBImage.stbi_image_free(byteBuffer2);
/* 181 */     } catch (IOException iOException) {
/* 182 */       a.error("Couldn't set icon", iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ByteBuffer a(InputStream ☃, IntBuffer intBuffer1, IntBuffer intBuffer2, IntBuffer intBuffer3) throws IOException {
/* 188 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 189 */     ByteBuffer byteBuffer = null;
/*     */     try {
/* 191 */       byteBuffer = dex.a(☃);
/* 192 */       byteBuffer.rewind();
/* 193 */       return STBImage.stbi_load_from_memory(byteBuffer, intBuffer1, intBuffer2, intBuffer3, 0);
/*     */     } finally {
/* 195 */       if (byteBuffer != null) {
/* 196 */         MemoryUtil.memFree(byteBuffer);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 202 */     this.v = ☃;
/*     */   }
/*     */   
/*     */   private void u() {
/* 206 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/*     */ 
/*     */     
/* 209 */     GLFW.glfwSetErrorCallback(dez::b);
/*     */   }
/*     */   
/*     */   private static void b(int ☃, long l) {
/* 213 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 214 */     String str = "GLFW error " + ☃ + ": " + MemoryUtil.memUTF8(l);
/* 215 */     TinyFileDialogs.tinyfd_messageBox("Minecraft", str + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false);
/* 216 */     throw new a(str);
/*     */   }
/*     */   
/*     */   public void a(int ☃, long l) {
/* 220 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 221 */     String str = MemoryUtil.memUTF8(l);
/* 222 */     a.error("########## GL ERROR ##########");
/* 223 */     a.error("@ {}", this.v);
/* 224 */     a.error("{}: {}", Integer.valueOf(☃), str);
/*     */   }
/*     */   
/*     */   public void c() {
/* 228 */     GLFWErrorCallback ☃ = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)this.b);
/* 229 */     if (☃ != null) {
/* 230 */       ☃.free();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 235 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 236 */     this.y = ☃;
/* 237 */     GLFW.glfwSwapInterval(☃ ? 1 : 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 242 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 243 */     Callbacks.glfwFreeCallbacks(this.e);
/* 244 */     this.b.close();
/* 245 */     GLFW.glfwDestroyWindow(this.e);
/* 246 */     GLFW.glfwTerminate();
/*     */   }
/*     */   
/*     */   private void a(long ☃, int i, int j) {
/* 250 */     this.m = i;
/* 251 */     this.n = j;
/*     */   }
/*     */   
/*     */   private void b(long ☃, int i, int j) {
/* 255 */     if (☃ != this.e) {
/*     */       return;
/*     */     }
/* 258 */     int k = k();
/* 259 */     int m = l();
/*     */     
/* 261 */     if (i == 0 || j == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 265 */     this.q = i;
/* 266 */     this.r = j;
/* 267 */     if (k() != k || l() != m) {
/* 268 */       this.c.a();
/*     */     }
/*     */   }
/*     */   
/*     */   private void v() {
/* 273 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 274 */     int[] ☃ = new int[1];
/* 275 */     int[] arrayOfInt1 = new int[1];
/* 276 */     GLFW.glfwGetFramebufferSize(this.e, ☃, arrayOfInt1);
/*     */     
/* 278 */     this.q = ☃[0];
/* 279 */     this.r = arrayOfInt1[0];
/*     */   }
/*     */   
/*     */   private void c(long ☃, int i, int j) {
/* 283 */     this.o = i;
/* 284 */     this.p = j;
/*     */   }
/*     */   
/*     */   private void a(long ☃, boolean bool) {
/* 288 */     if (☃ == this.e) {
/* 289 */       this.c.a(bool);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(long ☃, boolean bool) {
/* 294 */     if (bool) {
/* 295 */       this.c.b();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 300 */     this.x = ☃;
/*     */   }
/*     */   
/*     */   public int d() {
/* 304 */     return this.x;
/*     */   }
/*     */   
/*     */   public void e() {
/* 308 */     RenderSystem.flipFrame(this.e);
/* 309 */     if (this.k != this.l) {
/* 310 */       this.l = this.k;
/* 311 */       c(this.y);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Optional<dey> f() {
/* 316 */     return this.j;
/*     */   }
/*     */   
/*     */   public void a(Optional<dey> ☃) {
/* 320 */     boolean bool = !☃.equals(this.j);
/* 321 */     this.j = ☃;
/* 322 */     if (bool) {
/* 323 */       this.w = true;
/*     */     }
/*     */   }
/*     */   
/*     */   public void g() {
/* 328 */     if (this.k && this.w) {
/* 329 */       this.w = false;
/* 330 */       w();
/* 331 */       this.c.a();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void w() {
/* 336 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/*     */ 
/*     */     
/* 339 */     boolean ☃ = (GLFW.glfwGetWindowMonitor(this.e) != 0L);
/* 340 */     if (this.k) {
/* 341 */       der der = this.d.a(this);
/* 342 */       if (der == null) {
/* 343 */         a.warn("Failed to find suitable monitor for fullscreen mode");
/* 344 */         this.k = false;
/*     */       } else {
/* 346 */         dey dey = der.a(this.j);
/* 347 */         if (!☃) {
/* 348 */           this.f = this.m;
/* 349 */           this.g = this.n;
/* 350 */           this.h = this.o;
/* 351 */           this.i = this.p;
/*     */         } 
/* 353 */         this.m = 0;
/* 354 */         this.n = 0;
/* 355 */         this.o = dey.a();
/* 356 */         this.p = dey.b();
/* 357 */         GLFW.glfwSetWindowMonitor(this.e, der.f(), this.m, this.n, this.o, this.p, dey.f());
/*     */       } 
/*     */     } else {
/* 360 */       this.m = this.f;
/* 361 */       this.n = this.g;
/* 362 */       this.o = this.h;
/* 363 */       this.p = this.i;
/* 364 */       GLFW.glfwSetWindowMonitor(this.e, 0L, this.m, this.n, this.o, this.p, -1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void h() {
/* 369 */     this.k = !this.k;
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/* 373 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*     */     try {
/* 375 */       w();
/* 376 */       this.c.a();
/* 377 */       a(☃);
/* 378 */       e();
/* 379 */     } catch (Exception exception) {
/* 380 */       a.error("Couldn't toggle fullscreen", exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(int ☃, boolean bool) {
/* 385 */     int i = 1;
/* 386 */     while (i != ☃ && i < this.q && i < this.r && this.q / (i + 1) >= 320 && this.r / (i + 1) >= 240) {
/* 387 */       i++;
/*     */     }
/* 389 */     if (bool && i % 2 != 0) {
/* 390 */       i++;
/*     */     }
/* 392 */     return i;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 396 */     this.u = ☃;
/* 397 */     int i = (int)(this.q / ☃);
/* 398 */     this.s = (this.q / ☃ > i) ? (i + 1) : i;
/* 399 */     int j = (int)(this.r / ☃);
/* 400 */     this.t = (this.r / ☃ > j) ? (j + 1) : j;
/*     */   }
/*     */   
/*     */   public void b(String ☃) {
/* 404 */     GLFW.glfwSetWindowTitle(this.e, ☃);
/*     */   }
/*     */   
/*     */   public long i() {
/* 408 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 412 */     return this.k;
/*     */   }
/*     */   
/*     */   public int k() {
/* 416 */     return this.q;
/*     */   }
/*     */   
/*     */   public int l() {
/* 420 */     return this.r;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int m() {
/* 432 */     return this.o;
/*     */   }
/*     */   
/*     */   public int n() {
/* 436 */     return this.p;
/*     */   }
/*     */   
/*     */   public int o() {
/* 440 */     return this.s;
/*     */   }
/*     */   
/*     */   public int p() {
/* 444 */     return this.t;
/*     */   }
/*     */   
/*     */   public int q() {
/* 448 */     return this.m;
/*     */   }
/*     */   
/*     */   public int r() {
/* 452 */     return this.n;
/*     */   }
/*     */   
/*     */   public double s() {
/* 456 */     return this.u;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public der t() {
/* 461 */     return this.d.a(this);
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 465 */     deo.a(this.e, ☃);
/*     */   }
/*     */   
/*     */   public static class a extends dta {
/*     */     private a(String ☃) {
/* 470 */       super(☃);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dez.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */