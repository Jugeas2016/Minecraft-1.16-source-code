/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class auy
/*    */   extends avb
/*    */ {
/*    */   private final int i;
/*    */   private final boolean j;
/*    */   
/*    */   public auy(aqn ☃, int i, boolean bool) {
/* 12 */     super(☃);
/* 13 */     this.i = i;
/* 14 */     this.j = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 19 */     if (this.h == avb.a.b) {
/* 20 */       float f2; this.h = avb.a.a;
/*    */       
/* 22 */       this.a.e(true);
/*    */       
/* 24 */       double ☃ = this.b - this.a.cD();
/* 25 */       double d1 = this.c - this.a.cE();
/* 26 */       double d2 = this.d - this.a.cH();
/* 27 */       double d3 = ☃ * ☃ + d1 * d1 + d2 * d2;
/* 28 */       if (d3 < 2.500000277905201E-7D) {
/* 29 */         this.a.u(0.0F);
/* 30 */         this.a.t(0.0F);
/*    */         return;
/*    */       } 
/* 33 */       float f1 = (float)(afm.d(d2, ☃) * 57.2957763671875D) - 90.0F;
/* 34 */       this.a.p = a(this.a.p, f1, 90.0F);
/*    */       
/* 36 */       if (this.a.ao()) {
/* 37 */         f2 = (float)(this.e * this.a.b(arl.d));
/*    */       } else {
/* 39 */         f2 = (float)(this.e * this.a.b(arl.e));
/*    */       } 
/* 41 */       this.a.q(f2);
/*    */       
/* 43 */       double d4 = afm.a(☃ * ☃ + d2 * d2);
/* 44 */       float f3 = (float)-(afm.d(d1, d4) * 57.2957763671875D);
/* 45 */       this.a.q = a(this.a.q, f3, this.i);
/* 46 */       this.a.u((d1 > 0.0D) ? f2 : -f2);
/*    */     } else {
/* 48 */       if (!this.j) {
/* 49 */         this.a.e(false);
/*    */       }
/*    */       
/* 52 */       this.a.u(0.0F);
/* 53 */       this.a.t(0.0F);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\auy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */