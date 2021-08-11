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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bxr
/*    */   extends buo
/*    */   implements bwm
/*    */ {
/* 24 */   public static final cfe<ge> a = cex.P;
/*    */   
/*    */   protected bxr(ceg.c ☃) {
/* 27 */     super(☃);
/* 28 */     j(((ceh)this.n.b()).a(a, ge.k));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 33 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, bzm bzm1) {
/* 38 */     return ☃.a(a, bzm1.a().a((ge)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, byg byg1) {
/* 43 */     return ☃.a(a, byg1.a().a((ge)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 48 */     gc gc2, gc1 = ☃.j();
/*    */     
/* 50 */     if (gc1.n() == gc.a.b) {
/* 51 */       gc2 = ☃.f().f();
/*    */     } else {
/* 53 */       gc2 = gc.b;
/*    */     } 
/*    */     
/* 56 */     return n().a(a, ge.a(gc1, gc2));
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ccj a(brc ☃) {
/* 62 */     return new ccz();
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 67 */     ccj ccj = brx1.c(fx1);
/* 68 */     if (ccj instanceof ccz && bfw1.eV()) {
/* 69 */       bfw1.a((ccz)ccj);
/* 70 */       return aou.a(brx1.v);
/*    */     } 
/*    */ 
/*    */     
/* 74 */     return aou.c;
/*    */   }
/*    */   
/*    */   public static boolean a(ctb.c ☃, ctb.c c1) {
/* 78 */     gc gc1 = h(☃.b);
/* 79 */     gc gc2 = h(c1.b);
/* 80 */     gc gc3 = l(☃.b);
/* 81 */     gc gc4 = l(c1.b);
/*    */ 
/*    */ 
/*    */     
/* 85 */     ccz.a a = ccz.a.a(☃.c.l("joint")).orElseGet(() -> ☃.n().d() ? ccz.a.b : ccz.a.a);
/* 86 */     boolean bool = (a == ccz.a.a);
/*    */     
/* 88 */     return (gc1 == gc2.f() && (bool || gc3 == gc4) && ☃.c
/*    */       
/* 90 */       .l("target").equals(c1.c.l("name")));
/*    */   }
/*    */   
/*    */   public static gc h(ceh ☃) {
/* 94 */     return ((ge)☃.c(a)).b();
/*    */   }
/*    */   
/*    */   public static gc l(ceh ☃) {
/* 98 */     return ((ge)☃.c(a)).c();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */