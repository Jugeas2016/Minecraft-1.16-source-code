/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ public class bsi
/*     */   implements brc, brg
/*     */ {
/*     */   protected final int a;
/*     */   protected final int b;
/*     */   protected final cfw[][] c;
/*     */   protected boolean d;
/*     */   protected final brx e;
/*     */   
/*     */   public bsi(brx ☃, fx fx1, fx fx2) {
/*  31 */     this.e = ☃;
/*     */     
/*  33 */     this.a = fx1.u() >> 4;
/*  34 */     this.b = fx1.w() >> 4;
/*  35 */     int i = fx2.u() >> 4;
/*  36 */     int j = fx2.w() >> 4;
/*     */     
/*  38 */     this.c = new cfw[i - this.a + 1][j - this.b + 1];
/*     */     
/*  40 */     cfz cfz = ☃.H();
/*  41 */     this.d = true; int k;
/*  42 */     for (k = this.a; k <= i; k++) {
/*  43 */       for (int m = this.b; m <= j; m++) {
/*  44 */         this.c[k - this.a][m - this.b] = cfz.a(k, m);
/*     */       }
/*     */     } 
/*     */     
/*  48 */     for (k = fx1.u() >> 4; k <= fx2.u() >> 4; k++) {
/*  49 */       for (int m = fx1.w() >> 4; m <= fx2.w() >> 4; m++) {
/*  50 */         cfw cfw1 = this.c[k - this.a][m - this.b];
/*  51 */         if (cfw1 != null && 
/*  52 */           !cfw1.a(fx1.v(), fx2.v())) {
/*  53 */           this.d = false;
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private cfw d(fx ☃) {
/*  62 */     return a(☃.u() >> 4, ☃.w() >> 4);
/*     */   }
/*     */   
/*     */   private cfw a(int ☃, int i) {
/*  66 */     int j = ☃ - this.a;
/*  67 */     int k = i - this.b;
/*     */     
/*  69 */     if (j < 0 || j >= this.c.length || k < 0 || k >= (this.c[j]).length) {
/*  70 */       return new cgc(this.e, new brd(☃, i));
/*     */     }
/*  72 */     cfw cfw1 = this.c[j][k];
/*  73 */     return (cfw1 != null) ? cfw1 : new cgc(this.e, new brd(☃, i));
/*     */   }
/*     */ 
/*     */   
/*     */   public cfu f() {
/*  78 */     return this.e.f();
/*     */   }
/*     */ 
/*     */   
/*     */   public brc c(int ☃, int i) {
/*  83 */     return a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj c(fx ☃) {
/*  89 */     cfw cfw1 = d(☃);
/*  90 */     return cfw1.c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh d_(fx ☃) {
/*  95 */     if (brx.m(☃)) {
/*  96 */       return bup.a.n();
/*     */     }
/*     */     
/*  99 */     cfw cfw1 = d(☃);
/* 100 */     return cfw1.d_(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<ddh> c(@Nullable aqa ☃, dci dci1, Predicate<aqa> predicate) {
/* 105 */     return Stream.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<ddh> d(@Nullable aqa ☃, dci dci1, Predicate<aqa> predicate) {
/* 110 */     return b(☃, dci1);
/*     */   }
/*     */ 
/*     */   
/*     */   public cux b(fx ☃) {
/* 115 */     if (brx.m(☃)) {
/* 116 */       return cuy.a.h();
/*     */     }
/*     */     
/* 119 */     cfw cfw1 = d(☃);
/* 120 */     return cfw1.b(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */