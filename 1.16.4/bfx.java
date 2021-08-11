/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum bfx
/*    */ {
/*  7 */   a(0, "cape"),
/*  8 */   b(1, "jacket"),
/*  9 */   c(2, "left_sleeve"),
/* 10 */   d(3, "right_sleeve"),
/* 11 */   e(4, "left_pants_leg"),
/* 12 */   f(5, "right_pants_leg"),
/* 13 */   g(6, "hat");
/*    */   
/*    */   private final int h;
/*    */   
/*    */   private final int i;
/*    */   private final String j;
/*    */   private final nr k;
/*    */   
/*    */   bfx(int ☃, String str1) {
/* 22 */     this.h = ☃;
/* 23 */     this.i = 1 << ☃;
/* 24 */     this.j = str1;
/* 25 */     this.k = new of("options.modelPart." + str1);
/*    */   }
/*    */   
/*    */   public int a() {
/* 29 */     return this.i;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String c() {
/* 37 */     return this.j;
/*    */   }
/*    */   
/*    */   public nr d() {
/* 41 */     return this.k;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */