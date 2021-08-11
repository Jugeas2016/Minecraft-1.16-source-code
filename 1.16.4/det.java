/*     */ import com.google.common.base.Charsets;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.channels.Channels;
/*     */ import java.nio.channels.WritableByteChannel;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.StandardOpenOption;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.Base64;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.stb.STBIWriteCallback;
/*     */ import org.lwjgl.stb.STBImage;
/*     */ import org.lwjgl.stb.STBImageResize;
/*     */ import org.lwjgl.stb.STBImageWrite;
/*     */ import org.lwjgl.stb.STBTTFontinfo;
/*     */ import org.lwjgl.stb.STBTruetype;
/*     */ import org.lwjgl.system.MemoryStack;
/*     */ import org.lwjgl.system.MemoryUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class det
/*     */   implements AutoCloseable
/*     */ {
/*  41 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   private static final Set<StandardOpenOption> b = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
/*     */   
/*     */   private final a c;
/*     */   
/*     */   private final int d;
/*     */   private final int e;
/*     */   private final boolean f;
/*     */   private long g;
/*     */   private final long h;
/*     */   
/*     */   public det(int ☃, int i, boolean bool) {
/*  59 */     this(a.a, ☃, i, bool);
/*     */   }
/*     */   
/*     */   public det(a ☃, int i, int j, boolean bool) {
/*  63 */     this.c = ☃;
/*  64 */     this.d = i;
/*  65 */     this.e = j;
/*  66 */     this.h = i * j * ☃.a();
/*  67 */     this.f = false;
/*  68 */     if (bool) {
/*  69 */       this.g = MemoryUtil.nmemCalloc(1L, this.h);
/*     */     } else {
/*  71 */       this.g = MemoryUtil.nmemAlloc(this.h);
/*     */     } 
/*     */   }
/*     */   
/*     */   private det(a ☃, int i, int j, boolean bool, long l) {
/*  76 */     this.c = ☃;
/*  77 */     this.d = i;
/*  78 */     this.e = j;
/*  79 */     this.f = bool;
/*  80 */     this.g = l;
/*  81 */     this.h = (i * j * ☃.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  86 */     return "NativeImage[" + this.c + " " + this.d + "x" + this.e + "@" + this.g + (this.f ? "S" : "N") + "]";
/*     */   }
/*     */   
/*     */   public static det a(InputStream ☃) throws IOException {
/*  90 */     return a(a.a, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public static det a(@Nullable a ☃, InputStream inputStream) throws IOException {
/*  95 */     ByteBuffer byteBuffer = null;
/*     */     try {
/*  97 */       byteBuffer = dex.a(inputStream);
/*  98 */       byteBuffer.rewind();
/*  99 */       return a(☃, byteBuffer);
/*     */     } finally {
/* 101 */       MemoryUtil.memFree(byteBuffer);
/* 102 */       IOUtils.closeQuietly(inputStream);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static det a(ByteBuffer ☃) throws IOException {
/* 107 */     return a(a.a, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public static det a(@Nullable a ☃, ByteBuffer byteBuffer) throws IOException {
/* 112 */     if (☃ != null && !☃.i()) {
/* 113 */       throw new UnsupportedOperationException("Don't know how to read format " + ☃);
/*     */     }
/* 115 */     if (MemoryUtil.memAddress(byteBuffer) == 0L) {
/* 116 */       throw new IllegalArgumentException("Invalid buffer");
/*     */     }
/* 118 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/* 119 */       IntBuffer intBuffer1 = memoryStack.mallocInt(1);
/* 120 */       IntBuffer intBuffer2 = memoryStack.mallocInt(1);
/* 121 */       IntBuffer intBuffer3 = memoryStack.mallocInt(1);
/*     */       
/* 123 */       ByteBuffer byteBuffer1 = STBImage.stbi_load_from_memory(byteBuffer, intBuffer1, intBuffer2, intBuffer3, (☃ == null) ? 0 : a.a(☃));
/* 124 */       if (byteBuffer1 == null) {
/* 125 */         throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
/*     */       }
/* 127 */       return new det((☃ == null) ? a.a(intBuffer3.get(0)) : ☃, intBuffer1.get(0), intBuffer2.get(0), true, MemoryUtil.memAddress(byteBuffer1));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(boolean ☃) {
/* 132 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 133 */     if (☃) {
/* 134 */       dem.b(3553, 10242, 10496);
/* 135 */       dem.b(3553, 10243, 10496);
/*     */     } else {
/* 137 */       dem.b(3553, 10242, 10497);
/* 138 */       dem.b(3553, 10243, 10497);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(boolean ☃, boolean bool1) {
/* 143 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 144 */     if (☃) {
/* 145 */       dem.b(3553, 10241, bool1 ? 9987 : 9729);
/* 146 */       dem.b(3553, 10240, 9729);
/*     */     } else {
/* 148 */       dem.b(3553, 10241, bool1 ? 9986 : 9728);
/* 149 */       dem.b(3553, 10240, 9728);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void h() {
/* 154 */     if (this.g == 0L) {
/* 155 */       throw new IllegalStateException("Image is not allocated.");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/* 163 */     if (this.g != 0L) {
/* 164 */       if (this.f) {
/* 165 */         STBImage.nstbi_image_free(this.g);
/*     */       } else {
/* 167 */         MemoryUtil.nmemFree(this.g);
/*     */       } 
/*     */     }
/* 170 */     this.g = 0L;
/*     */   }
/*     */   
/*     */   public int a() {
/* 174 */     return this.d;
/*     */   }
/*     */   
/*     */   public int b() {
/* 178 */     return this.e;
/*     */   }
/*     */   
/*     */   public a c() {
/* 182 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int ☃, int i) {
/* 188 */     if (this.c != a.a)
/* 189 */       throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", new Object[] { this.c })); 
/* 190 */     if (☃ > this.d || i > this.e) {
/* 191 */       throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", new Object[] { Integer.valueOf(☃), Integer.valueOf(i), Integer.valueOf(this.d), Integer.valueOf(this.e) }));
/*     */     }
/* 193 */     h();
/* 194 */     long l = ((☃ + i * this.d) * 4);
/* 195 */     return MemoryUtil.memGetInt(this.g + l);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 201 */     if (this.c != a.a)
/* 202 */       throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", new Object[] { this.c })); 
/* 203 */     if (☃ > this.d || i > this.e) {
/* 204 */       throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", new Object[] { Integer.valueOf(☃), Integer.valueOf(i), Integer.valueOf(this.d), Integer.valueOf(this.e) }));
/*     */     }
/* 206 */     h();
/* 207 */     long l = ((☃ + i * this.d) * 4);
/* 208 */     MemoryUtil.memPutInt(this.g + l, j);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte b(int ☃, int i) {
/* 262 */     if (!this.c.g())
/* 263 */       throw new IllegalArgumentException(String.format("no luminance or alpha in %s", new Object[] { this.c })); 
/* 264 */     if (☃ > this.d || i > this.e) {
/* 265 */       throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", new Object[] { Integer.valueOf(☃), Integer.valueOf(i), Integer.valueOf(this.d), Integer.valueOf(this.e) }));
/*     */     }
/*     */     
/* 268 */     int j = (☃ + i * this.d) * this.c.a() + this.c.h() / 8;
/* 269 */     return MemoryUtil.memGetByte(this.g + j);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public int[] d() {
/* 324 */     if (this.c != a.a) {
/* 325 */       throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
/*     */     }
/* 327 */     h();
/* 328 */     int[] ☃ = new int[a() * b()];
/* 329 */     for (int i = 0; i < b(); i++) {
/* 330 */       for (int j = 0; j < a(); j++) {
/* 331 */         int k = a(j, i);
/* 332 */         int m = a(k);
/* 333 */         int n = d(k);
/* 334 */         int i1 = c(k);
/* 335 */         int i2 = b(k);
/* 336 */         int i3 = m << 24 | i2 << 16 | i1 << 8 | n;
/* 337 */         ☃[j + i * a()] = i3;
/*     */       } 
/*     */     } 
/* 340 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool) {
/* 344 */     a(☃, i, j, 0, 0, this.d, this.e, false, bool);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, int k, int m, int n, int i1, boolean bool1, boolean bool2) {
/* 348 */     a(☃, i, j, k, m, n, i1, false, false, bool1, bool2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, int k, int m, int n, int i1, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/* 354 */     if (!RenderSystem.isOnRenderThreadOrInit()) {
/* 355 */       RenderSystem.recordRenderCall(() -> b(☃, i, j, k, m, n, i1, bool1, bool2, bool3, bool4));
/*     */     }
/*     */     else {
/*     */       
/* 359 */       b(☃, i, j, k, m, n, i1, bool1, bool2, bool3, bool4);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(int ☃, int i, int j, int k, int m, int n, int i1, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/* 364 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 365 */     h();
/* 366 */     a(bool1, bool3);
/* 367 */     a(bool2);
/*     */ 
/*     */     
/* 370 */     if (n == a()) {
/* 371 */       dem.n(3314, 0);
/*     */     } else {
/* 373 */       dem.n(3314, a());
/*     */     } 
/* 375 */     dem.n(3316, k);
/* 376 */     dem.n(3315, m);
/*     */     
/* 378 */     this.c.c();
/*     */     
/* 380 */     dem.a(3553, ☃, i, j, n, i1, this.c.d(), 5121, this.g);
/* 381 */     if (bool4) {
/* 382 */       close();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int ☃, boolean bool) {
/* 387 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 388 */     h();
/*     */     
/* 390 */     this.c.b();
/*     */     
/* 392 */     dem.a(3553, ☃, this.c.d(), 5121, this.g);
/*     */     
/* 394 */     if (bool && this.c.e()) {
/* 395 */       for (int i = 0; i < b(); i++) {
/* 396 */         for (int j = 0; j < a(); j++) {
/* 397 */           a(j, i, a(j, i) | 255 << this.c.f());
/*     */         }
/*     */       } 
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(File ☃) throws IOException {
/* 446 */     a(☃.toPath());
/*     */   }
/*     */   
/*     */   public void a(STBTTFontinfo ☃, int i, int j, int k, float f1, float f2, float f3, float f4, int m, int n) {
/* 450 */     if (m < 0 || m + j > a() || n < 0 || n + k > b()) {
/* 451 */       throw new IllegalArgumentException(String.format("Out of bounds: start: (%s, %s) (size: %sx%s); size: %sx%s", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(a()), Integer.valueOf(b()) }));
/*     */     }
/* 453 */     if (this.c.a() != 1) {
/* 454 */       throw new IllegalArgumentException("Can only write fonts into 1-component images.");
/*     */     }
/* 456 */     STBTruetype.nstbtt_MakeGlyphBitmapSubpixel(☃.address(), this.g + m + (n * a()), j, k, a(), f1, f2, f3, f4, i);
/*     */   }
/*     */   
/*     */   static class c extends STBIWriteCallback {
/*     */     private final WritableByteChannel a;
/*     */     @Nullable
/*     */     private IOException b;
/*     */     
/*     */     private c(WritableByteChannel ☃) {
/* 465 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void invoke(long ☃, long l1, int i) {
/* 470 */       ByteBuffer byteBuffer = getData(l1, i);
/*     */       try {
/* 472 */         this.a.write(byteBuffer);
/* 473 */       } catch (IOException iOException) {
/* 474 */         this.b = iOException;
/*     */       } 
/*     */     }
/*     */     
/*     */     public void a() throws IOException {
/* 479 */       if (this.b != null) {
/* 480 */         throw this.b;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Path ☃) throws IOException {
/* 487 */     if (!this.c.i()) {
/* 488 */       throw new UnsupportedOperationException("Don't know how to write format " + this.c);
/*     */     }
/* 490 */     h();
/* 491 */     try (WritableByteChannel ☃ = Files.newByteChannel(☃, (Set)b, (FileAttribute<?>[])new FileAttribute[0])) {
/* 492 */       if (!a(writableByteChannel)) {
/* 493 */         throw new IOException("Could not write image to the PNG file \"" + ☃.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public byte[] e() throws IOException {
/* 500 */     try(ByteArrayOutputStream ☃ = new ByteArrayOutputStream(); 
/* 501 */         WritableByteChannel ☃ = Channels.newChannel(☃)) {
/*     */       
/* 503 */       if (!a(writableByteChannel)) {
/* 504 */         throw new IOException("Could not write image to byte array: " + STBImage.stbi_failure_reason());
/*     */       }
/*     */       
/* 507 */       return ☃.toByteArray();
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(WritableByteChannel ☃) throws IOException {
/* 512 */     c c = new c(☃);
/*     */     try {
/* 514 */       int i = Math.min(b(), Integer.MAX_VALUE / a() / this.c.a());
/* 515 */       if (i < b()) {
/* 516 */         a.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", Integer.valueOf(b()), Integer.valueOf(i));
/*     */       }
/* 518 */       if (STBImageWrite.nstbi_write_png_to_func(c.address(), 0L, a(), i, this.c.a(), this.g, 0) == 0) {
/* 519 */         return false;
/*     */       }
/*     */       
/* 522 */       c.a();
/* 523 */       return true;
/*     */     } finally {
/* 525 */       c.free();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(det ☃) {
/* 534 */     if (☃.c() != this.c) {
/* 535 */       throw new UnsupportedOperationException("Image formats don't match.");
/*     */     }
/* 537 */     int i = this.c.a();
/* 538 */     h();
/* 539 */     ☃.h();
/* 540 */     if (this.d == ☃.d) {
/* 541 */       MemoryUtil.memCopy(☃.g, this.g, Math.min(this.h, ☃.h));
/*     */     } else {
/* 543 */       int j = Math.min(a(), ☃.a());
/* 544 */       int k = Math.min(b(), ☃.b());
/* 545 */       for (int m = 0; m < k; m++) {
/* 546 */         int n = m * ☃.a() * i;
/* 547 */         int i1 = m * a() * i;
/* 548 */         MemoryUtil.memCopy(☃.g + n, this.g + i1, j);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, int k, int m) {
/* 555 */     for (int n = i; n < i + k; n++) {
/* 556 */       for (int i1 = ☃; i1 < ☃ + j; i1++) {
/* 557 */         a(i1, n, m);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, int k, int m, int n, boolean bool1, boolean bool2) {
/* 565 */     for (int i1 = 0; i1 < n; i1++) {
/* 566 */       for (int i2 = 0; i2 < m; i2++) {
/* 567 */         int i3 = bool1 ? (m - 1 - i2) : i2;
/* 568 */         int i4 = bool2 ? (n - 1 - i1) : i1;
/* 569 */         int i5 = a(☃ + i2, i + i1);
/* 570 */         a(☃ + j + i3, i + k + i4, i5);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void f() {
/* 577 */     h();
/* 578 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/* 579 */       int i = this.c.a();
/* 580 */       int j = a() * i;
/* 581 */       long l = ☃.nmalloc(j);
/* 582 */       for (int k = 0; k < b() / 2; k++) {
/* 583 */         int m = k * a() * i;
/* 584 */         int n = (b() - 1 - k) * a() * i;
/* 585 */         MemoryUtil.memCopy(this.g + m, l, j);
/* 586 */         MemoryUtil.memCopy(this.g + n, this.g + m, j);
/* 587 */         MemoryUtil.memCopy(l, this.g + n, j);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, int k, det det1) {
/* 595 */     h();
/* 596 */     if (det1.c() != this.c) {
/* 597 */       throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
/*     */     }
/* 599 */     int m = this.c.a();
/* 600 */     STBImageResize.nstbir_resize_uint8(this.g + ((☃ + i * 
/* 601 */         a()) * m), j, k, a() * m, det1.g, det1
/* 602 */         .a(), det1.b(), 0, m);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {
/* 608 */     dei.a(this.g);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static det a(String ☃) throws IOException {
/* 614 */     byte[] arrayOfByte = Base64.getDecoder().decode(☃.replaceAll("\n", "").getBytes(Charsets.UTF_8));
/* 615 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/* 616 */       ByteBuffer byteBuffer = memoryStack.malloc(arrayOfByte.length);
/* 617 */       byteBuffer.put(arrayOfByte);
/* 618 */       byteBuffer.rewind();
/* 619 */       return a(byteBuffer);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int a(int ☃) {
/* 624 */     return ☃ >> 24 & 0xFF;
/*     */   }
/*     */   
/*     */   public static int b(int ☃) {
/* 628 */     return ☃ >> 0 & 0xFF;
/*     */   }
/*     */   
/*     */   public static int c(int ☃) {
/* 632 */     return ☃ >> 8 & 0xFF;
/*     */   }
/*     */   
/*     */   public static int d(int ☃) {
/* 636 */     return ☃ >> 16 & 0xFF;
/*     */   }
/*     */   
/*     */   public static int a(int ☃, int i, int j, int k) {
/* 640 */     return (☃ & 0xFF) << 24 | (i & 0xFF) << 16 | (j & 0xFF) << 8 | (k & 0xFF) << 0;
/*     */   }
/*     */   
/*     */   public enum b {
/* 644 */     a(6408),
/* 645 */     b(6407),
/* 646 */     c(6410),
/* 647 */     d(6409),
/* 648 */     e(32841);
/*     */     
/*     */     private final int f;
/*     */ 
/*     */     
/*     */     b(int ☃) {
/* 654 */       this.f = ☃;
/*     */     }
/*     */     
/*     */     int a() {
/* 658 */       return this.f;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public enum a
/*     */   {
/* 666 */     a(4, 6408, true, true, true, false, true, 0, 8, 16, 255, 24, true),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 672 */     b(3, 6407, true, true, true, false, false, 0, 8, 16, 255, 255, true),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 678 */     c(2, 6410, false, false, false, true, true, 255, 255, 255, 0, 8, true),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 684 */     d(1, 6409, false, false, false, true, false, 0, 0, 0, 0, 255, true);
/*     */     
/*     */     private final int e;
/*     */     
/*     */     private final int f;
/*     */     
/*     */     private final boolean g;
/*     */     
/*     */     private final boolean h;
/*     */     
/*     */     private final boolean i;
/*     */     
/*     */     private final boolean j;
/*     */     
/*     */     private final boolean k;
/*     */     
/*     */     private final int l;
/*     */     
/*     */     private final int m;
/*     */     
/*     */     private final int n;
/*     */     private final int o;
/*     */     private final int p;
/*     */     private final boolean q;
/*     */     
/*     */     a(int ☃, int i, boolean bool1, boolean bool2, boolean bool3, boolean bool4, boolean bool5, int j, int k, int m, int n, int i1, boolean bool6) {
/* 710 */       this.e = ☃;
/* 711 */       this.f = i;
/* 712 */       this.g = bool1;
/* 713 */       this.h = bool2;
/* 714 */       this.i = bool3;
/* 715 */       this.j = bool4;
/* 716 */       this.k = bool5;
/* 717 */       this.l = j;
/* 718 */       this.m = k;
/* 719 */       this.n = m;
/* 720 */       this.o = n;
/* 721 */       this.p = i1;
/* 722 */       this.q = bool6;
/*     */     }
/*     */     
/*     */     public int a() {
/* 726 */       return this.e;
/*     */     }
/*     */     
/*     */     public void b() {
/* 730 */       RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 731 */       dem.n(3333, a());
/*     */     }
/*     */     
/*     */     public void c() {
/* 735 */       RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 736 */       dem.n(3317, a());
/*     */     }
/*     */     
/*     */     public int d() {
/* 740 */       return this.f;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean e() {
/* 760 */       return this.k;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int f() {
/* 780 */       return this.p;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean g() {
/* 796 */       return (this.j || this.k);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int h() {
/* 812 */       return this.j ? this.o : this.p;
/*     */     }
/*     */     
/*     */     public boolean i() {
/* 816 */       return this.q;
/*     */     }
/*     */     
/*     */     private static a b(int ☃) {
/* 820 */       switch (☃) {
/*     */         case 1:
/* 822 */           return d;
/*     */         case 2:
/* 824 */           return c;
/*     */         case 3:
/* 826 */           return b;
/*     */       } 
/*     */       
/* 829 */       return a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\det.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */