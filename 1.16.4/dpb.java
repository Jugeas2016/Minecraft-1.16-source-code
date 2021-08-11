/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectListIterator;
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
/*     */ public class dpb
/*     */   extends dot
/*     */   implements dpc
/*     */ {
/*  39 */   private static final nr c = new of("multiplayer.downloadingStats");
/*     */   
/*     */   protected final dot a;
/*     */   
/*     */   private a p;
/*     */   private b q;
/*     */   private c r;
/*     */   private final aeb s;
/*     */   @Nullable
/*     */   private dlv<?> t;
/*     */   private boolean u = true;
/*     */   
/*     */   public dpb(dot ☃, aeb aeb1) {
/*  52 */     super(new of("gui.stats"));
/*     */     
/*  54 */     this.a = ☃;
/*  55 */     this.s = aeb1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  60 */     this.u = true;
/*  61 */     this.i.w().a(new sf(sf.a.b));
/*     */   }
/*     */   
/*     */   public void h() {
/*  65 */     this.p = new a(this, this.i);
/*  66 */     this.q = new b(this, this.i);
/*  67 */     this.r = new c(this, this.i);
/*     */   }
/*     */   
/*     */   public void i() {
/*  71 */     a(new dlj(this.k / 2 - 120, this.l - 52, 80, 20, new of("stat.generalButton"), ☃ -> a(this.p)));
/*  72 */     dlj ☃ = a(new dlj(this.k / 2 - 40, this.l - 52, 80, 20, new of("stat.itemsButton"), ☃ -> a(this.q)));
/*  73 */     dlj dlj1 = a(new dlj(this.k / 2 + 40, this.l - 52, 80, 20, new of("stat.mobsButton"), ☃ -> a(this.r)));
/*     */     
/*  75 */     a(new dlj(this.k / 2 - 100, this.l - 28, 200, 20, nq.c, ☃ -> this.i.a(this.a)));
/*     */     
/*  77 */     if (this.q.au_().isEmpty()) {
/*  78 */       ☃.o = false;
/*     */     }
/*  80 */     if (this.r.au_().isEmpty()) {
/*  81 */       dlj1.o = false;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  87 */     if (this.u) {
/*  88 */       a(☃);
/*  89 */       a(☃, this.o, c, this.k / 2, this.l / 2, 16777215);
/*  90 */       this.o.getClass(); a(☃, this.o, (String)b[(int)(x.b() / 150L % b.length)], this.k / 2, this.l / 2 + 9 * 2, 16777215);
/*     */     } else {
/*  92 */       l().a(☃, i, j, f);
/*  93 */       a(☃, this.o, this.d, this.k / 2, 20, 16777215);
/*  94 */       super.a(☃, i, j, f);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 100 */     if (this.u) {
/* 101 */       h();
/* 102 */       i();
/* 103 */       a(this.p);
/* 104 */       this.u = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ay_() {
/* 110 */     return !this.u;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dlv<?> l() {
/* 115 */     return this.t;
/*     */   }
/*     */   
/*     */   public void a(@Nullable dlv<?> ☃) {
/* 119 */     this.e.remove(this.p);
/* 120 */     this.e.remove(this.q);
/* 121 */     this.e.remove(this.r);
/*     */     
/* 123 */     if (☃ != null) {
/* 124 */       this.e.add(0, ☃);
/* 125 */       this.t = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   class a extends dlv<a.a> {
/*     */     public a(dpb this$0, djz ☃) {
/* 131 */       super(☃, this$0.k, this$0.l, 32, this$0.l - 64, 10);
/*     */       
/* 133 */       ObjectArrayList<adx<vk>> objectArrayList = new ObjectArrayList(aea.i.iterator());
/* 134 */       objectArrayList.sort(Comparator.comparing(☃ -> ekx.a(dpb.a(☃), new Object[0])));
/* 135 */       for (ObjectListIterator<adx<vk>> objectListIterator = objectArrayList.iterator(); objectListIterator.hasNext(); ) { adx<vk> adx = objectListIterator.next();
/* 136 */         b(new a(adx)); }
/*     */     
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃) {
/* 142 */       this.a.a(☃);
/*     */     }
/*     */     
/*     */     class a extends dlv.a<a> {
/*     */       private final adx<vk> b;
/*     */       private final nr c;
/*     */       
/*     */       private a(dpb.a this$0, adx<vk> ☃) {
/* 150 */         this.b = ☃;
/* 151 */         this.c = new of(dpb.a(☃));
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 156 */         dkw.b(☃, dpb.a(this.a.a), this.c, k + 2, j + 1, (i % 2 == 0) ? 16777215 : 9474192);
/* 157 */         String str = this.b.a(dpb.b(this.a.a).a(this.b));
/* 158 */         dkw.b(☃, dpb.c(this.a.a), str, k + 2 + 213 - dpb.d(this.a.a).b(str), j + 1, (i % 2 == 0) ? 16777215 : 9474192);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static String b(adx<vk> ☃) {
/* 164 */     return "stat." + ((vk)☃.b()).toString().replace(':', '.');
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
/*     */   private int a(int ☃) {
/* 182 */     return 115 + 40 * ☃;
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, blx blx1) {
/* 186 */     c(☃, i + 1, j + 1, 0, 0);
/*     */     
/* 188 */     RenderSystem.enableRescaleNormal();
/*     */     
/* 190 */     this.j.a(blx1.r(), i + 2, j + 2);
/*     */     
/* 192 */     RenderSystem.disableRescaleNormal();
/*     */   }
/*     */   
/*     */   private void c(dfm ☃, int i, int j, int k, int m) {
/* 196 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 197 */     this.i.M().a(g);
/*     */     
/* 199 */     a(☃, i, j, v(), k, m, 18, 18, 128, 128);
/*     */   }
/*     */   
/*     */   class b extends dlv<b.b> {
/*     */     protected final List<adz<buo>> a;
/*     */     protected final List<adz<blx>> o;
/* 205 */     private final int[] v = new int[] { 3, 4, 1, 2, 5, 6 };
/* 206 */     protected int p = -1;
/*     */     protected final List<blx> q;
/* 208 */     protected final Comparator<blx> r = new a();
/*     */     @Nullable
/*     */     protected adz<?> s;
/*     */     protected int t;
/*     */     
/*     */     public b(dpb this$0, djz ☃) {
/* 214 */       super(☃, this$0.k, this$0.l, 32, this$0.l - 64, 20);
/* 215 */       this.a = Lists.newArrayList();
/* 216 */       this.a.add(aea.a);
/* 217 */       this.o = Lists.newArrayList((Object[])new adz[] { aea.d, aea.b, aea.c, aea.e, aea.f });
/*     */       
/* 219 */       a(true, 20);
/*     */       
/* 221 */       Set<blx> set = Sets.newIdentityHashSet();
/* 222 */       for (blx blx : gm.T) {
/* 223 */         boolean bool = false;
/*     */         
/* 225 */         for (adz<blx> adz1 : this.o) {
/* 226 */           if (adz1.a(blx) && dpb.b(this$0).a(adz1.b(blx)) > 0) {
/* 227 */             bool = true;
/*     */           }
/*     */         } 
/*     */         
/* 231 */         if (bool) {
/* 232 */           set.add(blx);
/*     */         }
/*     */       } 
/*     */       
/* 236 */       for (buo buo : gm.Q) {
/* 237 */         boolean bool = false;
/*     */         
/* 239 */         for (adz<buo> adz1 : this.a) {
/* 240 */           if (adz1.a(buo) && dpb.b(this$0).a(adz1.b(buo)) > 0) {
/* 241 */             bool = true;
/*     */           }
/*     */         } 
/*     */         
/* 245 */         if (bool) {
/* 246 */           set.add(buo.h());
/*     */         }
/*     */       } 
/*     */       
/* 250 */       set.remove(bmd.a);
/* 251 */       this.q = Lists.newArrayList(set);
/* 252 */       for (int i = 0; i < this.q.size(); i++) {
/* 253 */         b(new b());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃, int i, int j, dfo dfo1) {
/* 259 */       if (!this.b.l.b()) {
/* 260 */         this.p = -1;
/*     */       }
/*     */       int k;
/* 263 */       for (k = 0; k < this.v.length; k++) {
/* 264 */         dpb.a(this.u, ☃, i + dpb.a(this.u, k) - 18, j + 1, 0, (this.p == k) ? 0 : 18);
/*     */       }
/*     */       
/* 267 */       if (this.s != null) {
/* 268 */         k = dpb.a(this.u, b(this.s)) - 36;
/* 269 */         int m = (this.t == 1) ? 2 : 1;
/*     */         
/* 271 */         dpb.a(this.u, ☃, i + k, j + 1, 18 * m, 0);
/*     */       } 
/*     */       
/* 274 */       for (k = 0; k < this.v.length; k++) {
/* 275 */         int m = (this.p == k) ? 1 : 0;
/* 276 */         dpb.a(this.u, ☃, i + dpb.a(this.u, k) - 18 + m, j + 1 + m, 18 * this.v[k], 18);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public int d() {
/* 282 */       return 375;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int e() {
/* 287 */       return this.d / 2 + 140;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃) {
/* 292 */       this.u.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(int ☃, int i) {
/* 297 */       this.p = -1;
/* 298 */       for (int j = 0; j < this.v.length; j++) {
/* 299 */         int k = ☃ - dpb.a(this.u, j);
/* 300 */         if (k >= -36 && k <= 0) {
/* 301 */           this.p = j;
/*     */           break;
/*     */         } 
/*     */       } 
/* 305 */       if (this.p >= 0) {
/* 306 */         a(a(this.p));
/* 307 */         this.b.W().a(emp.a(adq.pF, 1.0F));
/*     */       } 
/*     */     }
/*     */     
/*     */     private adz<?> a(int ☃) {
/* 312 */       return (☃ < this.a.size()) ? this.a.get(☃) : this.o.get(☃ - this.a.size());
/*     */     }
/*     */ 
/*     */     
/*     */     private int b(adz<?> ☃) {
/* 317 */       int i = this.a.indexOf(☃);
/* 318 */       if (i >= 0) {
/* 319 */         return i;
/*     */       }
/* 321 */       int j = this.o.indexOf(☃);
/* 322 */       if (j >= 0) {
/* 323 */         return j + this.a.size();
/*     */       }
/* 325 */       return -1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃, int i, int j) {
/* 330 */       if (j < this.i || j > this.j) {
/*     */         return;
/*     */       }
/*     */       
/* 334 */       b b1 = a(i, j);
/* 335 */       int k = (this.d - d()) / 2;
/* 336 */       if (b1 != null) {
/* 337 */         if (i < k + 40 || i > k + 40 + 20) {
/*     */           return;
/*     */         }
/*     */ 
/*     */         
/* 342 */         blx blx = this.q.get(au_().indexOf(b1));
/* 343 */         a(☃, a(blx), i, j);
/*     */       } else {
/* 345 */         nr nr = null;
/* 346 */         int m = i - k;
/* 347 */         for (int n = 0; n < this.v.length; n++) {
/* 348 */           int i1 = dpb.a(this.u, n);
/* 349 */           if (m >= i1 - 18 && m <= i1) {
/* 350 */             nr = a(n).d();
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/* 355 */         a(☃, nr, i, j);
/*     */       } 
/*     */     }
/*     */     
/*     */     protected void a(dfm ☃, @Nullable nr nr1, int i, int j) {
/* 360 */       if (nr1 == null) {
/*     */         return;
/*     */       }
/*     */       
/* 364 */       int k = i + 12;
/* 365 */       int m = j - 12;
/* 366 */       int n = dpb.e(this.u).a(nr1);
/* 367 */       a(☃, k - 3, m - 3, k + n + 3, m + 8 + 3, -1073741824, -1073741824);
/*     */       
/* 369 */       RenderSystem.pushMatrix();
/* 370 */       RenderSystem.translatef(0.0F, 0.0F, 400.0F);
/* 371 */       dpb.f(this.u).a(☃, nr1, k, m, -1);
/* 372 */       RenderSystem.popMatrix();
/*     */     }
/*     */     
/*     */     protected nr a(blx ☃) {
/* 376 */       return ☃.l();
/*     */     }
/*     */     
/*     */     protected void a(adz<?> ☃) {
/* 380 */       if (☃ != this.s) {
/* 381 */         this.s = ☃;
/* 382 */         this.t = -1;
/* 383 */       } else if (this.t == -1) {
/* 384 */         this.t = 1;
/*     */       } else {
/* 386 */         this.s = null;
/* 387 */         this.t = 0;
/*     */       } 
/*     */       
/* 390 */       this.q.sort(this.r);
/*     */     }
/*     */     
/*     */     class a
/*     */       implements Comparator<blx> {
/*     */       private a(dpb.b this$0) {}
/*     */       
/*     */       public int a(blx ☃, blx blx1) {
/*     */         int i;
/*     */         int j;
/* 400 */         if (this.a.s == null) {
/* 401 */           i = 0;
/* 402 */           j = 0;
/* 403 */         } else if (this.a.a.contains(this.a.s)) {
/* 404 */           adz<buo> adz = (adz)this.a.s;
/* 405 */           i = (☃ instanceof bkh) ? dpb.b(this.a.u).<buo>a(adz, ((bkh)☃).e()) : -1;
/* 406 */           j = (blx1 instanceof bkh) ? dpb.b(this.a.u).<buo>a(adz, ((bkh)blx1).e()) : -1;
/*     */         } else {
/* 408 */           adz<blx> adz = (adz)this.a.s;
/* 409 */           i = dpb.b(this.a.u).a(adz, ☃);
/* 410 */           j = dpb.b(this.a.u).a(adz, blx1);
/*     */         } 
/*     */         
/* 413 */         if (i == j) {
/* 414 */           return this.a.t * Integer.compare(blx.a(☃), blx.a(blx1));
/*     */         }
/*     */         
/* 417 */         return this.a.t * Integer.compare(i, j);
/*     */       } }
/*     */     
/*     */     class b extends dlv.a<b> {
/*     */       private b(dpb.b this$0) {}
/*     */       
/*     */       public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 424 */         blx blx = (dpb.g(this.a.u)).q.get(i);
/*     */         
/* 426 */         dpb.a(this.a.u, ☃, k + 40, j, blx);
/*     */         int i3;
/* 428 */         for (i3 = 0; i3 < (dpb.g(this.a.u)).a.size(); i3++) {
/*     */           adx<buo> adx;
/* 430 */           if (blx instanceof bkh) {
/* 431 */             adx = ((adz<buo>)(dpb.g(this.a.u)).a.get(i3)).b(((bkh)blx).e());
/*     */           } else {
/* 433 */             adx = null;
/*     */           } 
/* 435 */           a(☃, adx, k + dpb.a(this.a.u, i3), j, (i % 2 == 0));
/*     */         } 
/* 437 */         for (i3 = 0; i3 < (dpb.g(this.a.u)).o.size(); i3++) {
/* 438 */           a(☃, ((adz)(dpb.g(this.a.u)).o.get(i3)).b(blx), k + dpb.a(this.a.u, i3 + (dpb.g(this.a.u)).a.size()), j, (i % 2 == 0));
/*     */         }
/*     */       }
/*     */       
/*     */       protected void a(dfm ☃, @Nullable adx<?> adx1, int i, int j, boolean bool) {
/* 443 */         String str = (adx1 == null) ? "-" : adx1.a(dpb.b(this.a.u).a(adx1));
/* 444 */         dkw.b(☃, dpb.h(this.a.u), str, i - dpb.i(this.a.u).b(str), j + 5, bool ? 16777215 : 9474192);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   class c extends dlv<c.a> {
/*     */     public c(dpb this$0, djz ☃) {
/* 451 */       super(☃, this$0.k, this$0.l, 32, this$0.l - 64, 9 * 4);
/*     */       
/* 453 */       for (aqe<?> aqe : gm.S) {
/* 454 */         if (dpb.b(this$0).a(aea.g.b(aqe)) > 0 || dpb.b(this$0).a(aea.h.b(aqe)) > 0) {
/* 455 */           b(new a(this, aqe));
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃) {
/* 462 */       this.a.a(☃);
/*     */     }
/*     */     
/*     */     class a extends dlv.a<a> {
/*     */       private final aqe<?> b;
/*     */       private final nr c;
/*     */       private final nr d;
/*     */       private final boolean e;
/*     */       private final nr f;
/*     */       private final boolean g;
/*     */       
/*     */       public a(dpb.c this$0, aqe<?> ☃) {
/* 474 */         this.b = ☃;
/*     */         
/* 476 */         this.c = ☃.g();
/*     */         
/* 478 */         int i = dpb.b(this$0.a).a(aea.g.b(☃));
/* 479 */         if (i == 0) {
/* 480 */           this.d = new of("stat_type.minecraft.killed.none", new Object[] { this.c });
/* 481 */           this.e = false;
/*     */         } else {
/* 483 */           this.d = new of("stat_type.minecraft.killed", new Object[] { Integer.valueOf(i), this.c });
/* 484 */           this.e = true;
/*     */         } 
/*     */         
/* 487 */         int j = dpb.b(this$0.a).a(aea.h.b(☃));
/* 488 */         if (j == 0) {
/* 489 */           this.f = new of("stat_type.minecraft.killed_by.none", new Object[] { this.c });
/* 490 */           this.g = false;
/*     */         } else {
/* 492 */           this.f = new of("stat_type.minecraft.killed_by", new Object[] { this.c, Integer.valueOf(j) });
/* 493 */           this.g = true;
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 499 */         dkw.b(☃, dpb.k(this.a.a), this.c, k + 2, j + 1, 16777215);
/* 500 */         dpb.m(this.a.a).getClass(); dkw.b(☃, dpb.l(this.a.a), this.d, k + 2 + 10, j + 1 + 9, this.e ? 9474192 : 6316128);
/* 501 */         dpb.o(this.a.a).getClass(); dkw.b(☃, dpb.n(this.a.a), this.f, k + 2 + 10, j + 1 + 9 * 2, this.g ? 9474192 : 6316128);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */