/*     */ import java.util.List;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.Stream;
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
/*     */ public class ccy
/*     */   extends cdd
/*     */   implements ccx, cdm
/*     */ {
/*  39 */   private gj<bmb> i = gj.a(5, bmb.b);
/*  40 */   private int j = -1;
/*     */   private long k;
/*     */   
/*     */   public ccy() {
/*  44 */     super(cck.q);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  49 */     super.a(☃, md1);
/*     */     
/*  51 */     this.i = gj.a(Z_(), bmb.b);
/*  52 */     if (!b(md1)) {
/*  53 */       aoo.b(md1, this.i);
/*     */     }
/*  55 */     this.j = md1.h("TransferCooldown");
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  60 */     super.a(☃);
/*     */     
/*  62 */     if (!c(☃)) {
/*  63 */       aoo.a(☃, this.i);
/*     */     }
/*     */     
/*  66 */     ☃.b("TransferCooldown", this.j);
/*  67 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/*  72 */     return this.i.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃, int i) {
/*  77 */     d((bfw)null);
/*     */ 
/*     */     
/*  80 */     return aoo.a(f(), ☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/*  85 */     d((bfw)null);
/*  86 */     f().set(☃, bmb1);
/*  87 */     if (bmb1.E() > V_()) {
/*  88 */       bmb1.e(V_());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected nr g() {
/*  95 */     return new of("container.hopper");
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/* 100 */     if (this.d == null || this.d.v) {
/*     */       return;
/*     */     }
/*     */     
/* 104 */     this.j--;
/* 105 */     this.k = this.d.T();
/*     */     
/* 107 */     if (!m()) {
/* 108 */       c(0);
/* 109 */       a(() -> Boolean.valueOf(a(this)));
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(Supplier<Boolean> ☃) {
/* 114 */     if (this.d == null || this.d.v) {
/* 115 */       return false;
/*     */     }
/*     */     
/* 118 */     if (!m() && ((Boolean)p().c(bxl.b)).booleanValue()) {
/* 119 */       boolean bool = false;
/*     */       
/* 121 */       if (!c()) {
/* 122 */         bool = k();
/*     */       }
/* 124 */       if (!j()) {
/* 125 */         bool |= ((Boolean)☃.get()).booleanValue();
/*     */       }
/*     */       
/* 128 */       if (bool) {
/* 129 */         c(8);
/* 130 */         X_();
/* 131 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 135 */     return false;
/*     */   }
/*     */   
/*     */   private boolean j() {
/* 139 */     for (bmb ☃ : this.i) {
/* 140 */       if (☃.a() || ☃.E() != ☃.c()) {
/* 141 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 145 */     return true;
/*     */   }
/*     */   
/*     */   private boolean k() {
/* 149 */     aon ☃ = l();
/* 150 */     if (☃ == null) {
/* 151 */       return false;
/*     */     }
/*     */     
/* 154 */     gc gc = ((gc)p().c(bxl.a)).f();
/* 155 */     if (b(☃, gc)) {
/* 156 */       return false;
/*     */     }
/*     */     
/* 159 */     for (int i = 0; i < Z_(); i++) {
/* 160 */       if (!a(i).a()) {
/*     */ 
/*     */ 
/*     */         
/* 164 */         bmb bmb1 = a(i).i();
/* 165 */         bmb bmb2 = a(this, ☃, a(i, 1), gc);
/*     */         
/* 167 */         if (bmb2.a()) {
/* 168 */           ☃.X_();
/* 169 */           return true;
/*     */         } 
/* 171 */         a(i, bmb1);
/*     */       } 
/*     */     } 
/*     */     
/* 175 */     return false;
/*     */   }
/*     */   
/*     */   private static IntStream a(aon ☃, gc gc1) {
/* 179 */     if (☃ instanceof ape) {
/* 180 */       return IntStream.of(((ape)☃).a(gc1));
/*     */     }
/*     */     
/* 183 */     return IntStream.range(0, ☃.Z_());
/*     */   }
/*     */   
/*     */   private boolean b(aon ☃, gc gc1) {
/* 187 */     return a(☃, gc1).allMatch(i -> {
/*     */           bmb bmb = ☃.a(i);
/*     */           return (bmb.E() >= bmb.c());
/*     */         });
/*     */   }
/*     */   
/*     */   private static boolean c(aon ☃, gc gc1) {
/* 194 */     return a(☃, gc1).allMatch(i -> ☃.a(i).a());
/*     */   }
/*     */   
/*     */   public static boolean a(ccx ☃) {
/* 198 */     aon aon = b(☃);
/*     */     
/* 200 */     if (aon != null) {
/* 201 */       gc gc = gc.a;
/* 202 */       if (c(aon, gc)) {
/* 203 */         return false;
/*     */       }
/*     */       
/* 206 */       return a(aon, gc).anyMatch(i -> a(☃, aon1, i, gc1));
/*     */     } 
/* 208 */     for (bcv bcv : c(☃)) {
/* 209 */       if (a(☃, bcv)) {
/* 210 */         return true;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 215 */     return false;
/*     */   }
/*     */   
/*     */   private static boolean a(ccx ☃, aon aon1, int i, gc gc1) {
/* 219 */     bmb bmb = aon1.a(i);
/*     */     
/* 221 */     if (!bmb.a() && b(aon1, bmb, i, gc1)) {
/* 222 */       bmb bmb1 = bmb.i();
/* 223 */       bmb bmb2 = a(aon1, ☃, aon1.a(i, 1), (gc)null);
/*     */       
/* 225 */       if (bmb2.a()) {
/* 226 */         aon1.X_();
/* 227 */         return true;
/*     */       } 
/* 229 */       aon1.a(i, bmb1);
/*     */     } 
/*     */ 
/*     */     
/* 233 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(aon ☃, bcv bcv1) {
/* 237 */     boolean bool = false;
/*     */     
/* 239 */     bmb bmb1 = bcv1.g().i();
/* 240 */     bmb bmb2 = a((aon)null, ☃, bmb1, (gc)null);
/*     */     
/* 242 */     if (bmb2.a()) {
/* 243 */       bool = true;
/*     */       
/* 245 */       bcv1.ad();
/*     */     } else {
/* 247 */       bcv1.b(bmb2);
/*     */     } 
/*     */     
/* 250 */     return bool;
/*     */   }
/*     */   
/*     */   public static bmb a(@Nullable aon ☃, aon aon1, bmb bmb1, @Nullable gc gc1) {
/* 254 */     if (aon1 instanceof ape && gc1 != null) {
/* 255 */       ape ape = (ape)aon1;
/* 256 */       int[] arrayOfInt = ape.a(gc1);
/*     */       
/* 258 */       for (int i = 0; i < arrayOfInt.length && !bmb1.a(); i++) {
/* 259 */         bmb1 = a(☃, aon1, bmb1, arrayOfInt[i], gc1);
/*     */       }
/*     */     } else {
/* 262 */       int i = aon1.Z_();
/* 263 */       for (int j = 0; j < i && !bmb1.a(); j++) {
/* 264 */         bmb1 = a(☃, aon1, bmb1, j, gc1);
/*     */       }
/*     */     } 
/*     */     
/* 268 */     return bmb1;
/*     */   }
/*     */   
/*     */   private static boolean a(aon ☃, bmb bmb1, int i, @Nullable gc gc1) {
/* 272 */     if (!☃.b(i, bmb1)) {
/* 273 */       return false;
/*     */     }
/* 275 */     if (☃ instanceof ape && !((ape)☃).a(i, bmb1, gc1)) {
/* 276 */       return false;
/*     */     }
/* 278 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean b(aon ☃, bmb bmb1, int i, gc gc1) {
/* 282 */     if (☃ instanceof ape && !((ape)☃).b(i, bmb1, gc1)) {
/* 283 */       return false;
/*     */     }
/* 285 */     return true;
/*     */   }
/*     */   
/*     */   private static bmb a(@Nullable aon ☃, aon aon1, bmb bmb1, int i, @Nullable gc gc1) {
/* 289 */     bmb bmb2 = aon1.a(i);
/*     */     
/* 291 */     if (a(aon1, bmb1, i, gc1)) {
/* 292 */       boolean bool1 = false;
/* 293 */       boolean bool2 = aon1.c();
/* 294 */       if (bmb2.a()) {
/* 295 */         aon1.a(i, bmb1);
/* 296 */         bmb1 = bmb.b;
/* 297 */         bool1 = true;
/* 298 */       } else if (a(bmb2, bmb1)) {
/* 299 */         int j = bmb1.c() - bmb2.E();
/* 300 */         int k = Math.min(bmb1.E(), j);
/*     */         
/* 302 */         bmb1.g(k);
/* 303 */         bmb2.f(k);
/* 304 */         bool1 = (k > 0);
/*     */       } 
/* 306 */       if (bool1) {
/* 307 */         if (bool2 && aon1 instanceof ccy) {
/* 308 */           ccy ccy1 = (ccy)aon1;
/* 309 */           if (!ccy1.y()) {
/* 310 */             int j = 0;
/* 311 */             if (☃ instanceof ccy) {
/* 312 */               ccy ccy2 = (ccy)☃;
/* 313 */               if (ccy1.k >= ccy2.k)
/*     */               {
/* 315 */                 j = 1;
/*     */               }
/*     */             } 
/* 318 */             ccy1.c(8 - j);
/*     */           } 
/*     */         } 
/* 321 */         aon1.X_();
/*     */       } 
/*     */     } 
/* 324 */     return bmb1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private aon l() {
/* 329 */     gc ☃ = (gc)p().c(bxl.a);
/* 330 */     return b(v(), this.e.a(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static aon b(ccx ☃) {
/* 335 */     return a(☃.v(), ☃.x(), ☃.z() + 1.0D, ☃.A());
/*     */   }
/*     */   
/*     */   public static List<bcv> c(ccx ☃) {
/* 339 */     return (List<bcv>)☃.aa_().d().stream().flatMap(dci1 -> ☃.v().<aqa>a((Class)bcv.class, dci1.d(☃.x() - 0.5D, ☃.z() - 0.5D, ☃.A() - 0.5D), aqd.a).stream()).collect(Collectors.toList());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static aon b(brx ☃, fx fx1) {
/* 344 */     return a(☃, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static aon a(brx ☃, double d1, double d2, double d3) {
/* 349 */     aon aon = null;
/* 350 */     fx fx = new fx(d1, d2, d3);
/*     */     
/* 352 */     ceh ceh = ☃.d_(fx);
/* 353 */     buo buo = ceh.b();
/* 354 */     if (buo instanceof apf) {
/* 355 */       aon = ((apf)buo).a(ceh, ☃, fx);
/* 356 */     } else if (buo.q()) {
/* 357 */       ccj ccj = ☃.c(fx);
/*     */       
/* 359 */       if (ccj instanceof aon) {
/* 360 */         aon = (aon)ccj;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 365 */         if (aon instanceof ccn && 
/* 366 */           buo instanceof bve) {
/* 367 */           aon = bve.a((bve)buo, ceh, ☃, fx, true);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 373 */     if (aon == null) {
/* 374 */       List<aqa> list = ☃.a((aqa)null, new dci(d1 - 0.5D, d2 - 0.5D, d3 - 0.5D, d1 + 0.5D, d2 + 0.5D, d3 + 0.5D), aqd.d);
/*     */       
/* 376 */       if (!list.isEmpty()) {
/* 377 */         aon = (aon)list.get(☃.t.nextInt(list.size()));
/*     */       }
/*     */     } 
/*     */     
/* 381 */     return aon;
/*     */   }
/*     */   
/*     */   private static boolean a(bmb ☃, bmb bmb1) {
/* 385 */     if (☃.b() != bmb1.b()) {
/* 386 */       return false;
/*     */     }
/* 388 */     if (☃.g() != bmb1.g()) {
/* 389 */       return false;
/*     */     }
/* 391 */     if (☃.E() > ☃.c()) {
/* 392 */       return false;
/*     */     }
/* 394 */     if (!bmb.a(☃, bmb1)) {
/* 395 */       return false;
/*     */     }
/* 397 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public double x() {
/* 402 */     return this.e.u() + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public double z() {
/* 407 */     return this.e.v() + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public double A() {
/* 412 */     return this.e.w() + 0.5D;
/*     */   }
/*     */   
/*     */   private void c(int ☃) {
/* 416 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   private boolean m() {
/* 420 */     return (this.j > 0);
/*     */   }
/*     */   
/*     */   private boolean y() {
/* 424 */     return (this.j > 8);
/*     */   }
/*     */ 
/*     */   
/*     */   protected gj<bmb> f() {
/* 429 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gj<bmb> ☃) {
/* 434 */     this.i = ☃;
/*     */   }
/*     */   
/*     */   public void a(aqa ☃) {
/* 438 */     if (☃ instanceof bcv) {
/* 439 */       fx fx = o();
/* 440 */       if (dde.c(dde.a(☃.cc().d(-fx.u(), -fx.v(), -fx.w())), aa_(), dcr.i)) {
/* 441 */         a(() -> Boolean.valueOf(a(this, (bcv)☃)));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected bic a(int ☃, bfv bfv1) {
/* 448 */     return new bix(☃, bfv1, this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */