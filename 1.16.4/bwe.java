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
/*    */ public class bwe
/*    */   extends bwo
/*    */ {
/* 18 */   protected static final ddh a = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
/*    */   
/*    */   public bwe(ceg.c ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 26 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 31 */     d(☃, brx1, fx1);
/* 32 */     return aou.a(brx1.v);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, bfw bfw1) {
/* 37 */     d(☃, brx1, fx1);
/*    */   }
/*    */   
/*    */   private void d(ceh ☃, brx brx1, fx fx1) {
/* 41 */     for (int i = 0; i < 1000; i++) {
/* 42 */       fx fx2 = fx1.b(brx1.t.nextInt(16) - brx1.t.nextInt(16), brx1.t.nextInt(8) - brx1.t.nextInt(8), brx1.t.nextInt(16) - brx1.t.nextInt(16));
/* 43 */       if (brx1.d_(fx2).g()) {
/* 44 */         if (brx1.v) {
/* 45 */           for (int j = 0; j < 128; j++) {
/* 46 */             double d1 = brx1.t.nextDouble();
/* 47 */             float f1 = (brx1.t.nextFloat() - 0.5F) * 0.2F;
/* 48 */             float f2 = (brx1.t.nextFloat() - 0.5F) * 0.2F;
/* 49 */             float f3 = (brx1.t.nextFloat() - 0.5F) * 0.2F;
/*    */             
/* 51 */             double d2 = afm.d(d1, fx2.u(), fx1.u()) + brx1.t.nextDouble() - 0.5D + 0.5D;
/* 52 */             double d3 = afm.d(d1, fx2.v(), fx1.v()) + brx1.t.nextDouble() - 0.5D;
/* 53 */             double d4 = afm.d(d1, fx2.w(), fx1.w()) + brx1.t.nextDouble() - 0.5D + 0.5D;
/* 54 */             brx1.a(hh.Q, d2, d3, d4, f1, f2, f3);
/*    */           } 
/*    */         } else {
/* 57 */           brx1.a(fx2, ☃, 2);
/* 58 */           brx1.a(fx1, false);
/*    */         } 
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected int c() {
/* 67 */     return 5;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 72 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */