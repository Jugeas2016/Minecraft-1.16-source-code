/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements dec
/*     */ {
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final float d;
/*     */   private final float e;
/*     */   private final float f;
/*     */   private final int g;
/*     */   
/*     */   private a(ded paramded, int ☃, int i, int j, int k, float f1, float f2, int m) {
/* 109 */     this.b = i - ☃;
/* 110 */     this.c = j - k;
/*     */     
/* 112 */     this.f = f1 / ded.a(paramded);
/*     */     
/* 114 */     this.d = (f2 + ☃ + ded.b(paramded)) / ded.a(paramded);
/* 115 */     this.e = (ded.c(paramded) - j + ded.d(paramded)) / ded.a(paramded);
/*     */     
/* 117 */     this.g = m;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 122 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/* 127 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public float g() {
/* 132 */     return ded.a(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public float getAdvance() {
/* 137 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a() {
/* 142 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public float l() {
/* 147 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i) {
/* 152 */     det det = new det(det.a.d, this.b, this.c, false);
/* 153 */     det.a(ded.e(this.a), this.g, this.b, this.c, ded.f(this.a), ded.f(this.a), ded.b(this.a), ded.d(this.a), 0, 0);
/* 154 */     det.a(0, ☃, i, 0, 0, this.b, this.c, false, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f() {
/* 159 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ded$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */