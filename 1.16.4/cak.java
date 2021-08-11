/*     */ import java.util.Random;
/*     */ import java.util.stream.IntStream;
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
/*     */ public class cak
/*     */   extends buo
/*     */   implements bzu
/*     */ {
/*  35 */   public static final cfb a = bxm.aq;
/*  36 */   public static final cfe<cff> b = cex.ab;
/*  37 */   public static final cfe<cfn> c = cex.aL;
/*  38 */   public static final cey d = cex.C;
/*     */   
/*  40 */   protected static final ddh e = bzw.d;
/*  41 */   protected static final ddh f = bzw.c;
/*     */   
/*  43 */   protected static final ddh g = buo.a(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 8.0D);
/*  44 */   protected static final ddh h = buo.a(0.0D, 0.0D, 8.0D, 8.0D, 8.0D, 16.0D);
/*  45 */   protected static final ddh i = buo.a(0.0D, 8.0D, 0.0D, 8.0D, 16.0D, 8.0D);
/*  46 */   protected static final ddh j = buo.a(0.0D, 8.0D, 8.0D, 8.0D, 16.0D, 16.0D);
/*  47 */   protected static final ddh k = buo.a(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);
/*  48 */   protected static final ddh o = buo.a(8.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);
/*  49 */   protected static final ddh p = buo.a(8.0D, 8.0D, 0.0D, 16.0D, 16.0D, 8.0D);
/*  50 */   protected static final ddh q = buo.a(8.0D, 8.0D, 8.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*  52 */   protected static final ddh[] r = a(e, g, k, h, o);
/*  53 */   protected static final ddh[] s = a(f, i, p, j, q);
/*     */   
/*     */   private static ddh[] a(ddh ☃, ddh ddh1, ddh ddh2, ddh ddh3, ddh ddh4) {
/*  56 */     return (ddh[])IntStream.range(0, 16).mapToObj(i -> a(i, ☃, ddh1, ddh2, ddh3, ddh4)).toArray(☃ -> new ddh[☃]);
/*     */   }
/*     */   
/*     */   private static ddh a(int ☃, ddh ddh1, ddh ddh2, ddh ddh3, ddh ddh4, ddh ddh5) {
/*  60 */     ddh ddh6 = ddh1;
/*  61 */     if ((☃ & 0x1) != 0) {
/*  62 */       ddh6 = dde.a(ddh6, ddh2);
/*     */     }
/*  64 */     if ((☃ & 0x2) != 0) {
/*  65 */       ddh6 = dde.a(ddh6, ddh3);
/*     */     }
/*  67 */     if ((☃ & 0x4) != 0) {
/*  68 */       ddh6 = dde.a(ddh6, ddh4);
/*     */     }
/*  70 */     if ((☃ & 0x8) != 0) {
/*  71 */       ddh6 = dde.a(ddh6, ddh5);
/*     */     }
/*  73 */     return ddh6;
/*     */   }
/*     */   
/*  76 */   private static final int[] t = new int[] { 12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8 };
/*     */ 
/*     */ 
/*     */   
/*     */   private final buo u;
/*     */ 
/*     */   
/*     */   private final ceh v;
/*     */ 
/*     */ 
/*     */   
/*     */   protected cak(ceh ☃, ceg.c c1) {
/*  88 */     super(c1);
/*  89 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, cff.b).a(c, cfn.a).a(d, Boolean.valueOf(false)));
/*  90 */     this.u = ☃.b();
/*  91 */     this.v = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(ceh ☃) {
/*  96 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 101 */     return ((☃.c(b) == cff.a) ? r : s)[t[l(☃)]];
/*     */   }
/*     */   
/*     */   private int l(ceh ☃) {
/* 105 */     return ((cfn)☃.c(c)).ordinal() * 4 + ((gc)☃.c(a)).d();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 110 */     this.u.a(☃, brx1, fx1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, bfw bfw1) {
/* 115 */     this.v.a(brx1, fx1, bfw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bry ☃, fx fx1, ceh ceh1) {
/* 120 */     this.u.a(☃, fx1, ceh1);
/*     */   }
/*     */ 
/*     */   
/*     */   public float f() {
/* 125 */     return this.u.f();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 130 */     if (☃.a(☃.b())) {
/*     */       return;
/*     */     }
/* 133 */     this.v.a(brx1, fx1, bup.a, fx1, false);
/* 134 */     this.u.b(this.v, brx1, fx1, ceh1, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 139 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 142 */     this.v.b(brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, aqa aqa1) {
/* 152 */     this.u.a(☃, fx1, aqa1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/* 157 */     return this.u.a_(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 162 */     this.u.b(☃, aag1, fx1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 167 */     this.u.a(☃, aag1, fx1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 172 */     return this.v.a(brx1, bfw1, aot1, dcj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, brp brp1) {
/* 177 */     this.u.a(☃, fx1, brp1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 182 */     gc gc = ☃.j();
/* 183 */     fx fx = ☃.a();
/* 184 */     cux cux = ☃.p().b(fx);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 189 */     ceh ceh1 = n().a(a, ☃.f()).a(b, (gc == gc.a || (gc != gc.b && (☃.k()).c - fx.v() > 0.5D)) ? cff.a : cff.b).a(d, Boolean.valueOf((cux.a() == cuy.c)));
/*     */     
/* 191 */     return ceh1.a(c, g(ceh1, ☃.p(), fx));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 196 */     if (((Boolean)☃.c(d)).booleanValue()) {
/* 197 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/* 199 */     if (gc1.n().d()) {
/* 200 */       return ☃.a(c, g(☃, bry1, fx1));
/*     */     }
/* 202 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */   
/*     */   private static cfn g(ceh ☃, brc brc1, fx fx1) {
/* 206 */     gc gc = (gc)☃.c(a);
/* 207 */     ceh ceh1 = brc1.d_(fx1.a(gc));
/* 208 */     if (h(ceh1) && ☃.c(b) == ceh1.c(b)) {
/* 209 */       gc gc1 = (gc)ceh1.c(a);
/* 210 */       if (gc1.n() != ((gc)☃.c(a)).n() && d(☃, brc1, fx1, gc1.f())) {
/* 211 */         if (gc1 == gc.h()) {
/* 212 */           return cfn.d;
/*     */         }
/* 214 */         return cfn.e;
/*     */       } 
/*     */     } 
/*     */     
/* 218 */     ceh ceh2 = brc1.d_(fx1.a(gc.f()));
/* 219 */     if (h(ceh2) && ☃.c(b) == ceh2.c(b)) {
/* 220 */       gc gc1 = (gc)ceh2.c(a);
/* 221 */       if (gc1.n() != ((gc)☃.c(a)).n() && d(☃, brc1, fx1, gc1)) {
/* 222 */         if (gc1 == gc.h()) {
/* 223 */           return cfn.b;
/*     */         }
/* 225 */         return cfn.c;
/*     */       } 
/*     */     } 
/*     */     
/* 229 */     return cfn.a;
/*     */   }
/*     */   
/*     */   private static boolean d(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 233 */     ceh ceh1 = brc1.d_(fx1.a(gc1));
/* 234 */     return (!h(ceh1) || ceh1.c(a) != ☃.c(a) || ceh1.c(b) != ☃.c(b));
/*     */   }
/*     */   
/*     */   public static boolean h(ceh ☃) {
/* 238 */     return ☃.b() instanceof cak;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 243 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 248 */     gc gc = (gc)☃.c(a);
/* 249 */     cfn cfn = (cfn)☃.c(c);
/* 250 */     switch (null.b[byg1.ordinal()]) {
/*     */       case 1:
/* 252 */         if (gc.n() == gc.a.c) {
/* 253 */           switch (null.a[cfn.ordinal()]) {
/*     */             case 1:
/* 255 */               return ☃.a(bzm.c).a(c, cfn.c);
/*     */             case 2:
/* 257 */               return ☃.a(bzm.c).a(c, cfn.b);
/*     */             case 3:
/* 259 */               return ☃.a(bzm.c).a(c, cfn.e);
/*     */             case 4:
/* 261 */               return ☃.a(bzm.c).a(c, cfn.d);
/*     */           } 
/* 263 */           return ☃.a(bzm.c);
/*     */         } 
/*     */         break;
/*     */       
/*     */       case 2:
/* 268 */         if (gc.n() == gc.a.a) {
/* 269 */           switch (null.a[cfn.ordinal()]) {
/*     */             case 1:
/* 271 */               return ☃.a(bzm.c).a(c, cfn.b);
/*     */             case 2:
/* 273 */               return ☃.a(bzm.c).a(c, cfn.c);
/*     */             case 3:
/* 275 */               return ☃.a(bzm.c).a(c, cfn.e);
/*     */             case 4:
/* 277 */               return ☃.a(bzm.c).a(c, cfn.d);
/*     */             case 5:
/* 279 */               return ☃.a(bzm.c);
/*     */           } 
/*     */         
/*     */         }
/*     */         break;
/*     */     } 
/*     */     
/* 286 */     return super.a(☃, byg1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 291 */     ☃.a((cfj<?>[])new cfj[] { a, b, c, d });
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 296 */     if (((Boolean)☃.c(d)).booleanValue()) {
/* 297 */       return cuy.c.a(false);
/*     */     }
/* 299 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 304 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */