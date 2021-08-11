/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Iterables;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dwc<T extends bax>
/*     */   extends dvi<T>
/*     */ {
/*     */   private final dwn j;
/*     */   
/*     */   public dwc(float ☃) {
/*  15 */     super(12, ☃, true, 120.0F, 0.0F, 9.0F, 6.0F, 120);
/*     */     
/*  17 */     this.r = 128;
/*  18 */     this.s = 64;
/*     */     
/*  20 */     this.a = new dwn(this, 3, 0);
/*  21 */     this.a.a(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F);
/*  22 */     this.a.a(0.0F, 19.0F, -10.0F);
/*     */     
/*  24 */     this.b = new dwn(this);
/*  25 */     this.b.a(7, 37).a(-9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F, 0.0F);
/*  26 */     this.b.a(31, 1).a(-5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F, 0.0F);
/*  27 */     this.b.a(0.0F, 11.0F, -10.0F);
/*     */     
/*  29 */     this.j = new dwn(this);
/*  30 */     this.j.a(70, 33).a(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F, 0.0F);
/*  31 */     this.j.a(0.0F, 11.0F, -10.0F);
/*     */     
/*  33 */     int i = 1;
/*  34 */     this.f = new dwn(this, 1, 23);
/*  35 */     this.f.a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
/*  36 */     this.f.a(-3.5F, 22.0F, 11.0F);
/*     */     
/*  38 */     this.g = new dwn(this, 1, 12);
/*  39 */     this.g.a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
/*  40 */     this.g.a(3.5F, 22.0F, 11.0F);
/*     */     
/*  42 */     this.h = new dwn(this, 27, 30);
/*  43 */     this.h.a(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
/*  44 */     this.h.a(-5.0F, 21.0F, -4.0F);
/*     */     
/*  46 */     this.i = new dwn(this, 27, 24);
/*  47 */     this.i.a(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
/*  48 */     this.i.a(5.0F, 21.0F, -4.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Iterable<dwn> b() {
/*  53 */     return Iterables.concat(super.b(), (Iterable)ImmutableList.of(this.j));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/*  58 */     super.a(☃, f1, f2, f3, f4, f5);
/*     */     
/*  60 */     this.f.d = afm.b(f1 * 0.6662F * 0.6F) * 0.5F * f2;
/*  61 */     this.g.d = afm.b(f1 * 0.6662F * 0.6F + 3.1415927F) * 0.5F * f2;
/*  62 */     this.h.f = afm.b(f1 * 0.6662F * 0.6F + 3.1415927F) * 0.5F * f2;
/*  63 */     this.i.f = afm.b(f1 * 0.6662F * 0.6F) * 0.5F * f2;
/*  64 */     this.h.d = 0.0F;
/*  65 */     this.i.d = 0.0F;
/*  66 */     this.h.e = 0.0F;
/*  67 */     this.i.e = 0.0F;
/*  68 */     this.f.e = 0.0F;
/*  69 */     this.g.e = 0.0F;
/*     */     
/*  71 */     this.j.d = 1.5707964F;
/*     */     
/*  73 */     if (!☃.aE() && ☃.ao()) {
/*  74 */       float f6 = ☃.eL() ? 4.0F : 1.0F;
/*  75 */       float f7 = ☃.eL() ? 2.0F : 1.0F;
/*  76 */       float f8 = 5.0F;
/*     */       
/*  78 */       this.h.e = afm.b(f6 * f1 * 5.0F + 3.1415927F) * 8.0F * f2 * f7;
/*  79 */       this.h.f = 0.0F;
/*  80 */       this.i.e = afm.b(f6 * f1 * 5.0F) * 8.0F * f2 * f7;
/*  81 */       this.i.f = 0.0F;
/*  82 */       this.f.e = afm.b(f1 * 5.0F + 3.1415927F) * 3.0F * f2;
/*  83 */       this.f.d = 0.0F;
/*  84 */       this.g.e = afm.b(f1 * 5.0F) * 3.0F * f2;
/*  85 */       this.g.d = 0.0F;
/*     */     } 
/*     */     
/*  88 */     this.j.h = (!this.e && ☃.eK());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/*  93 */     boolean bool = this.j.h;
/*  94 */     if (bool) {
/*  95 */       ☃.a();
/*  96 */       ☃.a(0.0D, -0.07999999821186066D, 0.0D);
/*     */     } 
/*  98 */     super.a(☃, dfq1, i, j, f1, f2, f3, f4);
/*  99 */     if (bool)
/* 100 */       ☃.b(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */