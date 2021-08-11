/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Predicate;
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
/*     */ public class edh
/*     */ {
/*     */   public final edn a;
/*     */   public final a b;
/*     */   public final a c;
/*     */   public final a d;
/*     */   public final a e;
/*     */   public final a f;
/*     */   public final edd g;
/*     */   public final edq h;
/*     */   public final a i;
/*     */   public final a j;
/*     */   public final a k;
/*     */   public final a l;
/*     */   public final edc m;
/*     */   public final edr n;
/*     */   public final edb o;
/*     */   public final edo p;
/*     */   public final edj q;
/*     */   public final edi r;
/*     */   private boolean s;
/*     */   
/*     */   public edh(djz ☃) {
/*  52 */     this.a = new edn();
/*  53 */     this.b = new eds(☃);
/*  54 */     this.c = new ede(☃);
/*  55 */     this.d = new edk(☃);
/*  56 */     this.e = new edg(☃);
/*  57 */     this.f = new edm(☃);
/*  58 */     this.g = new edd();
/*  59 */     this.h = new edq(☃);
/*  60 */     this.i = new edl(☃);
/*  61 */     this.j = new edt();
/*  62 */     this.k = new edp(☃);
/*  63 */     this.l = new edf(☃);
/*  64 */     this.m = new edc(☃);
/*  65 */     this.n = new edr();
/*  66 */     this.o = new edb(☃);
/*  67 */     this.p = new edo(☃);
/*  68 */     this.q = new edj(☃);
/*  69 */     this.r = new edi();
/*     */   }
/*     */   
/*     */   public void a() {
/*  73 */     this.a.a();
/*  74 */     this.b.a();
/*  75 */     this.c.a();
/*  76 */     this.d.a();
/*  77 */     this.e.a();
/*  78 */     this.f.a();
/*  79 */     this.g.a();
/*  80 */     this.h.a();
/*  81 */     this.i.a();
/*  82 */     this.j.a();
/*  83 */     this.k.a();
/*  84 */     this.l.a();
/*  85 */     this.m.a();
/*  86 */     this.n.a();
/*  87 */     this.o.a();
/*  88 */     this.p.a();
/*  89 */     this.q.a();
/*  90 */     this.r.a();
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  94 */     this.s = !this.s;
/*  95 */     return this.s;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag.a a1, double d1, double d2, double d3) {
/* 103 */     if (this.s && !djz.C().am()) {
/* 104 */       this.c.a(☃, a1, d1, d2, d3);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 167 */     this.r.a(☃, a1, d1, d2, d3);
/*     */   }
/*     */   
/*     */   public static Optional<aqa> a(@Nullable aqa ☃, int i) {
/* 171 */     if (☃ == null) {
/* 172 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 177 */     dcn dcn1 = ☃.j(1.0F);
/* 178 */     dcn dcn2 = ☃.f(1.0F).a(i);
/* 179 */     dcn dcn3 = dcn1.e(dcn2);
/*     */     
/* 181 */     dci dci = ☃.cc().b(dcn2).g(1.0D);
/*     */     
/* 183 */     int j = i * i;
/* 184 */     Predicate<aqa> predicate = ☃ -> (!☃.a_() && ☃.aT());
/* 185 */     dck dck = bgn.a(☃, dcn1, dcn3, dci, predicate, j);
/* 186 */     if (dck == null) {
/* 187 */       return Optional.empty();
/*     */     }
/*     */     
/* 190 */     if (dcn1.g(dck.e()) > j)
/*     */     {
/* 192 */       return Optional.empty();
/*     */     }
/*     */     
/* 195 */     return Optional.of(dck.a());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(fx ☃, fx fx1, float f1, float f2, float f3, float f4) {
/* 202 */     djk djk = (djz.C()).h.k();
/* 203 */     if (!djk.h()) {
/*     */       return;
/*     */     }
/*     */     
/* 207 */     dcn dcn = djk.b().e();
/* 208 */     dci dci = (new dci(☃, fx1)).c(dcn);
/* 209 */     a(dci, f1, f2, f3, f4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(fx ☃, float f1, float f2, float f3, float f4, float f5) {
/* 216 */     djk djk = (djz.C()).h.k();
/* 217 */     if (!djk.h()) {
/*     */       return;
/*     */     }
/*     */     
/* 221 */     dcn dcn = djk.b().e();
/* 222 */     dci dci = (new dci(☃)).c(dcn).g(f1);
/* 223 */     a(dci, f2, f3, f4, f5);
/*     */   }
/*     */   
/*     */   public static void a(dci ☃, float f1, float f2, float f3, float f4) {
/* 227 */     a(☃.a, ☃.b, ☃.c, ☃.d, ☃.e, ☃.f, f1, f2, f3, f4);
/*     */   }
/*     */   
/*     */   public static void a(double ☃, double d1, double d2, double d3, double d4, double d5, float f1, float f2, float f3, float f4) {
/* 231 */     dfo dfo = dfo.a();
/* 232 */     dfh dfh = dfo.c();
/* 233 */     dfh.a(5, dfk.l);
/* 234 */     eae.a(dfh, ☃, d1, d2, d3, d4, d5, f1, f2, f3, f4);
/* 235 */     dfo.b();
/*     */   }
/*     */   
/*     */   public static void a(String ☃, int i, int j, int k, int m) {
/* 239 */     a(☃, i + 0.5D, j + 0.5D, k + 0.5D, m);
/*     */   }
/*     */   
/*     */   public static void a(String ☃, double d1, double d2, double d3, int i) {
/* 243 */     a(☃, d1, d2, d3, i, 0.02F);
/*     */   }
/*     */   
/*     */   public static void a(String ☃, double d1, double d2, double d3, int i, float f) {
/* 247 */     a(☃, d1, d2, d3, i, f, true, 0.0F, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(String ☃, double d1, double d2, double d3, int i, float f1, boolean bool1, float f2, boolean bool2) {
/* 257 */     djz djz = djz.C();
/* 258 */     djk djk = djz.h.k();
/*     */     
/* 260 */     if (!djk.h() || (djz.ac()).d == null) {
/*     */       return;
/*     */     }
/*     */     
/* 264 */     dku dku = djz.g;
/* 265 */     double d4 = (djk.b()).b;
/* 266 */     double d5 = (djk.b()).c;
/* 267 */     double d6 = (djk.b()).d;
/*     */     
/* 269 */     RenderSystem.pushMatrix();
/*     */     
/* 271 */     RenderSystem.translatef((float)(d1 - d4), (float)(d2 - d5) + 0.07F, (float)(d3 - d6));
/* 272 */     RenderSystem.normal3f(0.0F, 1.0F, 0.0F);
/*     */     
/* 274 */     RenderSystem.multMatrix(new b(djk.f()));
/* 275 */     RenderSystem.scalef(f1, -f1, f1);
/*     */     
/* 277 */     RenderSystem.enableTexture();
/* 278 */     if (bool2) {
/* 279 */       RenderSystem.disableDepthTest();
/*     */     } else {
/* 281 */       RenderSystem.enableDepthTest();
/*     */     } 
/* 283 */     RenderSystem.depthMask(true);
/*     */     
/* 285 */     RenderSystem.scalef(-1.0F, 1.0F, 1.0F);
/*     */     
/* 287 */     float f = bool1 ? (-dku.b(☃) / 2.0F) : 0.0F;
/* 288 */     f -= f2 / f1;
/* 289 */     RenderSystem.enableAlphaTest();
/*     */     
/* 291 */     eag.a a1 = eag.a(dfo.a().c());
/* 292 */     dku.a(☃, f, 0.0F, i, false, f.a().c(), a1, bool2, 0, 15728880);
/* 293 */     a1.a();
/*     */     
/* 295 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 296 */     RenderSystem.enableDepthTest();
/* 297 */     RenderSystem.popMatrix();
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     void a(dfm param1dfm, eag param1eag, double param1Double1, double param1Double2, double param1Double3);
/*     */     
/*     */     default void a() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */