/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortListIterator;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
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
/*     */ public class cgh
/*     */   implements cfw
/*     */ {
/*  59 */   private static final Logger b = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*  66 */   public static final cgi a = null;
/*     */   
/*  68 */   private final cgi[] c = new cgi[16];
/*     */   private cfx d;
/*  70 */   private final Map<fx, md> e = Maps.newHashMap();
/*     */   private boolean f;
/*     */   private final brx g;
/*  73 */   private final Map<chn.a, chn> h = Maps.newEnumMap(chn.a.class);
/*     */   
/*     */   private final cgr i;
/*     */   
/*  77 */   private final Map<fx, ccj> j = Maps.newHashMap();
/*     */   
/*     */   private final aes<aqa>[] k;
/*  80 */   private final Map<cla<?>, crv<?>> l = Maps.newHashMap();
/*  81 */   private final Map<cla<?>, LongSet> m = Maps.newHashMap();
/*     */   
/*  83 */   private final ShortList[] n = new ShortList[16];
/*     */   
/*     */   private bso<buo> o;
/*     */   
/*     */   private bso<cuw> p;
/*     */   private boolean q;
/*     */   private long r;
/*     */   private volatile boolean s;
/*     */   private long t;
/*     */   @Nullable
/*     */   private Supplier<zr.b> u;
/*     */   @Nullable
/*     */   private Consumer<cgh> v;
/*     */   private final brd w;
/*     */   private volatile boolean x;
/*     */   
/*     */   public cgh(brx ☃, brd brd1, cfx cfx1) {
/* 100 */     this(☃, brd1, cfx1, cgr.a, brm.b(), brm.b(), 0L, null, null);
/*     */   }
/*     */   
/*     */   public cgh(brx ☃, brd brd1, cfx cfx1, cgr cgr1, bso<buo> bso1, bso<cuw> bso2, long l, @Nullable cgi[] arrayOfCgi, @Nullable Consumer<cgh> consumer) {
/* 104 */     this.k = (aes<aqa>[])new aes[16];
/* 105 */     this.g = ☃;
/* 106 */     this.w = brd1;
/* 107 */     this.i = cgr1;
/*     */     
/* 109 */     for (chn.a a : chn.a.values()) {
/* 110 */       if (cga.m.h().contains(a)) {
/* 111 */         this.h.put(a, new chn(this, a));
/*     */       }
/*     */     } 
/*     */     
/* 115 */     for (int i = 0; i < this.k.length; i++) {
/* 116 */       this.k[i] = new aes<>(aqa.class);
/*     */     }
/*     */     
/* 119 */     this.d = cfx1;
/* 120 */     this.o = bso1;
/* 121 */     this.p = bso2;
/* 122 */     this.t = l;
/* 123 */     this.v = consumer;
/* 124 */     if (arrayOfCgi != null) {
/* 125 */       if (this.c.length == arrayOfCgi.length) {
/* 126 */         System.arraycopy(arrayOfCgi, 0, this.c, 0, this.c.length);
/*     */       } else {
/* 128 */         b.warn("Could not set level chunk sections, array length is {} instead of {}", Integer.valueOf(arrayOfCgi.length), Integer.valueOf(this.c.length));
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public cgh(brx ☃, cgp cgp1) {
/* 134 */     this(☃, cgp1.g(), cgp1.i(), cgp1.p(), cgp1.s(), cgp1.t(), cgp1.q(), cgp1.d(), null);
/*     */     
/* 136 */     for (md md : cgp1.y()) {
/* 137 */       aqe.a(md, ☃, ☃ -> {
/*     */             a(☃);
/*     */             
/*     */             return ☃;
/*     */           });
/*     */     } 
/* 143 */     for (ccj ccj : cgp1.x().values()) {
/* 144 */       a(ccj);
/*     */     }
/*     */     
/* 147 */     this.e.putAll(cgp1.z());
/*     */     
/* 149 */     for (int i = 0; i < (cgp1.l()).length; i++) {
/* 150 */       this.n[i] = cgp1.l()[i];
/*     */     }
/*     */     
/* 153 */     a(cgp1.h());
/* 154 */     b(cgp1.v());
/*     */     
/* 156 */     for (Map.Entry<chn.a, chn> entry : cgp1.f()) {
/* 157 */       if (cga.m.h().contains(entry.getKey())) {
/* 158 */         a(entry.getKey()).a(((chn)entry.getValue()).a());
/*     */       }
/*     */     } 
/*     */     
/* 162 */     b(cgp1.r());
/*     */     
/* 164 */     this.s = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public chn a(chn.a ☃) {
/* 169 */     return this.h.computeIfAbsent(☃, ☃ -> new chn(this, ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<fx> c() {
/* 174 */     Set<fx> ☃ = Sets.newHashSet(this.e.keySet());
/* 175 */     ☃.addAll(this.j.keySet());
/* 176 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public cgi[] d() {
/* 181 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh d_(fx ☃) {
/* 186 */     int i = ☃.u();
/* 187 */     int j = ☃.v();
/* 188 */     int k = ☃.w();
/* 189 */     if (this.g.ab()) {
/* 190 */       ceh ceh = null;
/* 191 */       if (j == 60) {
/* 192 */         ceh = bup.go.n();
/*     */       }
/* 194 */       if (j == 70) {
/* 195 */         ceh = chj.b(i, k);
/*     */       }
/* 197 */       return (ceh == null) ? bup.a.n() : ceh;
/*     */     } 
/*     */     
/*     */     try {
/* 201 */       if (j >= 0 && j >> 4 < this.c.length) {
/* 202 */         cgi cgi1 = this.c[j >> 4];
/* 203 */         if (!cgi.a(cgi1)) {
/* 204 */           return cgi1.a(i & 0xF, j & 0xF, k & 0xF);
/*     */         }
/*     */       } 
/* 207 */       return bup.a.n();
/* 208 */     } catch (Throwable throwable) {
/* 209 */       l l = l.a(throwable, "Getting block state");
/* 210 */       m m = l.a("Block being got");
/* 211 */       m.a("Location", () -> m.a(☃, i, j));
/* 212 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public cux b(fx ☃) {
/* 218 */     return a(☃.u(), ☃.v(), ☃.w());
/*     */   }
/*     */   
/*     */   public cux a(int ☃, int i, int j) {
/*     */     try {
/* 223 */       if (i >= 0 && i >> 4 < this.c.length) {
/* 224 */         cgi cgi1 = this.c[i >> 4];
/* 225 */         if (!cgi.a(cgi1)) {
/* 226 */           return cgi1.b(☃ & 0xF, i & 0xF, j & 0xF);
/*     */         }
/*     */       } 
/* 229 */       return cuy.a.h();
/* 230 */     } catch (Throwable throwable) {
/* 231 */       l l = l.a(throwable, "Getting fluid state");
/* 232 */       m m = l.a("Block being got");
/* 233 */       m.a("Location", () -> m.a(☃, i, j));
/* 234 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(fx ☃, ceh ceh1, boolean bool) {
/* 241 */     int i = ☃.u() & 0xF;
/* 242 */     int j = ☃.v();
/* 243 */     int k = ☃.w() & 0xF;
/*     */     
/* 245 */     cgi cgi1 = this.c[j >> 4];
/* 246 */     if (cgi1 == a) {
/*     */       
/* 248 */       if (ceh1.g()) {
/* 249 */         return null;
/*     */       }
/*     */       
/* 252 */       cgi1 = new cgi(j >> 4 << 4);
/* 253 */       this.c[j >> 4] = cgi1;
/*     */     } 
/*     */     
/* 256 */     boolean bool1 = cgi1.c();
/* 257 */     ceh ceh2 = cgi1.a(i, j & 0xF, k, ceh1);
/*     */     
/* 259 */     if (ceh2 == ceh1) {
/* 260 */       return null;
/*     */     }
/*     */     
/* 263 */     buo buo1 = ceh1.b();
/* 264 */     buo buo2 = ceh2.b();
/*     */     
/* 266 */     ((chn)this.h.get(chn.a.e)).a(i, j, k, ceh1);
/* 267 */     ((chn)this.h.get(chn.a.f)).a(i, j, k, ceh1);
/* 268 */     ((chn)this.h.get(chn.a.d)).a(i, j, k, ceh1);
/* 269 */     ((chn)this.h.get(chn.a.b)).a(i, j, k, ceh1);
/* 270 */     boolean bool2 = cgi1.c();
/* 271 */     if (bool1 != bool2) {
/* 272 */       this.g.H().l().a(☃, bool2);
/*     */     }
/*     */     
/* 275 */     if (!this.g.v) {
/* 276 */       ceh2.b(this.g, ☃, ceh1, bool);
/* 277 */     } else if (buo2 != buo1 && buo2 instanceof bwm) {
/* 278 */       this.g.o(☃);
/*     */     } 
/*     */     
/* 281 */     if (!cgi1.a(i, j & 0xF, k).a(buo1)) {
/* 282 */       return null;
/*     */     }
/*     */     
/* 285 */     if (buo2 instanceof bwm) {
/* 286 */       ccj ccj = a(☃, a.c);
/* 287 */       if (ccj != null) {
/* 288 */         ccj.s();
/*     */       }
/*     */     } 
/*     */     
/* 292 */     if (!this.g.v) {
/* 293 */       ceh1.a(this.g, ☃, ceh2, bool);
/*     */     }
/* 295 */     if (buo1 instanceof bwm) {
/* 296 */       ccj ccj = a(☃, a.c);
/* 297 */       if (ccj == null) {
/* 298 */         ccj = ((bwm)buo1).a(this.g);
/* 299 */         this.g.a(☃, ccj);
/*     */       } else {
/* 301 */         ccj.s();
/*     */       } 
/*     */     } 
/*     */     
/* 305 */     this.s = true;
/* 306 */     return ceh2;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cuo e() {
/* 312 */     return this.g.H().l();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqa ☃) {
/* 317 */     this.q = true;
/*     */     
/* 319 */     int i = afm.c(☃.cD() / 16.0D);
/* 320 */     int j = afm.c(☃.cH() / 16.0D);
/* 321 */     if (i != this.w.b || j != this.w.c) {
/* 322 */       b.warn("Wrong location! ({}, {}) should be ({}, {}), {}", Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.w.b), Integer.valueOf(this.w.c), ☃);
/*     */       
/* 324 */       ☃.y = true;
/*     */     } 
/* 326 */     int k = afm.c(☃.cE() / 16.0D);
/* 327 */     if (k < 0) {
/* 328 */       k = 0;
/*     */     }
/* 330 */     if (k >= this.k.length) {
/* 331 */       k = this.k.length - 1;
/*     */     }
/* 333 */     ☃.U = true;
/* 334 */     ☃.V = this.w.b;
/* 335 */     ☃.W = k;
/* 336 */     ☃.X = this.w.c;
/* 337 */     this.k[k].add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(chn.a ☃, long[] arrayOfLong) {
/* 342 */     ((chn)this.h.get(☃)).a(arrayOfLong);
/*     */   }
/*     */   
/*     */   public void b(aqa ☃) {
/* 346 */     a(☃, ☃.W);
/*     */   }
/*     */   
/*     */   public void a(aqa ☃, int i) {
/* 350 */     if (i < 0) {
/* 351 */       i = 0;
/*     */     }
/* 353 */     if (i >= this.k.length) {
/* 354 */       i = this.k.length - 1;
/*     */     }
/* 356 */     this.k[i].remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(chn.a ☃, int i, int j) {
/* 361 */     return ((chn)this.h.get(☃)).a(i & 0xF, j & 0xF) - 1;
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
/*     */   @Nullable
/*     */   private ccj k(fx ☃) {
/* 383 */     ceh ceh = d_(☃);
/* 384 */     buo buo = ceh.b();
/* 385 */     if (!buo.q()) {
/* 386 */       return null;
/*     */     }
/*     */     
/* 389 */     return ((bwm)buo).a(this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj c(fx ☃) {
/* 395 */     return a(☃, a.c);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ccj a(fx ☃, a a1) {
/* 400 */     ccj ccj = this.j.get(☃);
/* 401 */     if (ccj == null) {
/* 402 */       md md = this.e.remove(☃);
/* 403 */       if (md != null) {
/* 404 */         ccj ccj1 = a(☃, md);
/* 405 */         if (ccj1 != null) {
/* 406 */           return ccj1;
/*     */         }
/*     */       } 
/*     */     } 
/* 410 */     if (ccj == null) {
/* 411 */       if (a1 == a.a) {
/* 412 */         ccj = k(☃);
/* 413 */         this.g.a(☃, ccj);
/*     */       } 
/* 415 */     } else if (ccj.q()) {
/* 416 */       this.j.remove(☃);
/* 417 */       return null;
/*     */     } 
/*     */     
/* 420 */     return ccj;
/*     */   }
/*     */   
/*     */   public void a(ccj ☃) {
/* 424 */     a(☃.o(), ☃);
/* 425 */     if (this.f || this.g.s_()) {
/* 426 */       this.g.a(☃.o(), ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, ccj ccj1) {
/* 432 */     if (!(d_(☃).b() instanceof bwm)) {
/*     */       return;
/*     */     }
/*     */     
/* 436 */     ccj1.a(this.g, ☃);
/* 437 */     ccj1.r();
/*     */     
/* 439 */     ccj ccj2 = this.j.put(☃.h(), ccj1);
/* 440 */     if (ccj2 != null && ccj2 != ccj1) {
/* 441 */       ccj2.al_();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 447 */     this.e.put(new fx(☃.h("x"), ☃.h("y"), ☃.h("z")), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public md j(fx ☃) {
/* 453 */     ccj ccj = c(☃);
/* 454 */     if (ccj != null && !ccj.q()) {
/* 455 */       md md1 = ccj.a(new md());
/* 456 */       md1.a("keepPacked", false);
/* 457 */       return md1;
/*     */     } 
/* 459 */     md md = this.e.get(☃);
/* 460 */     if (md != null) {
/* 461 */       md = md.g();
/* 462 */       md.a("keepPacked", true);
/*     */     } 
/* 464 */     return md;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(fx ☃) {
/* 469 */     if (this.f || this.g.s_()) {
/* 470 */       ccj ccj = this.j.remove(☃);
/* 471 */       if (ccj != null) {
/* 472 */         ccj.al_();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void w() {
/* 478 */     if (this.v != null) {
/* 479 */       this.v.accept(this);
/* 480 */       this.v = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void s() {
/* 485 */     this.s = true;
/*     */   }
/*     */   
/*     */   public void a(@Nullable aqa ☃, dci dci1, List<aqa> list, @Nullable Predicate<? super aqa> predicate) {
/* 489 */     int i = afm.c((dci1.b - 2.0D) / 16.0D);
/* 490 */     int j = afm.c((dci1.e + 2.0D) / 16.0D);
/* 491 */     i = afm.a(i, 0, this.k.length - 1);
/* 492 */     j = afm.a(j, 0, this.k.length - 1);
/*     */     
/* 494 */     for (int k = i; k <= j; k++) {
/* 495 */       aes<aqa> aes1 = this.k[k];
/* 496 */       List<aqa> list1 = aes1.a();
/* 497 */       int m = list1.size();
/*     */       
/* 499 */       for (int n = 0; n < m; n++) {
/* 500 */         aqa aqa1 = list1.get(n);
/* 501 */         if (aqa1.cc().c(dci1) && aqa1 != ☃) {
/* 502 */           if (predicate == null || predicate.test(aqa1)) {
/* 503 */             list.add(aqa1);
/*     */           }
/*     */           
/* 506 */           if (aqa1 instanceof bbr) {
/* 507 */             for (bbp bbp : ((bbr)aqa1).eJ()) {
/* 508 */               if (bbp != ☃ && bbp.cc().c(dci1) && (predicate == null || predicate.test(bbp))) {
/* 509 */                 list.add(bbp);
/*     */               }
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public <T extends aqa> void a(@Nullable aqe<?> ☃, dci dci1, List<? super T> list, Predicate<? super T> predicate) {
/* 519 */     int i = afm.c((dci1.b - 2.0D) / 16.0D);
/* 520 */     int j = afm.c((dci1.e + 2.0D) / 16.0D);
/* 521 */     i = afm.a(i, 0, this.k.length - 1);
/* 522 */     j = afm.a(j, 0, this.k.length - 1);
/*     */     
/* 524 */     for (int k = i; k <= j; k++) {
/* 525 */       for (aqa aqa1 : this.k[k].<aqa>a(aqa.class)) {
/* 526 */         if (☃ != null && aqa1.X() != ☃) {
/*     */           continue;
/*     */         }
/*     */         
/* 530 */         aqa aqa2 = aqa1;
/* 531 */         if (aqa1.cc().c(dci1) && 
/* 532 */           predicate.test((T)aqa2)) {
/* 533 */           list.add((T)aqa2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends aqa> void a(Class<? extends T> ☃, dci dci1, List<T> list, @Nullable Predicate<? super T> predicate) {
/* 541 */     int i = afm.c((dci1.b - 2.0D) / 16.0D);
/* 542 */     int j = afm.c((dci1.e + 2.0D) / 16.0D);
/* 543 */     i = afm.a(i, 0, this.k.length - 1);
/* 544 */     j = afm.a(j, 0, this.k.length - 1);
/*     */     
/* 546 */     for (int k = i; k <= j; k++) {
/* 547 */       for (aqa aqa : this.k[k].<T>a(☃)) {
/* 548 */         if (aqa.cc().c(dci1) && (
/* 549 */           predicate == null || predicate.test((T)aqa))) {
/* 550 */           list.add((T)aqa);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean t() {
/* 558 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public brd g() {
/* 563 */     return this.w;
/*     */   }
/*     */   
/*     */   public void a(@Nullable cfx ☃, nf nf1, md md1, int i) {
/* 567 */     boolean bool = (☃ != null);
/* 568 */     Predicate<fx> predicate = bool ? (☃ -> true) : (fx1 -> ((☃ & 1 << fx1.v() >> 4) != 0));
/* 569 */     Sets.newHashSet(this.j.keySet()).stream().filter(predicate).forEach(this.g::o);
/*     */     
/* 571 */     for (int j = 0; j < this.c.length; j++) {
/* 572 */       cgi cgi1 = this.c[j];
/*     */       
/* 574 */       if ((i & 1 << j) == 0) {
/* 575 */         if (bool && cgi1 != a) {
/* 576 */           this.c[j] = a;
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 581 */         if (cgi1 == a) {
/* 582 */           cgi1 = new cgi(j << 4);
/* 583 */           this.c[j] = cgi1;
/*     */         } 
/*     */         
/* 586 */         cgi1.a(nf1);
/*     */       } 
/*     */     } 
/* 589 */     if (☃ != null) {
/* 590 */       this.d = ☃;
/*     */     }
/* 592 */     for (chn.a a : chn.a.values()) {
/* 593 */       String str = a.b();
/* 594 */       if (md1.c(str, 12)) {
/* 595 */         a(a, md1.o(str));
/*     */       }
/*     */     } 
/* 598 */     for (ccj ccj : this.j.values()) {
/* 599 */       ccj.s();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public cfx i() {
/* 605 */     return this.d;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 609 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public brx x() {
/* 613 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<Map.Entry<chn.a, chn>> f() {
/* 618 */     return Collections.unmodifiableSet(this.h.entrySet());
/*     */   }
/*     */   
/*     */   public Map<fx, ccj> y() {
/* 622 */     return this.j;
/*     */   }
/*     */   
/*     */   public aes<aqa>[] z() {
/* 626 */     return this.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public md i(fx ☃) {
/* 631 */     return this.e.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<fx> m() {
/* 636 */     return StreamSupport.<fx>stream(fx.b(this.w.d(), 0, this.w.e(), this.w.f(), 255, this.w.g()).spliterator(), false).filter(☃ -> (d_(☃).f() != 0));
/*     */   }
/*     */ 
/*     */   
/*     */   public bso<buo> n() {
/* 641 */     return this.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public bso<cuw> o() {
/* 646 */     return this.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 651 */     this.s = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 656 */     return (this.s || (this.q && this.g.T() != this.r));
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 660 */     this.q = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(long ☃) {
/* 665 */     this.r = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public crv<?> a(cla<?> ☃) {
/* 671 */     return this.l.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cla<?> ☃, crv<?> crv1) {
/* 676 */     this.l.put(☃, crv1);
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<cla<?>, crv<?>> h() {
/* 681 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Map<cla<?>, crv<?>> ☃) {
/* 686 */     this.l.clear();
/* 687 */     this.l.putAll(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongSet b(cla<?> ☃) {
/* 692 */     return this.m.computeIfAbsent(☃, ☃ -> new LongOpenHashSet());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cla<?> ☃, long l) {
/* 697 */     ((LongSet)this.m.computeIfAbsent(☃, ☃ -> new LongOpenHashSet())).add(l);
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<cla<?>, LongSet> v() {
/* 702 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(Map<cla<?>, LongSet> ☃) {
/* 707 */     this.m.clear();
/* 708 */     this.m.putAll(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public long q() {
/* 713 */     return this.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(long ☃) {
/* 718 */     this.t = ☃;
/*     */   }
/*     */   
/*     */   public void A() {
/* 722 */     brd ☃ = g();
/* 723 */     for (int i = 0; i < this.n.length; i++) {
/* 724 */       if (this.n[i] != null) {
/* 725 */         for (ShortListIterator<Short> shortListIterator = this.n[i].iterator(); shortListIterator.hasNext(); ) { Short short_ = shortListIterator.next();
/* 726 */           fx fx = cgp.a(short_.shortValue(), i, ☃);
/* 727 */           ceh ceh1 = d_(fx);
/* 728 */           ceh ceh2 = buo.b(ceh1, this.g, fx);
/* 729 */           this.g.a(fx, ceh2, 20); }
/*     */         
/* 731 */         this.n[i].clear();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 736 */     B();
/* 737 */     for (fx fx : Sets.newHashSet(this.e.keySet())) {
/* 738 */       c(fx);
/*     */     }
/* 740 */     this.e.clear();
/* 741 */     this.i.a(this);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ccj a(fx ☃, md md1) {
/*     */     ccj ccj;
/* 747 */     ceh ceh = d_(☃);
/* 748 */     if ("DUMMY".equals(md1.l("id"))) {
/* 749 */       buo buo = ceh.b();
/* 750 */       if (buo instanceof bwm) {
/* 751 */         ccj = ((bwm)buo).a(this.g);
/*     */       } else {
/* 753 */         ccj = null;
/* 754 */         b.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", ☃, ceh);
/*     */       } 
/*     */     } else {
/* 757 */       ccj = ccj.b(ceh, md1);
/*     */     } 
/*     */     
/* 760 */     if (ccj != null) {
/* 761 */       ccj.a(this.g, ☃);
/* 762 */       a(ccj);
/*     */     } else {
/* 764 */       b.warn("Tried to load a block entity for block {} but failed at location {}", ceh, ☃);
/*     */     } 
/*     */     
/* 767 */     return ccj;
/*     */   }
/*     */ 
/*     */   
/*     */   public cgr p() {
/* 772 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public ShortList[] l() {
/* 777 */     return this.n;
/*     */   }
/*     */ 
/*     */   
/*     */   public void B() {
/* 782 */     if (this.o instanceof cgq) {
/* 783 */       ((cgq<buo>)this.o).a(this.g.J(), ☃ -> d_(☃).b());
/* 784 */       this.o = brm.b();
/* 785 */     } else if (this.o instanceof bre) {
/* 786 */       ((bre<buo>)this.o).a(this.g.J());
/* 787 */       this.o = brm.b();
/*     */     } 
/*     */     
/* 790 */     if (this.p instanceof cgq) {
/* 791 */       ((cgq<cuw>)this.p).a(this.g.I(), ☃ -> b(☃).a());
/* 792 */       this.p = brm.b();
/* 793 */     } else if (this.p instanceof bre) {
/* 794 */       ((bre<cuw>)this.p).a(this.g.I());
/* 795 */       this.p = brm.b();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃) {
/* 801 */     if (this.o == brm.b()) {
/* 802 */       this.o = new bre<>(gm.Q::b, ☃.j().a(this.w, true, false), ☃.T());
/* 803 */       a(true);
/*     */     } 
/* 805 */     if (this.p == brm.b()) {
/* 806 */       this.p = new bre<>(gm.O::b, ☃.r_().a(this.w, true, false), ☃.T());
/* 807 */       a(true);
/*     */     } 
/*     */   }
/*     */   
/*     */   public enum a {
/* 812 */     a,
/* 813 */     b,
/* 814 */     c;
/*     */   }
/*     */ 
/*     */   
/*     */   public cga k() {
/* 819 */     return cga.m;
/*     */   }
/*     */   
/*     */   public zr.b u() {
/* 823 */     if (this.u == null) {
/* 824 */       return zr.b.b;
/*     */     }
/* 826 */     return this.u.get();
/*     */   }
/*     */   
/*     */   public void a(Supplier<zr.b> ☃) {
/* 830 */     this.u = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r() {
/* 835 */     return this.x;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 840 */     this.x = ☃;
/* 841 */     a(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */