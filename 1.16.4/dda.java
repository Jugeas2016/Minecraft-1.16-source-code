/*    */ import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*    */ 
/*    */ public final class dda
/*    */   implements dcz
/*    */ {
/*    */   private final DoubleArrayList a;
/*    */   private final IntArrayList b;
/*    */   private final IntArrayList c;
/*    */   
/*    */   protected dda(DoubleList ☃, DoubleList doubleList1, boolean bool1, boolean bool2) {
/* 13 */     int i = 0;
/* 14 */     int j = 0;
/* 15 */     double d = Double.NaN;
/*    */     
/* 17 */     int k = ☃.size();
/* 18 */     int m = doubleList1.size();
/* 19 */     int n = k + m;
/* 20 */     this.a = new DoubleArrayList(n);
/* 21 */     this.b = new IntArrayList(n);
/* 22 */     this.c = new IntArrayList(n);
/*    */     
/*    */     while (true) {
/* 25 */       boolean bool3 = (i < k);
/* 26 */       boolean bool4 = (j < m);
/* 27 */       if (!bool3 && !bool4) {
/*    */         break;
/*    */       }
/*    */       
/* 31 */       boolean bool5 = (bool3 && (!bool4 || ☃.getDouble(i) < doubleList1.getDouble(j) + 1.0E-7D));
/* 32 */       double d1 = bool5 ? ☃.getDouble(i++) : doubleList1.getDouble(j++);
/* 33 */       if ((i == 0 || !bool3) && !bool5 && !bool2) {
/*    */         continue;
/*    */       }
/* 36 */       if ((j == 0 || !bool4) && bool5 && !bool1) {
/*    */         continue;
/*    */       }
/* 39 */       if (d < d1 - 1.0E-7D) {
/* 40 */         this.b.add(i - 1);
/* 41 */         this.c.add(j - 1);
/* 42 */         this.a.add(d1);
/* 43 */         d = d1; continue;
/* 44 */       }  if (!this.a.isEmpty()) {
/* 45 */         this.b.set(this.b.size() - 1, i - 1);
/* 46 */         this.c.set(this.c.size() - 1, j - 1);
/*    */       } 
/*    */     } 
/* 49 */     if (this.a.isEmpty()) {
/* 50 */       this.a.add(Math.min(☃.getDouble(k - 1), doubleList1.getDouble(m - 1)));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(dcz.a ☃) {
/* 56 */     for (int i = 0; i < this.a.size() - 1; i++) {
/* 57 */       if (!☃.merge(this.b.getInt(i), this.c.getInt(i), i)) {
/* 58 */         return false;
/*    */       }
/*    */     } 
/* 61 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public DoubleList a() {
/* 66 */     return (DoubleList)this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dda.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */