/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiPredicate;
/*     */ import java.util.function.ToIntFunction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ enum a
/*     */ {
/*     */   a, b;
/*     */   public final BiConsumer<aah, Integer> c;
/*     */   public final BiPredicate<aah, Integer> d;
/*     */   public final String e;
/*     */   private final ToIntFunction<aah> f;
/*     */   
/*     */   static {
/* 138 */     a = new a("POINTS", 0, "points", bfw::d, (☃, integer) -> {
/*     */           if (integer.intValue() >= ☃.eH()) {
/*     */             return false;
/*     */           }
/*     */           ☃.a(integer.intValue());
/*     */           return true;
/*     */         }☃ -> afm.d(☃.bF * ☃.eH()));
/* 145 */     b = new a("LEVELS", 1, "levels", aah::c, (☃, integer) -> {
/*     */           ☃.b(integer.intValue());
/*     */           return true;
/*     */         }☃ -> ☃.bD);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   a(String ☃, BiConsumer<aah, Integer> biConsumer, BiPredicate<aah, Integer> biPredicate, ToIntFunction<aah> toIntFunction) {
/* 156 */     this.c = biConsumer;
/* 157 */     this.e = ☃;
/* 158 */     this.d = biPredicate;
/* 159 */     this.f = toIntFunction;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wy$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */