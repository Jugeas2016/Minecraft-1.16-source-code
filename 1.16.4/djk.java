/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class djk
/*     */ {
/*     */   private boolean a;
/*     */   private brc b;
/*     */   private aqa c;
/*  21 */   private dcn d = dcn.a;
/*  22 */   private final fx.a e = new fx.a();
/*  23 */   private final g f = new g(0.0F, 0.0F, 1.0F);
/*  24 */   private final g g = new g(0.0F, 1.0F, 0.0F);
/*  25 */   private final g h = new g(1.0F, 0.0F, 0.0F);
/*     */   private float i;
/*     */   private float j;
/*  28 */   private final d k = new d(0.0F, 0.0F, 0.0F, 1.0F);
/*     */   private boolean l;
/*     */   private boolean m;
/*     */   private float n;
/*     */   private float o;
/*     */   
/*     */   public void a(brc ☃, aqa aqa1, boolean bool1, boolean bool2, float f) {
/*  35 */     this.a = true;
/*  36 */     this.b = ☃;
/*  37 */     this.c = aqa1;
/*  38 */     this.l = bool1;
/*  39 */     this.m = bool2;
/*     */     
/*  41 */     a(aqa1.h(f), aqa1.g(f));
/*  42 */     b(afm.d(f, aqa1.m, aqa1.cD()), afm.d(f, aqa1.n, aqa1.cE()) + afm.g(f, this.o, this.n), afm.d(f, aqa1.o, aqa1.cH()));
/*     */     
/*  44 */     if (bool1) {
/*  45 */       if (bool2) {
/*  46 */         a(this.j + 180.0F, -this.i);
/*     */       }
/*     */       
/*  49 */       a(-a(4.0D), 0.0D, 0.0D);
/*  50 */     } else if (aqa1 instanceof aqm && ((aqm)aqa1).em()) {
/*  51 */       gc gc = ((aqm)aqa1).eo();
/*  52 */       a((gc != null) ? (gc.o() - 180.0F) : 0.0F, 0.0F);
/*  53 */       a(0.0D, 0.3D, 0.0D);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/*  58 */     if (this.c != null) {
/*  59 */       this.o = this.n;
/*  60 */       this.n += (this.c.ce() - this.n) * 0.5F;
/*     */     } 
/*     */   }
/*     */   
/*     */   private double a(double ☃) {
/*  65 */     for (int i = 0; i < 8; i++) {
/*  66 */       float f1 = ((i & 0x1) * 2 - 1);
/*  67 */       float f2 = ((i >> 1 & 0x1) * 2 - 1);
/*  68 */       float f3 = ((i >> 2 & 0x1) * 2 - 1);
/*     */       
/*  70 */       f1 *= 0.1F;
/*  71 */       f2 *= 0.1F;
/*  72 */       f3 *= 0.1F;
/*     */       
/*  74 */       dcn dcn1 = this.d.b(f1, f2, f3);
/*  75 */       dcn dcn2 = new dcn(this.d.b - this.f.a() * ☃ + f1 + f3, this.d.c - this.f.b() * ☃ + f2, this.d.d - this.f.c() * ☃ + f3);
/*  76 */       dcl dcl = this.b.a(new brf(dcn1, dcn2, brf.a.c, brf.b.a, this.c));
/*  77 */       if (dcl.c() != dcl.a.a) {
/*  78 */         double d1 = dcl.e().f(this.d);
/*  79 */         if (d1 < ☃) {
/*  80 */           ☃ = d1;
/*     */         }
/*     */       } 
/*     */     } 
/*  84 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void a(double ☃, double d1, double d2) {
/*  88 */     double d3 = this.f.a() * ☃ + this.g.a() * d1 + this.h.a() * d2;
/*  89 */     double d4 = this.f.b() * ☃ + this.g.b() * d1 + this.h.b() * d2;
/*  90 */     double d5 = this.f.c() * ☃ + this.g.c() * d1 + this.h.c() * d2;
/*  91 */     a(new dcn(this.d.b + d3, this.d.c + d4, this.d.d + d5));
/*     */   }
/*     */   
/*     */   protected void a(float ☃, float f1) {
/*  95 */     this.i = f1;
/*  96 */     this.j = ☃;
/*     */     
/*  98 */     this.k.a(0.0F, 0.0F, 0.0F, 1.0F);
/*  99 */     this.k.a(g.d.a(-☃));
/* 100 */     this.k.a(g.b.a(f1));
/*     */     
/* 102 */     this.f.a(0.0F, 0.0F, 1.0F);
/* 103 */     this.f.a(this.k);
/*     */     
/* 105 */     this.g.a(0.0F, 1.0F, 0.0F);
/* 106 */     this.g.a(this.k);
/*     */     
/* 108 */     this.h.a(1.0F, 0.0F, 0.0F);
/* 109 */     this.h.a(this.k);
/*     */   }
/*     */   
/*     */   protected void b(double ☃, double d1, double d2) {
/* 113 */     a(new dcn(☃, d1, d2));
/*     */   }
/*     */   
/*     */   protected void a(dcn ☃) {
/* 117 */     this.d = ☃;
/* 118 */     this.e.c(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public dcn b() {
/* 122 */     return this.d;
/*     */   }
/*     */   
/*     */   public fx c() {
/* 126 */     return this.e;
/*     */   }
/*     */   
/*     */   public float d() {
/* 130 */     return this.i;
/*     */   }
/*     */   
/*     */   public float e() {
/* 134 */     return this.j;
/*     */   }
/*     */   
/*     */   public d f() {
/* 138 */     return this.k;
/*     */   }
/*     */   
/*     */   public aqa g() {
/* 142 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 146 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 150 */     return this.l;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cux k() {
/* 158 */     if (!this.a) {
/* 159 */       return cuy.a.h();
/*     */     }
/* 161 */     cux ☃ = this.b.b(this.e);
/* 162 */     if (!☃.c() && 
/* 163 */       this.d.c >= (this.e.v() + ☃.a(this.b, this.e))) {
/* 164 */       return cuy.a.h();
/*     */     }
/*     */     
/* 167 */     return ☃;
/*     */   }
/*     */   
/*     */   public final g l() {
/* 171 */     return this.f;
/*     */   }
/*     */   
/*     */   public final g m() {
/* 175 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void o() {
/* 183 */     this.b = null;
/* 184 */     this.c = null;
/* 185 */     this.a = false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */