/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class aac
/*    */   extends cuj
/*    */ {
/*    */   protected aac(int ☃, int i, int j) {
/*  9 */     super(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(long ☃) {
/* 14 */     return (☃ == Long.MAX_VALUE);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(long ☃, int i, boolean bool) {
/* 19 */     for (int j = -1; j <= 1; j++) {
/* 20 */       for (int k = -1; k <= 1; k++) {
/* 21 */         for (int m = -1; m <= 1; m++) {
/* 22 */           long l = gp.a(☃, j, k, m);
/* 23 */           if (l != ☃)
/*    */           {
/*    */             
/* 26 */             b(☃, l, i, bool);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   protected int a(long ☃, long l1, int i) {
/* 34 */     int j = i;
/* 35 */     for (int k = -1; k <= 1; k++) {
/* 36 */       for (int m = -1; m <= 1; m++) {
/* 37 */         for (int n = -1; n <= 1; n++) {
/* 38 */           long l = gp.a(☃, k, m, n);
/* 39 */           if (l == ☃) {
/* 40 */             l = Long.MAX_VALUE;
/*    */           }
/* 42 */           if (l != l1) {
/* 43 */             int i1 = b(l, ☃, c(l));
/* 44 */             if (j > i1) {
/* 45 */               j = i1;
/*    */             }
/* 47 */             if (j == 0) {
/* 48 */               return j;
/*    */             }
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 54 */     return j;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int b(long ☃, long l1, int i) {
/* 59 */     if (☃ == Long.MAX_VALUE) {
/* 60 */       return b(l1);
/*    */     }
/* 62 */     return i + 1;
/*    */   }
/*    */   
/*    */   protected abstract int b(long paramLong);
/*    */   
/*    */   public void b(long ☃, int i, boolean bool) {
/* 68 */     a(Long.MAX_VALUE, ☃, i, bool);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */