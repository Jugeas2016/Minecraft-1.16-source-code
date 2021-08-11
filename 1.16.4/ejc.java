/*    */ import java.util.Random;
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
/*    */ public abstract class ejc<T extends aqm, M extends dvd<T>>
/*    */   extends eit<T, M>
/*    */ {
/*    */   public ejc(efr<T, M> ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, T t, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 25 */     int j = a(t);
/* 26 */     Random random = new Random(t.Y());
/*    */     
/* 28 */     if (j <= 0) {
/*    */       return;
/*    */     }
/*    */     
/* 32 */     for (int k = 0; k < j; k++) {
/* 33 */       ☃.a();
/* 34 */       dwn dwn = ((dvd)aC_()).a(random);
/* 35 */       dwn.a a = dwn.a(random);
/* 36 */       dwn.a(☃);
/* 37 */       float f7 = random.nextFloat();
/* 38 */       float f8 = random.nextFloat();
/* 39 */       float f9 = random.nextFloat();
/* 40 */       float f10 = afm.g(f7, a.a, a.d) / 16.0F;
/* 41 */       float f11 = afm.g(f8, a.b, a.e) / 16.0F;
/* 42 */       float f12 = afm.g(f9, a.c, a.f) / 16.0F;
/* 43 */       ☃.a(f10, f11, f12);
/* 44 */       f7 = -1.0F * (f7 * 2.0F - 1.0F);
/* 45 */       f8 = -1.0F * (f8 * 2.0F - 1.0F);
/* 46 */       f9 = -1.0F * (f9 * 2.0F - 1.0F);
/*    */       
/* 48 */       a(☃, eag1, i, (aqa)t, f7, f8, f9, f3);
/*    */       
/* 50 */       ☃.b();
/*    */     } 
/*    */   }
/*    */   
/*    */   protected abstract int a(T paramT);
/*    */   
/*    */   protected abstract void a(dfm paramdfm, eag parameag, int paramInt, aqa paramaqa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */