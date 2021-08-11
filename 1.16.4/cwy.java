/*     */ 
/*     */ public class cwy
/*     */ {
/*   4 */   private cxb[] a = new cxb[128];
/*     */   
/*     */   private int b;
/*     */   
/*     */   public cxb a(cxb ☃) {
/*   9 */     if (☃.d >= 0) {
/*  10 */       throw new IllegalStateException("OW KNOWS!");
/*     */     }
/*     */     
/*  13 */     if (this.b == this.a.length) {
/*  14 */       cxb[] arrayOfCxb = new cxb[this.b << 1];
/*  15 */       System.arraycopy(this.a, 0, arrayOfCxb, 0, this.b);
/*  16 */       this.a = arrayOfCxb;
/*     */     } 
/*     */ 
/*     */     
/*  20 */     this.a[this.b] = ☃;
/*  21 */     ☃.d = this.b;
/*  22 */     a(this.b++);
/*     */     
/*  24 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  28 */     this.b = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cxb c() {
/*  36 */     cxb ☃ = this.a[0];
/*  37 */     this.a[0] = this.a[--this.b];
/*  38 */     this.a[this.b] = null;
/*  39 */     if (this.b > 0) {
/*  40 */       b(0);
/*     */     }
/*  42 */     ☃.d = -1;
/*  43 */     return ☃;
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
/*     */ 
/*     */   
/*     */   public void a(cxb ☃, float f) {
/*  62 */     float f1 = ☃.g;
/*  63 */     ☃.g = f;
/*  64 */     if (f < f1) {
/*  65 */       a(☃.d);
/*     */     } else {
/*  67 */       b(☃.d);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int ☃) {
/*  76 */     cxb cxb1 = this.a[☃];
/*  77 */     float f = cxb1.g;
/*  78 */     while (☃ > 0) {
/*  79 */       int i = ☃ - 1 >> 1;
/*  80 */       cxb cxb2 = this.a[i];
/*  81 */       if (f < cxb2.g) {
/*  82 */         this.a[☃] = cxb2;
/*  83 */         cxb2.d = ☃;
/*  84 */         ☃ = i;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  89 */     this.a[☃] = cxb1;
/*  90 */     cxb1.d = ☃;
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/*  94 */     cxb cxb1 = this.a[☃];
/*  95 */     float f = cxb1.g; while (true) {
/*     */       cxb cxb3;
/*     */       float f2;
/*  98 */       int i = 1 + (☃ << 1);
/*  99 */       int j = i + 1;
/*     */       
/* 101 */       if (i >= this.b) {
/*     */         break;
/*     */       }
/*     */ 
/*     */       
/* 106 */       cxb cxb2 = this.a[i];
/* 107 */       float f1 = cxb2.g;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 112 */       if (j >= this.b) {
/*     */         
/* 114 */         cxb3 = null;
/* 115 */         f2 = Float.POSITIVE_INFINITY;
/*     */       } else {
/* 117 */         cxb3 = this.a[j];
/* 118 */         f2 = cxb3.g;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 123 */       if (f1 < f2) {
/* 124 */         if (f1 < f) {
/* 125 */           this.a[☃] = cxb2;
/* 126 */           cxb2.d = ☃;
/* 127 */           ☃ = i;
/*     */           continue;
/*     */         } 
/*     */         break;
/*     */       } 
/* 132 */       if (f2 < f) {
/* 133 */         this.a[☃] = cxb3;
/* 134 */         cxb3.d = ☃;
/* 135 */         ☃ = j;
/*     */         
/*     */         continue;
/*     */       } 
/*     */       
/*     */       break;
/*     */     } 
/* 142 */     this.a[☃] = cxb1;
/* 143 */     cxb1.d = ☃;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 147 */     return (this.b == 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cwy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */