/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bgf
/*     */   extends aqa
/*     */   implements bgj
/*     */ {
/*  25 */   private static final us<bmb> b = uv.a((Class)bgf.class, uu.g);
/*     */   
/*     */   private double c;
/*     */   private double d;
/*     */   private double e;
/*     */   private int f;
/*     */   private boolean g;
/*     */   
/*     */   public bgf(aqe<? extends bgf> ☃, brx brx1) {
/*  34 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   public bgf(brx ☃, double d1, double d2, double d3) {
/*  38 */     this(aqe.z, ☃);
/*  39 */     this.f = 0;
/*     */     
/*  41 */     d(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public void b(bmb ☃) {
/*  45 */     if (☃.b() != bmd.nD || ☃.n()) {
/*  46 */       ab().b(b, x.a(☃.i(), ☃ -> ☃.e(1)));
/*     */     }
/*     */   }
/*     */   
/*     */   private bmb h() {
/*  51 */     return ab().<bmb>a(b);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb g() {
/*  56 */     bmb ☃ = h();
/*  57 */     return ☃.a() ? new bmb(bmd.nD) : ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  62 */     ab().a(b, bmb.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/*  67 */     double d = cc().a() * 4.0D;
/*  68 */     if (Double.isNaN(d)) {
/*  69 */       d = 4.0D;
/*     */     }
/*  71 */     d *= 64.0D;
/*  72 */     return (☃ < d * d);
/*     */   }
/*     */   
/*     */   public void a(fx ☃) {
/*  76 */     double d1 = ☃.u();
/*  77 */     int i = ☃.v();
/*  78 */     double d2 = ☃.w();
/*     */     
/*  80 */     double d3 = d1 - cD();
/*  81 */     double d4 = d2 - cH();
/*  82 */     float f = afm.a(d3 * d3 + d4 * d4);
/*     */     
/*  84 */     if (f > 12.0F) {
/*  85 */       this.c = cD() + d3 / f * 12.0D;
/*  86 */       this.e = cH() + d4 / f * 12.0D;
/*  87 */       this.d = cE() + 8.0D;
/*     */     } else {
/*  89 */       this.c = d1;
/*  90 */       this.d = i;
/*  91 */       this.e = d2;
/*     */     } 
/*     */     
/*  94 */     this.f = 0;
/*  95 */     this.g = (this.J.nextInt(5) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(double ☃, double d1, double d2) {
/* 100 */     n(☃, d1, d2);
/* 101 */     if (this.s == 0.0F && this.r == 0.0F) {
/* 102 */       float f = afm.a(☃ * ☃ + d2 * d2);
/* 103 */       this.p = (float)(afm.d(☃, d2) * 57.2957763671875D);
/* 104 */       this.q = (float)(afm.d(d1, f) * 57.2957763671875D);
/* 105 */       this.r = this.p;
/* 106 */       this.s = this.q;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 112 */     super.j();
/*     */     
/* 114 */     dcn ☃ = cC();
/* 115 */     double d1 = cD() + ☃.b;
/* 116 */     double d2 = cE() + ☃.c;
/* 117 */     double d3 = cH() + ☃.d;
/*     */     
/* 119 */     float f1 = afm.a(c(☃));
/* 120 */     this.q = bgm.e(this.s, (float)(afm.d(☃.c, f1) * 57.2957763671875D));
/* 121 */     this.p = bgm.e(this.r, (float)(afm.d(☃.b, ☃.d) * 57.2957763671875D));
/*     */     
/* 123 */     if (!this.l.v) {
/* 124 */       double d4 = this.c - d1;
/* 125 */       double d5 = this.e - d3;
/* 126 */       float f3 = (float)Math.sqrt(d4 * d4 + d5 * d5);
/* 127 */       float f4 = (float)afm.d(d5, d4);
/* 128 */       double d6 = afm.d(0.0025D, f1, f3);
/* 129 */       double d7 = ☃.c;
/* 130 */       if (f3 < 1.0F) {
/* 131 */         d6 *= 0.8D;
/* 132 */         d7 *= 0.8D;
/*     */       } 
/* 134 */       int i = (cE() < this.d) ? 1 : -1;
/* 135 */       ☃ = new dcn(Math.cos(f4) * d6, d7 + (i - d7) * 0.014999999664723873D, Math.sin(f4) * d6);
/* 136 */       f(☃);
/*     */     } 
/*     */     
/* 139 */     float f2 = 0.25F;
/* 140 */     if (aE()) {
/* 141 */       for (int i = 0; i < 4; i++) {
/* 142 */         this.l.a(hh.e, d1 - ☃.b * 0.25D, d2 - ☃.c * 0.25D, d3 - ☃.d * 0.25D, ☃.b, ☃.c, ☃.d);
/*     */       }
/*     */     } else {
/* 145 */       this.l.a(hh.Q, d1 - ☃.b * 0.25D + this.J.nextDouble() * 0.6D - 0.3D, d2 - ☃.c * 0.25D - 0.5D, d3 - ☃.d * 0.25D + this.J.nextDouble() * 0.6D - 0.3D, ☃.b, ☃.c, ☃.d);
/*     */     } 
/*     */     
/* 148 */     if (!this.l.v) {
/* 149 */       d(d1, d2, d3);
/*     */       
/* 151 */       this.f++;
/* 152 */       if (this.f > 80 && !this.l.v) {
/* 153 */         a(adq.dw, 1.0F, 1.0F);
/* 154 */         ad();
/* 155 */         if (this.g) {
/* 156 */           this.l.c(new bcv(this.l, cD(), cE(), cH(), g()));
/*     */         } else {
/* 158 */           this.l.c(2003, cB(), 0);
/*     */         } 
/*     */       } 
/*     */     } else {
/* 162 */       o(d1, d2, d3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 168 */     bmb bmb = h();
/* 169 */     if (!bmb.a()) {
/* 170 */       ☃.a("Item", bmb.b(new md()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 176 */     bmb bmb = bmb.a(☃.p("Item"));
/* 177 */     b(bmb);
/*     */   }
/*     */ 
/*     */   
/*     */   public float aR() {
/* 182 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bL() {
/* 187 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 192 */     return new on(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */