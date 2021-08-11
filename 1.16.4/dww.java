/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
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
/*     */ public class dww
/*     */ {
/*  51 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final djz b;
/*     */   
/*     */   private final dwu c;
/*  56 */   private fx d = new fx(-1, -1, -1);
/*  57 */   private bmb e = bmb.b;
/*     */   private float f;
/*     */   private float g;
/*     */   private int h;
/*     */   private boolean i;
/*  62 */   private bru j = bru.b;
/*  63 */   private bru k = bru.a;
/*  64 */   private final Object2ObjectLinkedOpenHashMap<Pair<fx, sz.a>, dcn> l = new Object2ObjectLinkedOpenHashMap();
/*     */   private int m;
/*     */   
/*     */   public dww(djz ☃, dwu dwu1) {
/*  68 */     this.b = ☃;
/*  69 */     this.c = dwu1;
/*     */   }
/*     */   
/*     */   public void a(bfw ☃) {
/*  73 */     this.j.a(☃.bC);
/*     */   }
/*     */   
/*     */   public void a(bru ☃) {
/*  77 */     this.k = ☃;
/*     */   }
/*     */   
/*     */   public void b(bru ☃) {
/*  81 */     if (☃ != this.j) {
/*  82 */       this.k = this.j;
/*     */     }
/*  84 */     this.j = ☃;
/*  85 */     this.j.a(this.b.s.bC);
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  89 */     return this.j.f();
/*     */   }
/*     */   
/*     */   public boolean a(fx ☃) {
/*  93 */     if (this.b.s.a(this.b.r, ☃, this.j)) {
/*  94 */       return false;
/*     */     }
/*     */     
/*  97 */     brx brx = this.b.r;
/*  98 */     ceh ceh = brx.d_(☃);
/*  99 */     if (!this.b.s.dD().b().a(ceh, brx, ☃, this.b.s)) {
/* 100 */       return false;
/*     */     }
/*     */     
/* 103 */     buo buo = ceh.b();
/*     */     
/* 105 */     if ((buo instanceof bvi || buo instanceof caq || buo instanceof bxr) && !this.b.s.eV()) {
/* 106 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 110 */     if (ceh.g()) {
/* 111 */       return false;
/*     */     }
/*     */     
/* 114 */     buo.a(brx, ☃, ceh, this.b.s);
/* 115 */     cux cux = brx.b(☃);
/*     */     
/* 117 */     boolean bool = brx.a(☃, cux.g(), 11);
/* 118 */     if (bool) {
/* 119 */       buo.a(brx, ☃, ceh);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean a(fx ☃, gc gc1) {
/* 129 */     if (this.b.s.a(this.b.r, ☃, this.j)) {
/* 130 */       return false;
/*     */     }
/*     */     
/* 133 */     if (!this.b.r.f().a(☃)) {
/* 134 */       return false;
/*     */     }
/*     */     
/* 137 */     if (this.j.e()) {
/* 138 */       ceh ceh = this.b.r.d_(☃);
/* 139 */       this.b.ao().a(this.b.r, ☃, ceh, 1.0F);
/*     */ 
/*     */ 
/*     */       
/* 143 */       a(sz.a.a, ☃, gc1);
/* 144 */       a(☃);
/* 145 */       this.h = 5;
/* 146 */     } else if (!this.i || !b(☃)) {
/* 147 */       if (this.i)
/*     */       {
/*     */ 
/*     */         
/* 151 */         a(sz.a.b, this.d, gc1);
/*     */       }
/* 153 */       ceh ceh = this.b.r.d_(☃);
/* 154 */       this.b.ao().a(this.b.r, ☃, ceh, 0.0F);
/*     */ 
/*     */ 
/*     */       
/* 158 */       a(sz.a.a, ☃, gc1);
/*     */       
/* 160 */       boolean bool = !ceh.g();
/* 161 */       if (bool && this.f == 0.0F) {
/* 162 */         ceh.a(this.b.r, ☃, this.b.s);
/*     */       }
/* 164 */       if (bool && ceh.a(this.b.s, this.b.s.l, ☃) >= 1.0F) {
/* 165 */         a(☃);
/*     */       } else {
/* 167 */         this.i = true;
/* 168 */         this.d = ☃;
/* 169 */         this.e = this.b.s.dD();
/* 170 */         this.f = 0.0F;
/* 171 */         this.g = 0.0F;
/* 172 */         this.b.r.a(this.b.s.Y(), this.d, (int)(this.f * 10.0F) - 1);
/*     */       } 
/*     */     } 
/* 175 */     return true;
/*     */   }
/*     */   
/*     */   public void b() {
/* 179 */     if (this.i) {
/* 180 */       ceh ☃ = this.b.r.d_(this.d);
/* 181 */       this.b.ao().a(this.b.r, this.d, ☃, -1.0F);
/*     */ 
/*     */ 
/*     */       
/* 185 */       a(sz.a.b, this.d, gc.a);
/* 186 */       this.i = false;
/* 187 */       this.f = 0.0F;
/* 188 */       this.b.r.a(this.b.s.Y(), this.d, -1);
/* 189 */       this.b.s.eS();
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(fx ☃, gc gc1) {
/* 194 */     n();
/*     */     
/* 196 */     if (this.h > 0) {
/* 197 */       this.h--;
/* 198 */       return true;
/*     */     } 
/*     */     
/* 201 */     if (this.j.e() && this.b.r.f().a(☃)) {
/* 202 */       this.h = 5;
/* 203 */       ceh ceh = this.b.r.d_(☃);
/* 204 */       this.b.ao().a(this.b.r, ☃, ceh, 1.0F);
/*     */ 
/*     */ 
/*     */       
/* 208 */       a(sz.a.a, ☃, gc1);
/* 209 */       a(☃);
/* 210 */       return true;
/*     */     } 
/*     */     
/* 213 */     if (b(☃)) {
/* 214 */       ceh ceh = this.b.r.d_(☃);
/*     */       
/* 216 */       if (ceh.g()) {
/* 217 */         this.i = false;
/* 218 */         return false;
/*     */       } 
/*     */       
/* 221 */       this.f += ceh.a(this.b.s, this.b.s.l, ☃);
/*     */       
/* 223 */       if (this.g % 4.0F == 0.0F) {
/* 224 */         cae cae = ceh.o();
/* 225 */         this.b.W().a(new emp(cae
/* 226 */               .f(), adr.e, (cae.a() + 1.0F) / 8.0F, cae.b() * 0.5F, ☃));
/*     */       } 
/*     */ 
/*     */       
/* 230 */       this.g++;
/*     */       
/* 232 */       this.b.ao().a(this.b.r, ☃, ceh, afm.a(this.f, 0.0F, 1.0F));
/* 233 */       if (this.f >= 1.0F) {
/* 234 */         this.i = false;
/*     */ 
/*     */ 
/*     */         
/* 238 */         a(sz.a.c, ☃, gc1);
/* 239 */         a(☃);
/* 240 */         this.f = 0.0F;
/* 241 */         this.g = 0.0F;
/* 242 */         this.h = 5;
/*     */       } 
/*     */       
/* 245 */       this.b.r.a(this.b.s.Y(), this.d, (int)(this.f * 10.0F) - 1);
/*     */     } else {
/* 247 */       return a(☃, gc1);
/*     */     } 
/* 249 */     return true;
/*     */   }
/*     */   
/*     */   public float c() {
/* 253 */     if (this.j.e()) {
/* 254 */       return 5.0F;
/*     */     }
/* 256 */     return 4.5F;
/*     */   }
/*     */   
/*     */   public void d() {
/* 260 */     n();
/*     */     
/* 262 */     if (this.c.a().h()) {
/* 263 */       this.c.a().a();
/*     */     } else {
/* 265 */       this.c.a().m();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean b(fx ☃) {
/* 272 */     bmb bmb1 = this.b.s.dD();
/* 273 */     boolean bool = (this.e.a() && bmb1.a());
/* 274 */     if (!this.e.a() && !bmb1.a()) {
/* 275 */       bool = (bmb1.b() == this.e.b() && bmb.a(bmb1, this.e) && (bmb1.e() || bmb1.g() == this.e.g()));
/*     */     }
/* 277 */     return (☃.equals(this.d) && bool);
/*     */   }
/*     */   
/*     */   private void n() {
/* 281 */     int ☃ = this.b.s.bm.d;
/* 282 */     if (☃ != this.m) {
/* 283 */       this.m = ☃;
/* 284 */       this.c.a(new tj(this.m));
/*     */     } 
/*     */   }
/*     */   public aou a(dzm ☃, dwt dwt1, aot aot1, dcj dcj1) {
/*     */     aou aou;
/* 289 */     n();
/*     */     
/* 291 */     fx fx1 = dcj1.a();
/*     */     
/* 293 */     if (!this.b.r.f().a(fx1)) {
/* 294 */       return aou.d;
/*     */     }
/*     */     
/* 297 */     bmb bmb1 = ☃.b(aot1);
/*     */     
/* 299 */     if (this.j == bru.e) {
/* 300 */       this.c.a(new ts(aot1, dcj1));
/* 301 */       return aou.a;
/*     */     } 
/*     */ 
/*     */     
/* 305 */     boolean bool1 = (!☃.dD().a() || !☃.dE().a());
/* 306 */     boolean bool2 = (☃.eq() && bool1);
/*     */     
/* 308 */     if (!bool2) {
/* 309 */       aou = dwt1.d_(fx1).a(dwt1, ☃, aot1, dcj1);
/* 310 */       if (aou.a()) {
/* 311 */         this.c.a(new ts(aot1, dcj1));
/* 312 */         return aou;
/*     */       } 
/*     */     } 
/*     */     
/* 316 */     this.c.a(new ts(aot1, dcj1));
/*     */     
/* 318 */     if (bmb1.a() || ☃.eT().a(bmb1.b())) {
/* 319 */       return aou.c;
/*     */     }
/*     */ 
/*     */     
/* 323 */     boa boa = new boa(☃, aot1, dcj1);
/*     */     
/* 325 */     if (this.j.e()) {
/*     */       
/* 327 */       int i = bmb1.E();
/* 328 */       aou = bmb1.a(boa);
/* 329 */       bmb1.e(i);
/*     */     } else {
/* 331 */       aou = bmb1.a(boa);
/*     */     } 
/* 333 */     return aou;
/*     */   }
/*     */   
/*     */   public aou a(bfw ☃, brx brx1, aot aot1) {
/* 337 */     if (this.j == bru.e) {
/* 338 */       return aou.c;
/*     */     }
/* 340 */     n();
/* 341 */     this.c.a(new tt(aot1));
/*     */     
/* 343 */     bmb bmb1 = ☃.b(aot1);
/* 344 */     if (☃.eT().a(bmb1.b())) {
/* 345 */       return aou.c;
/*     */     }
/*     */     
/* 348 */     int i = bmb1.E();
/* 349 */     aov<bmb> aov = bmb1.a(brx1, ☃, aot1);
/*     */ 
/*     */     
/* 352 */     bmb bmb2 = aov.b();
/* 353 */     if (bmb2 != bmb1) {
/* 354 */       ☃.a(aot1, bmb2);
/*     */     }
/* 356 */     return aov.a();
/*     */   }
/*     */   
/*     */   public dzm a(dwt ☃, aeb aeb1, djm djm1) {
/* 360 */     return a(☃, aeb1, djm1, false, false);
/*     */   }
/*     */   
/*     */   public dzm a(dwt ☃, aeb aeb1, djm djm1, boolean bool1, boolean bool2) {
/* 364 */     return new dzm(this.b, ☃, this.c, aeb1, djm1, bool1, bool2);
/*     */   }
/*     */   
/*     */   public void a(bfw ☃, aqa aqa1) {
/* 368 */     n();
/* 369 */     this.c.a(new sp(aqa1, ☃.bu()));
/* 370 */     if (this.j != bru.e) {
/* 371 */       ☃.f(aqa1);
/* 372 */       ☃.eS();
/*     */     } 
/*     */   }
/*     */   
/*     */   public aou a(bfw ☃, aqa aqa1, aot aot1) {
/* 377 */     n();
/* 378 */     this.c.a(new sp(aqa1, aot1, ☃.bu()));
/* 379 */     if (this.j == bru.e) {
/* 380 */       return aou.c;
/*     */     }
/* 382 */     return ☃.a(aqa1, aot1);
/*     */   }
/*     */   
/*     */   public aou a(bfw ☃, aqa aqa1, dck dck1, aot aot1) {
/* 386 */     n();
/* 387 */     dcn dcn = dck1.e().a(aqa1.cD(), aqa1.cE(), aqa1.cH());
/* 388 */     this.c.a(new sp(aqa1, aot1, dcn, ☃.bu()));
/* 389 */     if (this.j == bru.e) {
/* 390 */       return aou.c;
/*     */     }
/* 392 */     return aqa1.a(☃, dcn, aot1);
/*     */   }
/*     */   
/*     */   public bmb a(int ☃, int i, int j, bik bik1, bfw bfw1) {
/* 396 */     short s = bfw1.bp.a(bfw1.bm);
/*     */     
/* 398 */     bmb bmb1 = bfw1.bp.a(i, j, bik1, bfw1);
/* 399 */     this.c.a(new sk(☃, i, j, bik1, bmb1, s));
/*     */     
/* 401 */     return bmb1;
/*     */   }
/*     */   
/*     */   public void a(int ☃, boq<?> boq1, boolean bool) {
/* 405 */     this.c.a(new sx(☃, boq1, bool));
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/* 409 */     this.c.a(new sj(☃, i));
/*     */   }
/*     */   
/*     */   public void a(bmb ☃, int i) {
/* 413 */     if (this.j.e()) {
/* 414 */       this.c.a(new tm(i, ☃));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bmb ☃) {
/* 419 */     if (this.j.e() && !☃.a()) {
/* 420 */       this.c.a(new tm(-1, ☃));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(bfw ☃) {
/* 425 */     n();
/* 426 */     this.c.a(new sz(sz.a.f, fx.b, gc.a));
/* 427 */     ☃.eb();
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 431 */     return this.j.f();
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 435 */     return !this.j.e();
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 439 */     return this.j.e();
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 443 */     return this.j.e();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 453 */     return (this.b.s.br() && this.b.s.ct() instanceof bbb);
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 457 */     return (this.j == bru.e);
/*     */   }
/*     */   
/*     */   public bru k() {
/* 461 */     return this.k;
/*     */   }
/*     */   
/*     */   public bru l() {
/* 465 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 469 */     return this.i;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 473 */     this.c.a(new sw(☃));
/*     */   }
/*     */   
/*     */   private void a(sz.a ☃, fx fx1, gc gc1) {
/* 477 */     dzm dzm = this.b.s;
/* 478 */     this.l.put(Pair.of(fx1, ☃), dzm.cA());
/* 479 */     this.c.a(new sz(☃, fx1, gc1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dwt ☃, fx fx1, ceh ceh1, sz.a a1, boolean bool) {
/* 486 */     dcn dcn = (dcn)this.l.remove(Pair.of(fx1, a1));
/* 487 */     ceh ceh2 = ☃.d_(fx1);
/* 488 */     if (dcn == null || !bool || (a1 != sz.a.a && ceh2 != ceh1))
/*     */     {
/*     */ 
/*     */       
/* 492 */       if (ceh2 != ceh1) {
/* 493 */         ☃.b(fx1, ceh1);
/* 494 */         bfw bfw = this.b.s;
/* 495 */         if (dcn != null && ☃ == bfw.l && bfw.a(fx1, ceh1)) {
/* 496 */           bfw.f(dcn.b, dcn.c, dcn.d);
/*     */         }
/*     */       } 
/*     */     }
/* 500 */     while (this.l.size() >= 50) {
/* 501 */       Pair<fx, sz.a> pair = (Pair<fx, sz.a>)this.l.firstKey();
/* 502 */       this.l.removeFirst();
/* 503 */       a.error("Too many unacked block actions, dropping " + pair);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dww.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */