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
/*     */ public class efz
/*     */   extends eeu<bcs>
/*     */ {
/*     */   public efz(eet ☃) {
/*  25 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bcs ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  30 */     dfm1.a();
/*  31 */     dfm1.a(g.d.a(180.0F - f1));
/*     */     
/*  33 */     bcr bcr = ☃.e;
/*     */     
/*  35 */     float f = 0.0625F;
/*  36 */     dfm1.a(0.0625F, 0.0625F, 0.0625F);
/*     */     
/*  38 */     dfq dfq = eag1.getBuffer(eao.b(a(☃)));
/*     */     
/*  40 */     ekr ekr = djz.C().as();
/*  41 */     a(dfm1, dfq, ☃, bcr.a(), bcr.b(), ekr.a(bcr), ekr.b());
/*  42 */     dfm1.b();
/*     */     
/*  44 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(bcs ☃) {
/*  49 */     return djz.C().as().b().m().g();
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, dfq dfq1, bcs bcs1, int i, int j, ekc ekc1, ekc ekc2) {
/*  53 */     dfm.a a = ☃.c();
/*  54 */     b b = a.a();
/*  55 */     a a1 = a.b();
/*     */     
/*  57 */     float f1 = -i / 2.0F;
/*  58 */     float f2 = -j / 2.0F;
/*     */     
/*  60 */     float f3 = 0.5F;
/*     */ 
/*     */     
/*  63 */     float f4 = ekc2.h();
/*  64 */     float f5 = ekc2.i();
/*  65 */     float f6 = ekc2.j();
/*  66 */     float f7 = ekc2.k();
/*     */ 
/*     */     
/*  69 */     float f8 = ekc2.h();
/*  70 */     float f9 = ekc2.i();
/*  71 */     float f10 = ekc2.j();
/*  72 */     float f11 = ekc2.b(1.0D);
/*     */ 
/*     */     
/*  75 */     float f12 = ekc2.h();
/*  76 */     float f13 = ekc2.a(1.0D);
/*  77 */     float f14 = ekc2.j();
/*  78 */     float f15 = ekc2.k();
/*     */     
/*  80 */     int k = i / 16;
/*  81 */     int m = j / 16;
/*  82 */     double d1 = 16.0D / k;
/*  83 */     double d2 = 16.0D / m;
/*     */     
/*  85 */     for (int n = 0; n < k; n++) {
/*  86 */       for (int i1 = 0; i1 < m; i1++) {
/*  87 */         float f16 = f1 + ((n + 1) * 16);
/*  88 */         float f17 = f1 + (n * 16);
/*  89 */         float f18 = f2 + ((i1 + 1) * 16);
/*  90 */         float f19 = f2 + (i1 * 16);
/*     */         
/*  92 */         int i2 = afm.c(bcs1.cD());
/*  93 */         int i3 = afm.c(bcs1.cE() + ((f18 + f19) / 2.0F / 16.0F));
/*  94 */         int i4 = afm.c(bcs1.cH());
/*     */         
/*  96 */         gc gc = bcs1.bZ();
/*  97 */         if (gc == gc.c) {
/*  98 */           i2 = afm.c(bcs1.cD() + ((f16 + f17) / 2.0F / 16.0F));
/*     */         }
/* 100 */         if (gc == gc.e) {
/* 101 */           i4 = afm.c(bcs1.cH() - ((f16 + f17) / 2.0F / 16.0F));
/*     */         }
/* 103 */         if (gc == gc.d) {
/* 104 */           i2 = afm.c(bcs1.cD() - ((f16 + f17) / 2.0F / 16.0F));
/*     */         }
/* 106 */         if (gc == gc.f) {
/* 107 */           i4 = afm.c(bcs1.cH() + ((f16 + f17) / 2.0F / 16.0F));
/*     */         }
/*     */         
/* 110 */         int i5 = eae.a(bcs1.l, new fx(i2, i3, i4));
/*     */ 
/*     */         
/* 113 */         float f20 = ekc1.a(d1 * (k - n));
/* 114 */         float f21 = ekc1.a(d1 * (k - n + 1));
/* 115 */         float f22 = ekc1.b(d2 * (m - i1));
/* 116 */         float f23 = ekc1.b(d2 * (m - i1 + 1));
/*     */         
/* 118 */         a(b, a1, dfq1, f16, f19, f21, f22, -0.5F, 0, 0, -1, i5);
/* 119 */         a(b, a1, dfq1, f17, f19, f20, f22, -0.5F, 0, 0, -1, i5);
/* 120 */         a(b, a1, dfq1, f17, f18, f20, f23, -0.5F, 0, 0, -1, i5);
/* 121 */         a(b, a1, dfq1, f16, f18, f21, f23, -0.5F, 0, 0, -1, i5);
/*     */         
/* 123 */         a(b, a1, dfq1, f16, f18, f4, f6, 0.5F, 0, 0, 1, i5);
/* 124 */         a(b, a1, dfq1, f17, f18, f5, f6, 0.5F, 0, 0, 1, i5);
/* 125 */         a(b, a1, dfq1, f17, f19, f5, f7, 0.5F, 0, 0, 1, i5);
/* 126 */         a(b, a1, dfq1, f16, f19, f4, f7, 0.5F, 0, 0, 1, i5);
/*     */         
/* 128 */         a(b, a1, dfq1, f16, f18, f8, f10, -0.5F, 0, 1, 0, i5);
/* 129 */         a(b, a1, dfq1, f17, f18, f9, f10, -0.5F, 0, 1, 0, i5);
/* 130 */         a(b, a1, dfq1, f17, f18, f9, f11, 0.5F, 0, 1, 0, i5);
/* 131 */         a(b, a1, dfq1, f16, f18, f8, f11, 0.5F, 0, 1, 0, i5);
/*     */         
/* 133 */         a(b, a1, dfq1, f16, f19, f8, f10, 0.5F, 0, -1, 0, i5);
/* 134 */         a(b, a1, dfq1, f17, f19, f9, f10, 0.5F, 0, -1, 0, i5);
/* 135 */         a(b, a1, dfq1, f17, f19, f9, f11, -0.5F, 0, -1, 0, i5);
/* 136 */         a(b, a1, dfq1, f16, f19, f8, f11, -0.5F, 0, -1, 0, i5);
/*     */         
/* 138 */         a(b, a1, dfq1, f16, f18, f13, f14, 0.5F, -1, 0, 0, i5);
/* 139 */         a(b, a1, dfq1, f16, f19, f13, f15, 0.5F, -1, 0, 0, i5);
/* 140 */         a(b, a1, dfq1, f16, f19, f12, f15, -0.5F, -1, 0, 0, i5);
/* 141 */         a(b, a1, dfq1, f16, f18, f12, f14, -0.5F, -1, 0, 0, i5);
/*     */         
/* 143 */         a(b, a1, dfq1, f17, f18, f13, f14, -0.5F, 1, 0, 0, i5);
/* 144 */         a(b, a1, dfq1, f17, f19, f13, f15, -0.5F, 1, 0, 0, i5);
/* 145 */         a(b, a1, dfq1, f17, f19, f12, f15, 0.5F, 1, 0, 0, i5);
/* 146 */         a(b, a1, dfq1, f17, f18, f12, f14, 0.5F, 1, 0, 0, i5);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(b ☃, a a1, dfq dfq1, float f1, float f2, float f3, float f4, float f5, int i, int j, int k, int m) {
/* 152 */     dfq1.a(☃, f1, f2, f5).a(255, 255, 255, 255).a(f3, f4).b(ejw.a).a(m).a(a1, i, j, k).d();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */