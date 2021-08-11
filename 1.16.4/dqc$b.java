/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends bic
/*     */ {
/*  80 */   public final gj<bmb> c = gj.a();
/*     */ 
/*     */   
/*     */   public b(bfw ☃) {
/*  84 */     super(null, 0);
/*  85 */     bfv bfv = ☃.bm; int i;
/*  86 */     for (i = 0; i < 5; i++) {
/*  87 */       for (int j = 0; j < 9; j++) {
/*  88 */         a(new dqc.a(dqc.l(), i * 9 + j, 9 + j * 18, 18 + i * 18));
/*     */       }
/*     */     } 
/*     */     
/*  92 */     for (i = 0; i < 9; i++) {
/*  93 */       a(new bjr(bfv, i, 9 + i * 18, 112));
/*     */     }
/*     */     
/*  96 */     a(0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 101 */     return true;
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 105 */     int i = (this.c.size() + 9 - 1) / 9 - 5;
/*     */     
/* 107 */     int j = (int)((☃ * i) + 0.5D);
/* 108 */     if (j < 0) {
/* 109 */       j = 0;
/*     */     }
/* 111 */     for (int k = 0; k < 5; k++) {
/* 112 */       for (int m = 0; m < 9; m++) {
/* 113 */         int n = m + (k + j) * 9;
/* 114 */         if (n >= 0 && n < this.c.size()) {
/* 115 */           dqc.l().a(m + k * 9, this.c.get(n));
/*     */         } else {
/* 117 */           dqc.l().a(m + k * 9, bmb.b);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 124 */     return (this.c.size() > 45);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 129 */     if (i >= this.a.size() - 9 && i < this.a.size()) {
/* 130 */       bjr bjr = this.a.get(i);
/*     */       
/* 132 */       if (bjr != null && bjr.f()) {
/* 133 */         bjr.d(bmb.b);
/*     */       }
/*     */     } 
/*     */     
/* 137 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, bjr bjr1) {
/* 142 */     return (bjr1.c != dqc.l());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(bjr ☃) {
/* 147 */     return (☃.c != dqc.l());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqc$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */