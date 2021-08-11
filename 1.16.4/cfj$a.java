/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class a<T extends Comparable<T>>
/*     */ {
/*     */   private final cfj<T> a;
/*     */   private final T b;
/*     */   
/*     */   private a(cfj<T> ☃, T t) {
/* 109 */     if (!☃.a().contains(t)) {
/* 110 */       throw new IllegalArgumentException("Value " + t + " does not belong to property " + ☃);
/*     */     }
/* 112 */     this.a = ☃;
/* 113 */     this.b = t;
/*     */   }
/*     */   
/*     */   public cfj<T> a() {
/* 117 */     return this.a;
/*     */   }
/*     */   
/*     */   public T b() {
/* 121 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 126 */     return this.a.f() + "=" + this.a.a(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 131 */     if (this == ☃) {
/* 132 */       return true;
/*     */     }
/* 134 */     if (!(☃ instanceof a)) {
/* 135 */       return false;
/*     */     }
/*     */     
/* 138 */     a<?> a1 = (a)☃;
/* 139 */     return (this.a == a1.a && this.b.equals(a1.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 144 */     int ☃ = this.a.hashCode();
/* 145 */     ☃ = 31 * ☃ + this.b.hashCode();
/* 146 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */