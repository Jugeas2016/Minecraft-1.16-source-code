/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ga
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   private int f;
/*    */   private int g;
/*    */   private int h;
/*    */   private int i;
/*    */   private int j;
/*    */   private int k;
/*    */   
/*    */   public ga(int ☃, int i, int j, int k, int m, int n) {
/* 24 */     this.a = ☃;
/* 25 */     this.b = i;
/* 26 */     this.c = j;
/*    */     
/* 28 */     this.d = k - ☃ + 1;
/* 29 */     this.e = m - i + 1;
/* 30 */     this.f = n - j + 1;
/* 31 */     this.g = this.d * this.e * this.f;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 35 */     if (this.h == this.g) {
/* 36 */       return false;
/*    */     }
/*    */     
/* 39 */     this.i = this.h % this.d;
/* 40 */     int ☃ = this.h / this.d;
/* 41 */     this.j = ☃ % this.e;
/* 42 */     this.k = ☃ / this.e;
/*    */     
/* 44 */     this.h++;
/* 45 */     return true;
/*    */   }
/*    */   
/*    */   public int b() {
/* 49 */     return this.a + this.i;
/*    */   }
/*    */   
/*    */   public int c() {
/* 53 */     return this.b + this.j;
/*    */   }
/*    */   
/*    */   public int d() {
/* 57 */     return this.c + this.k;
/*    */   }
/*    */   
/*    */   public int e() {
/* 61 */     int ☃ = 0;
/* 62 */     if (this.i == 0 || this.i == this.d - 1) {
/* 63 */       ☃++;
/*    */     }
/* 65 */     if (this.j == 0 || this.j == this.e - 1) {
/* 66 */       ☃++;
/*    */     }
/* 68 */     if (this.k == 0 || this.k == this.f - 1) {
/* 69 */       ☃++;
/*    */     }
/* 71 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */