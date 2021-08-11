/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Iterables;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dtj
/*     */   extends dti
/*     */ {
/*     */   private final dwn a;
/*     */   private final dwn b;
/*     */   private final dwn t;
/*     */   private final dwn u;
/*     */   
/*     */   public dtj() {
/*  18 */     this(0.0F);
/*     */   }
/*     */   
/*     */   public dtj(float ☃) {
/*  22 */     super(☃, 64, 64);
/*     */     
/*  24 */     this.f = new dwn(this, 0, 0);
/*  25 */     this.f.a(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, ☃);
/*  26 */     this.f.a(0.0F, 0.0F, 0.0F);
/*     */     
/*  28 */     this.h = new dwn(this, 0, 26);
/*  29 */     this.h.a(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F, ☃);
/*  30 */     this.h.a(0.0F, 0.0F, 0.0F);
/*     */     
/*  32 */     this.i = new dwn(this, 24, 0);
/*  33 */     this.i.a(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, ☃);
/*  34 */     this.i.a(-5.0F, 2.0F, 0.0F);
/*     */     
/*  36 */     this.j = new dwn(this, 32, 16);
/*  37 */     this.j.g = true;
/*  38 */     this.j.a(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, ☃);
/*  39 */     this.j.a(5.0F, 2.0F, 0.0F);
/*     */     
/*  41 */     this.k = new dwn(this, 8, 0);
/*  42 */     this.k.a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, ☃);
/*  43 */     this.k.a(-1.9F, 12.0F, 0.0F);
/*     */     
/*  45 */     this.l = new dwn(this, 40, 16);
/*  46 */     this.l.g = true;
/*  47 */     this.l.a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, ☃);
/*  48 */     this.l.a(1.9F, 12.0F, 0.0F);
/*     */     
/*  50 */     this.a = new dwn(this, 16, 0);
/*  51 */     this.a.a(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, ☃);
/*  52 */     this.a.a(0.0F, 0.0F, 0.0F);
/*  53 */     this.a.h = true;
/*     */     
/*  55 */     this.b = new dwn(this, 48, 16);
/*  56 */     this.b.a(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, ☃);
/*  57 */     this.b.a(0.0F, 0.0F, 0.0F);
/*     */     
/*  59 */     this.t = new dwn(this, 0, 48);
/*  60 */     this.t.a(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F, ☃);
/*  61 */     this.t.a(0.0F, 0.0F, 0.0F);
/*     */     
/*  63 */     this.u = new dwn(this, 0, 32);
/*  64 */     this.u.a(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F, ☃);
/*  65 */     this.u.a(0.0F, 12.0F, 0.0F);
/*     */     
/*  67 */     this.g.h = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bcn ☃, float f1, float f2, float f3) {
/*  72 */     this.u.d = 0.0F;
/*  73 */     this.u.e = 0.017453292F * -afm.h(f3, ☃.r, ☃.p);
/*  74 */     this.u.f = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bcn ☃, float f1, float f2, float f3, float f4, float f5) {
/*  79 */     super.a(☃, f1, f2, f3, f4, f5);
/*     */     
/*  81 */     this.j.h = ☃.o();
/*  82 */     this.i.h = ☃.o();
/*  83 */     this.u.h = !☃.p();
/*     */     
/*  85 */     this.l.a(1.9F, 12.0F, 0.0F);
/*  86 */     this.k.a(-1.9F, 12.0F, 0.0F);
/*     */     
/*  88 */     this.a.d = 0.017453292F * ☃.t().b();
/*  89 */     this.a.e = 0.017453292F * ☃.t().c();
/*  90 */     this.a.f = 0.017453292F * ☃.t().d();
/*     */     
/*  92 */     this.b.d = 0.017453292F * ☃.t().b();
/*  93 */     this.b.e = 0.017453292F * ☃.t().c();
/*  94 */     this.b.f = 0.017453292F * ☃.t().d();
/*     */     
/*  96 */     this.t.d = 0.017453292F * ☃.t().b();
/*  97 */     this.t.e = 0.017453292F * ☃.t().c();
/*  98 */     this.t.f = 0.017453292F * ☃.t().d();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/* 103 */     return Iterables.concat(super.b(), (Iterable)ImmutableList.of(this.a, this.b, this.t, this.u));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqi ☃, dfm dfm1) {
/* 108 */     dwn dwn1 = a(☃);
/* 109 */     boolean bool = dwn1.h;
/* 110 */     dwn1.h = true;
/* 111 */     super.a(☃, dfm1);
/* 112 */     dwn1.h = bool;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */