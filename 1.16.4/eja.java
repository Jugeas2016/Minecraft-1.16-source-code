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
/*    */ public class eja<T extends aqm>
/*    */   extends eit<T, dvd<T>>
/*    */ {
/* 16 */   public static final vk a = new vk("textures/entity/trident_riptide.png");
/*    */   
/*    */   private final dwn b;
/*    */   
/*    */   public eja(egk<T, dvd<T>> ☃) {
/* 21 */     super(☃);
/*    */     
/* 23 */     this.b = new dwn(64, 64, 0, 0);
/* 24 */     this.b.a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, T t, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 29 */     if (!t.dR()) {
/*    */       return;
/*    */     }
/*    */     
/* 33 */     dfq dfq = eag1.getBuffer(eao.d(a));
/* 34 */     for (int j = 0; j < 3; j++) {
/* 35 */       ☃.a();
/* 36 */       float f7 = f4 * -(45 + j * 5);
/* 37 */       ☃.a(g.d.a(f7));
/* 38 */       float f8 = 0.75F * j;
/* 39 */       ☃.a(f8, f8, f8);
/* 40 */       ☃.a(0.0D, (-0.2F + 0.6F * j), 0.0D);
/* 41 */       this.b.a(☃, dfq, i, ejw.a);
/* 42 */       ☃.b();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */