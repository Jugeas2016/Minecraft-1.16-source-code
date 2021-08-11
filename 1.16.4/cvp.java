/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cvp
/*    */   implements cwo
/*    */ {
/*  7 */   a;
/*    */ 
/*    */   
/*    */   public int a(cvk ☃, int i, int j, int k, int m, int n) {
/* 11 */     if (cvx.b(n) && (!cvx.b(m) || !cvx.b(k) || !cvx.b(i) || !cvx.b(j))) {
/* 12 */       int i1 = 1;
/* 13 */       int i2 = 1;
/* 14 */       if (!cvx.b(m) && ☃.a(i1++) == 0) {
/* 15 */         i2 = m;
/*    */       }
/* 17 */       if (!cvx.b(k) && ☃.a(i1++) == 0) {
/* 18 */         i2 = k;
/*    */       }
/* 20 */       if (!cvx.b(i) && ☃.a(i1++) == 0) {
/* 21 */         i2 = i;
/*    */       }
/* 23 */       if (!cvx.b(j) && ☃.a(i1++) == 0) {
/* 24 */         i2 = j;
/*    */       }
/* 26 */       if (☃.a(3) == 0) {
/* 27 */         return i2;
/*    */       }
/* 29 */       return (i2 == 4) ? 4 : n;
/*    */     } 
/*    */     
/* 32 */     if (!cvx.b(n) && (cvx.b(m) || cvx.b(i) || cvx.b(k) || cvx.b(j)) && 
/* 33 */       ☃.a(5) == 0) {
/* 34 */       if (cvx.b(m)) {
/* 35 */         return (n == 4) ? 4 : m;
/*    */       }
/*    */       
/* 38 */       if (cvx.b(i)) {
/* 39 */         return (n == 4) ? 4 : i;
/*    */       }
/*    */       
/* 42 */       if (cvx.b(k)) {
/* 43 */         return (n == 4) ? 4 : k;
/*    */       }
/*    */       
/* 46 */       if (cvx.b(j)) {
/* 47 */         return (n == 4) ? 4 : j;
/*    */       }
/*    */     } 
/*    */     
/* 51 */     return n;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */