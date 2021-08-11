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
/*     */ public class ayh
/*     */   extends ayj
/*     */ {
/*     */   public ayh(aqn ☃, brx brx1) {
/*  16 */     super(☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected cxf a(int ☃) {
/*  21 */     this.o = new cxa();
/*  22 */     this.o.a(true);
/*  23 */     return new cxf(this.o, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a() {
/*  28 */     return ((r() && p()) || !this.a.br());
/*     */   }
/*     */ 
/*     */   
/*     */   protected dcn b() {
/*  33 */     return this.a.cA();
/*     */   }
/*     */ 
/*     */   
/*     */   public cxd a(aqa ☃, int i) {
/*  38 */     return a(☃.cB(), i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  43 */     this.e++;
/*     */     
/*  45 */     if (this.m) {
/*  46 */       j();
/*     */     }
/*     */     
/*  49 */     if (m()) {
/*     */       return;
/*     */     }
/*     */     
/*  53 */     if (a()) {
/*  54 */       l();
/*  55 */     } else if (this.c != null && !this.c.c()) {
/*  56 */       dcn dcn = this.c.a(this.a);
/*  57 */       if (afm.c(this.a.cD()) == afm.c(dcn.b) && afm.c(this.a.cE()) == afm.c(dcn.c) && afm.c(this.a.cH()) == afm.c(dcn.d)) {
/*  58 */         this.c.a();
/*     */       }
/*     */     } 
/*     */     
/*  62 */     rz.a(this.b, this.a, this.c, this.l);
/*     */     
/*  64 */     if (m()) {
/*     */       return;
/*     */     }
/*  67 */     dcn ☃ = this.c.a(this.a);
/*     */     
/*  69 */     this.a.u().a(☃.b, ☃.c, ☃.d, this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(dcn ☃, dcn dcn1, int i, int j, int k) {
/*  74 */     int m = afm.c(☃.b);
/*  75 */     int n = afm.c(☃.c);
/*  76 */     int i1 = afm.c(☃.d);
/*     */     
/*  78 */     double d1 = dcn1.b - ☃.b;
/*  79 */     double d2 = dcn1.c - ☃.c;
/*  80 */     double d3 = dcn1.d - ☃.d;
/*  81 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  82 */     if (d4 < 1.0E-8D) {
/*  83 */       return false;
/*     */     }
/*     */     
/*  86 */     double d5 = 1.0D / Math.sqrt(d4);
/*  87 */     d1 *= d5;
/*  88 */     d2 *= d5;
/*  89 */     d3 *= d5;
/*     */     
/*  91 */     double d6 = 1.0D / Math.abs(d1);
/*  92 */     double d7 = 1.0D / Math.abs(d2);
/*  93 */     double d8 = 1.0D / Math.abs(d3);
/*     */     
/*  95 */     double d9 = m - ☃.b;
/*  96 */     double d10 = n - ☃.c;
/*  97 */     double d11 = i1 - ☃.d;
/*  98 */     if (d1 >= 0.0D) {
/*  99 */       d9++;
/*     */     }
/* 101 */     if (d2 >= 0.0D) {
/* 102 */       d10++;
/*     */     }
/* 104 */     if (d3 >= 0.0D) {
/* 105 */       d11++;
/*     */     }
/* 107 */     d9 /= d1;
/* 108 */     d10 /= d2;
/* 109 */     d11 /= d3;
/*     */     
/* 111 */     int i2 = (d1 < 0.0D) ? -1 : 1;
/* 112 */     int i3 = (d2 < 0.0D) ? -1 : 1;
/* 113 */     int i4 = (d3 < 0.0D) ? -1 : 1;
/* 114 */     int i5 = afm.c(dcn1.b);
/* 115 */     int i6 = afm.c(dcn1.c);
/* 116 */     int i7 = afm.c(dcn1.d);
/* 117 */     int i8 = i5 - m;
/* 118 */     int i9 = i6 - n;
/* 119 */     int i10 = i7 - i1;
/*     */     
/* 121 */     while (i8 * i2 > 0 || i9 * i3 > 0 || i10 * i4 > 0) {
/* 122 */       if (d9 < d11 && d9 <= d10) {
/* 123 */         d9 += d6;
/* 124 */         m += i2;
/* 125 */         i8 = i5 - m; continue;
/* 126 */       }  if (d10 < d9 && d10 <= d11) {
/* 127 */         d10 += d7;
/* 128 */         n += i3;
/* 129 */         i9 = i6 - n; continue;
/*     */       } 
/* 131 */       d11 += d8;
/* 132 */       i1 += i4;
/* 133 */       i10 = i7 - i1;
/*     */     } 
/*     */     
/* 136 */     return true;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 140 */     this.o.b(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 148 */     this.o.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(fx ☃) {
/* 157 */     return this.b.d_(☃).a(this.b, ☃, this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */