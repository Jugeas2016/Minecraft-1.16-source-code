/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ByteMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2IntMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2IntMaps;
/*     */ import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongIterator;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import javax.annotation.Nullable;
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
/*     */ public abstract class zy
/*     */ {
/*  41 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*  45 */   private static final int b = 33 + cga.a(cga.m) - 2;
/*     */ 
/*     */ 
/*     */   
/*  49 */   private final Long2ObjectMap<ObjectSet<aah>> c = (Long2ObjectMap<ObjectSet<aah>>)new Long2ObjectOpenHashMap();
/*  50 */   private final Long2ObjectOpenHashMap<afq<aak<?>>> d = new Long2ObjectOpenHashMap();
/*     */   
/*  52 */   private final a e = new a(this);
/*     */   
/*  54 */   private final b f = new b(this, 8);
/*  55 */   private final c g = new c(this, 33);
/*     */   
/*  57 */   private final Set<zr> h = Sets.newHashSet();
/*     */   private final zu i;
/*     */   private final aod<zu.a<Runnable>> j;
/*     */   private final aod<zu.b> k;
/*  61 */   private final LongSet l = (LongSet)new LongOpenHashSet();
/*     */   
/*     */   private final Executor m;
/*     */   
/*     */   private long n;
/*     */ 
/*     */   
/*     */   protected zy(Executor ☃, Executor executor1) {
/*  69 */     aod<Runnable> aod1 = aod.a("player ticket throttler", executor1::execute);
/*     */     
/*  71 */     zu zu1 = new zu((List<aod<?>>)ImmutableList.of(aod1), ☃, 4);
/*  72 */     this.i = zu1;
/*  73 */     this.j = zu1.a(aod1, true);
/*  74 */     this.k = zu1.a(aod1);
/*  75 */     this.m = executor1;
/*     */   }
/*     */   
/*     */   protected void a() {
/*  79 */     this.n++;
/*  80 */     ObjectIterator<Long2ObjectMap.Entry<afq<aak<?>>>> ☃ = this.d.long2ObjectEntrySet().fastIterator();
/*  81 */     while (☃.hasNext()) {
/*  82 */       Long2ObjectMap.Entry<afq<aak<?>>> entry = (Long2ObjectMap.Entry<afq<aak<?>>>)☃.next();
/*  83 */       if (((afq)entry.getValue()).removeIf(☃ -> ☃.b(this.n))) {
/*  84 */         this.e.b(entry.getLongKey(), a((afq<aak<?>>)entry.getValue()), false);
/*     */       }
/*  86 */       if (((afq)entry.getValue()).isEmpty()) {
/*  87 */         ☃.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int a(afq<aak<?>> ☃) {
/*  93 */     return !☃.isEmpty() ? ((aak)☃.b()).b() : (zs.a + 1);
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
/*     */   public boolean a(zs ☃) {
/* 105 */     this.f.a();
/* 106 */     this.g.a();
/*     */     
/* 108 */     int i = Integer.MAX_VALUE - this.e.a(2147483647);
/* 109 */     boolean bool = (i != 0);
/* 110 */     if (bool);
/*     */ 
/*     */     
/* 113 */     if (!this.h.isEmpty()) {
/* 114 */       this.h.forEach(zr1 -> zr1.a(☃));
/* 115 */       this.h.clear();
/* 116 */       return true;
/*     */     } 
/* 118 */     if (!this.l.isEmpty()) {
/* 119 */       LongIterator longIterator = this.l.iterator();
/* 120 */       while (longIterator.hasNext()) {
/* 121 */         long l = longIterator.nextLong();
/* 122 */         if (e(l).stream().anyMatch(☃ -> (☃.a() == aal.c))) {
/* 123 */           zr zr = ☃.a(l);
/* 124 */           if (zr == null) {
/* 125 */             throw new IllegalStateException();
/*     */           }
/* 127 */           CompletableFuture<Either<cgh, zr.a>> completableFuture = zr.b();
/* 128 */           completableFuture.thenAccept(either -> this.m.execute(()));
/*     */         } 
/*     */       } 
/* 131 */       this.l.clear();
/*     */     } 
/* 133 */     return bool;
/*     */   }
/*     */   
/*     */   private void a(long ☃, aak<?> aak1) {
/* 137 */     afq<aak<?>> afq = e(☃);
/* 138 */     int i = a(afq);
/*     */     
/* 140 */     aak<?> aak2 = afq.a(aak1);
/*     */ 
/*     */ 
/*     */     
/* 144 */     aak2.a(this.n);
/* 145 */     if (aak1.b() < i) {
/* 146 */       this.e.b(☃, aak1.b(), true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(long ☃, aak<?> aak1) {
/* 151 */     afq<aak<?>> afq = e(☃);
/* 152 */     if (afq.remove(aak1));
/*     */ 
/*     */     
/* 155 */     if (afq.isEmpty()) {
/* 156 */       this.d.remove(☃);
/*     */     }
/* 158 */     this.e.b(☃, a(afq), false);
/*     */   }
/*     */   
/*     */   public <T> void a(aal<T> ☃, brd brd1, int i, T t) {
/* 162 */     a(brd1.a(), new aak(☃, i, t));
/*     */   }
/*     */   
/*     */   public <T> void b(aal<T> ☃, brd brd1, int i, T t) {
/* 166 */     aak<T> aak = new aak<>(☃, i, t);
/* 167 */     b(brd1.a(), aak);
/*     */   }
/*     */   
/*     */   public <T> void c(aal<T> ☃, brd brd1, int i, T t) {
/* 171 */     a(brd1.a(), new aak(☃, 33 - i, t));
/*     */   }
/*     */   
/*     */   public <T> void d(aal<T> ☃, brd brd1, int i, T t) {
/* 175 */     aak<T> aak = new aak<>(☃, 33 - i, t);
/* 176 */     b(brd1.a(), aak);
/*     */   }
/*     */   
/*     */   private afq<aak<?>> e(long ☃) {
/* 180 */     return (afq<aak<?>>)this.d.computeIfAbsent(☃, ☃ -> afq.a(4));
/*     */   }
/*     */   
/*     */   protected void a(brd ☃, boolean bool) {
/* 184 */     aak<brd> aak = new aak<>(aal.d, 31, ☃);
/* 185 */     if (bool) {
/* 186 */       a(☃.a(), aak);
/*     */     } else {
/* 188 */       b(☃.a(), aak);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(gp ☃, aah aah1) {
/* 193 */     long l = ☃.r().a();
/* 194 */     ((ObjectSet)this.c.computeIfAbsent(l, ☃ -> new ObjectOpenHashSet())).add(aah1);
/* 195 */     this.f.b(l, 0, true);
/* 196 */     this.g.b(l, 0, true);
/*     */   }
/*     */   
/*     */   public void b(gp ☃, aah aah1) {
/* 200 */     long l = ☃.r().a();
/* 201 */     ObjectSet<aah> objectSet = (ObjectSet<aah>)this.c.get(l);
/* 202 */     objectSet.remove(aah1);
/* 203 */     if (objectSet.isEmpty()) {
/* 204 */       this.c.remove(l);
/* 205 */       this.f.b(l, 2147483647, false);
/* 206 */       this.g.b(l, 2147483647, false);
/*     */     } 
/*     */   }
/*     */   protected String c(long ☃) {
/*     */     String str;
/* 211 */     afq<aak<?>> afq = (afq<aak<?>>)this.d.get(☃);
/*     */     
/* 213 */     if (afq == null || afq.isEmpty()) {
/* 214 */       str = "no_ticket";
/*     */     } else {
/* 216 */       str = ((aak)afq.b()).toString();
/*     */     } 
/* 218 */     return str;
/*     */   }
/*     */   
/*     */   protected void a(int ☃) {
/* 222 */     this.g.a(☃);
/*     */   }
/*     */   
/*     */   public int b() {
/* 226 */     this.f.a();
/* 227 */     return this.f.a.size();
/*     */   }
/*     */   
/*     */   public boolean d(long ☃) {
/* 231 */     this.f.a();
/* 232 */     return this.f.a.containsKey(☃);
/*     */   }
/*     */   
/*     */   public String c() {
/* 236 */     return this.i.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract boolean a(long paramLong);
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected abstract zr b(long paramLong);
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected abstract zr a(long paramLong, int paramInt1, @Nullable zr paramzr, int paramInt2);
/*     */ 
/*     */ 
/*     */   
/*     */   class b
/*     */     extends zv
/*     */   {
/* 259 */     protected final Long2ByteMap a = (Long2ByteMap)new Long2ByteOpenHashMap();
/*     */     protected final int b;
/*     */     
/*     */     protected b(zy this$0, int ☃) {
/* 263 */       super(☃ + 2, 16, 256);
/* 264 */       this.b = ☃;
/* 265 */       this.a.defaultReturnValue((byte)(☃ + 2));
/*     */     }
/*     */ 
/*     */     
/*     */     protected int c(long ☃) {
/* 270 */       return this.a.get(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(long ☃, int i) {
/*     */       byte b1;
/* 276 */       if (i > this.b) {
/* 277 */         b1 = this.a.remove(☃);
/*     */       } else {
/* 279 */         b1 = this.a.put(☃, (byte)i);
/*     */       } 
/* 281 */       a(☃, b1, i);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(long ☃, int i, int j) {}
/*     */ 
/*     */     
/*     */     protected int b(long ☃) {
/* 289 */       return d(☃) ? 0 : Integer.MAX_VALUE;
/*     */     }
/*     */     
/*     */     private boolean d(long ☃) {
/* 293 */       ObjectSet<aah> objectSet = (ObjectSet<aah>)zy.a(this.c).get(☃);
/* 294 */       return (objectSet != null && !objectSet.isEmpty());
/*     */     }
/*     */     
/*     */     public void a() {
/* 298 */       b(2147483647);
/*     */     }
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
/*     */   class c
/*     */     extends b
/*     */   {
/*     */     private int e;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 321 */     private final Long2IntMap f = Long2IntMaps.synchronize((Long2IntMap)new Long2IntOpenHashMap());
/* 322 */     private final LongSet g = (LongSet)new LongOpenHashSet();
/*     */     
/*     */     protected c(zy this$0, int ☃) {
/* 325 */       super(this$0, ☃);
/* 326 */       this.e = 0;
/* 327 */       this.f.defaultReturnValue(☃ + 2);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(long ☃, int i, int j) {
/* 332 */       this.g.add(☃);
/*     */     }
/*     */     
/*     */     public void a(int ☃) {
/* 336 */       for (ObjectIterator<Long2ByteMap.Entry> objectIterator = this.a.long2ByteEntrySet().iterator(); objectIterator.hasNext(); ) { Long2ByteMap.Entry entry = objectIterator.next();
/* 337 */         byte b1 = entry.getByteValue();
/* 338 */         long l = entry.getLongKey();
/* 339 */         a(l, b1, c(b1), (b1 <= ☃ - 2)); }
/*     */       
/* 341 */       this.e = ☃;
/*     */     }
/*     */     
/*     */     private void a(long ☃, int i, boolean bool1, boolean bool2) {
/* 345 */       if (bool1 != bool2) {
/* 346 */         aak<?> aak = new aak(aal.c, zy.e(), new brd(☃));
/* 347 */         if (bool2) {
/* 348 */           zy.b(this.d).a(zu.a(() -> zy.e(this.d).execute(()), ☃, () -> ☃));
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */ 
/*     */           
/* 357 */           zy.c(this.d).a(zu.a(() -> zy.e(this.d).execute(()), ☃, true));
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 364 */       super.a();
/* 365 */       if (!this.g.isEmpty()) {
/* 366 */         LongIterator ☃ = this.g.iterator();
/* 367 */         while (☃.hasNext()) {
/* 368 */           long l = ☃.nextLong();
/* 369 */           int i = this.f.get(l);
/* 370 */           int j = c(l);
/* 371 */           if (i != j) {
/* 372 */             zy.d(this.d).a(new brd(l), () -> this.f.get(☃), j, i -> {
/*     */                   if (i >= this.f.defaultReturnValue()) {
/*     */                     this.f.remove(☃);
/*     */                   } else {
/*     */                     this.f.put(☃, i);
/*     */                   } 
/*     */                 });
/* 379 */             a(l, j, c(i), c(j));
/*     */           } 
/*     */         } 
/* 382 */         this.g.clear();
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean c(int ☃) {
/* 387 */       return (☃ <= this.e - 2);
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends zv {
/*     */     public a(zy this$0) {
/* 393 */       super(zs.a + 2, 16, 256);
/*     */     }
/*     */ 
/*     */     
/*     */     protected int b(long ☃) {
/* 398 */       afq<aak<?>> afq = (afq<aak<?>>)zy.g(this.a).get(☃);
/* 399 */       if (afq == null) {
/* 400 */         return Integer.MAX_VALUE;
/*     */       }
/* 402 */       if (afq.isEmpty()) {
/* 403 */         return Integer.MAX_VALUE;
/*     */       }
/* 405 */       return ((aak)afq.b()).b();
/*     */     }
/*     */ 
/*     */     
/*     */     protected int c(long ☃) {
/* 410 */       if (!this.a.a(☃)) {
/* 411 */         zr zr = this.a.b(☃);
/* 412 */         if (zr != null) {
/* 413 */           return zr.j();
/*     */         }
/*     */       } 
/* 416 */       return zs.a + 1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(long ☃, int i) {
/* 421 */       zr zr = this.a.b(☃);
/* 422 */       int j = (zr == null) ? (zs.a + 1) : zr.j();
/* 423 */       if (j == i) {
/*     */         return;
/*     */       }
/* 426 */       zr = this.a.a(☃, i, zr, j);
/* 427 */       if (zr != null) {
/* 428 */         zy.h(this.a).add(zr);
/*     */       }
/*     */     }
/*     */     
/*     */     public int a(int ☃) {
/* 433 */       return b(☃);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */