/*    */ 
/*    */ 
/*    */ 
/*    */ public class dyu
/*    */   extends dxt
/*    */ {
/*    */   private dyu(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyw dyw1) {
/*  8 */     super(☃, d1, d2, d3, d4, d5, d6, dyw1);
/*  9 */     this.u = 0.5F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 14 */     super.a();
/* 15 */     this.k -= 0.004D + 0.04D * this.u;
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 22 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 27 */       return new dyu(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */