/*    */ import java.util.List;
/*    */ import java.util.function.Predicate;
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
/*    */ public class bki
/*    */   extends blx
/*    */ {
/* 20 */   private static final Predicate<aqa> a = aqd.g.and(aqa::aT);
/*    */   
/*    */   private final bhn.b b;
/*    */   
/*    */   public bki(bhn.b ☃, blx.a a1) {
/* 25 */     super(a1);
/* 26 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 31 */     bmb bmb = bfw1.b(aot1);
/*    */     
/* 33 */     dcl dcl = a(☃, bfw1, brf.b.c);
/* 34 */     if (dcl.c() == dcl.a.a) {
/* 35 */       return aov.c(bmb);
/*    */     }
/*    */ 
/*    */     
/* 39 */     dcn dcn = bfw1.f(1.0F);
/* 40 */     double d = 5.0D;
/* 41 */     List<aqa> list = ☃.a(bfw1, bfw1.cc().b(dcn.a(5.0D)).g(1.0D), a);
/* 42 */     if (!list.isEmpty()) {
/* 43 */       dcn dcn1 = bfw1.j(1.0F);
/* 44 */       for (aqa aqa : list) {
/* 45 */         dci dci = aqa.cc().g(aqa.bg());
/* 46 */         if (dci.d(dcn1)) {
/* 47 */           return aov.c(bmb);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 52 */     if (dcl.c() == dcl.a.b) {
/* 53 */       bhn bhn = new bhn(☃, (dcl.e()).b, (dcl.e()).c, (dcl.e()).d);
/* 54 */       bhn.a(this.b);
/* 55 */       bhn.p = bfw1.p;
/* 56 */       if (!☃.a_(bhn, bhn.cc().g(-0.1D))) {
/* 57 */         return aov.d(bmb);
/*    */       }
/* 59 */       if (!☃.v) {
/* 60 */         ☃.c(bhn);
/* 61 */         if (!bfw1.bC.d) {
/* 62 */           bmb.g(1);
/*    */         }
/*    */       } 
/* 65 */       bfw1.b(aea.c.b(this));
/* 66 */       return aov.a(bmb, ☃.s_());
/*    */     } 
/*    */     
/* 69 */     return aov.c(bmb);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bki.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */