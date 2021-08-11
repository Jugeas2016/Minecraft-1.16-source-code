/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ class d
/*     */ {
/*     */   private final csw a;
/*     */   private final Random b;
/*     */   private int c;
/*     */   private int d;
/*     */   
/*     */   public d(csw ☃, Random random) {
/* 136 */     this.a = ☃;
/* 137 */     this.b = random;
/*     */   }
/*     */   
/*     */   public void a(fx ☃, bzm bzm1, List<cry.i> list, cry.c c1) {
/* 141 */     cry.e e1 = new cry.e(null);
/* 142 */     e1.b = ☃;
/* 143 */     e1.a = bzm1;
/* 144 */     e1.c = "wall_flat";
/*     */     
/* 146 */     cry.e e2 = new cry.e(null);
/*     */ 
/*     */     
/* 149 */     a(list, e1);
/* 150 */     e2.b = e1.b.b(8);
/* 151 */     e2.a = e1.a;
/* 152 */     e2.c = "wall_window";
/*     */     
/* 154 */     if (!list.isEmpty());
/*     */ 
/*     */ 
/*     */     
/* 158 */     cry.g g1 = cry.c.a(c1);
/* 159 */     cry.g g2 = cry.c.b(c1);
/*     */     
/* 161 */     this.c = cry.c.c(c1) + 1;
/* 162 */     this.d = cry.c.d(c1) + 1;
/* 163 */     int i = cry.c.c(c1) + 1;
/* 164 */     int j = cry.c.d(c1);
/*     */     
/* 166 */     a(list, e1, g1, gc.d, this.c, this.d, i, j);
/* 167 */     a(list, e2, g1, gc.d, this.c, this.d, i, j);
/*     */ 
/*     */     
/* 170 */     cry.e e3 = new cry.e(null);
/* 171 */     e3.b = e1.b.b(19);
/* 172 */     e3.a = e1.a;
/* 173 */     e3.c = "wall_window";
/*     */     
/* 175 */     boolean bool = false;
/* 176 */     for (int k = 0; k < cry.g.a(g2) && !bool; k++) {
/* 177 */       for (int n = cry.g.b(g2) - 1; n >= 0 && !bool; n--) {
/* 178 */         if (cry.c.a(g2, n, k)) {
/* 179 */           e3.b = e3.b.a(bzm1.a(gc.d), 8 + (k - this.d) * 8);
/* 180 */           e3.b = e3.b.a(bzm1.a(gc.f), (n - this.c) * 8);
/* 181 */           b(list, e3);
/* 182 */           a(list, e3, g2, gc.d, n, k, n, k);
/* 183 */           bool = true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 189 */     a(list, ☃.b(16), bzm1, g1, g2);
/* 190 */     a(list, ☃.b(27), bzm1, g2, (cry.g)null);
/*     */     
/* 192 */     if (!list.isEmpty());
/*     */ 
/*     */ 
/*     */     
/* 196 */     cry.b[] arrayOfB = new cry.b[3];
/* 197 */     arrayOfB[0] = new cry.a(null);
/* 198 */     arrayOfB[1] = new cry.f(null);
/* 199 */     arrayOfB[2] = new cry.h(null);
/*     */     
/* 201 */     for (int m = 0; m < 3; m++) {
/* 202 */       fx fx1 = ☃.b(8 * m + ((m == 2) ? 3 : 0));
/* 203 */       cry.g g3 = cry.c.e(c1)[m];
/* 204 */       cry.g g4 = (m == 2) ? g2 : g1;
/*     */ 
/*     */       
/* 207 */       String str1 = (m == 0) ? "carpet_south_1" : "carpet_south_2";
/* 208 */       String str2 = (m == 0) ? "carpet_west_1" : "carpet_west_2";
/* 209 */       for (int n = 0; n < cry.g.a(g4); n++) {
/* 210 */         for (int i2 = 0; i2 < cry.g.b(g4); i2++) {
/* 211 */           if (g4.a(i2, n) == 1) {
/* 212 */             fx fx2 = fx1.a(bzm1.a(gc.d), 8 + (n - this.d) * 8);
/* 213 */             fx2 = fx2.a(bzm1.a(gc.f), (i2 - this.c) * 8);
/* 214 */             list.add(new cry.i(this.a, "corridor_floor", fx2, bzm1));
/*     */             
/* 216 */             if (g4.a(i2, n - 1) == 1 || (g3.a(i2, n - 1) & 0x800000) == 8388608) {
/* 217 */               list.add(new cry.i(this.a, "carpet_north", fx2.a(bzm1.a(gc.f), 1).b(), bzm1));
/*     */             }
/* 219 */             if (g4.a(i2 + 1, n) == 1 || (g3.a(i2 + 1, n) & 0x800000) == 8388608) {
/* 220 */               list.add(new cry.i(this.a, "carpet_east", fx2.a(bzm1.a(gc.d), 1).a(bzm1.a(gc.f), 5).b(), bzm1));
/*     */             }
/* 222 */             if (g4.a(i2, n + 1) == 1 || (g3.a(i2, n + 1) & 0x800000) == 8388608) {
/* 223 */               list.add(new cry.i(this.a, str1, fx2.a(bzm1.a(gc.d), 5).a(bzm1.a(gc.e), 1), bzm1));
/*     */             }
/* 225 */             if (g4.a(i2 - 1, n) == 1 || (g3.a(i2 - 1, n) & 0x800000) == 8388608) {
/* 226 */               list.add(new cry.i(this.a, str2, fx2.a(bzm1.a(gc.e), 1).a(bzm1.a(gc.c), 1), bzm1));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 232 */       String str3 = (m == 0) ? "indoors_wall_1" : "indoors_wall_2";
/* 233 */       String str4 = (m == 0) ? "indoors_door_1" : "indoors_door_2";
/* 234 */       List<gc> list1 = Lists.newArrayList();
/* 235 */       for (int i1 = 0; i1 < cry.g.a(g4); i1++) {
/* 236 */         for (int i2 = 0; i2 < cry.g.b(g4); i2++) {
/* 237 */           boolean bool1 = (m == 2 && g4.a(i2, i1) == 3);
/* 238 */           if (g4.a(i2, i1) == 2 || bool1) {
/* 239 */             int i3 = g3.a(i2, i1);
/* 240 */             int i4 = i3 & 0xF0000;
/* 241 */             int i5 = i3 & 0xFFFF;
/*     */ 
/*     */             
/* 244 */             bool1 = (bool1 && (i3 & 0x800000) == 8388608);
/*     */             
/* 246 */             list1.clear();
/* 247 */             if ((i3 & 0x200000) == 2097152) {
/* 248 */               for (gc gc1 : gc.c.a) {
/* 249 */                 if (g4.a(i2 + gc1.i(), i1 + gc1.k()) == 1) {
/* 250 */                   list1.add(gc1);
/*     */                 }
/*     */               } 
/*     */             }
/* 254 */             gc gc = null;
/* 255 */             if (!list1.isEmpty()) {
/* 256 */               gc = list1.get(this.b.nextInt(list1.size()));
/* 257 */             } else if ((i3 & 0x100000) == 1048576) {
/*     */               
/* 259 */               gc = gc.b;
/*     */             } 
/*     */             
/* 262 */             fx fx2 = fx1.a(bzm1.a(gc.d), 8 + (i1 - this.d) * 8);
/* 263 */             fx2 = fx2.a(bzm1.a(gc.f), -1 + (i2 - this.c) * 8);
/*     */             
/* 265 */             if (cry.c.a(g4, i2 - 1, i1) && !c1.a(g4, i2 - 1, i1, m, i5)) {
/* 266 */               list.add(new cry.i(this.a, (gc == gc.e) ? str4 : str3, fx2, bzm1));
/*     */             }
/* 268 */             if (g4.a(i2 + 1, i1) == 1 && !bool1) {
/* 269 */               fx fx3 = fx2.a(bzm1.a(gc.f), 8);
/* 270 */               list.add(new cry.i(this.a, (gc == gc.f) ? str4 : str3, fx3, bzm1));
/*     */             } 
/* 272 */             if (cry.c.a(g4, i2, i1 + 1) && !c1.a(g4, i2, i1 + 1, m, i5)) {
/* 273 */               fx fx3 = fx2.a(bzm1.a(gc.d), 7);
/* 274 */               fx3 = fx3.a(bzm1.a(gc.f), 7);
/* 275 */               list.add(new cry.i(this.a, (gc == gc.d) ? str4 : str3, fx3, bzm1.a(bzm.b)));
/*     */             } 
/* 277 */             if (g4.a(i2, i1 - 1) == 1 && !bool1) {
/* 278 */               fx fx3 = fx2.a(bzm1.a(gc.c), 1);
/* 279 */               fx3 = fx3.a(bzm1.a(gc.f), 7);
/* 280 */               list.add(new cry.i(this.a, (gc == gc.c) ? str4 : str3, fx3, bzm1.a(bzm.b)));
/*     */             } 
/*     */             
/* 283 */             if (i4 == 65536) {
/* 284 */               a(list, fx2, bzm1, gc, arrayOfB[m]);
/* 285 */             } else if (i4 == 131072 && gc != null) {
/*     */               
/* 287 */               gc gc1 = c1.b(g4, i2, i1, m, i5);
/* 288 */               boolean bool2 = ((i3 & 0x400000) == 4194304);
/* 289 */               a(list, fx2, bzm1, gc1, gc, arrayOfB[m], bool2);
/* 290 */             } else if (i4 == 262144 && gc != null && gc != gc.b) {
/*     */               
/* 292 */               gc gc1 = gc.g();
/* 293 */               if (!c1.a(g4, i2 + gc1.i(), i1 + gc1.k(), m, i5)) {
/* 294 */                 gc1 = gc1.f();
/*     */               }
/* 296 */               a(list, fx2, bzm1, gc1, gc, arrayOfB[m]);
/* 297 */             } else if (i4 == 262144 && gc == gc.b) {
/* 298 */               a(list, fx2, bzm1, arrayOfB[m]);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<cry.i> ☃, cry.e e1, cry.g g1, gc gc1, int i, int j, int k, int m) {
/* 307 */     int n = i;
/* 308 */     int i1 = j;
/* 309 */     gc gc2 = gc1;
/*     */     
/*     */     do {
/* 312 */       if (!cry.c.a(g1, n + gc1.i(), i1 + gc1.k())) {
/*     */         
/* 314 */         c(☃, e1);
/* 315 */         gc1 = gc1.g();
/* 316 */         if (n != k || i1 != m || gc2 != gc1) {
/* 317 */           b(☃, e1);
/*     */         }
/* 319 */       } else if (cry.c.a(g1, n + gc1.i(), i1 + gc1.k()) && cry.c.a(g1, n + gc1.i() + gc1.h().i(), i1 + gc1.k() + gc1.h().k())) {
/*     */         
/* 321 */         d(☃, e1);
/* 322 */         n += gc1.i();
/* 323 */         i1 += gc1.k();
/* 324 */         gc1 = gc1.h();
/*     */       } else {
/* 326 */         n += gc1.i();
/* 327 */         i1 += gc1.k();
/* 328 */         if (n != k || i1 != m || gc2 != gc1) {
/* 329 */           b(☃, e1);
/*     */         }
/*     */       } 
/* 332 */     } while (n != k || i1 != m || gc2 != gc1);
/*     */   }
/*     */   
/*     */   private void a(List<cry.i> ☃, fx fx1, bzm bzm1, cry.g g1, @Nullable cry.g g2) {
/*     */     int i;
/* 337 */     for (i = 0; i < cry.g.a(g1); i++) {
/* 338 */       for (int j = 0; j < cry.g.b(g1); j++) {
/* 339 */         fx fx2 = fx1;
/* 340 */         fx2 = fx2.a(bzm1.a(gc.d), 8 + (i - this.d) * 8);
/* 341 */         fx2 = fx2.a(bzm1.a(gc.f), (j - this.c) * 8);
/*     */ 
/*     */         
/* 344 */         boolean bool = (g2 != null && cry.c.a(g2, j, i));
/*     */         
/* 346 */         if (cry.c.a(g1, j, i) && !bool) {
/* 347 */           ☃.add(new cry.i(this.a, "roof", fx2.b(3), bzm1));
/*     */           
/* 349 */           if (!cry.c.a(g1, j + 1, i)) {
/* 350 */             fx fx3 = fx2.a(bzm1.a(gc.f), 6);
/* 351 */             ☃.add(new cry.i(this.a, "roof_front", fx3, bzm1));
/*     */           } 
/* 353 */           if (!cry.c.a(g1, j - 1, i)) {
/* 354 */             fx fx3 = fx2.a(bzm1.a(gc.f), 0);
/* 355 */             fx3 = fx3.a(bzm1.a(gc.d), 7);
/* 356 */             ☃.add(new cry.i(this.a, "roof_front", fx3, bzm1.a(bzm.c)));
/*     */           } 
/* 358 */           if (!cry.c.a(g1, j, i - 1)) {
/* 359 */             fx fx3 = fx2.a(bzm1.a(gc.e), 1);
/* 360 */             ☃.add(new cry.i(this.a, "roof_front", fx3, bzm1.a(bzm.d)));
/*     */           } 
/* 362 */           if (!cry.c.a(g1, j, i + 1)) {
/* 363 */             fx fx3 = fx2.a(bzm1.a(gc.f), 6);
/* 364 */             fx3 = fx3.a(bzm1.a(gc.d), 6);
/* 365 */             ☃.add(new cry.i(this.a, "roof_front", fx3, bzm1.a(bzm.b)));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 371 */     if (g2 != null) {
/* 372 */       for (i = 0; i < cry.g.a(g1); i++) {
/* 373 */         for (int j = 0; j < cry.g.b(g1); j++) {
/* 374 */           fx fx2 = fx1;
/* 375 */           fx2 = fx2.a(bzm1.a(gc.d), 8 + (i - this.d) * 8);
/* 376 */           fx2 = fx2.a(bzm1.a(gc.f), (j - this.c) * 8);
/*     */ 
/*     */           
/* 379 */           boolean bool = cry.c.a(g2, j, i);
/*     */           
/* 381 */           if (cry.c.a(g1, j, i) && bool) {
/*     */             
/* 383 */             if (!cry.c.a(g1, j + 1, i)) {
/* 384 */               fx fx3 = fx2.a(bzm1.a(gc.f), 7);
/* 385 */               ☃.add(new cry.i(this.a, "small_wall", fx3, bzm1));
/*     */             } 
/* 387 */             if (!cry.c.a(g1, j - 1, i)) {
/* 388 */               fx fx3 = fx2.a(bzm1.a(gc.e), 1);
/* 389 */               fx3 = fx3.a(bzm1.a(gc.d), 6);
/* 390 */               ☃.add(new cry.i(this.a, "small_wall", fx3, bzm1.a(bzm.c)));
/*     */             } 
/* 392 */             if (!cry.c.a(g1, j, i - 1)) {
/* 393 */               fx fx3 = fx2.a(bzm1.a(gc.e), 0);
/* 394 */               fx3 = fx3.a(bzm1.a(gc.c), 1);
/* 395 */               ☃.add(new cry.i(this.a, "small_wall", fx3, bzm1.a(bzm.d)));
/*     */             } 
/* 397 */             if (!cry.c.a(g1, j, i + 1)) {
/* 398 */               fx fx3 = fx2.a(bzm1.a(gc.f), 6);
/* 399 */               fx3 = fx3.a(bzm1.a(gc.d), 7);
/* 400 */               ☃.add(new cry.i(this.a, "small_wall", fx3, bzm1.a(bzm.b)));
/*     */             } 
/*     */             
/* 403 */             if (!cry.c.a(g1, j + 1, i)) {
/* 404 */               if (!cry.c.a(g1, j, i - 1)) {
/* 405 */                 fx fx3 = fx2.a(bzm1.a(gc.f), 7);
/* 406 */                 fx3 = fx3.a(bzm1.a(gc.c), 2);
/* 407 */                 ☃.add(new cry.i(this.a, "small_wall_corner", fx3, bzm1));
/*     */               } 
/* 409 */               if (!cry.c.a(g1, j, i + 1)) {
/* 410 */                 fx fx3 = fx2.a(bzm1.a(gc.f), 8);
/* 411 */                 fx3 = fx3.a(bzm1.a(gc.d), 7);
/* 412 */                 ☃.add(new cry.i(this.a, "small_wall_corner", fx3, bzm1.a(bzm.b)));
/*     */               } 
/*     */             } 
/* 415 */             if (!cry.c.a(g1, j - 1, i)) {
/* 416 */               if (!cry.c.a(g1, j, i - 1)) {
/* 417 */                 fx fx3 = fx2.a(bzm1.a(gc.e), 2);
/* 418 */                 fx3 = fx3.a(bzm1.a(gc.c), 1);
/* 419 */                 ☃.add(new cry.i(this.a, "small_wall_corner", fx3, bzm1.a(bzm.d)));
/*     */               } 
/* 421 */               if (!cry.c.a(g1, j, i + 1)) {
/* 422 */                 fx fx3 = fx2.a(bzm1.a(gc.e), 1);
/* 423 */                 fx3 = fx3.a(bzm1.a(gc.d), 8);
/* 424 */                 ☃.add(new cry.i(this.a, "small_wall_corner", fx3, bzm1.a(bzm.c)));
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 432 */     for (i = 0; i < cry.g.a(g1); i++) {
/* 433 */       for (int j = 0; j < cry.g.b(g1); j++) {
/* 434 */         fx fx2 = fx1;
/* 435 */         fx2 = fx2.a(bzm1.a(gc.d), 8 + (i - this.d) * 8);
/* 436 */         fx2 = fx2.a(bzm1.a(gc.f), (j - this.c) * 8);
/*     */ 
/*     */         
/* 439 */         boolean bool = (g2 != null && cry.c.a(g2, j, i));
/*     */         
/* 441 */         if (cry.c.a(g1, j, i) && !bool) {
/* 442 */           if (!cry.c.a(g1, j + 1, i)) {
/* 443 */             fx fx3 = fx2.a(bzm1.a(gc.f), 6);
/* 444 */             if (!cry.c.a(g1, j, i + 1)) {
/* 445 */               fx fx4 = fx3.a(bzm1.a(gc.d), 6);
/* 446 */               ☃.add(new cry.i(this.a, "roof_corner", fx4, bzm1));
/* 447 */             } else if (cry.c.a(g1, j + 1, i + 1)) {
/* 448 */               fx fx4 = fx3.a(bzm1.a(gc.d), 5);
/* 449 */               ☃.add(new cry.i(this.a, "roof_inner_corner", fx4, bzm1));
/*     */             } 
/* 451 */             if (!cry.c.a(g1, j, i - 1)) {
/* 452 */               ☃.add(new cry.i(this.a, "roof_corner", fx3, bzm1.a(bzm.d)));
/* 453 */             } else if (cry.c.a(g1, j + 1, i - 1)) {
/* 454 */               fx fx4 = fx2.a(bzm1.a(gc.f), 9);
/* 455 */               fx4 = fx4.a(bzm1.a(gc.c), 2);
/* 456 */               ☃.add(new cry.i(this.a, "roof_inner_corner", fx4, bzm1.a(bzm.b)));
/*     */             } 
/*     */           } 
/* 459 */           if (!cry.c.a(g1, j - 1, i)) {
/* 460 */             fx fx3 = fx2.a(bzm1.a(gc.f), 0);
/* 461 */             fx3 = fx3.a(bzm1.a(gc.d), 0);
/* 462 */             if (!cry.c.a(g1, j, i + 1)) {
/* 463 */               fx fx4 = fx3.a(bzm1.a(gc.d), 6);
/* 464 */               ☃.add(new cry.i(this.a, "roof_corner", fx4, bzm1.a(bzm.b)));
/* 465 */             } else if (cry.c.a(g1, j - 1, i + 1)) {
/* 466 */               fx fx4 = fx3.a(bzm1.a(gc.d), 8);
/* 467 */               fx4 = fx4.a(bzm1.a(gc.e), 3);
/* 468 */               ☃.add(new cry.i(this.a, "roof_inner_corner", fx4, bzm1.a(bzm.d)));
/*     */             } 
/* 470 */             if (!cry.c.a(g1, j, i - 1)) {
/* 471 */               ☃.add(new cry.i(this.a, "roof_corner", fx3, bzm1.a(bzm.c)));
/* 472 */             } else if (cry.c.a(g1, j - 1, i - 1)) {
/* 473 */               fx fx4 = fx3.a(bzm1.a(gc.d), 1);
/* 474 */               ☃.add(new cry.i(this.a, "roof_inner_corner", fx4, bzm1.a(bzm.c)));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<cry.i> ☃, cry.e e1) {
/* 483 */     gc gc = e1.a.a(gc.e);
/* 484 */     ☃.add(new cry.i(this.a, "entrance", e1.b.a(gc, 9), e1.a));
/* 485 */     e1.b = e1.b.a(e1.a.a(gc.d), 16);
/*     */   }
/*     */   
/*     */   private void b(List<cry.i> ☃, cry.e e1) {
/* 489 */     ☃.add(new cry.i(this.a, e1.c, e1.b.a(e1.a.a(gc.f), 7), e1.a));
/* 490 */     e1.b = e1.b.a(e1.a.a(gc.d), 8);
/*     */   }
/*     */   
/*     */   private void c(List<cry.i> ☃, cry.e e1) {
/* 494 */     e1.b = e1.b.a(e1.a.a(gc.d), -1);
/* 495 */     ☃.add(new cry.i(this.a, "wall_corner", e1.b, e1.a));
/* 496 */     e1.b = e1.b.a(e1.a.a(gc.d), -7);
/* 497 */     e1.b = e1.b.a(e1.a.a(gc.e), -6);
/* 498 */     e1.a = e1.a.a(bzm.b);
/*     */   }
/*     */   
/*     */   private void d(List<cry.i> ☃, cry.e e1) {
/* 502 */     e1.b = e1.b.a(e1.a.a(gc.d), 6);
/* 503 */     e1.b = e1.b.a(e1.a.a(gc.f), 8);
/* 504 */     e1.a = e1.a.a(bzm.d);
/*     */   }
/*     */   
/*     */   private void a(List<cry.i> ☃, fx fx1, bzm bzm1, gc gc1, cry.b b1) {
/* 508 */     bzm bzm2 = bzm.a;
/* 509 */     String str = b1.a(this.b);
/* 510 */     if (gc1 != gc.f) {
/* 511 */       if (gc1 == gc.c) {
/* 512 */         bzm2 = bzm2.a(bzm.d);
/* 513 */       } else if (gc1 == gc.e) {
/* 514 */         bzm2 = bzm2.a(bzm.c);
/* 515 */       } else if (gc1 == gc.d) {
/* 516 */         bzm2 = bzm2.a(bzm.b);
/*     */       } else {
/*     */         
/* 519 */         str = b1.b(this.b);
/*     */       } 
/*     */     }
/* 522 */     fx fx2 = ctb.a(new fx(1, 0, 0), byg.a, bzm2, 7, 7);
/* 523 */     bzm2 = bzm2.a(bzm1);
/* 524 */     fx2 = fx2.a(bzm1);
/* 525 */     fx fx3 = fx1.b(fx2.u(), 0, fx2.w());
/* 526 */     ☃.add(new cry.i(this.a, str, fx3, bzm2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(List<cry.i> ☃, fx fx1, bzm bzm1, gc gc1, gc gc2, cry.b b1, boolean bool) {
/* 533 */     if (gc2 == gc.f && gc1 == gc.d) {
/*     */ 
/*     */       
/* 536 */       fx fx2 = fx1.a(bzm1.a(gc.f), 1);
/* 537 */       ☃.add(new cry.i(this.a, b1.a(this.b, bool), fx2, bzm1));
/* 538 */     } else if (gc2 == gc.f && gc1 == gc.c) {
/*     */ 
/*     */       
/* 541 */       fx fx2 = fx1.a(bzm1.a(gc.f), 1);
/* 542 */       fx2 = fx2.a(bzm1.a(gc.d), 6);
/* 543 */       ☃.add(new cry.i(this.a, b1.a(this.b, bool), fx2, bzm1, byg.b));
/* 544 */     } else if (gc2 == gc.e && gc1 == gc.c) {
/*     */ 
/*     */       
/* 547 */       fx fx2 = fx1.a(bzm1.a(gc.f), 7);
/* 548 */       fx2 = fx2.a(bzm1.a(gc.d), 6);
/* 549 */       ☃.add(new cry.i(this.a, b1.a(this.b, bool), fx2, bzm1.a(bzm.c)));
/* 550 */     } else if (gc2 == gc.e && gc1 == gc.d) {
/*     */ 
/*     */       
/* 553 */       fx fx2 = fx1.a(bzm1.a(gc.f), 7);
/* 554 */       ☃.add(new cry.i(this.a, b1.a(this.b, bool), fx2, bzm1, byg.c));
/* 555 */     } else if (gc2 == gc.d && gc1 == gc.f) {
/*     */ 
/*     */       
/* 558 */       fx fx2 = fx1.a(bzm1.a(gc.f), 1);
/* 559 */       ☃.add(new cry.i(this.a, b1.a(this.b, bool), fx2, bzm1.a(bzm.b), byg.b));
/* 560 */     } else if (gc2 == gc.d && gc1 == gc.e) {
/*     */ 
/*     */       
/* 563 */       fx fx2 = fx1.a(bzm1.a(gc.f), 7);
/* 564 */       ☃.add(new cry.i(this.a, b1.a(this.b, bool), fx2, bzm1.a(bzm.b)));
/* 565 */     } else if (gc2 == gc.c && gc1 == gc.e) {
/*     */ 
/*     */       
/* 568 */       fx fx2 = fx1.a(bzm1.a(gc.f), 7);
/* 569 */       fx2 = fx2.a(bzm1.a(gc.d), 6);
/* 570 */       ☃.add(new cry.i(this.a, b1.a(this.b, bool), fx2, bzm1.a(bzm.b), byg.c));
/* 571 */     } else if (gc2 == gc.c && gc1 == gc.f) {
/*     */ 
/*     */       
/* 574 */       fx fx2 = fx1.a(bzm1.a(gc.f), 1);
/* 575 */       fx2 = fx2.a(bzm1.a(gc.d), 6);
/* 576 */       ☃.add(new cry.i(this.a, b1.a(this.b, bool), fx2, bzm1.a(bzm.d)));
/* 577 */     } else if (gc2 == gc.d && gc1 == gc.c) {
/*     */ 
/*     */ 
/*     */       
/* 581 */       fx fx2 = fx1.a(bzm1.a(gc.f), 1);
/* 582 */       fx2 = fx2.a(bzm1.a(gc.c), 8);
/* 583 */       ☃.add(new cry.i(this.a, b1.b(this.b, bool), fx2, bzm1));
/* 584 */     } else if (gc2 == gc.c && gc1 == gc.d) {
/*     */ 
/*     */ 
/*     */       
/* 588 */       fx fx2 = fx1.a(bzm1.a(gc.f), 7);
/* 589 */       fx2 = fx2.a(bzm1.a(gc.d), 14);
/* 590 */       ☃.add(new cry.i(this.a, b1.b(this.b, bool), fx2, bzm1.a(bzm.c)));
/* 591 */     } else if (gc2 == gc.e && gc1 == gc.f) {
/*     */       
/* 593 */       fx fx2 = fx1.a(bzm1.a(gc.f), 15);
/* 594 */       ☃.add(new cry.i(this.a, b1.b(this.b, bool), fx2, bzm1.a(bzm.b)));
/* 595 */     } else if (gc2 == gc.f && gc1 == gc.e) {
/*     */       
/* 597 */       fx fx2 = fx1.a(bzm1.a(gc.e), 7);
/* 598 */       fx2 = fx2.a(bzm1.a(gc.d), 6);
/* 599 */       ☃.add(new cry.i(this.a, b1.b(this.b, bool), fx2, bzm1.a(bzm.d)));
/* 600 */     } else if (gc2 == gc.b && gc1 == gc.f) {
/*     */       
/* 602 */       fx fx2 = fx1.a(bzm1.a(gc.f), 15);
/* 603 */       ☃.add(new cry.i(this.a, b1.c(this.b), fx2, bzm1.a(bzm.b)));
/* 604 */     } else if (gc2 == gc.b && gc1 == gc.d) {
/*     */ 
/*     */ 
/*     */       
/* 608 */       fx fx2 = fx1.a(bzm1.a(gc.f), 1);
/* 609 */       fx2 = fx2.a(bzm1.a(gc.c), 0);
/* 610 */       ☃.add(new cry.i(this.a, b1.c(this.b), fx2, bzm1));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<cry.i> ☃, fx fx1, bzm bzm1, gc gc1, gc gc2, cry.b b1) {
/* 615 */     int i = 0;
/* 616 */     int j = 0;
/* 617 */     bzm bzm2 = bzm1;
/* 618 */     byg byg = byg.a;
/*     */ 
/*     */ 
/*     */     
/* 622 */     if (gc2 == gc.f && gc1 == gc.d) {
/*     */ 
/*     */       
/* 625 */       i = -7;
/* 626 */     } else if (gc2 == gc.f && gc1 == gc.c) {
/*     */ 
/*     */       
/* 629 */       i = -7;
/* 630 */       j = 6;
/* 631 */       byg = byg.b;
/* 632 */     } else if (gc2 == gc.c && gc1 == gc.f) {
/*     */ 
/*     */ 
/*     */       
/* 636 */       i = 1;
/* 637 */       j = 14;
/* 638 */       bzm2 = bzm1.a(bzm.d);
/* 639 */     } else if (gc2 == gc.c && gc1 == gc.e) {
/*     */ 
/*     */ 
/*     */       
/* 643 */       i = 7;
/* 644 */       j = 14;
/* 645 */       bzm2 = bzm1.a(bzm.d);
/* 646 */       byg = byg.b;
/* 647 */     } else if (gc2 == gc.d && gc1 == gc.e) {
/*     */ 
/*     */ 
/*     */       
/* 651 */       i = 7;
/* 652 */       j = -8;
/* 653 */       bzm2 = bzm1.a(bzm.b);
/* 654 */     } else if (gc2 == gc.d && gc1 == gc.f) {
/*     */ 
/*     */ 
/*     */       
/* 658 */       i = 1;
/* 659 */       j = -8;
/* 660 */       bzm2 = bzm1.a(bzm.b);
/* 661 */       byg = byg.b;
/* 662 */     } else if (gc2 == gc.e && gc1 == gc.c) {
/*     */ 
/*     */       
/* 665 */       i = 15;
/* 666 */       j = 6;
/* 667 */       bzm2 = bzm1.a(bzm.c);
/* 668 */     } else if (gc2 == gc.e && gc1 == gc.d) {
/*     */ 
/*     */       
/* 671 */       i = 15;
/* 672 */       byg = byg.c;
/*     */     } 
/*     */     
/* 675 */     fx fx2 = fx1.a(bzm1.a(gc.f), i);
/* 676 */     fx2 = fx2.a(bzm1.a(gc.d), j);
/* 677 */     ☃.add(new cry.i(this.a, b1.d(this.b), fx2, bzm2, byg));
/*     */   }
/*     */   
/*     */   private void a(List<cry.i> ☃, fx fx1, bzm bzm1, cry.b b1) {
/* 681 */     fx fx2 = fx1.a(bzm1.a(gc.f), 1);
/* 682 */     ☃.add(new cry.i(this.a, b1.e(this.b), fx2, bzm1, byg.a));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cry$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */