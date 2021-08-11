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
/*    */ public class cbt
/*    */   extends buo
/*    */ {
/*    */   protected cbt(ceg.c ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 21 */     if (brx1.k().d()) {
/* 22 */       brx1.a(fx1, bup.an.n(), 3);
/* 23 */       brx1.c(2009, fx1, 0);
/* 24 */       brx1.a((bfw)null, fx1, adq.ej, adr.e, 1.0F, (1.0F + brx1.u_().nextFloat() * 0.2F) * 0.7F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 30 */     gc gc = gc.a(random);
/* 31 */     if (gc == gc.b) {
/*    */       return;
/*    */     }
/* 34 */     fx fx2 = fx1.a(gc);
/* 35 */     ceh ceh1 = brx1.d_(fx2);
/* 36 */     if (☃.l() && ceh1.d(brx1, fx2, gc.f())) {
/*    */       return;
/*    */     }
/*    */     
/* 40 */     double d1 = fx1.u();
/* 41 */     double d2 = fx1.v();
/* 42 */     double d3 = fx1.w();
/*    */ 
/*    */ 
/*    */     
/* 46 */     if (gc == gc.a) {
/* 47 */       d2 -= 0.05D;
/* 48 */       d1 += random.nextDouble();
/* 49 */       d3 += random.nextDouble();
/*    */     } else {
/* 51 */       d2 += random.nextDouble() * 0.8D;
/* 52 */       if (gc.n() == gc.a.a) {
/* 53 */         d3 += random.nextDouble();
/* 54 */         if (gc == gc.f) {
/* 55 */           d1 += 1.1D;
/*    */         } else {
/* 57 */           d1 += 0.05D;
/*    */         } 
/*    */       } else {
/* 60 */         d1 += random.nextDouble();
/* 61 */         if (gc == gc.d) {
/* 62 */           d3 += 1.1D;
/*    */         } else {
/* 64 */           d3 += 0.05D;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 69 */     brx1.a(hh.m, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */