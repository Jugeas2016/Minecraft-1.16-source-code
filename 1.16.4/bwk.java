/*    */ import java.util.Random;
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
/*    */ public class bwk
/*    */   extends bvz
/*    */ {
/* 22 */   protected static final ddh b = buo.a(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D);
/* 23 */   protected static final ddh c = buo.a(6.0D, 6.0D, 0.0D, 10.0D, 10.0D, 16.0D);
/* 24 */   protected static final ddh d = buo.a(0.0D, 6.0D, 6.0D, 16.0D, 10.0D, 10.0D);
/*    */   
/*    */   protected bwk(ceg.c ☃) {
/* 27 */     super(☃);
/* 28 */     j(((ceh)this.n.b()).a(a, gc.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, bzm bzm1) {
/* 33 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, byg byg1) {
/* 38 */     return ☃.a(a, byg1.b((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 43 */     switch (null.a[((gc)☃.c(a)).n().ordinal()])
/*    */     
/*    */     { default:
/* 46 */         return d;
/*    */       case 2:
/* 48 */         return c;
/*    */       case 3:
/* 50 */         break; }  return b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 57 */     gc gc = ☃.j();
/*    */     
/* 59 */     ceh ceh = ☃.p().d_(☃.a().a(gc.f()));
/* 60 */     if (ceh.a(this) && ceh.c(a) == gc) {
/* 61 */       return n().a(a, gc.f());
/*    */     }
/*    */     
/* 64 */     return n().a(a, gc);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 69 */     gc gc = (gc)☃.c(a);
/* 70 */     double d1 = fx1.u() + 0.55D - (random.nextFloat() * 0.1F);
/* 71 */     double d2 = fx1.v() + 0.55D - (random.nextFloat() * 0.1F);
/* 72 */     double d3 = fx1.w() + 0.55D - (random.nextFloat() * 0.1F);
/* 73 */     double d4 = (0.4F - (random.nextFloat() + random.nextFloat()) * 0.4F);
/*    */     
/* 75 */     if (random.nextInt(5) == 0) {
/* 76 */       brx1.a(hh.t, d1 + gc.i() * d4, d2 + gc.j() * d4, d3 + gc.k() * d4, random.nextGaussian() * 0.005D, random.nextGaussian() * 0.005D, random.nextGaussian() * 0.005D);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 82 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ 
/*    */   
/*    */   public cvc f(ceh ☃) {
/* 87 */     return cvc.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 92 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */