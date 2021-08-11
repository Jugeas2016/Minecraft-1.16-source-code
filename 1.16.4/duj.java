/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class duj<T extends aqn & beo>
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
/*     */   
/*     */   public duj() {
/*  24 */     super(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F);
/*  25 */     this.r = 128;
/*  26 */     this.s = 64;
/*     */     
/*  28 */     this.g = new dwn(this);
/*  29 */     this.g.a(0.0F, 7.0F, 0.0F);
/*  30 */     this.g.a(1, 1).a(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F);
/*     */     
/*  32 */     this.l = new dwn(this);
/*  33 */     this.l.a(0.0F, -14.0F, -5.0F);
/*  34 */     this.l.a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, 0.001F);
/*  35 */     this.g.b(this.l);
/*     */     
/*  37 */     this.a = new dwn(this);
/*  38 */     this.a.a(0.0F, 2.0F, -12.0F);
/*  39 */     this.a.a(61, 1).a(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F);
/*     */     
/*  41 */     this.b = new dwn(this);
/*  42 */     this.b.a(-6.0F, -2.0F, -3.0F);
/*  43 */     this.b.a(1, 1).a(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
/*  44 */     this.b.f = -0.6981317F;
/*  45 */     this.a.b(this.b);
/*  46 */     this.f = new dwn(this);
/*  47 */     this.f.a(6.0F, -2.0F, -3.0F);
/*  48 */     this.f.a(1, 6).a(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
/*  49 */     this.f.f = 0.6981317F;
/*  50 */     this.a.b(this.f);
/*     */     
/*  52 */     dwn ☃ = new dwn(this);
/*  53 */     ☃.a(-7.0F, 2.0F, -12.0F);
/*  54 */     ☃.a(10, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
/*  55 */     this.a.b(☃);
/*  56 */     dwn dwn1 = new dwn(this);
/*  57 */     dwn1.a(7.0F, 2.0F, -12.0F);
/*  58 */     dwn1.a(1, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
/*  59 */     this.a.b(dwn1);
/*     */     
/*  61 */     this.a.d = 0.87266463F;
/*     */     
/*  63 */     int i = 14;
/*  64 */     int j = 11;
/*     */     
/*  66 */     this.h = new dwn(this);
/*  67 */     this.h.a(-4.0F, 10.0F, -8.5F);
/*  68 */     this.h.a(66, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
/*  69 */     this.i = new dwn(this);
/*  70 */     this.i.a(4.0F, 10.0F, -8.5F);
/*  71 */     this.i.a(41, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
/*     */     
/*  73 */     this.j = new dwn(this);
/*  74 */     this.j.a(-5.0F, 13.0F, 10.0F);
/*  75 */     this.j.a(21, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
/*  76 */     this.k = new dwn(this);
/*  77 */     this.k.a(5.0F, 13.0F, 10.0F);
/*  78 */     this.k.a(0, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> a() {
/*  83 */     return (Iterable<dwn>)ImmutableList.of(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/*  88 */     return (Iterable<dwn>)ImmutableList.of(this.g, this.h, this.i, this.j, this.k);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  93 */     this.b.f = -0.6981317F - f2 * afm.a(f1);
/*  94 */     this.f.f = 0.6981317F + f2 * afm.a(f1);
/*  95 */     this.a.e = f4 * 0.017453292F;
/*     */     
/*  97 */     int i = ((beo)☃).eM();
/*     */ 
/*     */     
/* 100 */     float f6 = 1.0F - afm.a(10 - 2 * i) / 10.0F;
/* 101 */     this.a.d = afm.g(f6, 0.87266463F, -0.34906584F);
/* 102 */     if (☃.w_()) {
/*     */       
/* 104 */       this.a.b = afm.g(f6, 2.0F, 5.0F);
/*     */       
/* 106 */       this.l.c = -3.0F;
/*     */     } else {
/*     */       
/* 109 */       this.a.b = 2.0F;
/* 110 */       this.l.c = -7.0F;
/*     */     } 
/*     */     
/* 113 */     float f7 = 1.2F;
/* 114 */     this.h.d = afm.b(f1) * 1.2F * f2;
/* 115 */     this.i.d = afm.b(f1 + 3.1415927F) * 1.2F * f2;
/* 116 */     this.j.d = this.i.d;
/* 117 */     this.k.d = this.h.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\duj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */