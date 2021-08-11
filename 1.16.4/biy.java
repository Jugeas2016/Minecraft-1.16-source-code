/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class biy
/*     */   extends bic
/*     */ {
/*     */   private final aon c;
/*     */   private final bbb d;
/*     */   
/*     */   public biy(int ☃, bfv bfv1, aon aon1, bbb bbb1) {
/*  16 */     super(null, ☃);
/*  17 */     this.c = aon1;
/*  18 */     this.d = bbb1;
/*  19 */     int i = 3;
/*  20 */     aon1.c_(bfv1.e);
/*     */     
/*  22 */     int j = -18;
/*     */ 
/*     */     
/*  25 */     a(new bjr(this, aon1, 0, 8, 18, bbb1)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  28 */             return (☃.b() == bmd.lO && !f() && this.a.L_());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean b() {
/*  33 */             return this.a.L_();
/*     */           }
/*     */         });
/*     */     
/*  37 */     a(new bjr(this, aon1, 1, 8, 36, bbb1)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  40 */             return this.a.l(☃);
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean b() {
/*  45 */             return this.a.fs();
/*     */           }
/*     */ 
/*     */           
/*     */           public int a() {
/*  50 */             return 1;
/*     */           }
/*     */         });
/*     */     
/*  54 */     if (bbb1 instanceof bba && ((bba)bbb1).eM()) {
/*  55 */       for (int m = 0; m < 3; m++) {
/*  56 */         for (int n = 0; n < ((bba)bbb1).eU(); n++) {
/*  57 */           a(new bjr(aon1, 2 + n + m * ((bba)bbb1).eU(), 80 + n * 18, 18 + m * 18));
/*     */         }
/*     */       } 
/*     */     }
/*     */     int k;
/*  62 */     for (k = 0; k < 3; k++) {
/*  63 */       for (int m = 0; m < 9; m++) {
/*  64 */         a(new bjr(bfv1, m + k * 9 + 9, 8 + m * 18, 102 + k * 18 + -18));
/*     */       }
/*     */     } 
/*  67 */     for (k = 0; k < 9; k++) {
/*  68 */       a(new bjr(bfv1, k, 8 + k * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  74 */     return (this.c.a(☃) && this.d.aX() && this.d.g(☃) < 8.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/*  79 */     bmb bmb = bmb.b;
/*  80 */     bjr bjr = this.a.get(i);
/*  81 */     if (bjr != null && bjr.f()) {
/*  82 */       bmb bmb1 = bjr.e();
/*  83 */       bmb = bmb1.i();
/*     */       
/*  85 */       int j = this.c.Z_();
/*  86 */       if (i < j) {
/*  87 */         if (!a(bmb1, j, this.a.size(), true)) {
/*  88 */           return bmb.b;
/*     */         }
/*  90 */       } else if (a(1).a(bmb1) && !a(1).f()) {
/*  91 */         if (!a(bmb1, 1, 2, false)) {
/*  92 */           return bmb.b;
/*     */         }
/*  94 */       } else if (a(0).a(bmb1)) {
/*  95 */         if (!a(bmb1, 0, 1, false)) {
/*  96 */           return bmb.b;
/*     */         }
/*  98 */       } else if (j <= 2 || !a(bmb1, 2, j, false)) {
/*  99 */         int k = j;
/* 100 */         int m = k + 27;
/* 101 */         int n = m;
/* 102 */         int i1 = n + 9;
/* 103 */         if (i >= n && i < i1) {
/* 104 */           if (!a(bmb1, k, m, false)) {
/* 105 */             return bmb.b;
/*     */           }
/* 107 */         } else if (i >= k && i < m) {
/* 108 */           if (!a(bmb1, n, i1, false)) {
/* 109 */             return bmb.b;
/*     */           }
/* 111 */         } else if (!a(bmb1, n, m, false)) {
/* 112 */           return bmb.b;
/*     */         } 
/* 114 */         return bmb.b;
/*     */       } 
/* 116 */       if (bmb1.a()) {
/* 117 */         bjr.d(bmb.b);
/*     */       } else {
/* 119 */         bjr.d();
/*     */       } 
/*     */     } 
/* 122 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 127 */     super.b(☃);
/* 128 */     this.c.b_(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\biy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */