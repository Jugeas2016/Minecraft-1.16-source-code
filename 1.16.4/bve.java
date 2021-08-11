/*     */ import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.function.BiPredicate;
/*     */ import java.util.function.Supplier;
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
/*     */ public class bve
/*     */   extends btn<ccn>
/*     */   implements bzu
/*     */ {
/*  55 */   public static final cfb b = bxm.aq;
/*  56 */   public static final cfe<cez> c = cex.aF;
/*  57 */   public static final cey d = cex.C;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  62 */   protected static final ddh e = buo.a(1.0D, 0.0D, 0.0D, 15.0D, 14.0D, 15.0D);
/*  63 */   protected static final ddh f = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 16.0D);
/*  64 */   protected static final ddh g = buo.a(0.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
/*  65 */   protected static final ddh h = buo.a(1.0D, 0.0D, 1.0D, 16.0D, 14.0D, 15.0D);
/*  66 */   protected static final ddh i = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
/*     */   
/*     */   protected bve(ceg.c ☃, Supplier<cck<? extends ccn>> supplier) {
/*  69 */     super(☃, supplier);
/*  70 */     j(((ceh)this.n.b()).a(b, gc.c).a(c, cez.a).a(d, Boolean.valueOf(false)));
/*     */   }
/*     */   
/*     */   public static bwc.a g(ceh ☃) {
/*  74 */     cez cez = (cez)☃.c(c);
/*  75 */     if (cez == cez.a) {
/*  76 */       return bwc.a.a;
/*     */     }
/*  78 */     if (cez == cez.c) {
/*  79 */       return bwc.a.b;
/*     */     }
/*  81 */     return bwc.a.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  86 */     return bzh.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  91 */     if (((Boolean)☃.c(d)).booleanValue()) {
/*  92 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/*  94 */     if (ceh1.a(this) && gc1.n().d()) {
/*  95 */       cez cez = (cez)ceh1.c(c);
/*  96 */       if (☃.c(c) == cez.a && cez != cez.a && 
/*  97 */         ☃.c(b) == ceh1.c(b) && h(ceh1) == gc1.f()) {
/*  98 */         return ☃.a(c, cez.b());
/*     */       }
/*     */     }
/* 101 */     else if (h(☃) == gc1) {
/* 102 */       return ☃.a(c, cez.a);
/*     */     } 
/* 104 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 109 */     if (☃.c(c) == cez.a) {
/* 110 */       return i;
/*     */     }
/*     */     
/* 113 */     switch (null.a[h(☃).ordinal()])
/*     */     
/*     */     { default:
/* 116 */         return e;
/*     */       case 2:
/* 118 */         return f;
/*     */       case 3:
/* 120 */         return g;
/*     */       case 4:
/* 122 */         break; }  return h;
/*     */   }
/*     */ 
/*     */   
/*     */   public static gc h(ceh ☃) {
/* 127 */     gc gc = (gc)☃.c(b);
/* 128 */     return (☃.c(c) == cez.b) ? gc.g() : gc.h();
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 133 */     cez cez = cez.a;
/* 134 */     gc gc1 = ☃.f().f();
/* 135 */     cux cux = ☃.p().b(☃.a());
/*     */     
/* 137 */     boolean bool = ☃.g();
/* 138 */     gc gc2 = ☃.j();
/*     */     
/* 140 */     if (gc2.n().d() && bool) {
/* 141 */       gc gc = a(☃, gc2.f());
/* 142 */       if (gc != null && gc.n() != gc2.n()) {
/* 143 */         gc1 = gc;
/* 144 */         cez = (gc1.h() == gc2.f()) ? cez.c : cez.b;
/*     */       } 
/*     */     } 
/* 147 */     if (cez == cez.a && !bool) {
/* 148 */       if (gc1 == a(☃, gc1.g())) {
/* 149 */         cez = cez.b;
/* 150 */       } else if (gc1 == a(☃, gc1.h())) {
/* 151 */         cez = cez.c;
/*     */       } 
/*     */     }
/*     */     
/* 155 */     return n().a(b, gc1).a(c, cez).a(d, Boolean.valueOf((cux.a() == cuy.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 160 */     if (((Boolean)☃.c(d)).booleanValue()) {
/* 161 */       return cuy.c.a(false);
/*     */     }
/* 163 */     return super.d(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private gc a(bny ☃, gc gc1) {
/* 168 */     ceh ceh = ☃.p().d_(☃.a().a(gc1));
/*     */     
/* 170 */     return (ceh.a(this) && ceh.c(c) == cez.a) ? (gc)ceh.c(b) : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/* 175 */     if (bmb1.t()) {
/* 176 */       ccj ccj = ☃.c(fx1);
/* 177 */       if (ccj instanceof ccn) {
/* 178 */         ((ccn)ccj).a(bmb1.r());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 185 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 188 */     ccj ccj = brx1.c(fx1);
/* 189 */     if (ccj instanceof aon) {
/* 190 */       aoq.a(brx1, fx1, (aon)ccj);
/*     */       
/* 192 */       brx1.c(fx1, this);
/*     */     } 
/* 194 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 199 */     if (brx1.v) {
/* 200 */       return aou.a;
/*     */     }
/*     */     
/* 203 */     aox aox = b(☃, brx1, fx1);
/* 204 */     if (aox != null) {
/* 205 */       bfw1.a(aox);
/* 206 */       bfw1.b(c());
/* 207 */       bet.a(bfw1, true);
/*     */     } 
/*     */     
/* 210 */     return aou.b;
/*     */   }
/*     */   
/*     */   protected adx<vk> c() {
/* 214 */     return aea.i.b(aea.an);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 221 */   private static final bwc.b<ccn, Optional<aon>> j = new bwc.b<ccn, Optional<aon>>()
/*     */     {
/*     */       public Optional<aon> a(ccn ☃, ccn ccn1) {
/* 224 */         return Optional.of(new aom(☃, ccn1));
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<aon> a(ccn ☃) {
/* 229 */         return Optional.of(☃);
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<aon> a() {
/* 234 */         return Optional.empty();
/*     */       }
/*     */     };
/*     */   
/*     */   @Nullable
/*     */   public static aon a(bve ☃, ceh ceh1, brx brx1, fx fx1, boolean bool) {
/* 240 */     return ((Optional<aon>)☃.a(ceh1, brx1, fx1, bool).<Optional<aon>>apply(j)).orElse(null);
/*     */   }
/*     */ 
/*     */   
/*     */   public bwc.c<? extends ccn> a(ceh ☃, brx brx1, fx fx1, boolean bool) {
/*     */     BiPredicate<bry, fx> biPredicate;
/* 246 */     if (bool) {
/* 247 */       biPredicate = ((☃, fx1) -> false);
/*     */     } else {
/* 249 */       biPredicate = bve::a;
/*     */     } 
/* 251 */     return bwc.a(this.a.get(), bve::g, bve::h, b, ☃, brx1, fx1, biPredicate);
/*     */   }
/*     */   
/* 254 */   private static final bwc.b<ccn, Optional<aox>> k = new bwc.b<ccn, Optional<aox>>()
/*     */     {
/*     */       public Optional<aox> a(ccn ☃, ccn ccn1) {
/* 257 */         aon aon = new aom(☃, ccn1);
/* 258 */         return Optional.of(new aox(this, ☃, ccn1, aon)
/*     */             {
/*     */               @Nullable
/*     */               public bic createMenu(int ☃, bfv bfv1, bfw bfw1) {
/* 262 */                 if (this.a.e(bfw1) && this.b.e(bfw1)) {
/* 263 */                   this.a.d(bfv1.e);
/* 264 */                   this.b.d(bfv1.e);
/*     */                   
/* 266 */                   return bij.b(☃, bfv1, this.c);
/*     */                 } 
/* 268 */                 return null;
/*     */               }
/*     */ 
/*     */               
/*     */               public nr d() {
/* 273 */                 if (this.a.S()) {
/* 274 */                   return this.a.d();
/*     */                 }
/* 276 */                 if (this.b.S()) {
/* 277 */                   return this.b.d();
/*     */                 }
/* 279 */                 return new of("container.chestDouble");
/*     */               }
/*     */             });
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<aox> a(ccn ☃) {
/* 286 */         return Optional.of(☃);
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<aox> a() {
/* 291 */         return Optional.empty();
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aox b(ceh ☃, brx brx1, fx fx1) {
/* 298 */     return ((Optional<aox>)a(☃, brx1, fx1, false).<Optional<aox>>apply(k)).orElse(null);
/*     */   }
/*     */   
/*     */   public static bwc.b<ccn, Float2FloatFunction> a(cdc ☃) {
/* 302 */     return new bwc.b<ccn, Float2FloatFunction>(☃)
/*     */       {
/*     */         public Float2FloatFunction a(ccn ☃, ccn ccn1) {
/* 305 */           return f -> Math.max(☃.a(f), ccn1.a(f));
/*     */         }
/*     */ 
/*     */         
/*     */         public Float2FloatFunction a(ccn ☃) {
/* 310 */           return ☃::a;
/*     */         }
/*     */ 
/*     */         
/*     */         public Float2FloatFunction a() {
/* 315 */           return this.a::a;
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/* 322 */     return new ccn();
/*     */   }
/*     */   
/*     */   public static boolean a(bry ☃, fx fx1) {
/* 326 */     return (a(☃, fx1) || b(☃, fx1));
/*     */   }
/*     */   
/*     */   private static boolean a(brc ☃, fx fx1) {
/* 330 */     fx fx2 = fx1.b();
/* 331 */     return ☃.d_(fx2).g(☃, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean b(bry ☃, fx fx1) {
/* 336 */     List<bab> list = ☃.a(bab.class, new dci(fx1.u(), (fx1.v() + 1), fx1.w(), (fx1.u() + 1), (fx1.v() + 2), (fx1.w() + 1)));
/* 337 */     if (!list.isEmpty()) {
/* 338 */       for (bab bab : list) {
/* 339 */         if (bab.eM()) {
/* 340 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/* 344 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 349 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 354 */     return bic.b(a(this, ☃, brx1, fx1, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 359 */     return ☃.a(b, bzm1.a((gc)☃.c(b)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 364 */     return ☃.a(byg1.a((gc)☃.c(b)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 369 */     ☃.a((cfj<?>[])new cfj[] { b, c, d });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 374 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bve.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */