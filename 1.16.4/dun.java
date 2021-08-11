/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dun<T extends bcy>
/*     */   extends dur<T>
/*     */   implements dth, dui
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
/*     */   public dun(float ☃, float f1, int i, int j) {
/*  22 */     this.a = (new dwn(this)).b(i, j);
/*  23 */     this.a.a(0.0F, 0.0F + f1, 0.0F);
/*  24 */     this.a.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, ☃);
/*  25 */     this.b = (new dwn(this, 32, 0)).b(i, j);
/*  26 */     this.b.a(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, ☃ + 0.45F);
/*  27 */     this.a.b(this.b);
/*  28 */     this.b.h = false;
/*     */     
/*  30 */     dwn dwn1 = (new dwn(this)).b(i, j);
/*  31 */     dwn1.a(0.0F, f1 - 2.0F, 0.0F);
/*  32 */     dwn1.a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, ☃);
/*  33 */     this.a.b(dwn1);
/*     */     
/*  35 */     this.f = (new dwn(this)).b(i, j);
/*  36 */     this.f.a(0.0F, 0.0F + f1, 0.0F);
/*  37 */     this.f.a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, ☃);
/*  38 */     this.f.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, ☃ + 0.5F);
/*     */     
/*  40 */     this.g = (new dwn(this)).b(i, j);
/*  41 */     this.g.a(0.0F, 0.0F + f1 + 2.0F, 0.0F);
/*  42 */     this.g.a(44, 22).a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, ☃);
/*  43 */     dwn dwn2 = (new dwn(this, 44, 22)).b(i, j);
/*  44 */     dwn2.g = true;
/*  45 */     dwn2.a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, ☃);
/*  46 */     this.g.b(dwn2);
/*  47 */     this.g.a(40, 38).a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, ☃);
/*     */     
/*  49 */     this.h = (new dwn(this, 0, 22)).b(i, j);
/*  50 */     this.h.a(-2.0F, 12.0F + f1, 0.0F);
/*  51 */     this.h.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*     */     
/*  53 */     this.i = (new dwn(this, 0, 22)).b(i, j);
/*  54 */     this.i.g = true;
/*  55 */     this.i.a(2.0F, 12.0F + f1, 0.0F);
/*  56 */     this.i.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*     */     
/*  58 */     this.j = (new dwn(this, 40, 46)).b(i, j);
/*  59 */     this.j.a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*  60 */     this.j.a(-5.0F, 2.0F + f1, 0.0F);
/*     */     
/*  62 */     this.k = (new dwn(this, 40, 46)).b(i, j);
/*  63 */     this.k.g = true;
/*  64 */     this.k.a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*  65 */     this.k.a(5.0F, 2.0F + f1, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<dwn> a() {
/*  70 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.f, this.h, this.i, this.g, this.j, this.k);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  75 */     this.a.e = f4 * 0.017453292F;
/*  76 */     this.a.d = f5 * 0.017453292F;
/*     */     
/*  78 */     this.g.b = 3.0F;
/*  79 */     this.g.c = -1.0F;
/*  80 */     this.g.d = -0.75F;
/*     */     
/*  82 */     if (this.d) {
/*  83 */       this.j.d = -0.62831855F;
/*  84 */       this.j.e = 0.0F;
/*  85 */       this.j.f = 0.0F;
/*     */       
/*  87 */       this.k.d = -0.62831855F;
/*  88 */       this.k.e = 0.0F;
/*  89 */       this.k.f = 0.0F;
/*     */       
/*  91 */       this.h.d = -1.4137167F;
/*  92 */       this.h.e = 0.31415927F;
/*  93 */       this.h.f = 0.07853982F;
/*     */       
/*  95 */       this.i.d = -1.4137167F;
/*  96 */       this.i.e = -0.31415927F;
/*  97 */       this.i.f = -0.07853982F;
/*     */     } else {
/*  99 */       this.j.d = afm.b(f1 * 0.6662F + 3.1415927F) * 2.0F * f2 * 0.5F;
/* 100 */       this.j.e = 0.0F;
/* 101 */       this.j.f = 0.0F;
/*     */       
/* 103 */       this.k.d = afm.b(f1 * 0.6662F) * 2.0F * f2 * 0.5F;
/* 104 */       this.k.e = 0.0F;
/* 105 */       this.k.f = 0.0F;
/*     */       
/* 107 */       this.h.d = afm.b(f1 * 0.6662F) * 1.4F * f2 * 0.5F;
/* 108 */       this.h.e = 0.0F;
/* 109 */       this.h.f = 0.0F;
/*     */       
/* 111 */       this.i.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2 * 0.5F;
/* 112 */       this.i.e = 0.0F;
/* 113 */       this.i.f = 0.0F;
/*     */     } 
/*     */     
/* 116 */     bcy.a a = ☃.m();
/*     */     
/* 118 */     if (a == bcy.a.b) {
/* 119 */       if (☃.dD().a()) {
/* 120 */         dtg.a(this.k, this.j, true, this.c, f3);
/*     */       } else {
/* 122 */         dtg.a(this.j, this.k, (aqn)☃, this.c, f3);
/*     */       } 
/* 124 */     } else if (a == bcy.a.c) {
/* 125 */       this.j.c = 0.0F;
/* 126 */       this.j.a = -5.0F;
/* 127 */       this.k.c = 0.0F;
/* 128 */       this.k.a = 5.0F;
/* 129 */       this.j.d = afm.b(f3 * 0.6662F) * 0.25F;
/* 130 */       this.k.d = afm.b(f3 * 0.6662F) * 0.25F;
/* 131 */       this.j.f = 2.3561945F;
/* 132 */       this.k.f = -2.3561945F;
/*     */       
/* 134 */       this.j.e = 0.0F;
/* 135 */       this.k.e = 0.0F;
/* 136 */     } else if (a == bcy.a.d) {
/* 137 */       this.j.e = -0.1F + this.a.e;
/* 138 */       this.j.d = -1.5707964F + this.a.d;
/* 139 */       this.k.d = -0.9424779F + this.a.d;
/* 140 */       this.a.e -= 0.4F;
/* 141 */       this.k.f = 1.5707964F;
/* 142 */     } else if (a == bcy.a.e) {
/* 143 */       dtg.a(this.j, this.k, this.a, true);
/* 144 */     } else if (a == bcy.a.f) {
/* 145 */       dtg.a(this.j, this.k, (aqm)☃, true);
/* 146 */     } else if (a == bcy.a.g) {
/* 147 */       this.j.c = 0.0F;
/* 148 */       this.j.a = -5.0F;
/* 149 */       this.j.d = afm.b(f3 * 0.6662F) * 0.05F;
/* 150 */       this.j.f = 2.670354F;
/* 151 */       this.j.e = 0.0F;
/*     */       
/* 153 */       this.k.c = 0.0F;
/* 154 */       this.k.a = 5.0F;
/* 155 */       this.k.d = afm.b(f3 * 0.6662F) * 0.05F;
/* 156 */       this.k.f = -2.3561945F;
/* 157 */       this.k.e = 0.0F;
/*     */     } 
/*     */     
/* 160 */     boolean bool = (a == bcy.a.a);
/* 161 */     this.g.h = bool;
/* 162 */     this.k.h = !bool;
/* 163 */     this.j.h = !bool;
/*     */   }
/*     */   
/*     */   private dwn a(aqi ☃) {
/* 167 */     if (☃ == aqi.a) {
/* 168 */       return this.k;
/*     */     }
/* 170 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public dwn b() {
/* 175 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public dwn c() {
/* 180 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqi ☃, dfm dfm1) {
/* 185 */     a(☃).a(dfm1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dun.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */