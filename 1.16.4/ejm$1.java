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
/*     */ final class null
/*     */   implements ejn
/*     */ {
/*     */   private double a;
/*     */   private double b;
/*     */   private long c;
/*     */   
/*     */   public float call(bmb ☃, @Nullable dwt dwt1, @Nullable aqm aqm1) {
/*  91 */     aqa aqa = (aqm1 != null) ? aqm1 : ☃.A();
/*     */     
/*  93 */     if (aqa == null) {
/*  94 */       return 0.0F;
/*     */     }
/*     */     
/*  97 */     if (dwt1 == null && aqa.l instanceof dwt) {
/*  98 */       dwt1 = (dwt)aqa.l;
/*     */     }
/*     */     
/* 101 */     if (dwt1 == null) {
/* 102 */       return 0.0F;
/*     */     }
/*     */ 
/*     */     
/* 106 */     if (dwt1.k().e()) {
/* 107 */       d = dwt1.f(1.0F);
/*     */     } else {
/* 109 */       d = Math.random();
/*     */     } 
/*     */     
/* 112 */     double d = a(dwt1, d);
/*     */     
/* 114 */     return (float)d;
/*     */   }
/*     */   
/*     */   private double a(brx ☃, double d) {
/* 118 */     if (☃.T() != this.c) {
/* 119 */       this.c = ☃.T();
/*     */       
/* 121 */       double d1 = d - this.a;
/* 122 */       d1 = afm.c(d1 + 0.5D, 1.0D) - 0.5D;
/*     */       
/* 124 */       this.b += d1 * 0.1D;
/* 125 */       this.b *= 0.9D;
/* 126 */       this.a = afm.c(this.a + this.b, 1.0D);
/*     */     } 
/*     */     
/* 129 */     return this.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejm$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */