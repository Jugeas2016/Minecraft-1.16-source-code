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
/*     */ public class bum
/*     */   extends bud
/*     */ {
/*  37 */   public static final cfb a = bxm.aq;
/*  38 */   public static final cfe<cew> b = cex.R;
/*  39 */   public static final cey c = cex.w;
/*     */   
/*  41 */   private static final ddh d = buo.a(0.0D, 0.0D, 4.0D, 16.0D, 16.0D, 12.0D);
/*  42 */   private static final ddh e = buo.a(4.0D, 0.0D, 0.0D, 12.0D, 16.0D, 16.0D);
/*     */   
/*  44 */   private static final ddh f = buo.a(5.0D, 6.0D, 5.0D, 11.0D, 13.0D, 11.0D);
/*  45 */   private static final ddh g = buo.a(4.0D, 4.0D, 4.0D, 12.0D, 6.0D, 12.0D);
/*  46 */   private static final ddh h = dde.a(g, f);
/*     */   
/*  48 */   private static final ddh i = dde.a(h, buo.a(7.0D, 13.0D, 0.0D, 9.0D, 15.0D, 16.0D));
/*  49 */   private static final ddh j = dde.a(h, buo.a(0.0D, 13.0D, 7.0D, 16.0D, 15.0D, 9.0D));
/*  50 */   private static final ddh k = dde.a(h, buo.a(0.0D, 13.0D, 7.0D, 13.0D, 15.0D, 9.0D));
/*  51 */   private static final ddh o = dde.a(h, buo.a(3.0D, 13.0D, 7.0D, 16.0D, 15.0D, 9.0D));
/*  52 */   private static final ddh p = dde.a(h, buo.a(7.0D, 13.0D, 0.0D, 9.0D, 15.0D, 13.0D));
/*  53 */   private static final ddh q = dde.a(h, buo.a(7.0D, 13.0D, 3.0D, 9.0D, 15.0D, 16.0D));
/*  54 */   private static final ddh r = dde.a(h, buo.a(7.0D, 13.0D, 7.0D, 9.0D, 16.0D, 9.0D));
/*     */ 
/*     */ 
/*     */   
/*     */   public bum(ceg.c ☃) {
/*  59 */     super(☃);
/*  60 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, cew.a).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  65 */     boolean bool1 = brx1.r(fx1);
/*     */     
/*  67 */     if (bool1 != ((Boolean)☃.c(c)).booleanValue()) {
/*  68 */       if (bool1) {
/*  69 */         a(brx1, fx1, (gc)null);
/*     */       }
/*  71 */       brx1.a(fx1, ☃.a(c, Boolean.valueOf(bool1)), 3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, ceh ceh1, dcj dcj1, bgm bgm1) {
/*  77 */     aqa aqa = bgm1.v();
/*  78 */     bfw bfw = (aqa instanceof bfw) ? (bfw)aqa : null;
/*  79 */     a(☃, ceh1, dcj1, bfw, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  84 */     return a(brx1, ☃, dcj1, bfw1, true) ? aou.a(brx1.v) : aou.c;
/*     */   }
/*     */   
/*     */   public boolean a(brx ☃, ceh ceh1, dcj dcj1, @Nullable bfw bfw1, boolean bool) {
/*  88 */     gc gc = dcj1.b();
/*  89 */     fx fx = dcj1.a();
/*  90 */     boolean bool1 = (!bool || a(ceh1, gc, (dcj1.e()).c - fx.v()));
/*  91 */     if (bool1) {
/*  92 */       boolean bool2 = a(☃, fx, gc);
/*  93 */       if (bool2 && bfw1 != null) {
/*  94 */         bfw1.a(aea.ay);
/*     */       }
/*  96 */       return true;
/*     */     } 
/*  98 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(ceh ☃, gc gc1, double d) {
/* 102 */     if (gc1.n() == gc.a.b || d > 0.8123999834060669D) {
/* 103 */       return false;
/*     */     }
/*     */     
/* 106 */     gc gc2 = (gc)☃.c(a);
/* 107 */     cew cew = (cew)☃.c(b);
/*     */     
/* 109 */     switch (null.a[cew.ordinal()]) {
/*     */       case 1:
/* 111 */         return (gc2.n() == gc1.n());
/*     */       case 2:
/*     */       case 3:
/* 114 */         return (gc2.n() != gc1.n());
/*     */       case 4:
/* 116 */         return true;
/*     */     } 
/* 118 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brx ☃, fx fx1, @Nullable gc gc1) {
/* 123 */     ccj ccj = ☃.c(fx1);
/* 124 */     if (!☃.v && ccj instanceof cch) {
/* 125 */       if (gc1 == null) {
/* 126 */         gc1 = (gc)☃.d_(fx1).c(a);
/*     */       }
/* 128 */       ((cch)ccj).a(gc1);
/* 129 */       ☃.a((bfw)null, fx1, adq.aJ, adr.e, 2.0F, 1.0F);
/* 130 */       return true;
/*     */     } 
/* 132 */     return false;
/*     */   }
/*     */   
/*     */   private ddh h(ceh ☃) {
/* 136 */     gc gc = (gc)☃.c(a);
/* 137 */     cew cew = (cew)☃.c(b);
/*     */     
/* 139 */     if (cew == cew.a) {
/* 140 */       if (gc == gc.c || gc == gc.d) {
/* 141 */         return d;
/*     */       }
/* 143 */       return e;
/* 144 */     }  if (cew == cew.b)
/* 145 */       return r; 
/* 146 */     if (cew == cew.d) {
/* 147 */       if (gc == gc.c || gc == gc.d) {
/* 148 */         return i;
/*     */       }
/* 150 */       return j;
/*     */     } 
/* 152 */     if (gc == gc.c)
/* 153 */       return p; 
/* 154 */     if (gc == gc.d)
/* 155 */       return q; 
/* 156 */     if (gc == gc.f) {
/* 157 */       return o;
/*     */     }
/* 159 */     return k;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 165 */     return h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 170 */     return h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/* 175 */     return bzh.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/* 182 */     gc gc = ☃.j();
/* 183 */     fx fx = ☃.a();
/* 184 */     brx brx = ☃.p();
/* 185 */     gc.a a = gc.n();
/*     */     
/* 187 */     if (a == gc.a.b) {
/* 188 */       ceh ceh = n().a(b, (gc == gc.a) ? cew.b : cew.a).a(a, ☃.f());
/*     */       
/* 190 */       if (ceh.a(☃.p(), fx)) {
/* 191 */         return ceh;
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 196 */       boolean bool1 = ((a == gc.a.a && brx.d_(fx.f()).d(brx, fx.f(), gc.f) && brx.d_(fx.g()).d(brx, fx.g(), gc.e)) || (a == gc.a.c && brx.d_(fx.d()).d(brx, fx.d(), gc.d) && brx.d_(fx.e()).d(brx, fx.e(), gc.c)));
/*     */       
/* 198 */       ceh ceh = n().a(a, gc.f()).a(b, bool1 ? cew.d : cew.c);
/*     */       
/* 200 */       if (ceh.a(☃.p(), ☃.a())) {
/* 201 */         return ceh;
/*     */       }
/* 203 */       boolean bool2 = brx.d_(fx.c()).d(brx, fx.c(), gc.b);
/*     */       
/* 205 */       ceh = ceh.a(b, bool2 ? cew.a : cew.b);
/*     */       
/* 207 */       if (ceh.a(☃.p(), ☃.a())) {
/* 208 */         return ceh;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 213 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 218 */     cew cew = (cew)☃.c(b);
/*     */     
/* 220 */     gc gc2 = l(☃).f();
/* 221 */     if (gc2 == gc1 && !☃.a(bry1, fx1) && cew != cew.d) {
/* 222 */       return bup.a.n();
/*     */     }
/*     */     
/* 225 */     if (gc1.n() == ((gc)☃.c(a)).n()) {
/* 226 */       if (cew == cew.d && !ceh1.d(bry1, fx2, gc1))
/* 227 */         return ☃.a(b, cew.c).a(a, gc1.f()); 
/* 228 */       if (cew == cew.c && gc2.f() == gc1 && ceh1.d(bry1, fx2, (gc)☃.c(a))) {
/* 229 */         return ☃.a(b, cew.d);
/*     */       }
/*     */     } 
/*     */     
/* 233 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 238 */     gc gc = l(☃).f();
/*     */     
/* 240 */     if (gc == gc.b) {
/* 241 */       return buo.a(brz1, fx1.b(), gc.a);
/*     */     }
/* 243 */     return bwn.b(brz1, fx1, gc);
/*     */   }
/*     */ 
/*     */   
/*     */   private static gc l(ceh ☃) {
/* 248 */     switch (null.a[((cew)☃.c(b)).ordinal()]) {
/*     */       case 4:
/* 250 */         return gc.a;
/*     */       case 1:
/* 252 */         return gc.b;
/*     */     } 
/* 254 */     return ((gc)☃.c(a)).f();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cvc f(ceh ☃) {
/* 260 */     return cvc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 265 */     ☃.a((cfj<?>[])new cfj[] { a, b, c });
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj a(brc ☃) {
/* 271 */     return new cch();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 276 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */