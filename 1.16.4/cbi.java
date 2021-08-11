/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class cbi
/*     */   extends buo
/*     */ {
/*  27 */   public static final cey a = bys.e;
/*  28 */   public static final cey b = bys.a;
/*  29 */   public static final cey c = bys.b;
/*  30 */   public static final cey d = bys.c;
/*  31 */   public static final cey e = bys.d;
/*     */   static {
/*  33 */     f = (Map<gc, cey>)bys.g.entrySet().stream().filter(☃ -> (☃.getKey() != gc.a)).collect(x.a());
/*     */   }
/*     */   public static final Map<gc, cey> f;
/*  36 */   private static final ddh g = buo.a(0.0D, 15.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  37 */   private static final ddh h = buo.a(0.0D, 0.0D, 0.0D, 1.0D, 16.0D, 16.0D);
/*  38 */   private static final ddh i = buo.a(15.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  39 */   private static final ddh j = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 1.0D);
/*  40 */   private static final ddh k = buo.a(0.0D, 0.0D, 15.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   private final Map<ceh, ddh> o;
/*     */   
/*     */   public cbi(ceg.c ☃) {
/*  45 */     super(☃);
/*  46 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
/*     */     
/*  48 */     this.o = (Map<ceh, ddh>)ImmutableMap.copyOf((Map)this.n.a().stream().collect(Collectors.toMap(Function.identity(), cbi::h)));
/*     */   }
/*     */   
/*     */   private static ddh h(ceh ☃) {
/*  52 */     ddh ddh1 = dde.a();
/*  53 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  54 */       ddh1 = g;
/*     */     }
/*  56 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  57 */       ddh1 = dde.a(ddh1, j);
/*     */     }
/*  59 */     if (((Boolean)☃.c(d)).booleanValue()) {
/*  60 */       ddh1 = dde.a(ddh1, k);
/*     */     }
/*  62 */     if (((Boolean)☃.c(c)).booleanValue()) {
/*  63 */       ddh1 = dde.a(ddh1, i);
/*     */     }
/*  65 */     if (((Boolean)☃.c(e)).booleanValue()) {
/*  66 */       ddh1 = dde.a(ddh1, h);
/*     */     }
/*  68 */     return ddh1;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  73 */     return this.o.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  78 */     return l(g(☃, brz1, fx1));
/*     */   }
/*     */   
/*     */   private boolean l(ceh ☃) {
/*  82 */     return (m(☃) > 0);
/*     */   }
/*     */   
/*     */   private int m(ceh ☃) {
/*  86 */     int i = 0;
/*  87 */     for (cey cey1 : f.values()) {
/*  88 */       if (((Boolean)☃.c(cey1)).booleanValue()) {
/*  89 */         i++;
/*     */       }
/*     */     } 
/*     */     
/*  93 */     return i;
/*     */   }
/*     */   
/*     */   private boolean b(brc ☃, fx fx1, gc gc1) {
/*  97 */     if (gc1 == gc.a) {
/*  98 */       return false;
/*     */     }
/*     */     
/* 101 */     fx fx2 = fx1.a(gc1);
/* 102 */     if (a(☃, fx2, gc1)) {
/* 103 */       return true;
/*     */     }
/*     */     
/* 106 */     if (gc1.n() != gc.a.b) {
/*     */       
/* 108 */       cey cey1 = f.get(gc1);
/* 109 */       ceh ceh = ☃.d_(fx1.b());
/* 110 */       return (ceh.a(this) && ((Boolean)ceh.c(cey1)).booleanValue());
/*     */     } 
/* 112 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(brc ☃, fx fx1, gc gc1) {
/* 116 */     ceh ceh = ☃.d_(fx1);
/*     */     
/* 118 */     return buo.a(ceh.k(☃, fx1), gc1.f());
/*     */   }
/*     */   
/*     */   private ceh g(ceh ☃, brc brc1, fx fx1) {
/* 122 */     fx fx2 = fx1.b();
/* 123 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 124 */       ☃ = ☃.a(a, Boolean.valueOf(a(brc1, fx2, gc.a)));
/*     */     }
/*     */ 
/*     */     
/* 128 */     ceh ceh1 = null;
/* 129 */     for (gc gc : gc.c.a) {
/* 130 */       cey cey1 = a(gc);
/*     */       
/* 132 */       if (((Boolean)☃.c(cey1)).booleanValue()) {
/* 133 */         boolean bool = b(brc1, fx1, gc);
/* 134 */         if (!bool) {
/* 135 */           if (ceh1 == null) {
/* 136 */             ceh1 = brc1.d_(fx2);
/*     */           }
/* 138 */           bool = (ceh1.a(this) && ((Boolean)ceh1.c(cey1)).booleanValue());
/*     */         } 
/* 140 */         ☃ = ☃.a(cey1, Boolean.valueOf(bool));
/*     */       } 
/*     */     } 
/* 143 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 148 */     if (gc1 == gc.a) {
/* 149 */       return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */     }
/*     */     
/* 152 */     ceh ceh2 = g(☃, bry1, fx1);
/*     */     
/* 154 */     if (!l(ceh2)) {
/* 155 */       return bup.a.n();
/*     */     }
/*     */     
/* 158 */     return ceh2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 163 */     if (aag1.t.nextInt(4) != 0) {
/*     */       return;
/*     */     }
/*     */     
/* 167 */     gc gc = gc.a(random);
/*     */     
/* 169 */     fx fx2 = fx1.b();
/* 170 */     if (gc.n().d() && !((Boolean)☃.c(a(gc))).booleanValue()) {
/* 171 */       if (!a(aag1, fx1)) {
/*     */         return;
/*     */       }
/*     */       
/* 175 */       fx fx3 = fx1.a(gc);
/*     */       
/* 177 */       ceh ceh1 = aag1.d_(fx3);
/* 178 */       if (ceh1.g()) {
/*     */         
/* 180 */         gc gc1 = gc.g();
/* 181 */         gc gc2 = gc.h();
/*     */ 
/*     */         
/* 184 */         boolean bool1 = ((Boolean)☃.c(a(gc1))).booleanValue();
/* 185 */         boolean bool2 = ((Boolean)☃.c(a(gc2))).booleanValue();
/*     */         
/* 187 */         fx fx4 = fx3.a(gc1);
/* 188 */         fx fx5 = fx3.a(gc2);
/*     */         
/* 190 */         if (bool1 && a(aag1, fx4, gc1)) {
/* 191 */           aag1.a(fx3, n().a(a(gc1), Boolean.valueOf(true)), 2);
/* 192 */         } else if (bool2 && a(aag1, fx5, gc2)) {
/* 193 */           aag1.a(fx3, n().a(a(gc2), Boolean.valueOf(true)), 2);
/*     */         } else {
/*     */           
/* 196 */           gc gc3 = gc.f();
/* 197 */           if (bool1 && aag1.w(fx4) && a(aag1, fx1.a(gc1), gc3)) {
/* 198 */             aag1.a(fx4, n().a(a(gc3), Boolean.valueOf(true)), 2);
/* 199 */           } else if (bool2 && aag1.w(fx5) && a(aag1, fx1.a(gc2), gc3)) {
/* 200 */             aag1.a(fx5, n().a(a(gc3), Boolean.valueOf(true)), 2);
/*     */           
/*     */           }
/* 203 */           else if (aag1.t.nextFloat() < 0.05D && a(aag1, fx3.b(), gc.b)) {
/* 204 */             aag1.a(fx3, n().a(a, Boolean.valueOf(true)), 2);
/*     */           }
/*     */         
/*     */         } 
/* 208 */       } else if (a(aag1, fx3, gc)) {
/*     */         
/* 210 */         aag1.a(fx1, ☃.a(a(gc), Boolean.valueOf(true)), 2);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 215 */     if (gc == gc.b && fx1.v() < 255) {
/* 216 */       if (b(aag1, fx1, gc)) {
/* 217 */         aag1.a(fx1, ☃.a(a, Boolean.valueOf(true)), 2);
/*     */         return;
/*     */       } 
/* 220 */       if (aag1.w(fx2)) {
/* 221 */         if (!a(aag1, fx1)) {
/*     */           return;
/*     */         }
/*     */ 
/*     */         
/* 226 */         ceh ceh1 = ☃;
/* 227 */         for (gc gc1 : gc.c.a) {
/* 228 */           if (random.nextBoolean() || !a(aag1, fx2.a(gc1), gc.b)) {
/* 229 */             ceh1 = ceh1.a(a(gc1), Boolean.valueOf(false));
/*     */           }
/*     */         } 
/* 232 */         if (n(ceh1)) {
/* 233 */           aag1.a(fx2, ceh1, 2);
/*     */         }
/*     */         return;
/*     */       } 
/*     */     } 
/* 238 */     if (fx1.v() > 0) {
/*     */       
/* 240 */       fx fx3 = fx1.c();
/* 241 */       ceh ceh1 = aag1.d_(fx3);
/*     */       
/* 243 */       if (ceh1.g() || ceh1.a(this)) {
/* 244 */         ceh ceh2 = ceh1.g() ? n() : ceh1;
/* 245 */         ceh ceh3 = a(☃, ceh2, random);
/* 246 */         if (ceh2 != ceh3 && n(ceh3)) {
/* 247 */           aag1.a(fx3, ceh3, 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private ceh a(ceh ☃, ceh ceh1, Random random) {
/* 254 */     for (gc gc : gc.c.a) {
/* 255 */       if (random.nextBoolean()) {
/* 256 */         cey cey1 = a(gc);
/* 257 */         if (((Boolean)☃.c(cey1)).booleanValue()) {
/* 258 */           ceh1 = ceh1.a(cey1, Boolean.valueOf(true));
/*     */         }
/*     */       } 
/*     */     } 
/* 262 */     return ceh1;
/*     */   }
/*     */   
/*     */   private boolean n(ceh ☃) {
/* 266 */     return (((Boolean)☃.c(b)).booleanValue() || ((Boolean)☃.c(c)).booleanValue() || ((Boolean)☃.c(d)).booleanValue() || ((Boolean)☃.c(e)).booleanValue());
/*     */   }
/*     */   
/*     */   private boolean a(brc ☃, fx fx1) {
/* 270 */     int i = 4;
/*     */     
/* 272 */     Iterable<fx> iterable = fx.b(fx1
/* 273 */         .u() - 4, fx1.v() - 1, fx1.w() - 4, fx1
/* 274 */         .u() + 4, fx1.v() + 1, fx1.w() + 4);
/*     */ 
/*     */     
/* 277 */     int j = 5;
/* 278 */     for (fx fx2 : iterable) {
/* 279 */       if (☃.d_(fx2).a(this) && 
/* 280 */         --j <= 0) {
/* 281 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 285 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, bny bny1) {
/* 290 */     ceh ceh1 = bny1.p().d_(bny1.a());
/* 291 */     if (ceh1.a(this)) {
/* 292 */       return (m(ceh1) < f.size());
/*     */     }
/*     */     
/* 295 */     return super.a(☃, bny1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/* 301 */     ceh ceh1 = ☃.p().d_(☃.a());
/* 302 */     boolean bool = ceh1.a(this);
/* 303 */     ceh ceh2 = bool ? ceh1 : n();
/*     */     
/* 305 */     for (gc gc : ☃.e()) {
/* 306 */       if (gc != gc.a) {
/* 307 */         cey cey1 = a(gc);
/* 308 */         boolean bool1 = (bool && ((Boolean)ceh1.c(cey1)).booleanValue());
/* 309 */         if (!bool1 && b(☃.p(), ☃.a(), gc)) {
/* 310 */           return ceh2.a(cey1, Boolean.valueOf(true));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 315 */     return bool ? ceh2 : null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 320 */     ☃.a((cfj<?>[])new cfj[] { a, b, c, d, e });
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 325 */     switch (null.a[bzm1.ordinal()]) {
/*     */       case 1:
/* 327 */         return ☃.a(b, ☃.c(d)).a(c, ☃.c(e)).a(d, ☃.c(b)).a(e, ☃.c(c));
/*     */       case 2:
/* 329 */         return ☃.a(b, ☃.c(c)).a(c, ☃.c(d)).a(d, ☃.c(e)).a(e, ☃.c(b));
/*     */       case 3:
/* 331 */         return ☃.a(b, ☃.c(e)).a(c, ☃.c(b)).a(d, ☃.c(c)).a(e, ☃.c(d));
/*     */     } 
/* 333 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 339 */     switch (null.b[byg1.ordinal()]) {
/*     */       case 1:
/* 341 */         return ☃.a(b, ☃.c(d)).a(d, ☃.c(b));
/*     */       case 2:
/* 343 */         return ☃.a(c, ☃.c(e)).a(e, ☃.c(c));
/*     */     } 
/*     */ 
/*     */     
/* 347 */     return super.a(☃, byg1);
/*     */   }
/*     */   
/*     */   public static cey a(gc ☃) {
/* 351 */     return f.get(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */