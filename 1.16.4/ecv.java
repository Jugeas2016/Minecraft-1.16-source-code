/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.world.level.ColorResolver;
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
/*     */ public class ecv
/*     */   implements bra
/*     */ {
/*     */   protected final int a;
/*     */   protected final int b;
/*     */   protected final fx c;
/*     */   protected final int d;
/*     */   protected final int e;
/*     */   protected final int f;
/*     */   protected final cgh[][] g;
/*     */   protected final ceh[] h;
/*     */   protected final cux[] i;
/*     */   protected final brx j;
/*     */   
/*     */   @Nullable
/*     */   public static ecv a(brx ☃, fx fx1, fx fx2, int i) {
/*  31 */     int j = fx1.u() - i >> 4;
/*  32 */     int k = fx1.w() - i >> 4;
/*  33 */     int m = fx2.u() + i >> 4;
/*  34 */     int n = fx2.w() + i >> 4;
/*     */     
/*  36 */     cgh[][] arrayOfCgh = new cgh[m - j + 1][n - k + 1];
/*     */     int i1;
/*  38 */     for (i1 = j; i1 <= m; i1++) {
/*  39 */       for (int i2 = k; i2 <= n; i2++) {
/*  40 */         arrayOfCgh[i1 - j][i2 - k] = ☃.d(i1, i2);
/*     */       }
/*     */     } 
/*     */     
/*  44 */     if (a(fx1, fx2, j, k, arrayOfCgh)) {
/*  45 */       return null;
/*     */     }
/*     */     
/*  48 */     i1 = 1;
/*  49 */     fx fx3 = fx1.b(-1, -1, -1);
/*  50 */     fx fx4 = fx2.b(1, 1, 1);
/*  51 */     return new ecv(☃, j, k, arrayOfCgh, fx3, fx4);
/*     */   }
/*     */   
/*     */   public static boolean a(fx ☃, fx fx1, int i, int j, cgh[][] arrayOfCgh) {
/*  55 */     for (int k = ☃.u() >> 4; k <= fx1.u() >> 4; k++) {
/*  56 */       for (int m = ☃.w() >> 4; m <= fx1.w() >> 4; m++) {
/*  57 */         cgh cgh1 = arrayOfCgh[k - i][m - j];
/*  58 */         if (!cgh1.a(☃.v(), fx1.v())) {
/*  59 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*  63 */     return true;
/*     */   }
/*     */   
/*     */   public ecv(brx ☃, int i, int j, cgh[][] arrayOfCgh, fx fx1, fx fx2) {
/*  67 */     this.j = ☃;
/*  68 */     this.a = i;
/*  69 */     this.b = j;
/*  70 */     this.g = arrayOfCgh;
/*  71 */     this.c = fx1;
/*     */     
/*  73 */     this.d = fx2.u() - fx1.u() + 1;
/*  74 */     this.e = fx2.v() - fx1.v() + 1;
/*  75 */     this.f = fx2.w() - fx1.w() + 1;
/*  76 */     this.h = new ceh[this.d * this.e * this.f];
/*  77 */     this.i = new cux[this.d * this.e * this.f];
/*     */     
/*  79 */     for (fx fx3 : fx.a(fx1, fx2)) {
/*  80 */       int k = (fx3.u() >> 4) - i;
/*  81 */       int m = (fx3.w() >> 4) - j;
/*     */       
/*  83 */       cgh cgh1 = arrayOfCgh[k][m];
/*  84 */       int n = a(fx3);
/*  85 */       this.h[n] = cgh1.d_(fx3);
/*  86 */       this.i[n] = cgh1.b(fx3);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected final int a(fx ☃) {
/*  91 */     return a(☃.u(), ☃.v(), ☃.w());
/*     */   }
/*     */   
/*     */   protected int a(int ☃, int i, int j) {
/*  95 */     int k = ☃ - this.c.u();
/*  96 */     int m = i - this.c.v();
/*  97 */     int n = j - this.c.w();
/*  98 */     return n * this.d * this.e + m * this.d + k;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh d_(fx ☃) {
/* 103 */     return this.h[a(☃)];
/*     */   }
/*     */ 
/*     */   
/*     */   public cux b(fx ☃) {
/* 108 */     return this.i[a(☃)];
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(gc ☃, boolean bool) {
/* 113 */     return this.j.a(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public cuo e() {
/* 118 */     return this.j.e();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj c(fx ☃) {
/* 124 */     return a(☃, cgh.a.a);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ccj a(fx ☃, cgh.a a1) {
/* 129 */     int i = (☃.u() >> 4) - this.a;
/* 130 */     int j = (☃.w() >> 4) - this.b;
/*     */     
/* 132 */     return this.g[i][j].a(☃, a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(fx ☃, ColorResolver colorResolver) {
/* 137 */     return this.j.a(☃, colorResolver);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */