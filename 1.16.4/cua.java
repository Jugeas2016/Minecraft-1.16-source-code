/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cua
/*    */ {
/*    */   private final double a;
/*    */   private final cub b;
/*    */   private final cub c;
/*    */   
/*    */   public static cua a(chx ☃, int i, DoubleList doubleList) {
/* 31 */     return new cua(☃, i, doubleList);
/*    */   }
/*    */   
/*    */   private cua(chx ☃, int i, DoubleList doubleList) {
/* 35 */     this.b = cub.a(☃, i, doubleList);
/* 36 */     this.c = cub.a(☃, i, doubleList);
/*    */     
/* 38 */     int j = Integer.MAX_VALUE;
/* 39 */     int k = Integer.MIN_VALUE;
/*    */     
/* 41 */     DoubleListIterator doubleListIterator = doubleList.iterator();
/* 42 */     while (doubleListIterator.hasNext()) {
/* 43 */       int m = doubleListIterator.nextIndex();
/* 44 */       double d = doubleListIterator.nextDouble();
/* 45 */       if (d != 0.0D) {
/* 46 */         j = Math.min(j, m);
/* 47 */         k = Math.max(k, m);
/*    */       } 
/*    */     } 
/*    */     
/* 51 */     this.a = 0.16666666666666666D / a(k - j);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static double a(int ☃) {
/* 58 */     return 0.1D * (1.0D + 1.0D / (☃ + 1));
/*    */   }
/*    */   
/*    */   public double a(double ☃, double d1, double d2) {
/* 62 */     double d3 = ☃ * 1.0181268882175227D;
/* 63 */     double d4 = d1 * 1.0181268882175227D;
/* 64 */     double d5 = d2 * 1.0181268882175227D;
/* 65 */     return (this.b.a(☃, d1, d2) + this.c.a(d3, d4, d5)) * this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cua.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */