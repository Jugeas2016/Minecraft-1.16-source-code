/*     */ import java.util.Spliterators;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class brd
/*     */ {
/*  13 */   public static final long a = a(1875016, 1875016);
/*     */ 
/*     */   
/*     */   public final int b;
/*     */ 
/*     */   
/*     */   public final int c;
/*     */ 
/*     */   
/*     */   public brd(int ☃, int i) {
/*  23 */     this.b = ☃;
/*  24 */     this.c = i;
/*     */   }
/*     */   
/*     */   public brd(fx ☃) {
/*  28 */     this.b = ☃.u() >> 4;
/*  29 */     this.c = ☃.w() >> 4;
/*     */   }
/*     */   
/*     */   public brd(long ☃) {
/*  33 */     this.b = (int)☃;
/*  34 */     this.c = (int)(☃ >> 32L);
/*     */   }
/*     */   
/*     */   public long a() {
/*  38 */     return a(this.b, this.c);
/*     */   }
/*     */   
/*     */   public static long a(int ☃, int i) {
/*  42 */     return ☃ & 0xFFFFFFFFL | (i & 0xFFFFFFFFL) << 32L;
/*     */   }
/*     */   
/*     */   public static int a(long ☃) {
/*  46 */     return (int)(☃ & 0xFFFFFFFFL);
/*     */   }
/*     */   
/*     */   public static int b(long ☃) {
/*  50 */     return (int)(☃ >>> 32L & 0xFFFFFFFFL);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  59 */     int ☃ = 1664525 * this.b + 1013904223;
/*  60 */     int i = 1664525 * (this.c ^ 0xDEADBEEF) + 1013904223;
/*  61 */     return ☃ ^ i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  66 */     if (this == ☃) {
/*  67 */       return true;
/*     */     }
/*     */     
/*  70 */     if (☃ instanceof brd) {
/*  71 */       brd brd1 = (brd)☃;
/*     */       
/*  73 */       return (this.b == brd1.b && this.c == brd1.c);
/*     */     } 
/*     */     
/*  76 */     return false;
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
/*     */   public int d() {
/*  88 */     return this.b << 4;
/*     */   }
/*     */   
/*     */   public int e() {
/*  92 */     return this.c << 4;
/*     */   }
/*     */   
/*     */   public int f() {
/*  96 */     return (this.b << 4) + 15;
/*     */   }
/*     */   
/*     */   public int g() {
/* 100 */     return (this.c << 4) + 15;
/*     */   }
/*     */   
/*     */   public int h() {
/* 104 */     return this.b >> 5;
/*     */   }
/*     */   
/*     */   public int i() {
/* 108 */     return this.c >> 5;
/*     */   }
/*     */   
/*     */   public int j() {
/* 112 */     return this.b & 0x1F;
/*     */   }
/*     */   
/*     */   public int k() {
/* 116 */     return this.c & 0x1F;
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
/*     */   public String toString() {
/* 129 */     return "[" + this.b + ", " + this.c + "]";
/*     */   }
/*     */   
/*     */   public fx l() {
/* 133 */     return new fx(d(), 0, e());
/*     */   }
/*     */   
/*     */   public int a(brd ☃) {
/* 137 */     return Math.max(Math.abs(this.b - ☃.b), Math.abs(this.c - ☃.c));
/*     */   }
/*     */   
/*     */   public static Stream<brd> a(brd ☃, int i) {
/* 141 */     return a(new brd(☃.b - i, ☃.c - i), new brd(☃.b + i, ☃.c + i));
/*     */   }
/*     */   
/*     */   public static Stream<brd> a(brd ☃, brd brd1) {
/* 145 */     int i = Math.abs(☃.b - brd1.b) + 1;
/* 146 */     int j = Math.abs(☃.c - brd1.c) + 1;
/* 147 */     int k = (☃.b < brd1.b) ? 1 : -1;
/* 148 */     int m = (☃.c < brd1.c) ? 1 : -1;
/* 149 */     return StreamSupport.stream(new Spliterators.AbstractSpliterator<brd>((i * j), 64, ☃, brd1, m, k) {
/*     */           @Nullable
/*     */           private brd e;
/*     */           
/*     */           public boolean tryAdvance(Consumer<? super brd> ☃) {
/* 154 */             if (this.e == null) {
/* 155 */               this.e = this.a;
/*     */             } else {
/* 157 */               int i = this.e.b;
/* 158 */               int j = this.e.c;
/* 159 */               if (i == this.b.b) {
/* 160 */                 if (j == this.b.c) {
/* 161 */                   return false;
/*     */                 }
/* 163 */                 this.e = new brd(this.a.b, j + this.c);
/*     */               } else {
/* 165 */                 this.e = new brd(i + this.d, j);
/*     */               } 
/*     */             } 
/* 168 */             ☃.accept(this.e);
/* 169 */             return true;
/*     */           }
/*     */         }false);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */