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
/*    */ 
/*    */ 
/*    */ 
/*    */ class e
/*    */   implements afb
/*    */ {
/*    */   private float b;
/*    */   private int c;
/*    */   
/*    */   public e(dkj paramdkj, float ☃) {
/* 68 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean accept(int ☃, ob ob1, int i) {
/* 73 */     this.b -= dkj.a(this.a).getWidth(i, ob1);
/* 74 */     if (this.b >= 0.0F) {
/* 75 */       this.c = ☃ + Character.charCount(i);
/* 76 */       return true;
/*    */     } 
/* 78 */     return false;
/*    */   }
/*    */   
/*    */   public int a() {
/* 82 */     return this.c;
/*    */   }
/*    */   
/*    */   public void b() {
/* 86 */     this.c = 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkj$e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */