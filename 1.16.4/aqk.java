/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface aqk
/*    */ {
/*    */   boolean O_();
/*    */   
/*    */   void a_(dcn paramdcn);
/*    */   
/*    */   float N_();
/*    */   
/*    */   default boolean a(aqn ☃, aqj aqj1, dcn dcn1) {
/* 14 */     if (!☃.aX()) {
/* 15 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 19 */     aqa aqa = ☃.cn().isEmpty() ? null : ☃.cn().get(0);
/* 20 */     if (!☃.bs() || !☃.er() || !(aqa instanceof bfw)) {
/* 21 */       ☃.G = 0.5F;
/* 22 */       ☃.aE = 0.02F;
/* 23 */       a_(dcn1);
/* 24 */       return false;
/*    */     } 
/*    */     
/* 27 */     ☃.p = aqa.p;
/* 28 */     ☃.r = ☃.p;
/* 29 */     ☃.q = aqa.q * 0.5F;
/* 30 */     ☃.a(☃.p, ☃.q);
/* 31 */     ☃.aA = ☃.p;
/* 32 */     ☃.aC = ☃.p;
/*    */     
/* 34 */     ☃.G = 1.0F;
/* 35 */     ☃.aE = ☃.dN() * 0.1F;
/*    */     
/* 37 */     if (aqj1.a && 
/* 38 */       aqj1.b++ > aqj1.c) {
/* 39 */       aqj1.a = false;
/*    */     }
/*    */ 
/*    */     
/* 43 */     if (☃.cs()) {
/* 44 */       float f = N_();
/* 45 */       if (aqj1.a) {
/* 46 */         f += f * 1.15F * afm.a(aqj1.b / aqj1.c * 3.1415927F);
/*    */       }
/* 48 */       ☃.q(f);
/* 49 */       a_(new dcn(0.0D, 0.0D, 1.0D));
/* 50 */       ☃.aU = 0;
/*    */     } else {
/* 52 */       ☃.a(☃, false);
/* 53 */       ☃.f(dcn.a);
/*    */     } 
/* 55 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */