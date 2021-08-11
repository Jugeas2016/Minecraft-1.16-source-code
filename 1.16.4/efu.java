/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class efu
/*    */   extends efw<bdp, dup<bdp>>
/*    */ {
/* 12 */   private static final vk a = new vk("textures/entity/slime/magmacube.png");
/*    */   
/*    */   public efu(eet ☃) {
/* 15 */     super(☃, new dup<>(), 0.25F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(bdp ☃, fx fx1) {
/* 20 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bdp ☃) {
/* 25 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bdp ☃, dfm dfm1, float f) {
/* 30 */     int i = ☃.eP();
/* 31 */     float f1 = afm.g(f, ☃.d, ☃.c) / (i * 0.5F + 1.0F);
/* 32 */     float f2 = 1.0F / (f1 + 1.0F);
/* 33 */     dfm1.a(f2 * i, 1.0F / f2 * i, f2 * i);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */