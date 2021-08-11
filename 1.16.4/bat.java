/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bat
/*    */   extends are
/*    */ {
/*    */   private int bq;
/*    */   
/*    */   protected bat(aqe<? extends bat> ☃, brx brx1) {
/* 15 */     super((aqe)☃, brx1);
/*    */   }
/*    */   
/*    */   public boolean d(aah ☃) {
/* 19 */     md md = new md();
/* 20 */     md.a("id", aW());
/* 21 */     e(md);
/*    */     
/* 23 */     if (☃.g(md)) {
/* 24 */       ad();
/* 25 */       return true;
/*    */     } 
/*    */     
/* 28 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void j() {
/* 33 */     this.bq++;
/* 34 */     super.j();
/*    */   }
/*    */   
/*    */   public boolean eY() {
/* 38 */     return (this.bq > 100);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */