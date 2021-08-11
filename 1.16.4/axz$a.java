/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class a
/*     */ {
/*  80 */   private final Object2IntMap<aya> a = (Object2IntMap<aya>)new Object2IntOpenHashMap();
/*     */   
/*     */   public int a(Predicate<aya> ☃) {
/*  83 */     return this.a.object2IntEntrySet()
/*  84 */       .stream()
/*  85 */       .filter(entry -> ☃.test(entry.getKey()))
/*  86 */       .mapToInt(☃ -> ☃.getIntValue() * ((aya)☃.getKey()).g)
/*  87 */       .sum();
/*     */   }
/*     */   
/*     */   public Stream<axz.b> a(UUID ☃) {
/*  91 */     return this.a.object2IntEntrySet().stream().map(entry -> new axz.b(☃, (aya)entry.getKey(), entry.getIntValue()));
/*     */   }
/*     */   
/*     */   public void a() {
/*  95 */     ObjectIterator<Object2IntMap.Entry<aya>> ☃ = this.a.object2IntEntrySet().iterator();
/*  96 */     while (☃.hasNext()) {
/*  97 */       Object2IntMap.Entry<aya> entry = (Object2IntMap.Entry<aya>)☃.next();
/*  98 */       int i = entry.getIntValue() - ((aya)entry.getKey()).i;
/*  99 */       if (i < 2) {
/* 100 */         ☃.remove(); continue;
/*     */       } 
/* 102 */       entry.setValue(i);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 108 */     return this.a.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(aya ☃) {
/* 112 */     int i = this.a.getInt(☃);
/* 113 */     if (i > ☃.h) {
/* 114 */       this.a.put(☃, ☃.h);
/*     */     }
/* 116 */     if (i < 2) {
/* 117 */       b(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(aya ☃) {
/* 122 */     this.a.removeInt(☃);
/*     */   }
/*     */   
/*     */   private a() {}
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */