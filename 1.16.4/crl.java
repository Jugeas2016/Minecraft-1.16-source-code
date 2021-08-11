/*      */ import com.google.common.collect.ImmutableSet;
/*      */ import com.google.common.collect.Lists;
/*      */ import java.util.Collections;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class crl
/*      */ {
/*      */   public static abstract class r
/*      */     extends cru
/*      */   {
/*   31 */     protected static final ceh a = bup.gq.n();
/*   32 */     protected static final ceh b = bup.gr.n();
/*   33 */     protected static final ceh c = bup.gs.n();
/*      */     
/*   35 */     protected static final ceh d = b;
/*      */     
/*   37 */     protected static final ceh e = bup.gz.n();
/*      */ 
/*      */     
/*   40 */     protected static final ceh f = bup.A.n();
/*   41 */     protected static final Set<buo> g = (Set<buo>)ImmutableSet.builder()
/*   42 */       .add(bup.cD)
/*   43 */       .add(bup.gT)
/*   44 */       .add(bup.kV)
/*   45 */       .add(f.b())
/*   46 */       .build();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   57 */     protected static final int h = b(2, 0, 0);
/*   58 */     protected static final int i = b(2, 2, 0);
/*   59 */     protected static final int j = b(0, 1, 0);
/*   60 */     protected static final int k = b(4, 1, 0);
/*      */ 
/*      */ 
/*      */     
/*      */     protected crl.v l;
/*      */ 
/*      */ 
/*      */     
/*      */     protected static final int b(int ☃, int i, int j) {
/*   69 */       return i * 25 + j * 5 + ☃;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public r(clb ☃, int i) {
/*   87 */       super(☃, i);
/*      */     }
/*      */     
/*      */     public r(clb ☃, gc gc1, cra cra1) {
/*   91 */       super(☃, 1);
/*   92 */       a(gc1);
/*   93 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     protected r(clb ☃, int i, gc gc1, crl.v v1, int j, int k, int m) {
/*   97 */       super(☃, i);
/*   98 */       a(gc1);
/*   99 */       this.l = v1;
/*      */       
/*  101 */       int n = crl.v.a(v1);
/*  102 */       int i1 = n % 5;
/*  103 */       int i2 = n / 5 % 5;
/*  104 */       int i3 = n / 25;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  109 */       if (gc1 == gc.c || gc1 == gc.d) {
/*  110 */         this.n = new cra(0, 0, 0, j * 8 - 1, k * 4 - 1, m * 8 - 1);
/*      */       } else {
/*      */         
/*  113 */         this.n = new cra(0, 0, 0, m * 8 - 1, k * 4 - 1, j * 8 - 1);
/*      */       } 
/*      */       
/*  116 */       switch (crl.null.a[gc1.ordinal()]) {
/*      */         case 1:
/*  118 */           this.n.a(i1 * 8, i3 * 4, -(i2 + m) * 8 + 1);
/*      */           return;
/*      */         
/*      */         case 2:
/*  122 */           this.n.a(i1 * 8, i3 * 4, i2 * 8);
/*      */           return;
/*      */         case 3:
/*  125 */           this.n.a(-(i2 + m) * 8 + 1, i3 * 4, i1 * 8);
/*      */           return;
/*      */       } 
/*  128 */       this.n.a(i2 * 8, i3 * 4, i1 * 8);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public r(clb ☃, md md1) {
/*  134 */       super(☃, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {}
/*      */ 
/*      */     
/*      */     protected void a(bsr ☃, cra cra1, int i, int j, int k, int m, int n, int i1) {
/*  142 */       for (int i2 = j; i2 <= n; i2++) {
/*  143 */         for (int i3 = i; i3 <= m; i3++) {
/*  144 */           for (int i4 = k; i4 <= i1; i4++) {
/*  145 */             ceh ceh1 = a(☃, i3, i2, i4, cra1);
/*  146 */             if (!g.contains(ceh1.b())) {
/*  147 */               if (d(i2) >= ☃.t_() && ceh1 != f) {
/*  148 */                 a(☃, bup.a.n(), i3, i2, i4, cra1);
/*      */               } else {
/*  150 */                 a(☃, f, i3, i2, i4, cra1);
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     protected void a(bsr ☃, cra cra1, int i, int j, boolean bool) {
/*  159 */       if (bool) {
/*  160 */         a(☃, cra1, i + 0, 0, j + 0, i + 2, 0, j + 8 - 1, a, a, false);
/*  161 */         a(☃, cra1, i + 5, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/*  162 */         a(☃, cra1, i + 3, 0, j + 0, i + 4, 0, j + 2, a, a, false);
/*  163 */         a(☃, cra1, i + 3, 0, j + 5, i + 4, 0, j + 8 - 1, a, a, false);
/*      */         
/*  165 */         a(☃, cra1, i + 3, 0, j + 2, i + 4, 0, j + 2, b, b, false);
/*  166 */         a(☃, cra1, i + 3, 0, j + 5, i + 4, 0, j + 5, b, b, false);
/*  167 */         a(☃, cra1, i + 2, 0, j + 3, i + 2, 0, j + 4, b, b, false);
/*  168 */         a(☃, cra1, i + 5, 0, j + 3, i + 5, 0, j + 4, b, b, false);
/*      */       } else {
/*  170 */         a(☃, cra1, i + 0, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/*      */       } 
/*      */     }
/*      */     
/*      */     protected void a(bsr ☃, cra cra1, int i, int j, int k, int m, int n, int i1, ceh ceh1) {
/*  175 */       for (int i2 = j; i2 <= n; i2++) {
/*  176 */         for (int i3 = i; i3 <= m; i3++) {
/*  177 */           for (int i4 = k; i4 <= i1; i4++) {
/*  178 */             if (a(☃, i3, i2, i4, cra1) == f)
/*      */             {
/*      */               
/*  181 */               a(☃, ceh1, i3, i2, i4, cra1); } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     protected boolean a(cra ☃, int i, int j, int k, int m) {
/*  188 */       int n = a(i, j);
/*  189 */       int i1 = b(i, j);
/*  190 */       int i2 = a(k, m);
/*  191 */       int i3 = b(k, m);
/*  192 */       return ☃.a(Math.min(n, i2), Math.min(i1, i3), Math.max(n, i2), Math.max(i1, i3));
/*      */     }
/*      */     
/*      */     protected boolean a(bsr ☃, cra cra1, int i, int j, int k) {
/*  196 */       int m = a(i, k);
/*  197 */       int n = d(j);
/*  198 */       int i1 = b(i, k);
/*      */       
/*  200 */       if (cra1.b(new fx(m, n, i1))) {
/*  201 */         bdf bdf = aqe.r.a(☃.E());
/*  202 */         bdf.b(bdf.dx());
/*  203 */         bdf.b(m + 0.5D, n, i1 + 0.5D, 0.0F, 0.0F);
/*  204 */         bdf.a(☃, ☃.d(bdf.cB()), aqp.d, (arc)null, (md)null);
/*  205 */         ☃.l(bdf);
/*  206 */         return true;
/*      */       } 
/*  208 */       return false;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class h
/*      */     extends r
/*      */   {
/*      */     private crl.v p;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private crl.v q;
/*      */ 
/*      */ 
/*      */     
/*  228 */     private final List<crl.r> r = Lists.newArrayList();
/*      */     
/*      */     public h(Random ☃, int i, int j, gc gc1) {
/*  231 */       super(clb.M, 0);
/*      */       
/*  233 */       a(gc1);
/*      */       
/*  235 */       gc gc2 = i();
/*  236 */       if (gc2.n() == gc.a.c) {
/*  237 */         this.n = new cra(i, 39, j, i + 58 - 1, 61, j + 58 - 1);
/*      */       } else {
/*  239 */         this.n = new cra(i, 39, j, i + 58 - 1, 61, j + 58 - 1);
/*      */       } 
/*      */       
/*  242 */       List<crl.v> list = a(☃);
/*      */       
/*  244 */       crl.v.a(this.p, true);
/*  245 */       this.r.add(new crl.p(gc2, this.p));
/*  246 */       this.r.add(new crl.j(gc2, this.q));
/*      */       
/*  248 */       List<crl.i> list1 = Lists.newArrayList();
/*  249 */       list1.add(new crl.b());
/*  250 */       list1.add(new crl.d());
/*  251 */       list1.add(new crl.e());
/*  252 */       list1.add(new crl.a());
/*  253 */       list1.add(new crl.c());
/*  254 */       list1.add(new crl.g());
/*  255 */       list1.add(new crl.f());
/*      */       
/*  257 */       for (crl.v v1 : list) {
/*  258 */         if (!crl.v.b(v1) && !v1.b())
/*      */         {
/*  260 */           for (crl.i i2 : list1) {
/*  261 */             if (i2.a(v1)) {
/*  262 */               this.r.add(i2.a(gc2, v1, ☃));
/*      */             }
/*      */           } 
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  270 */       int k = this.n.b;
/*  271 */       int m = a(9, 22);
/*  272 */       int n = b(9, 22);
/*  273 */       for (crl.r r1 : this.r) {
/*  274 */         r1.g().a(m, k, n);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  279 */       cra cra1 = cra.a(a(1, 1), d(1), b(1, 1), a(23, 21), d(8), b(23, 21));
/*  280 */       cra cra2 = cra.a(a(34, 1), d(1), b(34, 1), a(56, 21), d(8), b(56, 21));
/*  281 */       cra cra3 = cra.a(a(22, 22), d(13), b(22, 22), a(35, 35), d(17), b(35, 35));
/*      */ 
/*      */       
/*  284 */       int i1 = ☃.nextInt();
/*  285 */       this.r.add(new crl.u(gc2, cra1, i1++));
/*  286 */       this.r.add(new crl.u(gc2, cra2, i1++));
/*      */       
/*  288 */       this.r.add(new crl.q(gc2, cra3));
/*      */     }
/*      */ 
/*      */     
/*      */     public h(csw ☃, md md1) {
/*  293 */       super(clb.M, md1);
/*      */     }
/*      */     
/*      */     private List<crl.v> a(Random ☃) {
/*  297 */       crl.v[] arrayOfV = new crl.v[75];
/*      */       int i;
/*  299 */       for (i = 0; i < 5; i++) {
/*  300 */         for (int k = 0; k < 4; k++) {
/*  301 */           int m = 0;
/*  302 */           int n = b(i, 0, k);
/*  303 */           arrayOfV[n] = new crl.v(n);
/*      */         } 
/*      */       } 
/*  306 */       for (i = 0; i < 5; i++) {
/*  307 */         for (int k = 0; k < 4; k++) {
/*  308 */           int m = 1;
/*  309 */           int n = b(i, 1, k);
/*  310 */           arrayOfV[n] = new crl.v(n);
/*      */         } 
/*      */       } 
/*  313 */       for (i = 1; i < 4; i++) {
/*  314 */         for (int k = 0; k < 2; k++) {
/*  315 */           int m = 2;
/*  316 */           int n = b(i, 2, k);
/*  317 */           arrayOfV[n] = new crl.v(n);
/*      */         } 
/*      */       } 
/*      */       
/*  321 */       this.p = arrayOfV[h];
/*      */       
/*  323 */       for (i = 0; i < 5; i++) {
/*  324 */         for (int k = 0; k < 5; k++) {
/*  325 */           for (int m = 0; m < 3; m++) {
/*  326 */             int n = b(i, m, k);
/*  327 */             if (arrayOfV[n] != null)
/*      */             {
/*      */               
/*  330 */               for (gc gc : gc.values()) {
/*  331 */                 int i1 = i + gc.i();
/*  332 */                 int i2 = m + gc.j();
/*  333 */                 int i3 = k + gc.k();
/*  334 */                 if (i1 >= 0 && i1 < 5 && i3 >= 0 && i3 < 5 && i2 >= 0 && i2 < 3) {
/*  335 */                   int i4 = b(i1, i2, i3);
/*  336 */                   if (arrayOfV[i4] != null)
/*      */                   {
/*      */                     
/*  339 */                     if (i3 == k) {
/*  340 */                       arrayOfV[n].a(gc, arrayOfV[i4]);
/*      */                     } else {
/*  342 */                       arrayOfV[n].a(gc.f(), arrayOfV[i4]);
/*      */                     }  } 
/*      */                 } 
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*  350 */       crl.v v1 = new crl.v(1003);
/*  351 */       crl.v v2 = new crl.v(1001);
/*  352 */       crl.v v3 = new crl.v(1002);
/*  353 */       arrayOfV[i].a(gc.b, v1);
/*  354 */       arrayOfV[j].a(gc.d, v2);
/*  355 */       arrayOfV[k].a(gc.d, v3);
/*  356 */       crl.v.a(v1, true);
/*  357 */       crl.v.a(v2, true);
/*  358 */       crl.v.a(v3, true);
/*  359 */       crl.v.b(this.p, true);
/*      */ 
/*      */       
/*  362 */       this.q = arrayOfV[b(☃.nextInt(4), 0, 2)];
/*  363 */       crl.v.a(this.q, true);
/*  364 */       crl.v.a(crl.v.c(this.q)[gc.f.c()], true);
/*  365 */       crl.v.a(crl.v.c(this.q)[gc.c.c()], true);
/*  366 */       crl.v.a(crl.v.c(crl.v.c(this.q)[gc.f.c()])[gc.c.c()], true);
/*  367 */       crl.v.a(crl.v.c(this.q)[gc.b.c()], true);
/*  368 */       crl.v.a(crl.v.c(crl.v.c(this.q)[gc.f.c()])[gc.b.c()], true);
/*  369 */       crl.v.a(crl.v.c(crl.v.c(this.q)[gc.c.c()])[gc.b.c()], true);
/*  370 */       crl.v.a(crl.v.c(crl.v.c(crl.v.c(this.q)[gc.f.c()])[gc.c.c()])[gc.b.c()], true);
/*      */       
/*  372 */       List<crl.v> list = Lists.newArrayList();
/*  373 */       for (crl.v v4 : arrayOfV) {
/*  374 */         if (v4 != null) {
/*  375 */           v4.a();
/*  376 */           list.add(v4);
/*      */         } 
/*      */       } 
/*  379 */       v1.a();
/*      */       
/*  381 */       Collections.shuffle(list, ☃);
/*  382 */       int j = 1;
/*  383 */       for (crl.v v4 : list) {
/*      */         
/*  385 */         int k = 0;
/*  386 */         int m = 0;
/*  387 */         while (k < 2 && m < 5) {
/*  388 */           m++;
/*      */           
/*  390 */           int n = ☃.nextInt(6);
/*  391 */           if (crl.v.d(v4)[n]) {
/*  392 */             int i1 = gc.a(n).f().c();
/*      */ 
/*      */             
/*  395 */             crl.v.d(v4)[n] = false;
/*  396 */             crl.v.d(crl.v.c(v4)[n])[i1] = false;
/*      */             
/*  398 */             if (v4.a(j++) && crl.v.c(v4)[n].a(j++)) {
/*  399 */               k++;
/*      */               continue;
/*      */             } 
/*  402 */             crl.v.d(v4)[n] = true;
/*  403 */             crl.v.d(crl.v.c(v4)[n])[i1] = true;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  408 */       list.add(v1);
/*  409 */       list.add(v2);
/*  410 */       list.add(v3);
/*      */       
/*  412 */       return list;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  417 */       int i = Math.max(☃.t_(), 64) - this.n.b;
/*      */       
/*  419 */       a(☃, cra1, 0, 0, 0, 58, i, 58);
/*      */ 
/*      */       
/*  422 */       a(false, 0, ☃, random, cra1);
/*      */ 
/*      */       
/*  425 */       a(true, 33, ☃, random, cra1);
/*      */ 
/*      */       
/*  428 */       a(☃, random, cra1);
/*      */       
/*  430 */       b(☃, random, cra1);
/*  431 */       c(☃, random, cra1);
/*      */       
/*  433 */       d(☃, random, cra1);
/*  434 */       e(☃, random, cra1);
/*  435 */       f(☃, random, cra1);
/*      */       
/*      */       int j;
/*  438 */       for (j = 0; j < 7; j++) {
/*  439 */         for (int k = 0; k < 7; ) {
/*  440 */           if (k == 0 && j == 3)
/*      */           {
/*  442 */             k = 6;
/*      */           }
/*      */           
/*  445 */           int m = j * 9;
/*  446 */           int n = k * 9;
/*  447 */           for (int i1 = 0; i1 < 4; i1++) {
/*  448 */             for (int i2 = 0; i2 < 4; i2++) {
/*  449 */               a(☃, b, m + i1, 0, n + i2, cra1);
/*  450 */               b(☃, b, m + i1, -1, n + i2, cra1);
/*      */             } 
/*      */           } 
/*      */           
/*  454 */           if (j == 0 || j == 6) {
/*  455 */             k++; continue;
/*      */           } 
/*  457 */           k += 6;
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  463 */       for (j = 0; j < 5; j++) {
/*  464 */         a(☃, cra1, -1 - j, 0 + j * 2, -1 - j, -1 - j, 23, 58 + j);
/*  465 */         a(☃, cra1, 58 + j, 0 + j * 2, -1 - j, 58 + j, 23, 58 + j);
/*  466 */         a(☃, cra1, 0 - j, 0 + j * 2, -1 - j, 57 + j, 23, -1 - j);
/*  467 */         a(☃, cra1, 0 - j, 0 + j * 2, 58 + j, 57 + j, 23, 58 + j);
/*      */       } 
/*      */       
/*  470 */       for (crl.r r1 : this.r) {
/*  471 */         if (r1.g().b(cra1)) {
/*  472 */           r1.a(☃, bsn1, cfy1, random, cra1, brd1, fx1);
/*      */         }
/*      */       } 
/*      */       
/*  476 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     private void a(boolean ☃, int i, bsr bsr1, Random random, cra cra1) {
/*  481 */       int j = 24;
/*  482 */       if (a(cra1, i, 0, i + 23, 20)) {
/*  483 */         a(bsr1, cra1, i + 0, 0, 0, i + 24, 0, 20, a, a, false);
/*      */         
/*  485 */         a(bsr1, cra1, i + 0, 1, 0, i + 24, 10, 20);
/*      */         int k;
/*  487 */         for (k = 0; k < 4; k++) {
/*  488 */           a(bsr1, cra1, i + k, k + 1, k, i + k, k + 1, 20, b, b, false);
/*  489 */           a(bsr1, cra1, i + k + 7, k + 5, k + 7, i + k + 7, k + 5, 20, b, b, false);
/*  490 */           a(bsr1, cra1, i + 17 - k, k + 5, k + 7, i + 17 - k, k + 5, 20, b, b, false);
/*  491 */           a(bsr1, cra1, i + 24 - k, k + 1, k, i + 24 - k, k + 1, 20, b, b, false);
/*      */           
/*  493 */           a(bsr1, cra1, i + k + 1, k + 1, k, i + 23 - k, k + 1, k, b, b, false);
/*  494 */           a(bsr1, cra1, i + k + 8, k + 5, k + 7, i + 16 - k, k + 5, k + 7, b, b, false);
/*      */         } 
/*  496 */         a(bsr1, cra1, i + 4, 4, 4, i + 6, 4, 20, a, a, false);
/*  497 */         a(bsr1, cra1, i + 7, 4, 4, i + 17, 4, 6, a, a, false);
/*  498 */         a(bsr1, cra1, i + 18, 4, 4, i + 20, 4, 20, a, a, false);
/*  499 */         a(bsr1, cra1, i + 11, 8, 11, i + 13, 8, 20, a, a, false);
/*  500 */         a(bsr1, d, i + 12, 9, 12, cra1);
/*  501 */         a(bsr1, d, i + 12, 9, 15, cra1);
/*  502 */         a(bsr1, d, i + 12, 9, 18, cra1);
/*      */         
/*  504 */         k = i + (☃ ? 19 : 5);
/*  505 */         int m = i + (☃ ? 5 : 19); int n;
/*  506 */         for (n = 20; n >= 5; n -= 3) {
/*  507 */           a(bsr1, d, k, 5, n, cra1);
/*      */         }
/*  509 */         for (n = 19; n >= 7; n -= 3) {
/*  510 */           a(bsr1, d, m, 5, n, cra1);
/*      */         }
/*  512 */         for (n = 0; n < 4; n++) {
/*  513 */           int i1 = ☃ ? (i + 24 - 17 - n * 3) : (i + 17 - n * 3);
/*  514 */           a(bsr1, d, i1, 5, 5, cra1);
/*      */         } 
/*  516 */         a(bsr1, d, m, 5, 5, cra1);
/*      */ 
/*      */         
/*  519 */         a(bsr1, cra1, i + 11, 1, 12, i + 13, 7, 12, a, a, false);
/*  520 */         a(bsr1, cra1, i + 12, 1, 11, i + 12, 7, 13, a, a, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     private void a(bsr ☃, Random random, cra cra1) {
/*  526 */       if (a(cra1, 22, 5, 35, 17)) {
/*      */         
/*  528 */         a(☃, cra1, 25, 0, 0, 32, 8, 20);
/*      */ 
/*      */         
/*  531 */         for (int i = 0; i < 4; i++) {
/*  532 */           a(☃, cra1, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, b, b, false);
/*  533 */           a(☃, cra1, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, b, b, false);
/*  534 */           a(☃, b, 25, 5, 5 + i * 4, cra1);
/*  535 */           a(☃, b, 26, 6, 5 + i * 4, cra1);
/*  536 */           a(☃, e, 26, 5, 5 + i * 4, cra1);
/*      */           
/*  538 */           a(☃, cra1, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, b, b, false);
/*  539 */           a(☃, cra1, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, b, b, false);
/*  540 */           a(☃, b, 32, 5, 5 + i * 4, cra1);
/*  541 */           a(☃, b, 31, 6, 5 + i * 4, cra1);
/*  542 */           a(☃, e, 31, 5, 5 + i * 4, cra1);
/*      */           
/*  544 */           a(☃, cra1, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, a, a, false);
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void b(bsr ☃, Random random, cra cra1) {
/*  552 */       if (a(cra1, 15, 20, 42, 21)) {
/*  553 */         a(☃, cra1, 15, 0, 21, 42, 0, 21, a, a, false);
/*      */         
/*  555 */         a(☃, cra1, 26, 1, 21, 31, 3, 21);
/*      */ 
/*      */ 
/*      */         
/*  559 */         a(☃, cra1, 21, 12, 21, 36, 12, 21, a, a, false);
/*  560 */         a(☃, cra1, 17, 11, 21, 40, 11, 21, a, a, false);
/*  561 */         a(☃, cra1, 16, 10, 21, 41, 10, 21, a, a, false);
/*  562 */         a(☃, cra1, 15, 7, 21, 42, 9, 21, a, a, false);
/*  563 */         a(☃, cra1, 16, 6, 21, 41, 6, 21, a, a, false);
/*  564 */         a(☃, cra1, 17, 5, 21, 40, 5, 21, a, a, false);
/*  565 */         a(☃, cra1, 21, 4, 21, 36, 4, 21, a, a, false);
/*  566 */         a(☃, cra1, 22, 3, 21, 26, 3, 21, a, a, false);
/*  567 */         a(☃, cra1, 31, 3, 21, 35, 3, 21, a, a, false);
/*  568 */         a(☃, cra1, 23, 2, 21, 25, 2, 21, a, a, false);
/*  569 */         a(☃, cra1, 32, 2, 21, 34, 2, 21, a, a, false);
/*      */ 
/*      */         
/*  572 */         a(☃, cra1, 28, 4, 20, 29, 4, 21, b, b, false);
/*  573 */         a(☃, b, 27, 3, 21, cra1);
/*  574 */         a(☃, b, 30, 3, 21, cra1);
/*  575 */         a(☃, b, 26, 2, 21, cra1);
/*  576 */         a(☃, b, 31, 2, 21, cra1);
/*  577 */         a(☃, b, 25, 1, 21, cra1);
/*  578 */         a(☃, b, 32, 1, 21, cra1); int i;
/*  579 */         for (i = 0; i < 7; i++) {
/*  580 */           a(☃, c, 28 - i, 6 + i, 21, cra1);
/*  581 */           a(☃, c, 29 + i, 6 + i, 21, cra1);
/*      */         } 
/*  583 */         for (i = 0; i < 4; i++) {
/*  584 */           a(☃, c, 28 - i, 9 + i, 21, cra1);
/*  585 */           a(☃, c, 29 + i, 9 + i, 21, cra1);
/*      */         } 
/*  587 */         a(☃, c, 28, 12, 21, cra1);
/*  588 */         a(☃, c, 29, 12, 21, cra1);
/*  589 */         for (i = 0; i < 3; i++) {
/*  590 */           a(☃, c, 22 - i * 2, 8, 21, cra1);
/*  591 */           a(☃, c, 22 - i * 2, 9, 21, cra1);
/*      */           
/*  593 */           a(☃, c, 35 + i * 2, 8, 21, cra1);
/*  594 */           a(☃, c, 35 + i * 2, 9, 21, cra1);
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  599 */         a(☃, cra1, 15, 13, 21, 42, 15, 21);
/*  600 */         a(☃, cra1, 15, 1, 21, 15, 6, 21);
/*  601 */         a(☃, cra1, 16, 1, 21, 16, 5, 21);
/*  602 */         a(☃, cra1, 17, 1, 21, 20, 4, 21);
/*  603 */         a(☃, cra1, 21, 1, 21, 21, 3, 21);
/*  604 */         a(☃, cra1, 22, 1, 21, 22, 2, 21);
/*  605 */         a(☃, cra1, 23, 1, 21, 24, 1, 21);
/*  606 */         a(☃, cra1, 42, 1, 21, 42, 6, 21);
/*  607 */         a(☃, cra1, 41, 1, 21, 41, 5, 21);
/*  608 */         a(☃, cra1, 37, 1, 21, 40, 4, 21);
/*  609 */         a(☃, cra1, 36, 1, 21, 36, 3, 21);
/*  610 */         a(☃, cra1, 33, 1, 21, 34, 1, 21);
/*  611 */         a(☃, cra1, 35, 1, 21, 35, 2, 21);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private void c(bsr ☃, Random random, cra cra1) {
/*  619 */       if (a(cra1, 21, 21, 36, 36)) {
/*  620 */         a(☃, cra1, 21, 0, 22, 36, 0, 36, a, a, false);
/*      */ 
/*      */ 
/*      */         
/*  624 */         a(☃, cra1, 21, 1, 22, 36, 23, 36);
/*      */ 
/*      */         
/*  627 */         for (int i = 0; i < 4; i++) {
/*  628 */           a(☃, cra1, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, b, b, false);
/*  629 */           a(☃, cra1, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, b, b, false);
/*  630 */           a(☃, cra1, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, b, b, false);
/*  631 */           a(☃, cra1, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, b, b, false);
/*      */         } 
/*  633 */         a(☃, cra1, 25, 16, 25, 32, 16, 32, a, a, false);
/*  634 */         a(☃, cra1, 25, 17, 25, 25, 19, 25, b, b, false);
/*  635 */         a(☃, cra1, 32, 17, 25, 32, 19, 25, b, b, false);
/*  636 */         a(☃, cra1, 25, 17, 32, 25, 19, 32, b, b, false);
/*  637 */         a(☃, cra1, 32, 17, 32, 32, 19, 32, b, b, false);
/*      */         
/*  639 */         a(☃, b, 26, 20, 26, cra1);
/*  640 */         a(☃, b, 27, 21, 27, cra1);
/*  641 */         a(☃, e, 27, 20, 27, cra1);
/*  642 */         a(☃, b, 26, 20, 31, cra1);
/*  643 */         a(☃, b, 27, 21, 30, cra1);
/*  644 */         a(☃, e, 27, 20, 30, cra1);
/*  645 */         a(☃, b, 31, 20, 31, cra1);
/*  646 */         a(☃, b, 30, 21, 30, cra1);
/*  647 */         a(☃, e, 30, 20, 30, cra1);
/*  648 */         a(☃, b, 31, 20, 26, cra1);
/*  649 */         a(☃, b, 30, 21, 27, cra1);
/*  650 */         a(☃, e, 30, 20, 27, cra1);
/*      */         
/*  652 */         a(☃, cra1, 28, 21, 27, 29, 21, 27, a, a, false);
/*  653 */         a(☃, cra1, 27, 21, 28, 27, 21, 29, a, a, false);
/*  654 */         a(☃, cra1, 28, 21, 30, 29, 21, 30, a, a, false);
/*  655 */         a(☃, cra1, 30, 21, 28, 30, 21, 29, a, a, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void d(bsr ☃, Random random, cra cra1) {
/*  662 */       if (a(cra1, 0, 21, 6, 58)) {
/*  663 */         a(☃, cra1, 0, 0, 21, 6, 0, 57, a, a, false);
/*      */         
/*  665 */         a(☃, cra1, 0, 1, 21, 6, 7, 57);
/*      */ 
/*      */         
/*  668 */         a(☃, cra1, 4, 4, 21, 6, 4, 53, a, a, false); int i;
/*  669 */         for (i = 0; i < 4; i++) {
/*  670 */           a(☃, cra1, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/*      */         }
/*  672 */         for (i = 23; i < 53; i += 3) {
/*  673 */           a(☃, d, 5, 5, i, cra1);
/*      */         }
/*  675 */         a(☃, d, 5, 5, 52, cra1);
/*      */         
/*  677 */         for (i = 0; i < 4; i++) {
/*  678 */           a(☃, cra1, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/*      */         }
/*      */         
/*  681 */         a(☃, cra1, 4, 1, 52, 6, 3, 52, a, a, false);
/*  682 */         a(☃, cra1, 5, 1, 51, 5, 3, 53, a, a, false);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  687 */       if (a(cra1, 51, 21, 58, 58)) {
/*  688 */         a(☃, cra1, 51, 0, 21, 57, 0, 57, a, a, false);
/*      */         
/*  690 */         a(☃, cra1, 51, 1, 21, 57, 7, 57);
/*      */ 
/*      */         
/*  693 */         a(☃, cra1, 51, 4, 21, 53, 4, 53, a, a, false); int i;
/*  694 */         for (i = 0; i < 4; i++) {
/*  695 */           a(☃, cra1, 57 - i, i + 1, 21, 57 - i, i + 1, 57 - i, b, b, false);
/*      */         }
/*  697 */         for (i = 23; i < 53; i += 3) {
/*  698 */           a(☃, d, 52, 5, i, cra1);
/*      */         }
/*  700 */         a(☃, d, 52, 5, 52, cra1);
/*      */ 
/*      */         
/*  703 */         a(☃, cra1, 51, 1, 52, 53, 3, 52, a, a, false);
/*  704 */         a(☃, cra1, 52, 1, 51, 52, 3, 53, a, a, false);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  709 */       if (a(cra1, 0, 51, 57, 57)) {
/*  710 */         a(☃, cra1, 7, 0, 51, 50, 0, 57, a, a, false);
/*      */         
/*  712 */         a(☃, cra1, 7, 1, 51, 50, 10, 57);
/*      */ 
/*      */         
/*  715 */         for (int i = 0; i < 4; i++) {
/*  716 */           a(☃, cra1, i + 1, i + 1, 57 - i, 56 - i, i + 1, 57 - i, b, b, false);
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void e(bsr ☃, Random random, cra cra1) {
/*  724 */       if (a(cra1, 7, 21, 13, 50)) {
/*  725 */         a(☃, cra1, 7, 0, 21, 13, 0, 50, a, a, false);
/*      */         
/*  727 */         a(☃, cra1, 7, 1, 21, 13, 10, 50);
/*      */ 
/*      */         
/*  730 */         a(☃, cra1, 11, 8, 21, 13, 8, 53, a, a, false); int i;
/*  731 */         for (i = 0; i < 4; i++) {
/*  732 */           a(☃, cra1, i + 7, i + 5, 21, i + 7, i + 5, 54, b, b, false);
/*      */         }
/*  734 */         for (i = 21; i <= 45; i += 3) {
/*  735 */           a(☃, d, 12, 9, i, cra1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  741 */       if (a(cra1, 44, 21, 50, 54)) {
/*  742 */         a(☃, cra1, 44, 0, 21, 50, 0, 50, a, a, false);
/*      */         
/*  744 */         a(☃, cra1, 44, 1, 21, 50, 10, 50);
/*      */ 
/*      */         
/*  747 */         a(☃, cra1, 44, 8, 21, 46, 8, 53, a, a, false); int i;
/*  748 */         for (i = 0; i < 4; i++) {
/*  749 */           a(☃, cra1, 50 - i, i + 5, 21, 50 - i, i + 5, 54, b, b, false);
/*      */         }
/*  751 */         for (i = 21; i <= 45; i += 3) {
/*  752 */           a(☃, d, 45, 9, i, cra1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  758 */       if (a(cra1, 8, 44, 49, 54)) {
/*  759 */         a(☃, cra1, 14, 0, 44, 43, 0, 50, a, a, false);
/*      */         
/*  761 */         a(☃, cra1, 14, 1, 44, 43, 10, 50);
/*      */         
/*      */         int i;
/*  764 */         for (i = 12; i <= 45; i += 3) {
/*  765 */           a(☃, d, i, 9, 45, cra1);
/*  766 */           a(☃, d, i, 9, 52, cra1);
/*  767 */           if (i == 12 || i == 18 || i == 24 || i == 33 || i == 39 || i == 45) {
/*  768 */             a(☃, d, i, 9, 47, cra1);
/*  769 */             a(☃, d, i, 9, 50, cra1);
/*  770 */             a(☃, d, i, 10, 45, cra1);
/*  771 */             a(☃, d, i, 10, 46, cra1);
/*  772 */             a(☃, d, i, 10, 51, cra1);
/*  773 */             a(☃, d, i, 10, 52, cra1);
/*  774 */             a(☃, d, i, 11, 47, cra1);
/*  775 */             a(☃, d, i, 11, 50, cra1);
/*  776 */             a(☃, d, i, 12, 48, cra1);
/*  777 */             a(☃, d, i, 12, 49, cra1);
/*      */           } 
/*      */         } 
/*      */         
/*  781 */         for (i = 0; i < 3; i++) {
/*  782 */           a(☃, cra1, 8 + i, 5 + i, 54, 49 - i, 5 + i, 54, a, a, false);
/*      */         }
/*  784 */         a(☃, cra1, 11, 8, 54, 46, 8, 54, b, b, false);
/*  785 */         a(☃, cra1, 14, 8, 44, 43, 8, 53, a, a, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void f(bsr ☃, Random random, cra cra1) {
/*  792 */       if (a(cra1, 14, 21, 20, 43)) {
/*  793 */         a(☃, cra1, 14, 0, 21, 20, 0, 43, a, a, false);
/*      */         
/*  795 */         a(☃, cra1, 14, 1, 22, 20, 14, 43);
/*      */ 
/*      */         
/*  798 */         a(☃, cra1, 18, 12, 22, 20, 12, 39, a, a, false);
/*  799 */         a(☃, cra1, 18, 12, 21, 20, 12, 21, b, b, false); int i;
/*  800 */         for (i = 0; i < 4; i++) {
/*  801 */           a(☃, cra1, i + 14, i + 9, 21, i + 14, i + 9, 43 - i, b, b, false);
/*      */         }
/*  803 */         for (i = 23; i <= 39; i += 3) {
/*  804 */           a(☃, d, 19, 13, i, cra1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  810 */       if (a(cra1, 37, 21, 43, 43)) {
/*  811 */         a(☃, cra1, 37, 0, 21, 43, 0, 43, a, a, false);
/*      */         
/*  813 */         a(☃, cra1, 37, 1, 22, 43, 14, 43);
/*      */ 
/*      */         
/*  816 */         a(☃, cra1, 37, 12, 22, 39, 12, 39, a, a, false);
/*  817 */         a(☃, cra1, 37, 12, 21, 39, 12, 21, b, b, false); int i;
/*  818 */         for (i = 0; i < 4; i++) {
/*  819 */           a(☃, cra1, 43 - i, i + 9, 21, 43 - i, i + 9, 43 - i, b, b, false);
/*      */         }
/*  821 */         for (i = 23; i <= 39; i += 3) {
/*  822 */           a(☃, d, 38, 13, i, cra1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  828 */       if (a(cra1, 15, 37, 42, 43)) {
/*  829 */         a(☃, cra1, 21, 0, 37, 36, 0, 43, a, a, false);
/*      */         
/*  831 */         a(☃, cra1, 21, 1, 37, 36, 14, 43);
/*      */ 
/*      */         
/*  834 */         a(☃, cra1, 21, 12, 37, 36, 12, 39, a, a, false); int i;
/*  835 */         for (i = 0; i < 4; i++) {
/*  836 */           a(☃, cra1, 15 + i, i + 9, 43 - i, 42 - i, i + 9, 43 - i, b, b, false);
/*      */         }
/*  838 */         for (i = 21; i <= 36; i += 3)
/*  839 */           a(☃, d, i, 13, 38, cra1); 
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public static class p
/*      */     extends r {
/*      */     public p(gc ☃, crl.v v1) {
/*  847 */       super(clb.T, 1, ☃, v1, 1, 1, 1);
/*      */     }
/*      */     
/*      */     public p(csw ☃, md md1) {
/*  851 */       super(clb.T, md1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  857 */       a(☃, cra1, 0, 3, 0, 2, 3, 7, b, b, false);
/*  858 */       a(☃, cra1, 5, 3, 0, 7, 3, 7, b, b, false);
/*  859 */       a(☃, cra1, 0, 2, 0, 1, 2, 7, b, b, false);
/*  860 */       a(☃, cra1, 6, 2, 0, 7, 2, 7, b, b, false);
/*  861 */       a(☃, cra1, 0, 1, 0, 0, 1, 7, b, b, false);
/*  862 */       a(☃, cra1, 7, 1, 0, 7, 1, 7, b, b, false);
/*      */ 
/*      */       
/*  865 */       a(☃, cra1, 0, 1, 7, 7, 3, 7, b, b, false);
/*      */ 
/*      */       
/*  868 */       a(☃, cra1, 1, 1, 0, 2, 3, 0, b, b, false);
/*  869 */       a(☃, cra1, 5, 1, 0, 6, 3, 0, b, b, false);
/*      */       
/*  871 */       if (crl.v.d(this.l)[gc.c.c()]) {
/*  872 */         a(☃, cra1, 3, 1, 7, 4, 2, 7);
/*      */       }
/*  874 */       if (crl.v.d(this.l)[gc.e.c()]) {
/*  875 */         a(☃, cra1, 0, 1, 3, 1, 2, 4);
/*      */       }
/*  877 */       if (crl.v.d(this.l)[gc.f.c()]) {
/*  878 */         a(☃, cra1, 6, 1, 3, 7, 2, 4);
/*      */       }
/*      */       
/*  881 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class s extends r {
/*      */     private int p;
/*      */     
/*      */     public s(gc ☃, crl.v v1, Random random) {
/*  889 */       super(clb.V, 1, ☃, v1, 1, 1, 1);
/*  890 */       this.p = random.nextInt(3);
/*      */     }
/*      */     
/*      */     public s(csw ☃, md md1) {
/*  894 */       super(clb.V, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  899 */       if (crl.v.a(this.l) / 25 > 0) {
/*  900 */         a(☃, cra1, 0, 0, crl.v.d(this.l)[gc.a.c()]);
/*      */       }
/*  902 */       if (crl.v.c(this.l)[gc.b.c()] == null) {
/*  903 */         a(☃, cra1, 1, 4, 1, 6, 4, 6, a);
/*      */       }
/*      */       
/*  906 */       boolean bool = (this.p != 0 && random.nextBoolean() && !crl.v.d(this.l)[gc.a.c()] && !crl.v.d(this.l)[gc.b.c()] && this.l.c() > 1);
/*      */       
/*  908 */       if (this.p == 0) {
/*      */         
/*  910 */         a(☃, cra1, 0, 1, 0, 2, 1, 2, b, b, false);
/*  911 */         a(☃, cra1, 0, 3, 0, 2, 3, 2, b, b, false);
/*  912 */         a(☃, cra1, 0, 2, 0, 0, 2, 2, a, a, false);
/*  913 */         a(☃, cra1, 1, 2, 0, 2, 2, 0, a, a, false);
/*  914 */         a(☃, e, 1, 2, 1, cra1);
/*      */ 
/*      */         
/*  917 */         a(☃, cra1, 5, 1, 0, 7, 1, 2, b, b, false);
/*  918 */         a(☃, cra1, 5, 3, 0, 7, 3, 2, b, b, false);
/*  919 */         a(☃, cra1, 7, 2, 0, 7, 2, 2, a, a, false);
/*  920 */         a(☃, cra1, 5, 2, 0, 6, 2, 0, a, a, false);
/*  921 */         a(☃, e, 6, 2, 1, cra1);
/*      */ 
/*      */         
/*  924 */         a(☃, cra1, 0, 1, 5, 2, 1, 7, b, b, false);
/*  925 */         a(☃, cra1, 0, 3, 5, 2, 3, 7, b, b, false);
/*  926 */         a(☃, cra1, 0, 2, 5, 0, 2, 7, a, a, false);
/*  927 */         a(☃, cra1, 1, 2, 7, 2, 2, 7, a, a, false);
/*  928 */         a(☃, e, 1, 2, 6, cra1);
/*      */ 
/*      */         
/*  931 */         a(☃, cra1, 5, 1, 5, 7, 1, 7, b, b, false);
/*  932 */         a(☃, cra1, 5, 3, 5, 7, 3, 7, b, b, false);
/*  933 */         a(☃, cra1, 7, 2, 5, 7, 2, 7, a, a, false);
/*  934 */         a(☃, cra1, 5, 2, 7, 6, 2, 7, a, a, false);
/*  935 */         a(☃, e, 6, 2, 6, cra1);
/*      */         
/*  937 */         if (crl.v.d(this.l)[gc.d.c()]) {
/*  938 */           a(☃, cra1, 3, 3, 0, 4, 3, 0, b, b, false);
/*      */         } else {
/*  940 */           a(☃, cra1, 3, 3, 0, 4, 3, 1, b, b, false);
/*  941 */           a(☃, cra1, 3, 2, 0, 4, 2, 0, a, a, false);
/*  942 */           a(☃, cra1, 3, 1, 0, 4, 1, 1, b, b, false);
/*      */         } 
/*  944 */         if (crl.v.d(this.l)[gc.c.c()]) {
/*  945 */           a(☃, cra1, 3, 3, 7, 4, 3, 7, b, b, false);
/*      */         } else {
/*  947 */           a(☃, cra1, 3, 3, 6, 4, 3, 7, b, b, false);
/*  948 */           a(☃, cra1, 3, 2, 7, 4, 2, 7, a, a, false);
/*  949 */           a(☃, cra1, 3, 1, 6, 4, 1, 7, b, b, false);
/*      */         } 
/*  951 */         if (crl.v.d(this.l)[gc.e.c()]) {
/*  952 */           a(☃, cra1, 0, 3, 3, 0, 3, 4, b, b, false);
/*      */         } else {
/*  954 */           a(☃, cra1, 0, 3, 3, 1, 3, 4, b, b, false);
/*  955 */           a(☃, cra1, 0, 2, 3, 0, 2, 4, a, a, false);
/*  956 */           a(☃, cra1, 0, 1, 3, 1, 1, 4, b, b, false);
/*      */         } 
/*  958 */         if (crl.v.d(this.l)[gc.f.c()]) {
/*  959 */           a(☃, cra1, 7, 3, 3, 7, 3, 4, b, b, false);
/*      */         } else {
/*  961 */           a(☃, cra1, 6, 3, 3, 7, 3, 4, b, b, false);
/*  962 */           a(☃, cra1, 7, 2, 3, 7, 2, 4, a, a, false);
/*  963 */           a(☃, cra1, 6, 1, 3, 7, 1, 4, b, b, false);
/*      */         } 
/*  965 */       } else if (this.p == 1) {
/*      */         
/*  967 */         a(☃, cra1, 2, 1, 2, 2, 3, 2, b, b, false);
/*  968 */         a(☃, cra1, 2, 1, 5, 2, 3, 5, b, b, false);
/*  969 */         a(☃, cra1, 5, 1, 5, 5, 3, 5, b, b, false);
/*  970 */         a(☃, cra1, 5, 1, 2, 5, 3, 2, b, b, false);
/*  971 */         a(☃, e, 2, 2, 2, cra1);
/*  972 */         a(☃, e, 2, 2, 5, cra1);
/*  973 */         a(☃, e, 5, 2, 5, cra1);
/*  974 */         a(☃, e, 5, 2, 2, cra1);
/*      */ 
/*      */         
/*  977 */         a(☃, cra1, 0, 1, 0, 1, 3, 0, b, b, false);
/*  978 */         a(☃, cra1, 0, 1, 1, 0, 3, 1, b, b, false);
/*  979 */         a(☃, cra1, 0, 1, 7, 1, 3, 7, b, b, false);
/*  980 */         a(☃, cra1, 0, 1, 6, 0, 3, 6, b, b, false);
/*  981 */         a(☃, cra1, 6, 1, 7, 7, 3, 7, b, b, false);
/*  982 */         a(☃, cra1, 7, 1, 6, 7, 3, 6, b, b, false);
/*  983 */         a(☃, cra1, 6, 1, 0, 7, 3, 0, b, b, false);
/*  984 */         a(☃, cra1, 7, 1, 1, 7, 3, 1, b, b, false);
/*  985 */         a(☃, a, 1, 2, 0, cra1);
/*  986 */         a(☃, a, 0, 2, 1, cra1);
/*  987 */         a(☃, a, 1, 2, 7, cra1);
/*  988 */         a(☃, a, 0, 2, 6, cra1);
/*  989 */         a(☃, a, 6, 2, 7, cra1);
/*  990 */         a(☃, a, 7, 2, 6, cra1);
/*  991 */         a(☃, a, 6, 2, 0, cra1);
/*  992 */         a(☃, a, 7, 2, 1, cra1);
/*  993 */         if (!crl.v.d(this.l)[gc.d.c()]) {
/*  994 */           a(☃, cra1, 1, 3, 0, 6, 3, 0, b, b, false);
/*  995 */           a(☃, cra1, 1, 2, 0, 6, 2, 0, a, a, false);
/*  996 */           a(☃, cra1, 1, 1, 0, 6, 1, 0, b, b, false);
/*      */         } 
/*  998 */         if (!crl.v.d(this.l)[gc.c.c()]) {
/*  999 */           a(☃, cra1, 1, 3, 7, 6, 3, 7, b, b, false);
/* 1000 */           a(☃, cra1, 1, 2, 7, 6, 2, 7, a, a, false);
/* 1001 */           a(☃, cra1, 1, 1, 7, 6, 1, 7, b, b, false);
/*      */         } 
/* 1003 */         if (!crl.v.d(this.l)[gc.e.c()]) {
/* 1004 */           a(☃, cra1, 0, 3, 1, 0, 3, 6, b, b, false);
/* 1005 */           a(☃, cra1, 0, 2, 1, 0, 2, 6, a, a, false);
/* 1006 */           a(☃, cra1, 0, 1, 1, 0, 1, 6, b, b, false);
/*      */         } 
/* 1008 */         if (!crl.v.d(this.l)[gc.f.c()]) {
/* 1009 */           a(☃, cra1, 7, 3, 1, 7, 3, 6, b, b, false);
/* 1010 */           a(☃, cra1, 7, 2, 1, 7, 2, 6, a, a, false);
/* 1011 */           a(☃, cra1, 7, 1, 1, 7, 1, 6, b, b, false);
/*      */         } 
/* 1013 */       } else if (this.p == 2) {
/* 1014 */         a(☃, cra1, 0, 1, 0, 0, 1, 7, b, b, false);
/* 1015 */         a(☃, cra1, 7, 1, 0, 7, 1, 7, b, b, false);
/* 1016 */         a(☃, cra1, 1, 1, 0, 6, 1, 0, b, b, false);
/* 1017 */         a(☃, cra1, 1, 1, 7, 6, 1, 7, b, b, false);
/*      */         
/* 1019 */         a(☃, cra1, 0, 2, 0, 0, 2, 7, c, c, false);
/* 1020 */         a(☃, cra1, 7, 2, 0, 7, 2, 7, c, c, false);
/* 1021 */         a(☃, cra1, 1, 2, 0, 6, 2, 0, c, c, false);
/* 1022 */         a(☃, cra1, 1, 2, 7, 6, 2, 7, c, c, false);
/*      */         
/* 1024 */         a(☃, cra1, 0, 3, 0, 0, 3, 7, b, b, false);
/* 1025 */         a(☃, cra1, 7, 3, 0, 7, 3, 7, b, b, false);
/* 1026 */         a(☃, cra1, 1, 3, 0, 6, 3, 0, b, b, false);
/* 1027 */         a(☃, cra1, 1, 3, 7, 6, 3, 7, b, b, false);
/*      */         
/* 1029 */         a(☃, cra1, 0, 1, 3, 0, 2, 4, c, c, false);
/* 1030 */         a(☃, cra1, 7, 1, 3, 7, 2, 4, c, c, false);
/* 1031 */         a(☃, cra1, 3, 1, 0, 4, 2, 0, c, c, false);
/* 1032 */         a(☃, cra1, 3, 1, 7, 4, 2, 7, c, c, false);
/*      */         
/* 1034 */         if (crl.v.d(this.l)[gc.d.c()]) {
/* 1035 */           a(☃, cra1, 3, 1, 0, 4, 2, 0);
/*      */         }
/* 1037 */         if (crl.v.d(this.l)[gc.c.c()]) {
/* 1038 */           a(☃, cra1, 3, 1, 7, 4, 2, 7);
/*      */         }
/* 1040 */         if (crl.v.d(this.l)[gc.e.c()]) {
/* 1041 */           a(☃, cra1, 0, 1, 3, 0, 2, 4);
/*      */         }
/* 1043 */         if (crl.v.d(this.l)[gc.f.c()]) {
/* 1044 */           a(☃, cra1, 7, 1, 3, 7, 2, 4);
/*      */         }
/*      */       } 
/* 1047 */       if (bool) {
/* 1048 */         a(☃, cra1, 3, 1, 3, 4, 1, 4, b, b, false);
/* 1049 */         a(☃, cra1, 3, 2, 3, 4, 2, 4, a, a, false);
/* 1050 */         a(☃, cra1, 3, 3, 3, 4, 3, 4, b, b, false);
/*      */       } 
/*      */       
/* 1053 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class t extends r {
/*      */     public t(gc ☃, crl.v v1) {
/* 1059 */       super(clb.W, 1, ☃, v1, 1, 1, 1);
/*      */     }
/*      */     
/*      */     public t(csw ☃, md md1) {
/* 1063 */       super(clb.W, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1068 */       if (crl.v.a(this.l) / 25 > 0) {
/* 1069 */         a(☃, cra1, 0, 0, crl.v.d(this.l)[gc.a.c()]);
/*      */       }
/* 1071 */       if (crl.v.c(this.l)[gc.b.c()] == null) {
/* 1072 */         a(☃, cra1, 1, 4, 1, 6, 4, 6, a);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1077 */       for (int i = 1; i <= 6; i++) {
/* 1078 */         for (int j = 1; j <= 6; j++) {
/* 1079 */           if (random.nextInt(3) != 0) {
/* 1080 */             int k = 2 + ((random.nextInt(4) == 0) ? 0 : 1);
/* 1081 */             ceh ceh = bup.ao.n();
/* 1082 */             a(☃, cra1, i, k, j, i, 3, j, ceh, ceh, false);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1087 */       a(☃, cra1, 0, 1, 0, 0, 1, 7, b, b, false);
/* 1088 */       a(☃, cra1, 7, 1, 0, 7, 1, 7, b, b, false);
/* 1089 */       a(☃, cra1, 1, 1, 0, 6, 1, 0, b, b, false);
/* 1090 */       a(☃, cra1, 1, 1, 7, 6, 1, 7, b, b, false);
/*      */       
/* 1092 */       a(☃, cra1, 0, 2, 0, 0, 2, 7, c, c, false);
/* 1093 */       a(☃, cra1, 7, 2, 0, 7, 2, 7, c, c, false);
/* 1094 */       a(☃, cra1, 1, 2, 0, 6, 2, 0, c, c, false);
/* 1095 */       a(☃, cra1, 1, 2, 7, 6, 2, 7, c, c, false);
/*      */       
/* 1097 */       a(☃, cra1, 0, 3, 0, 0, 3, 7, b, b, false);
/* 1098 */       a(☃, cra1, 7, 3, 0, 7, 3, 7, b, b, false);
/* 1099 */       a(☃, cra1, 1, 3, 0, 6, 3, 0, b, b, false);
/* 1100 */       a(☃, cra1, 1, 3, 7, 6, 3, 7, b, b, false);
/*      */       
/* 1102 */       a(☃, cra1, 0, 1, 3, 0, 2, 4, c, c, false);
/* 1103 */       a(☃, cra1, 7, 1, 3, 7, 2, 4, c, c, false);
/* 1104 */       a(☃, cra1, 3, 1, 0, 4, 2, 0, c, c, false);
/* 1105 */       a(☃, cra1, 3, 1, 7, 4, 2, 7, c, c, false);
/*      */       
/* 1107 */       if (crl.v.d(this.l)[gc.d.c()]) {
/* 1108 */         a(☃, cra1, 3, 1, 0, 4, 2, 0);
/*      */       }
/*      */ 
/*      */       
/* 1112 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class m extends r {
/*      */     public m(gc ☃, crl.v v1) {
/* 1118 */       super(clb.Q, 1, ☃, v1, 1, 2, 1);
/*      */     }
/*      */     
/*      */     public m(csw ☃, md md1) {
/* 1122 */       super(clb.Q, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1127 */       if (crl.v.a(this.l) / 25 > 0) {
/* 1128 */         a(☃, cra1, 0, 0, crl.v.d(this.l)[gc.a.c()]);
/*      */       }
/* 1130 */       crl.v v1 = crl.v.c(this.l)[gc.b.c()];
/* 1131 */       if (crl.v.c(v1)[gc.b.c()] == null) {
/* 1132 */         a(☃, cra1, 1, 8, 1, 6, 8, 6, a);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1137 */       a(☃, cra1, 0, 4, 0, 0, 4, 7, b, b, false);
/* 1138 */       a(☃, cra1, 7, 4, 0, 7, 4, 7, b, b, false);
/* 1139 */       a(☃, cra1, 1, 4, 0, 6, 4, 0, b, b, false);
/* 1140 */       a(☃, cra1, 1, 4, 7, 6, 4, 7, b, b, false);
/*      */       
/* 1142 */       a(☃, cra1, 2, 4, 1, 2, 4, 2, b, b, false);
/* 1143 */       a(☃, cra1, 1, 4, 2, 1, 4, 2, b, b, false);
/* 1144 */       a(☃, cra1, 5, 4, 1, 5, 4, 2, b, b, false);
/* 1145 */       a(☃, cra1, 6, 4, 2, 6, 4, 2, b, b, false);
/* 1146 */       a(☃, cra1, 2, 4, 5, 2, 4, 6, b, b, false);
/* 1147 */       a(☃, cra1, 1, 4, 5, 1, 4, 5, b, b, false);
/* 1148 */       a(☃, cra1, 5, 4, 5, 5, 4, 6, b, b, false);
/* 1149 */       a(☃, cra1, 6, 4, 5, 6, 4, 5, b, b, false);
/*      */       
/* 1151 */       crl.v v2 = this.l;
/* 1152 */       for (int i = 1; i <= 5; i += 4) {
/* 1153 */         int j = 0;
/* 1154 */         if (crl.v.d(v2)[gc.d.c()]) {
/* 1155 */           a(☃, cra1, 2, i, j, 2, i + 2, j, b, b, false);
/* 1156 */           a(☃, cra1, 5, i, j, 5, i + 2, j, b, b, false);
/* 1157 */           a(☃, cra1, 3, i + 2, j, 4, i + 2, j, b, b, false);
/*      */         } else {
/* 1159 */           a(☃, cra1, 0, i, j, 7, i + 2, j, b, b, false);
/* 1160 */           a(☃, cra1, 0, i + 1, j, 7, i + 1, j, a, a, false);
/*      */         } 
/* 1162 */         j = 7;
/* 1163 */         if (crl.v.d(v2)[gc.c.c()]) {
/* 1164 */           a(☃, cra1, 2, i, j, 2, i + 2, j, b, b, false);
/* 1165 */           a(☃, cra1, 5, i, j, 5, i + 2, j, b, b, false);
/* 1166 */           a(☃, cra1, 3, i + 2, j, 4, i + 2, j, b, b, false);
/*      */         } else {
/* 1168 */           a(☃, cra1, 0, i, j, 7, i + 2, j, b, b, false);
/* 1169 */           a(☃, cra1, 0, i + 1, j, 7, i + 1, j, a, a, false);
/*      */         } 
/* 1171 */         int k = 0;
/* 1172 */         if (crl.v.d(v2)[gc.e.c()]) {
/* 1173 */           a(☃, cra1, k, i, 2, k, i + 2, 2, b, b, false);
/* 1174 */           a(☃, cra1, k, i, 5, k, i + 2, 5, b, b, false);
/* 1175 */           a(☃, cra1, k, i + 2, 3, k, i + 2, 4, b, b, false);
/*      */         } else {
/* 1177 */           a(☃, cra1, k, i, 0, k, i + 2, 7, b, b, false);
/* 1178 */           a(☃, cra1, k, i + 1, 0, k, i + 1, 7, a, a, false);
/*      */         } 
/* 1180 */         k = 7;
/* 1181 */         if (crl.v.d(v2)[gc.f.c()]) {
/* 1182 */           a(☃, cra1, k, i, 2, k, i + 2, 2, b, b, false);
/* 1183 */           a(☃, cra1, k, i, 5, k, i + 2, 5, b, b, false);
/* 1184 */           a(☃, cra1, k, i + 2, 3, k, i + 2, 4, b, b, false);
/*      */         } else {
/* 1186 */           a(☃, cra1, k, i, 0, k, i + 2, 7, b, b, false);
/* 1187 */           a(☃, cra1, k, i + 1, 0, k, i + 1, 7, a, a, false);
/*      */         } 
/* 1189 */         v2 = v1;
/*      */       } 
/*      */ 
/*      */       
/* 1193 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class k extends r {
/*      */     public k(gc ☃, crl.v v1) {
/* 1199 */       super(clb.O, 1, ☃, v1, 2, 1, 1);
/*      */     }
/*      */     
/*      */     public k(csw ☃, md md1) {
/* 1203 */       super(clb.O, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1208 */       crl.v v1 = crl.v.c(this.l)[gc.f.c()];
/* 1209 */       crl.v v2 = this.l;
/* 1210 */       if (crl.v.a(this.l) / 25 > 0) {
/* 1211 */         a(☃, cra1, 8, 0, crl.v.d(v1)[gc.a.c()]);
/* 1212 */         a(☃, cra1, 0, 0, crl.v.d(v2)[gc.a.c()]);
/*      */       } 
/* 1214 */       if (crl.v.c(v2)[gc.b.c()] == null) {
/* 1215 */         a(☃, cra1, 1, 4, 1, 7, 4, 6, a);
/*      */       }
/* 1217 */       if (crl.v.c(v1)[gc.b.c()] == null) {
/* 1218 */         a(☃, cra1, 8, 4, 1, 14, 4, 6, a);
/*      */       }
/*      */ 
/*      */       
/* 1222 */       a(☃, cra1, 0, 3, 0, 0, 3, 7, b, b, false);
/* 1223 */       a(☃, cra1, 15, 3, 0, 15, 3, 7, b, b, false);
/* 1224 */       a(☃, cra1, 1, 3, 0, 15, 3, 0, b, b, false);
/* 1225 */       a(☃, cra1, 1, 3, 7, 14, 3, 7, b, b, false);
/* 1226 */       a(☃, cra1, 0, 2, 0, 0, 2, 7, a, a, false);
/* 1227 */       a(☃, cra1, 15, 2, 0, 15, 2, 7, a, a, false);
/* 1228 */       a(☃, cra1, 1, 2, 0, 15, 2, 0, a, a, false);
/* 1229 */       a(☃, cra1, 1, 2, 7, 14, 2, 7, a, a, false);
/* 1230 */       a(☃, cra1, 0, 1, 0, 0, 1, 7, b, b, false);
/* 1231 */       a(☃, cra1, 15, 1, 0, 15, 1, 7, b, b, false);
/* 1232 */       a(☃, cra1, 1, 1, 0, 15, 1, 0, b, b, false);
/* 1233 */       a(☃, cra1, 1, 1, 7, 14, 1, 7, b, b, false);
/*      */ 
/*      */       
/* 1236 */       a(☃, cra1, 5, 1, 0, 10, 1, 4, b, b, false);
/* 1237 */       a(☃, cra1, 6, 2, 0, 9, 2, 3, a, a, false);
/* 1238 */       a(☃, cra1, 5, 3, 0, 10, 3, 4, b, b, false);
/*      */       
/* 1240 */       a(☃, e, 6, 2, 3, cra1);
/* 1241 */       a(☃, e, 9, 2, 3, cra1);
/*      */ 
/*      */       
/* 1244 */       if (crl.v.d(v2)[gc.d.c()]) {
/* 1245 */         a(☃, cra1, 3, 1, 0, 4, 2, 0);
/*      */       }
/* 1247 */       if (crl.v.d(v2)[gc.c.c()]) {
/* 1248 */         a(☃, cra1, 3, 1, 7, 4, 2, 7);
/*      */       }
/* 1250 */       if (crl.v.d(v2)[gc.e.c()]) {
/* 1251 */         a(☃, cra1, 0, 1, 3, 0, 2, 4);
/*      */       }
/* 1253 */       if (crl.v.d(v1)[gc.d.c()]) {
/* 1254 */         a(☃, cra1, 11, 1, 0, 12, 2, 0);
/*      */       }
/* 1256 */       if (crl.v.d(v1)[gc.c.c()]) {
/* 1257 */         a(☃, cra1, 11, 1, 7, 12, 2, 7);
/*      */       }
/* 1259 */       if (crl.v.d(v1)[gc.f.c()]) {
/* 1260 */         a(☃, cra1, 15, 1, 3, 15, 2, 4);
/*      */       }
/*      */       
/* 1263 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class o extends r {
/*      */     public o(gc ☃, crl.v v1) {
/* 1269 */       super(clb.S, 1, ☃, v1, 1, 1, 2);
/*      */     }
/*      */     
/*      */     public o(csw ☃, md md1) {
/* 1273 */       super(clb.S, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1278 */       crl.v v1 = crl.v.c(this.l)[gc.c.c()];
/* 1279 */       crl.v v2 = this.l;
/* 1280 */       if (crl.v.a(this.l) / 25 > 0) {
/* 1281 */         a(☃, cra1, 0, 8, crl.v.d(v1)[gc.a.c()]);
/* 1282 */         a(☃, cra1, 0, 0, crl.v.d(v2)[gc.a.c()]);
/*      */       } 
/* 1284 */       if (crl.v.c(v2)[gc.b.c()] == null) {
/* 1285 */         a(☃, cra1, 1, 4, 1, 6, 4, 7, a);
/*      */       }
/* 1287 */       if (crl.v.c(v1)[gc.b.c()] == null) {
/* 1288 */         a(☃, cra1, 1, 4, 8, 6, 4, 14, a);
/*      */       }
/*      */ 
/*      */       
/* 1292 */       a(☃, cra1, 0, 3, 0, 0, 3, 15, b, b, false);
/* 1293 */       a(☃, cra1, 7, 3, 0, 7, 3, 15, b, b, false);
/* 1294 */       a(☃, cra1, 1, 3, 0, 7, 3, 0, b, b, false);
/* 1295 */       a(☃, cra1, 1, 3, 15, 6, 3, 15, b, b, false);
/* 1296 */       a(☃, cra1, 0, 2, 0, 0, 2, 15, a, a, false);
/* 1297 */       a(☃, cra1, 7, 2, 0, 7, 2, 15, a, a, false);
/* 1298 */       a(☃, cra1, 1, 2, 0, 7, 2, 0, a, a, false);
/* 1299 */       a(☃, cra1, 1, 2, 15, 6, 2, 15, a, a, false);
/* 1300 */       a(☃, cra1, 0, 1, 0, 0, 1, 15, b, b, false);
/* 1301 */       a(☃, cra1, 7, 1, 0, 7, 1, 15, b, b, false);
/* 1302 */       a(☃, cra1, 1, 1, 0, 7, 1, 0, b, b, false);
/* 1303 */       a(☃, cra1, 1, 1, 15, 6, 1, 15, b, b, false);
/*      */ 
/*      */       
/* 1306 */       a(☃, cra1, 1, 1, 1, 1, 1, 2, b, b, false);
/* 1307 */       a(☃, cra1, 6, 1, 1, 6, 1, 2, b, b, false);
/* 1308 */       a(☃, cra1, 1, 3, 1, 1, 3, 2, b, b, false);
/* 1309 */       a(☃, cra1, 6, 3, 1, 6, 3, 2, b, b, false);
/* 1310 */       a(☃, cra1, 1, 1, 13, 1, 1, 14, b, b, false);
/* 1311 */       a(☃, cra1, 6, 1, 13, 6, 1, 14, b, b, false);
/* 1312 */       a(☃, cra1, 1, 3, 13, 1, 3, 14, b, b, false);
/* 1313 */       a(☃, cra1, 6, 3, 13, 6, 3, 14, b, b, false);
/*      */ 
/*      */       
/* 1316 */       a(☃, cra1, 2, 1, 6, 2, 3, 6, b, b, false);
/* 1317 */       a(☃, cra1, 5, 1, 6, 5, 3, 6, b, b, false);
/* 1318 */       a(☃, cra1, 2, 1, 9, 2, 3, 9, b, b, false);
/* 1319 */       a(☃, cra1, 5, 1, 9, 5, 3, 9, b, b, false);
/*      */       
/* 1321 */       a(☃, cra1, 3, 2, 6, 4, 2, 6, b, b, false);
/* 1322 */       a(☃, cra1, 3, 2, 9, 4, 2, 9, b, b, false);
/* 1323 */       a(☃, cra1, 2, 2, 7, 2, 2, 8, b, b, false);
/* 1324 */       a(☃, cra1, 5, 2, 7, 5, 2, 8, b, b, false);
/*      */       
/* 1326 */       a(☃, e, 2, 2, 5, cra1);
/* 1327 */       a(☃, e, 5, 2, 5, cra1);
/* 1328 */       a(☃, e, 2, 2, 10, cra1);
/* 1329 */       a(☃, e, 5, 2, 10, cra1);
/* 1330 */       a(☃, b, 2, 3, 5, cra1);
/* 1331 */       a(☃, b, 5, 3, 5, cra1);
/* 1332 */       a(☃, b, 2, 3, 10, cra1);
/* 1333 */       a(☃, b, 5, 3, 10, cra1);
/*      */ 
/*      */       
/* 1336 */       if (crl.v.d(v2)[gc.d.c()]) {
/* 1337 */         a(☃, cra1, 3, 1, 0, 4, 2, 0);
/*      */       }
/* 1339 */       if (crl.v.d(v2)[gc.f.c()]) {
/* 1340 */         a(☃, cra1, 7, 1, 3, 7, 2, 4);
/*      */       }
/* 1342 */       if (crl.v.d(v2)[gc.e.c()]) {
/* 1343 */         a(☃, cra1, 0, 1, 3, 0, 2, 4);
/*      */       }
/* 1345 */       if (crl.v.d(v1)[gc.c.c()]) {
/* 1346 */         a(☃, cra1, 3, 1, 15, 4, 2, 15);
/*      */       }
/* 1348 */       if (crl.v.d(v1)[gc.e.c()]) {
/* 1349 */         a(☃, cra1, 0, 1, 11, 0, 2, 12);
/*      */       }
/* 1351 */       if (crl.v.d(v1)[gc.f.c()]) {
/* 1352 */         a(☃, cra1, 7, 1, 11, 7, 2, 12);
/*      */       }
/*      */       
/* 1355 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class l extends r {
/*      */     public l(gc ☃, crl.v v1) {
/* 1361 */       super(clb.P, 1, ☃, v1, 2, 2, 1);
/*      */     }
/*      */     
/*      */     public l(csw ☃, md md1) {
/* 1365 */       super(clb.P, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1370 */       crl.v v1 = crl.v.c(this.l)[gc.f.c()];
/* 1371 */       crl.v v2 = this.l;
/* 1372 */       crl.v v3 = crl.v.c(v2)[gc.b.c()];
/* 1373 */       crl.v v4 = crl.v.c(v1)[gc.b.c()];
/*      */       
/* 1375 */       if (crl.v.a(this.l) / 25 > 0) {
/* 1376 */         a(☃, cra1, 8, 0, crl.v.d(v1)[gc.a.c()]);
/* 1377 */         a(☃, cra1, 0, 0, crl.v.d(v2)[gc.a.c()]);
/*      */       } 
/* 1379 */       if (crl.v.c(v3)[gc.b.c()] == null) {
/* 1380 */         a(☃, cra1, 1, 8, 1, 7, 8, 6, a);
/*      */       }
/* 1382 */       if (crl.v.c(v4)[gc.b.c()] == null) {
/* 1383 */         a(☃, cra1, 8, 8, 1, 14, 8, 6, a);
/*      */       }
/*      */ 
/*      */       
/* 1387 */       for (int i = 1; i <= 7; i++) {
/* 1388 */         ceh ceh = b;
/* 1389 */         if (i == 2 || i == 6) {
/* 1390 */           ceh = a;
/*      */         }
/* 1392 */         a(☃, cra1, 0, i, 0, 0, i, 7, ceh, ceh, false);
/* 1393 */         a(☃, cra1, 15, i, 0, 15, i, 7, ceh, ceh, false);
/* 1394 */         a(☃, cra1, 1, i, 0, 15, i, 0, ceh, ceh, false);
/* 1395 */         a(☃, cra1, 1, i, 7, 14, i, 7, ceh, ceh, false);
/*      */       } 
/*      */ 
/*      */       
/* 1399 */       a(☃, cra1, 2, 1, 3, 2, 7, 4, b, b, false);
/* 1400 */       a(☃, cra1, 3, 1, 2, 4, 7, 2, b, b, false);
/* 1401 */       a(☃, cra1, 3, 1, 5, 4, 7, 5, b, b, false);
/* 1402 */       a(☃, cra1, 13, 1, 3, 13, 7, 4, b, b, false);
/* 1403 */       a(☃, cra1, 11, 1, 2, 12, 7, 2, b, b, false);
/* 1404 */       a(☃, cra1, 11, 1, 5, 12, 7, 5, b, b, false);
/*      */       
/* 1406 */       a(☃, cra1, 5, 1, 3, 5, 3, 4, b, b, false);
/* 1407 */       a(☃, cra1, 10, 1, 3, 10, 3, 4, b, b, false);
/*      */       
/* 1409 */       a(☃, cra1, 5, 7, 2, 10, 7, 5, b, b, false);
/* 1410 */       a(☃, cra1, 5, 5, 2, 5, 7, 2, b, b, false);
/* 1411 */       a(☃, cra1, 10, 5, 2, 10, 7, 2, b, b, false);
/* 1412 */       a(☃, cra1, 5, 5, 5, 5, 7, 5, b, b, false);
/* 1413 */       a(☃, cra1, 10, 5, 5, 10, 7, 5, b, b, false);
/* 1414 */       a(☃, b, 6, 6, 2, cra1);
/* 1415 */       a(☃, b, 9, 6, 2, cra1);
/* 1416 */       a(☃, b, 6, 6, 5, cra1);
/* 1417 */       a(☃, b, 9, 6, 5, cra1);
/*      */       
/* 1419 */       a(☃, cra1, 5, 4, 3, 6, 4, 4, b, b, false);
/* 1420 */       a(☃, cra1, 9, 4, 3, 10, 4, 4, b, b, false);
/* 1421 */       a(☃, e, 5, 4, 2, cra1);
/* 1422 */       a(☃, e, 5, 4, 5, cra1);
/* 1423 */       a(☃, e, 10, 4, 2, cra1);
/* 1424 */       a(☃, e, 10, 4, 5, cra1);
/*      */ 
/*      */       
/* 1427 */       if (crl.v.d(v2)[gc.d.c()]) {
/* 1428 */         a(☃, cra1, 3, 1, 0, 4, 2, 0);
/*      */       }
/* 1430 */       if (crl.v.d(v2)[gc.c.c()]) {
/* 1431 */         a(☃, cra1, 3, 1, 7, 4, 2, 7);
/*      */       }
/* 1433 */       if (crl.v.d(v2)[gc.e.c()]) {
/* 1434 */         a(☃, cra1, 0, 1, 3, 0, 2, 4);
/*      */       }
/* 1436 */       if (crl.v.d(v1)[gc.d.c()]) {
/* 1437 */         a(☃, cra1, 11, 1, 0, 12, 2, 0);
/*      */       }
/* 1439 */       if (crl.v.d(v1)[gc.c.c()]) {
/* 1440 */         a(☃, cra1, 11, 1, 7, 12, 2, 7);
/*      */       }
/* 1442 */       if (crl.v.d(v1)[gc.f.c()]) {
/* 1443 */         a(☃, cra1, 15, 1, 3, 15, 2, 4);
/*      */       }
/* 1445 */       if (crl.v.d(v3)[gc.d.c()]) {
/* 1446 */         a(☃, cra1, 3, 5, 0, 4, 6, 0);
/*      */       }
/* 1448 */       if (crl.v.d(v3)[gc.c.c()]) {
/* 1449 */         a(☃, cra1, 3, 5, 7, 4, 6, 7);
/*      */       }
/* 1451 */       if (crl.v.d(v3)[gc.e.c()]) {
/* 1452 */         a(☃, cra1, 0, 5, 3, 0, 6, 4);
/*      */       }
/* 1454 */       if (crl.v.d(v4)[gc.d.c()]) {
/* 1455 */         a(☃, cra1, 11, 5, 0, 12, 6, 0);
/*      */       }
/* 1457 */       if (crl.v.d(v4)[gc.c.c()]) {
/* 1458 */         a(☃, cra1, 11, 5, 7, 12, 6, 7);
/*      */       }
/* 1460 */       if (crl.v.d(v4)[gc.f.c()]) {
/* 1461 */         a(☃, cra1, 15, 5, 3, 15, 6, 4);
/*      */       }
/*      */       
/* 1464 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class n extends r {
/*      */     public n(gc ☃, crl.v v1) {
/* 1470 */       super(clb.R, 1, ☃, v1, 1, 2, 2);
/*      */     }
/*      */     
/*      */     public n(csw ☃, md md1) {
/* 1474 */       super(clb.R, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1479 */       crl.v v1 = crl.v.c(this.l)[gc.c.c()];
/* 1480 */       crl.v v2 = this.l;
/* 1481 */       crl.v v3 = crl.v.c(v1)[gc.b.c()];
/* 1482 */       crl.v v4 = crl.v.c(v2)[gc.b.c()];
/* 1483 */       if (crl.v.a(this.l) / 25 > 0) {
/* 1484 */         a(☃, cra1, 0, 8, crl.v.d(v1)[gc.a.c()]);
/* 1485 */         a(☃, cra1, 0, 0, crl.v.d(v2)[gc.a.c()]);
/*      */       } 
/* 1487 */       if (crl.v.c(v4)[gc.b.c()] == null) {
/* 1488 */         a(☃, cra1, 1, 8, 1, 6, 8, 7, a);
/*      */       }
/* 1490 */       if (crl.v.c(v3)[gc.b.c()] == null) {
/* 1491 */         a(☃, cra1, 1, 8, 8, 6, 8, 14, a);
/*      */       }
/*      */       
/*      */       int i;
/* 1495 */       for (i = 1; i <= 7; i++) {
/* 1496 */         ceh ceh = b;
/* 1497 */         if (i == 2 || i == 6) {
/* 1498 */           ceh = a;
/*      */         }
/* 1500 */         a(☃, cra1, 0, i, 0, 0, i, 15, ceh, ceh, false);
/* 1501 */         a(☃, cra1, 7, i, 0, 7, i, 15, ceh, ceh, false);
/* 1502 */         a(☃, cra1, 1, i, 0, 6, i, 0, ceh, ceh, false);
/* 1503 */         a(☃, cra1, 1, i, 15, 6, i, 15, ceh, ceh, false);
/*      */       } 
/*      */ 
/*      */       
/* 1507 */       for (i = 1; i <= 7; i++) {
/* 1508 */         ceh ceh = c;
/* 1509 */         if (i == 2 || i == 6) {
/* 1510 */           ceh = e;
/*      */         }
/* 1512 */         a(☃, cra1, 3, i, 7, 4, i, 8, ceh, ceh, false);
/*      */       } 
/*      */ 
/*      */       
/* 1516 */       if (crl.v.d(v2)[gc.d.c()]) {
/* 1517 */         a(☃, cra1, 3, 1, 0, 4, 2, 0);
/*      */       }
/* 1519 */       if (crl.v.d(v2)[gc.f.c()]) {
/* 1520 */         a(☃, cra1, 7, 1, 3, 7, 2, 4);
/*      */       }
/* 1522 */       if (crl.v.d(v2)[gc.e.c()]) {
/* 1523 */         a(☃, cra1, 0, 1, 3, 0, 2, 4);
/*      */       }
/* 1525 */       if (crl.v.d(v1)[gc.c.c()]) {
/* 1526 */         a(☃, cra1, 3, 1, 15, 4, 2, 15);
/*      */       }
/* 1528 */       if (crl.v.d(v1)[gc.e.c()]) {
/* 1529 */         a(☃, cra1, 0, 1, 11, 0, 2, 12);
/*      */       }
/* 1531 */       if (crl.v.d(v1)[gc.f.c()]) {
/* 1532 */         a(☃, cra1, 7, 1, 11, 7, 2, 12);
/*      */       }
/*      */       
/* 1535 */       if (crl.v.d(v4)[gc.d.c()]) {
/* 1536 */         a(☃, cra1, 3, 5, 0, 4, 6, 0);
/*      */       }
/* 1538 */       if (crl.v.d(v4)[gc.f.c()]) {
/* 1539 */         a(☃, cra1, 7, 5, 3, 7, 6, 4);
/* 1540 */         a(☃, cra1, 5, 4, 2, 6, 4, 5, b, b, false);
/* 1541 */         a(☃, cra1, 6, 1, 2, 6, 3, 2, b, b, false);
/* 1542 */         a(☃, cra1, 6, 1, 5, 6, 3, 5, b, b, false);
/*      */       } 
/* 1544 */       if (crl.v.d(v4)[gc.e.c()]) {
/* 1545 */         a(☃, cra1, 0, 5, 3, 0, 6, 4);
/* 1546 */         a(☃, cra1, 1, 4, 2, 2, 4, 5, b, b, false);
/* 1547 */         a(☃, cra1, 1, 1, 2, 1, 3, 2, b, b, false);
/* 1548 */         a(☃, cra1, 1, 1, 5, 1, 3, 5, b, b, false);
/*      */       } 
/* 1550 */       if (crl.v.d(v3)[gc.c.c()]) {
/* 1551 */         a(☃, cra1, 3, 5, 15, 4, 6, 15);
/*      */       }
/* 1553 */       if (crl.v.d(v3)[gc.e.c()]) {
/* 1554 */         a(☃, cra1, 0, 5, 11, 0, 6, 12);
/* 1555 */         a(☃, cra1, 1, 4, 10, 2, 4, 13, b, b, false);
/* 1556 */         a(☃, cra1, 1, 1, 10, 1, 3, 10, b, b, false);
/* 1557 */         a(☃, cra1, 1, 1, 13, 1, 3, 13, b, b, false);
/*      */       } 
/* 1559 */       if (crl.v.d(v3)[gc.f.c()]) {
/* 1560 */         a(☃, cra1, 7, 5, 11, 7, 6, 12);
/* 1561 */         a(☃, cra1, 5, 4, 10, 6, 4, 13, b, b, false);
/* 1562 */         a(☃, cra1, 6, 1, 10, 6, 3, 10, b, b, false);
/* 1563 */         a(☃, cra1, 6, 1, 13, 6, 3, 13, b, b, false);
/*      */       } 
/*      */       
/* 1566 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class j extends r {
/*      */     public j(gc ☃, crl.v v1) {
/* 1572 */       super(clb.N, 1, ☃, v1, 2, 2, 2);
/*      */     }
/*      */     
/*      */     public j(csw ☃, md md1) {
/* 1576 */       super(clb.N, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1581 */       a(☃, cra1, 1, 8, 0, 14, 8, 14, a);
/*      */ 
/*      */ 
/*      */       
/* 1585 */       int i = 7;
/* 1586 */       ceh ceh = b;
/* 1587 */       a(☃, cra1, 0, 7, 0, 0, 7, 15, ceh, ceh, false);
/* 1588 */       a(☃, cra1, 15, 7, 0, 15, 7, 15, ceh, ceh, false);
/* 1589 */       a(☃, cra1, 1, 7, 0, 15, 7, 0, ceh, ceh, false);
/* 1590 */       a(☃, cra1, 1, 7, 15, 14, 7, 15, ceh, ceh, false);
/*      */       
/* 1592 */       for (i = 1; i <= 6; i++) {
/* 1593 */         ceh = b;
/* 1594 */         if (i == 2 || i == 6) {
/* 1595 */           ceh = a;
/*      */         }
/*      */         
/* 1598 */         for (int k = 0; k <= 15; k += 15) {
/* 1599 */           a(☃, cra1, k, i, 0, k, i, 1, ceh, ceh, false);
/* 1600 */           a(☃, cra1, k, i, 6, k, i, 9, ceh, ceh, false);
/* 1601 */           a(☃, cra1, k, i, 14, k, i, 15, ceh, ceh, false);
/*      */         } 
/* 1603 */         a(☃, cra1, 1, i, 0, 1, i, 0, ceh, ceh, false);
/* 1604 */         a(☃, cra1, 6, i, 0, 9, i, 0, ceh, ceh, false);
/* 1605 */         a(☃, cra1, 14, i, 0, 14, i, 0, ceh, ceh, false);
/*      */         
/* 1607 */         a(☃, cra1, 1, i, 15, 14, i, 15, ceh, ceh, false);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1612 */       a(☃, cra1, 6, 3, 6, 9, 6, 9, c, c, false);
/* 1613 */       a(☃, cra1, 7, 4, 7, 8, 5, 8, bup.bE.n(), bup.bE.n(), false);
/* 1614 */       for (i = 3; i <= 6; i += 3) {
/* 1615 */         for (int k = 6; k <= 9; k += 3) {
/* 1616 */           a(☃, e, k, i, 6, cra1);
/* 1617 */           a(☃, e, k, i, 9, cra1);
/*      */         } 
/*      */       } 
/*      */       
/* 1621 */       a(☃, cra1, 5, 1, 6, 5, 2, 6, b, b, false);
/* 1622 */       a(☃, cra1, 5, 1, 9, 5, 2, 9, b, b, false);
/* 1623 */       a(☃, cra1, 10, 1, 6, 10, 2, 6, b, b, false);
/* 1624 */       a(☃, cra1, 10, 1, 9, 10, 2, 9, b, b, false);
/* 1625 */       a(☃, cra1, 6, 1, 5, 6, 2, 5, b, b, false);
/* 1626 */       a(☃, cra1, 9, 1, 5, 9, 2, 5, b, b, false);
/* 1627 */       a(☃, cra1, 6, 1, 10, 6, 2, 10, b, b, false);
/* 1628 */       a(☃, cra1, 9, 1, 10, 9, 2, 10, b, b, false);
/*      */       
/* 1630 */       a(☃, cra1, 5, 2, 5, 5, 6, 5, b, b, false);
/* 1631 */       a(☃, cra1, 5, 2, 10, 5, 6, 10, b, b, false);
/* 1632 */       a(☃, cra1, 10, 2, 5, 10, 6, 5, b, b, false);
/* 1633 */       a(☃, cra1, 10, 2, 10, 10, 6, 10, b, b, false);
/*      */       
/* 1635 */       a(☃, cra1, 5, 7, 1, 5, 7, 6, b, b, false);
/* 1636 */       a(☃, cra1, 10, 7, 1, 10, 7, 6, b, b, false);
/* 1637 */       a(☃, cra1, 5, 7, 9, 5, 7, 14, b, b, false);
/* 1638 */       a(☃, cra1, 10, 7, 9, 10, 7, 14, b, b, false);
/*      */       
/* 1640 */       a(☃, cra1, 1, 7, 5, 6, 7, 5, b, b, false);
/* 1641 */       a(☃, cra1, 1, 7, 10, 6, 7, 10, b, b, false);
/* 1642 */       a(☃, cra1, 9, 7, 5, 14, 7, 5, b, b, false);
/* 1643 */       a(☃, cra1, 9, 7, 10, 14, 7, 10, b, b, false);
/*      */ 
/*      */       
/* 1646 */       a(☃, cra1, 2, 1, 2, 2, 1, 3, b, b, false);
/* 1647 */       a(☃, cra1, 3, 1, 2, 3, 1, 2, b, b, false);
/* 1648 */       a(☃, cra1, 13, 1, 2, 13, 1, 3, b, b, false);
/* 1649 */       a(☃, cra1, 12, 1, 2, 12, 1, 2, b, b, false);
/* 1650 */       a(☃, cra1, 2, 1, 12, 2, 1, 13, b, b, false);
/* 1651 */       a(☃, cra1, 3, 1, 13, 3, 1, 13, b, b, false);
/* 1652 */       a(☃, cra1, 13, 1, 12, 13, 1, 13, b, b, false);
/* 1653 */       a(☃, cra1, 12, 1, 13, 12, 1, 13, b, b, false);
/*      */       
/* 1655 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class u extends r {
/*      */     private int p;
/*      */     
/*      */     public u(gc ☃, cra cra1, int i) {
/* 1663 */       super(clb.X, ☃, cra1);
/* 1664 */       this.p = i & 0x1;
/*      */     }
/*      */     
/*      */     public u(csw ☃, md md1) {
/* 1668 */       super(clb.X, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1673 */       if (this.p == 0) {
/* 1674 */         int i; for (i = 0; i < 4; i++) {
/* 1675 */           a(☃, cra1, 10 - i, 3 - i, 20 - i, 12 + i, 3 - i, 20, b, b, false);
/*      */         }
/* 1677 */         a(☃, cra1, 7, 0, 6, 15, 0, 16, b, b, false);
/* 1678 */         a(☃, cra1, 6, 0, 6, 6, 3, 20, b, b, false);
/* 1679 */         a(☃, cra1, 16, 0, 6, 16, 3, 20, b, b, false);
/* 1680 */         a(☃, cra1, 7, 1, 7, 7, 1, 20, b, b, false);
/* 1681 */         a(☃, cra1, 15, 1, 7, 15, 1, 20, b, b, false);
/*      */         
/* 1683 */         a(☃, cra1, 7, 1, 6, 9, 3, 6, b, b, false);
/* 1684 */         a(☃, cra1, 13, 1, 6, 15, 3, 6, b, b, false);
/* 1685 */         a(☃, cra1, 8, 1, 7, 9, 1, 7, b, b, false);
/* 1686 */         a(☃, cra1, 13, 1, 7, 14, 1, 7, b, b, false);
/* 1687 */         a(☃, cra1, 9, 0, 5, 13, 0, 5, b, b, false);
/*      */         
/* 1689 */         a(☃, cra1, 10, 0, 7, 12, 0, 7, c, c, false);
/* 1690 */         a(☃, cra1, 8, 0, 10, 8, 0, 12, c, c, false);
/* 1691 */         a(☃, cra1, 14, 0, 10, 14, 0, 12, c, c, false);
/*      */         
/* 1693 */         for (i = 18; i >= 7; i -= 3) {
/* 1694 */           a(☃, e, 6, 3, i, cra1);
/* 1695 */           a(☃, e, 16, 3, i, cra1);
/*      */         } 
/* 1697 */         a(☃, e, 10, 0, 10, cra1);
/* 1698 */         a(☃, e, 12, 0, 10, cra1);
/* 1699 */         a(☃, e, 10, 0, 12, cra1);
/* 1700 */         a(☃, e, 12, 0, 12, cra1);
/*      */         
/* 1702 */         a(☃, e, 8, 3, 6, cra1);
/* 1703 */         a(☃, e, 14, 3, 6, cra1);
/*      */ 
/*      */         
/* 1706 */         a(☃, b, 4, 2, 4, cra1);
/* 1707 */         a(☃, e, 4, 1, 4, cra1);
/* 1708 */         a(☃, b, 4, 0, 4, cra1);
/*      */         
/* 1710 */         a(☃, b, 18, 2, 4, cra1);
/* 1711 */         a(☃, e, 18, 1, 4, cra1);
/* 1712 */         a(☃, b, 18, 0, 4, cra1);
/*      */         
/* 1714 */         a(☃, b, 4, 2, 18, cra1);
/* 1715 */         a(☃, e, 4, 1, 18, cra1);
/* 1716 */         a(☃, b, 4, 0, 18, cra1);
/*      */         
/* 1718 */         a(☃, b, 18, 2, 18, cra1);
/* 1719 */         a(☃, e, 18, 1, 18, cra1);
/* 1720 */         a(☃, b, 18, 0, 18, cra1);
/*      */ 
/*      */         
/* 1723 */         a(☃, b, 9, 7, 20, cra1);
/* 1724 */         a(☃, b, 13, 7, 20, cra1);
/* 1725 */         a(☃, cra1, 6, 0, 21, 7, 4, 21, b, b, false);
/* 1726 */         a(☃, cra1, 15, 0, 21, 16, 4, 21, b, b, false);
/*      */         
/* 1728 */         a(☃, cra1, 11, 2, 16);
/* 1729 */       } else if (this.p == 1) {
/* 1730 */         a(☃, cra1, 9, 3, 18, 13, 3, 20, b, b, false);
/* 1731 */         a(☃, cra1, 9, 0, 18, 9, 2, 18, b, b, false);
/* 1732 */         a(☃, cra1, 13, 0, 18, 13, 2, 18, b, b, false);
/* 1733 */         int i = 9;
/* 1734 */         int j = 20;
/* 1735 */         int k = 5; int m;
/* 1736 */         for (m = 0; m < 2; m++) {
/* 1737 */           a(☃, b, i, 6, 20, cra1);
/* 1738 */           a(☃, e, i, 5, 20, cra1);
/* 1739 */           a(☃, b, i, 4, 20, cra1);
/* 1740 */           i = 13;
/*      */         } 
/*      */         
/* 1743 */         a(☃, cra1, 7, 3, 7, 15, 3, 14, b, b, false);
/* 1744 */         i = 10;
/* 1745 */         for (m = 0; m < 2; m++) {
/* 1746 */           a(☃, cra1, i, 0, 10, i, 6, 10, b, b, false);
/* 1747 */           a(☃, cra1, i, 0, 12, i, 6, 12, b, b, false);
/* 1748 */           a(☃, e, i, 0, 10, cra1);
/* 1749 */           a(☃, e, i, 0, 12, cra1);
/* 1750 */           a(☃, e, i, 4, 10, cra1);
/* 1751 */           a(☃, e, i, 4, 12, cra1);
/* 1752 */           i = 12;
/*      */         } 
/* 1754 */         i = 8;
/* 1755 */         for (m = 0; m < 2; m++) {
/* 1756 */           a(☃, cra1, i, 0, 7, i, 2, 7, b, b, false);
/* 1757 */           a(☃, cra1, i, 0, 14, i, 2, 14, b, b, false);
/* 1758 */           i = 14;
/*      */         } 
/* 1760 */         a(☃, cra1, 8, 3, 8, 8, 3, 13, c, c, false);
/* 1761 */         a(☃, cra1, 14, 3, 8, 14, 3, 13, c, c, false);
/*      */         
/* 1763 */         a(☃, cra1, 11, 5, 13);
/*      */       } 
/*      */       
/* 1766 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class q extends r {
/*      */     public q(gc ☃, cra cra1) {
/* 1772 */       super(clb.U, ☃, cra1);
/*      */     }
/*      */     
/*      */     public q(csw ☃, md md1) {
/* 1776 */       super(clb.U, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1781 */       a(☃, cra1, 2, -1, 2, 11, -1, 11, b, b, false);
/* 1782 */       a(☃, cra1, 0, -1, 0, 1, -1, 11, a, a, false);
/* 1783 */       a(☃, cra1, 12, -1, 0, 13, -1, 11, a, a, false);
/* 1784 */       a(☃, cra1, 2, -1, 0, 11, -1, 1, a, a, false);
/* 1785 */       a(☃, cra1, 2, -1, 12, 11, -1, 13, a, a, false);
/*      */       
/* 1787 */       a(☃, cra1, 0, 0, 0, 0, 0, 13, b, b, false);
/* 1788 */       a(☃, cra1, 13, 0, 0, 13, 0, 13, b, b, false);
/* 1789 */       a(☃, cra1, 1, 0, 0, 12, 0, 0, b, b, false);
/* 1790 */       a(☃, cra1, 1, 0, 13, 12, 0, 13, b, b, false);
/*      */       int i;
/* 1792 */       for (i = 2; i <= 11; i += 3) {
/* 1793 */         a(☃, e, 0, 0, i, cra1);
/* 1794 */         a(☃, e, 13, 0, i, cra1);
/* 1795 */         a(☃, e, i, 0, 0, cra1);
/*      */       } 
/*      */       
/* 1798 */       a(☃, cra1, 2, 0, 3, 4, 0, 9, b, b, false);
/* 1799 */       a(☃, cra1, 9, 0, 3, 11, 0, 9, b, b, false);
/* 1800 */       a(☃, cra1, 4, 0, 9, 9, 0, 11, b, b, false);
/* 1801 */       a(☃, b, 5, 0, 8, cra1);
/* 1802 */       a(☃, b, 8, 0, 8, cra1);
/* 1803 */       a(☃, b, 10, 0, 10, cra1);
/* 1804 */       a(☃, b, 3, 0, 10, cra1);
/* 1805 */       a(☃, cra1, 3, 0, 3, 3, 0, 7, c, c, false);
/* 1806 */       a(☃, cra1, 10, 0, 3, 10, 0, 7, c, c, false);
/* 1807 */       a(☃, cra1, 6, 0, 10, 7, 0, 10, c, c, false);
/*      */       
/* 1809 */       i = 3;
/* 1810 */       for (int j = 0; j < 2; j++) {
/* 1811 */         for (int k = 2; k <= 8; k += 3) {
/* 1812 */           a(☃, cra1, i, 0, k, i, 2, k, b, b, false);
/*      */         }
/* 1814 */         i = 10;
/*      */       } 
/* 1816 */       a(☃, cra1, 5, 0, 10, 5, 2, 10, b, b, false);
/* 1817 */       a(☃, cra1, 8, 0, 10, 8, 2, 10, b, b, false);
/*      */       
/* 1819 */       a(☃, cra1, 6, -1, 7, 7, -1, 8, c, c, false);
/*      */ 
/*      */       
/* 1822 */       a(☃, cra1, 6, -1, 3, 7, -1, 4);
/*      */       
/* 1824 */       a(☃, cra1, 6, 1, 6);
/*      */       
/* 1826 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   static class v {
/*      */     private final int a;
/* 1832 */     private final v[] b = new v[6];
/* 1833 */     private final boolean[] c = new boolean[6];
/*      */     private boolean d;
/*      */     private boolean e;
/*      */     private int f;
/*      */     
/*      */     public v(int ☃) {
/* 1839 */       this.a = ☃;
/*      */     }
/*      */     
/*      */     public void a(gc ☃, v v1) {
/* 1843 */       this.b[☃.c()] = v1;
/* 1844 */       v1.b[☃.f().c()] = this;
/*      */     }
/*      */     
/*      */     public void a() {
/* 1848 */       for (int ☃ = 0; ☃ < 6; ☃++) {
/* 1849 */         this.c[☃] = (this.b[☃] != null);
/*      */       }
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/* 1854 */       if (this.e) {
/* 1855 */         return true;
/*      */       }
/* 1857 */       this.f = ☃;
/* 1858 */       for (int i = 0; i < 6; i++) {
/* 1859 */         if (this.b[i] != null && this.c[i] && 
/* 1860 */           (this.b[i]).f != ☃ && this.b[i].a(☃)) {
/* 1861 */           return true;
/*      */         }
/*      */       } 
/*      */       
/* 1865 */       return false;
/*      */     }
/*      */     
/*      */     public boolean b() {
/* 1869 */       return (this.a >= 75);
/*      */     }
/*      */     
/*      */     public int c() {
/* 1873 */       int ☃ = 0;
/* 1874 */       for (int i = 0; i < 6; i++) {
/* 1875 */         if (this.c[i]) {
/* 1876 */           ☃++;
/*      */         }
/*      */       } 
/* 1879 */       return ☃;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static class f
/*      */     implements i
/*      */   {
/*      */     private f() {}
/*      */ 
/*      */     
/*      */     public boolean a(crl.v ☃) {
/* 1892 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public crl.r a(gc ☃, crl.v v1, Random random) {
/* 1897 */       crl.v.a(v1, true);
/* 1898 */       return new crl.s(☃, v1, random);
/*      */     }
/*      */   }
/*      */   
/*      */   static class g implements i { private g() {}
/*      */     
/*      */     public boolean a(crl.v ☃) {
/* 1905 */       return (!crl.v.d(☃)[gc.e.c()] && !crl.v.d(☃)[gc.f.c()] && !crl.v.d(☃)[gc.c.c()] && !crl.v.d(☃)[gc.d.c()] && !crl.v.d(☃)[gc.b.c()]);
/*      */     }
/*      */ 
/*      */     
/*      */     public crl.r a(gc ☃, crl.v v1, Random random) {
/* 1910 */       crl.v.a(v1, true);
/* 1911 */       return new crl.t(☃, v1);
/*      */     } }
/*      */   
/*      */   static class c implements i {
/*      */     private c() {}
/*      */     
/*      */     public boolean a(crl.v ☃) {
/* 1918 */       return (crl.v.d(☃)[gc.b.c()] && !crl.v.b(crl.v.c(☃)[gc.b.c()]));
/*      */     }
/*      */ 
/*      */     
/*      */     public crl.r a(gc ☃, crl.v v1, Random random) {
/* 1923 */       crl.v.a(v1, true);
/* 1924 */       crl.v.a(crl.v.c(v1)[gc.b.c()], true);
/* 1925 */       return new crl.m(☃, v1);
/*      */     }
/*      */   }
/*      */   
/*      */   static class a implements i { private a() {}
/*      */     
/*      */     public boolean a(crl.v ☃) {
/* 1932 */       return (crl.v.d(☃)[gc.f.c()] && !crl.v.b(crl.v.c(☃)[gc.f.c()]));
/*      */     }
/*      */ 
/*      */     
/*      */     public crl.r a(gc ☃, crl.v v1, Random random) {
/* 1937 */       crl.v.a(v1, true);
/* 1938 */       crl.v.a(crl.v.c(v1)[gc.f.c()], true);
/* 1939 */       return new crl.k(☃, v1);
/*      */     } }
/*      */   
/*      */   static class e implements i {
/*      */     private e() {}
/*      */     
/*      */     public boolean a(crl.v ☃) {
/* 1946 */       return (crl.v.d(☃)[gc.c.c()] && !crl.v.b(crl.v.c(☃)[gc.c.c()]));
/*      */     }
/*      */ 
/*      */     
/*      */     public crl.r a(gc ☃, crl.v v1, Random random) {
/* 1951 */       crl.v v2 = v1;
/* 1952 */       if (!crl.v.d(v1)[gc.c.c()] || crl.v.b(crl.v.c(v1)[gc.c.c()])) {
/* 1953 */         v2 = crl.v.c(v1)[gc.d.c()];
/*      */       }
/* 1955 */       crl.v.a(v2, true);
/* 1956 */       crl.v.a(crl.v.c(v2)[gc.c.c()], true);
/* 1957 */       return new crl.o(☃, v2);
/*      */     }
/*      */   }
/*      */   
/*      */   static class b implements i { private b() {}
/*      */     
/*      */     public boolean a(crl.v ☃) {
/* 1964 */       if (crl.v.d(☃)[gc.f.c()] && !crl.v.b(crl.v.c(☃)[gc.f.c()]) && 
/* 1965 */         crl.v.d(☃)[gc.b.c()] && !crl.v.b(crl.v.c(☃)[gc.b.c()])) {
/* 1966 */         crl.v v1 = crl.v.c(☃)[gc.f.c()];
/*      */         
/* 1968 */         return (crl.v.d(v1)[gc.b.c()] && !crl.v.b(crl.v.c(v1)[gc.b.c()]));
/*      */       } 
/*      */       
/* 1971 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public crl.r a(gc ☃, crl.v v1, Random random) {
/* 1976 */       crl.v.a(v1, true);
/* 1977 */       crl.v.a(crl.v.c(v1)[gc.f.c()], true);
/* 1978 */       crl.v.a(crl.v.c(v1)[gc.b.c()], true);
/* 1979 */       crl.v.a(crl.v.c(crl.v.c(v1)[gc.f.c()])[gc.b.c()], true);
/* 1980 */       return new crl.l(☃, v1);
/*      */     } }
/*      */   
/*      */   static class d implements i {
/*      */     private d() {}
/*      */     
/*      */     public boolean a(crl.v ☃) {
/* 1987 */       if (crl.v.d(☃)[gc.c.c()] && !crl.v.b(crl.v.c(☃)[gc.c.c()]) && 
/* 1988 */         crl.v.d(☃)[gc.b.c()] && !crl.v.b(crl.v.c(☃)[gc.b.c()])) {
/* 1989 */         crl.v v1 = crl.v.c(☃)[gc.c.c()];
/*      */         
/* 1991 */         return (crl.v.d(v1)[gc.b.c()] && !crl.v.b(crl.v.c(v1)[gc.b.c()]));
/*      */       } 
/*      */       
/* 1994 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public crl.r a(gc ☃, crl.v v1, Random random) {
/* 1999 */       crl.v.a(v1, true);
/* 2000 */       crl.v.a(crl.v.c(v1)[gc.c.c()], true);
/* 2001 */       crl.v.a(crl.v.c(v1)[gc.b.c()], true);
/* 2002 */       crl.v.a(crl.v.c(crl.v.c(v1)[gc.c.c()])[gc.b.c()], true);
/* 2003 */       return new crl.n(☃, v1);
/*      */     }
/*      */   }
/*      */   
/*      */   static interface i {
/*      */     boolean a(crl.v param1v);
/*      */     
/*      */     crl.r a(gc param1gc, crl.v param1v, Random param1Random);
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */