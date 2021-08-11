/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class baq
/*     */   extends azz
/*     */ {
/*  72 */   private static final us<Integer> bo = uv.a((Class)baq.class, uu.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  83 */   private static final vk bp = new vk("killer_bunny");
/*     */ 
/*     */   
/*     */   private int bq;
/*     */ 
/*     */   
/*     */   private int br;
/*     */   
/*     */   private boolean bs;
/*     */   
/*     */   private int bt;
/*     */   
/*     */   private int bu;
/*     */ 
/*     */   
/*     */   public baq(aqe<? extends baq> ☃, brx brx1) {
/*  99 */     super((aqe)☃, brx1);
/*     */     
/* 101 */     this.bi = new d(this, this);
/*     */     
/* 103 */     this.bh = new e(this);
/*     */     
/* 105 */     i(0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 110 */     this.bk.a(1, new avp(this));
/* 111 */     this.bk.a(1, new f(this, 2.2D));
/* 112 */     this.bk.a(2, new avi(this, 0.8D));
/* 113 */     this.bk.a(3, new axf(this, 1.0D, bon.a(new brw[] { bmd.oY, bmd.pd, bup.bp }, ), false));
/* 114 */     this.bk.a(4, new b<>(this, bfw.class, 8.0F, 2.2D, 2.2D));
/* 115 */     this.bk.a(4, new b<>(this, baz.class, 10.0F, 2.2D, 2.2D));
/* 116 */     this.bk.a(4, new b<>(this, bdq.class, 4.0F, 2.2D, 2.2D));
/* 117 */     this.bk.a(5, new g(this));
/* 118 */     this.bk.a(6, new axk(this, 0.6D));
/* 119 */     this.bk.a(11, new awd(this, (Class)bfw.class, 10.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dJ() {
/* 124 */     if (this.u || (this.bh.b() && this.bh.e() > cE() + 0.5D)) {
/* 125 */       return 0.5F;
/*     */     }
/* 127 */     cxd ☃ = this.bj.k();
/* 128 */     if (☃ != null && !☃.c()) {
/* 129 */       dcn dcn = ☃.a(this);
/* 130 */       if (dcn.c > cE() + 0.5D) {
/* 131 */         return 0.5F;
/*     */       }
/*     */     } 
/* 134 */     if (this.bh.c() <= 0.6D) {
/* 135 */       return 0.2F;
/*     */     }
/* 137 */     return 0.3F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dK() {
/* 142 */     super.dK();
/* 143 */     double ☃ = this.bh.c();
/* 144 */     if (☃ > 0.0D) {
/* 145 */       double d = c(cC());
/* 146 */       if (d < 0.01D)
/*     */       {
/* 148 */         a(0.1F, new dcn(0.0D, 0.0D, 1.0D));
/*     */       }
/*     */     } 
/* 151 */     if (!this.l.v) {
/* 152 */       this.l.a(this, (byte)1);
/*     */     }
/*     */   }
/*     */   
/*     */   public float y(float ☃) {
/* 157 */     if (this.br == 0) {
/* 158 */       return 0.0F;
/*     */     }
/* 160 */     return (this.bq + ☃) / this.br;
/*     */   }
/*     */   
/*     */   public void i(double ☃) {
/* 164 */     x().a(☃);
/* 165 */     this.bh.a(this.bh.d(), this.bh.e(), this.bh.f(), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void o(boolean ☃) {
/* 170 */     super.o(☃);
/* 171 */     if (☃) {
/* 172 */       a(eM(), dG(), ((this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void eK() {
/* 177 */     o(true);
/* 178 */     this.br = 10;
/* 179 */     this.bq = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 184 */     super.e();
/*     */     
/* 186 */     this.R.a(bo, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void N() {
/* 191 */     if (this.bt > 0) {
/* 192 */       this.bt--;
/*     */     }
/*     */     
/* 195 */     if (this.bu > 0) {
/* 196 */       this.bu -= this.J.nextInt(3);
/* 197 */       if (this.bu < 0) {
/* 198 */         this.bu = 0;
/*     */       }
/*     */     } 
/*     */     
/* 202 */     if (this.t) {
/* 203 */       if (!this.bs) {
/* 204 */         o(false);
/* 205 */         eW();
/*     */       } 
/*     */       
/* 208 */       if (eN() == 99 && this.bt == 0) {
/* 209 */         aqm aqm = A();
/* 210 */         if (aqm != null && h(aqm) < 16.0D) {
/* 211 */           b(aqm.cD(), aqm.cH());
/* 212 */           this.bh.a(aqm.cD(), aqm.cE(), aqm.cH(), this.bh.c());
/* 213 */           eK();
/* 214 */           this.bs = true;
/*     */         } 
/*     */       } 
/*     */       
/* 218 */       d ☃ = (d)this.bi;
/* 219 */       if (!☃.c()) {
/* 220 */         if (this.bh.b() && this.bt == 0) {
/* 221 */           cxd cxd = this.bj.k();
/* 222 */           dcn dcn = new dcn(this.bh.d(), this.bh.e(), this.bh.f());
/* 223 */           if (cxd != null && !cxd.c()) {
/* 224 */             dcn = cxd.a(this);
/*     */           }
/* 226 */           b(dcn.b, dcn.d);
/* 227 */           eK();
/*     */         } 
/* 229 */       } else if (!☃.d()) {
/* 230 */         eO();
/*     */       } 
/*     */     } 
/*     */     
/* 234 */     this.bs = this.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aO() {
/* 239 */     return false;
/*     */   }
/*     */   
/*     */   private void b(double ☃, double d1) {
/* 243 */     this.p = (float)(afm.d(d1 - cH(), ☃ - cD()) * 57.2957763671875D) - 90.0F;
/*     */   }
/*     */   
/*     */   private void eO() {
/* 247 */     ((d)this.bi).a(true);
/*     */   }
/*     */   
/*     */   private void eU() {
/* 251 */     ((d)this.bi).a(false);
/*     */   }
/*     */   
/*     */   private void eV() {
/* 255 */     if (this.bh.c() < 2.2D) {
/* 256 */       this.bt = 10;
/*     */     } else {
/* 258 */       this.bt = 1;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void eW() {
/* 263 */     eV();
/* 264 */     eU();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 269 */     super.k();
/* 270 */     if (this.bq != this.br) {
/* 271 */       this.bq++;
/* 272 */     } else if (this.br != 0) {
/* 273 */       this.bq = 0;
/* 274 */       this.br = 0;
/* 275 */       o(false);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static ark.a eL() {
/* 280 */     return aqn.p()
/* 281 */       .a(arl.a, 3.0D)
/* 282 */       .a(arl.d, 0.30000001192092896D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 287 */     super.b(☃);
/* 288 */     ☃.b("RabbitType", eN());
/* 289 */     ☃.b("MoreCarrotTicks", this.bu);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 294 */     super.a(☃);
/* 295 */     t(☃.h("RabbitType"));
/* 296 */     this.bu = ☃.h("MoreCarrotTicks");
/*     */   }
/*     */   
/*     */   protected adp eM() {
/* 300 */     return adq.mc;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 305 */     return adq.lY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 310 */     return adq.mb;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 315 */     return adq.ma;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 320 */     if (eN() == 99) {
/* 321 */       a(adq.lZ, 1.0F, (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/* 322 */       return ☃.a(apk.c(this), 8.0F);
/*     */     } 
/* 324 */     return ☃.a(apk.c(this), 3.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/* 329 */     return (eN() == 99) ? adr.f : adr.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 334 */     if (b(☃)) {
/* 335 */       return false;
/*     */     }
/* 337 */     return super.a(☃, f);
/*     */   }
/*     */   
/*     */   private boolean b(blx ☃) {
/* 341 */     return (☃ == bmd.oY || ☃ == bmd.pd || ☃ == bup.bp.h());
/*     */   }
/*     */ 
/*     */   
/*     */   public baq b(aag ☃, apy apy1) {
/* 346 */     baq baq1 = aqe.ao.a(☃);
/* 347 */     int i = a(☃);
/* 348 */     if (this.J.nextInt(20) != 0) {
/* 349 */       if (apy1 instanceof baq && this.J.nextBoolean()) {
/* 350 */         i = ((baq)apy1).eN();
/*     */       } else {
/* 352 */         i = eN();
/*     */       } 
/*     */     }
/* 355 */     baq1.t(i);
/* 356 */     return baq1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 361 */     return b(☃.b());
/*     */   }
/*     */   
/*     */   public int eN() {
/* 365 */     return ((Integer)this.R.<Integer>a(bo)).intValue();
/*     */   }
/*     */   
/*     */   public void t(int ☃) {
/* 369 */     if (☃ == 99) {
/* 370 */       a(arl.i).a(8.0D);
/* 371 */       this.bk.a(4, new a(this));
/* 372 */       this.bl.a(1, (new axp(this, new Class[0])).a(new Class[0]));
/* 373 */       this.bl.a(2, new axq<>(this, bfw.class, true));
/* 374 */       this.bl.a(2, new axq<>(this, baz.class, true));
/*     */       
/* 376 */       if (!S()) {
/* 377 */         a(new of(x.a("entity", bp)));
/*     */       }
/*     */     } 
/*     */     
/* 381 */     this.R.b(bo, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 387 */     int i = a(☃);
/* 388 */     if (arc1 instanceof c) {
/*     */       
/* 390 */       i = ((c)arc1).a;
/*     */     } else {
/* 392 */       arc1 = new c(i);
/*     */     } 
/*     */     
/* 395 */     t(i);
/*     */     
/* 397 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   private int a(bry ☃) {
/* 401 */     bsv bsv = ☃.v(cB());
/*     */     
/* 403 */     int i = this.J.nextInt(100);
/* 404 */     if (bsv.c() == bsv.e.c) {
/* 405 */       return (i < 80) ? 1 : 3;
/*     */     }
/*     */     
/* 408 */     if (bsv.t() == bsv.b.m) {
/* 409 */       return 4;
/*     */     }
/*     */     
/* 412 */     return (i < 50) ? 0 : ((i < 90) ? 5 : 2);
/*     */   }
/*     */   
/*     */   public static boolean c(aqe<baq> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 416 */     ceh ceh = bry1.d_(fx1.c());
/*     */ 
/*     */     
/* 419 */     return ((ceh.a(bup.i) || ceh.a(bup.cC) || ceh.a(bup.C)) && bry1
/* 420 */       .b(fx1, 0) > 8);
/*     */   }
/*     */   
/*     */   public static class c extends apy.a {
/*     */     public final int a;
/*     */     
/*     */     public c(int ☃) {
/* 427 */       super(1.0F);
/* 428 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean eX() {
/* 433 */     return (this.bu == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 438 */     if (☃ == 1) {
/* 439 */       aP();
/* 440 */       this.br = 10;
/* 441 */       this.bq = 0;
/*     */     } else {
/* 443 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn cf() {
/* 449 */     return new dcn(0.0D, (0.6F * ce()), (cy() * 0.4F));
/*     */   }
/*     */   
/*     */   public class d extends auz {
/*     */     private final baq c;
/*     */     private boolean d;
/*     */     
/*     */     public d(baq ☃, baq baq1) {
/* 457 */       super(baq1);
/* 458 */       this.c = baq1;
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 462 */       return this.a;
/*     */     }
/*     */     
/*     */     public boolean d() {
/* 466 */       return this.d;
/*     */     }
/*     */     
/*     */     public void a(boolean ☃) {
/* 470 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b() {
/* 475 */       if (this.a) {
/* 476 */         this.c.eK();
/* 477 */         this.a = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class e extends avb {
/*     */     private final baq i;
/*     */     private double j;
/*     */     
/*     */     public e(baq ☃) {
/* 487 */       super(☃);
/* 488 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 493 */       if (baq.a(this.i) && !baq.b(this.i) && !((baq.d)baq.c(this.i)).c()) {
/* 494 */         this.i.i(0.0D);
/* 495 */       } else if (b()) {
/* 496 */         this.i.i(this.j);
/*     */       } 
/* 498 */       super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(double ☃, double d1, double d2, double d3) {
/* 503 */       if (this.i.aE()) {
/* 504 */         d3 = 1.5D;
/*     */       }
/*     */       
/* 507 */       super.a(☃, d1, d2, d3);
/* 508 */       if (d3 > 0.0D)
/* 509 */         this.j = d3; 
/*     */     }
/*     */   }
/*     */   
/*     */   static class b<T extends aqm>
/*     */     extends avd<T> {
/*     */     private final baq i;
/*     */     
/*     */     public b(baq ☃, Class<T> clazz, float f, double d1, double d2) {
/* 518 */       super(☃, clazz, f, d1, d2);
/* 519 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 524 */       return (this.i.eN() != 99 && super.a());
/*     */     }
/*     */   }
/*     */   
/*     */   static class g
/*     */     extends awj {
/*     */     private final baq g;
/*     */     private boolean h;
/*     */     private boolean i;
/*     */     
/*     */     public g(baq ☃) {
/* 535 */       super(☃, 0.699999988079071D, 16);
/* 536 */       this.g = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 541 */       if (this.c <= 0) {
/* 542 */         if (!this.g.l.V().b(brt.b)) {
/* 543 */           return false;
/*     */         }
/*     */ 
/*     */         
/* 547 */         this.i = false;
/* 548 */         this.h = baq.d(this.g);
/* 549 */         this.h = true;
/*     */       } 
/*     */       
/* 552 */       return super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 557 */       return (this.i && super.b());
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 562 */       super.e();
/*     */       
/* 564 */       this.g.t().a(this.e.u() + 0.5D, (this.e.v() + 1), this.e.w() + 0.5D, 10.0F, this.g.O());
/*     */       
/* 566 */       if (l()) {
/* 567 */         brx ☃ = this.g.l;
/* 568 */         fx fx = this.e.b();
/*     */         
/* 570 */         ceh ceh = ☃.d_(fx);
/* 571 */         buo buo = ceh.b();
/*     */         
/* 573 */         if (this.i && buo instanceof buz) {
/* 574 */           Integer integer = (Integer)ceh.c(buz.b);
/* 575 */           if (integer.intValue() == 0) {
/* 576 */             ☃.a(fx, bup.a.n(), 2);
/* 577 */             ☃.a(fx, true, this.g);
/*     */           } else {
/* 579 */             ☃.a(fx, ceh.a(buz.b, Integer.valueOf(integer.intValue() - 1)), 2);
/* 580 */             ☃.c(2001, fx, buo.i(ceh));
/*     */           } 
/* 582 */           baq.a(this.g, 40);
/*     */         } 
/*     */         
/* 585 */         this.i = false;
/*     */ 
/*     */         
/* 588 */         this.c = 10;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(brz ☃, fx fx1) {
/* 594 */       buo buo = ☃.d_(fx1).b();
/*     */       
/* 596 */       if (buo == bup.bX && this.h && !this.i) {
/* 597 */         fx1 = fx1.b();
/* 598 */         ceh ceh = ☃.d_(fx1);
/* 599 */         buo = ceh.b();
/*     */         
/* 601 */         if (buo instanceof buz && ((buz)buo).h(ceh)) {
/* 602 */           this.i = true;
/* 603 */           return true;
/*     */         } 
/*     */       } 
/* 606 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   static class f extends awp {
/*     */     private final baq g;
/*     */     
/*     */     public f(baq ☃, double d) {
/* 614 */       super(☃, d);
/* 615 */       this.g = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 620 */       super.e();
/*     */       
/* 622 */       this.g.i(this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends awf {
/*     */     public a(baq ☃) {
/* 628 */       super(☃, 1.4D, true);
/*     */     }
/*     */ 
/*     */     
/*     */     protected double a(aqm ☃) {
/* 633 */       return (4.0F + ☃.cy());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\baq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */