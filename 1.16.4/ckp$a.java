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
/*     */ public class a
/*     */   extends crv<cmr>
/*     */ {
/*     */   protected a(cla<cmr> ☃, int i, int j, cra cra1, int k, long l) {
/*  62 */     super(☃, i, j, cra1, k, l);
/*     */   }
/*     */   
/*     */   public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmr cmr1) {
/*     */     crp.b b;
/*     */     vk vk;
/*  68 */     crp.a a1 = new crp.a();
/*     */     
/*  70 */     if (cmr1.b == ckp.b.b) {
/*  71 */       b = crp.b.b;
/*  72 */       a1.d = false;
/*  73 */       a1.c = 0.0F;
/*  74 */     } else if (cmr1.b == ckp.b.c) {
/*  75 */       b = crp.b.a;
/*  76 */       a1.d = (this.d.nextFloat() < 0.5F);
/*  77 */       a1.c = 0.8F;
/*  78 */       a1.e = true;
/*  79 */       a1.f = true;
/*  80 */     } else if (cmr1.b == ckp.b.d) {
/*  81 */       b = crp.b.c;
/*  82 */       a1.d = false;
/*  83 */       a1.c = 0.5F;
/*  84 */       a1.f = true;
/*  85 */     } else if (cmr1.b == ckp.b.e) {
/*  86 */       boolean bool = (this.d.nextFloat() < 0.5F);
/*  87 */       b = bool ? crp.b.d : crp.b.a;
/*  88 */       a1.d = (bool || this.d.nextFloat() < 0.5F);
/*  89 */     } else if (cmr1.b == ckp.b.f) {
/*  90 */       b = crp.b.c;
/*  91 */       a1.d = false;
/*  92 */       a1.c = 0.8F;
/*  93 */     } else if (cmr1.b == ckp.b.g) {
/*  94 */       b = crp.b.f;
/*  95 */       a1.d = (this.d.nextFloat() < 0.5F);
/*  96 */       a1.c = 0.0F;
/*  97 */       a1.g = true;
/*     */     } else {
/*  99 */       boolean bool = (this.d.nextFloat() < 0.5F);
/* 100 */       b = bool ? crp.b.e : crp.b.a;
/* 101 */       a1.d = (bool || this.d.nextFloat() < 0.5F);
/*     */     } 
/*     */ 
/*     */     
/* 105 */     if (this.d.nextFloat() < 0.05F) {
/* 106 */       vk = new vk(ckp.d()[this.d.nextInt((ckp.d()).length)]);
/*     */     } else {
/* 108 */       vk = new vk(ckp.e()[this.d.nextInt((ckp.e()).length)]);
/*     */     } 
/*     */     
/* 111 */     ctb ctb = csw1.a(vk);
/* 112 */     bzm bzm = x.<bzm>a(bzm.values(), this.d);
/* 113 */     byg byg = (this.d.nextFloat() < 0.5F) ? byg.a : byg.c;
/* 114 */     fx fx1 = new fx(ctb.a().u() / 2, 0, ctb.a().w() / 2);
/*     */     
/* 116 */     fx fx2 = (new brd(i, j)).l();
/* 117 */     cra cra = ctb.a(fx2, bzm, fx1, byg);
/* 118 */     gr gr = cra.g();
/* 119 */     int k = gr.u();
/* 120 */     int m = gr.w();
/* 121 */     int n = cfy1.a(k, m, crp.a(b)) - 1;
/* 122 */     int i1 = ckp.a(this.d, cfy1, b, a1.d, n, cra.e(), cra);
/*     */     
/* 124 */     fx fx3 = new fx(fx2.u(), i1, fx2.w());
/*     */     
/* 126 */     if (cmr1.b == ckp.b.e || cmr1.b == ckp.b.f || cmr1.b == ckp.b.a) {
/* 127 */       a1.b = ckp.a(fx3, bsv1);
/*     */     }
/*     */     
/* 130 */     this.b.add(new crp(fx3, b, a1, vk, ctb, bzm, byg, fx1));
/* 131 */     b();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckp$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */