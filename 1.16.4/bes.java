/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class bes
/*     */   extends ber
/*     */   implements bdd
/*     */ {
/*  65 */   private static final us<Boolean> bp = uv.a((Class)bes.class, uu.i);
/*  66 */   private static final us<Boolean> bq = uv.a((Class)bes.class, uu.i);
/*  67 */   private static final us<Boolean> br = uv.a((Class)bes.class, uu.i);
/*     */   
/*  69 */   private static final UUID bs = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
/*  70 */   private static final arj bt = new arj(bs, "Baby speed boost", 0.20000000298023224D, arj.a.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  82 */   private final apa bu = new apa(8);
/*     */   
/*     */   private boolean bv = false;
/*  85 */   protected static final ImmutableList<azc<? extends azb<? super bes>>> d = ImmutableList.of(azc.c, azc.d, azc.b, azc.f, azc.k);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  93 */   protected static final ImmutableList<ayd<?>> bo = ImmutableList.of(ayd.n, ayd.v, ayd.g, ayd.h, ayd.k, ayd.l, ayd.Y, ayd.X, ayd.J, ayd.x, ayd.y, ayd.m, (Object[])new ayd[] { ayd.D, ayd.o, ayd.p, ayd.q, ayd.t, ayd.L, ayd.M, ayd.z, ayd.N, ayd.O, ayd.Q, ayd.P, ayd.S, ayd.T, ayd.R, ayd.V, ayd.K, ayd.ab, ayd.s, ayd.ac, ayd.ad, ayd.U, ayd.W, ayd.ae, ayd.af, ayd.ag });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bes(aqe<? extends ber> ☃, brx brx1) {
/* 135 */     super(☃, brx1);
/* 136 */     this.f = 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 141 */     super.b(☃);
/*     */     
/* 143 */     if (w_()) {
/* 144 */       ☃.a("IsBaby", true);
/*     */     }
/* 146 */     if (this.bv) {
/* 147 */       ☃.a("CannotHunt", true);
/*     */     }
/* 149 */     ☃.a("Inventory", this.bu.g());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 154 */     super.a(☃);
/*     */     
/* 156 */     a(☃.q("IsBaby"));
/* 157 */     v(☃.q("CannotHunt"));
/* 158 */     this.bu.a(☃.d("Inventory", 10));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(apk ☃, int i, boolean bool) {
/* 169 */     super.a(☃, i, bool);
/*     */     
/* 171 */     this.bu.f().forEach(this::a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected bmb k(bmb ☃) {
/* 178 */     return this.bu.a(☃);
/*     */   }
/*     */   
/*     */   protected boolean l(bmb ☃) {
/* 182 */     return this.bu.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 187 */     super.e();
/* 188 */     this.R.a(bp, Boolean.valueOf(false));
/* 189 */     this.R.a(bq, Boolean.valueOf(false));
/* 190 */     this.R.a(br, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 195 */     super.a(☃);
/* 196 */     if (bp.equals(☃)) {
/* 197 */       x_();
/*     */     }
/*     */   }
/*     */   
/*     */   public static ark.a eT() {
/* 202 */     return bdq.eR()
/* 203 */       .a(arl.a, 16.0D)
/* 204 */       .a(arl.d, 0.3499999940395355D)
/* 205 */       .a(arl.f, 5.0D);
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<bes> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 209 */     return !bry1.d_(fx1.c()).a(bup.iK);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 215 */     if (aqp1 != aqp.d) {
/* 216 */       if (☃.u_().nextFloat() < 0.2F) {
/* 217 */         a(true);
/* 218 */       } else if (eM()) {
/* 219 */         a(aqf.a, eV());
/*     */       } 
/*     */     }
/* 222 */     bet.a(this);
/* 223 */     a(aos1);
/* 224 */     b(aos1);
/* 225 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean L() {
/* 230 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 235 */     return !eu();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aos ☃) {
/* 240 */     if (eM()) {
/* 241 */       d(aqf.f, new bmb(bmd.lo));
/* 242 */       d(aqf.e, new bmb(bmd.lp));
/* 243 */       d(aqf.d, new bmb(bmd.lq));
/* 244 */       d(aqf.c, new bmb(bmd.lr));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(aqf ☃, bmb bmb1) {
/* 249 */     if (this.l.t.nextFloat() < 0.1F) {
/* 250 */       a(☃, bmb1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected arf.b<bes> cK() {
/* 256 */     return arf.a((Collection<? extends ayd<?>>)bo, (Collection<? extends azc<? extends azb<? super bes>>>)d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected arf<?> a(Dynamic<?> ☃) {
/* 261 */     return bet.a(this, cK().a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public arf<bes> cJ() {
/* 267 */     return (arf)super.cJ();
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 272 */     aou aou = super.b(☃, aot1);
/* 273 */     if (aou.a()) {
/* 274 */       return aou;
/*     */     }
/* 276 */     if (this.l.v) {
/* 277 */       boolean bool = (bet.b(this, ☃.b(aot1)) && eN() != beu.d);
/* 278 */       return bool ? aou.a : aou.c;
/*     */     } 
/*     */     
/* 281 */     return bet.a(this, ☃, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 286 */     return w_() ? 0.93F : 1.74F;
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/* 291 */     return cz() * 0.92D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 296 */     ab().b(bp, Boolean.valueOf(☃));
/*     */     
/* 298 */     if (!this.l.v) {
/* 299 */       arh arh = a(arl.d);
/* 300 */       arh.d(bt);
/* 301 */       if (☃) {
/* 302 */         arh.b(bt);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean w_() {
/* 309 */     return ((Boolean)ab().<Boolean>a(bp)).booleanValue();
/*     */   }
/*     */   
/*     */   private void v(boolean ☃) {
/* 313 */     this.bv = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean m() {
/* 318 */     return !this.bv;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 323 */     this.l.Z().a("piglinBrain");
/* 324 */     cJ().a((aag)this.l, this);
/* 325 */     this.l.Z().c();
/*     */     
/* 327 */     bet.b(this);
/*     */     
/* 329 */     super.N();
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(bfw ☃) {
/* 334 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(aag ☃) {
/* 339 */     bet.c(this);
/* 340 */     this.bu.f().forEach(this::a);
/* 341 */     super.c(☃);
/*     */   }
/*     */   
/*     */   private bmb eV() {
/* 345 */     if (this.J.nextFloat() < 0.5D) {
/* 346 */       return new bmb(bmd.qQ);
/*     */     }
/* 348 */     return new bmb(bmd.kv);
/*     */   }
/*     */   
/*     */   private boolean eW() {
/* 352 */     return ((Boolean)this.R.<Boolean>a(bq)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 357 */     this.R.b(bq, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void U_() {
/* 362 */     this.aI = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public beu eN() {
/* 368 */     if (eU())
/* 369 */       return beu.e; 
/* 370 */     if (bet.a(dE().b()))
/* 371 */       return beu.d; 
/* 372 */     if (eF() && eO())
/* 373 */       return beu.a; 
/* 374 */     if (eW())
/* 375 */       return beu.c; 
/* 376 */     if (eF() && a(bmd.qQ)) {
/* 377 */       return beu.b;
/*     */     }
/* 379 */     return beu.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean eU() {
/* 384 */     return ((Boolean)this.R.<Boolean>a(br)).booleanValue();
/*     */   }
/*     */   
/*     */   public void u(boolean ☃) {
/* 388 */     this.R.b(br, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 393 */     boolean bool = super.a(☃, f);
/* 394 */     if (this.l.v) {
/* 395 */       return false;
/*     */     }
/* 397 */     if (bool && ☃.k() instanceof aqm) {
/* 398 */       bet.a(this, (aqm)☃.k());
/*     */     }
/* 400 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 405 */     b(this, 1.6F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, bmb bmb1, bgm bgm1, float f) {
/* 410 */     a(this, ☃, bgm1, f, 1.6F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmo ☃) {
/* 415 */     return (☃ == bmd.qQ);
/*     */   }
/*     */   
/*     */   protected void m(bmb ☃) {
/* 419 */     b(aqf.a, ☃);
/*     */   }
/*     */   
/*     */   protected void n(bmb ☃) {
/* 423 */     if (☃.b() == bet.a) {
/*     */       
/* 425 */       a(aqf.b, ☃);
/* 426 */       d(aqf.b);
/*     */     } else {
/* 428 */       b(aqf.b, ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(bmb ☃) {
/* 434 */     return (this.l.V().b(brt.b) && et() && bet.a(this, ☃));
/*     */   }
/*     */   
/*     */   protected boolean o(bmb ☃) {
/* 438 */     aqf aqf = aqn.j(☃);
/* 439 */     bmb bmb1 = b(aqf);
/* 440 */     return a(☃, bmb1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(bmb ☃, bmb bmb1) {
/* 445 */     if (bpu.d(bmb1)) {
/* 446 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 451 */     boolean bool1 = (bet.a(☃.b()) || ☃.b() == bmd.qQ);
/* 452 */     boolean bool2 = (bet.a(bmb1.b()) || bmb1.b() == bmd.qQ);
/*     */ 
/*     */ 
/*     */     
/* 456 */     if (bool1 && !bool2) {
/* 457 */       return true;
/*     */     }
/* 459 */     if (!bool1 && bool2) {
/* 460 */       return false;
/*     */     }
/* 462 */     if (eM() && ☃.b() != bmd.qQ && bmb1.b() == bmd.qQ)
/*     */     {
/* 464 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 468 */     return super.a(☃, bmb1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(bcv ☃) {
/* 473 */     a(☃);
/* 474 */     bet.a(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aqa ☃, boolean bool) {
/* 479 */     if (w_() && ☃.X() == aqe.G) {
/* 480 */       ☃ = b(☃, 3);
/*     */     }
/* 482 */     return super.a(☃, bool);
/*     */   }
/*     */   
/*     */   private aqa b(aqa ☃, int i) {
/* 486 */     List<aqa> list = ☃.cn();
/* 487 */     if (i == 1 || list.isEmpty()) {
/* 488 */       return ☃;
/*     */     }
/* 490 */     return b(list.get(0), i - 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 496 */     if (this.l.v) {
/* 497 */       return null;
/*     */     }
/* 499 */     return bet.d(this).orElse(null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 504 */     return adq.kY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 509 */     return adq.kW;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 514 */     a(adq.la, 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected void a(adp ☃) {
/* 518 */     a(☃, dG(), dH());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eP() {
/* 523 */     a(adq.lb);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */