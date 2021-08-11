/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class efd
/*    */   extends efw<bdl, dum<bdl>>
/*    */ {
/* 12 */   private static final vk a = new vk("textures/entity/zombie/zombie.png");
/*    */   
/*    */   private final float g;
/*    */   
/*    */   public efd(eet ☃, float f) {
/* 17 */     super(☃, new dug(), 0.5F * f);
/*    */     
/* 19 */     this.g = f;
/*    */     
/* 21 */     a(new ein<>(this));
/* 22 */     a(new eik<>(this, new dug(0.5F, true), new dug(1.0F, true)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bdl ☃, dfm dfm1, float f) {
/* 27 */     dfm1.a(this.g, this.g, this.g);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bdl ☃) {
/* 32 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */