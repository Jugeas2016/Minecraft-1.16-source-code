/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ public class bff
/*    */   implements brj
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public int a(aag ☃, boolean bool1, boolean bool2) {
/* 30 */     if (!bool2 || !☃.V().b(brt.d)) {
/* 31 */       return 0;
/*    */     }
/*    */     
/* 34 */     this.a--;
/* 35 */     if (this.a > 0) {
/* 36 */       return 0;
/*    */     }
/*    */     
/* 39 */     this.a = 1200;
/*    */     
/* 41 */     bfw bfw = ☃.q_();
/* 42 */     if (bfw == null) {
/* 43 */       return 0;
/*    */     }
/*    */     
/* 46 */     Random random = ☃.t;
/* 47 */     int i = (8 + random.nextInt(24)) * (random.nextBoolean() ? -1 : 1);
/* 48 */     int j = (8 + random.nextInt(24)) * (random.nextBoolean() ? -1 : 1);
/* 49 */     fx fx = bfw.cB().b(i, 0, j);
/*    */     
/* 51 */     if (!☃.a(fx.u() - 10, fx.v() - 10, fx.w() - 10, fx.u() + 10, fx.v() + 10, fx.w() + 10)) {
/* 52 */       return 0;
/*    */     }
/*    */     
/* 55 */     if (bsg.a(ard.c.a, ☃, fx, aqe.h)) {
/* 56 */       if (☃.a(fx, 2)) {
/* 57 */         return a(☃, fx);
/*    */       }
/*    */       
/* 60 */       if (☃.a().a(fx, true, cla.j).e()) {
/* 61 */         return b(☃, fx);
/*    */       }
/*    */     } 
/*    */     
/* 65 */     return 0;
/*    */   }
/*    */   
/*    */   private int a(aag ☃, fx fx1) {
/* 69 */     int i = 48;
/* 70 */     if (☃.y().a(azr.r.c(), fx1, 48, azo.b.b) > 4L) {
/* 71 */       List<bab> list = ☃.a(bab.class, (new dci(fx1)).c(48.0D, 8.0D, 48.0D));
/* 72 */       if (list.size() < 5) {
/* 73 */         return a(fx1, ☃);
/*    */       }
/*    */     } 
/* 76 */     return 0;
/*    */   }
/*    */   
/*    */   private int b(aag ☃, fx fx1) {
/* 80 */     int i = 16;
/* 81 */     List<bab> list = ☃.a(bab.class, (new dci(fx1)).c(16.0D, 8.0D, 16.0D));
/* 82 */     if (list.size() < 1) {
/* 83 */       return a(fx1, ☃);
/*    */     }
/*    */     
/* 86 */     return 0;
/*    */   }
/*    */   
/*    */   private int a(fx ☃, aag aag1) {
/* 90 */     bab bab = aqe.h.a(aag1);
/* 91 */     if (bab == null) {
/* 92 */       return 0;
/*    */     }
/*    */     
/* 95 */     bab.a(aag1, aag1.d(☃), aqp.a, (arc)null, (md)null);
/* 96 */     bab.a(☃, 0.0F, 0.0F);
/* 97 */     aag1.l(bab);
/* 98 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */