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
/*    */ public class cbu
/*    */   extends bwu
/*    */ {
/*    */   public cbu(aps ☃, ceg.c c1) {
/* 24 */     super(☃, 8, c1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean c(ceh ☃, brc brc1, fx fx1) {
/* 29 */     return (super.c(☃, brc1, fx1) || ☃.a(bup.cL) || ☃.a(bup.cM) || ☃.a(bup.cN));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 34 */     ddh ddh = b(☃, brx1, fx1, dcs.a());
/* 35 */     dcn dcn = ddh.a().f();
/* 36 */     double d1 = fx1.u() + dcn.b;
/* 37 */     double d2 = fx1.w() + dcn.d;
/* 38 */     for (int i = 0; i < 3; i++) {
/* 39 */       if (random.nextBoolean()) {
/* 40 */         brx1.a(hh.S, d1 + random.nextDouble() / 5.0D, fx1.v() + 0.5D - random.nextDouble(), d2 + random.nextDouble() / 5.0D, 0.0D, 0.0D, 0.0D);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/* 47 */     if (brx1.v || brx1.ad() == aor.a) {
/*    */       return;
/*    */     }
/*    */     
/* 51 */     if (aqa1 instanceof aqm) {
/* 52 */       aqm aqm = (aqm)aqa1;
/* 53 */       if (!aqm.b(apk.p))
/* 54 */         aqm.c(new apu(apw.t, 40)); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */