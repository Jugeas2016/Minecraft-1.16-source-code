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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eid<T extends aqm, M extends duc<T>>
/*    */   extends eit<T, M>
/*    */ {
/* 21 */   private static final vk a = new vk("textures/entity/elytra.png");
/*    */   
/* 23 */   private final dtz<T> b = new dtz<>();
/*    */   
/*    */   public eid(egk<T, M> ☃) {
/* 26 */     super(☃);
/*    */   }
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, T t, float f1, float f2, float f3, float f4, float f5, float f6) {
/*    */     vk vk1;
/* 31 */     bmb bmb = t.b(aqf.e);
/* 32 */     if (bmb.b() != bmd.qo) {
/*    */       return;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 38 */     if (t instanceof dzj) {
/* 39 */       dzj dzj = (dzj)t;
/* 40 */       if (dzj.q() && dzj.r() != null) {
/* 41 */         vk1 = dzj.r();
/* 42 */       } else if (dzj.c() && dzj.p() != null && dzj.a(bfx.a)) {
/* 43 */         vk1 = dzj.p();
/*    */       } else {
/* 45 */         vk1 = a;
/*    */       } 
/*    */     } else {
/* 48 */       vk1 = a;
/*    */     } 
/*    */     
/* 51 */     ☃.a();
/* 52 */     ☃.a(0.0D, 0.0D, 0.125D);
/*    */     
/* 54 */     aC_().a(this.b);
/* 55 */     this.b.a(t, f1, f2, f4, f5, f6);
/*    */     
/* 57 */     dfq dfq = efo.a(eag1, eao.a(vk1), false, bmb.u());
/* 58 */     this.b.a(☃, dfq, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 60 */     ☃.b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */