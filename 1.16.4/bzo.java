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
/*    */ public class bzo
/*    */   extends buu
/*    */   implements buq
/*    */ {
/* 18 */   public static final cfg a = cex.aA;
/*    */ 
/*    */   
/* 21 */   protected static final ddh b = buo.a(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
/*    */   
/*    */   private final cdq c;
/*    */   
/*    */   protected bzo(cdq ☃, ceg.c c1) {
/* 26 */     super(c1);
/* 27 */     this.c = ☃;
/* 28 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 33 */     return b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 38 */     if (aag1.B(fx1.b()) >= 9 && 
/* 39 */       random.nextInt(7) == 0) {
/* 40 */       a(aag1, fx1, ☃, random);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aag ☃, fx fx1, ceh ceh1, Random random) {
/* 46 */     if (((Integer)ceh1.c(a)).intValue() == 0) {
/* 47 */       ☃.a(fx1, ceh1.a(a), 4);
/*    */     } else {
/* 49 */       this.c.a(☃, ☃.i().g(), fx1, ceh1, random);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 55 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 60 */     return (☃.t.nextFloat() < 0.45D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 65 */     a(☃, fx1, ceh1, random);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 70 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */