/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxw
/*    */   extends dyo
/*    */ {
/*    */   private dxw(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  9 */     super(☃, d1, d2, d3, d4, d5, d6);
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 14 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(double ☃, double d1, double d2) {
/* 19 */     a(m().d(☃, d1, d2));
/* 20 */     k();
/*    */   }
/*    */ 
/*    */   
/*    */   public float b(float ☃) {
/* 25 */     float f = (this.s + ☃) / this.t;
/* 26 */     return this.B * (1.0F - f * f * 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(float ☃) {
/* 31 */     float f = (this.s + ☃) / this.t;
/* 32 */     f = afm.a(f, 0.0F, 1.0F);
/* 33 */     int i = super.a(☃);
/*    */     
/* 35 */     int j = i & 0xFF;
/* 36 */     int k = i >> 16 & 0xFF;
/* 37 */     j += (int)(f * 15.0F * 16.0F);
/* 38 */     if (j > 240) {
/* 39 */       j = 240;
/*    */     }
/* 41 */     return j | k << 16;
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 48 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 53 */       dxw dxw = new dxw(dwt1, d1, d2, d3, d4, d5, d6);
/* 54 */       dxw.a(this.a);
/* 55 */       return dxw;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */