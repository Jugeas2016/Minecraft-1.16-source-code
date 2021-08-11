/*     */ import com.google.common.collect.ImmutableList;
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
/*     */ public class duk<T extends bbb>
/*     */   extends dtf<T>
/*     */ {
/*     */   protected final dwn a;
/*     */   protected final dwn b;
/*     */   private final dwn f;
/*     */   private final dwn g;
/*     */   private final dwn h;
/*     */   private final dwn i;
/*     */   private final dwn j;
/*     */   private final dwn k;
/*     */   private final dwn l;
/*     */   private final dwn m;
/*     */   private final dwn n;
/*     */   private final dwn[] o;
/*     */   private final dwn[] p;
/*     */   
/*     */   public duk(float ☃) {
/*  32 */     super(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F);
/*  33 */     this.r = 64;
/*  34 */     this.s = 64;
/*     */     
/*  36 */     this.a = new dwn(this, 0, 32);
/*  37 */     this.a.a(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, 0.05F);
/*  38 */     this.a.a(0.0F, 11.0F, 5.0F);
/*     */ 
/*     */     
/*  41 */     this.b = new dwn(this, 0, 35);
/*  42 */     this.b.a(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F);
/*  43 */     this.b.d = 0.5235988F;
/*     */     
/*  45 */     dwn dwn1 = new dwn(this, 0, 13);
/*  46 */     dwn1.a(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, ☃);
/*  47 */     dwn dwn2 = new dwn(this, 56, 36);
/*  48 */     dwn2.a(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, ☃);
/*  49 */     dwn dwn3 = new dwn(this, 0, 25);
/*  50 */     dwn3.a(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, ☃);
/*     */     
/*  52 */     this.b.b(dwn1);
/*  53 */     this.b.b(dwn2);
/*  54 */     this.b.b(dwn3);
/*  55 */     a(this.b);
/*     */     
/*  57 */     this.f = new dwn(this, 48, 21);
/*  58 */     this.f.g = true;
/*  59 */     this.f.a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, ☃);
/*  60 */     this.f.a(4.0F, 14.0F, 7.0F);
/*     */     
/*  62 */     this.g = new dwn(this, 48, 21);
/*  63 */     this.g.a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, ☃);
/*  64 */     this.g.a(-4.0F, 14.0F, 7.0F);
/*     */     
/*  66 */     this.h = new dwn(this, 48, 21);
/*  67 */     this.h.g = true;
/*  68 */     this.h.a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, ☃);
/*  69 */     this.h.a(4.0F, 6.0F, -12.0F);
/*     */     
/*  71 */     this.i = new dwn(this, 48, 21);
/*  72 */     this.i.a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, ☃);
/*  73 */     this.i.a(-4.0F, 6.0F, -12.0F);
/*     */     
/*  75 */     float f = 5.5F;
/*     */     
/*  77 */     this.j = new dwn(this, 48, 21);
/*  78 */     this.j.g = true;
/*  79 */     this.j.a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, ☃, ☃ + 5.5F, ☃);
/*  80 */     this.j.a(4.0F, 14.0F, 7.0F);
/*     */     
/*  82 */     this.k = new dwn(this, 48, 21);
/*  83 */     this.k.a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, ☃, ☃ + 5.5F, ☃);
/*  84 */     this.k.a(-4.0F, 14.0F, 7.0F);
/*     */     
/*  86 */     this.l = new dwn(this, 48, 21);
/*  87 */     this.l.g = true;
/*  88 */     this.l.a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, ☃, ☃ + 5.5F, ☃);
/*  89 */     this.l.a(4.0F, 6.0F, -12.0F);
/*     */     
/*  91 */     this.m = new dwn(this, 48, 21);
/*  92 */     this.m.a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, ☃, ☃ + 5.5F, ☃);
/*  93 */     this.m.a(-4.0F, 6.0F, -12.0F);
/*     */     
/*  95 */     this.n = new dwn(this, 42, 36);
/*  96 */     this.n.a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, ☃);
/*  97 */     this.n.a(0.0F, -5.0F, 2.0F);
/*  98 */     this.n.d = 0.5235988F;
/*  99 */     this.a.b(this.n);
/*     */     
/* 101 */     dwn dwn4 = new dwn(this, 26, 0);
/* 102 */     dwn4.a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, 0.5F);
/* 103 */     this.a.b(dwn4);
/*     */     
/* 105 */     dwn dwn5 = new dwn(this, 29, 5);
/* 106 */     dwn5.a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, ☃);
/* 107 */     this.b.b(dwn5);
/*     */     
/* 109 */     dwn dwn6 = new dwn(this, 29, 5);
/* 110 */     dwn6.a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, ☃);
/* 111 */     this.b.b(dwn6);
/*     */     
/* 113 */     dwn dwn7 = new dwn(this, 32, 2);
/* 114 */     dwn7.a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, ☃);
/* 115 */     dwn7.d = -0.5235988F;
/* 116 */     this.b.b(dwn7);
/*     */     
/* 118 */     dwn dwn8 = new dwn(this, 32, 2);
/* 119 */     dwn8.a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, ☃);
/* 120 */     dwn8.d = -0.5235988F;
/* 121 */     this.b.b(dwn8);
/*     */     
/* 123 */     dwn dwn9 = new dwn(this, 1, 1);
/* 124 */     dwn9.a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, 0.2F);
/* 125 */     this.b.b(dwn9);
/*     */     
/* 127 */     dwn dwn10 = new dwn(this, 19, 0);
/* 128 */     dwn10.a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, 0.2F);
/* 129 */     this.b.b(dwn10);
/*     */     
/* 131 */     this.o = new dwn[] { dwn4, dwn5, dwn6, dwn9, dwn10 };
/* 132 */     this.p = new dwn[] { dwn7, dwn8 };
/*     */   }
/*     */   
/*     */   protected void a(dwn ☃) {
/* 136 */     dwn dwn1 = new dwn(this, 19, 16);
/* 137 */     dwn1.a(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
/* 138 */     dwn dwn2 = new dwn(this, 19, 16);
/* 139 */     dwn2.a(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
/*     */     
/* 141 */     ☃.b(dwn1);
/* 142 */     ☃.b(dwn2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 147 */     boolean bool1 = ☃.M_();
/* 148 */     boolean bool2 = ☃.bs();
/*     */     
/* 150 */     for (dwn dwn1 : this.o) {
/* 151 */       dwn1.h = bool1;
/*     */     }
/*     */     
/* 154 */     for (dwn dwn1 : this.p) {
/* 155 */       dwn1.h = (bool2 && bool1);
/*     */     }
/* 157 */     this.a.b = 11.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<dwn> a() {
/* 162 */     return (Iterable<dwn>)ImmutableList.of(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/* 167 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3) {
/* 172 */     super.a(☃, f1, f2, f3);
/*     */     
/* 174 */     float f4 = afm.j(((bbb)☃).aB, ((bbb)☃).aA, f3);
/* 175 */     float f5 = afm.j(((bbb)☃).aD, ((bbb)☃).aC, f3);
/* 176 */     float f6 = afm.g(f3, ((bbb)☃).s, ((bbb)☃).q);
/* 177 */     float f7 = f5 - f4;
/*     */ 
/*     */     
/* 180 */     float f8 = f6 * 0.017453292F;
/* 181 */     if (f7 > 20.0F) {
/* 182 */       f7 = 20.0F;
/*     */     }
/* 184 */     if (f7 < -20.0F) {
/* 185 */       f7 = -20.0F;
/*     */     }
/*     */     
/* 188 */     if (f2 > 0.2F) {
/* 189 */       f8 += afm.b(f1 * 0.4F) * 0.15F * f2;
/*     */     }
/*     */     
/* 192 */     float f9 = ☃.y(f3);
/* 193 */     float f10 = ☃.z(f3);
/* 194 */     float f11 = 1.0F - f10;
/* 195 */     float f12 = ☃.A(f3);
/* 196 */     boolean bool1 = (((bbb)☃).bo != 0);
/* 197 */     float f13 = ((bbb)☃).K + f3;
/*     */     
/* 199 */     this.b.b = 4.0F;
/* 200 */     this.b.c = -12.0F;
/* 201 */     this.a.d = 0.0F;
/*     */     
/* 203 */     this.b.d = 0.5235988F + f8;
/* 204 */     this.b.e = f7 * 0.017453292F;
/*     */     
/* 206 */     float f14 = ☃.aE() ? 0.2F : 1.0F;
/* 207 */     float f15 = afm.b(f14 * f1 * 0.6662F + 3.1415927F);
/* 208 */     float f16 = f15 * 0.8F * f2;
/*     */ 
/*     */     
/* 211 */     float f17 = (1.0F - Math.max(f10, f9)) * (0.5235988F + f8 + f12 * afm.a(f13) * 0.05F);
/* 212 */     this.b.d = f10 * (0.2617994F + f8) + f9 * (2.1816616F + afm.a(f13) * 0.05F) + f17;
/* 213 */     this.b.e = f10 * f7 * 0.017453292F + (1.0F - Math.max(f10, f9)) * this.b.e;
/*     */     
/* 215 */     this.b.b = f10 * -4.0F + f9 * 11.0F + (1.0F - Math.max(f10, f9)) * this.b.b;
/* 216 */     this.b.c = f10 * -4.0F + f9 * -12.0F + (1.0F - Math.max(f10, f9)) * this.b.c;
/*     */     
/* 218 */     this.a.d = f10 * -0.7853982F + f11 * this.a.d;
/*     */     
/* 220 */     float f18 = 0.2617994F * f10;
/* 221 */     float f19 = afm.b(f13 * 0.6F + 3.1415927F);
/*     */     
/* 223 */     this.h.b = 2.0F * f10 + 14.0F * f11;
/* 224 */     this.h.c = -6.0F * f10 - 10.0F * f11;
/* 225 */     this.i.b = this.h.b;
/* 226 */     this.i.c = this.h.c;
/*     */     
/* 228 */     float f20 = (-1.0471976F + f19) * f10 + f16 * f11;
/* 229 */     float f21 = (-1.0471976F - f19) * f10 - f16 * f11;
/*     */     
/* 231 */     this.f.d = f18 - f15 * 0.5F * f2 * f11;
/* 232 */     this.g.d = f18 + f15 * 0.5F * f2 * f11;
/* 233 */     this.h.d = f20;
/* 234 */     this.i.d = f21;
/*     */     
/* 236 */     this.n.d = 0.5235988F + f2 * 0.75F;
/* 237 */     this.n.b = -5.0F + f2;
/* 238 */     this.n.c = 2.0F + f2 * 2.0F;
/*     */     
/* 240 */     if (bool1) {
/* 241 */       this.n.e = afm.b(f13 * 0.7F);
/*     */     } else {
/* 243 */       this.n.e = 0.0F;
/*     */     } 
/*     */     
/* 246 */     this.j.b = this.f.b;
/* 247 */     this.j.c = this.f.c;
/* 248 */     this.j.d = this.f.d;
/* 249 */     this.k.b = this.g.b;
/* 250 */     this.k.c = this.g.c;
/* 251 */     this.k.d = this.g.d;
/* 252 */     this.l.b = this.h.b;
/* 253 */     this.l.c = this.h.c;
/* 254 */     this.l.d = this.h.d;
/* 255 */     this.m.b = this.i.b;
/* 256 */     this.m.c = this.i.c;
/* 257 */     this.m.d = this.i.d;
/*     */     
/* 259 */     boolean bool2 = ☃.w_();
/*     */     
/* 261 */     this.f.h = !bool2;
/* 262 */     this.g.h = !bool2;
/* 263 */     this.h.h = !bool2;
/* 264 */     this.i.h = !bool2;
/*     */     
/* 266 */     this.j.h = bool2;
/* 267 */     this.k.h = bool2;
/* 268 */     this.l.h = bool2;
/* 269 */     this.m.h = bool2;
/*     */     
/* 271 */     this.a.b = bool2 ? 10.8F : 0.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\duk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */