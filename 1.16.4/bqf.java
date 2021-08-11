/*     */ 
/*     */ 
/*     */ public class bqf
/*     */   extends bps
/*     */ {
/*     */   public final a a;
/*     */   
/*     */   public enum a
/*     */   {
/*  10 */     a("all", 1, 11),
/*  11 */     b("fire", 10, 8),
/*  12 */     c("fall", 5, 6),
/*  13 */     d("explosion", 5, 8),
/*  14 */     e("projectile", 3, 6);
/*     */     
/*     */     private final String f;
/*     */     private final int g;
/*     */     private final int h;
/*     */     
/*     */     a(String ☃, int i, int j) {
/*  21 */       this.f = ☃;
/*  22 */       this.g = i;
/*  23 */       this.h = j;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int b() {
/*  31 */       return this.g;
/*     */     }
/*     */     
/*     */     public int c() {
/*  35 */       return this.h;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public bqf(bps.a ☃, a a1, aqf... arrayOfAqf) {
/*  42 */     super(☃, (a1 == a.c) ? bpt.b : bpt.a, arrayOfAqf);
/*  43 */     this.a = a1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃) {
/*  48 */     return this.a.b() + (☃ - 1) * this.a.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(int ☃) {
/*  53 */     return a(☃) + this.a.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  58 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃, apk apk1) {
/*  63 */     if (apk1.h()) {
/*  64 */       return 0;
/*     */     }
/*     */     
/*  67 */     if (this.a == a.a) {
/*  68 */       return ☃;
/*     */     }
/*  70 */     if (this.a == a.b && apk1.p()) {
/*  71 */       return ☃ * 2;
/*     */     }
/*  73 */     if (this.a == a.c && apk1 == apk.k) {
/*  74 */       return ☃ * 3;
/*     */     }
/*  76 */     if (this.a == a.d && apk1.d()) {
/*  77 */       return ☃ * 2;
/*     */     }
/*  79 */     if (this.a == a.e && apk1.b()) {
/*  80 */       return ☃ * 2;
/*     */     }
/*  82 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bps ☃) {
/*  87 */     if (☃ instanceof bqf) {
/*  88 */       bqf bqf1 = (bqf)☃;
/*     */       
/*  90 */       if (this.a == bqf1.a) {
/*  91 */         return false;
/*     */       }
/*     */       
/*  94 */       return (this.a == a.c || bqf1.a == a.c);
/*     */     } 
/*  96 */     return super.a(☃);
/*     */   }
/*     */   
/*     */   public static int a(aqm ☃, int i) {
/* 100 */     int j = bpu.a(bpw.b, ☃);
/*     */     
/* 102 */     if (j > 0) {
/* 103 */       i -= afm.d(i * j * 0.15F);
/*     */     }
/*     */     
/* 106 */     return i;
/*     */   }
/*     */   
/*     */   public static double a(aqm ☃, double d) {
/* 110 */     int i = bpu.a(bpw.d, ☃);
/*     */     
/* 112 */     if (i > 0) {
/* 113 */       d -= afm.c(d * (i * 0.15F));
/*     */     }
/*     */     
/* 116 */     return d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bqf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */