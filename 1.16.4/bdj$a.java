/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends bea.c
/*     */ {
/*     */   private a(bdj parambdj) {
/* 169 */     super(parambdj);
/*     */   }
/*     */   protected int g() {
/* 172 */     return 40;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int h() {
/* 177 */     return 100;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void j() {
/* 183 */     aqm ☃ = this.a.A();
/* 184 */     double d1 = Math.min(☃.cE(), this.a.cE());
/* 185 */     double d2 = Math.max(☃.cE(), this.a.cE()) + 1.0D;
/* 186 */     float f = (float)afm.d(☃.cH() - this.a.cH(), ☃.cD() - this.a.cD());
/* 187 */     if (this.a.h(☃) < 9.0D) {
/*     */       int i;
/* 189 */       for (i = 0; i < 5; i++) {
/* 190 */         float f1 = f + i * 3.1415927F * 0.4F;
/* 191 */         a(this.a.cD() + afm.b(f1) * 1.5D, this.a.cH() + afm.a(f1) * 1.5D, d1, d2, f1, 0);
/*     */       } 
/*     */       
/* 194 */       for (i = 0; i < 8; i++) {
/* 195 */         float f1 = f + i * 3.1415927F * 2.0F / 8.0F + 1.2566371F;
/* 196 */         a(this.a.cD() + afm.b(f1) * 2.5D, this.a.cH() + afm.a(f1) * 2.5D, d1, d2, f1, 3);
/*     */       } 
/*     */     } else {
/*     */       
/* 200 */       for (int i = 0; i < 16; i++) {
/* 201 */         double d = 1.25D * (i + 1);
/* 202 */         int j = 1 * i;
/* 203 */         a(this.a.cD() + afm.b(f) * d, this.a.cH() + afm.a(f) * d, d1, d2, f, j);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(double ☃, double d1, double d2, double d3, float f, int i) {
/* 210 */     fx fx = new fx(☃, d3, d1);
/* 211 */     boolean bool = false;
/* 212 */     double d = 0.0D;
/*     */     do {
/* 214 */       fx fx1 = fx.c();
/* 215 */       ceh ceh = this.a.l.d_(fx1);
/* 216 */       if (ceh.d(this.a.l, fx1, gc.b)) {
/* 217 */         if (!this.a.l.w(fx)) {
/* 218 */           ceh ceh1 = this.a.l.d_(fx);
/* 219 */           ddh ddh = ceh1.k(this.a.l, fx);
/* 220 */           if (!ddh.b()) {
/* 221 */             d = ddh.c(gc.a.b);
/*     */           }
/*     */         } 
/* 224 */         bool = true;
/*     */         break;
/*     */       } 
/* 227 */       fx = fx.c();
/* 228 */     } while (fx.v() >= afm.c(d2) - 1);
/* 229 */     if (bool) {
/* 230 */       this.a.l.c(new bge(this.a.l, ☃, fx.v() + d, d1, f, i, this.a));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp k() {
/* 236 */     return adq.dS;
/*     */   }
/*     */ 
/*     */   
/*     */   protected bea.a l() {
/* 241 */     return bea.a.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */