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
/*     */ public abstract class dpo
/*     */   extends dot
/*     */ {
/*  21 */   private static final nr s = new of("advMode.setCommand");
/*  22 */   private static final nr t = new of("advMode.command");
/*  23 */   private static final nr u = new of("advMode.previousOutput");
/*     */   
/*     */   protected dlq a;
/*     */   
/*     */   protected dlq b;
/*     */   protected dlj c;
/*     */   protected dlj p;
/*     */   protected dlj q;
/*     */   protected boolean r;
/*     */   private dlm v;
/*     */   
/*     */   public dpo() {
/*  35 */     super(dkz.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  40 */     this.a.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b() {
/*  49 */     this.i.m.a(true);
/*  50 */     this.c = a(new dlj(this.k / 2 - 4 - 150, this.l / 4 + 120 + 12, 150, 20, nq.c, ☃ -> l()));
/*  51 */     this.p = a(new dlj(this.k / 2 + 4, this.l / 4 + 120 + 12, 150, 20, nq.d, ☃ -> at_()));
/*  52 */     this.q = a(new dlj(this.k / 2 + 150 - 20, i(), 20, 20, new oe("O"), ☃ -> {
/*     */             bqy bqy = h();
/*     */             
/*     */             bqy.a(!bqy.m());
/*     */             k();
/*     */           }));
/*  58 */     this.a = new dlq(this, this.o, this.k / 2 - 150, 50, 300, 20, new of("advMode.command"))
/*     */       {
/*     */         protected nx c() {
/*  61 */           return super.c().c(dpo.a(this.a).b());
/*     */         }
/*     */       };
/*  64 */     this.a.k(32500);
/*  65 */     this.a.a(this::b);
/*  66 */     this.e.add(this.a);
/*     */     
/*  68 */     this.b = new dlq(this.o, this.k / 2 - 150, i(), 276, 20, new of("advMode.previousOutput"));
/*  69 */     this.b.k(32500);
/*  70 */     this.b.g(false);
/*  71 */     this.b.a("-");
/*  72 */     this.e.add(this.b);
/*     */     
/*  74 */     b(this.a);
/*  75 */     this.a.e(true);
/*     */     
/*  77 */     this.v = new dlm(this.i, this, this.a, this.o, true, true, 0, 7, false, -2147483648);
/*  78 */     this.v.a(true);
/*  79 */     this.v.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/*  84 */     String str = this.a.b();
/*  85 */     b(☃, i, j);
/*  86 */     this.a.a(str);
/*     */     
/*  88 */     this.v.a();
/*     */   }
/*     */   
/*     */   protected void k() {
/*  92 */     if (h().m()) {
/*  93 */       this.q.a(new oe("O"));
/*  94 */       this.b.a(h().j().getString());
/*     */     } else {
/*  96 */       this.q.a(new oe("X"));
/*  97 */       this.b.a("-");
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void l() {
/* 102 */     bqy ☃ = h();
/* 103 */     a(☃);
/*     */     
/* 105 */     if (!☃.m()) {
/* 106 */       ☃.b((nr)null);
/*     */     }
/* 108 */     this.i.a((dot)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 113 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void at_() {
/* 120 */     h().a(this.r);
/* 121 */     this.i.a((dot)null);
/*     */   }
/*     */   
/*     */   private void b(String ☃) {
/* 125 */     this.v.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 131 */     if (this.v.a(☃, i, j)) {
/* 132 */       return true;
/*     */     }
/*     */     
/* 135 */     if (super.a(☃, i, j)) {
/* 136 */       return true;
/*     */     }
/*     */     
/* 139 */     if (☃ == 257 || ☃ == 335) {
/* 140 */       l();
/* 141 */       return true;
/*     */     } 
/*     */     
/* 144 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2) {
/* 149 */     if (this.v.a(d2)) {
/* 150 */       return true;
/*     */     }
/*     */     
/* 153 */     return super.a(☃, d1, d2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 158 */     if (this.v.a(☃, d1, i)) {
/* 159 */       return true;
/*     */     }
/*     */     
/* 162 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 167 */     a(☃);
/*     */     
/* 169 */     a(☃, this.o, s, this.k / 2, 20, 16777215);
/* 170 */     b(☃, this.o, t, this.k / 2 - 150, 40, 10526880);
/* 171 */     this.a.a(☃, i, j, f);
/*     */     
/* 173 */     int k = 75;
/* 174 */     if (!this.b.b().isEmpty()) {
/* 175 */       this.o.getClass(); k += 5 * 9 + 1 + i() - 135;
/* 176 */       b(☃, this.o, u, this.k / 2 - 150, k + 4, 10526880);
/* 177 */       this.b.a(☃, i, j, f);
/*     */     } 
/*     */     
/* 180 */     super.a(☃, i, j, f);
/* 181 */     this.v.a(☃, i, j);
/*     */   }
/*     */   
/*     */   abstract bqy h();
/*     */   
/*     */   abstract int i();
/*     */   
/*     */   protected abstract void a(bqy parambqy);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */