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
/*    */ public class bub
/*    */   extends buo
/*    */   implements bzu
/*    */ {
/* 22 */   public static final cey b = cex.C;
/* 23 */   private static final ddh a = buo.a(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D);
/*    */   
/*    */   protected bub(ceg.c ☃) {
/* 26 */     super(☃);
/* 27 */     j(((ceh)this.n.b()).a(b, Boolean.valueOf(true)));
/*    */   }
/*    */   
/*    */   protected void a(ceh ☃, bry bry1, fx fx1) {
/* 31 */     if (!c(☃, bry1, fx1)) {
/* 32 */       bry1.J().a(fx1, this, 60 + bry1.u_().nextInt(40));
/*    */     }
/*    */   }
/*    */   
/*    */   protected static boolean c(ceh ☃, brc brc1, fx fx1) {
/* 37 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 38 */       return true;
/*    */     }
/*    */     
/* 41 */     for (gc gc : gc.values()) {
/* 42 */       if (brc1.b(fx1.a(gc)).a(aef.b)) {
/* 43 */         return true;
/*    */       }
/*    */     } 
/* 46 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ceh a(bny ☃) {
/* 52 */     cux cux = ☃.p().b(☃.a());
/*    */     
/* 54 */     return n().a(b, Boolean.valueOf((cux.a(aef.b) && cux.e() == 8)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 59 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 64 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 65 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*    */     }
/*    */     
/* 68 */     if (gc1 == gc.a && !a(☃, bry1, fx1)) {
/* 69 */       return bup.a.n();
/*    */     }
/* 71 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 76 */     fx fx2 = fx1.c();
/* 77 */     return brz1.d_(fx2).d(brz1, fx2, gc.b);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 82 */     ☃.a((cfj<?>[])new cfj[] { b });
/*    */   }
/*    */ 
/*    */   
/*    */   public cux d(ceh ☃) {
/* 87 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 88 */       return cuy.c.a(false);
/*    */     }
/*    */     
/* 91 */     return super.d(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */