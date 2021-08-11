/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.mutable.MutableFloat;
/*     */ import org.apache.commons.lang3.mutable.MutableInt;
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
/*     */ public class bpu
/*     */ {
/*     */   public static int a(bps ☃, bmb bmb1) {
/*  35 */     if (bmb1.a()) {
/*  36 */       return 0;
/*     */     }
/*     */     
/*  39 */     vk vk = gm.R.b(☃);
/*     */     
/*  41 */     mj mj = bmb1.q();
/*  42 */     for (int i = 0; i < mj.size(); i++) {
/*  43 */       md md = mj.a(i);
/*     */       
/*  45 */       vk vk1 = vk.a(md.l("id"));
/*  46 */       if (vk1 != null && vk1.equals(vk)) {
/*  47 */         return afm.a(md.h("lvl"), 0, 255);
/*     */       }
/*     */     } 
/*  50 */     return 0;
/*     */   }
/*     */   
/*     */   public static Map<bps, Integer> a(bmb ☃) {
/*  54 */     mj mj = (☃.b() == bmd.pq) ? blf.d(☃) : ☃.q();
/*  55 */     return a(mj);
/*     */   }
/*     */   
/*     */   public static Map<bps, Integer> a(mj ☃) {
/*  59 */     Map<bps, Integer> map = Maps.newLinkedHashMap();
/*  60 */     for (int i = 0; i < ☃.size(); i++) {
/*  61 */       md md = ☃.a(i);
/*     */       
/*  63 */       gm.R.b(vk.a(md.l("id")))
/*  64 */         .ifPresent(bps1 -> (Integer)☃.put(bps1, Integer.valueOf(md1.h("lvl"))));
/*     */     } 
/*     */     
/*  67 */     return map;
/*     */   }
/*     */   
/*     */   public static void a(Map<bps, Integer> ☃, bmb bmb1) {
/*  71 */     mj mj = new mj();
/*     */     
/*  73 */     for (Map.Entry<bps, Integer> entry : ☃.entrySet()) {
/*  74 */       bps bps = entry.getKey();
/*  75 */       if (bps == null) {
/*     */         continue;
/*     */       }
/*  78 */       int i = ((Integer)entry.getValue()).intValue();
/*     */       
/*  80 */       md md = new md();
/*  81 */       md.a("id", String.valueOf(gm.R.b(bps)));
/*  82 */       md.a("lvl", (short)i);
/*     */       
/*  84 */       mj.add(md);
/*     */       
/*  86 */       if (bmb1.b() == bmd.pq) {
/*  87 */         blf.a(bmb1, new bpv(bps, i));
/*     */       }
/*     */     } 
/*     */     
/*  91 */     if (mj.isEmpty()) {
/*  92 */       bmb1.c("Enchantments");
/*  93 */     } else if (bmb1.b() != bmd.pq) {
/*  94 */       bmb1.a("Enchantments", mj);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(a ☃, bmb bmb1) {
/* 104 */     if (bmb1.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 108 */     mj mj = bmb1.q();
/* 109 */     for (int i = 0; i < mj.size(); i++) {
/* 110 */       String str = mj.a(i).l("id");
/* 111 */       int j = mj.a(i).h("lvl");
/*     */       
/* 113 */       gm.R.b(vk.a(str))
/* 114 */         .ifPresent(bps1 -> ☃.accept(bps1, i));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(a ☃, Iterable<bmb> iterable) {
/* 119 */     for (bmb bmb : iterable) {
/* 120 */       a(☃, bmb);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(Iterable<bmb> ☃, apk apk1) {
/* 125 */     MutableInt mutableInt = new MutableInt();
/* 126 */     a((bps1, i) -> ☃.add(bps1.a(i, apk1)), ☃);
/* 127 */     return mutableInt.intValue();
/*     */   }
/*     */   
/*     */   public static float a(bmb ☃, aqq aqq1) {
/* 131 */     MutableFloat mutableFloat = new MutableFloat();
/* 132 */     a((bps1, i) -> ☃.add(bps1.a(i, aqq1)), ☃);
/* 133 */     return mutableFloat.floatValue();
/*     */   }
/*     */   
/*     */   public static float a(aqm ☃) {
/* 137 */     int i = a(bpw.s, ☃);
/* 138 */     if (i > 0) {
/* 139 */       return bqi.e(i);
/*     */     }
/* 141 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public static void a(aqm ☃, aqa aqa1) {
/* 145 */     a a = (bps1, i) -> bps1.b(☃, aqa1, i);
/* 146 */     if (☃ != null) {
/* 147 */       a(a, ☃.bp());
/*     */     }
/* 149 */     if (aqa1 instanceof bfw) {
/* 150 */       a(a, ☃.dD());
/*     */     }
/*     */   }
/*     */   
/*     */   public static void b(aqm ☃, aqa aqa1) {
/* 155 */     a a = (bps1, i) -> bps1.a(☃, aqa1, i);
/* 156 */     if (☃ != null) {
/* 157 */       a(a, ☃.bp());
/*     */     }
/* 159 */     if (☃ instanceof bfw) {
/* 160 */       a(a, ☃.dD());
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(bps ☃, aqm aqm1) {
/* 165 */     Iterable<bmb> iterable = ☃.a(aqm1).values();
/* 166 */     if (iterable == null) {
/* 167 */       return 0;
/*     */     }
/* 169 */     int i = 0;
/* 170 */     for (bmb bmb : iterable) {
/* 171 */       int j = a(☃, bmb);
/* 172 */       if (j > i) {
/* 173 */         i = j;
/*     */       }
/*     */     } 
/* 176 */     return i;
/*     */   }
/*     */   
/*     */   public static int b(aqm ☃) {
/* 180 */     return a(bpw.p, ☃);
/*     */   }
/*     */   
/*     */   public static int c(aqm ☃) {
/* 184 */     return a(bpw.q, ☃);
/*     */   }
/*     */   
/*     */   public static int d(aqm ☃) {
/* 188 */     return a(bpw.f, ☃);
/*     */   }
/*     */   
/*     */   public static int e(aqm ☃) {
/* 192 */     return a(bpw.i, ☃);
/*     */   }
/*     */   
/*     */   public static int f(aqm ☃) {
/* 196 */     return a(bpw.t, ☃);
/*     */   }
/*     */   
/*     */   public static int b(bmb ☃) {
/* 200 */     return a(bpw.B, ☃);
/*     */   }
/*     */   
/*     */   public static int c(bmb ☃) {
/* 204 */     return a(bpw.C, ☃);
/*     */   }
/*     */   
/*     */   public static int g(aqm ☃) {
/* 208 */     return a(bpw.r, ☃);
/*     */   }
/*     */   
/*     */   public static boolean h(aqm ☃) {
/* 212 */     return (a(bpw.g, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static boolean i(aqm ☃) {
/* 216 */     return (a(bpw.j, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static boolean j(aqm ☃) {
/* 220 */     return (a(bpw.l, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static boolean d(bmb ☃) {
/* 224 */     return (a(bpw.k, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static boolean e(bmb ☃) {
/* 228 */     return (a(bpw.L, ☃) > 0);
/*     */   }
/*     */   
/*     */   public static int f(bmb ☃) {
/* 232 */     return a(bpw.D, ☃);
/*     */   }
/*     */   
/*     */   public static int g(bmb ☃) {
/* 236 */     return a(bpw.F, ☃);
/*     */   }
/*     */   
/*     */   public static boolean h(bmb ☃) {
/* 240 */     return (a(bpw.G, ☃) > 0);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static Map.Entry<aqf, bmb> b(bps ☃, aqm aqm1) {
/* 245 */     return a(☃, aqm1, ☃ -> true);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static Map.Entry<aqf, bmb> a(bps ☃, aqm aqm1, Predicate<bmb> predicate) {
/* 250 */     Map<aqf, bmb> map = ☃.a(aqm1);
/* 251 */     if (map.isEmpty()) {
/* 252 */       return null;
/*     */     }
/* 254 */     List<Map.Entry<aqf, bmb>> list = Lists.newArrayList();
/* 255 */     for (Map.Entry<aqf, bmb> entry : map.entrySet()) {
/* 256 */       bmb bmb = entry.getValue();
/* 257 */       if (!bmb.a() && a(☃, bmb) > 0 && predicate.test(bmb)) {
/* 258 */         list.add(entry);
/*     */       }
/*     */     } 
/*     */     
/* 262 */     return list.isEmpty() ? null : list.get(aqm1.cY().nextInt(list.size()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int a(Random ☃, int i, int j, bmb bmb1) {
/* 273 */     blx blx = bmb1.b();
/* 274 */     int k = blx.c();
/*     */     
/* 276 */     if (k <= 0)
/*     */     {
/* 278 */       return 0;
/*     */     }
/*     */     
/* 281 */     if (j > 15) {
/* 282 */       j = 15;
/*     */     }
/* 284 */     int m = ☃.nextInt(8) + 1 + (j >> 1) + ☃.nextInt(j + 1);
/* 285 */     if (i == 0) {
/* 286 */       return Math.max(m / 3, 1);
/*     */     }
/* 288 */     if (i == 1) {
/* 289 */       return m * 2 / 3 + 1;
/*     */     }
/* 291 */     return Math.max(m, j * 2);
/*     */   }
/*     */   
/*     */   public static bmb a(Random ☃, bmb bmb1, int i, boolean bool) {
/* 295 */     List<bpv> list = b(☃, bmb1, i, bool);
/*     */     
/* 297 */     boolean bool1 = (bmb1.b() == bmd.mc);
/* 298 */     if (bool1) {
/* 299 */       bmb1 = new bmb(bmd.pq);
/*     */     }
/*     */     
/* 302 */     for (bpv bpv : list) {
/* 303 */       if (bool1) {
/* 304 */         blf.a(bmb1, bpv); continue;
/*     */       } 
/* 306 */       bmb1.a(bpv.b, bpv.c);
/*     */     } 
/*     */ 
/*     */     
/* 310 */     return bmb1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<bpv> b(Random ☃, bmb bmb1, int i, boolean bool) {
/* 321 */     List<bpv> list1 = Lists.newArrayList();
/*     */ 
/*     */     
/* 324 */     blx blx = bmb1.b();
/* 325 */     int j = blx.c();
/*     */     
/* 327 */     if (j <= 0) {
/* 328 */       return list1;
/*     */     }
/*     */     
/* 331 */     i += 1 + ☃.nextInt(j / 4 + 1) + ☃.nextInt(j / 4 + 1);
/*     */ 
/*     */     
/* 334 */     float f = (☃.nextFloat() + ☃.nextFloat() - 1.0F) * 0.15F;
/* 335 */     i = afm.a(Math.round(i + i * f), 1, 2147483647);
/*     */     
/* 337 */     List<bpv> list2 = a(i, bmb1, bool);
/* 338 */     if (!list2.isEmpty()) {
/* 339 */       list1.add(afz.a(☃, list2));
/*     */       
/* 341 */       while (☃.nextInt(50) <= i) {
/* 342 */         a(list2, x.<bpv>a(list1));
/*     */         
/* 344 */         if (list2.isEmpty()) {
/*     */           break;
/*     */         }
/*     */         
/* 348 */         list1.add(afz.a(☃, list2));
/* 349 */         i /= 2;
/*     */       } 
/*     */     } 
/* 352 */     return list1;
/*     */   }
/*     */   
/*     */   public static void a(List<bpv> ☃, bpv bpv1) {
/* 356 */     Iterator<bpv> iterator = ☃.iterator();
/* 357 */     while (iterator.hasNext()) {
/* 358 */       if (!bpv1.b.b(((bpv)iterator.next()).b)) {
/* 359 */         iterator.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean a(Collection<bps> ☃, bps bps1) {
/* 365 */     for (bps bps2 : ☃) {
/* 366 */       if (!bps2.b(bps1)) {
/* 367 */         return false;
/*     */       }
/*     */     } 
/* 370 */     return true;
/*     */   }
/*     */   
/*     */   public static List<bpv> a(int ☃, bmb bmb1, boolean bool) {
/* 374 */     List<bpv> list = Lists.newArrayList();
/*     */     
/* 376 */     blx blx = bmb1.b();
/* 377 */     boolean bool1 = (bmb1.b() == bmd.mc);
/* 378 */     for (bps bps : gm.R) {
/* 379 */       if (bps.b() && !bool) {
/*     */         continue;
/*     */       }
/* 382 */       if (!bps.i()) {
/*     */         continue;
/*     */       }
/*     */       
/* 386 */       if (!bps.b.a(blx) && !bool1) {
/*     */         continue;
/*     */       }
/*     */       
/* 390 */       for (int i = bps.a(); i > bps.e() - 1; i--) {
/* 391 */         if (☃ >= bps.a(i) && ☃ <= bps.b(i)) {
/* 392 */           list.add(new bpv(bps, i));
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 398 */     return list;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface a {
/*     */     void accept(bps param1bps, int param1Int);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bpu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */