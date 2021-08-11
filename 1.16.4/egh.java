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
/*    */ public class egh
/*    */   extends efw<bap, duc<bap>>
/*    */ {
/* 14 */   private static final vk a = new vk("textures/entity/fish/pufferfish.png");
/*    */   
/*    */   private int g;
/*    */   private final dvh<bap> h;
/*    */   private final dvg<bap> i;
/*    */   private final dvf<bap> j;
/*    */   
/*    */   public egh(eet ☃) {
/* 22 */     super(☃, new dvf<>(), 0.2F);
/*    */     
/* 24 */     this.h = new dvh<>();
/* 25 */     this.i = new dvg<>();
/* 26 */     this.j = new dvf<>();
/*    */     
/* 28 */     this.g = 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bap ☃) {
/* 33 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bap ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 38 */     int j = ☃.eN();
/* 39 */     if (j != this.g) {
/* 40 */       if (j == 0) {
/* 41 */         this.e = this.h;
/* 42 */       } else if (j == 1) {
/* 43 */         this.e = this.i;
/*    */       } else {
/* 45 */         this.e = this.j;
/*    */       } 
/*    */     }
/*    */     
/* 49 */     this.g = j;
/* 50 */     this.c = 0.1F + 0.1F * j;
/* 51 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bap ☃, dfm dfm1, float f1, float f2, float f3) {
/* 56 */     dfm1.a(0.0D, (afm.b(f1 * 0.05F) * 0.08F), 0.0D);
/* 57 */     super.a(☃, dfm1, f1, f2, f3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\egh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */