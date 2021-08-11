/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class dqr
/*     */   extends dpp<bjg>
/*     */ {
/*  20 */   private static final vk A = new vk("textures/gui/container/villager2.png");
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
/*  44 */   private static final nr B = new of("merchant.trades");
/*  45 */   private static final nr C = new oe(" - ");
/*  46 */   private static final nr D = new of("merchant.deprecated");
/*     */   
/*     */   private int E;
/*  49 */   private final a[] F = new a[7];
/*     */   private int G;
/*     */   private boolean H;
/*     */   
/*     */   public dqr(bjg ☃, bfv bfv1, nr nr1) {
/*  54 */     super(☃, bfv1, nr1);
/*  55 */     this.b = 276;
/*  56 */     this.r = 107;
/*     */   }
/*     */   
/*     */   private void i() {
/*  60 */     this.t.d(this.E);
/*  61 */     this.t.g(this.E);
/*  62 */     this.i.w().a(new th(this.E));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  67 */     super.b();
/*     */     
/*  69 */     int ☃ = (this.k - this.b) / 2;
/*  70 */     int i = (this.l - this.c) / 2;
/*     */     
/*  72 */     int j = i + 16 + 2;
/*  73 */     for (int k = 0; k < 7; k++) {
/*  74 */       this.F[k] = (a)a((bjg)new a(this, ☃ + 5, j, k, ☃ -> {
/*     */               if (☃ instanceof a) {
/*     */                 this.E = ((a)☃).a() + this.G;
/*     */                 
/*     */                 i();
/*     */               } 
/*     */             }));
/*  81 */       j += 20;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(dfm ☃, int i, int j) {
/*  87 */     int k = this.t.g();
/*  88 */     if (k > 0 && k <= 5 && this.t.j()) {
/*  89 */       nr nr1 = this.d.e().a(C).a(new of("merchant.level." + k));
/*  90 */       int n = this.o.a(nr1);
/*  91 */       int i1 = 49 + this.b / 2 - n / 2;
/*  92 */       this.o.b(☃, nr1, i1, 6.0F, 4210752);
/*     */     } else {
/*  94 */       this.o.b(☃, this.d, (49 + this.b / 2 - this.o.a(this.d) / 2), 6.0F, 4210752);
/*     */     } 
/*  96 */     this.o.b(☃, this.u.d(), this.r, this.s, 4210752);
/*     */     
/*  98 */     int m = this.o.a(B);
/*  99 */     this.o.b(☃, B, (5 - m / 2 + 48), 6.0F, 4210752);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/* 104 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 105 */     this.i.M().a(A);
/* 106 */     int k = (this.k - this.b) / 2;
/* 107 */     int m = (this.l - this.c) / 2;
/*     */     
/* 109 */     a(☃, k, m, v(), 0.0F, 0.0F, this.b, this.c, 256, 512);
/*     */     
/* 111 */     bqw bqw = this.t.i();
/* 112 */     if (!bqw.isEmpty()) {
/* 113 */       int n = this.E;
/* 114 */       if (n < 0 || n >= bqw.size()) {
/*     */         return;
/*     */       }
/*     */       
/* 118 */       bqv bqv = bqw.get(n);
/* 119 */       if (bqv.p()) {
/* 120 */         this.i.M().a(A);
/* 121 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 122 */         a(☃, this.w + 83 + 99, this.x + 35, v(), 311.0F, 0.0F, 28, 21, 256, 512);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, bqv bqv1) {
/* 128 */     this.i.M().a(A);
/* 129 */     int k = this.t.g();
/* 130 */     int m = this.t.e();
/*     */     
/* 132 */     if (k >= 5) {
/*     */       return;
/*     */     }
/*     */     
/* 136 */     a(☃, i + 136, j + 16, v(), 0.0F, 186.0F, 102, 5, 256, 512);
/*     */     
/* 138 */     int n = bfk.b(k);
/* 139 */     if (m < n || !bfk.d(k)) {
/*     */       return;
/*     */     }
/*     */     
/* 143 */     int i1 = 100;
/* 144 */     float f = 100.0F / (bfk.c(k) - n);
/* 145 */     int i2 = Math.min(afm.d(f * (m - n)), 100);
/*     */     
/* 147 */     a(☃, i + 136, j + 16, v(), 0.0F, 191.0F, i2 + 1, 5, 256, 512);
/* 148 */     int i3 = this.t.f();
/* 149 */     if (i3 > 0) {
/* 150 */       int i4 = Math.min(afm.d(i3 * f), 100 - i2);
/* 151 */       a(☃, i + 136 + i2 + 1, j + 16 + 1, v(), 2.0F, 182.0F, i4, 3, 256, 512);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, bqw bqw1) {
/* 156 */     int k = bqw1.size() + 1 - 7;
/* 157 */     if (k > 1) {
/* 158 */       int m = 139 - 27 + (k - 1) * 139 / k;
/* 159 */       int n = 1 + m / k + 139 / k;
/* 160 */       int i1 = 113;
/* 161 */       int i2 = Math.min(113, this.G * n);
/* 162 */       if (this.G == k - 1)
/*     */       {
/* 164 */         i2 = 113;
/*     */       }
/* 166 */       a(☃, i + 94, j + 18 + i2, v(), 0.0F, 199.0F, 6, 27, 256, 512);
/*     */     } else {
/* 168 */       a(☃, i + 94, j + 18, v(), 6.0F, 199.0F, 6, 27, 256, 512);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 174 */     a(☃);
/* 175 */     super.a(☃, i, j, f);
/*     */     
/* 177 */     bqw bqw = this.t.i();
/* 178 */     if (!bqw.isEmpty()) {
/* 179 */       int k = (this.k - this.b) / 2;
/* 180 */       int m = (this.l - this.c) / 2;
/*     */       
/* 182 */       int n = m + 16 + 1;
/* 183 */       int i1 = k + 5 + 5;
/*     */       
/* 185 */       RenderSystem.pushMatrix();
/*     */       
/* 187 */       RenderSystem.enableRescaleNormal();
/* 188 */       this.i.M().a(A);
/*     */       
/* 190 */       a(☃, k, m, bqw);
/*     */       
/* 192 */       int i2 = 0;
/* 193 */       for (bqv bqv1 : bqw) {
/* 194 */         if (a(bqw.size()) && (i2 < this.G || i2 >= 7 + this.G)) {
/* 195 */           i2++;
/*     */           
/*     */           continue;
/*     */         } 
/* 199 */         bmb bmb1 = bqv1.a();
/* 200 */         bmb bmb2 = bqv1.b();
/* 201 */         bmb bmb3 = bqv1.c();
/* 202 */         bmb bmb4 = bqv1.d();
/*     */         
/* 204 */         this.j.b = 100.0F;
/*     */         
/* 206 */         int i4 = n + 2;
/*     */         
/* 208 */         a(☃, bmb2, bmb1, i1, i4);
/*     */         
/* 210 */         if (!bmb3.a()) {
/* 211 */           this.j.c(bmb3, k + 5 + 35, i4);
/* 212 */           this.j.a(this.o, bmb3, k + 5 + 35, i4);
/*     */         } 
/*     */         
/* 215 */         a(☃, bqv1, k, i4);
/*     */         
/* 217 */         this.j.c(bmb4, k + 5 + 68, i4);
/* 218 */         this.j.a(this.o, bmb4, k + 5 + 68, i4);
/* 219 */         this.j.b = 0.0F;
/*     */         
/* 221 */         n += 20;
/* 222 */         i2++;
/*     */       } 
/*     */       
/* 225 */       int i3 = this.E;
/* 226 */       bqv bqv = bqw.get(i3);
/*     */       
/* 228 */       if (this.t.j()) {
/* 229 */         a(☃, k, m, bqv);
/*     */       }
/*     */       
/* 232 */       if (bqv.p() && a(186, 35, 22, 21, i, j) && this.t.h()) {
/* 233 */         b(☃, D, i, j);
/*     */       }
/*     */       
/* 236 */       for (a a1 : this.F) {
/* 237 */         if (a1.g()) {
/* 238 */           a1.a(☃, i, j);
/*     */         }
/* 240 */         a1.p = (a1.a < this.t.i().size());
/*     */       } 
/*     */       
/* 243 */       RenderSystem.popMatrix();
/* 244 */       RenderSystem.enableDepthTest();
/*     */     } 
/*     */     
/* 247 */     a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, bqv bqv1, int i, int j) {
/* 251 */     RenderSystem.enableBlend();
/* 252 */     this.i.M().a(A);
/* 253 */     if (bqv1.p()) {
/* 254 */       a(☃, i + 5 + 35 + 20, j + 3, v(), 25.0F, 171.0F, 10, 9, 256, 512);
/*     */     } else {
/* 256 */       a(☃, i + 5 + 35 + 20, j + 3, v(), 15.0F, 171.0F, 10, 9, 256, 512);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, bmb bmb1, bmb bmb2, int i, int j) {
/* 261 */     this.j.c(bmb1, i, j);
/* 262 */     if (bmb2.E() == bmb1.E()) {
/* 263 */       this.j.a(this.o, bmb1, i, j);
/*     */     } else {
/* 265 */       this.j.a(this.o, bmb2, i, j, (bmb2.E() == 1) ? "1" : null);
/* 266 */       this.j.a(this.o, bmb1, i + 14, j, (bmb1.E() == 1) ? "1" : null);
/* 267 */       this.i.M().a(A);
/* 268 */       d(v() + 300);
/* 269 */       a(☃, i + 7, j + 12, v(), 0.0F, 176.0F, 9, 2, 256, 512);
/* 270 */       d(v() - 300);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(int ☃) {
/* 275 */     return (☃ > 7);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2) {
/* 280 */     int i = this.t.i().size();
/* 281 */     if (a(i)) {
/* 282 */       int j = i - 7;
/* 283 */       this.G = (int)(this.G - d2);
/* 284 */       this.G = afm.a(this.G, 0, j);
/*     */     } 
/* 286 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, double d2, double d3) {
/* 291 */     int j = this.t.i().size();
/*     */     
/* 293 */     if (this.H) {
/* 294 */       int k = this.x + 18;
/* 295 */       int m = k + 139;
/* 296 */       int n = j - 7;
/*     */       
/* 298 */       float f = ((float)d1 - k - 13.5F) / ((m - k) - 27.0F);
/* 299 */       f = f * n + 0.5F;
/*     */       
/* 301 */       this.G = afm.a((int)f, 0, n);
/*     */       
/* 303 */       return true;
/*     */     } 
/* 305 */     return super.a(☃, d1, i, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 310 */     this.H = false;
/* 311 */     int j = (this.k - this.b) / 2;
/* 312 */     int k = (this.l - this.c) / 2;
/*     */     
/* 314 */     if (a(this.t.i().size()) && ☃ > (j + 94) && ☃ < (j + 94 + 6) && d1 > (k + 18) && d1 <= (k + 18 + 139 + 1))
/*     */     {
/*     */       
/* 317 */       this.H = true;
/*     */     }
/* 319 */     return super.a(☃, d1, i);
/*     */   }
/*     */   
/*     */   class a extends dlj {
/*     */     final int a;
/*     */     
/*     */     public a(dqr this$0, int ☃, int i, int j, dlj.a a1) {
/* 326 */       super(☃, i, 89, 20, oe.d, a1);
/* 327 */       this.a = j;
/* 328 */       this.p = false;
/*     */     }
/*     */     
/*     */     public int a() {
/* 332 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j) {
/* 337 */       if (this.n && this.b.t.i().size() > this.a + dqr.a(this.b))
/* 338 */         if (i < this.l + 20) {
/* 339 */           bmb bmb = this.b.t.i().get(this.a + dqr.a(this.b)).b();
/* 340 */           dqr.a(this.b, ☃, bmb, i, j);
/* 341 */         } else if (i < this.l + 50 && i > this.l + 30) {
/* 342 */           bmb bmb = this.b.t.i().get(this.a + dqr.a(this.b)).c();
/* 343 */           if (!bmb.a()) {
/* 344 */             dqr.b(this.b, ☃, bmb, i, j);
/*     */           }
/* 346 */         } else if (i > this.l + 65) {
/* 347 */           bmb bmb = this.b.t.i().get(this.a + dqr.a(this.b)).d();
/* 348 */           dqr.c(this.b, ☃, bmb, i, j);
/*     */         }  
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */