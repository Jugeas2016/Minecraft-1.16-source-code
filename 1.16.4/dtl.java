/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dtl<T extends baa>
/*     */   extends dtf<T>
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
/*     */   private float n;
/*     */   
/*     */   public dtl() {
/*  26 */     super(false, 24.0F, 0.0F);
/*  27 */     this.r = 64;
/*  28 */     this.s = 64;
/*     */     
/*  30 */     this.a = new dwn(this);
/*  31 */     this.a.a(0.0F, 19.0F, 0.0F);
/*     */     
/*  33 */     this.b = new dwn(this, 0, 0);
/*  34 */     this.b.a(0.0F, 0.0F, 0.0F);
/*  35 */     this.a.b(this.b);
/*  36 */     this.b.a(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, 0.0F);
/*     */     
/*  38 */     this.k = new dwn(this, 26, 7);
/*  39 */     this.k.a(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F);
/*  40 */     this.b.b(this.k);
/*     */     
/*  42 */     this.l = new dwn(this, 2, 0);
/*  43 */     this.l.a(0.0F, -2.0F, -5.0F);
/*  44 */     this.l.a(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
/*     */     
/*  46 */     this.m = new dwn(this, 2, 3);
/*  47 */     this.m.a(0.0F, -2.0F, -5.0F);
/*  48 */     this.m.a(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
/*     */     
/*  50 */     this.b.b(this.l);
/*  51 */     this.b.b(this.m);
/*     */     
/*  53 */     this.f = new dwn(this, 0, 18);
/*  54 */     this.f.a(-1.5F, -4.0F, -3.0F);
/*  55 */     this.f.d = 0.0F;
/*  56 */     this.f.e = -0.2618F;
/*  57 */     this.f.f = 0.0F;
/*     */     
/*  59 */     this.a.b(this.f);
/*  60 */     this.f.a(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
/*     */     
/*  62 */     this.g = new dwn(this, 0, 18);
/*  63 */     this.g.a(1.5F, -4.0F, -3.0F);
/*  64 */     this.g.d = 0.0F;
/*  65 */     this.g.e = 0.2618F;
/*  66 */     this.g.f = 0.0F;
/*  67 */     this.g.g = true;
/*  68 */     this.a.b(this.g);
/*  69 */     this.g.a(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
/*     */     
/*  71 */     this.h = new dwn(this);
/*  72 */     this.h.a(1.5F, 3.0F, -2.0F);
/*  73 */     this.a.b(this.h);
/*  74 */     this.h.a("frontLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 1);
/*     */     
/*  76 */     this.i = new dwn(this);
/*  77 */     this.i.a(1.5F, 3.0F, 0.0F);
/*  78 */     this.a.b(this.i);
/*  79 */     this.i.a("midLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 3);
/*     */     
/*  81 */     this.j = new dwn(this);
/*  82 */     this.j.a(1.5F, 3.0F, 2.0F);
/*  83 */     this.a.b(this.j);
/*  84 */     this.j.a("backLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 5);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3) {
/*  89 */     super.a(☃, f1, f2, f3);
/*     */     
/*  91 */     this.n = ☃.y(f3);
/*     */ 
/*     */     
/*  94 */     this.k.h = !☃.eY();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  99 */     this.f.d = 0.0F;
/* 100 */     this.l.d = 0.0F;
/* 101 */     this.m.d = 0.0F;
/* 102 */     this.a.d = 0.0F;
/* 103 */     this.a.b = 19.0F;
/*     */     
/* 105 */     boolean bool = (☃.ao() && ☃.cC().g() < 1.0E-7D);
/* 106 */     if (bool) {
/* 107 */       this.f.e = -0.2618F;
/* 108 */       this.f.f = 0.0F;
/* 109 */       this.g.d = 0.0F;
/* 110 */       this.g.e = 0.2618F;
/* 111 */       this.g.f = 0.0F;
/*     */       
/* 113 */       this.h.d = 0.0F;
/* 114 */       this.i.d = 0.0F;
/* 115 */       this.j.d = 0.0F;
/*     */     } else {
/* 117 */       float f = f3 * 2.1F;
/* 118 */       this.f.e = 0.0F;
/* 119 */       this.f.f = afm.b(f) * 3.1415927F * 0.15F;
/*     */       
/* 121 */       this.g.d = this.f.d;
/* 122 */       this.g.e = this.f.e;
/* 123 */       this.g.f = -this.f.f;
/*     */       
/* 125 */       this.h.d = 0.7853982F;
/* 126 */       this.i.d = 0.7853982F;
/* 127 */       this.j.d = 0.7853982F;
/*     */       
/* 129 */       this.a.d = 0.0F;
/* 130 */       this.a.e = 0.0F;
/* 131 */       this.a.f = 0.0F;
/*     */     } 
/*     */     
/* 134 */     if (!☃.H_()) {
/* 135 */       this.a.d = 0.0F;
/* 136 */       this.a.e = 0.0F;
/* 137 */       this.a.f = 0.0F;
/*     */ 
/*     */       
/* 140 */       if (!bool) {
/* 141 */         float f = afm.b(f3 * 0.18F);
/* 142 */         this.a.d = 0.1F + f * 3.1415927F * 0.025F;
/*     */         
/* 144 */         this.l.d = f * 3.1415927F * 0.03F;
/* 145 */         this.m.d = f * 3.1415927F * 0.03F;
/*     */         
/* 147 */         this.h.d = -f * 3.1415927F * 0.1F + 0.3926991F;
/* 148 */         this.j.d = -f * 3.1415927F * 0.05F + 0.7853982F;
/*     */         
/* 150 */         this.a.b = 19.0F - afm.b(f3 * 0.18F) * 0.9F;
/*     */       } 
/*     */     } 
/*     */     
/* 154 */     if (this.n > 0.0F) {
/* 155 */       this.a.d = duw.a(this.a.d, 3.0915928F, this.n);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> a() {
/* 161 */     return (Iterable<dwn>)ImmutableList.of();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/* 166 */     return (Iterable<dwn>)ImmutableList.of(this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */