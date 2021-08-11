/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ecc
/*    */   extends ece<cch>
/*    */ {
/* 16 */   public static final elr a = new elr(ekb.d, new vk("entity/bell/bell_body"));
/*    */   private final dwn c;
/*    */   
/*    */   public ecc(ecd ☃) {
/* 20 */     super(☃);
/* 21 */     this.c = new dwn(32, 32, 0, 0);
/* 22 */     this.c.a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F);
/* 23 */     this.c.a(8.0F, 12.0F, 8.0F);
/*    */     
/* 25 */     dwn dwn1 = new dwn(32, 32, 0, 13);
/* 26 */     dwn1.a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F);
/* 27 */     dwn1.a(-8.0F, -12.0F, -8.0F);
/*    */     
/* 29 */     this.c.b(dwn1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cch ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/* 34 */     float f1 = ☃.a + f;
/*    */     
/* 36 */     float f2 = 0.0F;
/* 37 */     float f3 = 0.0F;
/*    */     
/* 39 */     if (☃.b) {
/* 40 */       float f4 = afm.a(f1 / 3.1415927F) / (4.0F + f1 / 3.0F);
/* 41 */       if (☃.c == gc.c) {
/* 42 */         f2 = -f4;
/* 43 */       } else if (☃.c == gc.d) {
/* 44 */         f2 = f4;
/* 45 */       } else if (☃.c == gc.f) {
/* 46 */         f3 = -f4;
/* 47 */       } else if (☃.c == gc.e) {
/* 48 */         f3 = f4;
/*    */       } 
/*    */     } 
/*    */     
/* 52 */     this.c.d = f2;
/* 53 */     this.c.f = f3;
/*    */     
/* 55 */     dfq dfq = a.a(eag1, eao::b);
/* 56 */     this.c.a(dfm1, dfq, i, j);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */