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
/*    */ public class bvl
/*    */   extends bwo
/*    */ {
/*    */   private final ceh a;
/*    */   
/*    */   public bvl(buo ☃, ceg.c c1) {
/* 17 */     super(c1);
/* 18 */     this.a = ☃.n();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brx ☃, fx fx1, ceh ceh1, ceh ceh2, bcu bcu1) {
/* 23 */     if (b(☃, fx1, ceh2)) {
/* 24 */       ☃.a(fx1, this.a, 3);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 30 */     brc brc = ☃.p();
/* 31 */     fx fx = ☃.a();
/* 32 */     ceh ceh1 = brc.d_(fx);
/*    */     
/* 34 */     if (b(brc, fx, ceh1)) {
/* 35 */       return this.a;
/*    */     }
/* 37 */     return super.a(☃);
/*    */   }
/*    */   
/*    */   private static boolean b(brc ☃, fx fx1, ceh ceh1) {
/* 41 */     return (l(ceh1) || a(☃, fx1));
/*    */   }
/*    */   
/*    */   private static boolean a(brc ☃, fx fx1) {
/* 45 */     boolean bool = false;
/* 46 */     fx.a a = fx1.i();
/* 47 */     for (gc gc : gc.values()) {
/* 48 */       ceh ceh1 = ☃.d_(a);
/* 49 */       if (gc != gc.a || l(ceh1)) {
/*    */ 
/*    */         
/* 52 */         a.a(fx1, gc);
/* 53 */         ceh1 = ☃.d_(a);
/* 54 */         if (l(ceh1) && !ceh1.d(☃, fx1, gc.f())) {
/* 55 */           bool = true; break;
/*    */         } 
/*    */       } 
/*    */     } 
/* 59 */     return bool;
/*    */   }
/*    */   
/*    */   private static boolean l(ceh ☃) {
/* 63 */     return ☃.m().a(aef.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 68 */     if (a(bry1, fx1)) {
/* 69 */       return this.a;
/*    */     }
/*    */     
/* 72 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public int c(ceh ☃, brc brc1, fx fx1) {
/* 77 */     return (☃.d(brc1, fx1)).ai;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */