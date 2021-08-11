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
/*    */ public class bvo
/*    */   extends btz
/*    */ {
/*    */   private final buo a;
/*    */   
/*    */   protected bvo(buo ☃, ceg.c c1) {
/* 17 */     super(c1);
/* 18 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 23 */     a(☃, brx1, fx1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 28 */     if (!c(☃, aag1, fx1)) {
/* 29 */       aag1.a(fx1, this.a.n().a(b, Boolean.valueOf(false)), 2);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 35 */     if (gc1 == gc.a && !☃.a(bry1, fx1)) {
/* 36 */       return bup.a.n();
/*    */     }
/*    */     
/* 39 */     a(☃, bry1, fx1);
/*    */     
/* 41 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 42 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*    */     }
/*    */     
/* 45 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */