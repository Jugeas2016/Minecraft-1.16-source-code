/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.Set;
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
/*     */ public abstract class r
/*     */   extends cru
/*     */ {
/*  31 */   protected static final ceh a = bup.gq.n();
/*  32 */   protected static final ceh b = bup.gr.n();
/*  33 */   protected static final ceh c = bup.gs.n();
/*     */   
/*  35 */   protected static final ceh d = b;
/*     */   
/*  37 */   protected static final ceh e = bup.gz.n();
/*     */ 
/*     */   
/*  40 */   protected static final ceh f = bup.A.n();
/*  41 */   protected static final Set<buo> g = (Set<buo>)ImmutableSet.builder()
/*  42 */     .add(bup.cD)
/*  43 */     .add(bup.gT)
/*  44 */     .add(bup.kV)
/*  45 */     .add(f.b())
/*  46 */     .build();
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
/*  57 */   protected static final int h = b(2, 0, 0);
/*  58 */   protected static final int i = b(2, 2, 0);
/*  59 */   protected static final int j = b(0, 1, 0);
/*  60 */   protected static final int k = b(4, 1, 0);
/*     */ 
/*     */ 
/*     */   
/*     */   protected crl.v l;
/*     */ 
/*     */ 
/*     */   
/*     */   protected static final int b(int ☃, int i, int j) {
/*  69 */     return i * 25 + j * 5 + ☃;
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
/*     */   public r(clb ☃, int i) {
/*  87 */     super(☃, i);
/*     */   }
/*     */   
/*     */   public r(clb ☃, gc gc1, cra cra1) {
/*  91 */     super(☃, 1);
/*  92 */     a(gc1);
/*  93 */     this.n = cra1;
/*     */   }
/*     */   
/*     */   protected r(clb ☃, int i, gc gc1, crl.v v1, int j, int k, int m) {
/*  97 */     super(☃, i);
/*  98 */     a(gc1);
/*  99 */     this.l = v1;
/*     */     
/* 101 */     int n = crl.v.a(v1);
/* 102 */     int i1 = n % 5;
/* 103 */     int i2 = n / 5 % 5;
/* 104 */     int i3 = n / 25;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     if (gc1 == gc.c || gc1 == gc.d) {
/* 110 */       this.n = new cra(0, 0, 0, j * 8 - 1, k * 4 - 1, m * 8 - 1);
/*     */     } else {
/*     */       
/* 113 */       this.n = new cra(0, 0, 0, m * 8 - 1, k * 4 - 1, j * 8 - 1);
/*     */     } 
/*     */     
/* 116 */     switch (crl.null.a[gc1.ordinal()]) {
/*     */       case 1:
/* 118 */         this.n.a(i1 * 8, i3 * 4, -(i2 + m) * 8 + 1);
/*     */         return;
/*     */       
/*     */       case 2:
/* 122 */         this.n.a(i1 * 8, i3 * 4, i2 * 8);
/*     */         return;
/*     */       case 3:
/* 125 */         this.n.a(-(i2 + m) * 8 + 1, i3 * 4, i1 * 8);
/*     */         return;
/*     */     } 
/* 128 */     this.n.a(i2 * 8, i3 * 4, i1 * 8);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public r(clb ☃, md md1) {
/* 134 */     super(☃, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {}
/*     */ 
/*     */   
/*     */   protected void a(bsr ☃, cra cra1, int i, int j, int k, int m, int n, int i1) {
/* 142 */     for (int i2 = j; i2 <= n; i2++) {
/* 143 */       for (int i3 = i; i3 <= m; i3++) {
/* 144 */         for (int i4 = k; i4 <= i1; i4++) {
/* 145 */           ceh ceh1 = a(☃, i3, i2, i4, cra1);
/* 146 */           if (!g.contains(ceh1.b())) {
/* 147 */             if (d(i2) >= ☃.t_() && ceh1 != f) {
/* 148 */               a(☃, bup.a.n(), i3, i2, i4, cra1);
/*     */             } else {
/* 150 */               a(☃, f, i3, i2, i4, cra1);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(bsr ☃, cra cra1, int i, int j, boolean bool) {
/* 159 */     if (bool) {
/* 160 */       a(☃, cra1, i + 0, 0, j + 0, i + 2, 0, j + 8 - 1, a, a, false);
/* 161 */       a(☃, cra1, i + 5, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/* 162 */       a(☃, cra1, i + 3, 0, j + 0, i + 4, 0, j + 2, a, a, false);
/* 163 */       a(☃, cra1, i + 3, 0, j + 5, i + 4, 0, j + 8 - 1, a, a, false);
/*     */       
/* 165 */       a(☃, cra1, i + 3, 0, j + 2, i + 4, 0, j + 2, b, b, false);
/* 166 */       a(☃, cra1, i + 3, 0, j + 5, i + 4, 0, j + 5, b, b, false);
/* 167 */       a(☃, cra1, i + 2, 0, j + 3, i + 2, 0, j + 4, b, b, false);
/* 168 */       a(☃, cra1, i + 5, 0, j + 3, i + 5, 0, j + 4, b, b, false);
/*     */     } else {
/* 170 */       a(☃, cra1, i + 0, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(bsr ☃, cra cra1, int i, int j, int k, int m, int n, int i1, ceh ceh1) {
/* 175 */     for (int i2 = j; i2 <= n; i2++) {
/* 176 */       for (int i3 = i; i3 <= m; i3++) {
/* 177 */         for (int i4 = k; i4 <= i1; i4++) {
/* 178 */           if (a(☃, i3, i2, i4, cra1) == f)
/*     */           {
/*     */             
/* 181 */             a(☃, ceh1, i3, i2, i4, cra1); } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(cra ☃, int i, int j, int k, int m) {
/* 188 */     int n = a(i, j);
/* 189 */     int i1 = b(i, j);
/* 190 */     int i2 = a(k, m);
/* 191 */     int i3 = b(k, m);
/* 192 */     return ☃.a(Math.min(n, i2), Math.min(i1, i3), Math.max(n, i2), Math.max(i1, i3));
/*     */   }
/*     */   
/*     */   protected boolean a(bsr ☃, cra cra1, int i, int j, int k) {
/* 196 */     int m = a(i, k);
/* 197 */     int n = d(j);
/* 198 */     int i1 = b(i, k);
/*     */     
/* 200 */     if (cra1.b(new fx(m, n, i1))) {
/* 201 */       bdf bdf = aqe.r.a(☃.E());
/* 202 */       bdf.b(bdf.dx());
/* 203 */       bdf.b(m + 0.5D, n, i1 + 0.5D, 0.0F, 0.0F);
/* 204 */       bdf.a(☃, ☃.d(bdf.cB()), aqp.d, (arc)null, (md)null);
/* 205 */       ☃.l(bdf);
/* 206 */       return true;
/*     */     } 
/* 208 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crl$r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */