/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class bcf
/*     */   extends bbt
/*     */ {
/*  18 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private int c;
/*     */   
/*     */   private cxd d;
/*     */   private dcn e;
/*     */   private aqm f;
/*     */   private boolean g;
/*     */   
/*     */   public bcf(bbr ☃) {
/*  28 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  33 */     if (this.f == null) {
/*  34 */       b.warn("Skipping player strafe phase because no player was found");
/*  35 */       this.a.eK().a(bch.a);
/*     */       
/*     */       return;
/*     */     } 
/*  39 */     if (this.d != null && this.d.c()) {
/*  40 */       double d2 = this.f.cD();
/*  41 */       double d3 = this.f.cH();
/*     */       
/*  43 */       double d4 = d2 - this.a.cD();
/*  44 */       double d5 = d3 - this.a.cH();
/*  45 */       double d6 = afm.a(d4 * d4 + d5 * d5);
/*  46 */       double d7 = Math.min(0.4000000059604645D + d6 / 80.0D - 1.0D, 10.0D);
/*     */       
/*  48 */       this.e = new dcn(d2, this.f.cE() + d7, d3);
/*     */     } 
/*     */     
/*  51 */     double ☃ = (this.e == null) ? 0.0D : this.e.c(this.a.cD(), this.a.cE(), this.a.cH());
/*  52 */     if (☃ < 100.0D || ☃ > 22500.0D) {
/*  53 */       j();
/*     */     }
/*     */     
/*  56 */     double d1 = 64.0D;
/*  57 */     if (this.f.h(this.a) < 4096.0D) {
/*  58 */       if (this.a.D(this.f)) {
/*  59 */         this.c++;
/*  60 */         dcn dcn1 = (new dcn(this.f.cD() - this.a.cD(), 0.0D, this.f.cH() - this.a.cH())).d();
/*  61 */         dcn dcn2 = (new dcn(afm.a(this.a.p * 0.017453292F), 0.0D, -afm.b(this.a.p * 0.017453292F))).d();
/*  62 */         float f1 = (float)dcn2.b(dcn1);
/*  63 */         float f2 = (float)(Math.acos(f1) * 57.2957763671875D);
/*  64 */         f2 += 0.5F;
/*     */         
/*  66 */         if (this.c >= 5 && f2 >= 0.0F && f2 < 10.0F) {
/*  67 */           double d2 = 1.0D;
/*  68 */           dcn dcn3 = this.a.f(1.0F);
/*  69 */           double d3 = this.a.bo.cD() - dcn3.b * 1.0D;
/*  70 */           double d4 = this.a.bo.e(0.5D) + 0.5D;
/*  71 */           double d5 = this.a.bo.cH() - dcn3.d * 1.0D;
/*     */           
/*  73 */           double d6 = this.f.cD() - d3;
/*  74 */           double d7 = this.f.e(0.5D) - d4;
/*  75 */           double d8 = this.f.cH() - d5;
/*     */           
/*  77 */           if (!this.a.aA()) {
/*  78 */             this.a.l.a((bfw)null, 1017, this.a.cB(), 0);
/*     */           }
/*  80 */           bgd bgd = new bgd(this.a.l, this.a, d6, d7, d8);
/*  81 */           bgd.b(d3, d4, d5, 0.0F, 0.0F);
/*  82 */           this.a.l.c(bgd);
/*  83 */           this.c = 0;
/*     */           
/*  85 */           if (this.d != null) {
/*  86 */             while (!this.d.c()) {
/*  87 */               this.d.a();
/*     */             }
/*     */           }
/*     */           
/*  91 */           this.a.eK().a(bch.a);
/*     */         }
/*     */       
/*  94 */       } else if (this.c > 0) {
/*  95 */         this.c--;
/*     */       }
/*     */     
/*     */     }
/*  99 */     else if (this.c > 0) {
/* 100 */       this.c--;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void j() {
/* 106 */     if (this.d == null || this.d.c()) {
/* 107 */       int ☃ = this.a.eI();
/* 108 */       int i = ☃;
/*     */       
/* 110 */       if (this.a.cY().nextInt(8) == 0) {
/* 111 */         this.g = !this.g;
/* 112 */         i += 6;
/*     */       } 
/*     */       
/* 115 */       if (this.g) {
/* 116 */         i++;
/*     */       } else {
/* 118 */         i--;
/*     */       } 
/*     */       
/* 121 */       if (this.a.eL() == null || this.a.eL().c() <= 0) {
/*     */         
/* 123 */         i -= 12;
/* 124 */         i &= 0x7;
/* 125 */         i += 12;
/*     */       } else {
/*     */         
/* 128 */         i %= 12;
/* 129 */         if (i < 0) {
/* 130 */           i += 12;
/*     */         }
/*     */       } 
/*     */       
/* 134 */       this.d = this.a.a(☃, i, (cxb)null);
/*     */       
/* 136 */       if (this.d != null) {
/* 137 */         this.d.a();
/*     */       }
/*     */     } 
/*     */     
/* 141 */     k();
/*     */   }
/*     */   
/*     */   private void k() {
/* 145 */     if (this.d != null && !this.d.c()) {
/* 146 */       double d2; gr ☃ = this.d.g();
/*     */       
/* 148 */       this.d.a();
/* 149 */       double d1 = ☃.u();
/*     */       
/* 151 */       double d3 = ☃.w();
/*     */       
/*     */       do {
/* 154 */         d2 = (☃.v() + this.a.cY().nextFloat() * 20.0F);
/* 155 */       } while (d2 < ☃.v());
/*     */       
/* 157 */       this.e = new dcn(d1, d2, d3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 163 */     this.c = 0;
/* 164 */     this.e = null;
/* 165 */     this.d = null;
/* 166 */     this.f = null;
/*     */   }
/*     */   
/*     */   public void a(aqm ☃) {
/* 170 */     this.f = ☃;
/*     */     
/* 172 */     int i = this.a.eI();
/* 173 */     int j = this.a.p(this.f.cD(), this.f.cE(), this.f.cH());
/*     */     
/* 175 */     int k = afm.c(this.f.cD());
/* 176 */     int m = afm.c(this.f.cH());
/*     */     
/* 178 */     double d1 = k - this.a.cD();
/* 179 */     double d2 = m - this.a.cH();
/* 180 */     double d3 = afm.a(d1 * d1 + d2 * d2);
/* 181 */     double d4 = Math.min(0.4000000059604645D + d3 / 80.0D - 1.0D, 10.0D);
/* 182 */     int n = afm.c(this.f.cE() + d4);
/*     */     
/* 184 */     cxb cxb = new cxb(k, n, m);
/*     */     
/* 186 */     this.d = this.a.a(i, j, cxb);
/*     */     
/* 188 */     if (this.d != null) {
/* 189 */       this.d.a();
/*     */       
/* 191 */       k();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public dcn g() {
/* 198 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public bch<bcf> i() {
/* 203 */     return bch.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */