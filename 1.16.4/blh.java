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
/*    */ public class blh
/*    */   extends blx
/*    */ {
/*    */   public blh(blx.a ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(boa ☃) {
/* 24 */     brx brx = ☃.p();
/* 25 */     fx fx1 = ☃.a();
/*    */     
/* 27 */     ceh ceh = brx.d_(fx1);
/* 28 */     if (!ceh.a(bup.bK) && !ceh.a(bup.z)) {
/* 29 */       return aou.d;
/*    */     }
/*    */     
/* 32 */     fx fx2 = fx1.b();
/* 33 */     if (!brx.w(fx2)) {
/* 34 */       return aou.d;
/*    */     }
/*    */     
/* 37 */     double d1 = fx2.u();
/* 38 */     double d2 = fx2.v();
/* 39 */     double d3 = fx2.w();
/*    */     
/* 41 */     List<aqa> list = brx.a((aqa)null, new dci(d1, d2, d3, d1 + 1.0D, d2 + 2.0D, d3 + 1.0D));
/* 42 */     if (!list.isEmpty()) {
/* 43 */       return aou.d;
/*    */     }
/*    */     
/* 46 */     if (brx instanceof aag) {
/* 47 */       bbq bbq = new bbq(brx, d1 + 0.5D, d2, d3 + 0.5D);
/* 48 */       bbq.a(false);
/* 49 */       brx.c(bbq);
/*    */       
/* 51 */       chg chg = ((aag)brx).D();
/*    */       
/* 53 */       if (chg != null) {
/* 54 */         chg.e();
/*    */       }
/*    */     } 
/* 57 */     ☃.m().g(1);
/* 58 */     return aou.a(brx.v);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean e(bmb ☃) {
/* 63 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */