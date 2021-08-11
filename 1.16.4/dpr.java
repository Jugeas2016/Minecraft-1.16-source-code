/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class dpr
/*     */   extends dqm<bie>
/*     */ {
/*  20 */   private static final vk A = new vk("textures/gui/container/anvil.png");
/*  21 */   private static final nr B = new of("container.repair.expensive");
/*     */   private dlq C;
/*     */   
/*     */   public dpr(bie ☃, bfv bfv1, nr nr1) {
/*  25 */     super(☃, bfv1, nr1, A);
/*  26 */     this.p = 60;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  31 */     super.d();
/*  32 */     this.C.a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void i() {
/*  37 */     this.i.m.a(true);
/*     */     
/*  39 */     int ☃ = (this.k - this.b) / 2;
/*  40 */     int i = (this.l - this.c) / 2;
/*     */     
/*  42 */     this.C = new dlq(this.o, ☃ + 62, i + 24, 103, 12, new of("container.repair"));
/*  43 */     this.C.h(false);
/*  44 */     this.C.l(-1);
/*  45 */     this.C.m(-1);
/*  46 */     this.C.f(false);
/*  47 */     this.C.k(35);
/*  48 */     this.C.a(this::b);
/*  49 */     this.e.add(this.C);
/*     */     
/*  51 */     b(this.C);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/*  56 */     String str = this.C.b();
/*  57 */     b(☃, i, j);
/*  58 */     this.C.a(str);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  63 */     super.e();
/*     */     
/*  65 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  70 */     if (☃ == 256) {
/*  71 */       this.i.s.m();
/*     */     }
/*     */     
/*  74 */     if (this.C.a(☃, i, j) || this.C.m()) {
/*  75 */       return true;
/*     */     }
/*  77 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void b(String ☃) {
/*  81 */     if (☃.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/*  85 */     String str = ☃;
/*  86 */     bjr bjr = this.t.a(0);
/*  87 */     if (bjr != null && bjr.f() && 
/*  88 */       !bjr.e().t() && str.equals(bjr.e().r().getString())) {
/*  89 */       str = "";
/*     */     }
/*     */ 
/*     */     
/*  93 */     this.t.a(str);
/*  94 */     this.i.s.e.a(new te(str));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(dfm ☃, int i, int j) {
/*  99 */     RenderSystem.disableBlend();
/* 100 */     super.b(☃, i, j);
/*     */     
/* 102 */     int k = this.t.f();
/* 103 */     if (k > 0) {
/* 104 */       nr nr1; int m = 8453920;
/*     */       
/* 106 */       if (k >= 40 && !this.i.s.bC.d) {
/* 107 */         nr1 = B;
/* 108 */         m = 16736352;
/* 109 */       } else if (!this.t.a(2).f()) {
/* 110 */         nr1 = null;
/*     */       } else {
/* 112 */         nr1 = new of("container.repair.cost", new Object[] { Integer.valueOf(k) });
/* 113 */         if (!this.t.a(2).a(this.u.e)) {
/* 114 */           m = 16736352;
/*     */         }
/*     */       } 
/*     */       
/* 118 */       if (nr1 != null) {
/* 119 */         int n = this.b - 8 - this.o.a(nr1) - 2;
/* 120 */         int i1 = 69;
/* 121 */         a(☃, n - 2, 67, this.b - 8, 79, 1325400064);
/* 122 */         this.o.a(☃, nr1, n, 69.0F, m);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dfm ☃, int i, int j, float f) {
/* 129 */     this.C.a(☃, i, j, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bic ☃, int i, bmb bmb1) {
/* 134 */     if (i == 0) {
/* 135 */       this.C.a(bmb1.a() ? "" : bmb1.r().getString());
/* 136 */       this.C.g(!bmb1.a());
/* 137 */       a(this.C);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */