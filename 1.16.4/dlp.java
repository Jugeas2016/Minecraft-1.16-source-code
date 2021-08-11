/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSets;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import java.util.EnumMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.client.ClientBrandRetriever;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dlp
/*     */   extends dkw
/*     */ {
/*     */   private static final Map<chn.a, String> a;
/*     */   private final djz b;
/*     */   private final dku c;
/*     */   private dcl d;
/*     */   private dcl e;
/*     */   @Nullable
/*     */   private brd i;
/*     */   @Nullable
/*     */   private cgh j;
/*     */   @Nullable
/*     */   private CompletableFuture<cgh> k;
/*     */   
/*     */   static {
/*  71 */     a = x.<Map<chn.a, String>>a(new EnumMap<>(chn.a.class), ☃ -> {
/*     */           ☃.put(chn.a.a, "SW");
/*     */           ☃.put(chn.a.b, "S");
/*     */           ☃.put(chn.a.c, "OW");
/*     */           ☃.put(chn.a.d, "O");
/*     */           ☃.put(chn.a.e, "M");
/*     */           ☃.put(chn.a.f, "ML");
/*     */         });
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
/*     */   public dlp(djz ☃) {
/*  93 */     this.b = ☃;
/*  94 */     this.c = ☃.g;
/*     */   }
/*     */   
/*     */   public void a() {
/*  98 */     this.k = null;
/*  99 */     this.j = null;
/*     */   }
/*     */   
/*     */   public void a(dfm ☃) {
/* 103 */     this.b.au().a("debug");
/* 104 */     RenderSystem.pushMatrix();
/*     */     
/* 106 */     aqa aqa = this.b.aa();
/*     */     
/* 108 */     this.d = aqa.a(20.0D, 0.0F, false);
/* 109 */     this.e = aqa.a(20.0D, 0.0F, true);
/*     */     
/* 111 */     b(☃);
/* 112 */     c(☃);
/*     */     
/* 114 */     RenderSystem.popMatrix();
/*     */     
/* 116 */     if (this.b.k.aL) {
/* 117 */       int i = this.b.aD().o();
/*     */       
/* 119 */       a(☃, this.b.ag(), 0, i / 2, true);
/* 120 */       eng eng = this.b.H();
/* 121 */       if (eng != null) {
/* 122 */         a(☃, eng.aP(), i - Math.min(i / 2, 240), i / 2, false);
/*     */       }
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
/* 134 */     this.b.au().c();
/*     */   }
/*     */   
/*     */   protected void b(dfm ☃) {
/* 138 */     List<String> list = b();
/*     */     
/* 140 */     list.add("");
/* 141 */     boolean bool = (this.b.H() != null);
/* 142 */     list.add("Debug: Pie [shift]: " + (this.b.k.aK ? "visible" : "hidden") + (bool ? " FPS + TPS" : " FPS") + " [alt]: " + (this.b.k.aL ? "visible" : "hidden"));
/* 143 */     list.add("For help: press F3 + Q");
/*     */     
/* 145 */     for (int i = 0; i < list.size(); i++) {
/* 146 */       String str = list.get(i);
/* 147 */       if (!Strings.isNullOrEmpty(str)) {
/* 148 */         this.c.getClass(); int j = 9;
/* 149 */         int k = this.c.b(str);
/* 150 */         int m = 2;
/* 151 */         int n = 2 + j * i;
/* 152 */         a(☃, 1, n - 1, 2 + k + 1, n + j - 1, -1873784752);
/* 153 */         this.c.b(☃, str, 2.0F, n, 14737632);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void c(dfm ☃) {
/* 159 */     List<String> list = c();
/*     */     
/* 161 */     for (int i = 0; i < list.size(); i++) {
/* 162 */       String str = list.get(i);
/* 163 */       if (!Strings.isNullOrEmpty(str)) {
/* 164 */         this.c.getClass(); int j = 9;
/* 165 */         int k = this.c.b(str);
/* 166 */         int m = this.b.aD().o() - 2 - k;
/* 167 */         int n = 2 + j * i;
/* 168 */         a(☃, m - 1, n - 1, m + k + 1, n + j - 1, -1873784752);
/* 169 */         this.c.b(☃, str, m, n, 14737632);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected List<String> b() {
/*     */     String ☃, str1;
/* 177 */     eng eng = this.b.H();
/* 178 */     nd nd = this.b.w().a();
/* 179 */     float f1 = nd.o();
/* 180 */     float f2 = nd.n();
/* 181 */     if (eng != null) {
/* 182 */       ☃ = String.format("Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", new Object[] { Float.valueOf(eng.aO()), Float.valueOf(f1), Float.valueOf(f2) });
/*     */     } else {
/* 184 */       ☃ = String.format("\"%s\" server, %.0f tx, %.0f rx", new Object[] { this.b.s.B(), Float.valueOf(f1), Float.valueOf(f2) });
/*     */     } 
/*     */     
/* 187 */     fx fx = this.b.aa().cB();
/* 188 */     if (this.b.am()) {
/* 189 */       return Lists.newArrayList((Object[])new String[] { "Minecraft " + 
/* 190 */             w.a().getName() + " (" + this.b.g() + "/" + ClientBrandRetriever.getClientModName() + ")", this.b.A, ☃, this.b.e
/*     */ 
/*     */             
/* 193 */             .g(), this.b.e
/* 194 */             .i(), "P: " + this.b.f
/* 195 */             .d() + ". T: " + this.b.r.j(), this.b.r
/* 196 */             .P(), "", 
/*     */             
/* 198 */             String.format("Chunk-relative: %d %d %d", new Object[] { Integer.valueOf(fx.u() & 0xF), Integer.valueOf(fx.v() & 0xF), Integer.valueOf(fx.w() & 0xF) }) });
/*     */     }
/*     */ 
/*     */     
/* 202 */     aqa aqa = this.b.aa();
/* 203 */     gc gc = aqa.bZ();
/*     */     
/* 205 */     switch (null.a[gc.ordinal()]) {
/*     */       case 1:
/* 207 */         str1 = "Towards negative Z";
/*     */         break;
/*     */       case 2:
/* 210 */         str1 = "Towards positive Z";
/*     */         break;
/*     */       case 3:
/* 213 */         str1 = "Towards negative X";
/*     */         break;
/*     */       case 4:
/* 216 */         str1 = "Towards positive X";
/*     */         break;
/*     */       default:
/* 219 */         str1 = "Invalid";
/*     */         break;
/*     */     } 
/*     */     
/* 223 */     brd brd1 = new brd(fx);
/* 224 */     if (!Objects.equals(this.i, brd1)) {
/* 225 */       this.i = brd1;
/* 226 */       a();
/*     */     } 
/*     */     
/* 229 */     brx brx = f();
/* 230 */     LongSet longSet = (brx instanceof aag) ? ((aag)brx).w() : (LongSet)LongSets.EMPTY_SET;
/* 231 */     List<String> list = Lists.newArrayList((Object[])new String[] { "Minecraft " + 
/* 232 */           w.a().getName() + " (" + this.b.g() + "/" + ClientBrandRetriever.getClientModName() + ("release".equalsIgnoreCase(this.b.h()) ? "" : ("/" + this.b.h())) + ")", this.b.A, ☃, this.b.e
/*     */ 
/*     */           
/* 235 */           .g(), this.b.e
/* 236 */           .i(), "P: " + this.b.f
/* 237 */           .d() + ". T: " + this.b.r.j(), this.b.r
/* 238 */           .P() });
/*     */ 
/*     */     
/* 241 */     String str2 = e();
/* 242 */     if (str2 != null) {
/* 243 */       list.add(str2);
/*     */     }
/*     */     
/* 246 */     list.add(this.b.r.Y().a() + " FC: " + longSet.size());
/* 247 */     list.add("");
/* 248 */     list.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", new Object[] { Double.valueOf(this.b.aa().cD()), Double.valueOf(this.b.aa().cE()), Double.valueOf(this.b.aa().cH()) }));
/* 249 */     list.add(String.format("Block: %d %d %d", new Object[] { Integer.valueOf(fx.u()), Integer.valueOf(fx.v()), Integer.valueOf(fx.w()) }));
/* 250 */     list.add(String.format("Chunk: %d %d %d in %d %d %d", new Object[] { Integer.valueOf(fx.u() & 0xF), Integer.valueOf(fx.v() & 0xF), Integer.valueOf(fx.w() & 0xF), Integer.valueOf(fx.u() >> 4), Integer.valueOf(fx.v() >> 4), Integer.valueOf(fx.w() >> 4) }));
/* 251 */     list.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", new Object[] { gc, str1, Float.valueOf(afm.g(aqa.p)), Float.valueOf(afm.g(aqa.q)) }));
/*     */     
/* 253 */     if (this.b.r != null) {
/* 254 */       if (this.b.r.C(fx)) {
/* 255 */         cgh cgh1 = h();
/* 256 */         if (cgh1.t()) {
/* 257 */           list.add("Waiting for chunk...");
/*     */         } else {
/* 259 */           int i = this.b.r.n().l().b(fx, 0);
/* 260 */           int j = this.b.r.a(bsf.a, fx);
/* 261 */           int k = this.b.r.a(bsf.b, fx);
/* 262 */           list.add("Client Light: " + i + " (" + j + " sky, " + k + " block)");
/* 263 */           cgh cgh2 = g();
/* 264 */           if (cgh2 != null) {
/* 265 */             cuo cuo = brx.H().l();
/* 266 */             list.add("Server Light: (" + cuo.a(bsf.a).b(fx) + " sky, " + cuo.a(bsf.b).b(fx) + " block)");
/*     */           } else {
/* 268 */             list.add("Server Light: (?? sky, ?? block)");
/*     */           } 
/* 270 */           StringBuilder stringBuilder = new StringBuilder("CH");
/* 271 */           for (chn.a a : chn.a.values()) {
/* 272 */             if (a.c()) {
/* 273 */               stringBuilder.append(" ").append(a.get(a)).append(": ").append(cgh1.a(a, fx.u(), fx.w()));
/*     */             }
/*     */           } 
/* 276 */           list.add(stringBuilder.toString());
/*     */           
/* 278 */           stringBuilder.setLength(0);
/* 279 */           stringBuilder.append("SH");
/* 280 */           for (chn.a a : chn.a.values()) {
/* 281 */             if (a.d()) {
/* 282 */               stringBuilder.append(" ").append(a.get(a)).append(": ");
/* 283 */               if (cgh2 != null) {
/* 284 */                 stringBuilder.append(cgh2.a(a, fx.u(), fx.w()));
/*     */               } else {
/* 286 */                 stringBuilder.append("??");
/*     */               } 
/*     */             } 
/*     */           } 
/* 290 */           list.add(stringBuilder.toString());
/*     */           
/* 292 */           if (fx.v() >= 0 && fx.v() < 256) {
/* 293 */             list.add("Biome: " + this.b.r.r().<bsv>b(gm.ay).b(this.b.r.v(fx)));
/* 294 */             long l = 0L;
/* 295 */             float f = 0.0F;
/* 296 */             if (cgh2 != null) {
/* 297 */               f = brx.af();
/* 298 */               l = cgh2.q();
/*     */             } 
/*     */             
/* 301 */             aos aos = new aos(brx.ad(), brx.U(), l, f);
/* 302 */             list.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", new Object[] { Float.valueOf(aos.b()), Float.valueOf(aos.d()), Long.valueOf(this.b.r.U() / 24000L) }));
/*     */           } 
/*     */         } 
/*     */       } else {
/* 306 */         list.add("Outside of world...");
/*     */       } 
/*     */     } else {
/* 309 */       list.add("Outside of world...");
/*     */     } 
/*     */     
/* 312 */     aag aag = d();
/* 313 */     if (aag != null) {
/* 314 */       bsg.d d = aag.i().k();
/* 315 */       if (d != null) {
/* 316 */         Object2IntMap<aqo> object2IntMap = d.b();
/* 317 */         int i = d.a();
/* 318 */         list.add("SC: " + i + ", " + (String)Stream.<aqo>of(aqo.values()).map(aqo1 -> Character.toUpperCase(aqo1.b().charAt(0)) + ": " + ☃.getInt(aqo1)).collect(Collectors.joining(", ")));
/*     */       } else {
/* 320 */         list.add("SC: N/A");
/*     */       } 
/*     */     } 
/*     */     
/* 324 */     eaj eaj = this.b.h.f();
/* 325 */     if (eaj != null) {
/* 326 */       list.add("Shader: " + eaj.a());
/*     */     }
/*     */     
/* 329 */     list.add(this.b.W().g() + String.format(" (Mood %d%%)", new Object[] { Integer.valueOf(Math.round(this.b.s.w() * 100.0F)) }));
/*     */     
/* 331 */     return list;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private aag d() {
/* 336 */     eng ☃ = this.b.H();
/* 337 */     if (☃ != null) {
/* 338 */       return ☃.a(this.b.r.Y());
/*     */     }
/*     */     
/* 341 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private String e() {
/* 346 */     aag ☃ = d();
/* 347 */     if (☃ != null) {
/* 348 */       return ☃.P();
/*     */     }
/* 350 */     return null;
/*     */   }
/*     */   
/*     */   private brx f() {
/* 354 */     return (brx)DataFixUtils.orElse(
/* 355 */         Optional.<eng>ofNullable(this.b.H()).flatMap(☃ -> Optional.ofNullable(☃.a(this.b.r.Y()))), this.b.r);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private cgh g() {
/* 362 */     if (this.k == null) {
/* 363 */       aag ☃ = d();
/* 364 */       if (☃ != null) {
/* 365 */         this.k = ☃.i().b(this.i.b, this.i.c, cga.m, false).thenApply(☃ -> (cgh)☃.map((), ()));
/*     */       }
/*     */       
/* 368 */       if (this.k == null) {
/* 369 */         this.k = CompletableFuture.completedFuture(h());
/*     */       }
/*     */     } 
/* 372 */     return this.k.getNow(null);
/*     */   }
/*     */   
/*     */   private cgh h() {
/* 376 */     if (this.j == null) {
/* 377 */       this.j = this.b.r.d(this.i.b, this.i.c);
/*     */     }
/* 379 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   protected List<String> c() {
/* 384 */     long ☃ = Runtime.getRuntime().maxMemory();
/* 385 */     long l1 = Runtime.getRuntime().totalMemory();
/* 386 */     long l2 = Runtime.getRuntime().freeMemory();
/* 387 */     long l3 = l1 - l2;
/*     */     
/* 389 */     List<String> list = Lists.newArrayList((Object[])new String[] {
/* 390 */           String.format("Java: %s %dbit", new Object[] { System.getProperty("java.version"), Integer.valueOf(this.b.S() ? 64 : 32)
/* 391 */             }), String.format("Mem: % 2d%% %03d/%03dMB", new Object[] { Long.valueOf(l3 * 100L / ☃), Long.valueOf(a(l3)), Long.valueOf(a(☃))
/* 392 */             }), String.format("Allocated: % 2d%% %03dMB", new Object[] { Long.valueOf(l1 * 100L / ☃), Long.valueOf(a(l1)) }), "", 
/*     */           
/* 394 */           String.format("CPU: %s", new Object[] { den.b() }), "", 
/*     */           
/* 396 */           String.format("Display: %dx%d (%s)", new Object[] { Integer.valueOf(djz.C().aD().k()), Integer.valueOf(djz.C().aD().l()), den.a()
/* 397 */             }), den.c(), 
/* 398 */           den.d()
/*     */         });
/*     */     
/* 401 */     if (this.b.am()) {
/* 402 */       return list;
/*     */     }
/*     */     
/* 405 */     if (this.d.c() == dcl.a.b) {
/* 406 */       fx fx = ((dcj)this.d).a();
/* 407 */       ceh ceh = this.b.r.d_(fx);
/*     */       
/* 409 */       list.add("");
/* 410 */       list.add(k.t + "Targeted Block: " + fx.u() + ", " + fx.v() + ", " + fx.w());
/* 411 */       list.add(String.valueOf(gm.Q.b(ceh.b())));
/*     */       
/* 413 */       for (UnmodifiableIterator<Map.Entry<cfj<?>, Comparable<?>>> unmodifiableIterator = ceh.s().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<cfj<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 414 */         list.add(a(entry)); }
/*     */       
/* 416 */       for (vk vk : this.b.w().k().a().a(ceh.b())) {
/* 417 */         list.add("#" + vk);
/*     */       }
/*     */     } 
/*     */     
/* 421 */     if (this.e.c() == dcl.a.b) {
/* 422 */       fx fx = ((dcj)this.e).a();
/* 423 */       cux cux = this.b.r.b(fx);
/* 424 */       list.add("");
/* 425 */       list.add(k.t + "Targeted Fluid: " + fx.u() + ", " + fx.v() + ", " + fx.w());
/* 426 */       list.add(String.valueOf(gm.O.b(cux.a())));
/*     */       
/* 428 */       for (UnmodifiableIterator<Map.Entry<cfj<?>, Comparable<?>>> unmodifiableIterator = cux.s().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<cfj<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 429 */         list.add(a(entry)); }
/*     */       
/* 431 */       for (vk vk : this.b.w().k().c().a(cux.a())) {
/* 432 */         list.add("#" + vk);
/*     */       }
/*     */     } 
/*     */     
/* 436 */     aqa aqa = this.b.u;
/* 437 */     if (aqa != null) {
/* 438 */       list.add("");
/* 439 */       list.add(k.t + "Targeted Entity");
/* 440 */       list.add(String.valueOf(gm.S.b(aqa.X())));
/*     */     } 
/*     */     
/* 443 */     return list;
/*     */   }
/*     */   
/*     */   private String a(Map.Entry<cfj<?>, Comparable<?>> ☃) {
/* 447 */     cfj<?> cfj = ☃.getKey();
/* 448 */     Comparable<?> comparable = ☃.getValue();
/* 449 */     String str = x.a(cfj, comparable);
/*     */     
/* 451 */     if (Boolean.TRUE.equals(comparable)) {
/* 452 */       str = k.k + str;
/* 453 */     } else if (Boolean.FALSE.equals(comparable)) {
/* 454 */       str = k.m + str;
/*     */     } 
/*     */     
/* 457 */     return cfj.f() + ": " + str;
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, afc afc1, int i, int j, boolean bool) {
/* 461 */     RenderSystem.disableDepthTest();
/*     */     
/* 463 */     int k = afc1.a();
/* 464 */     int m = afc1.b();
/* 465 */     long[] arrayOfLong = afc1.c();
/* 466 */     int n = k;
/* 467 */     int i1 = i;
/*     */     
/* 469 */     int i2 = Math.max(0, arrayOfLong.length - j);
/* 470 */     int i3 = arrayOfLong.length - i2;
/*     */     
/* 472 */     n = afc1.b(n + i2);
/*     */     
/* 474 */     long l = 0L;
/* 475 */     int i4 = Integer.MAX_VALUE;
/* 476 */     int i5 = Integer.MIN_VALUE;
/*     */     int i6;
/* 478 */     for (i6 = 0; i6 < i3; i6++) {
/* 479 */       int i7 = (int)(arrayOfLong[afc1.b(n + i6)] / 1000000L);
/* 480 */       i4 = Math.min(i4, i7);
/* 481 */       i5 = Math.max(i5, i7);
/* 482 */       l += i7;
/*     */     } 
/*     */     
/* 485 */     i6 = this.b.aD().p();
/* 486 */     a(☃, i, i6 - 60, i + i3, i6, -1873784752);
/*     */     
/* 488 */     dfh dfh = dfo.a().c();
/* 489 */     RenderSystem.enableBlend();
/* 490 */     RenderSystem.disableTexture();
/* 491 */     RenderSystem.defaultBlendFunc();
/* 492 */     dfh.a(7, dfk.l);
/*     */     
/* 494 */     b b = f.a().c();
/*     */     
/* 496 */     while (n != m) {
/* 497 */       int i7 = afc1.a(arrayOfLong[n], bool ? 30 : 60, bool ? 60 : 20);
/* 498 */       int i8 = bool ? 100 : 60;
/* 499 */       int i9 = a(afm.a(i7, 0, i8), 0, i8 / 2, i8);
/*     */       
/* 501 */       int i10 = i9 >> 24 & 0xFF;
/* 502 */       int i11 = i9 >> 16 & 0xFF;
/* 503 */       int i12 = i9 >> 8 & 0xFF;
/* 504 */       int i13 = i9 & 0xFF;
/*     */       
/* 506 */       dfh.a(b, (i1 + 1), i6, 0.0F).a(i11, i12, i13, i10).d();
/* 507 */       dfh.a(b, (i1 + 1), (i6 - i7 + 1), 0.0F).a(i11, i12, i13, i10).d();
/* 508 */       dfh.a(b, i1, (i6 - i7 + 1), 0.0F).a(i11, i12, i13, i10).d();
/* 509 */       dfh.a(b, i1, i6, 0.0F).a(i11, i12, i13, i10).d();
/*     */       
/* 511 */       i1++;
/* 512 */       n = afc1.b(n + 1);
/*     */     } 
/*     */     
/* 515 */     dfh.c();
/* 516 */     dfi.a(dfh);
/* 517 */     RenderSystem.enableTexture();
/* 518 */     RenderSystem.disableBlend();
/*     */     
/* 520 */     if (bool) {
/* 521 */       a(☃, i + 1, i6 - 30 + 1, i + 14, i6 - 30 + 10, -1873784752);
/* 522 */       this.c.b(☃, "60 FPS", (i + 2), (i6 - 30 + 2), 14737632);
/* 523 */       a(☃, i, i + i3 - 1, i6 - 30, -1);
/*     */       
/* 525 */       a(☃, i + 1, i6 - 60 + 1, i + 14, i6 - 60 + 10, -1873784752);
/* 526 */       this.c.b(☃, "30 FPS", (i + 2), (i6 - 60 + 2), 14737632);
/* 527 */       a(☃, i, i + i3 - 1, i6 - 60, -1);
/*     */     } else {
/* 529 */       a(☃, i + 1, i6 - 60 + 1, i + 14, i6 - 60 + 10, -1873784752);
/* 530 */       this.c.b(☃, "20 TPS", (i + 2), (i6 - 60 + 2), 14737632);
/* 531 */       a(☃, i, i + i3 - 1, i6 - 60, -1);
/*     */     } 
/*     */     
/* 534 */     a(☃, i, i + i3 - 1, i6 - 1, -1);
/* 535 */     b(☃, i, i6 - 60, i6, -1);
/* 536 */     b(☃, i + i3 - 1, i6 - 60, i6, -1);
/*     */     
/* 538 */     if (bool && this.b.k.d > 0 && this.b.k.d <= 250) {
/* 539 */       a(☃, i, i + i3 - 1, i6 - 1 - (int)(1800.0D / this.b.k.d), -16711681);
/*     */     }
/*     */     
/* 542 */     String str1 = i4 + " ms min";
/* 543 */     String str2 = (l / i3) + " ms avg";
/* 544 */     String str3 = i5 + " ms max";
/* 545 */     this.c.getClass(); this.c.a(☃, str1, (i + 2), (i6 - 60 - 9), 14737632);
/* 546 */     this.c.getClass(); this.c.a(☃, str2, (i + i3 / 2 - this.c.b(str2) / 2), (i6 - 60 - 9), 14737632);
/* 547 */     this.c.getClass(); this.c.a(☃, str3, (i + i3 - this.c.b(str3)), (i6 - 60 - 9), 14737632);
/*     */     
/* 549 */     RenderSystem.enableDepthTest();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int a(int ☃, int i, int j, int k) {
/* 557 */     if (☃ < j) {
/* 558 */       return a(-16711936, -256, ☃ / j);
/*     */     }
/* 560 */     return a(-256, -65536, (☃ - j) / (k - j));
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i, float f) {
/* 564 */     int j = ☃ >> 24 & 0xFF;
/* 565 */     int k = ☃ >> 16 & 0xFF;
/* 566 */     int m = ☃ >> 8 & 0xFF;
/* 567 */     int n = ☃ & 0xFF;
/* 568 */     int i1 = i >> 24 & 0xFF;
/* 569 */     int i2 = i >> 16 & 0xFF;
/* 570 */     int i3 = i >> 8 & 0xFF;
/* 571 */     int i4 = i & 0xFF;
/* 572 */     int i5 = afm.a((int)afm.g(f, j, i1), 0, 255);
/* 573 */     int i6 = afm.a((int)afm.g(f, k, i2), 0, 255);
/* 574 */     int i7 = afm.a((int)afm.g(f, m, i3), 0, 255);
/* 575 */     int i8 = afm.a((int)afm.g(f, n, i4), 0, 255);
/* 576 */     return i5 << 24 | i6 << 16 | i7 << 8 | i8;
/*     */   }
/*     */   
/*     */   private static long a(long ☃) {
/* 580 */     return ☃ / 1024L / 1024L;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */