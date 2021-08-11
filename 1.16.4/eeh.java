/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eeh
/*    */   extends efw<bac, dtr<bac>>
/*    */ {
/*  9 */   private static final vk a = new vk("textures/entity/chicken.png");
/*    */   
/*    */   public eeh(eet ☃) {
/* 12 */     super(☃, new dtr<>(), 0.3F);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bac ☃) {
/* 17 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected float a(bac ☃, float f) {
/* 22 */     float f1 = afm.g(f, ☃.br, ☃.bo);
/* 23 */     float f2 = afm.g(f, ☃.bq, ☃.bp);
/*    */     
/* 25 */     return (afm.a(f1) + 1.0F) * f2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eeh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */