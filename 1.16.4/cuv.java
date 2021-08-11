/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
/*     */ import java.util.Map;
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
/*     */ public abstract class cuv
/*     */   extends cuw
/*     */ {
/*  33 */   public static final cey a = cex.i;
/*  34 */   public static final cfg b = cex.at;
/*     */   
/*     */   static {
/*  37 */     e = ThreadLocal.withInitial(() -> {
/*     */           Object2ByteLinkedOpenHashMap<buo.a> ☃ = new Object2ByteLinkedOpenHashMap<buo.a>(200) {
/*     */               protected void rehash(int ☃) {}
/*     */             };
/*     */           ☃.defaultReturnValue(127);
/*     */           return ☃;
/*     */         });
/*     */   }
/*     */   
/*     */   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<buo.a>> e;
/*  47 */   private final Map<cux, ddh> f = Maps.newIdentityHashMap();
/*     */ 
/*     */   
/*     */   protected void a(cei.a<cuw, cux> ☃) {
/*  51 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn a(brc ☃, fx fx1, cux cux1) {
/*  56 */     double d1 = 0.0D;
/*  57 */     double d2 = 0.0D;
/*     */     
/*  59 */     fx.a a = new fx.a();
/*  60 */     for (gc gc : gc.c.a) {
/*  61 */       a.a(fx1, gc);
/*  62 */       cux cux2 = ☃.b(a);
/*  63 */       if (!g(cux2)) {
/*     */         continue;
/*     */       }
/*  66 */       float f1 = cux2.d();
/*  67 */       float f2 = 0.0F;
/*  68 */       if (f1 == 0.0F) {
/*  69 */         if (!☃.d_(a).c().c()) {
/*  70 */           fx fx2 = a.c();
/*  71 */           cux cux3 = ☃.b(fx2);
/*  72 */           if (g(cux3)) {
/*  73 */             f1 = cux3.d();
/*  74 */             if (f1 > 0.0F) {
/*  75 */               f2 = cux1.d() - f1 - 0.8888889F;
/*     */             }
/*     */           } 
/*     */         } 
/*  79 */       } else if (f1 > 0.0F) {
/*  80 */         f2 = cux1.d() - f1;
/*     */       } 
/*     */       
/*  83 */       if (f2 != 0.0F) {
/*  84 */         d1 += (gc.i() * f2);
/*  85 */         d2 += (gc.k() * f2);
/*     */       } 
/*     */     } 
/*     */     
/*  89 */     dcn dcn = new dcn(d1, 0.0D, d2);
/*  90 */     if (((Boolean)cux1.c(a)).booleanValue()) {
/*  91 */       for (gc gc : gc.c.a) {
/*  92 */         a.a(fx1, gc);
/*  93 */         if (a(☃, a, gc) || a(☃, a.b(), gc)) {
/*  94 */           dcn = dcn.d().b(0.0D, -6.0D, 0.0D);
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 100 */     return dcn.d();
/*     */   }
/*     */   
/*     */   private boolean g(cux ☃) {
/* 104 */     return (☃.c() || ☃.a().a(this));
/*     */   }
/*     */   
/*     */   protected boolean a(brc ☃, fx fx1, gc gc1) {
/* 108 */     ceh ceh = ☃.d_(fx1);
/* 109 */     cux cux = ☃.b(fx1);
/* 110 */     if (cux.a().a(this)) {
/* 111 */       return false;
/*     */     }
/* 113 */     if (gc1 == gc.b) {
/* 114 */       return true;
/*     */     }
/* 116 */     if (ceh.c() == cva.G) {
/* 117 */       return false;
/*     */     }
/*     */     
/* 120 */     return ceh.d(☃, fx1, gc1);
/*     */   }
/*     */   
/*     */   protected void a(bry ☃, fx fx1, cux cux1) {
/* 124 */     if (cux1.c()) {
/*     */       return;
/*     */     }
/*     */     
/* 128 */     ceh ceh1 = ☃.d_(fx1);
/* 129 */     fx fx2 = fx1.c();
/* 130 */     ceh ceh2 = ☃.d_(fx2);
/*     */     
/* 132 */     cux cux2 = a(☃, fx2, ceh2);
/* 133 */     if (a(☃, fx1, ceh1, gc.a, fx2, ceh2, ☃.b(fx2), cux2.a())) {
/* 134 */       a(☃, fx2, ceh2, gc.a, cux2);
/*     */       
/* 136 */       if (a(☃, fx1) >= 3) {
/* 137 */         a(☃, fx1, cux1, ceh1);
/*     */       }
/* 139 */     } else if (cux1.b() || !a(☃, cux2.a(), fx1, ceh1, fx2, ceh2)) {
/* 140 */       a(☃, fx1, cux1, ceh1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bry ☃, fx fx1, cux cux1, ceh ceh1) {
/* 145 */     int i = cux1.e() - c(☃);
/* 146 */     if (((Boolean)cux1.c(a)).booleanValue()) {
/* 147 */       i = 7;
/*     */     }
/* 149 */     if (i <= 0) {
/*     */       return;
/*     */     }
/*     */     
/* 153 */     Map<gc, cux> map = b(☃, fx1, ceh1);
/* 154 */     for (Map.Entry<gc, cux> entry : map.entrySet()) {
/* 155 */       gc gc = entry.getKey();
/* 156 */       cux cux2 = entry.getValue();
/* 157 */       fx fx2 = fx1.a(gc);
/* 158 */       ceh ceh2 = ☃.d_(fx2);
/* 159 */       if (a(☃, fx1, ceh1, gc, fx2, ceh2, ☃.b(fx2), cux2.a())) {
/* 160 */         a(☃, fx2, ceh2, gc, cux2);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected cux a(brz ☃, fx fx1, ceh ceh1) {
/* 166 */     int i = 0;
/* 167 */     int j = 0;
/*     */     
/* 169 */     for (gc gc : gc.c.a) {
/* 170 */       fx fx3 = fx1.a(gc);
/* 171 */       ceh ceh3 = ☃.d_(fx3);
/* 172 */       cux cux1 = ceh3.m();
/*     */       
/* 174 */       if (cux1.a().a(this) && 
/* 175 */         a(gc, ☃, fx1, ceh1, fx3, ceh3)) {
/* 176 */         if (cux1.b()) {
/* 177 */           j++;
/*     */         }
/* 179 */         i = Math.max(i, cux1.e());
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 185 */     if (f() && j >= 2) {
/* 186 */       ceh ceh3 = ☃.d_(fx1.c());
/* 187 */       cux cux1 = ceh3.m();
/* 188 */       if (ceh3.c().b() || h(cux1)) {
/* 189 */         return a(false);
/*     */       }
/*     */     } 
/*     */     
/* 193 */     fx fx2 = fx1.b();
/* 194 */     ceh ceh2 = ☃.d_(fx2);
/* 195 */     cux cux = ceh2.m();
/*     */     
/* 197 */     if (!cux.c() && cux.a().a(this) && a(gc.b, ☃, fx1, ceh1, fx2, ceh2)) {
/* 198 */       return a(8, true);
/*     */     }
/*     */     
/* 201 */     int k = i - c(☃);
/* 202 */     if (k <= 0) {
/* 203 */       return cuy.a.h();
/*     */     }
/* 205 */     return a(k, false);
/*     */   }
/*     */   private boolean a(gc ☃, brc brc1, fx fx1, ceh ceh1, fx fx2, ceh ceh2) {
/*     */     Object2ByteLinkedOpenHashMap<buo.a> object2ByteLinkedOpenHashMap;
/*     */     buo.a a;
/* 210 */     if (ceh1.b().o() || ceh2.b().o()) {
/* 211 */       object2ByteLinkedOpenHashMap = null;
/*     */     } else {
/* 213 */       object2ByteLinkedOpenHashMap = e.get();
/*     */     } 
/*     */ 
/*     */     
/* 217 */     if (object2ByteLinkedOpenHashMap != null) {
/* 218 */       a = new buo.a(ceh1, ceh2, ☃);
/* 219 */       byte b = object2ByteLinkedOpenHashMap.getAndMoveToFirst(a);
/* 220 */       if (b != Byte.MAX_VALUE) {
/* 221 */         return (b != 0);
/*     */       }
/*     */     } else {
/* 224 */       a = null;
/*     */     } 
/*     */     
/* 227 */     ddh ddh1 = ceh1.k(brc1, fx1);
/* 228 */     ddh ddh2 = ceh2.k(brc1, fx2);
/* 229 */     boolean bool = !dde.b(ddh1, ddh2, ☃);
/*     */     
/* 231 */     if (object2ByteLinkedOpenHashMap != null) {
/* 232 */       if (object2ByteLinkedOpenHashMap.size() == 200) {
/* 233 */         object2ByteLinkedOpenHashMap.removeLastByte();
/*     */       }
/* 235 */       object2ByteLinkedOpenHashMap.putAndMoveToFirst(a, (byte)(bool ? 1 : 0));
/*     */     } 
/* 237 */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cux a(int ☃, boolean bool) {
/* 243 */     return d().h().a(b, Integer.valueOf(☃)).a(a, Boolean.valueOf(bool));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cux a(boolean ☃) {
/* 249 */     return e().h().a(a, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(bry ☃, fx fx1, ceh ceh1, gc gc1, cux cux1) {
/* 255 */     if (ceh1.b() instanceof byc) {
/* 256 */       ((byc)ceh1.b()).a(☃, fx1, ceh1, cux1);
/*     */     } else {
/* 258 */       if (!ceh1.g()) {
/* 259 */         a(☃, fx1, ceh1);
/*     */       }
/* 261 */       ☃.a(fx1, cux1.g(), 3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static short a(fx ☃, fx fx1) {
/* 268 */     int i = fx1.u() - ☃.u();
/* 269 */     int j = fx1.w() - ☃.w();
/* 270 */     return (short)((i + 128 & 0xFF) << 8 | j + 128 & 0xFF);
/*     */   }
/*     */   
/*     */   protected int a(brz ☃, fx fx1, int i, gc gc1, ceh ceh1, fx fx2, Short2ObjectMap<Pair<ceh, cux>> short2ObjectMap, Short2BooleanMap short2BooleanMap) {
/* 274 */     int j = 1000;
/*     */     
/* 276 */     for (gc gc2 : gc.c.a) {
/* 277 */       if (gc2 == gc1) {
/*     */         continue;
/*     */       }
/*     */       
/* 281 */       fx fx3 = fx1.a(gc2);
/*     */       
/* 283 */       short s = a(fx2, fx3);
/*     */       
/* 285 */       Pair<ceh, cux> pair = (Pair<ceh, cux>)short2ObjectMap.computeIfAbsent(s, i -> {
/*     */             ceh ceh = ☃.d_(fx1);
/*     */             
/*     */             return Pair.of(ceh, ceh.m());
/*     */           });
/* 290 */       ceh ceh2 = (ceh)pair.getFirst();
/* 291 */       cux cux = (cux)pair.getSecond();
/*     */ 
/*     */       
/* 294 */       if (a(☃, d(), fx1, ceh1, gc2, fx3, ceh2, cux)) {
/* 295 */         boolean bool = short2BooleanMap.computeIfAbsent(s, i -> {
/*     */               fx fx1 = ☃.c();
/*     */               ceh ceh2 = brz1.d_(fx1);
/*     */               return a(brz1, d(), ☃, ceh1, fx1, ceh2);
/*     */             });
/* 300 */         if (bool) {
/* 301 */           return i;
/*     */         }
/* 303 */         if (i < b(☃)) {
/* 304 */           int k = a(☃, fx3, i + 1, gc2.f(), ceh2, fx2, short2ObjectMap, short2BooleanMap);
/* 305 */           if (k < j) {
/* 306 */             j = k;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 312 */     return j;
/*     */   }
/*     */   
/*     */   private boolean a(brc ☃, cuw cuw1, fx fx1, ceh ceh1, fx fx2, ceh ceh2) {
/* 316 */     if (!a(gc.a, ☃, fx1, ceh1, fx2, ceh2)) {
/* 317 */       return false;
/*     */     }
/*     */     
/* 320 */     if (ceh2.m().a().a(this)) {
/* 321 */       return true;
/*     */     }
/*     */     
/* 324 */     return a(☃, fx2, ceh2, cuw1);
/*     */   }
/*     */   
/*     */   private boolean a(brc ☃, cuw cuw1, fx fx1, ceh ceh1, gc gc1, fx fx2, ceh ceh2, cux cux1) {
/* 328 */     return (!h(cux1) && 
/* 329 */       a(gc1, ☃, fx1, ceh1, fx2, ceh2) && 
/* 330 */       a(☃, fx2, ceh2, cuw1));
/*     */   }
/*     */   
/*     */   private boolean h(cux ☃) {
/* 334 */     return (☃.a().a(this) && ☃.b());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private int a(brz ☃, fx fx1) {
/* 340 */     int i = 0;
/* 341 */     for (gc gc : gc.c.a) {
/* 342 */       fx fx2 = fx1.a(gc);
/* 343 */       cux cux = ☃.b(fx2);
/*     */       
/* 345 */       if (h(cux)) {
/* 346 */         i++;
/*     */       }
/*     */     } 
/*     */     
/* 350 */     return i;
/*     */   }
/*     */   
/*     */   protected Map<gc, cux> b(brz ☃, fx fx1, ceh ceh1) {
/* 354 */     int i = 1000;
/* 355 */     Map<gc, cux> map = Maps.newEnumMap(gc.class);
/*     */     
/* 357 */     Short2ObjectOpenHashMap short2ObjectOpenHashMap = new Short2ObjectOpenHashMap();
/* 358 */     Short2BooleanOpenHashMap short2BooleanOpenHashMap = new Short2BooleanOpenHashMap();
/*     */     
/* 360 */     for (gc gc : gc.c.a) {
/* 361 */       fx fx2 = fx1.a(gc);
/*     */       
/* 363 */       short s = a(fx1, fx2);
/*     */       
/* 365 */       Pair<ceh, cux> pair = (Pair<ceh, cux>)short2ObjectOpenHashMap.computeIfAbsent(s, i -> {
/*     */             ceh ceh = ☃.d_(fx1);
/*     */             
/*     */             return Pair.of(ceh, ceh.m());
/*     */           });
/* 370 */       ceh ceh2 = (ceh)pair.getFirst();
/* 371 */       cux cux1 = (cux)pair.getSecond();
/*     */       
/* 373 */       cux cux2 = a(☃, fx2, ceh2);
/*     */       
/* 375 */       if (a(☃, cux2.a(), fx1, ceh1, gc, fx2, ceh2, cux1)) {
/*     */         int j;
/* 377 */         fx fx3 = fx2.c();
/*     */         
/* 379 */         boolean bool = short2BooleanOpenHashMap.computeIfAbsent(s, i -> {
/*     */               ceh ceh2 = ☃.d_(fx1);
/*     */               
/*     */               return a(☃, d(), fx2, ceh1, fx1, ceh2);
/*     */             });
/*     */         
/* 385 */         if (bool) {
/* 386 */           j = 0;
/*     */         } else {
/* 388 */           j = a(☃, fx2, 1, gc.f(), ceh2, fx1, (Short2ObjectMap<Pair<ceh, cux>>)short2ObjectOpenHashMap, (Short2BooleanMap)short2BooleanOpenHashMap);
/*     */         } 
/*     */         
/* 391 */         if (j < i) {
/* 392 */           map.clear();
/*     */         }
/*     */         
/* 395 */         if (j <= i) {
/* 396 */           map.put(gc, cux2);
/* 397 */           i = j;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 402 */     return map;
/*     */   }
/*     */   
/*     */   private boolean a(brc ☃, fx fx1, ceh ceh1, cuw cuw1) {
/* 406 */     buo buo = ceh1.b();
/*     */     
/* 408 */     if (buo instanceof byc) {
/* 409 */       return ((byc)buo).a(☃, fx1, ceh1, cuw1);
/*     */     }
/*     */     
/* 412 */     if (buo instanceof bwb || buo
/* 413 */       .a(aed.af) || buo == bup.cg || buo == bup.cH || buo == bup.lc)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/* 418 */       return false;
/*     */     }
/* 420 */     cva cva = ceh1.c();
/* 421 */     if (cva == cva.c || cva == cva.b || cva == cva.f || cva == cva.i) {
/* 422 */       return false;
/*     */     }
/*     */     
/* 425 */     return !cva.c();
/*     */   }
/*     */   
/*     */   protected boolean a(brc ☃, fx fx1, ceh ceh1, gc gc1, fx fx2, ceh ceh2, cux cux1, cuw cuw1) {
/* 429 */     return (cux1.a(☃, fx2, cuw1, gc1) && 
/* 430 */       a(gc1, ☃, fx1, ceh1, fx2, ceh2) && 
/* 431 */       a(☃, fx2, ceh2, cuw1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(brx ☃, fx fx1, cux cux1, cux cux2) {
/* 437 */     return a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, cux cux1) {
/* 442 */     if (!cux1.b()) {
/* 443 */       cux cux2 = a(☃, fx1, ☃.d_(fx1));
/* 444 */       int i = a(☃, fx1, cux1, cux2);
/*     */       
/* 446 */       if (cux2.c()) {
/* 447 */         cux1 = cux2;
/* 448 */         ☃.a(fx1, bup.a.n(), 3);
/* 449 */       } else if (!cux2.equals(cux1)) {
/* 450 */         cux1 = cux2;
/* 451 */         ceh ceh = cux1.g();
/* 452 */         ☃.a(fx1, ceh, 2);
/* 453 */         ☃.I().a(fx1, cux1.a(), i);
/* 454 */         ☃.b(fx1, ceh.b());
/*     */       } 
/*     */     } 
/*     */     
/* 458 */     a(☃, fx1, cux1);
/*     */   }
/*     */   
/*     */   protected static int e(cux ☃) {
/* 462 */     if (☃.b()) {
/* 463 */       return 0;
/*     */     }
/* 465 */     return 8 - Math.min(☃.e(), 8) + (((Boolean)☃.c(a)).booleanValue() ? 8 : 0);
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean c(cux ☃, brc brc1, fx fx1) {
/* 470 */     return ☃.a().a(brc1.b(fx1.b()).a());
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(cux ☃, brc brc1, fx fx1) {
/* 475 */     if (c(☃, brc1, fx1)) {
/* 476 */       return 1.0F;
/*     */     }
/* 478 */     return ☃.d();
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(cux ☃) {
/* 483 */     return ☃.e() / 9.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ddh b(cux ☃, brc brc1, fx fx1) {
/* 491 */     if (☃.e() == 9 && c(☃, brc1, fx1)) {
/* 492 */       return dde.b();
/*     */     }
/*     */     
/* 495 */     return this.f.computeIfAbsent(☃, cux1 -> dde.a(0.0D, 0.0D, 0.0D, 1.0D, cux1.a(☃, fx1), 1.0D));
/*     */   }
/*     */   
/*     */   public abstract cuw d();
/*     */   
/*     */   public abstract cuw e();
/*     */   
/*     */   protected abstract boolean f();
/*     */   
/*     */   protected abstract void a(bry parambry, fx paramfx, ceh paramceh);
/*     */   
/*     */   protected abstract int b(brz parambrz);
/*     */   
/*     */   protected abstract int c(brz parambrz);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cuv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */