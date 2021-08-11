/*     */ import java.util.Random;
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
/*     */ public class eeq
/*     */   extends eeu<bbr>
/*     */ {
/*  21 */   public static final vk a = new vk("textures/entity/end_crystal/end_crystal_beam.png");
/*  22 */   private static final vk e = new vk("textures/entity/enderdragon/dragon_exploding.png");
/*  23 */   private static final vk f = new vk("textures/entity/enderdragon/dragon.png");
/*  24 */   private static final vk g = new vk("textures/entity/enderdragon/dragon_eyes.png");
/*     */   
/*  26 */   private static final eao h = eao.d(f);
/*  27 */   private static final eao i = eao.j(f);
/*  28 */   private static final eao j = eao.m(g);
/*  29 */   private static final eao k = eao.i(a);
/*     */   
/*  31 */   private static final float l = (float)(Math.sqrt(3.0D) / 2.0D);
/*     */   
/*  33 */   private final a m = new a();
/*     */   
/*     */   public eeq(eet ☃) {
/*  36 */     super(☃);
/*  37 */     this.c = 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bbr ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  42 */     dfm1.a();
/*     */     
/*  44 */     float f3 = (float)☃.a(7, f2)[0];
/*  45 */     float f4 = (float)(☃.a(5, f2)[1] - ☃.a(10, f2)[1]);
/*  46 */     dfm1.a(g.d.a(-f3));
/*  47 */     dfm1.a(g.b.a(f4 * 10.0F));
/*  48 */     dfm1.a(0.0D, 0.0D, 1.0D);
/*     */ 
/*     */ 
/*     */     
/*  52 */     dfm1.a(-1.0F, -1.0F, 1.0F);
/*     */ 
/*     */     
/*  55 */     dfm1.a(0.0D, -1.5010000467300415D, 0.0D);
/*     */     
/*  57 */     boolean bool = (☃.an > 0);
/*     */     
/*  59 */     this.m.a(☃, 0.0F, 0.0F, f2);
/*     */     
/*  61 */     if (☃.bs > 0) {
/*     */       
/*  63 */       float f = ☃.bs / 200.0F;
/*  64 */       dfq dfq1 = eag1.getBuffer(eao.a(e, f));
/*  65 */       this.m.a(dfm1, dfq1, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/*  67 */       dfq dfq2 = eag1.getBuffer(i);
/*  68 */       this.m.a(dfm1, dfq2, i, ejw.a(0.0F, bool), 1.0F, 1.0F, 1.0F, 1.0F);
/*     */     } else {
/*  70 */       dfq dfq1 = eag1.getBuffer(h);
/*  71 */       this.m.a(dfm1, dfq1, i, ejw.a(0.0F, bool), 1.0F, 1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */     
/*  74 */     dfq dfq = eag1.getBuffer(j);
/*  75 */     this.m.a(dfm1, dfq, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/*  77 */     if (☃.bs > 0) {
/*  78 */       float f5 = (☃.bs + f2) / 200.0F;
/*  79 */       float f6 = Math.min((f5 > 0.8F) ? ((f5 - 0.8F) / 0.2F) : 0.0F, 1.0F);
/*     */       
/*  81 */       Random random = new Random(432L);
/*     */       
/*  83 */       dfq dfq1 = eag1.getBuffer(eao.r());
/*     */       
/*  85 */       dfm1.a();
/*  86 */       dfm1.a(0.0D, -1.0D, -2.0D);
/*  87 */       for (int j = 0; j < (f5 + f5 * f5) / 2.0F * 60.0F; j++) {
/*  88 */         dfm1.a(g.b.a(random.nextFloat() * 360.0F));
/*  89 */         dfm1.a(g.d.a(random.nextFloat() * 360.0F));
/*  90 */         dfm1.a(g.f.a(random.nextFloat() * 360.0F));
/*  91 */         dfm1.a(g.b.a(random.nextFloat() * 360.0F));
/*  92 */         dfm1.a(g.d.a(random.nextFloat() * 360.0F));
/*  93 */         dfm1.a(g.f.a(random.nextFloat() * 360.0F + f5 * 90.0F));
/*     */         
/*  95 */         float f7 = random.nextFloat() * 20.0F + 5.0F + f6 * 10.0F;
/*  96 */         float f8 = random.nextFloat() * 2.0F + 1.0F + f6 * 2.0F;
/*     */         
/*  98 */         b b = dfm1.c().a();
/*     */         
/* 100 */         int k = (int)(255.0F * (1.0F - f6));
/*     */         
/* 102 */         a(dfq1, b, k);
/* 103 */         a(dfq1, b, f7, f8);
/* 104 */         b(dfq1, b, f7, f8);
/*     */         
/* 106 */         a(dfq1, b, k);
/* 107 */         b(dfq1, b, f7, f8);
/* 108 */         c(dfq1, b, f7, f8);
/*     */         
/* 110 */         a(dfq1, b, k);
/* 111 */         c(dfq1, b, f7, f8);
/* 112 */         a(dfq1, b, f7, f8);
/*     */       } 
/* 114 */       dfm1.b();
/*     */     } 
/*     */     
/* 117 */     dfm1.b();
/*     */     
/* 119 */     if (☃.bu != null) {
/* 120 */       dfm1.a();
/*     */       
/* 122 */       float f5 = (float)(☃.bu.cD() - afm.d(f2, ☃.m, ☃.cD()));
/* 123 */       float f6 = (float)(☃.bu.cE() - afm.d(f2, ☃.n, ☃.cE()));
/* 124 */       float f7 = (float)(☃.bu.cH() - afm.d(f2, ☃.o, ☃.cH()));
/*     */       
/* 126 */       a(f5, f6 + eep.a(☃.bu, f2), f7, f2, ☃.K, dfm1, eag1, i);
/* 127 */       dfm1.b();
/*     */     } 
/*     */     
/* 130 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */   }
/*     */   
/*     */   private static void a(dfq ☃, b b1, int i) {
/* 134 */     ☃.a(b1, 0.0F, 0.0F, 0.0F).a(255, 255, 255, i).d();
/* 135 */     ☃.a(b1, 0.0F, 0.0F, 0.0F).a(255, 255, 255, i).d();
/*     */   }
/*     */   
/*     */   private static void a(dfq ☃, b b1, float f1, float f2) {
/* 139 */     ☃.a(b1, -l * f2, f1, -0.5F * f2).a(255, 0, 255, 0).d();
/*     */   }
/*     */   
/*     */   private static void b(dfq ☃, b b1, float f1, float f2) {
/* 143 */     ☃.a(b1, l * f2, f1, -0.5F * f2).a(255, 0, 255, 0).d();
/*     */   }
/*     */   
/*     */   private static void c(dfq ☃, b b1, float f1, float f2) {
/* 147 */     ☃.a(b1, 0.0F, f1, 1.0F * f2).a(255, 0, 255, 0).d();
/*     */   }
/*     */   
/*     */   public static void a(float ☃, float f1, float f2, float f3, int i, dfm dfm1, eag eag1, int j) {
/* 151 */     float f4 = afm.c(☃ * ☃ + f2 * f2);
/* 152 */     float f5 = afm.c(☃ * ☃ + f1 * f1 + f2 * f2);
/*     */     
/* 154 */     dfm1.a();
/* 155 */     dfm1.a(0.0D, 2.0D, 0.0D);
/* 156 */     dfm1.a(g.d.c((float)-Math.atan2(f2, ☃) - 1.5707964F));
/* 157 */     dfm1.a(g.b.c((float)-Math.atan2(f4, f1) - 1.5707964F));
/*     */     
/* 159 */     dfq dfq = eag1.getBuffer(k);
/*     */     
/* 161 */     float f6 = 0.0F - (i + f3) * 0.01F;
/* 162 */     float f7 = afm.c(☃ * ☃ + f1 * f1 + f2 * f2) / 32.0F - (i + f3) * 0.01F;
/*     */     
/* 164 */     int k = 8;
/* 165 */     float f8 = 0.0F;
/* 166 */     float f9 = 0.75F;
/* 167 */     float f10 = 0.0F;
/*     */     
/* 169 */     dfm.a a1 = dfm1.c();
/* 170 */     b b = a1.a();
/* 171 */     a a2 = a1.b();
/*     */     
/* 173 */     for (int m = 1; m <= 8; m++) {
/* 174 */       float f11 = afm.a(m * 6.2831855F / 8.0F) * 0.75F;
/* 175 */       float f12 = afm.b(m * 6.2831855F / 8.0F) * 0.75F;
/* 176 */       float f13 = m / 8.0F;
/* 177 */       dfq
/* 178 */         .a(b, f8 * 0.2F, f9 * 0.2F, 0.0F)
/* 179 */         .a(0, 0, 0, 255)
/* 180 */         .a(f10, f6)
/* 181 */         .b(ejw.a)
/* 182 */         .a(j)
/* 183 */         .a(a2, 0.0F, -1.0F, 0.0F)
/* 184 */         .d();
/*     */       
/* 186 */       dfq
/* 187 */         .a(b, f8, f9, f5)
/* 188 */         .a(255, 255, 255, 255)
/* 189 */         .a(f10, f7)
/* 190 */         .b(ejw.a)
/* 191 */         .a(j)
/* 192 */         .a(a2, 0.0F, -1.0F, 0.0F)
/* 193 */         .d();
/*     */       
/* 195 */       dfq
/* 196 */         .a(b, f11, f12, f5)
/* 197 */         .a(255, 255, 255, 255)
/* 198 */         .a(f13, f7)
/* 199 */         .b(ejw.a)
/* 200 */         .a(j)
/* 201 */         .a(a2, 0.0F, -1.0F, 0.0F)
/* 202 */         .d();
/*     */       
/* 204 */       dfq
/* 205 */         .a(b, f11 * 0.2F, f12 * 0.2F, 0.0F)
/* 206 */         .a(0, 0, 0, 255)
/* 207 */         .a(f13, f6)
/* 208 */         .b(ejw.a)
/* 209 */         .a(j)
/* 210 */         .a(a2, 0.0F, -1.0F, 0.0F)
/* 211 */         .d();
/*     */       
/* 213 */       f8 = f11;
/* 214 */       f9 = f12;
/* 215 */       f10 = f13;
/*     */     } 
/*     */     
/* 218 */     dfm1.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(bbr ☃) {
/* 223 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */     extends duc<bbr>
/*     */   {
/*     */     private final dwn a;
/*     */     
/*     */     private final dwn b;
/*     */     
/*     */     private final dwn f;
/*     */     
/*     */     private final dwn g;
/*     */     
/*     */     private dwn h;
/*     */     
/*     */     private dwn i;
/*     */     
/*     */     private dwn j;
/*     */     
/*     */     private dwn k;
/*     */     
/*     */     private dwn l;
/*     */     private dwn m;
/*     */     private dwn n;
/*     */     private dwn o;
/*     */     private dwn p;
/*     */     private dwn t;
/*     */     private dwn u;
/*     */     private dwn v;
/*     */     private dwn w;
/*     */     private dwn x;
/*     */     private dwn y;
/*     */     private dwn z;
/*     */     @Nullable
/*     */     private bbr A;
/*     */     private float B;
/*     */     
/*     */     public a() {
/* 263 */       float ☃ = -16.0F;
/* 264 */       this.a = new dwn(this);
/* 265 */       this.a.a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 0.0F, 176, 44);
/* 266 */       this.a.a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 0.0F, 112, 30);
/* 267 */       this.a.g = true;
/* 268 */       this.a.a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0.0F, 0, 0);
/* 269 */       this.a.a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 0.0F, 112, 0);
/* 270 */       this.a.g = false;
/* 271 */       this.a.a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0.0F, 0, 0);
/* 272 */       this.a.a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 0.0F, 112, 0);
/*     */       
/* 274 */       this.f = new dwn(this);
/* 275 */       this.f.a(0.0F, 4.0F, -8.0F);
/* 276 */       this.f.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 0.0F, 176, 65);
/* 277 */       this.a.b(this.f);
/*     */       
/* 279 */       this.b = new dwn(this);
/* 280 */       this.b.a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 0.0F, 192, 104);
/* 281 */       this.b.a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 0.0F, 48, 0);
/*     */       
/* 283 */       this.g = new dwn(this);
/* 284 */       this.g.a(0.0F, 4.0F, 8.0F);
/* 285 */       this.g.a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64, 0.0F, 0, 0);
/* 286 */       this.g.a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12, 0.0F, 220, 53);
/* 287 */       this.g.a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12, 0.0F, 220, 53);
/* 288 */       this.g.a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12, 0.0F, 220, 53);
/*     */       
/* 290 */       this.h = new dwn(this);
/* 291 */       this.h.g = true;
/* 292 */       this.h.a(12.0F, 5.0F, 2.0F);
/* 293 */       this.h.a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 0.0F, 112, 88);
/* 294 */       this.h.a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, 0.0F, -56, 88);
/* 295 */       this.i = new dwn(this);
/* 296 */       this.i.g = true;
/* 297 */       this.i.a(56.0F, 0.0F, 0.0F);
/* 298 */       this.i.a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 0.0F, 112, 136);
/* 299 */       this.i.a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, 0.0F, -56, 144);
/* 300 */       this.h.b(this.i);
/*     */       
/* 302 */       this.j = new dwn(this);
/* 303 */       this.j.a(12.0F, 20.0F, 2.0F);
/* 304 */       this.j.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 0.0F, 112, 104);
/* 305 */       this.k = new dwn(this);
/* 306 */       this.k.a(0.0F, 20.0F, -1.0F);
/* 307 */       this.k.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 0.0F, 226, 138);
/* 308 */       this.j.b(this.k);
/* 309 */       this.l = new dwn(this);
/* 310 */       this.l.a(0.0F, 23.0F, 0.0F);
/* 311 */       this.l.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 0.0F, 144, 104);
/* 312 */       this.k.b(this.l);
/*     */       
/* 314 */       this.m = new dwn(this);
/* 315 */       this.m.a(16.0F, 16.0F, 42.0F);
/* 316 */       this.m.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0.0F, 0, 0);
/* 317 */       this.n = new dwn(this);
/* 318 */       this.n.a(0.0F, 32.0F, -4.0F);
/* 319 */       this.n.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 0.0F, 196, 0);
/* 320 */       this.m.b(this.n);
/* 321 */       this.o = new dwn(this);
/* 322 */       this.o.a(0.0F, 31.0F, 4.0F);
/* 323 */       this.o.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 0.0F, 112, 0);
/* 324 */       this.n.b(this.o);
/*     */       
/* 326 */       this.p = new dwn(this);
/* 327 */       this.p.a(-12.0F, 5.0F, 2.0F);
/* 328 */       this.p.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 0.0F, 112, 88);
/* 329 */       this.p.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, 0.0F, -56, 88);
/* 330 */       this.t = new dwn(this);
/* 331 */       this.t.a(-56.0F, 0.0F, 0.0F);
/* 332 */       this.t.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 0.0F, 112, 136);
/* 333 */       this.t.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, 0.0F, -56, 144);
/* 334 */       this.p.b(this.t);
/*     */       
/* 336 */       this.u = new dwn(this);
/* 337 */       this.u.a(-12.0F, 20.0F, 2.0F);
/* 338 */       this.u.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 0.0F, 112, 104);
/* 339 */       this.v = new dwn(this);
/* 340 */       this.v.a(0.0F, 20.0F, -1.0F);
/* 341 */       this.v.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 0.0F, 226, 138);
/* 342 */       this.u.b(this.v);
/* 343 */       this.w = new dwn(this);
/* 344 */       this.w.a(0.0F, 23.0F, 0.0F);
/* 345 */       this.w.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 0.0F, 144, 104);
/* 346 */       this.v.b(this.w);
/*     */       
/* 348 */       this.x = new dwn(this);
/* 349 */       this.x.a(-16.0F, 16.0F, 42.0F);
/* 350 */       this.x.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0.0F, 0, 0);
/* 351 */       this.y = new dwn(this);
/* 352 */       this.y.a(0.0F, 32.0F, -4.0F);
/* 353 */       this.y.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 0.0F, 196, 0);
/* 354 */       this.x.b(this.y);
/* 355 */       this.z = new dwn(this);
/* 356 */       this.z.a(0.0F, 31.0F, 4.0F);
/* 357 */       this.z.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 0.0F, 112, 0);
/* 358 */       this.y.b(this.z);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(bbr ☃, float f1, float f2, float f3) {
/* 363 */       this.A = ☃;
/* 364 */       this.B = f3;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void a(bbr ☃, float f1, float f2, float f3, float f4, float f5) {}
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/* 373 */       ☃.a();
/* 374 */       float f5 = afm.g(this.B, this.A.bp, this.A.bq);
/* 375 */       this.f.d = (float)(Math.sin((f5 * 6.2831855F)) + 1.0D) * 0.2F;
/*     */       
/* 377 */       float f6 = (float)(Math.sin((f5 * 6.2831855F - 1.0F)) + 1.0D);
/* 378 */       f6 = (f6 * f6 + f6 * 2.0F) * 0.05F;
/*     */       
/* 380 */       ☃.a(0.0D, (f6 - 2.0F), -3.0D);
/* 381 */       ☃.a(g.b.a(f6 * 2.0F));
/*     */       
/* 383 */       float f7 = 0.0F;
/* 384 */       float f8 = 20.0F;
/* 385 */       float f9 = -12.0F;
/*     */       
/* 387 */       float f10 = 1.5F;
/*     */       
/* 389 */       double[] arrayOfDouble1 = this.A.a(6, this.B);
/*     */       
/* 391 */       float f11 = afm.l(this.A.a(5, this.B)[0] - this.A.a(10, this.B)[0]);
/* 392 */       float f12 = afm.l(this.A.a(5, this.B)[0] + (f11 / 2.0F));
/*     */       
/* 394 */       float f13 = f5 * 6.2831855F;
/* 395 */       for (int k = 0; k < 5; k++) {
/* 396 */         double[] arrayOfDouble = this.A.a(5 - k, this.B);
/* 397 */         float f = (float)Math.cos((k * 0.45F + f13)) * 0.15F;
/* 398 */         this.b.e = afm.l(arrayOfDouble[0] - arrayOfDouble1[0]) * 0.017453292F * 1.5F;
/* 399 */         this.b.d = f + this.A.a(k, arrayOfDouble1, arrayOfDouble) * 0.017453292F * 1.5F * 5.0F;
/* 400 */         this.b.f = -afm.l(arrayOfDouble[0] - f12) * 0.017453292F * 1.5F;
/*     */         
/* 402 */         this.b.b = f8;
/* 403 */         this.b.c = f9;
/* 404 */         this.b.a = f7;
/* 405 */         f8 = (float)(f8 + Math.sin(this.b.d) * 10.0D);
/* 406 */         f9 = (float)(f9 - Math.cos(this.b.e) * Math.cos(this.b.d) * 10.0D);
/* 407 */         f7 = (float)(f7 - Math.sin(this.b.e) * Math.cos(this.b.d) * 10.0D);
/* 408 */         this.b.a(☃, dfq1, i, j);
/*     */       } 
/*     */       
/* 411 */       this.a.b = f8;
/* 412 */       this.a.c = f9;
/* 413 */       this.a.a = f7;
/* 414 */       double[] arrayOfDouble2 = this.A.a(0, this.B);
/* 415 */       this.a.e = afm.l(arrayOfDouble2[0] - arrayOfDouble1[0]) * 0.017453292F;
/* 416 */       this.a.d = afm.l(this.A.a(6, arrayOfDouble1, arrayOfDouble2)) * 0.017453292F * 1.5F * 5.0F;
/* 417 */       this.a.f = -afm.l(arrayOfDouble2[0] - f12) * 0.017453292F;
/* 418 */       this.a.a(☃, dfq1, i, j);
/* 419 */       ☃.a();
/* 420 */       ☃.a(0.0D, 1.0D, 0.0D);
/* 421 */       ☃.a(g.f.a(-f11 * 1.5F));
/* 422 */       ☃.a(0.0D, -1.0D, 0.0D);
/* 423 */       this.g.f = 0.0F;
/* 424 */       this.g.a(☃, dfq1, i, j);
/*     */       
/* 426 */       float f14 = f5 * 6.2831855F;
/* 427 */       this.h.d = 0.125F - (float)Math.cos(f14) * 0.2F;
/* 428 */       this.h.e = -0.25F;
/* 429 */       this.h.f = -((float)(Math.sin(f14) + 0.125D)) * 0.8F;
/* 430 */       this.i.f = (float)(Math.sin((f14 + 2.0F)) + 0.5D) * 0.75F;
/*     */       
/* 432 */       this.p.d = this.h.d;
/* 433 */       this.p.e = -this.h.e;
/* 434 */       this.p.f = -this.h.f;
/* 435 */       this.t.f = -this.i.f;
/*     */       
/* 437 */       a(☃, dfq1, i, j, f6, this.h, this.j, this.k, this.l, this.m, this.n, this.o);
/* 438 */       a(☃, dfq1, i, j, f6, this.p, this.u, this.v, this.w, this.x, this.y, this.z);
/*     */       
/* 440 */       ☃.b();
/*     */       
/* 442 */       float f15 = -((float)Math.sin((f5 * 6.2831855F))) * 0.0F;
/* 443 */       f13 = f5 * 6.2831855F;
/* 444 */       f8 = 10.0F;
/* 445 */       f9 = 60.0F;
/* 446 */       f7 = 0.0F;
/* 447 */       arrayOfDouble1 = this.A.a(11, this.B);
/* 448 */       for (int m = 0; m < 12; m++) {
/* 449 */         arrayOfDouble2 = this.A.a(12 + m, this.B);
/* 450 */         f15 = (float)(f15 + Math.sin((m * 0.45F + f13)) * 0.05000000074505806D);
/* 451 */         this.b.e = (afm.l(arrayOfDouble2[0] - arrayOfDouble1[0]) * 1.5F + 180.0F) * 0.017453292F;
/* 452 */         this.b.d = f15 + (float)(arrayOfDouble2[1] - arrayOfDouble1[1]) * 0.017453292F * 1.5F * 5.0F;
/* 453 */         this.b.f = afm.l(arrayOfDouble2[0] - f12) * 0.017453292F * 1.5F;
/* 454 */         this.b.b = f8;
/* 455 */         this.b.c = f9;
/* 456 */         this.b.a = f7;
/* 457 */         f8 = (float)(f8 + Math.sin(this.b.d) * 10.0D);
/* 458 */         f9 = (float)(f9 - Math.cos(this.b.e) * Math.cos(this.b.d) * 10.0D);
/* 459 */         f7 = (float)(f7 - Math.sin(this.b.e) * Math.cos(this.b.d) * 10.0D);
/* 460 */         this.b.a(☃, dfq1, i, j);
/*     */       } 
/* 462 */       ☃.b();
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, dfq dfq1, int i, int j, float f, dwn dwn1, dwn dwn2, dwn dwn3, dwn dwn4, dwn dwn5, dwn dwn6, dwn dwn7) {
/* 466 */       dwn5.d = 1.0F + f * 0.1F;
/* 467 */       dwn6.d = 0.5F + f * 0.1F;
/* 468 */       dwn7.d = 0.75F + f * 0.1F;
/*     */       
/* 470 */       dwn2.d = 1.3F + f * 0.1F;
/* 471 */       dwn3.d = -0.5F - f * 0.1F;
/* 472 */       dwn4.d = 0.75F + f * 0.1F;
/*     */       
/* 474 */       dwn1.a(☃, dfq1, i, j);
/* 475 */       dwn2.a(☃, dfq1, i, j);
/* 476 */       dwn5.a(☃, dfq1, i, j);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eeq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */