/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cvs
/*    */   implements cwr
/*    */ {
/*  7 */   a;
/*    */ 
/*    */   
/*    */   public int a(cvk ☃, int i, int j, int k, int m, int n) {
/* 11 */     int[] arrayOfInt = new int[1];
/* 12 */     if (a(arrayOfInt, n) || 
/* 13 */       a(arrayOfInt, i, j, k, m, n, 38, 37) || 
/* 14 */       a(arrayOfInt, i, j, k, m, n, 39, 37) || 
/* 15 */       a(arrayOfInt, i, j, k, m, n, 32, 5))
/*    */     {
/* 17 */       return arrayOfInt[0];
/*    */     }
/*    */     
/* 20 */     if (n == 2 && (i == 12 || j == 12 || m == 12 || k == 12)) {
/* 21 */       return 34;
/*    */     }
/*    */ 
/*    */     
/* 25 */     if (n == 6) {
/* 26 */       if (i == 2 || j == 2 || m == 2 || k == 2 || i == 30 || j == 30 || m == 30 || k == 30 || i == 12 || j == 12 || m == 12 || k == 12)
/*    */       {
/*    */ 
/*    */         
/* 30 */         return 1; } 
/* 31 */       if (i == 21 || k == 21 || j == 21 || m == 21 || i == 168 || k == 168 || j == 168 || m == 168)
/*    */       {
/*    */         
/* 34 */         return 23;
/*    */       }
/*    */     } 
/* 37 */     return n;
/*    */   }
/*    */   
/*    */   private boolean a(int[] ☃, int i) {
/* 41 */     if (!cvx.a(i, 3)) {
/* 42 */       return false;
/*    */     }
/* 44 */     ☃[0] = i;
/* 45 */     return true;
/*    */   }
/*    */   
/*    */   private boolean a(int[] ☃, int i, int j, int k, int m, int n, int i1, int i2) {
/* 49 */     if (n != i1) {
/* 50 */       return false;
/*    */     }
/* 52 */     if (cvx.a(i, i1) && cvx.a(j, i1) && cvx.a(m, i1) && cvx.a(k, i1)) {
/* 53 */       ☃[0] = n;
/*    */     } else {
/* 55 */       ☃[0] = i2;
/*    */     } 
/* 57 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */