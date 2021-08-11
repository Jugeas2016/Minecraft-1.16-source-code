/*     */ import com.mojang.datafixers.util.Either;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortArraySet;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortSet;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.atomic.AtomicReferenceArray;
/*     */ import java.util.function.IntConsumer;
/*     */ import java.util.function.IntSupplier;
/*     */ import java.util.stream.Stream;
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
/*     */ public class zr
/*     */ {
/*  38 */   public static final Either<cfw, a> a = Either.right(a.b);
/*  39 */   public static final CompletableFuture<Either<cfw, a>> b = CompletableFuture.completedFuture(a);
/*     */   
/*  41 */   public static final Either<cgh, a> c = Either.right(a.b);
/*  42 */   private static final CompletableFuture<Either<cgh, a>> d = CompletableFuture.completedFuture(c);
/*     */   
/*  44 */   private static final List<cga> e = cga.a();
/*  45 */   private static final b[] f = b.values();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  52 */   private final AtomicReferenceArray<CompletableFuture<Either<cfw, a>>> g = new AtomicReferenceArray<>(e.size());
/*     */   
/*  54 */   private volatile CompletableFuture<Either<cgh, a>> h = d;
/*  55 */   private volatile CompletableFuture<Either<cgh, a>> i = d;
/*  56 */   private volatile CompletableFuture<Either<cgh, a>> j = d;
/*     */   
/*  58 */   private CompletableFuture<cfw> k = CompletableFuture.completedFuture(null);
/*     */   
/*     */   private int l;
/*     */   
/*     */   private int m;
/*     */   private int n;
/*     */   private final brd o;
/*     */   private boolean p;
/*  66 */   private final ShortSet[] q = new ShortSet[16];
/*     */   
/*     */   private int r;
/*     */   private int s;
/*     */   private final cuo t;
/*     */   private final c u;
/*     */   private final d v;
/*     */   private boolean w;
/*     */   private boolean x;
/*     */   
/*     */   public zr(brd ☃, int i, cuo cuo1, c c1, d d1) {
/*  77 */     this.o = ☃;
/*  78 */     this.t = cuo1;
/*  79 */     this.u = c1;
/*  80 */     this.v = d1;
/*  81 */     this.l = zs.a + 1;
/*  82 */     this.m = this.l;
/*  83 */     this.n = this.l;
/*  84 */     a(i);
/*     */   }
/*     */   
/*     */   public CompletableFuture<Either<cfw, a>> a(cga ☃) {
/*  88 */     CompletableFuture<Either<cfw, a>> completableFuture = this.g.get(☃.c());
/*  89 */     return (completableFuture == null) ? b : completableFuture;
/*     */   }
/*     */   
/*     */   public CompletableFuture<Either<cfw, a>> b(cga ☃) {
/*  93 */     if (b(this.m).b(☃)) {
/*  94 */       return a(☃);
/*     */     }
/*  96 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CompletableFuture<Either<cgh, a>> a() {
/* 103 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CompletableFuture<Either<cgh, a>> b() {
/* 110 */     return this.j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CompletableFuture<Either<cgh, a>> c() {
/* 117 */     return this.h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cgh d() {
/* 125 */     CompletableFuture<Either<cgh, a>> ☃ = a();
/* 126 */     Either<cgh, a> either = ☃.getNow(null);
/* 127 */     if (either == null) {
/* 128 */       return null;
/*     */     }
/* 130 */     return either.left().orElse(null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cga e() {
/* 138 */     for (int ☃ = e.size() - 1; ☃ >= 0; ☃--) {
/* 139 */       cga cga = e.get(☃);
/* 140 */       CompletableFuture<Either<cfw, a>> completableFuture = a(cga);
/* 141 */       if (((Either)completableFuture.getNow(a)).left().isPresent()) {
/* 142 */         return cga;
/*     */       }
/*     */     } 
/* 145 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cfw f() {
/* 154 */     for (int ☃ = e.size() - 1; ☃ >= 0; ☃--) {
/* 155 */       cga cga = e.get(☃);
/* 156 */       CompletableFuture<Either<cfw, a>> completableFuture = a(cga);
/* 157 */       if (!completableFuture.isCompletedExceptionally()) {
/*     */ 
/*     */         
/* 160 */         Optional<cfw> optional = ((Either)completableFuture.getNow(a)).left();
/* 161 */         if (optional.isPresent())
/* 162 */           return optional.get(); 
/*     */       } 
/*     */     } 
/* 165 */     return null;
/*     */   }
/*     */   
/*     */   public CompletableFuture<cfw> g() {
/* 169 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fx ☃) {
/* 175 */     cgh cgh = d();
/* 176 */     if (cgh == null) {
/*     */       return;
/*     */     }
/*     */     
/* 180 */     byte b1 = (byte)gp.a(☃.v());
/* 181 */     if (this.q[b1] == null) {
/* 182 */       this.p = true;
/* 183 */       this.q[b1] = (ShortSet)new ShortArraySet();
/*     */     } 
/* 185 */     this.q[b1].add(gp.b(☃));
/*     */   }
/*     */   
/*     */   public void a(bsf ☃, int i) {
/* 189 */     cgh cgh = d();
/* 190 */     if (cgh == null) {
/*     */       return;
/*     */     }
/*     */     
/* 194 */     cgh.a(true);
/* 195 */     if (☃ == bsf.a) {
/* 196 */       this.s |= 1 << i - -1;
/*     */     } else {
/* 198 */       this.r |= 1 << i - -1;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(cgh ☃) {
/* 203 */     if (!this.p && this.s == 0 && this.r == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 207 */     brx brx = ☃.x();
/*     */     
/* 209 */     int i = 0; int j;
/* 210 */     for (j = 0; j < this.q.length; j++) {
/* 211 */       i += (this.q[j] != null) ? this.q[j].size() : 0;
/*     */     }
/*     */     
/* 214 */     this.x |= (i >= 64) ? 1 : 0;
/*     */     
/* 216 */     if (this.s != 0 || this.r != 0) {
/* 217 */       a(new pw(☃.g(), this.t, this.s, this.r, true), !this.x);
/* 218 */       this.s = 0;
/* 219 */       this.r = 0;
/*     */     } 
/*     */     
/* 222 */     for (j = 0; j < this.q.length; j++) {
/* 223 */       ShortSet shortSet = this.q[j];
/* 224 */       if (shortSet != null) {
/*     */ 
/*     */         
/* 227 */         gp gp = gp.a(☃.g(), j);
/*     */         
/* 229 */         if (shortSet.size() == 1) {
/* 230 */           fx fx = gp.g(shortSet.iterator().nextShort());
/* 231 */           ceh ceh = brx.d_(fx);
/*     */           
/* 233 */           a(new oy(fx, ceh), false);
/* 234 */           a(brx, fx, ceh);
/*     */         } else {
/* 236 */           cgi cgi = ☃.d()[gp.v()];
/* 237 */           qr qr = new qr(gp, shortSet, cgi, this.x);
/*     */           
/* 239 */           a(qr, false);
/* 240 */           qr.a((fx1, ceh1) -> a(☃, fx1, ceh1));
/*     */         } 
/* 242 */         this.q[j] = null;
/*     */       } 
/* 244 */     }  this.p = false;
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ceh ceh1) {
/* 248 */     if (ceh1.b().q()) {
/* 249 */       a(☃, fx1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1) {
/* 254 */     ccj ccj = ☃.c(fx1);
/* 255 */     if (ccj != null) {
/* 256 */       ow ow = ccj.a();
/* 257 */       if (ow != null) {
/* 258 */         a(ow, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(oj<?> ☃, boolean bool) {
/* 264 */     this.v.a(this.o, bool).forEach(aah1 -> aah1.b.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CompletableFuture<Either<cfw, a>> a(cga ☃, zs zs1) {
/* 271 */     int i = ☃.c();
/* 272 */     CompletableFuture<Either<cfw, a>> completableFuture = this.g.get(i);
/* 273 */     if (completableFuture != null) {
/* 274 */       Either<cfw, a> either = completableFuture.getNow(null);
/* 275 */       if (either == null || either.left().isPresent()) {
/* 276 */         return completableFuture;
/*     */       }
/*     */     } 
/* 279 */     if (b(this.m).b(☃)) {
/* 280 */       CompletableFuture<Either<cfw, a>> completableFuture1 = zs1.a(this, ☃);
/* 281 */       a(completableFuture1);
/* 282 */       this.g.set(i, completableFuture1);
/* 283 */       return completableFuture1;
/*     */     } 
/* 285 */     return (completableFuture == null) ? b : completableFuture;
/*     */   }
/*     */   
/*     */   private void a(CompletableFuture<? extends Either<? extends cfw, a>> ☃) {
/* 289 */     this.k = this.k.thenCombine(☃, (☃, either) -> (cfw)either.map((), ()));
/*     */   }
/*     */   
/*     */   public b h() {
/* 293 */     return c(this.m);
/*     */   }
/*     */   
/*     */   public brd i() {
/* 297 */     return this.o;
/*     */   }
/*     */   
/*     */   public int j() {
/* 301 */     return this.m;
/*     */   }
/*     */   
/*     */   public int k() {
/* 305 */     return this.n;
/*     */   }
/*     */   
/*     */   private void d(int ☃) {
/* 309 */     this.n = ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 313 */     this.m = ☃;
/*     */   }
/*     */   
/*     */   protected void a(zs ☃) {
/* 317 */     cga cga1 = b(this.l);
/* 318 */     cga cga2 = b(this.m);
/*     */     
/* 320 */     boolean bool1 = (this.l <= zs.a);
/* 321 */     boolean bool2 = (this.m <= zs.a);
/*     */     
/* 323 */     b b1 = c(this.l);
/* 324 */     b b2 = c(this.m);
/*     */     
/* 326 */     if (bool1) {
/* 327 */       Either<cfw, a> either = Either.right(new a(this)
/*     */           {
/*     */             public String toString() {
/* 330 */               return "Unloaded ticket level " + zr.a(this.a).toString();
/*     */             }
/*     */           });
/* 333 */       for (int i = bool2 ? (cga2.c() + 1) : 0; i <= cga1.c(); i++) {
/* 334 */         CompletableFuture<Either<cfw, a>> completableFuture = this.g.get(i);
/* 335 */         if (completableFuture != null) {
/* 336 */           completableFuture.complete(either);
/*     */         } else {
/* 338 */           this.g.set(i, CompletableFuture.completedFuture(either));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 343 */     boolean bool3 = b1.a(b.b);
/* 344 */     boolean bool4 = b2.a(b.b);
/* 345 */     this.w |= bool4;
/*     */     
/* 347 */     if (!bool3 && bool4) {
/* 348 */       this.h = ☃.b(this);
/* 349 */       a((CompletableFuture)this.h);
/*     */     } 
/* 351 */     if (bool3 && !bool4) {
/* 352 */       CompletableFuture<Either<cgh, a>> completableFuture = this.h;
/*     */       
/* 354 */       this.h = d;
/* 355 */       a(completableFuture.thenApply(either -> either.ifLeft(☃::a)));
/*     */     } 
/*     */     
/* 358 */     boolean bool5 = b1.a(b.c);
/* 359 */     boolean bool6 = b2.a(b.c);
/*     */     
/* 361 */     if (!bool5 && bool6) {
/* 362 */       this.i = ☃.a(this);
/* 363 */       a((CompletableFuture)this.i);
/*     */     } 
/* 365 */     if (bool5 && !bool6) {
/* 366 */       this.i.complete(c);
/* 367 */       this.i = d;
/*     */     } 
/*     */     
/* 370 */     boolean bool7 = b1.a(b.d);
/* 371 */     boolean bool8 = b2.a(b.d);
/*     */     
/* 373 */     if (!bool7 && bool8) {
/* 374 */       if (this.j != d) {
/* 375 */         throw (IllegalStateException)x.c(new IllegalStateException());
/*     */       }
/* 377 */       this.j = ☃.b(this.o);
/* 378 */       a((CompletableFuture)this.j);
/*     */     } 
/* 380 */     if (bool7 && !bool8) {
/* 381 */       this.j.complete(c);
/* 382 */       this.j = d;
/*     */     } 
/*     */     
/* 385 */     this.u.a(this.o, this::k, this.m, this::d);
/* 386 */     this.l = this.m;
/*     */   }
/*     */   
/*     */   public static cga b(int ☃) {
/* 390 */     if (☃ < 33) {
/* 391 */       return cga.m;
/*     */     }
/* 393 */     return cga.a(☃ - 33);
/*     */   }
/*     */   
/*     */   public static b c(int ☃) {
/* 397 */     return f[afm.a(33 - ☃ + 1, 0, f.length - 1)];
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 401 */     return this.w;
/*     */   }
/*     */   
/*     */   public void m() {
/* 405 */     this.w = c(this.m).a(b.b);
/*     */   }
/*     */   
/*     */   public void a(cgg ☃) {
/* 409 */     for (int i = 0; i < this.g.length(); i++) {
/* 410 */       CompletableFuture<Either<cfw, a>> completableFuture = this.g.get(i);
/* 411 */       if (completableFuture != null) {
/*     */ 
/*     */         
/* 414 */         Optional<cfw> optional = ((Either)completableFuture.getNow(a)).left();
/* 415 */         if (optional.isPresent() && optional.get() instanceof cgp)
/*     */         {
/*     */           
/* 418 */           this.g.set(i, CompletableFuture.completedFuture(Either.left(☃))); } 
/*     */       } 
/* 420 */     }  a(CompletableFuture.completedFuture(Either.left(☃.u())));
/*     */   }
/*     */   
/*     */   public enum b {
/* 424 */     a,
/* 425 */     b,
/* 426 */     c,
/* 427 */     d;
/*     */ 
/*     */     
/*     */     public boolean a(b ☃) {
/* 431 */       return (ordinal() >= ☃.ordinal());
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface a {
/* 436 */     public static final a b = new a()
/*     */       {
/*     */         public String toString() {
/* 439 */           return "UNLOADED";
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public static interface c {
/*     */     void a(brd param1brd, IntSupplier param1IntSupplier, int param1Int, IntConsumer param1IntConsumer);
/*     */   }
/*     */   
/*     */   public static interface d {
/*     */     Stream<aah> a(brd param1brd, boolean param1Boolean);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */