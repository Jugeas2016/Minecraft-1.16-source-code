/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dwi<T extends baz>
/*     */   extends dtt<T>
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
/*     */   
/*     */   public dwi() {
/*  23 */     float ☃ = 0.0F;
/*     */     
/*  25 */     float f1 = 13.5F;
/*     */     
/*  27 */     this.a = new dwn(this, 0, 0);
/*  28 */     this.a.a(-1.0F, 13.5F, -7.0F);
/*  29 */     this.b = new dwn(this, 0, 0);
/*  30 */     this.b.a(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F);
/*  31 */     this.a.b(this.b);
/*     */     
/*  33 */     this.f = new dwn(this, 18, 14);
/*  34 */     this.f.a(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F);
/*  35 */     this.f.a(0.0F, 14.0F, 2.0F);
/*     */     
/*  37 */     this.m = new dwn(this, 21, 0);
/*  38 */     this.m.a(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, 0.0F);
/*  39 */     this.m.a(-1.0F, 14.0F, 2.0F);
/*     */     
/*  41 */     this.g = new dwn(this, 0, 18);
/*  42 */     this.g.a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
/*  43 */     this.g.a(-2.5F, 16.0F, 7.0F);
/*     */     
/*  45 */     this.h = new dwn(this, 0, 18);
/*  46 */     this.h.a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
/*  47 */     this.h.a(0.5F, 16.0F, 7.0F);
/*     */     
/*  49 */     this.i = new dwn(this, 0, 18);
/*  50 */     this.i.a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
/*  51 */     this.i.a(-2.5F, 16.0F, -4.0F);
/*     */     
/*  53 */     this.j = new dwn(this, 0, 18);
/*  54 */     this.j.a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
/*  55 */     this.j.a(0.5F, 16.0F, -4.0F);
/*     */     
/*  57 */     this.k = new dwn(this, 9, 18);
/*  58 */     this.k.a(-1.0F, 12.0F, 8.0F);
/*  59 */     this.l = new dwn(this, 9, 18);
/*  60 */     this.l.a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
/*  61 */     this.k.b(this.l);
/*     */     
/*  63 */     this.b.a(16, 14).a(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
/*  64 */     this.b.a(16, 14).a(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
/*  65 */     this.b.a(0, 10).a(-0.5F, 0.0F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> a() {
/*  70 */     return (Iterable<dwn>)ImmutableList.of(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/*  75 */     return (Iterable<dwn>)ImmutableList.of(this.f, this.g, this.h, this.i, this.j, this.k, this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3) {
/*  80 */     if (☃.H_()) {
/*  81 */       this.k.e = 0.0F;
/*     */     } else {
/*  83 */       this.k.e = afm.b(f1 * 0.6662F) * 1.4F * f2;
/*     */     } 
/*     */     
/*  86 */     if (☃.eM()) {
/*  87 */       this.m.a(-1.0F, 16.0F, -3.0F);
/*  88 */       this.m.d = 1.2566371F;
/*  89 */       this.m.e = 0.0F;
/*     */       
/*  91 */       this.f.a(0.0F, 18.0F, 0.0F);
/*  92 */       this.f.d = 0.7853982F;
/*     */       
/*  94 */       this.k.a(-1.0F, 21.0F, 6.0F);
/*     */       
/*  96 */       this.g.a(-2.5F, 22.7F, 2.0F);
/*  97 */       this.g.d = 4.712389F;
/*  98 */       this.h.a(0.5F, 22.7F, 2.0F);
/*  99 */       this.h.d = 4.712389F;
/*     */       
/* 101 */       this.i.d = 5.811947F;
/* 102 */       this.i.a(-2.49F, 17.0F, -4.0F);
/* 103 */       this.j.d = 5.811947F;
/* 104 */       this.j.a(0.51F, 17.0F, -4.0F);
/*     */     } else {
/* 106 */       this.f.a(0.0F, 14.0F, 2.0F);
/* 107 */       this.f.d = 1.5707964F;
/*     */       
/* 109 */       this.m.a(-1.0F, 14.0F, -3.0F);
/* 110 */       this.m.d = this.f.d;
/*     */       
/* 112 */       this.k.a(-1.0F, 12.0F, 8.0F);
/*     */       
/* 114 */       this.g.a(-2.5F, 16.0F, 7.0F);
/* 115 */       this.h.a(0.5F, 16.0F, 7.0F);
/* 116 */       this.i.a(-2.5F, 16.0F, -4.0F);
/* 117 */       this.j.a(0.5F, 16.0F, -4.0F);
/*     */       
/* 119 */       this.g.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/* 120 */       this.h.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/* 121 */       this.i.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/* 122 */       this.j.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/*     */     } 
/*     */     
/* 125 */     this.b.f = ☃.z(f3) + ☃.g(f3, 0.0F);
/*     */     
/* 127 */     this.m.f = ☃.g(f3, -0.08F);
/* 128 */     this.f.f = ☃.g(f3, -0.16F);
/* 129 */     this.l.f = ☃.g(f3, -0.2F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 134 */     this.a.d = f5 * 0.017453292F;
/* 135 */     this.a.e = f4 * 0.017453292F;
/*     */     
/* 137 */     this.k.d = f3;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */