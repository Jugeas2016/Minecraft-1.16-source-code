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
/*     */ final class b
/*     */   implements AutoCloseable
/*     */ {
/*     */   private final det[] b;
/*     */   
/*     */   private b(ekc paramekc, ekc.a ☃, int i) {
/* 342 */     this.b = new det[i + 1];
/*     */     
/* 344 */     for (int j = 0; j < this.b.length; j++) {
/* 345 */       int k = ekc.a.b(☃) >> j;
/* 346 */       int m = ekc.a.c(☃) >> j;
/* 347 */       if (this.b[j] == null) {
/* 348 */         this.b[j] = new det(k, m, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a() {
/* 355 */     double ☃ = 1.0D - ekc.a(this.a) / ekc.c(this.a).c(ekc.b(this.a));
/*     */     
/* 357 */     int i = ekc.c(this.a).e(ekc.b(this.a));
/* 358 */     int j = (ekc.c(this.a).a() == 0) ? this.a.n() : ekc.c(this.a).a();
/* 359 */     int k = ekc.c(this.a).e((ekc.b(this.a) + 1) % j);
/* 360 */     if (i != k && k >= 0 && k < this.a.n()) {
/* 361 */       for (int m = 0; m < this.b.length; m++) {
/* 362 */         int n = ekc.a.b(ekc.d(this.a)) >> m;
/* 363 */         int i1 = ekc.a.c(ekc.d(this.a)) >> m;
/* 364 */         for (int i2 = 0; i2 < i1; i2++) {
/* 365 */           for (int i3 = 0; i3 < n; i3++) {
/* 366 */             int i4 = a(i, m, i3, i2);
/* 367 */             int i5 = a(k, m, i3, i2);
/* 368 */             int i6 = a(☃, i4 >> 16 & 0xFF, i5 >> 16 & 0xFF);
/* 369 */             int i7 = a(☃, i4 >> 8 & 0xFF, i5 >> 8 & 0xFF);
/* 370 */             int i8 = a(☃, i4 & 0xFF, i5 & 0xFF);
/*     */             
/* 372 */             this.b[m].a(i3, i2, i4 & 0xFF000000 | i6 << 16 | i7 << 8 | i8);
/*     */           } 
/*     */         } 
/*     */       } 
/* 376 */       ekc.a(this.a, 0, 0, this.b);
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
/*     */   private int a(int ☃, int i, int j, int k) {
/* 389 */     return this.a.a[i].a(j + (ekc.e(this.a)[☃] * ekc.a.b(ekc.d(this.a)) >> i), k + (ekc.f(this.a)[☃] * ekc.a.c(ekc.d(this.a)) >> i));
/*     */   }
/*     */   
/*     */   private int a(double ☃, int i, int j) {
/* 393 */     return (int)(☃ * i + (1.0D - ☃) * j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 398 */     for (det ☃ : this.b) {
/* 399 */       if (☃ != null)
/* 400 */         ☃.close(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekc$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */