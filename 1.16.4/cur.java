/*     */ import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongIterator;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import java.util.Arrays;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cur
/*     */   extends cun<cur.a>
/*     */ {
/*  17 */   private static final gc[] k = new gc[] { gc.c, gc.d, gc.e, gc.f };
/*     */   
/*  19 */   private final LongSet l = (LongSet)new LongOpenHashSet();
/*  20 */   private final LongSet m = (LongSet)new LongOpenHashSet();
/*  21 */   private final LongSet n = (LongSet)new LongOpenHashSet();
/*  22 */   private final LongSet o = (LongSet)new LongOpenHashSet();
/*     */   private volatile boolean p;
/*     */   
/*     */   protected cur(cgj ☃) {
/*  26 */     super(bsf.a, ☃, new a(new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), 2147483647));
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(long ☃) {
/*  31 */     long l = gp.e(☃);
/*  32 */     int i = gp.c(l);
/*  33 */     a a = this.e;
/*  34 */     int j = a.a(a).get(gp.f(l));
/*  35 */     if (j == a.b(a) || i >= j) {
/*  36 */       return 15;
/*     */     }
/*  38 */     cgb cgb = a(a, l);
/*  39 */     if (cgb == null) {
/*  40 */       ☃ = fx.f(☃);
/*  41 */       while (cgb == null) {
/*  42 */         l = gp.a(l, gc.b);
/*  43 */         i++;
/*  44 */         if (i >= j) {
/*  45 */           return 15;
/*     */         }
/*  47 */         ☃ = fx.a(☃, 0, 16, 0);
/*  48 */         cgb = a(a, l);
/*     */       } 
/*     */     } 
/*  51 */     return cgb.a(
/*  52 */         gp.b(fx.b(☃)), 
/*  53 */         gp.b(fx.c(☃)), 
/*  54 */         gp.b(fx.d(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void k(long ☃) {
/*  60 */     int i = gp.c(☃);
/*  61 */     if (a.b(this.f) > i) {
/*  62 */       a.a(this.f, i);
/*  63 */       a.a(this.f).defaultReturnValue(a.b(this.f));
/*     */     } 
/*  65 */     long l = gp.f(☃);
/*  66 */     int j = a.a(this.f).get(l);
/*  67 */     if (j < i + 1) {
/*  68 */       a.a(this.f).put(l, i + 1);
/*  69 */       if (this.o.contains(l)) {
/*  70 */         q(☃);
/*  71 */         if (j > a.b(this.f)) {
/*  72 */           long l1 = gp.b(gp.b(☃), j - 1, gp.d(☃));
/*  73 */           p(l1);
/*     */         } 
/*  75 */         f();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void p(long ☃) {
/*  81 */     this.n.add(☃);
/*  82 */     this.m.remove(☃);
/*     */   }
/*     */   
/*     */   private void q(long ☃) {
/*  86 */     this.m.add(☃);
/*  87 */     this.n.remove(☃);
/*     */   }
/*     */   
/*     */   private void f() {
/*  91 */     this.p = (!this.m.isEmpty() || !this.n.isEmpty());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void l(long ☃) {
/*  96 */     long l = gp.f(☃);
/*  97 */     boolean bool = this.o.contains(l);
/*  98 */     if (bool) {
/*  99 */       p(☃);
/*     */     }
/* 101 */     int i = gp.c(☃);
/* 102 */     if (a.a(this.f).get(l) == i + 1) {
/* 103 */       long l1 = ☃;
/* 104 */       while (!g(l1) && a(i)) {
/* 105 */         i--;
/* 106 */         l1 = gp.a(l1, gc.a);
/*     */       } 
/* 108 */       if (g(l1)) {
/* 109 */         a.a(this.f).put(l, i + 1);
/* 110 */         if (bool) {
/* 111 */           q(l1);
/*     */         }
/*     */       } else {
/* 114 */         a.a(this.f).remove(l);
/*     */       } 
/*     */     } 
/* 117 */     if (bool) {
/* 118 */       f();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(long ☃, boolean bool) {
/* 124 */     d();
/* 125 */     if (bool && this.o.add(☃)) {
/* 126 */       int i = a.a(this.f).get(☃);
/* 127 */       if (i != a.b(this.f)) {
/* 128 */         long l = gp.b(gp.b(☃), i - 1, gp.d(☃));
/* 129 */         q(l);
/* 130 */         f();
/*     */       } 
/* 132 */     } else if (!bool) {
/* 133 */       this.o.remove(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a() {
/* 139 */     return (super.a() || this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   protected cgb j(long ☃) {
/* 144 */     cgb cgb1 = (cgb)this.i.get(☃);
/* 145 */     if (cgb1 != null) {
/* 146 */       return cgb1;
/*     */     }
/*     */     
/* 149 */     long l = gp.a(☃, gc.b);
/* 150 */     int i = a.a(this.f).get(gp.f(☃));
/*     */     
/* 152 */     if (i == a.b(this.f) || gp.c(l) >= i)
/*     */     {
/*     */       
/* 155 */       return new cgb();
/*     */     }
/*     */     
/*     */     cgb cgb2;
/* 159 */     while ((cgb2 = a(l, true)) == null) {
/* 160 */       l = gp.a(l, gc.b);
/*     */     }
/*     */     
/* 163 */     return new cgb((new cuk(cgb2, 0)).a());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cul<a, ?> ☃, boolean bool1, boolean bool2) {
/* 168 */     super.a(☃, bool1, bool2);
/* 169 */     if (!bool1) {
/*     */       return;
/*     */     }
/* 172 */     if (!this.m.isEmpty()) {
/* 173 */       for (LongIterator<Long> longIterator = this.m.iterator(); longIterator.hasNext(); ) { long l = ((Long)longIterator.next()).longValue();
/* 174 */         int i = c(l);
/* 175 */         if (i == 2) {
/*     */           continue;
/*     */         }
/* 178 */         if (!this.n.contains(l) && this.l.add(l)) {
/* 179 */           if (i == 1) {
/*     */             
/* 181 */             a(☃, l);
/* 182 */             if (this.g.add(l)) {
/* 183 */               this.f.a(l);
/*     */             }
/* 185 */             Arrays.fill(a(l, true).a(), (byte)-1);
/*     */             
/* 187 */             int k = gp.c(gp.b(l));
/* 188 */             int m = gp.c(gp.c(l));
/* 189 */             int n = gp.c(gp.d(l));
/*     */             
/* 191 */             for (gc gc1 : k) {
/* 192 */               long l1 = gp.a(l, gc1);
/* 193 */               if ((this.n.contains(l1) || (!this.l.contains(l1) && !this.m.contains(l1))) && g(l1))
/*     */               {
/*     */ 
/*     */                 
/* 197 */                 for (int i2 = 0; i2 < 16; i2++) {
/* 198 */                   for (int i3 = 0; i3 < 16; i3++) {
/*     */                     long l2, l3;
/*     */                     
/* 201 */                     switch (null.a[gc1.ordinal()]) {
/*     */                       case 1:
/* 203 */                         l2 = fx.a(k + i2, m + i3, n);
/* 204 */                         l3 = fx.a(k + i2, m + i3, n - 1);
/*     */                         break;
/*     */                       case 2:
/* 207 */                         l2 = fx.a(k + i2, m + i3, n + 16 - 1);
/* 208 */                         l3 = fx.a(k + i2, m + i3, n + 16);
/*     */                         break;
/*     */                       case 3:
/* 211 */                         l2 = fx.a(k, m + i2, n + i3);
/* 212 */                         l3 = fx.a(k - 1, m + i2, n + i3);
/*     */                         break;
/*     */                       
/*     */                       default:
/* 216 */                         l2 = fx.a(k + 16 - 1, m + i2, n + i3);
/* 217 */                         l3 = fx.a(k + 16, m + i2, n + i3);
/*     */                         break;
/*     */                     } 
/* 220 */                     ☃.a(l2, l3, ☃.b(l2, l3, 0), true);
/*     */                   } 
/*     */                 } 
/*     */               }
/*     */             } 
/* 225 */             for (int i1 = 0; i1 < 16; i1++) {
/* 226 */               for (int i2 = 0; i2 < 16; i2++) {
/* 227 */                 long l1 = fx.a(
/* 228 */                     gp.c(gp.b(l)) + i1, 
/* 229 */                     gp.c(gp.c(l)), 
/* 230 */                     gp.c(gp.d(l)) + i2);
/*     */                 
/* 232 */                 long l2 = fx.a(
/* 233 */                     gp.c(gp.b(l)) + i1, 
/* 234 */                     gp.c(gp.c(l)) - 1, 
/* 235 */                     gp.c(gp.d(l)) + i2);
/*     */                 
/* 237 */                 ☃.a(l1, l2, ☃.b(l1, l2, 0), true);
/*     */               } 
/*     */             } 
/*     */             continue;
/*     */           } 
/* 242 */           for (int j = 0; j < 16; j++) {
/* 243 */             for (int k = 0; k < 16; k++) {
/* 244 */               long l1 = fx.a(
/* 245 */                   gp.c(gp.b(l)) + j, 
/* 246 */                   gp.c(gp.c(l)) + 16 - 1, 
/* 247 */                   gp.c(gp.d(l)) + k);
/*     */               
/* 249 */               ☃.a(Long.MAX_VALUE, l1, 0, true);
/*     */             } 
/*     */           } 
/*     */         }  }
/*     */     
/*     */     }
/*     */     
/* 256 */     this.m.clear();
/* 257 */     if (!this.n.isEmpty()) {
/* 258 */       for (LongIterator<Long> longIterator = this.n.iterator(); longIterator.hasNext(); ) { long l = ((Long)longIterator.next()).longValue();
/* 259 */         if (!this.l.remove(l) || 
/* 260 */           !g(l)) {
/*     */           continue;
/*     */         }
/* 263 */         for (int i = 0; i < 16; i++) {
/* 264 */           for (int j = 0; j < 16; j++) {
/* 265 */             long l1 = fx.a(
/* 266 */                 gp.c(gp.b(l)) + i, 
/* 267 */                 gp.c(gp.c(l)) + 16 - 1, 
/* 268 */                 gp.c(gp.d(l)) + j);
/*     */             
/* 270 */             ☃.a(Long.MAX_VALUE, l1, 15, false);
/*     */           } 
/*     */         }  }
/*     */     
/*     */     }
/*     */     
/* 276 */     this.n.clear();
/* 277 */     this.p = false;
/*     */   }
/*     */   
/*     */   protected boolean a(int ☃) {
/* 281 */     return (☃ >= a.b(this.f));
/*     */   }
/*     */   
/*     */   protected boolean m(long ☃) {
/* 285 */     int i = fx.c(☃);
/*     */     
/* 287 */     if ((i & 0xF) != 15) {
/* 288 */       return false;
/*     */     }
/* 290 */     long l1 = gp.e(☃);
/* 291 */     long l2 = gp.f(l1);
/* 292 */     if (!this.o.contains(l2)) {
/* 293 */       return false;
/*     */     }
/* 295 */     int j = a.a(this.f).get(l2);
/* 296 */     return (gp.c(j) == i + 16);
/*     */   }
/*     */   
/*     */   protected boolean n(long ☃) {
/* 300 */     long l = gp.f(☃);
/* 301 */     int i = a.a(this.f).get(l);
/* 302 */     return (i == a.b(this.f) || gp.c(☃) >= i);
/*     */   }
/*     */   
/*     */   protected boolean o(long ☃) {
/* 306 */     long l = gp.f(☃);
/* 307 */     return this.o.contains(l);
/*     */   }
/*     */ 
/*     */   
/*     */   public static final class a
/*     */     extends cui<a>
/*     */   {
/*     */     private int b;
/*     */     private final Long2IntOpenHashMap c;
/*     */     
/*     */     public a(Long2ObjectOpenHashMap<cgb> ☃, Long2IntOpenHashMap long2IntOpenHashMap, int i) {
/* 318 */       super(☃);
/* 319 */       this.c = long2IntOpenHashMap;
/* 320 */       long2IntOpenHashMap.defaultReturnValue(i);
/* 321 */       this.b = i;
/*     */     }
/*     */ 
/*     */     
/*     */     public a a() {
/* 326 */       return new a(this.a.clone(), this.c.clone(), this.b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cur.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */