/*      */ import com.google.common.collect.Lists;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import javax.annotation.Nullable;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class cri
/*      */ {
/*      */   static class n
/*      */   {
/*      */     public final Class<? extends cri.m> a;
/*      */     public final int b;
/*      */     public int c;
/*      */     public final int d;
/*      */     public final boolean e;
/*      */     
/*      */     public n(Class<? extends cri.m> ☃, int i, int j, boolean bool) {
/*   42 */       this.a = ☃;
/*   43 */       this.b = i;
/*   44 */       this.d = j;
/*   45 */       this.e = bool;
/*      */     }
/*      */     
/*      */     public n(Class<? extends cri.m> ☃, int i, int j) {
/*   49 */       this(☃, i, j, false);
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/*   53 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */     
/*      */     public boolean a() {
/*   57 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */   }
/*      */   
/*   61 */   private static final n[] a = new n[] { new n((Class)c.class, 30, 0, true), new n((Class)a.class, 10, 4), new n((Class)o.class, 10, 4), new n((Class)p.class, 10, 3), new n((Class)l.class, 5, 2), new n((Class)f.class, 5, 1) };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   69 */   private static final n[] b = new n[] { new n((Class)i.class, 25, 0, true), new n((Class)g.class, 15, 5), new n((Class)j.class, 5, 10), new n((Class)h.class, 5, 10), new n((Class)d.class, 10, 3, true), new n((Class)e.class, 7, 2), new n((Class)k.class, 5, 2) };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static m b(n ☃, List<cru> list, Random random, int i, int j, int k, gc gc1, int m) {
/*   80 */     Class<? extends m> clazz = ☃.a;
/*   81 */     m m1 = null;
/*      */     
/*   83 */     if (clazz == c.class) {
/*   84 */       m1 = c.a(list, random, i, j, k, gc1, m);
/*   85 */     } else if (clazz == a.class) {
/*   86 */       m1 = a.a(list, i, j, k, gc1, m);
/*   87 */     } else if (clazz == o.class) {
/*   88 */       m1 = o.a(list, i, j, k, gc1, m);
/*   89 */     } else if (clazz == p.class) {
/*   90 */       m1 = p.a(list, i, j, k, m, gc1);
/*   91 */     } else if (clazz == l.class) {
/*   92 */       m1 = l.a(list, i, j, k, m, gc1);
/*   93 */     } else if (clazz == f.class) {
/*   94 */       m1 = f.a(list, random, i, j, k, gc1, m);
/*   95 */     } else if (clazz == i.class) {
/*   96 */       m1 = i.a(list, i, j, k, gc1, m);
/*   97 */     } else if (clazz == j.class) {
/*   98 */       m1 = j.a(list, random, i, j, k, gc1, m);
/*   99 */     } else if (clazz == h.class) {
/*  100 */       m1 = h.a(list, random, i, j, k, gc1, m);
/*  101 */     } else if (clazz == d.class) {
/*  102 */       m1 = d.a(list, i, j, k, gc1, m);
/*  103 */     } else if (clazz == e.class) {
/*  104 */       m1 = e.a(list, i, j, k, gc1, m);
/*  105 */     } else if (clazz == g.class) {
/*  106 */       m1 = g.a(list, i, j, k, gc1, m);
/*  107 */     } else if (clazz == k.class) {
/*  108 */       m1 = k.a(list, i, j, k, gc1, m);
/*      */     } 
/*  110 */     return m1;
/*      */   }
/*      */   
/*      */   static abstract class m extends cru {
/*      */     protected m(clb ☃, int i) {
/*  115 */       super(☃, i);
/*      */     }
/*      */     
/*      */     public m(clb ☃, md md1) {
/*  119 */       super(☃, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {}
/*      */ 
/*      */     
/*      */     private int a(List<cri.n> ☃) {
/*  127 */       boolean bool = false;
/*  128 */       int i = 0;
/*  129 */       for (cri.n n : ☃) {
/*  130 */         if (n.d > 0 && n.c < n.d) {
/*  131 */           bool = true;
/*      */         }
/*  133 */         i += n.b;
/*      */       } 
/*  135 */       return bool ? i : -1;
/*      */     }
/*      */     
/*      */     private m a(cri.q ☃, List<cri.n> list, List<cru> list1, Random random, int i, int j, int k, gc gc1, int n) {
/*  139 */       int i1 = a(list);
/*  140 */       boolean bool = (i1 > 0 && n <= 30);
/*      */       
/*  142 */       int i2 = 0;
/*  143 */       while (i2 < 5 && bool) {
/*  144 */         i2++;
/*      */         
/*  146 */         int i3 = random.nextInt(i1);
/*  147 */         for (cri.n n1 : list) {
/*  148 */           i3 -= n1.b;
/*  149 */           if (i3 < 0) {
/*  150 */             if (!n1.a(n) || (n1 == ☃.a && !n1.e)) {
/*      */               break;
/*      */             }
/*      */             
/*  154 */             m m1 = cri.a(n1, list1, random, i, j, k, gc1, n);
/*  155 */             if (m1 != null) {
/*  156 */               n1.c++;
/*  157 */               ☃.a = n1;
/*      */               
/*  159 */               if (!n1.a()) {
/*  160 */                 list.remove(n1);
/*      */               }
/*  162 */               return m1;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*  167 */       return cri.b.a(list1, random, i, j, k, gc1, n);
/*      */     }
/*      */     
/*      */     private cru a(cri.q ☃, List<cru> list, Random random, int i, int j, int k, @Nullable gc gc1, int n, boolean bool) {
/*  171 */       if (Math.abs(i - (☃.g()).a) > 112 || Math.abs(k - (☃.g()).c) > 112) {
/*  172 */         return cri.b.a(list, random, i, j, k, gc1, n);
/*      */       }
/*  174 */       List<cri.n> list1 = ☃.b;
/*  175 */       if (bool) {
/*  176 */         list1 = ☃.c;
/*      */       }
/*  178 */       cru cru1 = a(☃, list1, list, random, i, j, k, gc1, n + 1);
/*  179 */       if (cru1 != null) {
/*  180 */         list.add(cru1);
/*  181 */         ☃.d.add(cru1);
/*      */       } 
/*  183 */       return cru1;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected cru a(cri.q ☃, List<cru> list, Random random, int i, int j, boolean bool) {
/*  188 */       gc gc = i();
/*  189 */       if (gc != null) {
/*  190 */         switch (cri.null.a[gc.ordinal()]) {
/*      */           case 1:
/*  192 */             return a(☃, list, random, this.n.a + i, this.n.b + j, this.n.c - 1, gc, h(), bool);
/*      */           case 2:
/*  194 */             return a(☃, list, random, this.n.a + i, this.n.b + j, this.n.f + 1, gc, h(), bool);
/*      */           case 3:
/*  196 */             return a(☃, list, random, this.n.a - 1, this.n.b + j, this.n.c + i, gc, h(), bool);
/*      */           case 4:
/*  198 */             return a(☃, list, random, this.n.d + 1, this.n.b + j, this.n.c + i, gc, h(), bool);
/*      */         } 
/*      */       }
/*  201 */       return null;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected cru b(cri.q ☃, List<cru> list, Random random, int i, int j, boolean bool) {
/*  206 */       gc gc = i();
/*  207 */       if (gc != null) {
/*  208 */         switch (cri.null.a[gc.ordinal()]) {
/*      */           case 1:
/*  210 */             return a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, gc.e, h(), bool);
/*      */           case 2:
/*  212 */             return a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, gc.e, h(), bool);
/*      */           case 3:
/*  214 */             return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, gc.c, h(), bool);
/*      */           case 4:
/*  216 */             return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, gc.c, h(), bool);
/*      */         } 
/*      */       }
/*  219 */       return null;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected cru c(cri.q ☃, List<cru> list, Random random, int i, int j, boolean bool) {
/*  224 */       gc gc = i();
/*  225 */       if (gc != null) {
/*  226 */         switch (cri.null.a[gc.ordinal()]) {
/*      */           case 1:
/*  228 */             return a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, gc.f, h(), bool);
/*      */           case 2:
/*  230 */             return a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, gc.f, h(), bool);
/*      */           case 3:
/*  232 */             return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, gc.d, h(), bool);
/*      */           case 4:
/*  234 */             return a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, gc.d, h(), bool);
/*      */         } 
/*      */       }
/*  237 */       return null;
/*      */     }
/*      */     
/*      */     protected static boolean a(cra ☃) {
/*  241 */       return (☃ != null && ☃.b > 10);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class q
/*      */     extends a
/*      */   {
/*      */     public cri.n a;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public List<cri.n> b;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public List<cri.n> c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  273 */     public final List<cru> d = Lists.newArrayList();
/*      */     
/*      */     public q(Random ☃, int i, int j) {
/*  276 */       super(☃, i, j);
/*      */       
/*  278 */       this.b = Lists.newArrayList();
/*  279 */       for (cri.n n1 : cri.a()) {
/*  280 */         n1.c = 0;
/*  281 */         this.b.add(n1);
/*      */       } 
/*      */       
/*  284 */       this.c = Lists.newArrayList();
/*  285 */       for (cri.n n1 : cri.b()) {
/*  286 */         n1.c = 0;
/*  287 */         this.c.add(n1);
/*      */       } 
/*      */     }
/*      */     
/*      */     public q(csw ☃, md md1) {
/*  292 */       super(clb.s, md1);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class c
/*      */     extends m
/*      */   {
/*      */     public c(int ☃, Random random, cra cra1, gc gc1) {
/*  302 */       super(clb.g, ☃);
/*      */       
/*  304 */       a(gc1);
/*  305 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public c(csw ☃, md md1) {
/*  309 */       super(clb.g, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  314 */       a((cri.q)☃, list, random, 1, 3, false);
/*      */     }
/*      */     
/*      */     public static c a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int n) {
/*  318 */       cra cra = cra.a(i, j, k, -1, -3, 0, 5, 10, 19, gc1);
/*      */       
/*  320 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  321 */         return null;
/*      */       }
/*      */       
/*  324 */       return new c(n, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  330 */       a(☃, cra1, 0, 3, 0, 4, 4, 18, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  332 */       a(☃, cra1, 1, 5, 0, 3, 7, 18, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/*  335 */       a(☃, cra1, 0, 5, 0, 0, 5, 18, bup.dV.n(), bup.dV.n(), false);
/*  336 */       a(☃, cra1, 4, 5, 0, 4, 5, 18, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  339 */       a(☃, cra1, 0, 2, 0, 4, 2, 5, bup.dV.n(), bup.dV.n(), false);
/*  340 */       a(☃, cra1, 0, 2, 13, 4, 2, 18, bup.dV.n(), bup.dV.n(), false);
/*  341 */       a(☃, cra1, 0, 0, 0, 4, 1, 3, bup.dV.n(), bup.dV.n(), false);
/*  342 */       a(☃, cra1, 0, 0, 15, 4, 1, 18, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  344 */       for (int i = 0; i <= 4; i++) {
/*  345 */         for (int j = 0; j <= 2; j++) {
/*  346 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*  347 */           b(☃, bup.dV.n(), i, -1, 18 - j, cra1);
/*      */         } 
/*      */       } 
/*      */       
/*  351 */       ceh ceh1 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*  352 */       ceh ceh2 = ceh1.a(bwq.b, Boolean.valueOf(true));
/*  353 */       ceh ceh3 = ceh1.a(bwq.d, Boolean.valueOf(true));
/*  354 */       a(☃, cra1, 0, 1, 1, 0, 4, 1, ceh2, ceh2, false);
/*  355 */       a(☃, cra1, 0, 3, 4, 0, 4, 4, ceh2, ceh2, false);
/*  356 */       a(☃, cra1, 0, 3, 14, 0, 4, 14, ceh2, ceh2, false);
/*  357 */       a(☃, cra1, 0, 1, 17, 0, 4, 17, ceh2, ceh2, false);
/*  358 */       a(☃, cra1, 4, 1, 1, 4, 4, 1, ceh3, ceh3, false);
/*  359 */       a(☃, cra1, 4, 3, 4, 4, 4, 4, ceh3, ceh3, false);
/*  360 */       a(☃, cra1, 4, 3, 14, 4, 4, 14, ceh3, ceh3, false);
/*  361 */       a(☃, cra1, 4, 1, 17, 4, 4, 17, ceh3, ceh3, false);
/*      */       
/*  363 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class b
/*      */     extends m
/*      */   {
/*      */     private final int a;
/*      */ 
/*      */     
/*      */     public b(int ☃, Random random, cra cra1, gc gc1) {
/*  375 */       super(clb.f, ☃);
/*      */       
/*  377 */       a(gc1);
/*  378 */       this.n = cra1;
/*  379 */       this.a = random.nextInt();
/*      */     }
/*      */     
/*      */     public b(csw ☃, md md1) {
/*  383 */       super(clb.f, md1);
/*  384 */       this.a = md1.h("Seed");
/*      */     }
/*      */     
/*      */     public static b a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int n) {
/*  388 */       cra cra = cra.a(i, j, k, -1, -3, 0, 5, 10, 8, gc1);
/*      */       
/*  390 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  391 */         return null;
/*      */       }
/*      */       
/*  394 */       return new b(n, random, cra, gc1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/*  399 */       super.a(☃);
/*      */       
/*  401 */       ☃.b("Seed", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  406 */       Random random1 = new Random(this.a);
/*      */       
/*      */       int i;
/*  409 */       for (i = 0; i <= 4; i++) {
/*  410 */         for (int j = 3; j <= 4; j++) {
/*  411 */           int k = random1.nextInt(8);
/*  412 */           a(☃, cra1, i, j, 0, i, j, k, bup.dV.n(), bup.dV.n(), false);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  418 */       i = random1.nextInt(8);
/*  419 */       a(☃, cra1, 0, 5, 0, 0, 5, i, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  422 */       i = random1.nextInt(8);
/*  423 */       a(☃, cra1, 4, 5, 0, 4, 5, i, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */ 
/*      */       
/*  427 */       for (i = 0; i <= 4; i++) {
/*  428 */         int j = random1.nextInt(5);
/*  429 */         a(☃, cra1, i, 2, 0, i, 2, j, bup.dV.n(), bup.dV.n(), false);
/*      */       } 
/*  431 */       for (i = 0; i <= 4; i++) {
/*  432 */         for (int j = 0; j <= 1; j++) {
/*  433 */           int k = random1.nextInt(3);
/*  434 */           a(☃, cra1, i, j, 0, i, j, k, bup.dV.n(), bup.dV.n(), false);
/*      */         } 
/*      */       } 
/*      */       
/*  438 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class a
/*      */     extends m
/*      */   {
/*      */     public a(int ☃, cra cra1, gc gc1) {
/*  448 */       super(clb.e, ☃);
/*      */       
/*  450 */       a(gc1);
/*  451 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     protected a(Random ☃, int i, int j) {
/*  455 */       super(clb.e, 0);
/*      */       
/*  457 */       a(gc.c.a.a(☃));
/*      */       
/*  459 */       if (i().n() == gc.a.c) {
/*  460 */         this.n = new cra(i, 64, j, i + 19 - 1, 73, j + 19 - 1);
/*      */       } else {
/*  462 */         this.n = new cra(i, 64, j, i + 19 - 1, 73, j + 19 - 1);
/*      */       } 
/*      */     }
/*      */     
/*      */     protected a(clb ☃, md md1) {
/*  467 */       super(☃, md1);
/*      */     }
/*      */     
/*      */     public a(csw ☃, md md1) {
/*  471 */       this(clb.e, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  476 */       a((cri.q)☃, list, random, 8, 3, false);
/*  477 */       b((cri.q)☃, list, random, 3, 8, false);
/*  478 */       c((cri.q)☃, list, random, 3, 8, false);
/*      */     }
/*      */     
/*      */     public static a a(List<cru> ☃, int i, int j, int k, gc gc1, int n) {
/*  482 */       cra cra = cra.a(i, j, k, -8, -3, 0, 19, 10, 19, gc1);
/*      */       
/*  484 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  485 */         return null;
/*      */       }
/*      */       
/*  488 */       return new a(n, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  494 */       a(☃, cra1, 7, 3, 0, 11, 4, 18, bup.dV.n(), bup.dV.n(), false);
/*  495 */       a(☃, cra1, 0, 3, 7, 18, 4, 11, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  497 */       a(☃, cra1, 8, 5, 0, 10, 7, 18, bup.a.n(), bup.a.n(), false);
/*  498 */       a(☃, cra1, 0, 5, 8, 18, 7, 10, bup.a.n(), bup.a.n(), false);
/*      */       
/*  500 */       a(☃, cra1, 7, 5, 0, 7, 5, 7, bup.dV.n(), bup.dV.n(), false);
/*  501 */       a(☃, cra1, 7, 5, 11, 7, 5, 18, bup.dV.n(), bup.dV.n(), false);
/*  502 */       a(☃, cra1, 11, 5, 0, 11, 5, 7, bup.dV.n(), bup.dV.n(), false);
/*  503 */       a(☃, cra1, 11, 5, 11, 11, 5, 18, bup.dV.n(), bup.dV.n(), false);
/*  504 */       a(☃, cra1, 0, 5, 7, 7, 5, 7, bup.dV.n(), bup.dV.n(), false);
/*  505 */       a(☃, cra1, 11, 5, 7, 18, 5, 7, bup.dV.n(), bup.dV.n(), false);
/*  506 */       a(☃, cra1, 0, 5, 11, 7, 5, 11, bup.dV.n(), bup.dV.n(), false);
/*  507 */       a(☃, cra1, 11, 5, 11, 18, 5, 11, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  510 */       a(☃, cra1, 7, 2, 0, 11, 2, 5, bup.dV.n(), bup.dV.n(), false);
/*  511 */       a(☃, cra1, 7, 2, 13, 11, 2, 18, bup.dV.n(), bup.dV.n(), false);
/*  512 */       a(☃, cra1, 7, 0, 0, 11, 1, 3, bup.dV.n(), bup.dV.n(), false);
/*  513 */       a(☃, cra1, 7, 0, 15, 11, 1, 18, bup.dV.n(), bup.dV.n(), false); int i;
/*  514 */       for (i = 7; i <= 11; i++) {
/*  515 */         for (int j = 0; j <= 2; j++) {
/*  516 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*  517 */           b(☃, bup.dV.n(), i, -1, 18 - j, cra1);
/*      */         } 
/*      */       } 
/*      */       
/*  521 */       a(☃, cra1, 0, 2, 7, 5, 2, 11, bup.dV.n(), bup.dV.n(), false);
/*  522 */       a(☃, cra1, 13, 2, 7, 18, 2, 11, bup.dV.n(), bup.dV.n(), false);
/*  523 */       a(☃, cra1, 0, 0, 7, 3, 1, 11, bup.dV.n(), bup.dV.n(), false);
/*  524 */       a(☃, cra1, 15, 0, 7, 18, 1, 11, bup.dV.n(), bup.dV.n(), false);
/*  525 */       for (i = 0; i <= 2; i++) {
/*  526 */         for (int j = 7; j <= 11; j++) {
/*  527 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*  528 */           b(☃, bup.dV.n(), 18 - i, -1, j, cra1);
/*      */         } 
/*      */       } 
/*      */       
/*  532 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class o
/*      */     extends m
/*      */   {
/*      */     public o(int ☃, cra cra1, gc gc1) {
/*  542 */       super(clb.q, ☃);
/*      */       
/*  544 */       a(gc1);
/*  545 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public o(csw ☃, md md1) {
/*  549 */       super(clb.q, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  554 */       a((cri.q)☃, list, random, 2, 0, false);
/*  555 */       b((cri.q)☃, list, random, 0, 2, false);
/*  556 */       c((cri.q)☃, list, random, 0, 2, false);
/*      */     }
/*      */     
/*      */     public static o a(List<cru> ☃, int i, int j, int k, gc gc1, int n) {
/*  560 */       cra cra = cra.a(i, j, k, -2, 0, 0, 7, 9, 7, gc1);
/*      */       
/*  562 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  563 */         return null;
/*      */       }
/*      */       
/*  566 */       return new o(n, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  572 */       a(☃, cra1, 0, 0, 0, 6, 1, 6, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  574 */       a(☃, cra1, 0, 2, 0, 6, 7, 6, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/*  577 */       a(☃, cra1, 0, 2, 0, 1, 6, 0, bup.dV.n(), bup.dV.n(), false);
/*  578 */       a(☃, cra1, 0, 2, 6, 1, 6, 6, bup.dV.n(), bup.dV.n(), false);
/*  579 */       a(☃, cra1, 5, 2, 0, 6, 6, 0, bup.dV.n(), bup.dV.n(), false);
/*  580 */       a(☃, cra1, 5, 2, 6, 6, 6, 6, bup.dV.n(), bup.dV.n(), false);
/*  581 */       a(☃, cra1, 0, 2, 0, 0, 6, 1, bup.dV.n(), bup.dV.n(), false);
/*  582 */       a(☃, cra1, 0, 2, 5, 0, 6, 6, bup.dV.n(), bup.dV.n(), false);
/*  583 */       a(☃, cra1, 6, 2, 0, 6, 6, 1, bup.dV.n(), bup.dV.n(), false);
/*  584 */       a(☃, cra1, 6, 2, 5, 6, 6, 6, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  587 */       ceh ceh1 = bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/*  588 */       ceh ceh2 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*      */       
/*  590 */       a(☃, cra1, 2, 6, 0, 4, 6, 0, bup.dV.n(), bup.dV.n(), false);
/*  591 */       a(☃, cra1, 2, 5, 0, 4, 5, 0, ceh1, ceh1, false);
/*  592 */       a(☃, cra1, 2, 6, 6, 4, 6, 6, bup.dV.n(), bup.dV.n(), false);
/*  593 */       a(☃, cra1, 2, 5, 6, 4, 5, 6, ceh1, ceh1, false);
/*  594 */       a(☃, cra1, 0, 6, 2, 0, 6, 4, bup.dV.n(), bup.dV.n(), false);
/*  595 */       a(☃, cra1, 0, 5, 2, 0, 5, 4, ceh2, ceh2, false);
/*  596 */       a(☃, cra1, 6, 6, 2, 6, 6, 4, bup.dV.n(), bup.dV.n(), false);
/*  597 */       a(☃, cra1, 6, 5, 2, 6, 5, 4, ceh2, ceh2, false);
/*      */ 
/*      */       
/*  600 */       for (int i = 0; i <= 6; i++) {
/*  601 */         for (int j = 0; j <= 6; j++) {
/*  602 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*      */         }
/*      */       } 
/*      */       
/*  606 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class p
/*      */     extends m
/*      */   {
/*      */     public p(int ☃, cra cra1, gc gc1) {
/*  616 */       super(clb.r, ☃);
/*      */       
/*  618 */       a(gc1);
/*  619 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public p(csw ☃, md md1) {
/*  623 */       super(clb.r, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  628 */       c((cri.q)☃, list, random, 6, 2, false);
/*      */     }
/*      */     
/*      */     public static p a(List<cru> ☃, int i, int j, int k, int n, gc gc1) {
/*  632 */       cra cra = cra.a(i, j, k, -2, 0, 0, 7, 11, 7, gc1);
/*      */       
/*  634 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  635 */         return null;
/*      */       }
/*      */       
/*  638 */       return new p(n, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  644 */       a(☃, cra1, 0, 0, 0, 6, 1, 6, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  646 */       a(☃, cra1, 0, 2, 0, 6, 10, 6, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/*  649 */       a(☃, cra1, 0, 2, 0, 1, 8, 0, bup.dV.n(), bup.dV.n(), false);
/*  650 */       a(☃, cra1, 5, 2, 0, 6, 8, 0, bup.dV.n(), bup.dV.n(), false);
/*  651 */       a(☃, cra1, 0, 2, 1, 0, 8, 6, bup.dV.n(), bup.dV.n(), false);
/*  652 */       a(☃, cra1, 6, 2, 1, 6, 8, 6, bup.dV.n(), bup.dV.n(), false);
/*  653 */       a(☃, cra1, 1, 2, 6, 5, 8, 6, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  656 */       ceh ceh1 = bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/*  657 */       ceh ceh2 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*      */       
/*  659 */       a(☃, cra1, 0, 3, 2, 0, 5, 4, ceh2, ceh2, false);
/*  660 */       a(☃, cra1, 6, 3, 2, 6, 5, 2, ceh2, ceh2, false);
/*  661 */       a(☃, cra1, 6, 3, 4, 6, 5, 4, ceh2, ceh2, false);
/*      */ 
/*      */       
/*  664 */       a(☃, bup.dV.n(), 5, 2, 5, cra1);
/*  665 */       a(☃, cra1, 4, 2, 5, 4, 3, 5, bup.dV.n(), bup.dV.n(), false);
/*  666 */       a(☃, cra1, 3, 2, 5, 3, 4, 5, bup.dV.n(), bup.dV.n(), false);
/*  667 */       a(☃, cra1, 2, 2, 5, 2, 5, 5, bup.dV.n(), bup.dV.n(), false);
/*  668 */       a(☃, cra1, 1, 2, 5, 1, 6, 5, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  671 */       a(☃, cra1, 1, 7, 1, 5, 7, 4, bup.dV.n(), bup.dV.n(), false);
/*  672 */       a(☃, cra1, 6, 8, 2, 6, 8, 4, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/*  675 */       a(☃, cra1, 2, 6, 0, 4, 8, 0, bup.dV.n(), bup.dV.n(), false);
/*  676 */       a(☃, cra1, 2, 5, 0, 4, 5, 0, ceh1, ceh1, false);
/*      */       
/*  678 */       for (int i = 0; i <= 6; i++) {
/*  679 */         for (int j = 0; j <= 6; j++) {
/*  680 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*      */         }
/*      */       } 
/*      */       
/*  684 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class l
/*      */     extends m
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public l(int ☃, cra cra1, gc gc1) {
/*  696 */       super(clb.p, ☃);
/*      */       
/*  698 */       a(gc1);
/*  699 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public l(csw ☃, md md1) {
/*  703 */       super(clb.p, md1);
/*  704 */       this.a = md1.q("Mob");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/*  709 */       super.a(☃);
/*      */       
/*  711 */       ☃.a("Mob", this.a);
/*      */     }
/*      */     
/*      */     public static l a(List<cru> ☃, int i, int j, int k, int n, gc gc1) {
/*  715 */       cra cra = cra.a(i, j, k, -2, 0, 0, 7, 8, 9, gc1);
/*      */       
/*  717 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  718 */         return null;
/*      */       }
/*      */       
/*  721 */       return new l(n, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  727 */       a(☃, cra1, 0, 2, 0, 6, 7, 7, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/*  730 */       a(☃, cra1, 1, 0, 0, 5, 1, 7, bup.dV.n(), bup.dV.n(), false);
/*  731 */       a(☃, cra1, 1, 2, 1, 5, 2, 7, bup.dV.n(), bup.dV.n(), false);
/*  732 */       a(☃, cra1, 1, 3, 2, 5, 3, 7, bup.dV.n(), bup.dV.n(), false);
/*  733 */       a(☃, cra1, 1, 4, 3, 5, 4, 7, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  736 */       a(☃, cra1, 1, 2, 0, 1, 4, 2, bup.dV.n(), bup.dV.n(), false);
/*  737 */       a(☃, cra1, 5, 2, 0, 5, 4, 2, bup.dV.n(), bup.dV.n(), false);
/*  738 */       a(☃, cra1, 1, 5, 2, 1, 5, 3, bup.dV.n(), bup.dV.n(), false);
/*  739 */       a(☃, cra1, 5, 5, 2, 5, 5, 3, bup.dV.n(), bup.dV.n(), false);
/*  740 */       a(☃, cra1, 0, 5, 3, 0, 5, 8, bup.dV.n(), bup.dV.n(), false);
/*  741 */       a(☃, cra1, 6, 5, 3, 6, 5, 8, bup.dV.n(), bup.dV.n(), false);
/*  742 */       a(☃, cra1, 1, 5, 8, 5, 5, 8, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  744 */       ceh ceh1 = bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/*  745 */       ceh ceh2 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*      */       
/*  747 */       a(☃, bup.dW.n().a(bwq.d, Boolean.valueOf(true)), 1, 6, 3, cra1);
/*  748 */       a(☃, bup.dW.n().a(bwq.b, Boolean.valueOf(true)), 5, 6, 3, cra1);
/*      */       
/*  750 */       a(☃, bup.dW.n().a(bwq.b, Boolean.valueOf(true)).a(bwq.a, Boolean.valueOf(true)), 0, 6, 3, cra1);
/*  751 */       a(☃, bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.a, Boolean.valueOf(true)), 6, 6, 3, cra1);
/*      */       
/*  753 */       a(☃, cra1, 0, 6, 4, 0, 6, 7, ceh2, ceh2, false);
/*  754 */       a(☃, cra1, 6, 6, 4, 6, 6, 7, ceh2, ceh2, false);
/*      */       
/*  756 */       a(☃, bup.dW.n().a(bwq.b, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true)), 0, 6, 8, cra1);
/*  757 */       a(☃, bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true)), 6, 6, 8, cra1);
/*      */       
/*  759 */       a(☃, cra1, 1, 6, 8, 5, 6, 8, ceh1, ceh1, false);
/*      */       
/*  761 */       a(☃, bup.dW.n().a(bwq.b, Boolean.valueOf(true)), 1, 7, 8, cra1);
/*  762 */       a(☃, cra1, 2, 7, 8, 4, 7, 8, ceh1, ceh1, false);
/*  763 */       a(☃, bup.dW.n().a(bwq.d, Boolean.valueOf(true)), 5, 7, 8, cra1);
/*      */       
/*  765 */       a(☃, bup.dW.n().a(bwq.b, Boolean.valueOf(true)), 2, 8, 8, cra1);
/*  766 */       a(☃, ceh1, 3, 8, 8, cra1);
/*  767 */       a(☃, bup.dW.n().a(bwq.d, Boolean.valueOf(true)), 4, 8, 8, cra1);
/*      */       
/*  769 */       if (!this.a) {
/*  770 */         fx fx2 = new fx(a(3, 5), d(5), b(3, 5));
/*  771 */         if (cra1.b(fx2)) {
/*  772 */           this.a = true;
/*  773 */           ☃.a(fx2, bup.bP.n(), 2);
/*      */           
/*  775 */           ccj ccj = ☃.c(fx2);
/*  776 */           if (ccj instanceof cdi) {
/*  777 */             ((cdi)ccj).d().a(aqe.f);
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  783 */       for (int i = 0; i <= 6; i++) {
/*  784 */         for (int j = 0; j <= 6; j++) {
/*  785 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*      */         }
/*      */       } 
/*      */       
/*  789 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class f
/*      */     extends m
/*      */   {
/*      */     public f(int ☃, Random random, cra cra1, gc gc1) {
/*  799 */       super(clb.j, ☃);
/*      */       
/*  801 */       a(gc1);
/*  802 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public f(csw ☃, md md1) {
/*  806 */       super(clb.j, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  811 */       a((cri.q)☃, list, random, 5, 3, true);
/*      */     }
/*      */     
/*      */     public static f a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int n) {
/*  815 */       cra cra = cra.a(i, j, k, -5, -3, 0, 13, 14, 13, gc1);
/*      */       
/*  817 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  818 */         return null;
/*      */       }
/*      */       
/*  821 */       return new f(n, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  827 */       a(☃, cra1, 0, 3, 0, 12, 4, 12, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  829 */       a(☃, cra1, 0, 5, 0, 12, 13, 12, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/*  832 */       a(☃, cra1, 0, 5, 0, 1, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  833 */       a(☃, cra1, 11, 5, 0, 12, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  834 */       a(☃, cra1, 2, 5, 11, 4, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  835 */       a(☃, cra1, 8, 5, 11, 10, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  836 */       a(☃, cra1, 5, 9, 11, 7, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  837 */       a(☃, cra1, 2, 5, 0, 4, 12, 1, bup.dV.n(), bup.dV.n(), false);
/*  838 */       a(☃, cra1, 8, 5, 0, 10, 12, 1, bup.dV.n(), bup.dV.n(), false);
/*  839 */       a(☃, cra1, 5, 9, 0, 7, 12, 1, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  842 */       a(☃, cra1, 2, 11, 2, 10, 12, 10, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  845 */       a(☃, cra1, 5, 8, 0, 7, 8, 0, bup.dW.n(), bup.dW.n(), false);
/*      */       
/*  847 */       ceh ceh1 = bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/*  848 */       ceh ceh2 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*      */       
/*      */       int i;
/*  851 */       for (i = 1; i <= 11; i += 2) {
/*  852 */         a(☃, cra1, i, 10, 0, i, 11, 0, ceh1, ceh1, false);
/*  853 */         a(☃, cra1, i, 10, 12, i, 11, 12, ceh1, ceh1, false);
/*  854 */         a(☃, cra1, 0, 10, i, 0, 11, i, ceh2, ceh2, false);
/*  855 */         a(☃, cra1, 12, 10, i, 12, 11, i, ceh2, ceh2, false);
/*  856 */         a(☃, bup.dV.n(), i, 13, 0, cra1);
/*  857 */         a(☃, bup.dV.n(), i, 13, 12, cra1);
/*  858 */         a(☃, bup.dV.n(), 0, 13, i, cra1);
/*  859 */         a(☃, bup.dV.n(), 12, 13, i, cra1);
/*  860 */         if (i != 11) {
/*  861 */           a(☃, ceh1, i + 1, 13, 0, cra1);
/*  862 */           a(☃, ceh1, i + 1, 13, 12, cra1);
/*  863 */           a(☃, ceh2, 0, 13, i + 1, cra1);
/*  864 */           a(☃, ceh2, 12, 13, i + 1, cra1);
/*      */         } 
/*      */       } 
/*  867 */       a(☃, bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true)), 0, 13, 0, cra1);
/*  868 */       a(☃, bup.dW.n().a(bwq.c, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true)), 0, 13, 12, cra1);
/*  869 */       a(☃, bup.dW.n().a(bwq.c, Boolean.valueOf(true)).a(bwq.d, Boolean.valueOf(true)), 12, 13, 12, cra1);
/*  870 */       a(☃, bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.d, Boolean.valueOf(true)), 12, 13, 0, cra1);
/*      */ 
/*      */       
/*  873 */       for (i = 3; i <= 9; i += 2) {
/*  874 */         a(☃, cra1, 1, 7, i, 1, 8, i, ceh2.a(bwq.d, Boolean.valueOf(true)), ceh2.a(bwq.d, Boolean.valueOf(true)), false);
/*  875 */         a(☃, cra1, 11, 7, i, 11, 8, i, ceh2.a(bwq.b, Boolean.valueOf(true)), ceh2.a(bwq.b, Boolean.valueOf(true)), false);
/*      */       } 
/*      */ 
/*      */       
/*  879 */       a(☃, cra1, 4, 2, 0, 8, 2, 12, bup.dV.n(), bup.dV.n(), false);
/*  880 */       a(☃, cra1, 0, 2, 4, 12, 2, 8, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  882 */       a(☃, cra1, 4, 0, 0, 8, 1, 3, bup.dV.n(), bup.dV.n(), false);
/*  883 */       a(☃, cra1, 4, 0, 9, 8, 1, 12, bup.dV.n(), bup.dV.n(), false);
/*  884 */       a(☃, cra1, 0, 0, 4, 3, 1, 8, bup.dV.n(), bup.dV.n(), false);
/*  885 */       a(☃, cra1, 9, 0, 4, 12, 1, 8, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  887 */       for (i = 4; i <= 8; i++) {
/*  888 */         for (int j = 0; j <= 2; j++) {
/*  889 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*  890 */           b(☃, bup.dV.n(), i, -1, 12 - j, cra1);
/*      */         } 
/*      */       } 
/*  893 */       for (i = 0; i <= 2; i++) {
/*  894 */         for (int j = 4; j <= 8; j++) {
/*  895 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*  896 */           b(☃, bup.dV.n(), 12 - i, -1, j, cra1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  901 */       a(☃, cra1, 5, 5, 5, 7, 5, 7, bup.dV.n(), bup.dV.n(), false);
/*  902 */       a(☃, cra1, 6, 1, 6, 6, 4, 6, bup.a.n(), bup.a.n(), false);
/*  903 */       a(☃, bup.dV.n(), 6, 0, 6, cra1);
/*  904 */       a(☃, bup.B.n(), 6, 5, 6, cra1);
/*      */       
/*  906 */       fx fx2 = new fx(a(6, 6), d(5), b(6, 6));
/*  907 */       if (cra1.b(fx2)) {
/*  908 */         ☃.I().a(fx2, cuy.e, 0);
/*      */       }
/*      */       
/*  911 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class k
/*      */     extends m
/*      */   {
/*      */     public k(int ☃, cra cra1, gc gc1) {
/*  921 */       super(clb.o, ☃);
/*      */       
/*  923 */       a(gc1);
/*  924 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public k(csw ☃, md md1) {
/*  928 */       super(clb.o, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  933 */       a((cri.q)☃, list, random, 5, 3, true);
/*  934 */       a((cri.q)☃, list, random, 5, 11, true);
/*      */     }
/*      */     
/*      */     public static k a(List<cru> ☃, int i, int j, int n, gc gc1, int i1) {
/*  938 */       cra cra = cra.a(i, j, n, -5, -3, 0, 13, 14, 13, gc1);
/*      */       
/*  940 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  941 */         return null;
/*      */       }
/*      */       
/*  944 */       return new k(i1, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  950 */       a(☃, cra1, 0, 3, 0, 12, 4, 12, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  952 */       a(☃, cra1, 0, 5, 0, 12, 13, 12, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/*  955 */       a(☃, cra1, 0, 5, 0, 1, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  956 */       a(☃, cra1, 11, 5, 0, 12, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  957 */       a(☃, cra1, 2, 5, 11, 4, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  958 */       a(☃, cra1, 8, 5, 11, 10, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  959 */       a(☃, cra1, 5, 9, 11, 7, 12, 12, bup.dV.n(), bup.dV.n(), false);
/*  960 */       a(☃, cra1, 2, 5, 0, 4, 12, 1, bup.dV.n(), bup.dV.n(), false);
/*  961 */       a(☃, cra1, 8, 5, 0, 10, 12, 1, bup.dV.n(), bup.dV.n(), false);
/*  962 */       a(☃, cra1, 5, 9, 0, 7, 12, 1, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/*  965 */       a(☃, cra1, 2, 11, 2, 10, 12, 10, bup.dV.n(), bup.dV.n(), false);
/*      */       
/*  967 */       ceh ceh1 = bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/*  968 */       ceh ceh2 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*  969 */       ceh ceh3 = ceh2.a(bwq.d, Boolean.valueOf(true));
/*  970 */       ceh ceh4 = ceh2.a(bwq.b, Boolean.valueOf(true));
/*      */       
/*      */       int i;
/*  973 */       for (i = 1; i <= 11; i += 2) {
/*  974 */         a(☃, cra1, i, 10, 0, i, 11, 0, ceh1, ceh1, false);
/*  975 */         a(☃, cra1, i, 10, 12, i, 11, 12, ceh1, ceh1, false);
/*  976 */         a(☃, cra1, 0, 10, i, 0, 11, i, ceh2, ceh2, false);
/*  977 */         a(☃, cra1, 12, 10, i, 12, 11, i, ceh2, ceh2, false);
/*  978 */         a(☃, bup.dV.n(), i, 13, 0, cra1);
/*  979 */         a(☃, bup.dV.n(), i, 13, 12, cra1);
/*  980 */         a(☃, bup.dV.n(), 0, 13, i, cra1);
/*  981 */         a(☃, bup.dV.n(), 12, 13, i, cra1);
/*  982 */         if (i != 11) {
/*  983 */           a(☃, ceh1, i + 1, 13, 0, cra1);
/*  984 */           a(☃, ceh1, i + 1, 13, 12, cra1);
/*  985 */           a(☃, ceh2, 0, 13, i + 1, cra1);
/*  986 */           a(☃, ceh2, 12, 13, i + 1, cra1);
/*      */         } 
/*      */       } 
/*  989 */       a(☃, bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true)), 0, 13, 0, cra1);
/*  990 */       a(☃, bup.dW.n().a(bwq.c, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true)), 0, 13, 12, cra1);
/*  991 */       a(☃, bup.dW.n().a(bwq.c, Boolean.valueOf(true)).a(bwq.d, Boolean.valueOf(true)), 12, 13, 12, cra1);
/*  992 */       a(☃, bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.d, Boolean.valueOf(true)), 12, 13, 0, cra1);
/*      */ 
/*      */       
/*  995 */       for (i = 3; i <= 9; i += 2) {
/*  996 */         a(☃, cra1, 1, 7, i, 1, 8, i, ceh3, ceh3, false);
/*  997 */         a(☃, cra1, 11, 7, i, 11, 8, i, ceh4, ceh4, false);
/*      */       } 
/*      */ 
/*      */       
/* 1001 */       ceh ceh5 = bup.dX.n().a(cak.a, gc.c); int j;
/* 1002 */       for (j = 0; j <= 6; j++) {
/* 1003 */         int i1 = j + 4;
/* 1004 */         for (int i2 = 5; i2 <= 7; i2++) {
/* 1005 */           a(☃, ceh5, i2, 5 + j, i1, cra1);
/*      */         }
/* 1007 */         if (i1 >= 5 && i1 <= 8) {
/* 1008 */           a(☃, cra1, 5, 5, i1, 7, j + 4, i1, bup.dV.n(), bup.dV.n(), false);
/* 1009 */         } else if (i1 >= 9 && i1 <= 10) {
/* 1010 */           a(☃, cra1, 5, 8, i1, 7, j + 4, i1, bup.dV.n(), bup.dV.n(), false);
/*      */         } 
/* 1012 */         if (j >= 1) {
/* 1013 */           a(☃, cra1, 5, 6 + j, i1, 7, 9 + j, i1, bup.a.n(), bup.a.n(), false);
/*      */         }
/*      */       } 
/* 1016 */       for (j = 5; j <= 7; j++) {
/* 1017 */         a(☃, ceh5, j, 12, 11, cra1);
/*      */       }
/* 1019 */       a(☃, cra1, 5, 6, 7, 5, 7, 7, ceh4, ceh4, false);
/* 1020 */       a(☃, cra1, 7, 6, 7, 7, 7, 7, ceh3, ceh3, false);
/* 1021 */       a(☃, cra1, 5, 13, 12, 7, 13, 12, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/* 1024 */       a(☃, cra1, 2, 5, 2, 3, 5, 3, bup.dV.n(), bup.dV.n(), false);
/* 1025 */       a(☃, cra1, 2, 5, 9, 3, 5, 10, bup.dV.n(), bup.dV.n(), false);
/* 1026 */       a(☃, cra1, 2, 5, 4, 2, 5, 8, bup.dV.n(), bup.dV.n(), false);
/* 1027 */       a(☃, cra1, 9, 5, 2, 10, 5, 3, bup.dV.n(), bup.dV.n(), false);
/* 1028 */       a(☃, cra1, 9, 5, 9, 10, 5, 10, bup.dV.n(), bup.dV.n(), false);
/* 1029 */       a(☃, cra1, 10, 5, 4, 10, 5, 8, bup.dV.n(), bup.dV.n(), false);
/* 1030 */       ceh ceh6 = ceh5.a(cak.a, gc.f);
/* 1031 */       ceh ceh7 = ceh5.a(cak.a, gc.e);
/* 1032 */       a(☃, ceh7, 4, 5, 2, cra1);
/* 1033 */       a(☃, ceh7, 4, 5, 3, cra1);
/* 1034 */       a(☃, ceh7, 4, 5, 9, cra1);
/* 1035 */       a(☃, ceh7, 4, 5, 10, cra1);
/* 1036 */       a(☃, ceh6, 8, 5, 2, cra1);
/* 1037 */       a(☃, ceh6, 8, 5, 3, cra1);
/* 1038 */       a(☃, ceh6, 8, 5, 9, cra1);
/* 1039 */       a(☃, ceh6, 8, 5, 10, cra1);
/*      */ 
/*      */       
/* 1042 */       a(☃, cra1, 3, 4, 4, 4, 4, 8, bup.cM.n(), bup.cM.n(), false);
/* 1043 */       a(☃, cra1, 8, 4, 4, 9, 4, 8, bup.cM.n(), bup.cM.n(), false);
/* 1044 */       a(☃, cra1, 3, 5, 4, 4, 5, 8, bup.dY.n(), bup.dY.n(), false);
/* 1045 */       a(☃, cra1, 8, 5, 4, 9, 5, 8, bup.dY.n(), bup.dY.n(), false);
/*      */ 
/*      */       
/* 1048 */       a(☃, cra1, 4, 2, 0, 8, 2, 12, bup.dV.n(), bup.dV.n(), false);
/* 1049 */       a(☃, cra1, 0, 2, 4, 12, 2, 8, bup.dV.n(), bup.dV.n(), false);
/*      */       
/* 1051 */       a(☃, cra1, 4, 0, 0, 8, 1, 3, bup.dV.n(), bup.dV.n(), false);
/* 1052 */       a(☃, cra1, 4, 0, 9, 8, 1, 12, bup.dV.n(), bup.dV.n(), false);
/* 1053 */       a(☃, cra1, 0, 0, 4, 3, 1, 8, bup.dV.n(), bup.dV.n(), false);
/* 1054 */       a(☃, cra1, 9, 0, 4, 12, 1, 8, bup.dV.n(), bup.dV.n(), false);
/*      */       int n;
/* 1056 */       for (n = 4; n <= 8; n++) {
/* 1057 */         for (int i1 = 0; i1 <= 2; i1++) {
/* 1058 */           b(☃, bup.dV.n(), n, -1, i1, cra1);
/* 1059 */           b(☃, bup.dV.n(), n, -1, 12 - i1, cra1);
/*      */         } 
/*      */       } 
/* 1062 */       for (n = 0; n <= 2; n++) {
/* 1063 */         for (int i1 = 4; i1 <= 8; i1++) {
/* 1064 */           b(☃, bup.dV.n(), n, -1, i1, cra1);
/* 1065 */           b(☃, bup.dV.n(), 12 - n, -1, i1, cra1);
/*      */         } 
/*      */       } 
/*      */       
/* 1069 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class i
/*      */     extends m
/*      */   {
/*      */     public i(int ☃, cra cra1, gc gc1) {
/* 1079 */       super(clb.m, ☃);
/*      */       
/* 1081 */       a(gc1);
/* 1082 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public i(csw ☃, md md1) {
/* 1086 */       super(clb.m, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/* 1091 */       a((cri.q)☃, list, random, 1, 0, true);
/*      */     }
/*      */     
/*      */     public static i a(List<cru> ☃, int j, int k, int n, gc gc1, int i1) {
/* 1095 */       cra cra = cra.a(j, k, n, -1, 0, 0, 5, 7, 5, gc1);
/*      */       
/* 1097 */       if (!a(cra) || cru.a(☃, cra) != null) {
/* 1098 */         return null;
/*      */       }
/*      */       
/* 1101 */       return new i(i1, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1107 */       a(☃, cra1, 0, 0, 0, 4, 1, 4, bup.dV.n(), bup.dV.n(), false);
/*      */       
/* 1109 */       a(☃, cra1, 0, 2, 0, 4, 5, 4, bup.a.n(), bup.a.n(), false);
/*      */       
/* 1111 */       ceh ceh = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*      */ 
/*      */       
/* 1114 */       a(☃, cra1, 0, 2, 0, 0, 5, 4, bup.dV.n(), bup.dV.n(), false);
/* 1115 */       a(☃, cra1, 4, 2, 0, 4, 5, 4, bup.dV.n(), bup.dV.n(), false);
/* 1116 */       a(☃, cra1, 0, 3, 1, 0, 4, 1, ceh, ceh, false);
/* 1117 */       a(☃, cra1, 0, 3, 3, 0, 4, 3, ceh, ceh, false);
/* 1118 */       a(☃, cra1, 4, 3, 1, 4, 4, 1, ceh, ceh, false);
/* 1119 */       a(☃, cra1, 4, 3, 3, 4, 4, 3, ceh, ceh, false);
/*      */ 
/*      */       
/* 1122 */       a(☃, cra1, 0, 6, 0, 4, 6, 4, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/* 1125 */       for (int j = 0; j <= 4; j++) {
/* 1126 */         for (int k = 0; k <= 4; k++) {
/* 1127 */           b(☃, bup.dV.n(), j, -1, k, cra1);
/*      */         }
/*      */       } 
/*      */       
/* 1131 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class g
/*      */     extends m
/*      */   {
/*      */     public g(int ☃, cra cra1, gc gc1) {
/* 1141 */       super(clb.k, ☃);
/*      */       
/* 1143 */       a(gc1);
/* 1144 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public g(csw ☃, md md1) {
/* 1148 */       super(clb.k, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/* 1153 */       a((cri.q)☃, list, random, 1, 0, true);
/* 1154 */       b((cri.q)☃, list, random, 0, 1, true);
/* 1155 */       c((cri.q)☃, list, random, 0, 1, true);
/*      */     }
/*      */     
/*      */     public static g a(List<cru> ☃, int i, int j, int k, gc gc1, int n) {
/* 1159 */       cra cra = cra.a(i, j, k, -1, 0, 0, 5, 7, 5, gc1);
/*      */       
/* 1161 */       if (!a(cra) || cru.a(☃, cra) != null) {
/* 1162 */         return null;
/*      */       }
/*      */       
/* 1165 */       return new g(n, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1171 */       a(☃, cra1, 0, 0, 0, 4, 1, 4, bup.dV.n(), bup.dV.n(), false);
/*      */       
/* 1173 */       a(☃, cra1, 0, 2, 0, 4, 5, 4, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/* 1176 */       a(☃, cra1, 0, 2, 0, 0, 5, 0, bup.dV.n(), bup.dV.n(), false);
/* 1177 */       a(☃, cra1, 4, 2, 0, 4, 5, 0, bup.dV.n(), bup.dV.n(), false);
/* 1178 */       a(☃, cra1, 0, 2, 4, 0, 5, 4, bup.dV.n(), bup.dV.n(), false);
/* 1179 */       a(☃, cra1, 4, 2, 4, 4, 5, 4, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/* 1182 */       a(☃, cra1, 0, 6, 0, 4, 6, 4, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/* 1185 */       for (int i = 0; i <= 4; i++) {
/* 1186 */         for (int j = 0; j <= 4; j++) {
/* 1187 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*      */         }
/*      */       } 
/*      */       
/* 1191 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class j
/*      */     extends m
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public j(int ☃, Random random, cra cra1, gc gc1) {
/* 1203 */       super(clb.n, ☃);
/*      */       
/* 1205 */       a(gc1);
/* 1206 */       this.n = cra1;
/*      */       
/* 1208 */       this.a = (random.nextInt(3) == 0);
/*      */     }
/*      */     
/*      */     public j(csw ☃, md md1) {
/* 1212 */       super(clb.n, md1);
/* 1213 */       this.a = md1.q("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/* 1218 */       super.a(☃);
/*      */       
/* 1220 */       ☃.a("Chest", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/* 1225 */       c((cri.q)☃, list, random, 0, 1, true);
/*      */     }
/*      */     
/*      */     public static j a(List<cru> ☃, Random random, int i, int k, int n, gc gc1, int i1) {
/* 1229 */       cra cra = cra.a(i, k, n, -1, 0, 0, 5, 7, 5, gc1);
/*      */       
/* 1231 */       if (!a(cra) || cru.a(☃, cra) != null) {
/* 1232 */         return null;
/*      */       }
/*      */       
/* 1235 */       return new j(i1, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1241 */       a(☃, cra1, 0, 0, 0, 4, 1, 4, bup.dV.n(), bup.dV.n(), false);
/*      */       
/* 1243 */       a(☃, cra1, 0, 2, 0, 4, 5, 4, bup.a.n(), bup.a.n(), false);
/*      */       
/* 1245 */       ceh ceh1 = bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/* 1246 */       ceh ceh2 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*      */ 
/*      */       
/* 1249 */       a(☃, cra1, 0, 2, 0, 0, 5, 4, bup.dV.n(), bup.dV.n(), false);
/* 1250 */       a(☃, cra1, 0, 3, 1, 0, 4, 1, ceh2, ceh2, false);
/* 1251 */       a(☃, cra1, 0, 3, 3, 0, 4, 3, ceh2, ceh2, false);
/*      */       
/* 1253 */       a(☃, cra1, 4, 2, 0, 4, 5, 0, bup.dV.n(), bup.dV.n(), false);
/*      */       
/* 1255 */       a(☃, cra1, 1, 2, 4, 4, 5, 4, bup.dV.n(), bup.dV.n(), false);
/* 1256 */       a(☃, cra1, 1, 3, 4, 1, 4, 4, ceh1, ceh1, false);
/* 1257 */       a(☃, cra1, 3, 3, 4, 3, 4, 4, ceh1, ceh1, false);
/*      */       
/* 1259 */       if (this.a && 
/* 1260 */         cra1.b(new fx(a(1, 3), d(2), b(1, 3)))) {
/* 1261 */         this.a = false;
/* 1262 */         a(☃, cra1, random, 1, 2, 3, cyq.v);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1267 */       a(☃, cra1, 0, 6, 0, 4, 6, 4, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/* 1270 */       for (int i = 0; i <= 4; i++) {
/* 1271 */         for (int k = 0; k <= 4; k++) {
/* 1272 */           b(☃, bup.dV.n(), i, -1, k, cra1);
/*      */         }
/*      */       } 
/*      */       
/* 1276 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class h
/*      */     extends m
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public h(int ☃, Random random, cra cra1, gc gc1) {
/* 1288 */       super(clb.l, ☃);
/*      */       
/* 1290 */       a(gc1);
/* 1291 */       this.n = cra1;
/*      */       
/* 1293 */       this.a = (random.nextInt(3) == 0);
/*      */     }
/*      */     
/*      */     public h(csw ☃, md md1) {
/* 1297 */       super(clb.l, md1);
/* 1298 */       this.a = md1.q("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/* 1303 */       super.a(☃);
/*      */       
/* 1305 */       ☃.a("Chest", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/* 1310 */       b((cri.q)☃, list, random, 0, 1, true);
/*      */     }
/*      */     
/*      */     public static h a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int n) {
/* 1314 */       cra cra = cra.a(i, j, k, -1, 0, 0, 5, 7, 5, gc1);
/*      */       
/* 1316 */       if (!a(cra) || cru.a(☃, cra) != null) {
/* 1317 */         return null;
/*      */       }
/*      */       
/* 1320 */       return new h(n, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1326 */       a(☃, cra1, 0, 0, 0, 4, 1, 4, bup.dV.n(), bup.dV.n(), false);
/*      */       
/* 1328 */       a(☃, cra1, 0, 2, 0, 4, 5, 4, bup.a.n(), bup.a.n(), false);
/*      */       
/* 1330 */       ceh ceh1 = bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/* 1331 */       ceh ceh2 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*      */ 
/*      */       
/* 1334 */       a(☃, cra1, 4, 2, 0, 4, 5, 4, bup.dV.n(), bup.dV.n(), false);
/* 1335 */       a(☃, cra1, 4, 3, 1, 4, 4, 1, ceh2, ceh2, false);
/* 1336 */       a(☃, cra1, 4, 3, 3, 4, 4, 3, ceh2, ceh2, false);
/*      */       
/* 1338 */       a(☃, cra1, 0, 2, 0, 0, 5, 0, bup.dV.n(), bup.dV.n(), false);
/*      */       
/* 1340 */       a(☃, cra1, 0, 2, 4, 3, 5, 4, bup.dV.n(), bup.dV.n(), false);
/* 1341 */       a(☃, cra1, 1, 3, 4, 1, 4, 4, ceh1, ceh1, false);
/* 1342 */       a(☃, cra1, 3, 3, 4, 3, 4, 4, ceh1, ceh1, false);
/*      */       
/* 1344 */       if (this.a && 
/* 1345 */         cra1.b(new fx(a(3, 3), d(2), b(3, 3)))) {
/* 1346 */         this.a = false;
/* 1347 */         a(☃, cra1, random, 3, 2, 3, cyq.v);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1352 */       a(☃, cra1, 0, 6, 0, 4, 6, 4, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/* 1355 */       for (int i = 0; i <= 4; i++) {
/* 1356 */         for (int j = 0; j <= 4; j++) {
/* 1357 */           b(☃, bup.dV.n(), i, -1, j, cra1);
/*      */         }
/*      */       } 
/*      */       
/* 1361 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class d
/*      */     extends m
/*      */   {
/*      */     public d(int ☃, cra cra1, gc gc1) {
/* 1371 */       super(clb.h, ☃);
/*      */       
/* 1373 */       a(gc1);
/* 1374 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public d(csw ☃, md md1) {
/* 1378 */       super(clb.h, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/* 1383 */       a((cri.q)☃, list, random, 1, 0, true);
/*      */     }
/*      */     
/*      */     public static d a(List<cru> ☃, int i, int j, int k, gc gc1, int n) {
/* 1387 */       cra cra = cra.a(i, j, k, -1, -7, 0, 5, 14, 10, gc1);
/*      */       
/* 1389 */       if (!a(cra) || cru.a(☃, cra) != null) {
/* 1390 */         return null;
/*      */       }
/*      */       
/* 1393 */       return new d(n, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1399 */       ceh ceh1 = bup.dX.n().a(cak.a, gc.d);
/* 1400 */       ceh ceh2 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*      */       
/* 1402 */       for (int i = 0; i <= 9; i++) {
/* 1403 */         int j = Math.max(1, 7 - i);
/* 1404 */         int k = Math.min(Math.max(j + 5, 14 - i), 13);
/* 1405 */         int n = i;
/*      */ 
/*      */         
/* 1408 */         a(☃, cra1, 0, 0, n, 4, j, n, bup.dV.n(), bup.dV.n(), false);
/*      */         
/* 1410 */         a(☃, cra1, 1, j + 1, n, 3, k - 1, n, bup.a.n(), bup.a.n(), false);
/* 1411 */         if (i <= 6) {
/* 1412 */           a(☃, ceh1, 1, j + 1, n, cra1);
/* 1413 */           a(☃, ceh1, 2, j + 1, n, cra1);
/* 1414 */           a(☃, ceh1, 3, j + 1, n, cra1);
/*      */         } 
/*      */         
/* 1417 */         a(☃, cra1, 0, k, n, 4, k, n, bup.dV.n(), bup.dV.n(), false);
/*      */         
/* 1419 */         a(☃, cra1, 0, j + 1, n, 0, k - 1, n, bup.dV.n(), bup.dV.n(), false);
/* 1420 */         a(☃, cra1, 4, j + 1, n, 4, k - 1, n, bup.dV.n(), bup.dV.n(), false);
/* 1421 */         if ((i & 0x1) == 0) {
/* 1422 */           a(☃, cra1, 0, j + 2, n, 0, j + 3, n, ceh2, ceh2, false);
/* 1423 */           a(☃, cra1, 4, j + 2, n, 4, j + 3, n, ceh2, ceh2, false);
/*      */         } 
/*      */ 
/*      */         
/* 1427 */         for (int i1 = 0; i1 <= 4; i1++) {
/* 1428 */           b(☃, bup.dV.n(), i1, -1, n, cra1);
/*      */         }
/*      */       } 
/*      */       
/* 1432 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class e
/*      */     extends m
/*      */   {
/*      */     public e(int ☃, cra cra1, gc gc1) {
/* 1442 */       super(clb.i, ☃);
/*      */       
/* 1444 */       a(gc1);
/* 1445 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public e(csw ☃, md md1) {
/* 1449 */       super(clb.i, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/* 1454 */       int i = 1;
/*      */       
/* 1456 */       gc gc = i();
/* 1457 */       if (gc == gc.e || gc == gc.c) {
/* 1458 */         i = 5;
/*      */       }
/*      */       
/* 1461 */       b((cri.q)☃, list, random, 0, i, (random.nextInt(8) > 0));
/* 1462 */       c((cri.q)☃, list, random, 0, i, (random.nextInt(8) > 0));
/*      */     }
/*      */     
/*      */     public static e a(List<cru> ☃, int i, int j, int k, gc gc1, int n) {
/* 1466 */       cra cra = cra.a(i, j, k, -3, 0, 0, 9, 7, 9, gc1);
/*      */       
/* 1468 */       if (!a(cra) || cru.a(☃, cra) != null) {
/* 1469 */         return null;
/*      */       }
/*      */       
/* 1472 */       return new e(n, cra, gc1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1477 */       ceh ceh1 = bup.dW.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/* 1478 */       ceh ceh2 = bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/*      */ 
/*      */       
/* 1481 */       a(☃, cra1, 0, 0, 0, 8, 1, 8, bup.dV.n(), bup.dV.n(), false);
/*      */       
/* 1483 */       a(☃, cra1, 0, 2, 0, 8, 5, 8, bup.a.n(), bup.a.n(), false);
/*      */       
/* 1485 */       a(☃, cra1, 0, 6, 0, 8, 6, 5, bup.dV.n(), bup.dV.n(), false);
/*      */ 
/*      */       
/* 1488 */       a(☃, cra1, 0, 2, 0, 2, 5, 0, bup.dV.n(), bup.dV.n(), false);
/* 1489 */       a(☃, cra1, 6, 2, 0, 8, 5, 0, bup.dV.n(), bup.dV.n(), false);
/* 1490 */       a(☃, cra1, 1, 3, 0, 1, 4, 0, ceh2, ceh2, false);
/* 1491 */       a(☃, cra1, 7, 3, 0, 7, 4, 0, ceh2, ceh2, false);
/*      */ 
/*      */       
/* 1494 */       a(☃, cra1, 0, 2, 4, 8, 2, 8, bup.dV.n(), bup.dV.n(), false);
/* 1495 */       a(☃, cra1, 1, 1, 4, 2, 2, 4, bup.a.n(), bup.a.n(), false);
/* 1496 */       a(☃, cra1, 6, 1, 4, 7, 2, 4, bup.a.n(), bup.a.n(), false);
/*      */ 
/*      */       
/* 1499 */       a(☃, cra1, 1, 3, 8, 7, 3, 8, ceh2, ceh2, false);
/* 1500 */       a(☃, bup.dW.n().a(bwq.b, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true)), 0, 3, 8, cra1);
/* 1501 */       a(☃, bup.dW.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true)), 8, 3, 8, cra1);
/* 1502 */       a(☃, cra1, 0, 3, 6, 0, 3, 7, ceh1, ceh1, false);
/* 1503 */       a(☃, cra1, 8, 3, 6, 8, 3, 7, ceh1, ceh1, false);
/*      */ 
/*      */       
/* 1506 */       a(☃, cra1, 0, 3, 4, 0, 5, 5, bup.dV.n(), bup.dV.n(), false);
/* 1507 */       a(☃, cra1, 8, 3, 4, 8, 5, 5, bup.dV.n(), bup.dV.n(), false);
/* 1508 */       a(☃, cra1, 1, 3, 5, 2, 5, 5, bup.dV.n(), bup.dV.n(), false);
/* 1509 */       a(☃, cra1, 6, 3, 5, 7, 5, 5, bup.dV.n(), bup.dV.n(), false);
/* 1510 */       a(☃, cra1, 1, 4, 5, 1, 5, 5, ceh2, ceh2, false);
/* 1511 */       a(☃, cra1, 7, 4, 5, 7, 5, 5, ceh2, ceh2, false);
/*      */ 
/*      */       
/* 1514 */       for (int i = 0; i <= 5; i++) {
/* 1515 */         for (int j = 0; j <= 8; j++) {
/* 1516 */           b(☃, bup.dV.n(), j, -1, i, cra1);
/*      */         }
/*      */       } 
/*      */       
/* 1520 */       return true;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cri.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */