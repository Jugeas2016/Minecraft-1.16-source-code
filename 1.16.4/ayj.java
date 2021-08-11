/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
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
/*     */ public abstract class ayj
/*     */ {
/*     */   protected final aqn a;
/*     */   protected final brx b;
/*     */   @Nullable
/*     */   protected cxd c;
/*     */   protected double d;
/*     */   protected int e;
/*     */   protected int f;
/*  54 */   protected dcn g = dcn.a;
/*  55 */   protected gr h = gr.d;
/*     */   protected long i;
/*     */   protected long j;
/*     */   protected double k;
/*  59 */   protected float l = 0.5F;
/*     */   
/*     */   protected boolean m;
/*     */   
/*     */   protected long n;
/*     */   
/*     */   protected cxc o;
/*     */   private fx p;
/*     */   private int q;
/*  68 */   private float r = 1.0F;
/*     */   
/*     */   private final cxf s;
/*     */   private boolean t;
/*     */   
/*     */   public ayj(aqn ☃, brx brx1) {
/*  74 */     this.a = ☃;
/*  75 */     this.b = brx1;
/*     */ 
/*     */     
/*  78 */     int i = afm.c(☃.b(arl.b) * 16.0D);
/*  79 */     this.s = a(i);
/*     */   }
/*     */   
/*     */   public void g() {
/*  83 */     this.r = 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/*  90 */     this.r = ☃;
/*     */   }
/*     */   
/*     */   public fx h() {
/*  94 */     return this.p;
/*     */   }
/*     */   
/*     */   protected abstract cxf a(int paramInt);
/*     */   
/*     */   public void a(double ☃) {
/* 100 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 104 */     return this.m;
/*     */   }
/*     */   
/*     */   public void j() {
/* 108 */     if (this.b.T() - this.n > 20L) {
/* 109 */       if (this.p != null) {
/* 110 */         this.c = null;
/* 111 */         this.c = a(this.p, this.q);
/* 112 */         this.n = this.b.T();
/* 113 */         this.m = false;
/*     */       } 
/*     */     } else {
/* 116 */       this.m = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final cxd a(double ☃, double d1, double d2, int i) {
/* 122 */     return a(new fx(☃, d1, d2), i);
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
/*     */   @Nullable
/*     */   public cxd a(Stream<fx> ☃, int i) {
/* 135 */     return a(☃.collect((Collector)Collectors.toSet()), 8, false, i);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cxd a(Set<fx> ☃, int i) {
/* 140 */     return a(☃, 8, false, i);
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
/*     */   @Nullable
/*     */   public cxd a(fx ☃, int i) {
/* 153 */     return a((Set<fx>)ImmutableSet.of(☃), 8, false, i);
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
/*     */   @Nullable
/*     */   public cxd a(aqa ☃, int i) {
/* 166 */     return a((Set<fx>)ImmutableSet.of(☃.cB()), 16, true, i);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected cxd a(Set<fx> ☃, int i, boolean bool, int j) {
/* 171 */     if (☃.isEmpty()) {
/* 172 */       return null;
/*     */     }
/*     */     
/* 175 */     if (this.a.cE() < 0.0D) {
/* 176 */       return null;
/*     */     }
/*     */     
/* 179 */     if (!a()) {
/* 180 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 184 */     if (this.c != null && !this.c.c() && ☃.contains(this.p)) {
/* 185 */       return this.c;
/*     */     }
/*     */     
/* 188 */     this.b.Z().a("pathfind");
/* 189 */     float f = (float)this.a.b(arl.b);
/* 190 */     fx fx1 = bool ? this.a.cB().b() : this.a.cB();
/* 191 */     int k = (int)(f + i);
/*     */ 
/*     */     
/* 194 */     bsi bsi = new bsi(this.b, fx1.b(-k, -k, -k), fx1.b(k, k, k));
/* 195 */     cxd cxd1 = this.s.a(bsi, this.a, ☃, f, j, this.r);
/* 196 */     this.b.Z().c();
/*     */     
/* 198 */     if (cxd1 != null && cxd1.m() != null) {
/*     */ 
/*     */ 
/*     */       
/* 202 */       this.p = cxd1.m();
/* 203 */       this.q = j;
/* 204 */       f();
/*     */     } 
/*     */     
/* 207 */     return cxd1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2, double d3) {
/* 216 */     return a(a(☃, d1, d2, 1), d3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aqa ☃, double d) {
/* 225 */     cxd cxd1 = a(☃, 1);
/* 226 */     return (cxd1 != null && a(cxd1, d));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(@Nullable cxd ☃, double d) {
/* 234 */     if (☃ == null) {
/* 235 */       this.c = null;
/* 236 */       return false;
/*     */     } 
/* 238 */     if (!☃.a(this.c)) {
/* 239 */       this.c = ☃;
/*     */     }
/* 241 */     if (m()) {
/* 242 */       return false;
/*     */     }
/* 244 */     D_();
/* 245 */     if (this.c.e() <= 0) {
/* 246 */       return false;
/*     */     }
/*     */     
/* 249 */     this.d = d;
/* 250 */     dcn dcn1 = b();
/* 251 */     this.f = this.e;
/* 252 */     this.g = dcn1;
/* 253 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cxd k() {
/* 258 */     return this.c;
/*     */   }
/*     */   
/*     */   public void c() {
/* 262 */     this.e++;
/*     */     
/* 264 */     if (this.m) {
/* 265 */       j();
/*     */     }
/*     */     
/* 268 */     if (m()) {
/*     */       return;
/*     */     }
/*     */     
/* 272 */     if (a()) {
/* 273 */       l();
/* 274 */     } else if (this.c != null && !this.c.c()) {
/* 275 */       dcn dcn1 = b();
/* 276 */       dcn dcn2 = this.c.a(this.a);
/* 277 */       if (dcn1.c > dcn2.c && !this.a.ao() && afm.c(dcn1.b) == afm.c(dcn2.b) && afm.c(dcn1.d) == afm.c(dcn2.d)) {
/* 278 */         this.c.a();
/*     */       }
/*     */     } 
/*     */     
/* 282 */     rz.a(this.b, this.a, this.c, this.l);
/*     */     
/* 284 */     if (m()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 289 */     dcn ☃ = this.c.a(this.a);
/* 290 */     fx fx1 = new fx(☃);
/*     */     
/* 292 */     this.a.u().a(☃.b, this.b.d_(fx1.c()).g() ? ☃.c : cxj.a(this.b, fx1), ☃.d, this.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void l() {
/* 299 */     dcn ☃ = b();
/*     */     
/* 301 */     this.l = (this.a.cy() > 0.75F) ? (this.a.cy() / 2.0F) : (0.75F - this.a.cy() / 2.0F);
/* 302 */     gr gr1 = this.c.g();
/* 303 */     double d1 = Math.abs(this.a.cD() - gr1.u() + 0.5D);
/* 304 */     double d2 = Math.abs(this.a.cE() - gr1.v());
/* 305 */     double d3 = Math.abs(this.a.cH() - gr1.w() + 0.5D);
/* 306 */     boolean bool = (d1 < this.l && d3 < this.l && d2 < 1.0D);
/*     */ 
/*     */ 
/*     */     
/* 310 */     if (bool || (this.a.b((this.c.h()).l) && b(☃))) {
/* 311 */       this.c.a();
/*     */     }
/* 313 */     a(☃);
/*     */   }
/*     */   
/*     */   private boolean b(dcn ☃) {
/* 317 */     if (this.c.f() + 1 >= this.c.e()) {
/* 318 */       return false;
/*     */     }
/*     */     
/* 321 */     dcn dcn1 = dcn.c(this.c.g());
/* 322 */     if (!☃.a(dcn1, 2.0D))
/*     */     {
/*     */       
/* 325 */       return false;
/*     */     }
/*     */     
/* 328 */     dcn dcn2 = dcn.c(this.c.d(this.c.f() + 1));
/*     */     
/* 330 */     dcn dcn3 = dcn2.d(dcn1);
/* 331 */     dcn dcn4 = ☃.d(dcn1);
/*     */ 
/*     */     
/* 334 */     return (dcn3.b(dcn4) > 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcn ☃) {
/* 339 */     if (this.e - this.f > 100) {
/* 340 */       if (☃.g(this.g) < 2.25D) {
/* 341 */         this.t = true;
/* 342 */         o();
/*     */       } else {
/* 344 */         this.t = false;
/*     */       } 
/* 346 */       this.f = this.e;
/* 347 */       this.g = ☃;
/*     */     } 
/*     */     
/* 350 */     if (this.c != null && !this.c.c()) {
/* 351 */       gr gr1 = this.c.g();
/*     */       
/* 353 */       if (gr1.equals(this.h)) {
/* 354 */         this.i += x.b() - this.j;
/*     */       } else {
/* 356 */         this.h = gr1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 362 */         double d = ☃.f(dcn.c(this.h));
/* 363 */         this.k = (this.a.dN() > 0.0F) ? (d / this.a.dN() * 1000.0D) : 0.0D;
/*     */       } 
/*     */       
/* 366 */       if (this.k > 0.0D && this.i > this.k * 3.0D) {
/* 367 */         e();
/*     */       }
/* 369 */       this.j = x.b();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void e() {
/* 374 */     f();
/* 375 */     o();
/*     */   }
/*     */   
/*     */   private void f() {
/* 379 */     this.h = gr.d;
/* 380 */     this.i = 0L;
/* 381 */     this.k = 0.0D;
/* 382 */     this.t = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m() {
/* 387 */     return (this.c == null || this.c.c());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean n() {
/* 394 */     return !m();
/*     */   }
/*     */   
/*     */   public void o() {
/* 398 */     this.c = null;
/*     */   }
/*     */   
/*     */   protected abstract dcn b();
/*     */   
/*     */   protected abstract boolean a();
/*     */   
/*     */   protected boolean p() {
/* 406 */     return (this.a.aH() || this.a.aQ());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void D_() {
/* 414 */     if (this.c == null) {
/*     */       return;
/*     */     }
/*     */     
/* 418 */     for (int ☃ = 0; ☃ < this.c.e(); ☃++) {
/* 419 */       cxb cxb1 = this.c.a(☃);
/* 420 */       cxb cxb2 = (☃ + 1 < this.c.e()) ? this.c.a(☃ + 1) : null;
/*     */       
/* 422 */       ceh ceh = this.b.d_(new fx(cxb1.a, cxb1.b, cxb1.c));
/*     */       
/* 424 */       if (ceh.a(bup.eb)) {
/* 425 */         this.c.a(☃, cxb1.a(cxb1.a, cxb1.b + 1, cxb1.c));
/* 426 */         if (cxb2 != null && cxb1.b >= cxb2.b) {
/* 427 */           this.c.a(☃ + 1, cxb1.a(cxb2.a, cxb1.b + 1, cxb2.c));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected abstract boolean a(dcn paramdcn1, dcn paramdcn2, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   public boolean a(fx ☃) {
/* 436 */     fx fx1 = ☃.c();
/* 437 */     return this.b.d_(fx1).i(this.b, fx1);
/*     */   }
/*     */   
/*     */   public cxc q() {
/* 441 */     return this.o;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 445 */     this.o.c(☃);
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 449 */     return this.o.e();
/*     */   }
/*     */   
/*     */   public void b(fx ☃) {
/* 453 */     if (this.c == null || this.c.c() || this.c.e() == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 457 */     cxb cxb = this.c.d();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 462 */     dcn dcn1 = new dcn((cxb.a + this.a.cD()) / 2.0D, (cxb.b + this.a.cE()) / 2.0D, (cxb.c + this.a.cH()) / 2.0D);
/*     */ 
/*     */     
/* 465 */     if (☃.a(dcn1, (this.c.e() - this.c.f()))) {
/* 466 */       j();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean t() {
/* 475 */     return this.t;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */