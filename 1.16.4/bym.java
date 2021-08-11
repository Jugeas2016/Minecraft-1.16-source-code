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
/*    */ 
/*    */ public class bym
/*    */   extends buu
/*    */ {
/* 19 */   public static final cfg a = cex.ag;
/*    */   
/* 21 */   private static final ddh[] b = new ddh[] {
/* 22 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), 
/* 23 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
/* 24 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D), 
/* 25 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D)
/*    */     };
/*    */   
/*    */   protected bym(ceg.c ☃) {
/* 29 */     super(☃);
/* 30 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 35 */     return b[((Integer)☃.c(a)).intValue()];
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean c(ceh ☃, brc brc1, fx fx1) {
/* 40 */     return ☃.a(bup.cM);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a_(ceh ☃) {
/* 45 */     return (((Integer)☃.c(a)).intValue() < 3);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 50 */     int i = ((Integer)☃.c(a)).intValue();
/* 51 */     if (i < 3 && random.nextInt(10) == 0) {
/* 52 */       ☃ = ☃.a(a, Integer.valueOf(i + 1));
/* 53 */       aag1.a(fx1, ☃, 2);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 59 */     return new bmb(bmd.nu);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 64 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bym.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */