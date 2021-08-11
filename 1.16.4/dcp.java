/*    */ import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class dcp
/*    */   extends ddh
/*    */ {
/*    */   private final DoubleList b;
/*    */   private final DoubleList c;
/*    */   private final DoubleList d;
/*    */   
/*    */   protected dcp(dcw ☃, double[] arrayOfDouble1, double[] arrayOfDouble2, double[] arrayOfDouble3) {
/* 16 */     this(☃, 
/*    */         
/* 18 */         (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(arrayOfDouble1, ☃.b() + 1)), 
/* 19 */         (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(arrayOfDouble2, ☃.c() + 1)), 
/* 20 */         (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(arrayOfDouble3, ☃.d() + 1)));
/*    */   }
/*    */ 
/*    */   
/*    */   dcp(dcw ☃, DoubleList doubleList1, DoubleList doubleList2, DoubleList doubleList3) {
/* 25 */     super(☃);
/* 26 */     int i = ☃.b() + 1;
/* 27 */     int j = ☃.c() + 1;
/* 28 */     int k = ☃.d() + 1;
/* 29 */     if (i != doubleList1.size() || j != doubleList2.size() || k != doubleList3.size()) {
/* 30 */       throw (IllegalArgumentException)x.c(new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape."));
/*    */     }
/* 32 */     this.b = doubleList1;
/* 33 */     this.c = doubleList2;
/* 34 */     this.d = doubleList3;
/*    */   }
/*    */ 
/*    */   
/*    */   protected DoubleList a(gc.a ☃) {
/* 39 */     switch (null.a[☃.ordinal()]) {
/*    */       case 1:
/* 41 */         return this.b;
/*    */       case 2:
/* 43 */         return this.c;
/*    */       case 3:
/* 45 */         return this.d;
/*    */     } 
/* 47 */     throw new IllegalArgumentException();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */