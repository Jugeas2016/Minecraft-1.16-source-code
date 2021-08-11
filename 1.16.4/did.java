/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class did
/*     */   extends eoo
/*     */ {
/*  35 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  37 */   private static final vk b = new vk("realms", "textures/gui/realms/op_icon.png");
/*  38 */   private static final vk c = new vk("realms", "textures/gui/realms/user_icon.png");
/*  39 */   private static final vk p = new vk("realms", "textures/gui/realms/cross_player_icon.png");
/*  40 */   private static final vk q = new vk("minecraft", "textures/gui/options_background.png");
/*     */   
/*  42 */   private static final nr r = new of("mco.configure.world.invites.normal.tooltip");
/*  43 */   private static final nr s = new of("mco.configure.world.invites.ops.tooltip");
/*  44 */   private static final nr t = new of("mco.configure.world.invites.remove.tooltip");
/*  45 */   private static final nr u = new of("mco.configure.world.invited");
/*     */   
/*     */   private nr v;
/*     */   
/*     */   private final dhs w;
/*     */   
/*     */   private final dgq x;
/*     */   
/*     */   private b y;
/*     */   
/*     */   private int z;
/*     */   
/*     */   private int A;
/*     */   private int B;
/*     */   private dlj C;
/*     */   private dlj D;
/*  61 */   private int E = -1;
/*     */   private String F;
/*  63 */   private int G = -1;
/*     */   private boolean H;
/*     */   private eom I;
/*     */   
/*     */   enum c
/*     */   {
/*  69 */     a,
/*  70 */     b,
/*  71 */     c;
/*     */   }
/*     */ 
/*     */   
/*  75 */   private c J = c.c;
/*     */   
/*     */   public did(dhs ☃, dgq dgq1) {
/*  78 */     this.w = ☃;
/*  79 */     this.x = dgq1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  84 */     this.z = this.k / 2 - 160;
/*  85 */     this.A = 150;
/*  86 */     this.B = this.k / 2 + 12;
/*     */     
/*  88 */     this.i.m.a(true);
/*     */     
/*  90 */     this.y = new b(this);
/*  91 */     this.y.g(this.z);
/*  92 */     d(this.y);
/*     */     
/*  94 */     for (dgn ☃ : this.x.h) {
/*  95 */       this.y.a(☃);
/*     */     }
/*     */     
/*  98 */     a(new dlj(this.B, j(1), this.A + 10, 20, new of("mco.configure.world.buttons.invite"), ☃ -> this.i.a(new dhx(this.w, this, this.x))));
/*     */ 
/*     */ 
/*     */     
/* 102 */     this.C = a(new dlj(this.B, j(7), this.A + 10, 20, new of("mco.configure.world.invites.remove.tooltip"), ☃ -> n(this.G)));
/*     */ 
/*     */ 
/*     */     
/* 106 */     this.D = a(new dlj(this.B, j(9), this.A + 10, 20, new of("mco.configure.world.invites.ops.tooltip"), ☃ -> {
/*     */             if (((dgn)this.x.h.get(this.G)).c()) {
/*     */               m(this.G);
/*     */             } else {
/*     */               l(this.G);
/*     */             } 
/*     */           }));
/*     */     
/* 114 */     a(new dlj(this.B + this.A / 2 + 2, j(12), this.A / 2 + 10 - 2, 20, nq.h, ☃ -> i()));
/*     */ 
/*     */ 
/*     */     
/* 118 */     this.I = d(new eom(new of("mco.configure.world.players.title"), this.k / 2, 17, 16777215));
/* 119 */     A();
/* 120 */     h();
/*     */   }
/*     */   
/*     */   private void h() {
/* 124 */     this.C.p = k(this.G);
/* 125 */     this.D.p = k(this.G);
/*     */   }
/*     */   
/*     */   private boolean k(int ☃) {
/* 129 */     return (☃ != -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 134 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 139 */     if (☃ == 256) {
/* 140 */       i();
/* 141 */       return true;
/*     */     } 
/* 143 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void i() {
/* 147 */     if (this.H) {
/* 148 */       this.i.a(this.w.c());
/*     */     } else {
/* 150 */       this.i.a(this.w);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void l(int ☃) {
/* 155 */     h();
/* 156 */     dgb dgb = dgb.a();
/* 157 */     String str = ((dgn)this.x.h.get(☃)).b();
/*     */     
/*     */     try {
/* 160 */       a(dgb.e(this.x.a, str));
/* 161 */     } catch (dhi dhi) {
/* 162 */       a.error("Couldn't op the user");
/*     */     } 
/*     */   }
/*     */   
/*     */   private void m(int ☃) {
/* 167 */     h();
/* 168 */     dgb dgb = dgb.a();
/* 169 */     String str = ((dgn)this.x.h.get(☃)).b();
/*     */     
/*     */     try {
/* 172 */       a(dgb.f(this.x.a, str));
/* 173 */     } catch (dhi dhi) {
/* 174 */       a.error("Couldn't deop the user");
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dgj ☃) {
/* 179 */     for (dgn dgn : this.x.h) {
/* 180 */       dgn.a(☃.a.contains(dgn.a()));
/*     */     }
/*     */   }
/*     */   
/*     */   private void n(int ☃) {
/* 185 */     h();
/* 186 */     if (☃ >= 0 && ☃ < this.x.h.size()) {
/* 187 */       dgn dgn = this.x.h.get(☃);
/* 188 */       this.F = dgn.b();
/* 189 */       this.E = ☃;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 204 */       dht dht = new dht(☃ -> { if (☃) { dgb dgb = dgb.a(); try { dgb.a(this.x.a, this.F); } catch (dhi dhi) { a.error("Couldn't uninvite user"); }  o(this.E); this.G = -1; h(); }  this.H = true; this.i.a(this); }new oe("Question"), (new of("mco.configure.world.uninvite.question")).c(" '").c(dgn.a()).c("' ?"));
/* 205 */       this.i.a(dht);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void o(int ☃) {
/* 210 */     this.x.h.remove(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 215 */     this.v = null;
/* 216 */     this.J = c.c;
/* 217 */     a(☃);
/*     */     
/* 219 */     if (this.y != null) {
/* 220 */       this.y.a(☃, i, j, f);
/*     */     }
/*     */     
/* 223 */     int k = j(12) + 20;
/*     */     
/* 225 */     dfo dfo = dfo.a();
/* 226 */     dfh dfh = dfo.c();
/* 227 */     this.i.M().a(q);
/* 228 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 229 */     float f1 = 32.0F;
/* 230 */     dfh.a(7, dfk.p);
/* 231 */     dfh.a(0.0D, this.l, 0.0D).a(0.0F, (this.l - k) / 32.0F + 0.0F).a(64, 64, 64, 255).d();
/* 232 */     dfh.a(this.k, this.l, 0.0D).a(this.k / 32.0F, (this.l - k) / 32.0F + 0.0F).a(64, 64, 64, 255).d();
/* 233 */     dfh.a(this.k, k, 0.0D).a(this.k / 32.0F, 0.0F).a(64, 64, 64, 255).d();
/* 234 */     dfh.a(0.0D, k, 0.0D).a(0.0F, 0.0F).a(64, 64, 64, 255).d();
/* 235 */     dfo.b();
/*     */     
/* 237 */     this.I.a(this, ☃);
/*     */     
/* 239 */     if (this.x != null && this.x.h != null) {
/* 240 */       this.o.b(☃, (new oe("")).a(u).c(" (").c(Integer.toString(this.x.h.size())).c(")"), this.z, j(0), 10526880);
/*     */     } else {
/* 242 */       this.o.b(☃, u, this.z, j(0), 10526880);
/*     */     } 
/*     */     
/* 245 */     super.a(☃, i, j, f);
/*     */     
/* 247 */     if (this.x == null) {
/*     */       return;
/*     */     }
/*     */     
/* 251 */     a(☃, this.v, i, j);
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, @Nullable nr nr1, int i, int j) {
/* 255 */     if (nr1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 259 */     int k = i + 12;
/* 260 */     int m = j - 12;
/* 261 */     int n = this.o.a(nr1);
/* 262 */     a(☃, k - 3, m - 3, k + n + 3, m + 8 + 3, -1073741824, -1073741824);
/*     */     
/* 264 */     this.o.a(☃, nr1, k, m, 16777215);
/*     */   }
/*     */   
/*     */   class b extends eon<a> {
/*     */     public b(did this$0) {
/* 269 */       super(did.a(this$0) + 10, did.a(12) + 20, did.b(1), did.c(12) + 20, 13);
/*     */     }
/*     */     
/*     */     public void a(dgn ☃) {
/* 273 */       a(new did.a(this.a, ☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public int d() {
/* 278 */       return (int)(this.d * 1.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 283 */       return (this.a.aw_() == this);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 289 */       if (i == 0 && ☃ < e() && d1 >= this.i && d1 <= this.j) {
/* 290 */         int j = did.b(this.a);
/* 291 */         int k = did.b(this.a) + did.a(this.a);
/*     */         
/* 293 */         int m = (int)Math.floor(d1 - this.i) - this.n + (int)m() - 4;
/* 294 */         int n = m / this.c;
/* 295 */         if (☃ >= j && ☃ <= k && n >= 0 && m >= 0 && n < l()) {
/* 296 */           a(n);
/* 297 */           a(m, n, ☃, d1, this.d);
/*     */         } 
/* 299 */         return true;
/*     */       } 
/* 301 */       return super.a(☃, d1, i);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃, int i, double d1, double d2, int j) {
/* 306 */       if (i < 0 || i > (did.c(this.a)).h.size() || did.d(this.a) == did.c.c) {
/*     */         return;
/*     */       }
/*     */       
/* 310 */       if (did.d(this.a) == did.c.a) {
/* 311 */         if (((dgn)(did.c(this.a)).h.get(i)).c()) {
/* 312 */           did.a(this.a, i);
/*     */         } else {
/* 314 */           did.b(this.a, i);
/*     */         } 
/* 316 */       } else if (did.d(this.a) == did.c.b) {
/* 317 */         did.c(this.a, i);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃) {
/* 323 */       j(☃);
/* 324 */       if (☃ != -1) {
/* 325 */         eoj.a(ekx.a("narrator.select", new Object[] { ((dgn)(did.c(this.a)).h.get(☃)).a() }));
/*     */       }
/* 327 */       b(☃);
/*     */     }
/*     */     
/*     */     public void b(int ☃) {
/* 331 */       did.d(this.a, ☃);
/*     */       
/* 333 */       did.e(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(@Nullable did.a ☃) {
/* 338 */       super.a(☃);
/* 339 */       did.d(this.a, au_().indexOf(☃));
/* 340 */       did.e(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃) {
/* 345 */       this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int e() {
/* 350 */       return did.b(this.a) + this.d - 5;
/*     */     }
/*     */ 
/*     */     
/*     */     public int c() {
/* 355 */       return l() * 13;
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends dlv.a<a> {
/*     */     private final dgn b;
/*     */     
/*     */     public a(did this$0, dgn ☃) {
/* 363 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 368 */       a(☃, this.b, k, j, i1, i2);
/*     */     }
/*     */ 
/*     */     
/*     */     private void a(dfm ☃, dgn dgn1, int i, int j, int k, int m) {
/*     */       int n;
/* 374 */       if (!dgn1.d()) {
/* 375 */         n = 10526880;
/*     */       }
/* 377 */       else if (dgn1.e()) {
/* 378 */         n = 8388479;
/*     */       } else {
/* 380 */         n = 16777215;
/*     */       } 
/*     */ 
/*     */       
/* 384 */       did.f(this.a).b(☃, dgn1.a(), (did.b(this.a) + 3 + 12), (j + 1), n);
/*     */       
/* 386 */       if (dgn1.c()) {
/* 387 */         did.a(this.a, ☃, did.b(this.a) + did.a(this.a) - 10, j + 1, k, m);
/*     */       } else {
/* 389 */         did.b(this.a, ☃, did.b(this.a) + did.a(this.a) - 10, j + 1, k, m);
/*     */       } 
/*     */       
/* 392 */       did.c(this.a, ☃, did.b(this.a) + did.a(this.a) - 22, j + 2, k, m);
/*     */ 
/*     */       
/* 395 */       dir.a(dgn1.b(), () -> {
/*     */             RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */             dkw.a(☃, did.b(this.a) + 2 + 2, i + 1, 8, 8, 8.0F, 8.0F, 8, 8, 64, 64);
/*     */             dkw.a(☃, did.b(this.a) + 2 + 2, i + 1, 8, 8, 40.0F, 8.0F, 8, 8, 64, 64);
/*     */           });
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(dfm ☃, int i, int j, int k, int m) {
/* 404 */     boolean bool = (k >= i && k <= i + 9 && m >= j && m <= j + 9 && m < j(12) + 20 && m > j(1));
/*     */     
/* 406 */     this.i.M().a(p);
/* 407 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 408 */     float f = bool ? 7.0F : 0.0F;
/* 409 */     dkw.a(☃, i, j, 0.0F, f, 8, 7, 8, 14);
/*     */     
/* 411 */     if (bool) {
/* 412 */       this.v = t;
/* 413 */       this.J = c.b;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(dfm ☃, int i, int j, int k, int m) {
/* 418 */     boolean bool = (k >= i && k <= i + 9 && m >= j && m <= j + 9 && m < j(12) + 20 && m > j(1));
/*     */     
/* 420 */     this.i.M().a(b);
/* 421 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 422 */     float f = bool ? 8.0F : 0.0F;
/* 423 */     dkw.a(☃, i, j, 0.0F, f, 8, 8, 8, 16);
/*     */     
/* 425 */     if (bool) {
/* 426 */       this.v = s;
/* 427 */       this.J = c.a;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void e(dfm ☃, int i, int j, int k, int m) {
/* 432 */     boolean bool = (k >= i && k <= i + 9 && m >= j && m <= j + 9 && m < j(12) + 20 && m > j(1));
/*     */     
/* 434 */     this.i.M().a(c);
/* 435 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 436 */     float f = bool ? 8.0F : 0.0F;
/* 437 */     dkw.a(☃, i, j, 0.0F, f, 8, 8, 8, 16);
/*     */     
/* 439 */     if (bool) {
/* 440 */       this.v = r;
/* 441 */       this.J = c.a;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\did.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */