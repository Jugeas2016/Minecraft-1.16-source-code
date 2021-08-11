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
/*     */ enum dpf
/*     */ {
/*  19 */   a(0, 0, 28, 32, 8),
/*  20 */   b(84, 0, 28, 32, 8),
/*  21 */   c(0, 64, 32, 28, 5),
/*  22 */   d(96, 64, 32, 28, 5);
/*     */   
/*     */   private final int e;
/*     */   
/*     */   private final int f;
/*     */   
/*     */   private final int g;
/*     */   private final int h;
/*     */   private final int i;
/*     */   
/*     */   dpf(int ☃, int i, int j, int k, int m) {
/*  33 */     this.e = ☃;
/*  34 */     this.f = i;
/*  35 */     this.g = j;
/*  36 */     this.h = k;
/*  37 */     this.i = m;
/*     */   }
/*     */   
/*     */   public int a() {
/*  41 */     return this.i;
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, dkw dkw1, int i, int j, boolean bool, int k) {
/*  45 */     int m = this.e;
/*  46 */     if (k > 0) {
/*  47 */       m += this.g;
/*     */     }
/*  49 */     if (k == this.i - 1) {
/*  50 */       m += this.g;
/*     */     }
/*  52 */     int n = bool ? (this.f + this.h) : this.f;
/*  53 */     dkw1.b(☃, i + a(k), j + b(k), m, n, this.g, this.h);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, efo efo1, bmb bmb1) {
/*  57 */     int k = ☃ + a(j);
/*  58 */     int m = i + b(j);
/*  59 */     switch (null.a[ordinal()]) {
/*     */       case 1:
/*  61 */         k += 6;
/*  62 */         m += 9;
/*     */         break;
/*     */       case 2:
/*  65 */         k += 6;
/*  66 */         m += 6;
/*     */         break;
/*     */       case 3:
/*  69 */         k += 10;
/*  70 */         m += 5;
/*     */         break;
/*     */       case 4:
/*  73 */         k += 6;
/*  74 */         m += 5;
/*     */         break;
/*     */     } 
/*  77 */     efo1.c(bmb1, k, m);
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/*  81 */     switch (null.a[ordinal()]) {
/*     */       case 1:
/*  83 */         return (this.g + 4) * ☃;
/*     */       case 2:
/*  85 */         return (this.g + 4) * ☃;
/*     */       case 3:
/*  87 */         return -this.g + 4;
/*     */       case 4:
/*  89 */         return 248;
/*     */     } 
/*  91 */     throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
/*     */   }
/*     */   
/*     */   public int b(int ☃) {
/*  95 */     switch (null.a[ordinal()]) {
/*     */       case 1:
/*  97 */         return -this.h + 4;
/*     */       case 2:
/*  99 */         return 136;
/*     */       case 3:
/* 101 */         return this.h * ☃;
/*     */       case 4:
/* 103 */         return this.h * ☃;
/*     */     } 
/* 105 */     throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, int i, int j, double d1, double d2) {
/* 109 */     int k = ☃ + a(j);
/* 110 */     int m = i + b(j);
/* 111 */     return (d1 > k && d1 < (k + this.g) && d2 > m && d2 < (m + this.h));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */