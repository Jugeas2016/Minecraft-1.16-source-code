/*     */ import java.util.List;
/*     */ import java.util.UUID;
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
/*     */ public class beg
/*     */   extends bhc
/*     */   implements bdu
/*     */ {
/*  48 */   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
/*  49 */   private static final arj bo = new arj(b, "Drinking speed penalty", -0.25D, arj.a.a);
/*     */   
/*  51 */   private static final us<Boolean> bp = uv.a((Class)beg.class, uu.i);
/*     */   
/*     */   private int bq;
/*     */   
/*     */   private axs<bhc> br;
/*     */   private axr<bfw> bs;
/*     */   
/*     */   public beg(aqe<? extends beg> ☃, brx brx1) {
/*  59 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  64 */     super.o();
/*     */ 
/*     */     
/*  67 */     this.br = new axs<>(this, bhc.class, true, ☃ -> (☃ != null && fb() && ☃.X() != aqe.aS));
/*  68 */     this.bs = new axr<>(this, bfw.class, 10, true, false, null);
/*     */     
/*  70 */     this.bk.a(1, new avp(this));
/*  71 */     this.bk.a(2, new awv(this, 1.0D, 60, 10.0F));
/*  72 */     this.bk.a(2, new axk(this, 1.0D));
/*  73 */     this.bk.a(3, new awd(this, (Class)bfw.class, 8.0F));
/*  74 */     this.bk.a(3, new aws(this));
/*     */     
/*  76 */     this.bl.a(1, new axp(this, new Class[] { bhc.class }));
/*  77 */     this.bl.a(2, this.br);
/*  78 */     this.bl.a(3, this.bs);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  83 */     super.e();
/*     */     
/*  85 */     ab().a(bp, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/*  90 */     return adq.qK;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/*  95 */     return adq.qO;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 100 */     return adq.qM;
/*     */   }
/*     */   
/*     */   public void v(boolean ☃) {
/* 104 */     ab().b(bp, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 108 */     return ((Boolean)ab().<Boolean>a(bp)).booleanValue();
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/* 112 */     return bdq.eR()
/* 113 */       .a(arl.a, 26.0D)
/* 114 */       .a(arl.d, 0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 119 */     if (!this.l.v && aX()) {
/* 120 */       this.br.j();
/*     */       
/* 122 */       if (this.br.h() <= 0) {
/* 123 */         this.bs.a(true);
/*     */       } else {
/* 125 */         this.bs.a(false);
/*     */       } 
/*     */       
/* 128 */       if (m()) {
/* 129 */         if (this.bq-- <= 0) {
/* 130 */           v(false);
/* 131 */           bmb ☃ = dD();
/* 132 */           a(aqf.a, bmb.b);
/*     */           
/* 134 */           if (☃.b() == bmd.nv) {
/* 135 */             List<apu> list = bnv.a(☃);
/* 136 */             if (list != null) {
/* 137 */               for (apu apu : list) {
/* 138 */                 c(new apu(apu));
/*     */               }
/*     */             }
/*     */           } 
/*     */           
/* 143 */           a(arl.d).d(bo);
/*     */         } 
/*     */       } else {
/* 146 */         bnt ☃ = null;
/*     */         
/* 148 */         if (this.J.nextFloat() < 0.15F && a(aef.b) && !a(apw.m)) {
/* 149 */           ☃ = bnw.x;
/* 150 */         } else if (this.J.nextFloat() < 0.15F && (bq() || (dm() != null && dm().p())) && !a(apw.l)) {
/* 151 */           ☃ = bnw.m;
/* 152 */         } else if (this.J.nextFloat() < 0.05F && dk() < dx()) {
/* 153 */           ☃ = bnw.z;
/* 154 */         } else if (this.J.nextFloat() < 0.5F && A() != null && !a(apw.a) && A().h(this) > 121.0D) {
/* 155 */           ☃ = bnw.o;
/*     */         } 
/*     */         
/* 158 */         if (☃ != null) {
/* 159 */           a(aqf.a, bnv.a(new bmb(bmd.nv), ☃));
/* 160 */           this.bq = dD().k();
/* 161 */           v(true);
/* 162 */           if (!aA()) {
/* 163 */             this.l.a((bfw)null, cD(), cE(), cH(), adq.qN, cu(), 1.0F, 0.8F + this.J.nextFloat() * 0.4F);
/*     */           }
/* 165 */           arh arh = a(arl.d);
/* 166 */           arh.d(bo);
/* 167 */           arh.b(bo);
/*     */         } 
/*     */       } 
/*     */       
/* 171 */       if (this.J.nextFloat() < 7.5E-4F) {
/* 172 */         this.l.a(this, (byte)15);
/*     */       }
/*     */     } 
/*     */     
/* 176 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public adp eL() {
/* 181 */     return adq.qL;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 186 */     if (☃ == 15) {
/* 187 */       for (int i = 0; i < this.J.nextInt(35) + 10; i++) {
/* 188 */         this.l.a(hh.aa, cD() + this.J.nextGaussian() * 0.12999999523162842D, (cc()).e + 0.5D + this.J.nextGaussian() * 0.12999999523162842D, cH() + this.J.nextGaussian() * 0.12999999523162842D, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     } else {
/* 191 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected float d(apk ☃, float f) {
/* 197 */     f = super.d(☃, f);
/*     */     
/* 199 */     if (☃.k() == this) {
/* 200 */       f = 0.0F;
/*     */     }
/* 202 */     if (☃.t()) {
/* 203 */       f = (float)(f * 0.15D);
/*     */     }
/*     */     
/* 206 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 211 */     if (m()) {
/*     */       return;
/*     */     }
/*     */     
/* 215 */     dcn dcn = ☃.cC();
/* 216 */     double d1 = ☃.cD() + dcn.b - cD();
/* 217 */     double d2 = ☃.cG() - 1.100000023841858D - cE();
/* 218 */     double d3 = ☃.cH() + dcn.d - cH();
/* 219 */     float f1 = afm.a(d1 * d1 + d3 * d3);
/* 220 */     bnt bnt = bnw.B;
/*     */ 
/*     */     
/* 223 */     if (☃ instanceof bhc) {
/* 224 */       if (☃.dk() <= 4.0F) {
/* 225 */         bnt = bnw.z;
/*     */       } else {
/* 227 */         bnt = bnw.G;
/*     */       } 
/* 229 */       h((aqm)null);
/*     */     }
/* 231 */     else if (f1 >= 8.0F && !☃.a(apw.b)) {
/* 232 */       bnt = bnw.r;
/* 233 */     } else if (☃.dk() >= 8.0F && !☃.a(apw.s)) {
/* 234 */       bnt = bnw.D;
/* 235 */     } else if (f1 <= 3.0F && !☃.a(apw.r) && this.J.nextFloat() < 0.25F) {
/* 236 */       bnt = bnw.M;
/*     */     } 
/*     */ 
/*     */     
/* 240 */     bgx bgx = new bgx(this.l, this);
/* 241 */     bgx.b(bnv.a(new bmb(bmd.qj), bnt));
/* 242 */     bgx.q -= -20.0F;
/* 243 */     bgx.c(d1, d2 + (f1 * 0.2F), d3, 0.75F, 8.0F);
/* 244 */     if (!aA()) {
/* 245 */       this.l.a((bfw)null, cD(), cE(), cH(), adq.qP, cu(), 1.0F, 0.8F + this.J.nextFloat() * 0.4F);
/*     */     }
/*     */     
/* 248 */     this.l.c(bgx);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 253 */     return 1.62F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, boolean bool) {}
/*     */ 
/*     */   
/*     */   public boolean eN() {
/* 262 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\beg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */