/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private double a;
/*     */   private double b;
/*     */   
/*     */   double a(a ☃) {
/* 258 */     double d1 = this.a - ☃.a;
/* 259 */     double d2 = this.b - ☃.b;
/*     */     
/* 261 */     return Math.sqrt(d1 * d1 + d2 * d2);
/*     */   }
/*     */   
/*     */   void a() {
/* 265 */     double ☃ = b();
/* 266 */     this.a /= ☃;
/* 267 */     this.b /= ☃;
/*     */   }
/*     */   
/*     */   float b() {
/* 271 */     return afm.a(this.a * this.a + this.b * this.b);
/*     */   }
/*     */   
/*     */   public void b(a ☃) {
/* 275 */     this.a -= ☃.a;
/* 276 */     this.b -= ☃.b;
/*     */   }
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2, double d3) {
/* 280 */     boolean bool = false;
/*     */     
/* 282 */     if (this.a < ☃) {
/* 283 */       this.a = ☃;
/* 284 */       bool = true;
/* 285 */     } else if (this.a > d2) {
/* 286 */       this.a = d2;
/* 287 */       bool = true;
/*     */     } 
/*     */     
/* 290 */     if (this.b < d1) {
/* 291 */       this.b = d1;
/* 292 */       bool = true;
/* 293 */     } else if (this.b > d3) {
/* 294 */       this.b = d3;
/* 295 */       bool = true;
/*     */     } 
/*     */     
/* 298 */     return bool;
/*     */   }
/*     */   
/*     */   public int a(brc ☃, int i) {
/* 302 */     fx.a a1 = new fx.a(this.a, (i + 1), this.b);
/* 303 */     boolean bool1 = ☃.d_(a1).g();
/* 304 */     a1.c(gc.a);
/* 305 */     boolean bool2 = ☃.d_(a1).g();
/* 306 */     while (a1.v() > 0) {
/* 307 */       a1.c(gc.a);
/* 308 */       boolean bool = ☃.d_(a1).g();
/*     */       
/* 310 */       if (!bool && bool2 && bool1) {
/* 311 */         return a1.v() + 1;
/*     */       }
/* 313 */       bool1 = bool2;
/* 314 */       bool2 = bool;
/*     */     } 
/*     */     
/* 317 */     return i + 1;
/*     */   }
/*     */   
/*     */   public boolean b(brc ☃, int i) {
/* 321 */     fx fx = new fx(this.a, (a(☃, i) - 1), this.b);
/* 322 */     ceh ceh = ☃.d_(fx);
/* 323 */     cva cva = ceh.c();
/* 324 */     return (fx.v() < i && !cva.a() && cva != cva.n);
/*     */   }
/*     */   
/*     */   public void a(Random ☃, double d1, double d2, double d3, double d4) {
/* 328 */     this.a = afm.a(☃, d1, d3);
/* 329 */     this.b = afm.a(☃, d2, d4);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */