/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class duz
/*     */   extends dur<bam>
/*     */ {
/*     */   private final dwn a;
/*     */   private final dwn b;
/*     */   private final dwn f;
/*     */   private final dwn g;
/*     */   private final dwn h;
/*     */   private final dwn i;
/*     */   private final dwn j;
/*     */   private final dwn k;
/*     */   private final dwn l;
/*     */   private final dwn m;
/*     */   private final dwn n;
/*     */   
/*     */   public enum a
/*     */   {
/*  24 */     a,
/*  25 */     b,
/*  26 */     c,
/*  27 */     d,
/*  28 */     e;
/*     */   }
/*     */   
/*     */   public duz() {
/*  32 */     this.r = 32;
/*  33 */     this.s = 32;
/*     */     
/*  35 */     this.a = new dwn(this, 2, 8);
/*  36 */     this.a.a(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F);
/*  37 */     this.a.a(0.0F, 16.5F, -3.0F);
/*  38 */     this.b = new dwn(this, 22, 1);
/*  39 */     this.b.a(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F);
/*  40 */     this.b.a(0.0F, 21.07F, 1.16F);
/*  41 */     this.f = new dwn(this, 19, 8);
/*  42 */     this.f.a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
/*  43 */     this.f.a(1.5F, 16.94F, -2.76F);
/*  44 */     this.g = new dwn(this, 19, 8);
/*  45 */     this.g.a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
/*  46 */     this.g.a(-1.5F, 16.94F, -2.76F);
/*     */     
/*  48 */     this.h = new dwn(this, 2, 2);
/*  49 */     this.h.a(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F);
/*  50 */     this.h.a(0.0F, 15.69F, -2.76F);
/*  51 */     this.i = new dwn(this, 10, 0);
/*  52 */     this.i.a(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F);
/*  53 */     this.i.a(0.0F, -2.0F, -1.0F);
/*  54 */     this.h.b(this.i);
/*  55 */     this.j = new dwn(this, 11, 7);
/*  56 */     this.j.a(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F);
/*  57 */     this.j.a(0.0F, -0.5F, -1.5F);
/*  58 */     this.h.b(this.j);
/*  59 */     this.k = new dwn(this, 16, 7);
/*  60 */     this.k.a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
/*  61 */     this.k.a(0.0F, -1.75F, -2.45F);
/*  62 */     this.h.b(this.k);
/*  63 */     this.l = new dwn(this, 2, 18);
/*  64 */     this.l.a(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F);
/*  65 */     this.l.a(0.0F, -2.15F, 0.15F);
/*  66 */     this.h.b(this.l);
/*     */     
/*  68 */     this.m = new dwn(this, 14, 18);
/*  69 */     this.m.a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
/*  70 */     this.m.a(1.0F, 22.0F, -1.05F);
/*  71 */     this.n = new dwn(this, 14, 18);
/*  72 */     this.n.a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
/*  73 */     this.n.a(-1.0F, 22.0F, -1.05F);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<dwn> a() {
/*  78 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.f, this.g, this.b, this.h, this.m, this.n);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bam ☃, float f1, float f2, float f3, float f4, float f5) {
/*  83 */     a(a(☃), ☃.K, f1, f2, f3, f4, f5);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bam ☃, float f1, float f2, float f3) {
/*  88 */     a(a(☃));
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4, int k) {
/*  92 */     a(a.e);
/*  93 */     a(a.e, k, f1, f2, 0.0F, f3, f4);
/*  94 */     a().forEach(dwn1 -> dwn1.a(☃, dfq1, i, j));
/*     */   }
/*     */   private void a(a ☃, int i, float f1, float f2, float f3, float f4, float f5) {
/*     */     float f6, f7;
/*  98 */     this.h.d = f5 * 0.017453292F;
/*  99 */     this.h.e = f4 * 0.017453292F;
/* 100 */     this.h.f = 0.0F;
/*     */     
/* 102 */     this.h.a = 0.0F;
/* 103 */     this.a.a = 0.0F;
/*     */     
/* 105 */     this.b.a = 0.0F;
/*     */     
/* 107 */     this.g.a = -1.5F;
/* 108 */     this.f.a = 1.5F;
/*     */     
/* 110 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/*     */         return;
/*     */       case 2:
/* 114 */         f6 = afm.b(i);
/* 115 */         f7 = afm.a(i);
/* 116 */         this.h.a = f6;
/* 117 */         this.h.b = 15.69F + f7;
/*     */         
/* 119 */         this.h.d = 0.0F;
/* 120 */         this.h.e = 0.0F;
/* 121 */         this.h.f = afm.a(i) * 0.4F;
/*     */         
/* 123 */         this.a.a = f6;
/* 124 */         this.a.b = 16.5F + f7;
/*     */         
/* 126 */         this.f.f = -0.0873F - f3;
/* 127 */         this.f.a = 1.5F + f6;
/* 128 */         this.f.b = 16.94F + f7;
/*     */         
/* 130 */         this.g.f = 0.0873F + f3;
/* 131 */         this.g.a = -1.5F + f6;
/* 132 */         this.g.b = 16.94F + f7;
/*     */         
/* 134 */         this.b.a = f6;
/* 135 */         this.b.b = 21.07F + f7;
/*     */ 
/*     */       
/*     */       case 3:
/* 139 */         this.m.d += afm.b(f1 * 0.6662F) * 1.4F * f2;
/* 140 */         this.n.d += afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/*     */         break;
/*     */     } 
/*     */ 
/*     */     
/* 145 */     float f8 = f3 * 0.3F;
/* 146 */     this.h.b = 15.69F + f8;
/*     */     
/* 148 */     this.b.d = 1.015F + afm.b(f1 * 0.6662F) * 0.3F * f2;
/* 149 */     this.b.b = 21.07F + f8;
/*     */     
/* 151 */     this.a.b = 16.5F + f8;
/*     */     
/* 153 */     this.f.f = -0.0873F - f3;
/* 154 */     this.f.b = 16.94F + f8;
/*     */     
/* 156 */     this.g.f = 0.0873F + f3;
/* 157 */     this.g.b = 16.94F + f8;
/*     */     
/* 159 */     this.m.b = 22.0F + f8;
/* 160 */     this.n.b = 22.0F + f8;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(a ☃) {
/*     */     float f;
/* 166 */     this.l.d = -0.2214F;
/* 167 */     this.a.d = 0.4937F;
/*     */     
/* 169 */     this.f.d = -0.6981F;
/* 170 */     this.f.e = -3.1415927F;
/*     */     
/* 172 */     this.g.d = -0.6981F;
/* 173 */     this.g.e = -3.1415927F;
/*     */     
/* 175 */     this.m.d = -0.0299F;
/* 176 */     this.n.d = -0.0299F;
/* 177 */     this.m.b = 22.0F;
/* 178 */     this.n.b = 22.0F;
/*     */     
/* 180 */     this.m.f = 0.0F;
/* 181 */     this.n.f = 0.0F;
/*     */     
/* 183 */     switch (null.a[☃.ordinal()]) {
/*     */       case 4:
/* 185 */         this.m.d += 0.6981317F;
/* 186 */         this.n.d += 0.6981317F;
/*     */         break;
/*     */       case 1:
/* 189 */         f = 1.9F;
/*     */         
/* 191 */         this.h.b = 17.59F;
/*     */         
/* 193 */         this.b.d = 1.5388988F;
/* 194 */         this.b.b = 22.97F;
/*     */         
/* 196 */         this.a.b = 18.4F;
/*     */         
/* 198 */         this.f.f = -0.0873F;
/* 199 */         this.f.b = 18.84F;
/*     */         
/* 201 */         this.g.f = 0.0873F;
/* 202 */         this.g.b = 18.84F;
/*     */         
/* 204 */         this.m.b += 1.9F;
/* 205 */         this.n.b += 1.9F;
/*     */         
/* 207 */         this.m.d += 1.5707964F;
/* 208 */         this.n.d += 1.5707964F;
/*     */         break;
/*     */       case 2:
/* 211 */         this.m.f = -0.34906584F;
/* 212 */         this.n.f = 0.34906584F;
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static a a(bam ☃) {
/* 223 */     if (☃.eV())
/* 224 */       return a.d; 
/* 225 */     if (☃.eM())
/* 226 */       return a.c; 
/* 227 */     if (☃.fa()) {
/* 228 */       return a.a;
/*     */     }
/* 230 */     return a.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\duz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */