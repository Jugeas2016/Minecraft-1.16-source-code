/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrays;
/*     */ import java.util.AbstractSet;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.NoSuchElementException;
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
/*     */ public class afq<T>
/*     */   extends AbstractSet<T>
/*     */ {
/*     */   private final Comparator<T> a;
/*     */   private T[] b;
/*     */   private int c;
/*     */   
/*     */   private afq(int ☃, Comparator<T> comparator) {
/*  26 */     this.a = comparator;
/*     */     
/*  28 */     if (☃ < 0) {
/*  29 */       throw new IllegalArgumentException("Initial capacity (" + ☃ + ") is negative");
/*     */     }
/*  31 */     this.b = a(new Object[☃]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T extends Comparable<T>> afq<T> a(int ☃) {
/*  39 */     return new afq<>(☃, (Comparator)Comparator.naturalOrder());
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
/*     */   private static <T> T[] a(Object[] ☃) {
/*  52 */     return (T[])☃;
/*     */   }
/*     */   
/*     */   private int c(T ☃) {
/*  56 */     return Arrays.binarySearch(this.b, 0, this.c, ☃, this.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int b(int ☃) {
/*  65 */     return -☃ - 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(T ☃) {
/*  70 */     int i = c(☃);
/*  71 */     if (i >= 0) {
/*  72 */       return false;
/*     */     }
/*     */     
/*  75 */     int j = b(i);
/*  76 */     a(☃, j);
/*  77 */     return true;
/*     */   }
/*     */   
/*     */   private void c(int ☃) {
/*  81 */     if (☃ <= this.b.length) {
/*     */       return;
/*     */     }
/*  84 */     if (this.b != ObjectArrays.DEFAULT_EMPTY_ARRAY) {
/*  85 */       ☃ = (int)Math.max(Math.min(this.b.length + (this.b.length >> 1), 2147483639L), ☃);
/*  86 */     } else if (☃ < 10) {
/*  87 */       ☃ = 10;
/*     */     } 
/*     */     
/*  90 */     Object[] arrayOfObject = new Object[☃];
/*  91 */     System.arraycopy(this.b, 0, arrayOfObject, 0, this.c);
/*  92 */     this.b = a(arrayOfObject);
/*     */   }
/*     */   
/*     */   private void a(T ☃, int i) {
/*  96 */     c(this.c + 1);
/*  97 */     if (i != this.c) {
/*  98 */       System.arraycopy(this.b, i, this.b, i + 1, this.c - i);
/*     */     }
/* 100 */     this.b[i] = ☃;
/* 101 */     this.c++;
/*     */   }
/*     */ 
/*     */   
/*     */   private void d(int ☃) {
/* 106 */     this.c--;
/* 107 */     if (☃ != this.c) {
/* 108 */       System.arraycopy(this.b, ☃ + 1, this.b, ☃, this.c - ☃);
/*     */     }
/* 110 */     this.b[this.c] = null;
/*     */   }
/*     */   
/*     */   private T e(int ☃) {
/* 114 */     return this.b[☃];
/*     */   }
/*     */   
/*     */   public T a(T ☃) {
/* 118 */     int i = c(☃);
/* 119 */     if (i >= 0) {
/* 120 */       return e(i);
/*     */     }
/*     */     
/* 123 */     a(☃, b(i));
/* 124 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean remove(Object ☃) {
/* 130 */     int i = c((T)☃);
/* 131 */     if (i >= 0) {
/* 132 */       d(i);
/* 133 */       return true;
/*     */     } 
/* 135 */     return false;
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
/*     */   public T b() {
/* 148 */     return e(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean contains(Object ☃) {
/* 158 */     int i = c((T)☃);
/* 159 */     return (i >= 0);
/*     */   }
/*     */   
/*     */   class a implements Iterator<T> {
/*     */     private int b;
/* 164 */     private int c = -1;
/*     */ 
/*     */     
/*     */     public boolean hasNext() {
/* 168 */       return (this.b < afq.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public T next() {
/* 173 */       if (this.b >= afq.a(this.a)) {
/* 174 */         throw new NoSuchElementException();
/*     */       }
/* 176 */       this.c = this.b++;
/* 177 */       return (T)afq.b(this.a)[this.c];
/*     */     }
/*     */ 
/*     */     
/*     */     public void remove() {
/* 182 */       if (this.c == -1) {
/* 183 */         throw new IllegalStateException();
/*     */       }
/* 185 */       afq.a(this.a, this.c);
/* 186 */       this.b--;
/* 187 */       this.c = -1;
/*     */     }
/*     */     
/*     */     private a(afq this$0) {} }
/*     */   
/*     */   public Iterator<T> iterator() {
/* 193 */     return new a();
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 198 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 203 */     return (Object[])this.b.clone();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <U> U[] toArray(U[] ☃) {
/* 209 */     if (☃.length < this.c) {
/* 210 */       return (U[])Arrays.<Object, T>copyOf(this.b, this.c, (Class)☃.getClass());
/*     */     }
/* 212 */     System.arraycopy(this.b, 0, ☃, 0, this.c);
/* 213 */     if (☃.length > this.c) {
/* 214 */       ☃[this.c] = null;
/*     */     }
/* 216 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 221 */     Arrays.fill((Object[])this.b, 0, this.c, (Object)null);
/* 222 */     this.c = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 227 */     if (this == ☃) {
/* 228 */       return true;
/*     */     }
/* 230 */     if (☃ instanceof afq) {
/* 231 */       afq<?> afq1 = (afq)☃;
/* 232 */       if (this.a.equals(afq1.a)) {
/* 233 */         return (this.c == afq1.c && Arrays.equals((Object[])this.b, (Object[])afq1.b));
/*     */       }
/*     */     } 
/*     */     
/* 237 */     return super.equals(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */