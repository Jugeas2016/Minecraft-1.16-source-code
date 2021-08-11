/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.channels.FileChannel;
/*     */ import java.nio.file.CopyOption;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.OpenOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.StandardCopyOption;
/*     */ import java.nio.file.StandardOpenOption;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cgy
/*     */   implements AutoCloseable
/*     */ {
/*  86 */   private static final Logger b = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   private static final ByteBuffer c = ByteBuffer.allocateDirect(1);
/*     */   
/*     */   private final FileChannel d;
/*     */   
/*     */   private final Path e;
/*     */   
/*     */   private final cha f;
/*     */   
/* 103 */   private final ByteBuffer g = ByteBuffer.allocateDirect(8192);
/*     */   private final IntBuffer h;
/*     */   private final IntBuffer i;
/*     */   @VisibleForTesting
/* 107 */   protected final cgx a = new cgx();
/*     */ 
/*     */   
/*     */   public cgy(File ☃, File file1, boolean bool) throws IOException {
/* 111 */     this(☃.toPath(), file1.toPath(), cha.b, bool);
/*     */   }
/*     */   
/*     */   public cgy(Path ☃, Path path1, cha cha1, boolean bool) throws IOException {
/* 115 */     this.f = cha1;
/* 116 */     if (!Files.isDirectory(path1, new java.nio.file.LinkOption[0])) {
/* 117 */       throw new IllegalArgumentException("Expected directory, got " + path1.toAbsolutePath());
/*     */     }
/* 119 */     this.e = path1;
/* 120 */     this.h = this.g.asIntBuffer();
/* 121 */     this.h.limit(1024);
/* 122 */     this.g.position(4096);
/* 123 */     this.i = this.g.asIntBuffer();
/*     */     
/* 125 */     if (bool) {
/* 126 */       this.d = FileChannel.open(☃, new OpenOption[] { StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC });
/*     */     } else {
/* 128 */       this.d = FileChannel.open(☃, new OpenOption[] { StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE });
/*     */     } 
/*     */ 
/*     */     
/* 132 */     this.a.a(0, 2);
/*     */     
/* 134 */     this.g.position(0);
/* 135 */     int i = this.d.read(this.g, 0L);
/* 136 */     if (i != -1) {
/* 137 */       if (i != 8192) {
/* 138 */         b.warn("Region file {} has truncated header: {}", ☃, Integer.valueOf(i));
/*     */       }
/*     */       
/* 141 */       long l = Files.size(☃);
/* 142 */       for (int j = 0; j < 1024; j++) {
/* 143 */         int k = this.h.get(j);
/* 144 */         if (k != 0) {
/* 145 */           int m = b(k);
/* 146 */           int n = a(k);
/* 147 */           if (m < 2) {
/* 148 */             b.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", ☃, Integer.valueOf(j), Integer.valueOf(m));
/* 149 */             this.h.put(j, 0);
/* 150 */           } else if (n == 0) {
/* 151 */             b.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", ☃, Integer.valueOf(j));
/* 152 */             this.h.put(j, 0);
/* 153 */           } else if (m * 4096L > l) {
/* 154 */             b.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", ☃, Integer.valueOf(j), Integer.valueOf(m));
/* 155 */             this.h.put(j, 0);
/*     */           } else {
/* 157 */             this.a.a(m, n);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private Path e(brd ☃) {
/* 165 */     String str = "c." + ☃.b + "." + ☃.c + ".mcc";
/* 166 */     return this.e.resolve(str);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public synchronized DataInputStream a(brd ☃) throws IOException {
/* 171 */     int i = f(☃);
/* 172 */     if (i == 0) {
/* 173 */       return null;
/*     */     }
/*     */     
/* 176 */     int j = b(i);
/* 177 */     int k = a(i);
/*     */     
/* 179 */     int m = k * 4096;
/* 180 */     ByteBuffer byteBuffer = ByteBuffer.allocate(m);
/* 181 */     this.d.read(byteBuffer, (j * 4096));
/* 182 */     byteBuffer.flip();
/*     */     
/* 184 */     if (byteBuffer.remaining() < 5) {
/* 185 */       b.error("Chunk {} header is truncated: expected {} but read {}", ☃, Integer.valueOf(m), Integer.valueOf(byteBuffer.remaining()));
/* 186 */       return null;
/*     */     } 
/*     */     
/* 189 */     int n = byteBuffer.getInt();
/* 190 */     byte b = byteBuffer.get();
/*     */     
/* 192 */     if (n == 0) {
/* 193 */       b.warn("Chunk {} is allocated, but stream is missing", ☃);
/* 194 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 198 */     int i1 = n - 1;
/*     */     
/* 200 */     if (a(b)) {
/* 201 */       if (i1 != 0) {
/* 202 */         b.warn("Chunk has both internal and external streams");
/*     */       }
/* 204 */       return a(☃, b(b));
/*     */     } 
/*     */     
/* 207 */     if (i1 > byteBuffer.remaining()) {
/* 208 */       b.error("Chunk {} stream is truncated: expected {} but read {}", ☃, Integer.valueOf(i1), Integer.valueOf(byteBuffer.remaining()));
/* 209 */       return null;
/*     */     } 
/*     */     
/* 212 */     if (i1 < 0) {
/* 213 */       b.error("Declared size {} of chunk {} is negative", Integer.valueOf(n), ☃);
/* 214 */       return null;
/*     */     } 
/*     */     
/* 217 */     return a(☃, b, a(byteBuffer, i1));
/*     */   }
/*     */   
/*     */   private static boolean a(byte ☃) {
/* 221 */     return ((☃ & 0x80) != 0);
/*     */   }
/*     */   
/*     */   private static byte b(byte ☃) {
/* 225 */     return (byte)(☃ & 0xFFFFFF7F);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private DataInputStream a(brd ☃, byte b, InputStream inputStream) throws IOException {
/* 230 */     cha cha1 = cha.a(b);
/* 231 */     if (cha1 == null) {
/* 232 */       b.error("Chunk {} has invalid chunk stream version {}", ☃, Byte.valueOf(b));
/* 233 */       return null;
/*     */     } 
/* 235 */     return new DataInputStream(new BufferedInputStream(cha1.a(inputStream)));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private DataInputStream a(brd ☃, byte b) throws IOException {
/* 240 */     Path path = e(☃);
/* 241 */     if (!Files.isRegularFile(path, new java.nio.file.LinkOption[0])) {
/* 242 */       b.error("External chunk path {} is not file", path);
/* 243 */       return null;
/*     */     } 
/*     */     
/* 246 */     return a(☃, b, Files.newInputStream(path, new OpenOption[0]));
/*     */   }
/*     */   
/*     */   private static ByteArrayInputStream a(ByteBuffer ☃, int i) {
/* 250 */     return new ByteArrayInputStream(☃.array(), ☃.position(), i);
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i) {
/* 254 */     return ☃ << 8 | i;
/*     */   }
/*     */   
/*     */   private static int a(int ☃) {
/* 258 */     return ☃ & 0xFF;
/*     */   }
/*     */   
/*     */   private static int b(int ☃) {
/* 262 */     return ☃ >> 8 & 0xFFFFFF;
/*     */   }
/*     */   
/*     */   private static int c(int ☃) {
/* 266 */     return (☃ + 4096 - 1) / 4096;
/*     */   }
/*     */   
/*     */   public boolean b(brd ☃) {
/* 270 */     int i = f(☃);
/* 271 */     if (i == 0) {
/* 272 */       return false;
/*     */     }
/*     */     
/* 275 */     int j = b(i);
/* 276 */     int k = a(i);
/*     */     
/* 278 */     ByteBuffer byteBuffer = ByteBuffer.allocate(5);
/*     */     try {
/* 280 */       this.d.read(byteBuffer, (j * 4096));
/* 281 */       byteBuffer.flip();
/* 282 */       if (byteBuffer.remaining() != 5) {
/* 283 */         return false;
/*     */       }
/*     */       
/* 286 */       int m = byteBuffer.getInt();
/* 287 */       byte b = byteBuffer.get();
/* 288 */       if (a(b)) {
/* 289 */         if (!cha.b(b(b))) {
/* 290 */           return false;
/*     */         }
/*     */         
/* 293 */         if (!Files.isRegularFile(e(☃), new java.nio.file.LinkOption[0])) {
/* 294 */           return false;
/*     */         }
/*     */       } else {
/* 297 */         if (!cha.b(b)) {
/* 298 */           return false;
/*     */         }
/*     */         
/* 301 */         if (m == 0) {
/* 302 */           return false;
/*     */         }
/*     */         
/* 305 */         int n = m - 1;
/* 306 */         if (n < 0 || n > 4096 * k) {
/* 307 */           return false;
/*     */         }
/*     */       } 
/* 310 */     } catch (IOException iOException) {
/* 311 */       return false;
/*     */     } 
/*     */     
/* 314 */     return true;
/*     */   }
/*     */   
/*     */   public DataOutputStream c(brd ☃) throws IOException {
/* 318 */     return new DataOutputStream(new BufferedOutputStream(this.f.a(new a(this, ☃))));
/*     */   }
/*     */   
/*     */   public void a() throws IOException {
/* 322 */     this.d.force(true);
/*     */   }
/*     */   
/*     */   static interface b {
/*     */     void run() throws IOException;
/*     */   }
/*     */   
/*     */   class a extends ByteArrayOutputStream {
/*     */     private final brd b;
/*     */     
/*     */     public a(cgy this$0, brd ☃) {
/* 333 */       super(8096);
/*     */ 
/*     */       
/* 336 */       write(0);
/* 337 */       write(0);
/* 338 */       write(0);
/* 339 */       write(0);
/*     */       
/* 341 */       write(cgy.a(this$0).a());
/* 342 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 347 */       ByteBuffer ☃ = ByteBuffer.wrap(this.buf, 0, this.count);
/*     */       
/* 349 */       ☃.putInt(0, this.count - 5 + 1);
/* 350 */       this.a.a(this.b, ☃);
/*     */     } }
/*     */   protected synchronized void a(brd ☃, ByteBuffer byteBuffer) throws IOException {
/*     */     int i2;
/*     */     b b;
/* 355 */     int i = g(☃);
/* 356 */     int j = this.h.get(i);
/* 357 */     int k = b(j);
/* 358 */     int m = a(j);
/*     */     
/* 360 */     int n = byteBuffer.remaining();
/* 361 */     int i1 = c(n);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 366 */     if (i1 >= 256) {
/* 367 */       Path path = e(☃);
/* 368 */       b.warn("Saving oversized chunk {} ({} bytes} to external file {}", ☃, Integer.valueOf(n), path);
/* 369 */       i1 = 1;
/* 370 */       i2 = this.a.a(i1);
/* 371 */       b = a(path, byteBuffer);
/* 372 */       ByteBuffer byteBuffer1 = b();
/* 373 */       this.d.write(byteBuffer1, (i2 * 4096));
/*     */     } else {
/* 375 */       i2 = this.a.a(i1);
/* 376 */       b = (() -> Files.deleteIfExists(e(☃)));
/* 377 */       this.d.write(byteBuffer, (i2 * 4096));
/*     */     } 
/*     */     
/* 380 */     int i3 = (int)(x.d() / 1000L);
/* 381 */     this.h.put(i, a(i2, i1));
/* 382 */     this.i.put(i, i3);
/* 383 */     c();
/*     */     
/* 385 */     b.run();
/*     */     
/* 387 */     if (k != 0) {
/* 388 */       this.a.b(k, m);
/*     */     }
/*     */   }
/*     */   
/*     */   private ByteBuffer b() {
/* 393 */     ByteBuffer ☃ = ByteBuffer.allocate(5);
/* 394 */     ☃.putInt(1);
/* 395 */     ☃.put((byte)(this.f.a() | 0x80));
/* 396 */     ☃.flip();
/* 397 */     return ☃;
/*     */   }
/*     */   
/*     */   private b a(Path ☃, ByteBuffer byteBuffer) throws IOException {
/* 401 */     Path path = Files.createTempFile(this.e, "tmp", null, (FileAttribute<?>[])new FileAttribute[0]);
/* 402 */     try (FileChannel ☃ = FileChannel.open(path, new OpenOption[] { StandardOpenOption.CREATE, StandardOpenOption.WRITE })) {
/* 403 */       byteBuffer.position(5);
/* 404 */       fileChannel.write(byteBuffer);
/*     */     } 
/* 406 */     return () -> Files.move(☃, path1, new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
/*     */   }
/*     */   
/*     */   private void c() throws IOException {
/* 410 */     this.g.position(0);
/* 411 */     this.d.write(this.g, 0L);
/*     */   }
/*     */   
/*     */   private int f(brd ☃) {
/* 415 */     return this.h.get(g(☃));
/*     */   }
/*     */   
/*     */   public boolean d(brd ☃) {
/* 419 */     return (f(☃) != 0);
/*     */   }
/*     */   
/*     */   private static int g(brd ☃) {
/* 423 */     return ☃.j() + ☃.k() * 32;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/*     */     try {
/* 429 */       d();
/*     */     } finally {
/*     */       try {
/* 432 */         this.d.force(true);
/*     */       } finally {
/* 434 */         this.d.close();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void d() throws IOException {
/* 442 */     int ☃ = (int)this.d.size();
/* 443 */     int i = c(☃) * 4096;
/* 444 */     if (☃ != i) {
/* 445 */       ByteBuffer byteBuffer = c.duplicate();
/* 446 */       byteBuffer.position(0);
/* 447 */       this.d.write(byteBuffer, (i - 1));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */