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
/*     */ public class ecq
/*     */   extends ece<cdj>
/*     */ {
/*     */   public ecq(ecd ☃) {
/*  18 */     super(☃);
/*     */   }
/*     */   
/*     */   public void a(cdj ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/*     */     double d3, d4, d5, d7, d8, d10;
/*  23 */     if (!(djz.C()).s.eV() && !(djz.C()).s.a_()) {
/*     */       return;
/*     */     }
/*     */     
/*  27 */     fx fx1 = ☃.h();
/*  28 */     fx fx2 = ☃.j();
/*     */     
/*  30 */     if (fx2.u() < 1 || fx2.v() < 1 || fx2.w() < 1) {
/*     */       return;
/*     */     }
/*  33 */     if (☃.x() != cfo.a && ☃.x() != cfo.b) {
/*     */       return;
/*     */     }
/*     */     
/*  37 */     double d1 = fx1.u();
/*  38 */     double d2 = fx1.w();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  43 */     double d6 = fx1.v();
/*     */ 
/*     */ 
/*     */     
/*  47 */     double d9 = d6 + fx2.v();
/*     */ 
/*     */     
/*  50 */     switch (null.a[☃.k().ordinal()]) {
/*     */       case 1:
/*  52 */         d3 = fx2.u();
/*  53 */         d4 = -fx2.w();
/*     */         break;
/*     */       case 2:
/*  56 */         d3 = -fx2.u();
/*  57 */         d4 = fx2.w();
/*     */         break;
/*     */       default:
/*  60 */         d3 = fx2.u();
/*  61 */         d4 = fx2.w();
/*     */         break;
/*     */     } 
/*     */     
/*  65 */     switch (null.b[☃.l().ordinal()]) {
/*     */       case 1:
/*  67 */         d5 = (d4 < 0.0D) ? d1 : (d1 + 1.0D);
/*  68 */         d7 = (d3 < 0.0D) ? (d2 + 1.0D) : d2;
/*  69 */         d8 = d5 - d4;
/*  70 */         d10 = d7 + d3;
/*     */         break;
/*     */       case 2:
/*  73 */         d5 = (d3 < 0.0D) ? d1 : (d1 + 1.0D);
/*  74 */         d7 = (d4 < 0.0D) ? d2 : (d2 + 1.0D);
/*  75 */         d8 = d5 - d3;
/*  76 */         d10 = d7 - d4;
/*     */         break;
/*     */       case 3:
/*  79 */         d5 = (d4 < 0.0D) ? (d1 + 1.0D) : d1;
/*  80 */         d7 = (d3 < 0.0D) ? d2 : (d2 + 1.0D);
/*  81 */         d8 = d5 + d4;
/*  82 */         d10 = d7 - d3;
/*     */         break;
/*     */       default:
/*  85 */         d5 = (d3 < 0.0D) ? (d1 + 1.0D) : d1;
/*  86 */         d7 = (d4 < 0.0D) ? (d2 + 1.0D) : d2;
/*  87 */         d8 = d5 + d3;
/*  88 */         d10 = d7 + d4;
/*     */         break;
/*     */     } 
/*     */     
/*  92 */     float f1 = 1.0F;
/*  93 */     float f2 = 0.9F;
/*  94 */     float f3 = 0.5F;
/*     */     
/*  96 */     dfq dfq = eag1.getBuffer(eao.t());
/*     */     
/*  98 */     if (☃.x() == cfo.a || ☃.I()) {
/*  99 */       eae.a(dfm1, dfq, d5, d6, d7, d8, d9, d10, 0.9F, 0.9F, 0.9F, 1.0F, 0.5F, 0.5F, 0.5F);
/*     */     }
/*     */     
/* 102 */     if (☃.x() == cfo.a && ☃.H()) {
/* 103 */       a(☃, dfq, fx1, true, dfm1);
/* 104 */       a(☃, dfq, fx1, false, dfm1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(cdj ☃, dfq dfq1, fx fx1, boolean bool, dfm dfm1) {
/* 109 */     brc brc = ☃.v();
/* 110 */     fx fx2 = ☃.o();
/* 111 */     fx fx3 = fx2.a(fx1);
/*     */     
/* 113 */     for (fx fx4 : fx.a(fx3, fx3.a(☃.j()).b(-1, -1, -1))) {
/* 114 */       ceh ceh = brc.d_(fx4);
/* 115 */       boolean bool1 = ceh.g();
/* 116 */       boolean bool2 = ceh.a(bup.iN);
/* 117 */       if (bool1 || bool2) {
/* 118 */         float f = bool1 ? 0.05F : 0.0F;
/*     */         
/* 120 */         double d1 = ((fx4.u() - fx2.u()) + 0.45F - f);
/* 121 */         double d2 = ((fx4.v() - fx2.v()) + 0.45F - f);
/* 122 */         double d3 = ((fx4.w() - fx2.w()) + 0.45F - f);
/* 123 */         double d4 = ((fx4.u() - fx2.u()) + 0.55F + f);
/* 124 */         double d5 = ((fx4.v() - fx2.v()) + 0.55F + f);
/* 125 */         double d6 = ((fx4.w() - fx2.w()) + 0.55F + f);
/*     */         
/* 127 */         if (bool) {
/* 128 */           eae.a(dfm1, dfq1, d1, d2, d3, d4, d5, d6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F); continue;
/* 129 */         }  if (bool1) {
/* 130 */           eae.a(dfm1, dfq1, d1, d2, d3, d4, d5, d6, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F); continue;
/*     */         } 
/* 132 */         eae.a(dfm1, dfq1, d1, d2, d3, d4, d5, d6, 1.0F, 0.25F, 0.25F, 1.0F, 1.0F, 0.25F, 0.25F);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(cdj ☃) {
/* 140 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */