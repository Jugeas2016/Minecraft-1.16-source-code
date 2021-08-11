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
/*    */ public class bwo
/*    */   extends buo
/*    */ {
/*    */   public bwo(ceg.c ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 26 */     brx1.J().a(fx1, this, c());
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 31 */     bry1.J().a(fx1, this, c());
/*    */     
/* 33 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 38 */     if (!h(aag1.d_(fx1.c())) || fx1.v() < 0) {
/*    */       return;
/*    */     }
/*    */ 
/*    */     
/* 43 */     bcu bcu = new bcu(aag1, fx1.u() + 0.5D, fx1.v(), fx1.w() + 0.5D, aag1.d_(fx1));
/* 44 */     a(bcu);
/* 45 */     aag1.c(bcu);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bcu ☃) {}
/*    */   
/*    */   protected int c() {
/* 52 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean h(ceh ☃) {
/* 57 */     cva cva = ☃.c();
/* 58 */     return (☃.g() || ☃.a(aed.an) || cva.a() || cva.e());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brx ☃, fx fx1, ceh ceh1, ceh ceh2, bcu bcu1) {}
/*    */ 
/*    */   
/*    */   public void a(brx ☃, fx fx1, bcu bcu1) {}
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 69 */     if (random.nextInt(16) == 0) {
/* 70 */       fx fx2 = fx1.c();
/*    */       
/* 72 */       if (h(brx1.d_(fx2))) {
/* 73 */         double d1 = fx1.u() + random.nextDouble();
/* 74 */         double d2 = fx1.v() - 0.05D;
/* 75 */         double d3 = fx1.w() + random.nextDouble();
/*    */         
/* 77 */         brx1.a(new hc(hh.x, ☃), d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public int c(ceh ☃, brc brc1, fx fx1) {
/* 83 */     return -16777216;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */