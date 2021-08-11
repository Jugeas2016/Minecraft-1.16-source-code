/*      */ import com.google.common.collect.ImmutableList;
/*      */ import com.google.common.collect.Iterables;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Queues;
/*      */ import com.google.common.collect.Sets;
/*      */ import com.mojang.datafixers.DataFixer;
/*      */ import com.mojang.datafixers.util.Either;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*      */ import it.unimi.dsi.fastutil.longs.Long2ByteMap;
/*      */ import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
/*      */ import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
/*      */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*      */ import it.unimi.dsi.fastutil.longs.LongIterator;
/*      */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*      */ import it.unimi.dsi.fastutil.longs.LongSet;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.Writer;
/*      */ import java.util.Collection;
/*      */ import java.util.List;
/*      */ import java.util.Objects;
/*      */ import java.util.Optional;
/*      */ import java.util.Queue;
/*      */ import java.util.Set;
/*      */ import java.util.concurrent.CancellationException;
/*      */ import java.util.concurrent.CompletableFuture;
/*      */ import java.util.concurrent.CompletionException;
/*      */ import java.util.concurrent.CompletionStage;
/*      */ import java.util.concurrent.Executor;
/*      */ import java.util.concurrent.atomic.AtomicInteger;
/*      */ import java.util.function.BooleanSupplier;
/*      */ import java.util.function.IntFunction;
/*      */ import java.util.function.IntSupplier;
/*      */ import java.util.function.Supplier;
/*      */ import java.util.stream.Collectors;
/*      */ import java.util.stream.Stream;
/*      */ import javax.annotation.Nullable;
/*      */ import org.apache.commons.lang3.mutable.MutableBoolean;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
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
/*      */ public class zs
/*      */   extends cgu
/*      */   implements zr.d
/*      */ {
/*   98 */   private static final Logger c = LogManager.getLogger();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  104 */   public static final int a = 33 + cga.b();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  111 */   private final Long2ObjectLinkedOpenHashMap<zr> d = new Long2ObjectLinkedOpenHashMap();
/*  112 */   private volatile Long2ObjectLinkedOpenHashMap<zr> e = this.d.clone();
/*      */ 
/*      */ 
/*      */   
/*  116 */   private final Long2ObjectLinkedOpenHashMap<zr> f = new Long2ObjectLinkedOpenHashMap();
/*      */ 
/*      */ 
/*      */   
/*  120 */   private final LongSet g = (LongSet)new LongOpenHashSet();
/*      */   
/*      */   private final aag h;
/*      */   
/*      */   private final aaj i;
/*      */   private final aob<Runnable> j;
/*      */   private final cfy k;
/*      */   private final Supplier<cyc> l;
/*      */   private final azo m;
/*  129 */   private final LongSet n = (LongSet)new LongOpenHashSet();
/*      */   
/*      */   private boolean o;
/*      */   
/*      */   private final zu p;
/*      */   
/*      */   private final aod<zu.a<Runnable>> q;
/*      */   private final aod<zu.a<Runnable>> r;
/*      */   private final aap s;
/*      */   private final a t;
/*  139 */   private final AtomicInteger u = new AtomicInteger();
/*      */   
/*      */   private final csw v;
/*      */   private final File w;
/*  143 */   private final aaa x = new aaa();
/*  144 */   private final Int2ObjectMap<b> y = (Int2ObjectMap<b>)new Int2ObjectOpenHashMap();
/*      */   
/*  146 */   private final Long2ByteMap z = (Long2ByteMap)new Long2ByteOpenHashMap();
/*      */   
/*  148 */   private final Queue<Runnable> A = Queues.newConcurrentLinkedQueue();
/*      */   
/*      */   private int B;
/*      */   
/*      */   public zs(aag ☃, cyg.a a1, DataFixer dataFixer, csw csw1, Executor executor, aob<Runnable> aob1, cgj cgj1, cfy cfy1, aap aap1, Supplier<cyc> supplier, int i, boolean bool) {
/*  153 */     super(new File(a1.a(☃.Y()), "region"), dataFixer, bool);
/*  154 */     this.v = csw1;
/*  155 */     this.w = a1.a(☃.Y());
/*  156 */     this.h = ☃;
/*  157 */     this.k = cfy1;
/*  158 */     this.j = aob1;
/*      */     
/*  160 */     aoe<Runnable> aoe1 = aoe.a(executor, "worldgen");
/*      */     
/*  162 */     aod<Runnable> aod1 = aod.a("main", aob1::h);
/*  163 */     this.s = aap1;
/*  164 */     aoe<Runnable> aoe2 = aoe.a(executor, "light");
/*      */     
/*  166 */     this.p = new zu((List<aod<?>>)ImmutableList.of(aoe1, aod1, aoe2), executor, 2147483647);
/*      */     
/*  168 */     this.q = this.p.a(aoe1, false);
/*  169 */     this.r = this.p.a(aod1, false);
/*  170 */     this.i = new aaj(cgj1, this, this.h.k().b(), aoe2, this.p.a(aoe2, false));
/*      */     
/*  172 */     this.t = new a(this, executor, aob1);
/*  173 */     this.l = supplier;
/*  174 */     this.m = new azo(new File(this.w, "poi"), dataFixer, bool);
/*      */     
/*  176 */     a(i);
/*      */   }
/*      */   
/*      */   private static double a(brd ☃, aqa aqa1) {
/*  180 */     double d1 = (☃.b * 16 + 8);
/*  181 */     double d2 = (☃.c * 16 + 8);
/*      */     
/*  183 */     double d3 = d1 - aqa1.cD();
/*  184 */     double d4 = d2 - aqa1.cH();
/*      */     
/*  186 */     return d3 * d3 + d4 * d4;
/*      */   }
/*      */   
/*      */   private static int b(brd ☃, aah aah1, boolean bool) {
/*      */     int i;
/*      */     int j;
/*  192 */     if (bool) {
/*  193 */       gp gp = aah1.O();
/*  194 */       i = gp.a();
/*  195 */       j = gp.c();
/*      */     } else {
/*  197 */       i = afm.c(aah1.cD() / 16.0D);
/*  198 */       j = afm.c(aah1.cH() / 16.0D);
/*      */     } 
/*  200 */     return a(☃, i, j);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static int a(brd ☃, int i, int j) {
/*  208 */     int k = ☃.b - i;
/*  209 */     int m = ☃.c - j;
/*      */     
/*  211 */     return Math.max(Math.abs(k), Math.abs(m));
/*      */   }
/*      */   
/*      */   protected aaj a() {
/*  215 */     return this.i;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected zr a(long ☃) {
/*  220 */     return (zr)this.d.get(☃);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected zr b(long ☃) {
/*  225 */     return (zr)this.e.get(☃);
/*      */   }
/*      */   
/*      */   protected IntSupplier c(long ☃) {
/*  229 */     return () -> {
/*      */         zr zr = b(☃);
/*      */         return (zr == null) ? (zt.a - 1) : Math.min(zr.k(), zt.a - 1);
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String a(brd ☃) {
/*  239 */     zr zr = b(☃.a());
/*  240 */     if (zr == null) {
/*  241 */       return "null";
/*      */     }
/*  243 */     String str = zr.j() + "\n";
/*  244 */     cga cga = zr.e();
/*  245 */     cfw cfw = zr.f();
/*  246 */     if (cga != null) {
/*  247 */       str = str + "St: §" + cga.c() + cga + '§' + "r\n";
/*      */     }
/*  249 */     if (cfw != null) {
/*  250 */       str = str + "Ch: §" + cfw.k().c() + cfw.k() + '§' + "r\n";
/*      */     }
/*  252 */     zr.b b = zr.h();
/*  253 */     str = str + "§" + b.ordinal() + b;
/*  254 */     return str + '§' + "r";
/*      */   }
/*      */   
/*      */   private CompletableFuture<Either<List<cfw>, zr.a>> a(brd ☃, int i, IntFunction<cga> intFunction) {
/*  258 */     List<CompletableFuture<Either<cfw, zr.a>>> list = Lists.newArrayList();
/*      */     
/*  260 */     int j = ☃.b;
/*  261 */     int k = ☃.c;
/*  262 */     for (int m = -i; m <= i; m++) {
/*  263 */       for (int n = -i; n <= i; n++) {
/*  264 */         int i1 = Math.max(Math.abs(n), Math.abs(m));
/*  265 */         brd brd1 = new brd(j + n, k + m);
/*  266 */         long l = brd1.a();
/*  267 */         zr zr = a(l);
/*  268 */         if (zr == null) {
/*  269 */           return CompletableFuture.completedFuture(Either.right(new zr.a(this, brd1)
/*      */                 {
/*      */                   public String toString() {
/*  272 */                     return "Unloaded " + this.a.toString();
/*      */                   }
/*      */                 }));
/*      */         }
/*  276 */         cga cga = intFunction.apply(i1);
/*  277 */         CompletableFuture<Either<cfw, zr.a>> completableFuture1 = zr.a(cga, this);
/*  278 */         list.add(completableFuture1);
/*      */       } 
/*      */     } 
/*  281 */     CompletableFuture<List<Either<cfw, zr.a>>> completableFuture = x.b(list);
/*  282 */     return completableFuture.thenApply(list -> {
/*      */           List<cfw> list1 = Lists.newArrayList();
/*      */           int k = 0;
/*      */           for (Either<cfw, zr.a> either : (Iterable<Either<cfw, zr.a>>)list) {
/*      */             Optional<cfw> optional = either.left();
/*      */             if (!optional.isPresent()) {
/*      */               int m = k;
/*      */               return Either.right(new zr.a(this, ☃, m, i, j, either)
/*      */                   {
/*      */                     public String toString() {
/*  292 */                       return "Unloaded " + new brd(this.a + this.c % (this.d * 2 + 1), this.e + this.c / (this.d * 2 + 1)) + " " + ((zr.a)this.f.right().get()).toString();
/*      */                     }
/*      */                   });
/*      */             } 
/*      */             list1.add(optional.get());
/*      */             k++;
/*      */           } 
/*      */           return Either.left(list1);
/*      */         });
/*      */   }
/*      */   
/*      */   public CompletableFuture<Either<cgh, zr.a>> b(brd ☃) {
/*  304 */     return a(☃, 2, ☃ -> cga.m).thenApplyAsync(☃ -> ☃.mapLeft(()), this.j);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private zr a(long ☃, int i, @Nullable zr zr1, int j) {
/*  309 */     if (j > a && i > a) {
/*  310 */       return zr1;
/*      */     }
/*      */     
/*  313 */     if (zr1 != null) {
/*  314 */       zr1.a(i);
/*      */     }
/*      */     
/*  317 */     if (zr1 != null) {
/*  318 */       if (i > a) {
/*  319 */         this.n.add(☃);
/*      */       } else {
/*  321 */         this.n.remove(☃);
/*      */       } 
/*      */     }
/*      */     
/*  325 */     if (i <= a && 
/*  326 */       zr1 == null) {
/*  327 */       zr1 = (zr)this.f.remove(☃);
/*      */       
/*  329 */       if (zr1 != null) {
/*  330 */         zr1.a(i);
/*      */       } else {
/*  332 */         zr1 = new zr(new brd(☃), i, this.i, this.p, this);
/*      */       } 
/*  334 */       this.d.put(☃, zr1);
/*  335 */       this.o = true;
/*      */     } 
/*      */     
/*  338 */     return zr1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void close() throws IOException {
/*      */     try {
/*  344 */       this.p.close();
/*  345 */       this.m.close();
/*      */     } finally {
/*  347 */       super.close();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(boolean ☃) {
/*  353 */     if (☃) {
/*      */ 
/*      */ 
/*      */       
/*  357 */       List<zr> list = (List<zr>)this.e.values().stream().filter(zr::l).peek(zr::m).collect(Collectors.toList());
/*      */ 
/*      */       
/*  360 */       MutableBoolean mutableBoolean = new MutableBoolean();
/*      */       do {
/*  362 */         mutableBoolean.setFalse();
/*  363 */         list.stream()
/*  364 */           .map(☃ -> {
/*      */               while (true) {
/*      */                 CompletableFuture<cfw> completableFuture = ☃.g();
/*      */                 this.j.c(completableFuture::isDone);
/*      */                 if (completableFuture == ☃.g()) {
/*      */                   return completableFuture.join();
/*      */                 }
/*      */               } 
/*  372 */             }).filter(☃ -> (☃ instanceof cgg || ☃ instanceof cgh))
/*  373 */           .filter(this::a)
/*  374 */           .forEach(cfw1 -> ☃.setTrue());
/*  375 */       } while (mutableBoolean.isTrue());
/*      */       
/*  377 */       b(() -> true);
/*  378 */       i();
/*      */       
/*  380 */       c.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.w.getName());
/*      */     } else {
/*      */       
/*  383 */       this.e.values().stream()
/*  384 */         .filter(zr::l)
/*  385 */         .forEach(☃ -> {
/*      */             cfw cfw = ☃.g().getNow(null);
/*      */             if (cfw instanceof cgg || cfw instanceof cgh) {
/*      */               a(cfw);
/*      */               ☃.m();
/*      */             } 
/*      */           });
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void a(BooleanSupplier ☃) {
/*  396 */     anw anw = this.h.Z();
/*  397 */     anw.a("poi");
/*  398 */     this.m.a(☃);
/*  399 */     anw.b("chunk_unload");
/*  400 */     if (!this.h.q()) {
/*  401 */       b(☃);
/*      */     }
/*  403 */     anw.c();
/*      */   }
/*      */   
/*      */   private void b(BooleanSupplier ☃) {
/*  407 */     LongIterator longIterator = this.n.iterator();
/*  408 */     int i = 0;
/*  409 */     while (longIterator.hasNext() && (☃.getAsBoolean() || i < 200 || this.n.size() > 2000)) {
/*  410 */       long l = longIterator.nextLong();
/*      */       
/*  412 */       zr zr = (zr)this.d.remove(l);
/*  413 */       if (zr != null) {
/*  414 */         this.f.put(l, zr);
/*  415 */         this.o = true;
/*  416 */         i++;
/*  417 */         a(l, zr);
/*      */       } 
/*  419 */       longIterator.remove();
/*      */     } 
/*      */     
/*      */     Runnable runnable;
/*  423 */     while ((☃.getAsBoolean() || this.A.size() > 2000) && (runnable = this.A.poll()) != null) {
/*  424 */       runnable.run();
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(long ☃, zr zr1) {
/*  429 */     CompletableFuture<cfw> completableFuture = zr1.g();
/*  430 */     completableFuture.thenAcceptAsync(cfw1 -> { CompletableFuture<cfw> completableFuture1 = ☃.g(); if (completableFuture1 != completableFuture) { a(l, ☃); return; }  if (this.f.remove(l, ☃) && cfw1 != null) { if (cfw1 instanceof cgh) ((cgh)cfw1).c(false);  a(cfw1); if (this.g.remove(l) && cfw1 instanceof cgh) { cgh cgh = (cgh)cfw1; this.h.a(cgh); }  this.i.a(cfw1.g()); this.i.z_(); this.s.a(cfw1.g(), null); }  }this.A::add)
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
/*  453 */       .whenComplete((void_, throwable) -> {
/*      */           if (throwable != null) {
/*      */             c.error("Failed to save chunk " + ☃.i(), throwable);
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   protected boolean b() {
/*  461 */     if (!this.o) {
/*  462 */       return false;
/*      */     }
/*      */     
/*  465 */     this.e = this.d.clone();
/*  466 */     this.o = false;
/*  467 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CompletableFuture<Either<cfw, zr.a>> a(zr ☃, cga cga1) {
/*  475 */     brd brd = ☃.i();
/*  476 */     if (cga1 == cga.a) {
/*  477 */       return f(brd);
/*      */     }
/*      */     
/*  480 */     CompletableFuture<Either<cfw, zr.a>> completableFuture = ☃.a(cga1.e(), this);
/*      */     
/*  482 */     return completableFuture.thenComposeAsync(either -> { Optional<cfw> optional = either.left(); if (!optional.isPresent()) return CompletableFuture.completedFuture(either);  if (☃ == cga.j) this.t.a(aal.e, brd1, 33 + cga.a(cga.i), brd1);  cfw cfw = optional.get(); if (cfw.k().b(☃)) { CompletableFuture<Either<cfw, zr.a>> completableFuture; if (☃ == cga.j) { completableFuture = b(zr1, ☃); } else { completableFuture = ☃.a(this.h, this.v, this.i, (), cfw); }  this.s.a(brd1, ☃); return completableFuture; }  return b(zr1, ☃); }this.j);
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
/*      */   private CompletableFuture<Either<cfw, zr.a>> f(brd ☃) {
/*  514 */     return CompletableFuture.supplyAsync(() -> {
/*      */           try {
/*      */             this.h.Z().c("chunkLoad");
/*      */ 
/*      */             
/*      */             md md = i(☃);
/*      */             
/*      */             if (md != null) {
/*  522 */               boolean bool = (md.c("Level", 10) && md.p("Level").c("Status", 8));
/*      */               if (bool) {
/*      */                 cfw cfw = cgt.a(this.h, this.v, this.m, ☃, md);
/*      */                 cfw.a(this.h.T());
/*      */                 a(☃, cfw.k().g());
/*      */                 return Either.left(cfw);
/*      */               } 
/*      */               c.error("Chunk file at {} is missing level data, skipping", ☃);
/*      */             } 
/*  531 */           } catch (u u) {
/*      */             Throwable throwable = u.getCause();
/*      */             if (throwable instanceof IOException) {
/*      */               c.error("Couldn't load chunk {}", ☃, throwable);
/*      */             } else {
/*      */               g(☃);
/*      */               throw u;
/*      */             } 
/*  539 */           } catch (Exception exception) {
/*      */             c.error("Couldn't load chunk {}", ☃, exception);
/*      */           } 
/*      */           g(☃);
/*      */           return Either.left(new cgp(☃, cgr.a));
/*      */         }this.j);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void g(brd ☃) {
/*  550 */     this.z.put(☃.a(), (byte)-1);
/*      */   }
/*      */   
/*      */   private byte a(brd ☃, cga.a a1) {
/*  554 */     return this.z.put(☃.a(), (a1 == cga.a.a) ? -1 : 1);
/*      */   }
/*      */   
/*      */   private CompletableFuture<Either<cfw, zr.a>> b(zr ☃, cga cga1) {
/*  558 */     brd brd = ☃.i();
/*      */     
/*  560 */     CompletableFuture<Either<List<cfw>, zr.a>> completableFuture = a(brd, cga1.f(), i -> a(☃, i));
/*  561 */     this.h.Z().c(() -> "chunkGenerate " + ☃.d());
/*  562 */     return completableFuture.thenComposeAsync(either -> (CompletableFuture)either.map((), ()), runnable -> this.q.a(zu.a(☃, runnable)));
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
/*      */   protected void c(brd ☃) {
/*  590 */     this.j.h(x.a(() -> this.t.b(aal.e, ☃, 33 + cga.a(cga.i), ☃), () -> "release light ticket " + ☃));
/*      */   }
/*      */   
/*      */   private cga a(cga ☃, int i) {
/*      */     cga cga1;
/*  595 */     if (i == 0) {
/*  596 */       cga1 = ☃.e();
/*      */     } else {
/*  598 */       cga1 = cga.a(cga.a(☃) + i);
/*      */     } 
/*  600 */     return cga1;
/*      */   }
/*      */   
/*      */   private CompletableFuture<Either<cfw, zr.a>> c(zr ☃) {
/*  604 */     CompletableFuture<Either<cfw, zr.a>> completableFuture = ☃.a(cga.m.e());
/*  605 */     return completableFuture.thenApplyAsync(either -> {
/*      */           cga cga = zr.b(☃.j());
/*      */           return !cga.b(cga.m) ? zr.a : either.mapLeft(());
/*      */         }runnable -> this.r.a(zu.a(runnable, ☃.i().a(), ☃::j)));
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
/*      */   public CompletableFuture<Either<cgh, zr.a>> a(zr ☃) {
/*  655 */     brd brd = ☃.i();
/*  656 */     CompletableFuture<Either<List<cfw>, zr.a>> completableFuture = a(brd, 1, ☃ -> cga.m);
/*      */     
/*  658 */     CompletableFuture<Either<cgh, zr.a>> completableFuture1 = completableFuture.thenApplyAsync(☃ -> ☃.flatMap(()), runnable -> this.r.a(zu.a(☃, runnable)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  664 */     completableFuture1.thenAcceptAsync(either -> either.mapLeft(()), runnable -> this.r.a(zu.a(☃, runnable)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  672 */     return completableFuture1;
/*      */   }
/*      */   
/*      */   public CompletableFuture<Either<cgh, zr.a>> b(zr ☃) {
/*  676 */     return ☃.a(cga.m, this)
/*  677 */       .thenApplyAsync(☃ -> ☃.mapLeft(()), runnable -> this.r.a(zu.a(☃, runnable)));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int c() {
/*  686 */     return this.u.get();
/*      */   }
/*      */   
/*      */   private boolean a(cfw ☃) {
/*  690 */     this.m.a(☃.g());
/*      */     
/*  692 */     if (!☃.j()) {
/*  693 */       return false;
/*      */     }
/*      */     
/*  696 */     ☃.a(this.h.T());
/*  697 */     ☃.a(false);
/*      */     
/*  699 */     brd brd = ☃.g();
/*      */     try {
/*  701 */       cga cga = ☃.k();
/*      */       
/*  703 */       if (cga.g() != cga.a.b) {
/*  704 */         if (h(brd))
/*      */         {
/*  706 */           return false;
/*      */         }
/*      */ 
/*      */         
/*  710 */         if (cga == cga.a && ☃.h().values().stream().noneMatch(crv::e)) {
/*  711 */           return false;
/*      */         }
/*      */       } 
/*      */       
/*  715 */       this.h.Z().c("chunkSave");
/*  716 */       md md = cgt.a(this.h, ☃);
/*  717 */       a(brd, md);
/*  718 */       a(brd, cga.g());
/*  719 */       return true;
/*  720 */     } catch (Exception exception) {
/*  721 */       c.error("Failed to save chunk {},{}", Integer.valueOf(brd.b), Integer.valueOf(brd.c), exception);
/*      */       
/*  723 */       return false;
/*      */     } 
/*      */   } private boolean h(brd ☃) {
/*      */     md md;
/*  727 */     byte b = this.z.get(☃.a());
/*  728 */     if (b != 0) {
/*  729 */       return (b == 1);
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/*  734 */       md = i(☃);
/*  735 */       if (md == null) {
/*  736 */         g(☃);
/*  737 */         return false;
/*      */       } 
/*  739 */     } catch (Exception exception) {
/*  740 */       c.error("Failed to read chunk {}", ☃, exception);
/*  741 */       g(☃);
/*  742 */       return false;
/*      */     } 
/*      */     
/*  745 */     cga.a a1 = cgt.a(md);
/*  746 */     return (a(☃, a1) == 1);
/*      */   }
/*      */   
/*      */   protected void a(int ☃) {
/*  750 */     int i = afm.a(☃ + 1, 3, 33);
/*  751 */     if (i != this.B) {
/*  752 */       int j = this.B;
/*  753 */       this.B = i;
/*  754 */       this.t.a(this.B);
/*  755 */       for (ObjectIterator<zr> objectIterator = this.d.values().iterator(); objectIterator.hasNext(); ) { zr zr = objectIterator.next();
/*  756 */         brd brd = zr.i();
/*  757 */         oj[] arrayOfOj = new oj[2];
/*  758 */         a(brd, false).forEach(aah1 -> {
/*      */               int j = b(☃, aah1, true);
/*      */               boolean bool1 = (j <= i);
/*      */               boolean bool2 = (j <= this.B);
/*      */               a(aah1, ☃, (oj<?>[])arrayOfOj, bool1, bool2);
/*      */             }); }
/*      */     
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(aah ☃, brd brd1, oj<?>[] arrayOfOj, boolean bool1, boolean bool2) {
/*  771 */     if (☃.l != this.h) {
/*      */       return;
/*      */     }
/*  774 */     if (bool2 && !bool1) {
/*  775 */       zr zr = b(brd1.a());
/*  776 */       if (zr != null) {
/*  777 */         cgh cgh = zr.d();
/*  778 */         if (cgh != null) {
/*  779 */           a(☃, arrayOfOj, cgh);
/*      */         }
/*  781 */         rz.a(this.h, brd1);
/*      */       } 
/*      */     } 
/*  784 */     if (!bool2 && bool1) {
/*  785 */       ☃.a(brd1);
/*      */     }
/*      */   }
/*      */   
/*      */   public int d() {
/*  790 */     return this.e.size();
/*      */   }
/*      */   
/*      */   protected a e() {
/*  794 */     return this.t;
/*      */   }
/*      */   
/*      */   protected Iterable<zr> f() {
/*  798 */     return Iterables.unmodifiableIterable((Iterable)this.e.values());
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
/*      */   void a(Writer ☃) throws IOException {
/*  816 */     aew aew = aew.a().a("x").a("z").a("level").a("in_memory").a("status").a("full_status").a("accessible_ready").a("ticking_ready").a("entity_ticking_ready").a("ticket").a("spawning").a("entity_count").a("block_entity_count").a(☃);
/*      */     
/*  818 */     for (ObjectBidirectionalIterator<Long2ObjectMap.Entry<zr>> objectBidirectionalIterator = this.e.long2ObjectEntrySet().iterator(); objectBidirectionalIterator.hasNext(); ) { Long2ObjectMap.Entry<zr> entry = objectBidirectionalIterator.next();
/*  819 */       brd brd = new brd(entry.getLongKey());
/*  820 */       zr zr = (zr)entry.getValue();
/*  821 */       Optional<cfw> optional = Optional.ofNullable(zr.f());
/*  822 */       Optional<cgh> optional1 = optional.flatMap(☃ -> (☃ instanceof cgh) ? Optional.<cgh>of((cgh)☃) : Optional.empty());
/*  823 */       aew.a(new Object[] { 
/*  824 */             Integer.valueOf(brd.b), 
/*  825 */             Integer.valueOf(brd.c), 
/*  826 */             Integer.valueOf(zr.j()), 
/*  827 */             Boolean.valueOf(optional.isPresent()), optional
/*  828 */             .map(cfw::k).orElse(null), optional1
/*  829 */             .map(cgh::u).orElse(null), 
/*  830 */             a(zr.c()), 
/*  831 */             a(zr.a()), 
/*  832 */             a(zr.b()), this.t
/*  833 */             .c(entry.getLongKey()), 
/*  834 */             Boolean.valueOf(!d(brd)), optional1
/*  835 */             .<Integer>map(☃ -> Integer.valueOf(Stream.<aes<aqa>>of(☃.z()).mapToInt(aes::size).sum())).orElse(Integer.valueOf(0)), optional1
/*  836 */             .<Integer>map(☃ -> Integer.valueOf(☃.y().size())).orElse(Integer.valueOf(0)) }); }
/*      */   
/*      */   }
/*      */ 
/*      */   
/*      */   private static String a(CompletableFuture<Either<cgh, zr.a>> ☃) {
/*      */     try {
/*  843 */       Either<cgh, zr.a> either = ☃.getNow(null);
/*  844 */       if (either != null) {
/*  845 */         return (String)either.map(☃ -> "done", ☃ -> "unloaded");
/*      */       }
/*  847 */       return "not completed";
/*      */     }
/*  849 */     catch (CompletionException completionException) {
/*  850 */       return "failed " + completionException.getCause().getMessage();
/*  851 */     } catch (CancellationException cancellationException) {
/*  852 */       return "cancelled";
/*      */     } 
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private md i(brd ☃) throws IOException {
/*  858 */     md md = e(☃);
/*  859 */     if (md == null) {
/*  860 */       return null;
/*      */     }
/*      */     
/*  863 */     return a(this.h.Y(), this.l, md);
/*      */   }
/*      */   
/*      */   boolean d(brd ☃) {
/*  867 */     long l = ☃.a();
/*  868 */     if (!this.t.d(l)) {
/*  869 */       return true;
/*      */     }
/*      */ 
/*      */     
/*  873 */     return this.x.a(l).noneMatch(aah1 -> (!aah1.a_() && a(☃, aah1) < 16384.0D));
/*      */   }
/*      */   
/*      */   private boolean b(aah ☃) {
/*  877 */     return (☃.a_() && !this.h.V().b(brt.p));
/*      */   }
/*      */   
/*      */   void a(aah ☃, boolean bool) {
/*  881 */     boolean bool1 = b(☃);
/*  882 */     boolean bool2 = this.x.c(☃);
/*  883 */     int i = afm.c(☃.cD()) >> 4;
/*  884 */     int j = afm.c(☃.cH()) >> 4;
/*  885 */     if (bool) {
/*  886 */       this.x.a(brd.a(i, j), ☃, bool1);
/*  887 */       c(☃);
/*      */       
/*  889 */       if (!bool1) {
/*  890 */         this.t.a(gp.a(☃), ☃);
/*      */       }
/*      */     } else {
/*  893 */       gp gp = ☃.O();
/*  894 */       this.x.a(gp.r().a(), ☃);
/*  895 */       if (!bool2) {
/*  896 */         this.t.b(gp, ☃);
/*      */       }
/*      */     } 
/*  899 */     for (int k = i - this.B; k <= i + this.B; k++) {
/*  900 */       for (int m = j - this.B; m <= j + this.B; m++) {
/*  901 */         brd brd = new brd(k, m);
/*  902 */         a(☃, brd, (oj<?>[])new oj[2], !bool, bool);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private gp c(aah ☃) {
/*  908 */     gp gp = gp.a(☃);
/*  909 */     ☃.a(gp);
/*  910 */     ☃.b.a(new qw(gp.a(), gp.c()));
/*  911 */     return gp;
/*      */   }
/*      */   
/*      */   public void a(aah ☃) {
/*  915 */     for (ObjectIterator<b> objectIterator = this.y.values().iterator(); objectIterator.hasNext(); ) { b b = objectIterator.next();
/*  916 */       if (b.a(b) == ☃) {
/*  917 */         b.a(this.h.x()); continue;
/*      */       } 
/*  919 */       b.b(☃); }
/*      */ 
/*      */ 
/*      */     
/*  923 */     int i = afm.c(☃.cD()) >> 4;
/*  924 */     int j = afm.c(☃.cH()) >> 4;
/*      */     
/*  926 */     gp gp1 = ☃.O();
/*  927 */     gp gp2 = gp.a(☃);
/*      */     
/*  929 */     long l1 = gp1.r().a();
/*  930 */     long l2 = gp2.r().a();
/*      */     
/*  932 */     boolean bool1 = this.x.d(☃);
/*  933 */     boolean bool2 = b(☃);
/*  934 */     boolean bool3 = (gp1.s() != gp2.s());
/*  935 */     if (bool3 || bool1 != bool2) {
/*  936 */       c(☃);
/*      */       
/*  938 */       if (!bool1) {
/*  939 */         this.t.b(gp1, ☃);
/*      */       }
/*      */       
/*  942 */       if (!bool2) {
/*  943 */         this.t.a(gp2, ☃);
/*      */       }
/*      */       
/*  946 */       if (!bool1 && bool2) {
/*  947 */         this.x.a(☃);
/*      */       }
/*      */       
/*  950 */       if (bool1 && !bool2) {
/*  951 */         this.x.b(☃);
/*      */       }
/*      */       
/*  954 */       if (l1 != l2) {
/*  955 */         this.x.a(l1, l2, ☃);
/*      */       }
/*      */     } 
/*      */     
/*  959 */     int k = gp1.a();
/*  960 */     int m = gp1.c();
/*  961 */     if (Math.abs(k - i) <= this.B * 2 && Math.abs(m - j) <= this.B * 2) {
/*  962 */       int n = Math.min(i, k) - this.B;
/*  963 */       int i1 = Math.min(j, m) - this.B;
/*      */       
/*  965 */       int i2 = Math.max(i, k) + this.B;
/*  966 */       int i3 = Math.max(j, m) + this.B;
/*      */       
/*  968 */       for (int i4 = n; i4 <= i2; i4++) {
/*  969 */         for (int i5 = i1; i5 <= i3; i5++) {
/*  970 */           brd brd = new brd(i4, i5);
/*  971 */           boolean bool4 = (a(brd, k, m) <= this.B);
/*  972 */           boolean bool5 = (a(brd, i, j) <= this.B);
/*  973 */           a(☃, brd, (oj<?>[])new oj[2], bool4, bool5);
/*      */         } 
/*      */       } 
/*      */     } else {
/*  977 */       int n; for (n = k - this.B; n <= k + this.B; n++) {
/*  978 */         for (int i1 = m - this.B; i1 <= m + this.B; i1++) {
/*  979 */           brd brd = new brd(n, i1);
/*  980 */           boolean bool4 = true;
/*  981 */           boolean bool5 = false;
/*  982 */           a(☃, brd, (oj<?>[])new oj[2], true, false);
/*      */         } 
/*      */       } 
/*  985 */       for (n = i - this.B; n <= i + this.B; n++) {
/*  986 */         for (int i1 = j - this.B; i1 <= j + this.B; i1++) {
/*  987 */           brd brd = new brd(n, i1);
/*  988 */           boolean bool4 = false;
/*  989 */           boolean bool5 = true;
/*  990 */           a(☃, brd, (oj<?>[])new oj[2], false, true);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public Stream<aah> a(brd ☃, boolean bool) {
/*  998 */     return this.x.a(☃.a()).filter(aah1 -> {
/*      */           int i = b(☃, aah1, true);
/*      */ 
/*      */ 
/*      */           
/* 1003 */           return (i > this.B) ? false : ((!bool || i == this.B));
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(aqa ☃) {
/* 1009 */     if (☃ instanceof bbp) {
/*      */       return;
/*      */     }
/* 1012 */     aqe<?> aqe = ☃.X();
/* 1013 */     int i = aqe.m() * 16;
/* 1014 */     int j = aqe.n();
/* 1015 */     if (this.y.containsKey(☃.Y())) {
/* 1016 */       throw (IllegalStateException)x.c(new IllegalStateException("Entity is already tracked!"));
/*      */     }
/* 1018 */     b b = new b(this, ☃, i, j, aqe.o());
/* 1019 */     this.y.put(☃.Y(), b);
/* 1020 */     b.a(this.h.x());
/*      */     
/* 1022 */     if (☃ instanceof aah) {
/* 1023 */       aah aah = (aah)☃;
/* 1024 */       a(aah, true);
/* 1025 */       for (ObjectIterator<b> objectIterator = this.y.values().iterator(); objectIterator.hasNext(); ) { b b1 = objectIterator.next();
/* 1026 */         if (b.a(b1) != aah) {
/* 1027 */           b1.b(aah);
/*      */         } }
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void b(aqa ☃) {
/* 1034 */     if (☃ instanceof aah) {
/* 1035 */       aah aah = (aah)☃;
/* 1036 */       a(aah, false);
/* 1037 */       for (ObjectIterator<b> objectIterator = this.y.values().iterator(); objectIterator.hasNext(); ) { b b1 = objectIterator.next();
/* 1038 */         b1.a(aah); }
/*      */     
/*      */     } 
/* 1041 */     b b = (b)this.y.remove(☃.Y());
/* 1042 */     if (b != null) {
/* 1043 */       b.a();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void g() {
/* 1050 */     List<aah> ☃ = Lists.newArrayList();
/* 1051 */     List<aah> list1 = this.h.x();
/*      */     ObjectIterator<b> objectIterator;
/* 1053 */     for (objectIterator = this.y.values().iterator(); objectIterator.hasNext(); ) { b b = objectIterator.next();
/* 1054 */       gp gp1 = b.b(b);
/* 1055 */       gp gp2 = gp.a(b.a(b));
/*      */       
/* 1057 */       if (!Objects.equals(gp1, gp2)) {
/* 1058 */         b.a(list1);
/* 1059 */         aqa aqa = b.a(b);
/* 1060 */         if (aqa instanceof aah) {
/* 1061 */           ☃.add((aah)aqa);
/*      */         }
/* 1063 */         b.a(b, gp2);
/*      */       } 
/* 1065 */       b.c(b).a(); }
/*      */ 
/*      */     
/* 1068 */     if (!☃.isEmpty()) {
/* 1069 */       for (objectIterator = this.y.values().iterator(); objectIterator.hasNext(); ) { b b = objectIterator.next();
/* 1070 */         b.a(☃); }
/*      */     
/*      */     }
/*      */   }
/*      */   
/*      */   protected void a(aqa ☃, oj<?> oj1) {
/* 1076 */     b b = (b)this.y.get(☃.Y());
/* 1077 */     if (b != null) {
/* 1078 */       b.a(oj1);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void b(aqa ☃, oj<?> oj1) {
/* 1083 */     b b = (b)this.y.get(☃.Y());
/* 1084 */     if (b != null) {
/* 1085 */       b.b(oj1);
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(aah ☃, oj<?>[] arrayOfOj, cgh cgh1) {
/* 1090 */     if (arrayOfOj[0] == null) {
/* 1091 */       arrayOfOj[0] = new pt(cgh1, 65535);
/* 1092 */       arrayOfOj[1] = new pw(cgh1.g(), this.i, true);
/*      */     } 
/* 1094 */     ☃.a(cgh1.g(), arrayOfOj[0], arrayOfOj[1]);
/*      */     
/* 1096 */     rz.a(this.h, cgh1.g());
/*      */ 
/*      */ 
/*      */     
/* 1100 */     List<aqa> list1 = Lists.newArrayList();
/* 1101 */     List<aqa> list2 = Lists.newArrayList();
/*      */ 
/*      */     
/* 1104 */     for (ObjectIterator<b> objectIterator = this.y.values().iterator(); objectIterator.hasNext(); ) { b b = objectIterator.next();
/* 1105 */       aqa aqa = b.a(b);
/* 1106 */       if (aqa != ☃ && aqa.V == (cgh1.g()).b && aqa.X == (cgh1.g()).c) {
/* 1107 */         b.b(☃);
/*      */         
/* 1109 */         if (aqa instanceof aqn && ((aqn)aqa).eC() != null) {
/* 1110 */           list1.add(aqa);
/*      */         }
/*      */         
/* 1113 */         if (!aqa.cn().isEmpty()) {
/* 1114 */           list2.add(aqa);
/*      */         }
/*      */       }  }
/*      */ 
/*      */     
/* 1119 */     if (!list1.isEmpty()) {
/* 1120 */       for (aqa aqa : list1) {
/* 1121 */         ☃.b.a(new rb(aqa, ((aqn)aqa).eC()));
/*      */       }
/*      */     }
/*      */     
/* 1125 */     if (!list2.isEmpty()) {
/* 1126 */       for (aqa aqa : list2) {
/* 1127 */         ☃.b.a(new rh(aqa));
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected azo h() {
/* 1133 */     return this.m;
/*      */   }
/*      */   
/*      */   public CompletableFuture<Void> a(cgh ☃) {
/* 1137 */     return this.j.f(() -> ☃.a(this.h));
/*      */   }
/*      */   
/*      */   class a extends zy {
/*      */     protected a(zs this$0, Executor ☃, Executor executor1) {
/* 1142 */       super(☃, executor1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean a(long ☃) {
/* 1147 */       return zs.a(this.a).contains(☃);
/*      */     }
/*      */ 
/*      */     
/*      */     @Nullable
/*      */     protected zr b(long ☃) {
/* 1153 */       return this.a.a(☃);
/*      */     }
/*      */ 
/*      */     
/*      */     @Nullable
/*      */     protected zr a(long ☃, int i, @Nullable zr zr1, int j) {
/* 1159 */       return zs.a(this.a, ☃, i, zr1, j);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   class b
/*      */   {
/*      */     private final aaf b;
/*      */     
/*      */     private final aqa c;
/*      */     private final int d;
/*      */     private gp e;
/* 1171 */     private final Set<aah> f = Sets.newHashSet();
/*      */     
/*      */     public b(zs this$0, aqa ☃, int i, int j, boolean bool) {
/* 1174 */       this.b = new aaf(zs.b(this$0), ☃, j, bool, this::a);
/* 1175 */       this.c = ☃;
/* 1176 */       this.d = i;
/* 1177 */       this.e = gp.a(☃);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object ☃) {
/* 1182 */       if (☃ instanceof b) {
/* 1183 */         return (((b)☃).c.Y() == this.c.Y());
/*      */       }
/*      */       
/* 1186 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/* 1191 */       return this.c.Y();
/*      */     }
/*      */     
/*      */     public void a(oj<?> ☃) {
/* 1195 */       for (aah aah : this.f) {
/* 1196 */         aah.b.a(☃);
/*      */       }
/*      */     }
/*      */     
/*      */     public void b(oj<?> ☃) {
/* 1201 */       a(☃);
/* 1202 */       if (this.c instanceof aah) {
/* 1203 */         ((aah)this.c).b.a(☃);
/*      */       }
/*      */     }
/*      */     
/*      */     public void a() {
/* 1208 */       for (aah ☃ : this.f) {
/* 1209 */         this.b.a(☃);
/*      */       }
/*      */     }
/*      */     
/*      */     public void a(aah ☃) {
/* 1214 */       if (this.f.remove(☃)) {
/* 1215 */         this.b.a(☃);
/*      */       }
/*      */     }
/*      */     
/*      */     public void b(aah ☃) {
/* 1220 */       if (☃ == this.c) {
/*      */         return;
/*      */       }
/*      */       
/* 1224 */       dcn dcn = ☃.cA().d(this.b.b());
/* 1225 */       int i = Math.min(b(), (zs.c(this.a) - 1) * 16);
/* 1226 */       boolean bool = (dcn.b >= -i && dcn.b <= i && dcn.d >= -i && dcn.d <= i && this.c.a(☃));
/*      */       
/* 1228 */       if (bool) {
/* 1229 */         boolean bool1 = this.c.k;
/* 1230 */         if (!bool1) {
/* 1231 */           brd brd = new brd(this.c.V, this.c.X);
/* 1232 */           zr zr = this.a.b(brd.a());
/* 1233 */           if (zr != null && zr.d() != null) {
/* 1234 */             bool1 = (zs.a(brd, ☃, false) <= zs.c(this.a));
/*      */           }
/*      */         } 
/* 1237 */         if (bool1 && this.f.add(☃)) {
/* 1238 */           this.b.b(☃);
/*      */         }
/*      */       }
/* 1241 */       else if (this.f.remove(☃)) {
/* 1242 */         this.b.a(☃);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     private int a(int ☃) {
/* 1248 */       return zs.b(this.a).l().b(☃);
/*      */     }
/*      */     
/*      */     private int b() {
/* 1252 */       Collection<aqa> ☃ = this.c.co();
/* 1253 */       int i = this.d;
/* 1254 */       for (aqa aqa1 : ☃) {
/* 1255 */         int j = aqa1.X().m() * 16;
/* 1256 */         if (j > i) {
/* 1257 */           i = j;
/*      */         }
/*      */       } 
/* 1260 */       return a(i);
/*      */     }
/*      */     
/*      */     public void a(List<aah> ☃) {
/* 1264 */       for (aah aah : ☃)
/* 1265 */         b(aah); 
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */