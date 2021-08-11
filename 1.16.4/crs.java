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
/*      */ public class crs
/*      */ {
/*      */   static class f
/*      */   {
/*      */     public final Class<? extends crs.p> a;
/*      */     public final int b;
/*      */     public int c;
/*      */     public final int d;
/*      */     
/*      */     public f(Class<? extends crs.p> ☃, int i, int j) {
/*   55 */       this.a = ☃;
/*   56 */       this.b = i;
/*   57 */       this.d = j;
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/*   61 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */     
/*      */     public boolean a() {
/*   65 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */   }
/*      */   
/*   69 */   private static final f[] a = new f[] { new f((Class)n.class, 40, 0), new f((Class)h.class, 5, 5), new f((Class)d.class, 20, 0), new f((Class)i.class, 20, 0), new f((Class)j.class, 10, 6), new f((Class)o.class, 5, 5), new f((Class)l.class, 5, 5), new f((Class)c.class, 5, 4), new f((Class)a.class, 5, 4), new f(e.class, 10, 2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public boolean a(int ☃)
/*      */         {
/*   82 */           return (super.a(☃) && ☃ > 4);
/*      */         }
/*      */       }, 
/*      */       new f(g.class, 20, 1)
/*      */       {
/*      */         public boolean a(int ☃) {
/*   88 */           return (super.a(☃) && ☃ > 5);
/*      */         }
/*      */       } };
/*      */   
/*      */   private static List<f> b;
/*      */   private static Class<? extends p> c;
/*      */   private static int d;
/*      */   
/*      */   public static void a() {
/*   97 */     b = Lists.newArrayList();
/*   98 */     for (f ☃ : a) {
/*   99 */       ☃.c = 0;
/*  100 */       b.add(☃);
/*      */     } 
/*  102 */     c = null;
/*      */   }
/*      */   
/*      */   private static boolean c() {
/*  106 */     boolean ☃ = false;
/*  107 */     d = 0;
/*  108 */     for (f f1 : b) {
/*  109 */       if (f1.d > 0 && f1.c < f1.d) {
/*  110 */         ☃ = true;
/*      */       }
/*  112 */       d += f1.b;
/*      */     } 
/*  114 */     return ☃;
/*      */   }
/*      */   
/*      */   private static p a(Class<? extends p> ☃, List<cru> list, Random random, int i, int j, int m, @Nullable gc gc1, int n) {
/*  118 */     p p = null;
/*      */     
/*  120 */     if (☃ == n.class) {
/*  121 */       p = n.a(list, random, i, j, m, gc1, n);
/*  122 */     } else if (☃ == h.class) {
/*  123 */       p = h.a(list, random, i, j, m, gc1, n);
/*  124 */     } else if (☃ == d.class) {
/*  125 */       p = d.a(list, random, i, j, m, gc1, n);
/*  126 */     } else if (☃ == i.class) {
/*  127 */       p = i.a(list, random, i, j, m, gc1, n);
/*  128 */     } else if (☃ == j.class) {
/*  129 */       p = j.a(list, random, i, j, m, gc1, n);
/*  130 */     } else if (☃ == o.class) {
/*  131 */       p = o.a(list, random, i, j, m, gc1, n);
/*  132 */     } else if (☃ == l.class) {
/*  133 */       p = l.a(list, random, i, j, m, gc1, n);
/*  134 */     } else if (☃ == c.class) {
/*  135 */       p = c.a(list, random, i, j, m, gc1, n);
/*  136 */     } else if (☃ == a.class) {
/*  137 */       p = a.a(list, random, i, j, m, gc1, n);
/*  138 */     } else if (☃ == e.class) {
/*  139 */       p = e.a(list, random, i, j, m, gc1, n);
/*  140 */     } else if (☃ == g.class) {
/*  141 */       p = g.a(list, i, j, m, gc1, n);
/*      */     } 
/*      */     
/*  144 */     return p;
/*      */   }
/*      */   
/*      */   private static p b(m ☃, List<cru> list, Random random, int i, int j, int n, gc gc1, int i1) {
/*  148 */     if (!c()) {
/*  149 */       return null;
/*      */     }
/*      */     
/*  152 */     if (c != null) {
/*  153 */       p p = a(c, list, random, i, j, n, gc1, i1);
/*  154 */       c = null;
/*      */       
/*  156 */       if (p != null) {
/*  157 */         return p;
/*      */       }
/*      */     } 
/*      */     
/*  161 */     int i2 = 0;
/*  162 */     while (i2 < 5) {
/*  163 */       i2++;
/*      */       
/*  165 */       int i3 = random.nextInt(d);
/*  166 */       for (f f1 : b) {
/*  167 */         i3 -= f1.b;
/*  168 */         if (i3 < 0) {
/*  169 */           if (!f1.a(i1) || f1 == ☃.a) {
/*      */             break;
/*      */           }
/*      */           
/*  173 */           p p = a(f1.a, list, random, i, j, n, gc1, i1);
/*  174 */           if (p != null) {
/*  175 */             f1.c++;
/*  176 */             ☃.a = f1;
/*      */             
/*  178 */             if (!f1.a()) {
/*  179 */               b.remove(f1);
/*      */             }
/*  181 */             return p;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*  186 */     cra cra = b.a(list, random, i, j, n, gc1);
/*  187 */     if (cra != null && cra.b > 1) {
/*  188 */       return new b(i1, cra, gc1);
/*      */     }
/*      */     
/*  191 */     return null;
/*      */   }
/*      */   
/*      */   private static cru c(m ☃, List<cru> list, Random random, int i, int j, int n, @Nullable gc gc1, int i1) {
/*  195 */     if (i1 > 50) {
/*  196 */       return null;
/*      */     }
/*  198 */     if (Math.abs(i - (☃.g()).a) > 112 || Math.abs(n - (☃.g()).c) > 112) {
/*  199 */       return null;
/*      */     }
/*      */     
/*  202 */     cru cru = b(☃, list, random, i, j, n, gc1, i1 + 1);
/*  203 */     if (cru != null) {
/*  204 */       list.add(cru);
/*  205 */       ☃.c.add(cru);
/*      */     } 
/*  207 */     return cru;
/*      */   }
/*      */   
/*      */   static abstract class p extends cru {
/*  211 */     protected a d = a.a;
/*      */     
/*      */     protected p(clb ☃, int i) {
/*  214 */       super(☃, i);
/*      */     }
/*      */     
/*      */     public p(clb ☃, md md1) {
/*  218 */       super(☃, md1);
/*  219 */       this.d = a.valueOf(md1.l("EntryDoor"));
/*      */     }
/*      */     
/*      */     public enum a {
/*  223 */       a, b, c, d;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/*  228 */       ☃.a("EntryDoor", this.d.name());
/*      */     }
/*      */     
/*      */     protected void a(bsr ☃, Random random, cra cra1, a a1, int i, int j, int k) {
/*  232 */       switch (crs.null.a[a1.ordinal()]) {
/*      */         case 1:
/*  234 */           a(☃, cra1, i, j, k, i + 3 - 1, j + 3 - 1, k, m, m, false);
/*      */           break;
/*      */         case 2:
/*  237 */           a(☃, bup.du.n(), i, j, k, cra1);
/*  238 */           a(☃, bup.du.n(), i, j + 1, k, cra1);
/*  239 */           a(☃, bup.du.n(), i, j + 2, k, cra1);
/*  240 */           a(☃, bup.du.n(), i + 1, j + 2, k, cra1);
/*  241 */           a(☃, bup.du.n(), i + 2, j + 2, k, cra1);
/*  242 */           a(☃, bup.du.n(), i + 2, j + 1, k, cra1);
/*  243 */           a(☃, bup.du.n(), i + 2, j, k, cra1);
/*  244 */           a(☃, bup.cf.n(), i + 1, j, k, cra1);
/*  245 */           a(☃, bup.cf.n().a(bwb.e, cfd.a), i + 1, j + 1, k, cra1);
/*      */           break;
/*      */         case 3:
/*  248 */           a(☃, bup.lb.n(), i + 1, j, k, cra1);
/*  249 */           a(☃, bup.lb.n(), i + 1, j + 1, k, cra1);
/*  250 */           a(☃, bup.dH.n().a(bxq.d, Boolean.valueOf(true)), i, j, k, cra1);
/*  251 */           a(☃, bup.dH.n().a(bxq.d, Boolean.valueOf(true)), i, j + 1, k, cra1);
/*  252 */           a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)).a(bxq.d, Boolean.valueOf(true)), i, j + 2, k, cra1);
/*  253 */           a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)).a(bxq.d, Boolean.valueOf(true)), i + 1, j + 2, k, cra1);
/*  254 */           a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)).a(bxq.d, Boolean.valueOf(true)), i + 2, j + 2, k, cra1);
/*  255 */           a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)), i + 2, j + 1, k, cra1);
/*  256 */           a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)), i + 2, j, k, cra1);
/*      */           break;
/*      */         case 4:
/*  259 */           a(☃, bup.du.n(), i, j, k, cra1);
/*  260 */           a(☃, bup.du.n(), i, j + 1, k, cra1);
/*  261 */           a(☃, bup.du.n(), i, j + 2, k, cra1);
/*  262 */           a(☃, bup.du.n(), i + 1, j + 2, k, cra1);
/*  263 */           a(☃, bup.du.n(), i + 2, j + 2, k, cra1);
/*  264 */           a(☃, bup.du.n(), i + 2, j + 1, k, cra1);
/*  265 */           a(☃, bup.du.n(), i + 2, j, k, cra1);
/*  266 */           a(☃, bup.cr.n(), i + 1, j, k, cra1);
/*  267 */           a(☃, bup.cr.n().a(bwb.e, cfd.a), i + 1, j + 1, k, cra1);
/*  268 */           a(☃, bup.cB.n().a(buv.aq, gc.c), i + 2, j + 1, k + 1, cra1);
/*  269 */           a(☃, bup.cB.n().a(buv.aq, gc.d), i + 2, j + 1, k - 1, cra1);
/*      */           break;
/*      */       } 
/*      */     }
/*      */     
/*      */     protected a a(Random ☃) {
/*  275 */       int i = ☃.nextInt(5);
/*  276 */       switch (i)
/*      */       
/*      */       { 
/*      */         default:
/*  280 */           return a.a;
/*      */         case 2:
/*  282 */           return a.b;
/*      */         case 3:
/*  284 */           return a.c;
/*      */         case 4:
/*  286 */           break; }  return a.d;
/*      */     }
/*      */ 
/*      */     
/*      */     @Nullable
/*      */     protected cru a(crs.m ☃, List<cru> list, Random random, int i, int j) {
/*  292 */       gc gc = i();
/*  293 */       if (gc != null) {
/*  294 */         switch (crs.null.b[gc.ordinal()]) {
/*      */           case 1:
/*  296 */             return crs.a(☃, list, random, this.n.a + i, this.n.b + j, this.n.c - 1, gc, h());
/*      */           case 2:
/*  298 */             return crs.a(☃, list, random, this.n.a + i, this.n.b + j, this.n.f + 1, gc, h());
/*      */           case 3:
/*  300 */             return crs.a(☃, list, random, this.n.a - 1, this.n.b + j, this.n.c + i, gc, h());
/*      */           case 4:
/*  302 */             return crs.a(☃, list, random, this.n.d + 1, this.n.b + j, this.n.c + i, gc, h());
/*      */         } 
/*      */       }
/*  305 */       return null;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected cru b(crs.m ☃, List<cru> list, Random random, int i, int j) {
/*  310 */       gc gc = i();
/*  311 */       if (gc != null) {
/*  312 */         switch (crs.null.b[gc.ordinal()]) {
/*      */           case 1:
/*  314 */             return crs.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, gc.e, h());
/*      */           case 2:
/*  316 */             return crs.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, gc.e, h());
/*      */           case 3:
/*  318 */             return crs.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, gc.c, h());
/*      */           case 4:
/*  320 */             return crs.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, gc.c, h());
/*      */         } 
/*      */       }
/*  323 */       return null;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     protected cru c(crs.m ☃, List<cru> list, Random random, int i, int j) {
/*  328 */       gc gc = i();
/*  329 */       if (gc != null) {
/*  330 */         switch (crs.null.b[gc.ordinal()]) {
/*      */           case 1:
/*  332 */             return crs.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, gc.f, h());
/*      */           case 2:
/*  334 */             return crs.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, gc.f, h());
/*      */           case 3:
/*  336 */             return crs.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, gc.d, h());
/*      */           case 4:
/*  338 */             return crs.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, gc.d, h());
/*      */         } 
/*      */       }
/*  341 */       return null;
/*      */     }
/*      */     
/*      */     protected static boolean a(cra ☃) {
/*  345 */       return (☃ != null && ☃.b > 10);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class b
/*      */     extends p
/*      */   {
/*      */     private final int a;
/*      */     
/*      */     public b(int ☃, cra cra1, gc gc1) {
/*  356 */       super(clb.u, ☃);
/*      */       
/*  358 */       a(gc1);
/*  359 */       this.n = cra1;
/*  360 */       this.a = (gc1 == gc.c || gc1 == gc.d) ? cra1.f() : cra1.d();
/*      */     }
/*      */     
/*      */     public b(csw ☃, md md1) {
/*  364 */       super(clb.u, md1);
/*  365 */       this.a = md1.h("Steps");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/*  370 */       super.a(☃);
/*  371 */       ☃.b("Steps", this.a);
/*      */     }
/*      */     
/*      */     public static cra a(List<cru> ☃, Random random, int i, int j, int k, gc gc1) {
/*  375 */       int m = 3;
/*      */       
/*  377 */       cra cra = cra.a(i, j, k, -1, -1, 0, 5, 5, 4, gc1);
/*      */       
/*  379 */       cru cru = cru.a(☃, cra);
/*  380 */       if (cru == null)
/*      */       {
/*  382 */         return null;
/*      */       }
/*      */       
/*  385 */       if ((cru.g()).b == cra.b)
/*      */       {
/*  387 */         for (int n = 3; n >= 1; n--) {
/*  388 */           cra = cra.a(i, j, k, -1, -1, 0, 5, 5, n - 1, gc1);
/*  389 */           if (!cru.g().b(cra))
/*      */           {
/*      */             
/*  392 */             return cra.a(i, j, k, -1, -1, 0, 5, 5, n, gc1);
/*      */           }
/*      */         } 
/*      */       }
/*      */       
/*  397 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  403 */       for (int i = 0; i < this.a; i++) {
/*      */         
/*  405 */         a(☃, bup.du.n(), 0, 0, i, cra1);
/*  406 */         a(☃, bup.du.n(), 1, 0, i, cra1);
/*  407 */         a(☃, bup.du.n(), 2, 0, i, cra1);
/*  408 */         a(☃, bup.du.n(), 3, 0, i, cra1);
/*  409 */         a(☃, bup.du.n(), 4, 0, i, cra1);
/*      */         
/*  411 */         for (int j = 1; j <= 3; j++) {
/*  412 */           a(☃, bup.du.n(), 0, j, i, cra1);
/*  413 */           a(☃, bup.lb.n(), 1, j, i, cra1);
/*  414 */           a(☃, bup.lb.n(), 2, j, i, cra1);
/*  415 */           a(☃, bup.lb.n(), 3, j, i, cra1);
/*  416 */           a(☃, bup.du.n(), 4, j, i, cra1);
/*      */         } 
/*      */         
/*  419 */         a(☃, bup.du.n(), 0, 4, i, cra1);
/*  420 */         a(☃, bup.du.n(), 1, 4, i, cra1);
/*  421 */         a(☃, bup.du.n(), 2, 4, i, cra1);
/*  422 */         a(☃, bup.du.n(), 3, 4, i, cra1);
/*  423 */         a(☃, bup.du.n(), 4, 4, i, cra1);
/*      */       } 
/*      */       
/*  426 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class l
/*      */     extends p
/*      */   {
/*      */     private final boolean a;
/*      */ 
/*      */     
/*      */     public l(clb ☃, int i, Random random, int j, int k) {
/*  438 */       super(☃, i);
/*      */       
/*  440 */       this.a = true;
/*  441 */       a(gc.c.a.a(random));
/*  442 */       this.d = crs.p.a.a;
/*      */       
/*  444 */       if (i().n() == gc.a.c) {
/*  445 */         this.n = new cra(j, 64, k, j + 5 - 1, 74, k + 5 - 1);
/*      */       } else {
/*  447 */         this.n = new cra(j, 64, k, j + 5 - 1, 74, k + 5 - 1);
/*      */       } 
/*      */     }
/*      */     
/*      */     public l(int ☃, Random random, cra cra1, gc gc1) {
/*  452 */       super(clb.C, ☃);
/*      */       
/*  454 */       this.a = false;
/*  455 */       a(gc1);
/*  456 */       this.d = a(random);
/*  457 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public l(clb ☃, md md1) {
/*  461 */       super(☃, md1);
/*  462 */       this.a = md1.q("Source");
/*      */     }
/*      */     
/*      */     public l(csw ☃, md md1) {
/*  466 */       this(clb.C, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/*  471 */       super.a(☃);
/*  472 */       ☃.a("Source", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  477 */       if (this.a)
/*      */       {
/*  479 */         crs.a(crs.c.class);
/*      */       }
/*  481 */       a((crs.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static l a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int m) {
/*  485 */       cra cra = cra.a(i, j, k, -1, -7, 0, 5, 11, 5, gc1);
/*      */       
/*  487 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  488 */         return null;
/*      */       }
/*      */       
/*  491 */       return new l(m, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  497 */       a(☃, cra1, 0, 0, 0, 4, 10, 4, true, random, crs.b());
/*      */       
/*  499 */       a(☃, random, cra1, this.d, 1, 7, 0);
/*      */       
/*  501 */       a(☃, random, cra1, crs.p.a.a, 1, 1, 4);
/*      */ 
/*      */       
/*  504 */       a(☃, bup.du.n(), 2, 6, 1, cra1);
/*  505 */       a(☃, bup.du.n(), 1, 5, 1, cra1);
/*  506 */       a(☃, bup.hR.n(), 1, 6, 1, cra1);
/*  507 */       a(☃, bup.du.n(), 1, 5, 2, cra1);
/*  508 */       a(☃, bup.du.n(), 1, 4, 3, cra1);
/*  509 */       a(☃, bup.hR.n(), 1, 5, 3, cra1);
/*  510 */       a(☃, bup.du.n(), 2, 4, 3, cra1);
/*  511 */       a(☃, bup.du.n(), 3, 3, 3, cra1);
/*  512 */       a(☃, bup.hR.n(), 3, 4, 3, cra1);
/*  513 */       a(☃, bup.du.n(), 3, 3, 2, cra1);
/*  514 */       a(☃, bup.du.n(), 3, 2, 1, cra1);
/*  515 */       a(☃, bup.hR.n(), 3, 3, 1, cra1);
/*  516 */       a(☃, bup.du.n(), 2, 2, 1, cra1);
/*  517 */       a(☃, bup.du.n(), 1, 1, 1, cra1);
/*  518 */       a(☃, bup.hR.n(), 1, 2, 1, cra1);
/*  519 */       a(☃, bup.du.n(), 1, 1, 2, cra1);
/*  520 */       a(☃, bup.hR.n(), 1, 1, 3, cra1);
/*      */       
/*  522 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class m
/*      */     extends l
/*      */   {
/*      */     public crs.f a;
/*      */     @Nullable
/*      */     public crs.g b;
/*  532 */     public final List<cru> c = Lists.newArrayList();
/*      */     
/*      */     public m(Random ☃, int i, int j) {
/*  535 */       super(clb.D, 0, ☃, i, j);
/*      */     }
/*      */     
/*      */     public m(csw ☃, md md1) {
/*  539 */       super(clb.D, md1);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class n
/*      */     extends p
/*      */   {
/*      */     private final boolean a;
/*      */ 
/*      */ 
/*      */     
/*      */     private final boolean b;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public n(int ☃, Random random, cra cra1, gc gc1) {
/*  560 */       super(clb.E, ☃);
/*      */       
/*  562 */       a(gc1);
/*  563 */       this.d = a(random);
/*  564 */       this.n = cra1;
/*      */       
/*  566 */       this.a = (random.nextInt(2) == 0);
/*  567 */       this.b = (random.nextInt(2) == 0);
/*      */     }
/*      */     
/*      */     public n(csw ☃, md md1) {
/*  571 */       super(clb.E, md1);
/*  572 */       this.a = md1.q("Left");
/*  573 */       this.b = md1.q("Right");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/*  578 */       super.a(☃);
/*  579 */       ☃.a("Left", this.a);
/*  580 */       ☃.a("Right", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  585 */       a((crs.m)☃, list, random, 1, 1);
/*  586 */       if (this.a) {
/*  587 */         b((crs.m)☃, list, random, 1, 2);
/*      */       }
/*  589 */       if (this.b) {
/*  590 */         c((crs.m)☃, list, random, 1, 2);
/*      */       }
/*      */     }
/*      */     
/*      */     public static n a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int m) {
/*  595 */       cra cra = cra.a(i, j, k, -1, -1, 0, 5, 5, 7, gc1);
/*      */       
/*  597 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  598 */         return null;
/*      */       }
/*      */       
/*  601 */       return new n(m, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  607 */       a(☃, cra1, 0, 0, 0, 4, 4, 6, true, random, crs.b());
/*      */       
/*  609 */       a(☃, random, cra1, this.d, 1, 1, 0);
/*      */       
/*  611 */       a(☃, random, cra1, crs.p.a.a, 1, 1, 6);
/*      */       
/*  613 */       ceh ceh1 = bup.bM.n().a(cbn.a, gc.f);
/*  614 */       ceh ceh2 = bup.bM.n().a(cbn.a, gc.e);
/*      */       
/*  616 */       a(☃, cra1, random, 0.1F, 1, 2, 1, ceh1);
/*  617 */       a(☃, cra1, random, 0.1F, 3, 2, 1, ceh2);
/*  618 */       a(☃, cra1, random, 0.1F, 1, 2, 5, ceh1);
/*  619 */       a(☃, cra1, random, 0.1F, 3, 2, 5, ceh2);
/*      */       
/*  621 */       if (this.a) {
/*  622 */         a(☃, cra1, 0, 1, 2, 0, 3, 4, m, m, false);
/*      */       }
/*  624 */       if (this.b) {
/*  625 */         a(☃, cra1, 4, 1, 2, 4, 3, 4, m, m, false);
/*      */       }
/*      */       
/*  628 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class a
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public a(int ☃, Random random, cra cra1, gc gc1) {
/*  640 */       super(clb.t, ☃);
/*      */       
/*  642 */       a(gc1);
/*  643 */       this.d = a(random);
/*  644 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public a(csw ☃, md md1) {
/*  648 */       super(clb.t, md1);
/*  649 */       this.a = md1.q("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/*  654 */       super.a(☃);
/*  655 */       ☃.a("Chest", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  660 */       a((crs.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static a a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int m) {
/*  664 */       cra cra = cra.a(i, j, k, -1, -1, 0, 5, 5, 7, gc1);
/*      */       
/*  666 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  667 */         return null;
/*      */       }
/*      */       
/*  670 */       return new a(m, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  676 */       a(☃, cra1, 0, 0, 0, 4, 4, 6, true, random, crs.b());
/*      */       
/*  678 */       a(☃, random, cra1, this.d, 1, 1, 0);
/*      */       
/*  680 */       a(☃, random, cra1, crs.p.a.a, 1, 1, 6);
/*      */ 
/*      */       
/*  683 */       a(☃, cra1, 3, 1, 2, 3, 1, 4, bup.du.n(), bup.du.n(), false);
/*  684 */       a(☃, bup.hX.n(), 3, 1, 1, cra1);
/*  685 */       a(☃, bup.hX.n(), 3, 1, 5, cra1);
/*  686 */       a(☃, bup.hX.n(), 3, 2, 2, cra1);
/*  687 */       a(☃, bup.hX.n(), 3, 2, 4, cra1);
/*  688 */       for (int i = 2; i <= 4; i++) {
/*  689 */         a(☃, bup.hX.n(), 2, 1, i, cra1);
/*      */       }
/*      */       
/*  692 */       if (!this.a && 
/*  693 */         cra1.b(new fx(a(3, 3), d(2), b(3, 3)))) {
/*  694 */         this.a = true;
/*  695 */         a(☃, cra1, random, 3, 2, 3, cyq.y);
/*      */       } 
/*      */ 
/*      */       
/*  699 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class o
/*      */     extends p
/*      */   {
/*      */     public o(int ☃, Random random, cra cra1, gc gc1) {
/*  709 */       super(clb.F, ☃);
/*      */       
/*  711 */       a(gc1);
/*  712 */       this.d = a(random);
/*  713 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public o(csw ☃, md md1) {
/*  717 */       super(clb.F, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  722 */       a((crs.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static o a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int m) {
/*  726 */       cra cra = cra.a(i, j, k, -1, -7, 0, 5, 11, 8, gc1);
/*      */       
/*  728 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  729 */         return null;
/*      */       }
/*      */       
/*  732 */       return new o(m, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  738 */       a(☃, cra1, 0, 0, 0, 4, 10, 7, true, random, crs.b());
/*      */       
/*  740 */       a(☃, random, cra1, this.d, 1, 7, 0);
/*      */       
/*  742 */       a(☃, random, cra1, crs.p.a.a, 1, 1, 7);
/*      */ 
/*      */       
/*  745 */       ceh ceh = bup.ci.n().a(cak.a, gc.d);
/*  746 */       for (int i = 0; i < 6; i++) {
/*  747 */         a(☃, ceh, 1, 6 - i, 1 + i, cra1);
/*  748 */         a(☃, ceh, 2, 6 - i, 1 + i, cra1);
/*  749 */         a(☃, ceh, 3, 6 - i, 1 + i, cra1);
/*  750 */         if (i < 5) {
/*  751 */           a(☃, bup.du.n(), 1, 5 - i, 1 + i, cra1);
/*  752 */           a(☃, bup.du.n(), 2, 5 - i, 1 + i, cra1);
/*  753 */           a(☃, bup.du.n(), 3, 5 - i, 1 + i, cra1);
/*      */         } 
/*      */       } 
/*      */       
/*  757 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static abstract class q
/*      */     extends p
/*      */   {
/*      */     protected q(clb ☃, int i) {
/*  767 */       super(☃, i);
/*      */     }
/*      */     
/*      */     public q(clb ☃, md md1) {
/*  771 */       super(☃, md1);
/*      */     }
/*      */   }
/*      */   
/*      */   public static class d extends q {
/*      */     public d(int ☃, Random random, cra cra1, gc gc1) {
/*  777 */       super(clb.w, ☃);
/*      */       
/*  779 */       a(gc1);
/*  780 */       this.d = a(random);
/*  781 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public d(csw ☃, md md1) {
/*  785 */       super(clb.w, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  790 */       gc gc = i();
/*  791 */       if (gc == gc.c || gc == gc.f) {
/*  792 */         b((crs.m)☃, list, random, 1, 1);
/*      */       } else {
/*  794 */         c((crs.m)☃, list, random, 1, 1);
/*      */       } 
/*      */     }
/*      */     
/*      */     public static d a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int m) {
/*  799 */       cra cra = cra.a(i, j, k, -1, -1, 0, 5, 5, 5, gc1);
/*      */       
/*  801 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  802 */         return null;
/*      */       }
/*      */       
/*  805 */       return new d(m, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  811 */       a(☃, cra1, 0, 0, 0, 4, 4, 4, true, random, crs.b());
/*      */       
/*  813 */       a(☃, random, cra1, this.d, 1, 1, 0);
/*      */       
/*  815 */       gc gc = i();
/*  816 */       if (gc == gc.c || gc == gc.f) {
/*  817 */         a(☃, cra1, 0, 1, 1, 0, 3, 3, m, m, false);
/*      */       } else {
/*  819 */         a(☃, cra1, 4, 1, 1, 4, 3, 3, m, m, false);
/*      */       } 
/*      */       
/*  822 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class i extends q {
/*      */     public i(int ☃, Random random, cra cra1, gc gc1) {
/*  828 */       super(clb.A, ☃);
/*      */       
/*  830 */       a(gc1);
/*  831 */       this.d = a(random);
/*  832 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public i(csw ☃, md md1) {
/*  836 */       super(clb.A, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  841 */       gc gc = i();
/*  842 */       if (gc == gc.c || gc == gc.f) {
/*  843 */         c((crs.m)☃, list, random, 1, 1);
/*      */       } else {
/*  845 */         b((crs.m)☃, list, random, 1, 1);
/*      */       } 
/*      */     }
/*      */     
/*      */     public static i a(List<cru> ☃, Random random, int j, int k, int m, gc gc1, int n) {
/*  850 */       cra cra = cra.a(j, k, m, -1, -1, 0, 5, 5, 5, gc1);
/*      */       
/*  852 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  853 */         return null;
/*      */       }
/*      */       
/*  856 */       return new i(n, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  862 */       a(☃, cra1, 0, 0, 0, 4, 4, 4, true, random, crs.b());
/*      */       
/*  864 */       a(☃, random, cra1, this.d, 1, 1, 0);
/*      */       
/*  866 */       gc gc = i();
/*  867 */       if (gc == gc.c || gc == gc.f) {
/*  868 */         a(☃, cra1, 4, 1, 1, 4, 3, 3, m, m, false);
/*      */       } else {
/*  870 */         a(☃, cra1, 0, 1, 1, 0, 3, 3, m, m, false);
/*      */       } 
/*      */       
/*  873 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class j
/*      */     extends p
/*      */   {
/*      */     protected final int a;
/*      */ 
/*      */     
/*      */     public j(int ☃, Random random, cra cra1, gc gc1) {
/*  885 */       super(clb.B, ☃);
/*      */       
/*  887 */       a(gc1);
/*  888 */       this.d = a(random);
/*  889 */       this.n = cra1;
/*  890 */       this.a = random.nextInt(5);
/*      */     }
/*      */     
/*      */     public j(csw ☃, md md1) {
/*  894 */       super(clb.B, md1);
/*  895 */       this.a = md1.h("Type");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/*  900 */       super.a(☃);
/*  901 */       ☃.b("Type", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/*  906 */       a((crs.m)☃, list, random, 4, 1);
/*  907 */       b((crs.m)☃, list, random, 1, 4);
/*  908 */       c((crs.m)☃, list, random, 1, 4);
/*      */     }
/*      */     
/*      */     public static j a(List<cru> ☃, Random random, int i, int k, int m, gc gc1, int n) {
/*  912 */       cra cra = cra.a(i, k, m, -4, -1, 0, 11, 7, 11, gc1);
/*      */       
/*  914 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*  915 */         return null;
/*      */       }
/*      */       
/*  918 */       return new j(n, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  924 */       a(☃, cra1, 0, 0, 0, 10, 6, 10, true, random, crs.b());
/*      */       
/*  926 */       a(☃, random, cra1, this.d, 4, 1, 0);
/*      */       
/*  928 */       a(☃, cra1, 4, 1, 10, 6, 3, 10, m, m, false);
/*  929 */       a(☃, cra1, 0, 1, 4, 0, 3, 6, m, m, false);
/*  930 */       a(☃, cra1, 10, 1, 4, 10, 3, 6, m, m, false);
/*      */       
/*  932 */       switch (this.a)
/*      */       
/*      */       { 
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
/*      */         default:
/* 1009 */           return true;
/*      */         case 0:
/*      */           a(☃, bup.du.n(), 5, 1, 5, cra1); a(☃, bup.du.n(), 5, 2, 5, cra1); a(☃, bup.du.n(), 5, 3, 5, cra1); a(☃, bup.bM.n().a(cbn.a, gc.e), 4, 3, 5, cra1); a(☃, bup.bM.n().a(cbn.a, gc.f), 6, 3, 5, cra1); a(☃, bup.bM.n().a(cbn.a, gc.d), 5, 3, 4, cra1); a(☃, bup.bM.n().a(cbn.a, gc.c), 5, 3, 6, cra1); a(☃, bup.hR.n(), 4, 1, 4, cra1); a(☃, bup.hR.n(), 4, 1, 5, cra1); a(☃, bup.hR.n(), 4, 1, 6, cra1); a(☃, bup.hR.n(), 6, 1, 4, cra1); a(☃, bup.hR.n(), 6, 1, 5, cra1); a(☃, bup.hR.n(), 6, 1, 6, cra1); a(☃, bup.hR.n(), 5, 1, 4, cra1); a(☃, bup.hR.n(), 5, 1, 6, cra1);
/*      */         case 1:
/*      */           for (i = 0; i < 5; i++) { a(☃, bup.du.n(), 3, 1, 3 + i, cra1); a(☃, bup.du.n(), 7, 1, 3 + i, cra1); a(☃, bup.du.n(), 3 + i, 1, 3, cra1); a(☃, bup.du.n(), 3 + i, 1, 7, cra1); }  a(☃, bup.du.n(), 5, 1, 5, cra1); a(☃, bup.du.n(), 5, 2, 5, cra1); a(☃, bup.du.n(), 5, 3, 5, cra1); a(☃, bup.A.n(), 5, 4, 5, cra1);
/*      */         case 2:
/*      */           break; }  int i; for (i = 1; i <= 9; i++) { a(☃, bup.m.n(), 1, 3, i, cra1); a(☃, bup.m.n(), 9, 3, i, cra1); }  for (i = 1; i <= 9; i++) { a(☃, bup.m.n(), i, 3, 1, cra1); a(☃, bup.m.n(), i, 3, 9, cra1); }
/*      */        a(☃, bup.m.n(), 5, 1, 4, cra1); a(☃, bup.m.n(), 5, 1, 6, cra1); a(☃, bup.m.n(), 5, 3, 4, cra1); a(☃, bup.m.n(), 5, 3, 6, cra1); a(☃, bup.m.n(), 4, 1, 5, cra1); a(☃, bup.m.n(), 6, 1, 5, cra1); a(☃, bup.m.n(), 4, 3, 5, cra1); a(☃, bup.m.n(), 6, 3, 5, cra1); for (i = 1; i <= 3; i++) { a(☃, bup.m.n(), 4, i, 4, cra1); a(☃, bup.m.n(), 6, i, 4, cra1); a(☃, bup.m.n(), 4, i, 6, cra1); a(☃, bup.m.n(), 6, i, 6, cra1); }
/*      */        a(☃, bup.bL.n(), 5, 3, 5, cra1); for (i = 2; i <= 8; i++) { a(☃, bup.n.n(), 2, 3, i, cra1); a(☃, bup.n.n(), 3, 3, i, cra1); if (i <= 3 || i >= 7) { a(☃, bup.n.n(), 4, 3, i, cra1); a(☃, bup.n.n(), 5, 3, i, cra1); a(☃, bup.n.n(), 6, 3, i, cra1); }
/*      */          a(☃, bup.n.n(), 7, 3, i, cra1); a(☃, bup.n.n(), 8, 3, i, cra1); }
/* 1019 */        ceh ceh = bup.cg.n().a(bxv.a, gc.e); a(☃, ceh, 9, 1, 3, cra1); a(☃, ceh, 9, 2, 3, cra1); a(☃, ceh, 9, 3, 3, cra1); a(☃, cra1, random, 3, 4, 8, cyq.x); } } public static class h extends p { public h(int ☃, Random random, cra cra1, gc gc1) { super(clb.z, ☃);
/*      */       
/* 1021 */       a(gc1);
/* 1022 */       this.d = a(random);
/* 1023 */       this.n = cra1; }
/*      */ 
/*      */     
/*      */     public h(csw ☃, md md1) {
/* 1027 */       super(clb.z, md1);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/* 1032 */       a((crs.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static h a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int m) {
/* 1036 */       cra cra = cra.a(i, j, k, -1, -1, 0, 9, 5, 11, gc1);
/*      */       
/* 1038 */       if (!a(cra) || cru.a(☃, cra) != null) {
/* 1039 */         return null;
/*      */       }
/*      */       
/* 1042 */       return new h(m, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1048 */       a(☃, cra1, 0, 0, 0, 8, 4, 10, true, random, crs.b());
/*      */       
/* 1050 */       a(☃, random, cra1, this.d, 1, 1, 0);
/*      */       
/* 1052 */       a(☃, cra1, 1, 1, 10, 3, 3, 10, m, m, false);
/*      */ 
/*      */       
/* 1055 */       a(☃, cra1, 4, 1, 1, 4, 3, 1, false, random, crs.b());
/* 1056 */       a(☃, cra1, 4, 1, 3, 4, 3, 3, false, random, crs.b());
/* 1057 */       a(☃, cra1, 4, 1, 7, 4, 3, 7, false, random, crs.b());
/* 1058 */       a(☃, cra1, 4, 1, 9, 4, 3, 9, false, random, crs.b());
/*      */ 
/*      */       
/* 1061 */       for (int i = 1; i <= 3; i++) {
/* 1062 */         a(☃, bup.dH.n().a(bxq.a, Boolean.valueOf(true)).a(bxq.c, Boolean.valueOf(true)), 4, i, 4, cra1);
/* 1063 */         a(☃, bup.dH.n().a(bxq.a, Boolean.valueOf(true)).a(bxq.c, Boolean.valueOf(true)).a(bxq.b, Boolean.valueOf(true)), 4, i, 5, cra1);
/* 1064 */         a(☃, bup.dH.n().a(bxq.a, Boolean.valueOf(true)).a(bxq.c, Boolean.valueOf(true)), 4, i, 6, cra1);
/*      */         
/* 1066 */         a(☃, bup.dH.n().a(bxq.d, Boolean.valueOf(true)).a(bxq.b, Boolean.valueOf(true)), 5, i, 5, cra1);
/* 1067 */         a(☃, bup.dH.n().a(bxq.d, Boolean.valueOf(true)).a(bxq.b, Boolean.valueOf(true)), 6, i, 5, cra1);
/* 1068 */         a(☃, bup.dH.n().a(bxq.d, Boolean.valueOf(true)).a(bxq.b, Boolean.valueOf(true)), 7, i, 5, cra1);
/*      */       } 
/*      */ 
/*      */       
/* 1072 */       a(☃, bup.dH.n().a(bxq.a, Boolean.valueOf(true)).a(bxq.c, Boolean.valueOf(true)), 4, 3, 2, cra1);
/* 1073 */       a(☃, bup.dH.n().a(bxq.a, Boolean.valueOf(true)).a(bxq.c, Boolean.valueOf(true)), 4, 3, 8, cra1);
/* 1074 */       ceh ceh1 = bup.cr.n().a(bwb.a, gc.e);
/* 1075 */       ceh ceh2 = bup.cr.n().a(bwb.a, gc.e).a(bwb.e, cfd.a);
/* 1076 */       a(☃, ceh1, 4, 1, 2, cra1);
/* 1077 */       a(☃, ceh2, 4, 2, 2, cra1);
/* 1078 */       a(☃, ceh1, 4, 1, 8, cra1);
/* 1079 */       a(☃, ceh2, 4, 2, 8, cra1);
/*      */       
/* 1081 */       return true;
/*      */     } }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class e
/*      */     extends p
/*      */   {
/*      */     private final boolean a;
/*      */ 
/*      */     
/*      */     public e(int ☃, Random random, cra cra1, gc gc1) {
/* 1094 */       super(clb.x, ☃);
/*      */       
/* 1096 */       a(gc1);
/* 1097 */       this.d = a(random);
/* 1098 */       this.n = cra1;
/* 1099 */       this.a = (cra1.e() > 6);
/*      */     }
/*      */     
/*      */     public e(csw ☃, md md1) {
/* 1103 */       super(clb.x, md1);
/* 1104 */       this.a = md1.q("Tall");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/* 1109 */       super.a(☃);
/* 1110 */       ☃.a("Tall", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public static e a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int m) {
/* 1115 */       cra cra = cra.a(i, j, k, -4, -1, 0, 14, 11, 15, gc1);
/*      */       
/* 1117 */       if (!a(cra) || cru.a(☃, cra) != null) {
/*      */         
/* 1119 */         cra = cra.a(i, j, k, -4, -1, 0, 14, 6, 15, gc1);
/*      */         
/* 1121 */         if (!a(cra) || cru.a(☃, cra) != null) {
/* 1122 */           return null;
/*      */         }
/*      */       } 
/*      */       
/* 1126 */       return new e(m, random, cra, gc1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1131 */       int i = 11;
/* 1132 */       if (!this.a) {
/* 1133 */         i = 6;
/*      */       }
/*      */ 
/*      */       
/* 1137 */       a(☃, cra1, 0, 0, 0, 13, i - 1, 14, true, random, crs.b());
/*      */       
/* 1139 */       a(☃, random, cra1, this.d, 4, 1, 0);
/*      */ 
/*      */       
/* 1142 */       a(☃, cra1, random, 0.07F, 2, 1, 1, 11, 4, 13, bup.aQ.n(), bup.aQ.n(), false, false);
/*      */       
/* 1144 */       int j = 1;
/* 1145 */       int k = 12;
/*      */       
/*      */       int m;
/* 1148 */       for (m = 1; m <= 13; m++) {
/* 1149 */         if ((m - 1) % 4 == 0) {
/* 1150 */           a(☃, cra1, 1, 1, m, 1, 4, m, bup.n.n(), bup.n.n(), false);
/* 1151 */           a(☃, cra1, 12, 1, m, 12, 4, m, bup.n.n(), bup.n.n(), false);
/*      */           
/* 1153 */           a(☃, bup.bM.n().a(cbn.a, gc.f), 2, 3, m, cra1);
/* 1154 */           a(☃, bup.bM.n().a(cbn.a, gc.e), 11, 3, m, cra1);
/*      */           
/* 1156 */           if (this.a) {
/* 1157 */             a(☃, cra1, 1, 6, m, 1, 9, m, bup.n.n(), bup.n.n(), false);
/* 1158 */             a(☃, cra1, 12, 6, m, 12, 9, m, bup.n.n(), bup.n.n(), false);
/*      */           } 
/*      */         } else {
/* 1161 */           a(☃, cra1, 1, 1, m, 1, 4, m, bup.bI.n(), bup.bI.n(), false);
/* 1162 */           a(☃, cra1, 12, 1, m, 12, 4, m, bup.bI.n(), bup.bI.n(), false);
/*      */           
/* 1164 */           if (this.a) {
/* 1165 */             a(☃, cra1, 1, 6, m, 1, 9, m, bup.bI.n(), bup.bI.n(), false);
/* 1166 */             a(☃, cra1, 12, 6, m, 12, 9, m, bup.bI.n(), bup.bI.n(), false);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1172 */       for (m = 3; m < 12; m += 2) {
/* 1173 */         a(☃, cra1, 3, 1, m, 4, 3, m, bup.bI.n(), bup.bI.n(), false);
/* 1174 */         a(☃, cra1, 6, 1, m, 7, 3, m, bup.bI.n(), bup.bI.n(), false);
/* 1175 */         a(☃, cra1, 9, 1, m, 10, 3, m, bup.bI.n(), bup.bI.n(), false);
/*      */       } 
/*      */       
/* 1178 */       if (this.a) {
/*      */         
/* 1180 */         a(☃, cra1, 1, 5, 1, 3, 5, 13, bup.n.n(), bup.n.n(), false);
/* 1181 */         a(☃, cra1, 10, 5, 1, 12, 5, 13, bup.n.n(), bup.n.n(), false);
/* 1182 */         a(☃, cra1, 4, 5, 1, 9, 5, 2, bup.n.n(), bup.n.n(), false);
/* 1183 */         a(☃, cra1, 4, 5, 12, 9, 5, 13, bup.n.n(), bup.n.n(), false);
/*      */         
/* 1185 */         a(☃, bup.n.n(), 9, 5, 11, cra1);
/* 1186 */         a(☃, bup.n.n(), 8, 5, 11, cra1);
/* 1187 */         a(☃, bup.n.n(), 9, 5, 10, cra1);
/*      */         
/* 1189 */         ceh ceh1 = bup.cJ.n().a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/* 1190 */         ceh ceh2 = bup.cJ.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.c, Boolean.valueOf(true));
/*      */ 
/*      */         
/* 1193 */         a(☃, cra1, 3, 6, 3, 3, 6, 11, ceh2, ceh2, false);
/* 1194 */         a(☃, cra1, 10, 6, 3, 10, 6, 9, ceh2, ceh2, false);
/* 1195 */         a(☃, cra1, 4, 6, 2, 9, 6, 2, ceh1, ceh1, false);
/* 1196 */         a(☃, cra1, 4, 6, 12, 7, 6, 12, ceh1, ceh1, false);
/*      */         
/* 1198 */         a(☃, bup.cJ.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true)), 3, 6, 2, cra1);
/* 1199 */         a(☃, bup.cJ.n().a(bwq.c, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true)), 3, 6, 12, cra1);
/* 1200 */         a(☃, bup.cJ.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.d, Boolean.valueOf(true)), 10, 6, 2, cra1);
/*      */         
/* 1202 */         for (int n = 0; n <= 2; n++) {
/* 1203 */           a(☃, bup.cJ.n().a(bwq.c, Boolean.valueOf(true)).a(bwq.d, Boolean.valueOf(true)), 8 + n, 6, 12 - n, cra1);
/* 1204 */           if (n != 2) {
/* 1205 */             a(☃, bup.cJ.n().a(bwq.a, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true)), 8 + n, 6, 11 - n, cra1);
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/* 1210 */         ceh ceh3 = bup.cg.n().a(bxv.a, gc.d);
/* 1211 */         a(☃, ceh3, 10, 1, 13, cra1);
/* 1212 */         a(☃, ceh3, 10, 2, 13, cra1);
/* 1213 */         a(☃, ceh3, 10, 3, 13, cra1);
/* 1214 */         a(☃, ceh3, 10, 4, 13, cra1);
/* 1215 */         a(☃, ceh3, 10, 5, 13, cra1);
/* 1216 */         a(☃, ceh3, 10, 6, 13, cra1);
/* 1217 */         a(☃, ceh3, 10, 7, 13, cra1);
/*      */ 
/*      */         
/* 1220 */         int i1 = 7;
/* 1221 */         int i2 = 7;
/* 1222 */         ceh ceh4 = bup.cJ.n().a(bwq.b, Boolean.valueOf(true));
/* 1223 */         a(☃, ceh4, 6, 9, 7, cra1);
/* 1224 */         ceh ceh5 = bup.cJ.n().a(bwq.d, Boolean.valueOf(true));
/* 1225 */         a(☃, ceh5, 7, 9, 7, cra1);
/*      */         
/* 1227 */         a(☃, ceh4, 6, 8, 7, cra1);
/* 1228 */         a(☃, ceh5, 7, 8, 7, cra1);
/*      */         
/* 1230 */         ceh ceh6 = ceh2.a(bwq.d, Boolean.valueOf(true)).a(bwq.b, Boolean.valueOf(true));
/*      */         
/* 1232 */         a(☃, ceh6, 6, 7, 7, cra1);
/* 1233 */         a(☃, ceh6, 7, 7, 7, cra1);
/*      */         
/* 1235 */         a(☃, ceh4, 5, 7, 7, cra1);
/*      */         
/* 1237 */         a(☃, ceh5, 8, 7, 7, cra1);
/*      */         
/* 1239 */         a(☃, ceh4.a(bwq.a, Boolean.valueOf(true)), 6, 7, 6, cra1);
/* 1240 */         a(☃, ceh4.a(bwq.c, Boolean.valueOf(true)), 6, 7, 8, cra1);
/*      */         
/* 1242 */         a(☃, ceh5.a(bwq.a, Boolean.valueOf(true)), 7, 7, 6, cra1);
/* 1243 */         a(☃, ceh5.a(bwq.c, Boolean.valueOf(true)), 7, 7, 8, cra1);
/*      */         
/* 1245 */         ceh ceh7 = bup.bL.n();
/* 1246 */         a(☃, ceh7, 5, 8, 7, cra1);
/* 1247 */         a(☃, ceh7, 8, 8, 7, cra1);
/* 1248 */         a(☃, ceh7, 6, 8, 6, cra1);
/* 1249 */         a(☃, ceh7, 6, 8, 8, cra1);
/* 1250 */         a(☃, ceh7, 7, 8, 6, cra1);
/* 1251 */         a(☃, ceh7, 7, 8, 8, cra1);
/*      */       } 
/*      */ 
/*      */       
/* 1255 */       a(☃, cra1, random, 3, 3, 5, cyq.w);
/* 1256 */       if (this.a) {
/* 1257 */         a(☃, m, 12, 9, 1, cra1);
/* 1258 */         a(☃, cra1, random, 12, 8, 1, cyq.w);
/*      */       } 
/*      */       
/* 1261 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class c
/*      */     extends p
/*      */   {
/*      */     private final boolean a;
/*      */     
/*      */     private final boolean b;
/*      */     private final boolean c;
/*      */     private final boolean e;
/*      */     
/*      */     public c(int ☃, Random random, cra cra1, gc gc1) {
/* 1276 */       super(clb.v, ☃);
/*      */       
/* 1278 */       a(gc1);
/* 1279 */       this.d = a(random);
/* 1280 */       this.n = cra1;
/*      */       
/* 1282 */       this.a = random.nextBoolean();
/* 1283 */       this.b = random.nextBoolean();
/* 1284 */       this.c = random.nextBoolean();
/* 1285 */       this.e = (random.nextInt(3) > 0);
/*      */     }
/*      */     
/*      */     public c(csw ☃, md md1) {
/* 1289 */       super(clb.v, md1);
/* 1290 */       this.a = md1.q("leftLow");
/* 1291 */       this.b = md1.q("leftHigh");
/* 1292 */       this.c = md1.q("rightLow");
/* 1293 */       this.e = md1.q("rightHigh");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/* 1298 */       super.a(☃);
/* 1299 */       ☃.a("leftLow", this.a);
/* 1300 */       ☃.a("leftHigh", this.b);
/* 1301 */       ☃.a("rightLow", this.c);
/* 1302 */       ☃.a("rightHigh", this.e);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/* 1307 */       int i = 3;
/* 1308 */       int j = 5;
/*      */       
/* 1310 */       gc gc = i();
/* 1311 */       if (gc == gc.e || gc == gc.c) {
/* 1312 */         i = 8 - i;
/* 1313 */         j = 8 - j;
/*      */       } 
/*      */       
/* 1316 */       a((crs.m)☃, list, random, 5, 1);
/* 1317 */       if (this.a) {
/* 1318 */         b((crs.m)☃, list, random, i, 1);
/*      */       }
/* 1320 */       if (this.b) {
/* 1321 */         b((crs.m)☃, list, random, j, 7);
/*      */       }
/* 1323 */       if (this.c) {
/* 1324 */         c((crs.m)☃, list, random, i, 1);
/*      */       }
/* 1326 */       if (this.e) {
/* 1327 */         c((crs.m)☃, list, random, j, 7);
/*      */       }
/*      */     }
/*      */     
/*      */     public static c a(List<cru> ☃, Random random, int i, int j, int k, gc gc1, int m) {
/* 1332 */       cra cra = cra.a(i, j, k, -4, -3, 0, 10, 9, 11, gc1);
/*      */       
/* 1334 */       if (!a(cra) || cru.a(☃, cra) != null) {
/* 1335 */         return null;
/*      */       }
/*      */       
/* 1338 */       return new c(m, random, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1344 */       a(☃, cra1, 0, 0, 0, 9, 8, 10, true, random, crs.b());
/*      */       
/* 1346 */       a(☃, random, cra1, this.d, 4, 3, 0);
/*      */ 
/*      */       
/* 1349 */       if (this.a) {
/* 1350 */         a(☃, cra1, 0, 3, 1, 0, 5, 3, m, m, false);
/*      */       }
/* 1352 */       if (this.c) {
/* 1353 */         a(☃, cra1, 9, 3, 1, 9, 5, 3, m, m, false);
/*      */       }
/* 1355 */       if (this.b) {
/* 1356 */         a(☃, cra1, 0, 5, 7, 0, 7, 9, m, m, false);
/*      */       }
/* 1358 */       if (this.e) {
/* 1359 */         a(☃, cra1, 9, 5, 7, 9, 7, 9, m, m, false);
/*      */       }
/* 1361 */       a(☃, cra1, 5, 1, 10, 7, 3, 10, m, m, false);
/*      */ 
/*      */       
/* 1364 */       a(☃, cra1, 1, 2, 1, 8, 2, 6, false, random, crs.b());
/*      */       
/* 1366 */       a(☃, cra1, 4, 1, 5, 4, 4, 9, false, random, crs.b());
/* 1367 */       a(☃, cra1, 8, 1, 5, 8, 4, 9, false, random, crs.b());
/*      */       
/* 1369 */       a(☃, cra1, 1, 4, 7, 3, 4, 9, false, random, crs.b());
/*      */ 
/*      */       
/* 1372 */       a(☃, cra1, 1, 3, 5, 3, 3, 6, false, random, crs.b());
/* 1373 */       a(☃, cra1, 1, 3, 4, 3, 3, 4, bup.hR.n(), bup.hR.n(), false);
/* 1374 */       a(☃, cra1, 1, 4, 6, 3, 4, 6, bup.hR.n(), bup.hR.n(), false);
/*      */ 
/*      */       
/* 1377 */       a(☃, cra1, 5, 1, 7, 7, 1, 8, false, random, crs.b());
/* 1378 */       a(☃, cra1, 5, 1, 9, 7, 1, 9, bup.hR.n(), bup.hR.n(), false);
/* 1379 */       a(☃, cra1, 5, 2, 7, 7, 2, 7, bup.hR.n(), bup.hR.n(), false);
/*      */ 
/*      */       
/* 1382 */       a(☃, cra1, 4, 5, 7, 4, 5, 9, bup.hR.n(), bup.hR.n(), false);
/* 1383 */       a(☃, cra1, 8, 5, 7, 8, 5, 9, bup.hR.n(), bup.hR.n(), false);
/* 1384 */       a(☃, cra1, 5, 5, 7, 7, 5, 9, bup.hR.n().a(bzw.a, cfm.c), bup.hR.n().a(bzw.a, cfm.c), false);
/* 1385 */       a(☃, bup.bM.n().a(cbn.a, gc.d), 6, 5, 6, cra1);
/*      */       
/* 1387 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class g
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public g(int ☃, cra cra1, gc gc1) {
/* 1399 */       super(clb.y, ☃);
/*      */       
/* 1401 */       a(gc1);
/* 1402 */       this.n = cra1;
/*      */     }
/*      */     
/*      */     public g(csw ☃, md md1) {
/* 1406 */       super(clb.y, md1);
/* 1407 */       this.a = md1.q("Mob");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(md ☃) {
/* 1412 */       super.a(☃);
/* 1413 */       ☃.a("Mob", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(cru ☃, List<cru> list, Random random) {
/* 1418 */       if (☃ != null) {
/* 1419 */         ((crs.m)☃).b = this;
/*      */       }
/*      */     }
/*      */     
/*      */     public static g a(List<cru> ☃, int i, int j, int k, gc gc1, int m) {
/* 1424 */       cra cra = cra.a(i, j, k, -4, -1, 0, 11, 8, 16, gc1);
/*      */       
/* 1426 */       if (!a(cra) || cru.a(☃, cra) != null) {
/* 1427 */         return null;
/*      */       }
/*      */       
/* 1430 */       return new g(m, cra, gc1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 1436 */       a(☃, cra1, 0, 0, 0, 10, 7, 15, false, random, crs.b());
/*      */       
/* 1438 */       a(☃, random, cra1, crs.p.a.c, 4, 1, 0);
/*      */ 
/*      */       
/* 1441 */       int i = 6;
/* 1442 */       a(☃, cra1, 1, i, 1, 1, i, 14, false, random, crs.b());
/* 1443 */       a(☃, cra1, 9, i, 1, 9, i, 14, false, random, crs.b());
/* 1444 */       a(☃, cra1, 2, i, 1, 8, i, 2, false, random, crs.b());
/* 1445 */       a(☃, cra1, 2, i, 14, 8, i, 14, false, random, crs.b());
/*      */ 
/*      */       
/* 1448 */       a(☃, cra1, 1, 1, 1, 2, 1, 4, false, random, crs.b());
/* 1449 */       a(☃, cra1, 8, 1, 1, 9, 1, 4, false, random, crs.b());
/* 1450 */       a(☃, cra1, 1, 1, 1, 1, 1, 3, bup.B.n(), bup.B.n(), false);
/* 1451 */       a(☃, cra1, 9, 1, 1, 9, 1, 3, bup.B.n(), bup.B.n(), false);
/*      */ 
/*      */       
/* 1454 */       a(☃, cra1, 3, 1, 8, 7, 1, 12, false, random, crs.b());
/* 1455 */       a(☃, cra1, 4, 1, 9, 6, 1, 11, bup.B.n(), bup.B.n(), false);
/*      */ 
/*      */       
/* 1458 */       ceh ceh1 = bup.dH.n().a(bxq.a, Boolean.valueOf(true)).a(bxq.c, Boolean.valueOf(true));
/* 1459 */       ceh ceh2 = bup.dH.n().a(bxq.d, Boolean.valueOf(true)).a(bxq.b, Boolean.valueOf(true)); int j;
/* 1460 */       for (j = 3; j < 14; j += 2) {
/* 1461 */         a(☃, cra1, 0, 3, j, 0, 4, j, ceh1, ceh1, false);
/* 1462 */         a(☃, cra1, 10, 3, j, 10, 4, j, ceh1, ceh1, false);
/*      */       } 
/* 1464 */       for (j = 2; j < 9; j += 2) {
/* 1465 */         a(☃, cra1, j, 3, 15, j, 4, 15, ceh2, ceh2, false);
/*      */       }
/*      */ 
/*      */       
/* 1469 */       ceh ceh3 = bup.dS.n().a(cak.a, gc.c);
/* 1470 */       a(☃, cra1, 4, 1, 5, 6, 1, 7, false, random, crs.b());
/* 1471 */       a(☃, cra1, 4, 2, 6, 6, 2, 7, false, random, crs.b());
/* 1472 */       a(☃, cra1, 4, 3, 7, 6, 3, 7, false, random, crs.b());
/* 1473 */       for (int k = 4; k <= 6; k++) {
/* 1474 */         a(☃, ceh3, k, 1, 4, cra1);
/* 1475 */         a(☃, ceh3, k, 2, 5, cra1);
/* 1476 */         a(☃, ceh3, k, 3, 6, cra1);
/*      */       } 
/*      */       
/* 1479 */       ceh ceh4 = bup.ed.n().a(bwj.a, gc.c);
/* 1480 */       ceh ceh5 = bup.ed.n().a(bwj.a, gc.d);
/* 1481 */       ceh ceh6 = bup.ed.n().a(bwj.a, gc.f);
/* 1482 */       ceh ceh7 = bup.ed.n().a(bwj.a, gc.e);
/*      */       
/* 1484 */       boolean bool = true;
/* 1485 */       boolean[] arrayOfBoolean = new boolean[12];
/* 1486 */       for (int m = 0; m < arrayOfBoolean.length; m++) {
/* 1487 */         arrayOfBoolean[m] = (random.nextFloat() > 0.9F);
/* 1488 */         bool &= arrayOfBoolean[m];
/*      */       } 
/*      */       
/* 1491 */       a(☃, ceh4.a(bwj.b, Boolean.valueOf(arrayOfBoolean[0])), 4, 3, 8, cra1);
/* 1492 */       a(☃, ceh4.a(bwj.b, Boolean.valueOf(arrayOfBoolean[1])), 5, 3, 8, cra1);
/* 1493 */       a(☃, ceh4.a(bwj.b, Boolean.valueOf(arrayOfBoolean[2])), 6, 3, 8, cra1);
/* 1494 */       a(☃, ceh5.a(bwj.b, Boolean.valueOf(arrayOfBoolean[3])), 4, 3, 12, cra1);
/* 1495 */       a(☃, ceh5.a(bwj.b, Boolean.valueOf(arrayOfBoolean[4])), 5, 3, 12, cra1);
/* 1496 */       a(☃, ceh5.a(bwj.b, Boolean.valueOf(arrayOfBoolean[5])), 6, 3, 12, cra1);
/* 1497 */       a(☃, ceh6.a(bwj.b, Boolean.valueOf(arrayOfBoolean[6])), 3, 3, 9, cra1);
/* 1498 */       a(☃, ceh6.a(bwj.b, Boolean.valueOf(arrayOfBoolean[7])), 3, 3, 10, cra1);
/* 1499 */       a(☃, ceh6.a(bwj.b, Boolean.valueOf(arrayOfBoolean[8])), 3, 3, 11, cra1);
/* 1500 */       a(☃, ceh7.a(bwj.b, Boolean.valueOf(arrayOfBoolean[9])), 7, 3, 9, cra1);
/* 1501 */       a(☃, ceh7.a(bwj.b, Boolean.valueOf(arrayOfBoolean[10])), 7, 3, 10, cra1);
/* 1502 */       a(☃, ceh7.a(bwj.b, Boolean.valueOf(arrayOfBoolean[11])), 7, 3, 11, cra1);
/*      */       
/* 1504 */       if (bool) {
/* 1505 */         ceh ceh = bup.ec.n();
/*      */         
/* 1507 */         a(☃, ceh, 4, 3, 9, cra1);
/* 1508 */         a(☃, ceh, 5, 3, 9, cra1);
/* 1509 */         a(☃, ceh, 6, 3, 9, cra1);
/* 1510 */         a(☃, ceh, 4, 3, 10, cra1);
/* 1511 */         a(☃, ceh, 5, 3, 10, cra1);
/* 1512 */         a(☃, ceh, 6, 3, 10, cra1);
/* 1513 */         a(☃, ceh, 4, 3, 11, cra1);
/* 1514 */         a(☃, ceh, 5, 3, 11, cra1);
/* 1515 */         a(☃, ceh, 6, 3, 11, cra1);
/*      */       } 
/*      */       
/* 1518 */       if (!this.a) {
/* 1519 */         i = d(3);
/* 1520 */         fx fx2 = new fx(a(5, 6), i, b(5, 6));
/* 1521 */         if (cra1.b(fx2)) {
/* 1522 */           this.a = true;
/* 1523 */           ☃.a(fx2, bup.bP.n(), 2);
/*      */           
/* 1525 */           ccj ccj = ☃.c(fx2);
/* 1526 */           if (ccj instanceof cdi) {
/* 1527 */             ((cdi)ccj).d().a(aqe.au);
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/* 1532 */       return true;
/*      */     } }
/*      */   
/*      */   static class k extends cru.a {
/*      */     private k() {}
/*      */     
/*      */     public void a(Random ☃, int i, int j, int m, boolean bool) {
/* 1539 */       if (bool) {
/* 1540 */         float f = ☃.nextFloat();
/* 1541 */         if (f < 0.2F) {
/* 1542 */           this.a = bup.dw.n();
/* 1543 */         } else if (f < 0.5F) {
/* 1544 */           this.a = bup.dv.n();
/* 1545 */         } else if (f < 0.55F) {
/* 1546 */           this.a = bup.dA.n();
/*      */         } else {
/* 1548 */           this.a = bup.du.n();
/*      */         } 
/*      */       } else {
/* 1551 */         this.a = bup.lb.n();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/* 1556 */   private static final k e = new k();
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */