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
/*    */ public abstract class eit<T extends aqa, M extends duc<T>>
/*    */ {
/*    */   private final egk<T, M> a;
/*    */   
/*    */   public eit(egk<T, M> ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   protected static <T extends aqm> void a(duc<T> ☃, duc<T> duc1, vk vk1, dfm dfm1, eag eag1, int i, T t, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
/* 22 */     if (!t.bF()) {
/* 23 */       ☃.a(duc1);
/* 24 */       duc1.a(t, f1, f2, f6);
/* 25 */       duc1.a(t, f1, f2, f3, f4, f5);
/* 26 */       a(duc1, vk1, dfm1, eag1, i, t, f7, f8, f9);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected static <T extends aqm> void a(duc<T> ☃, vk vk1, dfm dfm1, eag eag1, int i, T t, float f1, float f2, float f3) {
/* 31 */     dfq dfq = eag1.getBuffer(eao.d(vk1));
/* 32 */     ☃.a(dfm1, dfq, i, efr.c((aqm)t, 0.0F), f1, f2, f3, 1.0F);
/*    */   }
/*    */   
/*    */   public M aC_() {
/* 36 */     return this.a.c();
/*    */   }
/*    */   
/*    */   protected vk a(T ☃) {
/* 40 */     return this.a.a(☃);
/*    */   }
/*    */   
/*    */   public abstract void a(dfm paramdfm, eag parameag, int paramInt, T paramT, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */