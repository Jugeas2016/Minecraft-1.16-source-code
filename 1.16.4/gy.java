/*    */ import java.util.List;
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
/*    */ public class gy
/*    */   extends gx
/*    */ {
/*    */   protected bmb a(fy ☃, bmb bmb1) {
/* 25 */     brx brx = ☃.h();
/* 26 */     if (!brx.s_()) {
/* 27 */       fx fx = ☃.d().a((gc)☃.e().c(bwa.a));
/*    */       
/* 29 */       a((a((aag)brx, fx) || b((aag)brx, fx)));
/* 30 */       if (a() && bmb1.a(1, brx.u_(), (aah)null)) {
/* 31 */         bmb1.e(0);
/*    */       }
/*    */     } 
/* 34 */     return bmb1;
/*    */   }
/*    */   
/*    */   private static boolean a(aag ☃, fx fx1) {
/* 38 */     ceh ceh = ☃.d_(fx1);
/* 39 */     if (ceh.a(aed.aj)) {
/* 40 */       int i = ((Integer)ceh.c(buk.b)).intValue();
/*    */       
/* 42 */       if (i >= 5) {
/* 43 */         ☃.a((bfw)null, fx1, adq.aH, adr.e, 1.0F, 1.0F);
/*    */         
/* 45 */         buk.a(☃, fx1);
/* 46 */         ((buk)ceh.b()).a(☃, ceh, fx1, null, ccg.b.b);
/* 47 */         return true;
/*    */       } 
/*    */     } 
/* 50 */     return false;
/*    */   }
/*    */   
/*    */   private static boolean b(aag ☃, fx fx1) {
/* 54 */     List<aqm> list = (List)☃.a((Class)aqm.class, new dci(fx1), aqd.g);
/* 55 */     for (aqm aqm : list) {
/* 56 */       if (aqm instanceof arb) {
/* 57 */         arb arb = (arb)aqm;
/*    */         
/* 59 */         if (arb.K_()) {
/* 60 */           arb.a(adr.e);
/* 61 */           return true;
/*    */         } 
/*    */       } 
/*    */     } 
/* 65 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */