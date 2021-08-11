/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eah
/*     */   implements eag
/*     */ {
/*     */   private final eag.a a;
/*  12 */   private final eag.a b = eag.a(new dfh(256));
/*     */   
/*  14 */   private int c = 255;
/*  15 */   private int d = 255;
/*  16 */   private int e = 255;
/*  17 */   private int f = 255;
/*     */   
/*     */   public eah(eag.a ☃) {
/*  20 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public dfq getBuffer(eao ☃) {
/*  25 */     if (☃.z()) {
/*  26 */       dfq dfq1 = this.b.getBuffer(☃);
/*  27 */       return new a(dfq1, this.c, this.d, this.e, this.f);
/*     */     } 
/*  29 */     dfq dfq = this.a.getBuffer(☃);
/*  30 */     Optional<eao> optional = ☃.y();
/*  31 */     if (optional.isPresent()) {
/*  32 */       dfq dfq1 = this.b.getBuffer(optional.get());
/*  33 */       a a1 = new a(dfq1, this.c, this.d, this.e, this.f);
/*  34 */       return dft.a(a1, dfq);
/*     */     } 
/*  36 */     return dfq;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, int k) {
/*  40 */     this.c = ☃;
/*  41 */     this.d = i;
/*  42 */     this.e = j;
/*  43 */     this.f = k;
/*     */   }
/*     */   
/*     */   public void a() {
/*  47 */     this.b.a();
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */     extends dfl
/*     */   {
/*     */     private final dfq g;
/*     */     private double h;
/*     */     private double i;
/*     */     private double j;
/*     */     private float k;
/*     */     private float l;
/*     */     
/*     */     private a(dfq ☃, int i, int j, int k, int m) {
/*  62 */       this.g = ☃;
/*  63 */       super.b(i, j, k, m);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void b(int ☃, int i, int j, int k) {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public dfq a(double ☃, double d1, double d2) {
/*  76 */       this.h = ☃;
/*  77 */       this.i = d1;
/*  78 */       this.j = d2;
/*  79 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public dfq a(int ☃, int i, int j, int k) {
/*  84 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public dfq a(float ☃, float f1) {
/*  89 */       this.k = ☃;
/*  90 */       this.l = f1;
/*  91 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public dfq a(int ☃, int i) {
/*  96 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public dfq b(int ☃, int i) {
/* 101 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public dfq b(float ☃, float f1, float f2) {
/* 106 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(float ☃, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int j, float f9, float f10, float f11) {
/* 111 */       this.g.a(☃, f1, f2).a(this.b, this.c, this.d, this.e).a(f7, f8).d();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 116 */       this.g.a(this.h, this.i, this.j).a(this.b, this.c, this.d, this.e).a(this.k, this.l).d();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */