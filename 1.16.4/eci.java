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
/*     */ public class eci
/*     */   extends ece<ccq>
/*     */ {
/*  18 */   public static final elr a = new elr(ekb.d, new vk("entity/conduit/base"));
/*  19 */   public static final elr c = new elr(ekb.d, new vk("entity/conduit/cage"));
/*  20 */   public static final elr d = new elr(ekb.d, new vk("entity/conduit/wind"));
/*  21 */   public static final elr e = new elr(ekb.d, new vk("entity/conduit/wind_vertical"));
/*  22 */   public static final elr f = new elr(ekb.d, new vk("entity/conduit/open_eye"));
/*  23 */   public static final elr g = new elr(ekb.d, new vk("entity/conduit/closed_eye"));
/*     */   
/*     */   private final dwn h;
/*     */   private final dwn i;
/*     */   private final dwn j;
/*     */   private final dwn k;
/*     */   
/*     */   public eci(ecd ☃) {
/*  31 */     super(☃);
/*  32 */     this.h = new dwn(16, 16, 0, 0);
/*  33 */     this.h.a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, 0.01F);
/*     */     
/*  35 */     this.i = new dwn(64, 32, 0, 0);
/*  36 */     this.i.a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F);
/*     */     
/*  38 */     this.j = new dwn(32, 16, 0, 0);
/*  39 */     this.j.a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
/*     */     
/*  41 */     this.k = new dwn(32, 16, 0, 0);
/*  42 */     this.k.a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ccq ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/*  47 */     float f1 = ☃.a + f;
/*     */     
/*  49 */     if (!☃.d()) {
/*  50 */       float f6 = ☃.a(0.0F);
/*     */       
/*  52 */       dfq dfq1 = a.a(eag1, eao::b);
/*  53 */       dfm1.a();
/*  54 */       dfm1.a(0.5D, 0.5D, 0.5D);
/*  55 */       dfm1.a(g.d.a(f6));
/*  56 */       this.j.a(dfm1, dfq1, i, j);
/*  57 */       dfm1.b();
/*     */       
/*     */       return;
/*     */     } 
/*  61 */     float f2 = ☃.a(f) * 57.295776F;
/*  62 */     float f3 = afm.a(f1 * 0.1F) / 2.0F + 0.5F;
/*  63 */     f3 = f3 * f3 + f3;
/*     */     
/*  65 */     dfm1.a();
/*  66 */     dfm1.a(0.5D, (0.3F + f3 * 0.2F), 0.5D);
/*  67 */     g g = new g(0.5F, 1.0F, 0.5F);
/*  68 */     g.d();
/*  69 */     dfm1.a(new d(g, f2, true));
/*  70 */     this.k.a(dfm1, c.a(eag1, eao::d), i, j);
/*  71 */     dfm1.b();
/*     */     
/*  73 */     int k = ☃.a / 66 % 3;
/*     */     
/*  75 */     dfm1.a();
/*  76 */     dfm1.a(0.5D, 0.5D, 0.5D);
/*     */     
/*  78 */     if (k == 1) {
/*  79 */       dfm1.a(g.b.a(90.0F));
/*  80 */     } else if (k == 2) {
/*  81 */       dfm1.a(g.f.a(90.0F));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  86 */     dfq dfq = ((k == 1) ? e : d).a(eag1, eao::d);
/*  87 */     this.i.a(dfm1, dfq, i, j);
/*  88 */     dfm1.b();
/*  89 */     dfm1.a();
/*  90 */     dfm1.a(0.5D, 0.5D, 0.5D);
/*  91 */     dfm1.a(0.875F, 0.875F, 0.875F);
/*  92 */     dfm1.a(g.b.a(180.0F));
/*  93 */     dfm1.a(g.f.a(180.0F));
/*  94 */     this.i.a(dfm1, dfq, i, j);
/*  95 */     dfm1.b();
/*  96 */     djk djk = this.b.d;
/*     */     
/*  98 */     dfm1.a();
/*  99 */     dfm1.a(0.5D, (0.3F + f3 * 0.2F), 0.5D);
/* 100 */     dfm1.a(0.5F, 0.5F, 0.5F);
/* 101 */     float f4 = -djk.e();
/* 102 */     dfm1.a(g.d.a(f4));
/* 103 */     dfm1.a(g.b.a(djk.d()));
/* 104 */     dfm1.a(g.f.a(180.0F));
/* 105 */     float f5 = 1.3333334F;
/* 106 */     dfm1.a(1.3333334F, 1.3333334F, 1.3333334F);
/* 107 */     this.h.a(dfm1, (☃.f() ? f : g).a(eag1, eao::d), i, j);
/* 108 */     dfm1.b();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */