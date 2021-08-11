/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dzh
/*    */   extends dxh
/*    */ {
/*    */   protected dzh(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, float f, dyw dyw1) {
/* 12 */     super(☃, d1, d2, d3, 0.1F, -0.1F, 0.1F, d4, d5, d6, f, dyw1, 0.0F, 20, -5.0E-4D, false);
/* 13 */     this.v = 0.7294118F;
/* 14 */     this.w = 0.69411767F;
/* 15 */     this.x = 0.7607843F;
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
/* 27 */       Random random = dwt1.t;
/* 28 */       double d7 = random.nextFloat() * -1.9D * random.nextFloat() * 0.1D;
/* 29 */       double d8 = random.nextFloat() * -0.5D * random.nextFloat() * 0.1D * 5.0D;
/* 30 */       double d9 = random.nextFloat() * -1.9D * random.nextFloat() * 0.1D;
/* 31 */       return new dzh(dwt1, d1, d2, d3, d7, d8, d9, 1.0F, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */