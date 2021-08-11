/*    */ import org.apache.commons.lang3.Validate;
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
/*    */ public class agc
/*    */ {
/*    */   private final long[] a;
/*    */   private final int b;
/*    */   private final long c;
/*    */   private final int d;
/*    */   
/*    */   public agc(int ☃, int i) {
/* 26 */     this(☃, i, new long[afm.c(i * ☃, 64) / 64]);
/*    */   }
/*    */   
/*    */   public agc(int ☃, int i, long[] arrayOfLong) {
/* 30 */     Validate.inclusiveBetween(1L, 32L, ☃);
/*    */     
/* 32 */     this.d = i;
/* 33 */     this.b = ☃;
/* 34 */     this.a = arrayOfLong;
/* 35 */     this.c = (1L << ☃) - 1L;
/*    */     
/* 37 */     int j = afm.c(i * ☃, 64) / 64;
/* 38 */     if (arrayOfLong.length != j) {
/* 39 */       throw new IllegalArgumentException("Invalid length given for storage, got: " + arrayOfLong.length + " but expected: " + j);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i) {
/* 44 */     Validate.inclusiveBetween(0L, (this.d - 1), ☃);
/* 45 */     Validate.inclusiveBetween(0L, this.c, i);
/*    */     
/* 47 */     int j = ☃ * this.b;
/* 48 */     int k = j >> 6;
/* 49 */     int m = (☃ + 1) * this.b - 1 >> 6;
/* 50 */     int n = j ^ k << 6;
/*    */     
/* 52 */     this.a[k] = this.a[k] & (this.c << n ^ 0xFFFFFFFFFFFFFFFFL) | (i & this.c) << n;
/* 53 */     if (k != m) {
/* 54 */       int i1 = 64 - n;
/* 55 */       int i2 = this.b - i1;
/* 56 */       this.a[m] = this.a[m] >>> i2 << i2 | (i & this.c) >> i1;
/*    */     } 
/*    */   }
/*    */   
/*    */   public int a(int ☃) {
/* 61 */     Validate.inclusiveBetween(0L, (this.d - 1), ☃);
/*    */     
/* 63 */     int i = ☃ * this.b;
/* 64 */     int j = i >> 6;
/* 65 */     int k = (☃ + 1) * this.b - 1 >> 6;
/* 66 */     int m = i ^ j << 6;
/*    */     
/* 68 */     if (j == k) {
/* 69 */       return (int)(this.a[j] >>> m & this.c);
/*    */     }
/* 71 */     int n = 64 - m;
/* 72 */     return (int)((this.a[j] >>> m | this.a[k] << n) & this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public long[] a() {
/* 77 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 81 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */