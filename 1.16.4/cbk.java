/*     */ import com.google.common.collect.ImmutableMap;
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
/*     */ public class cbk
/*     */   extends buo
/*     */   implements bzu
/*     */ {
/*  29 */   public static final cey a = cex.G;
/*  30 */   public static final cfe<cfp> b = cex.S;
/*  31 */   public static final cfe<cfp> c = cex.T;
/*  32 */   public static final cfe<cfp> d = cex.U;
/*  33 */   public static final cfe<cfp> e = cex.V;
/*  34 */   public static final cey f = cex.C;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Map<ceh, ddh> g;
/*     */ 
/*     */ 
/*     */   
/*     */   private final Map<ceh, ddh> h;
/*     */ 
/*     */ 
/*     */   
/*  47 */   private static final ddh i = buo.a(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
/*  48 */   private static final ddh j = buo.a(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 9.0D);
/*  49 */   private static final ddh k = buo.a(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 16.0D);
/*  50 */   private static final ddh o = buo.a(0.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
/*  51 */   private static final ddh p = buo.a(7.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
/*     */   
/*     */   public cbk(ceg.c ☃) {
/*  54 */     super(☃);
/*  55 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(true)).a(c, cfp.a).a(b, cfp.a).a(d, cfp.a).a(e, cfp.a).a(f, Boolean.valueOf(false)));
/*     */     
/*  57 */     this.g = a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
/*  58 */     this.h = a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
/*     */   }
/*     */   
/*     */   private static ddh a(ddh ☃, cfp cfp1, ddh ddh1, ddh ddh2) {
/*  62 */     if (cfp1 == cfp.c) {
/*  63 */       return dde.a(☃, ddh2);
/*     */     }
/*  65 */     if (cfp1 == cfp.b) {
/*  66 */       return dde.a(☃, ddh1);
/*     */     }
/*  68 */     return ☃;
/*     */   }
/*     */   
/*     */   private Map<ceh, ddh> a(float ☃, float f1, float f2, float f3, float f4, float f5) {
/*  72 */     float f6 = 8.0F - ☃;
/*  73 */     float f7 = 8.0F + ☃;
/*     */     
/*  75 */     float f8 = 8.0F - f1;
/*  76 */     float f9 = 8.0F + f1;
/*     */     
/*  78 */     ddh ddh1 = buo.a(f6, 0.0D, f6, f7, f2, f7);
/*  79 */     ddh ddh2 = buo.a(f8, f3, 0.0D, f9, f4, f9);
/*  80 */     ddh ddh3 = buo.a(f8, f3, f8, f9, f4, 16.0D);
/*  81 */     ddh ddh4 = buo.a(0.0D, f3, f8, f9, f4, f9);
/*  82 */     ddh ddh5 = buo.a(f8, f3, f8, 16.0D, f4, f9);
/*     */     
/*  84 */     ddh ddh6 = buo.a(f8, f3, 0.0D, f9, f5, f9);
/*  85 */     ddh ddh7 = buo.a(f8, f3, f8, f9, f5, 16.0D);
/*  86 */     ddh ddh8 = buo.a(0.0D, f3, f8, f9, f5, f9);
/*  87 */     ddh ddh9 = buo.a(f8, f3, f8, 16.0D, f5, f9);
/*     */ 
/*     */     
/*  90 */     ImmutableMap.Builder<ceh, ddh> builder = ImmutableMap.builder();
/*     */     
/*  92 */     for (Boolean bool : a.a()) {
/*  93 */       for (cfp cfp : b.a()) {
/*  94 */         for (cfp cfp1 : c.a()) {
/*  95 */           for (cfp cfp2 : e.a()) {
/*  96 */             for (cfp cfp3 : d.a()) {
/*  97 */               ddh ddh10 = dde.a();
/*  98 */               ddh10 = a(ddh10, cfp, ddh5, ddh9);
/*  99 */               ddh10 = a(ddh10, cfp2, ddh4, ddh8);
/* 100 */               ddh10 = a(ddh10, cfp1, ddh2, ddh6);
/* 101 */               ddh10 = a(ddh10, cfp3, ddh3, ddh7);
/* 102 */               if (bool.booleanValue()) {
/* 103 */                 ddh10 = dde.a(ddh10, ddh1);
/*     */               }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 110 */               ceh ceh = n().a(a, bool).a(b, cfp).a(e, cfp2).a(c, cfp1).a(d, cfp3);
/*     */               
/* 112 */               builder.put(ceh.a(f, Boolean.valueOf(false)), ddh10);
/* 113 */               builder.put(ceh.a(f, Boolean.valueOf(true)), ddh10);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 119 */     return (Map<ceh, ddh>)builder.build();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 124 */     return this.g.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 129 */     return this.h.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 134 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(ceh ☃, boolean bool, gc gc1) {
/* 138 */     buo buo1 = ☃.b();
/*     */     
/* 140 */     boolean bool1 = (buo1 instanceof bwr && bwr.a(☃, gc1));
/* 141 */     return (☃.a(aed.F) || (!b(buo1) && bool) || buo1 instanceof bxq || bool1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 146 */     brz brz = ☃.p();
/* 147 */     fx fx1 = ☃.a();
/* 148 */     cux cux = ☃.p().b(☃.a());
/*     */     
/* 150 */     fx fx2 = fx1.d();
/* 151 */     fx fx3 = fx1.g();
/* 152 */     fx fx4 = fx1.e();
/* 153 */     fx fx5 = fx1.f();
/* 154 */     fx fx6 = fx1.b();
/*     */     
/* 156 */     ceh ceh1 = brz.d_(fx2);
/* 157 */     ceh ceh2 = brz.d_(fx3);
/* 158 */     ceh ceh3 = brz.d_(fx4);
/* 159 */     ceh ceh4 = brz.d_(fx5);
/* 160 */     ceh ceh5 = brz.d_(fx6);
/*     */     
/* 162 */     boolean bool1 = a(ceh1, ceh1.d(brz, fx2, gc.d), gc.d);
/* 163 */     boolean bool2 = a(ceh2, ceh2.d(brz, fx3, gc.e), gc.e);
/* 164 */     boolean bool3 = a(ceh3, ceh3.d(brz, fx4, gc.c), gc.c);
/* 165 */     boolean bool4 = a(ceh4, ceh4.d(brz, fx5, gc.f), gc.f);
/*     */     
/* 167 */     ceh ceh6 = n().a(f, Boolean.valueOf((cux.a() == cuy.c)));
/* 168 */     return a(brz, ceh6, fx6, ceh5, bool1, bool2, bool3, bool4);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 173 */     if (((Boolean)☃.c(f)).booleanValue()) {
/* 174 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/*     */     
/* 177 */     if (gc1 == gc.a) {
/* 178 */       return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */     }
/*     */     
/* 181 */     if (gc1 == gc.b) {
/* 182 */       return a(bry1, ☃, fx2, ceh1);
/*     */     }
/*     */     
/* 185 */     return a(bry1, fx1, ☃, fx2, ceh1, gc1);
/*     */   }
/*     */   
/*     */   private static boolean a(ceh ☃, cfj<cfp> cfj1) {
/* 189 */     return (☃.c(cfj1) != cfp.a);
/*     */   }
/*     */   
/*     */   private static boolean a(ddh ☃, ddh ddh1) {
/* 193 */     return !dde.c(ddh1, ☃, dcr.e);
/*     */   }
/*     */   
/*     */   private ceh a(brz ☃, ceh ceh1, fx fx1, ceh ceh2) {
/* 197 */     boolean bool1 = a(ceh1, c);
/* 198 */     boolean bool2 = a(ceh1, b);
/* 199 */     boolean bool3 = a(ceh1, d);
/* 200 */     boolean bool4 = a(ceh1, e);
/*     */     
/* 202 */     return a(☃, ceh1, fx1, ceh2, bool1, bool2, bool3, bool4);
/*     */   }
/*     */   
/*     */   private ceh a(brz ☃, fx fx1, ceh ceh1, fx fx2, ceh ceh2, gc gc1) {
/* 206 */     gc gc2 = gc1.f();
/* 207 */     boolean bool1 = (gc1 == gc.c) ? a(ceh2, ceh2.d(☃, fx2, gc2), gc2) : a(ceh1, c);
/* 208 */     boolean bool2 = (gc1 == gc.f) ? a(ceh2, ceh2.d(☃, fx2, gc2), gc2) : a(ceh1, b);
/* 209 */     boolean bool3 = (gc1 == gc.d) ? a(ceh2, ceh2.d(☃, fx2, gc2), gc2) : a(ceh1, d);
/* 210 */     boolean bool4 = (gc1 == gc.e) ? a(ceh2, ceh2.d(☃, fx2, gc2), gc2) : a(ceh1, e);
/*     */     
/* 212 */     fx fx3 = fx1.b();
/* 213 */     ceh ceh3 = ☃.d_(fx3);
/* 214 */     return a(☃, ceh1, fx3, ceh3, bool1, bool2, bool3, bool4);
/*     */   }
/*     */   
/*     */   private ceh a(brz ☃, ceh ceh1, fx fx1, ceh ceh2, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/* 218 */     ddh ddh1 = ceh2.k(☃, fx1).a(gc.a);
/* 219 */     ceh ceh3 = a(ceh1, bool1, bool2, bool3, bool4, ddh1);
/*     */     
/* 221 */     return ceh3.a(a, Boolean.valueOf(a(ceh3, ceh2, ddh1)));
/*     */   }
/*     */   
/*     */   private boolean a(ceh ☃, ceh ceh1, ddh ddh1) {
/* 225 */     boolean bool1 = (ceh1.b() instanceof cbk && ((Boolean)ceh1.c(a)).booleanValue());
/* 226 */     if (bool1) {
/* 227 */       return true;
/*     */     }
/*     */     
/* 230 */     cfp cfp1 = (cfp)☃.c(c);
/* 231 */     cfp cfp2 = (cfp)☃.c(d);
/* 232 */     cfp cfp3 = (cfp)☃.c(b);
/* 233 */     cfp cfp4 = (cfp)☃.c(e);
/*     */     
/* 235 */     boolean bool2 = (cfp2 == cfp.a);
/* 236 */     boolean bool3 = (cfp4 == cfp.a);
/* 237 */     boolean bool4 = (cfp3 == cfp.a);
/* 238 */     boolean bool5 = (cfp1 == cfp.a);
/*     */     
/* 240 */     boolean bool6 = ((bool5 && bool2 && bool3 && bool4) || bool5 != bool2 || bool3 != bool4);
/*     */ 
/*     */     
/* 243 */     if (bool6) {
/* 244 */       return true;
/*     */     }
/*     */     
/* 247 */     boolean bool7 = ((cfp1 == cfp.c && cfp2 == cfp.c) || (cfp3 == cfp.c && cfp4 == cfp.c));
/*     */ 
/*     */     
/* 250 */     if (bool7) {
/* 251 */       return false;
/*     */     }
/*     */     
/* 254 */     return (ceh1.b().a(aed.as) || a(ddh1, i));
/*     */   }
/*     */ 
/*     */   
/*     */   private ceh a(ceh ☃, boolean bool1, boolean bool2, boolean bool3, boolean bool4, ddh ddh1) {
/* 259 */     return ☃
/* 260 */       .a(c, a(bool1, ddh1, j))
/* 261 */       .a(b, a(bool2, ddh1, p))
/* 262 */       .a(d, a(bool3, ddh1, k))
/* 263 */       .a(e, a(bool4, ddh1, o));
/*     */   }
/*     */   
/*     */   private cfp a(boolean ☃, ddh ddh1, ddh ddh2) {
/* 267 */     if (☃) {
/* 268 */       if (a(ddh1, ddh2)) {
/* 269 */         return cfp.c;
/*     */       }
/* 271 */       return cfp.b;
/*     */     } 
/*     */     
/* 274 */     return cfp.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 280 */     if (((Boolean)☃.c(f)).booleanValue()) {
/* 281 */       return cuy.c.a(false);
/*     */     }
/* 283 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(ceh ☃, brc brc1, fx fx1) {
/* 288 */     return !((Boolean)☃.c(f)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 293 */     ☃.a((cfj<?>[])new cfj[] { a, c, b, e, d, f });
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 298 */     switch (null.a[bzm1.ordinal()]) {
/*     */       case 1:
/* 300 */         return ☃.a(c, ☃.c(d)).a(b, ☃.c(e)).a(d, ☃.c(c)).a(e, ☃.c(b));
/*     */       case 2:
/* 302 */         return ☃.a(c, ☃.c(b)).a(b, ☃.c(d)).a(d, ☃.c(e)).a(e, ☃.c(c));
/*     */       case 3:
/* 304 */         return ☃.a(c, ☃.c(e)).a(b, ☃.c(c)).a(d, ☃.c(b)).a(e, ☃.c(d));
/*     */     } 
/* 306 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 312 */     switch (null.b[byg1.ordinal()]) {
/*     */       case 1:
/* 314 */         return ☃.a(c, ☃.c(d)).a(d, ☃.c(c));
/*     */       case 2:
/* 316 */         return ☃.a(b, ☃.c(e)).a(e, ☃.c(b));
/*     */     } 
/*     */ 
/*     */     
/* 320 */     return super.a(☃, byg1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */