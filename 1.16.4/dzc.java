/*    */ 
/*    */ 
/*    */ 
/*    */ public class dzc
/*    */   extends dyp
/*    */ {
/*    */   private dzc(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyw dyw1) {
/*  8 */     super(☃, d1, d2, d3, dyw1, -0.05F);
/*    */     
/* 10 */     this.j = d4;
/* 11 */     this.k = d5;
/* 12 */     this.l = d6;
/*    */     
/* 14 */     this.B *= 0.75F;
/*    */     
/* 16 */     this.t = 60 + this.r.nextInt(12);
/* 17 */     b(dyw1);
/*    */     
/* 19 */     if (this.r.nextInt(4) == 0) {
/* 20 */       a(0.6F + this.r.nextFloat() * 0.2F, 0.6F + this.r.nextFloat() * 0.3F, this.r.nextFloat() * 0.2F);
/*    */     } else {
/* 22 */       a(0.1F + this.r.nextFloat() * 0.2F, 0.4F + this.r.nextFloat() * 0.3F, this.r.nextFloat() * 0.2F);
/*    */     } 
/*    */     
/* 25 */     f(0.6F);
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 32 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 37 */       return new dzc(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */