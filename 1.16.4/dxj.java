/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxj
/*    */   extends dzb
/*    */ {
/*    */   private dxj(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 10 */     super(☃, d1, d2, d3);
/* 11 */     a(0.02F, 0.02F);
/*    */     
/* 13 */     this.B *= this.r.nextFloat() * 0.6F + 0.2F;
/*    */     
/* 15 */     this.j = d4 * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D;
/* 16 */     this.k = d5 * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D;
/* 17 */     this.l = d6 * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D;
/*    */     
/* 19 */     this.t = (int)(40.0D / (Math.random() * 0.8D + 0.2D));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 24 */     this.d = this.g;
/* 25 */     this.e = this.h;
/* 26 */     this.f = this.i;
/* 27 */     this.k += 0.005D;
/*    */     
/* 29 */     if (this.t-- <= 0) {
/* 30 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 34 */     a(this.j, this.k, this.l);
/* 35 */     this.j *= 0.8500000238418579D;
/* 36 */     this.k *= 0.8500000238418579D;
/* 37 */     this.l *= 0.8500000238418579D;
/*    */     
/* 39 */     if (!this.c.b(new fx(this.g, this.h, this.i)).a(aef.b)) {
/* 40 */       j();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 46 */     return dyk.b;
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 53 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 58 */       dxj dxj = new dxj(dwt1, d1, d2, d3, d4, d5, d6);
/* 59 */       dxj.a(this.a);
/* 60 */       return dxj;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */