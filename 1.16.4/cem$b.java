/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.cache.LoadingCache;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   private final fx a;
/*     */   private final gc b;
/*     */   private final gc c;
/*     */   private final LoadingCache<fx, cel> d;
/*     */   private final int e;
/*     */   private final int f;
/*     */   private final int g;
/*     */   
/*     */   public b(fx ☃, gc gc1, gc gc2, LoadingCache<fx, cel> loadingCache, int i, int j, int k) {
/* 146 */     this.a = ☃;
/* 147 */     this.b = gc1;
/* 148 */     this.c = gc2;
/* 149 */     this.d = loadingCache;
/* 150 */     this.e = i;
/* 151 */     this.f = j;
/* 152 */     this.g = k;
/*     */   }
/*     */   
/*     */   public fx a() {
/* 156 */     return this.a;
/*     */   }
/*     */   
/*     */   public gc b() {
/* 160 */     return this.b;
/*     */   }
/*     */   
/*     */   public gc c() {
/* 164 */     return this.c;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cel a(int ☃, int i, int j) {
/* 180 */     return (cel)this.d.getUnchecked(cem.a(this.a, b(), c(), ☃, i, j));
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 185 */     return MoreObjects.toStringHelper(this)
/* 186 */       .add("up", this.c)
/* 187 */       .add("forwards", this.b)
/* 188 */       .add("frontTopLeft", this.a)
/* 189 */       .toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cem$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */