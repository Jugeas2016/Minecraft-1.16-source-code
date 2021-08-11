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
/*    */ public class bvd
/*    */   extends bzl
/*    */   implements bzu
/*    */ {
/* 21 */   public static final cey a = cex.C;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 26 */   protected static final ddh b = buo.a(6.5D, 0.0D, 6.5D, 9.5D, 16.0D, 9.5D);
/* 27 */   protected static final ddh c = buo.a(6.5D, 6.5D, 0.0D, 9.5D, 9.5D, 16.0D);
/* 28 */   protected static final ddh d = buo.a(0.0D, 6.5D, 6.5D, 16.0D, 9.5D, 9.5D);
/*    */   
/*    */   public bvd(ceg.c ☃) {
/* 31 */     super(☃);
/* 32 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(false)).a(e, gc.a.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 37 */     switch (null.a[((gc.a)☃.c(e)).ordinal()])
/*    */     
/*    */     { default:
/* 40 */         return d;
/*    */       case 2:
/* 42 */         return c;
/*    */       case 3:
/* 44 */         break; }  return b;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ceh a(bny ☃) {
/* 51 */     cux cux = ☃.p().b(☃.a());
/* 52 */     boolean bool = (cux.a() == cuy.c);
/* 53 */     return super.a(☃).a(a, Boolean.valueOf(bool));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 58 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 59 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*    */     }
/* 61 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 66 */     ☃.a((cfj<?>[])new cfj[] { a }).a((cfj<?>[])new cfj[] { e });
/*    */   }
/*    */ 
/*    */   
/*    */   public cux d(ceh ☃) {
/* 71 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 72 */       return cuy.c.a(false);
/*    */     }
/* 74 */     return super.d(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 79 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */