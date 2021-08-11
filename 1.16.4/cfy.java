/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.BitSet;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class cfy
/*     */ {
/*     */   static {
/*  53 */     gm.a(gm.bc, "noise", cho.d);
/*  54 */     gm.a(gm.bc, "flat", chl.d);
/*  55 */     gm.a(gm.bc, "debug", chj.d);
/*     */   }
/*     */   
/*  58 */   public static final Codec<cfy> a = gm.bc.dispatchStable(cfy::a, Function.identity());
/*     */   
/*     */   protected final bsy b;
/*     */   
/*     */   protected final bsy c;
/*     */   private final chv d;
/*     */   private final long e;
/*  65 */   private final List<brd> f = Lists.newArrayList();
/*     */   
/*     */   public cfy(bsy ☃, chv chv1) {
/*  68 */     this(☃, ☃, chv1, 0L);
/*     */   }
/*     */   
/*     */   public cfy(bsy ☃, bsy bsy1, chv chv1, long l) {
/*  72 */     this.b = ☃;
/*  73 */     this.c = bsy1;
/*  74 */     this.d = chv1;
/*  75 */     this.e = l;
/*     */   }
/*     */   
/*     */   private void g() {
/*  79 */     if (!this.f.isEmpty()) {
/*     */       return;
/*     */     }
/*  82 */     cmx ☃ = this.d.b();
/*  83 */     if (☃ == null || ☃.c() == 0) {
/*     */       return;
/*     */     }
/*     */     
/*  87 */     List<bsv> list = Lists.newArrayList();
/*     */     
/*  89 */     for (bsv bsv : this.b.b()) {
/*  90 */       if (bsv.e().a(cla.k)) {
/*  91 */         list.add(bsv);
/*     */       }
/*     */     } 
/*     */     
/*  95 */     int i = ☃.a();
/*  96 */     int j = ☃.c();
/*  97 */     int k = ☃.b();
/*     */     
/*  99 */     Random random = new Random();
/* 100 */     random.setSeed(this.e);
/*     */     
/* 102 */     double d = random.nextDouble() * Math.PI * 2.0D;
/*     */     
/* 104 */     int m = 0;
/* 105 */     int n = 0;
/* 106 */     for (int i1 = 0; i1 < j; i1++) {
/* 107 */       double d1 = (4 * i + i * n * 6) + (random.nextDouble() - 0.5D) * i * 2.5D;
/* 108 */       int i2 = (int)Math.round(Math.cos(d) * d1);
/* 109 */       int i3 = (int)Math.round(Math.sin(d) * d1);
/*     */       
/* 111 */       fx fx = this.b.a((i2 << 4) + 8, 0, (i3 << 4) + 8, 112, list::contains, random);
/* 112 */       if (fx != null) {
/* 113 */         i2 = fx.u() >> 4;
/* 114 */         i3 = fx.w() >> 4;
/*     */       } 
/*     */       
/* 117 */       this.f.add(new brd(i2, i3));
/*     */       
/* 119 */       d += 6.283185307179586D / k;
/*     */       
/* 121 */       if (++m == k) {
/* 122 */         n++;
/* 123 */         m = 0;
/* 124 */         k += 2 * k / (n + 1);
/* 125 */         k = Math.min(k, j - i1);
/* 126 */         d += random.nextDouble() * Math.PI * 2.0D;
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
/*     */   public void a(gm<bsv> ☃, cfw cfw1) {
/* 139 */     brd brd = cfw1.g();
/* 140 */     ((cgp)cfw1).a(new cfx(☃, brd, this.c));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃, bsx bsx1, cfw cfw1, chm.a a1) {
/* 147 */     bsx bsx2 = bsx1.a(this.b);
/*     */     
/* 149 */     chx chx = new chx();
/* 150 */     int i = 8;
/*     */     
/* 152 */     brd brd = cfw1.g();
/* 153 */     int j = brd.b;
/* 154 */     int k = brd.c;
/*     */     
/* 156 */     bsw bsw = this.b.b(brd.b << 2, 0, brd.c << 2).e();
/*     */     
/* 158 */     BitSet bitSet = ((cgp)cfw1).b(a1);
/* 159 */     for (int m = j - 8; m <= j + 8; m++) {
/* 160 */       for (int n = k - 8; n <= k + 8; n++) {
/* 161 */         List<Supplier<cib<?>>> list = bsw.a(a1);
/*     */         
/* 163 */         ListIterator<Supplier<cib<?>>> listIterator = list.listIterator();
/* 164 */         while (listIterator.hasNext()) {
/* 165 */           int i1 = listIterator.nextIndex();
/* 166 */           cib<?> cib = ((Supplier<cib>)listIterator.next()).get();
/* 167 */           chx.c(☃ + i1, m, n);
/* 168 */           if (cib.a(chx, m, n)) {
/* 169 */             cib.a(cfw1, bsx2::a, chx, f(), m, n, j, k, bitSet);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public fx a(aag ☃, cla<?> cla1, fx fx1, int i, boolean bool) {
/* 178 */     if (!this.b.a(cla1)) {
/* 179 */       return null;
/*     */     }
/* 181 */     if (cla1 == cla.k) {
/* 182 */       g();
/* 183 */       fx fx2 = null;
/* 184 */       double d = Double.MAX_VALUE;
/* 185 */       fx.a a = new fx.a();
/* 186 */       for (brd brd : this.f) {
/* 187 */         a.d((brd.b << 4) + 8, 32, (brd.c << 4) + 8);
/* 188 */         double d1 = a.j(fx1);
/* 189 */         if (fx2 == null) {
/* 190 */           fx2 = new fx(a);
/* 191 */           d = d1; continue;
/*     */         } 
/* 193 */         if (d1 < d) {
/* 194 */           fx2 = new fx(a);
/* 195 */           d = d1;
/*     */         } 
/*     */       } 
/*     */       
/* 199 */       return fx2;
/*     */     } 
/* 201 */     cmy cmy = this.d.a(cla1);
/* 202 */     if (cmy == null) {
/* 203 */       return null;
/*     */     }
/*     */     
/* 206 */     return cla1.a(☃, ☃.a(), fx1, i, bool, ☃.C(), cmy);
/*     */   }
/*     */   
/*     */   public void a(aam ☃, bsn bsn1) {
/* 210 */     int i = ☃.a();
/* 211 */     int j = ☃.b();
/* 212 */     int k = i * 16;
/* 213 */     int m = j * 16;
/* 214 */     fx fx = new fx(k, 0, m);
/* 215 */     bsv bsv = this.b.b((i << 2) + 2, 2, (j << 2) + 2);
/*     */     
/* 217 */     chx chx = new chx();
/* 218 */     long l = chx.a(☃.C(), k, m);
/*     */     try {
/* 220 */       bsv.a(bsn1, this, ☃, l, chx, fx);
/* 221 */     } catch (Exception exception) {
/* 222 */       l l1 = l.a(exception, "Biome decoration");
/* 223 */       l1.a("Generation")
/* 224 */         .a("CenterX", Integer.valueOf(i))
/* 225 */         .a("CenterZ", Integer.valueOf(j))
/* 226 */         .a("Seed", Long.valueOf(l))
/* 227 */         .a("Biome", bsv);
/* 228 */       throw new u(l1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aam ☃) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public chv b() {
/* 241 */     return this.d;
/*     */   }
/*     */   
/*     */   public int c() {
/* 245 */     return 64;
/*     */   }
/*     */   
/*     */   public bsy d() {
/* 249 */     return this.c;
/*     */   }
/*     */   
/*     */   public int e() {
/* 253 */     return 256;
/*     */   }
/*     */   
/*     */   public List<btg.c> a(bsv ☃, bsn bsn1, aqo aqo1, fx fx1) {
/* 257 */     return ☃.b().a(aqo1);
/*     */   }
/*     */   
/*     */   public void a(gn ☃, bsn bsn1, cfw cfw1, csw csw1, long l) {
/* 261 */     brd brd = cfw1.g();
/* 262 */     bsv bsv = this.b.b((brd.b << 2) + 2, 0, (brd.c << 2) + 2);
/*     */     
/* 264 */     a(ko.k, ☃, bsn1, cfw1, csw1, l, brd, bsv);
/*     */     
/* 266 */     for (Supplier<ciw<?, ?>> supplier : bsv.e().a()) {
/* 267 */       a(supplier.get(), ☃, bsn1, cfw1, csw1, l, brd, bsv);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(ciw<?, ?> ☃, gn gn1, bsn bsn1, cfw cfw1, csw csw1, long l, brd brd1, bsv bsv1) {
/* 273 */     crv<?> crv = bsn1.a(gp.a(cfw1.g(), 0), (cla<?>)☃.d, cfw1);
/* 274 */     int i = (crv != null) ? crv.j() : 0;
/*     */     
/* 276 */     cmy cmy = this.d.a((cla<?>)☃.d);
/* 277 */     if (cmy != null) {
/* 278 */       crv<?> crv1 = ☃.a(gn1, this, this.b, csw1, l, brd1, bsv1, i, cmy);
/* 279 */       bsn1.a(gp.a(cfw1.g(), 0), (cla<?>)☃.d, crv1, cfw1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(bsr ☃, bsn bsn1, cfw cfw1) {
/* 284 */     int i = 8;
/* 285 */     int j = (cfw1.g()).b;
/* 286 */     int k = (cfw1.g()).c;
/* 287 */     int m = j << 4;
/* 288 */     int n = k << 4;
/*     */     
/* 290 */     gp gp = gp.a(cfw1.g(), 0);
/*     */     
/* 292 */     for (int i1 = j - 8; i1 <= j + 8; i1++) {
/* 293 */       for (int i2 = k - 8; i2 <= k + 8; i2++) {
/* 294 */         long l = brd.a(i1, i2);
/*     */         
/* 296 */         for (crv<?> crv : ☃.a(i1, i2).h().values()) {
/*     */           try {
/* 298 */             if (crv != crv.a && crv.c().a(m, n, m + 15, n + 15)) {
/* 299 */               bsn1.a(gp, crv.l(), l, cfw1);
/* 300 */               rz.a(☃, crv);
/*     */             } 
/* 302 */           } catch (Exception exception) {
/* 303 */             l l1 = l.a(exception, "Generating structure reference");
/* 304 */             m m1 = l1.a("Structure");
/* 305 */             m1.a("Id", () -> gm.aG.b(☃.l()).toString());
/* 306 */             m1.a("Name", () -> ☃.l().i());
/* 307 */             m1.a("Class", () -> ☃.l().getClass().getCanonicalName());
/* 308 */             throw new u(l1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int f() {
/* 318 */     return 63;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(int ☃, int i, chn.a a1) {
/* 326 */     return a(☃, i, a1);
/*     */   }
/*     */   
/*     */   public int c(int ☃, int i, chn.a a1) {
/* 330 */     return a(☃, i, a1) - 1;
/*     */   }
/*     */   
/*     */   public boolean a(brd ☃) {
/* 334 */     g();
/* 335 */     return this.f.contains(☃);
/*     */   }
/*     */   
/*     */   protected abstract Codec<? extends cfy> a();
/*     */   
/*     */   public abstract cfy a(long paramLong);
/*     */   
/*     */   public abstract void a(aam paramaam, cfw paramcfw);
/*     */   
/*     */   public abstract void a(bry parambry, bsn parambsn, cfw paramcfw);
/*     */   
/*     */   public abstract int a(int paramInt1, int paramInt2, chn.a parama);
/*     */   
/*     */   public abstract brc a(int paramInt1, int paramInt2);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */