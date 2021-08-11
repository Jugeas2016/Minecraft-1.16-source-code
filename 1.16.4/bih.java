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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bih
/*     */   extends bic
/*     */ {
/*     */   private final aon c;
/*     */   private final bil d;
/*     */   private final bjr e;
/*     */   
/*     */   public bih(int ☃, bfv bfv1) {
/*  36 */     this(☃, bfv1, new apa(5), new bjq(2));
/*     */   }
/*     */   
/*     */   public bih(int ☃, bfv bfv1, aon aon1, bil bil1) {
/*  40 */     super(bje.k, ☃);
/*  41 */     a(aon1, 5);
/*  42 */     a(bil1, 2);
/*  43 */     this.c = aon1;
/*  44 */     this.d = bil1;
/*     */     
/*  46 */     a(new c(aon1, 0, 56, 51));
/*  47 */     a(new c(aon1, 1, 79, 58));
/*  48 */     a(new c(aon1, 2, 102, 51));
/*  49 */     this.e = a(new b(aon1, 3, 79, 17));
/*  50 */     a(new a(aon1, 4, 17, 17));
/*     */     
/*  52 */     a(bil1);
/*     */     int i;
/*  54 */     for (i = 0; i < 3; i++) {
/*  55 */       for (int j = 0; j < 9; j++) {
/*  56 */         a(new bjr(bfv1, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  59 */     for (i = 0; i < 9; i++) {
/*  60 */       a(new bjr(bfv1, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  66 */     return this.c.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/*  71 */     bmb bmb = bmb.b;
/*  72 */     bjr bjr1 = this.a.get(i);
/*  73 */     if (bjr1 != null && bjr1.f()) {
/*  74 */       bmb bmb1 = bjr1.e();
/*  75 */       bmb = bmb1.i();
/*     */       
/*  77 */       if ((i >= 0 && i <= 2) || i == 3 || i == 4) {
/*  78 */         if (!a(bmb1, 5, 41, true)) {
/*  79 */           return bmb.b;
/*     */         }
/*  81 */         bjr1.a(bmb1, bmb);
/*  82 */       } else if (a.a_(bmb)) {
/*  83 */         if (a(bmb1, 4, 5, false) || (this.e.a(bmb1) && !a(bmb1, 3, 4, false))) {
/*  84 */           return bmb.b;
/*     */         }
/*  86 */       } else if (this.e.a(bmb1)) {
/*  87 */         if (!a(bmb1, 3, 4, false)) {
/*  88 */           return bmb.b;
/*     */         }
/*  90 */       } else if (c.b_(bmb) && bmb.E() == 1) {
/*  91 */         if (!a(bmb1, 0, 3, false)) {
/*  92 */           return bmb.b;
/*     */         }
/*  94 */       } else if (i >= 5 && i < 32) {
/*  95 */         if (!a(bmb1, 32, 41, false)) {
/*  96 */           return bmb.b;
/*     */         }
/*  98 */       } else if (i >= 32 && i < 41) {
/*  99 */         if (!a(bmb1, 5, 32, false)) {
/* 100 */           return bmb.b;
/*     */         }
/*     */       }
/* 103 */       else if (!a(bmb1, 5, 41, false)) {
/* 104 */         return bmb.b;
/*     */       } 
/*     */       
/* 107 */       if (bmb1.a()) {
/* 108 */         bjr1.d(bmb.b);
/*     */       } else {
/* 110 */         bjr1.d();
/*     */       } 
/* 112 */       if (bmb1.E() == bmb.E()) {
/* 113 */         return bmb.b;
/*     */       }
/* 115 */       bjr1.a(☃, bmb1);
/*     */     } 
/*     */     
/* 118 */     return bmb;
/*     */   }
/*     */   
/*     */   public int e() {
/* 122 */     return this.d.a(1);
/*     */   }
/*     */   
/*     */   public int f() {
/* 126 */     return this.d.a(0);
/*     */   }
/*     */   
/*     */   static class c extends bjr {
/*     */     public c(aon ☃, int i, int j, int k) {
/* 131 */       super(☃, i, j, k);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bmb ☃) {
/* 136 */       return b_(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 141 */       return 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public bmb a(bfw ☃, bmb bmb1) {
/* 146 */       bnt bnt = bnv.d(bmb1);
/* 147 */       if (☃ instanceof aah) {
/* 148 */         ac.k.a((aah)☃, bnt);
/*     */       }
/* 150 */       super.a(☃, bmb1);
/* 151 */       return bmb1;
/*     */     }
/*     */     
/*     */     public static boolean b_(bmb ☃) {
/* 155 */       blx blx = ☃.b();
/* 156 */       return (blx == bmd.nv || blx == bmd.qj || blx == bmd.qm || blx == bmd.nw);
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends bjr {
/*     */     public b(aon ☃, int i, int j, int k) {
/* 162 */       super(☃, i, j, k);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bmb ☃) {
/* 167 */       return bnu.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 172 */       return 64;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends bjr {
/*     */     public a(aon ☃, int i, int j, int k) {
/* 178 */       super(☃, i, j, k);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bmb ☃) {
/* 183 */       return a_(☃);
/*     */     }
/*     */     
/*     */     public static boolean a_(bmb ☃) {
/* 187 */       return (☃.b() == bmd.nz);
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 192 */       return 64;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */