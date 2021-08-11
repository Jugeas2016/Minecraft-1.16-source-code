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
/*     */ public abstract class bgt
/*     */   extends bgm
/*     */ {
/*     */   protected bgt(aqe<? extends bgt> ☃, brx brx1) {
/*  20 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   protected bgt(aqe<? extends bgt> ☃, double d1, double d2, double d3, brx brx1) {
/*  24 */     this(☃, brx1);
/*     */     
/*  26 */     d(d1, d2, d3);
/*     */   }
/*     */   
/*     */   protected bgt(aqe<? extends bgt> ☃, aqm aqm1, brx brx1) {
/*  30 */     this(☃, aqm1.cD(), aqm1.cG() - 0.10000000149011612D, aqm1.cH(), brx1);
/*     */     
/*  32 */     b(aqm1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/*  37 */     double d = cc().a() * 4.0D;
/*  38 */     if (Double.isNaN(d)) {
/*  39 */       d = 4.0D;
/*     */     }
/*  41 */     d *= 64.0D;
/*  42 */     return (☃ < d * d);
/*     */   }
/*     */   
/*     */   public void j() {
/*     */     float f;
/*  47 */     super.j();
/*     */     
/*  49 */     dcl ☃ = bgn.a(this, this::a);
/*     */     
/*  51 */     boolean bool = false;
/*  52 */     if (☃.c() == dcl.a.b) {
/*  53 */       fx fx = ((dcj)☃).a();
/*  54 */       ceh ceh = this.l.d_(fx);
/*  55 */       if (ceh.a(bup.cT)) {
/*  56 */         d(fx);
/*  57 */         bool = true;
/*  58 */       } else if (ceh.a(bup.iF)) {
/*  59 */         ccj ccj = this.l.c(fx);
/*  60 */         if (ccj instanceof cdk && cdk.a(this)) {
/*  61 */           ((cdk)ccj).b(this);
/*     */         }
/*  63 */         bool = true;
/*     */       } 
/*     */     } 
/*  66 */     if (☃.c() != dcl.a.a && !bool) {
/*  67 */       a(☃);
/*     */     }
/*     */     
/*  70 */     ay();
/*  71 */     dcn dcn = cC();
/*  72 */     double d1 = cD() + dcn.b;
/*  73 */     double d2 = cE() + dcn.c;
/*  74 */     double d3 = cH() + dcn.d;
/*     */     
/*  76 */     x();
/*     */ 
/*     */     
/*  79 */     if (aE()) {
/*  80 */       for (int i = 0; i < 4; i++) {
/*  81 */         float f1 = 0.25F;
/*  82 */         this.l.a(hh.e, d1 - dcn.b * 0.25D, d2 - dcn.c * 0.25D, d3 - dcn.d * 0.25D, dcn.b, dcn.c, dcn.d);
/*     */       } 
/*  84 */       f = 0.8F;
/*     */     } else {
/*  86 */       f = 0.99F;
/*     */     } 
/*     */     
/*  89 */     f(dcn.a(f));
/*     */     
/*  91 */     if (!aB()) {
/*  92 */       dcn dcn1 = cC();
/*  93 */       n(dcn1.b, dcn1.c - k(), dcn1.d);
/*     */     } 
/*     */     
/*  96 */     d(d1, d2, d3);
/*     */   }
/*     */   
/*     */   protected float k() {
/* 100 */     return 0.03F;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 105 */     return new on(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */