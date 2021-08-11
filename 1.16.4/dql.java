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
/*     */ 
/*     */ 
/*     */ public class dql
/*     */   extends dqe<biz>
/*     */   implements drv
/*     */ {
/*  23 */   private static final vk B = new vk("textures/gui/recipe_button.png");
/*     */   
/*     */   private float C;
/*     */   
/*     */   private float D;
/*  28 */   private final drp E = new drp();
/*     */   private boolean F;
/*     */   private boolean G;
/*     */   private boolean H;
/*     */   
/*     */   public dql(bfw ☃) {
/*  34 */     super(☃.bo, ☃.bm, new of("container.crafting"));
/*  35 */     this.n = true;
/*  36 */     this.p = 97;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  41 */     if (this.i.q.g()) {
/*  42 */       this.i.a(new dqc(this.i.s));
/*     */       
/*     */       return;
/*     */     } 
/*  46 */     this.E.g();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  51 */     if (this.i.q.g()) {
/*  52 */       this.i.a(new dqc(this.i.s));
/*     */       
/*     */       return;
/*     */     } 
/*  56 */     super.b();
/*  57 */     this.G = (this.k < 379);
/*  58 */     this.E.a(this.k, this.l, this.i, this.G, this.t);
/*  59 */     this.F = true;
/*  60 */     this.w = this.E.a(this.G, this.k, this.b);
/*     */     
/*  62 */     this.e.add(this.E);
/*  63 */     b(this.E);
/*  64 */     a((biz)new dlr(this.w + 104, this.l / 2 - 22, 20, 18, 0, 0, 19, B, ☃ -> {
/*     */             this.E.a(this.G);
/*     */             this.E.e();
/*     */             this.w = this.E.a(this.G, this.k, this.b);
/*     */             ((dlr)☃).a(this.w + 104, this.l / 2 - 22);
/*     */             this.H = true;
/*     */           }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(dfm ☃, int i, int j) {
/*  78 */     this.o.b(☃, this.d, this.p, this.q, 4210752);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  83 */     a(☃);
/*     */     
/*  85 */     this.A = !this.E.f();
/*     */     
/*  87 */     if (this.E.f() && this.G) {
/*  88 */       a(☃, f, i, j);
/*  89 */       this.E.a(☃, i, j, f);
/*     */     } else {
/*  91 */       this.E.a(☃, i, j, f);
/*  92 */       super.a(☃, i, j, f);
/*  93 */       this.E.a(☃, this.w, this.x, false, f);
/*     */     } 
/*     */     
/*  96 */     a(☃, i, j);
/*  97 */     this.E.c(☃, this.w, this.x, i, j);
/*     */     
/*  99 */     this.C = i;
/* 100 */     this.D = j;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/* 105 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 106 */     this.i.M().a(a);
/* 107 */     int k = this.w;
/* 108 */     int m = this.x;
/* 109 */     b(☃, k, m, 0, 0, this.b, this.c);
/*     */     
/* 111 */     a(k + 51, m + 75, 30, (k + 51) - this.C, (m + 75 - 50) - this.D, this.i.s);
/*     */   }
/*     */   
/*     */   public static void a(int ☃, int i, int j, float f1, float f2, aqm aqm1) {
/* 115 */     float f3 = (float)Math.atan((f1 / 40.0F));
/* 116 */     float f4 = (float)Math.atan((f2 / 40.0F));
/*     */     
/* 118 */     RenderSystem.pushMatrix();
/* 119 */     RenderSystem.translatef(☃, i, 1050.0F);
/*     */ 
/*     */     
/* 122 */     RenderSystem.scalef(1.0F, 1.0F, -1.0F);
/* 123 */     dfm dfm = new dfm();
/*     */     
/* 125 */     dfm.a(0.0D, 0.0D, 1000.0D);
/* 126 */     dfm.a(j, j, j);
/* 127 */     d d1 = g.f.a(180.0F);
/* 128 */     d d2 = g.b.a(f4 * 20.0F);
/* 129 */     d1.a(d2);
/* 130 */     dfm.a(d1);
/*     */     
/* 132 */     float f5 = aqm1.aA;
/* 133 */     float f6 = aqm1.p;
/* 134 */     float f7 = aqm1.q;
/* 135 */     float f8 = aqm1.aD;
/* 136 */     float f9 = aqm1.aC;
/*     */     
/* 138 */     aqm1.aA = 180.0F + f3 * 20.0F;
/* 139 */     aqm1.p = 180.0F + f3 * 40.0F;
/* 140 */     aqm1.q = -f4 * 20.0F;
/* 141 */     aqm1.aC = aqm1.p;
/* 142 */     aqm1.aD = aqm1.p;
/*     */     
/* 144 */     eet eet = djz.C().ac();
/* 145 */     d2.e();
/* 146 */     eet.a(d2);
/* 147 */     eet.a(false);
/* 148 */     eag.a a = djz.C().aE().b();
/* 149 */     RenderSystem.runAsFancy(() -> ☃.a(aqm1, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, dfm1, a1, 15728880));
/* 150 */     a.a();
/* 151 */     eet.a(true);
/*     */     
/* 153 */     aqm1.aA = f5;
/* 154 */     aqm1.p = f6;
/* 155 */     aqm1.q = f7;
/* 156 */     aqm1.aD = f8;
/* 157 */     aqm1.aC = f9;
/* 158 */     RenderSystem.popMatrix();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃, int i, int j, int k, double d1, double d2) {
/* 163 */     return ((!this.G || !this.E.f()) && super.a(☃, i, j, k, d1, d2));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 168 */     if (this.E.a(☃, d1, i)) {
/* 169 */       a(this.E);
/* 170 */       return true;
/*     */     } 
/*     */     
/* 173 */     if (this.G && this.E.f()) {
/* 174 */       return false;
/*     */     }
/*     */     
/* 177 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(double ☃, double d1, int i) {
/* 182 */     if (this.H) {
/* 183 */       this.H = false;
/* 184 */       return true;
/*     */     } 
/*     */     
/* 187 */     return super.c(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(double ☃, double d1, int i, int j, int k) {
/* 192 */     boolean bool = (☃ < i || d1 < j || ☃ >= (i + this.b) || d1 >= (j + this.c));
/* 193 */     return (this.E.a(☃, d1, this.w, this.x, this.b, this.c, k) && bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bjr ☃, int i, int j, bik bik1) {
/* 198 */     super.a(☃, i, j, bik1);
/*     */     
/* 200 */     this.E.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void az_() {
/* 205 */     this.E.h();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 210 */     if (this.F) {
/* 211 */       this.E.d();
/*     */     }
/* 213 */     super.e();
/*     */   }
/*     */ 
/*     */   
/*     */   public drp k() {
/* 218 */     return this.E;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */