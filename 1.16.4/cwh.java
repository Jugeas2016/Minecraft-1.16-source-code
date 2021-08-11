/*    */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*    */ import it.unimi.dsi.fastutil.ints.IntSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cwh
/*    */   implements cwr
/*    */ {
/*  9 */   a;
/*    */   static {
/* 11 */     b = (IntSet)new IntOpenHashSet(new int[] { 26, 11, 12, 13, 140, 30, 31, 158, 10 });
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
/* 23 */     c = (IntSet)new IntOpenHashSet(new int[] { 168, 169, 21, 22, 23, 149, 151 });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final IntSet c;
/*    */ 
/*    */   
/*    */   private static final IntSet b;
/*    */ 
/*    */   
/*    */   public int a(cvk ☃, int i, int j, int k, int m, int n) {
/* 35 */     if (n == 14) {
/* 36 */       if (cvx.b(i) || cvx.b(j) || cvx.b(k) || cvx.b(m)) {
/* 37 */         return 15;
/*    */       }
/* 39 */     } else if (c.contains(n)) {
/* 40 */       if (!c(i) || !c(j) || !c(k) || !c(m))
/* 41 */         return 23; 
/* 42 */       if (cvx.a(i) || cvx.a(j) || cvx.a(k) || cvx.a(m)) {
/* 43 */         return 16;
/*    */       }
/* 45 */     } else if (n == 3 || n == 34 || n == 20) {
/* 46 */       if (!cvx.a(n) && (cvx.a(i) || cvx.a(j) || cvx.a(k) || cvx.a(m))) {
/* 47 */         return 25;
/*    */       }
/* 49 */     } else if (b.contains(n)) {
/* 50 */       if (!cvx.a(n) && (cvx.a(i) || cvx.a(j) || cvx.a(k) || cvx.a(m))) {
/* 51 */         return 26;
/*    */       }
/* 53 */     } else if (n == 37 || n == 38) {
/* 54 */       if (!cvx.a(i) && !cvx.a(j) && !cvx.a(k) && !cvx.a(m) && (!d(i) || !d(j) || !d(k) || !d(m))) {
/* 55 */         return 2;
/*    */       }
/* 57 */     } else if (!cvx.a(n) && n != 7 && n != 6 && (
/* 58 */       cvx.a(i) || cvx.a(j) || cvx.a(k) || cvx.a(m))) {
/* 59 */       return 16;
/*    */     } 
/*    */     
/* 62 */     return n;
/*    */   }
/*    */   
/*    */   private static boolean c(int ☃) {
/* 66 */     return (c.contains(☃) || ☃ == 4 || ☃ == 5 || cvx.a(☃));
/*    */   }
/*    */   
/*    */   private boolean d(int ☃) {
/* 70 */     return (☃ == 37 || ☃ == 38 || ☃ == 39 || ☃ == 165 || ☃ == 166 || ☃ == 167);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cwh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */