/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dvw<T extends aqa>
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
/*     */   private final dwn m;
/*     */   private final dwn n;
/*     */   
/*     */   public dvw() {
/*  22 */     float ☃ = 0.0F;
/*     */     
/*  24 */     int i = 15;
/*     */     
/*  26 */     this.a = new dwn(this, 32, 4);
/*  27 */     this.a.a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F);
/*  28 */     this.a.a(0.0F, 15.0F, -3.0F);
/*     */     
/*  30 */     this.b = new dwn(this, 0, 0);
/*  31 */     this.b.a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F);
/*  32 */     this.b.a(0.0F, 15.0F, 0.0F);
/*     */     
/*  34 */     this.f = new dwn(this, 0, 12);
/*  35 */     this.f.a(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, 0.0F);
/*  36 */     this.f.a(0.0F, 15.0F, 9.0F);
/*     */     
/*  38 */     this.g = new dwn(this, 18, 0);
/*  39 */     this.g.a(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
/*  40 */     this.g.a(-4.0F, 15.0F, 2.0F);
/*     */     
/*  42 */     this.h = new dwn(this, 18, 0);
/*  43 */     this.h.a(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
/*  44 */     this.h.a(4.0F, 15.0F, 2.0F);
/*     */     
/*  46 */     this.i = new dwn(this, 18, 0);
/*  47 */     this.i.a(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
/*  48 */     this.i.a(-4.0F, 15.0F, 1.0F);
/*     */     
/*  50 */     this.j = new dwn(this, 18, 0);
/*  51 */     this.j.a(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
/*  52 */     this.j.a(4.0F, 15.0F, 1.0F);
/*     */     
/*  54 */     this.k = new dwn(this, 18, 0);
/*  55 */     this.k.a(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
/*  56 */     this.k.a(-4.0F, 15.0F, 0.0F);
/*     */     
/*  58 */     this.l = new dwn(this, 18, 0);
/*  59 */     this.l.a(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
/*  60 */     this.l.a(4.0F, 15.0F, 0.0F);
/*     */     
/*  62 */     this.m = new dwn(this, 18, 0);
/*  63 */     this.m.a(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
/*  64 */     this.m.a(-4.0F, 15.0F, -1.0F);
/*     */     
/*  66 */     this.n = new dwn(this, 18, 0);
/*  67 */     this.n.a(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
/*  68 */     this.n.a(4.0F, 15.0F, -1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<dwn> a() {
/*  73 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  78 */     this.a.e = f4 * 0.017453292F;
/*  79 */     this.a.d = f5 * 0.017453292F;
/*     */     
/*  81 */     float f6 = 0.7853982F;
/*  82 */     this.g.f = -0.7853982F;
/*  83 */     this.h.f = 0.7853982F;
/*     */     
/*  85 */     this.i.f = -0.58119464F;
/*  86 */     this.j.f = 0.58119464F;
/*     */     
/*  88 */     this.k.f = -0.58119464F;
/*  89 */     this.l.f = 0.58119464F;
/*     */     
/*  91 */     this.m.f = -0.7853982F;
/*  92 */     this.n.f = 0.7853982F;
/*     */     
/*  94 */     float f7 = -0.0F;
/*  95 */     float f8 = 0.3926991F;
/*  96 */     this.g.e = 0.7853982F;
/*  97 */     this.h.e = -0.7853982F;
/*  98 */     this.i.e = 0.3926991F;
/*  99 */     this.j.e = -0.3926991F;
/* 100 */     this.k.e = -0.3926991F;
/* 101 */     this.l.e = 0.3926991F;
/* 102 */     this.m.e = -0.7853982F;
/* 103 */     this.n.e = 0.7853982F;
/*     */     
/* 105 */     float f9 = -(afm.b(f1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * f2;
/* 106 */     float f10 = -(afm.b(f1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * f2;
/* 107 */     float f11 = -(afm.b(f1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * f2;
/* 108 */     float f12 = -(afm.b(f1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * f2;
/*     */     
/* 110 */     float f13 = Math.abs(afm.a(f1 * 0.6662F + 0.0F) * 0.4F) * f2;
/* 111 */     float f14 = Math.abs(afm.a(f1 * 0.6662F + 3.1415927F) * 0.4F) * f2;
/* 112 */     float f15 = Math.abs(afm.a(f1 * 0.6662F + 1.5707964F) * 0.4F) * f2;
/* 113 */     float f16 = Math.abs(afm.a(f1 * 0.6662F + 4.712389F) * 0.4F) * f2;
/*     */     
/* 115 */     this.g.e += f9;
/* 116 */     this.h.e += -f9;
/* 117 */     this.i.e += f10;
/* 118 */     this.j.e += -f10;
/* 119 */     this.k.e += f11;
/* 120 */     this.l.e += -f11;
/* 121 */     this.m.e += f12;
/* 122 */     this.n.e += -f12;
/*     */     
/* 124 */     this.g.f += f13;
/* 125 */     this.h.f += -f13;
/* 126 */     this.i.f += f14;
/* 127 */     this.j.f += -f14;
/* 128 */     this.k.f += f15;
/* 129 */     this.l.f += -f15;
/* 130 */     this.m.f += f16;
/* 131 */     this.n.f += -f16;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */