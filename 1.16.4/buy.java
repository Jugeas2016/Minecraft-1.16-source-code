/*     */ import java.util.Optional;
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
/*     */ public class buy
/*     */   extends bud
/*     */   implements bzu
/*     */ {
/*  48 */   protected static final ddh a = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D);
/*  49 */   public static final cey b = cex.r;
/*  50 */   public static final cey c = cex.y;
/*  51 */   public static final cey d = cex.C;
/*  52 */   public static final cfb e = cex.O;
/*     */ 
/*     */   
/*  55 */   private static final ddh f = buo.a(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D);
/*     */   
/*     */   private final boolean g;
/*     */   
/*     */   private final int h;
/*     */   
/*     */   public buy(boolean ☃, int i, ceg.c c1) {
/*  62 */     super(c1);
/*  63 */     this.g = ☃;
/*  64 */     this.h = i;
/*  65 */     j(((ceh)this.n.b()).a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, gc.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  70 */     ccj ccj = brx1.c(fx1);
/*  71 */     if (ccj instanceof ccm) {
/*  72 */       ccm ccm = (ccm)ccj;
/*  73 */       bmb bmb = bfw1.b(aot1);
/*  74 */       Optional<boh> optional = ccm.a(bmb);
/*  75 */       if (optional.isPresent()) {
/*  76 */         if (!brx1.v && ccm.a(bfw1.bC.d ? bmb.i() : bmb, ((boh)optional.get()).e())) {
/*  77 */           bfw1.a(aea.au);
/*  78 */           return aou.a;
/*     */         } 
/*  80 */         return aou.b;
/*     */       } 
/*     */     } 
/*     */     
/*  84 */     return aou.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/*  89 */     if (!aqa1.aD() && ((Boolean)☃.c(b)).booleanValue() && aqa1 instanceof aqm && !bpu.i((aqm)aqa1)) {
/*  90 */       aqa1.a(apk.a, this.h);
/*     */     }
/*     */     
/*  93 */     super.a(☃, brx1, fx1, aqa1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  98 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/*     */     
/* 102 */     ccj ccj = brx1.c(fx1);
/* 103 */     if (ccj instanceof ccm) {
/* 104 */       aoq.a(brx1, fx1, ((ccm)ccj).d());
/*     */     }
/*     */     
/* 107 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/* 113 */     bry bry = ☃.p();
/* 114 */     fx fx = ☃.a();
/* 115 */     boolean bool = (bry.b(fx).a() == cuy.c);
/* 116 */     return n()
/* 117 */       .a(d, Boolean.valueOf(bool))
/* 118 */       .a(c, Boolean.valueOf(l(bry.d_(fx.c()))))
/* 119 */       .a(b, Boolean.valueOf(!bool))
/* 120 */       .a(e, ☃.f());
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 125 */     if (((Boolean)☃.c(d)).booleanValue()) {
/* 126 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/*     */     
/* 129 */     if (gc1 == gc.a) {
/* 130 */       return ☃.a(c, Boolean.valueOf(l(ceh1)));
/*     */     }
/* 132 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */   
/*     */   private boolean l(ceh ☃) {
/* 136 */     return ☃.a(bup.gA);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 141 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/* 146 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 151 */     if (!((Boolean)☃.c(b)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 155 */     if (random.nextInt(10) == 0) {
/* 156 */       brx1.a(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, adq.bp, adr.e, 0.5F + random.nextFloat(), random.nextFloat() * 0.7F + 0.6F, false);
/*     */     }
/*     */     
/* 159 */     if (this.g && random.nextInt(5) == 0) {
/* 160 */       for (int i = 0; i < random.nextInt(1) + 1; i++) {
/* 161 */         brx1.a(hh.M, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, (random.nextFloat() / 2.0F), 5.0E-5D, (random.nextFloat() / 2.0F));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void c(bry ☃, fx fx1, ceh ceh1) {
/* 167 */     if (☃.s_()) {
/* 168 */       for (int i = 0; i < 20; i++) {
/* 169 */         a((brx)☃, fx1, ((Boolean)ceh1.c(c)).booleanValue(), true);
/*     */       }
/*     */     }
/*     */     
/* 173 */     ccj ccj = ☃.c(fx1);
/* 174 */     if (ccj instanceof ccm) {
/* 175 */       ((ccm)ccj).f();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bry ☃, fx fx1, ceh ceh1, cux cux1) {
/* 181 */     if (!((Boolean)ceh1.c(cex.C)).booleanValue() && cux1.a() == cuy.c) {
/* 182 */       boolean bool = ((Boolean)ceh1.c(b)).booleanValue();
/* 183 */       if (bool) {
/* 184 */         if (!☃.s_()) {
/* 185 */           ☃.a((bfw)null, fx1, adq.eM, adr.e, 1.0F, 1.0F);
/*     */         }
/*     */         
/* 188 */         c(☃, fx1, ceh1);
/*     */       } 
/*     */       
/* 191 */       ☃.a(fx1, ceh1.a(d, Boolean.valueOf(true)).a(b, Boolean.valueOf(false)), 3);
/* 192 */       ☃.I().a(fx1, cux1.a(), cux1.a().a(☃));
/* 193 */       return true;
/*     */     } 
/* 195 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, ceh ceh1, dcj dcj1, bgm bgm1) {
/* 200 */     if (!☃.v && bgm1.bq()) {
/* 201 */       aqa aqa = bgm1.v();
/* 202 */       boolean bool = (aqa == null || aqa instanceof bfw || ☃.V().b(brt.b));
/* 203 */       if (bool && !((Boolean)ceh1.c(b)).booleanValue() && !((Boolean)ceh1.c(d)).booleanValue()) {
/* 204 */         fx fx = dcj1.a();
/* 205 */         ☃.a(fx, ceh1.a(cex.r, Boolean.valueOf(true)), 11);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, fx fx1, boolean bool1, boolean bool2) {
/* 211 */     Random random = ☃.u_();
/* 212 */     hi hi = bool1 ? hh.ah : hh.ag;
/* 213 */     ☃.b(hi, true, fx1
/*     */         
/* 215 */         .u() + 0.5D + random.nextDouble() / 3.0D * (random.nextBoolean() ? true : -1), fx1
/* 216 */         .v() + random.nextDouble() + random.nextDouble(), fx1
/* 217 */         .w() + 0.5D + random.nextDouble() / 3.0D * (random.nextBoolean() ? true : -1), 0.0D, 0.07D, 0.0D);
/*     */ 
/*     */     
/* 220 */     if (bool2) {
/* 221 */       ☃.a(hh.S, fx1
/* 222 */           .u() + 0.25D + random.nextDouble() / 2.0D * (random.nextBoolean() ? true : -1), fx1
/* 223 */           .v() + 0.4D, fx1
/* 224 */           .w() + 0.25D + random.nextDouble() / 2.0D * (random.nextBoolean() ? true : -1), 0.0D, 0.005D, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(brx ☃, fx fx1) {
/* 237 */     for (int i = 1; i <= 5; i++) {
/* 238 */       fx fx2 = fx1.c(i);
/* 239 */       ceh ceh = ☃.d_(fx2);
/* 240 */       if (g(ceh)) {
/* 241 */         return true;
/*     */       }
/*     */       
/* 244 */       boolean bool = dde.c(f, ceh.b(☃, fx1, dcs.a()), dcr.i);
/* 245 */       if (bool) {
/*     */ 
/*     */         
/* 248 */         ceh ceh1 = ☃.d_(fx2.c());
/* 249 */         return g(ceh1);
/*     */       } 
/*     */     } 
/* 252 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean g(ceh ☃) {
/* 257 */     return (☃.b(b) && ☃.a(aed.ay) && ((Boolean)☃.c(b)).booleanValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 262 */     if (((Boolean)☃.c(d)).booleanValue()) {
/* 263 */       return cuy.c.a(false);
/*     */     }
/* 265 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 270 */     return ☃.a(e, bzm1.a((gc)☃.c(e)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 275 */     return ☃.a(byg1.a((gc)☃.c(e)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 280 */     ☃.a((cfj<?>[])new cfj[] { b, c, d, e });
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/* 285 */     return new ccm();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 290 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean h(ceh ☃) {
/* 294 */     return (☃.a(aed.ay, ☃ -> (☃.b(cex.C) && ☃.b(cex.r))) && 
/* 295 */       !((Boolean)☃.c(cex.C)).booleanValue() && !((Boolean)☃.c(cex.r)).booleanValue());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\buy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */