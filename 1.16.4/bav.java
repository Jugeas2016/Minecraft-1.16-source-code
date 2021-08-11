/*     */ import java.util.Random;
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
/*     */ public class bav
/*     */   extends bay
/*     */ {
/*     */   public float b;
/*     */   public float c;
/*     */   public float d;
/*     */   public float bo;
/*     */   public float bp;
/*     */   public float bq;
/*     */   public float br;
/*     */   public float bs;
/*     */   private float bt;
/*     */   private float bu;
/*     */   private float bv;
/*     */   private float bw;
/*     */   private float bx;
/*     */   private float by;
/*     */   
/*     */   public bav(aqe<? extends bav> ☃, brx brx1) {
/*  52 */     super((aqe)☃, brx1);
/*     */     
/*  54 */     this.J.setSeed(Y());
/*  55 */     this.bu = 1.0F / (this.J.nextFloat() + 1.0F) * 0.2F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  60 */     this.bk.a(0, new b(this, this));
/*  61 */     this.bk.a(1, new a());
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  65 */     return aqn.p()
/*  66 */       .a(arl.a, 10.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/*  71 */     return aqb1.b * 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/*  76 */     return adq.oG;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/*  81 */     return adq.oI;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/*  86 */     return adq.oH;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dG() {
/*  91 */     return 0.4F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/*  96 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 101 */     super.k();
/*     */     
/* 103 */     this.c = this.b;
/* 104 */     this.bo = this.d;
/*     */     
/* 106 */     this.bq = this.bp;
/* 107 */     this.bs = this.br;
/*     */     
/* 109 */     this.bp += this.bu;
/* 110 */     if (this.bp > 6.283185307179586D) {
/* 111 */       if (this.l.v) {
/* 112 */         this.bp = 6.2831855F;
/*     */       } else {
/* 114 */         this.bp = (float)(this.bp - 6.283185307179586D);
/* 115 */         if (this.J.nextInt(10) == 0) {
/* 116 */           this.bu = 1.0F / (this.J.nextFloat() + 1.0F) * 0.2F;
/*     */         }
/* 118 */         this.l.a(this, (byte)19);
/*     */       } 
/*     */     }
/*     */     
/* 122 */     if (aH()) {
/* 123 */       if (this.bp < 3.1415927F) {
/* 124 */         float f1 = this.bp / 3.1415927F;
/* 125 */         this.br = afm.a(f1 * f1 * 3.1415927F) * 3.1415927F * 0.25F;
/*     */         
/* 127 */         if (f1 > 0.75D) {
/* 128 */           this.bt = 1.0F;
/* 129 */           this.bv = 1.0F;
/*     */         } else {
/* 131 */           this.bv *= 0.8F;
/*     */         } 
/*     */       } else {
/* 134 */         this.br = 0.0F;
/* 135 */         this.bt *= 0.9F;
/* 136 */         this.bv *= 0.99F;
/*     */       } 
/*     */       
/* 139 */       if (!this.l.v) {
/* 140 */         n((this.bw * this.bt), (this.bx * this.bt), (this.by * this.bt));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 147 */       dcn ☃ = cC();
/* 148 */       float f = afm.a(c(☃));
/*     */       
/* 150 */       this.aA += (-((float)afm.d(☃.b, ☃.d)) * 57.295776F - this.aA) * 0.1F;
/* 151 */       this.p = this.aA;
/* 152 */       this.d = (float)(this.d + Math.PI * this.bv * 1.5D);
/* 153 */       this.b += (-((float)afm.d(f, ☃.c)) * 57.295776F - this.b) * 0.1F;
/*     */     } else {
/* 155 */       this.br = afm.e(afm.a(this.bp)) * 3.1415927F * 0.25F;
/*     */       
/* 157 */       if (!this.l.v) {
/* 158 */         double ☃ = (cC()).c;
/*     */         
/* 160 */         if (a(apw.y)) {
/* 161 */           ☃ = 0.05D * (b(apw.y).c() + 1);
/* 162 */         } else if (!aB()) {
/* 163 */           ☃ -= 0.08D;
/*     */         } 
/*     */         
/* 166 */         n(0.0D, ☃ * 0.9800000190734863D, 0.0D);
/*     */       } 
/*     */ 
/*     */       
/* 170 */       this.b = (float)(this.b + (-90.0F - this.b) * 0.02D);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 176 */     if (super.a(☃, f) && cZ() != null) {
/* 177 */       eL();
/* 178 */       return true;
/*     */     } 
/*     */     
/* 181 */     return false;
/*     */   }
/*     */   
/*     */   private dcn i(dcn ☃) {
/* 185 */     dcn dcn1 = ☃.a(this.c * 0.017453292F);
/* 186 */     dcn1 = dcn1.b(-this.aB * 0.017453292F);
/* 187 */     return dcn1;
/*     */   }
/*     */   
/*     */   private void eL() {
/* 191 */     a(adq.oJ, dG(), dH());
/* 192 */     dcn ☃ = i(new dcn(0.0D, -1.0D, 0.0D)).b(cD(), cE(), cH());
/* 193 */     for (int i = 0; i < 30; i++) {
/* 194 */       dcn dcn1 = i(new dcn(this.J.nextFloat() * 0.6D - 0.3D, -1.0D, this.J.nextFloat() * 0.6D - 0.3D));
/* 195 */       dcn dcn2 = dcn1.a(0.3D + (this.J.nextFloat() * 2.0F));
/* 196 */       ((aag)this.l).a(hh.V, ☃.b, ☃.c + 0.5D, ☃.d, 0, dcn2.b, dcn2.c, dcn2.d, 0.10000000149011612D);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(dcn ☃) {
/* 202 */     a(aqr.a, cC());
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<bav> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 206 */     return (fx1.v() > 45 && fx1.v() < bry1.t_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 211 */     if (☃ == 19) {
/* 212 */       this.bp = 0.0F;
/*     */     } else {
/* 214 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 219 */     this.bw = ☃;
/* 220 */     this.bx = f1;
/* 221 */     this.by = f2;
/*     */   }
/*     */   
/*     */   public boolean eK() {
/* 225 */     return (this.bw != 0.0F || this.bx != 0.0F || this.by != 0.0F);
/*     */   }
/*     */   
/*     */   class b extends avv {
/*     */     private final bav b;
/*     */     
/*     */     public b(bav this$0, bav ☃) {
/* 232 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 237 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 242 */       int ☃ = this.b.dd();
/*     */       
/* 244 */       if (☃ > 100) {
/* 245 */         this.b.a(0.0F, 0.0F, 0.0F);
/* 246 */       } else if (this.b.cY().nextInt(50) == 0 || !bav.a(this.b) || !this.b.eK()) {
/* 247 */         float f1 = this.b.cY().nextFloat() * 6.2831855F;
/* 248 */         float f2 = afm.b(f1) * 0.2F;
/* 249 */         float f3 = -0.1F + this.b.cY().nextFloat() * 0.2F;
/* 250 */         float f4 = afm.a(f1) * 0.2F;
/* 251 */         this.b.a(f2, f3, f4);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   class a
/*     */     extends avv
/*     */   {
/*     */     private int b;
/*     */     
/*     */     private a(bav this$0) {}
/*     */     
/*     */     public boolean a() {
/* 265 */       aqm ☃ = this.a.cZ();
/* 266 */       if (this.a.aE() && ☃ != null) {
/* 267 */         return (this.a.h(☃) < 100.0D);
/*     */       }
/*     */       
/* 270 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 275 */       this.b = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 280 */       this.b++;
/*     */       
/* 282 */       aqm ☃ = this.a.cZ();
/* 283 */       if (☃ == null) {
/*     */         return;
/*     */       }
/*     */       
/* 287 */       dcn dcn = new dcn(this.a.cD() - ☃.cD(), this.a.cE() - ☃.cE(), this.a.cH() - ☃.cH());
/*     */       
/* 289 */       ceh ceh = this.a.l.d_(new fx(this.a.cD() + dcn.b, this.a.cE() + dcn.c, this.a.cH() + dcn.d));
/* 290 */       cux cux = this.a.l.b(new fx(this.a.cD() + dcn.b, this.a.cE() + dcn.c, this.a.cH() + dcn.d));
/* 291 */       if (cux.a(aef.b) || ceh.g()) {
/* 292 */         double d = dcn.f();
/* 293 */         if (d > 0.0D) {
/* 294 */           dcn.d();
/*     */           
/* 296 */           float f = 3.0F;
/* 297 */           if (d > 5.0D) {
/* 298 */             f = (float)(f - (d - 5.0D) / 5.0D);
/*     */           }
/*     */           
/* 301 */           if (f > 0.0F) {
/* 302 */             dcn = dcn.a(f);
/*     */           }
/*     */         } 
/*     */         
/* 306 */         if (ceh.g()) {
/* 307 */           dcn = dcn.a(0.0D, dcn.c, 0.0D);
/*     */         }
/*     */         
/* 310 */         this.a.a((float)dcn.b / 20.0F, (float)dcn.c / 20.0F, (float)dcn.d / 20.0F);
/*     */       } 
/*     */       
/* 313 */       if (this.b % 10 == 5)
/* 314 */         this.a.l.a(hh.e, this.a.cD(), this.a.cE(), this.a.cH(), 0.0D, 0.0D, 0.0D); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bav.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */