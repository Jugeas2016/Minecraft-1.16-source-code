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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dux<T extends aqa>
/*     */   extends dtf<T>
/*     */ {
/*     */   protected final dwn a;
/*     */   protected final dwn b;
/*     */   protected final dwn f;
/*     */   protected final dwn g;
/*     */   protected final dwn h;
/*     */   protected final dwn i;
/*     */   protected final dwn j;
/*     */   protected final dwn k;
/*  41 */   protected int l = 1;
/*     */   
/*     */   public dux(float ☃) {
/*  44 */     super(true, 10.0F, 4.0F);
/*  45 */     this.j = new dwn(this);
/*  46 */     this.j.a("main", -2.5F, -2.0F, -3.0F, 5, 4, 5, ☃, 0, 0);
/*  47 */     this.j.a("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2, ☃, 0, 24);
/*  48 */     this.j.a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, ☃, 0, 10);
/*  49 */     this.j.a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, ☃, 6, 10);
/*  50 */     this.j.a(0.0F, 15.0F, -9.0F);
/*     */     
/*  52 */     this.k = new dwn(this, 20, 0);
/*  53 */     this.k.a(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, ☃);
/*  54 */     this.k.a(0.0F, 12.0F, -10.0F);
/*     */     
/*  56 */     this.h = new dwn(this, 0, 15);
/*  57 */     this.h.a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, ☃);
/*  58 */     this.h.d = 0.9F;
/*  59 */     this.h.a(0.0F, 15.0F, 8.0F);
/*     */     
/*  61 */     this.i = new dwn(this, 4, 15);
/*  62 */     this.i.a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, ☃);
/*  63 */     this.i.a(0.0F, 20.0F, 14.0F);
/*     */     
/*  65 */     this.a = new dwn(this, 8, 13);
/*  66 */     this.a.a(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, ☃);
/*  67 */     this.a.a(1.1F, 18.0F, 5.0F);
/*     */     
/*  69 */     this.b = new dwn(this, 8, 13);
/*  70 */     this.b.a(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, ☃);
/*  71 */     this.b.a(-1.1F, 18.0F, 5.0F);
/*     */     
/*  73 */     this.f = new dwn(this, 40, 0);
/*  74 */     this.f.a(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, ☃);
/*  75 */     this.f.a(1.2F, 14.1F, -5.0F);
/*     */     
/*  77 */     this.g = new dwn(this, 40, 0);
/*  78 */     this.g.a(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, ☃);
/*  79 */     this.g.a(-1.2F, 14.1F, -5.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> a() {
/*  84 */     return (Iterable<dwn>)ImmutableList.of(this.j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/*  89 */     return (Iterable<dwn>)ImmutableList.of(this.k, this.a, this.b, this.f, this.g, this.h, this.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  94 */     this.j.d = f5 * 0.017453292F;
/*  95 */     this.j.e = f4 * 0.017453292F;
/*     */     
/*  97 */     if (this.l != 3) {
/*  98 */       this.k.d = 1.5707964F;
/*  99 */       if (this.l == 2) {
/* 100 */         this.a.d = afm.b(f1 * 0.6662F) * f2;
/* 101 */         this.b.d = afm.b(f1 * 0.6662F + 0.3F) * f2;
/* 102 */         this.f.d = afm.b(f1 * 0.6662F + 3.1415927F + 0.3F) * f2;
/* 103 */         this.g.d = afm.b(f1 * 0.6662F + 3.1415927F) * f2;
/* 104 */         this.i.d = 1.7278761F + 0.31415927F * afm.b(f1) * f2;
/*     */       } else {
/* 106 */         this.a.d = afm.b(f1 * 0.6662F) * f2;
/* 107 */         this.b.d = afm.b(f1 * 0.6662F + 3.1415927F) * f2;
/* 108 */         this.f.d = afm.b(f1 * 0.6662F + 3.1415927F) * f2;
/* 109 */         this.g.d = afm.b(f1 * 0.6662F) * f2;
/*     */         
/* 111 */         if (this.l == 1) {
/* 112 */           this.i.d = 1.7278761F + 0.7853982F * afm.b(f1) * f2;
/*     */         } else {
/* 114 */           this.i.d = 1.7278761F + 0.47123894F * afm.b(f1) * f2;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3) {
/* 122 */     this.k.b = 12.0F;
/* 123 */     this.k.c = -10.0F;
/* 124 */     this.j.b = 15.0F;
/* 125 */     this.j.c = -9.0F;
/* 126 */     this.h.b = 15.0F;
/* 127 */     this.h.c = 8.0F;
/* 128 */     this.i.b = 20.0F;
/* 129 */     this.i.c = 14.0F;
/* 130 */     this.f.b = 14.1F;
/* 131 */     this.f.c = -5.0F;
/* 132 */     this.g.b = 14.1F;
/* 133 */     this.g.c = -5.0F;
/* 134 */     this.a.b = 18.0F;
/* 135 */     this.a.c = 5.0F;
/* 136 */     this.b.b = 18.0F;
/* 137 */     this.b.c = 5.0F;
/* 138 */     this.h.d = 0.9F;
/*     */     
/* 140 */     if (☃.bz()) {
/* 141 */       this.k.b++;
/* 142 */       this.j.b += 2.0F;
/* 143 */       this.h.b++;
/* 144 */       this.i.b += -4.0F;
/* 145 */       this.i.c += 2.0F;
/* 146 */       this.h.d = 1.5707964F;
/* 147 */       this.i.d = 1.5707964F;
/* 148 */       this.l = 0;
/* 149 */     } else if (☃.bA()) {
/* 150 */       this.i.b = this.h.b;
/* 151 */       this.i.c += 2.0F;
/* 152 */       this.h.d = 1.5707964F;
/* 153 */       this.i.d = 1.5707964F;
/* 154 */       this.l = 2;
/*     */     } else {
/* 156 */       this.l = 1;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dux.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */