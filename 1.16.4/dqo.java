/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dqo
/*     */   extends dpv
/*     */   implements dqq<bjb>
/*     */ {
/*     */   private final bjb c;
/*     */   
/*  18 */   private final bin p = new bin(this)
/*     */     {
/*     */       public void a(bic ☃, gj<bmb> gj1) {
/*  21 */         dqo.a(this.a);
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(bic ☃, int i, bmb bmb1) {
/*  26 */         dqo.a(this.a);
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(bic ☃, int i, int j) {
/*  31 */         if (i == 0) {
/*  32 */           dqo.b(this.a);
/*     */         }
/*     */       }
/*     */     };
/*     */   
/*     */   public dqo(bjb ☃, bfv bfv1, nr nr1) {
/*  38 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public bjb n() {
/*  43 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  48 */     super.b();
/*  49 */     this.c.a(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/*  54 */     this.i.s.m();
/*  55 */     super.at_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  60 */     super.e();
/*  61 */     this.c.b(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void i() {
/*  66 */     if (this.i.s.eK()) {
/*  67 */       a(new dlj(this.k / 2 - 100, 196, 98, 20, nq.c, ☃ -> this.i.a((dot)null)));
/*  68 */       a(new dlj(this.k / 2 + 2, 196, 98, 20, new of("lectern.take_book"), ☃ -> c(3)));
/*     */     } else {
/*  70 */       super.i();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void l() {
/*  76 */     c(1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m() {
/*  81 */     c(2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(int ☃) {
/*  86 */     if (☃ != this.c.f()) {
/*  87 */       c(100 + ☃);
/*  88 */       return true;
/*     */     } 
/*  90 */     return false;
/*     */   }
/*     */   
/*     */   private void c(int ☃) {
/*  94 */     this.i.q.a(this.c.b, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ay_() {
/*  99 */     return false;
/*     */   }
/*     */   
/*     */   private void o() {
/* 103 */     bmb ☃ = this.c.e();
/* 104 */     a(dpv.a.a(☃));
/*     */   }
/*     */   
/*     */   private void p() {
/* 108 */     a(this.c.f());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */