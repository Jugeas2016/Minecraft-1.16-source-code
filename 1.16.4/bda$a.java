/*     */ import java.util.EnumSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends avv
/*     */ {
/*     */   private final bda a;
/*     */   private int b;
/*     */   private int c;
/*     */   private int d;
/*     */   
/*     */   public a(bda ☃) {
/* 167 */     this.a = ☃;
/*     */     
/* 169 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 174 */     aqm ☃ = this.a.A();
/* 175 */     return (☃ != null && ☃.aX() && this.a.c(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 180 */     this.b = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 185 */     bda.a(this.a, false);
/* 186 */     this.d = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 191 */     this.c--;
/*     */     
/* 193 */     aqm ☃ = this.a.A();
/*     */     
/* 195 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */     
/* 199 */     boolean bool = this.a.z().a(☃);
/*     */     
/* 201 */     if (bool) {
/* 202 */       this.d = 0;
/*     */     } else {
/* 204 */       this.d++;
/*     */     } 
/*     */     
/* 207 */     double d = this.a.h(☃);
/*     */     
/* 209 */     if (d < 4.0D) {
/* 210 */       if (!bool) {
/*     */         return;
/*     */       }
/*     */       
/* 214 */       if (this.c <= 0) {
/* 215 */         this.c = 20;
/* 216 */         this.a.B(☃);
/*     */       } 
/* 218 */       this.a.u().a(☃.cD(), ☃.cE(), ☃.cH(), 1.0D);
/* 219 */     } else if (d < g() * g() && bool) {
/* 220 */       double d1 = ☃.cD() - this.a.cD();
/* 221 */       double d2 = ☃.e(0.5D) - this.a.e(0.5D);
/* 222 */       double d3 = ☃.cH() - this.a.cH();
/*     */       
/* 224 */       if (this.c <= 0) {
/* 225 */         this.b++;
/* 226 */         if (this.b == 1) {
/* 227 */           this.c = 60;
/* 228 */           bda.a(this.a, true);
/* 229 */         } else if (this.b <= 4) {
/* 230 */           this.c = 6;
/*     */         } else {
/* 232 */           this.c = 100;
/* 233 */           this.b = 0;
/* 234 */           bda.a(this.a, false);
/*     */         } 
/*     */         
/* 237 */         if (this.b > 1) {
/* 238 */           float f = afm.c(afm.a(d)) * 0.5F;
/*     */           
/* 240 */           if (!this.a.aA()) {
/* 241 */             this.a.l.a((bfw)null, 1018, this.a.cB(), 0);
/*     */           }
/* 243 */           for (int i = 0; i < 1; i++) {
/* 244 */             bgp bgp = new bgp(this.a.l, this.a, d1 + this.a.cY().nextGaussian() * f, d2, d3 + this.a.cY().nextGaussian() * f);
/* 245 */             bgp.d(bgp.cD(), this.a.e(0.5D) + 0.5D, bgp.cH());
/* 246 */             this.a.l.c(bgp);
/*     */           } 
/*     */         } 
/*     */       } 
/* 250 */       this.a.t().a(☃, 10.0F, 10.0F);
/*     */     }
/* 252 */     else if (this.d < 5) {
/* 253 */       this.a.u().a(☃.cD(), ☃.cE(), ☃.cH(), 1.0D);
/*     */     } 
/*     */ 
/*     */     
/* 257 */     super.e();
/*     */   }
/*     */   
/*     */   private double g() {
/* 261 */     return this.a.b(arl.b);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bda$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */