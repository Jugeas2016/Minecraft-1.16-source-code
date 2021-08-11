/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
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
/*     */ public class cxa
/*     */   extends cxj
/*     */ {
/*     */   public void a(bsi ☃, aqn aqn1) {
/*  22 */     super.a(☃, aqn1);
/*  23 */     this.j = aqn1.a(cwz.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  28 */     this.b.a(cwz.h, this.j);
/*  29 */     super.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cxb b() {
/*     */     int ☃;
/*  36 */     if (e() && this.b.aE()) {
/*  37 */       ☃ = afm.c(this.b.cE());
/*  38 */       fx.a a = new fx.a(this.b.cD(), ☃, this.b.cH());
/*  39 */       buo buo = this.a.d_(a).b();
/*  40 */       while (buo == bup.A) {
/*  41 */         ☃++;
/*  42 */         a.c(this.b.cD(), ☃, this.b.cH());
/*  43 */         buo = this.a.d_(a).b();
/*     */       } 
/*     */     } else {
/*  46 */       ☃ = afm.c(this.b.cE() + 0.5D);
/*     */     } 
/*     */     
/*  49 */     fx fx = this.b.cB();
/*  50 */     cwz cwz = a(this.b, fx.u(), ☃, fx.w());
/*     */     
/*  52 */     if (this.b.a(cwz) < 0.0F) {
/*  53 */       Set<fx> set = Sets.newHashSet();
/*  54 */       set.add(new fx((this.b.cc()).a, ☃, (this.b.cc()).c));
/*  55 */       set.add(new fx((this.b.cc()).a, ☃, (this.b.cc()).f));
/*  56 */       set.add(new fx((this.b.cc()).d, ☃, (this.b.cc()).c));
/*  57 */       set.add(new fx((this.b.cc()).d, ☃, (this.b.cc()).f));
/*     */       
/*  59 */       for (fx fx1 : set) {
/*  60 */         cwz cwz1 = a(this.b, fx1);
/*  61 */         if (this.b.a(cwz1) >= 0.0F) {
/*  62 */           return super.a(fx1.u(), fx1.v(), fx1.w());
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  67 */     return super.a(fx.u(), ☃, fx.w());
/*     */   }
/*     */ 
/*     */   
/*     */   public cxh a(double ☃, double d1, double d2) {
/*  72 */     return new cxh(super.a(afm.c(☃), afm.c(d1), afm.c(d2)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(cxb[] ☃, cxb cxb1) {
/*  77 */     int i = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     cxb cxb2 = a(cxb1.a, cxb1.b, cxb1.c + 1);
/*  83 */     if (b(cxb2)) {
/*  84 */       ☃[i++] = cxb2;
/*     */     }
/*     */     
/*  87 */     cxb cxb3 = a(cxb1.a - 1, cxb1.b, cxb1.c);
/*  88 */     if (b(cxb3)) {
/*  89 */       ☃[i++] = cxb3;
/*     */     }
/*     */     
/*  92 */     cxb cxb4 = a(cxb1.a + 1, cxb1.b, cxb1.c);
/*  93 */     if (b(cxb4)) {
/*  94 */       ☃[i++] = cxb4;
/*     */     }
/*     */     
/*  97 */     cxb cxb5 = a(cxb1.a, cxb1.b, cxb1.c - 1);
/*  98 */     if (b(cxb5)) {
/*  99 */       ☃[i++] = cxb5;
/*     */     }
/*     */     
/* 102 */     cxb cxb6 = a(cxb1.a, cxb1.b + 1, cxb1.c);
/* 103 */     if (b(cxb6)) {
/* 104 */       ☃[i++] = cxb6;
/*     */     }
/*     */     
/* 107 */     cxb cxb7 = a(cxb1.a, cxb1.b - 1, cxb1.c);
/* 108 */     if (b(cxb7)) {
/* 109 */       ☃[i++] = cxb7;
/*     */     }
/*     */     
/* 112 */     cxb cxb8 = a(cxb1.a, cxb1.b + 1, cxb1.c + 1);
/* 113 */     if (b(cxb8) && a(cxb2) && a(cxb6)) {
/* 114 */       ☃[i++] = cxb8;
/*     */     }
/*     */     
/* 117 */     cxb cxb9 = a(cxb1.a - 1, cxb1.b + 1, cxb1.c);
/* 118 */     if (b(cxb9) && a(cxb3) && a(cxb6)) {
/* 119 */       ☃[i++] = cxb9;
/*     */     }
/*     */     
/* 122 */     cxb cxb10 = a(cxb1.a + 1, cxb1.b + 1, cxb1.c);
/* 123 */     if (b(cxb10) && a(cxb4) && a(cxb6)) {
/* 124 */       ☃[i++] = cxb10;
/*     */     }
/*     */     
/* 127 */     cxb cxb11 = a(cxb1.a, cxb1.b + 1, cxb1.c - 1);
/* 128 */     if (b(cxb11) && a(cxb5) && a(cxb6)) {
/* 129 */       ☃[i++] = cxb11;
/*     */     }
/*     */     
/* 132 */     cxb cxb12 = a(cxb1.a, cxb1.b - 1, cxb1.c + 1);
/* 133 */     if (b(cxb12) && a(cxb2) && a(cxb7)) {
/* 134 */       ☃[i++] = cxb12;
/*     */     }
/*     */     
/* 137 */     cxb cxb13 = a(cxb1.a - 1, cxb1.b - 1, cxb1.c);
/* 138 */     if (b(cxb13) && a(cxb3) && a(cxb7)) {
/* 139 */       ☃[i++] = cxb13;
/*     */     }
/*     */     
/* 142 */     cxb cxb14 = a(cxb1.a + 1, cxb1.b - 1, cxb1.c);
/* 143 */     if (b(cxb14) && a(cxb4) && a(cxb7)) {
/* 144 */       ☃[i++] = cxb14;
/*     */     }
/*     */     
/* 147 */     cxb cxb15 = a(cxb1.a, cxb1.b - 1, cxb1.c - 1);
/* 148 */     if (b(cxb15) && a(cxb5) && a(cxb7)) {
/* 149 */       ☃[i++] = cxb15;
/*     */     }
/*     */     
/* 152 */     cxb cxb16 = a(cxb1.a + 1, cxb1.b, cxb1.c - 1);
/* 153 */     if (b(cxb16) && a(cxb5) && a(cxb4)) {
/* 154 */       ☃[i++] = cxb16;
/*     */     }
/*     */     
/* 157 */     cxb cxb17 = a(cxb1.a + 1, cxb1.b, cxb1.c + 1);
/* 158 */     if (b(cxb17) && a(cxb2) && a(cxb4)) {
/* 159 */       ☃[i++] = cxb17;
/*     */     }
/*     */     
/* 162 */     cxb cxb18 = a(cxb1.a - 1, cxb1.b, cxb1.c - 1);
/* 163 */     if (b(cxb18) && a(cxb5) && a(cxb3)) {
/* 164 */       ☃[i++] = cxb18;
/*     */     }
/*     */     
/* 167 */     cxb cxb19 = a(cxb1.a - 1, cxb1.b, cxb1.c + 1);
/* 168 */     if (b(cxb19) && a(cxb2) && a(cxb3)) {
/* 169 */       ☃[i++] = cxb19;
/*     */     }
/*     */     
/* 172 */     cxb cxb20 = a(cxb1.a + 1, cxb1.b + 1, cxb1.c - 1);
/* 173 */     if (b(cxb20) && a(cxb16) && a(cxb5) && a(cxb4) && a(cxb6) && a(cxb11) && a(cxb10)) {
/* 174 */       ☃[i++] = cxb20;
/*     */     }
/*     */     
/* 177 */     cxb cxb21 = a(cxb1.a + 1, cxb1.b + 1, cxb1.c + 1);
/* 178 */     if (b(cxb21) && a(cxb17) && a(cxb2) && a(cxb4) && a(cxb6) && a(cxb8) && a(cxb10)) {
/* 179 */       ☃[i++] = cxb21;
/*     */     }
/*     */     
/* 182 */     cxb cxb22 = a(cxb1.a - 1, cxb1.b + 1, cxb1.c - 1);
/* 183 */     if (b(cxb22) && a(cxb18) && a(cxb5) && (a(cxb3) & a(cxb6)) != 0 && a(cxb11) && a(cxb9)) {
/* 184 */       ☃[i++] = cxb22;
/*     */     }
/*     */     
/* 187 */     cxb cxb23 = a(cxb1.a - 1, cxb1.b + 1, cxb1.c + 1);
/* 188 */     if (b(cxb23) && a(cxb19) && a(cxb2) && (a(cxb3) & a(cxb6)) != 0 && a(cxb8) && a(cxb9)) {
/* 189 */       ☃[i++] = cxb23;
/*     */     }
/*     */     
/* 192 */     cxb cxb24 = a(cxb1.a + 1, cxb1.b - 1, cxb1.c - 1);
/* 193 */     if (b(cxb24) && a(cxb16) && a(cxb5) && a(cxb4) && a(cxb7) && a(cxb15) && a(cxb14)) {
/* 194 */       ☃[i++] = cxb24;
/*     */     }
/*     */     
/* 197 */     cxb cxb25 = a(cxb1.a + 1, cxb1.b - 1, cxb1.c + 1);
/* 198 */     if (b(cxb25) && a(cxb17) && a(cxb2) && a(cxb4) && a(cxb7) && a(cxb12) && a(cxb14)) {
/* 199 */       ☃[i++] = cxb25;
/*     */     }
/*     */     
/* 202 */     cxb cxb26 = a(cxb1.a - 1, cxb1.b - 1, cxb1.c - 1);
/* 203 */     if (b(cxb26) && a(cxb18) && a(cxb5) && a(cxb3) && a(cxb7) && a(cxb15) && a(cxb13)) {
/* 204 */       ☃[i++] = cxb26;
/*     */     }
/*     */     
/* 207 */     cxb cxb27 = a(cxb1.a - 1, cxb1.b - 1, cxb1.c + 1);
/* 208 */     if (b(cxb27) && a(cxb19) && a(cxb2) && a(cxb3) && a(cxb7) && a(cxb12) && a(cxb13)) {
/* 209 */       ☃[i++] = cxb27;
/*     */     }
/*     */     
/* 212 */     return i;
/*     */   }
/*     */   
/*     */   private boolean a(@Nullable cxb ☃) {
/* 216 */     return (☃ != null && ☃.k >= 0.0F);
/*     */   }
/*     */   
/*     */   private boolean b(@Nullable cxb ☃) {
/* 220 */     return (☃ != null && !☃.i);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected cxb a(int ☃, int i, int j) {
/* 226 */     cxb cxb = null;
/*     */     
/* 228 */     cwz cwz = a(this.b, ☃, i, j);
/*     */     
/* 230 */     float f = this.b.a(cwz);
/*     */     
/* 232 */     if (f >= 0.0F) {
/* 233 */       cxb = super.a(☃, i, j);
/* 234 */       cxb.l = cwz;
/* 235 */       cxb.k = Math.max(cxb.k, f);
/*     */       
/* 237 */       if (cwz == cwz.c) {
/* 238 */         cxb.k++;
/*     */       }
/*     */     } 
/*     */     
/* 242 */     if (cwz == cwz.b || cwz == cwz.c) {
/* 243 */       return cxb;
/*     */     }
/*     */     
/* 246 */     return cxb;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cwz a(brc ☃, int i, int j, int k, aqn aqn1, int m, int n, int i1, boolean bool1, boolean bool2) {
/* 252 */     EnumSet<cwz> enumSet = EnumSet.noneOf(cwz.class);
/* 253 */     cwz cwz1 = cwz.a;
/*     */     
/* 255 */     fx fx = aqn1.cB();
/*     */     
/* 257 */     cwz1 = a(☃, i, j, k, m, n, i1, bool1, bool2, enumSet, cwz1, fx);
/*     */     
/* 259 */     if (enumSet.contains(cwz.f)) {
/* 260 */       return cwz.f;
/*     */     }
/*     */     
/* 263 */     cwz cwz2 = cwz.a;
/* 264 */     for (cwz cwz : enumSet) {
/*     */       
/* 266 */       if (aqn1.a(cwz) < 0.0F) {
/* 267 */         return cwz;
/*     */       }
/*     */ 
/*     */       
/* 271 */       if (aqn1.a(cwz) >= aqn1.a(cwz2)) {
/* 272 */         cwz2 = cwz;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 277 */     if (cwz1 == cwz.b && aqn1.a(cwz2) == 0.0F) {
/* 278 */       return cwz.b;
/*     */     }
/*     */     
/* 281 */     return cwz2;
/*     */   }
/*     */ 
/*     */   
/*     */   public cwz a(brc ☃, int i, int j, int k) {
/* 286 */     fx.a a = new fx.a();
/* 287 */     cwz cwz = b(☃, a.d(i, j, k));
/*     */     
/* 289 */     if (cwz == cwz.b && j >= 1) {
/* 290 */       ceh ceh = ☃.d_(a.d(i, j - 1, k));
/* 291 */       cwz cwz1 = b(☃, a.d(i, j - 1, k));
/*     */       
/* 293 */       if (cwz1 == cwz.m || ceh.a(bup.iJ) || cwz1 == cwz.g || ceh.a(aed.ay)) {
/* 294 */         cwz = cwz.m;
/* 295 */       } else if (cwz1 == cwz.o) {
/* 296 */         cwz = cwz.o;
/* 297 */       } else if (cwz1 == cwz.q) {
/* 298 */         cwz = cwz.q;
/* 299 */       } else if (cwz1 == cwz.x) {
/* 300 */         cwz = cwz.x;
/* 301 */       } else if (cwz1 == cwz.f) {
/* 302 */         cwz = cwz.f;
/*     */       } else {
/* 304 */         cwz = (cwz1 == cwz.c || cwz1 == cwz.b || cwz1 == cwz.h) ? cwz.b : cwz.c;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 309 */     if (cwz == cwz.c || cwz == cwz.b) {
/* 310 */       cwz = a(☃, a.d(i, j, k), cwz);
/*     */     }
/*     */     
/* 313 */     return cwz;
/*     */   }
/*     */   
/*     */   private cwz a(aqn ☃, fx fx1) {
/* 317 */     return a(☃, fx1.u(), fx1.v(), fx1.w());
/*     */   }
/*     */   
/*     */   private cwz a(aqn ☃, int i, int j, int k) {
/* 321 */     return a(this.a, i, j, k, ☃, this.d, this.e, this.f, d(), c());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */