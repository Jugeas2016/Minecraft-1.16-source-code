/*    */ 
/*    */ 
/*    */ public class zq
/*    */   implements Comparable<zq>
/*    */ {
/*    */   private final int a;
/*    */   private final fx b;
/*    */   private int c;
/*    */   private int d;
/*    */   
/*    */   public zq(int ☃, fx fx1) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = fx1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public fx b() {
/* 21 */     return this.b;
/*    */   }
/*    */   
/*    */   public void a(int ☃) {
/* 25 */     if (☃ > 10) {
/* 26 */       ☃ = 10;
/*    */     }
/* 28 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public int c() {
/* 32 */     return this.c;
/*    */   }
/*    */   
/*    */   public void b(int ☃) {
/* 36 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public int d() {
/* 40 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 45 */     if (this == ☃) {
/* 46 */       return true;
/*    */     }
/* 48 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 49 */       return false;
/*    */     }
/* 51 */     zq zq1 = (zq)☃;
/* 52 */     return (this.a == zq1.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 57 */     return Integer.hashCode(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(zq ☃) {
/* 62 */     if (this.c != ☃.c) {
/* 63 */       return Integer.compare(this.c, ☃.c);
/*    */     }
/* 65 */     return Integer.compare(this.a, ☃.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */