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
/*    */ public abstract class eif<T extends aqa & aqy, M extends duc<T>>
/*    */   extends eit<T, M>
/*    */ {
/*    */   public eif(egk<T, M> ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, T t, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 21 */     if (!((aqy)t).S_()) {
/*    */       return;
/*    */     }
/*    */     
/* 25 */     float f = ((aqa)t).K + f3;
/* 26 */     duc<T> duc = b();
/*    */     
/* 28 */     duc.a(t, f1, f2, f3);
/* 29 */     aC_().a(duc);
/*    */     
/* 31 */     dfq dfq = eag1.getBuffer(eao.a(a(), a(f), f * 0.01F));
/*    */     
/* 33 */     duc.a(t, f1, f2, f4, f5, f6);
/* 34 */     duc.a(☃, dfq, i, ejw.a, 0.5F, 0.5F, 0.5F, 1.0F);
/*    */   }
/*    */   
/*    */   protected abstract float a(float paramFloat);
/*    */   
/*    */   protected abstract vk a();
/*    */   
/*    */   protected abstract duc<T> b();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eif.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */