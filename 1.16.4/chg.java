/*     */ import com.google.common.collect.ContiguousSet;
/*     */ import com.google.common.collect.DiscreteDomain;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Range;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
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
/*     */ public class chg
/*     */ {
/*  65 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   private static final Predicate<aqa> b = aqd.a.and(aqd.a(0.0D, 128.0D, 0.0D, 192.0D));
/*     */   
/*  76 */   private final aad c = (aad)(new aad(new of("entity.minecraft.ender_dragon"), aok.a.a, aok.b.a)).b(true).c(true);
/*     */   private final aag d;
/*  78 */   private final List<Integer> e = Lists.newArrayList();
/*     */   private final cem f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private boolean k;
/*     */   private boolean l;
/*     */   private UUID m;
/*     */   private boolean n = true;
/*     */   private fx o;
/*     */   private chf p;
/*     */   private int q;
/*     */   private List<bbq> r;
/*     */   
/*     */   public chg(aag ☃, long l, md md1) {
/*  94 */     this.d = ☃;
/*  95 */     if (md1.c("DragonKilled", 99)) {
/*  96 */       if (md1.b("Dragon")) {
/*  97 */         this.m = md1.a("Dragon");
/*     */       }
/*  99 */       this.k = md1.q("DragonKilled");
/* 100 */       this.l = md1.q("PreviouslyKilled");
/* 101 */       if (md1.q("IsRespawning")) {
/* 102 */         this.p = chf.a;
/*     */       }
/*     */       
/* 105 */       if (md1.c("ExitPortalLocation", 10)) {
/* 106 */         this.o = mp.b(md1.p("ExitPortalLocation"));
/*     */       }
/*     */     } else {
/* 109 */       this.k = true;
/* 110 */       this.l = true;
/*     */     } 
/*     */     
/* 113 */     if (md1.c("Gateways", 9)) {
/* 114 */       mj mj = md1.d("Gateways", 3);
/* 115 */       for (int i = 0; i < mj.size(); i++) {
/* 116 */         this.e.add(Integer.valueOf(mj.e(i)));
/*     */       }
/*     */     } else {
/* 119 */       this.e.addAll((Collection<? extends Integer>)ContiguousSet.create(Range.closedOpen(Integer.valueOf(0), Integer.valueOf(20)), DiscreteDomain.integers()));
/* 120 */       Collections.shuffle(this.e, new Random(l));
/*     */     } 
/*     */     
/* 123 */     this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 170 */       .f = cen.a().a(new String[] { "       ", "       ", "       ", "   #   ", "       ", "       ", "       " }).a(new String[] { "       ", "       ", "       ", "   #   ", "       ", "       ", "       " }).a(new String[] { "       ", "       ", "       ", "   #   ", "       ", "       ", "       " }).a(new String[] { "  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  " }).a(new String[] { "       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       " }).a('#', cel.a(ceq.a(bup.z))).b();
/*     */   }
/*     */   
/*     */   public md a() {
/* 174 */     md ☃ = new md();
/*     */     
/* 176 */     if (this.m != null) {
/* 177 */       ☃.a("Dragon", this.m);
/*     */     }
/*     */     
/* 180 */     ☃.a("DragonKilled", this.k);
/* 181 */     ☃.a("PreviouslyKilled", this.l);
/*     */     
/* 183 */     if (this.o != null) {
/* 184 */       ☃.a("ExitPortalLocation", mp.a(this.o));
/*     */     }
/*     */     
/* 187 */     mj mj = new mj();
/* 188 */     for (Iterator<Integer> iterator = this.e.iterator(); iterator.hasNext(); ) { int i = ((Integer)iterator.next()).intValue();
/* 189 */       mj.add(mi.a(i)); }
/*     */     
/* 191 */     ☃.a("Gateways", mj);
/*     */     
/* 193 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b() {
/* 197 */     this.c.d(!this.k);
/*     */     
/* 199 */     if (++this.j >= 20) {
/* 200 */       l();
/* 201 */       this.j = 0;
/*     */     } 
/*     */     
/* 204 */     if (!this.c.h().isEmpty()) {
/* 205 */       this.d.i().a(aal.b, new brd(0, 0), 9, afx.a);
/*     */       
/* 207 */       boolean ☃ = k();
/*     */       
/* 209 */       if (this.n && ☃) {
/* 210 */         g();
/* 211 */         this.n = false;
/*     */       } 
/*     */       
/* 214 */       if (this.p != null) {
/* 215 */         if (this.r == null && ☃) {
/* 216 */           this.p = null;
/* 217 */           e();
/*     */         } 
/* 219 */         this.p.a(this.d, this, this.r, this.q++, this.o);
/*     */       } 
/*     */       
/* 222 */       if (!this.k) {
/* 223 */         if ((this.m == null || ++this.g >= 1200) && ☃) {
/* 224 */           h();
/* 225 */           this.g = 0;
/*     */         } 
/*     */         
/* 228 */         if (++this.i >= 100 && ☃) {
/* 229 */           m();
/* 230 */           this.i = 0;
/*     */         } 
/*     */       } 
/*     */     } else {
/* 234 */       this.d.i().b(aal.b, new brd(0, 0), 9, afx.a);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void g() {
/* 239 */     a.info("Scanning for legacy world dragon fight...");
/* 240 */     boolean ☃ = i();
/* 241 */     if (☃) {
/* 242 */       a.info("Found that the dragon has been killed in this world already.");
/* 243 */       this.l = true;
/*     */     } else {
/* 245 */       a.info("Found that the dragon has not yet been killed in this world.");
/* 246 */       this.l = false;
/* 247 */       if (j() == null) {
/* 248 */         a(false);
/*     */       }
/*     */     } 
/*     */     
/* 252 */     List<bbr> list = this.d.g();
/* 253 */     if (list.isEmpty()) {
/* 254 */       this.k = true;
/*     */     } else {
/* 256 */       bbr bbr = list.get(0);
/* 257 */       this.m = bbr.bS();
/* 258 */       a.info("Found that there's a dragon still alive ({})", bbr);
/* 259 */       this.k = false;
/*     */       
/* 261 */       if (!☃) {
/* 262 */         a.info("But we didn't have a portal, let's remove it.");
/* 263 */         bbr.ad();
/* 264 */         this.m = null;
/*     */       } 
/*     */     } 
/*     */     
/* 268 */     if (!this.l && this.k)
/*     */     {
/* 270 */       this.k = false;
/*     */     }
/*     */   }
/*     */   
/*     */   private void h() {
/* 275 */     List<bbr> ☃ = this.d.g();
/* 276 */     if (☃.isEmpty()) {
/* 277 */       a.debug("Haven't seen the dragon, respawning it");
/* 278 */       o();
/*     */     } else {
/* 280 */       a.debug("Haven't seen our dragon, but found another one to use.");
/* 281 */       this.m = ((bbr)☃.get(0)).bS();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(chf ☃) {
/* 286 */     if (this.p == null) {
/* 287 */       throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
/*     */     }
/*     */     
/* 290 */     this.q = 0;
/* 291 */     if (☃ == chf.e) {
/* 292 */       this.p = null;
/* 293 */       this.k = false;
/* 294 */       bbr bbr = o();
/*     */       
/* 296 */       for (aah aah : this.c.h()) {
/* 297 */         ac.n.a(aah, bbr);
/*     */       }
/*     */     } else {
/* 300 */       this.p = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean i() {
/* 305 */     for (int ☃ = -8; ☃ <= 8; ☃++) {
/* 306 */       for (int i = -8; i <= 8; i++) {
/* 307 */         cgh cgh = this.d.d(☃, i);
/* 308 */         for (ccj ccj : cgh.y().values()) {
/* 309 */           if (ccj instanceof cdl) {
/* 310 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 316 */     return false;
/*     */   }
/*     */   @Nullable
/*     */   private cem.b j() {
/*     */     int ☃;
/* 321 */     for (☃ = -8; ☃ <= 8; ☃++) {
/* 322 */       for (int j = -8; j <= 8; j++) {
/* 323 */         cgh cgh = this.d.d(☃, j);
/* 324 */         for (ccj ccj : cgh.y().values()) {
/* 325 */           if (ccj instanceof cdl) {
/* 326 */             cem.b b = this.f.a(this.d, ccj.o());
/* 327 */             if (b != null) {
/* 328 */               fx fx1 = b.a(3, 3, 3).d();
/* 329 */               if (this.o == null && fx1.u() == 0 && fx1.w() == 0) {
/* 330 */                 this.o = fx1;
/*     */               }
/* 332 */               return b;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 339 */     ☃ = this.d.a(chn.a.e, cjk.a).v();
/*     */     
/* 341 */     for (int i = ☃; i >= 0; i--) {
/* 342 */       cem.b b = this.f.a(this.d, new fx(cjk.a.u(), i, cjk.a.w()));
/* 343 */       if (b != null) {
/* 344 */         if (this.o == null) {
/* 345 */           this.o = b.a(3, 3, 3).d();
/*     */         }
/* 347 */         return b;
/*     */       } 
/*     */     } 
/*     */     
/* 351 */     return null;
/*     */   }
/*     */   
/*     */   private boolean k() {
/* 355 */     for (int ☃ = -8; ☃ <= 8; ☃++) {
/* 356 */       for (int i = 8; i <= 8; i++) {
/* 357 */         cfw cfw = this.d.a(☃, i, cga.m, false);
/* 358 */         if (!(cfw instanceof cgh)) {
/* 359 */           return false;
/*     */         }
/* 361 */         zr.b b = ((cgh)cfw).u();
/* 362 */         if (!b.a(zr.b.c)) {
/* 363 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 367 */     return true;
/*     */   }
/*     */   
/*     */   private void l() {
/* 371 */     Set<aah> ☃ = Sets.newHashSet();
/* 372 */     for (aah aah : this.d.a((Predicate)b)) {
/* 373 */       this.c.a(aah);
/* 374 */       ☃.add(aah);
/*     */     } 
/* 376 */     Set<aah> set1 = Sets.newHashSet(this.c.h());
/* 377 */     set1.removeAll(☃);
/* 378 */     for (aah aah : set1) {
/* 379 */       this.c.b(aah);
/*     */     }
/*     */   }
/*     */   
/*     */   private void m() {
/* 384 */     this.i = 0;
/* 385 */     this.h = 0;
/*     */     
/* 387 */     for (ckx.a ☃ : ckx.a(this.d)) {
/* 388 */       this.h += this.d.<bbq>a(bbq.class, ☃.f()).size();
/*     */     }
/*     */     
/* 391 */     a.debug("Found {} end crystals still alive", Integer.valueOf(this.h));
/*     */   }
/*     */   
/*     */   public void a(bbr ☃) {
/* 395 */     if (☃.bS().equals(this.m)) {
/* 396 */       this.c.a(0.0F);
/* 397 */       this.c.d(false);
/* 398 */       a(true);
/* 399 */       n();
/*     */       
/* 401 */       if (!this.l) {
/* 402 */         this.d.a(this.d.a(chn.a.e, cjk.a), bup.ef.n());
/*     */       }
/*     */       
/* 405 */       this.l = true;
/* 406 */       this.k = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void n() {
/* 411 */     if (this.e.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 415 */     int ☃ = ((Integer)this.e.remove(this.e.size() - 1)).intValue();
/* 416 */     int i = afm.c(96.0D * Math.cos(2.0D * (-3.141592653589793D + 0.15707963267948966D * ☃)));
/* 417 */     int j = afm.c(96.0D * Math.sin(2.0D * (-3.141592653589793D + 0.15707963267948966D * ☃)));
/* 418 */     a(new fx(i, 75, j));
/*     */   }
/*     */   
/*     */   private void a(fx ☃) {
/* 422 */     this.d.c(3000, ☃, 0);
/* 423 */     kh.c.a(this.d, this.d.i().g(), new Random(), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(boolean ☃) {
/* 428 */     cjk cjk = new cjk(☃);
/*     */     
/* 430 */     if (this.o == null) {
/* 431 */       this.o = this.d.a(chn.a.f, cjk.a).c();
/* 432 */       while (this.d.d_(this.o).a(bup.z) && this.o.v() > this.d.t_()) {
/* 433 */         this.o = this.o.c();
/*     */       }
/*     */     } 
/*     */     
/* 437 */     cjk.b(cma.k).a(this.d, this.d.i().g(), new Random(), this.o);
/*     */   }
/*     */   
/*     */   private bbr o() {
/* 441 */     this.d.n(new fx(0, 128, 0));
/* 442 */     bbr ☃ = aqe.t.a(this.d);
/* 443 */     ☃.eK().a(bch.a);
/* 444 */     ☃.b(0.0D, 128.0D, 0.0D, this.d.t.nextFloat() * 360.0F, 0.0F);
/* 445 */     this.d.c(☃);
/* 446 */     this.m = ☃.bS();
/* 447 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(bbr ☃) {
/* 451 */     if (☃.bS().equals(this.m)) {
/* 452 */       this.c.a(☃.dk() / ☃.dx());
/* 453 */       this.g = 0;
/* 454 */       if (☃.S()) {
/* 455 */         this.c.a(☃.d());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int c() {
/* 461 */     return this.h;
/*     */   }
/*     */   
/*     */   public void a(bbq ☃, apk apk1) {
/* 465 */     if (this.p != null && this.r.contains(☃)) {
/* 466 */       a.debug("Aborting respawn sequence");
/* 467 */       this.p = null;
/* 468 */       this.q = 0;
/* 469 */       f();
/* 470 */       a(true);
/*     */     } else {
/* 472 */       m();
/* 473 */       aqa aqa = this.d.a(this.m);
/* 474 */       if (aqa instanceof bbr) {
/* 475 */         ((bbr)aqa).a(☃, ☃.cB(), apk1);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 481 */     return this.l;
/*     */   }
/*     */   
/*     */   public void e() {
/* 485 */     if (this.k && this.p == null) {
/* 486 */       fx ☃ = this.o;
/* 487 */       if (☃ == null) {
/* 488 */         a.debug("Tried to respawn, but need to find the portal first.");
/* 489 */         cem.b b = j();
/* 490 */         if (b == null) {
/* 491 */           a.debug("Couldn't find a portal, so we made one.");
/* 492 */           a(true);
/*     */         } else {
/* 494 */           a.debug("Found the exit portal & temporarily using it.");
/*     */         } 
/* 496 */         ☃ = this.o;
/*     */       } 
/*     */       
/* 499 */       List<bbq> list = Lists.newArrayList();
/* 500 */       fx fx1 = ☃.b(1);
/* 501 */       for (gc gc : gc.c.a) {
/* 502 */         List<bbq> list1 = this.d.a(bbq.class, new dci(fx1.a(gc, 2)));
/* 503 */         if (list1.isEmpty()) {
/*     */           return;
/*     */         }
/* 506 */         list.addAll(list1);
/*     */       } 
/*     */       
/* 509 */       a.debug("Found all crystals, respawning dragon.");
/* 510 */       a(list);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<bbq> ☃) {
/* 515 */     if (this.k && this.p == null) {
/* 516 */       cem.b b = j();
/* 517 */       while (b != null) {
/* 518 */         for (int i = 0; i < this.f.c(); i++) {
/* 519 */           for (int j = 0; j < this.f.b(); j++) {
/* 520 */             for (int k = 0; k < this.f.a(); k++) {
/* 521 */               cel cel = b.a(i, j, k);
/* 522 */               if (cel.a().a(bup.z) || cel.a().a(bup.ec)) {
/* 523 */                 this.d.a(cel.d(), bup.ee.n());
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/* 528 */         b = j();
/*     */       } 
/*     */       
/* 531 */       this.p = chf.a;
/* 532 */       this.q = 0;
/* 533 */       a(false);
/* 534 */       this.r = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void f() {
/* 539 */     for (ckx.a ☃ : ckx.a(this.d)) {
/* 540 */       List<bbq> list = this.d.a(bbq.class, ☃.f());
/* 541 */       for (bbq bbq : list) {
/* 542 */         bbq.m(false);
/* 543 */         bbq.a((fx)null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */