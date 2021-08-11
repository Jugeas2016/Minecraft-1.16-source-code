/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aam
/*     */   implements bsr
/*     */ {
/*  53 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final List<cfw> b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private final int e;
/*     */   private final aag f;
/*     */   private final long g;
/*     */   private final cyd h;
/*     */   
/*     */   public aam(aag ☃, List<cfw> list) {
/*  64 */     this.k = new aan<>(☃ -> z(☃).n());
/*  65 */     this.l = new aan<>(☃ -> z(☃).o());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     int i = afm.c(Math.sqrt(list.size()));
/*  73 */     if (i * i != list.size()) {
/*  74 */       throw (IllegalStateException)x.c(new IllegalStateException("Cache size is not a square."));
/*     */     }
/*  76 */     brd brd1 = ((cfw)list.get(list.size() / 2)).g();
/*     */     
/*  78 */     this.b = list;
/*  79 */     this.c = brd1.b;
/*  80 */     this.d = brd1.c;
/*  81 */     this.e = i;
/*  82 */     this.f = ☃;
/*  83 */     this.g = ☃.C();
/*  84 */     this.h = ☃.h();
/*  85 */     this.i = ☃.u_();
/*  86 */     this.j = ☃.k();
/*  87 */     this.m = new bsx(this, bsx.a(this.g), ☃.k().m());
/*  88 */     this.n = ((cfw)list.get(0)).g();
/*  89 */     this.o = ((cfw)list.get(list.size() - 1)).g();
/*  90 */     this.p = ☃.a().a(this);
/*     */   }
/*     */   private final Random i; private final chd j; private final bso<buo> k; private final bso<cuw> l; private final bsx m; private final brd n; private final brd o; private final bsn p;
/*     */   public int a() {
/*  94 */     return this.c;
/*     */   }
/*     */   
/*     */   public int b() {
/*  98 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public cfw a(int ☃, int i) {
/* 103 */     return a(☃, i, cga.a);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cfw a(int ☃, int i, cga cga1, boolean bool) {
/*     */     cfw cfw;
/* 110 */     if (b(☃, i)) {
/* 111 */       int j = ☃ - this.n.b;
/* 112 */       int k = i - this.n.c;
/* 113 */       cfw = this.b.get(j + k * this.e);
/* 114 */       if (cfw.k().b(cga1)) {
/* 115 */         return cfw;
/*     */       }
/*     */     } else {
/* 118 */       cfw = null;
/*     */     } 
/*     */     
/* 121 */     if (!bool) {
/* 122 */       return null;
/*     */     }
/*     */     
/* 125 */     a.error("Requested chunk : {} {}", Integer.valueOf(☃), Integer.valueOf(i));
/* 126 */     a.error("Region bounds : {} {} | {} {}", Integer.valueOf(this.n.b), Integer.valueOf(this.n.c), Integer.valueOf(this.o.b), Integer.valueOf(this.o.c));
/* 127 */     if (cfw != null) {
/* 128 */       throw (RuntimeException)x.c(new RuntimeException(String.format("Chunk is not of correct status. Expecting %s, got %s | %s %s", new Object[] { cga1, cfw.k(), Integer.valueOf(☃), Integer.valueOf(i) })));
/*     */     }
/* 130 */     throw (RuntimeException)x.c(new RuntimeException(String.format("We are asking a region for a chunk out of bound | %s %s", new Object[] { Integer.valueOf(☃), Integer.valueOf(i) })));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, int i) {
/* 136 */     return (☃ >= this.n.b && ☃ <= this.o.b && i >= this.n.c && i <= this.o.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh d_(fx ☃) {
/* 141 */     return a(☃.u() >> 4, ☃.w() >> 4).d_(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cux b(fx ☃) {
/* 146 */     return z(☃).b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bfw a(double ☃, double d1, double d2, double d3, Predicate<aqa> predicate) {
/* 152 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 157 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public bsx d() {
/* 162 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public bsv a(int ☃, int i, int j) {
/* 167 */     return this.f.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(gc ☃, boolean bool) {
/* 172 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public cuo e() {
/* 177 */     return this.f.e();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(fx ☃, boolean bool, @Nullable aqa aqa1, int i) {
/* 182 */     ceh ceh = d_(☃);
/* 183 */     if (ceh.g()) {
/* 184 */       return false;
/*     */     }
/*     */     
/* 187 */     if (bool) {
/* 188 */       ccj ccj = ceh.b().q() ? c(☃) : null;
/* 189 */       buo.a(ceh, this.f, ☃, ccj, aqa1, bmb.b);
/*     */     } 
/* 191 */     return a(☃, bup.a.n(), 3, i);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj c(fx ☃) {
/* 198 */     cfw cfw = z(☃);
/* 199 */     ccj ccj = cfw.c(☃);
/*     */     
/* 201 */     if (ccj != null) {
/* 202 */       return ccj;
/*     */     }
/*     */     
/* 205 */     md md = cfw.i(☃);
/* 206 */     ceh ceh = cfw.d_(☃);
/* 207 */     if (md != null) {
/* 208 */       if ("DUMMY".equals(md.l("id"))) {
/* 209 */         buo buo = ceh.b();
/* 210 */         if (!(buo instanceof bwm)) {
/* 211 */           return null;
/*     */         }
/* 213 */         ccj = ((bwm)buo).a(this.f);
/*     */       } else {
/* 215 */         ccj = ccj.b(ceh, md);
/*     */       } 
/*     */       
/* 218 */       if (ccj != null) {
/* 219 */         cfw.a(☃, ccj);
/* 220 */         return ccj;
/*     */       } 
/*     */     } 
/*     */     
/* 224 */     if (ceh.b() instanceof bwm) {
/* 225 */       a.warn("Tried to access a block entity before it was created. {}", ☃);
/*     */     }
/*     */     
/* 228 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(fx ☃, ceh ceh1, int i, int j) {
/* 233 */     cfw cfw = z(☃);
/* 234 */     ceh ceh2 = cfw.a(☃, ceh1, false);
/*     */     
/* 236 */     if (ceh2 != null) {
/* 237 */       this.f.a(☃, ceh2, ceh1);
/*     */     }
/*     */     
/* 240 */     buo buo = ceh1.b();
/*     */ 
/*     */     
/* 243 */     if (buo.q()) {
/* 244 */       if (cfw.k().g() == cga.a.b) {
/* 245 */         cfw.a(☃, ((bwm)buo).a(this));
/*     */       } else {
/* 247 */         md md = new md();
/* 248 */         md.b("x", ☃.u());
/* 249 */         md.b("y", ☃.v());
/* 250 */         md.b("z", ☃.w());
/* 251 */         md.a("id", "DUMMY");
/* 252 */         cfw.a(md);
/*     */       } 
/* 254 */     } else if (ceh2 != null && ceh2.b().q()) {
/* 255 */       cfw.d(☃);
/*     */     } 
/*     */     
/* 258 */     if (ceh1.q(this, ☃)) {
/* 259 */       j(☃);
/*     */     }
/*     */     
/* 262 */     return true;
/*     */   }
/*     */   
/*     */   private void j(fx ☃) {
/* 266 */     z(☃).e(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(aqa ☃) {
/* 274 */     int i = afm.c(☃.cD() / 16.0D);
/* 275 */     int j = afm.c(☃.cH() / 16.0D);
/*     */     
/* 277 */     a(i, j).a(☃);
/* 278 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(fx ☃, boolean bool) {
/* 283 */     return a(☃, bup.a.n(), 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public cfu f() {
/* 288 */     return this.f.f();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean s_() {
/* 293 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public aag E() {
/* 299 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public gn r() {
/* 304 */     return this.f.r();
/*     */   }
/*     */ 
/*     */   
/*     */   public cyd h() {
/* 309 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public aos d(fx ☃) {
/* 314 */     if (!b(☃.u() >> 4, ☃.w() >> 4)) {
/* 315 */       throw new RuntimeException("We are asking a region for a chunk out of bound");
/*     */     }
/*     */     
/* 318 */     return new aos(this.f.ad(), this.f.U(), 0L, this.f.af());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cfz H() {
/* 329 */     return this.f.i();
/*     */   }
/*     */ 
/*     */   
/*     */   public long C() {
/* 334 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public bso<buo> J() {
/* 339 */     return this.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public bso<cuw> I() {
/* 344 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public int t_() {
/* 349 */     return this.f.t_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Random u_() {
/* 354 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(chn.a ☃, int i, int j) {
/* 359 */     return a(i >> 4, j >> 4).a(☃, i & 0xF, j & 0xF) + 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(@Nullable bfw ☃, fx fx1, adp adp1, adr adr1, float f1, float f2) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(hf ☃, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(@Nullable bfw ☃, int i, fx fx1, int j) {}
/*     */ 
/*     */   
/*     */   public chd k() {
/* 376 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(fx ☃, Predicate<ceh> predicate) {
/* 381 */     return predicate.test(d_(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T extends aqa> List<T> a(Class<? extends T> ☃, dci dci1, @Nullable Predicate<? super T> predicate) {
/* 391 */     return Collections.emptyList();
/*     */   }
/*     */ 
/*     */   
/*     */   public List<aqa> a(@Nullable aqa ☃, dci dci1, @Nullable Predicate<? super aqa> predicate) {
/* 396 */     return Collections.emptyList();
/*     */   }
/*     */ 
/*     */   
/*     */   public List<bfw> x() {
/* 401 */     return Collections.emptyList();
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<? extends crv<?>> a(gp ☃, cla<?> cla1) {
/* 406 */     return this.p.a(☃, cla1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */