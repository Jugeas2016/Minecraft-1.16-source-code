/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class efo
/*     */   implements aci
/*     */ {
/*  60 */   public static final vk a = new vk("textures/misc/enchanted_item_glint.png");
/*     */   
/*  62 */   private static final Set<blx> c = Sets.newHashSet((Object[])new blx[] { bmd.a });
/*     */ 
/*     */ 
/*     */   
/*     */   public float b;
/*     */ 
/*     */ 
/*     */   
/*     */   private final ead d;
/*     */ 
/*     */   
/*     */   private final ekd e;
/*     */ 
/*     */   
/*     */   private final dks f;
/*     */ 
/*     */ 
/*     */   
/*     */   public efo(ekd ☃, elt elt1, dks dks1) {
/*  81 */     this.e = ☃;
/*  82 */     this.d = new ead(elt1);
/*     */     
/*  84 */     for (blx blx : gm.T) {
/*  85 */       if (!c.contains(blx)) {
/*  86 */         this.d.a(blx, new elu(gm.T.b(blx), "inventory"));
/*     */       }
/*     */     } 
/*  89 */     this.f = dks1;
/*     */   }
/*     */   
/*     */   public ead a() {
/*  93 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(elo ☃, bmb bmb1, int i, int j, dfm dfm1, dfq dfq1) {
/*  98 */     Random random = new Random();
/*  99 */     long l = 42L;
/* 100 */     for (gc gc : gc.values()) {
/* 101 */       random.setSeed(42L);
/* 102 */       a(dfm1, dfq1, ☃.a(null, gc, random), bmb1, i, j);
/*     */     } 
/* 104 */     random.setSeed(42L);
/* 105 */     a(dfm1, dfq1, ☃.a(null, null, random), bmb1, i, j);
/*     */   }
/*     */   
/*     */   public void a(bmb ☃, ebm.b b1, boolean bool, dfm dfm1, eag eag1, int i, int j, elo elo1) {
/* 109 */     if (☃.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 113 */     dfm1.a();
/*     */     
/* 115 */     boolean bool1 = (b1 == ebm.b.g || b1 == ebm.b.h || b1 == ebm.b.i);
/*     */     
/* 117 */     if (☃.b() == bmd.qM && bool1) {
/* 118 */       elo1 = this.d.a().a(new elu("minecraft:trident#inventory"));
/*     */     }
/* 120 */     elo1.f().a(b1).a(bool, dfm1);
/*     */     
/* 122 */     dfm1.a(-0.5D, -0.5D, -0.5D);
/* 123 */     if (elo1.d() || (☃.b() == bmd.qM && !bool1)) {
/* 124 */       dzs.a.a(☃, b1, dfm1, eag1, i, j);
/*     */     } else {
/*     */       boolean bool2;
/*     */       
/*     */       dfq dfq;
/* 129 */       if (b1 != ebm.b.g && !b1.a() && ☃.b() instanceof bkh) {
/* 130 */         buo buo = ((bkh)☃.b()).e();
/* 131 */         bool2 = (!(buo instanceof bxi) && !(buo instanceof caj));
/*     */       } else {
/* 133 */         bool2 = true;
/*     */       } 
/*     */       
/* 136 */       eao eao = eab.a(☃, bool2);
/*     */ 
/*     */       
/* 139 */       if (☃.b() == bmd.mh && ☃.u()) {
/*     */         
/* 141 */         dfm1.a();
/* 142 */         dfm.a a = dfm1.c();
/* 143 */         if (b1 == ebm.b.g) {
/* 144 */           a.a().a(0.5F);
/* 145 */         } else if (b1.a()) {
/* 146 */           a.a().a(0.75F);
/*     */         } 
/* 148 */         if (bool2) {
/* 149 */           dfq = b(eag1, eao, a);
/*     */         } else {
/* 151 */           dfq = a(eag1, eao, a);
/*     */         } 
/* 153 */         dfm1.b();
/*     */       }
/* 155 */       else if (bool2) {
/* 156 */         dfq = c(eag1, eao, true, ☃.u());
/*     */       } else {
/* 158 */         dfq = b(eag1, eao, true, ☃.u());
/*     */       } 
/*     */ 
/*     */       
/* 162 */       a(elo1, ☃, i, j, dfm1, dfq);
/*     */     } 
/* 164 */     dfm1.b();
/*     */   }
/*     */   
/*     */   public static dfq a(eag ☃, eao eao1, boolean bool1, boolean bool2) {
/* 168 */     if (bool2) {
/* 169 */       return dft.a(☃
/* 170 */           .getBuffer(bool1 ? eao.k() : eao.l()), ☃
/* 171 */           .getBuffer(eao1));
/*     */     }
/*     */     
/* 174 */     return ☃.getBuffer(eao1);
/*     */   }
/*     */   
/*     */   public static dfq a(eag ☃, eao eao1, dfm.a a1) {
/* 178 */     return dft.a(new dfn(☃
/* 179 */           .getBuffer(eao.n()), a1.a(), a1.b()), ☃
/* 180 */         .getBuffer(eao1));
/*     */   }
/*     */ 
/*     */   
/*     */   public static dfq b(eag ☃, eao eao1, dfm.a a1) {
/* 185 */     return dft.a(new dfn(☃
/* 186 */           .getBuffer(eao.o()), a1.a(), a1.b()), ☃
/* 187 */         .getBuffer(eao1));
/*     */   }
/*     */ 
/*     */   
/*     */   public static dfq b(eag ☃, eao eao1, boolean bool1, boolean bool2) {
/* 192 */     if (bool2) {
/* 193 */       if (djz.A() && eao1 == ear.i()) {
/* 194 */         return dft.a(☃
/* 195 */             .getBuffer(eao.m()), ☃
/* 196 */             .getBuffer(eao1));
/*     */       }
/*     */ 
/*     */       
/* 200 */       return dft.a(☃
/* 201 */           .getBuffer(bool1 ? eao.n() : eao.p()), ☃
/* 202 */           .getBuffer(eao1));
/*     */     } 
/*     */     
/* 205 */     return ☃.getBuffer(eao1);
/*     */   }
/*     */   
/*     */   public static dfq c(eag ☃, eao eao1, boolean bool1, boolean bool2) {
/* 209 */     if (bool2) {
/* 210 */       return dft.a(☃
/* 211 */           .getBuffer(bool1 ? eao.o() : eao.q()), ☃
/* 212 */           .getBuffer(eao1));
/*     */     }
/*     */     
/* 215 */     return ☃.getBuffer(eao1);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, dfq dfq1, List<eba> list, bmb bmb1, int i, int j) {
/* 219 */     boolean bool = !bmb1.a();
/*     */     
/* 221 */     dfm.a a = ☃.c();
/*     */     
/* 223 */     for (eba eba : list) {
/* 224 */       int k = -1;
/* 225 */       if (bool && eba.c()) {
/* 226 */         k = this.f.a(bmb1, eba.d());
/*     */       }
/*     */       
/* 229 */       float f1 = (k >> 16 & 0xFF) / 255.0F;
/* 230 */       float f2 = (k >> 8 & 0xFF) / 255.0F;
/* 231 */       float f3 = (k & 0xFF) / 255.0F;
/* 232 */       dfq1.a(a, eba, f1, f2, f3, i, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public elo a(bmb ☃, @Nullable brx brx1, @Nullable aqm aqm1) {
/*     */     elo elo1;
/* 239 */     blx blx = ☃.b();
/* 240 */     if (blx == bmd.qM) {
/* 241 */       elo1 = this.d.a().a(new elu("minecraft:trident_in_hand#inventory"));
/*     */     } else {
/* 243 */       elo1 = this.d.b(☃);
/*     */     } 
/*     */ 
/*     */     
/* 247 */     dwt dwt = (brx1 instanceof dwt) ? (dwt)brx1 : null;
/*     */     
/* 249 */     elo elo2 = elo1.g().a(elo1, ☃, dwt, aqm1);
/* 250 */     return (elo2 == null) ? this.d.a().a() : elo2;
/*     */   }
/*     */   
/*     */   public void a(bmb ☃, ebm.b b1, int i, int j, dfm dfm1, eag eag1) {
/* 254 */     a((aqm)null, ☃, b1, false, dfm1, eag1, (brx)null, i, j);
/*     */   }
/*     */   
/*     */   public void a(@Nullable aqm ☃, bmb bmb1, ebm.b b1, boolean bool, dfm dfm1, eag eag1, @Nullable brx brx1, int i, int j) {
/* 258 */     if (bmb1.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 262 */     elo elo = a(bmb1, brx1, ☃);
/*     */     
/* 264 */     a(bmb1, b1, bool, dfm1, eag1, i, j, elo);
/*     */   }
/*     */   
/*     */   public void a(bmb ☃, int i, int j) {
/* 268 */     a(☃, i, j, a(☃, (brx)null, (aqm)null));
/*     */   }
/*     */   
/*     */   protected void a(bmb ☃, int i, int j, elo elo1) {
/* 272 */     RenderSystem.pushMatrix();
/* 273 */     this.e.a(ekb.d);
/* 274 */     this.e.b(ekb.d).a(false, false);
/*     */     
/* 276 */     RenderSystem.enableRescaleNormal();
/* 277 */     RenderSystem.enableAlphaTest();
/* 278 */     RenderSystem.defaultAlphaFunc();
/* 279 */     RenderSystem.enableBlend();
/* 280 */     RenderSystem.blendFunc(dem.r.l, dem.j.j);
/*     */     
/* 282 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */ 
/*     */     
/* 285 */     RenderSystem.translatef(i, j, 100.0F + this.b);
/* 286 */     RenderSystem.translatef(8.0F, 8.0F, 0.0F);
/*     */ 
/*     */     
/* 289 */     RenderSystem.scalef(1.0F, -1.0F, 1.0F);
/* 290 */     RenderSystem.scalef(16.0F, 16.0F, 16.0F);
/*     */     
/* 292 */     dfm dfm = new dfm();
/* 293 */     eag.a a = djz.C().aE().b();
/*     */     
/* 295 */     boolean bool = !elo1.c();
/* 296 */     if (bool) {
/* 297 */       dep.c();
/*     */     }
/*     */     
/* 300 */     a(☃, ebm.b.g, false, dfm, a, 15728880, ejw.a, elo1);
/* 301 */     a.a();
/* 302 */     RenderSystem.enableDepthTest();
/*     */     
/* 304 */     if (bool) {
/* 305 */       dep.d();
/*     */     }
/*     */     
/* 308 */     RenderSystem.disableAlphaTest();
/* 309 */     RenderSystem.disableRescaleNormal();
/* 310 */     RenderSystem.popMatrix();
/*     */   }
/*     */   
/*     */   public void b(bmb ☃, int i, int j) {
/* 314 */     b((djz.C()).s, ☃, i, j);
/*     */   }
/*     */   
/*     */   public void c(bmb ☃, int i, int j) {
/* 318 */     b((aqm)null, ☃, i, j);
/*     */   }
/*     */   
/*     */   public void a(aqm ☃, bmb bmb1, int i, int j) {
/* 322 */     b(☃, bmb1, i, j);
/*     */   }
/*     */   
/*     */   private void b(@Nullable aqm ☃, bmb bmb1, int i, int j) {
/* 326 */     if (bmb1.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 330 */     this.b += 50.0F;
/*     */     try {
/* 332 */       a(bmb1, i, j, a(bmb1, (brx)null, ☃));
/* 333 */     } catch (Throwable throwable) {
/* 334 */       l l = l.a(throwable, "Rendering item");
/* 335 */       m m = l.a("Item being rendered");
/*     */       
/* 337 */       m.a("Item Type", () -> String.valueOf(☃.b()));
/* 338 */       m.a("Item Damage", () -> String.valueOf(☃.g()));
/* 339 */       m.a("Item NBT", () -> String.valueOf(☃.o()));
/* 340 */       m.a("Item Foil", () -> String.valueOf(☃.u()));
/*     */       
/* 342 */       throw new u(l);
/*     */     } 
/*     */     
/* 345 */     this.b -= 50.0F;
/*     */   }
/*     */   
/*     */   public void a(dku ☃, bmb bmb1, int i, int j) {
/* 349 */     a(☃, bmb1, i, j, null);
/*     */   }
/*     */   
/*     */   public void a(dku ☃, bmb bmb1, int i, int j, @Nullable String str) {
/* 353 */     if (bmb1.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 357 */     dfm dfm = new dfm();
/*     */     
/* 359 */     if (bmb1.E() != 1 || str != null) {
/* 360 */       String str1 = (str == null) ? String.valueOf(bmb1.E()) : str;
/*     */       
/* 362 */       dfm.a(0.0D, 0.0D, (this.b + 200.0F));
/*     */       
/* 364 */       eag.a a = eag.a(dfo.a().c());
/* 365 */       ☃.a(str1, (i + 19 - 2 - ☃.b(str1)), (j + 6 + 3), 16777215, true, dfm.c().a(), a, false, 0, 15728880);
/* 366 */       a.a();
/*     */     } 
/*     */     
/* 369 */     if (bmb1.f()) {
/* 370 */       RenderSystem.disableDepthTest();
/* 371 */       RenderSystem.disableTexture();
/* 372 */       RenderSystem.disableAlphaTest();
/* 373 */       RenderSystem.disableBlend();
/*     */       
/* 375 */       dfo dfo = dfo.a();
/* 376 */       dfh dfh = dfo.c();
/*     */       
/* 378 */       float f1 = bmb1.g();
/* 379 */       float f2 = bmb1.h();
/* 380 */       float f3 = Math.max(0.0F, (f2 - f1) / f2);
/* 381 */       int k = Math.round(13.0F - f1 * 13.0F / f2);
/*     */ 
/*     */       
/* 384 */       int m = afm.f(f3 / 3.0F, 1.0F, 1.0F);
/*     */       
/* 386 */       a(dfh, i + 2, j + 13, 13, 2, 0, 0, 0, 255);
/* 387 */       a(dfh, i + 2, j + 13, k, 1, m >> 16 & 0xFF, m >> 8 & 0xFF, m & 0xFF, 255);
/*     */       
/* 389 */       RenderSystem.enableBlend();
/* 390 */       RenderSystem.enableAlphaTest();
/* 391 */       RenderSystem.enableTexture();
/* 392 */       RenderSystem.enableDepthTest();
/*     */     } 
/*     */     
/* 395 */     dzm dzm = (djz.C()).s;
/* 396 */     float f = (dzm == null) ? 0.0F : dzm.eT().a(bmb1.b(), djz.C().aj());
/*     */     
/* 398 */     if (f > 0.0F) {
/* 399 */       RenderSystem.disableDepthTest();
/* 400 */       RenderSystem.disableTexture();
/* 401 */       RenderSystem.enableBlend();
/* 402 */       RenderSystem.defaultBlendFunc();
/*     */       
/* 404 */       dfo dfo = dfo.a();
/* 405 */       dfh dfh = dfo.c();
/*     */       
/* 407 */       a(dfh, i, j + afm.d(16.0F * (1.0F - f)), 16, afm.f(16.0F * f), 255, 255, 255, 127);
/*     */       
/* 409 */       RenderSystem.enableTexture();
/* 410 */       RenderSystem.enableDepthTest();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfh ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3) {
/* 415 */     ☃.a(7, dfk.l);
/* 416 */     ☃.a((i + 0), (j + 0), 0.0D).a(n, i1, i2, i3).d();
/* 417 */     ☃.a((i + 0), (j + m), 0.0D).a(n, i1, i2, i3).d();
/* 418 */     ☃.a((i + k), (j + m), 0.0D).a(n, i1, i2, i3).d();
/* 419 */     ☃.a((i + k), (j + 0), 0.0D).a(n, i1, i2, i3).d();
/* 420 */     dfo.a().b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ach ☃) {
/* 425 */     this.d.b();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */