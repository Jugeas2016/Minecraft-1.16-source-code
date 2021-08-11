/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*     */ import it.unimi.dsi.fastutil.ints.IntBidirectionalIterator;
/*     */ import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSortedSet;
/*     */ import java.util.List;
/*     */ import java.util.stream.IntStream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cub
/*     */   implements cue
/*     */ {
/*     */   private final ctz[] a;
/*     */   private final DoubleList b;
/*     */   private final double c;
/*     */   private final double d;
/*     */   
/*     */   public cub(chx ☃, IntStream intStream) {
/*  27 */     this(☃, intStream.boxed().collect(ImmutableList.toImmutableList()));
/*     */   }
/*     */   
/*     */   public cub(chx ☃, List<Integer> list) {
/*  31 */     this(☃, (IntSortedSet)new IntRBTreeSet(list));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static cub a(chx ☃, int i, DoubleList doubleList) {
/*  39 */     return new cub(☃, Pair.of(Integer.valueOf(i), doubleList));
/*     */   }
/*     */   
/*     */   private static Pair<Integer, DoubleList> a(IntSortedSet ☃) {
/*  43 */     if (☃.isEmpty()) {
/*  44 */       throw new IllegalArgumentException("Need some octaves!");
/*     */     }
/*     */     
/*  47 */     int i = -☃.firstInt();
/*  48 */     int j = ☃.lastInt();
/*     */     
/*  50 */     int k = i + j + 1;
/*  51 */     if (k < 1) {
/*  52 */       throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
/*     */     }
/*     */     
/*  55 */     DoubleArrayList doubleArrayList = new DoubleArrayList(new double[k]);
/*  56 */     IntBidirectionalIterator intBidirectionalIterator = ☃.iterator();
/*  57 */     while (intBidirectionalIterator.hasNext()) {
/*  58 */       int m = intBidirectionalIterator.nextInt();
/*  59 */       doubleArrayList.set(m + i, 1.0D);
/*     */     } 
/*     */     
/*  62 */     return Pair.of(Integer.valueOf(-i), doubleArrayList);
/*     */   }
/*     */   
/*     */   private cub(chx ☃, IntSortedSet intSortedSet) {
/*  66 */     this(☃, a(intSortedSet));
/*     */   }
/*     */   
/*     */   private cub(chx ☃, Pair<Integer, DoubleList> pair) {
/*  70 */     int i = ((Integer)pair.getFirst()).intValue();
/*  71 */     this.b = (DoubleList)pair.getSecond();
/*  72 */     ctz ctz1 = new ctz(☃);
/*  73 */     int j = this.b.size();
/*  74 */     int k = -i;
/*     */     
/*  76 */     this.a = new ctz[j];
/*  77 */     if (k >= 0 && k < j) {
/*  78 */       double d = this.b.getDouble(k);
/*  79 */       if (d != 0.0D) {
/*  80 */         this.a[k] = ctz1;
/*     */       }
/*     */     } 
/*     */     
/*  84 */     for (int m = k - 1; m >= 0; m--) {
/*  85 */       if (m < j) {
/*  86 */         double d = this.b.getDouble(m);
/*  87 */         if (d != 0.0D) {
/*  88 */           this.a[m] = new ctz(☃);
/*     */         } else {
/*  90 */           ☃.a(262);
/*     */         } 
/*     */       } else {
/*  93 */         ☃.a(262);
/*     */       } 
/*     */     } 
/*     */     
/*  97 */     if (k < j - 1) {
/*     */       
/*  99 */       long l = (long)(ctz1.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D) * 9.223372036854776E18D);
/* 100 */       chx chx1 = new chx(l);
/* 101 */       for (int n = k + 1; n < j; n++) {
/* 102 */         if (n >= 0) {
/* 103 */           double d = this.b.getDouble(n);
/* 104 */           if (d != 0.0D) {
/* 105 */             this.a[n] = new ctz(chx1);
/*     */           } else {
/* 107 */             chx1.a(262);
/*     */           } 
/*     */         } else {
/* 110 */           chx1.a(262);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 115 */     this.d = Math.pow(2.0D, -k);
/* 116 */     this.c = Math.pow(2.0D, (j - 1)) / (Math.pow(2.0D, j) - 1.0D);
/*     */   }
/*     */   
/*     */   public double a(double ☃, double d1, double d2) {
/* 120 */     return a(☃, d1, d2, 0.0D, 0.0D, false);
/*     */   }
/*     */   
/*     */   public double a(double ☃, double d1, double d2, double d3, double d4, boolean bool) {
/* 124 */     double d5 = 0.0D;
/* 125 */     double d6 = this.d;
/* 126 */     double d7 = this.c;
/*     */     
/* 128 */     for (int i = 0; i < this.a.length; i++) {
/* 129 */       ctz ctz1 = this.a[i];
/* 130 */       if (ctz1 != null) {
/* 131 */         d5 += this.b.getDouble(i) * ctz1.a(a(☃ * d6), bool ? -ctz1.b : a(d1 * d6), a(d2 * d6), d3 * d6, d4 * d6) * d7;
/*     */       }
/* 133 */       d6 *= 2.0D;
/* 134 */       d7 /= 2.0D;
/*     */     } 
/*     */     
/* 137 */     return d5;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ctz a(int ☃) {
/* 142 */     return this.a[this.a.length - 1 - ☃];
/*     */   }
/*     */   
/*     */   public static double a(double ☃) {
/* 146 */     return ☃ - afm.d(☃ / 3.3554432E7D + 0.5D) * 3.3554432E7D;
/*     */   }
/*     */ 
/*     */   
/*     */   public double a(double ☃, double d1, double d2, double d3) {
/* 151 */     return a(☃, d1, 0.0D, d2, d3, false);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */