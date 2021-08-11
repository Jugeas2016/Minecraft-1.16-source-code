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
/*     */ public class bac
/*     */   extends azz
/*     */ {
/*  38 */   private static final bon bv = bon.a(new brw[] { bmd.kV, bmd.nk, bmd.nj, bmd.qg });
/*     */   
/*     */   public float bo;
/*     */   public float bp;
/*     */   public float bq;
/*     */   public float br;
/*  44 */   public float bs = 1.0F;
/*     */   public int bt;
/*     */   public boolean bu;
/*     */   
/*     */   public bac(aqe<? extends bac> ☃, brx brx1) {
/*  49 */     super((aqe)☃, brx1);
/*     */     
/*  51 */     this.bt = this.J.nextInt(6000) + 6000;
/*     */     
/*  53 */     a(cwz.h, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  58 */     this.bk.a(0, new avp(this));
/*  59 */     this.bk.a(1, new awp(this, 1.4D));
/*  60 */     this.bk.a(2, new avi(this, 1.0D));
/*  61 */     this.bk.a(3, new axf(this, 1.0D, false, bv));
/*  62 */     this.bk.a(4, new avu(this, 1.1D));
/*  63 */     this.bk.a(5, new axk(this, 1.0D));
/*  64 */     this.bk.a(6, new awd(this, (Class)bfw.class, 6.0F));
/*  65 */     this.bk.a(7, new aws(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/*  70 */     return w_() ? (aqb1.b * 0.85F) : (aqb1.b * 0.92F);
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/*  74 */     return aqn.p()
/*  75 */       .a(arl.a, 4.0D)
/*  76 */       .a(arl.d, 0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/*  81 */     super.k();
/*     */     
/*  83 */     this.br = this.bo;
/*  84 */     this.bq = this.bp;
/*     */     
/*  86 */     this.bp = (float)(this.bp + (this.t ? -1 : 4) * 0.3D);
/*  87 */     this.bp = afm.a(this.bp, 0.0F, 1.0F);
/*     */     
/*  89 */     if (!this.t && this.bs < 1.0F) {
/*  90 */       this.bs = 1.0F;
/*     */     }
/*  92 */     this.bs = (float)(this.bs * 0.9D);
/*     */     
/*  94 */     dcn ☃ = cC();
/*  95 */     if (!this.t && ☃.c < 0.0D) {
/*  96 */       f(☃.d(1.0D, 0.6D, 1.0D));
/*     */     }
/*     */     
/*  99 */     this.bo += this.bs * 2.0F;
/*     */     
/* 101 */     if (!this.l.v && aX() && !w_() && !eL() && --this.bt <= 0) {
/* 102 */       a(adq.bJ, 1.0F, (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/* 103 */       a(bmd.mg);
/* 104 */       this.bt = this.J.nextInt(6000) + 6000;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 110 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 115 */     return adq.bH;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 120 */     return adq.bK;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 125 */     return adq.bI;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 130 */     a(adq.bL, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public bac b(aag ☃, apy apy1) {
/* 135 */     return aqe.j.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 140 */     return bv.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(bfw ☃) {
/* 145 */     if (eL()) {
/* 146 */       return 10;
/*     */     }
/* 148 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 153 */     super.a(☃);
/* 154 */     this.bu = ☃.q("IsChickenJockey");
/* 155 */     if (☃.e("EggLayTime")) {
/* 156 */       this.bt = ☃.h("EggLayTime");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 162 */     super.b(☃);
/* 163 */     ☃.a("IsChickenJockey", this.bu);
/* 164 */     ☃.b("EggLayTime", this.bt);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 169 */     return eL();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(aqa ☃) {
/* 174 */     super.k(☃);
/* 175 */     float f1 = afm.a(this.aA * 0.017453292F);
/* 176 */     float f2 = afm.b(this.aA * 0.017453292F);
/* 177 */     float f3 = 0.1F;
/* 178 */     float f4 = 0.0F;
/*     */     
/* 180 */     ☃.d(cD() + (0.1F * f1), e(0.5D) + ☃.bb() + 0.0D, cH() - (0.1F * f2));
/* 181 */     if (☃ instanceof aqm) {
/* 182 */       ((aqm)☃).aA = this.aA;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean eL() {
/* 187 */     return this.bu;
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 191 */     this.bu = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */