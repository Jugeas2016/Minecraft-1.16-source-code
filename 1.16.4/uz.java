/*    */ import java.util.Iterator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface uz<T>
/*    */ {
/*    */   default void a(int ☃, int i, int j, boq<?> boq1, Iterator<T> iterator, int k) {
/* 11 */     int m = ☃;
/* 12 */     int n = i;
/*    */     
/* 14 */     if (boq1 instanceof bov) {
/* 15 */       bov bov = (bov)boq1;
/* 16 */       m = bov.i();
/* 17 */       n = bov.j();
/*    */     } 
/*    */     
/* 20 */     int i1 = 0;
/* 21 */     for (int i2 = 0; i2 < i; i2++) {
/* 22 */       if (i1 == j) {
/* 23 */         i1++;
/*    */       }
/*    */       
/* 26 */       boolean bool = (n < i / 2.0F);
/* 27 */       int i3 = afm.d(i / 2.0F - n / 2.0F);
/*    */       
/* 29 */       if (bool && i3 > i2) {
/* 30 */         i1 += ☃;
/* 31 */         i2++;
/*    */       } 
/*    */       
/* 34 */       for (int i4 = 0; i4 < ☃; i4++) {
/* 35 */         if (!iterator.hasNext()) {
/*    */           return;
/*    */         }
/*    */         
/* 39 */         bool = (m < ☃ / 2.0F);
/* 40 */         i3 = afm.d(☃ / 2.0F - m / 2.0F);
/* 41 */         int i5 = m;
/* 42 */         boolean bool1 = (i4 < m);
/* 43 */         if (bool) {
/* 44 */           i5 = i3 + m;
/* 45 */           bool1 = (i3 <= i4 && i4 < i3 + m);
/*    */         } 
/*    */ 
/*    */         
/* 49 */         if (bool1) {
/* 50 */           a(iterator, i1, k, i2, i4);
/* 51 */         } else if (i5 == i4) {
/* 52 */           i1 += ☃ - i4;
/*    */           
/*    */           break;
/*    */         } 
/* 56 */         i1++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   void a(Iterator<T> paramIterator, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\uz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */