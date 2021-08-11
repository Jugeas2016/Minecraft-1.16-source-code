/*    */ 
/*    */ 
/*    */ 
/*    */ public class dyv
/*    */   extends dzg
/*    */ {
/*    */   private dyv(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  8 */     super(☃, d1, d2, d3);
/*  9 */     this.u = 0.04F;
/* 10 */     if (d5 == 0.0D && (d4 != 0.0D || d6 != 0.0D)) {
/* 11 */       this.j = d4;
/* 12 */       this.k = 0.1D;
/* 13 */       this.l = d6;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 21 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 26 */       dyv dyv = new dyv(dwt1, d1, d2, d3, d4, d5, d6);
/* 27 */       dyv.a(this.a);
/* 28 */       return dyv;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */