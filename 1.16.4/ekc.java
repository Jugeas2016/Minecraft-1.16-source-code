/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class ekc
/*     */   implements AutoCloseable
/*     */ {
/*     */   private final ekb b;
/*     */   private final a c;
/*     */   private final elc d;
/*     */   protected final det[] a;
/*     */   private final int[] e;
/*     */   private final int[] f;
/*     */   @Nullable
/*     */   private final b g;
/*     */   private final int h;
/*     */   private final int i;
/*     */   private final float j;
/*     */   private final float k;
/*     */   private final float l;
/*     */   private final float m;
/*     */   private int n;
/*     */   private int o;
/*     */   
/*     */   protected ekc(ekb ☃, a a1, int i, int j, int k, int m, int n, det det1) {
/*  45 */     this.b = ☃;
/*     */     
/*  47 */     elc elc1 = a.a(a1);
/*     */     
/*  49 */     int i1 = a.b(a1);
/*  50 */     int i2 = a.c(a1);
/*     */     
/*  52 */     this.h = m;
/*  53 */     this.i = n;
/*     */     
/*  55 */     this.j = m / j;
/*  56 */     this.k = (m + i1) / j;
/*  57 */     this.l = n / k;
/*  58 */     this.m = (n + i2) / k;
/*     */ 
/*     */ 
/*     */     
/*  62 */     int i3 = det1.a() / elc1.b(i1);
/*  63 */     int i4 = det1.b() / elc1.a(i2);
/*     */ 
/*     */ 
/*     */     
/*  67 */     if (elc1.a() > 0) {
/*  68 */       int i5 = ((Integer)elc1.d().stream().max(Integer::compareTo).get()).intValue() + 1;
/*  69 */       this.e = new int[i5];
/*  70 */       this.f = new int[i5];
/*  71 */       Arrays.fill(this.e, -1);
/*  72 */       Arrays.fill(this.f, -1);
/*  73 */       for (Iterator<Integer> iterator = elc1.d().iterator(); iterator.hasNext(); ) { int i6 = ((Integer)iterator.next()).intValue();
/*  74 */         if (i6 >= i3 * i4) {
/*  75 */           throw new RuntimeException("invalid frameindex " + i6);
/*     */         }
/*  77 */         int i7 = i6 / i3;
/*  78 */         int i8 = i6 % i3;
/*  79 */         this.e[i6] = i8;
/*  80 */         this.f[i6] = i7; }
/*     */     
/*     */     } else {
/*     */       
/*  84 */       List<elb> list = Lists.newArrayList();
/*     */       
/*  86 */       int i5 = i3 * i4;
/*  87 */       this.e = new int[i5];
/*  88 */       this.f = new int[i5];
/*  89 */       for (int i6 = 0; i6 < i4; i6++) {
/*  90 */         for (int i7 = 0; i7 < i3; i7++) {
/*  91 */           int i8 = i6 * i3 + i7;
/*  92 */           this.e[i8] = i7;
/*  93 */           this.f[i8] = i6;
/*  94 */           list.add(new elb(i8, -1));
/*     */         } 
/*     */       } 
/*  97 */       elc1 = new elc(list, i1, i2, elc1.b(), elc1.c());
/*     */     } 
/*     */     
/* 100 */     this.c = new a(a.d(a1), i1, i2, elc1);
/* 101 */     this.d = elc1;
/*     */     
/*     */     try {
/*     */       try {
/* 105 */         this.a = eju.a(det1, i);
/* 106 */       } catch (Throwable throwable) {
/* 107 */         l l = l.a(throwable, "Generating mipmaps for frame");
/* 108 */         m m1 = l.a("Frame being iterated");
/*     */         
/* 110 */         m1.a("First frame", () -> {
/*     */               StringBuilder stringBuilder = new StringBuilder();
/*     */               
/*     */               if (stringBuilder.length() > 0) {
/*     */                 stringBuilder.append(", ");
/*     */               }
/*     */               
/*     */               stringBuilder.append(☃.a()).append("x").append(☃.b());
/*     */               
/*     */               return stringBuilder.toString();
/*     */             });
/* 121 */         throw new u(l);
/*     */       } 
/* 123 */     } catch (Throwable throwable) {
/* 124 */       l l = l.a(throwable, "Applying mipmap");
/* 125 */       m m1 = l.a("Sprite being mipmapped");
/*     */       
/* 127 */       m1.a("Sprite name", () -> l().toString());
/* 128 */       m1.a("Sprite size", () -> f() + " x " + g());
/* 129 */       m1.a("Sprite frames", () -> n() + " frames");
/* 130 */       m1.a("Mipmap levels", Integer.valueOf(i));
/*     */       
/* 132 */       throw new u(l);
/*     */     } 
/*     */     
/* 135 */     if (elc1.c()) {
/* 136 */       this.g = new b(a1, i);
/*     */     } else {
/* 138 */       this.g = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 143 */     int i = this.e[☃] * a.b(this.c);
/* 144 */     int j = this.f[☃] * a.c(this.c);
/* 145 */     a(i, j, this.a);
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, det[] arrayOfDet) {
/* 149 */     for (int j = 0; j < this.a.length; j++) {
/* 150 */       arrayOfDet[j].a(j, this.h >> j, this.i >> j, ☃ >> j, i >> j, a.b(this.c) >> j, a.c(this.c) >> j, (this.a.length > 1), false);
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
/*     */   public int f() {
/* 163 */     return a.b(this.c);
/*     */   }
/*     */   
/*     */   public int g() {
/* 167 */     return a.c(this.c);
/*     */   }
/*     */   
/*     */   public float h() {
/* 171 */     return this.j;
/*     */   }
/*     */   
/*     */   public float i() {
/* 175 */     return this.k;
/*     */   }
/*     */   
/*     */   public float a(double ☃) {
/* 179 */     float f = this.k - this.j;
/* 180 */     return this.j + f * (float)☃ / 16.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float j() {
/* 189 */     return this.l;
/*     */   }
/*     */   
/*     */   public float k() {
/* 193 */     return this.m;
/*     */   }
/*     */   
/*     */   public float b(double ☃) {
/* 197 */     float f = this.m - this.l;
/* 198 */     return this.l + f * (float)☃ / 16.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public vk l() {
/* 207 */     return a.d(this.c);
/*     */   }
/*     */   
/*     */   public ekb m() {
/* 211 */     return this.b;
/*     */   }
/*     */   
/*     */   public int n() {
/* 215 */     return this.e.length;
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
/*     */   public void close() {
/* 249 */     for (det ☃ : this.a) {
/* 250 */       if (☃ != null) {
/* 251 */         ☃.close();
/*     */       }
/*     */     } 
/* 254 */     if (this.g != null) {
/* 255 */       this.g.close();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 261 */     int ☃ = this.e.length;
/* 262 */     return "TextureAtlasSprite{name='" + a.d(this.c) + '\'' + ", frameCount=" + ☃ + ", x=" + this.h + ", y=" + this.i + ", height=" + a.c(this.c) + ", width=" + a.b(this.c) + ", u0=" + this.j + ", u1=" + this.k + ", v0=" + this.l + ", v1=" + this.m + '}';
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 266 */     return ((this.a[0].a(i + this.e[☃] * a.b(this.c), j + this.f[☃] * a.c(this.c)) >> 24 & 0xFF) == 0);
/*     */   }
/*     */   
/*     */   public void o() {
/* 270 */     a(0);
/*     */   }
/*     */   
/*     */   private float a() {
/* 274 */     float ☃ = a.b(this.c) / (this.k - this.j);
/* 275 */     float f1 = a.c(this.c) / (this.m - this.l);
/* 276 */     return Math.max(f1, ☃);
/*     */   }
/*     */   
/*     */   public float p() {
/* 280 */     return 4.0F / a();
/*     */   }
/*     */   
/*     */   public void q() {
/* 284 */     this.o++;
/* 285 */     if (this.o >= this.d.c(this.n)) {
/* 286 */       int ☃ = this.d.e(this.n);
/* 287 */       int i = (this.d.a() == 0) ? n() : this.d.a();
/* 288 */       this.n = (this.n + 1) % i;
/* 289 */       this.o = 0;
/*     */       
/* 291 */       int j = this.d.e(this.n);
/* 292 */       if (☃ != j && j >= 0 && j < n()) {
/* 293 */         a(j);
/*     */       }
/* 295 */     } else if (this.g != null) {
/* 296 */       if (!RenderSystem.isOnRenderThread()) {
/* 297 */         RenderSystem.recordRenderCall(() -> b.a(☃));
/*     */       } else {
/* 299 */         b.a(this.g);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 305 */     return (this.d.a() > 1);
/*     */   }
/*     */   
/*     */   public static final class a {
/*     */     private final vk a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final elc d;
/*     */     
/*     */     public a(vk ☃, int i, int j, elc elc1) {
/* 315 */       this.a = ☃;
/* 316 */       this.b = i;
/* 317 */       this.c = j;
/* 318 */       this.d = elc1;
/*     */     }
/*     */     
/*     */     public vk a() {
/* 322 */       return this.a;
/*     */     }
/*     */     
/*     */     public int b() {
/* 326 */       return this.b;
/*     */     }
/*     */     
/*     */     public int c() {
/* 330 */       return this.c;
/*     */     }
/*     */   }
/*     */   
/*     */   public dfq a(dfq ☃) {
/* 335 */     return new eas(☃, this);
/*     */   }
/*     */   
/*     */   final class b implements AutoCloseable {
/*     */     private final det[] b;
/*     */     
/*     */     private b(ekc this$0, ekc.a ☃, int i) {
/* 342 */       this.b = new det[i + 1];
/*     */       
/* 344 */       for (int j = 0; j < this.b.length; j++) {
/* 345 */         int k = ekc.a.b(☃) >> j;
/* 346 */         int m = ekc.a.c(☃) >> j;
/* 347 */         if (this.b[j] == null) {
/* 348 */           this.b[j] = new det(k, m, false);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     private void a() {
/* 355 */       double ☃ = 1.0D - ekc.a(this.a) / ekc.c(this.a).c(ekc.b(this.a));
/*     */       
/* 357 */       int i = ekc.c(this.a).e(ekc.b(this.a));
/* 358 */       int j = (ekc.c(this.a).a() == 0) ? this.a.n() : ekc.c(this.a).a();
/* 359 */       int k = ekc.c(this.a).e((ekc.b(this.a) + 1) % j);
/* 360 */       if (i != k && k >= 0 && k < this.a.n()) {
/* 361 */         for (int m = 0; m < this.b.length; m++) {
/* 362 */           int n = ekc.a.b(ekc.d(this.a)) >> m;
/* 363 */           int i1 = ekc.a.c(ekc.d(this.a)) >> m;
/* 364 */           for (int i2 = 0; i2 < i1; i2++) {
/* 365 */             for (int i3 = 0; i3 < n; i3++) {
/* 366 */               int i4 = a(i, m, i3, i2);
/* 367 */               int i5 = a(k, m, i3, i2);
/* 368 */               int i6 = a(☃, i4 >> 16 & 0xFF, i5 >> 16 & 0xFF);
/* 369 */               int i7 = a(☃, i4 >> 8 & 0xFF, i5 >> 8 & 0xFF);
/* 370 */               int i8 = a(☃, i4 & 0xFF, i5 & 0xFF);
/*     */               
/* 372 */               this.b[m].a(i3, i2, i4 & 0xFF000000 | i6 << 16 | i7 << 8 | i8);
/*     */             } 
/*     */           } 
/*     */         } 
/* 376 */         ekc.a(this.a, 0, 0, this.b);
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private int a(int ☃, int i, int j, int k) {
/* 389 */       return this.a.a[i].a(j + (ekc.e(this.a)[☃] * ekc.a.b(ekc.d(this.a)) >> i), k + (ekc.f(this.a)[☃] * ekc.a.c(ekc.d(this.a)) >> i));
/*     */     }
/*     */     
/*     */     private int a(double ☃, int i, int j) {
/* 393 */       return (int)(☃ * i + (1.0D - ☃) * j);
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() {
/* 398 */       for (det ☃ : this.b) {
/* 399 */         if (☃ != null)
/* 400 */           ☃.close(); 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */