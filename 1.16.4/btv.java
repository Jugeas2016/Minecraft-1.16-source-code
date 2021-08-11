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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class btv
/*    */   extends buo
/*    */   implements buq
/*    */ {
/* 25 */   protected static final ddh a = buo.a(4.0D, 0.0D, 4.0D, 12.0D, 12.0D, 12.0D);
/*    */   
/*    */   public btv(ceg.c ☃) {
/* 28 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ceg.b ah_() {
/* 33 */     return ceg.b.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 38 */     dcn dcn = ☃.n(brc1, fx1);
/* 39 */     return a.a(dcn.b, dcn.c, dcn.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 44 */     if (random.nextInt(3) == 0 && aag1.w(fx1.b()) && aag1.b(fx1.b(), 0) >= 9) {
/* 45 */       a(aag1, fx1);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 51 */     return brz1.d_(fx1.c()).a(aed.ac);
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 56 */     if (!☃.a(bry1, fx1)) {
/* 57 */       return bup.a.n();
/*    */     }
/*    */     
/* 60 */     if (gc1 == gc.b && ceh1.a(bup.kY)) {
/* 61 */       bry1.a(fx1, bup.kY.n(), 2);
/*    */     }
/*    */     
/* 64 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 69 */     return new bmb(bmd.bF);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 74 */     return ☃.d_(fx1.b()).g();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 79 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 84 */     a(☃, fx1);
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(ceh ☃, bfw bfw1, brc brc1, fx fx1) {
/* 89 */     if (bfw1.dD().b() instanceof bnf) {
/* 90 */       return 1.0F;
/*    */     }
/*    */     
/* 93 */     return super.a(☃, bfw1, brc1, fx1);
/*    */   }
/*    */   
/*    */   protected void a(brx ☃, fx fx1) {
/* 97 */     ☃.a(fx1.b(), bup.kY.n().a(btu.e, ceu.b), 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */