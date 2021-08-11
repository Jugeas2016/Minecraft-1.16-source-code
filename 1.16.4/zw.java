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
/*    */ public class zw
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   
/*    */   public zw(int ☃, int i) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = i;
/*    */   }
/*    */   
/*    */   public zw(fx ☃) {
/* 22 */     this.a = ☃.u();
/* 23 */     this.b = ☃.w();
/*    */   }
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
/*    */   public String toString() {
/* 40 */     return "[" + this.a + ", " + this.b + "]";
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 45 */     int ☃ = 1664525 * this.a + 1013904223;
/* 46 */     int i = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
/* 47 */     return ☃ ^ i;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 52 */     if (this == ☃) {
/* 53 */       return true;
/*    */     }
/*    */     
/* 56 */     if (☃ instanceof zw) {
/* 57 */       zw zw1 = (zw)☃;
/* 58 */       return (this.a == zw1.a && this.b == zw1.b);
/*    */     } 
/*    */     
/* 61 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */