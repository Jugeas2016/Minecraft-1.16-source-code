/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectSet;
/*     */ import java.util.EnumSet;
/*     */ import java.util.IdentityHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class cgr
/*     */ {
/*  36 */   private static final Logger b = LogManager.getLogger();
/*  37 */   public static final cgr a = new cgr();
/*     */   
/*  39 */   private static final gd[] c = gd.values();
/*     */   
/*  41 */   private final EnumSet<gd> d = EnumSet.noneOf(gd.class);
/*  42 */   private final int[][] e = new int[16][];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cgr(md ☃) {
/*  48 */     this();
/*     */     
/*  50 */     if (☃.c("Indices", 10)) {
/*  51 */       md md1 = ☃.p("Indices");
/*  52 */       for (int j = 0; j < this.e.length; j++) {
/*  53 */         String str = String.valueOf(j);
/*  54 */         if (md1.c(str, 11)) {
/*  55 */           this.e[j] = md1.n(str);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  60 */     int i = ☃.h("Sides");
/*  61 */     for (gd gd1 : gd.values()) {
/*  62 */       if ((i & 1 << gd1.ordinal()) != 0) {
/*  63 */         this.d.add(gd1);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(cgh ☃) {
/*  69 */     b(☃);
/*  70 */     for (gd gd1 : c) {
/*  71 */       a(☃, gd1);
/*     */     }
/*     */     
/*  74 */     brx brx = ☃.x();
/*  75 */     g.forEach(a1 -> a1.a(☃));
/*     */   }
/*     */   
/*     */   private static void a(cgh ☃, gd gd1) {
/*  79 */     brx brx = ☃.x();
/*     */     
/*  81 */     if (!(☃.p()).d.remove(gd1)) {
/*     */       return;
/*     */     }
/*     */     
/*  85 */     Set<gc> set = gd1.a();
/*     */     
/*  87 */     int i = 0;
/*  88 */     int j = 15;
/*     */     
/*  90 */     boolean bool1 = set.contains(gc.f);
/*  91 */     boolean bool2 = set.contains(gc.e);
/*  92 */     boolean bool3 = set.contains(gc.d);
/*  93 */     boolean bool4 = set.contains(gc.c);
/*  94 */     boolean bool5 = (set.size() == 1);
/*     */     
/*  96 */     brd brd = ☃.g();
/*  97 */     int k = brd.d() + ((bool5 && (bool4 || bool3)) ? 1 : (bool2 ? 0 : 15));
/*  98 */     int m = brd.d() + ((bool5 && (bool4 || bool3)) ? 14 : (bool2 ? 0 : 15));
/*  99 */     int n = brd.e() + ((bool5 && (bool1 || bool2)) ? 1 : (bool4 ? 0 : 15));
/* 100 */     int i1 = brd.e() + ((bool5 && (bool1 || bool2)) ? 14 : (bool4 ? 0 : 15));
/*     */     
/* 102 */     gc[] arrayOfGc = gc.values();
/* 103 */     fx.a a = new fx.a();
/* 104 */     for (fx fx : fx.b(k, 0, n, m, brx.L() - 1, i1)) {
/* 105 */       ceh ceh1 = brx.d_(fx);
/* 106 */       ceh ceh2 = ceh1;
/*     */       
/* 108 */       for (gc gc : arrayOfGc) {
/* 109 */         a.a(fx, gc);
/* 110 */         ceh2 = a(ceh2, gc, brx, fx, a);
/*     */       } 
/*     */       
/* 113 */       buo.a(ceh1, ceh2, brx, fx, 18);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static ceh a(ceh ☃, gc gc1, bry bry1, fx fx1, fx fx2) {
/* 118 */     return ((a)f.getOrDefault(☃.b(), b.b)).a(☃, gc1, bry1.d_(fx2), bry1, fx1, fx2);
/*     */   }
/*     */   
/*     */   private void b(cgh ☃) {
/* 122 */     fx.a a1 = new fx.a();
/* 123 */     fx.a a2 = new fx.a();
/*     */     
/* 125 */     brd brd = ☃.g();
/* 126 */     bry bry = ☃.x(); int i;
/* 127 */     for (i = 0; i < 16; i++) {
/* 128 */       cgi cgi = ☃.d()[i];
/* 129 */       int[] arrayOfInt = this.e[i];
/* 130 */       this.e[i] = null;
/*     */       
/* 132 */       if (cgi != null && arrayOfInt != null && arrayOfInt.length > 0) {
/*     */ 
/*     */ 
/*     */         
/* 136 */         gc[] arrayOfGc = gc.values();
/* 137 */         cgo<ceh> cgo = cgi.i();
/*     */         
/* 139 */         for (int j : arrayOfInt) {
/* 140 */           int k = j & 0xF;
/* 141 */           int m = j >> 8 & 0xF;
/* 142 */           int n = j >> 4 & 0xF;
/*     */           
/* 144 */           a1.d(brd.d() + k, (i << 4) + m, brd.e() + n);
/*     */           
/* 146 */           ceh ceh1 = cgo.a(j);
/* 147 */           ceh ceh2 = ceh1;
/*     */           
/* 149 */           for (gc gc : arrayOfGc) {
/* 150 */             a2.a(a1, gc);
/* 151 */             if (a1.u() >> 4 == brd.b && a1.w() >> 4 == brd.c)
/*     */             {
/*     */               
/* 154 */               ceh2 = a(ceh2, gc, bry, a1, a2); } 
/*     */           } 
/* 156 */           buo.a(ceh1, ceh2, bry, a1, 18);
/*     */         } 
/*     */       } 
/* 159 */     }  for (i = 0; i < this.e.length; i++) {
/* 160 */       if (this.e[i] != null) {
/* 161 */         b.warn("Discarding update data for section {} for chunk ({} {})", Integer.valueOf(i), Integer.valueOf(brd.b), Integer.valueOf(brd.c));
/*     */       }
/* 163 */       this.e[i] = null;
/*     */     } 
/*     */   }
/*     */   
/* 167 */   private static final Map<buo, a> f = new IdentityHashMap<>();
/* 168 */   private static final Set<a> g = Sets.newHashSet();
/*     */   
/*     */   public boolean a() {
/* 171 */     for (int[] ☃ : this.e) {
/* 172 */       if (☃ != null) {
/* 173 */         return false;
/*     */       }
/*     */     } 
/* 176 */     return this.d.isEmpty();
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     ceh a(ceh param1ceh1, gc param1gc, ceh param1ceh2, bry param1bry, fx param1fx1, fx param1fx2);
/*     */     
/*     */     default void a(bry ☃) {}
/*     */   }
/*     */   
/*     */   enum b
/*     */     implements a {
/* 187 */     a((String)new buo[] { bup.iO, bup.cT, bup.jM, bup.jN, bup.jO, bup.jP, bup.jQ, bup.jR, bup.jS, bup.jT, bup.jU, bup.jV, bup.jW, bup.jX, bup.jY, bup.jZ, bup.ka, bup.kb, bup.fo, bup.fp, bup.fq, bup.ef, bup.E, bup.C, bup.D, bup.bZ, bup.ca, bup.cb, bup.cc, bup.cd, bup.ce, bup.cj, bup.ck, bup.cl, bup.cm, bup.cn, bup.co })
/*     */     {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2)
/*     */       {
/* 230 */         return ☃;
/*     */       }
/*     */     },
/* 233 */     b((String)new buo[0])
/*     */     {
/*     */       public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 236 */         return ☃.a(gc1, bry1.d_(fx2), bry1, fx1, fx2);
/*     */       }
/*     */     },
/* 239 */     c((String)new buo[] { bup.bR, bup.fr })
/*     */     {
/*     */       public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 242 */         if (ceh1.a(☃.b()) && gc1.n().d() && 
/* 243 */           ☃.c(bve.c) == cez.a && ceh1.c(bve.c) == cez.a) {
/* 244 */           gc gc2 = (gc)☃.c(bve.b);
/* 245 */           if (gc1.n() != gc2.n() && gc2 == ceh1.c(bve.b)) {
/* 246 */             cez cez = (gc1 == gc2.g()) ? cez.b : cez.c;
/* 247 */             bry1.a(fx2, ceh1.a(bve.c, cez.b()), 18);
/*     */ 
/*     */             
/* 250 */             if (gc2 == gc.c || gc2 == gc.f) {
/* 251 */               ccj ccj1 = bry1.c(fx1);
/* 252 */               ccj ccj2 = bry1.c(fx2);
/* 253 */               if (ccj1 instanceof ccn && ccj2 instanceof ccn) {
/* 254 */                 ccn.a((ccn)ccj1, (ccn)ccj2);
/*     */               }
/*     */             } 
/*     */             
/* 258 */             return ☃.a(bve.c, cez);
/*     */           } 
/*     */         } 
/*     */         
/* 262 */         return ☃;
/*     */       }
/*     */     },
/* 265 */     d(true, new buo[] { bup.al, bup.aj, bup.am, bup.ak, bup.ah, bup.ai }) {
/* 266 */       private final ThreadLocal<List<ObjectSet<fx>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));
/*     */ 
/*     */       
/*     */       public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 270 */         ceh ceh2 = ☃.a(gc1, bry1.d_(fx2), bry1, fx1, fx2);
/* 271 */         if (☃ != ceh2) {
/* 272 */           int i = ((Integer)ceh2.c(cex.an)).intValue();
/* 273 */           List<ObjectSet<fx>> list = this.g.get();
/* 274 */           if (list.isEmpty()) {
/* 275 */             for (int j = 0; j < 7; j++) {
/* 276 */               list.add(new ObjectOpenHashSet());
/*     */             }
/*     */           }
/* 279 */           ((ObjectSet)list.get(i)).add(fx1.h());
/*     */         } 
/* 281 */         return ☃;
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(bry ☃) {
/* 286 */         fx.a a = new fx.a();
/*     */         
/* 288 */         List<ObjectSet<fx>> list = this.g.get();
/* 289 */         for (int i = 2; i < list.size(); i++) {
/* 290 */           int j = i - 1;
/* 291 */           ObjectSet<fx> objectSet1 = list.get(j);
/* 292 */           ObjectSet<fx> objectSet2 = list.get(i);
/*     */           
/* 294 */           for (ObjectIterator<fx> objectIterator = objectSet1.iterator(); objectIterator.hasNext(); ) { fx fx = objectIterator.next();
/* 295 */             ceh ceh = ☃.d_(fx);
/* 296 */             if (((Integer)ceh.c(cex.an)).intValue() < j) {
/*     */               continue;
/*     */             }
/*     */             
/* 300 */             ☃.a(fx, ceh.a(cex.an, Integer.valueOf(j)), 18);
/*     */             
/* 302 */             if (i != 7) {
/* 303 */               for (gc gc : f) {
/* 304 */                 a.a(fx, gc);
/* 305 */                 ceh ceh1 = ☃.d_(a);
/*     */                 
/* 307 */                 if (ceh1.b(cex.an) && ((Integer)ceh.c(cex.an)).intValue() > i) {
/* 308 */                   objectSet2.add(a.h());
/*     */                 }
/*     */               } 
/*     */             } }
/*     */         
/*     */         } 
/*     */         
/* 315 */         list.clear();
/*     */       }
/*     */     },
/* 318 */     e((String)new buo[] { bup.dO, bup.dN })
/*     */     {
/*     */       public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 321 */         if (((Integer)☃.c(cam.a)).intValue() == 7) {
/* 322 */           can can = ((cam)☃.b()).d();
/* 323 */           if (ceh1.a(can)) {
/* 324 */             return can.d().n().a(bxm.aq, gc1);
/*     */           }
/*     */         } 
/* 327 */         return ☃;
/*     */       }
/*     */     };
/*     */ 
/*     */     
/* 332 */     public static final gc[] f = gc.values();
/*     */     
/*     */     static {
/*     */     
/*     */     }
/*     */     
/*     */     b(boolean ☃, buo... arrayOfBuo) {
/* 339 */       for (buo buo1 : arrayOfBuo) {
/* 340 */         cgr.c().put(buo1, this);
/*     */       }
/* 342 */       if (☃) {
/* 343 */         cgr.d().add(this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public md b() {
/* 349 */     md ☃ = new md();
/*     */     
/* 351 */     md md1 = new md(); int i;
/* 352 */     for (i = 0; i < this.e.length; i++) {
/* 353 */       String str = String.valueOf(i);
/* 354 */       if (this.e[i] != null && (this.e[i]).length != 0) {
/* 355 */         md1.a(str, this.e[i]);
/*     */       }
/*     */     } 
/* 358 */     if (!md1.isEmpty()) {
/* 359 */       ☃.a("Indices", md1);
/*     */     }
/*     */     
/* 362 */     i = 0;
/* 363 */     for (gd gd1 : this.d) {
/* 364 */       i |= 1 << gd1.ordinal();
/*     */     }
/* 366 */     ☃.a("Sides", (byte)i);
/* 367 */     return ☃;
/*     */   }
/*     */   
/*     */   private cgr() {}
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */