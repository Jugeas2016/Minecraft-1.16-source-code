/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class zv
/*    */   extends cuj
/*    */ {
/*    */   protected zv(int ☃, int i, int j) {
/*  8 */     super(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(long ☃) {
/* 13 */     return (☃ == brd.a);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(long ☃, int i, boolean bool) {
/* 18 */     brd brd = new brd(☃);
/* 19 */     int j = brd.b;
/* 20 */     int k = brd.c;
/* 21 */     for (int m = -1; m <= 1; m++) {
/* 22 */       for (int n = -1; n <= 1; n++) {
/* 23 */         long l = brd.a(j + m, k + n);
/* 24 */         if (l != ☃)
/*    */         {
/*    */           
/* 27 */           b(☃, l, i, bool);
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   protected int a(long ☃, long l1, int i) {
/* 34 */     int j = i;
/* 35 */     brd brd = new brd(☃);
/* 36 */     int k = brd.b;
/* 37 */     int m = brd.c;
/* 38 */     for (int n = -1; n <= 1; n++) {
/* 39 */       for (int i1 = -1; i1 <= 1; i1++) {
/* 40 */         long l = brd.a(k + n, m + i1);
/* 41 */         if (l == ☃) {
/* 42 */           l = brd.a;
/*    */         }
/* 44 */         if (l != l1) {
/* 45 */           int i2 = b(l, ☃, c(l));
/* 46 */           if (j > i2) {
/* 47 */             j = i2;
/*    */           }
/* 49 */           if (j == 0) {
/* 50 */             return j;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 55 */     return j;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int b(long ☃, long l1, int i) {
/* 60 */     if (☃ == brd.a) {
/* 61 */       return b(l1);
/*    */     }
/* 63 */     return i + 1;
/*    */   }
/*    */   
/*    */   protected abstract int b(long paramLong);
/*    */   
/*    */   public void b(long ☃, int i, boolean bool) {
/* 69 */     a(brd.a, ☃, i, bool);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */