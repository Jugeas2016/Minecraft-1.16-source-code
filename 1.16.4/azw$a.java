/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends avb
/*     */ {
/*     */   private final azw i;
/*     */   
/*     */   a(azw ☃) {
/* 212 */     super(☃);
/* 213 */     this.i = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 218 */     if (this.i.a(aef.b))
/*     */     {
/* 220 */       this.i.f(this.i.cC().b(0.0D, 0.005D, 0.0D));
/*     */     }
/*     */     
/* 223 */     if (this.h != avb.a.b || this.i.x().m()) {
/* 224 */       this.i.q(0.0F);
/*     */       
/*     */       return;
/*     */     } 
/* 228 */     float ☃ = (float)(this.e * this.i.b(arl.d));
/* 229 */     this.i.q(afm.g(0.125F, this.i.dN(), ☃));
/*     */     
/* 231 */     double d1 = this.b - this.i.cD();
/* 232 */     double d2 = this.c - this.i.cE();
/* 233 */     double d3 = this.d - this.i.cH();
/*     */     
/* 235 */     if (d2 != 0.0D) {
/* 236 */       double d = afm.a(d1 * d1 + d2 * d2 + d3 * d3);
/*     */       
/* 238 */       this.i.f(this.i.cC().b(0.0D, this.i.dN() * d2 / d * 0.1D, 0.0D));
/*     */     } 
/*     */     
/* 241 */     if (d1 != 0.0D || d3 != 0.0D) {
/* 242 */       float f = (float)(afm.d(d3, d1) * 57.2957763671875D) - 90.0F;
/*     */       
/* 244 */       this.i.p = a(this.i.p, f, 90.0F);
/* 245 */       this.i.aA = this.i.p;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azw$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */