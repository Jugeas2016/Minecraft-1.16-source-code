/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Objects;
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
/*     */ public abstract class dlh
/*     */   extends dkw
/*     */   implements dmf, dmi
/*     */ {
/*  24 */   public static final vk i = new vk("textures/gui/widgets.png");
/*     */   
/*     */   protected int j;
/*     */   
/*     */   protected int k;
/*     */   
/*     */   public int l;
/*     */   
/*     */   public int m;
/*     */   private nr a;
/*     */   private boolean b;
/*     */   protected boolean n;
/*     */   public boolean o = true;
/*     */   public boolean p = true;
/*  38 */   protected float q = 1.0F;
/*     */   
/*  40 */   protected long r = Long.MAX_VALUE;
/*     */   private boolean c;
/*     */   
/*     */   public dlh(int ☃, int i, int j, int k, nr nr1) {
/*  44 */     this.l = ☃;
/*  45 */     this.m = i;
/*  46 */     this.j = j;
/*  47 */     this.k = k;
/*  48 */     this.a = nr1;
/*     */   }
/*     */   
/*     */   public int e() {
/*  52 */     return this.k;
/*     */   }
/*     */   
/*     */   protected int a(boolean ☃) {
/*  56 */     int i = 1;
/*  57 */     if (!this.o) {
/*  58 */       i = 0;
/*  59 */     } else if (☃) {
/*  60 */       i = 2;
/*     */     } 
/*  62 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  67 */     if (!this.p) {
/*     */       return;
/*     */     }
/*     */     
/*  71 */     this.n = (i >= this.l && j >= this.m && i < this.l + this.j && j < this.m + this.k);
/*     */     
/*  73 */     if (this.b != g()) {
/*  74 */       if (g()) {
/*  75 */         if (this.c) {
/*  76 */           c(200);
/*     */         } else {
/*  78 */           c(750);
/*     */         } 
/*     */       } else {
/*  81 */         this.r = Long.MAX_VALUE;
/*     */       } 
/*     */     }
/*     */     
/*  85 */     if (this.p) {
/*  86 */       b(☃, i, j, f);
/*     */     }
/*     */     
/*  89 */     f();
/*  90 */     this.b = g();
/*     */   }
/*     */   
/*     */   protected void f() {
/*  94 */     if (this.o && g() && x.b() > this.r) {
/*  95 */       String ☃ = c().getString();
/*  96 */       if (!☃.isEmpty()) {
/*  97 */         dkz.b.a(☃);
/*  98 */         this.r = Long.MAX_VALUE;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected nx c() {
/* 104 */     return new of("gui.narrate.button", new Object[] { i() });
/*     */   }
/*     */   
/*     */   public void b(dfm ☃, int i, int j, float f) {
/* 108 */     djz djz = djz.C();
/* 109 */     dku dku = djz.g;
/*     */     
/* 111 */     djz.M().a(i);
/* 112 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.q);
/*     */     
/* 114 */     int k = a(g());
/*     */     
/* 116 */     RenderSystem.enableBlend();
/* 117 */     RenderSystem.defaultBlendFunc();
/* 118 */     RenderSystem.enableDepthTest();
/* 119 */     b(☃, this.l, this.m, 0, 46 + k * 20, this.j / 2, this.k);
/* 120 */     b(☃, this.l + this.j / 2, this.m, 200 - this.j / 2, 46 + k * 20, this.j / 2, this.k);
/*     */     
/* 122 */     a(☃, djz, i, j);
/*     */     
/* 124 */     int m = this.o ? 16777215 : 10526880;
/* 125 */     a(☃, dku, i(), this.l + this.j / 2, this.m + (this.k - 8) / 2, m | afm.f(this.q * 255.0F) << 24);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, djz djz1, int i, int j) {}
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1) {}
/*     */ 
/*     */   
/*     */   public void a_(double ☃, double d1) {}
/*     */ 
/*     */   
/*     */   protected void a(double ☃, double d1, double d2, double d3) {}
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 142 */     if (!this.o || !this.p) {
/* 143 */       return false;
/*     */     }
/* 145 */     if (a(i)) {
/* 146 */       boolean bool = c(☃, d1);
/* 147 */       if (bool) {
/* 148 */         a(djz.C().W());
/* 149 */         a(☃, d1);
/* 150 */         return true;
/*     */       } 
/*     */     } 
/* 153 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(double ☃, double d1, int i) {
/* 158 */     if (a(i)) {
/* 159 */       a_(☃, d1);
/* 160 */       return true;
/*     */     } 
/* 162 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(int ☃) {
/* 166 */     return (☃ == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, double d2, double d3) {
/* 171 */     if (a(i)) {
/* 172 */       a(☃, d1, d2, d3);
/* 173 */       return true;
/*     */     } 
/* 175 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean c(double ☃, double d1) {
/* 179 */     return (this.o && this.p && ☃ >= this.l && d1 >= this.m && ☃ < (this.l + this.j) && d1 < (this.m + this.k));
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 183 */     return (this.n || this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(boolean ☃) {
/* 188 */     if (!this.o || !this.p) {
/* 189 */       return false;
/*     */     }
/*     */     
/* 192 */     this.c = !this.c;
/* 193 */     c(this.c);
/* 194 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(boolean ☃) {}
/*     */ 
/*     */   
/*     */   public boolean b(double ☃, double d1) {
/* 202 */     return (this.o && this.p && ☃ >= this.l && d1 >= this.m && ☃ < (this.l + this.j) && d1 < (this.m + this.k));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j) {}
/*     */   
/*     */   public void a(enu ☃) {
/* 209 */     ☃.a(emp.a(adq.pF, 1.0F));
/*     */   }
/*     */   
/*     */   public int h() {
/* 213 */     return this.j;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 217 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 221 */     this.q = ☃;
/*     */   }
/*     */   
/*     */   public void a(nr ☃) {
/* 225 */     if (!Objects.equals(☃.getString(), this.a.getString())) {
/* 226 */       c(250);
/*     */     }
/* 228 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 232 */     this.r = x.b() + ☃;
/*     */   }
/*     */   
/*     */   public nr i() {
/* 236 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 240 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void d(boolean ☃) {
/* 247 */     this.c = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */