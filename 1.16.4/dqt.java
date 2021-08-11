/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dqt
/*    */   extends dlj
/*    */ {
/*    */   private final boolean a;
/*    */   private final boolean b;
/*    */   
/*    */   public dqt(int ☃, int i, boolean bool1, dlj.a a1, boolean bool2) {
/* 17 */     super(☃, i, 23, 13, oe.d, a1);
/* 18 */     this.a = bool1;
/* 19 */     this.b = bool2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(dfm ☃, int i, int j, float f) {
/* 24 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 25 */     djz.C().M().a(dpv.b);
/*    */     
/* 27 */     int k = 0;
/* 28 */     int m = 192;
/* 29 */     if (g()) {
/* 30 */       k += 23;
/*    */     }
/* 32 */     if (!this.a) {
/* 33 */       m += 13;
/*    */     }
/*    */     
/* 36 */     b(☃, this.l, this.m, k, m, 23, 13);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(enu ☃) {
/* 41 */     if (this.b)
/* 42 */       ☃.a(emp.a(adq.aX, 1.0F)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */