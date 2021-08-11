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
/*    */ public class eer
/*    */   extends efw<bdg, dua<bdg>>
/*    */ {
/* 16 */   private static final vk a = new vk("textures/entity/enderman/enderman.png");
/*    */   
/* 18 */   private final Random g = new Random();
/*    */   
/*    */   public eer(eet ☃) {
/* 21 */     super(☃, new dua<>(0.0F), 0.5F);
/*    */     
/* 23 */     a(new eie<>(this));
/* 24 */     a(new ehv(this));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(bdg ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 30 */     ceh ceh = ☃.eM();
/* 31 */     dua<bdg> dua = c();
/* 32 */     dua.a = (ceh != null);
/* 33 */     dua.b = ☃.eN();
/*    */     
/* 35 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public dcn a(bdg ☃, float f) {
/* 40 */     if (☃.eN()) {
/* 41 */       double d = 0.02D;
/* 42 */       return new dcn(this.g.nextGaussian() * 0.02D, 0.0D, this.g.nextGaussian() * 0.02D);
/*    */     } 
/*    */     
/* 45 */     return super.a(☃, f);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bdg ☃) {
/* 50 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */