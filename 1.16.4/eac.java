/*     */ import com.google.common.base.MoreObjects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eac
/*     */ {
/*  32 */   private static final eao a = eao.p(new vk("textures/map/map_background.png"));
/*  33 */   private static final eao b = eao.p(new vk("textures/map/map_background_checkerboard.png"));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final djz c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 143 */   private bmb d = bmb.b;
/* 144 */   private bmb e = bmb.b;
/*     */   private float f;
/*     */   private float g;
/*     */   private float h;
/*     */   private float i;
/*     */   private final eet j;
/*     */   private final efo k;
/*     */   
/*     */   public eac(djz ☃) {
/* 153 */     this.c = ☃;
/* 154 */     this.j = ☃.ac();
/* 155 */     this.k = ☃.ad();
/*     */   }
/*     */   
/*     */   public void a(aqm ☃, bmb bmb1, ebm.b b1, boolean bool, dfm dfm1, eag eag1, int i) {
/* 159 */     if (bmb1.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 163 */     this.k.a(☃, bmb1, b1, bool, dfm1, eag1, ☃.l, i, ejw.a);
/*     */   }
/*     */   
/*     */   private float a(float ☃) {
/* 167 */     float f = 1.0F - ☃ / 45.0F + 0.1F;
/* 168 */     f = afm.a(f, 0.0F, 1.0F);
/* 169 */     f = -afm.b(f * 3.1415927F) * 0.5F + 0.5F;
/* 170 */     return f;
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, eag eag1, int i, aqi aqi1) {
/* 174 */     this.c.M().a(this.c.s.o());
/* 175 */     ejk ejk = (ejk)this.j.<dzm>a(this.c.s);
/*     */     
/* 177 */     ☃.a();
/*     */     
/* 179 */     float f = (aqi1 == aqi.b) ? 1.0F : -1.0F;
/*     */     
/* 181 */     ☃.a(g.d.a(92.0F));
/* 182 */     ☃.a(g.b.a(45.0F));
/* 183 */     ☃.a(g.f.a(f * -41.0F));
/* 184 */     ☃.a((f * 0.3F), -1.100000023841858D, 0.44999998807907104D);
/*     */     
/* 186 */     if (aqi1 == aqi.b) {
/* 187 */       ejk.a(☃, eag1, i, this.c.s);
/*     */     } else {
/* 189 */       ejk.b(☃, eag1, i, this.c.s);
/*     */     } 
/* 191 */     ☃.b();
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, eag eag1, int i, float f1, aqi aqi1, float f2, bmb bmb1) {
/* 195 */     float f3 = (aqi1 == aqi.b) ? 1.0F : -1.0F;
/*     */     
/* 197 */     ☃.a((f3 * 0.125F), -0.125D, 0.0D);
/*     */     
/* 199 */     if (!this.c.s.bF()) {
/* 200 */       ☃.a();
/* 201 */       ☃.a(g.f.a(f3 * 10.0F));
/* 202 */       a(☃, eag1, i, f1, f2, aqi1);
/* 203 */       ☃.b();
/*     */     } 
/*     */     
/* 206 */     ☃.a();
/* 207 */     ☃.a((f3 * 0.51F), (-0.08F + f1 * -1.2F), -0.75D);
/*     */     
/* 209 */     float f4 = afm.c(f2);
/* 210 */     float f5 = afm.a(f4 * 3.1415927F);
/* 211 */     float f6 = -0.5F * f5;
/* 212 */     float f7 = 0.4F * afm.a(f4 * 6.2831855F);
/* 213 */     float f8 = -0.3F * afm.a(f2 * 3.1415927F);
/* 214 */     ☃.a((f3 * f6), (f7 - 0.3F * f5), f8);
/*     */     
/* 216 */     ☃.a(g.b.a(f5 * -45.0F));
/* 217 */     ☃.a(g.d.a(f3 * f5 * -30.0F));
/* 218 */     a(☃, eag1, i, bmb1);
/* 219 */     ☃.b();
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, eag eag1, int i, float f1, float f2, float f3) {
/* 223 */     float f4 = afm.c(f3);
/* 224 */     float f5 = -0.2F * afm.a(f3 * 3.1415927F);
/* 225 */     float f6 = -0.4F * afm.a(f4 * 3.1415927F);
/* 226 */     ☃.a(0.0D, (-f5 / 2.0F), f6);
/*     */     
/* 228 */     float f7 = a(f1);
/* 229 */     ☃.a(0.0D, (0.04F + f2 * -1.2F + f7 * -0.5F), -0.7200000286102295D);
/* 230 */     ☃.a(g.b.a(f7 * -85.0F));
/*     */     
/* 232 */     if (!this.c.s.bF()) {
/* 233 */       ☃.a();
/* 234 */       ☃.a(g.d.a(90.0F));
/*     */       
/* 236 */       a(☃, eag1, i, aqi.b);
/* 237 */       a(☃, eag1, i, aqi.a);
/*     */       
/* 239 */       ☃.b();
/*     */     } 
/*     */     
/* 242 */     float f8 = afm.a(f4 * 3.1415927F);
/* 243 */     ☃.a(g.b.a(f8 * 20.0F));
/*     */     
/* 245 */     ☃.a(2.0F, 2.0F, 2.0F);
/*     */     
/* 247 */     a(☃, eag1, i, this.d);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, eag eag1, int i, bmb bmb1) {
/* 251 */     ☃.a(g.d.a(180.0F));
/* 252 */     ☃.a(g.f.a(180.0F));
/*     */     
/* 254 */     ☃.a(0.38F, 0.38F, 0.38F);
/*     */     
/* 256 */     ☃.a(-0.5D, -0.5D, 0.0D);
/* 257 */     ☃.a(0.0078125F, 0.0078125F, 0.0078125F);
/*     */     
/* 259 */     cxx cxx = bmh.b(bmb1, this.c.r);
/*     */     
/* 261 */     dfq dfq = eag1.getBuffer((cxx == null) ? a : b);
/*     */     
/* 263 */     b b = ☃.c().a();
/*     */     
/* 265 */     dfq.a(b, -7.0F, 135.0F, 0.0F).a(255, 255, 255, 255).a(0.0F, 1.0F).a(i).d();
/* 266 */     dfq.a(b, 135.0F, 135.0F, 0.0F).a(255, 255, 255, 255).a(1.0F, 1.0F).a(i).d();
/* 267 */     dfq.a(b, 135.0F, -7.0F, 0.0F).a(255, 255, 255, 255).a(1.0F, 0.0F).a(i).d();
/* 268 */     dfq.a(b, -7.0F, -7.0F, 0.0F).a(255, 255, 255, 255).a(0.0F, 0.0F).a(i).d();
/*     */     
/* 270 */     if (cxx != null) {
/* 271 */       this.c.h.h().a(☃, eag1, cxx, false, i);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, eag eag1, int i, float f1, float f2, aqi aqi1) {
/* 276 */     boolean bool = (aqi1 != aqi.a);
/* 277 */     float f3 = bool ? 1.0F : -1.0F;
/* 278 */     float f4 = afm.c(f2);
/* 279 */     float f5 = -0.3F * afm.a(f4 * 3.1415927F);
/* 280 */     float f6 = 0.4F * afm.a(f4 * 6.2831855F);
/* 281 */     float f7 = -0.4F * afm.a(f2 * 3.1415927F);
/* 282 */     ☃.a((f3 * (f5 + 0.64000005F)), (f6 + -0.6F + f1 * -0.6F), (f7 + -0.71999997F));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 288 */     ☃.a(g.d.a(f3 * 45.0F));
/*     */     
/* 290 */     float f8 = afm.a(f2 * f2 * 3.1415927F);
/* 291 */     float f9 = afm.a(f4 * 3.1415927F);
/* 292 */     ☃.a(g.d.a(f3 * f9 * 70.0F));
/* 293 */     ☃.a(g.f.a(f3 * f8 * -20.0F));
/*     */     
/* 295 */     dzj dzj = this.c.s;
/*     */     
/* 297 */     this.c.M().a(dzj.o());
/* 298 */     ☃.a((f3 * -1.0F), 3.5999999046325684D, 3.5D);
/* 299 */     ☃.a(g.f.a(f3 * 120.0F));
/* 300 */     ☃.a(g.b.a(200.0F));
/* 301 */     ☃.a(g.d.a(f3 * -135.0F));
/* 302 */     ☃.a((f3 * 5.6F), 0.0D, 0.0D);
/*     */     
/* 304 */     ejk ejk = (ejk)this.j.<dzj>a(dzj);
/* 305 */     if (bool) {
/* 306 */       ejk.a(☃, eag1, i, dzj);
/*     */     } else {
/* 308 */       ejk.b(☃, eag1, i, dzj);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, float f, aqi aqi1, bmb bmb1) {
/* 313 */     float f1 = this.c.s.dZ() - f + 1.0F;
/* 314 */     float f2 = f1 / bmb1.k();
/*     */     
/* 316 */     if (f2 < 0.8F) {
/* 317 */       float f4 = afm.e(afm.b(f1 / 4.0F * 3.1415927F) * 0.1F);
/* 318 */       ☃.a(0.0D, f4, 0.0D);
/*     */     } 
/*     */     
/* 321 */     float f3 = 1.0F - (float)Math.pow(f2, 27.0D);
/*     */     
/* 323 */     int i = (aqi1 == aqi.b) ? 1 : -1;
/* 324 */     ☃.a((f3 * 0.6F * i), (f3 * -0.5F), (f3 * 0.0F));
/*     */     
/* 326 */     ☃.a(g.d.a(i * f3 * 90.0F));
/* 327 */     ☃.a(g.b.a(f3 * 10.0F));
/* 328 */     ☃.a(g.f.a(i * f3 * 30.0F));
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, aqi aqi1, float f) {
/* 332 */     int i = (aqi1 == aqi.b) ? 1 : -1;
/*     */     
/* 334 */     float f1 = afm.a(f * f * 3.1415927F);
/* 335 */     ☃.a(g.d.a(i * (45.0F + f1 * -20.0F)));
/*     */     
/* 337 */     float f2 = afm.a(afm.c(f) * 3.1415927F);
/* 338 */     ☃.a(g.f.a(i * f2 * -20.0F));
/* 339 */     ☃.a(g.b.a(f2 * -80.0F));
/* 340 */     ☃.a(g.d.a(i * -45.0F));
/*     */   }
/*     */   
/*     */   private void b(dfm ☃, aqi aqi1, float f) {
/* 344 */     int i = (aqi1 == aqi.b) ? 1 : -1;
/* 345 */     ☃.a((i * 0.56F), (-0.52F + f * -0.6F), -0.7200000286102295D);
/*     */   }
/*     */   
/*     */   public void a(float ☃, dfm dfm1, eag.a a1, dzm dzm1, int i) {
/* 349 */     float f1 = dzm1.r(☃);
/* 350 */     aot aot = (aot)MoreObjects.firstNonNull(dzm1.aj, aot.a);
/* 351 */     float f2 = afm.g(☃, dzm1.s, dzm1.q);
/*     */ 
/*     */     
/* 354 */     boolean bool1 = true;
/* 355 */     boolean bool2 = true;
/* 356 */     if (dzm1.dW()) {
/* 357 */       bmb bmb1 = dzm1.dY();
/* 358 */       if (bmb1.b() == bmd.kc || bmb1.b() == bmd.qQ) {
/* 359 */         bool1 = (dzm1.dX() == aot.a);
/* 360 */         bool2 = !bool1;
/*     */       } 
/*     */ 
/*     */       
/* 364 */       aot aot1 = dzm1.dX();
/* 365 */       if (aot1 == aot.a) {
/* 366 */         bmb bmb2 = dzm1.dE();
/* 367 */         if (bmb2.b() == bmd.qQ && bkt.d(bmb2)) {
/* 368 */           bool2 = false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 372 */       bmb bmb1 = dzm1.dD();
/* 373 */       bmb bmb2 = dzm1.dE();
/* 374 */       if (bmb1.b() == bmd.qQ && 
/* 375 */         bkt.d(bmb1)) {
/* 376 */         bool2 = !bool1;
/*     */       }
/*     */       
/* 379 */       if (bmb2.b() == bmd.qQ && 
/* 380 */         bkt.d(bmb2)) {
/* 381 */         bool1 = !bmb1.a();
/* 382 */         bool2 = !bool1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 387 */     float f3 = afm.g(☃, dzm1.bO, dzm1.bM);
/* 388 */     float f4 = afm.g(☃, dzm1.bN, dzm1.bL);
/* 389 */     dfm1.a(g.b.a((dzm1.g(☃) - f3) * 0.1F));
/* 390 */     dfm1.a(g.d.a((dzm1.h(☃) - f4) * 0.1F));
/*     */     
/* 392 */     if (bool1) {
/* 393 */       float f5 = (aot == aot.a) ? f1 : 0.0F;
/* 394 */       float f6 = 1.0F - afm.g(☃, this.g, this.f);
/* 395 */       a(dzm1, ☃, f2, aot.a, f5, this.d, f6, dfm1, a1, i);
/*     */     } 
/*     */     
/* 398 */     if (bool2) {
/* 399 */       float f5 = (aot == aot.b) ? f1 : 0.0F;
/* 400 */       float f6 = 1.0F - afm.g(☃, this.i, this.h);
/* 401 */       a(dzm1, ☃, f2, aot.b, f5, this.e, f6, dfm1, a1, i);
/*     */     } 
/*     */     
/* 404 */     a1.a();
/*     */   }
/*     */   
/*     */   private void a(dzj ☃, float f1, float f2, aot aot1, float f3, bmb bmb1, float f4, dfm dfm1, eag eag1, int i) {
/* 408 */     boolean bool = (aot1 == aot.a);
/* 409 */     aqi aqi = bool ? ☃.dV() : ☃.dV().a();
/*     */     
/* 411 */     dfm1.a();
/* 412 */     if (bmb1.a()) {
/* 413 */       if (bool && !☃.bF()) {
/* 414 */         a(dfm1, eag1, i, f4, f3, aqi);
/*     */       }
/*     */     }
/* 417 */     else if (bmb1.b() == bmd.nf) {
/* 418 */       if (bool && this.e.a()) {
/* 419 */         a(dfm1, eag1, i, f2, f4, f3);
/*     */       } else {
/* 421 */         a(dfm1, eag1, i, f4, aqi, f3, bmb1);
/*     */       } 
/* 423 */     } else if (bmb1.b() == bmd.qQ) {
/* 424 */       boolean bool1 = bkt.d(bmb1);
/* 425 */       boolean bool2 = (aqi == aqi.b);
/* 426 */       int j = bool2 ? 1 : -1;
/*     */       
/* 428 */       if (☃.dW() && ☃.dZ() > 0 && ☃.dX() == aot1) {
/* 429 */         b(dfm1, aqi, f4);
/*     */         
/* 431 */         dfm1.a((j * -0.4785682F), -0.0943870022892952D, 0.05731530860066414D);
/* 432 */         dfm1.a(g.b.a(-11.935F));
/* 433 */         dfm1.a(g.d.a(j * 65.3F));
/* 434 */         dfm1.a(g.f.a(j * -9.785F));
/*     */         
/* 436 */         float f5 = bmb1.k() - this.c.s.dZ() - f1 + 1.0F;
/* 437 */         float f6 = f5 / bkt.g(bmb1);
/* 438 */         if (f6 > 1.0F) {
/* 439 */           f6 = 1.0F;
/*     */         }
/* 441 */         if (f6 > 0.1F) {
/* 442 */           float f7 = afm.a((f5 - 0.1F) * 1.3F);
/* 443 */           float f8 = f6 - 0.1F;
/* 444 */           float f9 = f7 * f8;
/* 445 */           dfm1.a((f9 * 0.0F), (f9 * 0.004F), (f9 * 0.0F));
/*     */         } 
/* 447 */         dfm1.a((f6 * 0.0F), (f6 * 0.0F), (f6 * 0.04F));
/*     */         
/* 449 */         dfm1.a(1.0F, 1.0F, 1.0F + f6 * 0.2F);
/* 450 */         dfm1.a(g.c.a(j * 45.0F));
/*     */       } else {
/* 452 */         float f5 = -0.4F * afm.a(afm.c(f3) * 3.1415927F);
/* 453 */         float f6 = 0.2F * afm.a(afm.c(f3) * 6.2831855F);
/* 454 */         float f7 = -0.2F * afm.a(f3 * 3.1415927F);
/* 455 */         dfm1.a((j * f5), f6, f7);
/* 456 */         b(dfm1, aqi, f4);
/* 457 */         a(dfm1, aqi, f3);
/*     */ 
/*     */         
/* 460 */         if (bool1 && f3 < 0.001F) {
/* 461 */           dfm1.a((j * -0.641864F), 0.0D, 0.0D);
/* 462 */           dfm1.a(g.d.a(j * 10.0F));
/*     */         } 
/*     */       } 
/*     */       
/* 466 */       a(☃, bmb1, bool2 ? ebm.b.e : ebm.b.d, !bool2, dfm1, eag1, i);
/*     */     } else {
/* 468 */       boolean bool1 = (aqi == aqi.b);
/* 469 */       if (☃.dW() && ☃.dZ() > 0 && ☃.dX() == aot1) {
/* 470 */         float f5, f6; int j = bool1 ? 1 : -1;
/* 471 */         switch (null.a[bmb1.l().ordinal()]) {
/*     */           case 1:
/* 473 */             b(dfm1, aqi, f4);
/*     */             break;
/*     */           case 2:
/*     */           case 3:
/* 477 */             a(dfm1, f1, aqi, bmb1);
/* 478 */             b(dfm1, aqi, f4);
/*     */             break;
/*     */           case 4:
/* 481 */             b(dfm1, aqi, f4);
/*     */             break;
/*     */           case 5:
/* 484 */             b(dfm1, aqi, f4);
/*     */             
/* 486 */             dfm1.a((j * -0.2785682F), 0.18344387412071228D, 0.15731531381607056D);
/* 487 */             dfm1.a(g.b.a(-13.935F));
/* 488 */             dfm1.a(g.d.a(j * 35.3F));
/* 489 */             dfm1.a(g.f.a(j * -9.785F));
/*     */             
/* 491 */             f5 = bmb1.k() - this.c.s.dZ() - f1 + 1.0F;
/* 492 */             f6 = f5 / 20.0F;
/* 493 */             f6 = (f6 * f6 + f6 * 2.0F) / 3.0F;
/* 494 */             if (f6 > 1.0F) {
/* 495 */               f6 = 1.0F;
/*     */             }
/* 497 */             if (f6 > 0.1F) {
/* 498 */               float f7 = afm.a((f5 - 0.1F) * 1.3F);
/* 499 */               float f8 = f6 - 0.1F;
/* 500 */               float f9 = f7 * f8;
/* 501 */               dfm1.a((f9 * 0.0F), (f9 * 0.004F), (f9 * 0.0F));
/*     */             } 
/* 503 */             dfm1.a((f6 * 0.0F), (f6 * 0.0F), (f6 * 0.04F));
/*     */             
/* 505 */             dfm1.a(1.0F, 1.0F, 1.0F + f6 * 0.2F);
/* 506 */             dfm1.a(g.c.a(j * 45.0F));
/*     */             break;
/*     */           
/*     */           case 6:
/* 510 */             b(dfm1, aqi, f4);
/*     */             
/* 512 */             dfm1.a((j * -0.5F), 0.699999988079071D, 0.10000000149011612D);
/* 513 */             dfm1.a(g.b.a(-55.0F));
/* 514 */             dfm1.a(g.d.a(j * 35.3F));
/* 515 */             dfm1.a(g.f.a(j * -9.785F));
/*     */             
/* 517 */             f5 = bmb1.k() - this.c.s.dZ() - f1 + 1.0F;
/* 518 */             f6 = f5 / 10.0F;
/* 519 */             if (f6 > 1.0F) {
/* 520 */               f6 = 1.0F;
/*     */             }
/* 522 */             if (f6 > 0.1F) {
/* 523 */               float f7 = afm.a((f5 - 0.1F) * 1.3F);
/* 524 */               float f8 = f6 - 0.1F;
/* 525 */               float f9 = f7 * f8;
/* 526 */               dfm1.a((f9 * 0.0F), (f9 * 0.004F), (f9 * 0.0F));
/*     */             } 
/* 528 */             dfm1.a(0.0D, 0.0D, (f6 * 0.2F));
/*     */             
/* 530 */             dfm1.a(1.0F, 1.0F, 1.0F + f6 * 0.2F);
/* 531 */             dfm1.a(g.c.a(j * 45.0F));
/*     */             break;
/*     */         } 
/*     */       
/* 535 */       } else if (☃.dR()) {
/* 536 */         b(dfm1, aqi, f4);
/* 537 */         int j = bool1 ? 1 : -1;
/* 538 */         dfm1.a((j * -0.4F), 0.800000011920929D, 0.30000001192092896D);
/* 539 */         dfm1.a(g.d.a(j * 65.0F));
/* 540 */         dfm1.a(g.f.a(j * -85.0F));
/*     */       } else {
/* 542 */         float f5 = -0.4F * afm.a(afm.c(f3) * 3.1415927F);
/* 543 */         float f6 = 0.2F * afm.a(afm.c(f3) * 6.2831855F);
/* 544 */         float f7 = -0.2F * afm.a(f3 * 3.1415927F);
/* 545 */         int j = bool1 ? 1 : -1;
/* 546 */         dfm1.a((j * f5), f6, f7);
/* 547 */         b(dfm1, aqi, f4);
/* 548 */         a(dfm1, aqi, f3);
/*     */       } 
/*     */       
/* 551 */       a(☃, bmb1, bool1 ? ebm.b.e : ebm.b.d, !bool1, dfm1, eag1, i);
/*     */     } 
/*     */     
/* 554 */     dfm1.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 559 */     this.g = this.f;
/* 560 */     this.i = this.h;
/*     */     
/* 562 */     dzm ☃ = this.c.s;
/* 563 */     bmb bmb1 = ☃.dD();
/* 564 */     bmb bmb2 = ☃.dE();
/*     */     
/* 566 */     if (bmb.b(this.d, bmb1)) {
/* 567 */       this.d = bmb1;
/*     */     }
/* 569 */     if (bmb.b(this.e, bmb2)) {
/* 570 */       this.e = bmb2;
/*     */     }
/*     */     
/* 573 */     if (☃.L()) {
/* 574 */       this.f = afm.a(this.f - 0.4F, 0.0F, 1.0F);
/* 575 */       this.h = afm.a(this.h - 0.4F, 0.0F, 1.0F);
/*     */     } else {
/* 577 */       float f = ☃.u(1.0F);
/* 578 */       this.f += afm.a(((this.d == bmb1) ? (f * f * f) : 0.0F) - this.f, -0.4F, 0.4F);
/* 579 */       this.h += afm.a(((this.e == bmb2) ? true : false) - this.h, -0.4F, 0.4F);
/*     */     } 
/*     */     
/* 582 */     if (this.f < 0.1F) {
/* 583 */       this.d = bmb1;
/*     */     }
/*     */     
/* 586 */     if (this.h < 0.1F) {
/* 587 */       this.e = bmb2;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aot ☃) {
/* 592 */     if (☃ == aot.a) {
/* 593 */       this.f = 0.0F;
/*     */     } else {
/* 595 */       this.h = 0.0F;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */