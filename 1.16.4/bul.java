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
/*    */ 
/*    */ public class bul
/*    */   extends bvs
/*    */ {
/* 20 */   public static final cfg a = cex.ag;
/*    */   
/* 22 */   private static final ddh[] c = new ddh[] {
/* 23 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
/* 24 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
/* 25 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), 
/* 26 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D)
/*    */     };
/*    */   
/*    */   public bul(ceg.c ☃) {
/* 30 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cfg c() {
/* 35 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public int d() {
/* 40 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected brw e() {
/* 45 */     return bmd.qg;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 51 */     if (random.nextInt(3) != 0) {
/* 52 */       super.b(☃, aag1, fx1, random);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(brx ☃) {
/* 58 */     return super.a(☃) / 3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 63 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 68 */     return c[((Integer)☃.c(c())).intValue()];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bul.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */