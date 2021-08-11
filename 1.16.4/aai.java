/*     */ import java.util.Objects;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aai
/*     */ {
/*  31 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*     */   public aag a;
/*     */   
/*     */   public aah b;
/*  36 */   private bru d = bru.a;
/*  37 */   private bru e = bru.a;
/*     */   
/*     */   private boolean f;
/*     */   private int g;
/*  41 */   private fx h = fx.b;
/*     */   
/*     */   private int i;
/*     */   private boolean j;
/*  45 */   private fx k = fx.b;
/*     */   private int l;
/*  47 */   private int m = -1;
/*     */   
/*     */   public aai(aag ☃) {
/*  50 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(bru ☃) {
/*  54 */     a(☃, (☃ != this.d) ? this.d : this.e);
/*     */   }
/*     */   
/*     */   public void a(bru ☃, bru bru1) {
/*  58 */     this.e = bru1;
/*  59 */     this.d = ☃;
/*     */     
/*  61 */     ☃.a(this.b.bC);
/*     */     
/*  63 */     this.b.t();
/*  64 */     this.b.c.ae().a(new qi(qi.a.b, new aah[] { this.b }));
/*  65 */     this.a.n_();
/*     */   }
/*     */   
/*     */   public bru b() {
/*  69 */     return this.d;
/*     */   }
/*     */   
/*     */   public bru c() {
/*  73 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  77 */     return this.d.f();
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  81 */     return this.d.e();
/*     */   }
/*     */   
/*     */   public void b(bru ☃) {
/*  85 */     if (this.d == bru.a) {
/*  86 */       this.d = ☃;
/*     */     }
/*  88 */     a(this.d);
/*     */   }
/*     */   
/*     */   public void a() {
/*  92 */     this.i++;
/*     */     
/*  94 */     if (this.j) {
/*  95 */       ceh ☃ = this.a.d_(this.k);
/*  96 */       if (☃.g()) {
/*  97 */         this.j = false;
/*     */       } else {
/*  99 */         float f = a(☃, this.k, this.l);
/*     */         
/* 101 */         if (f >= 1.0F) {
/* 102 */           this.j = false;
/* 103 */           a(this.k);
/*     */         } 
/*     */       } 
/* 106 */     } else if (this.f) {
/* 107 */       ceh ☃ = this.a.d_(this.h);
/*     */       
/* 109 */       if (☃.g()) {
/* 110 */         this.a.a(this.b.Y(), this.h, -1);
/* 111 */         this.m = -1;
/* 112 */         this.f = false;
/*     */       } else {
/* 114 */         a(☃, this.h, this.g);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private float a(ceh ☃, fx fx1, int i) {
/* 120 */     int j = this.i - i;
/* 121 */     float f = ☃.a(this.b, this.b.l, fx1) * (j + 1);
/* 122 */     int k = (int)(f * 10.0F);
/*     */     
/* 124 */     if (k != this.m) {
/* 125 */       this.a.a(this.b.Y(), fx1, k);
/* 126 */       this.m = k;
/*     */     } 
/* 128 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, sz.a a1, gc gc1, int i) {
/* 133 */     double d1 = this.b.cD() - ☃.u() + 0.5D;
/*     */ 
/*     */ 
/*     */     
/* 137 */     double d2 = this.b.cE() - ☃.v() + 0.5D + 1.5D;
/* 138 */     double d3 = this.b.cH() - ☃.w() + 0.5D;
/* 139 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 140 */     if (d4 > 36.0D) {
/* 141 */       this.b.b.a(new ou(☃, this.a.d_(☃), a1, false, "too far"));
/*     */       return;
/*     */     } 
/* 144 */     if (☃.v() >= i) {
/* 145 */       this.b.b.a(new ou(☃, this.a.d_(☃), a1, false, "too high"));
/*     */       
/*     */       return;
/*     */     } 
/* 149 */     if (a1 == sz.a.a) {
/* 150 */       if (!this.a.a(this.b, ☃)) {
/* 151 */         this.b.b.a(new ou(☃, this.a.d_(☃), a1, false, "may not interact"));
/*     */         return;
/*     */       } 
/* 154 */       if (e()) {
/* 155 */         a(☃, a1, "creative destroy");
/*     */         
/*     */         return;
/*     */       } 
/* 159 */       if (this.b.a(this.a, ☃, this.d)) {
/* 160 */         this.b.b.a(new ou(☃, this.a.d_(☃), a1, false, "block action restricted"));
/*     */         
/*     */         return;
/*     */       } 
/* 164 */       this.g = this.i;
/* 165 */       float f = 1.0F;
/* 166 */       ceh ceh = this.a.d_(☃);
/* 167 */       if (!ceh.g()) {
/* 168 */         ceh.a(this.a, ☃, this.b);
/* 169 */         f = ceh.a(this.b, this.b.l, ☃);
/*     */       } 
/*     */       
/* 172 */       if (!ceh.g() && f >= 1.0F) {
/* 173 */         a(☃, a1, "insta mine");
/*     */       } else {
/* 175 */         if (this.f) {
/* 176 */           this.b.b.a(new ou(this.h, this.a.d_(this.h), sz.a.a, false, "abort destroying since another started (client insta mine, server disagreed)"));
/*     */         }
/* 178 */         this.f = true;
/* 179 */         this.h = ☃.h();
/*     */         
/* 181 */         int j = (int)(f * 10.0F);
/* 182 */         this.a.a(this.b.Y(), ☃, j);
/* 183 */         this.b.b.a(new ou(☃, this.a.d_(☃), a1, true, "actual start of destroying"));
/* 184 */         this.m = j;
/*     */       } 
/* 186 */     } else if (a1 == sz.a.c) {
/*     */       
/* 188 */       if (☃.equals(this.h)) {
/* 189 */         int j = this.i - this.g;
/*     */         
/* 191 */         ceh ceh = this.a.d_(☃);
/* 192 */         if (!ceh.g()) {
/* 193 */           float f = ceh.a(this.b, this.b.l, ☃) * (j + 1);
/* 194 */           if (f >= 0.7F) {
/* 195 */             this.f = false;
/* 196 */             this.a.a(this.b.Y(), ☃, -1);
/* 197 */             a(☃, a1, "destroyed"); return;
/*     */           } 
/* 199 */           if (!this.j) {
/* 200 */             this.f = false;
/* 201 */             this.j = true;
/* 202 */             this.k = ☃;
/* 203 */             this.l = this.g;
/*     */           } 
/*     */         } 
/*     */       } 
/* 207 */       this.b.b.a(new ou(☃, this.a.d_(☃), a1, true, "stopped destroying"));
/* 208 */     } else if (a1 == sz.a.b) {
/* 209 */       this.f = false;
/* 210 */       if (!Objects.equals(this.h, ☃)) {
/* 211 */         c.warn("Mismatch in destroy block pos: " + this.h + " " + ☃);
/* 212 */         this.a.a(this.b.Y(), this.h, -1);
/* 213 */         this.b.b.a(new ou(this.h, this.a.d_(this.h), a1, true, "aborted mismatched destroying"));
/*     */       } 
/*     */       
/* 216 */       this.a.a(this.b.Y(), ☃, -1);
/* 217 */       this.b.b.a(new ou(☃, this.a.d_(☃), a1, true, "aborted destroying"));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(fx ☃, sz.a a1, String str) {
/* 222 */     if (a(☃)) {
/* 223 */       this.b.b.a(new ou(☃, this.a.d_(☃), a1, true, str));
/*     */     } else {
/* 225 */       this.b.b.a(new ou(☃, this.a.d_(☃), a1, false, str));
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(fx ☃) {
/* 230 */     ceh ceh = this.a.d_(☃);
/* 231 */     if (!this.b.dD().b().a(ceh, this.a, ☃, this.b)) {
/* 232 */       return false;
/*     */     }
/*     */     
/* 235 */     ccj ccj = this.a.c(☃);
/* 236 */     buo buo = ceh.b();
/*     */ 
/*     */     
/* 239 */     if ((buo instanceof bvi || buo instanceof caq || buo instanceof bxr) && !this.b.eV()) {
/* 240 */       this.a.a(☃, ceh, ceh, 3);
/* 241 */       return false;
/*     */     } 
/*     */     
/* 244 */     if (this.b.a(this.a, ☃, this.d)) {
/* 245 */       return false;
/*     */     }
/*     */     
/* 248 */     buo.a(this.a, ☃, ceh, this.b);
/*     */     
/* 250 */     boolean bool1 = this.a.a(☃, false);
/*     */ 
/*     */ 
/*     */     
/* 254 */     if (bool1) {
/* 255 */       buo.a(this.a, ☃, ceh);
/*     */     }
/*     */     
/* 258 */     if (e()) {
/* 259 */       return true;
/*     */     }
/*     */     
/* 262 */     bmb bmb1 = this.b.dD();
/*     */     
/* 264 */     bmb bmb2 = bmb1.i();
/* 265 */     boolean bool2 = this.b.d(ceh);
/* 266 */     bmb1.a(this.a, ceh, ☃, this.b);
/* 267 */     if (bool1 && bool2) {
/* 268 */       buo.a(this.a, this.b, ☃, ceh, ccj, bmb2);
/*     */     }
/* 270 */     return true;
/*     */   }
/*     */   
/*     */   public aou a(aah ☃, brx brx1, bmb bmb1, aot aot1) {
/* 274 */     if (this.d == bru.e) {
/* 275 */       return aou.c;
/*     */     }
/* 277 */     if (☃.eT().a(bmb1.b())) {
/* 278 */       return aou.c;
/*     */     }
/*     */     
/* 281 */     int i = bmb1.E();
/* 282 */     int j = bmb1.g();
/* 283 */     aov<bmb> aov = bmb1.a(brx1, ☃, aot1);
/*     */     
/* 285 */     bmb bmb2 = aov.b();
/* 286 */     if (bmb2 == bmb1 && bmb2.E() == i && bmb2.k() <= 0 && bmb2.g() == j) {
/* 287 */       return aov.a();
/*     */     }
/*     */     
/* 290 */     if (aov.a() == aou.d && bmb2.k() > 0 && !☃.dW()) {
/* 291 */       return aov.a();
/*     */     }
/*     */     
/* 294 */     ☃.a(aot1, bmb2);
/* 295 */     if (e()) {
/* 296 */       bmb2.e(i);
/* 297 */       if (bmb2.e() && bmb2.g() != j) {
/* 298 */         bmb2.b(j);
/*     */       }
/*     */     } 
/* 301 */     if (bmb2.a()) {
/* 302 */       ☃.a(aot1, bmb.b);
/*     */     }
/* 304 */     if (!☃.dW()) {
/* 305 */       ☃.a(☃.bo);
/*     */     }
/* 307 */     return aov.a();
/*     */   }
/*     */   public aou a(aah ☃, brx brx1, bmb bmb1, aot aot1, dcj dcj1) {
/*     */     aou aou;
/* 311 */     fx fx1 = dcj1.a();
/*     */     
/* 313 */     ceh ceh = brx1.d_(fx1);
/* 314 */     if (this.d == bru.e) {
/* 315 */       aox aox = ceh.b(brx1, fx1);
/* 316 */       if (aox != null) {
/* 317 */         ☃.a(aox);
/* 318 */         return aou.a;
/*     */       } 
/* 320 */       return aou.c;
/*     */     } 
/*     */     
/* 323 */     boolean bool1 = (!☃.dD().a() || !☃.dE().a());
/* 324 */     boolean bool2 = (☃.eq() && bool1);
/* 325 */     bmb bmb2 = bmb1.i();
/*     */     
/* 327 */     if (!bool2) {
/* 328 */       aou aou1 = ceh.a(brx1, ☃, aot1, dcj1);
/* 329 */       if (aou1.a()) {
/* 330 */         ac.M.a(☃, fx1, bmb2);
/*     */         
/* 332 */         return aou1;
/*     */       } 
/*     */     } 
/*     */     
/* 336 */     if (bmb1.a() || ☃.eT().a(bmb1.b())) {
/* 337 */       return aou.c;
/*     */     }
/*     */     
/* 340 */     boa boa = new boa(☃, aot1, dcj1);
/*     */     
/* 342 */     if (e()) {
/*     */       
/* 344 */       int i = bmb1.E();
/* 345 */       aou = bmb1.a(boa);
/* 346 */       bmb1.e(i);
/*     */     } else {
/* 348 */       aou = bmb1.a(boa);
/*     */     } 
/* 350 */     if (aou.a()) {
/* 351 */       ac.M.a(☃, fx1, bmb2);
/*     */     }
/* 353 */     return aou;
/*     */   }
/*     */   
/*     */   public void a(aag ☃) {
/* 357 */     this.a = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */