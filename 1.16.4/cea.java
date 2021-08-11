/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class cea
/*     */   extends bvz
/*     */ {
/*  36 */   public static final cey b = cex.g;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  43 */   protected static final ddh c = buo.a(0.0D, 0.0D, 0.0D, 12.0D, 16.0D, 16.0D);
/*  44 */   protected static final ddh d = buo.a(4.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  45 */   protected static final ddh e = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 12.0D);
/*  46 */   protected static final ddh f = buo.a(0.0D, 0.0D, 4.0D, 16.0D, 16.0D, 16.0D);
/*  47 */   protected static final ddh g = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
/*  48 */   protected static final ddh h = buo.a(0.0D, 4.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   private final boolean i;
/*     */   
/*     */   public cea(boolean ☃, ceg.c c1) {
/*  53 */     super(c1);
/*  54 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(false)));
/*  55 */     this.i = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  60 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  61 */       switch (null.a[((gc)☃.c(a)).ordinal()])
/*     */       { case 1:
/*  63 */           return h;
/*     */         
/*     */         default:
/*  66 */           return g;
/*     */         case 3:
/*  68 */           return f;
/*     */         case 4:
/*  70 */           return e;
/*     */         case 5:
/*  72 */           return d;
/*     */         case 6:
/*  74 */           break; }  return c;
/*     */     } 
/*     */     
/*  77 */     return dde.b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/*  83 */     if (!☃.v) {
/*  84 */       a(☃, fx1, ceh1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  90 */     if (!brx1.v) {
/*  91 */       a(brx1, fx1, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  97 */     if (ceh1.a(☃.b())) {
/*     */       return;
/*     */     }
/* 100 */     if (!brx1.v && brx1.c(fx1) == null) {
/* 101 */       a(brx1, fx1, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 107 */     return n().a(a, ☃.d().f()).a(b, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ceh ceh1) {
/* 111 */     gc gc = (gc)ceh1.c(a);
/*     */     
/* 113 */     boolean bool = a(☃, fx1, gc);
/*     */     
/* 115 */     if (bool && !((Boolean)ceh1.c(b)).booleanValue()) {
/* 116 */       if ((new cee(☃, fx1, gc, true)).a()) {
/* 117 */         ☃.a(fx1, this, 0, gc.c());
/*     */       }
/* 119 */     } else if (!bool && ((Boolean)ceh1.c(b)).booleanValue()) {
/* 120 */       fx fx2 = fx1.a(gc, 2);
/* 121 */       ceh ceh2 = ☃.d_(fx2);
/*     */       
/* 123 */       int i = 1;
/* 124 */       if (ceh2.a(bup.bo) && ceh2.c(a) == gc) {
/* 125 */         ccj ccj = ☃.c(fx2);
/*     */         
/* 127 */         if (ccj instanceof ced) {
/* 128 */           ced ced = (ced)ccj;
/* 129 */           if (ced.d() && (ced.a(0.0F) < 0.5F || ☃.T() == ced.m() || ((aag)☃).m_())) {
/* 130 */             i = 2;
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 135 */       ☃.a(fx1, this, i, gc.c());
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
/*     */ 
/*     */   
/*     */   private boolean a(brx ☃, fx fx1, gc gc1) {
/* 151 */     for (gc gc2 : gc.values()) {
/* 152 */       if (gc2 != gc1 && ☃.a(fx1.a(gc2), gc2)) {
/* 153 */         return true;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 158 */     if (☃.a(fx1, gc.a)) {
/* 159 */       return true;
/*     */     }
/*     */     
/* 162 */     fx fx2 = fx1.b();
/* 163 */     for (gc gc2 : gc.values()) {
/* 164 */       if (gc2 != gc.a && ☃.a(fx2.a(gc2), gc2)) {
/* 165 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 169 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brx brx1, fx fx1, int i, int j) {
/* 174 */     gc gc = (gc)☃.c(a);
/* 175 */     if (!brx1.v) {
/* 176 */       boolean bool = a(brx1, fx1, gc);
/*     */       
/* 178 */       if (bool && (i == 1 || i == 2)) {
/*     */         
/* 180 */         brx1.a(fx1, ☃.a(b, Boolean.valueOf(true)), 2);
/* 181 */         return false;
/* 182 */       }  if (!bool && i == 0) {
/* 183 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 187 */     if (i == 0) {
/* 188 */       if (a(brx1, fx1, gc, true)) {
/* 189 */         brx1.a(fx1, ☃.a(b, Boolean.valueOf(true)), 67);
/* 190 */         brx1.a((bfw)null, fx1, adq.ln, adr.e, 0.5F, brx1.t.nextFloat() * 0.25F + 0.6F);
/*     */       } else {
/* 192 */         return false;
/*     */       } 
/* 194 */     } else if (i == 1 || i == 2) {
/* 195 */       ccj ccj = brx1.c(fx1.a(gc));
/* 196 */       if (ccj instanceof ced) {
/* 197 */         ((ced)ccj).l();
/*     */       }
/*     */       
/* 200 */       ceh ceh1 = bup.bo.n().a(cdz.a, gc).a(cdz.b, this.i ? cfi.b : cfi.a);
/* 201 */       brx1.a(fx1, ceh1, 20);
/* 202 */       brx1.a(fx1, cdz.a(n().a(a, gc.a(j & 0x7)), gc, false, true));
/*     */       
/* 204 */       brx1.a(fx1, ceh1.b());
/* 205 */       ceh1.a(brx1, fx1, 2);
/*     */ 
/*     */       
/* 208 */       if (this.i) {
/* 209 */         fx fx2 = fx1.b(gc.i() * 2, gc.j() * 2, gc.k() * 2);
/* 210 */         ceh ceh2 = brx1.d_(fx2);
/* 211 */         boolean bool = false;
/*     */         
/* 213 */         if (ceh2.a(bup.bo)) {
/*     */ 
/*     */           
/* 216 */           ccj ccj1 = brx1.c(fx2);
/* 217 */           if (ccj1 instanceof ced) {
/* 218 */             ced ced = (ced)ccj1;
/*     */             
/* 220 */             if (ced.f() == gc && ced.d()) {
/*     */               
/* 222 */               ced.l();
/* 223 */               bool = true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 228 */         if (!bool) {
/* 229 */           if (i == 1 && !ceh2.g() && a(ceh2, brx1, fx2, gc.f(), false, gc) && (ceh2.k() == cvc.a || ceh2.a(bup.aW) || ceh2.a(bup.aP))) {
/* 230 */             a(brx1, fx1, gc, false);
/*     */           } else {
/* 232 */             brx1.a(fx1.a(gc), false);
/*     */           } 
/*     */         }
/*     */       } else {
/* 236 */         brx1.a(fx1.a(gc), false);
/*     */       } 
/*     */       
/* 239 */       brx1.a((bfw)null, fx1, adq.lm, adr.e, 0.5F, brx1.t.nextFloat() * 0.15F + 0.6F);
/*     */     } 
/* 241 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean a(ceh ☃, brx brx1, fx fx1, gc gc1, boolean bool, gc gc2) {
/* 245 */     if (fx1.v() < 0 || fx1.v() > brx1.L() - 1 || !brx1.f().a(fx1)) {
/* 246 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 250 */     if (☃.g()) {
/* 251 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 255 */     if (☃.a(bup.bK) || ☃.a(bup.ni) || ☃.a(bup.nj)) {
/* 256 */       return false;
/*     */     }
/*     */     
/* 259 */     if (gc1 == gc.a && fx1.v() == 0) {
/* 260 */       return false;
/*     */     }
/*     */     
/* 263 */     if (gc1 == gc.b && fx1.v() == brx1.L() - 1) {
/* 264 */       return false;
/*     */     }
/*     */     
/* 267 */     if (☃.a(bup.aW) || ☃.a(bup.aP)) {
/*     */       
/* 269 */       if (((Boolean)☃.c(b)).booleanValue()) {
/* 270 */         return false;
/*     */       }
/*     */     } else {
/* 273 */       if (☃.h(brx1, fx1) == -1.0F) {
/* 274 */         return false;
/*     */       }
/*     */       
/* 277 */       switch (null.b[☃.k().ordinal()]) {
/*     */         case 1:
/* 279 */           return false;
/*     */         case 2:
/* 281 */           return bool;
/*     */         case 3:
/* 283 */           return (gc1 == gc2);
/*     */       } 
/*     */ 
/*     */     
/*     */     } 
/* 288 */     return !☃.b().q();
/*     */   }
/*     */   
/*     */   private boolean a(brx ☃, fx fx1, gc gc1, boolean bool) {
/* 292 */     fx fx2 = fx1.a(gc1);
/* 293 */     if (!bool && ☃.d_(fx2).a(bup.aX))
/*     */     {
/* 295 */       ☃.a(fx2, bup.a.n(), 20);
/*     */     }
/*     */     
/* 298 */     cee cee = new cee(☃, fx1, gc1, bool);
/* 299 */     if (!cee.a()) {
/* 300 */       return false;
/*     */     }
/*     */     
/* 303 */     Map<fx, ceh> map = Maps.newHashMap();
/* 304 */     List<fx> list1 = cee.c();
/* 305 */     List<ceh> list = Lists.newArrayList();
/* 306 */     for (int i = 0; i < list1.size(); i++) {
/* 307 */       fx fx3 = list1.get(i);
/* 308 */       ceh ceh1 = ☃.d_(fx3);
/* 309 */       list.add(ceh1);
/* 310 */       map.put(fx3, ceh1);
/*     */     } 
/* 312 */     List<fx> list2 = cee.d();
/*     */     
/* 314 */     ceh[] arrayOfCeh = new ceh[list1.size() + list2.size()];
/* 315 */     gc gc2 = bool ? gc1 : gc1.f();
/*     */     
/* 317 */     int j = 0;
/*     */     int k;
/* 319 */     for (k = list2.size() - 1; k >= 0; k--) {
/* 320 */       fx fx3 = list2.get(k);
/*     */       
/* 322 */       ceh ceh1 = ☃.d_(fx3);
/*     */       
/* 324 */       ccj ccj = ceh1.b().q() ? ☃.c(fx3) : null;
/*     */       
/* 326 */       a(ceh1, ☃, fx3, ccj);
/* 327 */       ☃.a(fx3, bup.a.n(), 18);
/*     */       
/* 329 */       arrayOfCeh[j++] = ceh1;
/*     */     } 
/*     */ 
/*     */     
/* 333 */     for (k = list1.size() - 1; k >= 0; k--) {
/* 334 */       fx fx3 = list1.get(k);
/* 335 */       ceh ceh1 = ☃.d_(fx3);
/*     */       
/* 337 */       fx3 = fx3.a(gc2);
/*     */       
/* 339 */       map.remove(fx3);
/*     */       
/* 341 */       ☃.a(fx3, bup.bo.n().a(a, gc1), 68);
/* 342 */       ☃.a(fx3, cdz.a(list.get(k), gc1, bool, false));
/*     */       
/* 344 */       arrayOfCeh[j++] = ceh1;
/*     */     } 
/*     */     
/* 347 */     if (bool) {
/* 348 */       cfi cfi = this.i ? cfi.b : cfi.a;
/* 349 */       ceh ceh1 = bup.aX.n().a(ceb.a, gc1).a(ceb.b, cfi);
/*     */ 
/*     */ 
/*     */       
/* 353 */       ceh ceh2 = bup.bo.n().a(cdz.a, gc1).a(cdz.b, this.i ? cfi.b : cfi.a);
/*     */       
/* 355 */       map.remove(fx2);
/*     */       
/* 357 */       ☃.a(fx2, ceh2, 68);
/* 358 */       ☃.a(fx2, cdz.a(ceh1, gc1, true, true));
/*     */     } 
/*     */     
/* 361 */     ceh ceh = bup.a.n();
/* 362 */     for (fx fx3 : map.keySet()) {
/* 363 */       ☃.a(fx3, ceh, 82);
/*     */     }
/*     */     
/* 366 */     for (Map.Entry<fx, ceh> entry : map.entrySet()) {
/* 367 */       fx fx3 = entry.getKey();
/* 368 */       ceh ceh1 = entry.getValue();
/* 369 */       ceh1.b(☃, fx3, 2);
/* 370 */       ceh.a(☃, fx3, 2);
/* 371 */       ceh.b(☃, fx3, 2);
/*     */     } 
/*     */     
/* 374 */     j = 0;
/*     */     int m;
/* 376 */     for (m = list2.size() - 1; m >= 0; m--) {
/* 377 */       ceh ceh1 = arrayOfCeh[j++];
/* 378 */       fx fx3 = list2.get(m);
/*     */       
/* 380 */       ceh1.b(☃, fx3, 2);
/* 381 */       ☃.b(fx3, ceh1.b());
/*     */     } 
/*     */ 
/*     */     
/* 385 */     for (m = list1.size() - 1; m >= 0; m--) {
/* 386 */       ☃.b(list1.get(m), arrayOfCeh[j++].b());
/*     */     }
/*     */     
/* 389 */     if (bool) {
/* 390 */       ☃.b(fx2, bup.aX);
/*     */     }
/*     */     
/* 393 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 398 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 403 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 408 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(ceh ☃) {
/* 413 */     return ((Boolean)☃.c(b)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 418 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */