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
/*    */ public class afh
/*    */ {
/*    */   private final int a;
/*    */   private final int b;
/*    */   
/*    */   public afh(int ☃, int i) {
/* 22 */     if (i < ☃) {
/* 23 */       throw new IllegalArgumentException("max must be >= minInclusive! Given minInclusive: " + ☃ + ", Given max: " + i);
/*    */     }
/* 25 */     this.a = ☃;
/* 26 */     this.b = i;
/*    */   }
/*    */   
/*    */   public static afh a(int ☃, int i) {
/* 30 */     return new afh(☃, i);
/*    */   }
/*    */   
/*    */   public int a(Random ☃) {
/* 34 */     if (this.a == this.b) {
/* 35 */       return this.a;
/*    */     }
/* 37 */     return ☃.nextInt(this.b - this.a + 1) + this.a;
/*    */   }
/*    */   
/*    */   public int a() {
/* 41 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 45 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 50 */     return "IntRange[" + this.a + "-" + this.b + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */