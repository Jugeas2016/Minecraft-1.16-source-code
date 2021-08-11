/*    */ import java.util.Random;
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
/*    */ public class bxo
/*    */   extends bxi
/*    */ {
/*    */   public bxo(ceg.c ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brx ☃, bfw bfw1, fx fx1, ceh ceh1, @Nullable ccj ccj1, bmb bmb1) {
/* 26 */     super.a(☃, bfw1, fx1, ceh1, ccj1, bmb1);
/*    */     
/* 28 */     if (bpu.a(bpw.u, bmb1) == 0) {
/* 29 */       if (☃.k().d()) {
/* 30 */         ☃.a(fx1, false);
/*    */         
/*    */         return;
/*    */       } 
/* 34 */       cva cva = ☃.d_(fx1.c()).c();
/* 35 */       if (cva.c() || cva.a()) {
/* 36 */         ☃.a(fx1, bup.A.n());
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 43 */     if (aag1.a(bsf.b, fx1) > 11 - ☃.b(aag1, fx1)) {
/* 44 */       d(☃, aag1, fx1);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void d(ceh ☃, brx brx1, fx fx1) {
/* 49 */     if (brx1.k().d()) {
/* 50 */       brx1.a(fx1, false);
/*    */       
/*    */       return;
/*    */     } 
/* 54 */     brx1.a(fx1, bup.A.n());
/* 55 */     brx1.a(fx1, bup.A, fx1);
/*    */   }
/*    */ 
/*    */   
/*    */   public cvc f(ceh ☃) {
/* 60 */     return cvc.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */