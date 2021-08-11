/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cwj
/*    */   implements cwm
/*    */ {
/*  8 */   a,
/*  9 */   b
/*    */   {
/*    */     protected int a(cvj<?> ☃, int i, int j, int k, int m) {
/* 12 */       return ☃.a(i, j, k, m);
/*    */     }
/*    */   };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 21 */     return ☃ >> 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 26 */     return ☃ >> 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(cvj<?> ☃, cvf cvf1, int i, int j) {
/* 31 */     int k = cvf1.a(a(i), b(j));
/*    */     
/* 33 */     ☃.a((i >> 1 << 1), (j >> 1 << 1));
/*    */     
/* 35 */     int m = i & 0x1;
/* 36 */     int n = j & 0x1;
/* 37 */     if (m == 0 && n == 0) {
/* 38 */       return k;
/*    */     }
/*    */     
/* 41 */     int i1 = cvf1.a(a(i), b(j + 1));
/* 42 */     int i2 = ☃.a(k, i1);
/* 43 */     if (m == 0 && n == 1) {
/* 44 */       return i2;
/*    */     }
/* 46 */     int i3 = cvf1.a(a(i + 1), b(j));
/* 47 */     int i4 = ☃.a(k, i3);
/* 48 */     if (m == 1 && n == 0) {
/* 49 */       return i4;
/*    */     }
/*    */     
/* 52 */     int i5 = cvf1.a(a(i + 1), b(j + 1));
/*    */     
/* 54 */     return a(☃, k, i3, i1, i5);
/*    */   }
/*    */   
/*    */   protected int a(cvj<?> ☃, int i, int j, int k, int m) {
/* 58 */     if (j == k && k == m) {
/* 59 */       return j;
/*    */     }
/* 61 */     if (i == j && i == k) {
/* 62 */       return i;
/*    */     }
/* 64 */     if (i == j && i == m) {
/* 65 */       return i;
/*    */     }
/* 67 */     if (i == k && i == m) {
/* 68 */       return i;
/*    */     }
/* 70 */     if (i == j && k != m) {
/* 71 */       return i;
/*    */     }
/* 73 */     if (i == k && j != m) {
/* 74 */       return i;
/*    */     }
/* 76 */     if (i == m && j != k) {
/* 77 */       return i;
/*    */     }
/* 79 */     if (j == k && i != m) {
/* 80 */       return j;
/*    */     }
/* 82 */     if (j == m && i != k) {
/* 83 */       return j;
/*    */     }
/* 85 */     if (k == m && i != j) {
/* 86 */       return k;
/*    */     }
/*    */     
/* 89 */     return ☃.a(i, j, k, m);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cwj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */