/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dyx
/*    */   extends dyp
/*    */ {
/*    */   private dyx(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyw dyw1) {
/*  9 */     super(☃, d1, d2, d3, dyw1, 0.0F);
/*    */     
/* 11 */     this.B = 0.5F;
/*    */     
/* 13 */     e(1.0F);
/* 14 */     a(0.0F, 0.0F, 0.0F);
/*    */     
/* 16 */     this.t = (int)((this.B * 12.0F) / (Math.random() * 0.800000011920929D + 0.20000000298023224D));
/* 17 */     b(dyw1);
/*    */     
/* 19 */     this.n = false;
/*    */     
/* 21 */     this.j = d4;
/* 22 */     this.k = d5;
/* 23 */     this.l = d6;
/*    */     
/* 25 */     f(0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 30 */     this.d = this.g;
/* 31 */     this.e = this.h;
/* 32 */     this.f = this.i;
/*    */     
/* 34 */     if (this.s++ >= this.t) {
/* 35 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 39 */     b(this.a);
/*    */     
/* 41 */     if (this.s > this.t / 2) {
/* 42 */       e(1.0F - (this.s - (this.t / 2)) / this.t);
/*    */     }
/*    */     
/* 45 */     a(this.j, this.k, this.l);
/*    */     
/* 47 */     if (this.c.d_(new fx(this.g, this.h, this.i)).g()) {
/* 48 */       this.k -= 0.00800000037997961D;
/*    */     }
/*    */     
/* 51 */     this.j *= 0.9200000166893005D;
/* 52 */     this.k *= 0.9200000166893005D;
/* 53 */     this.l *= 0.9200000166893005D;
/*    */     
/* 55 */     if (this.m) {
/* 56 */       this.j *= 0.699999988079071D;
/* 57 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 65 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 70 */       return new dyx(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */