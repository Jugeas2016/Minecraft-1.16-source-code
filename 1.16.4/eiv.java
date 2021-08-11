/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eiv
/*    */   extends eit<bas, dvn<bas>>
/*    */ {
/* 13 */   private static final vk a = new vk("textures/entity/sheep/sheep_fur.png");
/*    */   
/* 15 */   private final dvm<bas> b = new dvm<>();
/*    */   
/*    */   public eiv(egk<bas, dvn<bas>> ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, bas bas1, float f1, float f2, float f3, float f4, float f5, float f6) {
/*    */     float f7, f8, f9;
/* 23 */     if (bas1.eM() || bas1.bF()) {
/*    */       return;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 31 */     if (bas1.S() && "jeb_".equals(bas1.R().a())) {
/*    */       
/* 33 */       int j = 25;
/* 34 */       int k = bas1.K / 25 + bas1.Y();
/* 35 */       int m = (bkx.values()).length;
/* 36 */       int n = k % m;
/* 37 */       int i1 = (k + 1) % m;
/* 38 */       float f = ((bas1.K % 25) + f3) / 25.0F;
/* 39 */       float[] arrayOfFloat1 = bas.a(bkx.a(n));
/* 40 */       float[] arrayOfFloat2 = bas.a(bkx.a(i1));
/* 41 */       f7 = arrayOfFloat1[0] * (1.0F - f) + arrayOfFloat2[0] * f;
/* 42 */       f8 = arrayOfFloat1[1] * (1.0F - f) + arrayOfFloat2[1] * f;
/* 43 */       f9 = arrayOfFloat1[2] * (1.0F - f) + arrayOfFloat2[2] * f;
/*    */     } else {
/* 45 */       float[] arrayOfFloat = bas.a(bas1.eL());
/* 46 */       f7 = arrayOfFloat[0];
/* 47 */       f8 = arrayOfFloat[1];
/* 48 */       f9 = arrayOfFloat[2];
/*    */     } 
/*    */     
/* 51 */     a(aC_(), this.b, a, ☃, eag1, i, bas1, f1, f2, f4, f5, f6, f3, f7, f8, f9);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eiv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */