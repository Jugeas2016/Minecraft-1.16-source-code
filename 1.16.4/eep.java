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
/*     */ public class eep
/*     */   extends eeu<bbq>
/*     */ {
/*  18 */   private static final vk a = new vk("textures/entity/end_crystal/end_crystal.png");
/*  19 */   private static final eao e = eao.d(a);
/*  20 */   private static final float f = (float)Math.sin(0.7853981633974483D);
/*     */   
/*     */   private final dwn g;
/*     */   private final dwn h;
/*     */   private final dwn i;
/*     */   
/*     */   public eep(eet ☃) {
/*  27 */     super(☃);
/*  28 */     this.c = 0.5F;
/*     */     
/*  30 */     this.h = new dwn(64, 32, 0, 0);
/*  31 */     this.h.a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
/*     */     
/*  33 */     this.g = new dwn(64, 32, 32, 0);
/*  34 */     this.g.a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
/*     */     
/*  36 */     this.i = new dwn(64, 32, 0, 16);
/*  37 */     this.i.a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bbq ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  42 */     dfm1.a();
/*     */     
/*  44 */     float f3 = a(☃, f2);
/*  45 */     float f4 = (☃.b + f2) * 3.0F;
/*     */     
/*  47 */     dfq dfq = eag1.getBuffer(e);
/*     */     
/*  49 */     dfm1.a();
/*  50 */     dfm1.a(2.0F, 2.0F, 2.0F);
/*  51 */     dfm1.a(0.0D, -0.5D, 0.0D);
/*  52 */     int j = ejw.a;
/*     */     
/*  54 */     if (☃.h()) {
/*  55 */       this.i.a(dfm1, dfq, i, j);
/*     */     }
/*     */     
/*  58 */     dfm1.a(g.d.a(f4));
/*  59 */     dfm1.a(0.0D, (1.5F + f3 / 2.0F), 0.0D);
/*  60 */     dfm1.a(new d(new g(f, 0.0F, f), 60.0F, true));
/*     */     
/*  62 */     this.h.a(dfm1, dfq, i, j);
/*  63 */     float f5 = 0.875F;
/*  64 */     dfm1.a(0.875F, 0.875F, 0.875F);
/*  65 */     dfm1.a(new d(new g(f, 0.0F, f), 60.0F, true));
/*  66 */     dfm1.a(g.d.a(f4));
/*     */     
/*  68 */     this.h.a(dfm1, dfq, i, j);
/*  69 */     dfm1.a(0.875F, 0.875F, 0.875F);
/*  70 */     dfm1.a(new d(new g(f, 0.0F, f), 60.0F, true));
/*  71 */     dfm1.a(g.d.a(f4));
/*     */     
/*  73 */     this.g.a(dfm1, dfq, i, j);
/*  74 */     dfm1.b();
/*  75 */     dfm1.b();
/*     */     
/*  77 */     fx fx = ☃.g();
/*  78 */     if (fx != null) {
/*  79 */       float f6 = fx.u() + 0.5F;
/*  80 */       float f7 = fx.v() + 0.5F;
/*  81 */       float f8 = fx.w() + 0.5F;
/*  82 */       float f9 = (float)(f6 - ☃.cD());
/*  83 */       float f10 = (float)(f7 - ☃.cE());
/*  84 */       float f11 = (float)(f8 - ☃.cH());
/*  85 */       dfm1.a(f9, f10, f11);
/*  86 */       eeq.a(-f9, -f10 + f3, -f11, f2, ☃.b, dfm1, eag1, i);
/*     */     } 
/*     */     
/*  89 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */   }
/*     */   
/*     */   public static float a(bbq ☃, float f) {
/*  93 */     float f1 = ☃.b + f;
/*  94 */     float f2 = afm.a(f1 * 0.2F) / 2.0F + 0.5F;
/*  95 */     f2 = (f2 * f2 + f2) * 0.4F;
/*  96 */     return f2 - 1.4F;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(bbq ☃) {
/* 101 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bbq ☃, ecz ecz1, double d1, double d2, double d3) {
/* 106 */     return (super.a(☃, ecz1, d1, d2, d3) || ☃.g() != null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */