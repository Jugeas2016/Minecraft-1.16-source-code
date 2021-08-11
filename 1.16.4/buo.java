/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import com.google.common.cache.CacheLoader;
/*     */ import com.google.common.cache.LoadingCache;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.stream.Stream;
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
/*     */ public class buo
/*     */   extends ceg
/*     */   implements brw
/*     */ {
/*  60 */   protected static final Logger l = LogManager.getLogger();
/*     */   
/*  62 */   public static final gh<ceh> m = new gh<>();
/*     */   
/*  64 */   private static final LoadingCache<ddh, Boolean> a = CacheBuilder.newBuilder()
/*  65 */     .maximumSize(512L)
/*  66 */     .weakKeys()
/*  67 */     .build(new CacheLoader<ddh, Boolean>()
/*     */       {
/*     */         public Boolean a(ddh ☃) {
/*  70 */           return Boolean.valueOf(!dde.c(dde.b(), ☃, dcr.g));
/*     */         }
/*     */       });
/*     */ 
/*     */ 
/*     */   
/*     */   protected final cei<buo, ceh> n;
/*     */ 
/*     */   
/*     */   private ceh b;
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private String c;
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private blx d;
/*     */   
/*     */   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<a>> e;
/*     */ 
/*     */   
/*     */   public static int i(@Nullable ceh ☃) {
/*  93 */     if (☃ == null) {
/*  94 */       return 0;
/*     */     }
/*  96 */     int i = m.a(☃);
/*  97 */     return (i == -1) ? 0 : i;
/*     */   }
/*     */   
/*     */   public static ceh a(int ☃) {
/* 101 */     ceh ceh1 = m.a(☃);
/* 102 */     return (ceh1 == null) ? bup.a.n() : ceh1;
/*     */   }
/*     */   
/*     */   public static buo a(@Nullable blx ☃) {
/* 106 */     if (☃ instanceof bkh) {
/* 107 */       return ((bkh)☃).e();
/*     */     }
/*     */     
/* 110 */     return bup.a;
/*     */   }
/*     */   
/*     */   public static ceh a(ceh ☃, ceh ceh1, brx brx1, fx fx1) {
/* 114 */     ddh ddh = dde.b(☃.k(brx1, fx1), ceh1.k(brx1, fx1), dcr.c).a(fx1.u(), fx1.v(), fx1.w());
/* 115 */     List<aqa> list = brx1.a((aqa)null, ddh.a());
/* 116 */     for (aqa aqa : list) {
/*     */       
/* 118 */       double d = dde.a(gc.a.b, aqa.cc().d(0.0D, 1.0D, 0.0D), Stream.of(ddh), -1.0D);
/* 119 */       aqa.a(aqa.cD(), aqa.cE() + 1.0D + d, aqa.cH());
/*     */     } 
/* 121 */     return ceh1;
/*     */   }
/*     */   
/*     */   public static ddh a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/* 125 */     return dde.a(☃ / 16.0D, d1 / 16.0D, d2 / 16.0D, d3 / 16.0D, d4 / 16.0D, d5 / 16.0D);
/*     */   }
/*     */   
/*     */   public boolean a(ael<buo> ☃) {
/* 129 */     return ☃.a(this);
/*     */   }
/*     */   
/*     */   public boolean a(buo ☃) {
/* 133 */     return (this == ☃);
/*     */   }
/*     */   
/*     */   public static ceh b(ceh ☃, bry bry1, fx fx1) {
/* 137 */     ceh ceh1 = ☃;
/*     */     
/* 139 */     fx.a a = new fx.a();
/* 140 */     for (gc gc : ar) {
/* 141 */       a.a(fx1, gc);
/* 142 */       ceh1 = ceh1.a(gc, bry1.d_(a), bry1, fx1, a);
/*     */     } 
/*     */     
/* 145 */     return ceh1;
/*     */   }
/*     */   
/*     */   public static void a(ceh ☃, ceh ceh1, bry bry1, fx fx1, int i) {
/* 149 */     a(☃, ceh1, bry1, fx1, i, 512);
/*     */   }
/*     */   
/*     */   public static void a(ceh ☃, ceh ceh1, bry bry1, fx fx1, int i, int j) {
/* 153 */     if (ceh1 != ☃) {
/* 154 */       if (ceh1.g()) {
/* 155 */         if (!bry1.s_()) {
/* 156 */           bry1.a(fx1, ((i & 0x20) == 0), (aqa)null, j);
/*     */         }
/*     */       } else {
/* 159 */         bry1.a(fx1, ceh1, i & 0xFFFFFFDF, j);
/*     */       } 
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
/*     */   
/*     */   public buo(ceg.c ☃) {
/* 174 */     super(☃);
/* 175 */     cei.a<buo, ceh> a = new cei.a<>(this);
/* 176 */     a(a);
/*     */     
/* 178 */     this.n = a.a(buo::n, ceh::new);
/* 179 */     j(this.n.b());
/*     */   }
/*     */   
/*     */   public static boolean b(buo ☃) {
/* 183 */     return (☃ instanceof bxx || ☃ == bup.go || ☃ == bup.cU || ☃ == bup.cV || ☃ == bup.dK || ☃ == bup.cK || ☃
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 189 */       .a(aed.au));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/* 194 */     return this.av;
/*     */   }
/*     */   
/*     */   public static final class a {
/*     */     private final ceh a;
/*     */     private final ceh b;
/*     */     private final gc c;
/*     */     
/*     */     public a(ceh ☃, ceh ceh1, gc gc1) {
/* 203 */       this.a = ☃;
/* 204 */       this.b = ceh1;
/* 205 */       this.c = gc1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 210 */       if (this == ☃) {
/* 211 */         return true;
/*     */       }
/* 213 */       if (!(☃ instanceof a)) {
/* 214 */         return false;
/*     */       }
/* 216 */       a a1 = (a)☃;
/* 217 */       return (this.a == a1.a && this.b == a1.b && this.c == a1.c);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 222 */       int ☃ = this.a.hashCode();
/* 223 */       ☃ = 31 * ☃ + this.b.hashCode();
/* 224 */       ☃ = 31 * ☃ + this.c.hashCode();
/* 225 */       return ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static {
/* 230 */     e = ThreadLocal.withInitial(() -> {
/*     */           Object2ByteLinkedOpenHashMap<a> ☃ = new Object2ByteLinkedOpenHashMap<a>(2048, 0.25F)
/*     */             {
/*     */               protected void rehash(int ☃) {}
/*     */             };
/*     */           ☃.defaultReturnValue(127);
/*     */           return ☃;
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean c(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 244 */     fx fx2 = fx1.a(gc1);
/* 245 */     ceh ceh1 = brc1.d_(fx2);
/*     */     
/* 247 */     if (☃.a(ceh1, gc1)) {
/* 248 */       return false;
/*     */     }
/*     */     
/* 251 */     if (ceh1.l()) {
/* 252 */       a a = new a(☃, ceh1, gc1);
/* 253 */       Object2ByteLinkedOpenHashMap<a> object2ByteLinkedOpenHashMap = e.get();
/* 254 */       byte b = object2ByteLinkedOpenHashMap.getAndMoveToFirst(a);
/* 255 */       if (b != Byte.MAX_VALUE) {
/* 256 */         return (b != 0);
/*     */       }
/* 258 */       ddh ddh1 = ☃.a(brc1, fx1, gc1);
/* 259 */       ddh ddh2 = ceh1.a(brc1, fx2, gc1.f());
/*     */       
/* 261 */       boolean bool = dde.c(ddh1, ddh2, dcr.e);
/* 262 */       if (object2ByteLinkedOpenHashMap.size() == 2048) {
/* 263 */         object2ByteLinkedOpenHashMap.removeLastByte();
/*     */       }
/* 265 */       object2ByteLinkedOpenHashMap.putAndMoveToFirst(a, (byte)(bool ? 1 : 0));
/* 266 */       return bool;
/*     */     } 
/* 268 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean c(brc ☃, fx fx1) {
/* 272 */     return ☃.d_(fx1).a(☃, fx1, gc.b, cat.c);
/*     */   }
/*     */   
/*     */   public static boolean a(brz ☃, fx fx1, gc gc1) {
/* 276 */     ceh ceh1 = ☃.d_(fx1);
/*     */     
/* 278 */     if (gc1 == gc.a && ceh1.a(aed.aC)) {
/* 279 */       return false;
/*     */     }
/*     */     
/* 282 */     return ceh1.a(☃, fx1, gc1, cat.b);
/*     */   }
/*     */   
/*     */   public static boolean a(ddh ☃, gc gc1) {
/* 286 */     ddh ddh1 = ☃.a(gc1);
/* 287 */     return a(ddh1);
/*     */   }
/*     */   
/*     */   public static boolean a(ddh ☃) {
/* 291 */     return ((Boolean)a.getUnchecked(☃)).booleanValue();
/*     */   }
/*     */   
/*     */   public boolean b(ceh ☃, brc brc1, fx fx1) {
/* 295 */     return (!a(☃.j(brc1, fx1)) && ☃.m().c());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bry ☃, fx fx1, ceh ceh1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<bmb> a(ceh ☃, aag aag1, fx fx1, @Nullable ccj ccj1) {
/* 314 */     cyv.a a = (new cyv.a(aag1)).a(aag1.t).<dcn>a(dbc.f, dcn.a(fx1)).<bmb>a(dbc.i, bmb.b).b(dbc.h, ccj1);
/* 315 */     return ☃.a(a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<bmb> a(ceh ☃, aag aag1, fx fx1, @Nullable ccj ccj1, @Nullable aqa aqa1, bmb bmb1) {
/* 324 */     cyv.a a = (new cyv.a(aag1)).a(aag1.t).<dcn>a(dbc.f, dcn.a(fx1)).<bmb>a(dbc.i, bmb1).<aqa>b(dbc.a, aqa1).b(dbc.h, ccj1);
/* 325 */     return ☃.a(a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void c(ceh ☃, brx brx1, fx fx1) {
/* 336 */     if (brx1 instanceof aag) {
/* 337 */       a(☃, (aag)brx1, fx1, (ccj)null).forEach(bmb1 -> a(☃, fx1, bmb1));
/* 338 */       ☃.a((aag)brx1, fx1, bmb.b);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(ceh ☃, bry bry1, fx fx1, @Nullable ccj ccj1) {
/* 343 */     if (bry1 instanceof aag) {
/* 344 */       a(☃, (aag)bry1, fx1, ccj1).forEach(bmb1 -> a((aag)☃, fx1, bmb1));
/* 345 */       ☃.a((aag)bry1, fx1, bmb.b);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(ceh ☃, brx brx1, fx fx1, @Nullable ccj ccj1, aqa aqa1, bmb bmb1) {
/* 350 */     if (brx1 instanceof aag) {
/* 351 */       a(☃, (aag)brx1, fx1, ccj1, aqa1, bmb1).forEach(bmb1 -> a(☃, fx1, bmb1));
/* 352 */       ☃.a((aag)brx1, fx1, bmb1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, fx fx1, bmb bmb1) {
/* 357 */     if (☃.v || bmb1.a() || !☃.V().b(brt.f)) {
/*     */       return;
/*     */     }
/*     */     
/* 361 */     float f = 0.5F;
/* 362 */     double d1 = (☃.t.nextFloat() * 0.5F) + 0.25D;
/* 363 */     double d2 = (☃.t.nextFloat() * 0.5F) + 0.25D;
/* 364 */     double d3 = (☃.t.nextFloat() * 0.5F) + 0.25D;
/* 365 */     bcv bcv = new bcv(☃, fx1.u() + d1, fx1.v() + d2, fx1.w() + d3, bmb1);
/* 366 */     bcv.m();
/* 367 */     ☃.c(bcv);
/*     */   }
/*     */   
/*     */   protected void a(aag ☃, fx fx1, int i) {
/* 371 */     if (☃.V().b(brt.f)) {
/* 372 */       while (i > 0) {
/* 373 */         int j = aqg.a(i);
/* 374 */         i -= j;
/* 375 */         ☃.c(new aqg(☃, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, j));
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public float f() {
/* 381 */     return this.au;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, brp brp1) {}
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, aqa aqa1) {}
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/* 392 */     return n();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(brx ☃, bfw bfw1, fx fx1, ceh ceh1, @Nullable ccj ccj1, bmb bmb1) {
/* 400 */     bfw1.b(aea.a.b(this));
/* 401 */     bfw1.t(0.005F);
/* 402 */     a(ceh1, ☃, fx1, ccj1, bfw1, bmb1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, @Nullable aqm aqm1, bmb bmb1) {}
/*     */   
/*     */   public boolean ai_() {
/* 409 */     return (!this.as.b() && !this.as.a());
/*     */   }
/*     */   
/*     */   public nx g() {
/* 413 */     return new of(i());
/*     */   }
/*     */   
/*     */   public String i() {
/* 417 */     if (this.c == null) {
/* 418 */       this.c = x.a("block", gm.Q.b(this));
/*     */     }
/* 420 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(brx ☃, fx fx1, aqa aqa1, float f) {
/* 424 */     aqa1.b(f, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(brc ☃, aqa aqa1) {
/* 428 */     aqa1.f(aqa1.cC().d(1.0D, 0.0D, 1.0D));
/*     */   }
/*     */   
/*     */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 432 */     return new bmb(this);
/*     */   }
/*     */   
/*     */   public void a(bks ☃, gj<bmb> gj1) {
/* 436 */     gj1.add(new bmb(this));
/*     */   }
/*     */   
/*     */   public float j() {
/* 440 */     return this.ax;
/*     */   }
/*     */   
/*     */   public float k() {
/* 444 */     return this.ay;
/*     */   }
/*     */   
/*     */   public float l() {
/* 448 */     return this.az;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, bfw bfw1) {
/* 453 */     ☃.a(bfw1, 2001, fx1, i(ceh1));
/*     */     
/* 455 */     if (a(aed.az)) {
/* 456 */       bet.a(bfw1, false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(brx ☃, fx fx1) {}
/*     */   
/*     */   public boolean a(brp ☃) {
/* 464 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {}
/*     */   
/*     */   public cei<buo, ceh> m() {
/* 471 */     return this.n;
/*     */   }
/*     */   
/*     */   protected final void j(ceh ☃) {
/* 475 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public final ceh n() {
/* 479 */     return this.b;
/*     */   }
/*     */   
/*     */   public cae k(ceh ☃) {
/* 483 */     return this.aw;
/*     */   }
/*     */ 
/*     */   
/*     */   public blx h() {
/* 488 */     if (this.d == null) {
/* 489 */       this.d = blx.a(this);
/*     */     }
/* 491 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean o() {
/* 495 */     return this.aA;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 500 */     return "Block{" + gm.Q.b(this) + "}";
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, @Nullable brc brc1, List<nr> list, bnl bnl1) {}
/*     */ 
/*     */   
/*     */   protected buo p() {
/* 508 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\buo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */