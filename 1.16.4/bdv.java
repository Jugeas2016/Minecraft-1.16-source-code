/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
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
/*     */ public class bdv
/*     */   extends bhc
/*     */ {
/*     */   private static final Predicate<aqa> b;
/*     */   private int bo;
/*     */   private int bp;
/*     */   private int bq;
/*     */   
/*     */   static {
/*  51 */     b = (☃ -> (☃.aX() && !(☃ instanceof bdv)));
/*     */   }
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
/*     */   public bdv(aqe<? extends bdv> ☃, brx brx1) {
/*  68 */     super((aqe)☃, brx1);
/*     */     
/*  70 */     this.G = 1.0F;
/*  71 */     this.f = 20;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  76 */     super.o();
/*     */     
/*  78 */     this.bk.a(0, new avp(this));
/*  79 */     this.bk.a(4, new a(this));
/*  80 */     this.bk.a(5, new axk(this, 0.4D));
/*  81 */     this.bk.a(6, new awd(this, (Class)bfw.class, 6.0F));
/*  82 */     this.bk.a(10, new awd(this, (Class)aqn.class, 8.0F));
/*     */     
/*  84 */     this.bl.a(2, (new axp(this, new Class[] { bhc.class })).a(new Class[0]));
/*  85 */     this.bl.a(3, new axq<>(this, bfw.class, true));
/*  86 */     this.bl.a(4, new axq<>(this, bfe.class, true));
/*  87 */     this.bl.a(4, new axq<>(this, bai.class, true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void H() {
/*  92 */     boolean ☃ = (!(cm() instanceof aqn) || cm().X().a(aee.c));
/*  93 */     boolean bool1 = !(ct() instanceof bhn);
/*  94 */     this.bk.a(avv.a.a, ☃);
/*  95 */     this.bk.a(avv.a.c, (☃ && bool1));
/*  96 */     this.bk.a(avv.a.b, ☃);
/*  97 */     this.bk.a(avv.a.d, ☃);
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/* 101 */     return bdq.eR()
/* 102 */       .a(arl.a, 100.0D)
/* 103 */       .a(arl.d, 0.3D)
/* 104 */       .a(arl.c, 0.75D)
/* 105 */       .a(arl.f, 12.0D)
/* 106 */       .a(arl.g, 1.5D)
/* 107 */       .a(arl.b, 32.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 112 */     super.b(☃);
/*     */     
/* 114 */     ☃.b("AttackTick", this.bo);
/* 115 */     ☃.b("StunTick", this.bp);
/* 116 */     ☃.b("RoarTick", this.bq);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 121 */     super.a(☃);
/*     */     
/* 123 */     this.bo = ☃.h("AttackTick");
/* 124 */     this.bp = ☃.h("StunTick");
/* 125 */     this.bq = ☃.h("RoarTick");
/*     */   }
/*     */ 
/*     */   
/*     */   public adp eL() {
/* 130 */     return adq.mg;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ayj b(brx ☃) {
/* 135 */     return new b(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int Q() {
/* 140 */     return 45;
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/* 145 */     return 2.1D;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean er() {
/* 150 */     return (!eD() && cm() instanceof aqm);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa cm() {
/* 156 */     if (cn().isEmpty()) {
/* 157 */       return null;
/*     */     }
/* 159 */     return cn().get(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 164 */     super.k();
/*     */     
/* 166 */     if (!aX()) {
/*     */       return;
/*     */     }
/*     */     
/* 170 */     if (dI()) {
/* 171 */       a(arl.d).a(0.0D);
/*     */     } else {
/* 173 */       double ☃ = (A() != null) ? 0.35D : 0.3D;
/* 174 */       double d1 = a(arl.d).b();
/* 175 */       a(arl.d).a(afm.d(0.1D, d1, ☃));
/*     */     } 
/*     */     
/* 178 */     if (this.u && this.l.V().b(brt.b)) {
/* 179 */       boolean ☃ = false;
/* 180 */       dci dci = cc().g(0.2D);
/* 181 */       for (fx fx : fx.b(afm.c(dci.a), afm.c(dci.b), afm.c(dci.c), afm.c(dci.d), afm.c(dci.e), afm.c(dci.f))) {
/* 182 */         ceh ceh = this.l.d_(fx);
/* 183 */         buo buo = ceh.b();
/* 184 */         if (buo instanceof bxx) {
/* 185 */           ☃ = (this.l.a(fx, true, this) || ☃);
/*     */         }
/*     */       } 
/*     */       
/* 189 */       if (!☃ && this.t) {
/* 190 */         dK();
/*     */       }
/*     */     } 
/*     */     
/* 194 */     if (this.bq > 0) {
/* 195 */       this.bq--;
/*     */       
/* 197 */       if (this.bq == 10) {
/* 198 */         eY();
/*     */       }
/*     */     } 
/* 201 */     if (this.bo > 0) {
/* 202 */       this.bo--;
/*     */     }
/* 204 */     if (this.bp > 0) {
/* 205 */       this.bp--;
/* 206 */       eX();
/*     */       
/* 208 */       if (this.bp == 0) {
/* 209 */         a(adq.ml, 1.0F, 1.0F);
/* 210 */         this.bq = 20;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void eX() {
/* 216 */     if (this.J.nextInt(6) == 0) {
/* 217 */       double ☃ = cD() - cy() * Math.sin((this.aA * 0.017453292F)) + this.J.nextDouble() * 0.6D - 0.3D;
/* 218 */       double d1 = cE() + cz() - 0.3D;
/* 219 */       double d2 = cH() + cy() * Math.cos((this.aA * 0.017453292F)) + this.J.nextDouble() * 0.6D - 0.3D;
/*     */       
/* 221 */       this.l.a(hh.u, ☃, d1, d2, 0.4980392156862745D, 0.5137254901960784D, 0.5725490196078431D);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean dI() {
/* 227 */     return (super.dI() || this.bo > 0 || this.bp > 0 || this.bq > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean D(aqa ☃) {
/* 232 */     if (this.bp > 0 || this.bq > 0) {
/* 233 */       return false;
/*     */     }
/* 235 */     return super.D(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e(aqm ☃) {
/* 240 */     if (this.bq == 0) {
/* 241 */       if (this.J.nextDouble() < 0.5D) {
/* 242 */         this.bp = 40;
/* 243 */         a(adq.mk, 1.0F, 1.0F);
/* 244 */         this.l.a(this, (byte)39);
/*     */         
/* 246 */         ☃.i(this);
/*     */       } else {
/* 248 */         a(☃);
/*     */       } 
/* 250 */       ☃.w = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void eY() {
/* 255 */     if (aX()) {
/* 256 */       List<aqa> ☃ = this.l.a((Class)aqm.class, cc().g(4.0D), b);
/* 257 */       for (aqa aqa : ☃) {
/* 258 */         if (!(aqa instanceof bcy)) {
/* 259 */           aqa.a(apk.c(this), 6.0F);
/*     */         }
/* 261 */         a(aqa);
/*     */       } 
/*     */       
/* 264 */       dcn dcn = cc().f();
/* 265 */       for (int i = 0; i < 40; i++) {
/* 266 */         double d1 = this.J.nextGaussian() * 0.2D;
/* 267 */         double d2 = this.J.nextGaussian() * 0.2D;
/* 268 */         double d3 = this.J.nextGaussian() * 0.2D;
/* 269 */         this.l.a(hh.P, dcn.b, dcn.c, dcn.d, d1, d2, d3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(aqa ☃) {
/* 275 */     double d1 = ☃.cD() - cD();
/* 276 */     double d2 = ☃.cH() - cH();
/* 277 */     double d3 = Math.max(d1 * d1 + d2 * d2, 0.001D);
/* 278 */     ☃.i(d1 / d3 * 4.0D, 0.2D, d2 / d3 * 4.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 283 */     if (☃ == 4) {
/* 284 */       this.bo = 10;
/* 285 */       a(adq.mf, 1.0F, 1.0F);
/* 286 */     } else if (☃ == 39) {
/* 287 */       this.bp = 40;
/*     */     } 
/* 289 */     super.a(☃);
/*     */   }
/*     */   
/*     */   public int eK() {
/* 293 */     return this.bo;
/*     */   }
/*     */   
/*     */   public int eM() {
/* 297 */     return this.bp;
/*     */   }
/*     */   
/*     */   public int eW() {
/* 301 */     return this.bq;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 306 */     this.bo = 10;
/* 307 */     this.l.a(this, (byte)4);
/* 308 */     a(adq.mf, 1.0F, 1.0F);
/*     */     
/* 310 */     return super.B(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp I() {
/* 316 */     return adq.me;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 321 */     return adq.mi;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 326 */     return adq.mh;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 331 */     a(adq.mj, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brz ☃) {
/* 336 */     return !☃.d(cc());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, boolean bool) {}
/*     */ 
/*     */   
/*     */   public boolean eN() {
/* 345 */     return false;
/*     */   }
/*     */   
/*     */   class a extends awf {
/*     */     public a(bdv this$0) {
/* 350 */       super(this$0, 1.0D, true);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected double a(aqm ☃) {
/* 356 */       float f = this.b.cy() - 0.1F;
/* 357 */       return (f * 2.0F * f * 2.0F + ☃.cy());
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends ayi {
/*     */     public b(aqn ☃, brx brx1) {
/* 363 */       super(☃, brx1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected cxf a(int ☃) {
/* 368 */       this.o = new bdv.c();
/* 369 */       return new cxf(this.o, ☃);
/*     */     } }
/*     */   
/*     */   static class c extends cxj {
/*     */     private c() {}
/*     */     
/*     */     protected cwz a(brc ☃, boolean bool1, boolean bool2, fx fx1, cwz cwz1) {
/* 376 */       if (cwz1 == cwz.v) {
/* 377 */         return cwz.b;
/*     */       }
/* 379 */       return super.a(☃, bool1, bool2, fx1, cwz1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */