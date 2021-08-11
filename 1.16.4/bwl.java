/*     */ import java.util.Random;
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
/*     */ public class bwl
/*     */   extends btn<ccv>
/*     */   implements bzu
/*     */ {
/*  44 */   public static final cfb b = bxm.aq;
/*  45 */   public static final cey c = cex.C;
/*  46 */   protected static final ddh d = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
/*  47 */   private static final nr e = new of("container.enderchest");
/*     */   
/*     */   protected bwl(ceg.c ☃) {
/*  50 */     super(☃, () -> cck.d);
/*  51 */     j(((ceh)this.n.b()).a(b, gc.c).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public bwc.c<? extends ccn> a(ceh ☃, brx brx1, fx fx1, boolean bool) {
/*  56 */     return bwc.b::b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  61 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  66 */     return bzh.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  71 */     cux cux = ☃.p().b(☃.a());
/*  72 */     return n().a(b, ☃.f().f()).a(c, Boolean.valueOf((cux.a() == cuy.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  77 */     bji bji = bfw1.eL();
/*  78 */     ccj ccj = brx1.c(fx1);
/*  79 */     if (bji == null || !(ccj instanceof ccv)) {
/*  80 */       return aou.a(brx1.v);
/*     */     }
/*     */     
/*  83 */     fx fx2 = fx1.b();
/*  84 */     if (brx1.d_(fx2).g(brx1, fx2)) {
/*  85 */       return aou.a(brx1.v);
/*     */     }
/*     */     
/*  88 */     if (brx1.v) {
/*  89 */       return aou.a;
/*     */     }
/*     */     
/*  92 */     ccv ccv = (ccv)ccj;
/*  93 */     bji.a(ccv);
/*     */     
/*  95 */     bfw1.a(new apb((i, bfv1, bfw1) -> bij.a(i, bfv1, ☃), e));
/*  96 */     bfw1.a(aea.ai);
/*  97 */     bet.a(bfw1, true);
/*  98 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/* 103 */     return new ccv();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 108 */     for (int i = 0; i < 3; i++) {
/* 109 */       int j = random.nextInt(2) * 2 - 1;
/* 110 */       int k = random.nextInt(2) * 2 - 1;
/*     */       
/* 112 */       double d1 = fx1.u() + 0.5D + 0.25D * j;
/* 113 */       double d2 = (fx1.v() + random.nextFloat());
/* 114 */       double d3 = fx1.w() + 0.5D + 0.25D * k;
/* 115 */       double d4 = (random.nextFloat() * j);
/* 116 */       double d5 = (random.nextFloat() - 0.5D) * 0.125D;
/* 117 */       double d6 = (random.nextFloat() * k);
/*     */       
/* 119 */       brx1.a(hh.Q, d1, d2, d3, d4, d5, d6);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 125 */     return ☃.a(b, bzm1.a((gc)☃.c(b)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 130 */     return ☃.a(byg1.a((gc)☃.c(b)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 135 */     ☃.a((cfj<?>[])new cfj[] { b, c });
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 140 */     if (((Boolean)☃.c(c)).booleanValue()) {
/* 141 */       return cuy.c.a(false);
/*     */     }
/* 143 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 148 */     if (((Boolean)☃.c(c)).booleanValue()) {
/* 149 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/* 151 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 156 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */