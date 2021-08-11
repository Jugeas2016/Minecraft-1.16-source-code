/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalDouble;
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
/*     */ public abstract class ean
/*     */ {
/*     */   protected final String a;
/*     */   private final Runnable V;
/*     */   private final Runnable W;
/*     */   
/*     */   public ean(String ☃, Runnable runnable1, Runnable runnable2) {
/*  26 */     this.a = ☃;
/*  27 */     this.V = runnable1;
/*  28 */     this.W = runnable2;
/*     */   }
/*     */   
/*     */   public void a() {
/*  32 */     this.V.run();
/*     */   }
/*     */   
/*     */   public void b() {
/*  36 */     this.W.run();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object ☃) {
/*  41 */     if (this == ☃) {
/*  42 */       return true;
/*     */     }
/*  44 */     if (☃ == null || getClass() != ☃.getClass()) {
/*  45 */       return false;
/*     */     }
/*  47 */     ean ean1 = (ean)☃;
/*  48 */     return this.a.equals(ean1.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  53 */     return this.a.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  58 */     return this.a;
/*     */   }
/*     */   
/*     */   public static class q extends ean {
/*     */     public q(String ☃, Runnable runnable1, Runnable runnable2) {
/*  63 */       super(☃, runnable1, runnable2);
/*     */     }
/*     */   }
/*     */   
/*  67 */   protected static final q b = new q("no_transparency", () -> RenderSystem.disableBlend(), () -> {
/*     */       
/*     */       });
/*     */ 
/*     */   
/*  72 */   protected static final q c = new q("additive_transparency", () -> {
/*     */         RenderSystem.enableBlend();
/*     */         RenderSystem.blendFunc(dem.r.e, dem.j.e);
/*     */       }() -> {
/*     */         RenderSystem.disableBlend();
/*     */         RenderSystem.defaultBlendFunc();
/*     */       });
/*     */   
/*  80 */   protected static final q d = new q("lightning_transparency", () -> {
/*     */         RenderSystem.enableBlend();
/*     */         RenderSystem.blendFunc(dem.r.l, dem.j.e);
/*     */       }() -> {
/*     */         RenderSystem.disableBlend();
/*     */         RenderSystem.defaultBlendFunc();
/*     */       });
/*     */   
/*  88 */   protected static final q e = new q("glint_transparency", () -> {
/*     */         RenderSystem.enableBlend();
/*     */         RenderSystem.blendFuncSeparate(dem.r.n, dem.j.e, dem.r.o, dem.j.e);
/*     */       }() -> {
/*     */         RenderSystem.disableBlend();
/*     */         RenderSystem.defaultBlendFunc();
/*     */       });
/*     */   
/*  96 */   protected static final q f = new q("crumbling_transparency", () -> {
/*     */         RenderSystem.enableBlend();
/*     */         RenderSystem.blendFuncSeparate(dem.r.d, dem.j.m, dem.r.e, dem.j.n);
/*     */       }() -> {
/*     */         RenderSystem.disableBlend();
/*     */         RenderSystem.defaultBlendFunc();
/*     */       });
/*     */   
/* 104 */   protected static final q g = new q("translucent_transparency", () -> {
/*     */         RenderSystem.enableBlend();
/*     */         RenderSystem.blendFuncSeparate(dem.r.l, dem.j.j, dem.r.e, dem.j.j);
/*     */       }() -> {
/*     */         RenderSystem.disableBlend();
/*     */         RenderSystem.defaultBlendFunc();
/*     */       });
/*     */   
/*     */   public static class a extends ean {
/*     */     private final float V;
/*     */     
/*     */     public a(float ☃) {
/* 116 */       super("alpha", () -> {
/*     */             if (☃ > 0.0F) {
/*     */               RenderSystem.enableAlphaTest();
/*     */               RenderSystem.alphaFunc(516, ☃);
/*     */             } else {
/*     */               RenderSystem.disableAlphaTest();
/*     */             } 
/*     */           }() -> {
/*     */             RenderSystem.disableAlphaTest();
/*     */             RenderSystem.defaultAlphaFunc();
/*     */           });
/* 127 */       this.V = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(@Nullable Object ☃) {
/* 132 */       if (this == ☃) {
/* 133 */         return true;
/*     */       }
/* 135 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 136 */         return false;
/*     */       }
/* 138 */       if (!super.equals(☃)) {
/* 139 */         return false;
/*     */       }
/* 141 */       return (this.V == ((a)☃).V);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 146 */       return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.V) });
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 151 */       return this.a + '[' + this.V + ']';
/*     */     }
/*     */   }
/*     */   
/* 155 */   protected static final a h = new a(0.0F);
/* 156 */   protected static final a i = new a(0.003921569F);
/* 157 */   protected static final a j = new a(0.5F);
/*     */   
/*     */   public static class n extends ean {
/*     */     private final boolean V;
/*     */     
/*     */     public n(boolean ☃) {
/* 163 */       super("shade_model", () -> RenderSystem.shadeModel(☃ ? 7425 : 7424), () -> RenderSystem.shadeModel(7424));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 168 */       this.V = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 173 */       if (this == ☃) {
/* 174 */         return true;
/*     */       }
/* 176 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 177 */         return false;
/*     */       }
/* 179 */       n n1 = (n)☃;
/* 180 */       return (this.V == n1.V);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 185 */       return Boolean.hashCode(this.V);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 190 */       return this.a + '[' + (this.V ? "smooth" : "flat") + ']';
/*     */     }
/*     */   }
/*     */   
/* 194 */   protected static final n k = new n(false);
/* 195 */   protected static final n l = new n(true);
/*     */   
/*     */   public static class o extends ean {
/*     */     private final Optional<vk> V;
/*     */     private final boolean W;
/*     */     private final boolean X;
/*     */     
/*     */     public o(vk ☃, boolean bool1, boolean bool2) {
/* 203 */       super("texture", () -> {
/*     */             RenderSystem.enableTexture(); ekd ekd = djz.C().M();
/*     */             ekd.a(☃);
/*     */             ekd.b(☃).a(bool1, bool2);
/*     */           }() -> {
/*     */           
/*     */           });
/* 210 */       this.V = Optional.of(☃);
/* 211 */       this.W = bool1;
/* 212 */       this.X = bool2;
/*     */     }
/*     */     
/*     */     public o() {
/* 216 */       super("texture", () -> RenderSystem.disableTexture(), () -> RenderSystem.enableTexture());
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 221 */       this.V = Optional.empty();
/* 222 */       this.W = false;
/* 223 */       this.X = false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 228 */       if (this == ☃) {
/* 229 */         return true;
/*     */       }
/* 231 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 232 */         return false;
/*     */       }
/* 234 */       o o1 = (o)☃;
/* 235 */       return (this.V.equals(o1.V) && this.W == o1.W && this.X == o1.X);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 240 */       return this.V.hashCode();
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 245 */       return this.a + '[' + this.V + "(blur=" + this.W + ", mipmap=" + this.X + ")]";
/*     */     }
/*     */     
/*     */     protected Optional<vk> c() {
/* 249 */       return this.V;
/*     */     }
/*     */   }
/*     */   
/* 253 */   protected static final o m = new o(ekb.d, false, true);
/* 254 */   protected static final o n = new o(ekb.d, false, false);
/* 255 */   protected static final o o = new o();
/*     */   
/*     */   public static class p extends ean {
/*     */     public p(String ☃, Runnable runnable1, Runnable runnable2) {
/* 259 */       super(☃, runnable1, runnable2);
/*     */     }
/*     */   }
/*     */   
/* 263 */   protected static final p p = new p("default_texturing", () -> {
/*     */       
/*     */       }() -> {
/*     */       
/*     */       });
/*     */   public static final class j extends p { private final float V;
/*     */     private final float W;
/*     */     
/*     */     public j(float ☃, float f1) {
/* 272 */       super("offset_texturing", () -> {
/*     */             RenderSystem.matrixMode(5890);
/*     */             
/*     */             RenderSystem.pushMatrix();
/*     */             RenderSystem.loadIdentity();
/*     */             RenderSystem.translatef(☃, f1, 0.0F);
/*     */             RenderSystem.matrixMode(5888);
/*     */           }() -> {
/*     */             RenderSystem.matrixMode(5890);
/*     */             RenderSystem.popMatrix();
/*     */             RenderSystem.matrixMode(5888);
/*     */           });
/* 284 */       this.V = ☃;
/* 285 */       this.W = f1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 290 */       if (this == ☃) {
/* 291 */         return true;
/*     */       }
/* 293 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 294 */         return false;
/*     */       }
/* 296 */       j j1 = (j)☃;
/* 297 */       return (Float.compare(j1.V, this.V) == 0 && 
/* 298 */         Float.compare(j1.W, this.W) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 303 */       return Objects.hash(new Object[] { Float.valueOf(this.V), Float.valueOf(this.W) });
/*     */     } }
/*     */ 
/*     */   
/* 307 */   protected static final p q = new p("outline_texturing", () -> RenderSystem.setupOutline(), () -> RenderSystem.teardownOutline());
/*     */ 
/*     */   
/*     */   public static final class m
/*     */     extends p
/*     */   {
/*     */     private final int V;
/*     */ 
/*     */     
/*     */     public m(int ☃) {
/* 317 */       super("portal_texturing", () -> {
/*     */             RenderSystem.matrixMode(5890);
/*     */             
/*     */             RenderSystem.pushMatrix();
/*     */             
/*     */             RenderSystem.loadIdentity();
/*     */             
/*     */             RenderSystem.translatef(0.5F, 0.5F, 0.0F);
/*     */             
/*     */             RenderSystem.scalef(0.5F, 0.5F, 1.0F);
/*     */             
/*     */             RenderSystem.translatef(17.0F / ☃, (2.0F + ☃ / 1.5F) * (float)(x.b() % 800000L) / 800000.0F, 0.0F);
/*     */             
/*     */             RenderSystem.rotatef(((☃ * ☃) * 4321.0F + ☃ * 9.0F) * 2.0F, 0.0F, 0.0F, 1.0F);
/*     */             
/*     */             RenderSystem.scalef(4.5F - ☃ / 4.0F, 4.5F - ☃ / 4.0F, 1.0F);
/*     */             RenderSystem.mulTextureByProjModelView();
/*     */             RenderSystem.matrixMode(5888);
/*     */             RenderSystem.setupEndPortalTexGen();
/*     */           }() -> {
/*     */             RenderSystem.matrixMode(5890);
/*     */             RenderSystem.popMatrix();
/*     */             RenderSystem.matrixMode(5888);
/*     */             RenderSystem.clearTexGen();
/*     */           });
/* 342 */       this.V = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 347 */       if (this == ☃) {
/* 348 */         return true;
/*     */       }
/* 350 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 351 */         return false;
/*     */       }
/* 353 */       m m1 = (m)☃;
/* 354 */       return (this.V == m1.V);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 359 */       return Integer.hashCode(this.V);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(float ☃) {
/* 364 */     RenderSystem.matrixMode(5890);
/* 365 */     RenderSystem.pushMatrix();
/* 366 */     RenderSystem.loadIdentity();
/*     */     
/* 368 */     long l1 = x.b() * 8L;
/* 369 */     float f1 = (float)(l1 % 110000L) / 110000.0F;
/* 370 */     float f2 = (float)(l1 % 30000L) / 30000.0F;
/*     */ 
/*     */     
/* 373 */     RenderSystem.translatef(-f1, f2, 0.0F);
/*     */ 
/*     */     
/* 376 */     RenderSystem.rotatef(10.0F, 0.0F, 0.0F, 1.0F);
/* 377 */     RenderSystem.scalef(☃, ☃, ☃);
/* 378 */     RenderSystem.matrixMode(5888);
/*     */   }
/*     */   
/* 381 */   protected static final p r = new p("glint_texturing", () -> a(8.0F), () -> {
/*     */         RenderSystem.matrixMode(5890);
/*     */         RenderSystem.popMatrix();
/*     */         RenderSystem.matrixMode(5888);
/*     */       });
/*     */ 
/*     */ 
/*     */   
/* 389 */   protected static final p s = new p("entity_glint_texturing", () -> a(0.16F), () -> {
/*     */         RenderSystem.matrixMode(5890);
/*     */         RenderSystem.popMatrix();
/*     */         RenderSystem.matrixMode(5888);
/*     */       });
/*     */   
/*     */   static class b
/*     */     extends ean
/*     */   {
/*     */     private final boolean V;
/*     */     
/*     */     public b(String ☃, Runnable runnable1, Runnable runnable2, boolean bool) {
/* 401 */       super(☃, runnable1, runnable2);
/* 402 */       this.V = bool;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 407 */       if (this == ☃) {
/* 408 */         return true;
/*     */       }
/* 410 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 411 */         return false;
/*     */       }
/* 413 */       b b1 = (b)☃;
/* 414 */       return (this.V == b1.V);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 419 */       return Boolean.hashCode(this.V);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 424 */       return this.a + '[' + this.V + ']';
/*     */     }
/*     */   }
/*     */   
/*     */   public static class h extends b {
/*     */     public h(boolean ☃) {
/* 430 */       super("lightmap", () -> { if (☃) (djz.C()).h.l().c();  }() -> { if (☃) (djz.C()).h.l().b();  }☃);
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
/* 442 */   protected static final h t = new h(true);
/* 443 */   protected static final h u = new h(false);
/*     */   
/*     */   public static class l extends b {
/*     */     public l(boolean ☃) {
/* 447 */       super("overlay", () -> { if (☃) (djz.C()).h.m().a();  }() -> { if (☃) (djz.C()).h.m().b();  }☃);
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
/* 459 */   protected static final l v = new l(true);
/* 460 */   protected static final l w = new l(false);
/*     */   
/*     */   public static class e extends b {
/*     */     public e(boolean ☃) {
/* 464 */       super("diffuse_lighting", () -> { if (☃) dep.a();  }() -> { if (☃) dep.b();  }☃);
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
/* 476 */   protected static final e x = new e(true);
/* 477 */   protected static final e y = new e(false);
/*     */   
/*     */   public static class c extends b {
/*     */     public c(boolean ☃) {
/* 481 */       super("cull", () -> { if (!☃) RenderSystem.disableCull();  }() -> { if (!☃) RenderSystem.enableCull();  }☃);
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
/* 493 */   protected static final c z = new c(true);
/* 494 */   protected static final c A = new c(false);
/*     */   
/*     */   public static class d extends ean {
/*     */     private final String V;
/*     */     private final int W;
/*     */     
/*     */     public d(String ☃, int i) {
/* 501 */       super("depth_test", () -> {
/*     */             if (☃ != 519) {
/*     */               RenderSystem.enableDepthTest();
/*     */               RenderSystem.depthFunc(☃);
/*     */             } 
/*     */           }() -> {
/*     */             if (☃ != 519) {
/*     */               RenderSystem.disableDepthTest();
/*     */               RenderSystem.depthFunc(515);
/*     */             } 
/*     */           });
/* 512 */       this.V = ☃;
/* 513 */       this.W = i;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 518 */       if (this == ☃) {
/* 519 */         return true;
/*     */       }
/* 521 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 522 */         return false;
/*     */       }
/* 524 */       d d1 = (d)☃;
/* 525 */       return (this.W == d1.W);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 530 */       return Integer.hashCode(this.W);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 535 */       return this.a + '[' + this.V + ']';
/*     */     }
/*     */   }
/*     */   
/* 539 */   protected static final d B = new d("always", 519);
/* 540 */   protected static final d C = new d("==", 514);
/* 541 */   protected static final d D = new d("<=", 515);
/*     */   
/*     */   public static class r extends ean {
/*     */     private final boolean V;
/*     */     private final boolean W;
/*     */     
/*     */     public r(boolean ☃, boolean bool1) {
/* 548 */       super("write_mask_state", () -> {
/*     */             if (!☃) {
/*     */               RenderSystem.depthMask(☃);
/*     */             }
/*     */             if (!bool1) {
/*     */               RenderSystem.colorMask(bool1, bool1, bool1, bool1);
/*     */             }
/*     */           }() -> {
/*     */             if (!☃) {
/*     */               RenderSystem.depthMask(true);
/*     */             }
/*     */             if (!bool1) {
/*     */               RenderSystem.colorMask(true, true, true, true);
/*     */             }
/*     */           });
/* 563 */       this.V = ☃;
/* 564 */       this.W = bool1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 569 */       if (this == ☃) {
/* 570 */         return true;
/*     */       }
/* 572 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 573 */         return false;
/*     */       }
/* 575 */       r r1 = (r)☃;
/* 576 */       return (this.V == r1.V && this.W == r1.W);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 582 */       return Objects.hash(new Object[] { Boolean.valueOf(this.V), Boolean.valueOf(this.W) });
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 587 */       return this.a + "[writeColor=" + this.V + ", writeDepth=" + this.W + ']';
/*     */     }
/*     */   }
/*     */   
/* 591 */   protected static final r E = new r(true, true);
/* 592 */   protected static final r F = new r(true, false);
/* 593 */   protected static final r G = new r(false, true);
/*     */   
/*     */   public static class g extends ean {
/*     */     public g(String ☃, Runnable runnable1, Runnable runnable2) {
/* 597 */       super(☃, runnable1, runnable2);
/*     */     }
/*     */   }
/*     */   
/* 601 */   protected static final g H = new g("no_layering", () -> {
/*     */       
/*     */       }() -> {
/*     */       
/* 605 */       }); protected static final g I = new g("polygon_offset_layering", () -> {
/*     */         RenderSystem.polygonOffset(-1.0F, -10.0F);
/*     */         RenderSystem.enablePolygonOffset();
/*     */       }() -> {
/*     */         RenderSystem.polygonOffset(0.0F, 0.0F);
/*     */         RenderSystem.disablePolygonOffset();
/*     */       });
/*     */   
/* 613 */   protected static final g J = new g("view_offset_z_layering", () -> { RenderSystem.pushMatrix(); RenderSystem.scalef(0.99975586F, 0.99975586F, 0.99975586F); }RenderSystem::popMatrix);
/*     */ 
/*     */   
/*     */   public static class f
/*     */     extends ean
/*     */   {
/*     */     public f(String ☃, Runnable runnable1, Runnable runnable2) {
/* 620 */       super(☃, runnable1, runnable2);
/*     */     }
/*     */   }
/*     */   
/* 624 */   protected static final f K = new f("no_fog", () -> {
/*     */       
/*     */       }() -> {
/*     */       
/* 628 */       }); protected static final f L = new f("fog", () -> {
/*     */         dzy.b();
/*     */         RenderSystem.enableFog();
/*     */       }() -> RenderSystem.disableFog());
/*     */ 
/*     */ 
/*     */   
/* 635 */   protected static final f M = new f("black_fog", () -> {
/*     */         RenderSystem.fog(2918, 0.0F, 0.0F, 0.0F, 1.0F);
/*     */         RenderSystem.enableFog();
/*     */       }() -> {
/*     */         dzy.b();
/*     */         RenderSystem.disableFog();
/*     */       });
/*     */   
/*     */   public static class k extends ean {
/*     */     public k(String ☃, Runnable runnable1, Runnable runnable2) {
/* 645 */       super(☃, runnable1, runnable2);
/*     */     }
/*     */   }
/*     */   
/* 649 */   protected static final k N = new k("main_target", () -> {
/*     */       
/*     */       }() -> {
/*     */       
/* 653 */       }); protected static final k O = new k("outline_target", () -> (djz.C()).e.p().a(false), () -> djz.C().f().a(false));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 659 */   protected static final k P = new k("translucent_target", () -> {
/*     */         if (djz.A()) {
/*     */           (djz.C()).e.q().a(false);
/*     */         }
/*     */       }() -> {
/*     */         if (djz.A()) {
/*     */           djz.C().f().a(false);
/*     */         }
/*     */       });
/*     */   
/* 669 */   protected static final k Q = new k("particles_target", () -> {
/*     */         if (djz.A()) {
/*     */           (djz.C()).e.s().a(false);
/*     */         }
/*     */       }() -> {
/*     */         if (djz.A()) {
/*     */           djz.C().f().a(false);
/*     */         }
/*     */       });
/*     */   
/* 679 */   protected static final k R = new k("weather_target", () -> {
/*     */         if (djz.A()) {
/*     */           (djz.C()).e.t().a(false);
/*     */         }
/*     */       }() -> {
/*     */         if (djz.A()) {
/*     */           djz.C().f().a(false);
/*     */         }
/*     */       });
/*     */   
/* 689 */   protected static final k S = new k("clouds_target", () -> {
/*     */         if (djz.A()) {
/*     */           (djz.C()).e.u().a(false);
/*     */         }
/*     */       }() -> {
/*     */         if (djz.A()) {
/*     */           djz.C().f().a(false);
/*     */         }
/*     */       });
/*     */   
/* 699 */   protected static final k T = new k("item_entity_target", () -> {
/*     */         if (djz.A())
/*     */           (djz.C()).e.r().a(false); 
/*     */       }() -> {
/*     */         if (djz.A())
/*     */           djz.C().f().a(false); 
/*     */       });
/*     */   
/*     */   public static class i
/*     */     extends ean
/*     */   {
/*     */     private final OptionalDouble V;
/*     */     
/*     */     public i(OptionalDouble ☃) {
/* 713 */       super("line_width", () -> {
/*     */             if (!Objects.equals(☃, OptionalDouble.of(1.0D))) {
/*     */               if (☃.isPresent()) {
/*     */                 RenderSystem.lineWidth((float)☃.getAsDouble());
/*     */               } else {
/*     */                 RenderSystem.lineWidth(Math.max(2.5F, djz.C().aD().k() / 1920.0F * 2.5F));
/*     */               } 
/*     */             }
/*     */           }() -> {
/*     */             if (!Objects.equals(☃, OptionalDouble.of(1.0D))) {
/*     */               RenderSystem.lineWidth(1.0F);
/*     */             }
/*     */           });
/* 726 */       this.V = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(@Nullable Object ☃) {
/* 731 */       if (this == ☃) {
/* 732 */         return true;
/*     */       }
/* 734 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 735 */         return false;
/*     */       }
/* 737 */       if (!super.equals(☃)) {
/* 738 */         return false;
/*     */       }
/* 740 */       return Objects.equals(this.V, ((i)☃).V);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 745 */       return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.V });
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 750 */       return this.a + '[' + (this.V.isPresent() ? (String)Double.valueOf(this.V.getAsDouble()) : "window_scale") + ']';
/*     */     }
/*     */   }
/*     */   
/* 754 */   protected static final i U = new i(OptionalDouble.of(1.0D));
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */