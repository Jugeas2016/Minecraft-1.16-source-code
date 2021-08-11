/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eat
/*     */ {
/*     */   protected final eae a;
/*     */   protected final brx b;
/*     */   protected int c;
/*     */   protected int d;
/*     */   protected int e;
/*     */   public ecu.c[] f;
/*     */   
/*     */   public eat(ecu ☃, brx brx1, int i, eae eae1) {
/*  19 */     this.a = eae1;
/*  20 */     this.b = brx1;
/*     */     
/*  22 */     a(i);
/*  23 */     a(☃);
/*     */   }
/*     */   
/*     */   protected void a(ecu ☃) {
/*  27 */     int i = this.d * this.c * this.e;
/*  28 */     this.f = new ecu.c[i];
/*     */     
/*  30 */     for (int j = 0; j < this.d; j++) {
/*  31 */       for (int k = 0; k < this.c; k++) {
/*  32 */         for (int m = 0; m < this.e; m++) {
/*  33 */           int n = a(j, k, m);
/*  34 */           ☃.getClass(); this.f[n] = new ecu.c(☃);
/*  35 */           this.f[n].a(j * 16, k * 16, m * 16);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/*  42 */     for (ecu.c ☃ : this.f) {
/*  43 */       ☃.d();
/*     */     }
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i, int j) {
/*  48 */     return (j * this.c + i) * this.d + ☃;
/*     */   }
/*     */   
/*     */   protected void a(int ☃) {
/*  52 */     int i = ☃ * 2 + 1;
/*  53 */     this.d = i;
/*  54 */     this.c = 16;
/*  55 */     this.e = i;
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1) {
/*  59 */     int i = afm.c(☃);
/*  60 */     int j = afm.c(d1);
/*     */     
/*  62 */     for (int k = 0; k < this.d; k++) {
/*  63 */       int m = this.d * 16;
/*     */       
/*  65 */       int n = i - 8 - m / 2;
/*  66 */       int i1 = n + Math.floorMod(k * 16 - n, m);
/*     */       
/*  68 */       for (int i2 = 0; i2 < this.e; i2++) {
/*  69 */         int i3 = this.e * 16;
/*     */         
/*  71 */         int i4 = j - 8 - i3 / 2;
/*  72 */         int i5 = i4 + Math.floorMod(i2 * 16 - i4, i3);
/*     */         
/*  74 */         for (int i6 = 0; i6 < this.c; i6++) {
/*  75 */           int i7 = i6 * 16;
/*     */           
/*  77 */           ecu.c c1 = this.f[a(k, i6, i2)];
/*     */           
/*  79 */           c1.a(i1, i7, i5);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool) {
/*  86 */     int k = Math.floorMod(☃, this.d);
/*  87 */     int m = Math.floorMod(i, this.c);
/*  88 */     int n = Math.floorMod(j, this.e);
/*     */     
/*  90 */     ecu.c c1 = this.f[a(k, m, n)];
/*  91 */     c1.a(bool);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected ecu.c a(fx ☃) {
/*  96 */     int i = afm.a(☃.u(), 16);
/*  97 */     int j = afm.a(☃.v(), 16);
/*  98 */     int k = afm.a(☃.w(), 16);
/*     */     
/* 100 */     if (j < 0 || j >= this.c) {
/* 101 */       return null;
/*     */     }
/*     */     
/* 104 */     i = afm.b(i, this.d);
/* 105 */     k = afm.b(k, this.e);
/*     */     
/* 107 */     return this.f[a(i, j, k)];
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */