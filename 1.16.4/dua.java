/*     */ 
/*     */ 
/*     */ 
/*     */ public class dua<T extends aqm>
/*     */   extends dum<T>
/*     */ {
/*     */   public boolean a;
/*     */   public boolean b;
/*     */   
/*     */   public dua(float ☃) {
/*  11 */     super(0.0F, -14.0F, 64, 32);
/*  12 */     float f = -14.0F;
/*     */     
/*  14 */     this.g = new dwn(this, 0, 16);
/*  15 */     this.g.a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, ☃ - 0.5F);
/*  16 */     this.g.a(0.0F, -14.0F, 0.0F);
/*     */     
/*  18 */     this.h = new dwn(this, 32, 16);
/*  19 */     this.h.a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, ☃);
/*  20 */     this.h.a(0.0F, -14.0F, 0.0F);
/*     */     
/*  22 */     this.i = new dwn(this, 56, 0);
/*  23 */     this.i.a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, ☃);
/*     */     
/*  25 */     this.i.a(-3.0F, -12.0F, 0.0F);
/*     */     
/*  27 */     this.j = new dwn(this, 56, 0);
/*  28 */     this.j.g = true;
/*  29 */     this.j.a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, ☃);
/*  30 */     this.j.a(5.0F, -12.0F, 0.0F);
/*     */     
/*  32 */     this.k = new dwn(this, 56, 0);
/*  33 */     this.k.a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, ☃);
/*  34 */     this.k.a(-2.0F, -2.0F, 0.0F);
/*     */     
/*  36 */     this.l = new dwn(this, 56, 0);
/*  37 */     this.l.g = true;
/*  38 */     this.l.a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, ☃);
/*  39 */     this.l.a(2.0F, -2.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  44 */     super.a(☃, f1, f2, f3, f4, f5);
/*     */     
/*  46 */     this.f.h = true;
/*     */     
/*  48 */     float f6 = -14.0F;
/*  49 */     this.h.d = 0.0F;
/*  50 */     this.h.b = -14.0F;
/*  51 */     this.h.c = -0.0F;
/*     */     
/*  53 */     this.k.d -= 0.0F;
/*  54 */     this.l.d -= 0.0F;
/*     */     
/*  56 */     this.i.d = (float)(this.i.d * 0.5D);
/*  57 */     this.j.d = (float)(this.j.d * 0.5D);
/*  58 */     this.k.d = (float)(this.k.d * 0.5D);
/*  59 */     this.l.d = (float)(this.l.d * 0.5D);
/*     */     
/*  61 */     float f7 = 0.4F;
/*  62 */     if (this.i.d > 0.4F) {
/*  63 */       this.i.d = 0.4F;
/*     */     }
/*  65 */     if (this.j.d > 0.4F) {
/*  66 */       this.j.d = 0.4F;
/*     */     }
/*  68 */     if (this.i.d < -0.4F) {
/*  69 */       this.i.d = -0.4F;
/*     */     }
/*  71 */     if (this.j.d < -0.4F) {
/*  72 */       this.j.d = -0.4F;
/*     */     }
/*  74 */     if (this.k.d > 0.4F) {
/*  75 */       this.k.d = 0.4F;
/*     */     }
/*  77 */     if (this.l.d > 0.4F) {
/*  78 */       this.l.d = 0.4F;
/*     */     }
/*  80 */     if (this.k.d < -0.4F) {
/*  81 */       this.k.d = -0.4F;
/*     */     }
/*  83 */     if (this.l.d < -0.4F) {
/*  84 */       this.l.d = -0.4F;
/*     */     }
/*     */     
/*  87 */     if (this.a) {
/*  88 */       this.i.d = -0.5F;
/*  89 */       this.j.d = -0.5F;
/*  90 */       this.i.f = 0.05F;
/*  91 */       this.j.f = -0.05F;
/*     */     } 
/*     */     
/*  94 */     this.i.c = 0.0F;
/*  95 */     this.j.c = 0.0F;
/*  96 */     this.k.c = 0.0F;
/*  97 */     this.l.c = 0.0F;
/*     */     
/*  99 */     this.k.b = -5.0F;
/* 100 */     this.l.b = -5.0F;
/*     */     
/* 102 */     this.f.c = -0.0F;
/* 103 */     this.f.b = -13.0F;
/*     */     
/* 105 */     this.g.a = this.f.a;
/* 106 */     this.g.b = this.f.b;
/* 107 */     this.g.c = this.f.c;
/* 108 */     this.g.d = this.f.d;
/* 109 */     this.g.e = this.f.e;
/* 110 */     this.g.f = this.f.f;
/*     */     
/* 112 */     if (this.b) {
/* 113 */       float f = 1.0F;
/* 114 */       this.f.b -= 5.0F;
/*     */     } 
/*     */     
/* 117 */     float f8 = -14.0F;
/* 118 */     this.i.a(-5.0F, -12.0F, 0.0F);
/* 119 */     this.j.a(5.0F, -12.0F, 0.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dua.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */