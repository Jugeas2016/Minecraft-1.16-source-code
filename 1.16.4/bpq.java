/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpq
/*    */   extends bps
/*    */ {
/*    */   protected bpq(bps.a ☃, aqf... arrayOfAqf) {
/* 11 */     super(☃, bpt.j, arrayOfAqf);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 16 */     return 5 + (☃ - 1) * 8;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 21 */     return super.a(☃) + 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 26 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃) {
/* 31 */     if (☃.e()) {
/* 32 */       return true;
/*    */     }
/* 34 */     return super.a(☃);
/*    */   }
/*    */   
/*    */   public static boolean a(bmb ☃, int i, Random random) {
/* 38 */     if (☃.b() instanceof bjy && random.nextFloat() < 0.6F) {
/* 39 */       return false;
/*    */     }
/* 41 */     return (random.nextInt(i + 1) > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bpq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */