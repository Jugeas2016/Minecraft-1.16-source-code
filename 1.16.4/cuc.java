/*    */ import com.google.common.collect.ImmutableList;
/*    */ import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
/*    */ import it.unimi.dsi.fastutil.ints.IntSortedSet;
/*    */ import java.util.List;
/*    */ import java.util.stream.IntStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cuc
/*    */   implements cue
/*    */ {
/*    */   private final cud[] a;
/*    */   private final double b;
/*    */   private final double c;
/*    */   
/*    */   public cuc(chx ☃, IntStream intStream) {
/* 17 */     this(☃, intStream.boxed().collect(ImmutableList.toImmutableList()));
/*    */   }
/*    */   
/*    */   public cuc(chx ☃, List<Integer> list) {
/* 21 */     this(☃, (IntSortedSet)new IntRBTreeSet(list));
/*    */   }
/*    */   
/*    */   private cuc(chx ☃, IntSortedSet intSortedSet) {
/* 25 */     if (intSortedSet.isEmpty()) {
/* 26 */       throw new IllegalArgumentException("Need some octaves!");
/*    */     }
/*    */     
/* 29 */     int i = -intSortedSet.firstInt();
/* 30 */     int j = intSortedSet.lastInt();
/*    */     
/* 32 */     int k = i + j + 1;
/* 33 */     if (k < 1) {
/* 34 */       throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
/*    */     }
/*    */     
/* 37 */     cud cud1 = new cud(☃);
/* 38 */     int m = j;
/*    */     
/* 40 */     this.a = new cud[k];
/* 41 */     if (m >= 0 && m < k && intSortedSet.contains(0)) {
/* 42 */       this.a[m] = cud1;
/*    */     }
/*    */     
/* 45 */     for (int n = m + 1; n < k; n++) {
/* 46 */       if (n >= 0 && intSortedSet.contains(m - n)) {
/* 47 */         this.a[n] = new cud(☃);
/*    */       } else {
/* 49 */         ☃.a(262);
/*    */       } 
/*    */     } 
/*    */     
/* 53 */     if (j > 0) {
/*    */       
/* 55 */       long l = (long)(cud1.a(cud1.b, cud1.c, cud1.d) * 9.223372036854776E18D);
/* 56 */       chx chx1 = new chx(l);
/* 57 */       for (int i1 = m - 1; i1 >= 0; i1--) {
/* 58 */         if (i1 < k && intSortedSet.contains(m - i1)) {
/* 59 */           this.a[i1] = new cud(chx1);
/*    */         } else {
/* 61 */           chx1.a(262);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 66 */     this.c = Math.pow(2.0D, j);
/* 67 */     this.b = 1.0D / (Math.pow(2.0D, k) - 1.0D);
/*    */   }
/*    */   
/*    */   public double a(double ☃, double d1, boolean bool) {
/* 71 */     double d2 = 0.0D;
/* 72 */     double d3 = this.c;
/* 73 */     double d4 = this.b;
/*    */     
/* 75 */     for (cud cud1 : this.a) {
/* 76 */       if (cud1 != null) {
/* 77 */         d2 += cud1.a(☃ * d3 + (bool ? cud1.b : 0.0D), d1 * d3 + (bool ? cud1.c : 0.0D)) * d4;
/*    */       }
/* 79 */       d3 /= 2.0D;
/* 80 */       d4 *= 2.0D;
/*    */     } 
/*    */     
/* 83 */     return d2;
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(double ☃, double d1, double d2, double d3) {
/* 88 */     return a(☃, d1, true) * 0.55D;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cuc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */