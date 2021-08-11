/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eay
/*     */ {
/*  30 */   private final ekc[] a = new ekc[2];
/*  31 */   private final ekc[] b = new ekc[2];
/*     */   private ekc c;
/*     */   
/*     */   protected void a() {
/*  35 */     this.a[0] = djz.C().ar().b().b(bup.B.n()).e();
/*  36 */     this.a[1] = els.c.c();
/*  37 */     this.b[0] = djz.C().ar().b().b(bup.A.n()).e();
/*  38 */     this.b[1] = els.d.c();
/*  39 */     this.c = els.e.c();
/*     */   }
/*     */   
/*     */   private static boolean a(brc ☃, fx fx1, gc gc1, cux cux1) {
/*  43 */     fx fx2 = fx1.a(gc1);
/*  44 */     cux cux2 = ☃.b(fx2);
/*     */     
/*  46 */     return cux2.a().a(cux1.a());
/*     */   }
/*     */   
/*     */   private static boolean a(brc ☃, gc gc1, float f, fx fx1, ceh ceh1) {
/*  50 */     if (ceh1.l()) {
/*  51 */       ddh ddh1 = dde.a(0.0D, 0.0D, 0.0D, 1.0D, f, 1.0D);
/*  52 */       ddh ddh2 = ceh1.c(☃, fx1);
/*  53 */       return dde.a(ddh1, ddh2, gc1);
/*     */     } 
/*  55 */     return false;
/*     */   }
/*     */   
/*     */   private static boolean a(brc ☃, fx fx1, gc gc1, float f) {
/*  59 */     fx fx2 = fx1.a(gc1);
/*  60 */     ceh ceh = ☃.d_(fx2);
/*  61 */     return a(☃, gc1, f, fx2, ceh);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean a(brc ☃, fx fx1, ceh ceh1, gc gc1) {
/*  67 */     return a(☃, gc1.f(), 1.0F, fx1, ceh1);
/*     */   }
/*     */   
/*     */   public static boolean a(bra ☃, fx fx1, cux cux1, ceh ceh1, gc gc1) {
/*  71 */     return (!a(☃, fx1, ceh1, gc1) && !a(☃, fx1, gc1, cux1));
/*     */   }
/*     */   
/*     */   public boolean a(bra ☃, fx fx1, dfq dfq1, cux cux1) {
/*  75 */     boolean bool1 = cux1.a(aef.c);
/*  76 */     ekc[] arrayOfEkc = bool1 ? this.a : this.b;
/*     */     
/*  78 */     ceh ceh = ☃.d_(fx1);
/*     */     
/*  80 */     int i = bool1 ? 16777215 : dzr.c(☃, fx1);
/*  81 */     float f1 = (i >> 16 & 0xFF) / 255.0F;
/*  82 */     float f2 = (i >> 8 & 0xFF) / 255.0F;
/*  83 */     float f3 = (i & 0xFF) / 255.0F;
/*  84 */     boolean bool2 = !a(☃, fx1, gc.b, cux1);
/*  85 */     boolean bool3 = (a(☃, fx1, cux1, ceh, gc.a) && !a(☃, fx1, gc.a, 0.8888889F));
/*     */     
/*  87 */     boolean bool4 = a(☃, fx1, cux1, ceh, gc.c);
/*  88 */     boolean bool5 = a(☃, fx1, cux1, ceh, gc.d);
/*  89 */     boolean bool6 = a(☃, fx1, cux1, ceh, gc.e);
/*  90 */     boolean bool7 = a(☃, fx1, cux1, ceh, gc.f);
/*     */     
/*  92 */     if (!bool2 && !bool3 && !bool7 && !bool6 && !bool4 && !bool5) {
/*  93 */       return false;
/*     */     }
/*     */     
/*  96 */     boolean bool8 = false;
/*  97 */     float f4 = ☃.a(gc.a, true);
/*  98 */     float f5 = ☃.a(gc.b, true);
/*  99 */     float f6 = ☃.a(gc.c, true);
/* 100 */     float f7 = ☃.a(gc.e, true);
/*     */     
/* 102 */     float f8 = a(☃, fx1, cux1.a());
/* 103 */     float f9 = a(☃, fx1.e(), cux1.a());
/* 104 */     float f10 = a(☃, fx1.g().e(), cux1.a());
/* 105 */     float f11 = a(☃, fx1.g(), cux1.a());
/*     */     
/* 107 */     double d1 = (fx1.u() & 0xF);
/* 108 */     double d2 = (fx1.v() & 0xF);
/* 109 */     double d3 = (fx1.w() & 0xF);
/*     */     
/* 111 */     float f12 = 0.001F;
/* 112 */     float f13 = bool3 ? 0.001F : 0.0F;
/*     */     
/* 114 */     if (bool2 && !a(☃, fx1, gc.b, Math.min(Math.min(f8, f9), Math.min(f10, f11)))) {
/* 115 */       bool8 = true;
/*     */       
/* 117 */       f8 -= 0.001F;
/* 118 */       f9 -= 0.001F;
/* 119 */       f10 -= 0.001F;
/* 120 */       f11 -= 0.001F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 131 */       dcn dcn = cux1.c(☃, fx1);
/* 132 */       if (dcn.b == 0.0D && dcn.d == 0.0D) {
/* 133 */         ekc ekc1 = arrayOfEkc[0];
/* 134 */         f14 = ekc1.a(0.0D);
/* 135 */         f18 = ekc1.b(0.0D);
/* 136 */         f15 = f14;
/* 137 */         f19 = ekc1.b(16.0D);
/* 138 */         f16 = ekc1.a(16.0D);
/* 139 */         f20 = f19;
/* 140 */         f17 = f16;
/* 141 */         f21 = f18;
/*     */       } else {
/* 143 */         ekc ekc1 = arrayOfEkc[1];
/* 144 */         float f30 = (float)afm.d(dcn.d, dcn.b) - 1.5707964F;
/* 145 */         float f31 = afm.a(f30) * 0.25F;
/* 146 */         float f32 = afm.b(f30) * 0.25F;
/* 147 */         float f33 = 8.0F;
/* 148 */         f14 = ekc1.a((8.0F + (-f32 - f31) * 16.0F));
/* 149 */         f18 = ekc1.b((8.0F + (-f32 + f31) * 16.0F));
/* 150 */         f15 = ekc1.a((8.0F + (-f32 + f31) * 16.0F));
/* 151 */         f19 = ekc1.b((8.0F + (f32 + f31) * 16.0F));
/* 152 */         f16 = ekc1.a((8.0F + (f32 + f31) * 16.0F));
/* 153 */         f20 = ekc1.b((8.0F + (f32 - f31) * 16.0F));
/* 154 */         f17 = ekc1.a((8.0F + (f32 - f31) * 16.0F));
/* 155 */         f21 = ekc1.b((8.0F + (-f32 - f31) * 16.0F));
/*     */       } 
/*     */       
/* 158 */       float f22 = (f14 + f15 + f16 + f17) / 4.0F;
/* 159 */       float f23 = (f18 + f19 + f20 + f21) / 4.0F;
/*     */       
/* 161 */       float f24 = arrayOfEkc[0].f() / (arrayOfEkc[0].i() - arrayOfEkc[0].h());
/* 162 */       float f25 = arrayOfEkc[0].g() / (arrayOfEkc[0].k() - arrayOfEkc[0].j());
/* 163 */       float f26 = 4.0F / Math.max(f25, f24);
/*     */       
/* 165 */       float f14 = afm.g(f26, f14, f22);
/* 166 */       float f15 = afm.g(f26, f15, f22);
/* 167 */       float f16 = afm.g(f26, f16, f22);
/* 168 */       float f17 = afm.g(f26, f17, f22);
/* 169 */       float f18 = afm.g(f26, f18, f23);
/* 170 */       float f19 = afm.g(f26, f19, f23);
/* 171 */       float f20 = afm.g(f26, f20, f23);
/* 172 */       float f21 = afm.g(f26, f21, f23);
/*     */       
/* 174 */       int k = a(☃, fx1);
/* 175 */       float f27 = f5 * f1;
/* 176 */       float f28 = f5 * f2;
/* 177 */       float f29 = f5 * f3;
/*     */       
/* 179 */       a(dfq1, d1 + 0.0D, d2 + f8, d3 + 0.0D, f27, f28, f29, f14, f18, k);
/* 180 */       a(dfq1, d1 + 0.0D, d2 + f9, d3 + 1.0D, f27, f28, f29, f15, f19, k);
/* 181 */       a(dfq1, d1 + 1.0D, d2 + f10, d3 + 1.0D, f27, f28, f29, f16, f20, k);
/* 182 */       a(dfq1, d1 + 1.0D, d2 + f11, d3 + 0.0D, f27, f28, f29, f17, f21, k);
/*     */       
/* 184 */       if (cux1.b(☃, fx1.b())) {
/*     */         
/* 186 */         a(dfq1, d1 + 0.0D, d2 + f8, d3 + 0.0D, f27, f28, f29, f14, f18, k);
/* 187 */         a(dfq1, d1 + 1.0D, d2 + f11, d3 + 0.0D, f27, f28, f29, f17, f21, k);
/* 188 */         a(dfq1, d1 + 1.0D, d2 + f10, d3 + 1.0D, f27, f28, f29, f16, f20, k);
/* 189 */         a(dfq1, d1 + 0.0D, d2 + f9, d3 + 1.0D, f27, f28, f29, f15, f19, k);
/*     */       } 
/*     */     } 
/*     */     
/* 193 */     if (bool3) {
/* 194 */       float f14 = arrayOfEkc[0].h();
/* 195 */       float f15 = arrayOfEkc[0].i();
/* 196 */       float f16 = arrayOfEkc[0].j();
/* 197 */       float f17 = arrayOfEkc[0].k();
/*     */       
/* 199 */       int k = a(☃, fx1.c());
/* 200 */       float f18 = f4 * f1;
/* 201 */       float f19 = f4 * f2;
/* 202 */       float f20 = f4 * f3;
/*     */       
/* 204 */       a(dfq1, d1, d2 + f13, d3 + 1.0D, f18, f19, f20, f14, f17, k);
/* 205 */       a(dfq1, d1, d2 + f13, d3, f18, f19, f20, f14, f16, k);
/* 206 */       a(dfq1, d1 + 1.0D, d2 + f13, d3, f18, f19, f20, f15, f16, k);
/* 207 */       a(dfq1, d1 + 1.0D, d2 + f13, d3 + 1.0D, f18, f19, f20, f15, f17, k);
/* 208 */       bool8 = true;
/*     */     } 
/*     */     
/* 211 */     for (int j = 0; j < 4; j++) {
/*     */       float f14;
/*     */       
/*     */       float f15;
/*     */       double d4;
/*     */       double d5;
/*     */       double d6;
/*     */       double d7;
/*     */       gc gc;
/*     */       boolean bool;
/* 221 */       if (j == 0) {
/* 222 */         f14 = f8;
/* 223 */         f15 = f11;
/* 224 */         d4 = d1;
/* 225 */         d6 = d1 + 1.0D;
/* 226 */         d5 = d3 + 0.0010000000474974513D;
/* 227 */         d7 = d3 + 0.0010000000474974513D;
/* 228 */         gc = gc.c;
/* 229 */         bool = bool4;
/* 230 */       } else if (j == 1) {
/* 231 */         f14 = f10;
/* 232 */         f15 = f9;
/* 233 */         d4 = d1 + 1.0D;
/* 234 */         d6 = d1;
/* 235 */         d5 = d3 + 1.0D - 0.0010000000474974513D;
/* 236 */         d7 = d3 + 1.0D - 0.0010000000474974513D;
/* 237 */         gc = gc.d;
/* 238 */         bool = bool5;
/* 239 */       } else if (j == 2) {
/* 240 */         f14 = f9;
/* 241 */         f15 = f8;
/* 242 */         d4 = d1 + 0.0010000000474974513D;
/* 243 */         d6 = d1 + 0.0010000000474974513D;
/* 244 */         d5 = d3 + 1.0D;
/* 245 */         d7 = d3;
/* 246 */         gc = gc.e;
/* 247 */         bool = bool6;
/*     */       } else {
/* 249 */         f14 = f11;
/* 250 */         f15 = f10;
/* 251 */         d4 = d1 + 1.0D - 0.0010000000474974513D;
/* 252 */         d6 = d1 + 1.0D - 0.0010000000474974513D;
/* 253 */         d5 = d3;
/* 254 */         d7 = d3 + 1.0D;
/* 255 */         gc = gc.f;
/* 256 */         bool = bool7;
/*     */       } 
/*     */       
/* 259 */       if (bool && !a(☃, fx1, gc, Math.max(f14, f15))) {
/* 260 */         bool8 = true;
/*     */         
/* 262 */         fx fx2 = fx1.a(gc);
/*     */         
/* 264 */         ekc ekc1 = arrayOfEkc[1];
/*     */         
/* 266 */         if (!bool1) {
/* 267 */           buo buo = ☃.d_(fx2).b();
/* 268 */           if (buo instanceof bxi || buo instanceof bxx) {
/* 269 */             ekc1 = this.c;
/*     */           }
/*     */         } 
/*     */         
/* 273 */         float f16 = ekc1.a(0.0D);
/* 274 */         float f17 = ekc1.a(8.0D);
/*     */         
/* 276 */         float f18 = ekc1.b(((1.0F - f14) * 16.0F * 0.5F));
/* 277 */         float f19 = ekc1.b(((1.0F - f15) * 16.0F * 0.5F));
/* 278 */         float f20 = ekc1.b(8.0D);
/*     */         
/* 280 */         int k = a(☃, fx2);
/*     */         
/* 282 */         float f21 = (j < 2) ? f6 : f7;
/*     */         
/* 284 */         float f22 = f5 * f21 * f1;
/* 285 */         float f23 = f5 * f21 * f2;
/* 286 */         float f24 = f5 * f21 * f3;
/*     */         
/* 288 */         a(dfq1, d4, d2 + f14, d5, f22, f23, f24, f16, f18, k);
/* 289 */         a(dfq1, d6, d2 + f15, d7, f22, f23, f24, f17, f19, k);
/* 290 */         a(dfq1, d6, d2 + f13, d7, f22, f23, f24, f17, f20, k);
/* 291 */         a(dfq1, d4, d2 + f13, d5, f22, f23, f24, f16, f20, k);
/*     */         
/* 293 */         if (ekc1 != this.c) {
/* 294 */           a(dfq1, d4, d2 + f13, d5, f22, f23, f24, f16, f20, k);
/* 295 */           a(dfq1, d6, d2 + f13, d7, f22, f23, f24, f17, f20, k);
/* 296 */           a(dfq1, d6, d2 + f15, d7, f22, f23, f24, f17, f19, k);
/* 297 */           a(dfq1, d4, d2 + f14, d5, f22, f23, f24, f16, f18, k);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 302 */     return bool8;
/*     */   }
/*     */   
/*     */   private void a(dfq ☃, double d1, double d2, double d3, float f1, float f2, float f3, float f4, float f5, int i) {
/* 306 */     ☃.a(d1, d2, d3).a(f1, f2, f3, 1.0F).a(f4, f5).a(i).b(0.0F, 1.0F, 0.0F).d();
/*     */   }
/*     */   
/*     */   private int a(bra ☃, fx fx1) {
/* 310 */     int i = eae.a(☃, fx1);
/* 311 */     int j = eae.a(☃, fx1.b());
/*     */     
/* 313 */     int k = i & 0xFF;
/* 314 */     int m = j & 0xFF;
/* 315 */     int n = i >> 16 & 0xFF;
/* 316 */     int i1 = j >> 16 & 0xFF;
/*     */     
/* 318 */     return ((k > m) ? k : m) | ((n > i1) ? n : i1) << 16;
/*     */   }
/*     */   
/*     */   private float a(brc ☃, fx fx1, cuw cuw1) {
/* 322 */     int i = 0;
/* 323 */     float f = 0.0F;
/* 324 */     for (int j = 0; j < 4; j++) {
/* 325 */       fx fx2 = fx1.b(-(j & 0x1), 0, -(j >> 1 & 0x1));
/* 326 */       if (☃.b(fx2.b()).a().a(cuw1)) {
/* 327 */         return 1.0F;
/*     */       }
/* 329 */       cux cux = ☃.b(fx2);
/* 330 */       if (cux.a().a(cuw1)) {
/* 331 */         float f1 = cux.a(☃, fx2);
/* 332 */         if (f1 >= 0.8F) {
/* 333 */           f += f1 * 10.0F;
/* 334 */           i += 10;
/*     */         } else {
/* 336 */           f += f1;
/* 337 */           i++;
/*     */         } 
/* 339 */       } else if (!☃.d_(fx2).c().b()) {
/* 340 */         i++;
/*     */       } 
/*     */     } 
/* 343 */     return f / i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */