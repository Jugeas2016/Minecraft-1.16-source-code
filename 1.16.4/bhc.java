/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bhc
/*     */   extends bdr
/*     */ {
/*  48 */   protected static final us<Boolean> c = uv.a((Class)bhc.class, uu.i);
/*     */   static {
/*  50 */     b = (☃ -> (!☃.p() && ☃.aX() && bmb.b(☃.g(), bhb.s())));
/*     */   }
/*     */   
/*     */   private static final Predicate<bcv> b;
/*     */   @Nullable
/*     */   protected bhb d;
/*     */   private int bo;
/*     */   private boolean bp;
/*     */   private int bq;
/*     */   
/*     */   protected bhc(aqe<? extends bhc> ☃, brx brx1) {
/*  61 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  66 */     super.o();
/*  67 */     this.bk.a(1, new b<>(this, this));
/*  68 */     this.bk.a(3, new awq<>(this));
/*  69 */     this.bk.a(4, new d(this, 1.0499999523162842D, 1));
/*  70 */     this.bk.a(5, new c(this, this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  75 */     super.e();
/*     */     
/*  77 */     this.R.a(c, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean eZ() {
/*  83 */     return this.bp;
/*     */   }
/*     */   
/*     */   public void w(boolean ☃) {
/*  87 */     this.bp = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/*  95 */     if (this.l instanceof aag && aX()) {
/*  96 */       bhb ☃ = fa();
/*  97 */       if (eZ()) {
/*  98 */         if (☃ == null) {
/*  99 */           if (this.l.T() % 20L == 0L) {
/* 100 */             bhb bhb1 = ((aag)this.l).b_(cB());
/* 101 */             if (bhb1 != null && bhd.a(this, bhb1)) {
/* 102 */               bhb1.a(bhb1.k(), this, null, true);
/*     */             }
/*     */           } 
/*     */         } else {
/*     */           
/* 107 */           aqm aqm = A();
/* 108 */           if (aqm != null && (aqm.X() == aqe.bc || aqm.X() == aqe.K)) {
/* 109 */             this.aI = 0;
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/* 114 */     super.k();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void eQ() {
/* 120 */     this.aI += 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apk ☃) {
/* 125 */     if (this.l instanceof aag) {
/* 126 */       aqa aqa = ☃.k();
/* 127 */       bhb bhb1 = fa();
/* 128 */       if (bhb1 != null) {
/* 129 */         if (eS()) {
/* 130 */           bhb1.c(fc());
/*     */         }
/*     */         
/* 133 */         if (aqa != null && aqa.X() == aqe.bc) {
/* 134 */           bhb1.a(aqa);
/*     */         }
/*     */         
/* 137 */         bhb1.a(this, false);
/*     */       } 
/*     */ 
/*     */       
/* 141 */       if (eS() && bhb1 == null && ((aag)this.l).b_(cB()) == null) {
/* 142 */         bmb bmb = b(aqf.f);
/*     */         
/* 144 */         bfw bfw = null;
/* 145 */         aqa aqa1 = aqa;
/* 146 */         if (aqa1 instanceof bfw) {
/* 147 */           bfw = (bfw)aqa1;
/* 148 */         } else if (aqa1 instanceof baz) {
/* 149 */           baz baz = (baz)aqa1;
/* 150 */           aqm aqm = baz.eN();
/* 151 */           if (baz.eK() && aqm instanceof bfw) {
/* 152 */             bfw = (bfw)aqm;
/*     */           }
/*     */         } 
/*     */         
/* 156 */         if (!bmb.a() && bmb.b(bmb, bhb.s()) && bfw != null) {
/* 157 */           apu apu1 = bfw.b(apw.E);
/* 158 */           int i = 1;
/*     */           
/* 160 */           if (apu1 != null) {
/* 161 */             i += apu1.c();
/* 162 */             bfw.c(apw.E);
/*     */           } else {
/*     */             
/* 165 */             i--;
/*     */           } 
/*     */           
/* 168 */           i = afm.a(i, 0, 4);
/*     */           
/* 170 */           apu apu2 = new apu(apw.E, 120000, i, false, false, true);
/* 171 */           if (!this.l.V().b(brt.x)) {
/* 172 */             bfw.c(apu2);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 178 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean eT() {
/* 183 */     return !fb();
/*     */   }
/*     */   
/*     */   public void a(@Nullable bhb ☃) {
/* 187 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bhb fa() {
/* 192 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean fb() {
/* 196 */     return (fa() != null && fa().v());
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 200 */     this.bo = ☃;
/*     */   }
/*     */   
/*     */   public int fc() {
/* 204 */     return this.bo;
/*     */   }
/*     */   
/*     */   public boolean fd() {
/* 208 */     return ((Boolean)this.R.<Boolean>a(c)).booleanValue();
/*     */   }
/*     */   
/*     */   public void x(boolean ☃) {
/* 212 */     this.R.b(c, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 217 */     super.b(☃);
/* 218 */     ☃.b("Wave", this.bo);
/* 219 */     ☃.a("CanJoinRaid", this.bp);
/* 220 */     if (this.d != null) {
/* 221 */       ☃.b("RaidId", this.d.u());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 227 */     super.a(☃);
/* 228 */     this.bo = ☃.h("Wave");
/* 229 */     this.bp = ☃.q("CanJoinRaid");
/* 230 */     if (☃.c("RaidId", 3)) {
/* 231 */       if (this.l instanceof aag) {
/* 232 */         this.d = ((aag)this.l).z().a(☃.h("RaidId"));
/*     */       }
/*     */       
/* 235 */       if (this.d != null) {
/* 236 */         this.d.a(this.bo, this, false);
/*     */         
/* 238 */         if (eS()) {
/* 239 */           this.d.a(this.bo, this);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(bcv ☃) {
/* 247 */     bmb bmb = ☃.g();
/* 248 */     boolean bool = (fb() && fa().b(fc()) != null);
/*     */ 
/*     */     
/* 251 */     if (fb() && !bool && bmb.b(bmb, bhb.s())) {
/* 252 */       aqf aqf = aqf.f;
/* 253 */       bmb bmb1 = b(aqf);
/* 254 */       double d = e(aqf);
/* 255 */       if (!bmb1.a() && Math.max(this.J.nextFloat() - 0.1F, 0.0F) < d) {
/* 256 */         a(bmb1);
/*     */       }
/* 258 */       a(☃);
/* 259 */       a(aqf, bmb);
/* 260 */       a(☃, bmb.E());
/* 261 */       ☃.ad();
/* 262 */       fa().a(fc(), this);
/* 263 */       t(true);
/*     */     } else {
/* 265 */       super.b(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 271 */     if (fa() == null) {
/* 272 */       return super.h(☃);
/*     */     }
/* 274 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean K() {
/* 279 */     return (super.K() || fa() != null);
/*     */   }
/*     */   
/*     */   public int fe() {
/* 283 */     return this.bq;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 287 */     this.bq = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 292 */     if (fb()) {
/* 293 */       fa().p();
/*     */     }
/* 295 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 302 */     w((X() != aqe.aS || aqp1 != aqp.a));
/*     */     
/* 304 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   public abstract void a(int paramInt, boolean paramBoolean);
/*     */   
/*     */   public abstract adp eL();
/*     */   
/*     */   public class b<T extends bhc> extends avv {
/*     */     public b(bhc ☃, T t) {
/* 313 */       this.b = t;
/* 314 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */     private final T b;
/*     */     
/*     */     public boolean a() {
/* 319 */       bhb ☃ = this.b.fa();
/* 320 */       if (!this.b.fb() || this.b.fa().a() || !this.b.eN() || bmb.b(this.b.b(aqf.f), bhb.s())) {
/* 321 */         return false;
/*     */       }
/*     */       
/* 324 */       bhc bhc1 = ☃.b(this.b.fc());
/* 325 */       if (bhc1 == null || !bhc1.aX()) {
/* 326 */         List<bcv> list = ((bhc)this.b).l.a(bcv.class, this.b.cc().c(16.0D, 8.0D, 16.0D), bhc.ff());
/* 327 */         if (!list.isEmpty()) {
/* 328 */           return this.b.x().a(list.get(0), 1.149999976158142D);
/*     */         }
/*     */       } 
/*     */       
/* 332 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 337 */       if (this.b.x().h().a(this.b.cA(), 1.414D)) {
/* 338 */         List<bcv> ☃ = ((bhc)this.b).l.a(bcv.class, this.b.cc().c(4.0D, 4.0D, 4.0D), bhc.ff());
/* 339 */         if (!☃.isEmpty())
/* 340 */           this.b.b(☃.get(0)); 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public class c
/*     */     extends avv {
/*     */     private final bhc b;
/*     */     
/*     */     c(bhc ☃, bhc bhc1) {
/* 350 */       this.b = bhc1;
/* 351 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 356 */       bhb ☃ = this.b.fa();
/* 357 */       return (this.b.aX() && this.b.A() == null && ☃ != null && ☃.f());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 362 */       this.b.x(true);
/* 363 */       super.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 368 */       this.b.x(false);
/* 369 */       super.d();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 374 */       if (!this.b.aA() && bhc.a(this.b).nextInt(100) == 0) {
/* 375 */         this.a.a(this.a.eL(), bhc.b(this.a), bhc.c(this.a));
/*     */       }
/*     */       
/* 378 */       if (!this.b.br() && bhc.d(this.b).nextInt(50) == 0) {
/* 379 */         this.b.v().a();
/*     */       }
/*     */       
/* 382 */       super.e();
/*     */     }
/*     */   }
/*     */   
/*     */   public class a extends avv {
/*     */     private final bhc c;
/*     */     private final float d;
/* 389 */     public final azg a = (new azg()).a(8.0D).d().a().b().c().e();
/*     */     
/*     */     public a(bhc ☃, bcy bcy1, float f) {
/* 392 */       this.c = bcy1;
/* 393 */       this.d = f * f;
/* 394 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 400 */       aqm ☃ = this.c.cZ();
/* 401 */       return (this.c.fa() == null && bhc.e(this.c) && this.c.A() != null && !this.c.eF() && (☃ == null || ☃.X() != aqe.bc));
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 406 */       super.c();
/* 407 */       this.c.x().o();
/*     */       
/* 409 */       List<bhc> ☃ = this.c.l.a(bhc.class, this.a, this.c, this.c.cc().c(8.0D, 8.0D, 8.0D));
/* 410 */       for (bhc bhc1 : ☃) {
/* 411 */         bhc1.h(this.c.A());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 417 */       super.d();
/*     */       
/* 419 */       aqm ☃ = this.c.A();
/* 420 */       if (☃ != null) {
/* 421 */         List<bhc> list = this.c.l.a(bhc.class, this.a, this.c, this.c.cc().c(8.0D, 8.0D, 8.0D));
/* 422 */         for (bhc bhc1 : list) {
/* 423 */           bhc1.h(☃);
/* 424 */           bhc1.s(true);
/*     */         } 
/* 426 */         this.c.s(true);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 432 */       aqm ☃ = this.c.A();
/* 433 */       if (☃ == null) {
/*     */         return;
/*     */       }
/*     */       
/* 437 */       if (this.c.h(☃) > this.d) {
/* 438 */         this.c.t().a(☃, 30.0F, 30.0F);
/*     */         
/* 440 */         if (bhc.f(this.c).nextInt(50) == 0) {
/* 441 */           this.c.F();
/*     */         }
/*     */       } else {
/* 444 */         this.c.s(true);
/*     */       } 
/*     */       
/* 447 */       super.e();
/*     */     }
/*     */   }
/*     */   
/*     */   static class d extends avv {
/*     */     private final bhc a;
/*     */     private final double b;
/*     */     private fx c;
/* 455 */     private final List<fx> d = Lists.newArrayList();
/*     */     private final int e;
/*     */     private boolean f;
/*     */     
/*     */     public d(bhc ☃, double d1, int i) {
/* 460 */       this.a = ☃;
/* 461 */       this.b = d1;
/* 462 */       this.e = i;
/* 463 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 468 */       j();
/* 469 */       return (g() && h() && this.a.A() == null);
/*     */     }
/*     */     
/*     */     private boolean g() {
/* 473 */       return (this.a.fb() && !this.a.fa().a());
/*     */     }
/*     */     
/*     */     private boolean h() {
/* 477 */       aag ☃ = (aag)this.a.l;
/* 478 */       fx fx1 = this.a.cB();
/* 479 */       Optional<fx> optional = ☃.y().a(☃ -> (☃ == azr.r), this::a, azo.b.c, fx1, 48, bhc.g(this.a));
/* 480 */       if (!optional.isPresent()) {
/* 481 */         return false;
/*     */       }
/*     */       
/* 484 */       this.c = ((fx)optional.get()).h();
/*     */       
/* 486 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 491 */       if (this.a.x().m()) {
/* 492 */         return false;
/*     */       }
/* 494 */       return (this.a.A() == null && !this.c.a(this.a.cA(), (this.a.cy() + this.e)) && !this.f);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 499 */       if (this.c.a(this.a.cA(), this.e)) {
/* 500 */         this.d.add(this.c);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 506 */       super.c();
/* 507 */       this.a.n(0);
/* 508 */       this.a.x().a(this.c.u(), this.c.v(), this.c.w(), this.b);
/* 509 */       this.f = false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 514 */       if (this.a.x().m()) {
/* 515 */         dcn ☃ = dcn.c(this.c);
/* 516 */         dcn dcn1 = azj.a(this.a, 16, 7, ☃, 0.3141592741012573D);
/* 517 */         if (dcn1 == null) {
/* 518 */           dcn1 = azj.b(this.a, 8, 7, ☃);
/*     */         }
/*     */         
/* 521 */         if (dcn1 == null) {
/* 522 */           this.f = true;
/*     */           
/*     */           return;
/*     */         } 
/* 526 */         this.a.x().a(dcn1.b, dcn1.c, dcn1.d, this.b);
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean a(fx ☃) {
/* 531 */       for (fx fx1 : this.d) {
/* 532 */         if (Objects.equals(☃, fx1)) {
/* 533 */           return false;
/*     */         }
/*     */       } 
/* 536 */       return true;
/*     */     }
/*     */     
/*     */     private void j() {
/* 540 */       if (this.d.size() > 2)
/* 541 */         this.d.remove(0); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */