/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class blr<T extends aqa & aqk>
/*    */   extends blx
/*    */ {
/*    */   private final aqe<T> a;
/*    */   private final int b;
/*    */   
/*    */   public blr(blx.a ☃, aqe<T> aqe1, int i) {
/* 17 */     super(☃);
/*    */     
/* 19 */     this.a = aqe1;
/* 20 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 25 */     bmb bmb = bfw1.b(aot1);
/* 26 */     if (☃.v) {
/* 27 */       return aov.c(bmb);
/*    */     }
/*    */     
/* 30 */     aqa aqa = bfw1.ct();
/*    */     
/* 32 */     if (bfw1.br() && aqa instanceof aqk && aqa.X() == this.a) {
/* 33 */       aqk aqk = (aqk)aqa;
/*    */       
/* 35 */       if (aqk.O_()) {
/* 36 */         bmb.a(this.b, bfw1, bfw1 -> bfw1.d(☃));
/* 37 */         if (bmb.a()) {
/* 38 */           bmb bmb1 = new bmb(bmd.mi);
/* 39 */           bmb1.c(bmb.o());
/* 40 */           return aov.a(bmb1);
/*    */         } 
/* 42 */         return aov.a(bmb);
/*    */       } 
/*    */     } 
/*    */     
/* 46 */     bfw1.b(aea.c.b(this));
/*    */     
/* 48 */     return aov.c(bmb);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */