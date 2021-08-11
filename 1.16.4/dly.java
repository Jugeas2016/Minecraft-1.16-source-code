/*     */ import com.google.common.collect.ComparisonChain;
/*     */ import com.google.common.collect.Ordering;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Comparator;
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
/*     */ public class dly
/*     */   extends dkw
/*     */ {
/*  34 */   private static final Ordering<dwx> a = Ordering.from(new a());
/*     */ 
/*     */   
/*     */   private final djz b;
/*     */ 
/*     */   
/*     */   private final dkv c;
/*     */ 
/*     */   
/*     */   private nr d;
/*     */   
/*     */   private nr e;
/*     */   
/*     */   private long i;
/*     */   
/*     */   private boolean j;
/*     */ 
/*     */   
/*     */   public dly(djz ☃, dkv dkv1) {
/*  53 */     this.b = ☃;
/*  54 */     this.c = dkv1;
/*     */   }
/*     */   
/*     */   public nr a(dwx ☃) {
/*  58 */     if (☃.l() != null) {
/*  59 */       return a(☃, ☃.l().e());
/*     */     }
/*  61 */     return a(☃, ddl.a(☃.j(), new oe(☃.a().getName())));
/*     */   }
/*     */ 
/*     */   
/*     */   private nr a(dwx ☃, nx nx1) {
/*  66 */     return (☃.b() == bru.e) ? nx1.a(k.u) : nx1;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  70 */     if (☃ && !this.j) {
/*  71 */       this.i = x.b();
/*     */     }
/*  73 */     this.j = ☃;
/*     */   }
/*     */   public void a(dfm ☃, int i, ddn ddn1, @Nullable ddk ddk1) {
/*     */     int i2;
/*  77 */     dwu dwu = this.b.s.e;
/*  78 */     List<dwx> list = a.sortedCopy(dwu.e());
/*     */     
/*  80 */     int j = 0;
/*  81 */     int k = 0;
/*  82 */     for (dwx dwx : list) {
/*  83 */       int i9 = this.b.g.a(a(dwx));
/*  84 */       j = Math.max(j, i9);
/*     */       
/*  86 */       if (ddk1 != null && ddk1.f() != ddq.a.b) {
/*  87 */         i9 = this.b.g.b(" " + ddn1.c(dwx.a().getName(), ddk1).b());
/*  88 */         k = Math.max(k, i9);
/*     */       } 
/*     */     } 
/*     */     
/*  92 */     list = list.subList(0, Math.min(list.size(), 80));
/*     */     
/*  94 */     int m = list.size();
/*  95 */     int n = m;
/*  96 */     int i1 = 1;
/*  97 */     while (n > 20) {
/*  98 */       i1++;
/*  99 */       n = (m + i1 - 1) / i1;
/*     */     } 
/*     */     
/* 102 */     boolean bool = (this.b.F() || this.b.w().a().g());
/*     */ 
/*     */     
/* 105 */     if (ddk1 != null) {
/* 106 */       if (ddk1.f() == ddq.a.b) {
/* 107 */         i2 = 90;
/*     */       } else {
/* 109 */         i2 = k;
/*     */       } 
/*     */     } else {
/* 112 */       i2 = 0;
/*     */     } 
/*     */     
/* 115 */     int i3 = Math.min(i1 * ((bool ? 9 : 0) + j + i2 + 13), i - 50) / i1;
/*     */     
/* 117 */     int i4 = i / 2 - (i3 * i1 + (i1 - 1) * 5) / 2;
/* 118 */     int i5 = 10;
/*     */     
/* 120 */     int i6 = i3 * i1 + (i1 - 1) * 5;
/*     */     
/* 122 */     List<afa> list1 = null;
/* 123 */     if (this.e != null) {
/* 124 */       list1 = this.b.g.b(this.e, i - 50);
/* 125 */       for (afa afa : list1) {
/* 126 */         i6 = Math.max(i6, this.b.g.a(afa));
/*     */       }
/*     */     } 
/*     */     
/* 130 */     List<afa> list2 = null;
/* 131 */     if (this.d != null) {
/* 132 */       list2 = this.b.g.b(this.d, i - 50);
/* 133 */       for (afa afa : list2) {
/* 134 */         i6 = Math.max(i6, this.b.g.a(afa));
/*     */       }
/*     */     } 
/*     */     
/* 138 */     if (list1 != null) {
/* 139 */       this.b.g.getClass(); a(☃, i / 2 - i6 / 2 - 1, i5 - 1, i / 2 + i6 / 2 + 1, i5 + list1.size() * 9, -2147483648);
/* 140 */       for (afa afa : list1) {
/* 141 */         int i9 = this.b.g.a(afa);
/* 142 */         this.b.g.a(☃, afa, (i / 2 - i9 / 2), i5, -1);
/* 143 */         this.b.g.getClass(); i5 += 9;
/*     */       } 
/* 145 */       i5++;
/*     */     } 
/*     */     
/* 148 */     a(☃, i / 2 - i6 / 2 - 1, i5 - 1, i / 2 + i6 / 2 + 1, i5 + n * 9, -2147483648);
/*     */     
/* 150 */     int i7 = this.b.k.a(553648127);
/* 151 */     for (int i8 = 0; i8 < m; i8++) {
/* 152 */       int i9 = i8 / n;
/* 153 */       int i10 = i8 % n;
/* 154 */       int i11 = i4 + i9 * i3 + i9 * 5;
/* 155 */       int i12 = i5 + i10 * 9;
/*     */       
/* 157 */       a(☃, i11, i12, i11 + i3, i12 + 8, i7);
/* 158 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 159 */       RenderSystem.enableAlphaTest();
/* 160 */       RenderSystem.enableBlend();
/* 161 */       RenderSystem.defaultBlendFunc();
/*     */       
/* 163 */       if (i8 < list.size()) {
/* 164 */         dwx dwx = list.get(i8);
/*     */         
/* 166 */         GameProfile gameProfile = dwx.a();
/* 167 */         if (bool) {
/* 168 */           bfw bfw = this.b.r.b(gameProfile.getId());
/* 169 */           boolean bool1 = (bfw != null && bfw.a(bfx.a) && ("Dinnerbone".equals(gameProfile.getName()) || "Grumm".equals(gameProfile.getName())));
/*     */           
/* 171 */           this.b.M().a(dwx.g());
/*     */           
/* 173 */           int i13 = 8 + (bool1 ? 8 : 0);
/* 174 */           int i14 = 8 * (bool1 ? -1 : 1);
/* 175 */           dkw.a(☃, i11, i12, 8, 8, 8.0F, i13, 8, i14, 64, 64);
/*     */           
/* 177 */           if (bfw != null && bfw.a(bfx.g)) {
/* 178 */             int i15 = 8 + (bool1 ? 8 : 0);
/* 179 */             int i16 = 8 * (bool1 ? -1 : 1);
/* 180 */             dkw.a(☃, i11, i12, 8, 8, 40.0F, i15, 8, i16, 64, 64);
/*     */           } 
/* 182 */           i11 += 9;
/*     */         } 
/*     */         
/* 185 */         this.b.g.a(☃, a(dwx), i11, i12, (dwx.b() == bru.e) ? -1862270977 : -1);
/*     */         
/* 187 */         if (ddk1 != null && dwx.b() != bru.e) {
/* 188 */           int i13 = i11 + j + 1;
/* 189 */           int i14 = i13 + i2;
/*     */           
/* 191 */           if (i14 - i13 > 5) {
/* 192 */             a(ddk1, i12, gameProfile.getName(), i13, i14, dwx, ☃);
/*     */           }
/*     */         } 
/*     */         
/* 196 */         a(☃, i3, i11 - (bool ? 9 : 0), i12, dwx);
/*     */       } 
/*     */     } 
/*     */     
/* 200 */     if (list2 != null) {
/* 201 */       i5 += n * 9 + 1;
/* 202 */       this.b.g.getClass(); a(☃, i / 2 - i6 / 2 - 1, i5 - 1, i / 2 + i6 / 2 + 1, i5 + list2.size() * 9, -2147483648);
/* 203 */       for (afa afa : list2) {
/* 204 */         int i9 = this.b.g.a(afa);
/* 205 */         this.b.g.a(☃, afa, (i / 2 - i9 / 2), i5, -1);
/* 206 */         this.b.g.getClass(); i5 += 9;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   protected void a(dfm ☃, int i, int j, int k, dwx dwx1) {
/*     */     int n;
/* 212 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 213 */     this.b.M().a(h);
/*     */     
/* 215 */     int m = 0;
/*     */     
/* 217 */     if (dwx1.c() < 0) {
/* 218 */       n = 5;
/* 219 */     } else if (dwx1.c() < 150) {
/* 220 */       n = 0;
/* 221 */     } else if (dwx1.c() < 300) {
/* 222 */       n = 1;
/* 223 */     } else if (dwx1.c() < 600) {
/* 224 */       n = 2;
/* 225 */     } else if (dwx1.c() < 1000) {
/* 226 */       n = 3;
/*     */     } else {
/* 228 */       n = 4;
/*     */     } 
/*     */     
/* 231 */     d(v() + 100);
/* 232 */     b(☃, j + i - 11, k, 0, 176 + n * 8, 10, 8);
/* 233 */     d(v() - 100);
/*     */   }
/*     */   
/*     */   private void a(ddk ☃, int i, String str, int j, int k, dwx dwx1, dfm dfm1) {
/* 237 */     int m = ☃.a().c(str, ☃).b();
/*     */     
/* 239 */     if (☃.f() == ddq.a.b) {
/* 240 */       this.b.M().a(h);
/*     */       
/* 242 */       long l = x.b();
/* 243 */       if (this.i == dwx1.q()) {
/* 244 */         if (m < dwx1.m()) {
/* 245 */           dwx1.a(l);
/* 246 */           dwx1.b((this.c.d() + 20));
/* 247 */         } else if (m > dwx1.m()) {
/* 248 */           dwx1.a(l);
/* 249 */           dwx1.b((this.c.d() + 10));
/*     */         } 
/*     */       }
/*     */       
/* 253 */       if (l - dwx1.o() > 1000L || this.i != dwx1.q()) {
/* 254 */         dwx1.b(m);
/* 255 */         dwx1.c(m);
/* 256 */         dwx1.a(l);
/*     */       } 
/* 258 */       dwx1.c(this.i);
/* 259 */       dwx1.b(m);
/*     */       
/* 261 */       int n = afm.f(Math.max(m, dwx1.n()) / 2.0F);
/* 262 */       int i1 = Math.max(afm.f((m / 2)), Math.max(afm.f((dwx1.n() / 2)), 10));
/* 263 */       boolean bool = (dwx1.p() > this.c.d() && (dwx1.p() - this.c.d()) / 3L % 2L == 1L);
/*     */       
/* 265 */       if (n > 0) {
/* 266 */         int i2 = afm.d(Math.min((k - j - 4) / i1, 9.0F));
/* 267 */         if (i2 > 3) {
/*     */           int i3;
/* 269 */           for (i3 = n; i3 < i1; i3++) {
/* 270 */             b(dfm1, j + i3 * i2, i, bool ? 25 : 16, 0, 9, 9);
/*     */           }
/*     */ 
/*     */           
/* 274 */           for (i3 = 0; i3 < n; i3++) {
/* 275 */             b(dfm1, j + i3 * i2, i, bool ? 25 : 16, 0, 9, 9);
/*     */             
/* 277 */             if (bool) {
/* 278 */               if (i3 * 2 + 1 < dwx1.n()) {
/* 279 */                 b(dfm1, j + i3 * i2, i, 70, 0, 9, 9);
/*     */               }
/* 281 */               if (i3 * 2 + 1 == dwx1.n()) {
/* 282 */                 b(dfm1, j + i3 * i2, i, 79, 0, 9, 9);
/*     */               }
/*     */             } 
/*     */             
/* 286 */             if (i3 * 2 + 1 < m) {
/* 287 */               b(dfm1, j + i3 * i2, i, (i3 >= 10) ? 160 : 52, 0, 9, 9);
/*     */             }
/* 289 */             if (i3 * 2 + 1 == m) {
/* 290 */               b(dfm1, j + i3 * i2, i, (i3 >= 10) ? 169 : 61, 0, 9, 9);
/*     */             }
/*     */           } 
/*     */         } else {
/* 294 */           float f = afm.a(m / 20.0F, 0.0F, 1.0F);
/* 295 */           int i3 = (int)((1.0F - f) * 255.0F) << 16 | (int)(f * 255.0F) << 8;
/* 296 */           String str1 = "" + (m / 2.0F);
/* 297 */           if (k - this.b.g.b(str1 + "hp") >= j) {
/* 298 */             str1 = str1 + "hp";
/*     */           }
/*     */           
/* 301 */           this.b.g.a(dfm1, str1, ((k + j) / 2 - this.b.g.b(str1) / 2), i, i3);
/*     */         } 
/*     */       } 
/*     */     } else {
/* 305 */       String str1 = k.o + "" + m;
/*     */       
/* 307 */       this.b.g.a(dfm1, str1, (k - this.b.g.b(str1)), i, 16777215);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(@Nullable nr ☃) {
/* 312 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public void b(@Nullable nr ☃) {
/* 316 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/* 320 */     this.e = null;
/* 321 */     this.d = null;
/*     */   }
/*     */   
/*     */   static class a implements Comparator<dwx> { private a() {}
/*     */     
/*     */     public int a(dwx ☃, dwx dwx1) {
/* 327 */       ddl ddl1 = ☃.j();
/* 328 */       ddl ddl2 = dwx1.j();
/*     */       
/* 330 */       return ComparisonChain.start()
/*     */         
/* 332 */         .compareTrueFirst((☃.b() != bru.e), (dwx1.b() != bru.e))
/*     */         
/* 334 */         .compare((ddl1 != null) ? ddl1.b() : "", (ddl2 != null) ? ddl2.b() : "")
/*     */         
/* 336 */         .compare(☃.a().getName(), dwx1.a().getName(), String::compareToIgnoreCase)
/* 337 */         .result();
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */