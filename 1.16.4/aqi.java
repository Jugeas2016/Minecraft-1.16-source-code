/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum aqi
/*    */ {
/*  7 */   a(new of("options.mainHand.left")),
/*  8 */   b(new of("options.mainHand.right"));
/*    */   
/*    */   private final nr c;
/*    */ 
/*    */   
/*    */   aqi(nr ☃) {
/* 14 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public aqi a() {
/* 18 */     if (this == a) {
/* 19 */       return b;
/*    */     }
/* 21 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 26 */     return this.c.getString();
/*    */   }
/*    */   
/*    */   public nr b() {
/* 30 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */