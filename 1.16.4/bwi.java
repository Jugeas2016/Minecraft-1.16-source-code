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
/*    */ public class bwi
/*    */   extends bud
/*    */ {
/* 23 */   protected static final ddh a = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
/*    */   
/*    */   protected bwi(ceg.c ☃) {
/* 26 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ccj a(brc ☃) {
/* 31 */     return new cdl();
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 36 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/* 41 */     if (brx1 instanceof aag && !aqa1.br() && !aqa1.bs() && aqa1.bO() && 
/* 42 */       dde.c(dde.a(aqa1.cc().d(-fx1.u(), -fx1.v(), -fx1.w())), ☃.j(brx1, fx1), dcr.i)) {
/* 43 */       vj<brx> vj = (brx1.Y() == brx.i) ? brx.g : brx.i;
/* 44 */       aag aag = ((aag)brx1).l().a(vj);
/* 45 */       if (aag == null) {
/*    */         return;
/*    */       }
/* 48 */       aqa1.b(aag);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 55 */     double d1 = fx1.u() + random.nextDouble();
/* 56 */     double d2 = fx1.v() + 0.8D;
/* 57 */     double d3 = fx1.w() + random.nextDouble();
/*    */     
/* 59 */     brx1.a(hh.S, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 64 */     return bmb.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, cuw cuw1) {
/* 69 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */