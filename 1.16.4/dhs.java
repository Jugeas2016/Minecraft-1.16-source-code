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
/*     */ public class dhs
/*     */   extends dig
/*     */ {
/*  30 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  32 */   private static final vk b = new vk("realms", "textures/gui/realms/on_icon.png");
/*  33 */   private static final vk c = new vk("realms", "textures/gui/realms/off_icon.png");
/*  34 */   private static final vk p = new vk("realms", "textures/gui/realms/expired_icon.png");
/*  35 */   private static final vk q = new vk("realms", "textures/gui/realms/expires_soon_icon.png");
/*     */   
/*  37 */   private static final nr r = new of("mco.configure.worlds.title");
/*  38 */   private static final nr s = new of("mco.configure.world.title");
/*  39 */   private static final nr t = (new of("mco.configure.current.minigame")).c(": ");
/*  40 */   private static final nr u = new of("mco.selectServer.expired");
/*  41 */   private static final nr v = new of("mco.selectServer.expires.soon");
/*  42 */   private static final nr w = new of("mco.selectServer.expires.day");
/*  43 */   private static final nr x = new of("mco.selectServer.open");
/*  44 */   private static final nr y = new of("mco.selectServer.closed");
/*     */   
/*     */   @Nullable
/*     */   private nr z;
/*     */   
/*     */   private final dfw A;
/*     */   
/*     */   @Nullable
/*     */   private dgq B;
/*     */   
/*     */   private final long C;
/*     */   
/*     */   private int D;
/*     */   
/*     */   private int E;
/*     */   
/*     */   private dlj F;
/*     */   
/*     */   private dlj G;
/*     */   
/*     */   private dlj H;
/*     */   
/*     */   private dlj I;
/*     */   private dlj J;
/*     */   private dlj K;
/*     */   private dlj L;
/*     */   private boolean M;
/*     */   private int N;
/*     */   private int O;
/*     */   
/*     */   public dhs(dfw ☃, long l) {
/*  75 */     this.A = ☃;
/*  76 */     this.C = l;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  81 */     if (this.B == null) {
/*  82 */       a(this.C);
/*     */     }
/*     */     
/*  85 */     this.D = this.k / 2 - 187;
/*  86 */     this.E = this.k / 2 + 190;
/*     */     
/*  88 */     this.i.m.a(true);
/*     */     
/*  90 */     this.F = a(new dlj(b(0, 3), j(0), 100, 20, new of("mco.configure.world.buttons.players"), ☃ -> this.i.a(new did(this, this.B))));
/*     */ 
/*     */     
/*  93 */     this.G = a(new dlj(b(1, 3), j(0), 100, 20, new of("mco.configure.world.buttons.settings"), ☃ -> this.i.a(new dij(this, this.B.d()))));
/*     */ 
/*     */     
/*  96 */     this.H = a(new dlj(b(2, 3), j(0), 100, 20, new of("mco.configure.world.buttons.subscription"), ☃ -> this.i.a(new dil(this, this.B.d(), this.A))));
/*     */ 
/*     */ 
/*     */     
/* 100 */     for (int ☃ = 1; ☃ < 5; ☃++) {
/* 101 */       a(☃);
/*     */     }
/*     */     
/* 104 */     this.L = a(new dlj(b(0), j(13) - 5, 100, 20, new of("mco.configure.world.buttons.switchminigame"), ☃ -> {
/*     */             dii dii = new dii(this, dgq.c.b);
/*     */             
/*     */             dii.a(new of("mco.template.title.minigame"));
/*     */             this.i.a(dii);
/*     */           }));
/* 110 */     this.I = a(new dlj(b(0), j(13) - 5, 90, 20, new of("mco.configure.world.buttons.options"), ☃ -> this.i.a(new dik(this, ((dgw)this.B.i.get(Integer.valueOf(this.B.n))).d(), this.B.m, this.B.n))));
/*     */ 
/*     */     
/* 113 */     this.J = a(new dlj(b(1), j(13) - 5, 90, 20, new of("mco.configure.world.backup"), ☃ -> this.i.a(new dhp(this, this.B.d(), this.B.n))));
/*     */ 
/*     */     
/* 116 */     this.K = a(new dlj(b(2), j(13) - 5, 90, 20, new of("mco.configure.world.buttons.resetworld"), ☃ -> this.i.a(new dif(this, this.B.d(), (), ()))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     a(new dlj(this.E - 80 + 8, j(13) - 5, 70, 20, nq.h, ☃ -> h()));
/*     */ 
/*     */ 
/*     */     
/* 127 */     this.J.o = true;
/*     */     
/* 129 */     if (this.B == null) {
/* 130 */       n();
/* 131 */       m();
/*     */       
/* 133 */       this.F.o = false;
/* 134 */       this.G.o = false;
/* 135 */       this.H.o = false;
/*     */     } else {
/* 137 */       i();
/*     */       
/* 139 */       if (l()) {
/* 140 */         m();
/*     */       } else {
/* 142 */         n();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 148 */     int i = c(☃);
/* 149 */     int j = j(5) + 5;
/* 150 */     dhm dhm = new dhm(i, j, 80, 80, () -> this.B, ☃ -> this.z = ☃, ☃, dlj1 -> {
/*     */           dhm.b b = ((dhm)dlj1).a();
/*     */           if (b != null) {
/*     */             switch (null.a[b.c.ordinal()]) {
/*     */               case 1:
/*     */                 return;
/*     */ 
/*     */               
/*     */               case 2:
/*     */                 a(this.B);
/*     */ 
/*     */               
/*     */               case 3:
/*     */                 if (b.b) {
/*     */                   k();
/*     */                 } else if (b.a) {
/*     */                   b(☃, this.B);
/*     */                 } else {
/*     */                   a(☃, this.B);
/*     */                 } 
/*     */             } 
/*     */             
/*     */             throw new IllegalStateException("Unknown action " + b.c);
/*     */           } 
/*     */         });
/* 175 */     a(dhm);
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/* 179 */     return this.D + ☃ * 95;
/*     */   }
/*     */   
/*     */   private int b(int ☃, int i) {
/* 183 */     return this.k / 2 - (i * 105 - 5) / 2 + ☃ * 105;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 188 */     super.d();
/* 189 */     this.N++;
/* 190 */     this.O--;
/* 191 */     if (this.O < 0) {
/* 192 */       this.O = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 198 */     this.z = null;
/*     */     
/* 200 */     a(☃);
/*     */     
/* 202 */     a(☃, this.o, r, this.k / 2, j(4), 16777215);
/*     */     
/* 204 */     super.a(☃, i, j, f);
/*     */     
/* 206 */     if (this.B == null) {
/* 207 */       a(☃, this.o, s, this.k / 2, 17, 16777215);
/*     */       
/*     */       return;
/*     */     } 
/* 211 */     String str = this.B.b();
/* 212 */     int k = this.o.b(str);
/* 213 */     int m = (this.B.e == dgq.b.a) ? 10526880 : 8388479;
/* 214 */     int n = this.o.a(s);
/*     */     
/* 216 */     a(☃, this.o, s, this.k / 2, 12, 16777215);
/*     */     
/* 218 */     a(☃, this.o, str, this.k / 2, 24, m);
/*     */     
/* 220 */     int i1 = Math.min(b(2, 3) + 80 - 11, this.k / 2 + k / 2 + n / 2 + 10);
/* 221 */     c(☃, i1, 7, i, j);
/*     */     
/* 223 */     if (l()) {
/* 224 */       this.o.b(☃, t.e().c(this.B.c()), (this.D + 80 + 20 + 10), j(13), 16777215);
/*     */     }
/*     */     
/* 227 */     if (this.z != null) {
/* 228 */       a(☃, this.z, i, j);
/*     */     }
/*     */   }
/*     */   
/*     */   private int c(int ☃) {
/* 233 */     return this.D + (☃ - 1) * 98;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 238 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 243 */     if (☃ == 256) {
/* 244 */       h();
/* 245 */       return true;
/*     */     } 
/* 247 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void h() {
/* 251 */     if (this.M) {
/* 252 */       this.A.ar_();
/*     */     }
/* 254 */     this.i.a(this.A);
/*     */   }
/*     */   
/*     */   private void a(long ☃) {
/* 258 */     (new Thread(() -> {
/*     */           dgb dgb = dgb.a();
/*     */           
/*     */           try {
/*     */             this.B = dgb.a(☃);
/*     */             
/*     */             i();
/*     */             if (l()) {
/*     */               b(this.L);
/*     */             } else {
/*     */               b(this.I);
/*     */               b(this.J);
/*     */               b(this.K);
/*     */             } 
/* 272 */           } catch (dhi dhi) {
/*     */             a.error("Couldn't get own world");
/*     */             this.i.execute(());
/*     */           } 
/* 276 */         })).start();
/*     */   }
/*     */   
/*     */   private void i() {
/* 280 */     this.F.o = !this.B.j;
/* 281 */     this.G.o = !this.B.j;
/* 282 */     this.H.o = true;
/*     */     
/* 284 */     this.L.o = !this.B.j;
/*     */     
/* 286 */     this.I.o = !this.B.j;
/* 287 */     this.K.o = !this.B.j;
/*     */   }
/*     */   
/*     */   private void a(dgq ☃) {
/* 291 */     if (this.B.e == dgq.b.b) {
/* 292 */       this.A.a(☃, new dhs(this.A.g(), this.C));
/*     */     } else {
/* 294 */       a(true, new dhs(this.A.g(), this.C));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void k() {
/* 299 */     dii ☃ = new dii(this, dgq.c.b);
/* 300 */     ☃.a(new of("mco.template.title.minigame"));
/* 301 */     ☃.a(new nr[] { new of("mco.minigame.world.info.line1"), new of("mco.minigame.world.info.line2") });
/* 302 */     this.i.a(☃);
/*     */   }
/*     */   
/*     */   private void a(int ☃, dgq dgq1) {
/* 306 */     nr nr1 = new of("mco.configure.world.slot.switch.question.line1");
/* 307 */     nr nr2 = new of("mco.configure.world.slot.switch.question.line2");
/* 308 */     this.i.a(new dhy(bool -> { if (bool) { this.i.a(new dhz(this.A, new djf(☃.a, i, ()))); } else { this.i.a(this); }  }dhy.a.b, nr1, nr2, true));
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
/*     */   private void b(int ☃, dgq dgq1) {
/* 320 */     nr nr1 = new of("mco.configure.world.slot.switch.question.line1");
/* 321 */     nr nr2 = new of("mco.configure.world.slot.switch.question.line2");
/* 322 */     this.i.a(new dhy(bool -> { if (bool) { dif dif = new dif(this, ☃, new of("mco.configure.world.switch.slot"), new of("mco.configure.world.switch.slot.subtitle"), 10526880, nq.d, (), ()); dif.a(i); dif.a(new of("mco.create.world.reset.title")); this.i.a(dif); } else { this.i.a(this); }  }dhy.a.b, nr1, nr2, true));
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
/*     */   protected void a(dfm ☃, @Nullable nr nr1, int i, int j) {
/* 338 */     int k = i + 12;
/* 339 */     int m = j - 12;
/* 340 */     int n = this.o.a(nr1);
/*     */     
/* 342 */     if (k + n + 3 > this.E) {
/* 343 */       k = k - n - 20;
/*     */     }
/*     */     
/* 346 */     a(☃, k - 3, m - 3, k + n + 3, m + 8 + 3, -1073741824, -1073741824);
/*     */     
/* 348 */     this.o.a(☃, nr1, k, m, 16777215);
/*     */   }
/*     */   
/*     */   private void c(dfm ☃, int i, int j, int k, int m) {
/* 352 */     if (this.B.j) {
/* 353 */       d(☃, i, j, k, m);
/* 354 */     } else if (this.B.e == dgq.b.a) {
/* 355 */       f(☃, i, j, k, m);
/* 356 */     } else if (this.B.e == dgq.b.b) {
/* 357 */       if (this.B.l < 7) {
/* 358 */         b(☃, i, j, k, m, this.B.l);
/*     */       } else {
/* 360 */         e(☃, i, j, k, m);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(dfm ☃, int i, int j, int k, int m) {
/* 366 */     this.i.M().a(p);
/* 367 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 368 */     dkw.a(☃, i, j, 0.0F, 0.0F, 10, 28, 10, 28);
/*     */     
/* 370 */     if (k >= i && k <= i + 9 && m >= j && m <= j + 27) {
/* 371 */       this.z = u;
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(dfm ☃, int i, int j, int k, int m, int n) {
/* 376 */     this.i.M().a(q);
/*     */     
/* 378 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 379 */     if (this.N % 20 < 10) {
/* 380 */       dkw.a(☃, i, j, 0.0F, 0.0F, 10, 28, 20, 28);
/*     */     } else {
/* 382 */       dkw.a(☃, i, j, 10.0F, 0.0F, 10, 28, 20, 28);
/*     */     } 
/*     */     
/* 385 */     if (k >= i && k <= i + 9 && m >= j && m <= j + 27) {
/* 386 */       if (n <= 0) {
/* 387 */         this.z = v;
/* 388 */       } else if (n == 1) {
/* 389 */         this.z = w;
/*     */       } else {
/* 391 */         this.z = new of("mco.selectServer.expires.days", new Object[] { Integer.valueOf(n) });
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void e(dfm ☃, int i, int j, int k, int m) {
/* 397 */     this.i.M().a(b);
/* 398 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 399 */     dkw.a(☃, i, j, 0.0F, 0.0F, 10, 28, 10, 28);
/*     */     
/* 401 */     if (k >= i && k <= i + 9 && m >= j && m <= j + 27) {
/* 402 */       this.z = x;
/*     */     }
/*     */   }
/*     */   
/*     */   private void f(dfm ☃, int i, int j, int k, int m) {
/* 407 */     this.i.M().a(c);
/* 408 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 409 */     dkw.a(☃, i, j, 0.0F, 0.0F, 10, 28, 10, 28);
/*     */     
/* 411 */     if (k >= i && k <= i + 9 && m >= j && m <= j + 27) {
/* 412 */       this.z = y;
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean l() {
/* 417 */     return (this.B != null && this.B.m == dgq.c.b);
/*     */   }
/*     */   
/*     */   private void m() {
/* 421 */     a(this.I);
/* 422 */     a(this.J);
/* 423 */     a(this.K);
/*     */   }
/*     */   
/*     */   private void a(dlj ☃) {
/* 427 */     ☃.p = false;
/* 428 */     this.e.remove(☃);
/* 429 */     this.m.remove(☃);
/*     */   }
/*     */   
/*     */   private void b(dlj ☃) {
/* 433 */     ☃.p = true;
/* 434 */     a(☃);
/*     */   }
/*     */   
/*     */   private void n() {
/* 438 */     a(this.L);
/*     */   }
/*     */   
/*     */   public void a(dgw ☃) {
/* 442 */     dgw dgw1 = this.B.i.get(Integer.valueOf(this.B.n));
/* 443 */     ☃.k = dgw1.k;
/* 444 */     ☃.l = dgw1.l;
/*     */     
/* 446 */     dgb dgb = dgb.a();
/*     */     
/*     */     try {
/* 449 */       dgb.a(this.B.a, this.B.n, ☃);
/* 450 */       this.B.i.put(Integer.valueOf(this.B.n), ☃);
/* 451 */     } catch (dhi dhi) {
/* 452 */       a.error("Couldn't save slot settings");
/* 453 */       this.i.a(new dhw(dhi, this));
/*     */       
/*     */       return;
/*     */     } 
/* 457 */     this.i.a(this);
/*     */   }
/*     */   
/*     */   public void a(String ☃, String str1) {
/* 461 */     String str = str1.trim().isEmpty() ? null : str1;
/*     */     
/* 463 */     dgb dgb = dgb.a();
/*     */     
/*     */     try {
/* 466 */       dgb.b(this.B.a, ☃, str);
/* 467 */       this.B.a(☃);
/* 468 */       this.B.b(str);
/* 469 */     } catch (dhi dhi) {
/* 470 */       a.error("Couldn't save settings");
/* 471 */       this.i.a(new dhw(dhi, this));
/*     */       
/*     */       return;
/*     */     } 
/* 475 */     this.i.a(this);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃, dot dot1) {
/* 479 */     this.i.a(new dhz(dot1, new djb(this.B, this, this.A, ☃)));
/*     */   }
/*     */   
/*     */   public void a(dot ☃) {
/* 483 */     this.i.a(new dhz(☃, new diw(this.B, this)));
/*     */   }
/*     */   
/*     */   public void a() {
/* 487 */     this.M = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(@Nullable dhe ☃) {
/* 492 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */     
/* 496 */     if (dhe.a.b == ☃.i) {
/* 497 */       this.i.a(new dhz(this.A, new dje(this.B.a, ☃, c())));
/*     */     }
/*     */   }
/*     */   
/*     */   public dhs c() {
/* 502 */     return new dhs(this.A, this.C);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */