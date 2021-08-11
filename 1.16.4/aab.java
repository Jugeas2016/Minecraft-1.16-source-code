/*    */ import javax.annotation.Nullable;
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
/*    */ public class aab
/*    */ {
/*    */   @Nullable
/*    */   protected static fx a(aag ☃, int i, int j, boolean bool) {
/* 16 */     fx.a a = new fx.a(i, 0, j);
/* 17 */     bsv bsv = ☃.v(a);
/*    */     
/* 19 */     boolean bool1 = ☃.k().c();
/*    */     
/* 21 */     ceh ceh = bsv.e().e().a();
/* 22 */     if (bool && !ceh.b().a(aed.V)) {
/* 23 */       return null;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 28 */     cgh cgh = ☃.d(i >> 4, j >> 4);
/* 29 */     int k = bool1 ? ☃.i().g().c() : cgh.a(chn.a.e, i & 0xF, j & 0xF);
/*    */ 
/*    */     
/* 32 */     if (k < 0) {
/* 33 */       return null;
/*    */     }
/*    */ 
/*    */     
/* 37 */     int m = cgh.a(chn.a.b, i & 0xF, j & 0xF);
/* 38 */     if (m <= k && m > cgh.a(chn.a.d, i & 0xF, j & 0xF)) {
/* 39 */       return null;
/*    */     }
/*    */     
/* 42 */     for (int n = k + 1; n >= 0; n--) {
/* 43 */       a.d(i, n, j);
/* 44 */       ceh ceh1 = ☃.d_(a);
/*    */ 
/*    */       
/* 47 */       if (!ceh1.m().c()) {
/*    */         break;
/*    */       }
/*    */       
/* 51 */       if (ceh1.equals(ceh)) {
/* 52 */         return a.b().h();
/*    */       }
/*    */     } 
/* 55 */     return null;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static fx a(aag ☃, brd brd1, boolean bool) {
/* 60 */     for (int i = brd1.d(); i <= brd1.f(); i++) {
/* 61 */       for (int j = brd1.e(); j <= brd1.g(); j++) {
/* 62 */         fx fx = a(☃, i, j, bool);
/* 63 */         if (fx != null) {
/* 64 */           return fx;
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 69 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */