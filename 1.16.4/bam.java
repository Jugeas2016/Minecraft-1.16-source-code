/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bam
/*     */   extends bat
/*     */   implements bag
/*     */ {
/*  67 */   private static final us<Integer> bu = uv.a((Class)bam.class, uu.b);
/*  68 */   private static final Predicate<aqn> bv = new Predicate<aqn>()
/*     */     {
/*     */       public boolean a(@Nullable aqn ☃) {
/*  71 */         return (☃ != null && bam.eX().containsKey(☃.X()));
/*     */       }
/*     */     };
/*     */   
/*  75 */   private static final blx bw = bmd.ne;
/*  76 */   private static final Set<blx> bx = Sets.newHashSet((Object[])new blx[] { bmd.kV, bmd.nk, bmd.nj, bmd.qg }); private static final Map<aqe<?>, adp> by;
/*     */   public float bq;
/*     */   
/*     */   static {
/*  80 */     by = x.<Map<aqe<?>, adp>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(aqe.f, adq.ka);
/*     */           ☃.put(aqe.i, adq.kw);
/*     */           ☃.put(aqe.m, adq.kb);
/*     */           ☃.put(aqe.q, adq.kc);
/*     */           ☃.put(aqe.r, adq.kd);
/*     */           ☃.put(aqe.t, adq.ke);
/*     */           ☃.put(aqe.v, adq.kf);
/*     */           ☃.put(aqe.w, adq.kg);
/*     */           ☃.put(aqe.D, adq.kh);
/*     */           ☃.put(aqe.F, adq.ki);
/*     */           ☃.put(aqe.G, adq.kj);
/*     */           ☃.put(aqe.I, adq.kk);
/*     */           ☃.put(aqe.J, adq.kl);
/*     */           ☃.put(aqe.S, adq.km);
/*     */           ☃.put(aqe.ag, adq.kn);
/*     */           ☃.put(aqe.ai, adq.ko);
/*     */           ☃.put(aqe.aj, adq.kp);
/*     */           ☃.put(aqe.ak, adq.kq);
/*     */           ☃.put(aqe.ap, adq.kr);
/*     */           ☃.put(aqe.as, adq.ks);
/*     */           ☃.put(aqe.au, adq.kt);
/*     */           ☃.put(aqe.av, adq.ku);
/*     */           ☃.put(aqe.ax, adq.kv);
/*     */           ☃.put(aqe.aC, adq.kw);
/*     */           ☃.put(aqe.aE, adq.kx);
/*     */           ☃.put(aqe.aO, adq.ky);
/*     */           ☃.put(aqe.aQ, adq.kz);
/*     */           ☃.put(aqe.aS, adq.kA);
/*     */           ☃.put(aqe.aT, adq.kB);
/*     */           ☃.put(aqe.aU, adq.kC);
/*     */           ☃.put(aqe.aX, adq.kD);
/*     */           ☃.put(aqe.aY, adq.kE);
/*     */           ☃.put(aqe.ba, adq.kF);
/*     */         });
/*     */   }
/*     */   
/*     */   public float br;
/*     */   public float bs;
/*     */   public float bt;
/* 120 */   private float bz = 1.0F;
/*     */   
/*     */   private boolean bA;
/*     */   private fx bB;
/*     */   
/*     */   public bam(aqe<? extends bam> ☃, brx brx1) {
/* 126 */     super((aqe)☃, brx1);
/* 127 */     this.bh = new auy(this, 10, false);
/*     */ 
/*     */ 
/*     */     
/* 131 */     a(cwz.l, -1.0F);
/* 132 */     a(cwz.m, -1.0F);
/* 133 */     a(cwz.x, -1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 139 */     t(this.J.nextInt(5));
/*     */     
/* 141 */     if (arc1 == null) {
/* 142 */       arc1 = new apy.a(false);
/*     */     }
/*     */     
/* 145 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean w_() {
/* 150 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 155 */     this.bk.a(0, new awp(this, 1.25D));
/* 156 */     this.bk.a(0, new avp(this));
/* 157 */     this.bk.a(1, new awd(this, (Class)bfw.class, 8.0F));
/* 158 */     this.bk.a(2, new axb(this));
/* 159 */     this.bk.a(2, new avt(this, 1.0D, 5.0F, 1.0F, true));
/* 160 */     this.bk.a(2, new axj(this, 1.0D));
/* 161 */     this.bk.a(3, new awa(this));
/* 162 */     this.bk.a(3, new avs(this, 1.0D, 3.0F, 7.0F));
/*     */   }
/*     */   
/*     */   public static ark.a eU() {
/* 166 */     return aqn.p()
/* 167 */       .a(arl.a, 6.0D)
/* 168 */       .a(arl.e, 0.4000000059604645D)
/* 169 */       .a(arl.d, 0.20000000298023224D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ayj b(brx ☃) {
/* 174 */     ayh ayh = new ayh(this, ☃);
/* 175 */     ayh.a(false);
/* 176 */     ayh.d(true);
/* 177 */     ayh.b(true);
/* 178 */     return ayh;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 183 */     return aqb1.b * 0.6F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 188 */     if (this.bB == null || !this.bB.a(cA(), 3.46D) || !this.l.d_(this.bB).a(bup.cI)) {
/* 189 */       this.bA = false;
/* 190 */       this.bB = null;
/*     */     } 
/*     */     
/* 193 */     if (this.l.t.nextInt(400) == 0) {
/* 194 */       a(this.l, this);
/*     */     }
/*     */     
/* 197 */     super.k();
/*     */     
/* 199 */     eZ();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, boolean bool) {
/* 204 */     this.bB = ☃;
/* 205 */     this.bA = bool;
/*     */   }
/*     */   
/*     */   public boolean eV() {
/* 209 */     return this.bA;
/*     */   }
/*     */   
/*     */   private void eZ() {
/* 213 */     this.bt = this.bq;
/* 214 */     this.bs = this.br;
/*     */     
/* 216 */     this.br = (float)(this.br + ((this.t || br()) ? -1 : 4) * 0.3D);
/* 217 */     this.br = afm.a(this.br, 0.0F, 1.0F);
/*     */     
/* 219 */     if (!this.t && this.bz < 1.0F) {
/* 220 */       this.bz = 1.0F;
/*     */     }
/* 222 */     this.bz = (float)(this.bz * 0.9D);
/*     */     
/* 224 */     dcn ☃ = cC();
/* 225 */     if (!this.t && ☃.c < 0.0D) {
/* 226 */       f(☃.d(1.0D, 0.6D, 1.0D));
/*     */     }
/*     */     
/* 229 */     this.bq += this.bz * 2.0F;
/*     */   }
/*     */   
/*     */   public static boolean a(brx ☃, aqa aqa1) {
/* 233 */     if (!aqa1.aX() || aqa1.aA() || ☃.t.nextInt(2) != 0) {
/* 234 */       return false;
/*     */     }
/*     */     
/* 237 */     List<aqn> list = ☃.a(aqn.class, aqa1.cc().g(20.0D), bv);
/* 238 */     if (!list.isEmpty()) {
/* 239 */       aqn aqn = list.get(☃.t.nextInt(list.size()));
/* 240 */       if (!aqn.aA()) {
/* 241 */         adp adp = b(aqn.X());
/* 242 */         ☃.a((bfw)null, aqa1.cD(), aqa1.cE(), aqa1.cH(), adp, aqa1.cu(), 0.7F, a(☃.t));
/*     */         
/* 244 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 248 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 253 */     bmb bmb = ☃.b(aot1);
/*     */     
/* 255 */     if (!eK() && bx.contains(bmb.b())) {
/* 256 */       if (!☃.bC.d) {
/* 257 */         bmb.g(1);
/*     */       }
/*     */       
/* 260 */       if (!aA()) {
/* 261 */         this.l.a((bfw)null, cD(), cE(), cH(), adq.jX, cu(), 1.0F, 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.2F);
/*     */       }
/*     */       
/* 264 */       if (!this.l.v) {
/* 265 */         if (this.J.nextInt(10) == 0) {
/* 266 */           f(☃);
/* 267 */           this.l.a(this, (byte)7);
/*     */         } else {
/* 269 */           this.l.a(this, (byte)6);
/*     */         } 
/*     */       }
/*     */       
/* 273 */       return aou.a(this.l.v);
/* 274 */     }  if (bmb.b() == bw) {
/* 275 */       if (!☃.bC.d) {
/* 276 */         bmb.g(1);
/*     */       }
/*     */       
/* 279 */       c(new apu(apw.s, 900));
/* 280 */       if (☃.b_() || !bM()) {
/* 281 */         a(apk.a(☃), Float.MAX_VALUE);
/*     */       }
/*     */       
/* 284 */       return aou.a(this.l.v);
/* 285 */     }  if (!fa() && eK() && i(☃)) {
/* 286 */       if (!this.l.v) {
/* 287 */         w(!eO());
/*     */       }
/* 289 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 292 */     return super.b(☃, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 297 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean c(aqe<bam> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 301 */     ceh ceh = bry1.d_(fx1.c());
/* 302 */     return ((ceh.a(aed.I) || ceh.a(bup.i) || ceh.a(aed.s) || ceh.a(bup.a)) && bry1
/* 303 */       .b(fx1, 0) > 8);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 308 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(double ☃, boolean bool, ceh ceh1, fx fx1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(azz ☃) {
/* 318 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public apy a(aag ☃, apy apy1) {
/* 324 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 329 */     return ☃.a(apk.c(this), 3.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public adp I() {
/* 335 */     return a(this.l, this.l.t);
/*     */   }
/*     */   
/*     */   public static adp a(brx ☃, Random random) {
/* 339 */     if (☃.ad() != aor.a && random.nextInt(1000) == 0) {
/*     */       
/* 341 */       List<aqe<?>> list = Lists.newArrayList(by.keySet());
/* 342 */       return b(list.get(random.nextInt(list.size())));
/*     */     } 
/* 344 */     return adq.jV;
/*     */   }
/*     */   
/*     */   private static adp b(aqe<?> ☃) {
/* 348 */     return by.getOrDefault(☃, adq.jV);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 353 */     return adq.jZ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 358 */     return adq.jW;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 363 */     a(adq.kG, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float e(float ☃) {
/* 368 */     a(adq.jY, 0.15F, 1.0F);
/* 369 */     return ☃ + this.br / 2.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean az() {
/* 374 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dH() {
/* 379 */     return a(this.J);
/*     */   }
/*     */   
/*     */   public static float a(Random ☃) {
/* 383 */     return (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/* 388 */     return adr.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aU() {
/* 393 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void C(aqa ☃) {
/* 398 */     if (☃ instanceof bfw) {
/*     */       return;
/*     */     }
/* 401 */     super.C(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 406 */     if (b(☃)) {
/* 407 */       return false;
/*     */     }
/* 409 */     w(false);
/*     */     
/* 411 */     return super.a(☃, f);
/*     */   }
/*     */   
/*     */   public int eW() {
/* 415 */     return afm.a(((Integer)this.R.<Integer>a(bu)).intValue(), 0, 4);
/*     */   }
/*     */   
/*     */   public void t(int ☃) {
/* 419 */     this.R.b(bu, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 424 */     super.e();
/* 425 */     this.R.a(bu, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 430 */     super.b(☃);
/* 431 */     ☃.b("Variant", eW());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 436 */     super.a(☃);
/* 437 */     t(☃.h("Variant"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean fa() {
/* 442 */     return !this.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn cf() {
/* 447 */     return new dcn(0.0D, (0.5F * ce()), (cy() * 0.4F));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */