/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import java.util.function.Predicate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class i
/*     */ {
/*     */   public static class b
/*     */   {
/*     */     public final int a;
/*     */     public final int b;
/*     */     
/*     */     public b(int ☃, int i) {
/*  18 */       this.a = ☃;
/*  19 */       this.b = i;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  24 */       return "IntBounds{min=" + this.a + ", max=" + this.b + '}';
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */   {
/*     */     public final fx a;
/*     */     
/*     */     public final int b;
/*     */     public final int c;
/*     */     
/*     */     public a(fx ☃, int i, int j) {
/*  37 */       this.a = ☃;
/*  38 */       this.b = i;
/*  39 */       this.c = j;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static a a(fx ☃, gc.a a1, int j, gc.a a2, int k, Predicate<fx> predicate) {
/*  57 */     fx.a a3 = ☃.i();
/*     */     
/*  59 */     gc gc1 = gc.a(gc.b.b, a1);
/*  60 */     gc gc2 = gc1.f();
/*     */     
/*  62 */     gc gc3 = gc.a(gc.b.b, a2);
/*  63 */     gc gc4 = gc3.f();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     int m = a(predicate, a3.g(☃), gc1, j);
/*  80 */     int n = a(predicate, a3.g(☃), gc2, j);
/*     */     
/*  82 */     int i1 = m;
/*  83 */     b[] arrayOfB = new b[i1 + 1 + n];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     arrayOfB[i1] = new b(
/* 100 */         a(predicate, a3.g(☃), gc3, k), 
/* 101 */         a(predicate, a3.g(☃), gc4, k));
/*     */ 
/*     */     
/* 104 */     int i2 = (arrayOfB[i1]).a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int i3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     for (i3 = 1; i3 <= m; i3++) {
/* 125 */       b b = arrayOfB[i1 - i3 - 1];
/* 126 */       arrayOfB[i1 - i3] = new b(
/* 127 */           a(predicate, a3.g(☃).c(gc1, i3), gc3, b.a), 
/* 128 */           a(predicate, a3.g(☃).c(gc1, i3), gc4, b.b));
/*     */     } 
/*     */ 
/*     */     
/* 132 */     for (i3 = 1; i3 <= n; i3++) {
/* 133 */       b b = arrayOfB[i1 + i3 - 1];
/* 134 */       arrayOfB[i1 + i3] = new b(
/* 135 */           a(predicate, a3.g(☃).c(gc2, i3), gc3, b.a), 
/* 136 */           a(predicate, a3.g(☃).c(gc2, i3), gc4, b.b));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 154 */     i3 = 0;
/* 155 */     int i4 = 0;
/* 156 */     int i5 = 0;
/* 157 */     int i6 = 0;
/*     */     
/* 159 */     int[] arrayOfInt = new int[arrayOfB.length];
/*     */     
/* 161 */     for (int i7 = i2; i7 >= 0; i7--) {
/* 162 */       for (int i8 = 0; i8 < arrayOfB.length; i8++) {
/* 163 */         b b1 = arrayOfB[i8];
/* 164 */         int i11 = i2 - b1.a;
/* 165 */         int i12 = i2 + b1.b;
/*     */         
/* 167 */         arrayOfInt[i8] = (i7 >= i11 && i7 <= i12) ? (i12 + 1 - i7) : 0;
/*     */       } 
/*     */       
/* 170 */       Pair<b, Integer> pair = a(arrayOfInt);
/* 171 */       b b = (b)pair.getFirst();
/* 172 */       int i9 = 1 + b.b - b.a;
/* 173 */       int i10 = ((Integer)pair.getSecond()).intValue();
/*     */       
/* 175 */       if (i9 * i10 > i5 * i6) {
/* 176 */         i3 = b.a;
/* 177 */         i4 = i7;
/* 178 */         i5 = i9;
/* 179 */         i6 = i10;
/*     */       } 
/*     */     } 
/*     */     
/* 183 */     return new a(☃
/* 184 */         .a(a1, i3 - i1).a(a2, i4 - i2), i5, i6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(Predicate<fx> ☃, fx.a a1, gc gc1, int j) {
/* 191 */     int k = 0;
/* 192 */     while (k < j && ☃.test(a1.c(gc1))) {
/* 193 */       k++;
/*     */     }
/* 195 */     return k;
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   static Pair<b, Integer> a(int[] ☃) {
/* 200 */     int j = 0;
/* 201 */     int k = 0;
/* 202 */     int m = 0;
/*     */     
/* 204 */     IntArrayList intArrayList = new IntArrayList();
/* 205 */     intArrayList.push(0);
/* 206 */     for (int n = 1; n <= ☃.length; n++) {
/* 207 */       int i1 = (n == ☃.length) ? 0 : ☃[n];
/* 208 */       while (!intArrayList.isEmpty()) {
/* 209 */         int i2 = ☃[intArrayList.topInt()];
/* 210 */         if (i1 >= i2) {
/* 211 */           intArrayList.push(n);
/*     */           
/*     */           break;
/*     */         } 
/* 215 */         intArrayList.popInt();
/* 216 */         int i3 = intArrayList.isEmpty() ? 0 : (intArrayList.topInt() + 1);
/*     */         
/* 218 */         if (i2 * (n - i3) > m * (k - j)) {
/* 219 */           k = n;
/* 220 */           j = i3;
/* 221 */           m = i2;
/*     */         } 
/*     */       } 
/*     */       
/* 225 */       if (intArrayList.isEmpty()) {
/* 226 */         intArrayList.push(n);
/*     */       }
/*     */     } 
/*     */     
/* 230 */     return new Pair(new b(j, k - 1), Integer.valueOf(m));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */