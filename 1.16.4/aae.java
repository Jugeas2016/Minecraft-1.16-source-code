/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.CompletionStage;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class aae
/*     */   extends cfz
/*     */ {
/*  50 */   private static final List<cga> b = cga.a();
/*     */   
/*     */   private final zy c;
/*     */   
/*     */   private final cfy d;
/*     */   
/*     */   private final aag e;
/*     */   
/*     */   private final Thread f;
/*     */   
/*     */   private final aaj g;
/*     */   
/*     */   private final a h;
/*     */   
/*     */   public final zs a;
/*     */   private final cyc i;
/*     */   private long j;
/*     */   private boolean k = true;
/*     */   private boolean l = true;
/*  69 */   private final long[] m = new long[4];
/*  70 */   private final cga[] n = new cga[4];
/*  71 */   private final cfw[] o = new cfw[4];
/*     */   
/*     */   @Nullable
/*     */   private bsg.d p;
/*     */ 
/*     */   
/*     */   public aae(aag ☃, cyg.a a1, DataFixer dataFixer, csw csw1, Executor executor, cfy cfy1, int i, boolean bool, aap aap1, Supplier<cyc> supplier) {
/*  78 */     this.e = ☃;
/*  79 */     this.h = new a(☃);
/*  80 */     this.d = cfy1;
/*  81 */     this.f = Thread.currentThread();
/*     */     
/*  83 */     File file1 = a1.a(☃.Y());
/*  84 */     File file2 = new File(file1, "data");
/*  85 */     file2.mkdirs();
/*  86 */     this.i = new cyc(file2, dataFixer);
/*     */     
/*  88 */     this.a = new zs(☃, a1, dataFixer, csw1, executor, this.h, this, g(), aap1, supplier, i, bool);
/*  89 */     this.g = this.a.a();
/*  90 */     this.c = this.a.e();
/*     */     
/*  92 */     n();
/*     */   }
/*     */ 
/*     */   
/*     */   public aaj a() {
/*  97 */     return this.g;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private zr a(long ☃) {
/* 102 */     return this.a.b(☃);
/*     */   }
/*     */   
/*     */   public int b() {
/* 106 */     return this.a.c();
/*     */   }
/*     */   
/*     */   private void a(long ☃, cfw cfw1, cga cga1) {
/* 110 */     for (int i = 3; i > 0; i--) {
/* 111 */       this.m[i] = this.m[i - 1];
/* 112 */       this.n[i] = this.n[i - 1];
/* 113 */       this.o[i] = this.o[i - 1];
/*     */     } 
/* 115 */     this.m[0] = ☃;
/* 116 */     this.n[0] = cga1;
/* 117 */     this.o[0] = cfw1;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cfw a(int ☃, int i, cga cga1, boolean bool) {
/* 123 */     if (Thread.currentThread() != this.f) {
/* 124 */       return CompletableFuture.<cfw>supplyAsync(() -> a(☃, i, cga1, bool), this.h).join();
/*     */     }
/* 126 */     anw anw = this.e.Z();
/* 127 */     anw.c("getChunk");
/*     */     
/* 129 */     long l = brd.a(☃, i);
/* 130 */     for (int j = 0; j < 4; j++) {
/* 131 */       if (l == this.m[j] && cga1 == this.n[j]) {
/* 132 */         cfw cfw2 = this.o[j];
/* 133 */         if (cfw2 != null || !bool) {
/* 134 */           return cfw2;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 139 */     anw.c("getChunkCacheMiss");
/* 140 */     CompletableFuture<Either<cfw, zr.a>> completableFuture = c(☃, i, cga1, bool);
/* 141 */     this.h.c(completableFuture::isDone);
/*     */     
/* 143 */     cfw cfw1 = (cfw)((Either)completableFuture.join()).map(☃ -> ☃, a1 -> {
/*     */           if (☃) {
/*     */             throw (IllegalStateException)x.c(new IllegalStateException("Chunk not there when requested: " + a1));
/*     */           }
/*     */           
/*     */           return null;
/*     */         });
/* 150 */     a(l, cfw1, cga1);
/* 151 */     return cfw1;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cgh a(int ☃, int i) {
/* 157 */     if (Thread.currentThread() != this.f)
/*     */     {
/* 159 */       return null;
/*     */     }
/* 161 */     this.e.Z().c("getChunkNow");
/*     */     
/* 163 */     long l = brd.a(☃, i);
/* 164 */     for (int j = 0; j < 4; j++) {
/* 165 */       if (l == this.m[j] && this.n[j] == cga.m) {
/* 166 */         cfw cfw2 = this.o[j];
/* 167 */         return (cfw2 instanceof cgh) ? (cgh)cfw2 : null;
/*     */       } 
/*     */     } 
/*     */     
/* 171 */     zr zr = a(l);
/* 172 */     if (zr == null) {
/* 173 */       return null;
/*     */     }
/* 175 */     Either<cfw, zr.a> either = zr.b(cga.m).getNow(null);
/* 176 */     if (either == null) {
/* 177 */       return null;
/*     */     }
/* 179 */     cfw cfw1 = either.left().orElse(null);
/* 180 */     if (cfw1 != null) {
/* 181 */       a(l, cfw1, cga.m);
/* 182 */       if (cfw1 instanceof cgh) {
/* 183 */         return (cgh)cfw1;
/*     */       }
/*     */     } 
/* 186 */     return null;
/*     */   }
/*     */   
/*     */   private void n() {
/* 190 */     Arrays.fill(this.m, brd.a);
/* 191 */     Arrays.fill((Object[])this.n, (Object)null);
/* 192 */     Arrays.fill((Object[])this.o, (Object)null);
/*     */   }
/*     */   public CompletableFuture<Either<cfw, zr.a>> b(int ☃, int i, cga cga1, boolean bool) {
/*     */     CompletableFuture<Either<cfw, zr.a>> completableFuture;
/* 196 */     boolean bool1 = (Thread.currentThread() == this.f);
/*     */     
/* 198 */     if (bool1) {
/* 199 */       completableFuture = c(☃, i, cga1, bool);
/* 200 */       this.h.c(completableFuture::isDone);
/*     */     } else {
/* 202 */       completableFuture = CompletableFuture.supplyAsync(() -> c(☃, i, cga1, bool), this.h).thenCompose(☃ -> ☃);
/*     */     } 
/* 204 */     return completableFuture;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private CompletableFuture<Either<cfw, zr.a>> c(int ☃, int i, cga cga1, boolean bool) {
/* 211 */     brd brd = new brd(☃, i);
/* 212 */     long l = brd.a();
/* 213 */     int j = 33 + cga.a(cga1);
/*     */     
/* 215 */     zr zr = a(l);
/* 216 */     if (bool) {
/*     */       
/* 218 */       this.c.a(aal.h, brd, j, brd);
/*     */       
/* 220 */       if (a(zr, j)) {
/* 221 */         anw anw = this.e.Z();
/* 222 */         anw.a("chunkLoad");
/* 223 */         o();
/* 224 */         zr = a(l);
/* 225 */         anw.c();
/* 226 */         if (a(zr, j)) {
/* 227 */           throw (IllegalStateException)x.c(new IllegalStateException("No chunk holder after ticket has been added"));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 232 */     if (a(zr, j)) {
/* 233 */       return zr.b;
/*     */     }
/*     */     
/* 236 */     return zr.a(cga1, this.a);
/*     */   }
/*     */   
/*     */   private boolean a(@Nullable zr ☃, int i) {
/* 240 */     return (☃ == null || ☃.j() > i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, int i) {
/* 245 */     zr zr = a((new brd(☃, i)).a());
/* 246 */     int j = 33 + cga.a(cga.m);
/*     */     
/* 248 */     return !a(zr, j);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public brc c(int ☃, int i) {
/* 254 */     long l = brd.a(☃, i);
/* 255 */     zr zr = a(l);
/* 256 */     if (zr == null) {
/* 257 */       return null;
/*     */     }
/*     */     
/* 260 */     for (int j = b.size() - 1;; j--) {
/* 261 */       cga cga1 = b.get(j);
/* 262 */       Optional<cfw> optional = ((Either)zr.a(cga1).getNow(zr.a)).left();
/* 263 */       if (optional.isPresent()) {
/* 264 */         return optional.get();
/*     */       }
/* 266 */       if (cga1 == cga.j.e()) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */     
/* 271 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public brx c() {
/* 276 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 280 */     return this.h.y();
/*     */   }
/*     */   
/*     */   private boolean o() {
/* 284 */     boolean ☃ = this.c.a(this.a);
/* 285 */     boolean bool1 = this.a.b();
/* 286 */     if (☃ || bool1) {
/* 287 */       n();
/* 288 */       return true;
/*     */     } 
/* 290 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aqa ☃) {
/* 295 */     long l = brd.a(afm.c(☃.cD()) >> 4, afm.c(☃.cH()) >> 4);
/* 296 */     return a(l, zr::b);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brd ☃) {
/* 301 */     return a(☃.a(), zr::b);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(fx ☃) {
/* 306 */     long l = brd.a(☃.u() >> 4, ☃.w() >> 4);
/* 307 */     return a(l, zr::a);
/*     */   }
/*     */   
/*     */   private boolean a(long ☃, Function<zr, CompletableFuture<Either<cgh, zr.a>>> function) {
/* 311 */     zr zr = a(☃);
/* 312 */     if (zr == null) {
/* 313 */       return false;
/*     */     }
/* 315 */     Either<cgh, zr.a> either = ((CompletableFuture<Either<cgh, zr.a>>)function.apply(zr)).getNow(zr.c);
/* 316 */     return either.left().isPresent();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 320 */     o();
/* 321 */     this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 326 */     a(true);
/* 327 */     this.g.close();
/* 328 */     this.a.close();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(BooleanSupplier ☃) {
/* 333 */     this.e.Z().a("purge");
/* 334 */     this.c.a();
/* 335 */     o();
/* 336 */     this.e.Z().b("chunks");
/* 337 */     p();
/* 338 */     this.e.Z().b("unload");
/* 339 */     this.a.a(☃);
/* 340 */     this.e.Z().c();
/* 341 */     n();
/*     */   }
/*     */   
/*     */   private void p() {
/* 345 */     long ☃ = this.e.T();
/* 346 */     long l1 = ☃ - this.j;
/* 347 */     this.j = ☃;
/*     */     
/* 349 */     cyd cyd = this.e.h();
/*     */     
/* 351 */     boolean bool1 = this.e.ab();
/* 352 */     boolean bool2 = this.e.V().b(brt.d);
/* 353 */     if (!bool1) {
/* 354 */       this.e.Z().a("pollingChunks");
/*     */       
/* 356 */       int i = this.e.V().c(brt.m);
/* 357 */       boolean bool = (cyd.e() % 400L == 0L);
/*     */       
/* 359 */       this.e.Z().a("naturalSpawnCount");
/* 360 */       int j = this.c.b();
/* 361 */       bsg.d d1 = bsg.a(j, this.e.A(), this::a);
/* 362 */       this.p = d1;
/* 363 */       this.e.Z().c();
/*     */       
/* 365 */       List<zr> list = Lists.newArrayList(this.a.f());
/*     */       
/* 367 */       Collections.shuffle(list);
/* 368 */       list.forEach(zr1 -> {
/*     */             Optional<cgh> optional1 = ((Either)zr1.a().getNow(zr.c)).left();
/*     */             
/*     */             if (!optional1.isPresent()) {
/*     */               return;
/*     */             }
/*     */             
/*     */             this.e.Z().a("broadcast");
/*     */             zr1.a(optional1.get());
/*     */             this.e.Z().c();
/*     */             Optional<cgh> optional2 = ((Either)zr1.b().getNow(zr.c)).left();
/*     */             if (!optional2.isPresent()) {
/*     */               return;
/*     */             }
/*     */             cgh cgh = optional2.get();
/*     */             brd brd = zr1.i();
/*     */             if (this.a.d(brd)) {
/*     */               return;
/*     */             }
/*     */             cgh.b(cgh.q() + ☃);
/*     */             if (bool1 && (this.k || this.l) && this.e.f().a(cgh.g())) {
/*     */               bsg.a(this.e, cgh, d1, this.l, this.k, bool2);
/*     */             }
/*     */             this.e.a(cgh, i);
/*     */           });
/* 393 */       this.e.Z().a("customSpawners");
/* 394 */       if (bool2) {
/* 395 */         this.e.a(this.k, this.l);
/*     */       }
/* 397 */       this.e.Z().c();
/*     */       
/* 399 */       this.e.Z().c();
/*     */     } 
/*     */     
/* 402 */     this.a.g();
/*     */   }
/*     */   
/*     */   private void a(long ☃, Consumer<cgh> consumer) {
/* 406 */     zr zr = a(☃);
/*     */     
/* 408 */     if (zr != null) {
/* 409 */       ((Either)zr.c().getNow(zr.c)).left().ifPresent(consumer);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String e() {
/* 415 */     return "ServerChunkCache: " + h();
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   public int f() {
/* 420 */     return this.h.bi();
/*     */   }
/*     */   
/*     */   public cfy g() {
/* 424 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 429 */     return this.a.d();
/*     */   }
/*     */   
/*     */   public void b(fx ☃) {
/* 433 */     int i = ☃.u() >> 4;
/* 434 */     int j = ☃.w() >> 4;
/* 435 */     zr zr = a(brd.a(i, j));
/* 436 */     if (zr != null) {
/* 437 */       zr.a(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bsf ☃, gp gp1) {
/* 443 */     this.h.execute(() -> {
/*     */           zr zr = a(☃.r().a());
/*     */           if (zr != null) {
/*     */             zr.a(bsf1, ☃.b());
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public <T> void a(aal<T> ☃, brd brd1, int i, T t) {
/* 452 */     this.c.c(☃, brd1, i, t);
/*     */   }
/*     */   
/*     */   public <T> void b(aal<T> ☃, brd brd1, int i, T t) {
/* 456 */     this.c.d(☃, brd1, i, t);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brd ☃, boolean bool) {
/* 461 */     this.c.a(☃, bool);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aah ☃) {
/* 467 */     this.a.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(aqa ☃) {
/* 473 */     this.a.b(☃);
/*     */   }
/*     */   
/*     */   public void c(aqa ☃) {
/* 477 */     this.a.a(☃);
/*     */   }
/*     */   
/*     */   public void a(aqa ☃, oj<?> oj1) {
/* 481 */     this.a.b(☃, oj1);
/*     */   }
/*     */   
/*     */   public void b(aqa ☃, oj<?> oj1) {
/* 485 */     this.a.a(☃, oj1);
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 489 */     this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃, boolean bool1) {
/* 494 */     this.k = ☃;
/* 495 */     this.l = bool1;
/*     */   }
/*     */   
/*     */   public String b(brd ☃) {
/* 499 */     return this.a.a(☃);
/*     */   }
/*     */   
/*     */   public cyc i() {
/* 503 */     return this.i;
/*     */   }
/*     */   
/*     */   public azo j() {
/* 507 */     return this.a.h();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bsg.d k() {
/* 513 */     return this.p;
/*     */   }
/*     */   
/*     */   final class a extends aob<Runnable> {
/*     */     private a(aae this$0, brx ☃) {
/* 518 */       super("Chunk source main thread executor for " + ☃.Y().a());
/*     */     }
/*     */ 
/*     */     
/*     */     protected Runnable e(Runnable ☃) {
/* 523 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean d(Runnable ☃) {
/* 528 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected boolean av() {
/* 534 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Thread aw() {
/* 539 */       return aae.a(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void c(Runnable ☃) {
/* 544 */       aae.b(this.a).Z().c("runTask");
/* 545 */       super.c(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean y() {
/* 550 */       if (aae.c(this.a)) {
/* 551 */         return true;
/*     */       }
/* 553 */       aae.d(this.a).z_();
/* 554 */       return super.y();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */