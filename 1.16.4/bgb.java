/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bgb
/*     */   extends bgm
/*     */ {
/*     */   public double b;
/*     */   public double c;
/*     */   public double d;
/*     */   
/*     */   protected bgb(aqe<? extends bgb> ☃, brx brx1) {
/*  25 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bgb(aqe<? extends bgb> ☃, double d1, double d2, double d3, double d4, double d5, double d6, brx brx1) {
/*  29 */     this(☃, brx1);
/*     */     
/*  31 */     b(d1, d2, d3, this.p, this.q);
/*  32 */     af();
/*     */     
/*  34 */     double d = afm.a(d4 * d4 + d5 * d5 + d6 * d6);
/*  35 */     if (d != 0.0D) {
/*  36 */       this.b = d4 / d * 0.1D;
/*  37 */       this.c = d5 / d * 0.1D;
/*  38 */       this.d = d6 / d * 0.1D;
/*     */     } 
/*     */   }
/*     */   
/*     */   public bgb(aqe<? extends bgb> ☃, aqm aqm1, double d1, double d2, double d3, brx brx1) {
/*  43 */     this(☃, aqm1.cD(), aqm1.cE(), aqm1.cH(), d1, d2, d3, brx1);
/*  44 */     b(aqm1);
/*  45 */     a(aqm1.p, aqm1.q);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void e() {}
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/*  54 */     double d = cc().a() * 4.0D;
/*  55 */     if (Double.isNaN(d)) {
/*  56 */       d = 4.0D;
/*     */     }
/*  58 */     d *= 64.0D;
/*  59 */     return (☃ < d * d);
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  64 */     aqa ☃ = v();
/*  65 */     if (!this.l.v && ((☃ != null && ☃.y) || !this.l.C(cB()))) {
/*  66 */       ad();
/*     */       
/*     */       return;
/*     */     } 
/*  70 */     super.j();
/*  71 */     if (W_()) {
/*  72 */       f(1);
/*     */     }
/*     */     
/*  75 */     dcl dcl = bgn.a(this, this::a);
/*  76 */     if (dcl.c() != dcl.a.a) {
/*  77 */       a(dcl);
/*     */     }
/*     */     
/*  80 */     ay();
/*  81 */     dcn dcn = cC();
/*  82 */     double d1 = cD() + dcn.b;
/*  83 */     double d2 = cE() + dcn.c;
/*  84 */     double d3 = cH() + dcn.d;
/*     */     
/*  86 */     bgn.a(this, 0.2F);
/*     */     
/*  88 */     float f = i();
/*  89 */     if (aE()) {
/*  90 */       for (int i = 0; i < 4; i++) {
/*  91 */         float f1 = 0.25F;
/*  92 */         this.l.a(hh.e, d1 - dcn.b * 0.25D, d2 - dcn.c * 0.25D, d3 - dcn.d * 0.25D, dcn.b, dcn.c, dcn.d);
/*     */       } 
/*  94 */       f = 0.8F;
/*     */     } 
/*     */     
/*  97 */     f(dcn.b(this.b, this.c, this.d).a(f));
/*     */     
/*  99 */     this.l.a(h(), d1, d2 + 0.5D, d3, 0.0D, 0.0D, 0.0D);
/*     */     
/* 101 */     d(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aqa ☃) {
/* 106 */     return (super.a(☃) && !☃.H);
/*     */   }
/*     */   
/*     */   protected boolean W_() {
/* 110 */     return true;
/*     */   }
/*     */   
/*     */   protected hf h() {
/* 114 */     return hh.S;
/*     */   }
/*     */   
/*     */   protected float i() {
/* 118 */     return 0.95F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 123 */     super.b(☃);
/* 124 */     ☃.a("power", a(new double[] { this.b, this.c, this.d }));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 129 */     super.a(☃);
/* 130 */     if (☃.c("power", 9)) {
/* 131 */       mj mj = ☃.d("power", 6);
/* 132 */       if (mj.size() == 3) {
/* 133 */         this.b = mj.h(0);
/* 134 */         this.c = mj.h(1);
/* 135 */         this.d = mj.h(2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/* 142 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bg() {
/* 147 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 152 */     if (b(☃)) {
/* 153 */       return false;
/*     */     }
/* 155 */     aS();
/*     */     
/* 157 */     aqa aqa = ☃.k();
/* 158 */     if (aqa != null) {
/* 159 */       dcn dcn = aqa.bh();
/* 160 */       f(dcn);
/* 161 */       this.b = dcn.b * 0.1D;
/* 162 */       this.c = dcn.c * 0.1D;
/* 163 */       this.d = dcn.d * 0.1D;
/*     */       
/* 165 */       b(aqa);
/* 166 */       return true;
/*     */     } 
/* 168 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public float aR() {
/* 173 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 178 */     aqa ☃ = v();
/* 179 */     int i = (☃ == null) ? 0 : ☃.Y();
/* 180 */     return new on(Y(), bS(), cD(), cE(), cH(), this.q, this.p, X(), i, new dcn(this.b, this.c, this.d));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */