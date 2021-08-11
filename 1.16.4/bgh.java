/*     */ import java.util.List;
/*     */ import java.util.OptionalInt;
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
/*     */ public class bgh
/*     */   extends bgm
/*     */   implements bgj
/*     */ {
/*  37 */   private static final us<bmb> b = uv.a((Class)bgh.class, uu.g);
/*  38 */   private static final us<OptionalInt> c = uv.a((Class)bgh.class, uu.r);
/*  39 */   private static final us<Boolean> d = uv.a((Class)bgh.class, uu.i);
/*     */   
/*     */   private int e;
/*     */   private int f;
/*     */   private aqm g;
/*     */   
/*     */   public bgh(aqe<? extends bgh> ☃, brx brx1) {
/*  46 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bgh(brx ☃, double d1, double d2, double d3, bmb bmb1) {
/*  50 */     super((aqe)aqe.B, ☃);
/*  51 */     this.e = 0;
/*     */     
/*  53 */     d(d1, d2, d3);
/*     */     
/*  55 */     int i = 1;
/*  56 */     if (!bmb1.a() && bmb1.n()) {
/*  57 */       this.R.b(b, bmb1.i());
/*     */       
/*  59 */       i += bmb1.a("Fireworks").f("Flight");
/*     */     } 
/*  61 */     n(this.J
/*  62 */         .nextGaussian() * 0.001D, 0.05D, this.J
/*     */         
/*  64 */         .nextGaussian() * 0.001D);
/*     */ 
/*     */     
/*  67 */     this.f = 10 * i + this.J.nextInt(6) + this.J.nextInt(7);
/*     */   }
/*     */   
/*     */   public bgh(brx ☃, @Nullable aqa aqa1, double d1, double d2, double d3, bmb bmb1) {
/*  71 */     this(☃, d1, d2, d3, bmb1);
/*  72 */     b(aqa1);
/*     */   }
/*     */   
/*     */   public bgh(brx ☃, bmb bmb1, aqm aqm1) {
/*  76 */     this(☃, aqm1, aqm1.cD(), aqm1.cE(), aqm1.cH(), bmb1);
/*  77 */     this.R.b(c, OptionalInt.of(aqm1.Y()));
/*  78 */     this.g = aqm1;
/*     */   }
/*     */   
/*     */   public bgh(brx ☃, bmb bmb1, double d1, double d2, double d3, boolean bool) {
/*  82 */     this(☃, d1, d2, d3, bmb1);
/*  83 */     this.R.b(d, Boolean.valueOf(bool));
/*     */   }
/*     */   
/*     */   public bgh(brx ☃, bmb bmb1, aqa aqa1, double d1, double d2, double d3, boolean bool) {
/*  87 */     this(☃, bmb1, d1, d2, d3, bool);
/*  88 */     b(aqa1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  93 */     this.R.a(b, bmb.b);
/*  94 */     this.R.a(c, OptionalInt.empty());
/*  95 */     this.R.a(d, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/* 100 */     return (☃ < 4096.0D && !n());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j(double ☃, double d1, double d2) {
/* 105 */     return (super.j(☃, d1, d2) && !n());
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 110 */     super.j();
/*     */     
/* 112 */     if (n()) {
/* 113 */       if (this.g == null) {
/* 114 */         ((OptionalInt)this.R.<OptionalInt>a(c)).ifPresent(☃ -> {
/*     */               aqa aqa = this.l.a(☃);
/*     */               if (aqa instanceof aqm) {
/*     */                 this.g = (aqm)aqa;
/*     */               }
/*     */             });
/*     */       }
/* 121 */       if (this.g != null) {
/* 122 */         if (this.g.ef()) {
/* 123 */           dcn dcn1 = this.g.bh();
/* 124 */           double d1 = 1.5D;
/* 125 */           double d2 = 0.1D;
/*     */           
/* 127 */           dcn dcn2 = this.g.cC();
/* 128 */           this.g.f(dcn2.b(dcn1.b * 0.1D + (dcn1.b * 1.5D - dcn2.b) * 0.5D, dcn1.c * 0.1D + (dcn1.c * 1.5D - dcn2.c) * 0.5D, dcn1.d * 0.1D + (dcn1.d * 1.5D - dcn2.d) * 0.5D));
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 135 */         d(this.g.cD(), this.g.cE(), this.g.cH());
/*     */         
/* 137 */         f(this.g.cC());
/*     */       } 
/*     */     } else {
/* 140 */       if (!h()) {
/*     */         
/* 142 */         double d = this.u ? 1.0D : 1.15D;
/* 143 */         f(cC().d(d, 1.0D, d).b(0.0D, 0.04D, 0.0D));
/*     */       } 
/* 145 */       dcn dcn = cC();
/* 146 */       a(aqr.a, dcn);
/* 147 */       f(dcn);
/*     */     } 
/*     */     
/* 150 */     dcl ☃ = bgn.a(this, this::a);
/*     */     
/* 152 */     if (!this.H) {
/* 153 */       a(☃);
/* 154 */       this.Z = true;
/*     */     } 
/*     */     
/* 157 */     x();
/*     */     
/* 159 */     if (this.e == 0 && !aA()) {
/* 160 */       this.l.a((bfw)null, cD(), cE(), cH(), adq.ee, adr.i, 3.0F, 1.0F);
/*     */     }
/*     */     
/* 163 */     this.e++;
/* 164 */     if (this.l.v && this.e % 2 < 2) {
/* 165 */       this.l.a(hh.y, cD(), cE() - 0.3D, cH(), this.J.nextGaussian() * 0.05D, -(cC()).c * 0.5D, this.J.nextGaussian() * 0.05D);
/*     */     }
/* 167 */     if (!this.l.v && this.e > this.f) {
/* 168 */       i();
/*     */     }
/*     */   }
/*     */   
/*     */   private void i() {
/* 173 */     this.l.a(this, (byte)17);
/* 174 */     m();
/* 175 */     ad();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dck ☃) {
/* 180 */     super.a(☃);
/* 181 */     if (this.l.v)
/* 182 */       return;  i();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcj ☃) {
/* 187 */     fx fx = new fx(☃.a());
/* 188 */     this.l.d_(fx).a(this.l, fx, this);
/* 189 */     if (!this.l.s_() && k()) {
/* 190 */       i();
/*     */     }
/* 192 */     super.a(☃);
/*     */   }
/*     */   
/*     */   private boolean k() {
/* 196 */     bmb ☃ = this.R.<bmb>a(b);
/* 197 */     md md = ☃.a() ? null : ☃.b("Fireworks");
/* 198 */     mj mj = (md != null) ? md.d("Explosions", 10) : null;
/* 199 */     return (mj != null && !mj.isEmpty());
/*     */   }
/*     */ 
/*     */   
/*     */   private void m() {
/* 204 */     float ☃ = 0.0F;
/* 205 */     bmb bmb = this.R.<bmb>a(b);
/* 206 */     md md = bmb.a() ? null : bmb.b("Fireworks");
/* 207 */     mj mj = (md != null) ? md.d("Explosions", 10) : null;
/* 208 */     if (mj != null && !mj.isEmpty()) {
/* 209 */       ☃ = 5.0F + (mj.size() * 2);
/*     */     }
/* 211 */     if (☃ > 0.0F) {
/* 212 */       if (this.g != null) {
/* 213 */         this.g.a(apk.a(this, v()), 5.0F + (mj.size() * 2));
/*     */       }
/*     */       
/* 216 */       double d = 5.0D;
/* 217 */       dcn dcn = cA();
/* 218 */       List<aqm> list = this.l.a(aqm.class, cc().g(5.0D));
/* 219 */       for (aqm aqm1 : list) {
/* 220 */         if (aqm1 == this.g) {
/*     */           continue;
/*     */         }
/* 223 */         if (h(aqm1) > 25.0D) {
/*     */           continue;
/*     */         }
/*     */         
/* 227 */         boolean bool = false;
/* 228 */         for (int i = 0; i < 2; i++) {
/* 229 */           dcn dcn1 = new dcn(aqm1.cD(), aqm1.e(0.5D * i), aqm1.cH());
/* 230 */           dcl dcl = this.l.a(new brf(dcn, dcn1, brf.a.a, brf.b.a, this));
/* 231 */           if (dcl.c() == dcl.a.a) {
/* 232 */             bool = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 236 */         if (bool) {
/* 237 */           float f = ☃ * (float)Math.sqrt((5.0D - g(aqm1)) / 5.0D);
/* 238 */           aqm1.a(apk.a(this, v()), f);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean n() {
/* 245 */     return ((OptionalInt)this.R.<OptionalInt>a(c)).isPresent();
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 249 */     return ((Boolean)this.R.<Boolean>a(d)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 254 */     if (☃ == 17 && this.l.v)
/*     */     {
/* 256 */       if (!k()) {
/* 257 */         for (int i = 0; i < this.J.nextInt(3) + 2; i++) {
/* 258 */           this.l.a(hh.P, cD(), cE(), cH(), this.J.nextGaussian() * 0.05D, 0.005D, this.J.nextGaussian() * 0.05D);
/*     */         }
/*     */       } else {
/* 261 */         bmb bmb = this.R.<bmb>a(b);
/* 262 */         md md = bmb.a() ? null : bmb.b("Fireworks");
/* 263 */         dcn dcn = cC();
/* 264 */         this.l.a(cD(), cE(), cH(), dcn.b, dcn.c, dcn.d, md);
/*     */       } 
/*     */     }
/* 267 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 272 */     super.b(☃);
/* 273 */     ☃.b("Life", this.e);
/* 274 */     ☃.b("LifeTime", this.f);
/* 275 */     bmb bmb = this.R.<bmb>a(b);
/* 276 */     if (!bmb.a()) {
/* 277 */       ☃.a("FireworksItem", bmb.b(new md()));
/*     */     }
/* 279 */     ☃.a("ShotAtAngle", ((Boolean)this.R.<Boolean>a(d)).booleanValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 284 */     super.a(☃);
/* 285 */     this.e = ☃.h("Life");
/* 286 */     this.f = ☃.h("LifeTime");
/*     */     
/* 288 */     bmb bmb = bmb.a(☃.p("FireworksItem"));
/* 289 */     if (!bmb.a()) {
/* 290 */       this.R.b(b, bmb);
/*     */     }
/*     */     
/* 293 */     if (☃.e("ShotAtAngle")) {
/* 294 */       this.R.b(d, Boolean.valueOf(☃.q("ShotAtAngle")));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb g() {
/* 300 */     bmb ☃ = this.R.<bmb>a(b);
/* 301 */     return ☃.a() ? new bmb(bmd.po) : ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bL() {
/* 306 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 311 */     return new on(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */