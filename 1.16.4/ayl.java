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
/*     */ public class ayl
/*     */   extends ayj
/*     */ {
/*     */   private boolean p;
/*     */   
/*     */   public ayl(aqn ☃, brx brx1) {
/*  21 */     super(☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected cxf a(int ☃) {
/*  26 */     this.p = this.a instanceof baf;
/*  27 */     this.o = new cxg(this.p);
/*  28 */     return new cxf(this.o, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a() {
/*  33 */     return (this.p || p());
/*     */   }
/*     */ 
/*     */   
/*     */   protected dcn b() {
/*  38 */     return new dcn(this.a.cD(), this.a.e(0.5D), this.a.cH());
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  43 */     this.e++;
/*     */     
/*  45 */     if (this.m) {
/*  46 */       j();
/*     */     }
/*     */     
/*  49 */     if (m()) {
/*     */       return;
/*     */     }
/*     */     
/*  53 */     if (a()) {
/*  54 */       l();
/*  55 */     } else if (this.c != null && !this.c.c()) {
/*  56 */       dcn dcn = this.c.a(this.a);
/*  57 */       if (afm.c(this.a.cD()) == afm.c(dcn.b) && afm.c(this.a.cE()) == afm.c(dcn.c) && afm.c(this.a.cH()) == afm.c(dcn.d)) {
/*  58 */         this.c.a();
/*     */       }
/*     */     } 
/*     */     
/*  62 */     rz.a(this.b, this.a, this.c, this.l);
/*     */     
/*  64 */     if (m()) {
/*     */       return;
/*     */     }
/*     */     
/*  68 */     dcn ☃ = this.c.a(this.a);
/*  69 */     this.a.u().a(☃.b, ☃.c, ☃.d, this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void l() {
/*  74 */     if (this.c == null) {
/*     */       return;
/*     */     }
/*     */     
/*  78 */     dcn ☃ = b();
/*     */ 
/*     */     
/*  81 */     float f1 = this.a.cy();
/*  82 */     float f2 = (f1 > 0.75F) ? (f1 / 2.0F) : (0.75F - f1 / 2.0F);
/*  83 */     dcn dcn1 = this.a.cC();
/*  84 */     if (Math.abs(dcn1.b) > 0.2D || Math.abs(dcn1.d) > 0.2D) {
/*  85 */       f2 = (float)(f2 * dcn1.f() * 6.0D);
/*     */     }
/*     */     
/*  88 */     int i = 6;
/*  89 */     dcn dcn2 = dcn.c(this.c.g());
/*  90 */     if (Math.abs(this.a.cD() - dcn2.b) < f2 && Math.abs(this.a.cH() - dcn2.d) < f2 && Math.abs(this.a.cE() - dcn2.c) < (f2 * 2.0F)) {
/*  91 */       this.c.a();
/*     */     }
/*     */     
/*  94 */     for (int j = Math.min(this.c.f() + 6, this.c.e() - 1); j > this.c.f(); j--) {
/*  95 */       dcn2 = this.c.a(this.a, j);
/*  96 */       if (dcn2.g(☃) <= 36.0D)
/*     */       {
/*     */         
/*  99 */         if (a(☃, dcn2, 0, 0, 0)) {
/* 100 */           this.c.c(j);
/*     */           break;
/*     */         } 
/*     */       }
/*     */     } 
/* 105 */     a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(dcn ☃) {
/* 111 */     if (this.e - this.f > 100) {
/* 112 */       if (☃.g(this.g) < 2.25D) {
/* 113 */         o();
/*     */       }
/* 115 */       this.f = this.e;
/* 116 */       this.g = ☃;
/*     */     } 
/*     */     
/* 119 */     if (this.c != null && !this.c.c()) {
/* 120 */       gr gr = this.c.g();
/*     */       
/* 122 */       if (gr.equals(this.h)) {
/* 123 */         this.i += x.b() - this.j;
/*     */       } else {
/* 125 */         this.h = gr;
/* 126 */         double d = ☃.f(dcn.a(this.h));
/* 127 */         this.k = (this.a.dN() > 0.0F) ? (d / this.a.dN() * 100.0D) : 0.0D;
/*     */       } 
/*     */       
/* 130 */       if (this.k > 0.0D && this.i > this.k * 2.0D) {
/* 131 */         this.h = gr.d;
/* 132 */         this.i = 0L;
/* 133 */         this.k = 0.0D;
/* 134 */         o();
/*     */       } 
/* 136 */       this.j = x.b();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(dcn ☃, dcn dcn1, int i, int j, int k) {
/* 142 */     dcn dcn2 = new dcn(dcn1.b, dcn1.c + this.a.cz() * 0.5D, dcn1.d); return 
/* 143 */       (this.b.a(new brf(☃, dcn2, brf.a.a, brf.b.a, this.a)).c() == dcl.a.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(fx ☃) {
/* 148 */     return !this.b.d_(☃).i(this.b, ☃);
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {}
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */