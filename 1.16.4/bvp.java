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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bvp
/*    */   extends bub
/*    */ {
/*    */   private final buo c;
/* 19 */   protected static final ddh a = buo.a(2.0D, 0.0D, 2.0D, 14.0D, 15.0D, 14.0D);
/*    */   
/*    */   protected bvp(buo ☃, ceg.c c1) {
/* 22 */     super(c1);
/* 23 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 28 */     a(☃, brx1, fx1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 33 */     if (!c(☃, aag1, fx1)) {
/* 34 */       aag1.a(fx1, this.c.n().a(b, Boolean.valueOf(false)), 2);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 40 */     if (gc1 == gc.a && !☃.a(bry1, fx1)) {
/* 41 */       return bup.a.n();
/*    */     }
/*    */     
/* 44 */     a(☃, bry1, fx1);
/*    */     
/* 46 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 47 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*    */     }
/*    */     
/* 50 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 55 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */