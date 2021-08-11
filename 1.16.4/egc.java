/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class egc
/*    */   extends efw<bds, dva<bds>>
/*    */ {
/* 11 */   private static final vk a = new vk("textures/entity/phantom.png");
/*    */   
/*    */   public egc(eet ☃) {
/* 14 */     super(☃, new dva<>(), 0.75F);
/*    */     
/* 16 */     a(new eis<>(this));
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bds ☃) {
/* 21 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bds ☃, dfm dfm1, float f) {
/* 26 */     int i = ☃.m();
/* 27 */     float f1 = 1.0F + 0.15F * i;
/* 28 */     dfm1.a(f1, f1, f1);
/*    */     
/* 30 */     dfm1.a(0.0D, 1.3125D, 0.1875D);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bds ☃, dfm dfm1, float f1, float f2, float f3) {
/* 35 */     super.a(☃, dfm1, f1, f2, f3);
/* 36 */     dfm1.a(g.b.a(☃.q));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\egc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */