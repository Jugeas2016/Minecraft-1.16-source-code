/*     */ import javax.annotation.Nullable;
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
/*     */ public class bdo
/*     */   extends bea
/*     */   implements bdu
/*     */ {
/*     */   private int bo;
/*     */   private final dcn[][] bp;
/*     */   
/*     */   public bdo(aqe<? extends bdo> ☃, brx brx1) {
/*  54 */     super((aqe)☃, brx1);
/*     */     
/*  56 */     this.f = 5;
/*     */     
/*  58 */     this.bp = new dcn[2][4];
/*  59 */     for (int i = 0; i < 4; i++) {
/*  60 */       this.bp[0][i] = dcn.a;
/*  61 */       this.bp[1][i] = dcn.a;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  67 */     super.o();
/*     */     
/*  69 */     this.bk.a(0, new avp(this));
/*  70 */     this.bk.a(1, new bea.b(this));
/*  71 */     this.bk.a(4, new b());
/*  72 */     this.bk.a(5, new a());
/*  73 */     this.bk.a(6, new aww<>(this, 0.5D, 20, 15.0F));
/*  74 */     this.bk.a(8, new awt(this, 0.6D));
/*  75 */     this.bk.a(9, new awd(this, (Class)bfw.class, 3.0F, 1.0F));
/*  76 */     this.bk.a(10, new awd(this, (Class)aqn.class, 8.0F));
/*     */     
/*  78 */     this.bl.a(1, (new axp(this, new Class[] { bhc.class })).a(new Class[0]));
/*  79 */     this.bl.a(2, (new axq<>(this, (Class)bfw.class, true)).a(300));
/*  80 */     this.bl.a(3, (new axq<>(this, (Class)bfe.class, false)).a(300));
/*  81 */     this.bl.a(3, (new axq<>(this, (Class)bai.class, false)).a(300));
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/*  85 */     return bdq.eR()
/*  86 */       .a(arl.d, 0.5D)
/*  87 */       .a(arl.b, 18.0D)
/*  88 */       .a(arl.a, 32.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  93 */     a(aqf.a, new bmb(bmd.kc));
/*     */     
/*  95 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 100 */     super.e();
/*     */   }
/*     */ 
/*     */   
/*     */   public dci cd() {
/* 105 */     return cc().c(3.0D, 0.0D, 3.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 110 */     super.k();
/*     */     
/* 112 */     if (this.l.v && bF()) {
/* 113 */       this.bo--;
/* 114 */       if (this.bo < 0) {
/* 115 */         this.bo = 0;
/*     */       }
/*     */       
/* 118 */       if (this.an == 1 || this.K % 1200 == 0) {
/* 119 */         this.bo = 3;
/*     */         
/* 121 */         float ☃ = -6.0F;
/* 122 */         int i = 13;
/*     */         int j;
/* 124 */         for (j = 0; j < 4; j++) {
/* 125 */           this.bp[0][j] = this.bp[1][j];
/* 126 */           this.bp[1][j] = new dcn((-6.0F + this.J.nextInt(13)) * 0.5D, Math.max(0, this.J.nextInt(6) - 4), (-6.0F + this.J.nextInt(13)) * 0.5D);
/*     */         } 
/* 128 */         for (j = 0; j < 16; j++) {
/* 129 */           this.l.a(hh.f, d(0.5D), cF(), f(0.5D), 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */         
/* 132 */         this.l.a(cD(), cE(), cH(), adq.gs, cu(), 1.0F, 1.0F, false);
/* 133 */       } else if (this.an == this.ao - 1) {
/* 134 */         this.bo = 3;
/* 135 */         for (int ☃ = 0; ☃ < 4; ☃++) {
/* 136 */           this.bp[0][☃] = this.bp[1][☃];
/* 137 */           this.bp[1][☃] = new dcn(0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public adp eL() {
/* 145 */     return adq.go;
/*     */   }
/*     */   
/*     */   public dcn[] y(float ☃) {
/* 149 */     if (this.bo <= 0) {
/* 150 */       return this.bp[1];
/*     */     }
/* 152 */     double d = ((this.bo - ☃) / 3.0F);
/* 153 */     d = Math.pow(d, 0.25D);
/* 154 */     dcn[] arrayOfDcn = new dcn[4];
/* 155 */     for (int i = 0; i < 4; i++) {
/* 156 */       arrayOfDcn[i] = this.bp[1][i].a(1.0D - d).e(this.bp[0][i].a(d));
/*     */     }
/* 158 */     return arrayOfDcn;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(aqa ☃) {
/* 163 */     if (super.r(☃)) {
/* 164 */       return true;
/*     */     }
/* 166 */     if (☃ instanceof aqm && ((aqm)☃).dC() == aqq.d)
/*     */     {
/* 168 */       return (bG() == null && ☃.bG() == null);
/*     */     }
/* 170 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 175 */     return adq.go;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 180 */     return adq.gq;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 185 */     return adq.gr;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp eM() {
/* 190 */     return adq.gp;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, boolean bool) {}
/*     */ 
/*     */   
/*     */   class b
/*     */     extends bea.c
/*     */   {
/*     */     public boolean a() {
/* 201 */       if (!super.a()) {
/* 202 */         return false;
/*     */       }
/* 204 */       if (this.a.a(apw.n)) {
/* 205 */         return false;
/*     */       }
/* 207 */       return true;
/*     */     }
/*     */     private b(bdo this$0) {}
/*     */     
/*     */     protected int g() {
/* 212 */       return 20;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int h() {
/* 217 */       return 340;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void j() {
/* 222 */       this.a.c(new apu(apw.n, 1200));
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     protected adp k() {
/* 228 */       return adq.gu;
/*     */     }
/*     */ 
/*     */     
/*     */     protected bea.a l() {
/* 233 */       return bea.a.e;
/*     */     } }
/*     */   
/*     */   class a extends bea.c {
/*     */     private int e;
/*     */     
/*     */     private a(bdo this$0) {}
/*     */     
/*     */     public boolean a() {
/* 242 */       if (!super.a()) {
/* 243 */         return false;
/*     */       }
/* 245 */       if (this.a.A() == null) {
/* 246 */         return false;
/*     */       }
/* 248 */       if (this.a.A().Y() == this.e) {
/* 249 */         return false;
/*     */       }
/* 251 */       if (!this.a.l.d(this.a.cB()).a(aor.c.ordinal())) {
/* 252 */         return false;
/*     */       }
/* 254 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 259 */       super.c();
/*     */       
/* 261 */       this.e = this.a.A().Y();
/*     */     }
/*     */ 
/*     */     
/*     */     protected int g() {
/* 266 */       return 20;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int h() {
/* 271 */       return 180;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void j() {
/* 276 */       this.a.A().c(new apu(apw.o, 400));
/*     */     }
/*     */ 
/*     */     
/*     */     protected adp k() {
/* 281 */       return adq.gt;
/*     */     }
/*     */ 
/*     */     
/*     */     protected bea.a l() {
/* 286 */       return bea.a.f;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 292 */     bmb bmb = f(b(bgn.a(this, bmd.kc)));
/* 293 */     bga bga = bgn.a(this, bmb, f);
/*     */     
/* 295 */     double d1 = ☃.cD() - cD();
/* 296 */     double d2 = ☃.e(0.3333333333333333D) - bga.cE();
/* 297 */     double d3 = ☃.cH() - cH();
/* 298 */     double d4 = afm.a(d1 * d1 + d3 * d3);
/* 299 */     bga.c(d1, d2 + d4 * 0.20000000298023224D, d3, 1.6F, (14 - this.l.ad().a() * 4));
/* 300 */     a(adq.nD, 1.0F, 1.0F / (cY().nextFloat() * 0.4F + 0.8F));
/* 301 */     this.l.c(bga);
/*     */   }
/*     */ 
/*     */   
/*     */   public bcy.a m() {
/* 306 */     if (eW())
/* 307 */       return bcy.a.c; 
/* 308 */     if (eF()) {
/* 309 */       return bcy.a.d;
/*     */     }
/* 311 */     return bcy.a.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */