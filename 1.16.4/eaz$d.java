/*     */ import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class d
/*     */ {
/*     */   private boolean a;
/*     */   private final Long2IntLinkedOpenHashMap b;
/*     */   private final Long2FloatLinkedOpenHashMap c;
/*     */   
/*     */   private d() {
/* 305 */     this.b = x.<Long2IntLinkedOpenHashMap>a(() -> {
/*     */           Long2IntLinkedOpenHashMap ☃ = new Long2IntLinkedOpenHashMap(this, 100, 0.25F)
/*     */             {
/*     */               protected void rehash(int ☃) {}
/*     */             };
/*     */           
/*     */           ☃.defaultReturnValue(2147483647);
/*     */           
/*     */           return ☃;
/*     */         });
/* 315 */     this.c = x.<Long2FloatLinkedOpenHashMap>a(() -> {
/*     */           Long2FloatLinkedOpenHashMap ☃ = new Long2FloatLinkedOpenHashMap(this, 100, 0.25F)
/*     */             {
/*     */               protected void rehash(int ☃) {}
/*     */             };
/*     */           ☃.defaultReturnValue(Float.NaN);
/*     */           return ☃;
/*     */         });
/*     */   }
/*     */   
/*     */   public void a() {
/* 326 */     this.a = true;
/*     */   }
/*     */   
/*     */   public void b() {
/* 330 */     this.a = false;
/* 331 */     this.b.clear();
/* 332 */     this.c.clear();
/*     */   }
/*     */   
/*     */   public int a(ceh ☃, bra bra1, fx fx1) {
/* 336 */     long l = fx1.a();
/* 337 */     if (this.a) {
/* 338 */       int j = this.b.get(l);
/* 339 */       if (j != Integer.MAX_VALUE) {
/* 340 */         return j;
/*     */       }
/*     */     } 
/*     */     
/* 344 */     int i = eae.a(bra1, ☃, fx1);
/* 345 */     if (this.a) {
/* 346 */       if (this.b.size() == 100) {
/* 347 */         this.b.removeFirstInt();
/*     */       }
/* 349 */       this.b.put(l, i);
/*     */     } 
/* 351 */     return i;
/*     */   }
/*     */   
/*     */   public float b(ceh ☃, bra bra1, fx fx1) {
/* 355 */     long l = fx1.a();
/* 356 */     if (this.a) {
/* 357 */       float f1 = this.c.get(l);
/* 358 */       if (!Float.isNaN(f1)) {
/* 359 */         return f1;
/*     */       }
/*     */     } 
/*     */     
/* 363 */     float f = ☃.f(bra1, fx1);
/* 364 */     if (this.a) {
/* 365 */       if (this.c.size() == 100) {
/* 366 */         this.c.removeFirstFloat();
/*     */       }
/* 368 */       this.c.put(l, f);
/*     */     } 
/* 370 */     return f;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eaz$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */