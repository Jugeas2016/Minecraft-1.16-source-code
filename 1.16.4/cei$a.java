/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a<O, S extends cej<O, S>>
/*     */ {
/*     */   private final O a;
/* 116 */   private final Map<String, cfj<?>> b = Maps.newHashMap();
/*     */   
/*     */   public a(O ☃) {
/* 119 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public a<O, S> a(cfj<?>... ☃) {
/* 123 */     for (cfj<?> cfj1 : ☃) {
/* 124 */       a(cfj1);
/* 125 */       this.b.put(cfj1.f(), cfj1);
/*     */     } 
/* 127 */     return this;
/*     */   }
/*     */   
/*     */   private <T extends Comparable<T>> void a(cfj<T> ☃) {
/* 131 */     String str = ☃.f();
/* 132 */     if (!cei.e().matcher(str).matches()) {
/* 133 */       throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has invalidly named property: ").append(str).toString());
/*     */     }
/*     */     
/* 136 */     Collection<T> collection = ☃.a();
/* 137 */     if (collection.size() <= 1) {
/* 138 */       throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" attempted use property ").append(str).append(" with <= 1 possible values").toString());
/*     */     }
/*     */     
/* 141 */     for (Comparable comparable : collection) {
/* 142 */       String str1 = ☃.a((T)comparable);
/* 143 */       if (!cei.e().matcher(str1).matches()) {
/* 144 */         throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has property: ").append(str).append(" with invalidly named value: ").append(str1).toString());
/*     */       }
/*     */     } 
/*     */     
/* 148 */     if (this.b.containsKey(str)) {
/* 149 */       throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has duplicate property: ").append(str).toString());
/*     */     }
/*     */   }
/*     */   
/*     */   public cei<O, S> a(Function<O, S> ☃, cei.b<O, S> b1) {
/* 154 */     return new cei<>(☃, this.a, b1, this.b);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cei$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */