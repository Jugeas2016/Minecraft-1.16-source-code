/*     */ import java.util.UUID;
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
/*     */ public abstract class bgm
/*     */   extends aqa
/*     */ {
/*     */   private UUID b;
/*     */   private int c;
/*     */   private boolean d;
/*     */   
/*     */   bgm(aqe<? extends bgm> ☃, brx brx1) {
/*  24 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   public void b(@Nullable aqa ☃) {
/*  28 */     if (☃ != null) {
/*  29 */       this.b = ☃.bS();
/*  30 */       this.c = ☃.Y();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqa v() {
/*  36 */     if (this.b != null && this.l instanceof aag)
/*  37 */       return ((aag)this.l).a(this.b); 
/*  38 */     if (this.c != 0) {
/*  39 */       return this.l.a(this.c);
/*     */     }
/*  41 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/*  46 */     if (this.b != null) {
/*  47 */       ☃.a("Owner", this.b);
/*     */     }
/*  49 */     if (this.d) {
/*  50 */       ☃.a("LeftOwner", true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  56 */     if (☃.b("Owner")) {
/*  57 */       this.b = ☃.a("Owner");
/*     */     }
/*  59 */     this.d = ☃.q("LeftOwner");
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  64 */     if (!this.d) {
/*  65 */       this.d = h();
/*     */     }
/*     */     
/*  68 */     super.j();
/*     */   }
/*     */   
/*     */   private boolean h() {
/*  72 */     aqa ☃ = v();
/*  73 */     if (☃ != null) {
/*  74 */       for (aqa aqa1 : this.l.a(this, cc().b(cC()).g(1.0D), ☃ -> (!☃.a_() && ☃.aT()))) {
/*  75 */         if (aqa1.cr() == ☃.cr()) {
/*  76 */           return false;
/*     */         }
/*     */       } 
/*     */     }
/*  80 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(double ☃, double d1, double d2, float f1, float f2) {
/*  88 */     dcn dcn = (new dcn(☃, d1, d2)).d().b(this.J.nextGaussian() * 0.007499999832361937D * f2, this.J.nextGaussian() * 0.007499999832361937D * f2, this.J.nextGaussian() * 0.007499999832361937D * f2).a(f1);
/*     */     
/*  90 */     f(dcn);
/*     */     
/*  92 */     float f = afm.a(c(dcn));
/*     */     
/*  94 */     this.p = (float)(afm.d(dcn.b, dcn.d) * 57.2957763671875D);
/*  95 */     this.q = (float)(afm.d(dcn.c, f) * 57.2957763671875D);
/*  96 */     this.r = this.p;
/*  97 */     this.s = this.q;
/*     */   }
/*     */   
/*     */   public void a(aqa ☃, float f1, float f2, float f3, float f4, float f5) {
/* 101 */     float f6 = -afm.a(f2 * 0.017453292F) * afm.b(f1 * 0.017453292F);
/* 102 */     float f7 = -afm.a((f1 + f3) * 0.017453292F);
/* 103 */     float f8 = afm.b(f2 * 0.017453292F) * afm.b(f1 * 0.017453292F);
/* 104 */     c(f6, f7, f8, f4, f5);
/*     */ 
/*     */     
/* 107 */     dcn dcn = ☃.cC();
/* 108 */     f(cC().b(dcn.b, 
/*     */           
/* 110 */           ☃.ao() ? 0.0D : dcn.c, dcn.d));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(dcl ☃) {
/* 116 */     dcl.a a = ☃.c();
/* 117 */     if (a == dcl.a.c) {
/* 118 */       a((dck)☃);
/* 119 */     } else if (a == dcl.a.b) {
/* 120 */       a((dcj)☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dck ☃) {}
/*     */   
/*     */   protected void a(dcj ☃) {
/* 128 */     dcj dcj1 = ☃;
/* 129 */     ceh ceh = this.l.d_(dcj1.a());
/* 130 */     ceh.a(this.l, ceh, dcj1, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(double ☃, double d1, double d2) {
/* 135 */     n(☃, d1, d2);
/* 136 */     if (this.s == 0.0F && this.r == 0.0F) {
/* 137 */       float f = afm.a(☃ * ☃ + d2 * d2);
/* 138 */       this.q = (float)(afm.d(d1, f) * 57.2957763671875D);
/* 139 */       this.p = (float)(afm.d(☃, d2) * 57.2957763671875D);
/* 140 */       this.s = this.q;
/* 141 */       this.r = this.p;
/* 142 */       b(cD(), cE(), cH(), this.p, this.q);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(aqa ☃) {
/* 147 */     if (☃.a_() || !☃.aX() || !☃.aT()) {
/* 148 */       return false;
/*     */     }
/* 150 */     aqa aqa1 = v();
/* 151 */     return (aqa1 == null || this.d || !aqa1.x(☃));
/*     */   }
/*     */   
/*     */   protected void x() {
/* 155 */     dcn ☃ = cC();
/* 156 */     float f = afm.a(c(☃));
/*     */     
/* 158 */     this.q = e(this.s, (float)(afm.d(☃.c, f) * 57.2957763671875D));
/* 159 */     this.p = e(this.r, (float)(afm.d(☃.b, ☃.d) * 57.2957763671875D));
/*     */   }
/*     */   
/*     */   protected static float e(float ☃, float f1) {
/* 163 */     while (f1 - ☃ < -180.0F) {
/* 164 */       ☃ -= 360.0F;
/*     */     }
/* 166 */     while (f1 - ☃ >= 180.0F) {
/* 167 */       ☃ += 360.0F;
/*     */     }
/* 169 */     return afm.g(0.2F, ☃, f1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */