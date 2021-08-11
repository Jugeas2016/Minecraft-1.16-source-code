/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxz
/*    */   extends dye
/*    */ {
/*    */   private int a;
/*    */   private final int b;
/*    */   
/*    */   private dxz(dwt ☃, double d1, double d2, double d3) {
/* 12 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 13 */     this.b = 8;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 18 */     for (int ☃ = 0; ☃ < 6; ☃++) {
/* 19 */       double d1 = this.g + (this.r.nextDouble() - this.r.nextDouble()) * 4.0D;
/* 20 */       double d2 = this.h + (this.r.nextDouble() - this.r.nextDouble()) * 4.0D;
/* 21 */       double d3 = this.i + (this.r.nextDouble() - this.r.nextDouble()) * 4.0D;
/* 22 */       this.c.a(hh.w, d1, d2, d3, (this.a / this.b), 0.0D, 0.0D);
/*    */     } 
/* 24 */     this.a++;
/* 25 */     if (this.a == this.b)
/* 26 */       j(); 
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements dyj<hi>
/*    */   {
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 33 */       return new dxz(dwt1, d1, d2, d3);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */