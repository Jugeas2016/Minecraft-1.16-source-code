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
/*    */ public interface beo
/*    */ {
/*    */   int eM();
/*    */   
/*    */   static boolean a(aqm ☃, aqm aqm1) {
/* 17 */     float f1, f2 = (float)☃.b(arl.f);
/* 18 */     if (!☃.w_() && (int)f2 > 0) {
/* 19 */       f1 = f2 / 2.0F + ☃.l.t.nextInt((int)f2);
/*    */     } else {
/* 21 */       f1 = f2;
/*    */     } 
/*    */     
/* 24 */     boolean bool = aqm1.a(apk.c(☃), f1);
/* 25 */     if (bool) {
/* 26 */       ☃.a(☃, aqm1);
/* 27 */       if (!☃.w_()) {
/* 28 */         b(☃, aqm1);
/*    */       }
/*    */     } 
/* 31 */     return bool;
/*    */   }
/*    */   
/*    */   static void b(aqm ☃, aqm aqm1) {
/* 35 */     double d1 = ☃.b(arl.g);
/* 36 */     double d2 = aqm1.b(arl.c);
/* 37 */     double d3 = d1 - d2;
/* 38 */     if (d3 <= 0.0D) {
/*    */       return;
/*    */     }
/*    */     
/* 42 */     double d4 = aqm1.cD() - ☃.cD();
/* 43 */     double d5 = aqm1.cH() - ☃.cH();
/* 44 */     float f = (☃.l.t.nextInt(21) - 10);
/* 45 */     double d6 = d3 * (☃.l.t.nextFloat() * 0.5F + 0.2F);
/* 46 */     dcn dcn = (new dcn(d4, 0.0D, d5)).d().a(d6).b(f);
/*    */     
/* 48 */     double d7 = d3 * ☃.l.t.nextFloat() * 0.5D;
/* 49 */     aqm1.i(dcn.b, d7, dcn.d);
/* 50 */     aqm1.w = true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\beo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */