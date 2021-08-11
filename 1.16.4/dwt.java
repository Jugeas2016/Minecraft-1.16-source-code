/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.world.level.ColorResolver;
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
/*     */ public class dwt
/*     */   extends brx
/*     */ {
/*  77 */   private final Int2ObjectMap<aqa> a = (Int2ObjectMap<aqa>)new Int2ObjectOpenHashMap();
/*     */   
/*     */   private final dwu b;
/*     */   
/*     */   private final eae c;
/*     */   private final a d;
/*     */   private final dzv x;
/*  84 */   private final djz y = djz.C();
/*  85 */   private final List<dzj> z = Lists.newArrayList();
/*  86 */   private ddn A = new ddn();
/*  87 */   private final Map<String, cxx> B = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   private int C;
/*     */   
/*     */   private final Object2ObjectArrayMap<ColorResolver, dkp> D;
/*     */   
/*     */   private final dwr E;
/*     */ 
/*     */   
/*     */   public dwt(dwu ☃, a a1, vj<brx> vj1, chd chd1, int i, Supplier<anw> supplier, eae eae1, boolean bool, long l) {
/*  98 */     super(a1, vj1, chd1, supplier, true, bool, l); this.D = x.<Object2ObjectArrayMap<ColorResolver, dkp>>a(new Object2ObjectArrayMap(3), ☃ -> { ☃.put(dzr.a, new dkp()); ☃.put(dzr.b, new dkp()); ☃.put(dzr.c, new dkp());
/*  99 */         }); this.b = ☃;
/* 100 */     this.E = new dwr(this, i);
/* 101 */     this.d = a1;
/* 102 */     this.c = eae1;
/* 103 */     this.x = dzv.a(chd1);
/* 104 */     b(new fx(8, 64, 8), 0.0F);
/*     */     
/* 106 */     Q();
/* 107 */     R();
/*     */   }
/*     */   
/*     */   public dzv a() {
/* 111 */     return this.x;
/*     */   }
/*     */   
/*     */   public void a(BooleanSupplier ☃) {
/* 115 */     f().s();
/* 116 */     y();
/*     */     
/* 118 */     Z().a("blocks");
/*     */     
/* 120 */     this.E.a(☃);
/*     */     
/* 122 */     Z().c();
/*     */   }
/*     */   
/*     */   private void y() {
/* 126 */     a(this.u.e() + 1L);
/* 127 */     if (this.u.q().b(brt.j)) {
/* 128 */       b(this.u.f() + 1L);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/* 133 */     this.d.a(☃);
/*     */   }
/*     */   
/*     */   public void b(long ☃) {
/* 137 */     if (☃ < 0L) {
/* 138 */       ☃ = -☃;
/* 139 */       ((brt.a)V().<brt.a>a(brt.j)).a(false, (MinecraftServer)null);
/*     */     } else {
/* 141 */       ((brt.a)V().<brt.a>a(brt.j)).a(true, (MinecraftServer)null);
/*     */     } 
/* 143 */     this.d.b(☃);
/*     */   }
/*     */   
/*     */   public Iterable<aqa> b() {
/* 147 */     return (Iterable<aqa>)this.a.values();
/*     */   }
/*     */   
/*     */   public void g() {
/* 151 */     anw ☃ = Z();
/* 152 */     ☃.a("entities");
/*     */     
/* 154 */     ObjectIterator<Int2ObjectMap.Entry<aqa>> objectIterator = this.a.int2ObjectEntrySet().iterator();
/* 155 */     while (objectIterator.hasNext()) {
/* 156 */       Int2ObjectMap.Entry<aqa> entry = (Int2ObjectMap.Entry<aqa>)objectIterator.next();
/* 157 */       aqa aqa = (aqa)entry.getValue();
/* 158 */       if (aqa.br()) {
/*     */         continue;
/*     */       }
/*     */       
/* 162 */       ☃.a("tick");
/* 163 */       if (!aqa.y) {
/* 164 */         a(this::a, aqa);
/*     */       }
/* 166 */       ☃.c();
/*     */       
/* 168 */       ☃.a("remove");
/* 169 */       if (aqa.y) {
/* 170 */         objectIterator.remove();
/* 171 */         d(aqa);
/*     */       } 
/* 173 */       ☃.c();
/*     */     } 
/*     */     
/* 176 */     O();
/* 177 */     ☃.c();
/*     */   }
/*     */   
/*     */   public void a(aqa ☃) {
/* 181 */     if (!(☃ instanceof bfw) && !n().a(☃)) {
/* 182 */       b(☃);
/*     */       
/*     */       return;
/*     */     } 
/* 186 */     ☃.g(☃.cD(), ☃.cE(), ☃.cH());
/* 187 */     ☃.r = ☃.p;
/* 188 */     ☃.s = ☃.q;
/*     */     
/* 190 */     if (☃.U || ☃.a_()) {
/* 191 */       ☃.K++;
/* 192 */       Z().a(() -> gm.S.b(☃.X()).toString());
/* 193 */       ☃.j();
/* 194 */       Z().c();
/*     */     } 
/*     */     
/* 197 */     b(☃);
/*     */     
/* 199 */     if (☃.U) {
/* 200 */       for (aqa aqa1 : ☃.cn()) {
/* 201 */         a(☃, aqa1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aqa ☃, aqa aqa1) {
/* 207 */     if (aqa1.y || aqa1.ct() != ☃) {
/* 208 */       aqa1.l();
/*     */       return;
/*     */     } 
/* 211 */     if (!(aqa1 instanceof bfw) && !n().a(aqa1)) {
/*     */       return;
/*     */     }
/*     */     
/* 215 */     aqa1.g(aqa1.cD(), aqa1.cE(), aqa1.cH());
/* 216 */     aqa1.r = aqa1.p;
/* 217 */     aqa1.s = aqa1.q;
/*     */     
/* 219 */     if (aqa1.U) {
/* 220 */       aqa1.K++;
/* 221 */       aqa1.ba();
/*     */     } 
/*     */     
/* 224 */     b(aqa1);
/*     */     
/* 226 */     if (aqa1.U) {
/* 227 */       for (aqa aqa2 : aqa1.cn()) {
/* 228 */         a(aqa1, aqa2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(aqa ☃) {
/* 234 */     if (!☃.cl()) {
/*     */       return;
/*     */     }
/* 237 */     Z().a("chunkCheck");
/* 238 */     int i = afm.c(☃.cD() / 16.0D);
/* 239 */     int j = afm.c(☃.cE() / 16.0D);
/* 240 */     int k = afm.c(☃.cH() / 16.0D);
/*     */     
/* 242 */     if (!☃.U || ☃.V != i || ☃.W != j || ☃.X != k) {
/* 243 */       if (☃.U && b(☃.V, ☃.X)) {
/* 244 */         d(☃.V, ☃.X).a(☃, ☃.W);
/*     */       }
/*     */       
/* 247 */       if (☃.ck() || b(i, k)) {
/* 248 */         d(i, k).a(☃);
/*     */       } else {
/* 250 */         if (☃.U) {
/* 251 */           e.warn("Entity {} left loaded chunk area", ☃);
/*     */         }
/* 253 */         ☃.U = false;
/*     */       } 
/*     */     } 
/* 256 */     Z().c();
/*     */   }
/*     */   
/*     */   public void a(cgh ☃) {
/* 260 */     this.m.addAll(☃.y().values());
/* 261 */     this.E.l().a(☃.g(), false);
/*     */   }
/*     */   
/*     */   public void e(int ☃, int i) {
/* 265 */     this.D.forEach((colorResolver, dkp1) -> dkp1.a(☃, i));
/*     */   }
/*     */   
/*     */   public void i() {
/* 269 */     this.D.forEach((☃, dkp1) -> dkp1.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, int i) {
/* 274 */     return true;
/*     */   }
/*     */   
/*     */   public int j() {
/* 278 */     return this.a.size();
/*     */   }
/*     */   
/*     */   public void a(int ☃, dzj dzj1) {
/* 282 */     b(☃, dzj1);
/* 283 */     this.z.add(dzj1);
/*     */   }
/*     */   
/*     */   public void a(int ☃, aqa aqa1) {
/* 287 */     b(☃, aqa1);
/*     */   }
/*     */   
/*     */   private void b(int ☃, aqa aqa1) {
/* 291 */     d(☃);
/* 292 */     this.a.put(☃, aqa1);
/* 293 */     n().b(afm.c(aqa1.cD() / 16.0D), afm.c(aqa1.cH() / 16.0D), cga.m, true).a(aqa1);
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 297 */     aqa aqa = (aqa)this.a.remove(☃);
/* 298 */     if (aqa != null) {
/* 299 */       aqa.ad();
/* 300 */       d(aqa);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(aqa ☃) {
/* 305 */     ☃.V();
/* 306 */     if (☃.U) {
/* 307 */       d(☃.V, ☃.X).b(☃);
/*     */     }
/* 309 */     this.z.remove(☃);
/*     */   }
/*     */   
/*     */   public void b(cgh ☃) {
/* 313 */     for (ObjectIterator<Int2ObjectMap.Entry<aqa>> objectIterator = this.a.int2ObjectEntrySet().iterator(); objectIterator.hasNext(); ) { Int2ObjectMap.Entry<aqa> entry = objectIterator.next();
/* 314 */       aqa aqa = (aqa)entry.getValue();
/* 315 */       int i = afm.c(aqa.cD() / 16.0D);
/* 316 */       int j = afm.c(aqa.cH() / 16.0D);
/* 317 */       if (i == (☃.g()).b && j == (☃.g()).c) {
/* 318 */         ☃.a(aqa);
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa a(int ☃) {
/* 326 */     return (aqa)this.a.get(☃);
/*     */   }
/*     */   
/*     */   public void b(fx ☃, ceh ceh1) {
/* 330 */     a(☃, ceh1, 19);
/*     */   }
/*     */ 
/*     */   
/*     */   public void S() {
/* 335 */     this.b.a().a(new of("multiplayer.status.quitting"));
/*     */   }
/*     */   
/*     */   public void c(int ☃, int i, int j) {
/* 339 */     int k = 32;
/* 340 */     Random random = new Random();
/*     */     
/* 342 */     boolean bool = false;
/*     */     
/* 344 */     if (this.y.q.l() == bru.c) {
/* 345 */       for (bmb bmb : this.y.s.bn()) {
/* 346 */         if (bmb.b() == bup.go.h()) {
/* 347 */           bool = true;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 353 */     fx.a a1 = new fx.a();
/* 354 */     for (int m = 0; m < 667; m++) {
/* 355 */       a(☃, i, j, 16, random, bool, a1);
/* 356 */       a(☃, i, j, 32, random, bool, a1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, int k, Random random, boolean bool, fx.a a1) {
/* 361 */     int m = ☃ + this.t.nextInt(k) - this.t.nextInt(k);
/* 362 */     int n = i + this.t.nextInt(k) - this.t.nextInt(k);
/* 363 */     int i1 = j + this.t.nextInt(k) - this.t.nextInt(k);
/*     */     
/* 365 */     a1.d(m, n, i1);
/* 366 */     ceh ceh = d_(a1);
/* 367 */     ceh.b().a(ceh, this, a1, random);
/*     */     
/* 369 */     cux cux = b(a1);
/*     */     
/* 371 */     if (!cux.c()) {
/* 372 */       cux.a(this, a1, random);
/*     */       
/* 374 */       hf hf = cux.h();
/* 375 */       if (hf != null && this.t.nextInt(10) == 0) {
/* 376 */         boolean bool1 = ceh.d(this, a1, gc.a);
/* 377 */         fx fx = a1.c();
/* 378 */         a(fx, d_(fx), hf, bool1);
/*     */       } 
/*     */     } 
/*     */     
/* 382 */     if (bool && ceh.a(bup.go)) {
/* 383 */       a(hh.c, m + 0.5D, n + 0.5D, i1 + 0.5D, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */     
/* 386 */     if (!ceh.r(this, a1)) {
/* 387 */       v(a1).o().ifPresent(bsu1 -> {
/*     */             if (bsu1.a(this.t)) {
/*     */               a(bsu1.a(), ☃.u() + this.t.nextDouble(), ☃.v() + this.t.nextDouble(), ☃.w() + this.t.nextDouble(), 0.0D, 0.0D, 0.0D);
/*     */             }
/*     */           });
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(fx ☃, ceh ceh1, hf hf1, boolean bool) {
/* 396 */     if (!ceh1.m().c()) {
/*     */       return;
/*     */     }
/*     */     
/* 400 */     ddh ddh = ceh1.k(this, ☃);
/* 401 */     double d = ddh.c(gc.a.b);
/* 402 */     if (d < 1.0D) {
/* 403 */       if (bool) {
/* 404 */         a(☃.u(), (☃.u() + 1), ☃.w(), (☃.w() + 1), (☃.v() + 1) - 0.05D, hf1);
/*     */       }
/* 406 */     } else if (!ceh1.a(aed.W)) {
/* 407 */       double d1 = ddh.b(gc.a.b);
/* 408 */       if (d1 > 0.0D) {
/* 409 */         a(☃, hf1, ddh, ☃.v() + d1 - 0.05D);
/*     */       } else {
/* 411 */         fx fx1 = ☃.c();
/* 412 */         ceh ceh2 = d_(fx1);
/* 413 */         ddh ddh1 = ceh2.k(this, fx1);
/* 414 */         double d2 = ddh1.c(gc.a.b);
/* 415 */         if (d2 < 1.0D && ceh2.m().c()) {
/* 416 */           a(☃, hf1, ddh, ☃.v() - 0.05D);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(fx ☃, hf hf1, ddh ddh1, double d) {
/* 423 */     a(☃.u() + ddh1.b(gc.a.a), ☃
/* 424 */         .u() + ddh1.c(gc.a.a), ☃
/* 425 */         .w() + ddh1.b(gc.a.c), ☃
/* 426 */         .w() + ddh1.c(gc.a.c), d, hf1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(double ☃, double d1, double d2, double d3, double d4, hf hf1) {
/* 432 */     a(hf1, afm.d(this.t.nextDouble(), ☃, d1), d4, afm.d(this.t.nextDouble(), d2, d3), 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */   
/*     */   public void m() {
/* 436 */     ObjectIterator<Int2ObjectMap.Entry<aqa>> ☃ = this.a.int2ObjectEntrySet().iterator();
/* 437 */     while (☃.hasNext()) {
/* 438 */       Int2ObjectMap.Entry<aqa> entry = (Int2ObjectMap.Entry<aqa>)☃.next();
/* 439 */       aqa aqa = (aqa)entry.getValue();
/* 440 */       if (aqa.y) {
/* 441 */         ☃.remove();
/* 442 */         d(aqa);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public m a(l ☃) {
/* 449 */     m m = super.a(☃);
/*     */     
/* 451 */     m.a("Server brand", () -> this.y.s.B());
/* 452 */     m.a("Server type", () -> (this.y.H() == null) ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
/*     */     
/* 454 */     return m;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable bfw ☃, double d1, double d2, double d3, adp adp1, adr adr1, float f1, float f2) {
/* 459 */     if (☃ == this.y.s) {
/* 460 */       a(d1, d2, d3, adp1, adr1, f1, f2, false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable bfw ☃, aqa aqa1, adp adp1, adr adr1, float f1, float f2) {
/* 466 */     if (☃ == this.y.s) {
/* 467 */       this.y.W().a(new eml(adp1, adr1, aqa1));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(fx ☃, adp adp1, adr adr1, float f1, float f2, boolean bool) {
/* 472 */     a(☃.u() + 0.5D, ☃.v() + 0.5D, ☃.w() + 0.5D, adp1, adr1, f1, f2, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2, adp adp1, adr adr1, float f1, float f2, boolean bool) {
/* 477 */     double d = this.y.h.k().b().c(☃, d1, d2);
/* 478 */     emp emp = new emp(adp1, adr1, f1, f2, ☃, d1, d2);
/*     */     
/* 480 */     if (bool && d > 100.0D) {
/*     */       
/* 482 */       double d3 = Math.sqrt(d) / 40.0D;
/* 483 */       this.y.W().a(emp, (int)(d3 * 20.0D));
/*     */     } else {
/* 485 */       this.y.W().a(emp);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2, double d3, double d4, double d5, @Nullable md md1) {
/* 491 */     this.y.f.a(new dxv.e(this, ☃, d1, d2, d3, d4, d5, this.y.f, md1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(oj<?> ☃) {
/* 496 */     this.b.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bor o() {
/* 501 */     return this.b.d();
/*     */   }
/*     */   
/*     */   public void a(ddn ☃) {
/* 505 */     this.A = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public bso<buo> J() {
/* 510 */     return brm.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public bso<cuw> I() {
/* 515 */     return brm.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public dwr n() {
/* 520 */     return this.E;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cxx a(String ☃) {
/* 526 */     return this.B.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cxx ☃) {
/* 531 */     this.B.put(☃.d(), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int t() {
/* 536 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddn G() {
/* 541 */     return this.A;
/*     */   }
/*     */ 
/*     */   
/*     */   public aen p() {
/* 546 */     return this.b.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public gn r() {
/* 551 */     return this.b.o();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, ceh ceh1, ceh ceh2, int i) {
/* 556 */     this.c.a(this, ☃, ceh1, ceh2, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(fx ☃, ceh ceh1, ceh ceh2) {
/* 561 */     this.c.a(☃, ceh1, ceh2);
/*     */   }
/*     */   
/*     */   public void d(int ☃, int i, int j) {
/* 565 */     this.c.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, fx fx1, int i) {
/* 570 */     this.c.b(☃, fx1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, fx fx1, int i) {
/* 575 */     this.c.a(☃, fx1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable bfw ☃, int i, fx fx1, int j) {
/*     */     try {
/* 581 */       this.c.a(☃, i, fx1, j);
/* 582 */     } catch (Throwable throwable) {
/* 583 */       l l = l.a(throwable, "Playing level event");
/* 584 */       m m = l.a("Level event being played");
/*     */       
/* 586 */       m.a("Block coordinates", m.a(fx1));
/* 587 */       m.a("Event source", ☃);
/* 588 */       m.a("Event type", Integer.valueOf(i));
/* 589 */       m.a("Event data", Integer.valueOf(j));
/*     */       
/* 591 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hf ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 597 */     this.c.a(☃, ☃.b().c(), d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hf ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 602 */     this.c.a(☃, (☃.b().c() || bool), d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hf ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 607 */     this.c.a(☃, false, true, d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hf ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 612 */     this.c.a(☃, (☃.b().c() || bool), true, d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<dzj> x() {
/* 617 */     return this.z;
/*     */   }
/*     */ 
/*     */   
/*     */   public bsv a(int ☃, int i, int j) {
/* 622 */     return r().<bsv>b(gm.ay).d(btb.b);
/*     */   }
/*     */   
/*     */   public float g(float ☃) {
/* 626 */     float f1 = f(☃);
/*     */     
/* 628 */     float f2 = 1.0F - afm.b(f1 * 6.2831855F) * 2.0F + 0.2F;
/* 629 */     f2 = afm.a(f2, 0.0F, 1.0F);
/*     */     
/* 631 */     f2 = 1.0F - f2;
/*     */     
/* 633 */     f2 = (float)(f2 * (1.0D - (d(☃) * 5.0F) / 16.0D));
/* 634 */     f2 = (float)(f2 * (1.0D - (b(☃) * 5.0F) / 16.0D));
/*     */     
/* 636 */     return f2 * 0.8F + 0.2F;
/*     */   }
/*     */   
/*     */   public dcn a(fx ☃, float f) {
/* 640 */     float f1 = f(f);
/*     */     
/* 642 */     float f2 = afm.b(f1 * 6.2831855F) * 2.0F + 0.5F;
/* 643 */     f2 = afm.a(f2, 0.0F, 1.0F);
/*     */     
/* 645 */     bsv bsv = v(☃);
/* 646 */     int i = bsv.a();
/*     */     
/* 648 */     float f3 = (i >> 16 & 0xFF) / 255.0F;
/* 649 */     float f4 = (i >> 8 & 0xFF) / 255.0F;
/* 650 */     float f5 = (i & 0xFF) / 255.0F;
/* 651 */     f3 *= f2;
/* 652 */     f4 *= f2;
/* 653 */     f5 *= f2;
/*     */     
/* 655 */     float f6 = d(f);
/* 656 */     if (f6 > 0.0F) {
/* 657 */       float f8 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.6F;
/*     */       
/* 659 */       float f9 = 1.0F - f6 * 0.75F;
/* 660 */       f3 = f3 * f9 + f8 * (1.0F - f9);
/* 661 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 662 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/*     */     } 
/* 664 */     float f7 = b(f);
/* 665 */     if (f7 > 0.0F) {
/* 666 */       float f8 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.2F;
/*     */       
/* 668 */       float f9 = 1.0F - f7 * 0.75F;
/* 669 */       f3 = f3 * f9 + f8 * (1.0F - f9);
/* 670 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 671 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/*     */     } 
/*     */     
/* 674 */     if (this.C > 0) {
/* 675 */       float f8 = this.C - f;
/* 676 */       if (f8 > 1.0F) {
/* 677 */         f8 = 1.0F;
/*     */       }
/* 679 */       f8 *= 0.45F;
/* 680 */       f3 = f3 * (1.0F - f8) + 0.8F * f8;
/* 681 */       f4 = f4 * (1.0F - f8) + 0.8F * f8;
/* 682 */       f5 = f5 * (1.0F - f8) + 1.0F * f8;
/*     */     } 
/*     */     
/* 685 */     return new dcn(f3, f4, f5);
/*     */   }
/*     */   
/*     */   public dcn h(float ☃) {
/* 689 */     float f1 = f(☃);
/*     */     
/* 691 */     float f2 = afm.b(f1 * 6.2831855F) * 2.0F + 0.5F;
/* 692 */     f2 = afm.a(f2, 0.0F, 1.0F);
/*     */     
/* 694 */     float f3 = 1.0F;
/* 695 */     float f4 = 1.0F;
/* 696 */     float f5 = 1.0F;
/*     */     
/* 698 */     float f6 = d(☃);
/* 699 */     if (f6 > 0.0F) {
/* 700 */       float f8 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.6F;
/*     */       
/* 702 */       float f9 = 1.0F - f6 * 0.95F;
/* 703 */       f3 = f3 * f9 + f8 * (1.0F - f9);
/* 704 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 705 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/*     */     } 
/*     */     
/* 708 */     f3 *= f2 * 0.9F + 0.1F;
/* 709 */     f4 *= f2 * 0.9F + 0.1F;
/* 710 */     f5 *= f2 * 0.85F + 0.15F;
/*     */     
/* 712 */     float f7 = b(☃);
/* 713 */     if (f7 > 0.0F) {
/* 714 */       float f8 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.2F;
/*     */       
/* 716 */       float f9 = 1.0F - f7 * 0.95F;
/* 717 */       f3 = f3 * f9 + f8 * (1.0F - f9);
/* 718 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 719 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/*     */     } 
/*     */     
/* 722 */     return new dcn(f3, f4, f5);
/*     */   }
/*     */   
/*     */   public float i(float ☃) {
/* 726 */     float f1 = f(☃);
/*     */     
/* 728 */     float f2 = 1.0F - afm.b(f1 * 6.2831855F) * 2.0F + 0.25F;
/* 729 */     f2 = afm.a(f2, 0.0F, 1.0F);
/*     */     
/* 731 */     return f2 * f2 * 0.5F;
/*     */   }
/*     */   
/*     */   public int s() {
/* 735 */     return this.C;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(int ☃) {
/* 740 */     this.C = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(gc ☃, boolean bool) {
/* 745 */     boolean bool1 = a().e();
/*     */     
/* 747 */     if (!bool) {
/* 748 */       return bool1 ? 0.9F : 1.0F;
/*     */     }
/*     */     
/* 751 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 753 */         return bool1 ? 0.9F : 0.5F;
/*     */       case 2:
/* 755 */         return bool1 ? 0.9F : 1.0F;
/*     */       case 3:
/*     */       case 4:
/* 758 */         return 0.8F;
/*     */       case 5:
/*     */       case 6:
/* 761 */         return 0.6F;
/*     */     } 
/* 763 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(fx ☃, ColorResolver colorResolver) {
/* 769 */     dkp dkp = (dkp)this.D.get(colorResolver);
/* 770 */     return dkp.a(☃, () -> b(☃, colorResolver));
/*     */   }
/*     */   
/*     */   public int b(fx ☃, ColorResolver colorResolver) {
/* 774 */     int i = (djz.C()).k.F;
/* 775 */     if (i == 0) {
/* 776 */       return colorResolver.getColor(v(☃), ☃.u(), ☃.w());
/*     */     }
/*     */     
/* 779 */     int j = (i * 2 + 1) * (i * 2 + 1);
/* 780 */     int k = 0;
/* 781 */     int m = 0;
/* 782 */     int n = 0;
/*     */     
/* 784 */     ga ga = new ga(☃.u() - i, ☃.v(), ☃.w() - i, ☃.u() + i, ☃.v(), ☃.w() + i);
/* 785 */     fx.a a1 = new fx.a();
/* 786 */     while (ga.a()) {
/* 787 */       a1.d(ga.b(), ga.c(), ga.d());
/* 788 */       int i1 = colorResolver.getColor(v(a1), a1.u(), a1.w());
/*     */       
/* 790 */       k += (i1 & 0xFF0000) >> 16;
/* 791 */       m += (i1 & 0xFF00) >> 8;
/* 792 */       n += i1 & 0xFF;
/*     */     } 
/*     */     
/* 795 */     return (k / j & 0xFF) << 16 | (m / j & 0xFF) << 8 | n / j & 0xFF;
/*     */   }
/*     */   
/*     */   public fx u() {
/* 799 */     fx ☃ = new fx(this.u.a(), this.u.b(), this.u.c());
/* 800 */     if (!f().a(☃)) {
/* 801 */       ☃ = a(chn.a.e, new fx(f().a(), 0.0D, f().b()));
/*     */     }
/* 803 */     return ☃;
/*     */   }
/*     */   
/*     */   public float v() {
/* 807 */     return this.u.d();
/*     */   }
/*     */   
/*     */   public void b(fx ☃, float f) {
/* 811 */     this.u.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 816 */     return "ClientLevel";
/*     */   }
/*     */ 
/*     */   
/*     */   public a w() {
/* 821 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */     implements cyo
/*     */   {
/*     */     private final boolean a;
/*     */     private final brt b;
/*     */     private final boolean c;
/*     */     private int d;
/*     */     private int e;
/*     */     private int f;
/*     */     private float g;
/*     */     private long h;
/*     */     private long i;
/*     */     private boolean j;
/*     */     private aor k;
/*     */     private boolean l;
/*     */     
/*     */     public a(aor ☃, boolean bool1, boolean bool2) {
/* 842 */       this.k = ☃;
/* 843 */       this.a = bool1;
/* 844 */       this.c = bool2;
/* 845 */       this.b = new brt();
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 850 */       return this.d;
/*     */     }
/*     */ 
/*     */     
/*     */     public int b() {
/* 855 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public int c() {
/* 860 */       return this.f;
/*     */     }
/*     */ 
/*     */     
/*     */     public float d() {
/* 865 */       return this.g;
/*     */     }
/*     */ 
/*     */     
/*     */     public long e() {
/* 870 */       return this.h;
/*     */     }
/*     */ 
/*     */     
/*     */     public long f() {
/* 875 */       return this.i;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(int ☃) {
/* 880 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c(int ☃) {
/* 885 */       this.e = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d(int ☃) {
/* 890 */       this.f = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(float ☃) {
/* 895 */       this.g = ☃;
/*     */     }
/*     */     
/*     */     public void a(long ☃) {
/* 899 */       this.h = ☃;
/*     */     }
/*     */     
/*     */     public void b(long ☃) {
/* 903 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(fx ☃, float f) {
/* 908 */       this.d = ☃.u();
/* 909 */       this.e = ☃.v();
/* 910 */       this.f = ☃.w();
/* 911 */       this.g = f;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean i() {
/* 916 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean k() {
/* 921 */       return this.j;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(boolean ☃) {
/* 926 */       this.j = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean n() {
/* 931 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public brt q() {
/* 936 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public aor s() {
/* 941 */       return this.k;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean t() {
/* 946 */       return this.l;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(m ☃) {
/* 951 */       super.a(☃);
/*     */     }
/*     */     
/*     */     public void a(aor ☃) {
/* 955 */       this.k = ☃;
/*     */     }
/*     */     
/*     */     public void a(boolean ☃) {
/* 959 */       this.l = ☃;
/*     */     }
/*     */     
/*     */     public double g() {
/* 963 */       if (this.c) {
/* 964 */         return 0.0D;
/*     */       }
/* 966 */       return 63.0D;
/*     */     }
/*     */     
/*     */     public double h() {
/* 970 */       if (this.c) {
/* 971 */         return 1.0D;
/*     */       }
/* 973 */       return 0.03125D;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */