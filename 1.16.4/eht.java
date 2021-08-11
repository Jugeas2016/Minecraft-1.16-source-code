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
/*    */ public class eht<T extends aqm, M extends dvd<T>>
/*    */   extends ejc<T, M>
/*    */ {
/* 19 */   private static final vk a = new vk("textures/entity/bee/bee_stinger.png");
/*    */   
/*    */   public eht(efr<T, M> ☃) {
/* 22 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(T ☃) {
/* 27 */     return ☃.dz();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dfm ☃, eag eag1, int i, aqa aqa1, float f1, float f2, float f3, float f4) {
/* 32 */     float f5 = afm.c(f1 * f1 + f3 * f3);
/* 33 */     float f6 = (float)(Math.atan2(f1, f3) * 57.2957763671875D);
/* 34 */     float f7 = (float)(Math.atan2(f2, f5) * 57.2957763671875D);
/*    */     
/* 36 */     ☃.a(0.0D, 0.0D, 0.0D);
/* 37 */     ☃.a(g.d.a(f6 - 90.0F));
/* 38 */     ☃.a(g.f.a(f7));
/*    */     
/* 40 */     float f8 = 0.0F;
/* 41 */     float f9 = 0.125F;
/* 42 */     float f10 = 0.0F;
/* 43 */     float f11 = 0.0625F;
/*    */     
/* 45 */     float f12 = 0.03125F;
/*    */     
/* 47 */     ☃.a(g.b.a(45.0F));
/* 48 */     ☃.a(0.03125F, 0.03125F, 0.03125F);
/*    */     
/* 50 */     ☃.a(2.5D, 0.0D, 0.0D);
/*    */     
/* 52 */     dfq dfq = eag1.getBuffer(eao.d(a));
/* 53 */     for (int j = 0; j < 4; j++) {
/* 54 */       ☃.a(g.b.a(90.0F));
/* 55 */       dfm.a a = ☃.c();
/* 56 */       b b = a.a();
/* 57 */       a a1 = a.b();
/*    */       
/* 59 */       a(dfq, b, a1, -4.5F, -1, 0.0F, 0.0F, i);
/* 60 */       a(dfq, b, a1, 4.5F, -1, 0.125F, 0.0F, i);
/* 61 */       a(dfq, b, a1, 4.5F, 1, 0.125F, 0.0625F, i);
/* 62 */       a(dfq, b, a1, -4.5F, 1, 0.0F, 0.0625F, i);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static void a(dfq ☃, b b1, a a1, float f1, int i, float f2, float f3, int j) {
/* 67 */     ☃.a(b1, f1, i, 0.0F).a(255, 255, 255, 255).a(f2, f3).b(ejw.a).a(j).a(a1, 0.0F, 1.0F, 0.0F).d();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */