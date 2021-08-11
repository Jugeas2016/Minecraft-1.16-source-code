/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dul
/*    */   extends dvt
/*    */ {
/*    */   private final dwn b;
/*    */   
/*    */   public dul() {
/* 11 */     super(0, 0, 64, 64);
/*    */     
/* 13 */     this.b = new dwn(this, 32, 0);
/* 14 */     this.b.a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F);
/* 15 */     this.b.a(0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float ☃, float f1, float f2) {
/* 20 */     super.a(☃, f1, f2);
/*    */     
/* 22 */     this.b.e = this.a.e;
/* 23 */     this.b.d = this.a.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/* 28 */     super.a(☃, dfq1, i, j, f1, f2, f3, f4);
/* 29 */     this.b.a(☃, dfq1, i, j, f1, f2, f3, f4);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dul.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */