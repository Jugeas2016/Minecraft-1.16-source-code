/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class e
/*     */   extends bds.h
/*     */ {
/*     */   private float c;
/*     */   private float d;
/*     */   private float e;
/*     */   private float f;
/*     */   
/*     */   private e(bds parambds) {
/* 320 */     super(parambds);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 328 */     return (this.a.A() == null || bds.b(this.a) == bds.a.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 333 */     this.d = 5.0F + bds.c(this.a).nextFloat() * 10.0F;
/* 334 */     this.e = -4.0F + bds.d(this.a).nextFloat() * 9.0F;
/* 335 */     this.f = bds.e(this.a).nextBoolean() ? 1.0F : -1.0F;
/* 336 */     h();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 341 */     if (bds.f(this.a).nextInt(350) == 0) {
/* 342 */       this.e = -4.0F + bds.g(this.a).nextFloat() * 9.0F;
/*     */     }
/* 344 */     if (bds.h(this.a).nextInt(250) == 0) {
/* 345 */       this.d++;
/* 346 */       if (this.d > 15.0F) {
/* 347 */         this.d = 5.0F;
/* 348 */         this.f = -this.f;
/*     */       } 
/*     */     } 
/* 351 */     if (bds.i(this.a).nextInt(450) == 0) {
/* 352 */       this.c = bds.j(this.a).nextFloat() * 2.0F * 3.1415927F;
/* 353 */       h();
/*     */     } 
/* 355 */     if (g()) {
/* 356 */       h();
/*     */     }
/*     */     
/* 359 */     if ((bds.a(this.a)).c < this.a.cE() && !this.a.l.w(this.a.cB().c(1))) {
/* 360 */       this.e = Math.max(1.0F, this.e);
/* 361 */       h();
/*     */     } 
/*     */     
/* 364 */     if ((bds.a(this.a)).c > this.a.cE() && !this.a.l.w(this.a.cB().b(1))) {
/* 365 */       this.e = Math.min(-1.0F, this.e);
/* 366 */       h();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void h() {
/* 371 */     if (fx.b.equals(bds.k(this.a))) {
/* 372 */       bds.a(this.a, this.a.cB());
/*     */     }
/* 374 */     this.c += this.f * 15.0F * 0.017453292F;
/* 375 */     bds.a(this.a, dcn.b(bds.k(this.a)).b((this.d * afm.b(this.c)), (-4.0F + this.e), (this.d * afm.a(this.c))));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bds$e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */