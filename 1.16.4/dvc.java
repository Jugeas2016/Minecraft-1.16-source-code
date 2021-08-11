/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dvc<T extends aqn>
/*     */   extends dvd<T>
/*     */ {
/*     */   public final dwn a;
/*     */   public final dwn b;
/*     */   private final dwn y;
/*     */   private final dwn z;
/*     */   private final dwn A;
/*     */   private final dwn B;
/*     */   
/*     */   public dvc(float ☃, int i, int j) {
/*  21 */     super(☃, false);
/*     */     
/*  23 */     this.r = i;
/*  24 */     this.s = j;
/*     */     
/*  26 */     this.h = new dwn(this, 16, 16);
/*  27 */     this.h.a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, ☃);
/*     */     
/*  29 */     this.f = new dwn(this);
/*  30 */     this.f.a(0, 0).a(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, ☃);
/*  31 */     this.f.a(31, 1).a(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, ☃);
/*  32 */     this.f.a(2, 4).a(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, ☃);
/*  33 */     this.f.a(2, 0).a(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, ☃);
/*     */     
/*  35 */     this.a = new dwn(this);
/*  36 */     this.a.a(4.5F, -6.0F, 0.0F);
/*  37 */     this.a.a(51, 6).a(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, ☃);
/*  38 */     this.f.b(this.a);
/*     */     
/*  40 */     this.b = new dwn(this);
/*  41 */     this.b.a(-4.5F, -6.0F, 0.0F);
/*  42 */     this.b.a(39, 6).a(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, ☃);
/*  43 */     this.f.b(this.b);
/*     */     
/*  45 */     this.g = new dwn(this);
/*     */     
/*  47 */     this.y = this.h.a();
/*  48 */     this.z = this.f.a();
/*  49 */     this.A = this.j.a();
/*  50 */     this.B = this.j.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  55 */     this.h.a(this.y);
/*  56 */     this.f.a(this.z);
/*  57 */     this.j.a(this.A);
/*  58 */     this.i.a(this.B);
/*     */     
/*  60 */     super.a(☃, f1, f2, f3, f4, f5);
/*     */     
/*  62 */     float f6 = 0.5235988F;
/*  63 */     float f7 = f3 * 0.1F + f1 * 0.5F;
/*  64 */     float f8 = 0.08F + f2 * 0.4F;
/*  65 */     this.a.f = -0.5235988F - afm.b(f7 * 1.2F) * f8;
/*  66 */     this.b.f = 0.5235988F + afm.b(f7) * f8;
/*     */     
/*  68 */     if (☃ instanceof ber) {
/*  69 */       ber ber = (ber)☃;
/*  70 */       beu beu = ber.eN();
/*     */       
/*  72 */       if (beu == beu.e) {
/*  73 */         float f = f3 / 60.0F;
/*  74 */         this.b.f = 0.5235988F + 0.017453292F * afm.a(f * 30.0F) * 10.0F;
/*  75 */         this.a.f = -0.5235988F - 0.017453292F * afm.b(f * 30.0F) * 10.0F;
/*  76 */         this.f.a = afm.a(f * 10.0F);
/*  77 */         this.f.b = afm.a(f * 40.0F) + 0.4F;
/*  78 */         this.i.f = 0.017453292F * (70.0F + afm.b(f * 40.0F) * 10.0F);
/*  79 */         this.i.f *= -1.0F;
/*     */         
/*  81 */         this.i.b = afm.a(f * 40.0F) * 0.5F + 1.5F;
/*  82 */         this.j.b = afm.a(f * 40.0F) * 0.5F + 1.5F;
/*     */         
/*  84 */         this.h.b = afm.a(f * 40.0F) * 0.35F;
/*  85 */       } else if (beu == beu.a && this.c == 0.0F) {
/*     */         
/*  87 */         a(☃);
/*  88 */       } else if (beu == beu.b) {
/*  89 */         dtg.a(this.i, this.j, this.f, !☃.eE());
/*  90 */       } else if (beu == beu.c) {
/*  91 */         dtg.a(this.i, this.j, (aqm)☃, !☃.eE());
/*  92 */       } else if (beu == beu.d) {
/*  93 */         this.f.d = 0.5F;
/*  94 */         this.f.e = 0.0F;
/*  95 */         if (☃.eE()) {
/*  96 */           this.i.e = -0.5F;
/*  97 */           this.i.d = -0.9F;
/*     */         } else {
/*  99 */           this.j.e = 0.5F;
/* 100 */           this.j.d = -0.9F;
/*     */         } 
/*     */       } 
/* 103 */     } else if (☃.X() == aqe.bb) {
/* 104 */       dtg.a(this.j, this.i, ☃.eF(), this.c, f3);
/*     */     } 
/*     */     
/* 107 */     this.v.a(this.l);
/* 108 */     this.w.a(this.k);
/* 109 */     this.t.a(this.j);
/* 110 */     this.u.a(this.i);
/* 111 */     this.x.a(this.h);
/* 112 */     this.g.a(this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(T ☃, float f) {
/* 117 */     if (this.c > 0.0F && ☃ instanceof bes && ((bes)☃).eN() == beu.a) {
/* 118 */       dtg.a(this.i, this.j, ☃, this.c, f);
/*     */       return;
/*     */     } 
/* 121 */     super.a(☃, f);
/*     */   }
/*     */   
/*     */   private void a(T ☃) {
/* 125 */     if (☃.eE()) {
/* 126 */       this.j.d = -1.8F;
/*     */     } else {
/* 128 */       this.i.d = -1.8F;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */