/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dxp
/*     */   extends dzb
/*     */ {
/*     */   private final cuw b;
/*     */   protected boolean a;
/*     */   
/*     */   static class b
/*     */     extends dxp
/*     */   {
/*     */     private final hf b;
/*     */     
/*     */     private b(dwt ☃, double d1, double d2, double d3, cuw cuw1, hf hf1) {
/*  19 */       super(☃, d1, d2, d3, cuw1);
/*  20 */       this.b = hf1;
/*  21 */       this.u *= 0.02F;
/*  22 */       this.t = 40;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void g() {
/*  27 */       if (this.t-- <= 0) {
/*  28 */         j();
/*  29 */         this.c.a(this.b, this.g, this.h, this.i, this.j, this.k, this.l);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected void h() {
/*  35 */       this.j *= 0.02D;
/*  36 */       this.k *= 0.02D;
/*  37 */       this.l *= 0.02D;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends b {
/*     */     private a(dwt ☃, double d1, double d2, double d3, cuw cuw1, hf hf1) {
/*  43 */       super(☃, d1, d2, d3, cuw1, hf1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void g() {
/*  48 */       this.v = 1.0F;
/*  49 */       this.w = 16.0F / (40 - this.t + 16);
/*  50 */       this.x = 4.0F / (40 - this.t + 8);
/*  51 */       super.g();
/*     */     }
/*     */   }
/*     */   
/*     */   static class d extends e {
/*     */     protected final hf b;
/*     */     
/*     */     private d(dwt ☃, double d1, double d2, double d3, cuw cuw1, hf hf1) {
/*  59 */       super(☃, d1, d2, d3, cuw1);
/*  60 */       this.b = hf1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void h() {
/*  65 */       if (this.m) {
/*  66 */         j();
/*  67 */         this.c.a(this.b, this.g, this.h, this.i, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class f
/*     */     extends d {
/*     */     private f(dwt ☃, double d1, double d2, double d3, cuw cuw1, hf hf1) {
/*  75 */       super(☃, d1, d2, d3, cuw1, hf1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void h() {
/*  80 */       if (this.m) {
/*  81 */         j();
/*  82 */         this.c.a(this.b, this.g, this.h, this.i, 0.0D, 0.0D, 0.0D);
/*  83 */         this.c.a(this.g + 0.5D, this.h, this.i + 0.5D, adq.aE, adr.e, 0.3F + this.c.t.nextFloat() * 2.0F / 3.0F, 1.0F, false);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class e extends dxp {
/*     */     private e(dwt ☃, double d1, double d2, double d3, cuw cuw1) {
/*  90 */       super(☃, d1, d2, d3, cuw1);
/*  91 */       this.t = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
/*     */     }
/*     */ 
/*     */     
/*     */     protected void h() {
/*  96 */       if (this.m)
/*  97 */         j(); 
/*     */     }
/*     */   }
/*     */   
/*     */   static class c
/*     */     extends dxp {
/*     */     private c(dwt ☃, double d1, double d2, double d3, cuw cuw1) {
/* 104 */       super(☃, d1, d2, d3, cuw1);
/* 105 */       this.t = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private dxp(dwt ☃, double d1, double d2, double d3, cuw cuw1) {
/* 113 */     super(☃, d1, d2, d3);
/* 114 */     a(0.01F, 0.01F);
/* 115 */     this.u = 0.06F;
/* 116 */     this.b = cuw1;
/*     */   }
/*     */ 
/*     */   
/*     */   public dyk b() {
/* 121 */     return dyk.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(float ☃) {
/* 126 */     if (this.a) {
/* 127 */       return 240;
/*     */     }
/*     */     
/* 130 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 135 */     this.d = this.g;
/* 136 */     this.e = this.h;
/* 137 */     this.f = this.i;
/*     */     
/* 139 */     g();
/* 140 */     if (this.o) {
/*     */       return;
/*     */     }
/*     */     
/* 144 */     this.k -= this.u;
/* 145 */     a(this.j, this.k, this.l);
/* 146 */     h();
/* 147 */     if (this.o) {
/*     */       return;
/*     */     }
/*     */     
/* 151 */     this.j *= 0.9800000190734863D;
/* 152 */     this.k *= 0.9800000190734863D;
/* 153 */     this.l *= 0.9800000190734863D;
/*     */     
/* 155 */     fx ☃ = new fx(this.g, this.h, this.i);
/* 156 */     cux cux = this.c.b(☃);
/* 157 */     if (cux.a() == this.b && 
/* 158 */       this.h < (☃.v() + cux.a(this.c, ☃))) {
/* 159 */       j();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void g() {
/* 165 */     if (this.t-- <= 0)
/* 166 */       j(); 
/*     */   }
/*     */   
/*     */   protected void h() {}
/*     */   
/*     */   public static class r
/*     */     implements dyj<hi>
/*     */   {
/*     */     protected final dyw a;
/*     */     
/*     */     public r(dyw ☃) {
/* 177 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 182 */       dxp dxp = new dxp.b(dwt1, d1, d2, d3, cuy.c, hh.n);
/* 183 */       dxp.a(0.2F, 0.3F, 1.0F);
/* 184 */       dxp.a(this.a);
/* 185 */       return dxp;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class q implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public q(dyw ☃) {
/* 193 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 198 */       dxp dxp = new dxp.d(dwt1, d1, d2, d3, cuy.c, hh.Z);
/* 199 */       dxp.a(0.2F, 0.3F, 1.0F);
/* 200 */       dxp.a(this.a);
/* 201 */       return dxp;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class k implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public k(dyw ☃) {
/* 209 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 214 */       dxp.a a = new dxp.a(dwt1, d1, d2, d3, cuy.e, hh.k);
/* 215 */       a.a(this.a);
/* 216 */       return a;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class j implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public j(dyw ☃) {
/* 224 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 229 */       dxp dxp = new dxp.d(dwt1, d1, d2, d3, cuy.e, hh.l);
/* 230 */       dxp.a(1.0F, 0.2857143F, 0.083333336F);
/* 231 */       dxp.a(this.a);
/* 232 */       return dxp;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class l implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public l(dyw ☃) {
/* 240 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 245 */       dxp dxp = new dxp.c(dwt1, d1, d2, d3, cuy.e);
/* 246 */       dxp.a(1.0F, 0.2857143F, 0.083333336F);
/* 247 */       dxp.a(this.a);
/* 248 */       return dxp;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class h implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public h(dyw ☃) {
/* 256 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 261 */       dxp.b b = new dxp.b(dwt1, d1, d2, d3, cuy.a, hh.aj);
/* 262 */       b.u *= 0.01F;
/* 263 */       b.t = 100;
/* 264 */       b.a(0.622F, 0.508F, 0.082F);
/* 265 */       b.a(this.a);
/* 266 */       return b;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class g implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public g(dyw ☃) {
/* 274 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 279 */       dxp dxp = new dxp.f(dwt1, d1, d2, d3, cuy.a, hh.ak);
/* 280 */       dxp.u = 0.01F;
/* 281 */       dxp.a(0.582F, 0.448F, 0.082F);
/* 282 */       dxp.a(this.a);
/* 283 */       return dxp;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class i implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public i(dyw ☃) {
/* 291 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 296 */       dxp dxp = new dxp.c(dwt1, d1, d2, d3, cuy.a);
/* 297 */       dxp.t = (int)(128.0D / (Math.random() * 0.8D + 0.2D));
/* 298 */       dxp.a(0.522F, 0.408F, 0.082F);
/* 299 */       dxp.a(this.a);
/* 300 */       return dxp;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class m implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public m(dyw ☃) {
/* 308 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 313 */       dxp dxp = new dxp.e(dwt1, d1, d2, d3, cuy.a);
/* 314 */       dxp.t = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
/* 315 */       dxp.u = 0.007F;
/* 316 */       dxp.a(0.92F, 0.782F, 0.72F);
/* 317 */       dxp.a(this.a);
/* 318 */       return dxp;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class o implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public o(dyw ☃) {
/* 326 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 331 */       dxp.b b = new dxp.b(dwt1, d1, d2, d3, cuy.a, hh.aq);
/* 332 */       b.a = true;
/* 333 */       b.u *= 0.01F;
/* 334 */       b.t = 100;
/* 335 */       b.a(0.51171875F, 0.03125F, 0.890625F);
/* 336 */       b.a(this.a);
/* 337 */       return b;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class n implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public n(dyw ☃) {
/* 345 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 350 */       dxp dxp = new dxp.d(dwt1, d1, d2, d3, cuy.a, hh.ar);
/* 351 */       dxp.a = true;
/* 352 */       dxp.u = 0.01F;
/* 353 */       dxp.a(0.51171875F, 0.03125F, 0.890625F);
/* 354 */       dxp.a(this.a);
/* 355 */       return dxp;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class p implements dyj<hi> {
/*     */     protected final dyw a;
/*     */     
/*     */     public p(dyw ☃) {
/* 363 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 368 */       dxp dxp = new dxp.c(dwt1, d1, d2, d3, cuy.a);
/* 369 */       dxp.a = true;
/* 370 */       dxp.t = (int)(28.0D / (Math.random() * 0.8D + 0.2D));
/* 371 */       dxp.a(0.51171875F, 0.03125F, 0.890625F);
/* 372 */       dxp.a(this.a);
/* 373 */       return dxp;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */