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
/*     */ public class bjg
/*     */   extends bic
/*     */ {
/*     */   private final bqu c;
/*     */   private final bjf d;
/*     */   private int e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   
/*     */   public bjg(int ☃, bfv bfv1) {
/*  37 */     this(☃, bfv1, new bfg(bfv1.e));
/*     */   }
/*     */   
/*     */   public bjg(int ☃, bfv bfv1, bqu bqu1) {
/*  41 */     super(bje.s, ☃);
/*  42 */     this.c = bqu1;
/*     */     
/*  44 */     this.d = new bjf(bqu1);
/*  45 */     a(new bjr(this.d, 0, 136, 37));
/*  46 */     a(new bjr(this.d, 1, 162, 37));
/*  47 */     a(new bjh(bfv1.e, bqu1, this.d, 2, 220, 37));
/*     */     int i;
/*  49 */     for (i = 0; i < 3; i++) {
/*  50 */       for (int j = 0; j < 9; j++) {
/*  51 */         a(new bjr(bfv1, j + i * 9 + 9, 108 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  54 */     for (i = 0; i < 9; i++) {
/*  55 */       a(new bjr(bfv1, i, 108 + i * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  60 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/*  65 */     this.d.f();
/*  66 */     super.a(☃);
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/*  70 */     this.d.c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  75 */     return (this.c.eM() == ☃);
/*     */   }
/*     */   
/*     */   public int e() {
/*  79 */     return this.c.eL();
/*     */   }
/*     */   
/*     */   public int f() {
/*  83 */     return this.d.h();
/*     */   }
/*     */   
/*     */   public void e(int ☃) {
/*  87 */     this.c.t(☃);
/*     */   }
/*     */   
/*     */   public int g() {
/*  91 */     return this.e;
/*     */   }
/*     */   
/*     */   public void f(int ☃) {
/*  95 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/*  99 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 103 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, bjr bjr1) {
/* 108 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 113 */     bmb bmb = bmb.b;
/* 114 */     bjr bjr = this.a.get(i);
/* 115 */     if (bjr != null && bjr.f()) {
/* 116 */       bmb bmb1 = bjr.e();
/* 117 */       bmb = bmb1.i();
/*     */       
/* 119 */       if (i == 2) {
/* 120 */         if (!a(bmb1, 3, 39, true)) {
/* 121 */           return bmb.b;
/*     */         }
/* 123 */         bjr.a(bmb1, bmb);
/*     */         
/* 125 */         k();
/* 126 */       } else if (i == 0 || i == 1) {
/* 127 */         if (!a(bmb1, 3, 39, false)) {
/* 128 */           return bmb.b;
/*     */         }
/* 130 */       } else if (i >= 3 && i < 30) {
/* 131 */         if (!a(bmb1, 30, 39, false)) {
/* 132 */           return bmb.b;
/*     */         }
/* 134 */       } else if (i >= 30 && i < 39 && 
/* 135 */         !a(bmb1, 3, 30, false)) {
/* 136 */         return bmb.b;
/*     */       } 
/*     */       
/* 139 */       if (bmb1.a()) {
/* 140 */         bjr.d(bmb.b);
/*     */       } else {
/* 142 */         bjr.d();
/*     */       } 
/* 144 */       if (bmb1.E() == bmb.E()) {
/* 145 */         return bmb.b;
/*     */       }
/* 147 */       bjr.a(☃, bmb1);
/*     */     } 
/*     */     
/* 150 */     return bmb;
/*     */   }
/*     */   
/*     */   private void k() {
/* 154 */     if (!(this.c.eV()).v) {
/* 155 */       aqa ☃ = (aqa)this.c;
/* 156 */       this.c.eV().a(☃.cD(), ☃.cE(), ☃.cH(), this.c.eQ(), adr.g, 1.0F, 1.0F, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 162 */     super.b(☃);
/* 163 */     this.c.f(null);
/*     */     
/* 165 */     if ((this.c.eV()).v) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 170 */     if (!☃.aX() || (☃ instanceof aah && ((aah)☃).q())) {
/* 171 */       bmb bmb = this.d.b(0);
/* 172 */       if (!bmb.a()) {
/* 173 */         ☃.a(bmb, false);
/*     */       }
/* 175 */       bmb = this.d.b(1);
/* 176 */       if (!bmb.a()) {
/* 177 */         ☃.a(bmb, false);
/*     */       }
/*     */     } else {
/* 180 */       ☃.bm.a(☃.l, this.d.b(0));
/* 181 */       ☃.bm.a(☃.l, this.d.b(1));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void g(int ☃) {
/* 186 */     if (i().size() <= ☃) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 191 */     bmb bmb1 = this.d.a(0);
/* 192 */     if (!bmb1.a()) {
/* 193 */       if (!a(bmb1, 3, 39, true)) {
/*     */         return;
/*     */       }
/*     */       
/* 197 */       this.d.a(0, bmb1);
/*     */     } 
/*     */     
/* 200 */     bmb bmb2 = this.d.a(1);
/* 201 */     if (!bmb2.a()) {
/* 202 */       if (!a(bmb2, 3, 39, true)) {
/*     */         return;
/*     */       }
/*     */       
/* 206 */       this.d.a(1, bmb2);
/*     */     } 
/*     */ 
/*     */     
/* 210 */     if (this.d.a(0).a() && this.d.a(1).a()) {
/* 211 */       bmb bmb3 = i().get(☃).b();
/* 212 */       c(0, bmb3);
/*     */       
/* 214 */       bmb bmb4 = i().get(☃).c();
/* 215 */       c(1, bmb4);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c(int ☃, bmb bmb1) {
/* 220 */     if (!bmb1.a()) {
/* 221 */       for (int i = 3; i < 39; i++) {
/* 222 */         bmb bmb2 = ((bjr)this.a.get(i)).e();
/* 223 */         if (!bmb2.a() && b(bmb1, bmb2)) {
/* 224 */           bmb bmb3 = this.d.a(☃);
/* 225 */           int j = bmb3.a() ? 0 : bmb3.E();
/* 226 */           int k = Math.min(bmb1.c() - j, bmb2.E());
/*     */           
/* 228 */           bmb bmb4 = bmb2.i();
/* 229 */           int m = j + k;
/*     */           
/* 231 */           bmb2.g(k);
/*     */           
/* 233 */           bmb4.e(m);
/* 234 */           this.d.a(☃, bmb4);
/*     */           
/* 236 */           if (m >= bmb1.c()) {
/*     */             break;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean b(bmb ☃, bmb bmb1) {
/* 245 */     return (☃.b() == bmb1.b() && bmb.a(☃, bmb1));
/*     */   }
/*     */   
/*     */   public void a(bqw ☃) {
/* 249 */     this.c.a(☃);
/*     */   }
/*     */   
/*     */   public bqw i() {
/* 253 */     return this.c.eO();
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 257 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */