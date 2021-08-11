/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectListIterator;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class brp
/*     */ {
/*     */   private final boolean b;
/*     */   private final a c;
/*  44 */   private static final brq a = new brq();
/*     */   
/*     */   public enum a {
/*  47 */     a,
/*  48 */     b,
/*  49 */     c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   private final Random d = new Random();
/*     */   
/*     */   private final brx e;
/*     */   private final double f;
/*     */   private final double g;
/*     */   private final double h;
/*     */   @Nullable
/*     */   private final aqa i;
/*     */   private final float j;
/*     */   private final apk k;
/*     */   private final brq l;
/*  67 */   private final List<fx> m = Lists.newArrayList();
/*  68 */   private final Map<bfw, dcn> n = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public brp(brx ☃, @Nullable aqa aqa1, double d1, double d2, double d3, float f, List<fx> list) {
/*  75 */     this(☃, aqa1, d1, d2, d3, f, false, a.c, list);
/*     */   }
/*     */   
/*     */   public brp(brx ☃, @Nullable aqa aqa1, double d1, double d2, double d3, float f, boolean bool, a a1, List<fx> list) {
/*  79 */     this(☃, aqa1, d1, d2, d3, f, bool, a1);
/*  80 */     this.m.addAll(list);
/*     */   }
/*     */   
/*     */   public brp(brx ☃, @Nullable aqa aqa1, double d1, double d2, double d3, float f, boolean bool, a a1) {
/*  84 */     this(☃, aqa1, null, null, d1, d2, d3, f, bool, a1);
/*     */   }
/*     */   
/*     */   public brp(brx ☃, @Nullable aqa aqa1, @Nullable apk apk1, @Nullable brq brq1, double d1, double d2, double d3, float f, boolean bool, a a1) {
/*  88 */     this.e = ☃;
/*  89 */     this.i = aqa1;
/*  90 */     this.j = f;
/*  91 */     this.f = d1;
/*  92 */     this.g = d2;
/*  93 */     this.h = d3;
/*  94 */     this.b = bool;
/*  95 */     this.c = a1;
/*  96 */     this.k = (apk1 == null) ? apk.a(this) : apk1;
/*  97 */     this.l = (brq1 == null) ? a(aqa1) : brq1;
/*     */   }
/*     */   
/*     */   private brq a(@Nullable aqa ☃) {
/* 101 */     return (☃ == null) ? a : new brn(☃);
/*     */   }
/*     */   
/*     */   public static float a(dcn ☃, aqa aqa1) {
/* 105 */     dci dci = aqa1.cc();
/* 106 */     double d1 = 1.0D / ((dci.d - dci.a) * 2.0D + 1.0D);
/* 107 */     double d2 = 1.0D / ((dci.e - dci.b) * 2.0D + 1.0D);
/* 108 */     double d3 = 1.0D / ((dci.f - dci.c) * 2.0D + 1.0D);
/*     */     
/* 110 */     double d4 = (1.0D - Math.floor(1.0D / d1) * d1) / 2.0D;
/* 111 */     double d5 = (1.0D - Math.floor(1.0D / d3) * d3) / 2.0D;
/*     */     
/* 113 */     if (d1 < 0.0D || d2 < 0.0D || d3 < 0.0D) {
/* 114 */       return 0.0F;
/*     */     }
/* 116 */     int i = 0;
/* 117 */     int j = 0; float f;
/* 118 */     for (f = 0.0F; f <= 1.0F; f = (float)(f + d1)) {
/* 119 */       float f1; for (f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d2)) {
/* 120 */         float f2; for (f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d3)) {
/* 121 */           double d6 = afm.d(f, dci.a, dci.d);
/* 122 */           double d7 = afm.d(f1, dci.b, dci.e);
/* 123 */           double d8 = afm.d(f2, dci.c, dci.f);
/* 124 */           dcn dcn1 = new dcn(d6 + d4, d7, d8 + d5);
/* 125 */           if (aqa1.l.a(new brf(dcn1, ☃, brf.a.a, brf.b.a, aqa1)).c() == dcl.a.a) {
/* 126 */             i++;
/*     */           }
/* 128 */           j++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 133 */     return i / j;
/*     */   }
/*     */   
/*     */   public void a() {
/* 137 */     Set<fx> ☃ = Sets.newHashSet();
/*     */     
/* 139 */     int i = 16;
/* 140 */     for (int j = 0; j < 16; j++) {
/* 141 */       for (int i5 = 0; i5 < 16; i5++) {
/* 142 */         for (int i6 = 0; i6 < 16; i6++) {
/* 143 */           if (j == 0 || j == 15 || i5 == 0 || i5 == 15 || i6 == 0 || i6 == 15) {
/*     */ 
/*     */ 
/*     */             
/* 147 */             double d1 = (j / 15.0F * 2.0F - 1.0F);
/* 148 */             double d2 = (i5 / 15.0F * 2.0F - 1.0F);
/* 149 */             double d3 = (i6 / 15.0F * 2.0F - 1.0F);
/* 150 */             double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/*     */             
/* 152 */             d1 /= d4;
/* 153 */             d2 /= d4;
/* 154 */             d3 /= d4;
/*     */             
/* 156 */             float f1 = this.j * (0.7F + this.e.t.nextFloat() * 0.6F);
/* 157 */             double d5 = this.f;
/* 158 */             double d6 = this.g;
/* 159 */             double d7 = this.h;
/*     */             
/* 161 */             float f2 = 0.3F;
/* 162 */             while (f1 > 0.0F) {
/* 163 */               fx fx = new fx(d5, d6, d7);
/* 164 */               ceh ceh = this.e.d_(fx);
/* 165 */               cux cux = this.e.b(fx);
/*     */               
/* 167 */               Optional<Float> optional = this.l.a(this, this.e, fx, ceh, cux);
/* 168 */               if (optional.isPresent()) {
/* 169 */                 f1 -= (((Float)optional.get()).floatValue() + 0.3F) * 0.3F;
/*     */               }
/*     */               
/* 172 */               if (f1 > 0.0F && this.l.a(this, this.e, fx, ceh, f1)) {
/* 173 */                 ☃.add(fx);
/*     */               }
/*     */               
/* 176 */               d5 += d1 * 0.30000001192092896D;
/* 177 */               d6 += d2 * 0.30000001192092896D;
/* 178 */               d7 += d3 * 0.30000001192092896D;
/* 179 */               f1 -= 0.22500001F;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 185 */     this.m.addAll(☃);
/*     */     
/* 187 */     float f = this.j * 2.0F;
/*     */     
/* 189 */     int k = afm.c(this.f - f - 1.0D);
/* 190 */     int m = afm.c(this.f + f + 1.0D);
/* 191 */     int n = afm.c(this.g - f - 1.0D);
/* 192 */     int i1 = afm.c(this.g + f + 1.0D);
/* 193 */     int i2 = afm.c(this.h - f - 1.0D);
/* 194 */     int i3 = afm.c(this.h + f + 1.0D);
/* 195 */     List<aqa> list = this.e.a(this.i, new dci(k, n, i2, m, i1, i3));
/* 196 */     dcn dcn = new dcn(this.f, this.g, this.h);
/*     */     
/* 198 */     for (int i4 = 0; i4 < list.size(); i4++) {
/* 199 */       aqa aqa1 = list.get(i4);
/* 200 */       if (!aqa1.ci()) {
/*     */ 
/*     */         
/* 203 */         double d = (afm.a(aqa1.e(dcn)) / f);
/*     */         
/* 205 */         if (d <= 1.0D) {
/* 206 */           double d1 = aqa1.cD() - this.f;
/* 207 */           double d2 = ((aqa1 instanceof bcw) ? aqa1.cE() : aqa1.cG()) - this.g;
/* 208 */           double d3 = aqa1.cH() - this.h;
/*     */           
/* 210 */           double d4 = afm.a(d1 * d1 + d2 * d2 + d3 * d3);
/* 211 */           if (d4 != 0.0D) {
/*     */ 
/*     */ 
/*     */             
/* 215 */             d1 /= d4;
/* 216 */             d2 /= d4;
/* 217 */             d3 /= d4;
/*     */             
/* 219 */             double d5 = a(dcn, aqa1);
/* 220 */             double d6 = (1.0D - d) * d5;
/* 221 */             aqa1.a(b(), (int)((d6 * d6 + d6) / 2.0D * 7.0D * f + 1.0D));
/*     */             
/* 223 */             double d7 = d6;
/* 224 */             if (aqa1 instanceof aqm) {
/* 225 */               d7 = bqf.a((aqm)aqa1, d6);
/*     */             }
/* 227 */             aqa1.f(aqa1.cC().b(d1 * d7, d2 * d7, d3 * d7));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 233 */             if (aqa1 instanceof bfw) {
/* 234 */               bfw bfw = (bfw)aqa1;
/* 235 */               if (!bfw.a_() && (!bfw.b_() || !bfw.bC.b))
/* 236 */                 this.n.put(bfw, new dcn(d1 * d6, d2 * d6, d3 * d6)); 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void a(boolean ☃) {
/* 244 */     if (this.e.v) {
/* 245 */       this.e.a(this.f, this.g, this.h, adq.eL, adr.e, 4.0F, (1.0F + (this.e.t.nextFloat() - this.e.t.nextFloat()) * 0.2F) * 0.7F, false);
/*     */     }
/* 247 */     boolean bool = (this.c != a.a);
/* 248 */     if (☃) {
/* 249 */       if (this.j < 2.0F || !bool) {
/* 250 */         this.e.a(hh.w, this.f, this.g, this.h, 1.0D, 0.0D, 0.0D);
/*     */       } else {
/* 252 */         this.e.a(hh.v, this.f, this.g, this.h, 1.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     }
/*     */     
/* 256 */     if (bool) {
/* 257 */       ObjectArrayList<Pair<bmb, fx>> objectArrayList = new ObjectArrayList();
/*     */       
/* 259 */       Collections.shuffle(this.m, this.e.t);
/*     */       
/* 261 */       for (fx fx : this.m) {
/* 262 */         ceh ceh = this.e.d_(fx);
/* 263 */         buo buo = ceh.b();
/*     */         
/* 265 */         if (!ceh.g()) {
/* 266 */           fx fx1 = fx.h();
/* 267 */           this.e.Z().a("explosion_blocks");
/* 268 */           if (buo.a(this) && this.e instanceof aag) {
/* 269 */             ccj ccj = buo.q() ? this.e.c(fx) : null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 275 */             cyv.a a1 = (new cyv.a((aag)this.e)).a(this.e.t).<dcn>a(dbc.f, dcn.a(fx)).<bmb>a(dbc.i, bmb.b).<ccj>b(dbc.h, ccj).b(dbc.a, this.i);
/*     */             
/* 277 */             if (this.c == a.c) {
/* 278 */               a1.a(dbc.j, Float.valueOf(this.j));
/*     */             }
/*     */             
/* 281 */             ceh.a(a1).forEach(bmb1 -> a(☃, bmb1, fx1));
/*     */           } 
/* 283 */           this.e.a(fx, bup.a.n(), 3);
/* 284 */           buo.a(this.e, fx, this);
/* 285 */           this.e.Z().c();
/*     */         } 
/*     */       } 
/*     */       
/* 289 */       for (ObjectListIterator<Pair<bmb, fx>> objectListIterator = objectArrayList.iterator(); objectListIterator.hasNext(); ) { Pair<bmb, fx> pair = objectListIterator.next();
/* 290 */         buo.a(this.e, (fx)pair.getSecond(), (bmb)pair.getFirst()); }
/*     */     
/*     */     } 
/* 293 */     if (this.b) {
/* 294 */       for (fx fx : this.m) {
/* 295 */         if (this.d.nextInt(3) == 0 && this.e.d_(fx).g() && this.e.d_(fx.c()).i(this.e, fx.c())) {
/* 296 */           this.e.a(fx, bue.a(this.e, fx));
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(ObjectArrayList<Pair<bmb, fx>> ☃, bmb bmb1, fx fx1) {
/* 303 */     int i = ☃.size();
/* 304 */     for (int j = 0; j < i; j++) {
/* 305 */       Pair<bmb, fx> pair = (Pair<bmb, fx>)☃.get(j);
/* 306 */       bmb bmb2 = (bmb)pair.getFirst();
/* 307 */       if (bcv.a(bmb2, bmb1)) {
/* 308 */         bmb bmb3 = bcv.a(bmb2, bmb1, 16);
/* 309 */         ☃.set(j, Pair.of(bmb3, pair.getSecond()));
/* 310 */         if (bmb1.a()) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */     } 
/* 315 */     ☃.add(Pair.of(bmb1, fx1));
/*     */   }
/*     */   
/*     */   public apk b() {
/* 319 */     return this.k;
/*     */   }
/*     */   
/*     */   public Map<bfw, dcn> c() {
/* 323 */     return this.n;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqm d() {
/* 328 */     if (this.i == null) {
/* 329 */       return null;
/*     */     }
/* 331 */     if (this.i instanceof bcw) {
/* 332 */       return ((bcw)this.i).g();
/*     */     }
/* 334 */     if (this.i instanceof aqm) {
/* 335 */       return (aqm)this.i;
/*     */     }
/* 337 */     if (this.i instanceof bgm) {
/* 338 */       aqa ☃ = ((bgm)this.i).v();
/* 339 */       if (☃ instanceof aqm) {
/* 340 */         return (aqm)☃;
/*     */       }
/*     */     } 
/*     */     
/* 344 */     return null;
/*     */   }
/*     */   
/*     */   public void e() {
/* 348 */     this.m.clear();
/*     */   }
/*     */   
/*     */   public List<fx> f() {
/* 352 */     return this.m;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */