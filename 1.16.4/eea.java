/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eea
/*    */   extends efw<azu, dtk>
/*    */ {
/* 10 */   private static final vk a = new vk("textures/entity/bat.png");
/*    */   
/*    */   public eea(eet ☃) {
/* 13 */     super(☃, new dtk(), 0.25F);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(azu ☃) {
/* 18 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(azu ☃, dfm dfm1, float f) {
/* 23 */     dfm1.a(0.35F, 0.35F, 0.35F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(azu ☃, dfm dfm1, float f1, float f2, float f3) {
/* 28 */     if (☃.eI()) {
/* 29 */       dfm1.a(0.0D, -0.10000000149011612D, 0.0D);
/*    */     } else {
/* 31 */       dfm1.a(0.0D, (afm.b(f1 * 0.3F) * 0.1F), 0.0D);
/*    */     } 
/* 33 */     super.a(☃, dfm1, f1, f2, f3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */