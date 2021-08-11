/*     */ import java.text.DecimalFormat;
/*     */ import java.text.DecimalFormatSymbols;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dqz
/*     */   extends dot
/*     */ {
/*  26 */   private static final nr a = new of("structure_block.structure_name");
/*  27 */   private static final nr b = new of("structure_block.position");
/*  28 */   private static final nr c = new of("structure_block.size");
/*  29 */   private static final nr p = new of("structure_block.integrity");
/*  30 */   private static final nr q = new of("structure_block.custom_data");
/*  31 */   private static final nr r = new of("structure_block.include_entities");
/*  32 */   private static final nr s = new of("structure_block.detect_size");
/*  33 */   private static final nr t = new of("structure_block.show_air");
/*  34 */   private static final nr u = new of("structure_block.show_boundingbox");
/*     */   
/*     */   private final cdj v;
/*  37 */   private byg w = byg.a;
/*  38 */   private bzm x = bzm.a;
/*  39 */   private cfo y = cfo.d;
/*     */   
/*     */   private boolean z;
/*     */   
/*     */   private boolean A;
/*     */   private boolean B;
/*     */   private dlq C;
/*     */   private dlq D;
/*     */   private dlq E;
/*     */   private dlq F;
/*     */   private dlq G;
/*     */   private dlq H;
/*     */   private dlq I;
/*     */   private dlq J;
/*     */   private dlq K;
/*     */   private dlq L;
/*     */   private dlj M;
/*     */   private dlj N;
/*     */   private dlj O;
/*     */   private dlj P;
/*     */   private dlj Q;
/*     */   private dlj R;
/*     */   private dlj S;
/*     */   private dlj T;
/*     */   private dlj U;
/*     */   private dlj V;
/*     */   private dlj W;
/*     */   private dlj X;
/*     */   private dlj Y;
/*     */   private dlj Z;
/*  69 */   private final DecimalFormat aa = new DecimalFormat("0.0###");
/*     */   
/*     */   public dqz(cdj ☃) {
/*  72 */     super(new of(bup.mY.i()));
/*  73 */     this.v = ☃;
/*  74 */     this.aa.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  79 */     this.C.a();
/*  80 */     this.D.a();
/*  81 */     this.E.a();
/*  82 */     this.F.a();
/*  83 */     this.G.a();
/*  84 */     this.H.a();
/*  85 */     this.I.a();
/*  86 */     this.J.a();
/*  87 */     this.K.a();
/*  88 */     this.L.a();
/*     */   }
/*     */   
/*     */   private void h() {
/*  92 */     if (a(cdj.a.a)) {
/*  93 */       this.i.a((dot)null);
/*     */     }
/*     */   }
/*     */   
/*     */   private void i() {
/*  98 */     this.v.b(this.w);
/*  99 */     this.v.b(this.x);
/* 100 */     this.v.a(this.y);
/* 101 */     this.v.a(this.z);
/* 102 */     this.v.d(this.A);
/* 103 */     this.v.e(this.B);
/* 104 */     this.i.a((dot)null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 109 */     this.i.m.a(true);
/* 110 */     this.M = a(new dlj(this.k / 2 - 4 - 150, 210, 150, 20, nq.c, ☃ -> h()));
/* 111 */     this.N = a(new dlj(this.k / 2 + 4, 210, 150, 20, nq.d, ☃ -> i()));
/*     */     
/* 113 */     this.O = a(new dlj(this.k / 2 + 4 + 100, 185, 50, 20, new of("structure_block.button.save"), ☃ -> {
/*     */             if (this.v.x() == cfo.a) {
/*     */               a(cdj.a.b);
/*     */               this.i.a((dot)null);
/*     */             } 
/*     */           }));
/* 119 */     this.P = a(new dlj(this.k / 2 + 4 + 100, 185, 50, 20, new of("structure_block.button.load"), ☃ -> {
/*     */             if (this.v.x() == cfo.b) {
/*     */               a(cdj.a.c);
/*     */               this.i.a((dot)null);
/*     */             } 
/*     */           }));
/* 125 */     this.U = a(new dlj(this.k / 2 - 4 - 150, 185, 50, 20, new oe("MODE"), ☃ -> {
/*     */             this.v.y();
/*     */             p();
/*     */           }));
/* 129 */     this.V = a(new dlj(this.k / 2 + 4 + 100, 120, 50, 20, new of("structure_block.button.detect_size"), ☃ -> {
/*     */             if (this.v.x() == cfo.a) {
/*     */               a(cdj.a.d);
/*     */               this.i.a((dot)null);
/*     */             } 
/*     */           }));
/* 135 */     this.W = a(new dlj(this.k / 2 + 4 + 100, 160, 50, 20, new oe("ENTITIES"), ☃ -> {
/*     */             this.v.a(!this.v.z());
/*     */             k();
/*     */           }));
/* 139 */     this.X = a(new dlj(this.k / 2 - 20, 185, 40, 20, new oe("MIRROR"), ☃ -> {
/*     */             switch (null.a[this.v.k().ordinal()]) {
/*     */               case 1:
/*     */                 this.v.b(byg.b);
/*     */                 break;
/*     */               case 2:
/*     */                 this.v.b(byg.c);
/*     */                 break;
/*     */               case 3:
/*     */                 this.v.b(byg.a);
/*     */                 break;
/*     */             } 
/*     */             n();
/*     */           }));
/* 153 */     this.Y = a(new dlj(this.k / 2 + 4 + 100, 80, 50, 20, new oe("SHOWAIR"), ☃ -> {
/*     */             this.v.d(!this.v.H());
/*     */             l();
/*     */           }));
/* 157 */     this.Z = a(new dlj(this.k / 2 + 4 + 100, 80, 50, 20, new oe("SHOWBB"), ☃ -> {
/*     */             this.v.e(!this.v.I());
/*     */             
/*     */             m();
/*     */           }));
/* 162 */     this.Q = a(new dlj(this.k / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, new oe("0"), ☃ -> {
/*     */             this.v.b(bzm.a);
/*     */             o();
/*     */           }));
/* 166 */     this.R = a(new dlj(this.k / 2 - 1 - 40 - 20, 185, 40, 20, new oe("90"), ☃ -> {
/*     */             this.v.b(bzm.b);
/*     */             o();
/*     */           }));
/* 170 */     this.S = a(new dlj(this.k / 2 + 1 + 20, 185, 40, 20, new oe("180"), ☃ -> {
/*     */             this.v.b(bzm.c);
/*     */             o();
/*     */           }));
/* 174 */     this.T = a(new dlj(this.k / 2 + 1 + 40 + 1 + 20, 185, 40, 20, new oe("270"), ☃ -> {
/*     */             this.v.b(bzm.d);
/*     */             
/*     */             o();
/*     */           }));
/* 179 */     this.C = new dlq(this, this.o, this.k / 2 - 152, 40, 300, 20, new of("structure_block.structure_name"))
/*     */       {
/*     */         public boolean a(char ☃, int i)
/*     */         {
/* 183 */           if (!dqz.a(this.a, b(), ☃, n())) {
/* 184 */             return false;
/*     */           }
/* 186 */           return super.a(☃, i);
/*     */         }
/*     */       };
/* 189 */     this.C.k(64);
/* 190 */     this.C.a(this.v.d());
/* 191 */     this.e.add(this.C);
/*     */     
/* 193 */     fx ☃ = this.v.h();
/* 194 */     this.D = new dlq(this.o, this.k / 2 - 152, 80, 80, 20, new of("structure_block.position.x"));
/* 195 */     this.D.k(15);
/* 196 */     this.D.a(Integer.toString(☃.u()));
/* 197 */     this.e.add(this.D);
/* 198 */     this.E = new dlq(this.o, this.k / 2 - 72, 80, 80, 20, new of("structure_block.position.y"));
/* 199 */     this.E.k(15);
/* 200 */     this.E.a(Integer.toString(☃.v()));
/* 201 */     this.e.add(this.E);
/* 202 */     this.F = new dlq(this.o, this.k / 2 + 8, 80, 80, 20, new of("structure_block.position.z"));
/* 203 */     this.F.k(15);
/* 204 */     this.F.a(Integer.toString(☃.w()));
/* 205 */     this.e.add(this.F);
/*     */     
/* 207 */     fx fx1 = this.v.j();
/* 208 */     this.G = new dlq(this.o, this.k / 2 - 152, 120, 80, 20, new of("structure_block.size.x"));
/* 209 */     this.G.k(15);
/* 210 */     this.G.a(Integer.toString(fx1.u()));
/* 211 */     this.e.add(this.G);
/* 212 */     this.H = new dlq(this.o, this.k / 2 - 72, 120, 80, 20, new of("structure_block.size.y"));
/* 213 */     this.H.k(15);
/* 214 */     this.H.a(Integer.toString(fx1.v()));
/* 215 */     this.e.add(this.H);
/* 216 */     this.I = new dlq(this.o, this.k / 2 + 8, 120, 80, 20, new of("structure_block.size.z"));
/* 217 */     this.I.k(15);
/* 218 */     this.I.a(Integer.toString(fx1.w()));
/* 219 */     this.e.add(this.I);
/*     */     
/* 221 */     this.J = new dlq(this.o, this.k / 2 - 152, 120, 80, 20, new of("structure_block.integrity.integrity"));
/* 222 */     this.J.k(15);
/* 223 */     this.J.a(this.aa.format(this.v.A()));
/* 224 */     this.e.add(this.J);
/* 225 */     this.K = new dlq(this.o, this.k / 2 - 72, 120, 80, 20, new of("structure_block.integrity.seed"));
/* 226 */     this.K.k(31);
/* 227 */     this.K.a(Long.toString(this.v.B()));
/* 228 */     this.e.add(this.K);
/*     */     
/* 230 */     this.L = new dlq(this.o, this.k / 2 - 152, 120, 240, 20, new of("structure_block.custom_data"));
/* 231 */     this.L.k(128);
/* 232 */     this.L.a(this.v.m());
/* 233 */     this.e.add(this.L);
/*     */     
/* 235 */     this.w = this.v.k();
/* 236 */     n();
/* 237 */     this.x = this.v.l();
/* 238 */     o();
/* 239 */     this.y = this.v.x();
/* 240 */     p();
/* 241 */     this.z = this.v.z();
/* 242 */     k();
/* 243 */     this.A = this.v.H();
/* 244 */     l();
/* 245 */     this.B = this.v.I();
/* 246 */     m();
/*     */     
/* 248 */     b(this.C);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/* 253 */     String str1 = this.C.b();
/* 254 */     String str2 = this.D.b();
/* 255 */     String str3 = this.E.b();
/* 256 */     String str4 = this.F.b();
/* 257 */     String str5 = this.G.b();
/* 258 */     String str6 = this.H.b();
/* 259 */     String str7 = this.I.b();
/* 260 */     String str8 = this.J.b();
/* 261 */     String str9 = this.K.b();
/* 262 */     String str10 = this.L.b();
/*     */     
/* 264 */     b(☃, i, j);
/*     */     
/* 266 */     this.C.a(str1);
/* 267 */     this.D.a(str2);
/* 268 */     this.E.a(str3);
/* 269 */     this.F.a(str4);
/* 270 */     this.G.a(str5);
/* 271 */     this.H.a(str6);
/* 272 */     this.I.a(str7);
/* 273 */     this.J.a(str8);
/* 274 */     this.K.a(str9);
/* 275 */     this.L.a(str10);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 280 */     this.i.m.a(false);
/*     */   }
/*     */   
/*     */   private void k() {
/* 284 */     this.W.a(nq.a(!this.v.z()));
/*     */   }
/*     */   
/*     */   private void l() {
/* 288 */     this.Y.a(nq.a(this.v.H()));
/*     */   }
/*     */   
/*     */   private void m() {
/* 292 */     this.Z.a(nq.a(this.v.I()));
/*     */   }
/*     */   
/*     */   private void n() {
/* 296 */     byg ☃ = this.v.k();
/* 297 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 299 */         this.X.a(new oe("|"));
/*     */         break;
/*     */       case 2:
/* 302 */         this.X.a(new oe("< >"));
/*     */         break;
/*     */       case 3:
/* 305 */         this.X.a(new oe("^ v"));
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void o() {
/* 311 */     this.Q.o = true;
/* 312 */     this.R.o = true;
/* 313 */     this.S.o = true;
/* 314 */     this.T.o = true;
/*     */     
/* 316 */     switch (null.b[this.v.l().ordinal()]) {
/*     */       case 1:
/* 318 */         this.Q.o = false;
/*     */         break;
/*     */       case 2:
/* 321 */         this.S.o = false;
/*     */         break;
/*     */       case 3:
/* 324 */         this.T.o = false;
/*     */         break;
/*     */       case 4:
/* 327 */         this.R.o = false;
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void p() {
/* 333 */     this.C.i(false);
/* 334 */     this.D.i(false);
/* 335 */     this.E.i(false);
/* 336 */     this.F.i(false);
/* 337 */     this.G.i(false);
/* 338 */     this.H.i(false);
/* 339 */     this.I.i(false);
/* 340 */     this.J.i(false);
/* 341 */     this.K.i(false);
/* 342 */     this.L.i(false);
/*     */     
/* 344 */     this.O.p = false;
/* 345 */     this.P.p = false;
/* 346 */     this.V.p = false;
/* 347 */     this.W.p = false;
/* 348 */     this.X.p = false;
/* 349 */     this.Q.p = false;
/* 350 */     this.R.p = false;
/* 351 */     this.S.p = false;
/* 352 */     this.T.p = false;
/* 353 */     this.Y.p = false;
/* 354 */     this.Z.p = false;
/*     */     
/* 356 */     switch (null.c[this.v.x().ordinal()]) {
/*     */       case 1:
/* 358 */         this.C.i(true);
/* 359 */         this.D.i(true);
/* 360 */         this.E.i(true);
/* 361 */         this.F.i(true);
/* 362 */         this.G.i(true);
/* 363 */         this.H.i(true);
/* 364 */         this.I.i(true);
/* 365 */         this.O.p = true;
/* 366 */         this.V.p = true;
/* 367 */         this.W.p = true;
/* 368 */         this.Y.p = true;
/*     */         break;
/*     */       case 2:
/* 371 */         this.C.i(true);
/* 372 */         this.D.i(true);
/* 373 */         this.E.i(true);
/* 374 */         this.F.i(true);
/* 375 */         this.J.i(true);
/* 376 */         this.K.i(true);
/* 377 */         this.P.p = true;
/* 378 */         this.W.p = true;
/* 379 */         this.X.p = true;
/* 380 */         this.Q.p = true;
/* 381 */         this.R.p = true;
/* 382 */         this.S.p = true;
/* 383 */         this.T.p = true;
/* 384 */         this.Z.p = true;
/* 385 */         o();
/*     */         break;
/*     */       case 3:
/* 388 */         this.C.i(true);
/*     */         break;
/*     */       case 4:
/* 391 */         this.L.i(true);
/*     */         break;
/*     */     } 
/* 394 */     this.U.a(new of("structure_block.mode." + this.v.x().a()));
/*     */   }
/*     */   
/*     */   private boolean a(cdj.a ☃) {
/* 398 */     fx fx1 = new fx(d(this.D.b()), d(this.E.b()), d(this.F.b()));
/* 399 */     fx fx2 = new fx(d(this.G.b()), d(this.H.b()), d(this.I.b()));
/* 400 */     float f = c(this.J.b());
/* 401 */     long l = b(this.K.b());
/* 402 */     this.i.w().a(new to(this.v.o(), ☃, this.v.x(), this.C.b(), fx1, fx2, this.v.k(), this.v.l(), this.L.b(), this.v.z(), this.v.H(), this.v.I(), f, l));
/* 403 */     return true;
/*     */   }
/*     */   
/*     */   private long b(String ☃) {
/*     */     try {
/* 408 */       return Long.valueOf(☃).longValue();
/* 409 */     } catch (NumberFormatException numberFormatException) {
/* 410 */       return 0L;
/*     */     } 
/*     */   }
/*     */   
/*     */   private float c(String ☃) {
/*     */     try {
/* 416 */       return Float.valueOf(☃).floatValue();
/* 417 */     } catch (NumberFormatException numberFormatException) {
/* 418 */       return 1.0F;
/*     */     } 
/*     */   }
/*     */   
/*     */   private int d(String ☃) {
/*     */     try {
/* 424 */       return Integer.parseInt(☃);
/* 425 */     } catch (NumberFormatException numberFormatException) {
/* 426 */       return 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/* 432 */     i();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 437 */     if (super.a(☃, i, j)) {
/* 438 */       return true;
/*     */     }
/*     */     
/* 441 */     if (☃ == 257 || ☃ == 335) {
/* 442 */       h();
/* 443 */       return true;
/*     */     } 
/*     */     
/* 446 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 451 */     a(☃);
/*     */     
/* 453 */     cfo cfo1 = this.v.x();
/* 454 */     a(☃, this.o, this.d, this.k / 2, 10, 16777215);
/*     */     
/* 456 */     if (cfo1 != cfo.d) {
/* 457 */       b(☃, this.o, a, this.k / 2 - 153, 30, 10526880);
/* 458 */       this.C.a(☃, i, j, f);
/*     */     } 
/*     */     
/* 461 */     if (cfo1 == cfo.b || cfo1 == cfo.a) {
/* 462 */       b(☃, this.o, b, this.k / 2 - 153, 70, 10526880);
/* 463 */       this.D.a(☃, i, j, f);
/* 464 */       this.E.a(☃, i, j, f);
/* 465 */       this.F.a(☃, i, j, f);
/*     */       
/* 467 */       b(☃, this.o, r, this.k / 2 + 154 - this.o.a(r), 150, 10526880);
/*     */     } 
/*     */     
/* 470 */     if (cfo1 == cfo.a) {
/* 471 */       b(☃, this.o, c, this.k / 2 - 153, 110, 10526880);
/* 472 */       this.G.a(☃, i, j, f);
/* 473 */       this.H.a(☃, i, j, f);
/* 474 */       this.I.a(☃, i, j, f);
/*     */       
/* 476 */       b(☃, this.o, s, this.k / 2 + 154 - this.o.a(s), 110, 10526880);
/* 477 */       b(☃, this.o, t, this.k / 2 + 154 - this.o.a(t), 70, 10526880);
/*     */     } 
/*     */     
/* 480 */     if (cfo1 == cfo.b) {
/* 481 */       b(☃, this.o, p, this.k / 2 - 153, 110, 10526880);
/* 482 */       this.J.a(☃, i, j, f);
/* 483 */       this.K.a(☃, i, j, f);
/*     */       
/* 485 */       b(☃, this.o, u, this.k / 2 + 154 - this.o.a(u), 70, 10526880);
/*     */     } 
/*     */     
/* 488 */     if (cfo1 == cfo.d) {
/* 489 */       b(☃, this.o, q, this.k / 2 - 153, 110, 10526880);
/* 490 */       this.L.a(☃, i, j, f);
/*     */     } 
/*     */     
/* 493 */     b(☃, this.o, cfo1.b(), this.k / 2 - 153, 174, 10526880);
/*     */     
/* 495 */     super.a(☃, i, j, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ay_() {
/* 500 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */