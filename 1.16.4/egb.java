/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class egb
/*    */   extends efw<bam, duz>
/*    */ {
/*  9 */   public static final vk[] a = new vk[] { new vk("textures/entity/parrot/parrot_red_blue.png"), new vk("textures/entity/parrot/parrot_blue.png"), new vk("textures/entity/parrot/parrot_green.png"), new vk("textures/entity/parrot/parrot_yellow_blue.png"), new vk("textures/entity/parrot/parrot_grey.png") };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public egb(eet ☃) {
/* 18 */     super(☃, new duz(), 0.3F);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bam ☃) {
/* 23 */     return a[☃.eW()];
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(bam ☃, float f) {
/* 28 */     float f1 = afm.g(f, ☃.bt, ☃.bq);
/* 29 */     float f2 = afm.g(f, ☃.bs, ☃.br);
/*    */     
/* 31 */     return (afm.a(f1) + 1.0F) * f2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\egb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */