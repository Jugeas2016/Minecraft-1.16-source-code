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
/*     */ public class bus
/*     */   extends buo
/*     */   implements but
/*     */ {
/*  28 */   public static final cey a = cex.e;
/*     */ 
/*     */   
/*     */   public bus(ceg.c ☃) {
/*  32 */     super(☃);
/*  33 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/*  38 */     ceh ceh1 = brx1.d_(fx1.b());
/*  39 */     if (ceh1.g()) {
/*  40 */       aqa1.k(((Boolean)☃.c(a)).booleanValue());
/*     */       
/*  42 */       if (!brx1.v) {
/*  43 */         aag aag = (aag)brx1;
/*  44 */         for (int i = 0; i < 2; i++) {
/*  45 */           aag.a(hh.Z, fx1.u() + brx1.t.nextDouble(), (fx1.v() + 1), fx1.w() + brx1.t.nextDouble(), 1, 0.0D, 0.0D, 0.0D, 1.0D);
/*  46 */           aag.a(hh.e, fx1.u() + brx1.t.nextDouble(), (fx1.v() + 1), fx1.w() + brx1.t.nextDouble(), 1, 0.0D, 0.01D, 0.0D, 0.2D);
/*     */         } 
/*     */       } 
/*     */     } else {
/*  50 */       aqa1.l(((Boolean)☃.c(a)).booleanValue());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  56 */     a(brx1, fx1.b(), a(brx1, fx1.c()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  61 */     a(aag1, fx1.b(), a(aag1, fx1));
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/*  66 */     return cuy.c.a(false);
/*     */   }
/*     */   
/*     */   public static void a(bry ☃, fx fx1, boolean bool) {
/*  70 */     if (a(☃, fx1)) {
/*  71 */       ☃.a(fx1, bup.lc.n().a(a, Boolean.valueOf(bool)), 2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean a(bry ☃, fx fx1) {
/*  76 */     cux cux = ☃.b(fx1);
/*  77 */     return (☃.d_(fx1).a(bup.A) && cux.e() >= 8 && cux.b());
/*     */   }
/*     */   
/*     */   private static boolean a(brc ☃, fx fx1) {
/*  81 */     ceh ceh = ☃.d_(fx1);
/*     */     
/*  83 */     if (ceh.a(bup.lc)) {
/*  84 */       return ((Boolean)ceh.c(a)).booleanValue();
/*     */     }
/*     */     
/*  87 */     return !ceh.a(bup.cM);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/*  92 */     double d1 = fx1.u();
/*  93 */     double d2 = fx1.v();
/*  94 */     double d3 = fx1.w();
/*     */     
/*  96 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  97 */       brx1.b(hh.ac, d1 + 0.5D, d2 + 0.8D, d3, 0.0D, 0.0D, 0.0D);
/*  98 */       if (random.nextInt(200) == 0) {
/*  99 */         brx1.a(d1, d2, d3, adq.bh, adr.e, 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
/*     */       }
/*     */     } else {
/* 102 */       brx1.b(hh.ad, d1 + 0.5D, d2, d3 + 0.5D, 0.0D, 0.04D, 0.0D);
/* 103 */       brx1.b(hh.ad, d1 + random.nextFloat(), d2 + random.nextFloat(), d3 + random.nextFloat(), 0.0D, 0.04D, 0.0D);
/* 104 */       if (random.nextInt(200) == 0) {
/* 105 */         brx1.a(d1, d2, d3, adq.bf, adr.e, 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 112 */     if (!☃.a(bry1, fx1)) {
/* 113 */       return bup.A.n();
/*     */     }
/*     */     
/* 116 */     if (gc1 == gc.a) {
/* 117 */       bry1.a(fx1, bup.lc.n().a(a, Boolean.valueOf(a(bry1, fx2))), 2);
/* 118 */     } else if (gc1 == gc.b && !ceh1.a(bup.lc) && a(bry1, fx2)) {
/* 119 */       bry1.J().a(fx1, this, 5);
/*     */     } 
/*     */     
/* 122 */     bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/* 123 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 128 */     ceh ceh1 = brz1.d_(fx1.c());
/*     */     
/* 130 */     return (ceh1.a(bup.lc) || ceh1.a(bup.iJ) || ceh1.a(bup.cM));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 135 */     return dde.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/* 140 */     return bzh.a;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 145 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public cuw b(bry ☃, fx fx1, ceh ceh1) {
/* 150 */     ☃.a(fx1, bup.a.n(), 11);
/* 151 */     return cuy.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */