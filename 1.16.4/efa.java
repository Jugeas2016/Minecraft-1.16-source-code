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
/*     */ public class efa
/*     */   extends eeu<bgi>
/*     */ {
/*  22 */   private static final vk a = new vk("textures/entity/fishing_hook.png");
/*  23 */   private static final eao e = eao.c(a);
/*     */   
/*     */   public efa(eet ☃) {
/*  26 */     super(☃);
/*     */   }
/*     */   public void a(bgi ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*     */     double d5, d6, d7;
/*     */     float f6;
/*  31 */     bfw bfw = ☃.i();
/*  32 */     if (bfw == null) {
/*     */       return;
/*     */     }
/*     */     
/*  36 */     dfm1.a();
/*     */     
/*  38 */     dfm1.a();
/*  39 */     dfm1.a(0.5F, 0.5F, 0.5F);
/*     */     
/*  41 */     dfm1.a(this.b.b());
/*  42 */     dfm1.a(g.d.a(180.0F));
/*     */     
/*  44 */     dfm.a a = dfm1.c();
/*  45 */     b b1 = a.a();
/*  46 */     a a1 = a.b();
/*     */     
/*  48 */     dfq dfq1 = eag1.getBuffer(e);
/*     */     
/*  50 */     a(dfq1, b1, a1, i, 0.0F, 0, 0, 1);
/*  51 */     a(dfq1, b1, a1, i, 1.0F, 0, 1, 1);
/*  52 */     a(dfq1, b1, a1, i, 1.0F, 1, 1, 0);
/*  53 */     a(dfq1, b1, a1, i, 0.0F, 1, 0, 0);
/*     */     
/*  55 */     dfm1.b();
/*     */     
/*  57 */     int j = (bfw.dV() == aqi.b) ? 1 : -1;
/*  58 */     bmb bmb = bfw.dD();
/*  59 */     if (bmb.b() != bmd.mi) {
/*  60 */       j = -j;
/*     */     }
/*     */     
/*  63 */     float f3 = bfw.r(f2);
/*  64 */     float f4 = afm.a(afm.c(f3) * 3.1415927F);
/*     */     
/*  66 */     float f5 = afm.g(f2, bfw.aB, bfw.aA) * 0.017453292F;
/*  67 */     double d1 = afm.a(f5);
/*  68 */     double d2 = afm.b(f5);
/*  69 */     double d3 = j * 0.35D;
/*  70 */     double d4 = 0.8D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     if ((this.b.d != null && !this.b.d.g().a()) || bfw != (djz.C()).s) {
/*     */       
/*  79 */       d5 = afm.d(f2, bfw.m, bfw.cD()) - d2 * d3 - d1 * 0.8D;
/*  80 */       d6 = bfw.n + bfw.ce() + (bfw.cE() - bfw.n) * f2 - 0.45D;
/*  81 */       d7 = afm.d(f2, bfw.o, bfw.cH()) - d1 * d3 + d2 * 0.8D;
/*     */ 
/*     */       
/*  84 */       f6 = bfw.bz() ? -0.1875F : 0.0F;
/*     */     } else {
/*     */       
/*  87 */       double d = this.b.d.aO;
/*  88 */       d /= 100.0D;
/*     */       
/*  90 */       dcn dcn = new dcn(j * -0.36D * d, -0.045D * d, 0.4D);
/*  91 */       dcn = dcn.a(-afm.g(f2, bfw.s, bfw.q) * 0.017453292F);
/*  92 */       dcn = dcn.b(-afm.g(f2, bfw.r, bfw.p) * 0.017453292F);
/*  93 */       dcn = dcn.b(f4 * 0.5F);
/*  94 */       dcn = dcn.a(-f4 * 0.7F);
/*     */       
/*  96 */       d5 = afm.d(f2, bfw.m, bfw.cD()) + dcn.b;
/*  97 */       d6 = afm.d(f2, bfw.n, bfw.cE()) + dcn.c;
/*  98 */       d7 = afm.d(f2, bfw.o, bfw.cH()) + dcn.d;
/*     */       
/* 100 */       f6 = bfw.ce();
/*     */     } 
/*     */     
/* 103 */     double d8 = afm.d(f2, ☃.m, ☃.cD());
/* 104 */     double d9 = afm.d(f2, ☃.n, ☃.cE()) + 0.25D;
/* 105 */     double d10 = afm.d(f2, ☃.o, ☃.cH());
/*     */     
/* 107 */     float f7 = (float)(d5 - d8);
/* 108 */     float f8 = (float)(d6 - d9) + f6;
/* 109 */     float f9 = (float)(d7 - d10);
/*     */     
/* 111 */     dfq dfq2 = eag1.getBuffer(eao.t());
/*     */     
/* 113 */     b b2 = dfm1.c().a();
/*     */     
/* 115 */     int k = 16;
/* 116 */     for (int m = 0; m < 16; m++) {
/* 117 */       a(f7, f8, f9, dfq2, b2, a(m, 16));
/* 118 */       a(f7, f8, f9, dfq2, b2, a(m + 1, 16));
/*     */     } 
/* 120 */     dfm1.b();
/* 121 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */   }
/*     */   
/*     */   private static float a(int ☃, int i) {
/* 125 */     return ☃ / i;
/*     */   }
/*     */   
/*     */   private static void a(dfq ☃, b b1, a a1, int i, float f, int j, int k, int m) {
/* 129 */     ☃.a(b1, f - 0.5F, j - 0.5F, 0.0F).a(255, 255, 255, 255).a(k, m).b(ejw.a).a(i).a(a1, 0.0F, 1.0F, 0.0F).d();
/*     */   }
/*     */   
/*     */   private static void a(float ☃, float f1, float f2, dfq dfq1, b b1, float f3) {
/* 133 */     dfq1.a(b1, ☃ * f3, f1 * (f3 * f3 + f3) * 0.5F + 0.25F, f2 * f3).a(0, 0, 0, 255).d();
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(bgi ☃) {
/* 138 */     return a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */