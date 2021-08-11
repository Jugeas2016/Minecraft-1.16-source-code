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
/*    */ 
/*    */ public class chu
/*    */   implements brj
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public int a(aag ☃, boolean bool1, boolean bool2) {
/* 30 */     if (!bool1) {
/* 31 */       return 0;
/*    */     }
/*    */     
/* 34 */     if (!☃.V().b(brt.y)) {
/* 35 */       return 0;
/*    */     }
/*    */     
/* 38 */     Random random = ☃.t;
/*    */     
/* 40 */     this.a--;
/* 41 */     if (this.a > 0) {
/* 42 */       return 0;
/*    */     }
/* 44 */     this.a += (60 + random.nextInt(60)) * 20;
/*    */     
/* 46 */     if (☃.c() < 5 && ☃.k().b()) {
/* 47 */       return 0;
/*    */     }
/*    */     
/* 50 */     int i = 0;
/* 51 */     for (bfw bfw : ☃.x()) {
/* 52 */       if (bfw.a_()) {
/*    */         continue;
/*    */       }
/* 55 */       fx fx1 = bfw.cB();
/* 56 */       if (☃.k().b() && (fx1.v() < ☃.t_() || !☃.e(fx1))) {
/*    */         continue;
/*    */       }
/* 59 */       aos aos = ☃.d(fx1);
/* 60 */       if (!aos.a(random.nextFloat() * 3.0F)) {
/*    */         continue;
/*    */       }
/*    */       
/* 64 */       adw adw = ((aah)bfw).A();
/* 65 */       int j = afm.a(adw.a(aea.i.b(aea.m)), 1, 2147483647);
/* 66 */       int k = 24000;
/* 67 */       if (random.nextInt(j) < 72000) {
/*    */         continue;
/*    */       }
/*    */       
/* 71 */       fx fx2 = fx1.b(20 + random.nextInt(15)).g(-10 + random.nextInt(21)).e(-10 + random.nextInt(21));
/* 72 */       ceh ceh = ☃.d_(fx2);
/* 73 */       cux cux = ☃.b(fx2);
/* 74 */       if (!bsg.a(☃, fx2, ceh, cux, aqe.ag)) {
/*    */         continue;
/*    */       }
/*    */       
/* 78 */       arc arc = null;
/* 79 */       int m = 1 + random.nextInt(aos.a().a() + 1);
/* 80 */       for (int n = 0; n < m; n++) {
/* 81 */         bds bds = aqe.ag.a(☃);
/* 82 */         bds.a(fx2, 0.0F, 0.0F);
/* 83 */         arc = bds.a(☃, aos, aqp.a, arc, (md)null);
/* 84 */         ☃.l(bds);
/*    */       } 
/* 86 */       i += m;
/*    */     } 
/*    */     
/* 89 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */