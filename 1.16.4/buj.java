/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.ArrayUtils;
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
/*     */ public class buj
/*     */   extends bxm
/*     */   implements bwm
/*     */ {
/*  47 */   public static final cfe<cev> a = cex.aE;
/*  48 */   public static final cey b = cex.t;
/*     */ 
/*     */   
/*  51 */   protected static final ddh c = buo.a(0.0D, 3.0D, 0.0D, 16.0D, 9.0D, 16.0D);
/*     */ 
/*     */ 
/*     */   
/*  55 */   protected static final ddh d = buo.a(0.0D, 0.0D, 0.0D, 3.0D, 3.0D, 3.0D);
/*  56 */   protected static final ddh e = buo.a(0.0D, 0.0D, 13.0D, 3.0D, 3.0D, 16.0D);
/*  57 */   protected static final ddh f = buo.a(13.0D, 0.0D, 0.0D, 16.0D, 3.0D, 3.0D);
/*  58 */   protected static final ddh g = buo.a(13.0D, 0.0D, 13.0D, 16.0D, 3.0D, 16.0D);
/*     */   
/*  60 */   protected static final ddh h = dde.a(c, new ddh[] { d, f });
/*  61 */   protected static final ddh i = dde.a(c, new ddh[] { e, g });
/*  62 */   protected static final ddh j = dde.a(c, new ddh[] { d, e });
/*  63 */   protected static final ddh k = dde.a(c, new ddh[] { f, g });
/*     */   
/*     */   private final bkx o;
/*     */   
/*     */   public buj(bkx ☃, ceg.c c1) {
/*  68 */     super(c1);
/*  69 */     this.o = ☃;
/*  70 */     j(((ceh)this.n.b()).a(a, cev.b).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static gc a(brc ☃, fx fx1) {
/*  75 */     ceh ceh = ☃.d_(fx1);
/*  76 */     return (ceh.b() instanceof buj) ? (gc)ceh.c(aq) : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  81 */     if (brx1.v) {
/*  82 */       return aou.b;
/*     */     }
/*     */     
/*  85 */     if (☃.c(a) != cev.a) {
/*     */       
/*  87 */       fx1 = fx1.a((gc)☃.c(aq));
/*  88 */       ☃ = brx1.d_(fx1);
/*  89 */       if (!☃.a(this)) {
/*  90 */         return aou.b;
/*     */       }
/*     */     } 
/*     */     
/*  94 */     if (!a(brx1)) {
/*     */       
/*  96 */       brx1.a(fx1, false);
/*     */ 
/*     */       
/*  99 */       fx fx2 = fx1.a(((gc)☃.c(aq)).f());
/* 100 */       if (brx1.d_(fx2).a(this)) {
/* 101 */         brx1.a(fx2, false);
/*     */       }
/*     */       
/* 104 */       brx1.a((aqa)null, apk.a(), (brq)null, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, 5.0F, true, brp.a.c);
/* 105 */       return aou.a;
/*     */     } 
/*     */     
/* 108 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 109 */       if (!a(brx1, fx1)) {
/* 110 */         bfw1.a(new of("block.minecraft.bed.occupied"), true);
/*     */       }
/* 112 */       return aou.a;
/*     */     } 
/*     */     
/* 115 */     bfw1.a(fx1)
/* 116 */       .ifLeft(a1 -> {
/*     */           if (a1 != null) {
/*     */             ☃.a(a1.a(), true);
/*     */           }
/*     */         });
/* 121 */     return aou.a;
/*     */   }
/*     */   
/*     */   public static boolean a(brx ☃) {
/* 125 */     return ☃.k().h();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean a(brx ☃, fx fx1) {
/* 132 */     List<bfj> list = ☃.a(bfj.class, new dci(fx1), aqm::em);
/* 133 */     if (list.isEmpty()) {
/* 134 */       return false;
/*     */     }
/* 136 */     ((bfj)list.get(0)).en();
/* 137 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, aqa aqa1, float f) {
/* 142 */     super.a(☃, fx1, aqa1, f * 0.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brc ☃, aqa aqa1) {
/* 147 */     if (aqa1.bw()) {
/* 148 */       super.a(☃, aqa1);
/*     */     } else {
/* 150 */       a(aqa1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(aqa ☃) {
/* 155 */     dcn dcn = ☃.cC();
/* 156 */     if (dcn.c < 0.0D) {
/*     */       
/* 158 */       double d = (☃ instanceof aqm) ? 1.0D : 0.8D;
/* 159 */       ☃.n(dcn.b, -dcn.c * 0.6600000262260437D * d, dcn.d);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 169 */     if (gc1 == a((cev)☃.c(a), (gc)☃.c(aq))) {
/* 170 */       if (ceh1.a(this) && ceh1.c(a) != ☃.c(a)) {
/* 171 */         return ☃.a(b, ceh1.c(b));
/*     */       }
/* 173 */       return bup.a.n();
/*     */     } 
/*     */ 
/*     */     
/* 177 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */   
/*     */   private static gc a(cev ☃, gc gc1) {
/* 181 */     return (☃ == cev.b) ? gc1 : gc1.f();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, bfw bfw1) {
/* 186 */     if (!☃.v && bfw1.b_()) {
/* 187 */       cev cev = (cev)ceh1.c(a);
/* 188 */       if (cev == cev.b) {
/* 189 */         fx fx2 = fx1.a(a(cev, (gc)ceh1.c(aq)));
/* 190 */         ceh ceh2 = ☃.d_(fx2);
/* 191 */         if (ceh2.b() == this && ceh2.c(a) == cev.a) {
/*     */           
/* 193 */           ☃.a(fx2, bup.a.n(), 35);
/* 194 */           ☃.a(bfw1, 2001, fx2, buo.i(ceh2));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 199 */     super.a(☃, fx1, ceh1, bfw1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/* 205 */     gc gc = ☃.f();
/*     */     
/* 207 */     fx fx1 = ☃.a();
/* 208 */     fx fx2 = fx1.a(gc);
/* 209 */     if (☃.p().d_(fx2).a(☃)) {
/* 210 */       return n().a(aq, gc);
/*     */     }
/*     */     
/* 213 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 218 */     gc gc = g(☃).f();
/* 219 */     switch (null.a[gc.ordinal()]) {
/*     */       case 1:
/* 221 */         return h;
/*     */       case 2:
/* 223 */         return i;
/*     */       case 3:
/* 225 */         return j;
/*     */     } 
/* 227 */     return k;
/*     */   }
/*     */ 
/*     */   
/*     */   public static gc g(ceh ☃) {
/* 232 */     gc gc = (gc)☃.c(aq);
/* 233 */     return (☃.c(a) == cev.a) ? gc.f() : gc;
/*     */   }
/*     */   
/*     */   public static bwc.a h(ceh ☃) {
/* 237 */     cev cev = (cev)☃.c(a);
/* 238 */     if (cev == cev.a) {
/* 239 */       return bwc.a.b;
/*     */     }
/* 241 */     return bwc.a.c;
/*     */   }
/*     */   
/*     */   private static boolean b(brc ☃, fx fx1) {
/* 245 */     return ☃.d_(fx1.c()).b() instanceof buj;
/*     */   }
/*     */   
/*     */   public static Optional<dcn> a(aqe<?> ☃, brg brg1, fx fx1, float f) {
/* 249 */     gc gc1 = (gc)brg1.d_(fx1).c(aq);
/* 250 */     gc gc2 = gc1.g();
/* 251 */     gc gc3 = gc2.a(f) ? gc2.f() : gc2;
/*     */     
/* 253 */     if (b(brg1, fx1)) {
/* 254 */       return a(☃, brg1, fx1, gc1, gc3);
/*     */     }
/*     */     
/* 257 */     int[][] arrayOfInt = a(gc1, gc3);
/*     */     
/* 259 */     Optional<dcn> optional = a(☃, brg1, fx1, arrayOfInt, true);
/* 260 */     if (optional.isPresent()) {
/* 261 */       return optional;
/*     */     }
/* 263 */     return a(☃, brg1, fx1, arrayOfInt, false);
/*     */   }
/*     */   
/*     */   private static Optional<dcn> a(aqe<?> ☃, brg brg1, fx fx1, gc gc1, gc gc2) {
/* 267 */     int[][] arrayOfInt1 = b(gc1, gc2);
/*     */     
/* 269 */     Optional<dcn> optional1 = a(☃, brg1, fx1, arrayOfInt1, true);
/* 270 */     if (optional1.isPresent()) {
/* 271 */       return optional1;
/*     */     }
/*     */     
/* 274 */     fx fx2 = fx1.c();
/*     */     
/* 276 */     Optional<dcn> optional2 = a(☃, brg1, fx2, arrayOfInt1, true);
/* 277 */     if (optional2.isPresent()) {
/* 278 */       return optional2;
/*     */     }
/*     */     
/* 281 */     int[][] arrayOfInt2 = a(gc1);
/*     */     
/* 283 */     Optional<dcn> optional3 = a(☃, brg1, fx1, arrayOfInt2, true);
/* 284 */     if (optional3.isPresent()) {
/* 285 */       return optional3;
/*     */     }
/*     */     
/* 288 */     Optional<dcn> optional4 = a(☃, brg1, fx1, arrayOfInt1, false);
/* 289 */     if (optional4.isPresent()) {
/* 290 */       return optional4;
/*     */     }
/*     */     
/* 293 */     Optional<dcn> optional5 = a(☃, brg1, fx2, arrayOfInt1, false);
/* 294 */     if (optional5.isPresent()) {
/* 295 */       return optional5;
/*     */     }
/*     */     
/* 298 */     return a(☃, brg1, fx1, arrayOfInt2, false);
/*     */   }
/*     */   
/*     */   private static Optional<dcn> a(aqe<?> ☃, brg brg1, fx fx1, int[][] arrayOfInt, boolean bool) {
/* 302 */     fx.a a = new fx.a();
/* 303 */     for (int[] arrayOfInt1 : arrayOfInt) {
/* 304 */       a.d(fx1.u() + arrayOfInt1[0], fx1.v(), fx1.w() + arrayOfInt1[1]);
/*     */       
/* 306 */       dcn dcn = bho.a(☃, brg1, a, bool);
/* 307 */       if (dcn != null) {
/* 308 */         return Optional.of(dcn);
/*     */       }
/*     */     } 
/* 311 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public cvc f(ceh ☃) {
/* 316 */     return cvc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/* 321 */     return bzh.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 326 */     ☃.a((cfj<?>[])new cfj[] { aq, a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/* 331 */     return new ccf(this.o);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, @Nullable aqm aqm1, bmb bmb1) {
/* 336 */     super.a(☃, fx1, ceh1, aqm1, bmb1);
/*     */ 
/*     */     
/* 339 */     if (!☃.v) {
/* 340 */       fx fx2 = fx1.a((gc)ceh1.c(aq));
/* 341 */       ☃.a(fx2, ceh1.a(a, cev.a), 3);
/*     */       
/* 343 */       ☃.a(fx1, bup.a);
/* 344 */       ceh1.a(☃, fx1, 3);
/*     */     } 
/*     */   }
/*     */   
/*     */   public bkx c() {
/* 349 */     return this.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public long a(ceh ☃, fx fx1) {
/* 354 */     fx fx2 = fx1.a((gc)☃.c(aq), (☃.c(a) == cev.a) ? 0 : 1);
/* 355 */     return afm.c(fx2.u(), fx1.v(), fx2.w());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 360 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int[][] a(gc ☃, gc gc1) {
/* 367 */     return (int[][])ArrayUtils.addAll((Object[])b(☃, gc1), (Object[])a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int[][] b(gc ☃, gc gc1) {
/* 375 */     return new int[][] { { gc1
/* 376 */           .i(), gc1.k() }, { gc1
/* 377 */           .i() - ☃.i(), gc1.k() - ☃.k() }, { gc1
/* 378 */           .i() - ☃.i() * 2, gc1.k() - ☃.k() * 2
/* 379 */         }, { -☃.i() * 2, -☃.k() * 2
/* 380 */         }, { -gc1.i() - ☃.i() * 2, -gc1.k() - ☃.k() * 2
/* 381 */         }, { -gc1.i() - ☃.i(), -gc1.k() - ☃.k()
/* 382 */         }, { -gc1.i(), -gc1.k()
/* 383 */         }, { -gc1.i() + ☃.i(), -gc1.k() + ☃.k() }, { ☃
/* 384 */           .i(), ☃.k() }, { gc1
/* 385 */           .i() + ☃.i(), gc1.k() + ☃.k() } };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int[][] a(gc ☃) {
/* 391 */     return new int[][] { { 0, 0
/*     */         },
/* 393 */         { -☃.i(), -☃.k() } };
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\buj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */