/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.File;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
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
/*     */ public abstract class dot
/*     */   extends dmg
/*     */   implements dmc, dmf
/*     */ {
/*  50 */   private static final Logger a = LogManager.getLogger();
/*  51 */   private static final Set<String> b = Sets.newHashSet((Object[])new String[] { "http", "https" });
/*     */   
/*     */   protected final nr d;
/*     */   
/*  55 */   protected final List<dmi> e = Lists.newArrayList();
/*     */   @Nullable
/*     */   protected djz i;
/*     */   protected efo j;
/*     */   public int k;
/*     */   public int l;
/*  61 */   protected final List<dlh> m = Lists.newArrayList();
/*     */   public boolean n;
/*     */   protected dku o;
/*     */   private URI c;
/*     */   
/*     */   protected dot(nr ☃) {
/*  67 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public nr w() {
/*  71 */     return this.d;
/*     */   }
/*     */   
/*     */   public String ax_() {
/*  75 */     return w().getString();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  80 */     for (int k = 0; k < this.m.size(); k++) {
/*  81 */       ((dlh)this.m.get(k)).a(☃, i, j, f);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  87 */     if (☃ == 256 && as_()) {
/*  88 */       at_();
/*  89 */       return true;
/*     */     } 
/*  91 */     if (☃ == 258) {
/*  92 */       boolean bool = !y();
/*  93 */       if (!c_(bool)) {
/*  94 */         c_(bool);
/*     */       }
/*  96 */       return false;
/*     */     } 
/*  98 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   public boolean as_() {
/* 102 */     return true;
/*     */   }
/*     */   
/*     */   public void at_() {
/* 106 */     this.i.a((dot)null);
/*     */   }
/*     */   
/*     */   protected <T extends dlh> T a(T ☃) {
/* 110 */     this.m.add((dlh)☃);
/* 111 */     return (T)d((dlh)☃);
/*     */   }
/*     */   
/*     */   protected <T extends dmi> T d(T ☃) {
/* 115 */     this.e.add((dmi)☃);
/* 116 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, bmb bmb1, int i, int j) {
/* 120 */     b(☃, a(bmb1), i, j);
/*     */   }
/*     */   
/*     */   public List<nr> a(bmb ☃) {
/* 124 */     return ☃.a(this.i.s, this.i.k.p ? bnl.a.b : bnl.a.a);
/*     */   }
/*     */   
/*     */   public void b(dfm ☃, nr nr1, int i, int j) {
/* 128 */     c(☃, Arrays.asList(new afa[] { nr1.f() }, ), i, j);
/*     */   }
/*     */   
/*     */   public void b(dfm ☃, List<nr> list, int i, int j) {
/* 132 */     c(☃, Lists.transform(list, nr::f), i, j);
/*     */   }
/*     */   
/*     */   public void c(dfm ☃, List<? extends afa> list, int i, int j) {
/* 136 */     if (list.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 140 */     int k = 0;
/* 141 */     for (afa afa : list) {
/* 142 */       int i8 = this.o.a(afa);
/* 143 */       if (i8 > k) {
/* 144 */         k = i8;
/*     */       }
/*     */     } 
/*     */     
/* 148 */     int m = i + 12;
/* 149 */     int n = j - 12;
/*     */     
/* 151 */     int i1 = k;
/* 152 */     int i2 = 8;
/*     */     
/* 154 */     if (list.size() > 1) {
/* 155 */       i2 += 2 + (list.size() - 1) * 10;
/*     */     }
/*     */ 
/*     */     
/* 159 */     if (m + k > this.k) {
/* 160 */       m -= 28 + k;
/*     */     }
/*     */ 
/*     */     
/* 164 */     if (n + i2 + 6 > this.l) {
/* 165 */       n = this.l - i2 - 6;
/*     */     }
/*     */     
/* 168 */     ☃.a();
/*     */     
/* 170 */     int i3 = -267386864;
/* 171 */     int i4 = 1347420415;
/* 172 */     int i5 = 1344798847;
/*     */     
/* 174 */     int i6 = 400;
/*     */     
/* 176 */     dfo dfo = dfo.a();
/* 177 */     dfh dfh = dfo.c();
/* 178 */     dfh.a(7, dfk.l);
/* 179 */     b b = ☃.c().a();
/*     */     
/* 181 */     a(b, dfh, m - 3, n - 4, m + i1 + 3, n - 3, 400, -267386864, -267386864);
/* 182 */     a(b, dfh, m - 3, n + i2 + 3, m + i1 + 3, n + i2 + 4, 400, -267386864, -267386864);
/* 183 */     a(b, dfh, m - 3, n - 3, m + i1 + 3, n + i2 + 3, 400, -267386864, -267386864);
/* 184 */     a(b, dfh, m - 4, n - 3, m - 3, n + i2 + 3, 400, -267386864, -267386864);
/* 185 */     a(b, dfh, m + i1 + 3, n - 3, m + i1 + 4, n + i2 + 3, 400, -267386864, -267386864);
/* 186 */     a(b, dfh, m - 3, n - 3 + 1, m - 3 + 1, n + i2 + 3 - 1, 400, 1347420415, 1344798847);
/* 187 */     a(b, dfh, m + i1 + 2, n - 3 + 1, m + i1 + 3, n + i2 + 3 - 1, 400, 1347420415, 1344798847);
/* 188 */     a(b, dfh, m - 3, n - 3, m + i1 + 3, n - 3 + 1, 400, 1347420415, 1347420415);
/* 189 */     a(b, dfh, m - 3, n + i2 + 2, m + i1 + 3, n + i2 + 3, 400, 1344798847, 1344798847);
/*     */     
/* 191 */     RenderSystem.enableDepthTest();
/* 192 */     RenderSystem.disableTexture();
/* 193 */     RenderSystem.enableBlend();
/* 194 */     RenderSystem.defaultBlendFunc();
/* 195 */     RenderSystem.shadeModel(7425);
/*     */     
/* 197 */     dfh.c();
/* 198 */     dfi.a(dfh);
/*     */     
/* 200 */     RenderSystem.shadeModel(7424);
/* 201 */     RenderSystem.disableBlend();
/* 202 */     RenderSystem.enableTexture();
/*     */     
/* 204 */     eag.a a = eag.a(dfo.a().c());
/* 205 */     ☃.a(0.0D, 0.0D, 400.0D);
/*     */     
/* 207 */     for (int i7 = 0; i7 < list.size(); i7++) {
/* 208 */       afa afa = list.get(i7);
/*     */       
/* 210 */       if (afa != null) {
/* 211 */         this.o.a(afa, m, n, -1, true, b, a, false, 0, 15728880);
/*     */       }
/*     */       
/* 214 */       if (i7 == 0) {
/* 215 */         n += 2;
/*     */       }
/* 217 */       n += 10;
/*     */     } 
/* 219 */     a.a();
/*     */     
/* 221 */     ☃.b();
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, @Nullable ob ob1, int i, int j) {
/* 225 */     if (ob1 == null || ob1.i() == null) {
/*     */       return;
/*     */     }
/*     */     
/* 229 */     nv nv = ob1.i();
/* 230 */     nv.c c = nv.<nv.c>a(nv.a.b);
/*     */     
/* 232 */     if (c != null) {
/* 233 */       a(☃, c.a(), i, j);
/*     */     } else {
/* 235 */       nv.b b = nv.<nv.b>a(nv.a.c);
/* 236 */       if (b != null) {
/* 237 */         if (this.i.k.p) {
/* 238 */           b(☃, b.b(), i, j);
/*     */         }
/*     */       } else {
/* 241 */         nr nr1 = nv.<nr>a(nv.a.a);
/* 242 */         if (nr1 != null) {
/* 243 */           c(☃, this.i.g.b(nr1, Math.max(this.k / 2, 200)), i, j);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, boolean bool) {}
/*     */   
/*     */   public boolean a(@Nullable ob ☃) {
/* 253 */     if (☃ == null) {
/* 254 */       return false;
/*     */     }
/*     */     
/* 257 */     np np = ☃.h();
/* 258 */     if (y()) {
/* 259 */       if (☃.j() != null) {
/* 260 */         a(☃.j(), false);
/*     */       }
/* 262 */     } else if (np != null) {
/* 263 */       if (np.a() == np.a.a) {
/* 264 */         if (!this.i.k.M) {
/* 265 */           return false;
/*     */         }
/*     */         try {
/* 268 */           URI uRI = new URI(np.b());
/*     */           
/* 270 */           String str = uRI.getScheme();
/* 271 */           if (str == null) {
/* 272 */             throw new URISyntaxException(np.b(), "Missing protocol");
/*     */           }
/* 274 */           if (!b.contains(str.toLowerCase(Locale.ROOT))) {
/* 275 */             throw new URISyntaxException(np.b(), "Unsupported protocol: " + str.toLowerCase(Locale.ROOT));
/*     */           }
/*     */           
/* 278 */           if (this.i.k.N) {
/* 279 */             this.c = uRI;
/* 280 */             this.i.a(new dnr(this::c, np.b(), false));
/*     */           } else {
/* 282 */             a(uRI);
/*     */           } 
/* 284 */         } catch (URISyntaxException uRISyntaxException) {
/* 285 */           a.error("Can't open url for {}", np, uRISyntaxException);
/*     */         } 
/* 287 */       } else if (np.a() == np.a.b) {
/* 288 */         URI uRI = (new File(np.b())).toURI();
/* 289 */         a(uRI);
/* 290 */       } else if (np.a() == np.a.d) {
/* 291 */         a(np.b(), true);
/* 292 */       } else if (np.a() == np.a.c) {
/* 293 */         b(np.b(), false);
/* 294 */       } else if (np.a() == np.a.f) {
/* 295 */         this.i.m.a(np.b());
/*     */       } else {
/* 297 */         a.error("Don't know how to handle {}", np);
/*     */       } 
/*     */       
/* 300 */       return true;
/*     */     } 
/* 302 */     return false;
/*     */   }
/*     */   
/*     */   public void b_(String ☃) {
/* 306 */     b(☃, true);
/*     */   }
/*     */   
/*     */   public void b(String ☃, boolean bool) {
/* 310 */     if (bool) {
/* 311 */       this.i.j.c().a(☃);
/*     */     }
/* 313 */     this.i.s.f(☃);
/*     */   }
/*     */   
/*     */   public void b(djz ☃, int i, int j) {
/* 317 */     this.i = ☃;
/* 318 */     this.j = ☃.ad();
/* 319 */     this.o = ☃.g;
/* 320 */     this.k = i;
/* 321 */     this.l = j;
/* 322 */     this.m.clear();
/* 323 */     this.e.clear();
/* 324 */     a((dmi)null);
/* 325 */     b();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<? extends dmi> au_() {
/* 335 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dfm ☃) {
/* 354 */     a(☃, 0);
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i) {
/* 358 */     if (this.i.r != null) {
/* 359 */       a(☃, 0, 0, this.k, this.l, -1072689136, -804253680);
/*     */     } else {
/* 361 */       e(i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void e(int ☃) {
/* 366 */     dfo dfo = dfo.a();
/* 367 */     dfh dfh = dfo.c();
/* 368 */     this.i.M().a(f);
/* 369 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 370 */     float f = 32.0F;
/* 371 */     dfh.a(7, dfk.p);
/* 372 */     dfh.a(0.0D, this.l, 0.0D).a(0.0F, this.l / 32.0F + ☃).a(64, 64, 64, 255).d();
/* 373 */     dfh.a(this.k, this.l, 0.0D).a(this.k / 32.0F, this.l / 32.0F + ☃).a(64, 64, 64, 255).d();
/* 374 */     dfh.a(this.k, 0.0D, 0.0D).a(this.k / 32.0F, ☃).a(64, 64, 64, 255).d();
/* 375 */     dfh.a(0.0D, 0.0D, 0.0D).a(0.0F, ☃).a(64, 64, 64, 255).d();
/* 376 */     dfo.b();
/*     */   }
/*     */   
/*     */   public boolean ay_() {
/* 380 */     return true;
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/* 384 */     if (☃) {
/* 385 */       a(this.c);
/*     */     }
/*     */     
/* 388 */     this.c = null;
/* 389 */     this.i.a(this);
/*     */   }
/*     */   
/*     */   private void a(URI ☃) {
/* 393 */     x.i().a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean x() {
/* 398 */     if (djz.a) {
/* 399 */       return (deo.a(djz.C().aD().i(), 343) || deo.a(djz.C().aD().i(), 347));
/*     */     }
/*     */     
/* 402 */     return (deo.a(djz.C().aD().i(), 341) || deo.a(djz.C().aD().i(), 345));
/*     */   }
/*     */   
/*     */   public static boolean y() {
/* 406 */     return (deo.a(djz.C().aD().i(), 340) || deo.a(djz.C().aD().i(), 344));
/*     */   }
/*     */   
/*     */   public static boolean z() {
/* 410 */     return (deo.a(djz.C().aD().i(), 342) || deo.a(djz.C().aD().i(), 346));
/*     */   }
/*     */   
/*     */   public static boolean f(int ☃) {
/* 414 */     return (☃ == 88 && x() && !y() && !z());
/*     */   }
/*     */   
/*     */   public static boolean g(int ☃) {
/* 418 */     return (☃ == 86 && x() && !y() && !z());
/*     */   }
/*     */   
/*     */   public static boolean h(int ☃) {
/* 422 */     return (☃ == 67 && x() && !y() && !z());
/*     */   }
/*     */   
/*     */   public static boolean i(int ☃) {
/* 426 */     return (☃ == 65 && x() && !y() && !z());
/*     */   }
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/* 430 */     b(☃, i, j);
/*     */   }
/*     */   
/*     */   public static void a(Runnable ☃, String str1, String str2) {
/*     */     try {
/* 435 */       ☃.run();
/* 436 */     } catch (Throwable throwable) {
/* 437 */       l l = l.a(throwable, str1);
/* 438 */       m m = l.a("Affected screen");
/* 439 */       m.a("Screen name", () -> ☃);
/* 440 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(String ☃, char c, int i) {
/* 445 */     int j = ☃.indexOf(':');
/* 446 */     int k = ☃.indexOf('/');
/*     */     
/* 448 */     if (c == ':') {
/* 449 */       return ((k == -1 || i <= k) && j == -1);
/*     */     }
/*     */     
/* 452 */     if (c == '/') {
/* 453 */       return (i > j);
/*     */     }
/*     */     
/* 456 */     return (c == '_' || c == '-' || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '.');
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(double ☃, double d1) {
/* 461 */     return true;
/*     */   }
/*     */   
/*     */   public void a(List<Path> ☃) {}
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */