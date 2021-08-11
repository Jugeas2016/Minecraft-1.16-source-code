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
/*    */ 
/*    */ public class bwn
/*    */   extends bxm
/*    */ {
/* 16 */   public static final cfe<cet> u = cex.Q;
/*    */   
/*    */   protected bwn(ceg.c ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 24 */     return b(brz1, fx1, h(☃).f());
/*    */   }
/*    */   
/*    */   public static boolean b(brz ☃, fx fx1, gc gc1) {
/* 28 */     fx fx2 = fx1.a(gc1);
/* 29 */     return ☃.d_(fx2).d(☃, fx2, gc1.f());
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ceh a(bny ☃) {
/* 35 */     for (gc gc : ☃.e()) {
/*    */       ceh ceh;
/* 37 */       if (gc.n() == gc.a.b) {
/* 38 */         ceh = n().a(u, (gc == gc.b) ? cet.c : cet.a).a(aq, ☃.f());
/*    */       } else {
/* 40 */         ceh = n().a(u, cet.b).a(aq, gc.f());
/*    */       } 
/*    */       
/* 43 */       if (ceh.a(☃.p(), ☃.a())) {
/* 44 */         return ceh;
/*    */       }
/*    */     } 
/*    */     
/* 48 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 53 */     if (h(☃).f() == gc1 && !☃.a(bry1, fx1)) {
/* 54 */       return bup.a.n();
/*    */     }
/* 56 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */   
/*    */   protected static gc h(ceh ☃) {
/* 60 */     switch (null.a[((cet)☃.c(u)).ordinal()]) {
/*    */       case 1:
/* 62 */         return gc.a;
/*    */       case 2:
/* 64 */         return gc.b;
/*    */     } 
/* 66 */     return (gc)☃.c(aq);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */