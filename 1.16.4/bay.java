/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bay
/*    */   extends aqu
/*    */ {
/*    */   protected bay(aqe<? extends bay> ☃, brx brx1) {
/* 14 */     super((aqe)☃, brx1);
/*    */     
/* 16 */     a(cwz.h, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean cM() {
/* 21 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public aqq dC() {
/* 26 */     return aqq.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brz ☃) {
/* 31 */     return ☃.j(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public int D() {
/* 36 */     return 120;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int d(bfw ☃) {
/* 41 */     return 1 + this.l.t.nextInt(3);
/*    */   }
/*    */   
/*    */   protected void a(int ☃) {
/* 45 */     if (aX() && !aH()) {
/* 46 */       j(☃ - 1);
/* 47 */       if (bI() == -20) {
/* 48 */         j(0);
/* 49 */         a(apk.h, 2.0F);
/*    */       } 
/*    */     } else {
/* 52 */       j(300);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void ag() {
/* 58 */     int ☃ = bI();
/* 59 */     super.ag();
/* 60 */     a(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean bV() {
/* 66 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bfw ☃) {
/* 71 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */