/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class go
/*    */ {
/*    */   protected final float a;
/*    */   protected final float b;
/*    */   protected final float c;
/*    */   
/*    */   public go(float ☃, float f1, float f2) {
/* 13 */     this.a = (Float.isInfinite(☃) || Float.isNaN(☃)) ? 0.0F : (☃ % 360.0F);
/* 14 */     this.b = (Float.isInfinite(f1) || Float.isNaN(f1)) ? 0.0F : (f1 % 360.0F);
/* 15 */     this.c = (Float.isInfinite(f2) || Float.isNaN(f2)) ? 0.0F : (f2 % 360.0F);
/*    */   }
/*    */   
/*    */   public go(mj ☃) {
/* 19 */     this(☃.i(0), ☃.i(1), ☃.i(2));
/*    */   }
/*    */   
/*    */   public mj a() {
/* 23 */     mj ☃ = new mj();
/* 24 */     ☃.add(mg.a(this.a));
/* 25 */     ☃.add(mg.a(this.b));
/* 26 */     ☃.add(mg.a(this.c));
/* 27 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 32 */     if (!(☃ instanceof go)) {
/* 33 */       return false;
/*    */     }
/* 35 */     go go1 = (go)☃;
/* 36 */     return (this.a == go1.a && this.b == go1.b && this.c == go1.c);
/*    */   }
/*    */   
/*    */   public float b() {
/* 40 */     return this.a;
/*    */   }
/*    */   
/*    */   public float c() {
/* 44 */     return this.b;
/*    */   }
/*    */   
/*    */   public float d() {
/* 48 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\go.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */