/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dus<T extends bba>
/*     */   extends duc<T>
/*     */ {
/*     */   private final dwn a;
/*     */   private final dwn b;
/*     */   private final dwn f;
/*     */   private final dwn g;
/*     */   private final dwn h;
/*     */   private final dwn i;
/*     */   private final dwn j;
/*     */   private final dwn k;
/*     */   
/*     */   public dus(float ☃) {
/*  22 */     this.r = 128;
/*  23 */     this.s = 64;
/*     */     
/*  25 */     this.a = new dwn(this, 0, 0);
/*  26 */     this.a.a(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, ☃);
/*  27 */     this.a.a(0.0F, 7.0F, -6.0F);
/*     */     
/*  29 */     this.a.a(0, 14).a(-4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, ☃);
/*  30 */     this.a.a(17, 0).a(-4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, ☃);
/*  31 */     this.a.a(17, 0).a(1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, ☃);
/*     */     
/*  33 */     this.b = new dwn(this, 29, 0);
/*  34 */     this.b.a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, ☃);
/*  35 */     this.b.a(0.0F, 5.0F, 2.0F);
/*     */     
/*  37 */     this.j = new dwn(this, 45, 28);
/*  38 */     this.j.a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, ☃);
/*  39 */     this.j.a(-8.5F, 3.0F, 3.0F);
/*  40 */     this.j.e = 1.5707964F;
/*     */     
/*  42 */     this.k = new dwn(this, 45, 41);
/*  43 */     this.k.a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, ☃);
/*  44 */     this.k.a(5.5F, 3.0F, 3.0F);
/*  45 */     this.k.e = 1.5707964F;
/*     */     
/*  47 */     int i = 4;
/*  48 */     int j = 14;
/*  49 */     this.f = new dwn(this, 29, 29);
/*  50 */     this.f.a(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, ☃);
/*  51 */     this.f.a(-2.5F, 10.0F, 6.0F);
/*     */     
/*  53 */     this.g = new dwn(this, 29, 29);
/*  54 */     this.g.a(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, ☃);
/*  55 */     this.g.a(2.5F, 10.0F, 6.0F);
/*     */     
/*  57 */     this.h = new dwn(this, 29, 29);
/*  58 */     this.h.a(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, ☃);
/*  59 */     this.h.a(-2.5F, 10.0F, -4.0F);
/*     */     
/*  61 */     this.i = new dwn(this, 29, 29);
/*  62 */     this.i.a(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, ☃);
/*  63 */     this.i.a(2.5F, 10.0F, -4.0F);
/*     */     
/*  65 */     this.f.a--;
/*  66 */     this.g.a++;
/*  67 */     this.f.c += 0.0F;
/*  68 */     this.g.c += 0.0F;
/*  69 */     this.h.a--;
/*  70 */     this.i.a++;
/*  71 */     this.h.c--;
/*  72 */     this.i.c--;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  77 */     this.a.d = f5 * 0.017453292F;
/*  78 */     this.a.e = f4 * 0.017453292F;
/*  79 */     this.b.d = 1.5707964F;
/*     */     
/*  81 */     this.f.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/*  82 */     this.g.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/*  83 */     this.h.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/*  84 */     this.i.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/*  85 */     boolean bool = (!☃.w_() && ☃.eM());
/*  86 */     this.j.h = bool;
/*  87 */     this.k.h = bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/*  92 */     if (this.e) {
/*  93 */       float f5 = 2.0F;
/*  94 */       ☃.a();
/*  95 */       float f6 = 0.7F;
/*  96 */       ☃.a(0.71428573F, 0.64935064F, 0.7936508F);
/*  97 */       ☃.a(0.0D, 1.3125D, 0.2199999988079071D);
/*  98 */       this.a.a(☃, dfq1, i, j, f1, f2, f3, f4);
/*     */       
/* 100 */       ☃.b();
/* 101 */       ☃.a();
/* 102 */       float f7 = 1.1F;
/* 103 */       ☃.a(0.625F, 0.45454544F, 0.45454544F);
/* 104 */       ☃.a(0.0D, 2.0625D, 0.0D);
/* 105 */       this.b.a(☃, dfq1, i, j, f1, f2, f3, f4);
/*     */       
/* 107 */       ☃.b();
/* 108 */       ☃.a();
/* 109 */       ☃.a(0.45454544F, 0.41322312F, 0.45454544F);
/* 110 */       ☃.a(0.0D, 2.0625D, 0.0D);
/* 111 */       ImmutableList.of(this.f, this.g, this.h, this.i, this.j, this.k).forEach(dwn1 -> dwn1.a(☃, dfq1, i, j, f1, f2, f3, f4));
/* 112 */       ☃.b();
/*     */     } else {
/* 114 */       ImmutableList.of(this.a, this.b, this.f, this.g, this.h, this.i, this.j, this.k).forEach(dwn1 -> dwn1.a(☃, dfq1, i, j, f1, f2, f3, f4));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */