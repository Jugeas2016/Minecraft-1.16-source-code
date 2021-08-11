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
/*     */ class a
/*     */ {
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private a e;
/*     */   private a f;
/*     */   private boolean g;
/*     */   
/*     */   private a(int ☃, int i, int j, int k) {
/*  91 */     this.a = ☃;
/*  92 */     this.b = i;
/*  93 */     this.c = j;
/*  94 */     this.d = k;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   a a(dec ☃) {
/*  99 */     if (this.e != null && this.f != null) {
/* 100 */       a a1 = this.e.a(☃);
/* 101 */       if (a1 == null) {
/* 102 */         a1 = this.f.a(☃);
/*     */       }
/* 104 */       return a1;
/*     */     } 
/*     */     
/* 107 */     if (this.g) {
/* 108 */       return null;
/*     */     }
/* 110 */     int i = ☃.d();
/* 111 */     int j = ☃.e();
/*     */     
/* 113 */     if (i > this.c || j > this.d) {
/* 114 */       return null;
/*     */     }
/* 116 */     if (i == this.c && j == this.d) {
/* 117 */       this.g = true;
/* 118 */       return this;
/*     */     } 
/*     */     
/* 121 */     int k = this.c - i;
/* 122 */     int m = this.d - j;
/*     */     
/* 124 */     if (k > m) {
/* 125 */       this.e = new a(this.a, this.b, i, this.d);
/* 126 */       this.f = new a(this.a + i + 1, this.b, this.c - i - 1, this.d);
/*     */     } else {
/* 128 */       this.e = new a(this.a, this.b, this.c, j);
/* 129 */       this.f = new a(this.a, this.b + j + 1, this.c, this.d - j - 1);
/*     */     } 
/* 131 */     return this.e.a(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */