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
/*    */ 
/*    */ public class ehd
/*    */   extends efw<baw, duc<baw>>
/*    */ {
/* 16 */   private final dwa<baw> a = new dwa<>(0.0F);
/* 17 */   private final dwb<baw> g = new dwb<>(0.0F);
/*    */   
/*    */   public ehd(eet ☃) {
/* 20 */     super(☃, new dwa<>(0.0F), 0.15F);
/*    */     
/* 22 */     a(new ejd(this));
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(baw ☃) {
/* 27 */     return ☃.eZ();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(baw ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 32 */     dtu<baw> dtu = (☃.eX() == 0) ? this.a : this.g;
/* 33 */     this.e = dtu;
/*    */     
/* 35 */     float[] arrayOfFloat = ☃.eV();
/* 36 */     dtu.a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2]);
/* 37 */     super.a(☃, f1, f2, dfm1, eag1, i);
/* 38 */     dtu.a(1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(baw ☃, dfm dfm1, float f1, float f2, float f3) {
/* 43 */     super.a(☃, dfm1, f1, f2, f3);
/*    */     
/* 45 */     float f = 4.3F * afm.a(0.6F * f1);
/* 46 */     dfm1.a(g.d.a(f));
/*    */     
/* 48 */     if (!☃.aE()) {
/* 49 */       dfm1.a(0.20000000298023224D, 0.10000000149011612D, 0.0D);
/* 50 */       dfm1.a(g.f.a(90.0F));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ehd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */