/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eev
/*    */   extends eeu<bge>
/*    */ {
/* 13 */   private static final vk a = new vk("textures/entity/illager/evoker_fangs.png");
/*    */   
/* 15 */   private final dud<bge> e = new dud<>();
/*    */   
/*    */   public eev(eet ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bge ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 23 */     float f3 = ☃.a(f2);
/* 24 */     if (f3 == 0.0F) {
/*    */       return;
/*    */     }
/* 27 */     float f4 = 2.0F;
/* 28 */     if (f3 > 0.9F) {
/* 29 */       f4 = (float)(f4 * (1.0D - f3) / 0.10000000149011612D);
/*    */     }
/*    */     
/* 32 */     dfm1.a();
/*    */     
/* 34 */     dfm1.a(g.d.a(90.0F - ☃.p));
/* 35 */     dfm1.a(-f4, -f4, f4);
/* 36 */     float f5 = 0.03125F;
/* 37 */     dfm1.a(0.0D, -0.6259999871253967D, 0.0D);
/* 38 */     dfm1.a(0.5F, 0.5F, 0.5F);
/*    */     
/* 40 */     this.e.a(☃, f3, 0.0F, 0.0F, ☃.p, ☃.q);
/*    */     
/* 42 */     dfq dfq = eag1.getBuffer(this.e.a(a));
/* 43 */     this.e.a(dfm1, dfq, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/* 44 */     dfm1.b();
/*    */     
/* 46 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bge ☃) {
/* 51 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */