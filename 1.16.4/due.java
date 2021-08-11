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
/*     */ public class due<T extends bah>
/*     */   extends dtf<T>
/*     */ {
/*     */   public final dwn a;
/*     */   private final dwn b;
/*     */   private final dwn f;
/*     */   private final dwn g;
/*     */   private final dwn h;
/*     */   private final dwn i;
/*     */   private final dwn j;
/*     */   private final dwn k;
/*     */   private final dwn l;
/*     */   private final dwn m;
/*     */   private float n;
/*     */   
/*     */   public due() {
/*  27 */     super(true, 8.0F, 3.35F);
/*  28 */     this.r = 48;
/*  29 */     this.s = 32;
/*     */     
/*  31 */     this.a = new dwn(this, 1, 5);
/*  32 */     this.a.a(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F);
/*  33 */     this.a.a(-1.0F, 16.5F, -3.0F);
/*     */     
/*  35 */     this.b = new dwn(this, 8, 1);
/*  36 */     this.b.a(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
/*     */     
/*  38 */     this.f = new dwn(this, 15, 1);
/*  39 */     this.f.a(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
/*     */     
/*  41 */     this.g = new dwn(this, 6, 18);
/*  42 */     this.g.a(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F);
/*     */     
/*  44 */     this.a.b(this.b);
/*  45 */     this.a.b(this.f);
/*  46 */     this.a.b(this.g);
/*     */     
/*  48 */     this.h = new dwn(this, 24, 15);
/*  49 */     this.h.a(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F);
/*  50 */     this.h.a(0.0F, 16.0F, -6.0F);
/*     */     
/*  52 */     float ☃ = 0.001F;
/*  53 */     this.i = new dwn(this, 13, 24);
/*  54 */     this.i.a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
/*  55 */     this.i.a(-5.0F, 17.5F, 7.0F);
/*     */ 
/*     */     
/*  58 */     this.j = new dwn(this, 4, 24);
/*  59 */     this.j.a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
/*  60 */     this.j.a(-1.0F, 17.5F, 7.0F);
/*     */     
/*  62 */     this.k = new dwn(this, 13, 24);
/*  63 */     this.k.a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
/*  64 */     this.k.a(-5.0F, 17.5F, 0.0F);
/*     */     
/*  66 */     this.l = new dwn(this, 4, 24);
/*  67 */     this.l.a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
/*  68 */     this.l.a(-1.0F, 17.5F, 0.0F);
/*     */     
/*  70 */     this.m = new dwn(this, 30, 0);
/*  71 */     this.m.a(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F);
/*  72 */     this.m.a(-4.0F, 15.0F, -1.0F);
/*  73 */     this.h.b(this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3) {
/*  78 */     this.h.d = 1.5707964F;
/*  79 */     this.m.d = -0.05235988F;
/*     */     
/*  81 */     this.i.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/*  82 */     this.j.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/*  83 */     this.k.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/*  84 */     this.l.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/*     */     
/*  86 */     this.a.a(-1.0F, 16.5F, -3.0F);
/*  87 */     this.a.e = 0.0F;
/*  88 */     this.a.f = ☃.y(f3);
/*     */     
/*  90 */     this.i.h = true;
/*  91 */     this.j.h = true;
/*  92 */     this.k.h = true;
/*  93 */     this.l.h = true;
/*  94 */     this.h.a(0.0F, 16.0F, -6.0F);
/*  95 */     this.h.f = 0.0F;
/*  96 */     this.i.a(-5.0F, 17.5F, 7.0F);
/*  97 */     this.j.a(-1.0F, 17.5F, 7.0F);
/*     */     
/*  99 */     if (☃.bz()) {
/* 100 */       this.h.d = 1.6755161F;
/* 101 */       float f = ☃.z(f3);
/* 102 */       this.h.a(0.0F, 16.0F + ☃.z(f3), -6.0F);
/* 103 */       this.a.a(-1.0F, 16.5F + f, -3.0F);
/* 104 */       this.a.e = 0.0F;
/* 105 */     } else if (☃.em()) {
/* 106 */       this.h.f = -1.5707964F;
/* 107 */       this.h.a(0.0F, 21.0F, -6.0F);
/* 108 */       this.m.d = -2.6179938F;
/* 109 */       if (this.e) {
/* 110 */         this.m.d = -2.1816616F;
/* 111 */         this.h.a(0.0F, 21.0F, -2.0F);
/*     */       } 
/* 113 */       this.a.a(1.0F, 19.49F, -3.0F);
/* 114 */       this.a.d = 0.0F;
/* 115 */       this.a.e = -2.0943952F;
/* 116 */       this.a.f = 0.0F;
/*     */       
/* 118 */       this.i.h = false;
/* 119 */       this.j.h = false;
/* 120 */       this.k.h = false;
/* 121 */       this.l.h = false;
/* 122 */     } else if (☃.eM()) {
/* 123 */       this.h.d = 0.5235988F;
/* 124 */       this.h.a(0.0F, 9.0F, -3.0F);
/* 125 */       this.m.d = 0.7853982F;
/* 126 */       this.m.a(-4.0F, 15.0F, -2.0F);
/* 127 */       this.a.a(-1.0F, 10.0F, -0.25F);
/* 128 */       this.a.d = 0.0F;
/* 129 */       this.a.e = 0.0F;
/*     */       
/* 131 */       if (this.e) {
/* 132 */         this.a.a(-1.0F, 13.0F, -3.75F);
/*     */       }
/*     */       
/* 135 */       this.i.d = -1.3089969F;
/* 136 */       this.i.a(-5.0F, 21.5F, 6.75F);
/* 137 */       this.j.d = -1.3089969F;
/* 138 */       this.j.a(-1.0F, 21.5F, 6.75F);
/*     */       
/* 140 */       this.k.d = -0.2617994F;
/* 141 */       this.l.d = -0.2617994F;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> a() {
/* 147 */     return (Iterable<dwn>)ImmutableList.of(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/* 152 */     return (Iterable<dwn>)ImmutableList.of(this.h, this.i, this.j, this.k, this.l);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 157 */     if (!☃.em() && !☃.eN() && !☃.bz()) {
/* 158 */       this.a.d = f5 * 0.017453292F;
/* 159 */       this.a.e = f4 * 0.017453292F;
/*     */     } 
/*     */ 
/*     */     
/* 163 */     if (☃.em()) {
/* 164 */       this.a.d = 0.0F;
/* 165 */       this.a.e = -2.0943952F;
/* 166 */       this.a.f = afm.b(f3 * 0.027F) / 22.0F;
/*     */     } 
/*     */ 
/*     */     
/* 170 */     if (☃.bz()) {
/* 171 */       float f = afm.b(f3) * 0.01F;
/* 172 */       this.h.e = f;
/* 173 */       this.i.f = f;
/* 174 */       this.j.f = f;
/* 175 */       this.k.f = f / 2.0F;
/* 176 */       this.l.f = f / 2.0F;
/*     */     } 
/*     */ 
/*     */     
/* 180 */     if (☃.eN()) {
/* 181 */       float f = 0.1F;
/* 182 */       this.n += 0.67F;
/* 183 */       this.i.d = afm.b(this.n * 0.4662F) * 0.1F;
/* 184 */       this.j.d = afm.b(this.n * 0.4662F + 3.1415927F) * 0.1F;
/* 185 */       this.k.d = afm.b(this.n * 0.4662F + 3.1415927F) * 0.1F;
/* 186 */       this.l.d = afm.b(this.n * 0.4662F) * 0.1F;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\due.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */