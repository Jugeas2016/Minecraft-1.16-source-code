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
/*     */ public abstract class efw<T extends aqn, M extends duc<T>>
/*     */   extends efr<T, M>
/*     */ {
/*     */   public efw(eet ☃, M m, float f) {
/*  20 */     super(☃, m, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(T ☃) {
/*  25 */     return (super.b(☃) && (☃.bY() || (☃.S() && ☃ == this.b.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(T ☃, ecz ecz1, double d1, double d2, double d3) {
/*  30 */     if (super.a(☃, ecz1, d1, d2, d3)) {
/*  31 */       return true;
/*     */     }
/*     */     
/*  34 */     aqa aqa = ☃.eC();
/*  35 */     if (aqa != null) {
/*  36 */       return ecz1.a(aqa.cd());
/*     */     }
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  43 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */     
/*  45 */     aqa aqa = ☃.eC();
/*  46 */     if (aqa == null) {
/*     */       return;
/*     */     }
/*     */     
/*  50 */     a(☃, f2, dfm1, eag1, aqa);
/*     */   }
/*     */   
/*     */   private <E extends aqa> void a(T ☃, float f, dfm dfm1, eag eag1, E e) {
/*  54 */     dfm1.a();
/*     */     
/*  56 */     dcn dcn1 = e.o(f);
/*     */     
/*  58 */     double d1 = (afm.g(f, ((aqn)☃).aA, ((aqn)☃).aB) * 0.017453292F) + 1.5707963267948966D;
/*  59 */     dcn dcn2 = ☃.cf();
/*  60 */     double d2 = Math.cos(d1) * dcn2.d + Math.sin(d1) * dcn2.b;
/*  61 */     double d3 = Math.sin(d1) * dcn2.d - Math.cos(d1) * dcn2.b;
/*     */     
/*  63 */     double d4 = afm.d(f, ((aqn)☃).m, ☃.cD()) + d2;
/*  64 */     double d5 = afm.d(f, ((aqn)☃).n, ☃.cE()) + dcn2.c;
/*  65 */     double d6 = afm.d(f, ((aqn)☃).o, ☃.cH()) + d3;
/*     */     
/*  67 */     dfm1.a(d2, dcn2.c, d3);
/*     */     
/*  69 */     float f1 = (float)(dcn1.b - d4);
/*  70 */     float f2 = (float)(dcn1.c - d5);
/*  71 */     float f3 = (float)(dcn1.d - d6);
/*     */     
/*  73 */     float f4 = 0.025F;
/*     */     
/*  75 */     dfq dfq = eag1.getBuffer(eao.i());
/*  76 */     b b = dfm1.c().a();
/*     */     
/*  78 */     float f5 = afm.i(f1 * f1 + f3 * f3) * 0.025F / 2.0F;
/*     */ 
/*     */     
/*  81 */     float f6 = f3 * f5;
/*  82 */     float f7 = f1 * f5;
/*     */     
/*  84 */     fx fx1 = new fx(☃.j(f));
/*  85 */     fx fx2 = new fx(e.j(f));
/*     */     
/*  87 */     int i = a(☃, fx1);
/*  88 */     int j = this.b.<E>a(e).a(e, fx2);
/*     */     
/*  90 */     int k = ((aqn)☃).l.a(bsf.a, fx1);
/*  91 */     int m = ((aqn)☃).l.a(bsf.a, fx2);
/*     */     
/*  93 */     a(dfq, b, f1, f2, f3, i, j, k, m, 0.025F, 0.025F, f6, f7);
/*  94 */     a(dfq, b, f1, f2, f3, i, j, k, m, 0.025F, 0.0F, f6, f7);
/*     */     
/*  96 */     dfm1.b();
/*     */   }
/*     */   
/*     */   public static void a(dfq ☃, b b1, float f1, float f2, float f3, int i, int j, int k, int m, float f4, float f5, float f6, float f7) {
/* 100 */     int n = 24;
/*     */     
/* 102 */     for (int i1 = 0; i1 < 24; i1++) {
/* 103 */       float f = i1 / 23.0F;
/* 104 */       int i2 = (int)afm.g(f, i, j);
/* 105 */       int i3 = (int)afm.g(f, k, m);
/* 106 */       int i4 = eaf.a(i2, i3);
/*     */       
/* 108 */       a(☃, b1, i4, f1, f2, f3, f4, f5, 24, i1, false, f6, f7);
/* 109 */       a(☃, b1, i4, f1, f2, f3, f4, f5, 24, i1 + 1, true, f6, f7);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(dfq ☃, b b1, int i, float f1, float f2, float f3, float f4, float f5, int j, int k, boolean bool, float f6, float f7) {
/* 114 */     float f8 = 0.5F;
/* 115 */     float f9 = 0.4F;
/* 116 */     float f10 = 0.3F;
/* 117 */     if (k % 2 == 0) {
/* 118 */       f8 *= 0.7F;
/* 119 */       f9 *= 0.7F;
/* 120 */       f10 *= 0.7F;
/*     */     } 
/*     */     
/* 123 */     float f11 = k / j;
/* 124 */     float f12 = f1 * f11;
/* 125 */     float f13 = (f2 > 0.0F) ? (f2 * f11 * f11) : (f2 - f2 * (1.0F - f11) * (1.0F - f11));
/* 126 */     float f14 = f3 * f11;
/*     */     
/* 128 */     if (!bool) {
/* 129 */       ☃.a(b1, f12 + f6, f13 + f4 - f5, f14 - f7).a(f8, f9, f10, 1.0F).a(i).d();
/*     */     }
/* 131 */     ☃.a(b1, f12 - f6, f13 + f5, f14 + f7).a(f8, f9, f10, 1.0F).a(i).d();
/* 132 */     if (bool)
/* 133 */       ☃.a(b1, f12 + f6, f13 + f4 - f5, f14 - f7).a(f8, f9, f10, 1.0F).a(i).d(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */