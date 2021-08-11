/*    */ import javax.annotation.Nullable;
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
/*    */ 
/*    */ 
/*    */ public class edy
/*    */   extends efr<bcn, dti>
/*    */ {
/* 19 */   public static final vk a = new vk("textures/entity/armorstand/wood.png");
/*    */   
/*    */   public edy(eet ☃) {
/* 22 */     super(☃, new dtj(), 0.0F);
/* 23 */     a(new eik<>(this, new dti(0.5F), new dti(1.0F)));
/* 24 */     a(new ein<>(this));
/* 25 */     a(new eid<>(this));
/* 26 */     a(new ehz<>(this));
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bcn ☃) {
/* 31 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bcn ☃, dfm dfm1, float f1, float f2, float f3) {
/* 36 */     dfm1.a(g.d.a(180.0F - f2));
/*    */     
/* 38 */     float f = (float)(☃.l.T() - ☃.bi) + f3;
/* 39 */     if (f < 5.0F) {
/* 40 */       dfm1.a(g.d.a(afm.a(f / 1.5F * 3.1415927F) * 3.0F));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(bcn ☃) {
/* 46 */     double d = this.b.b(☃);
/* 47 */     float f = ☃.bz() ? 32.0F : 64.0F;
/* 48 */     if (d >= (f * f)) {
/* 49 */       return false;
/*    */     }
/*    */     
/* 52 */     return ☃.bX();
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected eao a(bcn ☃, boolean bool1, boolean bool2, boolean bool3) {
/* 58 */     if (!☃.q()) {
/* 59 */       return super.a(☃, bool1, bool2, bool3);
/*    */     }
/*    */     
/* 62 */     vk vk1 = a(☃);
/* 63 */     if (bool2) {
/* 64 */       return eao.c(vk1, false);
/*    */     }
/* 66 */     if (bool1) {
/* 67 */       return eao.a(vk1, false);
/*    */     }
/* 69 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */