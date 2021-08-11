/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
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
/*     */ public class bkt
/*     */   extends bmo
/*     */   implements bno
/*     */ {
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   
/*     */   public bkt(blx.a ☃) {
/*  57 */     super(☃);
/*  58 */     this.c = false;
/*  59 */     this.d = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Predicate<bmb> e() {
/*  64 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public Predicate<bmb> b() {
/*  69 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/*  74 */     bmb bmb = bfw1.b(aot1);
/*     */     
/*  76 */     if (d(bmb)) {
/*  77 */       a(☃, bfw1, aot1, bmb, m(bmb), 1.0F);
/*  78 */       a(bmb, false);
/*  79 */       return aov.b(bmb);
/*     */     } 
/*     */     
/*  82 */     if (!bfw1.f(bmb).a()) {
/*  83 */       if (!d(bmb)) {
/*  84 */         this.c = false;
/*  85 */         this.d = false;
/*  86 */         bfw1.c(aot1);
/*     */       } 
/*  88 */       return aov.b(bmb);
/*     */     } 
/*  90 */     return aov.d(bmb);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, brx brx1, aqm aqm1, int i) {
/*  95 */     int j = e_(☃) - i;
/*  96 */     float f = a(j, ☃);
/*     */     
/*  98 */     if (f >= 1.0F && !d(☃) && 
/*  99 */       a(aqm1, ☃)) {
/* 100 */       a(☃, true);
/* 101 */       adr adr = (aqm1 instanceof bfw) ? adr.h : adr.f;
/* 102 */       brx1.a((bfw)null, aqm1.cD(), aqm1.cE(), aqm1.cH(), adq.ct, adr, 1.0F, 1.0F / (h.nextFloat() * 0.5F + 1.0F) + 0.2F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean a(aqm ☃, bmb bmb1) {
/* 108 */     int i = bpu.a(bpw.H, bmb1);
/* 109 */     int j = (i == 0) ? 1 : 3;
/* 110 */     boolean bool = (☃ instanceof bfw && ((bfw)☃).bC.d);
/*     */     
/* 112 */     bmb bmb2 = ☃.f(bmb1);
/* 113 */     bmb bmb3 = bmb2.i();
/* 114 */     for (int k = 0; k < j; k++) {
/* 115 */       if (k > 0) {
/* 116 */         bmb2 = bmb3.i();
/*     */       }
/*     */       
/* 119 */       if (bmb2.a() && bool) {
/* 120 */         bmb2 = new bmb(bmd.kd);
/* 121 */         bmb3 = bmb2.i();
/*     */       } 
/*     */       
/* 124 */       if (!a(☃, bmb1, bmb2, (k > 0), bool)) {
/* 125 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 129 */     return true;
/*     */   }
/*     */   private static boolean a(aqm ☃, bmb bmb1, bmb bmb2, boolean bool1, boolean bool2) {
/*     */     bmb bmb3;
/* 133 */     if (bmb2.a()) {
/* 134 */       return false;
/*     */     }
/* 136 */     boolean bool = (bool2 && bmb2.b() instanceof bkc);
/*     */ 
/*     */     
/* 139 */     if (!bool && !bool2 && !bool1) {
/* 140 */       bmb3 = bmb2.a(1);
/* 141 */       if (bmb2.a() && ☃ instanceof bfw)
/*     */       {
/* 143 */         ((bfw)☃).bm.f(bmb2);
/*     */       }
/*     */     } else {
/* 146 */       bmb3 = bmb2.i();
/*     */     } 
/*     */     
/* 149 */     b(bmb1, bmb3);
/* 150 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean d(bmb ☃) {
/* 154 */     md md = ☃.o();
/* 155 */     return (md != null && md.q("Charged"));
/*     */   }
/*     */   
/*     */   public static void a(bmb ☃, boolean bool) {
/* 159 */     md md = ☃.p();
/* 160 */     md.a("Charged", bool);
/*     */   }
/*     */   private static void b(bmb ☃, bmb bmb1) {
/*     */     mj mj;
/* 164 */     md md1 = ☃.p();
/*     */     
/* 166 */     if (md1.c("ChargedProjectiles", 9)) {
/* 167 */       mj = md1.d("ChargedProjectiles", 10);
/*     */     } else {
/* 169 */       mj = new mj();
/*     */     } 
/* 171 */     md md2 = new md();
/* 172 */     bmb1.b(md2);
/* 173 */     mj.add(md2);
/* 174 */     md1.a("ChargedProjectiles", mj);
/*     */   }
/*     */   
/*     */   private static List<bmb> k(bmb ☃) {
/* 178 */     List<bmb> list = Lists.newArrayList();
/* 179 */     md md = ☃.o();
/* 180 */     if (md != null && 
/* 181 */       md.c("ChargedProjectiles", 9)) {
/* 182 */       mj mj = md.d("ChargedProjectiles", 10);
/* 183 */       if (mj != null) {
/* 184 */         for (int i = 0; i < mj.size(); i++) {
/* 185 */           md md1 = mj.a(i);
/* 186 */           list.add(bmb.a(md1));
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 191 */     return list;
/*     */   }
/*     */   
/*     */   private static void l(bmb ☃) {
/* 195 */     md md = ☃.o();
/* 196 */     if (md != null) {
/* 197 */       mj mj = md.d("ChargedProjectiles", 9);
/* 198 */       mj.clear();
/* 199 */       md.a("ChargedProjectiles", mj);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean a(bmb ☃, blx blx1) {
/* 204 */     return k(☃).stream().anyMatch(bmb1 -> (bmb1.b() == ☃));
/*     */   }
/*     */   private static void a(brx ☃, aqm aqm1, aot aot1, bmb bmb1, bmb bmb2, float f1, boolean bool, float f2, float f3, float f4) {
/*     */     bgm bgm;
/* 208 */     if (☃.v) {
/*     */       return;
/*     */     }
/*     */     
/* 212 */     boolean bool1 = (bmb2.b() == bmd.po);
/*     */ 
/*     */     
/* 215 */     if (bool1) {
/* 216 */       bgm = new bgh(☃, bmb2, aqm1, aqm1.cD(), aqm1.cG() - 0.15000000596046448D, aqm1.cH(), true);
/*     */     } else {
/* 218 */       bgm = a(☃, aqm1, bmb1, bmb2);
/* 219 */       if (bool || f4 != 0.0F) {
/* 220 */         ((bga)bgm).d = bga.a.c;
/*     */       }
/*     */     } 
/*     */     
/* 224 */     if (aqm1 instanceof bdd) {
/* 225 */       bdd bdd = (bdd)aqm1;
/* 226 */       bdd.a(bdd.A(), bmb1, bgm, f4);
/*     */     } else {
/* 228 */       dcn dcn1 = aqm1.i(1.0F);
/* 229 */       d d = new d(new g(dcn1), f4, true);
/* 230 */       dcn dcn2 = aqm1.f(1.0F);
/* 231 */       g g = new g(dcn2);
/* 232 */       g.a(d);
/* 233 */       bgm.c(g.a(), g.b(), g.c(), f2, f3);
/*     */     } 
/*     */     
/* 236 */     bmb1.a(bool1 ? 3 : 1, aqm1, aqm1 -> aqm1.d(☃));
/* 237 */     ☃.c(bgm);
/* 238 */     ☃.a((bfw)null, aqm1.cD(), aqm1.cE(), aqm1.cH(), adq.cz, adr.h, 1.0F, f1);
/*     */   }
/*     */   
/*     */   private static bga a(brx ☃, aqm aqm1, bmb bmb1, bmb bmb2) {
/* 242 */     bkc bkc = (bmb2.b() instanceof bkc) ? (bkc)bmb2.b() : (bkc)bmd.kd;
/* 243 */     bga bga = bkc.a(☃, bmb2, aqm1);
/* 244 */     if (aqm1 instanceof bfw) {
/* 245 */       bga.a(true);
/*     */     }
/* 247 */     bga.a(adq.cs);
/* 248 */     bga.p(true);
/*     */     
/* 250 */     int i = bpu.a(bpw.J, bmb1);
/* 251 */     if (i > 0) {
/* 252 */       bga.b((byte)i);
/*     */     }
/*     */     
/* 255 */     return bga;
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, aqm aqm1, aot aot1, bmb bmb1, float f1, float f2) {
/* 259 */     List<bmb> list = k(bmb1);
/* 260 */     float[] arrayOfFloat = a(aqm1.cY());
/*     */     
/* 262 */     for (int i = 0; i < list.size(); i++) {
/* 263 */       bmb bmb2 = list.get(i);
/* 264 */       boolean bool = (aqm1 instanceof bfw && ((bfw)aqm1).bC.d);
/*     */       
/* 266 */       if (!bmb2.a())
/*     */       {
/*     */ 
/*     */         
/* 270 */         if (i == 0) {
/* 271 */           a(☃, aqm1, aot1, bmb1, bmb2, arrayOfFloat[i], bool, f1, f2, 0.0F);
/* 272 */         } else if (i == 1) {
/* 273 */           a(☃, aqm1, aot1, bmb1, bmb2, arrayOfFloat[i], bool, f1, f2, -10.0F);
/* 274 */         } else if (i == 2) {
/* 275 */           a(☃, aqm1, aot1, bmb1, bmb2, arrayOfFloat[i], bool, f1, f2, 10.0F);
/*     */         } 
/*     */       }
/*     */     } 
/* 279 */     a(☃, aqm1, bmb1);
/*     */   }
/*     */   
/*     */   private static float[] a(Random ☃) {
/* 283 */     boolean bool = ☃.nextBoolean();
/* 284 */     return new float[] { 1.0F, a(bool), a(!bool) };
/*     */   }
/*     */   
/*     */   private static float a(boolean ☃) {
/* 288 */     float f = ☃ ? 0.63F : 0.43F;
/* 289 */     return 1.0F / (h.nextFloat() * 0.5F + 1.8F) + f;
/*     */   }
/*     */   
/*     */   private static void a(brx ☃, aqm aqm1, bmb bmb1) {
/* 293 */     if (aqm1 instanceof aah) {
/* 294 */       aah aah = (aah)aqm1;
/* 295 */       if (!☃.v) {
/* 296 */         ac.F.a(aah, bmb1);
/*     */       }
/*     */       
/* 299 */       aah.b(aea.c.b(bmb1.b()));
/*     */     } 
/*     */     
/* 302 */     l(bmb1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, aqm aqm1, bmb bmb1, int i) {
/* 307 */     if (!☃.v) {
/* 308 */       int j = bpu.a(bpw.I, bmb1);
/* 309 */       adp adp1 = a(j);
/* 310 */       adp adp2 = (j == 0) ? adq.cu : null;
/* 311 */       float f = (bmb1.k() - i) / g(bmb1);
/*     */       
/* 313 */       if (f < 0.2F) {
/* 314 */         this.c = false;
/* 315 */         this.d = false;
/*     */       } 
/*     */       
/* 318 */       if (f >= 0.2F && !this.c) {
/* 319 */         this.c = true;
/* 320 */         ☃.a((bfw)null, aqm1.cD(), aqm1.cE(), aqm1.cH(), adp1, adr.h, 0.5F, 1.0F);
/*     */       } 
/*     */       
/* 323 */       if (f >= 0.5F && adp2 != null && !this.d) {
/* 324 */         this.d = true;
/* 325 */         ☃.a((bfw)null, aqm1.cD(), aqm1.cE(), aqm1.cH(), adp2, adr.h, 0.5F, 1.0F);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int e_(bmb ☃) {
/* 332 */     return g(☃) + 3;
/*     */   }
/*     */   
/*     */   public static int g(bmb ☃) {
/* 336 */     int i = bpu.a(bpw.I, ☃);
/* 337 */     return (i == 0) ? 25 : (25 - 5 * i);
/*     */   }
/*     */ 
/*     */   
/*     */   public bnn d_(bmb ☃) {
/* 342 */     return bnn.g;
/*     */   }
/*     */   
/*     */   private adp a(int ☃) {
/* 346 */     switch (☃) {
/*     */       case 1:
/* 348 */         return adq.cw;
/*     */       case 2:
/* 350 */         return adq.cx;
/*     */       case 3:
/* 352 */         return adq.cy;
/*     */     } 
/* 354 */     return adq.cv;
/*     */   }
/*     */ 
/*     */   
/*     */   private static float a(int ☃, bmb bmb1) {
/* 359 */     float f = ☃ / g(bmb1);
/* 360 */     if (f > 1.0F) {
/* 361 */       f = 1.0F;
/*     */     }
/* 363 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 368 */     List<bmb> list1 = k(☃);
/* 369 */     if (!d(☃) || list1.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 373 */     bmb bmb1 = list1.get(0);
/* 374 */     list.add((new of("item.minecraft.crossbow.projectile")).c(" ").a(bmb1.C()));
/* 375 */     if (bnl1.a() && bmb1.b() == bmd.po) {
/* 376 */       List<nr> list2 = Lists.newArrayList();
/* 377 */       bmd.po.a(bmb1, brx1, list2, bnl1);
/* 378 */       if (!list2.isEmpty()) {
/* 379 */         for (int i = 0; i < list2.size(); i++) {
/* 380 */           list2.set(i, (new oe("  ")).a(list2.get(i)).a(k.h));
/*     */         }
/*     */         
/* 383 */         list.addAll(list2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static float m(bmb ☃) {
/* 389 */     if (☃.b() == bmd.qQ && a(☃, bmd.po)) {
/* 390 */       return 1.6F;
/*     */     }
/* 392 */     return 3.15F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 397 */     return 8;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */