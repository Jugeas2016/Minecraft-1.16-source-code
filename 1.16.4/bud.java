/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bud
/*    */   extends buo
/*    */   implements bwm
/*    */ {
/*    */   protected bud(ceg.c ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bzh b(ceh ☃) {
/* 18 */     return bzh.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brx brx1, fx fx1, int i, int j) {
/* 23 */     super.a(☃, brx1, fx1, i, j);
/*    */     
/* 25 */     ccj ccj = brx1.c(fx1);
/* 26 */     if (ccj == null) {
/* 27 */       return false;
/*    */     }
/* 29 */     return ccj.a_(i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public aox b(ceh ☃, brx brx1, fx fx1) {
/* 35 */     ccj ccj = brx1.c(fx1);
/* 36 */     return (ccj instanceof aox) ? (aox)ccj : null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bud.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */