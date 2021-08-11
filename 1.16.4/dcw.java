/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class dcw
/*     */ {
/*   7 */   private static final gc.a[] d = gc.a.values();
/*     */   
/*     */   protected final int a;
/*     */   protected final int b;
/*     */   protected final int c;
/*     */   
/*     */   protected dcw(int ☃, int i, int j) {
/*  14 */     this.a = ☃;
/*  15 */     this.b = i;
/*  16 */     this.c = j;
/*     */   }
/*     */   
/*     */   public boolean a(fv ☃, int i, int j, int k) {
/*  20 */     return c(☃
/*  21 */         .a(i, j, k, gc.a.a), ☃
/*  22 */         .a(i, j, k, gc.a.b), ☃
/*  23 */         .a(i, j, k, gc.a.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, int i, int j) {
/*  28 */     if (☃ < 0 || i < 0 || j < 0) {
/*  29 */       return false;
/*     */     }
/*  31 */     if (☃ >= this.a || i >= this.b || j >= this.c) {
/*  32 */       return false;
/*     */     }
/*  34 */     return b(☃, i, j);
/*     */   }
/*     */   
/*     */   public boolean b(fv ☃, int i, int j, int k) {
/*  38 */     return b(☃
/*  39 */         .a(i, j, k, gc.a.a), ☃
/*  40 */         .a(i, j, k, gc.a.b), ☃
/*  41 */         .a(i, j, k, gc.a.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract boolean b(int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   public abstract void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2);
/*     */   
/*     */   public boolean a() {
/*  50 */     for (gc.a ☃ : d) {
/*  51 */       if (a(☃) >= b(☃)) {
/*  52 */         return true;
/*     */       }
/*     */     } 
/*  55 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract int a(gc.a parama);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract int b(gc.a parama);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(gc.a ☃, int i, int j) {
/*  83 */     if (i < 0 || j < 0) {
/*  84 */       return 0;
/*     */     }
/*  86 */     gc.a a1 = fv.b.a(☃);
/*  87 */     gc.a a2 = fv.c.a(☃);
/*  88 */     if (i >= c(a1) || j >= c(a2)) {
/*  89 */       return 0;
/*     */     }
/*  91 */     int k = c(☃);
/*  92 */     fv fv = fv.a(gc.a.a, ☃);
/*  93 */     for (int m = k - 1; m >= 0; m--) {
/*  94 */       if (b(fv, m, i, j)) {
/*  95 */         return m + 1;
/*     */       }
/*     */     } 
/*  98 */     return 0;
/*     */   }
/*     */   
/*     */   public int c(gc.a ☃) {
/* 102 */     return ☃.a(this.a, this.b, this.c);
/*     */   }
/*     */   
/*     */   public int b() {
/* 106 */     return c(gc.a.a);
/*     */   }
/*     */   
/*     */   public int c() {
/* 110 */     return c(gc.a.b);
/*     */   }
/*     */   
/*     */   public int d() {
/* 114 */     return c(gc.a.c);
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
/*     */   public void a(b ☃, boolean bool) {
/* 126 */     a(☃, fv.a, bool);
/* 127 */     a(☃, fv.b, bool);
/* 128 */     a(☃, fv.c, bool);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(b ☃, fv fv1, boolean bool) {
/* 136 */     fv fv2 = fv1.a();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 141 */     int i = c(fv2.a(gc.a.a));
/* 142 */     int j = c(fv2.a(gc.a.b));
/* 143 */     int k = c(fv2.a(gc.a.c));
/*     */     
/* 145 */     for (int m = 0; m <= i; m++) {
/* 146 */       for (int n = 0; n <= j; n++) {
/* 147 */         int i1 = -1;
/* 148 */         for (int i2 = 0; i2 <= k; i2++) {
/* 149 */           int i3 = 0;
/*     */           
/* 151 */           int i4 = 0;
/* 152 */           for (int i5 = 0; i5 <= 1; i5++) {
/* 153 */             for (int i6 = 0; i6 <= 1; i6++) {
/* 154 */               if (a(fv2, m + i5 - 1, n + i6 - 1, i2)) {
/* 155 */                 i3++;
/* 156 */                 i4 ^= i5 ^ i6;
/*     */               } 
/*     */             } 
/*     */           } 
/* 160 */           if (i3 == 1 || i3 == 3 || (i3 == 2 && (i4 & 0x1) == 0)) {
/* 161 */             if (bool) {
/*     */               
/* 163 */               if (i1 == -1) {
/* 164 */                 i1 = i2;
/*     */               }
/*     */             } else {
/* 167 */               ☃.consume(fv2
/* 168 */                   .a(m, n, i2, gc.a.a), fv2
/* 169 */                   .a(m, n, i2, gc.a.b), fv2
/* 170 */                   .a(m, n, i2, gc.a.c), fv2
/* 171 */                   .a(m, n, i2 + 1, gc.a.a), fv2
/* 172 */                   .a(m, n, i2 + 1, gc.a.b), fv2
/* 173 */                   .a(m, n, i2 + 1, gc.a.c));
/*     */             }
/*     */           
/* 176 */           } else if (i1 != -1) {
/*     */             
/* 178 */             ☃.consume(fv2
/* 179 */                 .a(m, n, i1, gc.a.a), fv2
/* 180 */                 .a(m, n, i1, gc.a.b), fv2
/* 181 */                 .a(m, n, i1, gc.a.c), fv2
/* 182 */                 .a(m, n, i2, gc.a.a), fv2
/* 183 */                 .a(m, n, i2, gc.a.b), fv2
/* 184 */                 .a(m, n, i2, gc.a.c));
/*     */             
/* 186 */             i1 = -1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃, int i, int j, int k) {
/* 195 */     for (int m = ☃; m < i; m++) {
/* 196 */       if (!c(j, k, m)) {
/* 197 */         return false;
/*     */       }
/*     */     } 
/* 200 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(int ☃, int i, int j, int k, boolean bool) {
/* 204 */     for (int m = ☃; m < i; m++) {
/* 205 */       a(j, k, m, false, bool);
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean a(int ☃, int i, int j, int k, int m) {
/* 210 */     for (int n = ☃; n < i; n++) {
/* 211 */       if (!a(j, k, n, m)) {
/* 212 */         return false;
/*     */       }
/*     */     } 
/* 215 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(b ☃, boolean bool) {
/* 223 */     dcw dcw1 = new dcq(this);
/* 224 */     for (int i = 0; i <= this.a; i++) {
/* 225 */       for (int j = 0; j <= this.b; j++) {
/* 226 */         int k = -1;
/* 227 */         for (int m = 0; m <= this.c; m++) {
/* 228 */           if (dcw1.c(i, j, m)) {
/* 229 */             if (bool) {
/*     */               
/* 231 */               if (k == -1) {
/* 232 */                 k = m;
/*     */               }
/*     */             } else {
/* 235 */               ☃.consume(i, j, m, i + 1, j + 1, m + 1);
/*     */             } 
/* 237 */           } else if (k != -1) {
/*     */ 
/*     */             
/* 240 */             int n = i;
/* 241 */             int i1 = i;
/* 242 */             int i2 = j;
/* 243 */             int i3 = j;
/*     */ 
/*     */             
/* 246 */             dcw1.a(k, m, i, j, false);
/*     */ 
/*     */             
/* 249 */             while (dcw1.a(k, m, n - 1, i2)) {
/* 250 */               dcw1.a(k, m, n - 1, i2, false);
/* 251 */               n--;
/*     */             } 
/* 253 */             while (dcw1.a(k, m, i1 + 1, i2)) {
/* 254 */               dcw1.a(k, m, i1 + 1, i2, false);
/* 255 */               i1++;
/*     */             } 
/*     */ 
/*     */             
/* 259 */             while (dcw1.a(n, i1 + 1, k, m, i2 - 1)) {
/* 260 */               for (int i4 = n; i4 <= i1; i4++) {
/* 261 */                 dcw1.a(k, m, i4, i2 - 1, false);
/*     */               }
/* 263 */               i2--;
/*     */             } 
/* 265 */             while (dcw1.a(n, i1 + 1, k, m, i3 + 1)) {
/* 266 */               for (int i4 = n; i4 <= i1; i4++) {
/* 267 */                 dcw1.a(k, m, i4, i3 + 1, false);
/*     */               }
/* 269 */               i3++;
/*     */             } 
/*     */             
/* 272 */             ☃.consume(n, i2, k, i1 + 1, i3 + 1, m);
/* 273 */             k = -1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(a ☃) {
/* 282 */     a(☃, fv.a);
/* 283 */     a(☃, fv.b);
/* 284 */     a(☃, fv.c);
/*     */   }
/*     */   
/*     */   private void a(a ☃, fv fv1) {
/* 288 */     fv fv2 = fv1.a();
/*     */     
/* 290 */     gc.a a1 = fv2.a(gc.a.c);
/*     */     
/* 292 */     int i = c(fv2.a(gc.a.a));
/* 293 */     int j = c(fv2.a(gc.a.b));
/* 294 */     int k = c(a1);
/*     */     
/* 296 */     gc gc1 = gc.a(a1, gc.b.b);
/* 297 */     gc gc2 = gc.a(a1, gc.b.a);
/*     */     
/* 299 */     for (int m = 0; m < i; m++) {
/* 300 */       for (int n = 0; n < j; n++) {
/* 301 */         boolean bool = false;
/* 302 */         for (int i1 = 0; i1 <= k; i1++) {
/* 303 */           boolean bool1 = (i1 != k && b(fv2, m, n, i1));
/* 304 */           if (!bool && bool1) {
/* 305 */             ☃.consume(gc1, fv2
/*     */                 
/* 307 */                 .a(m, n, i1, gc.a.a), fv2
/* 308 */                 .a(m, n, i1, gc.a.b), fv2
/* 309 */                 .a(m, n, i1, gc.a.c));
/*     */           }
/*     */           
/* 312 */           if (bool && !bool1) {
/* 313 */             ☃.consume(gc2, fv2
/*     */                 
/* 315 */                 .a(m, n, i1 - 1, gc.a.a), fv2
/* 316 */                 .a(m, n, i1 - 1, gc.a.b), fv2
/* 317 */                 .a(m, n, i1 - 1, gc.a.c));
/*     */           }
/*     */           
/* 320 */           bool = bool1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     void consume(gc param1gc, int param1Int1, int param1Int2, int param1Int3);
/*     */   }
/*     */   
/*     */   public static interface b {
/*     */     void consume(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */