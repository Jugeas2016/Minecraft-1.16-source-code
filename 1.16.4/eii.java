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
/*    */ public class eii
/*    */   extends eit<bbd, duk<bbd>>
/*    */ {
/* 16 */   private final duk<bbd> a = new duk<>(0.1F);
/*    */   
/*    */   public eii(egk<bbd, duk<bbd>> ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, bbd bbd1, float f1, float f2, float f3, float f4, float f5, float f6) {
/*    */     float f7, f8, f9;
/* 24 */     bmb bmb = bbd1.eL();
/* 25 */     if (!(bmb.b() instanceof blw)) {
/*    */       return;
/*    */     }
/*    */     
/* 29 */     blw blw = (blw)bmb.b();
/* 30 */     aC_().a(this.a);
/* 31 */     this.a.a(bbd1, f1, f2, f3);
/* 32 */     this.a.a(bbd1, f1, f2, f4, f5, f6);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     if (blw instanceof bla) {
/* 39 */       int j = ((bla)blw).b(bmb);
/* 40 */       f7 = (j >> 16 & 0xFF) / 255.0F;
/* 41 */       f8 = (j >> 8 & 0xFF) / 255.0F;
/* 42 */       f9 = (j & 0xFF) / 255.0F;
/*    */     } else {
/* 44 */       f7 = 1.0F;
/* 45 */       f8 = 1.0F;
/* 46 */       f9 = 1.0F;
/*    */     } 
/* 48 */     dfq dfq = eag1.getBuffer(eao.d(blw.f()));
/* 49 */     this.a.a(☃, dfq, i, ejw.a, f7, f8, f9, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */