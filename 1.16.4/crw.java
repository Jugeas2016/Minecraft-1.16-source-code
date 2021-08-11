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
/*     */ public class crw
/*     */   extends crq
/*     */ {
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   
/*     */   public crw(Random ☃, int i, int j) {
/*  29 */     super(clb.K, ☃, i, 64, j, 7, 7, 9);
/*     */   }
/*     */   
/*     */   public crw(csw ☃, md md1) {
/*  33 */     super(clb.K, md1);
/*  34 */     this.e = md1.q("Witch");
/*  35 */     this.f = md1.q("Cat");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  40 */     super.a(☃);
/*  41 */     ☃.a("Witch", this.e);
/*  42 */     ☃.a("Cat", this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  47 */     if (!a(☃, cra1, 0)) {
/*  48 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  52 */     a(☃, cra1, 1, 1, 1, 5, 1, 7, bup.o.n(), bup.o.n(), false);
/*  53 */     a(☃, cra1, 1, 4, 2, 5, 4, 7, bup.o.n(), bup.o.n(), false);
/*  54 */     a(☃, cra1, 2, 1, 0, 4, 1, 0, bup.o.n(), bup.o.n(), false);
/*     */ 
/*     */     
/*  57 */     a(☃, cra1, 2, 2, 2, 3, 3, 2, bup.o.n(), bup.o.n(), false);
/*  58 */     a(☃, cra1, 1, 2, 3, 1, 3, 6, bup.o.n(), bup.o.n(), false);
/*  59 */     a(☃, cra1, 5, 2, 3, 5, 3, 6, bup.o.n(), bup.o.n(), false);
/*  60 */     a(☃, cra1, 2, 2, 7, 4, 3, 7, bup.o.n(), bup.o.n(), false);
/*     */ 
/*     */     
/*  63 */     a(☃, cra1, 1, 0, 2, 1, 3, 2, bup.J.n(), bup.J.n(), false);
/*  64 */     a(☃, cra1, 5, 0, 2, 5, 3, 2, bup.J.n(), bup.J.n(), false);
/*  65 */     a(☃, cra1, 1, 0, 7, 1, 3, 7, bup.J.n(), bup.J.n(), false);
/*  66 */     a(☃, cra1, 5, 0, 7, 5, 3, 7, bup.J.n(), bup.J.n(), false);
/*     */ 
/*     */     
/*  69 */     a(☃, bup.cJ.n(), 2, 3, 2, cra1);
/*  70 */     a(☃, bup.cJ.n(), 3, 3, 7, cra1);
/*  71 */     a(☃, bup.a.n(), 1, 3, 4, cra1);
/*  72 */     a(☃, bup.a.n(), 5, 3, 4, cra1);
/*  73 */     a(☃, bup.a.n(), 5, 3, 5, cra1);
/*  74 */     a(☃, bup.eQ.n(), 1, 3, 5, cra1);
/*     */ 
/*     */     
/*  77 */     a(☃, bup.bV.n(), 3, 2, 6, cra1);
/*  78 */     a(☃, bup.eb.n(), 4, 2, 6, cra1);
/*     */ 
/*     */     
/*  81 */     a(☃, bup.cJ.n(), 1, 2, 1, cra1);
/*  82 */     a(☃, bup.cJ.n(), 5, 2, 1, cra1);
/*     */ 
/*     */     
/*  85 */     ceh ceh1 = bup.eo.n().a(cak.a, gc.c);
/*  86 */     ceh ceh2 = bup.eo.n().a(cak.a, gc.f);
/*  87 */     ceh ceh3 = bup.eo.n().a(cak.a, gc.e);
/*  88 */     ceh ceh4 = bup.eo.n().a(cak.a, gc.d);
/*     */     
/*  90 */     a(☃, cra1, 0, 4, 1, 6, 4, 1, ceh1, ceh1, false);
/*  91 */     a(☃, cra1, 0, 4, 2, 0, 4, 7, ceh2, ceh2, false);
/*  92 */     a(☃, cra1, 6, 4, 2, 6, 4, 7, ceh3, ceh3, false);
/*  93 */     a(☃, cra1, 0, 4, 8, 6, 4, 8, ceh4, ceh4, false);
/*  94 */     a(☃, ceh1.a(cak.c, cfn.e), 0, 4, 1, cra1);
/*  95 */     a(☃, ceh1.a(cak.c, cfn.d), 6, 4, 1, cra1);
/*  96 */     a(☃, ceh4.a(cak.c, cfn.d), 0, 4, 8, cra1);
/*  97 */     a(☃, ceh4.a(cak.c, cfn.e), 6, 4, 8, cra1);
/*     */     
/*     */     int i;
/* 100 */     for (i = 2; i <= 7; i += 5) {
/* 101 */       for (int m = 1; m <= 5; m += 4) {
/* 102 */         b(☃, bup.J.n(), m, -1, i, cra1);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 107 */     i = a(2, 5);
/* 108 */     int j = d(2);
/* 109 */     int k = b(2, 5);
/*     */     
/* 111 */     if (!this.e && cra1.b(new fx(i, j, k))) {
/* 112 */       this.e = true;
/*     */       
/* 114 */       beg beg = aqe.aS.a(☃.E());
/* 115 */       beg.es();
/* 116 */       beg.b(i + 0.5D, j, k + 0.5D, 0.0F, 0.0F);
/* 117 */       beg.a(☃, ☃.d(new fx(i, j, k)), aqp.d, (arc)null, (md)null);
/* 118 */       ☃.l(beg);
/*     */     } 
/*     */ 
/*     */     
/* 122 */     a(☃, cra1);
/*     */     
/* 124 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(bsk ☃, cra cra1) {
/* 129 */     int i = a(2, 5);
/* 130 */     int j = d(2);
/* 131 */     int k = b(2, 5);
/*     */     
/* 133 */     if (!this.f && cra1.b(new fx(i, j, k))) {
/* 134 */       this.f = true;
/*     */       
/* 136 */       bab bab = aqe.h.a(☃.E());
/* 137 */       bab.es();
/* 138 */       bab.b(i + 0.5D, j, k + 0.5D, 0.0F, 0.0F);
/* 139 */       bab.a(☃, ☃.d(new fx(i, j, k)), aqp.d, (arc)null, (md)null);
/* 140 */       ☃.l(bab);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */