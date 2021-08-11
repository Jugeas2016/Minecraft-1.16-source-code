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
/*    */ public class eir<T extends bfw>
/*    */   extends eit<T, dvd<T>>
/*    */ {
/* 16 */   private final duz a = new duz();
/*    */   
/*    */   public eir(egk<T, dvd<T>> ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, T t, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 24 */     a(☃, eag1, i, t, f1, f2, f5, f6, true);
/* 25 */     a(☃, eag1, i, t, f1, f2, f5, f6, false);
/*    */   }
/*    */   
/*    */   private void a(dfm ☃, eag eag1, int i, T t, float f1, float f2, float f3, float f4, boolean bool) {
/* 29 */     md md = bool ? t.eP() : t.eQ();
/* 30 */     aqe.a(md.l("id")).filter(☃ -> (☃ == aqe.af)).ifPresent(aqe1 -> {
/*    */           ☃.a();
/*    */           ☃.a(bool ? 0.4000000059604645D : -0.4000000059604645D, bfw1.bz() ? -1.2999999523162842D : -1.5D, 0.0D);
/*    */           dfq dfq = eag1.getBuffer(this.a.a(egb.a[md1.h("Variant")]));
/*    */           this.a.a(☃, dfq, i, ejw.a, f1, f2, f3, f4, bfw1.K);
/*    */           ☃.b();
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */