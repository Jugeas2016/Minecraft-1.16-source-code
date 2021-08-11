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
/*     */ public class efe
/*     */   extends efw<bdm, duh>
/*     */ {
/*  22 */   private static final vk a = new vk("textures/entity/guardian.png");
/*  23 */   private static final vk g = new vk("textures/entity/guardian_beam.png");
/*     */   
/*  25 */   private static final eao h = eao.d(g);
/*     */   
/*     */   public efe(eet ☃) {
/*  28 */     this(☃, 0.5F);
/*     */   }
/*     */   
/*     */   protected efe(eet ☃, float f) {
/*  32 */     super(☃, new duh(), f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bdm ☃, ecz ecz1, double d1, double d2, double d3) {
/*  37 */     if (super.a(☃, ecz1, d1, d2, d3)) {
/*  38 */       return true;
/*     */     }
/*     */     
/*  41 */     if (☃.eO()) {
/*  42 */       aqm aqm = ☃.eP();
/*  43 */       if (aqm != null) {
/*     */         
/*  45 */         dcn dcn1 = a(aqm, aqm.cz() * 0.5D, 1.0F);
/*  46 */         dcn dcn2 = a(☃, ☃.ce(), 1.0F);
/*     */         
/*  48 */         return ecz1.a(new dci(dcn2.b, dcn2.c, dcn2.d, dcn1.b, dcn1.c, dcn1.d));
/*     */       } 
/*     */     } 
/*  51 */     return false;
/*     */   }
/*     */   
/*     */   private dcn a(aqm ☃, double d, float f) {
/*  55 */     double d1 = afm.d(f, ☃.D, ☃.cD());
/*  56 */     double d2 = afm.d(f, ☃.E, ☃.cE()) + d;
/*  57 */     double d3 = afm.d(f, ☃.F, ☃.cH());
/*  58 */     return new dcn(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bdm ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  63 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */     
/*  65 */     aqm aqm = ☃.eP();
/*  66 */     if (aqm != null) {
/*  67 */       float f3 = ☃.A(f2);
/*     */       
/*  69 */       float f4 = (float)☃.l.T() + f2;
/*  70 */       float f5 = f4 * 0.5F % 1.0F;
/*  71 */       float f6 = ☃.ce();
/*     */       
/*  73 */       dfm1.a();
/*  74 */       dfm1.a(0.0D, f6, 0.0D);
/*     */       
/*  76 */       dcn dcn1 = a(aqm, aqm.cz() * 0.5D, f2);
/*  77 */       dcn dcn2 = a(☃, f6, f2);
/*     */       
/*  79 */       dcn dcn3 = dcn1.d(dcn2);
/*  80 */       float f7 = (float)(dcn3.f() + 1.0D);
/*  81 */       dcn3 = dcn3.d();
/*     */ 
/*     */       
/*  84 */       float f8 = (float)Math.acos(dcn3.c);
/*  85 */       float f9 = (float)Math.atan2(dcn3.d, dcn3.b);
/*  86 */       dfm1.a(g.d.a((1.5707964F - f9) * 57.295776F));
/*  87 */       dfm1.a(g.b.a(f8 * 57.295776F));
/*  88 */       int j = 1;
/*     */       
/*  90 */       float f10 = f4 * 0.05F * -1.5F;
/*     */       
/*  92 */       float f11 = f3 * f3;
/*  93 */       int k = 64 + (int)(f11 * 191.0F);
/*  94 */       int m = 32 + (int)(f11 * 191.0F);
/*  95 */       int n = 128 - (int)(f11 * 64.0F);
/*     */       
/*  97 */       float f12 = 0.2F;
/*  98 */       float f13 = 0.282F;
/*     */       
/* 100 */       float f14 = afm.b(f10 + 2.3561945F) * 0.282F;
/* 101 */       float f15 = afm.a(f10 + 2.3561945F) * 0.282F;
/* 102 */       float f16 = afm.b(f10 + 0.7853982F) * 0.282F;
/* 103 */       float f17 = afm.a(f10 + 0.7853982F) * 0.282F;
/* 104 */       float f18 = afm.b(f10 + 3.926991F) * 0.282F;
/* 105 */       float f19 = afm.a(f10 + 3.926991F) * 0.282F;
/* 106 */       float f20 = afm.b(f10 + 5.4977875F) * 0.282F;
/* 107 */       float f21 = afm.a(f10 + 5.4977875F) * 0.282F;
/*     */       
/* 109 */       float f22 = afm.b(f10 + 3.1415927F) * 0.2F;
/* 110 */       float f23 = afm.a(f10 + 3.1415927F) * 0.2F;
/* 111 */       float f24 = afm.b(f10 + 0.0F) * 0.2F;
/* 112 */       float f25 = afm.a(f10 + 0.0F) * 0.2F;
/*     */       
/* 114 */       float f26 = afm.b(f10 + 1.5707964F) * 0.2F;
/* 115 */       float f27 = afm.a(f10 + 1.5707964F) * 0.2F;
/* 116 */       float f28 = afm.b(f10 + 4.712389F) * 0.2F;
/* 117 */       float f29 = afm.a(f10 + 4.712389F) * 0.2F;
/*     */       
/* 119 */       float f30 = f7;
/*     */       
/* 121 */       float f31 = 0.0F;
/* 122 */       float f32 = 0.4999F;
/* 123 */       float f33 = -1.0F + f5;
/* 124 */       float f34 = f7 * 2.5F + f33;
/*     */       
/* 126 */       dfq dfq = eag1.getBuffer(h);
/*     */       
/* 128 */       dfm.a a = dfm1.c();
/* 129 */       b b = a.a();
/* 130 */       a a1 = a.b();
/*     */       
/* 132 */       a(dfq, b, a1, f22, f30, f23, k, m, n, 0.4999F, f34);
/* 133 */       a(dfq, b, a1, f22, 0.0F, f23, k, m, n, 0.4999F, f33);
/* 134 */       a(dfq, b, a1, f24, 0.0F, f25, k, m, n, 0.0F, f33);
/* 135 */       a(dfq, b, a1, f24, f30, f25, k, m, n, 0.0F, f34);
/*     */       
/* 137 */       a(dfq, b, a1, f26, f30, f27, k, m, n, 0.4999F, f34);
/* 138 */       a(dfq, b, a1, f26, 0.0F, f27, k, m, n, 0.4999F, f33);
/* 139 */       a(dfq, b, a1, f28, 0.0F, f29, k, m, n, 0.0F, f33);
/* 140 */       a(dfq, b, a1, f28, f30, f29, k, m, n, 0.0F, f34);
/*     */       
/* 142 */       float f35 = 0.0F;
/* 143 */       if (☃.K % 2 == 0) {
/* 144 */         f35 = 0.5F;
/*     */       }
/* 146 */       a(dfq, b, a1, f14, f30, f15, k, m, n, 0.5F, f35 + 0.5F);
/* 147 */       a(dfq, b, a1, f16, f30, f17, k, m, n, 1.0F, f35 + 0.5F);
/* 148 */       a(dfq, b, a1, f20, f30, f21, k, m, n, 1.0F, f35);
/* 149 */       a(dfq, b, a1, f18, f30, f19, k, m, n, 0.5F, f35);
/*     */       
/* 151 */       dfm1.b();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(dfq ☃, b b1, a a1, float f1, float f2, float f3, int i, int j, int k, float f4, float f5) {
/* 156 */     ☃.a(b1, f1, f2, f3).a(i, j, k, 255).a(f4, f5).b(ejw.a).a(15728880).a(a1, 0.0F, 1.0F, 0.0F).d();
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(bdm ☃) {
/* 161 */     return a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */