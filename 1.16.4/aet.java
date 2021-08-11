/*     */ import com.google.common.base.Predicates;
/*     */ import com.google.common.collect.Iterators;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aet<K>
/*     */   implements gg<K>
/*     */ {
/*  13 */   private static final Object a = null;
/*     */   
/*     */   private K[] b;
/*     */   
/*     */   private int[] c;
/*     */   
/*     */   private K[] d;
/*     */   
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   public aet(int ☃) {
/*  25 */     ☃ = (int)(☃ / 0.8F);
/*  26 */     this.b = (K[])new Object[☃];
/*  27 */     this.c = new int[☃];
/*  28 */     this.d = (K[])new Object[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(@Nullable K ☃) {
/*  33 */     return c(b(☃, d(☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public K a(int ☃) {
/*  39 */     if (☃ < 0 || ☃ >= this.d.length) {
/*  40 */       return null;
/*     */     }
/*     */     
/*  43 */     return this.d[☃];
/*     */   }
/*     */   
/*     */   private int c(int ☃) {
/*  47 */     if (☃ == -1) {
/*  48 */       return -1;
/*     */     }
/*  50 */     return this.c[☃];
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
/*     */   public int c(K ☃) {
/*  62 */     int i = c();
/*     */     
/*  64 */     a(☃, i);
/*     */     
/*  66 */     return i;
/*     */   }
/*     */   
/*     */   private int c() {
/*  70 */     while (this.e < this.d.length && this.d[this.e] != null) {
/*  71 */       this.e++;
/*     */     }
/*  73 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   private void d(int ☃) {
/*  78 */     K[] arrayOfK = this.b;
/*  79 */     int[] arrayOfInt = this.c;
/*     */     
/*  81 */     this.b = (K[])new Object[☃];
/*  82 */     this.c = new int[☃];
/*  83 */     this.d = (K[])new Object[☃];
/*  84 */     this.e = 0;
/*  85 */     this.f = 0;
/*     */     
/*  87 */     for (int i = 0; i < arrayOfK.length; i++) {
/*  88 */       if (arrayOfK[i] != null) {
/*  89 */         a(arrayOfK[i], arrayOfInt[i]);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(K ☃, int i) {
/*  95 */     int j = Math.max(i, this.f + 1);
/*  96 */     if (j >= this.b.length * 0.8F) {
/*  97 */       int m = this.b.length << 1;
/*  98 */       while (m < i) {
/*  99 */         m <<= 1;
/*     */       }
/* 101 */       d(m);
/*     */     } 
/*     */     
/* 104 */     int k = e(d(☃));
/* 105 */     this.b[k] = ☃;
/* 106 */     this.c[k] = i;
/* 107 */     this.d[i] = ☃;
/* 108 */     this.f++;
/*     */     
/* 110 */     if (i == this.e) {
/* 111 */       this.e++;
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
/*     */   private int d(@Nullable K ☃) {
/* 127 */     return (afm.g(System.identityHashCode(☃)) & Integer.MAX_VALUE) % this.b.length;
/*     */   }
/*     */   private int b(@Nullable K ☃, int i) {
/*     */     int j;
/* 131 */     for (j = i; j < this.b.length; j++) {
/* 132 */       if (this.b[j] == ☃) {
/* 133 */         return j;
/*     */       }
/* 135 */       if (this.b[j] == a) {
/* 136 */         return -1;
/*     */       }
/*     */     } 
/*     */     
/* 140 */     for (j = 0; j < i; j++) {
/* 141 */       if (this.b[j] == ☃) {
/* 142 */         return j;
/*     */       }
/* 144 */       if (this.b[j] == a) {
/* 145 */         return -1;
/*     */       }
/*     */     } 
/*     */     
/* 149 */     return -1;
/*     */   }
/*     */   private int e(int ☃) {
/*     */     int i;
/* 153 */     for (i = ☃; i < this.b.length; i++) {
/* 154 */       if (this.b[i] == a) {
/* 155 */         return i;
/*     */       }
/*     */     } 
/*     */     
/* 159 */     for (i = 0; i < ☃; i++) {
/* 160 */       if (this.b[i] == a) {
/* 161 */         return i;
/*     */       }
/*     */     } 
/*     */     
/* 165 */     throw new RuntimeException("Overflowed :(");
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<K> iterator() {
/* 170 */     return (Iterator<K>)Iterators.filter((Iterator)Iterators.forArray((Object[])this.d), Predicates.notNull());
/*     */   }
/*     */   
/*     */   public void a() {
/* 174 */     Arrays.fill((Object[])this.b, (Object)null);
/* 175 */     Arrays.fill((Object[])this.d, (Object)null);
/* 176 */     this.e = 0;
/* 177 */     this.f = 0;
/*     */   }
/*     */   
/*     */   public int b() {
/* 181 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */