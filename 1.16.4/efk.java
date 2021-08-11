/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class efk
/*    */   extends efj<bdo>
/*    */ {
/* 13 */   private static final vk a = new vk("textures/entity/illager/illusioner.png");
/*    */   
/*    */   public efk(eet ☃) {
/* 16 */     super(☃, new dun<>(0.0F, 0.0F, 64, 64), 0.5F);
/*    */     
/* 18 */     a(new ein<bdo, dun<bdo>>(this, this)
/*    */         {
/*    */           public void a(dfm ☃, eag eag1, int i, bdo bdo1, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 21 */             if (bdo1.eW() || bdo1.eF()) {
/* 22 */               super.a(☃, eag1, i, bdo1, f1, f2, f3, f4, f5, f6);
/*    */             }
/*    */           }
/*    */         });
/* 26 */     (this.e.b()).h = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bdo ☃) {
/* 31 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bdo ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 36 */     if (☃.bF()) {
/* 37 */       dcn[] arrayOfDcn = ☃.y(f2);
/* 38 */       float f = a(☃, f2);
/* 39 */       for (int j = 0; j < arrayOfDcn.length; j++) {
/* 40 */         dfm1.a();
/* 41 */         dfm1.a((arrayOfDcn[j]).b + afm.b(j + f * 0.5F) * 0.025D, (arrayOfDcn[j]).c + afm.b(j + f * 0.75F) * 0.0125D, (arrayOfDcn[j]).d + afm.b(j + f * 0.7F) * 0.025D);
/* 42 */         super.a(☃, f1, f2, dfm1, eag1, i);
/* 43 */         dfm1.b();
/*    */       } 
/*    */     } else {
/* 46 */       super.a(☃, f1, f2, dfm1, eag1, i);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(bdo ☃) {
/* 52 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */