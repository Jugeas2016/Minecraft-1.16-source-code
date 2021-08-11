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
/*    */ public class ecl
/*    */   extends ece<ced>
/*    */ {
/* 23 */   private final eax a = djz.C().ab();
/*    */   
/*    */   public ecl(ecd ☃) {
/* 26 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ced ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/* 31 */     brx brx = ☃.v();
/* 32 */     if (brx == null) {
/*    */       return;
/*    */     }
/* 35 */     fx fx = ☃.o().a(☃.j().f());
/* 36 */     ceh ceh = ☃.k();
/* 37 */     if (ceh.g()) {
/*    */       return;
/*    */     }
/*    */     
/* 41 */     eaz.a();
/* 42 */     dfm1.a();
/* 43 */     dfm1.a(☃.b(f), ☃.c(f), ☃.d(f));
/* 44 */     if (ceh.a(bup.aX) && ☃.a(f) <= 4.0F) {
/*    */       
/* 46 */       ceh = ceh.a(ceb.c, Boolean.valueOf((☃.a(f) <= 0.5F)));
/* 47 */       a(fx, ceh, dfm1, eag1, brx, false, j);
/* 48 */     } else if (☃.h() && !☃.d()) {
/*    */       
/* 50 */       cfi cfi = ceh.a(bup.aP) ? cfi.b : cfi.a;
/* 51 */       ceh ceh1 = bup.aX.n().a(ceb.b, cfi).a(ceb.a, ceh.c(cea.a));
/* 52 */       ceh1 = ceh1.a(ceb.c, Boolean.valueOf((☃.a(f) >= 0.5F)));
/* 53 */       a(fx, ceh1, dfm1, eag1, brx, false, j);
/*    */ 
/*    */       
/* 56 */       fx fx1 = fx.a(☃.j());
/* 57 */       dfm1.b();
/* 58 */       dfm1.a();
/* 59 */       ceh = ceh.a(cea.b, Boolean.valueOf(true));
/* 60 */       a(fx1, ceh, dfm1, eag1, brx, true, j);
/*    */     } else {
/* 62 */       a(fx, ceh, dfm1, eag1, brx, false, j);
/*    */     } 
/* 64 */     dfm1.b();
/* 65 */     eaz.b();
/*    */   }
/*    */   
/*    */   private void a(fx ☃, ceh ceh1, dfm dfm1, eag eag1, brx brx1, boolean bool, int i) {
/* 69 */     eao eao = eab.b(ceh1);
/* 70 */     dfq dfq = eag1.getBuffer(eao);
/*    */     
/* 72 */     this.a.b().a(brx1, this.a.a(ceh1), ceh1, ☃, dfm1, dfq, bool, new Random(), ceh1.a(☃), i);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */