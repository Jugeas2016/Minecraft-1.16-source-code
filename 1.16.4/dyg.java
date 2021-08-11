/*     */ import java.util.Random;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class dyg
/*     */ {
/*  19 */   private static final dci a = new dci(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*     */   
/*     */   protected final dwt c;
/*     */   protected double d;
/*     */   protected double e;
/*     */   protected double f;
/*     */   protected double g;
/*     */   protected double h;
/*     */   protected double i;
/*     */   protected double j;
/*     */   protected double k;
/*     */   protected double l;
/*  31 */   private dci b = a;
/*     */   
/*     */   protected boolean m;
/*     */   
/*     */   protected boolean n = true;
/*     */   private boolean B;
/*     */   protected boolean o;
/*  38 */   protected float p = 0.6F;
/*  39 */   protected float q = 1.8F;
/*     */   
/*  41 */   protected final Random r = new Random();
/*     */   
/*     */   protected int s;
/*     */   
/*     */   protected int t;
/*     */   protected float u;
/*  47 */   protected float v = 1.0F;
/*  48 */   protected float w = 1.0F;
/*  49 */   protected float x = 1.0F;
/*  50 */   protected float y = 1.0F;
/*     */   protected float z;
/*     */   protected float A;
/*     */   
/*     */   protected dyg(dwt ☃, double d1, double d2, double d3) {
/*  55 */     this.c = ☃;
/*     */     
/*  57 */     a(0.2F, 0.2F);
/*  58 */     b(d1, d2, d3);
/*  59 */     this.d = d1;
/*  60 */     this.e = d2;
/*  61 */     this.f = d3;
/*     */     
/*  63 */     this.t = (int)(4.0F / (this.r.nextFloat() * 0.9F + 0.1F));
/*     */   }
/*     */   
/*     */   public dyg(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  67 */     this(☃, d1, d2, d3);
/*     */     
/*  69 */     this.j = d4 + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D;
/*  70 */     this.k = d5 + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D;
/*  71 */     this.l = d6 + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D;
/*  72 */     float f1 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
/*     */     
/*  74 */     float f2 = afm.a(this.j * this.j + this.k * this.k + this.l * this.l);
/*  75 */     this.j = this.j / f2 * f1 * 0.4000000059604645D;
/*  76 */     this.k = this.k / f2 * f1 * 0.4000000059604645D + 0.10000000149011612D;
/*  77 */     this.l = this.l / f2 * f1 * 0.4000000059604645D;
/*     */   }
/*     */   
/*     */   public dyg c(float ☃) {
/*  81 */     this.j *= ☃;
/*  82 */     this.k = (this.k - 0.10000000149011612D) * ☃ + 0.10000000149011612D;
/*  83 */     this.l *= ☃;
/*  84 */     return this;
/*     */   }
/*     */   
/*     */   public dyg d(float ☃) {
/*  88 */     a(0.2F * ☃, 0.2F * ☃);
/*  89 */     return this;
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/*  93 */     this.v = ☃;
/*  94 */     this.w = f1;
/*  95 */     this.x = f2;
/*     */   }
/*     */   
/*     */   protected void e(float ☃) {
/*  99 */     this.y = ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 103 */     this.t = ☃;
/*     */   }
/*     */   
/*     */   public int i() {
/* 107 */     return this.t;
/*     */   }
/*     */   
/*     */   public void a() {
/* 111 */     this.d = this.g;
/* 112 */     this.e = this.h;
/* 113 */     this.f = this.i;
/*     */     
/* 115 */     if (this.s++ >= this.t) {
/* 116 */       j();
/*     */       
/*     */       return;
/*     */     } 
/* 120 */     this.k -= 0.04D * this.u;
/* 121 */     a(this.j, this.k, this.l);
/* 122 */     this.j *= 0.9800000190734863D;
/* 123 */     this.k *= 0.9800000190734863D;
/* 124 */     this.l *= 0.9800000190734863D;
/*     */     
/* 126 */     if (this.m) {
/* 127 */       this.j *= 0.699999988079071D;
/* 128 */       this.l *= 0.699999988079071D;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract void a(dfq paramdfq, djk paramdjk, float paramFloat);
/*     */   
/*     */   public abstract dyk b();
/*     */   
/*     */   public String toString() {
/* 138 */     return getClass().getSimpleName() + ", Pos (" + this.g + "," + this.h + "," + this.i + "), RGBA (" + this.v + "," + this.w + "," + this.x + "," + this.y + "), Age " + this.s;
/*     */   }
/*     */   
/*     */   public void j() {
/* 142 */     this.o = true;
/*     */   }
/*     */   
/*     */   protected void a(float ☃, float f1) {
/* 146 */     if (☃ != this.p || f1 != this.q) {
/* 147 */       this.p = ☃;
/* 148 */       this.q = f1;
/* 149 */       dci dci1 = m();
/* 150 */       double d1 = (dci1.a + dci1.d - ☃) / 2.0D;
/* 151 */       double d2 = (dci1.c + dci1.f - ☃) / 2.0D;
/* 152 */       a(new dci(d1, dci1.b, d2, d1 + this.p, dci1.b + this.q, d2 + this.p));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(double ☃, double d1, double d2) {
/* 157 */     this.g = ☃;
/* 158 */     this.h = d1;
/* 159 */     this.i = d2;
/* 160 */     float f1 = this.p / 2.0F;
/* 161 */     float f2 = this.q;
/* 162 */     a(new dci(☃ - f1, d1, d2 - f1, ☃ + f1, d1 + f2, d2 + f1));
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, double d2) {
/* 166 */     if (this.B) {
/*     */       return;
/*     */     }
/*     */     
/* 170 */     double d3 = ☃;
/* 171 */     double d4 = d1;
/* 172 */     double d5 = d2;
/*     */     
/* 174 */     if (this.n && (☃ != 0.0D || d1 != 0.0D || d2 != 0.0D)) {
/* 175 */       dcn dcn = aqa.a((aqa)null, new dcn(☃, d1, d2), m(), this.c, dcs.a(), new afo<>(Stream.empty()));
/* 176 */       ☃ = dcn.b;
/* 177 */       d1 = dcn.c;
/* 178 */       d2 = dcn.d;
/*     */     } 
/*     */     
/* 181 */     if (☃ != 0.0D || d1 != 0.0D || d2 != 0.0D) {
/* 182 */       a(m().d(☃, d1, d2));
/* 183 */       k();
/*     */     } 
/*     */     
/* 186 */     if (Math.abs(d4) >= 9.999999747378752E-6D && Math.abs(d1) < 9.999999747378752E-6D) {
/* 187 */       this.B = true;
/*     */     }
/*     */     
/* 190 */     this.m = (d4 != d1 && d4 < 0.0D);
/*     */     
/* 192 */     if (d3 != ☃) {
/* 193 */       this.j = 0.0D;
/*     */     }
/* 195 */     if (d5 != d2) {
/* 196 */       this.l = 0.0D;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void k() {
/* 201 */     dci ☃ = m();
/* 202 */     this.g = (☃.a + ☃.d) / 2.0D;
/* 203 */     this.h = ☃.b;
/* 204 */     this.i = (☃.c + ☃.f) / 2.0D;
/*     */   }
/*     */   
/*     */   protected int a(float ☃) {
/* 208 */     fx fx = new fx(this.g, this.h, this.i);
/* 209 */     if (this.c.C(fx)) {
/* 210 */       return eae.a(this.c, fx);
/*     */     }
/* 212 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 216 */     return !this.o;
/*     */   }
/*     */   
/*     */   public dci m() {
/* 220 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(dci ☃) {
/* 224 */     this.b = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */