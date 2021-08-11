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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bvm
/*    */   extends bud
/*    */   implements bzu
/*    */ {
/* 28 */   public static final cey a = cex.C;
/*    */   
/* 30 */   protected static final ddh b = buo.a(5.0D, 5.0D, 5.0D, 11.0D, 11.0D, 11.0D);
/*    */   
/*    */   public bvm(ceg.c ☃) {
/* 33 */     super(☃);
/* 34 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(true)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 39 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ 
/*    */   
/*    */   public ccj a(brc ☃) {
/* 44 */     return new ccq();
/*    */   }
/*    */ 
/*    */   
/*    */   public bzh b(ceh ☃) {
/* 49 */     return bzh.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public cux d(ceh ☃) {
/* 54 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 55 */       return cuy.c.a(false);
/*    */     }
/*    */     
/* 58 */     return super.d(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 63 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 64 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*    */     }
/*    */     
/* 67 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 72 */     return b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brx ☃, fx fx1, ceh ceh1, @Nullable aqm aqm1, bmb bmb1) {
/* 77 */     if (bmb1.t()) {
/* 78 */       ccj ccj = ☃.c(fx1);
/* 79 */       if (ccj instanceof cce) {
/* 80 */         ((cce)ccj).a(bmb1.r());
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ceh a(bny ☃) {
/* 88 */     cux cux = ☃.p().b(☃.a());
/* 89 */     return n().a(a, Boolean.valueOf((cux.a(aef.b) && cux.e() == 8)));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 94 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */