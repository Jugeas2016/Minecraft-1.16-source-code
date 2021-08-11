/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dvk
/*     */   extends dur<bdv>
/*     */ {
/*     */   private final dwn a;
/*     */   private final dwn b;
/*     */   private final dwn f;
/*     */   private final dwn g;
/*     */   private final dwn h;
/*     */   private final dwn i;
/*     */   private final dwn j;
/*     */   private final dwn k;
/*     */   
/*     */   public dvk() {
/*  23 */     int ☃ = 16;
/*  24 */     float f = 0.0F;
/*     */     
/*  26 */     this.k = new dwn(this);
/*  27 */     this.k.a(0.0F, -7.0F, -1.5F);
/*  28 */     this.k.a(68, 73).a(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F, 0.0F);
/*     */     
/*  30 */     this.a = new dwn(this);
/*  31 */     this.a.a(0.0F, 16.0F, -17.0F);
/*  32 */     this.a.a(0, 0).a(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F, 0.0F);
/*  33 */     this.a.a(0, 0).a(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F, 0.0F);
/*  34 */     dwn dwn1 = new dwn(this);
/*  35 */     dwn1.a(-10.0F, -14.0F, -8.0F);
/*  36 */     dwn1.a(74, 55).a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
/*  37 */     dwn1.d = 1.0995574F;
/*  38 */     this.a.b(dwn1);
/*  39 */     dwn dwn2 = new dwn(this);
/*  40 */     dwn2.g = true;
/*  41 */     dwn2.a(8.0F, -14.0F, -8.0F);
/*  42 */     dwn2.a(74, 55).a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
/*  43 */     dwn2.d = 1.0995574F;
/*  44 */     this.a.b(dwn2);
/*  45 */     this.b = new dwn(this);
/*  46 */     this.b.a(0.0F, -2.0F, 2.0F);
/*  47 */     this.b.a(0, 36).a(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F, 0.0F);
/*  48 */     this.a.b(this.b);
/*  49 */     this.k.b(this.a);
/*     */     
/*  51 */     this.f = new dwn(this);
/*  52 */     this.f.a(0, 55).a(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F, 0.0F);
/*  53 */     this.f.a(0, 91).a(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F, 0.0F);
/*  54 */     this.f.a(0.0F, 1.0F, 2.0F);
/*     */     
/*  56 */     this.g = new dwn(this, 96, 0);
/*  57 */     this.g.a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
/*  58 */     this.g.a(-8.0F, -13.0F, 18.0F);
/*     */     
/*  60 */     this.h = new dwn(this, 96, 0);
/*  61 */     this.h.g = true;
/*  62 */     this.h.a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
/*  63 */     this.h.a(8.0F, -13.0F, 18.0F);
/*     */     
/*  65 */     this.i = new dwn(this, 64, 0);
/*  66 */     this.i.a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
/*  67 */     this.i.a(-8.0F, -13.0F, -5.0F);
/*     */     
/*  69 */     this.j = new dwn(this, 64, 0);
/*  70 */     this.j.g = true;
/*  71 */     this.j.a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
/*  72 */     this.j.a(8.0F, -13.0F, -5.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<dwn> a() {
/*  77 */     return (Iterable<dwn>)ImmutableList.of(this.k, this.f, this.g, this.h, this.i, this.j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bdv ☃, float f1, float f2, float f3, float f4, float f5) {
/*  82 */     this.a.d = f5 * 0.017453292F;
/*  83 */     this.a.e = f4 * 0.017453292F;
/*  84 */     this.f.d = 1.5707964F;
/*     */     
/*  86 */     float f = 0.4F * f2;
/*  87 */     this.g.d = afm.b(f1 * 0.6662F) * f;
/*  88 */     this.h.d = afm.b(f1 * 0.6662F + 3.1415927F) * f;
/*  89 */     this.i.d = afm.b(f1 * 0.6662F + 3.1415927F) * f;
/*  90 */     this.j.d = afm.b(f1 * 0.6662F) * f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bdv ☃, float f1, float f2, float f3) {
/*  95 */     super.a(☃, f1, f2, f3);
/*     */     
/*  97 */     int i = ☃.eM();
/*  98 */     int j = ☃.eW();
/*  99 */     int k = 20;
/* 100 */     int m = ☃.eK();
/* 101 */     int n = 10;
/* 102 */     if (m > 0) {
/* 103 */       float f4 = afm.e(m - f3, 10.0F);
/* 104 */       float f5 = (1.0F + f4) * 0.5F;
/* 105 */       float f6 = f5 * f5 * f5 * 12.0F;
/* 106 */       float f7 = f6 * afm.a(this.k.d);
/* 107 */       this.k.c = -6.5F + f6;
/* 108 */       this.k.b = -7.0F - f7;
/*     */       
/* 110 */       float f8 = afm.a((m - f3) / 10.0F * 3.1415927F * 0.25F);
/* 111 */       this.b.d = 1.5707964F * f8;
/*     */       
/* 113 */       if (m > 5) {
/* 114 */         this.b.d = afm.a(((-4 + m) - f3) / 4.0F) * 3.1415927F * 0.4F;
/*     */       } else {
/* 116 */         this.b.d = 0.15707964F * afm.a(3.1415927F * (m - f3) / 10.0F);
/*     */       } 
/*     */     } else {
/* 119 */       float f4 = -1.0F;
/* 120 */       float f5 = -1.0F * afm.a(this.k.d);
/* 121 */       this.k.a = 0.0F;
/* 122 */       this.k.b = -7.0F - f5;
/* 123 */       this.k.c = 5.5F;
/*     */       
/* 125 */       boolean bool = (i > 0);
/* 126 */       this.k.d = bool ? 0.21991149F : 0.0F;
/* 127 */       this.b.d = 3.1415927F * (bool ? 0.05F : 0.01F);
/*     */       
/* 129 */       if (bool) {
/* 130 */         double d = i / 40.0D;
/* 131 */         this.k.a = (float)Math.sin(d * 10.0D) * 3.0F;
/* 132 */       } else if (j > 0) {
/* 133 */         float f = afm.a(((20 - j) - f3) / 20.0F * 3.1415927F * 0.25F);
/* 134 */         this.b.d = 1.5707964F * f;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */