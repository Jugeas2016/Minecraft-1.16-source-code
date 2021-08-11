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
/*     */ public class bwb
/*     */   extends buo
/*     */ {
/*  35 */   public static final cfb a = bxm.aq;
/*  36 */   public static final cey b = cex.u;
/*  37 */   public static final cfe<cfc> c = cex.aH;
/*  38 */   public static final cey d = cex.w;
/*  39 */   public static final cfe<cfd> e = cex.aa;
/*     */ 
/*     */ 
/*     */   
/*  43 */   protected static final ddh f = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
/*  44 */   protected static final ddh g = buo.a(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
/*  45 */   protected static final ddh h = buo.a(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  46 */   protected static final ddh i = buo.a(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
/*     */   
/*     */   protected bwb(ceg.c ☃) {
/*  49 */     super(☃);
/*  50 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(false)).a(c, cfc.a).a(d, Boolean.valueOf(false)).a(e, cfd.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  55 */     gc gc = (gc)☃.c(a);
/*  56 */     boolean bool1 = !((Boolean)☃.c(b)).booleanValue();
/*  57 */     boolean bool2 = (☃.c(c) == cfc.b);
/*     */     
/*  59 */     switch (null.a[gc.ordinal()])
/*     */     
/*     */     { default:
/*  62 */         return bool1 ? i : (bool2 ? g : f);
/*     */       case 2:
/*  64 */         return bool1 ? f : (bool2 ? i : h);
/*     */       case 3:
/*  66 */         return bool1 ? h : (bool2 ? f : g);
/*     */       case 4:
/*  68 */         break; }  return bool1 ? g : (bool2 ? h : i);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  74 */     cfd cfd = (cfd)☃.c(e);
/*  75 */     if (gc1.n() == gc.a.b) if (((cfd == cfd.b) ? true : false) == ((gc1 == gc.b) ? true : false)) {
/*  76 */         if (ceh1.a(this) && ceh1.c(e) != cfd)
/*     */         {
/*  78 */           return ☃.a(a, ceh1.c(a))
/*  79 */             .a(b, ceh1.c(b))
/*  80 */             .a(c, ceh1.c(c))
/*  81 */             .a(d, ceh1.c(d));
/*     */         }
/*  83 */         return bup.a.n();
/*     */       } 
/*     */ 
/*     */     
/*  87 */     if (cfd == cfd.b && gc1 == gc.a && !☃.a(bry1, fx1)) {
/*  88 */       return bup.a.n();
/*     */     }
/*     */     
/*  91 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, bfw bfw1) {
/*  96 */     if (!☃.v && bfw1.b_()) {
/*  97 */       bwd.b(☃, fx1, ceh1, bfw1);
/*     */     }
/*     */     
/* 100 */     super.a(☃, fx1, ceh1, bfw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 105 */     switch (null.b[cxe1.ordinal()]) {
/*     */       case 1:
/* 107 */         return ((Boolean)☃.c(b)).booleanValue();
/*     */       case 2:
/* 109 */         return false;
/*     */       case 3:
/* 111 */         return ((Boolean)☃.c(b)).booleanValue();
/*     */     } 
/* 113 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private int c() {
/* 118 */     return (this.as == cva.J) ? 1011 : 1012;
/*     */   }
/*     */   
/*     */   private int d() {
/* 122 */     return (this.as == cva.J) ? 1005 : 1006;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/* 128 */     fx fx = ☃.a();
/* 129 */     if (fx.v() < 255 && ☃.p().d_(fx.b()).a(☃)) {
/* 130 */       brx brx = ☃.p();
/* 131 */       boolean bool = (brx.r(fx) || brx.r(fx.b()));
/*     */       
/* 133 */       return n().a(a, ☃.f()).a(c, b(☃)).a(d, Boolean.valueOf(bool)).a(b, Boolean.valueOf(bool)).a(e, cfd.b);
/*     */     } 
/*     */     
/* 136 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/* 141 */     ☃.a(fx1.b(), ceh1.a(e, cfd.a), 3);
/*     */   }
/*     */   
/*     */   private cfc b(bny ☃) {
/* 145 */     brc brc = ☃.p();
/* 146 */     fx fx1 = ☃.a();
/* 147 */     gc gc1 = ☃.f();
/* 148 */     fx fx2 = fx1.b();
/*     */     
/* 150 */     gc gc2 = gc1.h();
/* 151 */     fx fx3 = fx1.a(gc2);
/* 152 */     ceh ceh1 = brc.d_(fx3);
/* 153 */     fx fx4 = fx2.a(gc2);
/* 154 */     ceh ceh2 = brc.d_(fx4);
/*     */     
/* 156 */     gc gc3 = gc1.g();
/* 157 */     fx fx5 = fx1.a(gc3);
/* 158 */     ceh ceh3 = brc.d_(fx5);
/* 159 */     fx fx6 = fx2.a(gc3);
/* 160 */     ceh ceh4 = brc.d_(fx6);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     int i = (ceh1.r(brc, fx3) ? -1 : 0) + (ceh2.r(brc, fx4) ? -1 : 0) + (ceh3.r(brc, fx5) ? 1 : 0) + (ceh4.r(brc, fx6) ? 1 : 0);
/*     */     
/* 167 */     boolean bool1 = (ceh1.a(this) && ceh1.c(e) == cfd.b);
/* 168 */     boolean bool2 = (ceh3.a(this) && ceh3.c(e) == cfd.b);
/*     */     
/* 170 */     if ((bool1 && !bool2) || i > 0) {
/* 171 */       return cfc.b;
/*     */     }
/* 173 */     if ((bool2 && !bool1) || i < 0) {
/* 174 */       return cfc.a;
/*     */     }
/*     */     
/* 177 */     int j = gc1.i();
/* 178 */     int k = gc1.k();
/*     */     
/* 180 */     dcn dcn = ☃.k();
/* 181 */     double d1 = dcn.b - fx1.u();
/* 182 */     double d2 = dcn.d - fx1.w();
/*     */     
/* 184 */     return ((j < 0 && d2 < 0.5D) || (j > 0 && d2 > 0.5D) || (k < 0 && d1 > 0.5D) || (k > 0 && d1 < 0.5D)) ? cfc.b : cfc.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 189 */     if (this.as == cva.J) {
/* 190 */       return aou.c;
/*     */     }
/*     */     
/* 193 */     ☃ = ☃.a(b);
/* 194 */     brx1.a(fx1, ☃, 10);
/* 195 */     brx1.a(bfw1, ((Boolean)☃.c(b)).booleanValue() ? d() : c(), fx1, 0);
/* 196 */     return aou.a(brx1.v);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h(ceh ☃) {
/* 204 */     return ((Boolean)☃.c(b)).booleanValue();
/*     */   }
/*     */   
/*     */   public void a(brx ☃, ceh ceh1, fx fx1, boolean bool) {
/* 208 */     if (!ceh1.a(this) || ((Boolean)ceh1.c(b)).booleanValue() == bool) {
/*     */       return;
/*     */     }
/*     */     
/* 212 */     ☃.a(fx1, ceh1.a(b, Boolean.valueOf(bool)), 10);
/* 213 */     a(☃, fx1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 218 */     boolean bool1 = (brx1.r(fx1) || brx1.r(fx1.a((☃.c(e) == cfd.b) ? gc.b : gc.a)));
/* 219 */     if (buo1 != this && bool1 != ((Boolean)☃.c(d)).booleanValue()) {
/* 220 */       if (bool1 != ((Boolean)☃.c(b)).booleanValue()) {
/* 221 */         a(brx1, fx1, bool1);
/*     */       }
/* 223 */       brx1.a(fx1, ☃.a(d, Boolean.valueOf(bool1)).a(b, Boolean.valueOf(bool1)), 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 230 */     fx fx2 = fx1.c();
/* 231 */     ceh ceh1 = brz1.d_(fx2);
/* 232 */     if (☃.c(e) == cfd.b) {
/* 233 */       return ceh1.d(brz1, fx2, gc.b);
/*     */     }
/* 235 */     return ceh1.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(brx ☃, fx fx1, boolean bool) {
/* 240 */     ☃.a((bfw)null, bool ? d() : c(), fx1, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public cvc f(ceh ☃) {
/* 245 */     return cvc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 250 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 255 */     if (byg1 == byg.a) {
/* 256 */       return ☃;
/*     */     }
/* 258 */     return ☃.a(byg1.a((gc)☃.c(a))).a(c);
/*     */   }
/*     */ 
/*     */   
/*     */   public long a(ceh ☃, fx fx1) {
/* 263 */     return afm.c(fx1.u(), fx1.c((☃.c(e) == cfd.b) ? 0 : 1).v(), fx1.w());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 268 */     ☃.a((cfj<?>[])new cfj[] { e, a, b, c, d });
/*     */   }
/*     */   
/*     */   public static boolean a(brx ☃, fx fx1) {
/* 272 */     return l(☃.d_(fx1));
/*     */   }
/*     */   
/*     */   public static boolean l(ceh ☃) {
/* 276 */     return (☃.b() instanceof bwb && (☃.c() == cva.y || ☃.c() == cva.z));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */