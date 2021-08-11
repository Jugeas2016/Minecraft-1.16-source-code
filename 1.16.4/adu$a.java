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
/*    */ final class a
/*    */ {
/*    */   private boolean a;
/*    */   private boolean b;
/*    */   
/*    */   public a(boolean ☃, boolean bool1) {
/* 26 */     this.a = ☃;
/* 27 */     this.b = bool1;
/*    */   }
/*    */   
/*    */   public a a() {
/* 31 */     return new a(this.a, this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 36 */     if (this == ☃) {
/* 37 */       return true;
/*    */     }
/*    */     
/* 40 */     if (☃ instanceof a) {
/* 41 */       a a1 = (a)☃;
/* 42 */       return (this.a == a1.a && this.b == a1.b);
/*    */     } 
/* 44 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 49 */     int ☃ = this.a ? 1 : 0;
/* 50 */     ☃ = 31 * ☃ + (this.b ? 1 : 0);
/* 51 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 56 */     return "[open=" + this.a + ", filtering=" + this.b + ']';
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */