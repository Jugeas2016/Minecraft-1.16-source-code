/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ {
/* 369 */   private final aet<Dynamic<?>> b = new aet<>(32);
/*     */   
/*     */   private final List<Dynamic<?>> c;
/*     */   private final Dynamic<?> d;
/*     */   private final boolean e;
/* 374 */   private final Int2ObjectMap<IntList> f = (Int2ObjectMap<IntList>)new Int2ObjectLinkedOpenHashMap();
/*     */   
/* 376 */   private final IntList g = (IntList)new IntArrayList();
/*     */   public final int a;
/* 378 */   private final Set<Dynamic<?>> h = Sets.newIdentityHashSet();
/* 379 */   private final int[] i = new int[4096];
/*     */   
/*     */   public c(Dynamic<?> ☃) {
/* 382 */     this.c = Lists.newArrayList();
/* 383 */     this.d = ☃;
/* 384 */     this.a = ☃.get("Y").asInt(0);
/* 385 */     this.e = ☃.get("Blocks").result().isPresent();
/*     */   }
/*     */   
/*     */   public Dynamic<?> a(int ☃) {
/* 389 */     if (☃ < 0 || ☃ > 4095) {
/* 390 */       return ahe.a();
/*     */     }
/*     */     
/* 393 */     Dynamic<?> dynamic = this.b.a(this.i[☃]);
/* 394 */     return (dynamic == null) ? ahe.a() : dynamic;
/*     */   }
/*     */   
/*     */   public void a(int ☃, Dynamic<?> dynamic) {
/* 398 */     if (this.h.add(dynamic)) {
/* 399 */       this.c.add("%%FILTER_ME%%".equals(ahe.a(dynamic)) ? ahe.a() : dynamic);
/*     */     }
/* 401 */     this.i[☃] = ahe.a(this.b, dynamic);
/*     */   }
/*     */   
/*     */   public int b(int ☃) {
/* 405 */     if (!this.e) {
/* 406 */       return ☃;
/*     */     }
/* 408 */     ByteBuffer byteBuffer = this.d.get("Blocks").asByteBufferOpt().result().get();
/* 409 */     ahe.a a1 = this.d.get("Data").asByteBufferOpt().map(☃ -> new ahe.a(DataFixUtils.toArray(☃))).result().orElseGet(a::new);
/* 410 */     ahe.a a2 = this.d.get("Add").asByteBufferOpt().map(☃ -> new ahe.a(DataFixUtils.toArray(☃))).result().orElseGet(a::new);
/*     */     
/* 412 */     this.h.add(ahe.a());
/* 413 */     ahe.a(this.b, ahe.a());
/* 414 */     this.c.add(ahe.a());
/*     */     
/* 416 */     for (int i = 0; i < 4096; i++) {
/* 417 */       int j = i & 0xF;
/* 418 */       int k = i >> 8 & 0xF;
/* 419 */       int m = i >> 4 & 0xF;
/* 420 */       int n = a2.a(j, k, m) << 12 | (byteBuffer.get(i) & 0xFF) << 4 | a1.a(j, k, m);
/*     */       
/* 422 */       if (ahe.b().get(n >> 4)) {
/* 423 */         a(n >> 4, i);
/*     */       }
/* 425 */       if (ahe.c().get(n >> 4)) {
/*     */         
/* 427 */         int i1 = ahe.a((j == 0), (j == 15), (m == 0), (m == 15));
/* 428 */         if (i1 == 0) {
/*     */           
/* 430 */           this.g.add(i);
/*     */         } else {
/* 432 */           ☃ |= i1;
/*     */         } 
/*     */       } 
/*     */       
/* 436 */       a(i, agz.b(n));
/*     */     } 
/*     */     
/* 439 */     return ☃;
/*     */   }
/*     */   private void a(int ☃, int i) {
/*     */     IntArrayList intArrayList;
/* 443 */     IntList intList = (IntList)this.f.get(☃);
/* 444 */     if (intList == null) {
/* 445 */       intArrayList = new IntArrayList();
/* 446 */       this.f.put(☃, intArrayList);
/*     */     } 
/* 448 */     intArrayList.add(i);
/*     */   }
/*     */   
/*     */   public Dynamic<?> a() {
/* 452 */     Dynamic<?> ☃ = this.d;
/* 453 */     if (!this.e) {
/* 454 */       return ☃;
/*     */     }
/* 456 */     ☃ = ☃.set("Palette", ☃.createList(this.c.stream()));
/*     */     
/* 458 */     int i = Math.max(4, DataFixUtils.ceillog2(this.h.size()));
/* 459 */     agc agc = new agc(i, 4096);
/* 460 */     for (int j = 0; j < this.i.length; j++) {
/* 461 */       agc.a(j, this.i[j]);
/*     */     }
/*     */     
/* 464 */     ☃ = ☃.set("BlockStates", ☃.createLongList(Arrays.stream(agc.a())));
/*     */     
/* 466 */     ☃ = ☃.remove("Blocks");
/* 467 */     ☃ = ☃.remove("Data");
/* 468 */     ☃ = ☃.remove("Add");
/*     */     
/* 470 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahe$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */