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
/*    */ public class bww
/*    */   extends bxo
/*    */ {
/* 19 */   public static final cfg a = cex.ag;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public bww(ceg.c ☃) {
/* 25 */     super(☃);
/* 26 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 32 */     a(☃, aag1, fx1, random);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 37 */     if ((random.nextInt(3) == 0 || a(aag1, fx1, 4)) && aag1.B(fx1) > 11 - ((Integer)☃.c(a)).intValue() - ☃.b(aag1, fx1) && 
/* 38 */       e(☃, aag1, fx1)) {
/* 39 */       fx.a a = new fx.a();
/* 40 */       for (gc gc : gc.values()) {
/* 41 */         a.a(fx1, gc);
/* 42 */         ceh ceh1 = aag1.d_(a);
/* 43 */         if (ceh1.a(this) && !e(ceh1, aag1, a)) {
/* 44 */           aag1.j().a(a, this, afm.a(random, 20, 40));
/*    */         }
/*    */       } 
/*    */       
/*    */       return;
/*    */     } 
/* 50 */     aag1.j().a(fx1, this, afm.a(random, 20, 40));
/*    */   }
/*    */   
/*    */   private boolean e(ceh ☃, brx brx1, fx fx1) {
/* 54 */     int i = ((Integer)☃.c(a)).intValue();
/* 55 */     if (i < 3) {
/* 56 */       brx1.a(fx1, ☃.a(a, Integer.valueOf(i + 1)), 2);
/* 57 */       return false;
/*    */     } 
/* 59 */     d(☃, brx1, fx1);
/* 60 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 66 */     if (buo1 == this && 
/* 67 */       a(brx1, fx1, 2)) {
/* 68 */       d(☃, brx1, fx1);
/*    */     }
/*    */ 
/*    */     
/* 72 */     super.a(☃, brx1, fx1, buo1, fx2, bool);
/*    */   }
/*    */   
/*    */   private boolean a(brc ☃, fx fx1, int i) {
/* 76 */     int j = 0;
/* 77 */     fx.a a = new fx.a();
/* 78 */     for (gc gc : gc.values()) {
/* 79 */       a.a(fx1, gc);
/*    */       
/* 81 */       j++;
/* 82 */       if (☃.d_(a).a(this) && j >= i) {
/* 83 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 87 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 92 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 97 */     return bmb.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bww.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */