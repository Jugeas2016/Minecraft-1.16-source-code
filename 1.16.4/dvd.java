/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dvd<T extends aqm>
/*     */   extends dum<T>
/*     */ {
/*  18 */   private List<dwn> a = Lists.newArrayList();
/*     */   
/*     */   public final dwn t;
/*     */   public final dwn u;
/*     */   public final dwn v;
/*     */   public final dwn w;
/*     */   public final dwn x;
/*     */   private final dwn b;
/*     */   private final dwn y;
/*     */   private final boolean z;
/*     */   
/*     */   public dvd(float ☃, boolean bool) {
/*  30 */     super(eao::h, ☃, 0.0F, 64, 64);
/*  31 */     this.z = bool;
/*     */     
/*  33 */     this.y = new dwn(this, 24, 0);
/*  34 */     this.y.a(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, ☃);
/*     */     
/*  36 */     this.b = new dwn(this, 0, 0);
/*  37 */     this.b.b(64, 32);
/*  38 */     this.b.a(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, ☃);
/*     */     
/*  40 */     if (bool) {
/*  41 */       this.j = new dwn(this, 32, 48);
/*  42 */       this.j.a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, ☃);
/*  43 */       this.j.a(5.0F, 2.5F, 0.0F);
/*     */       
/*  45 */       this.i = new dwn(this, 40, 16);
/*  46 */       this.i.a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, ☃);
/*  47 */       this.i.a(-5.0F, 2.5F, 0.0F);
/*     */       
/*  49 */       this.t = new dwn(this, 48, 48);
/*  50 */       this.t.a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, ☃ + 0.25F);
/*  51 */       this.t.a(5.0F, 2.5F, 0.0F);
/*     */       
/*  53 */       this.u = new dwn(this, 40, 32);
/*  54 */       this.u.a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, ☃ + 0.25F);
/*  55 */       this.u.a(-5.0F, 2.5F, 10.0F);
/*     */     } else {
/*  57 */       this.j = new dwn(this, 32, 48);
/*  58 */       this.j.a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*  59 */       this.j.a(5.0F, 2.0F, 0.0F);
/*     */ 
/*     */       
/*  62 */       this.t = new dwn(this, 48, 48);
/*  63 */       this.t.a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃ + 0.25F);
/*  64 */       this.t.a(5.0F, 2.0F, 0.0F);
/*     */       
/*  66 */       this.u = new dwn(this, 40, 32);
/*  67 */       this.u.a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃ + 0.25F);
/*  68 */       this.u.a(-5.0F, 2.0F, 10.0F);
/*     */     } 
/*     */     
/*  71 */     this.l = new dwn(this, 16, 48);
/*  72 */     this.l.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*  73 */     this.l.a(1.9F, 12.0F, 0.0F);
/*     */     
/*  75 */     this.v = new dwn(this, 0, 48);
/*  76 */     this.v.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃ + 0.25F);
/*  77 */     this.v.a(1.9F, 12.0F, 0.0F);
/*     */     
/*  79 */     this.w = new dwn(this, 0, 32);
/*  80 */     this.w.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃ + 0.25F);
/*  81 */     this.w.a(-1.9F, 12.0F, 0.0F);
/*     */     
/*  83 */     this.x = new dwn(this, 16, 32);
/*  84 */     this.x.a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, ☃ + 0.25F);
/*  85 */     this.x.a(0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/*  90 */     return Iterables.concat(super.b(), (Iterable)ImmutableList.of(this.v, this.w, this.t, this.u, this.x));
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, dfq dfq1, int i, int j) {
/*  94 */     this.y.a(this.f);
/*  95 */     this.y.a = 0.0F;
/*  96 */     this.y.b = 0.0F;
/*  97 */     this.y.a(☃, dfq1, i, j);
/*     */   }
/*     */   
/*     */   public void b(dfm ☃, dfq dfq1, int i, int j) {
/* 101 */     this.b.a(☃, dfq1, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 106 */     super.a(☃, f1, f2, f3, f4, f5);
/*     */     
/* 108 */     this.v.a(this.l);
/* 109 */     this.w.a(this.k);
/* 110 */     this.t.a(this.j);
/* 111 */     this.u.a(this.i);
/* 112 */     this.x.a(this.h);
/*     */     
/* 114 */     if (☃.b(aqf.e).a()) {
/* 115 */       if (☃.bz()) {
/* 116 */         this.b.c = 1.4F;
/* 117 */         this.b.b = 1.85F;
/*     */       } else {
/* 119 */         this.b.c = 0.0F;
/* 120 */         this.b.b = 0.0F;
/*     */       }
/*     */     
/* 123 */     } else if (☃.bz()) {
/* 124 */       this.b.c = 0.3F;
/* 125 */       this.b.b = 0.8F;
/*     */     } else {
/* 127 */       this.b.c = -1.1F;
/* 128 */       this.b.b = -0.85F;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d_(boolean ☃) {
/* 135 */     super.d_(☃);
/* 136 */     this.t.h = ☃;
/* 137 */     this.u.h = ☃;
/* 138 */     this.v.h = ☃;
/* 139 */     this.w.h = ☃;
/* 140 */     this.x.h = ☃;
/* 141 */     this.b.h = ☃;
/* 142 */     this.y.h = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqi ☃, dfm dfm1) {
/* 147 */     dwn dwn1 = a(☃);
/* 148 */     if (this.z) {
/* 149 */       float f = 0.5F * ((☃ == aqi.b) ? true : -1);
/* 150 */       dwn1.a += f;
/* 151 */       dwn1.a(dfm1);
/* 152 */       dwn1.a -= f;
/*     */     } else {
/* 154 */       dwn1.a(dfm1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public dwn a(Random ☃) {
/* 159 */     return this.a.get(☃.nextInt(this.a.size()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dwn ☃) {
/* 164 */     if (this.a == null) {
/* 165 */       this.a = Lists.newArrayList();
/*     */     }
/* 167 */     this.a.add(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */