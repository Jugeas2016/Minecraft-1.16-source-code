/*    */ 
/*    */ 
/*    */ 
/*    */ public class cvt
/*    */   implements cwp
/*    */ {
/*  7 */   private static final int[] a = new int[] { 2, 4, 3, 6, 1, 5 };
/*  8 */   private static final int[] b = new int[] { 2, 2, 2, 35, 35, 1 };
/*  9 */   private static final int[] c = new int[] { 4, 29, 3, 1, 27, 6 };
/* 10 */   private static final int[] d = new int[] { 4, 3, 5, 1 };
/* 11 */   private static final int[] e = new int[] { 12, 12, 12, 30 };
/*    */   
/* 13 */   private int[] f = b;
/*    */   
/*    */   public cvt(boolean ☃) {
/* 16 */     if (☃) {
/* 17 */       this.f = a;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(cvk ☃, int i) {
/* 23 */     int j = (i & 0xF00) >> 8;
/* 24 */     i &= 0xFFFFF0FF;
/*    */     
/* 26 */     if (cvx.a(i) || i == 14) {
/* 27 */       return i;
/*    */     }
/*    */     
/* 30 */     switch (i) {
/*    */       case 1:
/* 32 */         if (j > 0) {
/* 33 */           return (☃.a(3) == 0) ? 39 : 38;
/*    */         }
/* 35 */         return this.f[☃.a(this.f.length)];
/*    */       case 2:
/* 37 */         if (j > 0) {
/* 38 */           return 21;
/*    */         }
/* 40 */         return c[☃.a(c.length)];
/*    */       case 3:
/* 42 */         if (j > 0) {
/* 43 */           return 32;
/*    */         }
/* 45 */         return d[☃.a(d.length)];
/*    */       case 4:
/* 47 */         return e[☃.a(e.length)];
/*    */     } 
/* 49 */     return 14;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */