/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public abstract class cbz
/*     */   extends ccd
/*     */   implements ape, bjl, bju, cdm
/*     */ {
/*  48 */   private static final int[] g = new int[] { 0 };
/*     */ 
/*     */   
/*  51 */   private static final int[] h = new int[] { 2, 1 };
/*     */ 
/*     */   
/*  54 */   private static final int[] i = new int[] { 1 };
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
/*  66 */   protected gj<bmb> a = gj.a(3, bmb.b);
/*     */   private int j;
/*     */   private int k;
/*     */   private int l;
/*     */   private int m;
/*     */   
/*  72 */   protected final bil b = new bil(this)
/*     */     {
/*     */       public int a(int ☃) {
/*  75 */         switch (☃) {
/*     */           case 0:
/*  77 */             return cbz.a(this.a);
/*     */           case 1:
/*  79 */             return cbz.b(this.a);
/*     */           case 2:
/*  81 */             return cbz.c(this.a);
/*     */           case 3:
/*  83 */             return cbz.d(this.a);
/*     */         } 
/*     */ 
/*     */         
/*  87 */         return 0;
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(int ☃, int i) {
/*  92 */         switch (☃) {
/*     */           case 0:
/*  94 */             cbz.a(this.a, i);
/*     */             break;
/*     */           case 1:
/*  97 */             cbz.b(this.a, i);
/*     */             break;
/*     */           case 2:
/* 100 */             cbz.c(this.a, i);
/*     */             break;
/*     */           case 3:
/* 103 */             cbz.d(this.a, i);
/*     */             break;
/*     */         } 
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public int a() {
/* 112 */         return 4;
/*     */       }
/*     */     };
/*     */   
/* 116 */   private final Object2IntOpenHashMap<vk> n = new Object2IntOpenHashMap();
/*     */   protected final bot<? extends boc> c;
/*     */   
/*     */   protected cbz(cck<?> ☃, bot<? extends boc> bot1) {
/* 120 */     super(☃);
/* 121 */     this.c = bot1;
/*     */   }
/*     */   
/*     */   public static Map<blx, Integer> f() {
/* 125 */     Map<blx, Integer> ☃ = Maps.newLinkedHashMap();
/*     */     
/* 127 */     a(☃, bmd.lM, 20000);
/* 128 */     a(☃, bup.gS, 16000);
/* 129 */     a(☃, bmd.nr, 2400);
/* 130 */     a(☃, bmd.ke, 1600);
/* 131 */     a(☃, bmd.kf, 1600);
/* 132 */     a(☃, aeg.q, 300);
/* 133 */     a(☃, aeg.c, 300);
/* 134 */     a(☃, aeg.i, 300);
/* 135 */     a(☃, aeg.j, 150);
/* 136 */     a(☃, aeg.m, 300);
/* 137 */     a(☃, aeg.l, 300);
/* 138 */     a(☃, bup.cJ, 300);
/* 139 */     a(☃, bup.in, 300);
/* 140 */     a(☃, bup.im, 300);
/* 141 */     a(☃, bup.io, 300);
/* 142 */     a(☃, bup.iq, 300);
/* 143 */     a(☃, bup.ip, 300);
/* 144 */     a(☃, bup.dQ, 300);
/* 145 */     a(☃, bup.ii, 300);
/* 146 */     a(☃, bup.ih, 300);
/* 147 */     a(☃, bup.ij, 300);
/* 148 */     a(☃, bup.il, 300);
/* 149 */     a(☃, bup.ik, 300);
/* 150 */     a(☃, bup.aw, 300);
/* 151 */     a(☃, bup.bI, 300);
/* 152 */     a(☃, bup.lY, 300);
/* 153 */     a(☃, bup.cI, 300);
/* 154 */     a(☃, bup.bR, 300);
/* 155 */     a(☃, bup.fr, 300);
/* 156 */     a(☃, bup.bV, 300);
/* 157 */     a(☃, bup.fv, 300);
/* 158 */     a(☃, aeg.z, 300);
/* 159 */     a(☃, bmd.kc, 300);
/* 160 */     a(☃, bmd.mi, 300);
/* 161 */     a(☃, bup.cg, 300);
/* 162 */     a(☃, aeg.U, 200);
/* 163 */     a(☃, bmd.km, 200);
/* 164 */     a(☃, bmd.kl, 200);
/* 165 */     a(☃, bmd.kp, 200);
/* 166 */     a(☃, bmd.ko, 200);
/* 167 */     a(☃, bmd.kn, 200);
/* 168 */     a(☃, aeg.h, 200);
/* 169 */     a(☃, aeg.S, 1200);
/* 170 */     a(☃, aeg.b, 100);
/* 171 */     a(☃, aeg.e, 100);
/* 172 */     a(☃, bmd.kP, 100);
/* 173 */     a(☃, aeg.o, 100);
/* 174 */     a(☃, bmd.kQ, 100);
/* 175 */     a(☃, aeg.g, 67);
/* 176 */     a(☃, bup.ke, 4001);
/* 177 */     a(☃, bmd.qQ, 300);
/* 178 */     a(☃, bup.kY, 50);
/* 179 */     a(☃, bup.aT, 100);
/* 180 */     a(☃, bup.lQ, 400);
/* 181 */     a(☃, bup.lR, 300);
/* 182 */     a(☃, bup.lS, 300);
/* 183 */     a(☃, bup.lV, 300);
/* 184 */     a(☃, bup.lW, 300);
/* 185 */     a(☃, bup.lZ, 300);
/* 186 */     a(☃, bup.na, 300);
/*     */     
/* 188 */     return ☃;
/*     */   }
/*     */   
/*     */   private static boolean b(blx ☃) {
/* 192 */     return aeg.Q.a(☃);
/*     */   }
/*     */   
/*     */   private static void a(Map<blx, Integer> ☃, ael<blx> ael1, int i) {
/* 196 */     for (blx blx : ael1.b()) {
/* 197 */       if (!b(blx)) {
/* 198 */         ☃.put(blx, Integer.valueOf(i));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(Map<blx, Integer> ☃, brw brw1, int i) {
/* 204 */     blx blx = brw1.h();
/* 205 */     if (b(blx)) {
/* 206 */       if (w.d) {
/* 207 */         throw (IllegalStateException)x.c(new IllegalStateException("A developer tried to explicitly make fire resistant item " + blx.h(null).getString() + " a furnace fuel. That will not work!"));
/*     */       }
/*     */       return;
/*     */     } 
/* 211 */     ☃.put(blx, Integer.valueOf(i));
/*     */   }
/*     */   
/*     */   private boolean j() {
/* 215 */     return (this.j > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 220 */     super.a(☃, md1);
/*     */     
/* 222 */     this.a = gj.a(Z_(), bmb.b);
/* 223 */     aoo.b(md1, this.a);
/*     */     
/* 225 */     this.j = md1.g("BurnTime");
/* 226 */     this.l = md1.g("CookTime");
/* 227 */     this.m = md1.g("CookTimeTotal");
/* 228 */     this.k = a(this.a.get(1));
/*     */     
/* 230 */     md md2 = md1.p("RecipesUsed");
/* 231 */     for (String str : md2.d()) {
/* 232 */       this.n.put(new vk(str), md2.h(str));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/* 238 */     super.a(☃);
/* 239 */     ☃.a("BurnTime", (short)this.j);
/* 240 */     ☃.a("CookTime", (short)this.l);
/* 241 */     ☃.a("CookTimeTotal", (short)this.m);
/*     */     
/* 243 */     aoo.a(☃, this.a);
/*     */     
/* 245 */     md md1 = new md();
/* 246 */     this.n.forEach((vk1, integer) -> ☃.b(vk1.toString(), integer.intValue()));
/* 247 */     ☃.a("RecipesUsed", md1);
/*     */     
/* 249 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/* 254 */     boolean ☃ = j();
/* 255 */     boolean bool1 = false;
/*     */     
/* 257 */     if (j())
/*     */     {
/* 259 */       this.j--;
/*     */     }
/*     */     
/* 262 */     if (!this.d.v) {
/* 263 */       bmb bmb = this.a.get(1);
/* 264 */       if (j() || (!bmb.a() && !((bmb)this.a.get(0)).a())) {
/*     */ 
/*     */         
/* 267 */         boq<?> boq = this.d.o().<cbz, boq>a((bot)this.c, this, this.d).orElse(null);
/* 268 */         if (!j() && b(boq)) {
/*     */           
/* 270 */           this.j = a(bmb);
/* 271 */           this.k = this.j;
/*     */           
/* 273 */           if (j()) {
/* 274 */             bool1 = true;
/*     */             
/* 276 */             if (!bmb.a()) {
/* 277 */               blx blx = bmb.b();
/* 278 */               bmb.g(1);
/* 279 */               if (bmb.a()) {
/* 280 */                 blx blx1 = blx.o();
/* 281 */                 this.a.set(1, (blx1 == null) ? bmb.b : new bmb(blx1));
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 287 */         if (j() && b(boq)) {
/* 288 */           this.l++;
/*     */           
/* 290 */           if (this.l == this.m) {
/* 291 */             this.l = 0;
/* 292 */             this.m = h();
/* 293 */             c(boq);
/* 294 */             bool1 = true;
/*     */           } 
/*     */         } else {
/* 297 */           this.l = 0;
/*     */         } 
/* 299 */       } else if (!j() && this.l > 0) {
/* 300 */         this.l = afm.a(this.l - 2, 0, this.m);
/*     */       } 
/*     */       
/* 303 */       if (☃ != j()) {
/* 304 */         bool1 = true;
/* 305 */         this.d.a(this.e, this.d.d_(this.e).a(bto.b, Boolean.valueOf(j())), 3);
/*     */       } 
/*     */     } 
/*     */     
/* 309 */     if (bool1) {
/* 310 */       X_();
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean b(@Nullable boq<?> ☃) {
/* 315 */     if (((bmb)this.a.get(0)).a() || ☃ == null) {
/* 316 */       return false;
/*     */     }
/* 318 */     bmb bmb1 = ☃.c();
/* 319 */     if (bmb1.a()) {
/* 320 */       return false;
/*     */     }
/*     */     
/* 323 */     bmb bmb2 = this.a.get(2);
/* 324 */     if (bmb2.a()) {
/* 325 */       return true;
/*     */     }
/* 327 */     if (!bmb2.a(bmb1)) {
/* 328 */       return false;
/*     */     }
/* 330 */     if (bmb2.E() < V_() && bmb2.E() < bmb2.c()) {
/* 331 */       return true;
/*     */     }
/* 333 */     return (bmb2.E() < bmb1.c());
/*     */   }
/*     */   
/*     */   private void c(@Nullable boq<?> ☃) {
/* 337 */     if (☃ == null || !b(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 341 */     bmb bmb1 = this.a.get(0);
/* 342 */     bmb bmb2 = ☃.c();
/* 343 */     bmb bmb3 = this.a.get(2);
/* 344 */     if (bmb3.a()) {
/* 345 */       this.a.set(2, bmb2.i());
/* 346 */     } else if (bmb3.b() == bmb2.b()) {
/* 347 */       bmb3.f(1);
/*     */     } 
/*     */     
/* 350 */     if (!this.d.v) {
/* 351 */       a(☃);
/*     */     }
/*     */     
/* 354 */     if (bmb1.b() == bup.ao.h() && !((bmb)this.a.get(1)).a() && ((bmb)this.a.get(1)).b() == bmd.lK) {
/* 355 */       this.a.set(1, new bmb(bmd.lL));
/*     */     }
/*     */     
/* 358 */     bmb1.g(1);
/*     */   }
/*     */   
/*     */   protected int a(bmb ☃) {
/* 362 */     if (☃.a()) {
/* 363 */       return 0;
/*     */     }
/*     */     
/* 366 */     blx blx = ☃.b();
/* 367 */     return ((Integer)f().getOrDefault(blx, Integer.valueOf(0))).intValue();
/*     */   }
/*     */   
/*     */   protected int h() {
/* 371 */     return ((Integer)this.d.o().<cbz, boc>a(this.c, this, this.d).map(boc::e).orElse(Integer.valueOf(200))).intValue();
/*     */   }
/*     */   
/*     */   public static boolean b(bmb ☃) {
/* 375 */     return f().containsKey(☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(gc ☃) {
/* 380 */     if (☃ == gc.a)
/* 381 */       return h; 
/* 382 */     if (☃ == gc.b) {
/* 383 */       return g;
/*     */     }
/* 385 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, bmb bmb1, @Nullable gc gc1) {
/* 391 */     return b(☃, bmb1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, bmb bmb1, gc gc1) {
/* 396 */     if (gc1 == gc.a && ☃ == 1) {
/* 397 */       blx blx = bmb1.b();
/* 398 */       if (blx != bmd.lL && blx != bmd.lK) {
/* 399 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 403 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/* 408 */     return this.a.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 413 */     for (bmb ☃ : this.a) {
/* 414 */       if (!☃.a()) {
/* 415 */         return false;
/*     */       }
/*     */     } 
/* 418 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃) {
/* 423 */     return this.a.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃, int i) {
/* 428 */     return aoo.a(this.a, ☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(int ☃) {
/* 433 */     return aoo.a(this.a, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/* 438 */     bmb bmb2 = this.a.get(☃);
/* 439 */     boolean bool = (!bmb1.a() && bmb1.a(bmb2) && bmb.a(bmb1, bmb2));
/* 440 */     this.a.set(☃, bmb1);
/* 441 */     if (bmb1.E() > V_()) {
/* 442 */       bmb1.e(V_());
/*     */     }
/*     */     
/* 445 */     if (☃ == 0 && !bool) {
/* 446 */       this.m = h();
/* 447 */       this.l = 0;
/* 448 */       X_();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 454 */     if (this.d.c(this.e) != this) {
/* 455 */       return false;
/*     */     }
/* 457 */     return (☃.h(this.e.u() + 0.5D, this.e.v() + 0.5D, this.e.w() + 0.5D) <= 64.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, bmb bmb1) {
/* 462 */     if (☃ == 2) {
/* 463 */       return false;
/*     */     }
/* 465 */     if (☃ == 1) {
/* 466 */       bmb bmb2 = this.a.get(1);
/* 467 */       return (b(bmb1) || (bmb1.b() == bmd.lK && bmb2.b() != bmd.lK));
/*     */     } 
/* 469 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 474 */     this.a.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable boq<?> ☃) {
/* 479 */     if (☃ != null) {
/* 480 */       vk vk = ☃.f();
/* 481 */       this.n.addTo(vk, 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public boq<?> ak_() {
/* 488 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {}
/*     */ 
/*     */   
/*     */   public void d(bfw ☃) {
/* 497 */     List<boq<?>> list = a(☃.l, ☃.cA());
/* 498 */     ☃.a(list);
/* 499 */     this.n.clear();
/*     */   }
/*     */   
/*     */   public List<boq<?>> a(brx ☃, dcn dcn1) {
/* 503 */     List<boq<?>> list = Lists.newArrayList();
/* 504 */     for (ObjectIterator<Object2IntMap.Entry<vk>> objectIterator = this.n.object2IntEntrySet().iterator(); objectIterator.hasNext(); ) { Object2IntMap.Entry<vk> entry = objectIterator.next();
/* 505 */       ☃.o().a((vk)entry.getKey()).ifPresent(boq1 -> {
/*     */             ☃.add(boq1);
/*     */             a(brx1, dcn1, entry.getIntValue(), ((boc)boq1).b());
/*     */           }); }
/*     */     
/* 510 */     return list;
/*     */   }
/*     */   
/*     */   private static void a(brx ☃, dcn dcn1, int i, float f) {
/* 514 */     int j = afm.d(i * f);
/* 515 */     float f1 = afm.h(i * f);
/* 516 */     if (f1 != 0.0F && Math.random() < f1) {
/* 517 */       j++;
/*     */     }
/*     */     
/* 520 */     while (j > 0) {
/* 521 */       int k = aqg.a(j);
/* 522 */       j -= k;
/* 523 */       ☃.c(new aqg(☃, dcn1.b, dcn1.c, dcn1.d, k));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bfy ☃) {
/* 529 */     for (bmb bmb : this.a)
/* 530 */       ☃.b(bmb); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */