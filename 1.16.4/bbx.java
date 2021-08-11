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
/*     */ public class bbx
/*     */   extends bbt
/*     */ {
/*  19 */   private static final azg b = (new azg()).a(64.0D);
/*     */   
/*     */   private cxd c;
/*     */   private dcn d;
/*     */   private boolean e;
/*     */   
/*     */   public bbx(bbr ☃) {
/*  26 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bch<bbx> i() {
/*  31 */     return bch.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  36 */     double ☃ = (this.d == null) ? 0.0D : this.d.c(this.a.cD(), this.a.cE(), this.a.cH());
/*  37 */     if (☃ < 100.0D || ☃ > 22500.0D || this.a.u || this.a.v) {
/*  38 */       j();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  44 */     this.c = null;
/*  45 */     this.d = null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public dcn g() {
/*  51 */     return this.d;
/*     */   }
/*     */   
/*     */   private void j() {
/*  55 */     if (this.c != null && this.c.c()) {
/*  56 */       fx ☃ = this.a.l.a(chn.a.f, new fx(cjk.a));
/*     */ 
/*     */ 
/*     */       
/*  60 */       int i = (this.a.eL() == null) ? 0 : this.a.eL().c();
/*     */       
/*  62 */       if (this.a.cY().nextInt(i + 3) == 0) {
/*  63 */         this.a.eK().a(bch.c);
/*     */         return;
/*     */       } 
/*  66 */       double d = 64.0D;
/*  67 */       bfw bfw = this.a.l.a(b, ☃.u(), ☃.v(), ☃.w());
/*  68 */       if (bfw != null) {
/*  69 */         d = ☃.a(bfw.cA(), true) / 512.0D;
/*     */       }
/*  71 */       if (bfw != null && !bfw.bC.a && (this.a.cY().nextInt(afm.a((int)d) + 2) == 0 || this.a.cY().nextInt(i + 2) == 0)) {
/*     */         
/*  73 */         a(bfw);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/*  79 */     if (this.c == null || this.c.c()) {
/*  80 */       int ☃ = this.a.eI();
/*  81 */       int i = ☃;
/*     */       
/*  83 */       if (this.a.cY().nextInt(8) == 0) {
/*  84 */         this.e = !this.e;
/*  85 */         i += 6;
/*     */       } 
/*     */       
/*  88 */       if (this.e) {
/*  89 */         i++;
/*     */       } else {
/*  91 */         i--;
/*     */       } 
/*     */       
/*  94 */       if (this.a.eL() == null || this.a.eL().c() < 0) {
/*     */         
/*  96 */         i -= 12;
/*  97 */         i &= 0x7;
/*  98 */         i += 12;
/*     */       } else {
/*     */         
/* 101 */         i %= 12;
/* 102 */         if (i < 0) {
/* 103 */           i += 12;
/*     */         }
/*     */       } 
/*     */       
/* 107 */       this.c = this.a.a(☃, i, (cxb)null);
/* 108 */       if (this.c != null) {
/* 109 */         this.c.a();
/*     */       }
/*     */     } 
/*     */     
/* 113 */     k();
/*     */   }
/*     */   
/*     */   private void a(bfw ☃) {
/* 117 */     this.a.eK().a(bch.b);
/* 118 */     ((bcf)this.a.eK().<bcf>b(bch.b)).a(☃);
/*     */   }
/*     */   
/*     */   private void k() {
/* 122 */     if (this.c != null && !this.c.c()) {
/* 123 */       double d3; gr ☃ = this.c.g();
/*     */       
/* 125 */       this.c.a();
/* 126 */       double d1 = ☃.u();
/* 127 */       double d2 = ☃.w();
/*     */ 
/*     */       
/*     */       do {
/* 131 */         d3 = (☃.v() + this.a.cY().nextFloat() * 20.0F);
/* 132 */       } while (d3 < ☃.v());
/*     */       
/* 134 */       this.d = new dcn(d1, d3, d2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bbq ☃, fx fx1, apk apk1, @Nullable bfw bfw1) {
/* 140 */     if (bfw1 != null && !bfw1.bC.a)
/* 141 */       a(bfw1); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */