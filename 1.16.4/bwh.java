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
/*    */ public class bwh
/*    */   extends bud
/*    */ {
/*    */   protected bwh(ceg.c ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ccj a(brc ☃) {
/* 22 */     return new cdk();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 27 */     ccj ccj = brx1.c(fx1);
/* 28 */     if (!(ccj instanceof cdk)) {
/*    */       return;
/*    */     }
/* 31 */     int i = ((cdk)ccj).j();
/* 32 */     for (int j = 0; j < i; j++) {
/* 33 */       double d1 = fx1.u() + random.nextDouble();
/* 34 */       double d2 = fx1.v() + random.nextDouble();
/* 35 */       double d3 = fx1.w() + random.nextDouble();
/* 36 */       double d4 = (random.nextDouble() - 0.5D) * 0.5D;
/* 37 */       double d5 = (random.nextDouble() - 0.5D) * 0.5D;
/* 38 */       double d6 = (random.nextDouble() - 0.5D) * 0.5D;
/*    */       
/* 40 */       int k = random.nextInt(2) * 2 - 1;
/* 41 */       if (random.nextBoolean()) {
/* 42 */         d3 = fx1.w() + 0.5D + 0.25D * k;
/* 43 */         d6 = (random.nextFloat() * 2.0F * k);
/*    */       } else {
/* 45 */         d1 = fx1.u() + 0.5D + 0.25D * k;
/* 46 */         d4 = (random.nextFloat() * 2.0F * k);
/*    */       } 
/*    */       
/* 49 */       brx1.a(hh.Q, d1, d2, d3, d4, d5, d6);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 55 */     return bmb.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, cuw cuw1) {
/* 60 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */