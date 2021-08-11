/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ecr
/*    */   extends ecs<cdk>
/*    */ {
/* 12 */   private static final vk d = new vk("textures/entity/end_gateway_beam.png");
/*    */   
/*    */   public ecr(ecd ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cdk ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/* 20 */     if (☃.d() || ☃.f()) {
/* 21 */       float f1 = ☃.d() ? ☃.a(f) : ☃.b(f);
/* 22 */       double d = ☃.d() ? 256.0D : 50.0D;
/* 23 */       f1 = afm.a(f1 * 3.1415927F);
/* 24 */       int k = afm.c(f1 * d);
/* 25 */       float[] arrayOfFloat = ☃.d() ? bkx.c.e() : bkx.k.e();
/* 26 */       long l = ☃.v().T();
/* 27 */       eca.a(dfm1, eag1, d, f, f1, l, 0, k, arrayOfFloat, 0.15F, 0.175F);
/* 28 */       eca.a(dfm1, eag1, d, f, f1, l, 0, -k, arrayOfFloat, 0.15F, 0.175F);
/*    */     } 
/* 30 */     super.a(☃, f, dfm1, eag1, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(double ☃) {
/* 35 */     return super.a(☃) + 1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected float a() {
/* 40 */     return 1.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */