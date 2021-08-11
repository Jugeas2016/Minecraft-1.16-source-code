/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.IOException;
/*     */ import java.util.Locale;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dzz
/*     */   implements aci, AutoCloseable
/*     */ {
/*  64 */   private static final vk c = new vk("textures/misc/nausea.png");
/*     */   
/*  66 */   private static final Logger d = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private final djz e;
/*     */   
/*     */   private final ach f;
/*     */   
/*  73 */   private final Random g = new Random();
/*     */   
/*     */   private float h;
/*     */   
/*     */   public final eac a;
/*     */   
/*     */   private final dkx i;
/*     */   
/*     */   private final eam j;
/*     */   
/*     */   private int k;
/*     */   
/*     */   private float l;
/*     */   
/*     */   private float m;
/*     */   private float n;
/*     */   private float o;
/*     */   private boolean p = true;
/*     */   private boolean q = true;
/*     */   private long r;
/*  93 */   private long s = x.b();
/*     */ 
/*     */   
/*     */   private final eaf t;
/*     */   
/*  98 */   private final ejw u = new ejw();
/*     */ 
/*     */   
/*     */   private boolean v;
/*     */ 
/*     */   
/* 104 */   private float w = 1.0F;
/*     */   
/*     */   private float x;
/*     */   
/*     */   private float y;
/*     */   
/*     */   @Nullable
/*     */   private bmb z;
/*     */   
/*     */   private int A;
/*     */   
/*     */   private float B;
/*     */   private float C;
/*     */   @Nullable
/*     */   private eaj D;
/* 119 */   private static final vk[] E = new vk[] { new vk("shaders/post/notch.json"), new vk("shaders/post/fxaa.json"), new vk("shaders/post/art.json"), new vk("shaders/post/bumpy.json"), new vk("shaders/post/blobs2.json"), new vk("shaders/post/pencil.json"), new vk("shaders/post/color_convolve.json"), new vk("shaders/post/deconverge.json"), new vk("shaders/post/flip.json"), new vk("shaders/post/invert.json"), new vk("shaders/post/ntsc.json"), new vk("shaders/post/outline.json"), new vk("shaders/post/phosphor.json"), new vk("shaders/post/scan_pincushion.json"), new vk("shaders/post/sobel.json"), new vk("shaders/post/bits.json"), new vk("shaders/post/desaturate.json"), new vk("shaders/post/green.json"), new vk("shaders/post/blur.json"), new vk("shaders/post/wobble.json"), new vk("shaders/post/blobs.json"), new vk("shaders/post/antialias.json"), new vk("shaders/post/creeper.json"), new vk("shaders/post/spider.json") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 145 */   public static final int b = E.length;
/* 146 */   private int F = b;
/*     */   private boolean G;
/* 148 */   private final djk H = new djk();
/*     */   
/*     */   public dzz(djz ☃, ach ach1, eam eam1) {
/* 151 */     this.e = ☃;
/* 152 */     this.f = ach1;
/* 153 */     this.a = ☃.ae();
/* 154 */     this.i = new dkx(☃.M());
/* 155 */     this.t = new eaf(this, ☃);
/* 156 */     this.j = eam1;
/*     */     
/* 158 */     this.D = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 163 */     this.t.close();
/* 164 */     this.i.close();
/* 165 */     this.u.close();
/* 166 */     a();
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
/*     */   public void a() {
/* 182 */     if (this.D != null) {
/* 183 */       this.D.close();
/*     */     }
/* 185 */     this.D = null;
/* 186 */     this.F = b;
/*     */   }
/*     */   
/*     */   public void b() {
/* 190 */     this.G = !this.G;
/*     */   }
/*     */   
/*     */   public void a(@Nullable aqa ☃) {
/* 194 */     if (this.D != null) {
/* 195 */       this.D.close();
/*     */     }
/* 197 */     this.D = null;
/*     */     
/* 199 */     if (☃ instanceof bdc) {
/* 200 */       a(new vk("shaders/post/creeper.json"));
/* 201 */     } else if (☃ instanceof beb) {
/* 202 */       a(new vk("shaders/post/spider.json"));
/* 203 */     } else if (☃ instanceof bdg) {
/* 204 */       a(new vk("shaders/post/invert.json"));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(vk ☃) {
/* 227 */     if (this.D != null) {
/* 228 */       this.D.close();
/*     */     }
/*     */     
/*     */     try {
/* 232 */       this.D = new eaj(this.e.M(), this.f, this.e.f(), ☃);
/* 233 */       this.D.a(this.e.aD().k(), this.e.aD().l());
/* 234 */       this.G = true;
/* 235 */     } catch (IOException iOException) {
/* 236 */       d.warn("Failed to load shader: {}", ☃, iOException);
/* 237 */       this.F = b;
/* 238 */       this.G = false;
/* 239 */     } catch (JsonSyntaxException jsonSyntaxException) {
/* 240 */       d.warn("Failed to parse shader: {}", ☃, jsonSyntaxException);
/* 241 */       this.F = b;
/* 242 */       this.G = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ach ☃) {
/* 248 */     if (this.D != null) {
/* 249 */       this.D.close();
/*     */     }
/* 251 */     this.D = null;
/* 252 */     if (this.F == b) {
/* 253 */       a(this.e.aa());
/*     */     } else {
/* 255 */       a(E[this.F]);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void e() {
/* 260 */     n();
/* 261 */     this.t.a();
/*     */     
/* 263 */     if (this.e.aa() == null) {
/* 264 */       this.e.a(this.e.s);
/*     */     }
/* 266 */     this.H.a();
/*     */     
/* 268 */     this.k++;
/*     */     
/* 270 */     this.a.a();
/* 271 */     this.e.e.a(this.H);
/*     */     
/* 273 */     this.o = this.n;
/* 274 */     if (this.e.j.i().d()) {
/* 275 */       this.n += 0.05F;
/* 276 */       if (this.n > 1.0F) {
/* 277 */         this.n = 1.0F;
/*     */       }
/* 279 */     } else if (this.n > 0.0F) {
/* 280 */       this.n -= 0.0125F;
/*     */     } 
/*     */     
/* 283 */     if (this.A > 0) {
/* 284 */       this.A--;
/* 285 */       if (this.A == 0) {
/* 286 */         this.z = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public eaj f() {
/* 293 */     return this.D;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/* 297 */     if (this.D != null) {
/* 298 */       this.D.a(☃, i);
/*     */     }
/*     */     
/* 301 */     this.e.e.a(☃, i);
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 305 */     aqa aqa = this.e.aa();
/* 306 */     if (aqa == null) {
/*     */       return;
/*     */     }
/* 309 */     if (this.e.r == null) {
/*     */       return;
/*     */     }
/*     */     
/* 313 */     this.e.au().a("pick");
/*     */     
/* 315 */     this.e.u = null;
/*     */     
/* 317 */     double d1 = this.e.q.c();
/* 318 */     this.e.v = aqa.a(d1, ☃, false);
/*     */     
/* 320 */     dcn dcn1 = aqa.j(☃);
/*     */ 
/*     */     
/* 323 */     boolean bool = false;
/* 324 */     int i = 3;
/*     */ 
/*     */     
/* 327 */     double d2 = d1;
/* 328 */     if (this.e.q.h()) {
/* 329 */       d2 = 6.0D;
/* 330 */       d1 = d2;
/*     */     } else {
/* 332 */       if (d2 > 3.0D) {
/* 333 */         bool = true;
/*     */       }
/* 335 */       d1 = d2;
/*     */     } 
/*     */     
/* 338 */     d2 *= d2;
/*     */     
/* 340 */     if (this.e.v != null) {
/* 341 */       d2 = this.e.v.e().g(dcn1);
/*     */     }
/*     */     
/* 344 */     dcn dcn2 = aqa.f(1.0F);
/* 345 */     dcn dcn3 = dcn1.b(dcn2.b * d1, dcn2.c * d1, dcn2.d * d1);
/* 346 */     float f = 1.0F;
/*     */     
/* 348 */     dci dci = aqa.cc().b(dcn2.a(d1)).c(1.0D, 1.0D, 1.0D);
/*     */     
/* 350 */     dck dck = bgn.a(aqa, dcn1, dcn3, dci, ☃ -> (!☃.a_() && ☃.aT()), d2);
/*     */     
/* 352 */     if (dck != null) {
/* 353 */       aqa aqa1 = dck.a();
/* 354 */       dcn dcn = dck.e();
/* 355 */       double d = dcn1.g(dcn);
/* 356 */       if (bool && d > 9.0D) {
/* 357 */         this.e.v = dcj.a(dcn, gc.a(dcn2.b, dcn2.c, dcn2.d), new fx(dcn));
/*     */       }
/* 359 */       else if (d < d2 || this.e.v == null) {
/* 360 */         this.e.v = dck;
/* 361 */         if (aqa1 instanceof aqm || aqa1 instanceof bcp) {
/* 362 */           this.e.u = aqa1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 367 */     this.e.au().c();
/*     */   }
/*     */   
/*     */   private void n() {
/* 371 */     float ☃ = 1.0F;
/* 372 */     if (this.e.aa() instanceof dzj) {
/* 373 */       dzj dzj = (dzj)this.e.aa();
/*     */       
/* 375 */       ☃ = dzj.v();
/*     */     } 
/*     */     
/* 378 */     this.m = this.l;
/* 379 */     this.l += (☃ - this.l) * 0.5F;
/*     */     
/* 381 */     if (this.l > 1.5F) {
/* 382 */       this.l = 1.5F;
/*     */     }
/* 384 */     if (this.l < 0.1F) {
/* 385 */       this.l = 0.1F;
/*     */     }
/*     */   }
/*     */   
/*     */   private double b(djk ☃, float f, boolean bool) {
/* 390 */     if (this.v) {
/* 391 */       return 90.0D;
/*     */     }
/*     */     
/* 394 */     double d = 70.0D;
/* 395 */     if (bool) {
/* 396 */       d = this.e.k.aO;
/* 397 */       d *= afm.g(f, this.m, this.l);
/*     */     } 
/* 399 */     if (☃.g() instanceof aqm && ((aqm)☃.g()).dl()) {
/* 400 */       float f1 = Math.min(((aqm)☃.g()).aq + f, 20.0F);
/*     */       
/* 402 */       d /= ((1.0F - 500.0F / (f1 + 500.0F)) * 2.0F + 1.0F);
/*     */     } 
/*     */     
/* 405 */     cux cux = ☃.k();
/* 406 */     if (!cux.c()) {
/* 407 */       d = d * 60.0D / 70.0D;
/*     */     }
/*     */     
/* 410 */     return d;
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, float f) {
/* 414 */     if (this.e.aa() instanceof aqm) {
/* 415 */       aqm aqm = (aqm)this.e.aa();
/*     */       
/* 417 */       float f1 = aqm.an - f;
/*     */       
/* 419 */       if (aqm.dl()) {
/* 420 */         float f3 = Math.min(aqm.aq + f, 20.0F);
/*     */         
/* 422 */         ☃.a(g.f.a(40.0F - 8000.0F / (f3 + 200.0F)));
/*     */       } 
/*     */       
/* 425 */       if (f1 < 0.0F) {
/*     */         return;
/*     */       }
/* 428 */       f1 /= aqm.ao;
/* 429 */       f1 = afm.a(f1 * f1 * f1 * f1 * 3.1415927F);
/*     */       
/* 431 */       float f2 = aqm.ap;
/*     */       
/* 433 */       ☃.a(g.d.a(-f2));
/* 434 */       ☃.a(g.f.a(-f1 * 14.0F));
/* 435 */       ☃.a(g.d.a(f2));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(dfm ☃, float f) {
/* 440 */     if (!(this.e.aa() instanceof bfw)) {
/*     */       return;
/*     */     }
/* 443 */     bfw bfw = (bfw)this.e.aa();
/*     */     
/* 445 */     float f1 = bfw.A - bfw.z;
/* 446 */     float f2 = -(bfw.A + f1 * f);
/* 447 */     float f3 = afm.g(f, bfw.bs, bfw.bt);
/* 448 */     ☃.a((afm.a(f2 * 3.1415927F) * f3 * 0.5F), -Math.abs(afm.b(f2 * 3.1415927F) * f3), 0.0D);
/* 449 */     ☃.a(g.f.a(afm.a(f2 * 3.1415927F) * f3 * 3.0F));
/* 450 */     ☃.a(g.b.a(Math.abs(afm.b(f2 * 3.1415927F - 0.2F) * f3) * 5.0F));
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
/*     */   private void a(dfm ☃, djk djk1, float f) {
/* 464 */     if (this.v) {
/*     */       return;
/*     */     }
/*     */     
/* 468 */     a(a(djk1, f, false));
/* 469 */     dfm.a a = ☃.c();
/* 470 */     a.a().a();
/* 471 */     a.b().c();
/*     */     
/* 473 */     ☃.a();
/* 474 */     a(☃, f);
/* 475 */     if (this.e.k.aa) {
/* 476 */       b(☃, f);
/*     */     }
/*     */     
/* 479 */     boolean bool = (this.e.aa() instanceof aqm && ((aqm)this.e.aa()).em());
/*     */     
/* 481 */     if (this.e.k.g().a() && !bool && !this.e.k.aI && this.e.q.l() != bru.e) {
/* 482 */       this.t.c();
/* 483 */       this.a.a(f, ☃, this.j.b(), this.e.s, this.e.ac().a(this.e.s, f));
/* 484 */       this.t.b();
/*     */     } 
/*     */     
/* 487 */     ☃.b();
/* 488 */     if (this.e.k.g().a() && !bool) {
/* 489 */       eaq.a(this.e, ☃);
/* 490 */       a(☃, f);
/*     */     } 
/* 492 */     if (this.e.k.aa) {
/* 493 */       b(☃, f);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(b ☃) {
/* 498 */     RenderSystem.matrixMode(5889);
/* 499 */     RenderSystem.loadIdentity();
/* 500 */     RenderSystem.multMatrix(☃);
/* 501 */     RenderSystem.matrixMode(5888);
/*     */   }
/*     */   
/*     */   public b a(djk ☃, float f, boolean bool) {
/* 505 */     dfm dfm = new dfm();
/* 506 */     dfm.c().a().a();
/*     */     
/* 508 */     if (this.w != 1.0F) {
/* 509 */       dfm.a(this.x, -this.y, 0.0D);
/* 510 */       dfm.a(this.w, this.w, 1.0F);
/*     */     } 
/*     */     
/* 513 */     dfm.c().a().a(b.a(b(☃, f, bool), this.e.aD().k() / this.e.aD().l(), 0.05F, this.h * 4.0F));
/* 514 */     return dfm.c().a();
/*     */   }
/*     */   
/*     */   public static float a(aqm ☃, float f) {
/* 518 */     int i = ☃.b(apw.p).b();
/* 519 */     if (i > 200) {
/* 520 */       return 1.0F;
/*     */     }
/* 522 */     return 0.7F + afm.a((i - f) * 3.1415927F * 0.2F) * 0.3F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, long l, boolean bool) {
/* 527 */     if (this.e.ap() || !this.e.k.q || (this.e.k.Y && this.e.l.d())) {
/* 528 */       this.s = x.b();
/*     */     }
/* 530 */     else if (x.b() - this.s > 500L) {
/* 531 */       this.e.c(false);
/*     */     } 
/*     */ 
/*     */     
/* 535 */     if (this.e.x) {
/*     */       return;
/*     */     }
/*     */     
/* 539 */     int i = (int)(this.e.l.e() * this.e.aD().o() / this.e.aD().m());
/* 540 */     int j = (int)(this.e.l.f() * this.e.aD().p() / this.e.aD().n());
/*     */     
/* 542 */     RenderSystem.viewport(0, 0, this.e.aD().k(), this.e.aD().l());
/* 543 */     if (bool && this.e.r != null) {
/* 544 */       this.e.au().a("level");
/*     */       
/* 546 */       a(☃, l, new dfm());
/*     */       
/* 548 */       if (this.e.G() && this.r < x.b() - 1000L) {
/* 549 */         this.r = x.b();
/* 550 */         if (!this.e.H().z()) {
/* 551 */           o();
/*     */         }
/*     */       } 
/*     */       
/* 555 */       this.e.e.b();
/*     */       
/* 557 */       if (this.D != null && this.G) {
/* 558 */         RenderSystem.disableBlend();
/* 559 */         RenderSystem.disableDepthTest();
/* 560 */         RenderSystem.disableAlphaTest();
/* 561 */         RenderSystem.enableTexture();
/*     */         
/* 563 */         RenderSystem.matrixMode(5890);
/* 564 */         RenderSystem.pushMatrix();
/* 565 */         RenderSystem.loadIdentity();
/* 566 */         this.D.a(☃);
/* 567 */         RenderSystem.popMatrix();
/*     */       } 
/* 569 */       this.e.f().a(true);
/*     */     } 
/*     */     
/* 572 */     dez dez = this.e.aD();
/* 573 */     RenderSystem.clear(256, djz.a);
/* 574 */     RenderSystem.matrixMode(5889);
/* 575 */     RenderSystem.loadIdentity();
/* 576 */     RenderSystem.ortho(0.0D, dez.k() / dez.s(), dez.l() / dez.s(), 0.0D, 1000.0D, 3000.0D);
/* 577 */     RenderSystem.matrixMode(5888);
/* 578 */     RenderSystem.loadIdentity();
/* 579 */     RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
/*     */     
/* 581 */     dep.d();
/*     */     
/* 583 */     dfm dfm = new dfm();
/*     */     
/* 585 */     if (bool && this.e.r != null) {
/* 586 */       this.e.au().b("gui");
/* 587 */       if (this.e.s != null) {
/* 588 */         float f = afm.g(☃, this.e.s.bQ, this.e.s.bP);
/* 589 */         if (f > 0.0F && this.e.s.a(apw.i) && this.e.k.aP < 1.0F) {
/* 590 */           c(f * (1.0F - this.e.k.aP));
/*     */         }
/*     */       } 
/*     */       
/* 594 */       if (!this.e.k.aI || this.e.y != null) {
/* 595 */         RenderSystem.defaultAlphaFunc();
/* 596 */         a(this.e.aD().o(), this.e.aD().p(), ☃);
/* 597 */         this.e.j.a(dfm, ☃);
/* 598 */         RenderSystem.clear(256, djz.a);
/*     */       } 
/* 600 */       this.e.au().c();
/*     */     } 
/*     */     
/* 603 */     if (this.e.z != null) {
/*     */       try {
/* 605 */         this.e.z.a(dfm, i, j, this.e.ak());
/* 606 */       } catch (Throwable throwable) {
/* 607 */         l l1 = l.a(throwable, "Rendering overlay");
/* 608 */         m m = l1.a("Overlay render details");
/*     */         
/* 610 */         m.a("Overlay name", () -> this.e.z.getClass().getCanonicalName());
/*     */         
/* 612 */         throw new u(l1);
/*     */       } 
/* 614 */     } else if (this.e.y != null) {
/*     */       try {
/* 616 */         this.e.y.a(dfm, i, j, this.e.ak());
/* 617 */       } catch (Throwable throwable) {
/* 618 */         l l1 = l.a(throwable, "Rendering screen");
/* 619 */         m m = l1.a("Screen render details");
/*     */         
/* 621 */         m.a("Screen name", () -> this.e.y.getClass().getCanonicalName());
/* 622 */         m.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", new Object[] { Integer.valueOf(☃), Integer.valueOf(i), Double.valueOf(this.e.l.e()), Double.valueOf(this.e.l.f()) }));
/* 623 */         m.a("Screen size", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f", new Object[] { Integer.valueOf(this.e.aD().o()), Integer.valueOf(this.e.aD().p()), Integer.valueOf(this.e.aD().k()), Integer.valueOf(this.e.aD().l()), Double.valueOf(this.e.aD().s()) }));
/*     */         
/* 625 */         throw new u(l1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void o() {
/* 631 */     if (this.e.e.h() > 10 && this.e.e.n() && !this.e.H().z()) {
/* 632 */       det ☃ = dkh.a(this.e.aD().k(), this.e.aD().l(), this.e.f());
/* 633 */       x.g().execute(() -> {
/*     */             int i = ☃.a();
/*     */             
/*     */             int j = ☃.b();
/*     */             int k = 0;
/*     */             int m = 0;
/*     */             if (i > j) {
/*     */               k = (i - j) / 2;
/*     */               i = j;
/*     */             } else {
/*     */               m = (j - i) / 2;
/*     */               j = i;
/*     */             } 
/*     */             try (det ☃ = new det(64, 64, false)) {
/*     */               ☃.a(k, m, i, j, det1);
/*     */               det1.a(this.e.H().A());
/* 649 */             } catch (IOException iOException) {
/*     */               d.warn("Couldn't save auto screenshot", iOException);
/*     */             } finally {
/*     */               ☃.close();
/*     */             } 
/*     */           });
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean p() {
/* 659 */     if (!this.q) {
/* 660 */       return false;
/*     */     }
/*     */     
/* 663 */     aqa ☃ = this.e.aa();
/* 664 */     boolean bool = (☃ instanceof bfw && !this.e.k.aI);
/* 665 */     if (bool && !((bfw)☃).bC.e) {
/*     */       
/* 667 */       bmb bmb1 = ((aqm)☃).dD();
/* 668 */       dcl dcl = this.e.v;
/* 669 */       if (dcl != null && dcl.c() == dcl.a.b) {
/* 670 */         fx fx = ((dcj)dcl).a();
/* 671 */         ceh ceh = this.e.r.d_(fx);
/* 672 */         if (this.e.q.l() == bru.e) {
/* 673 */           bool = (ceh.b(this.e.r, fx) != null);
/*     */         } else {
/* 675 */           cel cel = new cel(this.e.r, fx, false);
/* 676 */           bool = (!bmb1.a() && (bmb1.a(this.e.r.p(), cel) || bmb1.b(this.e.r.p(), cel)));
/*     */         } 
/*     */       } 
/*     */     } 
/* 680 */     return bool;
/*     */   }
/*     */   
/*     */   public void a(float ☃, long l, dfm dfm1) {
/* 684 */     this.t.a(☃);
/* 685 */     if (this.e.aa() == null) {
/* 686 */       this.e.a(this.e.s);
/*     */     }
/*     */     
/* 689 */     a(☃);
/*     */     
/* 691 */     this.e.au().a("center");
/* 692 */     boolean bool = p();
/*     */     
/* 694 */     this.e.au().b("camera");
/* 695 */     djk djk1 = this.H;
/* 696 */     this.h = (this.e.k.b * 16);
/* 697 */     dfm dfm2 = new dfm();
/*     */     
/* 699 */     dfm2.c().a().a(a(djk1, ☃, true));
/*     */     
/* 701 */     a(dfm2, ☃);
/* 702 */     if (this.e.k.aa) {
/* 703 */       b(dfm2, ☃);
/*     */     }
/* 705 */     float f = afm.g(☃, this.e.s.bQ, this.e.s.bP) * this.e.k.aP * this.e.k.aP;
/* 706 */     if (f > 0.0F) {
/* 707 */       int i = this.e.s.a(apw.i) ? 7 : 20;
/*     */       
/* 709 */       float f1 = 5.0F / (f * f + 5.0F) - f * 0.04F;
/* 710 */       f1 *= f1;
/*     */       
/* 712 */       g g = new g(0.0F, afm.a / 2.0F, afm.a / 2.0F);
/* 713 */       dfm2.a(g.a((this.k + ☃) * i));
/* 714 */       dfm2.a(1.0F / f1, 1.0F, 1.0F);
/* 715 */       float f2 = -(this.k + ☃) * i;
/* 716 */       dfm2.a(g.a(f2));
/*     */     } 
/*     */     
/* 719 */     b b = dfm2.c().a();
/* 720 */     a(b);
/*     */     
/* 722 */     djk1.a(this.e.r, (this.e.aa() == null) ? this.e.s : this.e.aa(), !this.e.k.g().a(), this.e.k.g().b(), ☃);
/*     */     
/* 724 */     dfm1.a(g.b.a(djk1.d()));
/* 725 */     dfm1.a(g.d.a(djk1.e() + 180.0F));
/*     */     
/* 727 */     this.e.e.a(dfm1, ☃, l, bool, djk1, this, this.t, b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 750 */     this.e.au().b("hand");
/* 751 */     if (this.p) {
/* 752 */       RenderSystem.clear(256, djz.a);
/* 753 */       a(dfm1, djk1, ☃);
/*     */     } 
/* 755 */     this.e.au().c();
/*     */   }
/*     */   
/*     */   public void g() {
/* 759 */     this.z = null;
/* 760 */     this.i.a();
/* 761 */     this.H.o();
/*     */   }
/*     */   
/*     */   public dkx h() {
/* 765 */     return this.i;
/*     */   }
/*     */   
/*     */   public void a(bmb ☃) {
/* 769 */     this.z = ☃;
/* 770 */     this.A = 40;
/* 771 */     this.B = this.g.nextFloat() * 2.0F - 1.0F;
/* 772 */     this.C = this.g.nextFloat() * 2.0F - 1.0F;
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, float f) {
/* 776 */     if (this.z == null || this.A <= 0) {
/*     */       return;
/*     */     }
/*     */     
/* 780 */     int j = 40 - this.A;
/* 781 */     float f1 = (j + f) / 40.0F;
/* 782 */     float f2 = f1 * f1;
/* 783 */     float f3 = f1 * f2;
/* 784 */     float f4 = 10.25F * f3 * f2 - 24.95F * f2 * f2 + 25.5F * f3 - 13.8F * f2 + 4.0F * f1;
/* 785 */     float f5 = f4 * 3.1415927F;
/*     */     
/* 787 */     float f6 = this.B * (☃ / 4);
/* 788 */     float f7 = this.C * (i / 4);
/*     */     
/* 790 */     RenderSystem.enableAlphaTest();
/* 791 */     RenderSystem.pushMatrix();
/* 792 */     RenderSystem.pushLightingAttributes();
/* 793 */     RenderSystem.enableDepthTest();
/* 794 */     RenderSystem.disableCull();
/* 795 */     dfm dfm = new dfm();
/* 796 */     dfm.a();
/* 797 */     dfm.a(((☃ / 2) + f6 * afm.e(afm.a(f5 * 2.0F))), ((i / 2) + f7 * afm.e(afm.a(f5 * 2.0F))), -50.0D);
/* 798 */     float f8 = 50.0F + 175.0F * afm.a(f5);
/* 799 */     dfm.a(f8, -f8, f8);
/* 800 */     dfm.a(g.d.a(900.0F * afm.e(afm.a(f5))));
/* 801 */     dfm.a(g.b.a(6.0F * afm.b(f1 * 8.0F)));
/* 802 */     dfm.a(g.f.a(6.0F * afm.b(f1 * 8.0F)));
/* 803 */     eag.a a = this.j.b();
/* 804 */     this.e.ad().a(this.z, ebm.b.i, 15728880, ejw.a, dfm, a);
/* 805 */     dfm.b();
/* 806 */     a.a();
/* 807 */     RenderSystem.popAttributes();
/* 808 */     RenderSystem.popMatrix();
/* 809 */     RenderSystem.enableCull();
/* 810 */     RenderSystem.disableDepthTest();
/*     */   }
/*     */   
/*     */   private void c(float ☃) {
/* 814 */     int i = this.e.aD().o();
/* 815 */     int j = this.e.aD().p();
/*     */     
/* 817 */     double d1 = afm.d(☃, 2.0D, 1.0D);
/* 818 */     float f1 = 0.2F * ☃;
/* 819 */     float f2 = 0.4F * ☃;
/* 820 */     float f3 = 0.2F * ☃;
/* 821 */     double d2 = i * d1;
/* 822 */     double d3 = j * d1;
/* 823 */     double d4 = (i - d2) / 2.0D;
/* 824 */     double d5 = (j - d3) / 2.0D;
/*     */     
/* 826 */     RenderSystem.disableDepthTest();
/* 827 */     RenderSystem.depthMask(false);
/* 828 */     RenderSystem.enableBlend();
/* 829 */     RenderSystem.blendFuncSeparate(dem.r.e, dem.j.e, dem.r.e, dem.j.e);
/* 830 */     RenderSystem.color4f(f1, f2, f3, 1.0F);
/*     */     
/* 832 */     this.e.M().a(c);
/* 833 */     dfo dfo = dfo.a();
/* 834 */     dfh dfh = dfo.c();
/* 835 */     dfh.a(7, dfk.n);
/* 836 */     dfh.a(d4, d5 + d3, -90.0D).a(0.0F, 1.0F).d();
/* 837 */     dfh.a(d4 + d2, d5 + d3, -90.0D).a(1.0F, 1.0F).d();
/* 838 */     dfh.a(d4 + d2, d5, -90.0D).a(1.0F, 0.0F).d();
/* 839 */     dfh.a(d4, d5, -90.0D).a(0.0F, 0.0F).d();
/* 840 */     dfo.b();
/*     */     
/* 842 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 843 */     RenderSystem.defaultBlendFunc();
/* 844 */     RenderSystem.disableBlend();
/* 845 */     RenderSystem.depthMask(true);
/* 846 */     RenderSystem.enableDepthTest();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float b(float ☃) {
/* 854 */     return afm.g(☃, this.o, this.n);
/*     */   }
/*     */   
/*     */   public float j() {
/* 858 */     return this.h;
/*     */   }
/*     */   
/*     */   public djk k() {
/* 862 */     return this.H;
/*     */   }
/*     */   
/*     */   public eaf l() {
/* 866 */     return this.t;
/*     */   }
/*     */   
/*     */   public ejw m() {
/* 870 */     return this.u;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */