/*     */ import java.util.function.IntConsumer;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aer
/*     */ {
/*  13 */   private static final int[] a = new int[] { -1, -1, 0, Integer.MIN_VALUE, 0, 0, 1431655765, 1431655765, 0, Integer.MIN_VALUE, 0, 1, 858993459, 858993459, 0, 715827882, 715827882, 0, 613566756, 613566756, 0, Integer.MIN_VALUE, 0, 2, 477218588, 477218588, 0, 429496729, 429496729, 0, 390451572, 390451572, 0, 357913941, 357913941, 0, 330382099, 330382099, 0, 306783378, 306783378, 0, 286331153, 286331153, 0, Integer.MIN_VALUE, 0, 3, 252645135, 252645135, 0, 238609294, 238609294, 0, 226050910, 226050910, 0, 214748364, 214748364, 0, 204522252, 204522252, 0, 195225786, 195225786, 0, 186737708, 186737708, 0, 178956970, 178956970, 0, 171798691, 171798691, 0, 165191049, 165191049, 0, 159072862, 159072862, 0, 153391689, 153391689, 0, 148102320, 148102320, 0, 143165576, 143165576, 0, 138547332, 138547332, 0, Integer.MIN_VALUE, 0, 4, 130150524, 130150524, 0, 126322567, 126322567, 0, 122713351, 122713351, 0, 119304647, 119304647, 0, 116080197, 116080197, 0, 113025455, 113025455, 0, 110127366, 110127366, 0, 107374182, 107374182, 0, 104755299, 104755299, 0, 102261126, 102261126, 0, 99882960, 99882960, 0, 97612893, 97612893, 0, 95443717, 95443717, 0, 93368854, 93368854, 0, 91382282, 91382282, 0, 89478485, 89478485, 0, 87652393, 87652393, 0, 85899345, 85899345, 0, 84215045, 84215045, 0, 82595524, 82595524, 0, 81037118, 81037118, 0, 79536431, 79536431, 0, 78090314, 78090314, 0, 76695844, 76695844, 0, 75350303, 75350303, 0, 74051160, 74051160, 0, 72796055, 72796055, 0, 71582788, 71582788, 0, 70409299, 70409299, 0, 69273666, 69273666, 0, 68174084, 68174084, 0, Integer.MIN_VALUE, 0, 5 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final long[] b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final long d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int e;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int f;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int g;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int h;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int i;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aer(int ☃, int i) {
/*  92 */     this(☃, i, null);
/*     */   }
/*     */   
/*     */   public aer(int ☃, int i, @Nullable long[] arrayOfLong) {
/*  96 */     Validate.inclusiveBetween(1L, 32L, ☃);
/*     */     
/*  98 */     this.e = i;
/*  99 */     this.c = ☃;
/* 100 */     this.d = (1L << ☃) - 1L;
/* 101 */     this.f = (char)(64 / ☃);
/*     */     
/* 103 */     int j = 3 * (this.f - 1);
/* 104 */     this.g = a[j + 0];
/* 105 */     this.h = a[j + 1];
/* 106 */     this.i = a[j + 2];
/*     */     
/* 108 */     int k = (i + this.f - 1) / this.f;
/* 109 */     if (arrayOfLong != null) {
/* 110 */       if (arrayOfLong.length != k) {
/* 111 */         throw (RuntimeException)x.c(new RuntimeException("Invalid length given for storage, got: " + arrayOfLong.length + " but expected: " + k));
/*     */       }
/* 113 */       this.b = arrayOfLong;
/*     */     } else {
/* 115 */       this.b = new long[k];
/*     */     } 
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/* 120 */     long l1 = Integer.toUnsignedLong(this.g);
/* 121 */     long l2 = Integer.toUnsignedLong(this.h);
/* 122 */     return (int)(☃ * l1 + l2 >> 32L >> this.i);
/*     */   }
/*     */   
/*     */   public int a(int ☃, int i) {
/* 126 */     Validate.inclusiveBetween(0L, (this.e - 1), ☃);
/* 127 */     Validate.inclusiveBetween(0L, this.d, i);
/*     */     
/* 129 */     int j = b(☃);
/* 130 */     long l = this.b[j];
/* 131 */     int k = (☃ - j * this.f) * this.c;
/*     */     
/* 133 */     int m = (int)(l >> k & this.d);
/* 134 */     this.b[j] = l & (this.d << k ^ 0xFFFFFFFFFFFFFFFFL) | (i & this.d) << k;
/*     */     
/* 136 */     return m;
/*     */   }
/*     */   
/*     */   public void b(int ☃, int i) {
/* 140 */     Validate.inclusiveBetween(0L, (this.e - 1), ☃);
/* 141 */     Validate.inclusiveBetween(0L, this.d, i);
/*     */     
/* 143 */     int j = b(☃);
/* 144 */     long l = this.b[j];
/* 145 */     int k = (☃ - j * this.f) * this.c;
/*     */     
/* 147 */     this.b[j] = l & (this.d << k ^ 0xFFFFFFFFFFFFFFFFL) | (i & this.d) << k;
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/* 151 */     Validate.inclusiveBetween(0L, (this.e - 1), ☃);
/*     */     
/* 153 */     int i = b(☃);
/* 154 */     long l = this.b[i];
/* 155 */     int j = (☃ - i * this.f) * this.c;
/*     */     
/* 157 */     return (int)(l >> j & this.d);
/*     */   }
/*     */   
/*     */   public long[] a() {
/* 161 */     return this.b;
/*     */   }
/*     */   
/*     */   public int b() {
/* 165 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(IntConsumer ☃) {
/* 173 */     int i = 0;
/* 174 */     for (long l : this.b) {
/* 175 */       for (int j = 0; j < this.f; j++) {
/* 176 */         ☃.accept((int)(l & this.d));
/* 177 */         l >>= this.c;
/* 178 */         if (++i >= this.e)
/*     */           return; 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */