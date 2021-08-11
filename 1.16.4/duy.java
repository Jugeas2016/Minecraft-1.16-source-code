/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class duy<T extends bal>
/*     */   extends dvi<T>
/*     */ {
/*     */   private float j;
/*     */   private float k;
/*     */   private float l;
/*     */   
/*     */   public duy(int ☃, float f) {
/*  13 */     super(☃, f, true, 23.0F, 4.8F, 2.7F, 3.0F, 49);
/*     */     
/*  15 */     this.r = 64;
/*  16 */     this.s = 64;
/*     */     
/*  18 */     this.a = new dwn(this, 0, 6);
/*  19 */     this.a.a(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F);
/*  20 */     this.a.a(0.0F, 11.5F, -17.0F);
/*     */     
/*  22 */     this.a.a(45, 16).a(-3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F);
/*     */ 
/*     */     
/*  25 */     this.a.a(52, 25).a(-8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
/*  26 */     this.a.a(52, 25).a(3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
/*     */     
/*  28 */     this.b = new dwn(this, 0, 25);
/*  29 */     this.b.a(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F);
/*  30 */     this.b.a(0.0F, 10.0F, 0.0F);
/*     */ 
/*     */     
/*  33 */     int i = 9;
/*  34 */     int j = 6;
/*  35 */     this.f = new dwn(this, 40, 0);
/*  36 */     this.f.a(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
/*  37 */     this.f.a(-5.5F, 15.0F, 9.0F);
/*     */     
/*  39 */     this.g = new dwn(this, 40, 0);
/*  40 */     this.g.a(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
/*  41 */     this.g.a(5.5F, 15.0F, 9.0F);
/*     */     
/*  43 */     this.h = new dwn(this, 40, 0);
/*  44 */     this.h.a(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
/*  45 */     this.h.a(-5.5F, 15.0F, -9.0F);
/*     */     
/*  47 */     this.i = new dwn(this, 40, 0);
/*  48 */     this.i.a(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
/*  49 */     this.i.a(5.5F, 15.0F, -9.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3) {
/*  54 */     super.a(☃, f1, f2, f3);
/*     */     
/*  56 */     this.j = ☃.y(f3);
/*  57 */     this.k = ☃.z(f3);
/*  58 */     this.l = ☃.w_() ? 0.0F : ☃.A(f3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  63 */     super.a(☃, f1, f2, f3, f4, f5);
/*     */     
/*  65 */     boolean bool1 = (☃.eK() > 0);
/*  66 */     boolean bool2 = ☃.eL();
/*  67 */     int i = ☃.eU();
/*  68 */     boolean bool3 = ☃.eO();
/*  69 */     boolean bool4 = ☃.ff();
/*     */     
/*  71 */     if (bool1) {
/*  72 */       this.a.e = 0.35F * afm.a(0.6F * f3);
/*  73 */       this.a.f = 0.35F * afm.a(0.6F * f3);
/*     */       
/*  75 */       this.h.d = -0.75F * afm.a(0.3F * f3);
/*  76 */       this.i.d = 0.75F * afm.a(0.3F * f3);
/*     */     } else {
/*  78 */       this.a.f = 0.0F;
/*     */     } 
/*     */     
/*  81 */     if (bool2) {
/*  82 */       if (i < 15) {
/*  83 */         this.a.d = -0.7853982F * i / 14.0F;
/*  84 */       } else if (i < 20) {
/*  85 */         float f = ((i - 15) / 5);
/*  86 */         this.a.d = -0.7853982F + 0.7853982F * f;
/*     */       } 
/*     */     }
/*     */     
/*  90 */     if (this.j > 0.0F) {
/*  91 */       this.b.d = duw.a(this.b.d, 1.7407963F, this.j);
/*  92 */       this.a.d = duw.a(this.a.d, 1.5707964F, this.j);
/*     */ 
/*     */       
/*  95 */       this.h.f = -0.27079642F;
/*  96 */       this.i.f = 0.27079642F;
/*     */ 
/*     */       
/*  99 */       this.f.f = 0.5707964F;
/* 100 */       this.g.f = -0.5707964F;
/*     */       
/* 102 */       if (bool3) {
/* 103 */         this.a.d = 1.5707964F + 0.2F * afm.a(f3 * 0.6F);
/*     */         
/* 105 */         this.h.d = -0.4F - 0.2F * afm.a(f3 * 0.6F);
/* 106 */         this.i.d = -0.4F - 0.2F * afm.a(f3 * 0.6F);
/*     */       } 
/*     */       
/* 109 */       if (bool4) {
/* 110 */         this.a.d = 2.1707964F;
/* 111 */         this.h.d = -0.9F;
/* 112 */         this.i.d = -0.9F;
/*     */       } 
/*     */     } else {
/* 115 */       this.f.f = 0.0F;
/* 116 */       this.g.f = 0.0F;
/* 117 */       this.h.f = 0.0F;
/* 118 */       this.i.f = 0.0F;
/*     */     } 
/*     */     
/* 121 */     if (this.k > 0.0F) {
/* 122 */       this.f.d = -0.6F * afm.a(f3 * 0.15F);
/* 123 */       this.g.d = 0.6F * afm.a(f3 * 0.15F);
/* 124 */       this.h.d = 0.3F * afm.a(f3 * 0.25F);
/* 125 */       this.i.d = -0.3F * afm.a(f3 * 0.25F);
/*     */       
/* 127 */       this.a.d = duw.a(this.a.d, 1.5707964F, this.k);
/*     */     } 
/*     */     
/* 130 */     if (this.l > 0.0F) {
/* 131 */       this.a.d = duw.a(this.a.d, 2.0561945F, this.l);
/*     */       
/* 133 */       this.f.d = -0.5F * afm.a(f3 * 0.5F);
/* 134 */       this.g.d = 0.5F * afm.a(f3 * 0.5F);
/* 135 */       this.h.d = 0.5F * afm.a(f3 * 0.5F);
/* 136 */       this.i.d = -0.5F * afm.a(f3 * 0.5F);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\duy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */