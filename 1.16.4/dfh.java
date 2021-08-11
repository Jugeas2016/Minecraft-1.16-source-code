/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.primitives.Floats;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrays;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.util.BitSet;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dfh
/*     */   extends dfl
/*     */   implements dfj
/*     */ {
/*  22 */   private static final Logger g = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private ByteBuffer h;
/*     */   
/*  27 */   private final List<a> i = Lists.newArrayList();
/*  28 */   private int j = 0;
/*     */   
/*  30 */   private int k = 0;
/*  31 */   private int l = 0;
/*  32 */   private int m = 0;
/*     */   
/*     */   private int n;
/*     */   
/*     */   @Nullable
/*     */   private dfs o;
/*     */   
/*     */   private int p;
/*     */   private int q;
/*     */   private dfr r;
/*     */   private boolean s;
/*     */   private boolean t;
/*     */   private boolean u;
/*     */   
/*     */   public dfh(int ☃) {
/*  47 */     this.h = deq.a(☃ * 4);
/*     */   }
/*     */   
/*     */   protected void a() {
/*  51 */     c(this.r.b());
/*     */   }
/*     */   
/*     */   private void c(int ☃) {
/*  55 */     if (this.l + ☃ <= this.h.capacity()) {
/*     */       return;
/*     */     }
/*     */     
/*  59 */     int i = this.h.capacity();
/*  60 */     int j = i + d(☃);
/*  61 */     g.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", Integer.valueOf(i), Integer.valueOf(j));
/*     */     
/*  63 */     ByteBuffer byteBuffer = deq.a(j);
/*  64 */     this.h.position(0);
/*  65 */     byteBuffer.put(this.h);
/*  66 */     byteBuffer.rewind();
/*     */     
/*  68 */     this.h = byteBuffer;
/*     */   }
/*     */   
/*     */   private static int d(int ☃) {
/*  72 */     int i = 2097152;
/*     */     
/*  74 */     if (☃ == 0) {
/*  75 */       return i;
/*     */     }
/*     */     
/*  78 */     if (☃ < 0) {
/*  79 */       i *= -1;
/*     */     }
/*     */     
/*  82 */     int j = ☃ % i;
/*  83 */     if (j == 0) {
/*  84 */       return ☃;
/*     */     }
/*  86 */     return ☃ + i - j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/*  93 */     this.h.clear();
/*  94 */     FloatBuffer floatBuffer1 = this.h.asFloatBuffer();
/*     */     
/*  96 */     int i = this.n / 4;
/*  97 */     float[] arrayOfFloat = new float[i];
/*  98 */     for (int j = 0; j < i; j++) {
/*  99 */       arrayOfFloat[j] = a(floatBuffer1, ☃, f1, f2, this.r.a(), this.k / 4 + j * this.r.b());
/*     */     }
/*     */     
/* 102 */     int[] arrayOfInt = new int[i];
/* 103 */     for (int k = 0; k < arrayOfInt.length; k++) {
/* 104 */       arrayOfInt[k] = k;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 109 */     IntArrays.mergeSort(arrayOfInt, (i, j) -> Floats.compare(☃[j], ☃[i]));
/*     */ 
/*     */     
/* 112 */     BitSet bitSet = new BitSet();
/*     */ 
/*     */     
/* 115 */     FloatBuffer floatBuffer2 = deq.b(this.r.a() * 4);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     int m = bitSet.nextClearBit(0);
/* 123 */     while (m < arrayOfInt.length) {
/* 124 */       int n = arrayOfInt[m];
/*     */ 
/*     */       
/* 127 */       if (n != m) {
/*     */         
/* 129 */         a(floatBuffer1, n);
/* 130 */         floatBuffer2.clear();
/* 131 */         floatBuffer2.put(floatBuffer1);
/*     */         
/* 133 */         int i1 = n;
/* 134 */         int i2 = arrayOfInt[i1];
/*     */         
/* 136 */         while (i1 != m) {
/*     */           
/* 138 */           a(floatBuffer1, i2);
/* 139 */           FloatBuffer floatBuffer = floatBuffer1.slice();
/*     */           
/* 141 */           a(floatBuffer1, i1);
/* 142 */           floatBuffer1.put(floatBuffer);
/*     */           
/* 144 */           bitSet.set(i1);
/*     */           
/* 146 */           i1 = i2;
/* 147 */           i2 = arrayOfInt[i1];
/*     */         } 
/*     */ 
/*     */         
/* 151 */         a(floatBuffer1, m);
/* 152 */         floatBuffer2.flip();
/* 153 */         floatBuffer1.put(floatBuffer2);
/*     */       } 
/* 155 */       bitSet.set(m);
/*     */       
/* 157 */       m = bitSet.nextClearBit(m + 1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(FloatBuffer ☃, int i) {
/* 162 */     int j = this.r.a() * 4;
/* 163 */     ☃.limit(this.k / 4 + (i + 1) * j);
/* 164 */     ☃.position(this.k / 4 + i * j);
/*     */   }
/*     */   
/*     */   public b b() {
/* 168 */     this.h.limit(this.l);
/* 169 */     this.h.position(this.k);
/* 170 */     ByteBuffer ☃ = ByteBuffer.allocate(this.n * this.r.b());
/* 171 */     ☃.put(this.h);
/* 172 */     this.h.clear();
/* 173 */     return new b(☃, this.r);
/*     */   }
/*     */   
/*     */   private static float a(FloatBuffer ☃, float f1, float f2, float f3, int i, int j) {
/* 177 */     float f4 = ☃.get(j + i * 0 + 0);
/* 178 */     float f5 = ☃.get(j + i * 0 + 1);
/* 179 */     float f6 = ☃.get(j + i * 0 + 2);
/* 180 */     float f7 = ☃.get(j + i * 1 + 0);
/* 181 */     float f8 = ☃.get(j + i * 1 + 1);
/* 182 */     float f9 = ☃.get(j + i * 1 + 2);
/* 183 */     float f10 = ☃.get(j + i * 2 + 0);
/* 184 */     float f11 = ☃.get(j + i * 2 + 1);
/* 185 */     float f12 = ☃.get(j + i * 2 + 2);
/* 186 */     float f13 = ☃.get(j + i * 3 + 0);
/* 187 */     float f14 = ☃.get(j + i * 3 + 1);
/* 188 */     float f15 = ☃.get(j + i * 3 + 2);
/*     */     
/* 190 */     float f16 = (f4 + f7 + f10 + f13) * 0.25F - f1;
/* 191 */     float f17 = (f5 + f8 + f11 + f14) * 0.25F - f2;
/* 192 */     float f18 = (f6 + f9 + f12 + f15) * 0.25F - f3;
/*     */     
/* 194 */     return f16 * f16 + f17 * f17 + f18 * f18;
/*     */   }
/*     */   
/*     */   public void a(b ☃) {
/* 198 */     b.a(☃).clear();
/* 199 */     int i = b.a(☃).capacity();
/* 200 */     c(i);
/*     */     
/* 202 */     this.h.limit(this.h.capacity());
/* 203 */     this.h.position(this.k);
/* 204 */     this.h.put(b.a(☃));
/* 205 */     this.h.clear();
/*     */     
/* 207 */     dfr dfr1 = b.b(☃);
/* 208 */     a(dfr1);
/* 209 */     this.n = i / dfr1.b();
/* 210 */     this.l = this.k + this.n * dfr1.b();
/*     */   }
/*     */   
/*     */   public void a(int ☃, dfr dfr1) {
/* 214 */     if (this.u) {
/* 215 */       throw new IllegalStateException("Already building!");
/*     */     }
/* 217 */     this.u = true;
/*     */     
/* 219 */     this.q = ☃;
/* 220 */     a(dfr1);
/*     */     
/* 222 */     this.o = (dfs)dfr1.c().get(0);
/* 223 */     this.p = 0;
/* 224 */     this.h.clear();
/*     */   }
/*     */   
/*     */   private void a(dfr ☃) {
/* 228 */     if (this.r == ☃) {
/*     */       return;
/*     */     }
/*     */     
/* 232 */     this.r = ☃;
/*     */     
/* 234 */     boolean bool1 = (☃ == dfk.i);
/* 235 */     boolean bool2 = (☃ == dfk.h);
/*     */     
/* 237 */     this.s = (bool1 || bool2);
/* 238 */     this.t = bool1;
/*     */   }
/*     */   
/*     */   public void c() {
/* 242 */     if (!this.u) {
/* 243 */       throw new IllegalStateException("Not building!");
/*     */     }
/* 245 */     this.u = false;
/*     */     
/* 247 */     this.i.add(new a(this.r, this.n, this.q));
/* 248 */     this.k += this.n * this.r.b();
/*     */     
/* 250 */     this.n = 0;
/* 251 */     this.o = null;
/* 252 */     this.p = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, byte b) {
/* 257 */     this.h.put(this.l + ☃, b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, short s) {
/* 262 */     this.h.putShort(this.l + ☃, s);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, float f) {
/* 267 */     this.h.putFloat(this.l + ☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 272 */     if (this.p != 0) {
/* 273 */       throw new IllegalStateException("Not filled all elements of the vertex");
/*     */     }
/* 275 */     this.n++;
/* 276 */     a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 281 */     ImmutableList<dfs> ☃ = this.r.c();
/* 282 */     this.p = (this.p + 1) % ☃.size();
/* 283 */     this.l += this.o.d();
/*     */     
/* 285 */     dfs dfs1 = (dfs)☃.get(this.p);
/* 286 */     this.o = dfs1;
/* 287 */     if (dfs1.b() == dfs.b.e) {
/* 288 */       e();
/*     */     }
/*     */     
/* 291 */     if (this.a && this.o.b() == dfs.b.c) {
/* 292 */       super.a(this.b, this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public dfq a(int ☃, int i, int j, int k) {
/* 298 */     if (this.a) {
/* 299 */       throw new IllegalStateException();
/*     */     }
/* 301 */     return super.a(☃, i, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int j, float f9, float f10, float f11) {
/* 306 */     if (this.a) {
/* 307 */       throw new IllegalStateException();
/*     */     }
/*     */     
/* 310 */     if (this.s) {
/*     */       int k;
/* 312 */       a(0, ☃);
/* 313 */       a(4, f1);
/* 314 */       a(8, f2);
/*     */       
/* 316 */       a(12, (byte)(int)(f3 * 255.0F));
/* 317 */       a(13, (byte)(int)(f4 * 255.0F));
/* 318 */       a(14, (byte)(int)(f5 * 255.0F));
/* 319 */       a(15, (byte)(int)(f6 * 255.0F));
/*     */       
/* 321 */       a(16, f7);
/* 322 */       a(20, f8);
/*     */ 
/*     */       
/* 325 */       if (this.t) {
/* 326 */         a(24, (short)(i & 0xFFFF));
/* 327 */         a(26, (short)(i >> 16 & 0xFFFF));
/* 328 */         k = 28;
/*     */       } else {
/* 330 */         k = 24;
/*     */       } 
/*     */       
/* 333 */       a(k + 0, (short)(j & 0xFFFF));
/* 334 */       a(k + 2, (short)(j >> 16 & 0xFFFF));
/*     */       
/* 336 */       a(k + 4, dfj.a(f9));
/* 337 */       a(k + 5, dfj.a(f10));
/* 338 */       a(k + 6, dfj.a(f11));
/*     */       
/* 340 */       this.l += k + 8;
/* 341 */       d();
/*     */       return;
/*     */     } 
/* 344 */     super.a(☃, f1, f2, f3, f4, f5, f6, f7, f8, i, j, f9, f10, f11);
/*     */   }
/*     */   
/*     */   public Pair<a, ByteBuffer> f() {
/* 348 */     a ☃ = this.i.get(this.j++);
/* 349 */     this.h.position(this.m);
/* 350 */     this.m += ☃.b() * ☃.a().b();
/* 351 */     this.h.limit(this.m);
/* 352 */     if (this.j == this.i.size() && this.n == 0) {
/* 353 */       g();
/*     */     }
/* 355 */     ByteBuffer byteBuffer = this.h.slice();
/* 356 */     this.h.clear();
/* 357 */     return Pair.of(☃, byteBuffer);
/*     */   }
/*     */   
/*     */   public void g() {
/* 361 */     if (this.k != this.m) {
/* 362 */       g.warn("Bytes mismatch " + this.k + " " + this.m);
/*     */     }
/* 364 */     h();
/*     */   }
/*     */   
/*     */   public void h() {
/* 368 */     this.k = 0;
/* 369 */     this.m = 0;
/* 370 */     this.l = 0;
/* 371 */     this.i.clear();
/* 372 */     this.j = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public dfs i() {
/* 377 */     if (this.o == null) {
/* 378 */       throw new IllegalStateException("BufferBuilder not started");
/*     */     }
/* 380 */     return this.o;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 384 */     return this.u;
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     private final ByteBuffer a;
/*     */     private final dfr b;
/*     */     
/*     */     private b(ByteBuffer ☃, dfr dfr1) {
/* 392 */       this.a = ☃;
/* 393 */       this.b = dfr1;
/*     */     }
/*     */   }
/*     */   
/*     */   public static final class a {
/*     */     private final dfr a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     
/*     */     private a(dfr ☃, int i, int j) {
/* 403 */       this.a = ☃;
/* 404 */       this.b = i;
/* 405 */       this.c = j;
/*     */     }
/*     */     
/*     */     public dfr a() {
/* 409 */       return this.a;
/*     */     }
/*     */     
/*     */     public int b() {
/* 413 */       return this.b;
/*     */     }
/*     */     
/*     */     public int c() {
/* 417 */       return this.c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */