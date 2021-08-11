/*     */ import java.util.List;
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
/*     */ public class ced
/*     */   extends ccj
/*     */   implements cdm
/*     */ {
/*     */   private ceh a;
/*     */   private gc b;
/*     */   private boolean c;
/*     */   private boolean g;
/*  38 */   private static final ThreadLocal<gc> h = ThreadLocal.withInitial(() -> null);
/*     */   
/*     */   private float i;
/*     */   
/*     */   private float j;
/*     */   private long k;
/*     */   private int l;
/*     */   
/*     */   public ced() {
/*  47 */     super(cck.j);
/*     */   }
/*     */   
/*     */   public ced(ceh ☃, gc gc1, boolean bool1, boolean bool2) {
/*  51 */     this();
/*  52 */     this.a = ☃;
/*  53 */     this.b = gc1;
/*  54 */     this.c = bool1;
/*  55 */     this.g = bool2;
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/*  60 */     return a(new md());
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  64 */     return this.c;
/*     */   }
/*     */   
/*     */   public gc f() {
/*  68 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  72 */     return this.g;
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/*  76 */     if (☃ > 1.0F) {
/*  77 */       ☃ = 1.0F;
/*     */     }
/*  79 */     return afm.g(☃, this.j, this.i);
/*     */   }
/*     */   
/*     */   public float b(float ☃) {
/*  83 */     return this.b.i() * e(a(☃));
/*     */   }
/*     */   
/*     */   public float c(float ☃) {
/*  87 */     return this.b.j() * e(a(☃));
/*     */   }
/*     */   
/*     */   public float d(float ☃) {
/*  91 */     return this.b.k() * e(a(☃));
/*     */   }
/*     */   
/*     */   private float e(float ☃) {
/*  95 */     return this.c ? (☃ - 1.0F) : (1.0F - ☃);
/*     */   }
/*     */   
/*     */   private ceh x() {
/*  99 */     if (!d() && h() && this.a.b() instanceof cea) {
/* 100 */       return bup.aX.n()
/* 101 */         .a(ceb.c, Boolean.valueOf((this.i > 0.25F)))
/* 102 */         .a(ceb.b, this.a.a(bup.aP) ? cfi.b : cfi.a)
/* 103 */         .a(ceb.a, this.a.c(cea.a));
/*     */     }
/* 105 */     return this.a;
/*     */   }
/*     */   
/*     */   private void f(float ☃) {
/* 109 */     gc gc1 = j();
/*     */     
/* 111 */     double d = (☃ - this.i);
/*     */     
/* 113 */     ddh ddh = x().k(this.d, o());
/* 114 */     if (ddh.b()) {
/*     */       return;
/*     */     }
/*     */     
/* 118 */     dci dci = a(ddh.a());
/* 119 */     List<aqa> list = this.d.a((aqa)null, cec.a(dci, gc1, d).b(dci));
/* 120 */     if (list.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 124 */     List<dci> list1 = ddh.d();
/* 125 */     boolean bool = this.a.a(bup.gn);
/* 126 */     for (aqa aqa : list) {
/* 127 */       if (aqa.y_() == cvc.d) {
/*     */         continue;
/*     */       }
/*     */       
/* 131 */       if (bool) {
/* 132 */         if (aqa instanceof aah) {
/*     */           continue;
/*     */         }
/*     */         
/* 136 */         dcn dcn = aqa.cC();
/* 137 */         double d2 = dcn.b;
/* 138 */         double d3 = dcn.c;
/* 139 */         double d4 = dcn.d;
/* 140 */         switch (null.a[gc1.n().ordinal()]) {
/*     */           case 1:
/* 142 */             d2 = gc1.i();
/*     */             break;
/*     */           case 2:
/* 145 */             d3 = gc1.j();
/*     */             break;
/*     */           case 3:
/* 148 */             d4 = gc1.k();
/*     */             break;
/*     */         } 
/*     */         
/* 152 */         aqa.n(d2, d3, d4);
/*     */       } 
/*     */       
/* 155 */       double d1 = 0.0D;
/* 156 */       for (dci dci1 : list1) {
/*     */ 
/*     */         
/* 159 */         dci dci2 = cec.a(a(dci1), gc1, d);
/*     */         
/* 161 */         dci dci3 = aqa.cc();
/* 162 */         if (!dci2.c(dci3)) {
/*     */           continue;
/*     */         }
/*     */         
/* 166 */         d1 = Math.max(d1, a(dci2, gc1, dci3));
/*     */ 
/*     */         
/* 169 */         if (d1 >= d) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */       
/* 174 */       if (d1 <= 0.0D) {
/*     */         continue;
/*     */       }
/*     */       
/* 178 */       d1 = Math.min(d1, d) + 0.01D;
/* 179 */       a(gc1, aqa, d1, gc1);
/*     */       
/* 181 */       if (!this.c && this.g) {
/* 182 */         a(aqa, gc1, d);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void a(gc ☃, aqa aqa1, double d, gc gc1) {
/* 189 */     h.set(☃);
/* 190 */     aqa1.a(aqr.c, new dcn(d * gc1.i(), d * gc1.j(), d * gc1.k()));
/* 191 */     h.set(null);
/*     */   }
/*     */   
/*     */   private void g(float ☃) {
/* 195 */     if (!y()) {
/*     */       return;
/*     */     }
/*     */     
/* 199 */     gc gc1 = j();
/* 200 */     if (!gc1.n().d()) {
/*     */       return;
/*     */     }
/*     */     
/* 204 */     double d1 = this.a.k(this.d, this.e).c(gc.a.b);
/* 205 */     dci dci = a(new dci(0.0D, d1, 0.0D, 1.0D, 1.5000000999999998D, 1.0D));
/*     */     
/* 207 */     double d2 = (☃ - this.i);
/*     */     
/* 209 */     List<aqa> list = this.d.a((aqa)null, dci, aqa1 -> a(☃, aqa1));
/* 210 */     for (aqa aqa : list) {
/* 211 */       a(gc1, aqa, d2, gc1);
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean a(dci ☃, aqa aqa1) {
/* 216 */     return (aqa1.y_() == cvc.a && aqa1
/* 217 */       .ao() && aqa1
/* 218 */       .cD() >= ☃.a && aqa1
/* 219 */       .cD() <= ☃.d && aqa1
/* 220 */       .cH() >= ☃.c && aqa1
/* 221 */       .cH() <= ☃.f);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean y() {
/* 226 */     return this.a.a(bup.ne);
/*     */   }
/*     */   
/*     */   public gc j() {
/* 230 */     return this.c ? this.b : this.b.f();
/*     */   }
/*     */   
/*     */   private static double a(dci ☃, gc gc1, dci dci1) {
/* 234 */     switch (null.b[gc1.ordinal()])
/*     */     { case 1:
/* 236 */         return ☃.d - dci1.a;
/*     */       case 2:
/* 238 */         return dci1.d - ☃.a;
/*     */       
/*     */       default:
/* 241 */         return ☃.e - dci1.b;
/*     */       case 4:
/* 243 */         return dci1.e - ☃.b;
/*     */       case 5:
/* 245 */         return ☃.f - dci1.c;
/*     */       case 6:
/* 247 */         break; }  return dci1.f - ☃.c;
/*     */   }
/*     */ 
/*     */   
/*     */   private dci a(dci ☃) {
/* 252 */     double d = e(this.i);
/* 253 */     return ☃.d(this.e
/* 254 */         .u() + d * this.b.i(), this.e
/* 255 */         .v() + d * this.b.j(), this.e
/* 256 */         .w() + d * this.b.k());
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(aqa ☃, gc gc1, double d) {
/* 261 */     dci dci1 = ☃.cc();
/* 262 */     dci dci2 = dde.b().a().a(this.e);
/* 263 */     if (dci1.c(dci2)) {
/* 264 */       gc gc2 = gc1.f();
/*     */ 
/*     */       
/* 267 */       double d1 = a(dci2, gc2, dci1) + 0.01D;
/* 268 */       double d2 = a(dci2, gc2, dci1.a(dci2)) + 0.01D;
/*     */       
/* 270 */       if (Math.abs(d1 - d2) < 0.01D) {
/* 271 */         d1 = Math.min(d1, d) + 0.01D;
/* 272 */         a(gc1, ☃, d1, gc2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public ceh k() {
/* 278 */     return this.a;
/*     */   }
/*     */   
/*     */   public void l() {
/* 282 */     if (this.d != null && (this.j < 1.0F || this.d.v)) {
/* 283 */       this.i = 1.0F;
/* 284 */       this.j = this.i;
/* 285 */       this.d.o(this.e);
/* 286 */       al_();
/* 287 */       if (this.d.d_(this.e).a(bup.bo)) {
/*     */         ceh ☃;
/* 289 */         if (this.g) {
/* 290 */           ☃ = bup.a.n();
/*     */         } else {
/* 292 */           ☃ = buo.b(this.a, this.d, this.e);
/*     */         } 
/* 294 */         this.d.a(this.e, ☃, 3);
/* 295 */         this.d.a(this.e, ☃.b(), this.e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/* 302 */     this.k = this.d.T();
/* 303 */     this.j = this.i;
/*     */     
/* 305 */     if (this.j >= 1.0F) {
/* 306 */       if (this.d.v && this.l < 5) {
/* 307 */         this.l++;
/*     */         return;
/*     */       } 
/* 310 */       this.d.o(this.e);
/* 311 */       al_();
/* 312 */       if (this.a != null && this.d.d_(this.e).a(bup.bo)) {
/* 313 */         ceh ceh1 = buo.b(this.a, this.d, this.e);
/* 314 */         if (ceh1.g()) {
/* 315 */           this.d.a(this.e, this.a, 84);
/* 316 */           buo.a(this.a, ceh1, this.d, this.e, 3);
/*     */         } else {
/* 318 */           if (ceh1.b(cex.C) && ((Boolean)ceh1.c(cex.C)).booleanValue()) {
/* 319 */             ceh1 = ceh1.a(cex.C, Boolean.valueOf(false));
/*     */           }
/* 321 */           this.d.a(this.e, ceh1, 67);
/* 322 */           this.d.a(this.e, ceh1.b(), this.e);
/*     */         } 
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 328 */     float ☃ = this.i + 0.5F;
/* 329 */     f(☃);
/* 330 */     g(☃);
/* 331 */     this.i = ☃;
/* 332 */     if (this.i >= 1.0F) {
/* 333 */       this.i = 1.0F;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 339 */     super.a(☃, md1);
/*     */     
/* 341 */     this.a = mp.c(md1.p("blockState"));
/* 342 */     this.b = gc.a(md1.h("facing"));
/* 343 */     this.i = md1.j("progress");
/* 344 */     this.j = this.i;
/* 345 */     this.c = md1.q("extending");
/* 346 */     this.g = md1.q("source");
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/* 351 */     super.a(☃);
/*     */     
/* 353 */     ☃.a("blockState", mp.a(this.a));
/* 354 */     ☃.b("facing", this.b.c());
/* 355 */     ☃.a("progress", this.j);
/* 356 */     ☃.a("extending", this.c);
/* 357 */     ☃.a("source", this.g);
/*     */     
/* 359 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh a(brc ☃, fx fx1) {
/*     */     ddh ddh;
/*     */     ceh ceh1;
/* 366 */     if (!this.c && this.g) {
/* 367 */       ddh = this.a.a(cea.b, Boolean.valueOf(true)).k(☃, fx1);
/*     */     } else {
/* 369 */       ddh = dde.a();
/*     */     } 
/*     */     
/* 372 */     gc gc1 = h.get();
/* 373 */     if (this.i < 1.0D && gc1 == j()) {
/* 374 */       return ddh;
/*     */     }
/*     */ 
/*     */     
/* 378 */     if (h()) {
/* 379 */       ceh1 = bup.aX.n().a(ceb.a, this.b).a(ceb.c, Boolean.valueOf((this.c != ((1.0F - this.i < 0.25F)))));
/*     */     } else {
/* 381 */       ceh1 = this.a;
/*     */     } 
/* 383 */     float f = e(this.i);
/* 384 */     double d1 = (this.b.i() * f);
/* 385 */     double d2 = (this.b.j() * f);
/* 386 */     double d3 = (this.b.k() * f);
/* 387 */     return dde.a(ddh, ceh1.k(☃, fx1).a(d1, d2, d3));
/*     */   }
/*     */   
/*     */   public long m() {
/* 391 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public double i() {
/* 397 */     return 68.0D;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ced.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */