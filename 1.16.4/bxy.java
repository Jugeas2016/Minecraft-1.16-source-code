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
/*     */ public class bxy
/*     */   extends bud
/*     */ {
/*  39 */   public static final cfb a = bxm.aq;
/*  40 */   public static final cey b = cex.w;
/*  41 */   public static final cey c = cex.o;
/*     */   
/*  43 */   public static final ddh d = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
/*  44 */   public static final ddh e = buo.a(4.0D, 2.0D, 4.0D, 12.0D, 14.0D, 12.0D);
/*     */   
/*  46 */   public static final ddh f = dde.a(d, e);
/*     */   
/*  48 */   public static final ddh g = buo.a(0.0D, 15.0D, 0.0D, 16.0D, 15.0D, 16.0D);
/*  49 */   public static final ddh h = dde.a(f, g);
/*     */   
/*  51 */   public static final ddh i = dde.a(
/*  52 */       buo.a(1.0D, 10.0D, 0.0D, 5.333333D, 14.0D, 16.0D), new ddh[] {
/*  53 */         buo.a(5.333333D, 12.0D, 0.0D, 9.666667D, 16.0D, 16.0D), 
/*  54 */         buo.a(9.666667D, 14.0D, 0.0D, 14.0D, 18.0D, 16.0D), f
/*     */       });
/*     */   
/*  57 */   public static final ddh j = dde.a(
/*  58 */       buo.a(0.0D, 10.0D, 1.0D, 16.0D, 14.0D, 5.333333D), new ddh[] {
/*  59 */         buo.a(0.0D, 12.0D, 5.333333D, 16.0D, 16.0D, 9.666667D), 
/*  60 */         buo.a(0.0D, 14.0D, 9.666667D, 16.0D, 18.0D, 14.0D), f
/*     */       });
/*     */   
/*  63 */   public static final ddh k = dde.a(
/*  64 */       buo.a(15.0D, 10.0D, 0.0D, 10.666667D, 14.0D, 16.0D), new ddh[] {
/*  65 */         buo.a(10.666667D, 12.0D, 0.0D, 6.333333D, 16.0D, 16.0D), 
/*  66 */         buo.a(6.333333D, 14.0D, 0.0D, 2.0D, 18.0D, 16.0D), f
/*     */       });
/*     */   
/*  69 */   public static final ddh o = dde.a(
/*  70 */       buo.a(0.0D, 10.0D, 15.0D, 16.0D, 14.0D, 10.666667D), new ddh[] {
/*  71 */         buo.a(0.0D, 12.0D, 10.666667D, 16.0D, 16.0D, 6.333333D), 
/*  72 */         buo.a(0.0D, 14.0D, 6.333333D, 16.0D, 18.0D, 2.0D), f
/*     */       });
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected bxy(ceg.c ☃) {
/*  79 */     super(☃);
/*  80 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  85 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh d(ceh ☃, brc brc1, fx fx1) {
/*  90 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(ceh ☃) {
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 100 */     brx brx = ☃.p();
/* 101 */     bmb bmb = ☃.m();
/* 102 */     md md = bmb.o();
/* 103 */     bfw bfw = ☃.n();
/* 104 */     boolean bool = false;
/*     */     
/* 106 */     if (!brx.v && bfw != null && md != null && bfw.eV() && md.e("BlockEntityTag")) {
/* 107 */       md md1 = md.p("BlockEntityTag");
/* 108 */       if (md1.e("Book")) {
/* 109 */         bool = true;
/*     */       }
/*     */     } 
/* 112 */     return n().a(a, ☃.f().f()).a(c, Boolean.valueOf(bool));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 117 */     return h;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 122 */     switch (null.a[((gc)☃.c(a)).ordinal()]) {
/*     */       case 1:
/* 124 */         return j;
/*     */       case 2:
/* 126 */         return o;
/*     */       case 3:
/* 128 */         return k;
/*     */       case 4:
/* 130 */         return i;
/*     */     } 
/* 132 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 138 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 143 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 148 */     ☃.a((cfj<?>[])new cfj[] { a, b, c });
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj a(brc ☃) {
/* 154 */     return new cdb();
/*     */   }
/*     */   
/*     */   public static boolean a(brx ☃, fx fx1, ceh ceh1, bmb bmb1) {
/* 158 */     if (!((Boolean)ceh1.c(c)).booleanValue()) {
/* 159 */       if (!☃.v) {
/* 160 */         b(☃, fx1, ceh1, bmb1);
/*     */       }
/* 162 */       return true;
/*     */     } 
/*     */     
/* 165 */     return false;
/*     */   }
/*     */   
/*     */   private static void b(brx ☃, fx fx1, ceh ceh1, bmb bmb1) {
/* 169 */     ccj ccj = ☃.c(fx1);
/* 170 */     if (ccj instanceof cdb) {
/* 171 */       cdb cdb = (cdb)ccj;
/* 172 */       cdb.a(bmb1.a(1));
/* 173 */       a(☃, fx1, ceh1, true);
/* 174 */       ☃.a((bfw)null, fx1, adq.aY, adr.e, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, fx fx1, ceh ceh1, boolean bool) {
/* 179 */     ☃.a(fx1, ceh1.a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(bool)), 3);
/* 180 */     b(☃, fx1, ceh1);
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, fx fx1, ceh ceh1) {
/* 184 */     b(☃, fx1, ceh1, true);
/* 185 */     ☃.J().a(fx1, ceh1.b(), 2);
/* 186 */     ☃.c(1043, fx1, 0);
/*     */   }
/*     */   
/*     */   private static void b(brx ☃, fx fx1, ceh ceh1, boolean bool) {
/* 190 */     ☃.a(fx1, ceh1.a(b, Boolean.valueOf(bool)), 3);
/* 191 */     b(☃, fx1, ceh1);
/*     */   }
/*     */   
/*     */   private static void b(brx ☃, fx fx1, ceh ceh1) {
/* 195 */     ☃.b(fx1.c(), ceh1.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 200 */     b(aag1, fx1, ☃, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 205 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/*     */     
/* 209 */     if (((Boolean)☃.c(c)).booleanValue()) {
/* 210 */       d(☃, brx1, fx1);
/*     */     }
/*     */     
/* 213 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 214 */       brx1.b(fx1.c(), this);
/*     */     }
/*     */     
/* 217 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */   
/*     */   private void d(ceh ☃, brx brx1, fx fx1) {
/* 221 */     ccj ccj = brx1.c(fx1);
/* 222 */     if (ccj instanceof cdb) {
/* 223 */       cdb cdb = (cdb)ccj;
/*     */       
/* 225 */       gc gc = (gc)☃.c(a);
/* 226 */       bmb bmb = cdb.f().i();
/* 227 */       float f1 = 0.25F * gc.i();
/* 228 */       float f2 = 0.25F * gc.k();
/* 229 */       bcv bcv = new bcv(brx1, fx1.u() + 0.5D + f1, (fx1.v() + 1), fx1.w() + 0.5D + f2, bmb);
/* 230 */       bcv.m();
/* 231 */       brx1.c(bcv);
/*     */       
/* 233 */       cdb.Y_();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/* 239 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 244 */     return ((Boolean)☃.c(b)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 249 */     return (gc1 == gc.b && ((Boolean)☃.c(b)).booleanValue()) ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 254 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 259 */     if (((Boolean)☃.c(c)).booleanValue()) {
/* 260 */       ccj ccj = brx1.c(fx1);
/* 261 */       if (ccj instanceof cdb) {
/* 262 */         return ((cdb)ccj).j();
/*     */       }
/*     */     } 
/*     */     
/* 266 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 271 */     if (((Boolean)☃.c(c)).booleanValue()) {
/* 272 */       if (!brx1.v) {
/* 273 */         a(brx1, fx1, bfw1);
/*     */       }
/* 275 */       return aou.a(brx1.v);
/*     */     } 
/*     */ 
/*     */     
/* 279 */     bmb bmb = bfw1.b(aot1);
/*     */     
/* 281 */     if (bmb.a() || bmb.b().a(aeg.Z)) {
/* 282 */       return aou.c;
/*     */     }
/*     */     
/* 285 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aox b(ceh ☃, brx brx1, fx fx1) {
/* 291 */     if (!((Boolean)☃.c(c)).booleanValue()) {
/* 292 */       return null;
/*     */     }
/*     */     
/* 295 */     return super.b(☃, brx1, fx1);
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, bfw bfw1) {
/* 299 */     ccj ccj = ☃.c(fx1);
/* 300 */     if (ccj instanceof cdb) {
/* 301 */       bfw1.a((cdb)ccj);
/* 302 */       bfw1.a(aea.at);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 308 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */