/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class egl
/*    */   extends efw<bar, dvl<bar>>
/*    */ {
/* 11 */   private static final vk a = new vk("textures/entity/fish/salmon.png");
/*    */   
/*    */   public egl(eet ☃) {
/* 14 */     super(☃, new dvl<>(), 0.4F);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bar ☃) {
/* 19 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bar ☃, dfm dfm1, float f1, float f2, float f3) {
/* 24 */     super.a(☃, dfm1, f1, f2, f3);
/*    */     
/* 26 */     float f4 = 1.0F;
/* 27 */     float f5 = 1.0F;
/* 28 */     if (!☃.aE()) {
/* 29 */       f4 = 1.3F;
/* 30 */       f5 = 1.7F;
/*    */     } 
/*    */     
/* 33 */     float f6 = f4 * 4.3F * afm.a(f5 * 0.6F * f1);
/* 34 */     dfm1.a(g.d.a(f6));
/*    */     
/* 36 */     dfm1.a(0.0D, 0.0D, -0.4000000059604645D);
/* 37 */     if (!☃.aE()) {
/* 38 */       dfm1.a(0.20000000298023224D, 0.10000000149011612D, 0.0D);
/* 39 */       dfm1.a(g.f.a(90.0F));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\egl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */