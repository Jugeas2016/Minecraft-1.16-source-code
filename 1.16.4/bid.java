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
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bid
/*     */   extends bjj<aon>
/*     */ {
/*     */   private final aon d;
/*     */   private final bil e;
/*     */   protected final brx c;
/*     */   private final bot<? extends boc> f;
/*     */   private final bjk g;
/*     */   
/*     */   protected bid(bje<?> ☃, bot<? extends boc> bot1, bjk bjk1, int i, bfv bfv1) {
/*  41 */     this(☃, bot1, bjk1, i, bfv1, new apa(3), new bjq(4));
/*     */   }
/*     */   
/*     */   protected bid(bje<?> ☃, bot<? extends boc> bot1, bjk bjk1, int i, bfv bfv1, aon aon1, bil bil1) {
/*  45 */     super(☃, i);
/*  46 */     this.f = bot1;
/*  47 */     this.g = bjk1;
/*  48 */     a(aon1, 3);
/*  49 */     a(bil1, 4);
/*  50 */     this.d = aon1;
/*  51 */     this.e = bil1;
/*  52 */     this.c = bfv1.e.l;
/*     */     
/*  54 */     a(new bjr(aon1, 0, 56, 17));
/*  55 */     a(new bit(this, aon1, 1, 56, 53));
/*  56 */     a(new biv(bfv1.e, aon1, 2, 116, 35));
/*     */     int j;
/*  58 */     for (j = 0; j < 3; j++) {
/*  59 */       for (int k = 0; k < 9; k++) {
/*  60 */         a(new bjr(bfv1, k + j * 9 + 9, 8 + k * 18, 84 + j * 18));
/*     */       }
/*     */     } 
/*  63 */     for (j = 0; j < 9; j++) {
/*  64 */       a(new bjr(bfv1, j, 8 + j * 18, 142));
/*     */     }
/*     */     
/*  67 */     a(bil1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bfy ☃) {
/*  72 */     if (this.d instanceof bju) {
/*  73 */       ((bju)this.d).a(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  79 */     this.d.Y_();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(boolean ☃, boq<?> boq1, aah aah1) {
/*  85 */     (new vb(this)).a(aah1, boq1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(boq<? super aon> ☃) {
/*  90 */     return ☃.a(this.d, this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/*  95 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 100 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 105 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int i() {
/* 110 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 115 */     return this.d.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 120 */     bmb bmb = bmb.b;
/* 121 */     bjr bjr = this.a.get(i);
/* 122 */     if (bjr != null && bjr.f()) {
/* 123 */       bmb bmb1 = bjr.e();
/* 124 */       bmb = bmb1.i();
/*     */       
/* 126 */       if (i == 2) {
/* 127 */         if (!a(bmb1, 3, 39, true)) {
/* 128 */           return bmb.b;
/*     */         }
/* 130 */         bjr.a(bmb1, bmb);
/* 131 */       } else if (i == 1 || i == 0) {
/* 132 */         if (!a(bmb1, 3, 39, false)) {
/* 133 */           return bmb.b;
/*     */         }
/* 135 */       } else if (a(bmb1)) {
/* 136 */         if (!a(bmb1, 0, 1, false)) {
/* 137 */           return bmb.b;
/*     */         }
/* 139 */       } else if (b(bmb1)) {
/* 140 */         if (!a(bmb1, 1, 2, false)) {
/* 141 */           return bmb.b;
/*     */         }
/* 143 */       } else if (i >= 3 && i < 30) {
/* 144 */         if (!a(bmb1, 30, 39, false)) {
/* 145 */           return bmb.b;
/*     */         }
/* 147 */       } else if (i >= 30 && i < 39 && 
/* 148 */         !a(bmb1, 3, 30, false)) {
/* 149 */         return bmb.b;
/*     */       } 
/*     */       
/* 152 */       if (bmb1.a()) {
/* 153 */         bjr.d(bmb.b);
/*     */       } else {
/* 155 */         bjr.d();
/*     */       } 
/* 157 */       if (bmb1.E() == bmb.E()) {
/* 158 */         return bmb.b;
/*     */       }
/* 160 */       bjr.a(☃, bmb1);
/*     */     } 
/*     */     
/* 163 */     return bmb;
/*     */   }
/*     */   
/*     */   protected boolean a(bmb ☃) {
/* 167 */     return this.c.o().<apa, boc>a(this.f, new apa(new bmb[] { ☃ }, ), this.c).isPresent();
/*     */   }
/*     */   
/*     */   protected boolean b(bmb ☃) {
/* 171 */     return cbz.b(☃);
/*     */   }
/*     */   
/*     */   public int j() {
/* 175 */     int ☃ = this.e.a(2);
/* 176 */     int i = this.e.a(3);
/* 177 */     if (i == 0 || ☃ == 0) {
/* 178 */       return 0;
/*     */     }
/* 180 */     return ☃ * 24 / i;
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 185 */     int ☃ = this.e.a(1);
/* 186 */     if (☃ == 0) {
/* 187 */       ☃ = 200;
/*     */     }
/* 189 */     return this.e.a(0) * 13 / ☃;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 193 */     return (this.e.a(0) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public bjk m() {
/* 198 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */