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
/*    */ 
/*    */ 
/*    */ public class bzi
/*    */   extends bvy
/*    */ {
/* 24 */   public static final cey a = cex.s;
/* 25 */   public static final cfg d = cex.am;
/*    */   
/*    */   protected bzi(ceg.c ☃) {
/* 28 */     super(☃);
/* 29 */     j(((ceh)this.n.b()).a(aq, gc.c).a(d, Integer.valueOf(1)).a(a, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 34 */     if (!bfw1.bC.e) {
/* 35 */       return aou.c;
/*    */     }
/*    */     
/* 38 */     brx1.a(fx1, ☃.a(d), 3);
/* 39 */     return aou.a(brx1.v);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int g(ceh ☃) {
/* 44 */     return ((Integer)☃.c(d)).intValue() * 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 49 */     ceh ceh = super.a(☃);
/* 50 */     return ceh.a(a, Boolean.valueOf(a(☃.p(), ☃.a(), ceh)));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 56 */     if (!bry1.s_() && gc1.n() != ((gc)☃.c(aq)).n()) {
/* 57 */       return ☃.a(a, Boolean.valueOf(a(bry1, fx1, ☃)));
/*    */     }
/* 59 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brz ☃, fx fx1, ceh ceh1) {
/* 64 */     return (b(☃, fx1, ceh1) > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean h(ceh ☃) {
/* 69 */     return l(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 74 */     if (!((Boolean)☃.c(c)).booleanValue()) {
/*    */       return;
/*    */     }
/* 77 */     gc gc = (gc)☃.c(aq);
/*    */     
/* 79 */     double d1 = fx1.u() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D;
/* 80 */     double d2 = fx1.v() + 0.4D + (random.nextDouble() - 0.5D) * 0.2D;
/* 81 */     double d3 = fx1.w() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D;
/*    */     
/* 83 */     float f = -5.0F;
/* 84 */     if (random.nextBoolean()) {
/* 85 */       f = (((Integer)☃.c(d)).intValue() * 2 - 1);
/*    */     }
/* 87 */     f /= 16.0F;
/*    */     
/* 89 */     double d4 = (f * gc.i());
/* 90 */     double d5 = (f * gc.k());
/*    */     
/* 92 */     brx1.a(hd.a, d1 + d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 97 */     ☃.a((cfj<?>[])new cfj[] { aq, d, a, c });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */