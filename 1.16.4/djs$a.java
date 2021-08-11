/*     */ import com.mojang.bridge.game.PerformanceMetrics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements PerformanceMetrics
/*     */ {
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   
/*     */   public a(int ☃, int i, int j, int k) {
/*  83 */     this.a = ☃;
/*  84 */     this.b = i;
/*  85 */     this.c = j;
/*  86 */     this.d = k;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getMinTime() {
/*  91 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getMaxTime() {
/*  96 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getAverageTime() {
/* 101 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSampleCount() {
/* 106 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djs$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */