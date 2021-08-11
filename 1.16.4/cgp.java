/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*     */ import java.util.BitSet;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Stream;
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
/*     */ public class cgp
/*     */   implements cfw
/*     */ {
/*  41 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final brd b;
/*     */   
/*     */   private volatile boolean c;
/*     */   
/*     */   @Nullable
/*     */   private cfx d;
/*     */   
/*     */   @Nullable
/*     */   private volatile cuo e;
/*     */   
/*  53 */   private final Map<chn.a, chn> f = Maps.newEnumMap(chn.a.class);
/*     */   
/*  55 */   private volatile cga g = cga.a;
/*  56 */   private final Map<fx, ccj> h = Maps.newHashMap();
/*  57 */   private final Map<fx, md> i = Maps.newHashMap();
/*  58 */   private final cgi[] j = new cgi[16];
/*  59 */   private final List<md> k = Lists.newArrayList();
/*     */   
/*  61 */   private final List<fx> l = Lists.newArrayList();
/*  62 */   private final ShortList[] m = new ShortList[16];
/*     */   
/*  64 */   private final Map<cla<?>, crv<?>> n = Maps.newHashMap();
/*  65 */   private final Map<cla<?>, LongSet> o = Maps.newHashMap();
/*     */   
/*     */   private final cgr p;
/*     */   
/*     */   private final cgq<buo> q;
/*     */   private final cgq<cuw> r;
/*     */   private long s;
/*  72 */   private final Map<chm.a, BitSet> t = (Map<chm.a, BitSet>)new Object2ObjectArrayMap();
/*     */   
/*     */   private volatile boolean u;
/*     */   
/*     */   public cgp(brd ☃, cgr cgr1) {
/*  77 */     this(☃, cgr1, null, new cgq<>(☃ -> 
/*     */ 
/*     */ 
/*     */           
/*  81 */           (☃ == null || ☃.n().g()), ☃), new cgq<>(☃ -> 
/*  82 */           (☃ == null || ☃ == cuy.a), ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public cgp(brd ☃, cgr cgr1, @Nullable cgi[] arrayOfCgi, cgq<buo> cgq1, cgq<cuw> cgq2) {
/*  87 */     this.b = ☃;
/*  88 */     this.p = cgr1;
/*  89 */     this.q = cgq1;
/*  90 */     this.r = cgq2;
/*  91 */     if (arrayOfCgi != null) {
/*  92 */       if (this.j.length == arrayOfCgi.length) {
/*  93 */         System.arraycopy(arrayOfCgi, 0, this.j, 0, this.j.length);
/*     */       } else {
/*  95 */         a.warn("Could not set level chunk sections, array length is {} instead of {}", Integer.valueOf(arrayOfCgi.length), Integer.valueOf(this.j.length));
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh d_(fx ☃) {
/* 102 */     int i = ☃.v();
/* 103 */     if (brx.b(i)) {
/* 104 */       return bup.la.n();
/*     */     }
/*     */     
/* 107 */     cgi cgi1 = d()[i >> 4];
/* 108 */     if (cgi.a(cgi1)) {
/* 109 */       return bup.a.n();
/*     */     }
/*     */     
/* 112 */     return cgi1.a(☃.u() & 0xF, i & 0xF, ☃.w() & 0xF);
/*     */   }
/*     */ 
/*     */   
/*     */   public cux b(fx ☃) {
/* 117 */     int i = ☃.v();
/* 118 */     if (brx.b(i)) {
/* 119 */       return cuy.a.h();
/*     */     }
/*     */     
/* 122 */     cgi cgi1 = d()[i >> 4];
/* 123 */     if (cgi.a(cgi1)) {
/* 124 */       return cuy.a.h();
/*     */     }
/*     */     
/* 127 */     return cgi1.b(☃.u() & 0xF, i & 0xF, ☃.w() & 0xF);
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<fx> m() {
/* 132 */     return this.l.stream();
/*     */   }
/*     */   
/*     */   public ShortList[] w() {
/* 136 */     ShortList[] ☃ = new ShortList[16];
/* 137 */     for (fx fx : this.l) {
/* 138 */       cfw.a(☃, fx.v() >> 4).add(l(fx));
/*     */     }
/* 140 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(short ☃, int i) {
/* 144 */     k(a(☃, i, this.b));
/*     */   }
/*     */   
/*     */   public void k(fx ☃) {
/* 148 */     this.l.add(☃.h());
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(fx ☃, ceh ceh1, boolean bool) {
/* 154 */     int i = ☃.u();
/* 155 */     int j = ☃.v();
/* 156 */     int k = ☃.w();
/*     */     
/* 158 */     if (j < 0 || j >= 256) {
/* 159 */       return bup.la.n();
/*     */     }
/*     */     
/* 162 */     if (this.j[j >> 4] == cgh.a && ceh1.a(bup.a)) {
/* 163 */       return ceh1;
/*     */     }
/*     */     
/* 166 */     if (ceh1.f() > 0) {
/* 167 */       this.l.add(new fx((i & 0xF) + g().d(), j, (k & 0xF) + g().e()));
/*     */     }
/*     */     
/* 170 */     cgi cgi1 = a(j >> 4);
/* 171 */     ceh ceh2 = cgi1.a(i & 0xF, j & 0xF, k & 0xF, ceh1);
/*     */     
/* 173 */     if (this.g.b(cga.i) && 
/* 174 */       ceh1 != ceh2 && (ceh1
/* 175 */       .b(this, ☃) != ceh2.b(this, ☃) || ceh1
/* 176 */       .f() != ceh2.f() || ceh1
/* 177 */       .e() || ceh2.e())) {
/*     */       
/* 179 */       cuo cuo1 = e();
/* 180 */       cuo1.a(☃);
/*     */     } 
/*     */ 
/*     */     
/* 184 */     EnumSet<chn.a> enumSet1 = k().h();
/* 185 */     EnumSet<chn.a> enumSet2 = null;
/*     */     
/* 187 */     for (chn.a a : enumSet1) {
/* 188 */       chn chn = this.f.get(a);
/* 189 */       if (chn == null) {
/* 190 */         if (enumSet2 == null) {
/* 191 */           enumSet2 = EnumSet.noneOf(chn.a.class);
/*     */         }
/* 193 */         enumSet2.add(a);
/*     */       } 
/*     */     } 
/*     */     
/* 197 */     if (enumSet2 != null) {
/* 198 */       chn.a(this, enumSet2);
/*     */     }
/*     */     
/* 201 */     for (chn.a a : enumSet1) {
/* 202 */       ((chn)this.f.get(a)).a(i & 0xF, j, k & 0xF, ceh1);
/*     */     }
/*     */     
/* 205 */     return ceh2;
/*     */   }
/*     */   
/*     */   public cgi a(int ☃) {
/* 209 */     if (this.j[☃] == cgh.a) {
/* 210 */       this.j[☃] = new cgi(☃ << 4);
/*     */     }
/*     */     
/* 213 */     return this.j[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, ccj ccj1) {
/* 218 */     ccj1.a(☃);
/* 219 */     this.h.put(☃, ccj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<fx> c() {
/* 224 */     Set<fx> ☃ = Sets.newHashSet(this.i.keySet());
/* 225 */     ☃.addAll(this.h.keySet());
/* 226 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj c(fx ☃) {
/* 232 */     return this.h.get(☃);
/*     */   }
/*     */   
/*     */   public Map<fx, ccj> x() {
/* 236 */     return this.h;
/*     */   }
/*     */   
/*     */   public void b(md ☃) {
/* 240 */     this.k.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqa ☃) {
/* 245 */     if (☃.br()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 251 */     md md = new md();
/* 252 */     ☃.d(md);
/* 253 */     b(md);
/*     */   }
/*     */   
/*     */   public List<md> y() {
/* 257 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(cfx ☃) {
/* 261 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cfx i() {
/* 267 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 272 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 277 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public cga k() {
/* 282 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(cga ☃) {
/* 286 */     this.g = ☃;
/* 287 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public cgi[] d() {
/* 292 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cuo e() {
/* 298 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<Map.Entry<chn.a, chn>> f() {
/* 303 */     return Collections.unmodifiableSet(this.f.entrySet());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(chn.a ☃, long[] arrayOfLong) {
/* 308 */     a(☃).a(arrayOfLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public chn a(chn.a ☃) {
/* 313 */     return this.f.computeIfAbsent(☃, ☃ -> new chn(this, ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(chn.a ☃, int i, int j) {
/* 318 */     chn chn = this.f.get(☃);
/* 319 */     if (chn == null) {
/* 320 */       chn.a(this, EnumSet.of(☃));
/* 321 */       chn = this.f.get(☃);
/*     */     } 
/* 323 */     return chn.a(i & 0xF, j & 0xF) - 1;
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
/*     */   public brd g() {
/* 344 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃) {}
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public crv<?> a(cla<?> ☃) {
/* 354 */     return this.n.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cla<?> ☃, crv<?> crv1) {
/* 359 */     this.n.put(☃, crv1);
/* 360 */     this.c = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<cla<?>, crv<?>> h() {
/* 365 */     return Collections.unmodifiableMap(this.n);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Map<cla<?>, crv<?>> ☃) {
/* 370 */     this.n.clear();
/* 371 */     this.n.putAll(☃);
/* 372 */     this.c = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public LongSet b(cla<?> ☃) {
/* 377 */     return this.o.computeIfAbsent(☃, ☃ -> new LongOpenHashSet());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cla<?> ☃, long l) {
/* 382 */     ((LongSet)this.o.computeIfAbsent(☃, ☃ -> new LongOpenHashSet())).add(l);
/* 383 */     this.c = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<cla<?>, LongSet> v() {
/* 388 */     return Collections.unmodifiableMap(this.o);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(Map<cla<?>, LongSet> ☃) {
/* 393 */     this.o.clear();
/* 394 */     this.o.putAll(☃);
/* 395 */     this.c = true;
/*     */   }
/*     */   
/*     */   public static short l(fx ☃) {
/* 399 */     int i = ☃.u();
/* 400 */     int j = ☃.v();
/* 401 */     int k = ☃.w();
/* 402 */     int m = i & 0xF;
/* 403 */     int n = j & 0xF;
/* 404 */     int i1 = k & 0xF;
/* 405 */     return (short)(m | n << 4 | i1 << 8);
/*     */   }
/*     */   
/*     */   public static fx a(short ☃, int i, brd brd1) {
/* 409 */     int j = (☃ & 0xF) + (brd1.b << 4);
/* 410 */     int k = (☃ >>> 4 & 0xF) + (i << 4);
/* 411 */     int m = (☃ >>> 8 & 0xF) + (brd1.c << 4);
/* 412 */     return new fx(j, k, m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(fx ☃) {
/* 417 */     if (!brx.m(☃)) {
/* 418 */       cfw.a(this.m, ☃.v() >> 4).add(l(☃));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ShortList[] l() {
/* 424 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(short ☃, int i) {
/* 429 */     cfw.a(this.m, i).add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cgq<buo> s() {
/* 434 */     return this.q;
/*     */   }
/*     */ 
/*     */   
/*     */   public cgq<cuw> t() {
/* 439 */     return this.r;
/*     */   }
/*     */ 
/*     */   
/*     */   public cgr p() {
/* 444 */     return this.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(long ☃) {
/* 449 */     this.s = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public long q() {
/* 454 */     return this.s;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 459 */     this.i.put(new fx(☃.h("x"), ☃.h("y"), ☃.h("z")), ☃);
/*     */   }
/*     */   
/*     */   public Map<fx, md> z() {
/* 463 */     return Collections.unmodifiableMap(this.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public md i(fx ☃) {
/* 468 */     return this.i.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public md j(fx ☃) {
/* 474 */     ccj ccj = c(☃);
/* 475 */     if (ccj != null) {
/* 476 */       return ccj.a(new md());
/*     */     }
/* 478 */     return this.i.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(fx ☃) {
/* 483 */     this.h.remove(☃);
/* 484 */     this.i.remove(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public BitSet a(chm.a ☃) {
/* 489 */     return this.t.get(☃);
/*     */   }
/*     */   
/*     */   public BitSet b(chm.a ☃) {
/* 493 */     return this.t.computeIfAbsent(☃, ☃ -> new BitSet(65536));
/*     */   }
/*     */   
/*     */   public void a(chm.a ☃, BitSet bitSet) {
/* 497 */     this.t.put(☃, bitSet);
/*     */   }
/*     */   
/*     */   public void a(cuo ☃) {
/* 501 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r() {
/* 506 */     return this.u;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 511 */     this.u = ☃;
/* 512 */     a(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */