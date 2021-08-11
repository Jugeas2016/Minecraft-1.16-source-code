/*     */ import it.unimi.dsi.fastutil.longs.Long2ByteMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2IntMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2IntMaps;
/*     */ import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongIterator;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class c
/*     */   extends zy.b
/*     */ {
/*     */   private int e;
/* 321 */   private final Long2IntMap f = Long2IntMaps.synchronize((Long2IntMap)new Long2IntOpenHashMap());
/* 322 */   private final LongSet g = (LongSet)new LongOpenHashSet();
/*     */   
/*     */   protected c(zy paramzy, int ☃) {
/* 325 */     super(paramzy, ☃);
/* 326 */     this.e = 0;
/* 327 */     this.f.defaultReturnValue(☃ + 2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(long ☃, int i, int j) {
/* 332 */     this.g.add(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 336 */     for (ObjectIterator<Long2ByteMap.Entry> objectIterator = this.a.long2ByteEntrySet().iterator(); objectIterator.hasNext(); ) { Long2ByteMap.Entry entry = objectIterator.next();
/* 337 */       byte b1 = entry.getByteValue();
/* 338 */       long l = entry.getLongKey();
/* 339 */       a(l, b1, c(b1), (b1 <= ☃ - 2)); }
/*     */     
/* 341 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   private void a(long ☃, int i, boolean bool1, boolean bool2) {
/* 345 */     if (bool1 != bool2) {
/* 346 */       aak<?> aak = new aak(aal.c, zy.e(), new brd(☃));
/* 347 */       if (bool2) {
/* 348 */         zy.b(this.d).a(zu.a(() -> zy.e(this.d).execute(()), ☃, () -> ☃));
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */ 
/*     */         
/* 357 */         zy.c(this.d).a(zu.a(() -> zy.e(this.d).execute(()), ☃, true));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 364 */     super.a();
/* 365 */     if (!this.g.isEmpty()) {
/* 366 */       LongIterator ☃ = this.g.iterator();
/* 367 */       while (☃.hasNext()) {
/* 368 */         long l = ☃.nextLong();
/* 369 */         int i = this.f.get(l);
/* 370 */         int j = c(l);
/* 371 */         if (i != j) {
/* 372 */           zy.d(this.d).a(new brd(l), () -> this.f.get(☃), j, i -> {
/*     */                 if (i >= this.f.defaultReturnValue()) {
/*     */                   this.f.remove(☃);
/*     */                 } else {
/*     */                   this.f.put(☃, i);
/*     */                 } 
/*     */               });
/* 379 */           a(l, j, c(i), c(j));
/*     */         } 
/*     */       } 
/* 382 */       this.g.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean c(int ☃) {
/* 387 */     return (☃ <= this.e - 2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zy$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */