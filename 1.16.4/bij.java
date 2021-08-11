/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bij
/*     */   extends bic
/*     */ {
/*     */   private final aon c;
/*     */   private final int d;
/*     */   
/*     */   private bij(bje<?> ☃, int i, bfv bfv1, int j) {
/*  15 */     this(☃, i, bfv1, new apa(9 * j), j);
/*     */   }
/*     */   
/*     */   public static bij a(int ☃, bfv bfv1) {
/*  19 */     return new bij(bje.a, ☃, bfv1, 1);
/*     */   }
/*     */   
/*     */   public static bij b(int ☃, bfv bfv1) {
/*  23 */     return new bij(bje.b, ☃, bfv1, 2);
/*     */   }
/*     */   
/*     */   public static bij c(int ☃, bfv bfv1) {
/*  27 */     return new bij(bje.c, ☃, bfv1, 3);
/*     */   }
/*     */   
/*     */   public static bij d(int ☃, bfv bfv1) {
/*  31 */     return new bij(bje.d, ☃, bfv1, 4);
/*     */   }
/*     */   
/*     */   public static bij e(int ☃, bfv bfv1) {
/*  35 */     return new bij(bje.e, ☃, bfv1, 5);
/*     */   }
/*     */   
/*     */   public static bij f(int ☃, bfv bfv1) {
/*  39 */     return new bij(bje.f, ☃, bfv1, 6);
/*     */   }
/*     */   
/*     */   public static bij a(int ☃, bfv bfv1, aon aon1) {
/*  43 */     return new bij(bje.c, ☃, bfv1, aon1, 3);
/*     */   }
/*     */   
/*     */   public static bij b(int ☃, bfv bfv1, aon aon1) {
/*  47 */     return new bij(bje.f, ☃, bfv1, aon1, 6);
/*     */   }
/*     */   
/*     */   public bij(bje<?> ☃, int i, bfv bfv1, aon aon1, int j) {
/*  51 */     super(☃, i);
/*  52 */     a(aon1, j * 9);
/*  53 */     this.c = aon1;
/*  54 */     this.d = j;
/*  55 */     aon1.c_(bfv1.e);
/*     */     
/*  57 */     int k = (this.d - 4) * 18;
/*     */     int m;
/*  59 */     for (m = 0; m < this.d; m++) {
/*  60 */       for (int n = 0; n < 9; n++) {
/*  61 */         a(new bjr(aon1, n + m * 9, 8 + n * 18, 18 + m * 18));
/*     */       }
/*     */     } 
/*     */     
/*  65 */     for (m = 0; m < 3; m++) {
/*  66 */       for (int n = 0; n < 9; n++) {
/*  67 */         a(new bjr(bfv1, n + m * 9 + 9, 8 + n * 18, 103 + m * 18 + k));
/*     */       }
/*     */     } 
/*  70 */     for (m = 0; m < 9; m++) {
/*  71 */       a(new bjr(bfv1, m, 8 + m * 18, 161 + k));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  77 */     return this.c.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/*  82 */     bmb bmb = bmb.b;
/*  83 */     bjr bjr = this.a.get(i);
/*  84 */     if (bjr != null && bjr.f()) {
/*  85 */       bmb bmb1 = bjr.e();
/*  86 */       bmb = bmb1.i();
/*     */       
/*  88 */       if (i < this.d * 9) {
/*  89 */         if (!a(bmb1, this.d * 9, this.a.size(), true)) {
/*  90 */           return bmb.b;
/*     */         }
/*     */       }
/*  93 */       else if (!a(bmb1, 0, this.d * 9, false)) {
/*  94 */         return bmb.b;
/*     */       } 
/*     */       
/*  97 */       if (bmb1.a()) {
/*  98 */         bjr.d(bmb.b);
/*     */       } else {
/* 100 */         bjr.d();
/*     */       } 
/*     */     } 
/* 103 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 108 */     super.b(☃);
/* 109 */     this.c.b_(☃);
/*     */   }
/*     */   
/*     */   public aon e() {
/* 113 */     return this.c;
/*     */   }
/*     */   
/*     */   public int f() {
/* 117 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */