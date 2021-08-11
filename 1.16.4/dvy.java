/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dvy<T extends bed>
/*     */   extends dur<T>
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
/*     */   
/*     */   public dvy() {
/*  20 */     this.r = 64;
/*  21 */     this.s = 128;
/*     */     
/*  23 */     this.a = new dwn(this, 0, 32);
/*  24 */     this.a.a(-4.0F, 8.0F, 0.0F);
/*  25 */     this.a.a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
/*     */     
/*  27 */     this.b = new dwn(this, 0, 55);
/*  28 */     this.b.a(4.0F, 8.0F, 0.0F);
/*  29 */     this.b.a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
/*     */     
/*  31 */     this.f = new dwn(this, 0, 0);
/*  32 */     this.f.a(0.0F, 1.0F, 0.0F);
/*  33 */     this.f.a(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F, 0.0F);
/*     */     
/*  35 */     this.g = new dwn(this, 16, 65);
/*  36 */     this.g.a(-8.0F, 4.0F, -8.0F);
/*  37 */     this.g.a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
/*  38 */     a(this.g, 0.0F, 0.0F, -1.2217305F);
/*     */     
/*  40 */     this.h = new dwn(this, 16, 49);
/*  41 */     this.h.a(-8.0F, -1.0F, -8.0F);
/*  42 */     this.h.a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
/*  43 */     a(this.h, 0.0F, 0.0F, -1.134464F);
/*     */     
/*  45 */     this.i = new dwn(this, 16, 33);
/*  46 */     this.i.a(-8.0F, -5.0F, -8.0F);
/*  47 */     this.i.a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
/*  48 */     a(this.i, 0.0F, 0.0F, -0.87266463F);
/*     */     
/*  50 */     this.j = new dwn(this, 16, 33);
/*  51 */     this.j.a(8.0F, -6.0F, -8.0F);
/*  52 */     this.j.a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
/*  53 */     a(this.j, 0.0F, 0.0F, 0.87266463F);
/*     */     
/*  55 */     this.k = new dwn(this, 16, 49);
/*  56 */     this.k.a(8.0F, -2.0F, -8.0F);
/*  57 */     this.k.a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
/*  58 */     a(this.k, 0.0F, 0.0F, 1.134464F);
/*     */     
/*  60 */     this.l = new dwn(this, 16, 65);
/*  61 */     this.l.a(8.0F, 3.0F, -8.0F);
/*  62 */     this.l.a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
/*  63 */     a(this.l, 0.0F, 0.0F, 1.2217305F);
/*     */     
/*  65 */     this.f.b(this.g);
/*  66 */     this.f.b(this.h);
/*  67 */     this.f.b(this.i);
/*  68 */     this.f.b(this.j);
/*  69 */     this.f.b(this.k);
/*  70 */     this.f.b(this.l);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bed ☃, float f1, float f2, float f3, float f4, float f5) {
/*  75 */     f2 = Math.min(0.25F, f2);
/*     */     
/*  77 */     if (☃.cn().size() <= 0) {
/*  78 */       this.f.d = f5 * 0.017453292F;
/*  79 */       this.f.e = f4 * 0.017453292F;
/*     */     } else {
/*  81 */       this.f.d = 0.0F;
/*  82 */       this.f.e = 0.0F;
/*     */     } 
/*     */     
/*  85 */     float f6 = 1.5F;
/*     */     
/*  87 */     this.f.f = 0.1F * afm.a(f1 * 1.5F) * 4.0F * f2;
/*     */     
/*  89 */     this.f.b = 2.0F;
/*  90 */     this.f.b -= 2.0F * afm.b(f1 * 1.5F) * 2.0F * f2;
/*     */     
/*  92 */     this.b.d = afm.a(f1 * 1.5F * 0.5F) * 2.0F * f2;
/*  93 */     this.a.d = afm.a(f1 * 1.5F * 0.5F + 3.1415927F) * 2.0F * f2;
/*     */     
/*  95 */     this.b.f = 0.17453292F * afm.b(f1 * 1.5F * 0.5F) * f2;
/*  96 */     this.a.f = 0.17453292F * afm.b(f1 * 1.5F * 0.5F + 3.1415927F) * f2;
/*     */     
/*  98 */     this.b.b = 8.0F + 2.0F * afm.a(f1 * 1.5F * 0.5F + 3.1415927F) * 2.0F * f2;
/*  99 */     this.a.b = 8.0F + 2.0F * afm.a(f1 * 1.5F * 0.5F) * 2.0F * f2;
/*     */     
/* 101 */     this.g.f = -1.2217305F;
/* 102 */     this.h.f = -1.134464F;
/* 103 */     this.i.f = -0.87266463F;
/* 104 */     this.j.f = 0.87266463F;
/* 105 */     this.k.f = 1.134464F;
/* 106 */     this.l.f = 1.2217305F;
/*     */     
/* 108 */     float f7 = afm.b(f1 * 1.5F + 3.1415927F) * f2;
/*     */     
/* 110 */     this.g.f += f7 * 1.3F;
/* 111 */     this.h.f += f7 * 1.2F;
/* 112 */     this.i.f += f7 * 0.6F;
/*     */     
/* 114 */     this.j.f += f7 * 0.6F;
/* 115 */     this.k.f += f7 * 1.2F;
/* 116 */     this.l.f += f7 * 1.3F;
/*     */     
/* 118 */     float f8 = 1.0F;
/* 119 */     float f9 = 1.0F;
/*     */     
/* 121 */     this.g.f += 0.05F * afm.a(f3 * 1.0F * -0.4F);
/* 122 */     this.h.f += 0.1F * afm.a(f3 * 1.0F * 0.2F);
/* 123 */     this.i.f += 0.1F * afm.a(f3 * 1.0F * 0.4F);
/*     */     
/* 125 */     this.j.f += 0.1F * afm.a(f3 * 1.0F * 0.4F);
/* 126 */     this.k.f += 0.1F * afm.a(f3 * 1.0F * 0.2F);
/* 127 */     this.l.f += 0.05F * afm.a(f3 * 1.0F * -0.4F);
/*     */   }
/*     */   
/*     */   public void a(dwn ☃, float f1, float f2, float f3) {
/* 131 */     ☃.d = f1;
/* 132 */     ☃.e = f2;
/* 133 */     ☃.f = f3;
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<dwn> a() {
/* 138 */     return (Iterable<dwn>)ImmutableList.of(this.f, this.b, this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */