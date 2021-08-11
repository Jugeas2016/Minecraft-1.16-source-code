/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dum<T extends aqm>
/*     */   extends dtf<T>
/*     */   implements dth, dui
/*     */ {
/*     */   public dwn f;
/*     */   public dwn g;
/*     */   public dwn h;
/*     */   public dwn i;
/*     */   public dwn j;
/*     */   public dwn k;
/*     */   public dwn l;
/*     */   
/*     */   public enum a
/*     */   {
/*  20 */     a(false),
/*  21 */     b(false),
/*  22 */     c(false),
/*  23 */     d(true),
/*  24 */     e(false),
/*  25 */     f(true),
/*  26 */     g(true);
/*     */     
/*     */     private final boolean h;
/*     */ 
/*     */     
/*     */     a(boolean ☃) {
/*  32 */       this.h = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/*  36 */       return this.h;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   public a m = a.a;
/*  49 */   public a n = a.a;
/*     */   public boolean o;
/*     */   public float p;
/*     */   
/*     */   public dum(float ☃) {
/*  54 */     this(eao::d, ☃, 0.0F, 64, 32);
/*     */   }
/*     */   
/*     */   protected dum(float ☃, float f1, int i, int j) {
/*  58 */     this(eao::d, ☃, f1, i, j);
/*     */   }
/*     */   
/*     */   public dum(Function<vk, eao> ☃, float f1, float f2, int i, int j) {
/*  62 */     super(☃, true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F);
/*  63 */     this.r = i;
/*  64 */     this.s = j;
/*     */     
/*  66 */     this.f = new dwn(this, 0, 0);
/*  67 */     this.f.a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, f1);
/*  68 */     this.f.a(0.0F, 0.0F + f2, 0.0F);
/*     */     
/*  70 */     this.g = new dwn(this, 32, 0);
/*  71 */     this.g.a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, f1 + 0.5F);
/*  72 */     this.g.a(0.0F, 0.0F + f2, 0.0F);
/*     */     
/*  74 */     this.h = new dwn(this, 16, 16);
/*  75 */     this.h.a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, f1);
/*  76 */     this.h.a(0.0F, 0.0F + f2, 0.0F);
/*     */     
/*  78 */     this.i = new dwn(this, 40, 16);
/*  79 */     this.i.a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, f1);
/*  80 */     this.i.a(-5.0F, 2.0F + f2, 0.0F);
/*     */     
/*  82 */     this.j = new dwn(this, 40, 16);
/*  83 */     this.j.g = true;
/*  84 */     this.j.a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, f1);
/*  85 */     this.j.a(5.0F, 2.0F + f2, 0.0F);
/*     */     
/*  87 */     this.k = new dwn(this, 0, 16);
/*  88 */     this.k.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, f1);
/*  89 */     this.k.a(-1.9F, 12.0F + f2, 0.0F);
/*     */     
/*  91 */     this.l = new dwn(this, 0, 16);
/*  92 */     this.l.g = true;
/*  93 */     this.l.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, f1);
/*  94 */     this.l.a(1.9F, 12.0F + f2, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> a() {
/*  99 */     return (Iterable<dwn>)ImmutableList.of(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/* 104 */     return (Iterable<dwn>)ImmutableList.of(this.h, this.i, this.j, this.k, this.l, this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3) {
/* 109 */     this.p = ☃.a(f3);
/* 110 */     super.a(☃, f1, f2, f3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 115 */     boolean bool1 = (☃.eg() > 4);
/* 116 */     boolean bool2 = ☃.bC();
/*     */     
/* 118 */     this.f.e = f4 * 0.017453292F;
/* 119 */     if (bool1) {
/* 120 */       this.f.d = -0.7853982F;
/* 121 */     } else if (this.p > 0.0F) {
/* 122 */       if (bool2) {
/* 123 */         this.f.d = a(this.p, this.f.d, -0.7853982F);
/*     */       } else {
/* 125 */         this.f.d = a(this.p, this.f.d, f5 * 0.017453292F);
/*     */       } 
/*     */     } else {
/* 128 */       this.f.d = f5 * 0.017453292F;
/*     */     } 
/*     */     
/* 131 */     this.h.e = 0.0F;
/* 132 */     this.i.c = 0.0F;
/* 133 */     this.i.a = -5.0F;
/* 134 */     this.j.c = 0.0F;
/* 135 */     this.j.a = 5.0F;
/*     */     
/* 137 */     float f = 1.0F;
/* 138 */     if (bool1) {
/* 139 */       f = (float)☃.cC().g();
/* 140 */       f /= 0.2F;
/* 141 */       f *= f * f;
/*     */     } 
/* 143 */     if (f < 1.0F) {
/* 144 */       f = 1.0F;
/*     */     }
/*     */     
/* 147 */     this.i.d = afm.b(f1 * 0.6662F + 3.1415927F) * 2.0F * f2 * 0.5F / f;
/* 148 */     this.j.d = afm.b(f1 * 0.6662F) * 2.0F * f2 * 0.5F / f;
/*     */     
/* 150 */     this.i.f = 0.0F;
/* 151 */     this.j.f = 0.0F;
/*     */     
/* 153 */     this.k.d = afm.b(f1 * 0.6662F) * 1.4F * f2 / f;
/* 154 */     this.l.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2 / f;
/* 155 */     this.k.e = 0.0F;
/* 156 */     this.l.e = 0.0F;
/* 157 */     this.k.f = 0.0F;
/* 158 */     this.l.f = 0.0F;
/*     */     
/* 160 */     if (this.d) {
/* 161 */       this.i.d += -0.62831855F;
/* 162 */       this.j.d += -0.62831855F;
/*     */       
/* 164 */       this.k.d = -1.4137167F;
/* 165 */       this.k.e = 0.31415927F;
/* 166 */       this.k.f = 0.07853982F;
/*     */       
/* 168 */       this.l.d = -1.4137167F;
/* 169 */       this.l.e = -0.31415927F;
/* 170 */       this.l.f = -0.07853982F;
/*     */     } 
/*     */     
/* 173 */     this.i.e = 0.0F;
/* 174 */     this.j.e = 0.0F;
/*     */ 
/*     */     
/* 177 */     boolean bool3 = (☃.dV() == aqi.b);
/* 178 */     boolean bool4 = bool3 ? this.m.a() : this.n.a();
/* 179 */     if (bool3 != bool4) {
/* 180 */       c(☃);
/* 181 */       b(☃);
/*     */     } else {
/* 183 */       b(☃);
/* 184 */       c(☃);
/*     */     } 
/*     */     
/* 187 */     a(☃, f3);
/*     */     
/* 189 */     if (this.o) {
/* 190 */       this.h.d = 0.5F;
/* 191 */       this.i.d += 0.4F;
/* 192 */       this.j.d += 0.4F;
/* 193 */       this.k.c = 4.0F;
/* 194 */       this.l.c = 4.0F;
/* 195 */       this.k.b = 12.2F;
/* 196 */       this.l.b = 12.2F;
/* 197 */       this.f.b = 4.2F;
/* 198 */       this.h.b = 3.2F;
/* 199 */       this.j.b = 5.2F;
/* 200 */       this.i.b = 5.2F;
/*     */     } else {
/* 202 */       this.h.d = 0.0F;
/* 203 */       this.k.c = 0.1F;
/* 204 */       this.l.c = 0.1F;
/* 205 */       this.k.b = 12.0F;
/* 206 */       this.l.b = 12.0F;
/* 207 */       this.f.b = 0.0F;
/* 208 */       this.h.b = 0.0F;
/* 209 */       this.j.b = 2.0F;
/* 210 */       this.i.b = 2.0F;
/*     */     } 
/*     */     
/* 213 */     dtg.a(this.i, this.j, f3);
/*     */     
/* 215 */     if (this.p > 0.0F) {
/* 216 */       float f6 = f1 % 26.0F;
/*     */ 
/*     */       
/* 219 */       aqi aqi = a(☃);
/* 220 */       float f7 = (aqi == aqi.b && this.c > 0.0F) ? 0.0F : this.p;
/* 221 */       float f8 = (aqi == aqi.a && this.c > 0.0F) ? 0.0F : this.p;
/*     */       
/* 223 */       if (f6 < 14.0F) {
/* 224 */         this.j.d = a(f8, this.j.d, 0.0F);
/* 225 */         this.i.d = afm.g(f7, this.i.d, 0.0F);
/*     */         
/* 227 */         this.j.e = a(f8, this.j.e, 3.1415927F);
/* 228 */         this.i.e = afm.g(f7, this.i.e, 3.1415927F);
/*     */         
/* 230 */         this.j.f = a(f8, this.j.f, 3.1415927F + 1.8707964F * a(f6) / a(14.0F));
/* 231 */         this.i.f = afm.g(f7, this.i.f, 3.1415927F - 1.8707964F * a(f6) / a(14.0F));
/* 232 */       } else if (f6 >= 14.0F && f6 < 22.0F) {
/* 233 */         float f11 = (f6 - 14.0F) / 8.0F;
/*     */         
/* 235 */         this.j.d = a(f8, this.j.d, 1.5707964F * f11);
/* 236 */         this.i.d = afm.g(f7, this.i.d, 1.5707964F * f11);
/*     */         
/* 238 */         this.j.e = a(f8, this.j.e, 3.1415927F);
/* 239 */         this.i.e = afm.g(f7, this.i.e, 3.1415927F);
/*     */         
/* 241 */         this.j.f = a(f8, this.j.f, 5.012389F - 1.8707964F * f11);
/* 242 */         this.i.f = afm.g(f7, this.i.f, 1.2707963F + 1.8707964F * f11);
/* 243 */       } else if (f6 >= 22.0F && f6 < 26.0F) {
/* 244 */         float f11 = (f6 - 22.0F) / 4.0F;
/*     */         
/* 246 */         this.j.d = a(f8, this.j.d, 1.5707964F - 1.5707964F * f11);
/* 247 */         this.i.d = afm.g(f7, this.i.d, 1.5707964F - 1.5707964F * f11);
/*     */         
/* 249 */         this.j.e = a(f8, this.j.e, 3.1415927F);
/* 250 */         this.i.e = afm.g(f7, this.i.e, 3.1415927F);
/*     */         
/* 252 */         this.j.f = a(f8, this.j.f, 3.1415927F);
/* 253 */         this.i.f = afm.g(f7, this.i.f, 3.1415927F);
/*     */       } 
/*     */       
/* 256 */       float f9 = 0.3F;
/* 257 */       float f10 = 0.33333334F;
/* 258 */       this.l.d = afm.g(this.p, this.l.d, 0.3F * afm.b(f1 * 0.33333334F + 3.1415927F));
/* 259 */       this.k.d = afm.g(this.p, this.k.d, 0.3F * afm.b(f1 * 0.33333334F));
/*     */     } 
/*     */     
/* 262 */     this.g.a(this.f);
/*     */   }
/*     */   
/*     */   private void b(T ☃) {
/* 266 */     switch (null.a[this.n.ordinal()]) {
/*     */       case 1:
/* 268 */         this.i.e = 0.0F;
/*     */         break;
/*     */       case 2:
/* 271 */         this.i.d = this.i.d * 0.5F - 0.9424779F;
/* 272 */         this.i.e = -0.5235988F;
/*     */         break;
/*     */       case 3:
/* 275 */         this.i.d = this.i.d * 0.5F - 0.31415927F;
/* 276 */         this.i.e = 0.0F;
/*     */         break;
/*     */       case 4:
/* 279 */         this.i.d = this.i.d * 0.5F - 3.1415927F;
/* 280 */         this.i.e = 0.0F;
/*     */         break;
/*     */       case 5:
/* 283 */         this.i.e = -0.1F + this.f.e;
/* 284 */         this.j.e = 0.1F + this.f.e + 0.4F;
/* 285 */         this.i.d = -1.5707964F + this.f.d;
/* 286 */         this.j.d = -1.5707964F + this.f.d;
/*     */         break;
/*     */       case 6:
/* 289 */         dtg.a(this.i, this.j, (aqm)☃, true);
/*     */         break;
/*     */       case 7:
/* 292 */         dtg.a(this.i, this.j, this.f, true);
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c(T ☃) {
/* 298 */     switch (null.a[this.m.ordinal()]) {
/*     */       case 1:
/* 300 */         this.j.e = 0.0F;
/*     */         break;
/*     */       case 2:
/* 303 */         this.j.d = this.j.d * 0.5F - 0.9424779F;
/* 304 */         this.j.e = 0.5235988F;
/*     */         break;
/*     */       case 3:
/* 307 */         this.j.d = this.j.d * 0.5F - 0.31415927F;
/* 308 */         this.j.e = 0.0F;
/*     */         break;
/*     */       case 4:
/* 311 */         this.j.d = this.j.d * 0.5F - 3.1415927F;
/* 312 */         this.j.e = 0.0F;
/*     */         break;
/*     */       case 5:
/* 315 */         this.i.e = -0.1F + this.f.e - 0.4F;
/* 316 */         this.j.e = 0.1F + this.f.e;
/* 317 */         this.i.d = -1.5707964F + this.f.d;
/* 318 */         this.j.d = -1.5707964F + this.f.d;
/*     */         break;
/*     */       case 6:
/* 321 */         dtg.a(this.i, this.j, (aqm)☃, false);
/*     */         break;
/*     */       case 7:
/* 324 */         dtg.a(this.i, this.j, this.f, false);
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(T ☃, float f) {
/* 330 */     if (this.c <= 0.0F) {
/*     */       return;
/*     */     }
/*     */     
/* 334 */     aqi aqi = a(☃);
/* 335 */     dwn dwn1 = a(aqi);
/*     */     
/* 337 */     float f1 = this.c;
/* 338 */     this.h.e = afm.a(afm.c(f1) * 6.2831855F) * 0.2F;
/* 339 */     if (aqi == aqi.a) {
/* 340 */       this.h.e *= -1.0F;
/*     */     }
/* 342 */     this.i.c = afm.a(this.h.e) * 5.0F;
/* 343 */     this.i.a = -afm.b(this.h.e) * 5.0F;
/* 344 */     this.j.c = -afm.a(this.h.e) * 5.0F;
/* 345 */     this.j.a = afm.b(this.h.e) * 5.0F;
/* 346 */     this.i.e += this.h.e;
/* 347 */     this.j.e += this.h.e;
/* 348 */     this.j.d += this.h.e;
/*     */     
/* 350 */     f1 = 1.0F - this.c;
/* 351 */     f1 *= f1;
/* 352 */     f1 *= f1;
/* 353 */     f1 = 1.0F - f1;
/* 354 */     float f2 = afm.a(f1 * 3.1415927F);
/* 355 */     float f3 = afm.a(this.c * 3.1415927F) * -(this.f.d - 0.7F) * 0.75F;
/* 356 */     dwn1.d = (float)(dwn1.d - f2 * 1.2D + f3);
/* 357 */     dwn1.e += this.h.e * 2.0F;
/* 358 */     dwn1.f += afm.a(this.c * 3.1415927F) * -0.4F;
/*     */   }
/*     */   
/*     */   protected float a(float ☃, float f1, float f2) {
/* 362 */     float f = (f2 - f1) % 6.2831855F;
/* 363 */     if (f < -3.1415927F) {
/* 364 */       f += 6.2831855F;
/*     */     }
/* 366 */     if (f >= 3.1415927F) {
/* 367 */       f -= 6.2831855F;
/*     */     }
/* 369 */     return f1 + ☃ * f;
/*     */   }
/*     */   
/*     */   private float a(float ☃) {
/* 373 */     return -65.0F * ☃ + ☃ * ☃;
/*     */   }
/*     */   
/*     */   public void a(dum<T> ☃) {
/* 377 */     a(☃);
/*     */     
/* 379 */     ☃.m = this.m;
/* 380 */     ☃.n = this.n;
/* 381 */     ☃.o = this.o;
/*     */     
/* 383 */     ☃.f.a(this.f);
/* 384 */     ☃.g.a(this.g);
/* 385 */     ☃.h.a(this.h);
/* 386 */     ☃.i.a(this.i);
/* 387 */     ☃.j.a(this.j);
/* 388 */     ☃.k.a(this.k);
/* 389 */     ☃.l.a(this.l);
/*     */   }
/*     */   
/*     */   public void d_(boolean ☃) {
/* 393 */     this.f.h = ☃;
/* 394 */     this.g.h = ☃;
/* 395 */     this.h.h = ☃;
/* 396 */     this.i.h = ☃;
/* 397 */     this.j.h = ☃;
/* 398 */     this.k.h = ☃;
/* 399 */     this.l.h = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqi ☃, dfm dfm1) {
/* 404 */     a(☃).a(dfm1);
/*     */   }
/*     */   
/*     */   protected dwn a(aqi ☃) {
/* 408 */     if (☃ == aqi.a) {
/* 409 */       return this.j;
/*     */     }
/* 411 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public dwn c() {
/* 417 */     return this.f;
/*     */   }
/*     */   
/*     */   protected aqi a(T ☃) {
/* 421 */     aqi aqi = ☃.dV();
/* 422 */     return (((aqm)☃).aj == aot.a) ? aqi : aqi.a();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */