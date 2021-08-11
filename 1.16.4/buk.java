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
/*     */ public class buk
/*     */   extends bud
/*     */ {
/*  55 */   private static final gc[] c = new gc[] { gc.e, gc.f, gc.d };
/*     */   
/*  57 */   public static final cfb a = bxm.aq;
/*  58 */   public static final cfg b = cex.au;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public buk(ceg.c ☃) {
/*  64 */     super(☃);
/*  65 */     j(((ceh)this.n.b()).a(b, Integer.valueOf(0)).a(a, gc.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/*  70 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/*  75 */     return ((Integer)☃.c(b)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, bfw bfw1, fx fx1, ceh ceh1, @Nullable ccj ccj1, bmb bmb1) {
/*  80 */     super.a(☃, bfw1, fx1, ceh1, ccj1, bmb1);
/*     */     
/*  82 */     if (!☃.v && 
/*  83 */       ccj1 instanceof ccg) {
/*  84 */       ccg ccg = (ccg)ccj1;
/*     */       
/*  86 */       if (bpu.a(bpw.u, bmb1) == 0) {
/*  87 */         ccg.a(bfw1, ceh1, ccg.b.c);
/*     */         
/*  89 */         ☃.c(fx1, this);
/*     */         
/*  91 */         b(☃, fx1);
/*     */       } 
/*     */       
/*  94 */       ac.K.a((aah)bfw1, ceh1.b(), bmb1, ccg.j());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(brx ☃, fx fx1) {
/* 100 */     List<baa> list = ☃.a(baa.class, (new dci(fx1)).c(8.0D, 6.0D, 8.0D));
/* 101 */     if (!list.isEmpty()) {
/* 102 */       List<bfw> list1 = ☃.a(bfw.class, (new dci(fx1)).c(8.0D, 6.0D, 8.0D));
/* 103 */       int i = list1.size();
/* 104 */       for (baa baa : list) {
/* 105 */         if (baa.A() == null) {
/* 106 */           baa.h(list1.get(☃.t.nextInt(i)));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, fx fx1) {
/* 113 */     a(☃, fx1, new bmb(bmd.rq, 3));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 118 */     bmb bmb = bfw1.b(aot1);
/* 119 */     int i = ((Integer)☃.c(b)).intValue();
/* 120 */     boolean bool = false;
/*     */     
/* 122 */     if (i >= 5) {
/* 123 */       if (bmb.b() == bmd.ng) {
/* 124 */         brx1.a(bfw1, bfw1.cD(), bfw1.cE(), bfw1.cH(), adq.aH, adr.g, 1.0F, 1.0F);
/* 125 */         a(brx1, fx1);
/* 126 */         bmb.a(1, bfw1, bfw1 -> bfw1.d(☃));
/* 127 */         bool = true;
/* 128 */       } else if (bmb.b() == bmd.nw) {
/* 129 */         bmb.g(1);
/* 130 */         brx1.a(bfw1, bfw1.cD(), bfw1.cE(), bfw1.cH(), adq.bb, adr.g, 1.0F, 1.0F);
/* 131 */         if (bmb.a()) {
/* 132 */           bfw1.a(aot1, new bmb(bmd.rt));
/* 133 */         } else if (!bfw1.bm.e(new bmb(bmd.rt))) {
/* 134 */           bfw1.a(new bmb(bmd.rt), false);
/*     */         } 
/* 136 */         bool = true;
/*     */       } 
/*     */     }
/*     */     
/* 140 */     if (bool) {
/* 141 */       if (!buy.a(brx1, fx1)) {
/*     */         
/* 143 */         if (d(brx1, fx1)) {
/* 144 */           b(brx1, fx1);
/*     */         }
/* 146 */         a(brx1, ☃, fx1, bfw1, ccg.b.c);
/*     */       } else {
/* 148 */         a(brx1, ☃, fx1);
/*     */       } 
/* 150 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/* 153 */     return super.a(☃, brx1, fx1, bfw1, aot1, dcj1);
/*     */   }
/*     */   
/*     */   private boolean d(brx ☃, fx fx1) {
/* 157 */     ccj ccj = ☃.c(fx1);
/* 158 */     if (ccj instanceof ccg) {
/* 159 */       ccg ccg = (ccg)ccj;
/* 160 */       return !ccg.f();
/*     */     } 
/*     */     
/* 163 */     return false;
/*     */   }
/*     */   
/*     */   public void a(brx ☃, ceh ceh1, fx fx1, @Nullable bfw bfw1, ccg.b b1) {
/* 167 */     a(☃, ceh1, fx1);
/*     */     
/* 169 */     ccj ccj = ☃.c(fx1);
/* 170 */     if (ccj instanceof ccg) {
/* 171 */       ccg ccg = (ccg)ccj;
/* 172 */       ccg.a(bfw1, ceh1, b1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(brx ☃, ceh ceh1, fx fx1) {
/* 177 */     ☃.a(fx1, ceh1.a(b, Integer.valueOf(0)), 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 182 */     if (((Integer)☃.c(b)).intValue() >= 5) {
/* 183 */       for (int i = 0; i < random.nextInt(1) + 1; i++) {
/* 184 */         a(brx1, fx1, ☃);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ceh ceh1) {
/* 190 */     if (!ceh1.m().c() || ☃.t.nextFloat() < 0.3F) {
/*     */       return;
/*     */     }
/*     */     
/* 194 */     ddh ddh = ceh1.k(☃, fx1);
/* 195 */     double d = ddh.c(gc.a.b);
/* 196 */     if (d >= 1.0D && !ceh1.a(aed.W)) {
/* 197 */       double d1 = ddh.b(gc.a.b);
/* 198 */       if (d1 > 0.0D) {
/* 199 */         a(☃, fx1, ddh, fx1.v() + d1 - 0.05D);
/*     */       } else {
/* 201 */         fx fx2 = fx1.c();
/* 202 */         ceh ceh2 = ☃.d_(fx2);
/* 203 */         ddh ddh1 = ceh2.k(☃, fx2);
/* 204 */         double d2 = ddh1.c(gc.a.b);
/* 205 */         if ((d2 < 1.0D || !ceh2.r(☃, fx2)) && ceh2.m().c()) {
/* 206 */           a(☃, fx1, ddh, fx1.v() - 0.05D);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ddh ddh1, double d) {
/* 213 */     a(☃, fx1.u() + ddh1.b(gc.a.a), fx1
/* 214 */         .u() + ddh1.c(gc.a.a), fx1
/* 215 */         .w() + ddh1.b(gc.a.c), fx1
/* 216 */         .w() + ddh1.c(gc.a.c), d);
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(brx ☃, double d1, double d2, double d3, double d4, double d5) {
/* 221 */     ☃.a(hh.ai, afm.d(☃.t.nextDouble(), d1, d2), d5, afm.d(☃.t.nextDouble(), d3, d4), 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 226 */     return n().a(a, ☃.f().f());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 231 */     ☃.a((cfj<?>[])new cfj[] { b, a });
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/* 236 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj a(brc ☃) {
/* 242 */     return new ccg();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, bfw bfw1) {
/* 247 */     if (!☃.v && bfw1.b_() && ☃.V().b(brt.f)) {
/* 248 */       ccj ccj = ☃.c(fx1);
/* 249 */       if (ccj instanceof ccg) {
/* 250 */         ccg ccg = (ccg)ccj;
/* 251 */         bmb bmb = new bmb(this);
/* 252 */         int i = ((Integer)ceh1.c(b)).intValue();
/* 253 */         boolean bool = !ccg.f();
/*     */ 
/*     */         
/* 256 */         if (!bool && i == 0) {
/*     */           return;
/*     */         }
/*     */         
/* 260 */         if (bool) {
/* 261 */           md md1 = new md();
/* 262 */           md1.a("Bees", ccg.m());
/* 263 */           bmb.a("BlockEntityTag", md1);
/*     */         } 
/*     */ 
/*     */         
/* 267 */         md md = new md();
/* 268 */         md.b("honey_level", i);
/* 269 */         bmb.a("BlockStateTag", md);
/*     */         
/* 271 */         bcv bcv = new bcv(☃, fx1.u(), fx1.v(), fx1.w(), bmb);
/* 272 */         bcv.m();
/* 273 */         ☃.c(bcv);
/*     */       } 
/*     */     } 
/*     */     
/* 277 */     super.a(☃, fx1, ceh1, bfw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<bmb> a(ceh ☃, cyv.a a1) {
/* 282 */     aqa aqa = a1.<aqa>b(dbc.a);
/*     */ 
/*     */     
/* 285 */     if (aqa instanceof bcw || aqa instanceof bdc || aqa instanceof bgz || aqa instanceof bcl || aqa instanceof bhv) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 290 */       ccj ccj = a1.<ccj>b(dbc.h);
/* 291 */       if (ccj instanceof ccg) {
/* 292 */         ccg ccg = (ccg)ccj;
/* 293 */         ccg.a((bfw)null, ☃, ccg.b.c);
/*     */       } 
/*     */     } 
/* 296 */     return super.a(☃, a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 301 */     if (bry1.d_(fx2).b() instanceof bws) {
/*     */       
/* 303 */       ccj ccj = bry1.c(fx1);
/* 304 */       if (ccj instanceof ccg) {
/* 305 */         ccg ccg = (ccg)ccj;
/* 306 */         ccg.a((bfw)null, ☃, ccg.b.c);
/*     */       } 
/*     */     } 
/* 309 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */   
/*     */   public static gc a(Random ☃) {
/* 313 */     return x.<gc>a(c, ☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\buk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */