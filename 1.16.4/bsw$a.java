/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
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
/*     */ public class a
/*     */ {
/* 102 */   private Optional<Supplier<ctg<?>>> a = Optional.empty();
/* 103 */   private final Map<chm.a, List<Supplier<cib<?>>>> b = Maps.newLinkedHashMap();
/* 104 */   private final List<List<Supplier<civ<?, ?>>>> c = Lists.newArrayList();
/* 105 */   private final List<Supplier<ciw<?, ?>>> d = Lists.newArrayList();
/*     */   
/*     */   public a a(ctg<?> ☃) {
/* 108 */     return a(() -> ☃);
/*     */   }
/*     */   
/*     */   public a a(Supplier<ctg<?>> ☃) {
/* 112 */     this.a = Optional.of(☃);
/* 113 */     return this;
/*     */   }
/*     */   
/*     */   public a a(chm.b ☃, civ<?, ?> civ1) {
/* 117 */     return a(☃.ordinal(), () -> ☃);
/*     */   }
/*     */   
/*     */   public a a(int ☃, Supplier<civ<?, ?>> supplier) {
/* 121 */     a(☃);
/* 122 */     ((List<Supplier<civ<?, ?>>>)this.c.get(☃)).add(supplier);
/* 123 */     return this;
/*     */   }
/*     */   
/*     */   public <C extends chz> a a(chm.a ☃, cib<C> cib1) {
/* 127 */     ((List<Supplier>)this.b.computeIfAbsent(☃, ☃ -> Lists.newArrayList())).add(() -> ☃);
/* 128 */     return this;
/*     */   }
/*     */   
/*     */   public a a(ciw<?, ?> ☃) {
/* 132 */     this.d.add(() -> ☃);
/* 133 */     return this;
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 137 */     while (this.c.size() <= ☃) {
/* 138 */       this.c.add(Lists.newArrayList());
/*     */     }
/*     */   }
/*     */   
/*     */   public bsw a() {
/* 143 */     return new bsw(this.a
/* 144 */         .<Throwable>orElseThrow(() -> new IllegalStateException("Missing surface builder")), (Map)this.b
/* 145 */         .entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, ☃ -> ImmutableList.copyOf((Collection)☃.getValue()))), (List)this.c
/* 146 */         .stream().map(ImmutableList::copyOf).collect(ImmutableList.toImmutableList()), 
/* 147 */         (List)ImmutableList.copyOf(this.d), null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsw$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */