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
/*     */ public class dfn
/*     */   extends dfl
/*     */ {
/*     */   private final dfq g;
/*     */   private final b h;
/*     */   private final a i;
/*     */   private float j;
/*     */   private float k;
/*     */   private float l;
/*     */   private int m;
/*     */   private int n;
/*     */   private int o;
/*     */   private float p;
/*     */   private float q;
/*     */   private float r;
/*     */   
/*     */   public dfn(dfq ☃, b b1, a a1) {
/*  30 */     this.g = ☃;
/*  31 */     this.h = b1.d();
/*  32 */     this.h.c();
/*  33 */     this.i = a1.d();
/*  34 */     this.i.f();
/*  35 */     a();
/*     */   }
/*     */   
/*     */   private void a() {
/*  39 */     this.j = 0.0F;
/*  40 */     this.k = 0.0F;
/*  41 */     this.l = 0.0F;
/*  42 */     this.m = 0;
/*  43 */     this.n = 10;
/*  44 */     this.o = 15728880;
/*  45 */     this.p = 0.0F;
/*  46 */     this.q = 1.0F;
/*  47 */     this.r = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  52 */     g ☃ = new g(this.p, this.q, this.r);
/*  53 */     ☃.a(this.i);
/*  54 */     gc gc = gc.a(☃.a(), ☃.b(), ☃.c());
/*     */     
/*  56 */     h h = new h(this.j, this.k, this.l, 1.0F);
/*  57 */     h.a(this.h);
/*     */ 
/*     */     
/*  60 */     h.a(g.d.a(180.0F));
/*  61 */     h.a(g.b.a(-90.0F));
/*     */     
/*  63 */     h.a(gc.b());
/*     */     
/*  65 */     float f1 = -h.a();
/*  66 */     float f2 = -h.b();
/*     */     
/*  68 */     this.g.a(this.j, this.k, this.l).a(1.0F, 1.0F, 1.0F, 1.0F).a(f1, f2).a(this.m, this.n).a(this.o).b(this.p, this.q, this.r).d();
/*  69 */     a();
/*     */   }
/*     */ 
/*     */   
/*     */   public dfq a(double ☃, double d1, double d2) {
/*  74 */     this.j = (float)☃;
/*  75 */     this.k = (float)d1;
/*  76 */     this.l = (float)d2;
/*  77 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public dfq a(int ☃, int i, int j, int k) {
/*  83 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public dfq a(float ☃, float f1) {
/*  89 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public dfq a(int ☃, int i) {
/*  94 */     this.m = ☃;
/*  95 */     this.n = i;
/*  96 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public dfq b(int ☃, int i) {
/* 101 */     this.o = ☃ | i << 16;
/* 102 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public dfq b(float ☃, float f1, float f2) {
/* 107 */     this.p = ☃;
/* 108 */     this.q = f1;
/* 109 */     this.r = f2;
/* 110 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */