/*     */ import java.util.concurrent.atomic.AtomicReferenceArray;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class a
/*     */ {
/*     */   private final AtomicReferenceArray<cgh> b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private volatile int e;
/*     */   private volatile int f;
/*     */   private int g;
/*     */   
/*     */   private a(dwr paramdwr, int ☃) {
/* 201 */     this.c = ☃;
/* 202 */     this.d = ☃ * 2 + 1;
/* 203 */     this.b = new AtomicReferenceArray<>(this.d * this.d);
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i) {
/* 207 */     return Math.floorMod(i, this.d) * this.d + Math.floorMod(☃, this.d);
/*     */   }
/*     */   
/*     */   protected void a(int ☃, @Nullable cgh cgh1) {
/* 211 */     cgh cgh2 = this.b.getAndSet(☃, cgh1);
/* 212 */     if (cgh2 != null) {
/* 213 */       this.g--;
/* 214 */       dwr.a(this.a).a(cgh2);
/*     */     } 
/*     */     
/* 217 */     if (cgh1 != null) {
/* 218 */       this.g++;
/*     */     }
/*     */   }
/*     */   
/*     */   protected cgh a(int ☃, cgh cgh1, @Nullable cgh cgh2) {
/* 223 */     if (this.b.compareAndSet(☃, cgh1, cgh2) && 
/* 224 */       cgh2 == null) {
/* 225 */       this.g--;
/*     */     }
/*     */     
/* 228 */     dwr.a(this.a).a(cgh1);
/* 229 */     return cgh1;
/*     */   }
/*     */   
/*     */   private boolean b(int ☃, int i) {
/* 233 */     return (Math.abs(☃ - this.e) <= this.c && Math.abs(i - this.f) <= this.c);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected cgh a(int ☃) {
/* 238 */     return this.b.get(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwr$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */