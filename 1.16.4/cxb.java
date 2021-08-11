/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cxb
/*     */ {
/*     */   public final int a;
/*     */   public final int b;
/*     */   public final int c;
/*     */   private final int m;
/*  14 */   public int d = -1;
/*     */   
/*     */   public float e;
/*     */   
/*     */   public float f;
/*     */   public float g;
/*     */   public cxb h;
/*     */   public boolean i;
/*     */   public float j;
/*     */   public float k;
/*  24 */   public cwz l = cwz.a;
/*     */   
/*     */   public cxb(int ☃, int i, int j) {
/*  27 */     this.a = ☃;
/*  28 */     this.b = i;
/*  29 */     this.c = j;
/*     */     
/*  31 */     this.m = b(☃, i, j);
/*     */   }
/*     */   
/*     */   public cxb a(int ☃, int i, int j) {
/*  35 */     cxb cxb1 = new cxb(☃, i, j);
/*  36 */     cxb1.d = this.d;
/*  37 */     cxb1.e = this.e;
/*  38 */     cxb1.f = this.f;
/*  39 */     cxb1.g = this.g;
/*  40 */     cxb1.h = this.h;
/*  41 */     cxb1.i = this.i;
/*  42 */     cxb1.j = this.j;
/*  43 */     cxb1.k = this.k;
/*  44 */     cxb1.l = this.l;
/*  45 */     return cxb1;
/*     */   }
/*     */   
/*     */   public static int b(int ☃, int i, int j) {
/*  49 */     return i & 0xFF | (☃ & 0x7FFF) << 8 | (j & 0x7FFF) << 24 | ((☃ < 0) ? Integer.MIN_VALUE : 0) | ((j < 0) ? 32768 : 0);
/*     */   }
/*     */   
/*     */   public float a(cxb ☃) {
/*  53 */     float f1 = (☃.a - this.a);
/*  54 */     float f2 = (☃.b - this.b);
/*  55 */     float f3 = (☃.c - this.c);
/*  56 */     return afm.c(f1 * f1 + f2 * f2 + f3 * f3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float b(cxb ☃) {
/*  67 */     float f1 = (☃.a - this.a);
/*  68 */     float f2 = (☃.b - this.b);
/*  69 */     float f3 = (☃.c - this.c);
/*  70 */     return f1 * f1 + f2 * f2 + f3 * f3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float c(cxb ☃) {
/*  81 */     float f1 = Math.abs(☃.a - this.a);
/*  82 */     float f2 = Math.abs(☃.b - this.b);
/*  83 */     float f3 = Math.abs(☃.c - this.c);
/*  84 */     return f1 + f2 + f3;
/*     */   }
/*     */   
/*     */   public float c(fx ☃) {
/*  88 */     float f1 = Math.abs(☃.u() - this.a);
/*  89 */     float f2 = Math.abs(☃.v() - this.b);
/*  90 */     float f3 = Math.abs(☃.w() - this.c);
/*  91 */     return f1 + f2 + f3;
/*     */   }
/*     */   
/*     */   public fx a() {
/*  95 */     return new fx(this.a, this.b, this.c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 104 */     if (☃ instanceof cxb) {
/* 105 */       cxb cxb1 = (cxb)☃;
/* 106 */       return (this.m == cxb1.m && this.a == cxb1.a && this.b == cxb1.b && this.c == cxb1.c);
/*     */     } 
/* 108 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 113 */     return this.m;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 117 */     return (this.d >= 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 122 */     return "Node{x=" + this.a + ", y=" + this.b + ", z=" + this.c + '}';
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
/*     */   public static cxb b(nf ☃) {
/* 137 */     cxb cxb1 = new cxb(☃.readInt(), ☃.readInt(), ☃.readInt());
/* 138 */     cxb1.j = ☃.readFloat();
/* 139 */     cxb1.k = ☃.readFloat();
/* 140 */     cxb1.i = ☃.readBoolean();
/* 141 */     cxb1.l = cwz.values()[☃.readInt()];
/* 142 */     cxb1.g = ☃.readFloat();
/* 143 */     return cxb1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */