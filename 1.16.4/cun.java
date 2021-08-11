/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongIterator;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import javax.annotation.Nullable;
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
/*     */ public abstract class cun<M extends cui<M>>
/*     */   extends aac
/*     */ {
/*  25 */   protected static final cgb a = new cgb();
/*  26 */   private static final gc[] k = gc.values();
/*     */   
/*     */   private final bsf l;
/*     */   
/*     */   private final cgj m;
/*     */   
/*  32 */   protected final LongSet b = (LongSet)new LongOpenHashSet();
/*     */   
/*  34 */   protected final LongSet c = (LongSet)new LongOpenHashSet();
/*  35 */   protected final LongSet d = (LongSet)new LongOpenHashSet();
/*     */   
/*     */   protected volatile M e;
/*     */   
/*     */   protected final M f;
/*     */   
/*  41 */   protected final LongSet g = (LongSet)new LongOpenHashSet();
/*  42 */   protected final LongSet h = (LongSet)new LongOpenHashSet();
/*     */ 
/*     */   
/*  45 */   protected final Long2ObjectMap<cgb> i = Long2ObjectMaps.synchronize((Long2ObjectMap)new Long2ObjectOpenHashMap());
/*     */   
/*  47 */   private final LongSet n = (LongSet)new LongOpenHashSet();
/*     */   
/*  49 */   private final LongSet o = (LongSet)new LongOpenHashSet();
/*     */   
/*  51 */   private final LongSet p = (LongSet)new LongOpenHashSet();
/*     */   
/*     */   protected volatile boolean j;
/*     */   
/*     */   protected cun(bsf ☃, cgj cgj1, M m) {
/*  56 */     super(3, 16, 256);
/*  57 */     this.l = ☃;
/*  58 */     this.m = cgj1;
/*  59 */     this.f = m;
/*  60 */     this.e = m.b();
/*  61 */     this.e.d();
/*     */   }
/*     */   
/*     */   protected boolean g(long ☃) {
/*  65 */     return (a(☃, true) != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected cgb a(long ☃, boolean bool) {
/*  70 */     return a(bool ? this.f : this.e, ☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected cgb a(M ☃, long l) {
/*  75 */     return ☃.c(l);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cgb h(long ☃) {
/*  80 */     cgb cgb1 = (cgb)this.i.get(☃);
/*  81 */     if (cgb1 != null) {
/*  82 */       return cgb1;
/*     */     }
/*  84 */     return a(☃, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int i(long ☃) {
/*  94 */     long l = gp.e(☃);
/*  95 */     cgb cgb1 = a(l, true);
/*  96 */     return cgb1.a(
/*  97 */         gp.b(fx.b(☃)), 
/*  98 */         gp.b(fx.c(☃)), 
/*  99 */         gp.b(fx.d(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(long ☃, int i) {
/* 106 */     long l = gp.e(☃);
/* 107 */     if (this.g.add(l)) {
/* 108 */       this.f.a(l);
/*     */     }
/* 110 */     cgb cgb1 = a(l, true);
/* 111 */     cgb1.a(
/* 112 */         gp.b(fx.b(☃)), 
/* 113 */         gp.b(fx.c(☃)), 
/* 114 */         gp.b(fx.d(☃)), i);
/*     */ 
/*     */     
/* 117 */     for (int j = -1; j <= 1; j++) {
/* 118 */       for (int k = -1; k <= 1; k++) {
/* 119 */         for (int m = -1; m <= 1; m++) {
/* 120 */           this.h.add(gp.e(fx.a(☃, k, m, j)));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected int c(long ☃) {
/* 128 */     if (☃ == Long.MAX_VALUE) {
/* 129 */       return 2;
/*     */     }
/* 131 */     if (this.b.contains(☃)) {
/* 132 */       return 0;
/*     */     }
/* 134 */     if (!this.p.contains(☃) && this.f.b(☃)) {
/* 135 */       return 1;
/*     */     }
/* 137 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(long ☃) {
/* 142 */     if (this.c.contains(☃)) {
/* 143 */       return 2;
/*     */     }
/* 145 */     if (this.b.contains(☃) || this.d.contains(☃)) {
/* 146 */       return 0;
/*     */     }
/* 148 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(long ☃, int i) {
/* 153 */     int j = c(☃);
/* 154 */     if (j != 0 && i == 0) {
/* 155 */       this.b.add(☃);
/* 156 */       this.d.remove(☃);
/*     */     } 
/* 158 */     if (j == 0 && i != 0) {
/* 159 */       this.b.remove(☃);
/* 160 */       this.c.remove(☃);
/*     */     } 
/* 162 */     if (j >= 2 && i != 2) {
/* 163 */       if (this.p.contains(☃)) {
/* 164 */         this.p.remove(☃);
/*     */       } else {
/* 166 */         this.f.a(☃, j(☃));
/* 167 */         this.g.add(☃);
/* 168 */         k(☃);
/* 169 */         for (int k = -1; k <= 1; k++) {
/* 170 */           for (int m = -1; m <= 1; m++) {
/* 171 */             for (int n = -1; n <= 1; n++) {
/* 172 */               this.h.add(gp.e(fx.a(☃, m, n, k)));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/* 178 */     if (j != 2 && i >= 2) {
/* 179 */       this.p.add(☃);
/*     */     }
/* 181 */     this.j = !this.p.isEmpty();
/*     */   }
/*     */   
/*     */   protected cgb j(long ☃) {
/* 185 */     cgb cgb1 = (cgb)this.i.get(☃);
/* 186 */     if (cgb1 != null) {
/* 187 */       return cgb1;
/*     */     }
/* 189 */     return new cgb();
/*     */   }
/*     */   
/*     */   protected void a(cul<?, ?> ☃, long l) {
/* 193 */     if (☃.c() < 8192) {
/* 194 */       ☃.a(l1 -> (gp.e(l1) == ☃));
/*     */       
/*     */       return;
/*     */     } 
/* 198 */     int i = gp.c(gp.b(l));
/* 199 */     int j = gp.c(gp.c(l));
/* 200 */     int k = gp.c(gp.d(l));
/* 201 */     for (int m = 0; m < 16; m++) {
/* 202 */       for (int n = 0; n < 16; n++) {
/* 203 */         for (int i1 = 0; i1 < 16; i1++) {
/* 204 */           long l1 = fx.a(i + m, j + n, k + i1);
/* 205 */           ☃.e(l1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a() {
/* 212 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cul<M, ?> ☃, boolean bool1, boolean bool2) {
/* 217 */     if (!a() && this.i.isEmpty())
/*     */       return; 
/*     */     LongIterator<Long> longIterator;
/* 220 */     for (longIterator = this.p.iterator(); longIterator.hasNext(); ) { long l = ((Long)longIterator.next()).longValue();
/* 221 */       a(☃, l);
/* 222 */       cgb cgb1 = (cgb)this.i.remove(l);
/* 223 */       cgb cgb2 = this.f.d(l);
/* 224 */       if (this.o.contains(gp.f(l))) {
/* 225 */         if (cgb1 != null) {
/* 226 */           this.i.put(l, cgb1); continue;
/* 227 */         }  if (cgb2 != null) {
/* 228 */           this.i.put(l, cgb2);
/*     */         }
/*     */       }  }
/*     */     
/* 232 */     this.f.c();
/* 233 */     for (longIterator = this.p.iterator(); longIterator.hasNext(); ) { long l = ((Long)longIterator.next()).longValue();
/* 234 */       l(l); }
/*     */     
/* 236 */     this.p.clear();
/* 237 */     this.j = false;
/*     */     
/* 239 */     for (ObjectIterator<Long2ObjectMap.Entry<cgb>> objectIterator2 = this.i.long2ObjectEntrySet().iterator(); objectIterator2.hasNext(); ) { Long2ObjectMap.Entry<cgb> entry = objectIterator2.next();
/* 240 */       long l = entry.getLongKey();
/* 241 */       if (!g(l)) {
/*     */         continue;
/*     */       }
/* 244 */       cgb cgb1 = (cgb)entry.getValue();
/*     */       
/* 246 */       if (this.f.c(l) != cgb1) {
/*     */         
/* 248 */         a(☃, l);
/*     */ 
/*     */         
/* 251 */         this.f.a(l, cgb1);
/* 252 */         this.g.add(l);
/*     */       }  }
/*     */     
/* 255 */     this.f.c();
/* 256 */     if (!bool2) {
/*     */       
/* 258 */       for (LongIterator<Long> longIterator1 = this.i.keySet().iterator(); longIterator1.hasNext(); ) { long l = ((Long)longIterator1.next()).longValue();
/* 259 */         b(☃, l); }
/*     */     
/*     */     } else {
/* 262 */       for (LongIterator<Long> longIterator1 = this.n.iterator(); longIterator1.hasNext(); ) { long l = ((Long)longIterator1.next()).longValue();
/* 263 */         b(☃, l); }
/*     */     
/*     */     } 
/* 266 */     this.n.clear();
/*     */     
/* 268 */     for (ObjectIterator<Long2ObjectMap.Entry<cgb>> objectIterator1 = this.i.long2ObjectEntrySet().iterator(); objectIterator1.hasNext(); ) {
/* 269 */       Long2ObjectMap.Entry<cgb> entry = (Long2ObjectMap.Entry<cgb>)objectIterator1.next();
/* 270 */       long l = entry.getLongKey();
/* 271 */       if (g(l)) {
/* 272 */         objectIterator1.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(cul<M, ?> ☃, long l) {
/* 278 */     if (!g(l)) {
/*     */       return;
/*     */     }
/* 281 */     int i = gp.c(gp.b(l));
/* 282 */     int j = gp.c(gp.c(l));
/* 283 */     int k = gp.c(gp.d(l));
/* 284 */     for (gc gc1 : k) {
/* 285 */       long l1 = gp.a(l, gc1);
/*     */ 
/*     */       
/* 288 */       if (!this.i.containsKey(l1) && g(l1))
/*     */       {
/*     */ 
/*     */         
/* 292 */         for (int m = 0; m < 16; m++) {
/* 293 */           for (int n = 0; n < 16; n++) {
/*     */             long l2, l3;
/*     */             
/* 296 */             switch (null.a[gc1.ordinal()]) {
/*     */               case 1:
/* 298 */                 l2 = fx.a(i + n, j, k + m);
/* 299 */                 l3 = fx.a(i + n, j - 1, k + m);
/*     */                 break;
/*     */               case 2:
/* 302 */                 l2 = fx.a(i + n, j + 16 - 1, k + m);
/* 303 */                 l3 = fx.a(i + n, j + 16, k + m);
/*     */                 break;
/*     */               case 3:
/* 306 */                 l2 = fx.a(i + m, j + n, k);
/* 307 */                 l3 = fx.a(i + m, j + n, k - 1);
/*     */                 break;
/*     */               case 4:
/* 310 */                 l2 = fx.a(i + m, j + n, k + 16 - 1);
/* 311 */                 l3 = fx.a(i + m, j + n, k + 16);
/*     */                 break;
/*     */               case 5:
/* 314 */                 l2 = fx.a(i, j + m, k + n);
/* 315 */                 l3 = fx.a(i - 1, j + m, k + n);
/*     */                 break;
/*     */               
/*     */               default:
/* 319 */                 l2 = fx.a(i + 16 - 1, j + m, k + n);
/* 320 */                 l3 = fx.a(i + 16, j + m, k + n);
/*     */                 break;
/*     */             } 
/*     */             
/* 324 */             ☃.a(l2, l3, ☃.b(l2, l3, ☃.c(l2)), false);
/* 325 */             ☃.a(l3, l2, ☃.b(l3, l2, ☃.c(l3)), false);
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void k(long ☃) {}
/*     */ 
/*     */   
/*     */   protected void l(long ☃) {}
/*     */   
/*     */   protected void b(long ☃, boolean bool) {}
/*     */   
/*     */   public void c(long ☃, boolean bool) {
/* 341 */     if (bool) {
/* 342 */       this.o.add(☃);
/*     */     } else {
/* 344 */       this.o.remove(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(long ☃, @Nullable cgb cgb1, boolean bool) {
/* 349 */     if (cgb1 != null) {
/* 350 */       this.i.put(☃, cgb1);
/* 351 */       if (!bool) {
/* 352 */         this.n.add(☃);
/*     */       }
/*     */     } else {
/* 355 */       this.i.remove(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void d(long ☃, boolean bool) {
/* 360 */     boolean bool1 = this.b.contains(☃);
/* 361 */     if (!bool1 && !bool) {
/* 362 */       this.d.add(☃);
/* 363 */       a(Long.MAX_VALUE, ☃, 0, true);
/*     */     } 
/* 365 */     if (bool1 && bool) {
/* 366 */       this.c.add(☃);
/* 367 */       a(Long.MAX_VALUE, ☃, 2, false);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void d() {
/* 372 */     if (b()) {
/* 373 */       b(2147483647);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void e() {
/* 378 */     if (!this.g.isEmpty()) {
/* 379 */       M ☃ = this.f.b();
/* 380 */       ☃.d();
/* 381 */       this.e = ☃;
/* 382 */       this.g.clear();
/*     */     } 
/* 384 */     if (!this.h.isEmpty()) {
/* 385 */       LongIterator ☃ = this.h.iterator();
/* 386 */       while (☃.hasNext()) {
/* 387 */         long l = ☃.nextLong();
/* 388 */         this.m.a(this.l, gp.a(l));
/*     */       } 
/* 390 */       this.h.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected abstract int d(long paramLong);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cun.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */