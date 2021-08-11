/*     */ import com.google.common.base.MoreObjects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cra
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   public int e;
/*     */   public int f;
/*     */   
/*     */   public cra() {}
/*     */   
/*     */   public cra(int[] ☃) {
/*  23 */     if (☃.length == 6) {
/*  24 */       this.a = ☃[0];
/*  25 */       this.b = ☃[1];
/*  26 */       this.c = ☃[2];
/*  27 */       this.d = ☃[3];
/*  28 */       this.e = ☃[4];
/*  29 */       this.f = ☃[5];
/*     */     } 
/*     */   }
/*     */   
/*     */   public static cra a() {
/*  34 */     return new cra(2147483647, 2147483647, 2147483647, -2147483648, -2147483648, -2147483648);
/*     */   }
/*     */   
/*     */   public static cra b() {
/*  38 */     return new cra(-2147483648, -2147483648, -2147483648, 2147483647, 2147483647, 2147483647);
/*     */   }
/*     */   
/*     */   public static cra a(int ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3, gc gc1) {
/*  42 */     switch (null.a[gc1.ordinal()]) {
/*     */       default:
/*  44 */         return new cra(☃ + k, i + m, j + n, ☃ + i1 - 1 + k, i + i2 - 1 + m, j + i3 - 1 + n);
/*     */       
/*     */       case 1:
/*  47 */         return new cra(☃ + k, i + m, j - i3 + 1 + n, ☃ + i1 - 1 + k, i + i2 - 1 + m, j + n);
/*     */       
/*     */       case 2:
/*  50 */         return new cra(☃ + k, i + m, j + n, ☃ + i1 - 1 + k, i + i2 - 1 + m, j + i3 - 1 + n);
/*     */       
/*     */       case 3:
/*  53 */         return new cra(☃ - i3 + 1 + n, i + m, j + k, ☃ + n, i + i2 - 1 + m, j + i1 - 1 + k);
/*     */       case 4:
/*     */         break;
/*  56 */     }  return new cra(☃ + n, i + m, j + k, ☃ + i3 - 1 + n, i + i2 - 1 + m, j + i1 - 1 + k);
/*     */   }
/*     */ 
/*     */   
/*     */   public static cra a(int ☃, int i, int j, int k, int m, int n) {
/*  61 */     return new cra(Math.min(☃, k), Math.min(i, m), Math.min(j, n), Math.max(☃, k), Math.max(i, m), Math.max(j, n));
/*     */   }
/*     */   
/*     */   public cra(cra ☃) {
/*  65 */     this.a = ☃.a;
/*  66 */     this.b = ☃.b;
/*  67 */     this.c = ☃.c;
/*  68 */     this.d = ☃.d;
/*  69 */     this.e = ☃.e;
/*  70 */     this.f = ☃.f;
/*     */   }
/*     */   
/*     */   public cra(int ☃, int i, int j, int k, int m, int n) {
/*  74 */     this.a = ☃;
/*  75 */     this.b = i;
/*  76 */     this.c = j;
/*  77 */     this.d = k;
/*  78 */     this.e = m;
/*  79 */     this.f = n;
/*     */   }
/*     */   
/*     */   public cra(gr ☃, gr gr1) {
/*  83 */     this.a = Math.min(☃.u(), gr1.u());
/*  84 */     this.b = Math.min(☃.v(), gr1.v());
/*  85 */     this.c = Math.min(☃.w(), gr1.w());
/*  86 */     this.d = Math.max(☃.u(), gr1.u());
/*  87 */     this.e = Math.max(☃.v(), gr1.v());
/*  88 */     this.f = Math.max(☃.w(), gr1.w());
/*     */   }
/*     */   
/*     */   public cra(int ☃, int i, int j, int k) {
/*  92 */     this.a = ☃;
/*  93 */     this.c = i;
/*  94 */     this.d = j;
/*  95 */     this.f = k;
/*     */ 
/*     */     
/*  98 */     this.b = 1;
/*  99 */     this.e = 512;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(cra ☃) {
/* 107 */     return (this.d >= ☃.a && this.a <= ☃.d && this.f >= ☃.c && this.c <= ☃.f && this.e >= ☃.b && this.b <= ☃.e);
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
/*     */   public boolean a(int ☃, int i, int j, int k) {
/* 119 */     return (this.d >= ☃ && this.a <= j && this.f >= i && this.c <= k);
/*     */   }
/*     */   
/*     */   public void c(cra ☃) {
/* 123 */     this.a = Math.min(this.a, ☃.a);
/* 124 */     this.b = Math.min(this.b, ☃.b);
/* 125 */     this.c = Math.min(this.c, ☃.c);
/* 126 */     this.d = Math.max(this.d, ☃.d);
/* 127 */     this.e = Math.max(this.e, ☃.e);
/* 128 */     this.f = Math.max(this.f, ☃.f);
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
/*     */   public void a(int ☃, int i, int j) {
/* 165 */     this.a += ☃;
/* 166 */     this.b += i;
/* 167 */     this.c += j;
/* 168 */     this.d += ☃;
/* 169 */     this.e += i;
/* 170 */     this.f += j;
/*     */   }
/*     */   
/*     */   public cra b(int ☃, int i, int j) {
/* 174 */     return new cra(this.a + ☃, this.b + i, this.c + j, this.d + ☃, this.e + i, this.f + j);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(gr ☃) {
/* 185 */     a(☃.u(), ☃.v(), ☃.w());
/*     */   }
/*     */   
/*     */   public boolean b(gr ☃) {
/* 189 */     return (☃.u() >= this.a && ☃.u() <= this.d && ☃.w() >= this.c && ☃.w() <= this.f && ☃.v() >= this.b && ☃.v() <= this.e);
/*     */   }
/*     */   
/*     */   public gr c() {
/* 193 */     return new gr(this.d - this.a, this.e - this.b, this.f - this.c);
/*     */   }
/*     */   
/*     */   public int d() {
/* 197 */     return this.d - this.a + 1;
/*     */   }
/*     */   
/*     */   public int e() {
/* 201 */     return this.e - this.b + 1;
/*     */   }
/*     */   
/*     */   public int f() {
/* 205 */     return this.f - this.c + 1;
/*     */   }
/*     */   
/*     */   public gr g() {
/* 209 */     return new fx(this.a + (this.d - this.a + 1) / 2, this.b + (this.e - this.b + 1) / 2, this.c + (this.f - this.c + 1) / 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 214 */     return MoreObjects.toStringHelper(this)
/* 215 */       .add("x0", this.a)
/* 216 */       .add("y0", this.b)
/* 217 */       .add("z0", this.c)
/* 218 */       .add("x1", this.d)
/* 219 */       .add("y1", this.e)
/* 220 */       .add("z1", this.f)
/* 221 */       .toString();
/*     */   }
/*     */   
/*     */   public mh h() {
/* 225 */     return new mh(new int[] { this.a, this.b, this.c, this.d, this.e, this.f });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cra.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */