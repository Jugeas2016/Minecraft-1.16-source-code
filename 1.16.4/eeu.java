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
/*     */ public abstract class eeu<T extends aqa>
/*     */ {
/*     */   protected final eet b;
/*     */   protected float c;
/*  25 */   protected float d = 1.0F;
/*     */   
/*     */   protected eeu(eet ☃) {
/*  28 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public final int b(T ☃, float f) {
/*  32 */     fx fx = new fx(☃.k(f));
/*  33 */     return eaf.a(a(☃, fx), b(☃, fx));
/*     */   }
/*     */   
/*     */   protected int b(T ☃, fx fx1) {
/*  37 */     return ((aqa)☃).l.a(bsf.a, fx1);
/*     */   }
/*     */   
/*     */   protected int a(T ☃, fx fx1) {
/*  41 */     if (☃.bq()) {
/*  42 */       return 15;
/*     */     }
/*  44 */     return ((aqa)☃).l.a(bsf.b, fx1);
/*     */   }
/*     */   
/*     */   public boolean a(T ☃, ecz ecz1, double d1, double d2, double d3) {
/*  48 */     if (!☃.j(d1, d2, d3)) {
/*  49 */       return false;
/*     */     }
/*  51 */     if (((aqa)☃).Y) {
/*  52 */       return true;
/*     */     }
/*  54 */     dci dci = ☃.cd().g(0.5D);
/*  55 */     if (dci.e() || dci.a() == 0.0D) {
/*  56 */       dci = new dci(☃.cD() - 2.0D, ☃.cE() - 2.0D, ☃.cH() - 2.0D, ☃.cD() + 2.0D, ☃.cE() + 2.0D, ☃.cH() + 2.0D);
/*     */     }
/*  58 */     return ecz1.a(dci);
/*     */   }
/*     */   
/*     */   public dcn a(T ☃, float f) {
/*  62 */     return dcn.a;
/*     */   }
/*     */   
/*     */   public void a(T ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  66 */     if (!b(☃)) {
/*     */       return;
/*     */     }
/*     */     
/*  70 */     a(☃, ☃.d(), dfm1, eag1, i);
/*     */   }
/*     */   
/*     */   protected boolean b(T ☃) {
/*  74 */     return (☃.bY() && ☃.S());
/*     */   }
/*     */   
/*     */   public abstract vk a(T paramT);
/*     */   
/*     */   public dku a() {
/*  80 */     return this.b.c();
/*     */   }
/*     */   
/*     */   protected void a(T ☃, nr nr1, dfm dfm1, eag eag1, int i) {
/*  84 */     double d = this.b.b((aqa)☃);
/*     */     
/*  86 */     if (d > 4096.0D) {
/*     */       return;
/*     */     }
/*     */     
/*  90 */     boolean bool = !☃.bx();
/*     */     
/*  92 */     float f1 = ☃.cz() + 0.5F;
/*  93 */     int j = "deadmau5".equals(nr1.getString()) ? -10 : 0;
/*     */     
/*  95 */     dfm1.a();
/*     */     
/*  97 */     dfm1.a(0.0D, f1, 0.0D);
/*  98 */     dfm1.a(this.b.b());
/*     */     
/* 100 */     dfm1.a(-0.025F, -0.025F, 0.025F);
/*     */     
/* 102 */     b b = dfm1.c().a();
/*     */     
/* 104 */     float f2 = (djz.C()).k.a(0.25F);
/* 105 */     int k = (int)(f2 * 255.0F) << 24;
/*     */     
/* 107 */     dku dku = a();
/*     */     
/* 109 */     float f3 = (-dku.a(nr1) / 2);
/*     */     
/* 111 */     dku.a(nr1, f3, j, 553648127, false, b, eag1, bool, k, i);
/*     */     
/* 113 */     if (bool) {
/* 114 */       dku.a(nr1, f3, j, -1, false, b, eag1, false, 0, i);
/*     */     }
/*     */     
/* 117 */     dfm1.b();
/*     */   }
/*     */   
/*     */   public eet b() {
/* 121 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eeu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */