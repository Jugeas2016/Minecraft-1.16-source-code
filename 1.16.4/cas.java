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
/*    */ public class cas
/*    */   extends buo
/*    */ {
/* 21 */   public static final cfg a = cex.aj;
/*    */ 
/*    */   
/* 24 */   protected static final ddh b = buo.a(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
/*    */   
/*    */   protected cas(ceg.c ☃) {
/* 27 */     super(☃);
/* 28 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 33 */     return b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 38 */     if (!☃.a(aag1, fx1)) {
/* 39 */       aag1.b(fx1, true);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 45 */     if (aag1.w(fx1.b())) {
/* 46 */       int i = 1;
/* 47 */       while (aag1.d_(fx1.c(i)).a(this)) {
/* 48 */         i++;
/*    */       }
/* 50 */       if (i < 3) {
/* 51 */         int j = ((Integer)☃.c(a)).intValue();
/* 52 */         if (j == 15) {
/* 53 */           aag1.a(fx1.b(), n());
/* 54 */           aag1.a(fx1, ☃.a(a, Integer.valueOf(0)), 4);
/*    */         } else {
/* 56 */           aag1.a(fx1, ☃.a(a, Integer.valueOf(j + 1)), 4);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 64 */     if (!☃.a(bry1, fx1)) {
/* 65 */       bry1.J().a(fx1, this, 1);
/*    */     }
/*    */     
/* 68 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 73 */     ceh ceh1 = brz1.d_(fx1.c());
/* 74 */     if (ceh1.b() == this) {
/* 75 */       return true;
/*    */     }
/*    */     
/* 78 */     if (ceh1.a(bup.i) || ceh1.a(bup.j) || ceh1.a(bup.k) || ceh1.a(bup.l) || ceh1.a(bup.C) || ceh1.a(bup.D)) {
/* 79 */       fx fx2 = fx1.c();
/* 80 */       for (gc gc : gc.c.a) {
/* 81 */         ceh ceh2 = brz1.d_(fx2.a(gc));
/* 82 */         cux cux = brz1.b(fx2.a(gc));
/* 83 */         if (cux.a(aef.b) || ceh2.a(bup.iI)) {
/* 84 */           return true;
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 89 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 94 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */