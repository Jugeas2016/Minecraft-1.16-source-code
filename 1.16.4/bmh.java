/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.LinkedHashMultiset;
/*     */ import com.google.common.collect.Multiset;
/*     */ import com.google.common.collect.Multisets;
/*     */ import java.util.List;
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
/*     */ public class bmh
/*     */   extends bkr
/*     */ {
/*     */   public bmh(blx.a ☃) {
/*  46 */     super(☃);
/*     */   }
/*     */   
/*     */   public static bmb a(brx ☃, int i, int j, byte b, boolean bool1, boolean bool2) {
/*  50 */     bmb bmb = new bmb(bmd.nf);
/*     */     
/*  52 */     a(bmb, ☃, i, j, b, bool1, bool2, ☃.Y());
/*     */     
/*  54 */     return bmb;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cxx a(bmb ☃, brx brx1) {
/*  59 */     return brx1.a(a(d(☃)));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cxx b(bmb ☃, brx brx1) {
/*  64 */     cxx cxx = a(☃, brx1);
/*     */     
/*  66 */     if (cxx == null && brx1 instanceof aag) {
/*  67 */       cxx = a(☃, brx1, brx1.h().a(), brx1.h().c(), 3, false, false, brx1.Y());
/*     */     }
/*     */     
/*  70 */     return cxx;
/*     */   }
/*     */   
/*     */   public static int d(bmb ☃) {
/*  74 */     md md = ☃.o();
/*  75 */     return (md != null && md.c("map", 99)) ? md.h("map") : 0;
/*     */   }
/*     */   
/*     */   private static cxx a(bmb ☃, brx brx1, int i, int j, int k, boolean bool1, boolean bool2, vj<brx> vj1) {
/*  79 */     int m = brx1.t();
/*     */     
/*  81 */     cxx cxx = new cxx(a(m));
/*     */     
/*  83 */     cxx.a(i, j, k, bool1, bool2, vj1);
/*     */     
/*  85 */     brx1.a(cxx);
/*     */     
/*  87 */     ☃.p().b("map", m);
/*  88 */     return cxx;
/*     */   }
/*     */   
/*     */   public static String a(int ☃) {
/*  92 */     return "map_" + ☃;
/*     */   }
/*     */   
/*     */   public void a(brx ☃, aqa aqa1, cxx cxx1) {
/*  96 */     if (☃.Y() != cxx1.c || !(aqa1 instanceof bfw)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 101 */     int i = 1 << cxx1.f;
/* 102 */     int j = cxx1.a;
/* 103 */     int k = cxx1.b;
/*     */     
/* 105 */     int m = afm.c(aqa1.cD() - j) / i + 64;
/* 106 */     int n = afm.c(aqa1.cH() - k) / i + 64;
/* 107 */     int i1 = 128 / i;
/*     */     
/* 109 */     if (☃.k().c()) {
/* 110 */       i1 /= 2;
/*     */     }
/*     */     
/* 113 */     cxx.a a = cxx1.a((bfw)aqa1);
/* 114 */     a.b++;
/*     */     
/* 116 */     boolean bool = false;
/* 117 */     for (int i2 = m - i1 + 1; i2 < m + i1; i2++) {
/* 118 */       if ((i2 & 0xF) == (a.b & 0xF) || bool) {
/*     */ 
/*     */ 
/*     */         
/* 122 */         bool = false;
/* 123 */         double d = 0.0D;
/* 124 */         for (int i3 = n - i1 - 1; i3 < n + i1; i3++) {
/* 125 */           if (i2 >= 0 && i3 >= -1 && i2 < 128 && i3 < 128) {
/*     */ 
/*     */ 
/*     */             
/* 129 */             int i4 = i2 - m;
/* 130 */             int i5 = i3 - n;
/*     */             
/* 132 */             boolean bool1 = (i4 * i4 + i5 * i5 > (i1 - 2) * (i1 - 2));
/*     */             
/* 134 */             int i6 = (j / i + i2 - 64) * i;
/* 135 */             int i7 = (k / i + i3 - 64) * i;
/*     */             
/* 137 */             LinkedHashMultiset linkedHashMultiset = LinkedHashMultiset.create();
/*     */             
/* 139 */             cgh cgh = ☃.n(new fx(i6, 0, i7));
/* 140 */             if (!cgh.t()) {
/*     */ 
/*     */               
/* 143 */               brd brd = cgh.g();
/* 144 */               int i8 = i6 & 0xF;
/* 145 */               int i9 = i7 & 0xF;
/* 146 */               int i10 = 0;
/*     */               
/* 148 */               double d1 = 0.0D;
/* 149 */               if (☃.k().c()) {
/* 150 */                 int i12 = i6 + i7 * 231871;
/* 151 */                 i12 = i12 * i12 * 31287121 + i12 * 11;
/*     */                 
/* 153 */                 if ((i12 >> 20 & 0x1) == 0) {
/* 154 */                   linkedHashMultiset.add(bup.j.n().d(☃, fx.b), 10);
/*     */                 } else {
/* 156 */                   linkedHashMultiset.add(bup.b.n().d(☃, fx.b), 100);
/*     */                 } 
/*     */                 
/* 159 */                 d1 = 100.0D;
/*     */               } else {
/* 161 */                 fx.a a1 = new fx.a();
/* 162 */                 fx.a a2 = new fx.a();
/* 163 */                 for (int i12 = 0; i12 < i; i12++) {
/* 164 */                   for (int i13 = 0; i13 < i; i13++) {
/* 165 */                     ceh ceh; int i14 = cgh.a(chn.a.b, i12 + i8, i13 + i9) + 1;
/*     */                     
/* 167 */                     if (i14 > 1) {
/*     */                       do {
/* 169 */                         i14--;
/* 170 */                         a1.d(brd.d() + i12 + i8, i14, brd.e() + i13 + i9);
/* 171 */                         ceh = cgh.d_(a1);
/* 172 */                       } while (ceh.d(☃, a1) == cvb.b && i14 > 0);
/*     */                       
/* 174 */                       if (i14 > 0 && !ceh.m().c()) {
/* 175 */                         ceh ceh1; int i15 = i14 - 1;
/*     */                         
/* 177 */                         a2.g(a1);
/*     */                         do {
/* 179 */                           a2.p(i15--);
/* 180 */                           ceh1 = cgh.d_(a2);
/* 181 */                           i10++;
/* 182 */                         } while (i15 > 0 && !ceh1.m().c());
/*     */                         
/* 184 */                         ceh = a(☃, ceh, a1);
/*     */                       } 
/*     */                     } else {
/* 187 */                       ceh = bup.z.n();
/*     */                     } 
/*     */                     
/* 190 */                     cxx1.a(☃, brd.d() + i12 + i8, brd.e() + i13 + i9);
/*     */                     
/* 192 */                     d1 += i14 / (i * i);
/*     */                     
/* 194 */                     linkedHashMultiset.add(ceh.d(☃, a1));
/*     */                   } 
/*     */                 } 
/*     */               } 
/* 198 */               i10 /= i * i;
/*     */               
/* 200 */               double d2 = (d1 - d) * 4.0D / (i + 4) + ((i2 + i3 & 0x1) - 0.5D) * 0.4D;
/* 201 */               int i11 = 1;
/* 202 */               if (d2 > 0.6D) {
/* 203 */                 i11 = 2;
/*     */               }
/* 205 */               if (d2 < -0.6D) {
/* 206 */                 i11 = 0;
/*     */               }
/*     */               
/* 209 */               cvb cvb = (cvb)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)linkedHashMultiset), cvb.b);
/*     */               
/* 211 */               if (cvb == cvb.n) {
/* 212 */                 d2 = i10 * 0.1D + (i2 + i3 & 0x1) * 0.2D;
/* 213 */                 i11 = 1;
/* 214 */                 if (d2 < 0.5D) {
/* 215 */                   i11 = 2;
/*     */                 }
/* 217 */                 if (d2 > 0.9D) {
/* 218 */                   i11 = 0;
/*     */                 }
/*     */               } 
/*     */               
/* 222 */               d = d1;
/*     */               
/* 224 */               if (i3 >= 0)
/*     */               {
/*     */                 
/* 227 */                 if (i4 * i4 + i5 * i5 < i1 * i1)
/*     */                 {
/*     */                   
/* 230 */                   if (!bool1 || (i2 + i3 & 0x1) != 0) {
/*     */ 
/*     */                     
/* 233 */                     byte b1 = cxx1.g[i2 + i3 * 128];
/* 234 */                     byte b2 = (byte)(cvb.aj * 4 + i11);
/* 235 */                     if (b1 != b2) {
/* 236 */                       cxx1.g[i2 + i3 * 128] = b2;
/* 237 */                       cxx1.a(i2, i3);
/* 238 */                       bool = true;
/*     */                     } 
/*     */                   }  }  } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 245 */     }  } private ceh a(brx ☃, ceh ceh1, fx fx1) { cux cux = ceh1.m();
/* 246 */     if (!cux.c() && !ceh1.d(☃, fx1, gc.b)) {
/* 247 */       return cux.g();
/*     */     }
/*     */     
/* 250 */     return ceh1; }
/*     */ 
/*     */   
/*     */   private static boolean a(bsv[] ☃, int i, int j, int k) {
/* 254 */     return (☃[j * i + k * i * 128 * i].h() >= 0.0F);
/*     */   }
/*     */   
/*     */   public static void a(aag ☃, bmb bmb1) {
/* 258 */     cxx cxx = b(bmb1, ☃);
/* 259 */     if (cxx == null) {
/*     */       return;
/*     */     }
/* 262 */     if (☃.Y() != cxx.c) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 267 */     int i = 1 << cxx.f;
/* 268 */     int j = cxx.a;
/* 269 */     int k = cxx.b;
/*     */     
/* 271 */     bsv[] arrayOfBsv = new bsv[128 * i * 128 * i];
/*     */     int m;
/* 273 */     for (m = 0; m < 128 * i; m++) {
/* 274 */       for (int n = 0; n < 128 * i; n++) {
/* 275 */         arrayOfBsv[m * 128 * i + n] = ☃.v(new fx((j / i - 64) * i + n, 0, (k / i - 64) * i + m));
/*     */       }
/*     */     } 
/* 278 */     for (m = 0; m < 128; m++) {
/* 279 */       for (int n = 0; n < 128; n++) {
/*     */         
/* 281 */         if (m > 0 && n > 0 && m < 127 && n < 127) {
/* 282 */           bsv bsv = arrayOfBsv[m * i + n * i * 128 * i];
/*     */           
/* 284 */           int i1 = 8;
/* 285 */           if (a(arrayOfBsv, i, m - 1, n - 1)) {
/* 286 */             i1--;
/*     */           }
/* 288 */           if (a(arrayOfBsv, i, m - 1, n + 1)) {
/* 289 */             i1--;
/*     */           }
/* 291 */           if (a(arrayOfBsv, i, m - 1, n)) {
/* 292 */             i1--;
/*     */           }
/* 294 */           if (a(arrayOfBsv, i, m + 1, n - 1)) {
/* 295 */             i1--;
/*     */           }
/* 297 */           if (a(arrayOfBsv, i, m + 1, n + 1)) {
/* 298 */             i1--;
/*     */           }
/* 300 */           if (a(arrayOfBsv, i, m + 1, n)) {
/* 301 */             i1--;
/*     */           }
/* 303 */           if (a(arrayOfBsv, i, m, n - 1)) {
/* 304 */             i1--;
/*     */           }
/* 306 */           if (a(arrayOfBsv, i, m, n + 1)) {
/* 307 */             i1--;
/*     */           }
/*     */           
/* 310 */           int i2 = 3;
/* 311 */           cvb cvb = cvb.b;
/* 312 */           if (bsv.h() < 0.0F) {
/* 313 */             cvb = cvb.q;
/* 314 */             if (i1 > 7 && n % 2 == 0) {
/* 315 */               i2 = (m + (int)(afm.a(n + 0.0F) * 7.0F)) / 8 % 5;
/* 316 */               if (i2 == 3) {
/* 317 */                 i2 = 1;
/* 318 */               } else if (i2 == 4) {
/* 319 */                 i2 = 0;
/*     */               } 
/* 321 */             } else if (i1 > 7) {
/* 322 */               cvb = cvb.b;
/* 323 */             } else if (i1 > 5) {
/* 324 */               i2 = 1;
/* 325 */             } else if (i1 > 3) {
/* 326 */               i2 = 0;
/* 327 */             } else if (i1 > 1) {
/* 328 */               i2 = 0;
/*     */             } 
/* 330 */           } else if (i1 > 0) {
/* 331 */             cvb = cvb.B;
/* 332 */             if (i1 > 3) {
/* 333 */               i2 = 1;
/*     */             } else {
/* 335 */               i2 = 3;
/*     */             } 
/*     */           } 
/*     */           
/* 339 */           if (cvb != cvb.b) {
/* 340 */             cxx.g[m + n * 128] = (byte)(cvb.aj * 4 + i2);
/* 341 */             cxx.a(m, n);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, brx brx1, aqa aqa1, int i, boolean bool) {
/* 350 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/* 354 */     cxx cxx = b(☃, brx1);
/* 355 */     if (cxx == null) {
/*     */       return;
/*     */     }
/*     */     
/* 359 */     if (aqa1 instanceof bfw) {
/* 360 */       bfw bfw = (bfw)aqa1;
/* 361 */       cxx.a(bfw, ☃);
/*     */     } 
/*     */     
/* 364 */     if (!cxx.h && (bool || (aqa1 instanceof bfw && ((bfw)aqa1).dE() == ☃))) {
/* 365 */       a(brx1, aqa1, cxx);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public oj<?> a(bmb ☃, brx brx1, bfw bfw1) {
/* 372 */     return b(☃, brx1).a(☃, brx1, bfw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bmb ☃, brx brx1, bfw bfw1) {
/* 377 */     md md = ☃.o();
/* 378 */     if (md != null && md.c("map_scale_direction", 99)) {
/* 379 */       a(☃, brx1, md.h("map_scale_direction"));
/* 380 */       md.r("map_scale_direction");
/* 381 */     } else if (md != null && md.c("map_to_lock", 1) && md.q("map_to_lock")) {
/* 382 */       a(brx1, ☃);
/* 383 */       md.r("map_to_lock");
/*     */     } 
/*     */   }
/*     */   
/*     */   protected static void a(bmb ☃, brx brx1, int i) {
/* 388 */     cxx cxx = b(☃, brx1);
/*     */     
/* 390 */     if (cxx != null) {
/* 391 */       a(☃, brx1, cxx.a, cxx.b, afm.a(cxx.f + i, 0, 4), cxx.d, cxx.e, cxx.c);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, bmb bmb1) {
/* 396 */     cxx cxx = b(bmb1, ☃);
/* 397 */     if (cxx != null) {
/* 398 */       cxx cxx1 = a(bmb1, ☃, 0, 0, cxx.f, cxx.d, cxx.e, cxx.c);
/* 399 */       cxx1.a(cxx);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 405 */     cxx cxx = (brx1 == null) ? null : b(☃, brx1);
/*     */     
/* 407 */     if (cxx != null && cxx.h) {
/* 408 */       list.add((new of("filled_map.locked", new Object[] { Integer.valueOf(d(☃)) })).a(k.h));
/*     */     }
/*     */     
/* 411 */     if (bnl1.a()) {
/* 412 */       if (cxx != null) {
/* 413 */         list.add((new of("filled_map.id", new Object[] { Integer.valueOf(d(☃)) })).a(k.h));
/* 414 */         list.add((new of("filled_map.scale", new Object[] { Integer.valueOf(1 << cxx.f) })).a(k.h));
/* 415 */         list.add((new of("filled_map.level", new Object[] { Byte.valueOf(cxx.f), Integer.valueOf(4) })).a(k.h));
/*     */       } else {
/* 417 */         list.add((new of("filled_map.unknown")).a(k.h));
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static int g(bmb ☃) {
/* 423 */     md md = ☃.b("display");
/* 424 */     if (md != null && md.c("MapColor", 99)) {
/* 425 */       int i = md.h("MapColor");
/* 426 */       return 0xFF000000 | i & 0xFFFFFF;
/*     */     } 
/* 428 */     return -12173266;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(boa ☃) {
/* 433 */     ceh ceh = ☃.p().d_(☃.a());
/* 434 */     if (ceh.a(aed.B)) {
/* 435 */       if (!(☃.p()).v) {
/* 436 */         cxx cxx = b(☃.m(), ☃.p());
/* 437 */         cxx.a(☃.p(), ☃.a());
/*     */       } 
/* 439 */       return aou.a((☃.p()).v);
/*     */     } 
/* 441 */     return super.a(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */