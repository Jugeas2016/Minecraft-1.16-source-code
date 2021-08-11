/*     */ import it.unimi.dsi.fastutil.ints.Int2IntMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
/*     */ import java.util.function.LongFunction;
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
/*     */ public class cvx
/*     */ {
/*     */   private static final Int2IntMap a;
/*     */   
/*     */   private static <T extends cvf, C extends cvj<T>> cvg<T> a(long ☃, cwm cwm1, cvg<T> cvg1, int i, LongFunction<C> longFunction) {
/*  24 */     cvg<T> cvg2 = cvg1;
/*  25 */     for (int j = 0; j < i; j++) {
/*  26 */       cvg2 = cwm1.a((cvj<T>)longFunction.apply(☃ + j), cvg2);
/*     */     }
/*  28 */     return cvg2;
/*     */   }
/*     */   
/*     */   private static <T extends cvf, C extends cvj<T>> cvg<T> a(boolean ☃, int i, int j, LongFunction<C> longFunction) {
/*  32 */     cvg<T> cvg1 = cvu.a.a((cvj<T>)longFunction.apply(1L));
/*  33 */     cvg1 = cwj.b.a((cvj<T>)longFunction.apply(2000L), cvg1);
/*  34 */     cvg1 = cvp.a.a((cvj<T>)longFunction.apply(1L), cvg1);
/*  35 */     cvg1 = cwj.a.a((cvj<T>)longFunction.apply(2001L), cvg1);
/*  36 */     cvg1 = cvp.a.a((cvj<T>)longFunction.apply(2L), cvg1);
/*  37 */     cvg1 = cvp.a.a((cvj<T>)longFunction.apply(50L), cvg1);
/*  38 */     cvg1 = cvp.a.a((cvj<T>)longFunction.apply(70L), cvg1);
/*  39 */     cvg1 = cwd.a.a((cvj<T>)longFunction.apply(2L), cvg1);
/*     */     
/*  41 */     cvg<T> cvg2 = cvy.a.a((cvj<T>)longFunction.apply(2L));
/*  42 */     cvg2 = a(2001L, cwj.a, cvg2, 6, longFunction);
/*     */     
/*  44 */     cvg1 = cvr.a.a((cvj<T>)longFunction.apply(2L), cvg1);
/*  45 */     cvg1 = cvp.a.a((cvj<T>)longFunction.apply(3L), cvg1);
/*  46 */     cvg1 = cvo.a.a.a((cvj<T>)longFunction.apply(2L), cvg1);
/*  47 */     cvg1 = cvo.b.a.a((cvj<T>)longFunction.apply(2L), cvg1);
/*  48 */     cvg1 = cvo.c.a.a((cvj<T>)longFunction.apply(3L), cvg1);
/*  49 */     cvg1 = cwj.a.a((cvj<T>)longFunction.apply(2002L), cvg1);
/*  50 */     cvg1 = cwj.a.a((cvj<T>)longFunction.apply(2003L), cvg1);
/*  51 */     cvg1 = cvp.a.a((cvj<T>)longFunction.apply(4L), cvg1);
/*  52 */     cvg1 = cvq.a.a((cvj<T>)longFunction.apply(5L), cvg1);
/*  53 */     cvg1 = cvn.a.a((cvj<T>)longFunction.apply(4L), cvg1);
/*  54 */     cvg1 = a(1000L, cwj.a, cvg1, 0, longFunction);
/*     */     
/*  56 */     cvg<T> cvg3 = cvg1;
/*  57 */     cvg3 = a(1000L, cwj.a, cvg3, 0, longFunction);
/*  58 */     cvg3 = cwe.a.a((cvj<T>)longFunction.apply(100L), cvg3);
/*     */     
/*  60 */     cvg<T> cvg4 = cvg1;
/*  61 */     cvg4 = (new cvt(☃)).a((cvj<T>)longFunction.apply(200L), cvg4);
/*  62 */     cvg4 = cwa.a.a((cvj<T>)longFunction.apply(1001L), cvg4);
/*  63 */     cvg4 = a(1000L, cwj.a, cvg4, 2, longFunction);
/*  64 */     cvg4 = cvs.a.a((cvj<T>)longFunction.apply(1000L), cvg4);
/*  65 */     cvg<T> cvg5 = cvg3;
/*  66 */     cvg5 = a(1000L, cwj.a, cvg5, 2, longFunction);
/*  67 */     cvg4 = cwc.a.a((cvj<T>)longFunction.apply(1000L), cvg4, cvg5);
/*     */     
/*  69 */     cvg3 = a(1000L, cwj.a, cvg3, 2, longFunction);
/*  70 */     cvg3 = a(1000L, cwj.a, cvg3, j, longFunction);
/*  71 */     cvg3 = cwf.a.a((cvj<T>)longFunction.apply(1L), cvg3);
/*  72 */     cvg3 = cwi.a.a((cvj<T>)longFunction.apply(1000L), cvg3);
/*     */     
/*  74 */     cvg4 = cwb.a.a((cvj<T>)longFunction.apply(1001L), cvg4);
/*  75 */     for (int k = 0; k < i; k++) {
/*  76 */       cvg4 = cwj.a.a((cvj<T>)longFunction.apply((1000 + k)), cvg4);
/*  77 */       if (k == 0) {
/*  78 */         cvg4 = cvp.a.a((cvj<T>)longFunction.apply(3L), cvg4);
/*     */       }
/*     */       
/*  81 */       if (k == 1 || i == 1) {
/*  82 */         cvg4 = cwh.a.a((cvj<T>)longFunction.apply(1000L), cvg4);
/*     */       }
/*     */     } 
/*     */     
/*  86 */     cvg4 = cwi.a.a((cvj<T>)longFunction.apply(1000L), cvg4);
/*     */     
/*  88 */     cvg4 = cwg.a.a((cvj<T>)longFunction.apply(100L), cvg4, cvg3);
/*  89 */     cvg4 = cvz.a.a((cvj<T>)longFunction.apply(100L), cvg4, cvg2);
/*     */     
/*  91 */     return cvg4;
/*     */   }
/*     */ 
/*     */   
/*     */   public static cvv a(long ☃, boolean bool, int i, int j) {
/*  96 */     int k = 25;
/*  97 */     cvg<cvh> cvg = a(bool, i, j, l1 -> new cvl(25, ☃, l1));
/*  98 */     return new cvv(cvg);
/*     */   }
/*     */   
/*     */   public static boolean a(int ☃, int i) {
/* 102 */     if (☃ == i) {
/* 103 */       return true;
/*     */     }
/*     */     
/* 106 */     return (a.get(☃) == a.get(i));
/*     */   }
/*     */   
/*     */   enum a {
/* 110 */     a,
/* 111 */     b,
/* 112 */     c,
/* 113 */     d,
/* 114 */     e,
/* 115 */     f,
/* 116 */     g,
/* 117 */     h,
/* 118 */     i,
/* 119 */     j,
/* 120 */     k,
/* 121 */     l,
/* 122 */     m,
/* 123 */     n,
/* 124 */     o,
/* 125 */     p;
/*     */   }
/*     */   
/*     */   static {
/* 129 */     a = (Int2IntMap)x.a(new Int2IntOpenHashMap(), ☃ -> {
/*     */           a(☃, a.j, 16);
/*     */           a(☃, a.j, 26);
/*     */           a(☃, a.m, 2);
/*     */           a(☃, a.m, 17);
/*     */           a(☃, a.m, 130);
/*     */           a(☃, a.c, 131);
/*     */           a(☃, a.c, 162);
/*     */           a(☃, a.c, 20);
/*     */           a(☃, a.c, 3);
/*     */           a(☃, a.c, 34);
/*     */           a(☃, a.k, 27);
/*     */           a(☃, a.k, 28);
/*     */           a(☃, a.k, 29);
/*     */           a(☃, a.k, 157);
/*     */           a(☃, a.k, 132);
/*     */           a(☃, a.k, 4);
/*     */           a(☃, a.k, 155);
/*     */           a(☃, a.k, 156);
/*     */           a(☃, a.k, 18);
/*     */           a(☃, a.i, 140);
/*     */           a(☃, a.i, 13);
/*     */           a(☃, a.i, 12);
/*     */           a(☃, a.d, 168);
/*     */           a(☃, a.d, 169);
/*     */           a(☃, a.d, 21);
/*     */           a(☃, a.d, 23);
/*     */           a(☃, a.d, 22);
/*     */           a(☃, a.d, 149);
/*     */           a(☃, a.d, 151);
/*     */           a(☃, a.e, 37);
/*     */           a(☃, a.e, 165);
/*     */           a(☃, a.e, 167);
/*     */           a(☃, a.e, 166);
/*     */           a(☃, a.f, 39);
/*     */           a(☃, a.f, 38);
/*     */           a(☃, a.p, 14);
/*     */           a(☃, a.p, 15);
/*     */           a(☃, a.a, 25);
/*     */           a(☃, a.l, 46);
/*     */           a(☃, a.l, 49);
/*     */           a(☃, a.l, 50);
/*     */           a(☃, a.l, 48);
/*     */           a(☃, a.l, 24);
/*     */           a(☃, a.l, 47);
/*     */           a(☃, a.l, 10);
/*     */           a(☃, a.l, 45);
/*     */           a(☃, a.l, 0);
/*     */           a(☃, a.l, 44);
/*     */           a(☃, a.g, 1);
/*     */           a(☃, a.g, 129);
/*     */           a(☃, a.n, 11);
/*     */           a(☃, a.n, 7);
/*     */           a(☃, a.h, 35);
/*     */           a(☃, a.h, 36);
/*     */           a(☃, a.h, 163);
/*     */           a(☃, a.h, 164);
/*     */           a(☃, a.o, 6);
/*     */           a(☃, a.o, 134);
/*     */           a(☃, a.b, 160);
/*     */           a(☃, a.b, 161);
/*     */           a(☃, a.b, 32);
/*     */           a(☃, a.b, 33);
/*     */           a(☃, a.b, 30);
/*     */           a(☃, a.b, 31);
/*     */           a(☃, a.b, 158);
/*     */           a(☃, a.b, 5);
/*     */           a(☃, a.b, 19);
/*     */           a(☃, a.b, 133);
/*     */         });
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
/*     */   private static void a(Int2IntOpenHashMap ☃, a a1, int i) {
/* 216 */     ☃.put(i, a1.ordinal());
/*     */   }
/*     */   
/*     */   protected static boolean a(int ☃) {
/* 220 */     return (☃ == 44 || ☃ == 45 || ☃ == 0 || ☃ == 46 || ☃ == 10 || ☃ == 47 || ☃ == 48 || ☃ == 24 || ☃ == 49 || ☃ == 50);
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
/*     */   protected static boolean b(int ☃) {
/* 234 */     return (☃ == 44 || ☃ == 45 || ☃ == 0 || ☃ == 46 || ☃ == 10);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */