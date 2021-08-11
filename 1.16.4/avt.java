/*     */ import java.util.EnumSet;
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
/*     */ public class avt
/*     */   extends avv
/*     */ {
/*     */   private final are a;
/*     */   private aqm b;
/*     */   private final brz c;
/*     */   private final double d;
/*     */   private final ayj e;
/*     */   private int f;
/*     */   private final float g;
/*     */   private final float h;
/*     */   private float i;
/*     */   private final boolean j;
/*     */   
/*     */   public avt(are ☃, double d, float f1, float f2, boolean bool) {
/*  37 */     this.a = ☃;
/*  38 */     this.c = ☃.l;
/*  39 */     this.d = d;
/*  40 */     this.e = ☃.x();
/*  41 */     this.h = f1;
/*  42 */     this.g = f2;
/*  43 */     this.j = bool;
/*  44 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     
/*  46 */     if (!(☃.x() instanceof ayi) && !(☃.x() instanceof ayh)) {
/*  47 */       throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  53 */     aqm ☃ = this.a.eN();
/*  54 */     if (☃ == null) {
/*  55 */       return false;
/*     */     }
/*  57 */     if (☃.a_()) {
/*  58 */       return false;
/*     */     }
/*  60 */     if (this.a.eO()) {
/*  61 */       return false;
/*     */     }
/*  63 */     if (this.a.h(☃) < (this.h * this.h)) {
/*  64 */       return false;
/*     */     }
/*  66 */     this.b = ☃;
/*  67 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  72 */     if (this.e.m()) {
/*  73 */       return false;
/*     */     }
/*  75 */     if (this.a.eO()) {
/*  76 */       return false;
/*     */     }
/*  78 */     if (this.a.h(this.b) <= (this.g * this.g)) {
/*  79 */       return false;
/*     */     }
/*  81 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  86 */     this.f = 0;
/*  87 */     this.i = this.a.a(cwz.h);
/*  88 */     this.a.a(cwz.h, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  93 */     this.b = null;
/*  94 */     this.e.o();
/*  95 */     this.a.a(cwz.h, this.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 100 */     this.a.t().a(this.b, 10.0F, this.a.O());
/*     */     
/* 102 */     if (--this.f > 0) {
/*     */       return;
/*     */     }
/* 105 */     this.f = 10;
/*     */     
/* 107 */     if (this.a.eB() || this.a.br()) {
/*     */       return;
/*     */     }
/*     */     
/* 111 */     if (this.a.h(this.b) >= 144.0D) {
/*     */       
/* 113 */       g();
/*     */     } else {
/* 115 */       this.e.a(this.b, this.d);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void g() {
/* 120 */     fx ☃ = this.b.cB();
/*     */     
/* 122 */     for (int i = 0; i < 10; i++) {
/* 123 */       int j = a(-3, 3);
/* 124 */       int k = a(-1, 1);
/* 125 */       int m = a(-3, 3);
/* 126 */       boolean bool = a(☃.u() + j, ☃.v() + k, ☃.w() + m);
/* 127 */       if (bool) {
/*     */         return;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i, int j) {
/* 134 */     if (Math.abs(☃ - this.b.cD()) < 2.0D && Math.abs(j - this.b.cH()) < 2.0D)
/*     */     {
/* 136 */       return false;
/*     */     }
/* 138 */     if (!a(new fx(☃, i, j))) {
/* 139 */       return false;
/*     */     }
/* 141 */     this.a.b(☃ + 0.5D, i, j + 0.5D, this.a.p, this.a.q);
/* 142 */     this.e.o();
/* 143 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃) {
/* 147 */     cwz cwz = cxj.a(this.c, ☃.i());
/*     */     
/* 149 */     if (cwz != cwz.c) {
/* 150 */       return false;
/*     */     }
/*     */     
/* 153 */     ceh ceh = this.c.d_(☃.c());
/* 154 */     if (!this.j && ceh.b() instanceof bxx)
/*     */     {
/* 156 */       return false;
/*     */     }
/*     */     
/* 159 */     fx fx1 = ☃.b(this.a.cB());
/* 160 */     if (!this.c.a_(this.a, this.a.cc().a(fx1)))
/*     */     {
/* 162 */       return false;
/*     */     }
/*     */     
/* 165 */     return true;
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i) {
/* 169 */     return this.a.cY().nextInt(i - ☃ + 1) + ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */