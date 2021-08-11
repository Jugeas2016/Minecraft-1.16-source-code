/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class auw
/*    */   extends ava
/*    */ {
/*    */   private final int h;
/*    */   
/*    */   public auw(aqn ☃, int i) {
/* 12 */     super(☃);
/* 13 */     this.h = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 18 */     if (this.d) {
/* 19 */       this.d = false;
/*    */       
/* 21 */       this.a.aC = a(this.a.aC, h() + 20.0F, this.b);
/* 22 */       this.a.q = a(this.a.q, g() + 10.0F, this.c);
/*    */     } else {
/* 24 */       if (this.a.x().m()) {
/* 25 */         this.a.q = a(this.a.q, 0.0F, 5.0F);
/*    */       }
/* 27 */       this.a.aC = a(this.a.aC, this.a.aA, this.b);
/*    */     } 
/*    */     
/* 30 */     float ☃ = afm.g(this.a.aC - this.a.aA);
/*    */ 
/*    */     
/* 33 */     if (☃ < -this.h) {
/* 34 */       this.a.aA -= 4.0F;
/* 35 */     } else if (☃ > this.h) {
/* 36 */       this.a.aA += 4.0F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\auw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */