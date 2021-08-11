/*     */ import javax.annotation.Nullable;
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
/*     */ public class bif
/*     */   extends bic
/*     */ {
/*  24 */   private final aon c = new apa(this, 1)
/*     */     {
/*     */       public boolean b(int ☃, bmb bmb1) {
/*  27 */         return bmb1.b().a(aeg.aa);
/*     */       }
/*     */ 
/*     */       
/*     */       public int V_() {
/*  32 */         return 1;
/*     */       }
/*     */     };
/*     */   
/*     */   private final a d;
/*     */   private final bim e;
/*     */   private final bil f;
/*     */   
/*     */   public bif(int ☃, aon aon1) {
/*  41 */     this(☃, aon1, new bjq(3), bim.a);
/*     */   }
/*     */   
/*     */   public bif(int ☃, aon aon1, bil bil1, bim bim1) {
/*  45 */     super(bje.i, ☃);
/*  46 */     a(bil1, 3);
/*  47 */     this.f = bil1;
/*  48 */     this.e = bim1;
/*     */     
/*  50 */     this.d = new a(this, this.c, 0, 136, 110);
/*  51 */     a(this.d);
/*     */     
/*  53 */     a(bil1);
/*     */     
/*  55 */     int i = 36;
/*  56 */     int j = 137;
/*     */     int k;
/*  58 */     for (k = 0; k < 3; k++) {
/*  59 */       for (int m = 0; m < 9; m++) {
/*  60 */         a(new bjr(aon1, m + k * 9 + 9, 36 + m * 18, 137 + k * 18));
/*     */       }
/*     */     } 
/*  63 */     for (k = 0; k < 9; k++) {
/*  64 */       a(new bjr(aon1, k, 36 + k * 18, 195));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/*  70 */     super.b(☃);
/*  71 */     if (☃.l.v) {
/*     */       return;
/*     */     }
/*     */     
/*  75 */     bmb bmb = this.d.a(this.d.a());
/*  76 */     if (!bmb.a()) {
/*  77 */       ☃.a(bmb, false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  83 */     return a(this.e, ☃, bup.es);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i) {
/*  88 */     super.a(☃, i);
/*  89 */     c();
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/*  94 */     bmb bmb = bmb.b;
/*  95 */     bjr bjr = this.a.get(i);
/*  96 */     if (bjr != null && bjr.f()) {
/*  97 */       bmb bmb1 = bjr.e();
/*  98 */       bmb = bmb1.i();
/*     */       
/* 100 */       if (i == 0) {
/* 101 */         if (!a(bmb1, 1, 37, true)) {
/* 102 */           return bmb.b;
/*     */         }
/* 104 */         bjr.a(bmb1, bmb);
/* 105 */       } else if (!this.d.f() && this.d.a(bmb1) && bmb1.E() == 1) {
/* 106 */         if (!a(bmb1, 0, 1, false)) {
/* 107 */           return bmb.b;
/*     */         }
/* 109 */       } else if (i >= 1 && i < 28) {
/* 110 */         if (!a(bmb1, 28, 37, false)) {
/* 111 */           return bmb.b;
/*     */         }
/* 113 */       } else if (i >= 28 && i < 37) {
/* 114 */         if (!a(bmb1, 1, 28, false)) {
/* 115 */           return bmb.b;
/*     */         }
/*     */       }
/* 118 */       else if (!a(bmb1, 1, 37, false)) {
/* 119 */         return bmb.b;
/*     */       } 
/*     */       
/* 122 */       if (bmb1.a()) {
/* 123 */         bjr.d(bmb.b);
/*     */       } else {
/* 125 */         bjr.d();
/*     */       } 
/* 127 */       if (bmb1.E() == bmb.E()) {
/* 128 */         return bmb.b;
/*     */       }
/* 130 */       bjr.a(☃, bmb1);
/*     */     } 
/*     */     
/* 133 */     return bmb;
/*     */   }
/*     */   
/*     */   public int e() {
/* 137 */     return this.f.a(0);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aps f() {
/* 142 */     return aps.a(this.f.a(1));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aps g() {
/* 147 */     return aps.a(this.f.a(2));
/*     */   }
/*     */   
/*     */   public void c(int ☃, int i) {
/* 151 */     if (this.d.f()) {
/* 152 */       this.f.a(1, ☃);
/* 153 */       this.f.a(2, i);
/* 154 */       this.d.a(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 159 */     return !this.c.a(0).a();
/*     */   }
/*     */   
/*     */   class a extends bjr {
/*     */     public a(bif this$0, aon ☃, int i, int j, int k) {
/* 164 */       super(☃, i, j, k);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bmb ☃) {
/* 169 */       return ☃.b().a(aeg.aa);
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 174 */       return 1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bif.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */