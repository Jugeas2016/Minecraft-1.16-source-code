/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxt
/*    */   extends dzb
/*    */ {
/*    */   private final dyw a;
/*    */   
/*    */   protected dxt(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyw dyw1) {
/* 10 */     super(☃, d1, d2, d3);
/* 11 */     this.a = dyw1;
/* 12 */     this.j = d4 + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D;
/* 13 */     this.k = d5 + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D;
/* 14 */     this.l = d6 + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D;
/*    */     
/* 16 */     float f = this.r.nextFloat() * 0.3F + 0.7F;
/* 17 */     this.v = f;
/* 18 */     this.w = f;
/* 19 */     this.x = f;
/* 20 */     this.B = 0.1F * (this.r.nextFloat() * this.r.nextFloat() * 6.0F + 1.0F);
/*    */     
/* 22 */     this.t = (int)(16.0D / (this.r.nextFloat() * 0.8D + 0.2D)) + 2;
/* 23 */     b(dyw1);
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 28 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 33 */     this.d = this.g;
/* 34 */     this.e = this.h;
/* 35 */     this.f = this.i;
/*    */     
/* 37 */     if (this.s++ >= this.t) {
/* 38 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 42 */     b(this.a);
/*    */     
/* 44 */     this.k += 0.004D;
/* 45 */     a(this.j, this.k, this.l);
/* 46 */     this.j *= 0.8999999761581421D;
/* 47 */     this.k *= 0.8999999761581421D;
/* 48 */     this.l *= 0.8999999761581421D;
/*    */     
/* 50 */     if (this.m) {
/* 51 */       this.j *= 0.699999988079071D;
/* 52 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 60 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 65 */       return new dxt(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */