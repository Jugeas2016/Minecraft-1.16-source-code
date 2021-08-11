/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ class b
/*     */   extends dlv<dpb.b.b>
/*     */ {
/*     */   protected final List<adz<buo>> a;
/*     */   protected final List<adz<blx>> o;
/* 205 */   private final int[] v = new int[] { 3, 4, 1, 2, 5, 6 };
/* 206 */   protected int p = -1;
/*     */   protected final List<blx> q;
/* 208 */   protected final Comparator<blx> r = new a();
/*     */   @Nullable
/*     */   protected adz<?> s;
/*     */   protected int t;
/*     */   
/*     */   public b(dpb paramdpb, djz ☃) {
/* 214 */     super(☃, paramdpb.k, paramdpb.l, 32, paramdpb.l - 64, 20);
/* 215 */     this.a = Lists.newArrayList();
/* 216 */     this.a.add(aea.a);
/* 217 */     this.o = Lists.newArrayList((Object[])new adz[] { aea.d, aea.b, aea.c, aea.e, aea.f });
/*     */     
/* 219 */     a(true, 20);
/*     */     
/* 221 */     Set<blx> set = Sets.newIdentityHashSet();
/* 222 */     for (blx blx : gm.T) {
/* 223 */       boolean bool = false;
/*     */       
/* 225 */       for (adz<blx> adz1 : this.o) {
/* 226 */         if (adz1.a(blx) && dpb.b(paramdpb).a(adz1.b(blx)) > 0) {
/* 227 */           bool = true;
/*     */         }
/*     */       } 
/*     */       
/* 231 */       if (bool) {
/* 232 */         set.add(blx);
/*     */       }
/*     */     } 
/*     */     
/* 236 */     for (buo buo : gm.Q) {
/* 237 */       boolean bool = false;
/*     */       
/* 239 */       for (adz<buo> adz1 : this.a) {
/* 240 */         if (adz1.a(buo) && dpb.b(paramdpb).a(adz1.b(buo)) > 0) {
/* 241 */           bool = true;
/*     */         }
/*     */       } 
/*     */       
/* 245 */       if (bool) {
/* 246 */         set.add(buo.h());
/*     */       }
/*     */     } 
/*     */     
/* 250 */     set.remove(bmd.a);
/* 251 */     this.q = Lists.newArrayList(set);
/* 252 */     for (int i = 0; i < this.q.size(); i++) {
/* 253 */       b(new b());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, int i, int j, dfo dfo1) {
/* 259 */     if (!this.b.l.b()) {
/* 260 */       this.p = -1;
/*     */     }
/*     */     int k;
/* 263 */     for (k = 0; k < this.v.length; k++) {
/* 264 */       dpb.a(this.u, ☃, i + dpb.a(this.u, k) - 18, j + 1, 0, (this.p == k) ? 0 : 18);
/*     */     }
/*     */     
/* 267 */     if (this.s != null) {
/* 268 */       k = dpb.a(this.u, b(this.s)) - 36;
/* 269 */       int m = (this.t == 1) ? 2 : 1;
/*     */       
/* 271 */       dpb.a(this.u, ☃, i + k, j + 1, 18 * m, 0);
/*     */     } 
/*     */     
/* 274 */     for (k = 0; k < this.v.length; k++) {
/* 275 */       int m = (this.p == k) ? 1 : 0;
/* 276 */       dpb.a(this.u, ☃, i + dpb.a(this.u, k) - 18 + m, j + 1 + m, 18 * this.v[k], 18);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 282 */     return 375;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int e() {
/* 287 */     return this.d / 2 + 140;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃) {
/* 292 */     this.u.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(int ☃, int i) {
/* 297 */     this.p = -1;
/* 298 */     for (int j = 0; j < this.v.length; j++) {
/* 299 */       int k = ☃ - dpb.a(this.u, j);
/* 300 */       if (k >= -36 && k <= 0) {
/* 301 */         this.p = j;
/*     */         break;
/*     */       } 
/*     */     } 
/* 305 */     if (this.p >= 0) {
/* 306 */       a(a(this.p));
/* 307 */       this.b.W().a(emp.a(adq.pF, 1.0F));
/*     */     } 
/*     */   }
/*     */   
/*     */   private adz<?> a(int ☃) {
/* 312 */     return (☃ < this.a.size()) ? this.a.get(☃) : this.o.get(☃ - this.a.size());
/*     */   }
/*     */ 
/*     */   
/*     */   private int b(adz<?> ☃) {
/* 317 */     int i = this.a.indexOf(☃);
/* 318 */     if (i >= 0) {
/* 319 */       return i;
/*     */     }
/* 321 */     int j = this.o.indexOf(☃);
/* 322 */     if (j >= 0) {
/* 323 */       return j + this.a.size();
/*     */     }
/* 325 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, int i, int j) {
/* 330 */     if (j < this.i || j > this.j) {
/*     */       return;
/*     */     }
/*     */     
/* 334 */     b b1 = a(i, j);
/* 335 */     int k = (this.d - d()) / 2;
/* 336 */     if (b1 != null) {
/* 337 */       if (i < k + 40 || i > k + 40 + 20) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 342 */       blx blx = this.q.get(au_().indexOf(b1));
/* 343 */       a(☃, a(blx), i, j);
/*     */     } else {
/* 345 */       nr nr = null;
/* 346 */       int m = i - k;
/* 347 */       for (int n = 0; n < this.v.length; n++) {
/* 348 */         int i1 = dpb.a(this.u, n);
/* 349 */         if (m >= i1 - 18 && m <= i1) {
/* 350 */           nr = a(n).d();
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/* 355 */       a(☃, nr, i, j);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, @Nullable nr nr1, int i, int j) {
/* 360 */     if (nr1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 364 */     int k = i + 12;
/* 365 */     int m = j - 12;
/* 366 */     int n = dpb.e(this.u).a(nr1);
/* 367 */     a(☃, k - 3, m - 3, k + n + 3, m + 8 + 3, -1073741824, -1073741824);
/*     */     
/* 369 */     RenderSystem.pushMatrix();
/* 370 */     RenderSystem.translatef(0.0F, 0.0F, 400.0F);
/* 371 */     dpb.f(this.u).a(☃, nr1, k, m, -1);
/* 372 */     RenderSystem.popMatrix();
/*     */   }
/*     */   
/*     */   protected nr a(blx ☃) {
/* 376 */     return ☃.l();
/*     */   }
/*     */   
/*     */   protected void a(adz<?> ☃) {
/* 380 */     if (☃ != this.s) {
/* 381 */       this.s = ☃;
/* 382 */       this.t = -1;
/* 383 */     } else if (this.t == -1) {
/* 384 */       this.t = 1;
/*     */     } else {
/* 386 */       this.s = null;
/* 387 */       this.t = 0;
/*     */     } 
/*     */     
/* 390 */     this.q.sort(this.r);
/*     */   }
/*     */ 
/*     */   
/*     */   class a
/*     */     implements Comparator<blx>
/*     */   {
/*     */     public int a(blx ☃, blx blx1) {
/*     */       int i;
/*     */       int j;
/* 400 */       if (this.a.s == null) {
/* 401 */         i = 0;
/* 402 */         j = 0;
/* 403 */       } else if (this.a.a.contains(this.a.s)) {
/* 404 */         adz<buo> adz = (adz)this.a.s;
/* 405 */         i = (☃ instanceof bkh) ? dpb.b(this.a.u).<buo>a(adz, ((bkh)☃).e()) : -1;
/* 406 */         j = (blx1 instanceof bkh) ? dpb.b(this.a.u).<buo>a(adz, ((bkh)blx1).e()) : -1;
/*     */       } else {
/* 408 */         adz<blx> adz = (adz)this.a.s;
/* 409 */         i = dpb.b(this.a.u).a(adz, ☃);
/* 410 */         j = dpb.b(this.a.u).a(adz, blx1);
/*     */       } 
/*     */       
/* 413 */       if (i == j) {
/* 414 */         return this.a.t * Integer.compare(blx.a(☃), blx.a(blx1));
/*     */       }
/*     */       
/* 417 */       return this.a.t * Integer.compare(i, j);
/*     */     }
/*     */     private a(dpb.b this$0) {} }
/*     */   
/*     */   class b extends dlv.a<b> { private b(dpb.b this$0) {}
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 424 */       blx blx = (dpb.g(this.a.u)).q.get(i);
/*     */       
/* 426 */       dpb.a(this.a.u, ☃, k + 40, j, blx);
/*     */       int i3;
/* 428 */       for (i3 = 0; i3 < (dpb.g(this.a.u)).a.size(); i3++) {
/*     */         adx<buo> adx;
/* 430 */         if (blx instanceof bkh) {
/* 431 */           adx = ((adz<buo>)(dpb.g(this.a.u)).a.get(i3)).b(((bkh)blx).e());
/*     */         } else {
/* 433 */           adx = null;
/*     */         } 
/* 435 */         a(☃, adx, k + dpb.a(this.a.u, i3), j, (i % 2 == 0));
/*     */       } 
/* 437 */       for (i3 = 0; i3 < (dpb.g(this.a.u)).o.size(); i3++) {
/* 438 */         a(☃, ((adz)(dpb.g(this.a.u)).o.get(i3)).b(blx), k + dpb.a(this.a.u, i3 + (dpb.g(this.a.u)).a.size()), j, (i % 2 == 0));
/*     */       }
/*     */     }
/*     */     
/*     */     protected void a(dfm ☃, @Nullable adx<?> adx1, int i, int j, boolean bool) {
/* 443 */       String str = (adx1 == null) ? "-" : adx1.a(dpb.b(this.a.u).a(adx1));
/* 444 */       dkw.b(☃, dpb.h(this.a.u), str, i - dpb.i(this.a.u).b(str), j + 5, bool ? 16777215 : 9474192);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpb$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */