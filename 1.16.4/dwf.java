/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dwf<T extends aqa>
/*     */   extends dur<T>
/*     */   implements dui, dwe
/*     */ {
/*     */   protected dwn a;
/*     */   protected dwn b;
/*     */   protected final dwn f;
/*     */   protected final dwn g;
/*     */   protected final dwn h;
/*     */   protected final dwn i;
/*     */   protected final dwn j;
/*     */   protected final dwn k;
/*     */   protected final dwn l;
/*     */   
/*     */   public dwf(float ☃) {
/*  21 */     this(☃, 64, 64);
/*     */   }
/*     */   
/*     */   public dwf(float ☃, int i, int j) {
/*  25 */     float f = 0.5F;
/*     */     
/*  27 */     this.a = (new dwn(this)).b(i, j);
/*  28 */     this.a.a(0.0F, 0.0F, 0.0F);
/*  29 */     this.a.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, ☃);
/*     */     
/*  31 */     this.b = (new dwn(this)).b(i, j);
/*  32 */     this.b.a(0.0F, 0.0F, 0.0F);
/*  33 */     this.b.a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, ☃ + 0.5F);
/*  34 */     this.a.b(this.b);
/*     */     
/*  36 */     this.f = (new dwn(this)).b(i, j);
/*  37 */     this.f.a(0.0F, 0.0F, 0.0F);
/*  38 */     this.f.a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, ☃);
/*  39 */     this.f.d = -1.5707964F;
/*  40 */     this.b.b(this.f);
/*     */     
/*  42 */     this.l = (new dwn(this)).b(i, j);
/*  43 */     this.l.a(0.0F, -2.0F, 0.0F);
/*  44 */     this.l.a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, ☃);
/*  45 */     this.a.b(this.l);
/*     */     
/*  47 */     this.g = (new dwn(this)).b(i, j);
/*  48 */     this.g.a(0.0F, 0.0F, 0.0F);
/*  49 */     this.g.a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, ☃);
/*     */     
/*  51 */     this.h = (new dwn(this)).b(i, j);
/*  52 */     this.h.a(0.0F, 0.0F, 0.0F);
/*  53 */     this.h.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, ☃ + 0.5F);
/*  54 */     this.g.b(this.h);
/*     */     
/*  56 */     this.i = (new dwn(this)).b(i, j);
/*  57 */     this.i.a(0.0F, 2.0F, 0.0F);
/*  58 */     this.i.a(44, 22).a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, ☃);
/*  59 */     this.i.a(44, 22).a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, ☃, true);
/*  60 */     this.i.a(40, 38).a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, ☃);
/*     */     
/*  62 */     this.j = (new dwn(this, 0, 22)).b(i, j);
/*  63 */     this.j.a(-2.0F, 12.0F, 0.0F);
/*  64 */     this.j.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*     */     
/*  66 */     this.k = (new dwn(this, 0, 22)).b(i, j);
/*  67 */     this.k.g = true;
/*  68 */     this.k.a(2.0F, 12.0F, 0.0F);
/*  69 */     this.k.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<dwn> a() {
/*  74 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.g, this.j, this.k, this.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  79 */     boolean bool = false;
/*  80 */     if (☃ instanceof bfe) {
/*  81 */       bool = (((bfe)☃).eK() > 0);
/*     */     }
/*     */     
/*  84 */     this.a.e = f4 * 0.017453292F;
/*  85 */     this.a.d = f5 * 0.017453292F;
/*     */     
/*  87 */     if (bool) {
/*  88 */       this.a.f = 0.3F * afm.a(0.45F * f3);
/*  89 */       this.a.d = 0.4F;
/*     */     } else {
/*  91 */       this.a.f = 0.0F;
/*     */     } 
/*     */     
/*  94 */     this.i.b = 3.0F;
/*  95 */     this.i.c = -1.0F;
/*  96 */     this.i.d = -0.75F;
/*     */     
/*  98 */     this.j.d = afm.b(f1 * 0.6662F) * 1.4F * f2 * 0.5F;
/*  99 */     this.k.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2 * 0.5F;
/* 100 */     this.j.e = 0.0F;
/* 101 */     this.k.e = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public dwn c() {
/* 106 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 111 */     this.a.h = ☃;
/* 112 */     this.b.h = ☃;
/* 113 */     this.f.h = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */