/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bqv
/*     */ {
/*     */   private final bmb a;
/*     */   private final bmb b;
/*     */   private final bmb c;
/*     */   private int d;
/*     */   private final int e;
/*     */   private boolean f = true;
/*     */   private int g;
/*     */   private int h;
/*     */   private float i;
/*  20 */   private int j = 1;
/*     */   
/*     */   public bqv(md ☃) {
/*  23 */     this.a = bmb.a(☃.p("buy"));
/*  24 */     this.b = bmb.a(☃.p("buyB"));
/*     */     
/*  26 */     this.c = bmb.a(☃.p("sell"));
/*     */     
/*  28 */     this.d = ☃.h("uses");
/*  29 */     if (☃.c("maxUses", 99)) {
/*  30 */       this.e = ☃.h("maxUses");
/*     */     } else {
/*  32 */       this.e = 4;
/*     */     } 
/*     */     
/*  35 */     if (☃.c("rewardExp", 1)) {
/*  36 */       this.f = ☃.q("rewardExp");
/*     */     }
/*     */     
/*  39 */     if (☃.c("xp", 3)) {
/*  40 */       this.j = ☃.h("xp");
/*     */     }
/*     */     
/*  43 */     if (☃.c("priceMultiplier", 5)) {
/*  44 */       this.i = ☃.j("priceMultiplier");
/*     */     }
/*     */     
/*  47 */     this.g = ☃.h("specialPrice");
/*  48 */     this.h = ☃.h("demand");
/*     */   }
/*     */   
/*     */   public bqv(bmb ☃, bmb bmb1, int i, int j, float f) {
/*  52 */     this(☃, bmb.b, bmb1, i, j, f);
/*     */   }
/*     */   
/*     */   public bqv(bmb ☃, bmb bmb1, bmb bmb2, int i, int j, float f) {
/*  56 */     this(☃, bmb1, bmb2, 0, i, j, f);
/*     */   }
/*     */   
/*     */   public bqv(bmb ☃, bmb bmb1, bmb bmb2, int i, int j, int k, float f) {
/*  60 */     this(☃, bmb1, bmb2, i, j, k, f, 0);
/*     */   }
/*     */   
/*     */   public bqv(bmb ☃, bmb bmb1, bmb bmb2, int i, int j, int k, float f, int m) {
/*  64 */     this.a = ☃;
/*  65 */     this.b = bmb1;
/*  66 */     this.c = bmb2;
/*  67 */     this.d = i;
/*  68 */     this.e = j;
/*  69 */     this.j = k;
/*  70 */     this.i = f;
/*  71 */     this.h = m;
/*     */   }
/*     */   
/*     */   public bmb a() {
/*  75 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b() {
/*  80 */     int ☃ = this.a.E();
/*  81 */     bmb bmb1 = this.a.i();
/*     */ 
/*     */     
/*  84 */     int i = Math.max(0, afm.d((☃ * this.h) * this.i));
/*     */     
/*  86 */     bmb1.e(afm.a(☃ + i + this.g, 1, this.a.b().i()));
/*  87 */     return bmb1;
/*     */   }
/*     */   
/*     */   public bmb c() {
/*  91 */     return this.b;
/*     */   }
/*     */   
/*     */   public bmb d() {
/*  95 */     return this.c;
/*     */   }
/*     */   
/*     */   public void e() {
/*  99 */     this.h = this.h + this.d - this.e - this.d;
/*     */   }
/*     */   
/*     */   public bmb f() {
/* 103 */     return this.c.i();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int g() {
/* 114 */     return this.d;
/*     */   }
/*     */   
/*     */   public void h() {
/* 118 */     this.d = 0;
/*     */   }
/*     */   
/*     */   public int i() {
/* 122 */     return this.e;
/*     */   }
/*     */   
/*     */   public void j() {
/* 126 */     this.d++;
/*     */   }
/*     */   
/*     */   public int k() {
/* 130 */     return this.h;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 134 */     this.g += ☃;
/*     */   }
/*     */   
/*     */   public void l() {
/* 138 */     this.g = 0;
/*     */   }
/*     */   
/*     */   public int m() {
/* 142 */     return this.g;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 146 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public float n() {
/* 150 */     return this.i;
/*     */   }
/*     */   
/*     */   public int o() {
/* 154 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 158 */     return (this.d >= this.e);
/*     */   }
/*     */   
/*     */   public void q() {
/* 162 */     this.d = this.e;
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 166 */     return (this.d > 0);
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 170 */     return this.f;
/*     */   }
/*     */   
/*     */   public md t() {
/* 174 */     md ☃ = new md();
/* 175 */     ☃.a("buy", this.a.b(new md()));
/* 176 */     ☃.a("sell", this.c.b(new md()));
/* 177 */     ☃.a("buyB", this.b.b(new md()));
/* 178 */     ☃.b("uses", this.d);
/* 179 */     ☃.b("maxUses", this.e);
/* 180 */     ☃.a("rewardExp", this.f);
/* 181 */     ☃.b("xp", this.j);
/* 182 */     ☃.a("priceMultiplier", this.i);
/* 183 */     ☃.b("specialPrice", this.g);
/* 184 */     ☃.b("demand", this.h);
/* 185 */     return ☃;
/*     */   }
/*     */   
/*     */   public boolean a(bmb ☃, bmb bmb1) {
/* 189 */     return (c(☃, b()) && ☃.E() >= b().E() && 
/* 190 */       c(bmb1, this.b) && bmb1.E() >= this.b.E());
/*     */   }
/*     */   
/*     */   private boolean c(bmb ☃, bmb bmb1) {
/* 194 */     if (bmb1.a() && ☃.a()) {
/* 195 */       return true;
/*     */     }
/*     */     
/* 198 */     bmb bmb2 = ☃.i();
/* 199 */     if (bmb2.b().k()) {
/* 200 */       bmb2.b(bmb2.g());
/*     */     }
/* 202 */     return (bmb.c(bmb2, bmb1) && (!bmb1.n() || (bmb2.n() && mp.a(bmb1.o(), bmb2.o(), false))));
/*     */   }
/*     */   
/*     */   public boolean b(bmb ☃, bmb bmb1) {
/* 206 */     if (!a(☃, bmb1)) {
/* 207 */       return false;
/*     */     }
/*     */     
/* 210 */     ☃.g(b().E());
/* 211 */     if (!c().a()) {
/* 212 */       bmb1.g(c().E());
/*     */     }
/* 214 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bqv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */