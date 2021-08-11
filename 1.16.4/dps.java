/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.List;
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
/*     */ public class dps
/*     */   extends dpp<bif>
/*     */ {
/*  29 */   private static final vk A = new vk("textures/gui/container/beacon.png");
/*  30 */   private static final nr B = new of("block.minecraft.beacon.primary");
/*  31 */   private static final nr C = new of("block.minecraft.beacon.secondary");
/*     */   
/*     */   private b D;
/*     */   
/*     */   private boolean E;
/*     */   private aps F;
/*     */   private aps G;
/*     */   
/*     */   public dps(bif ☃, bfv bfv1, nr nr1) {
/*  40 */     super(☃, bfv1, nr1);
/*     */     
/*  42 */     this.b = 230;
/*  43 */     this.c = 219;
/*     */     
/*  45 */     ☃.a(new bin(this, ☃)
/*     */         {
/*     */           public void a(bic ☃, gj<bmb> gj1) {}
/*     */ 
/*     */ 
/*     */           
/*     */           public void a(bic ☃, int i, bmb bmb1) {}
/*     */ 
/*     */ 
/*     */           
/*     */           public void a(bic ☃, int i, int j) {
/*  56 */             dps.a(this.b, this.a.f());
/*  57 */             dps.b(this.b, this.a.g());
/*  58 */             dps.a(this.b, true);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  65 */     super.b();
/*     */     
/*  67 */     this.D = (b)a((bif)new b(this, this.w + 164, this.x + 107));
/*  68 */     a((bif)new a(this, this.w + 190, this.x + 107));
/*     */     
/*  70 */     this.E = true;
/*     */     
/*  72 */     this.D.o = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  77 */     super.d();
/*     */     
/*  79 */     int ☃ = this.t.e();
/*     */     
/*  81 */     if (this.E && ☃ >= 0) {
/*  82 */       this.E = false;
/*     */       int i;
/*  84 */       for (i = 0; i <= 2; i++) {
/*  85 */         int n = (cce.a[i]).length;
/*  86 */         int i1 = n * 22 + (n - 1) * 2;
/*     */         
/*  88 */         for (int i2 = 0; i2 < n; i2++) {
/*  89 */           aps aps1 = cce.a[i][i2];
/*  90 */           c c = new c(this, this.w + 76 + i2 * 24 - i1 / 2, this.x + 22 + i * 25, aps1, true);
/*  91 */           a((bif)c);
/*     */           
/*  93 */           if (i >= ☃) {
/*  94 */             c.o = false;
/*  95 */           } else if (aps1 == this.F) {
/*  96 */             c.e(true);
/*     */           } 
/*     */         } 
/*     */       } 
/* 100 */       i = 3;
/*     */       
/* 102 */       int j = (cce.a[3]).length + 1;
/* 103 */       int k = j * 22 + (j - 1) * 2;
/*     */       
/* 105 */       for (int m = 0; m < j - 1; m++) {
/* 106 */         aps aps1 = cce.a[3][m];
/* 107 */         c c = new c(this, this.w + 167 + m * 24 - k / 2, this.x + 47, aps1, false);
/* 108 */         a((bif)c);
/*     */         
/* 110 */         if (3 >= ☃) {
/* 111 */           c.o = false;
/* 112 */         } else if (aps1 == this.G) {
/* 113 */           c.e(true);
/*     */         } 
/*     */       } 
/* 116 */       if (this.F != null) {
/* 117 */         c c = new c(this, this.w + 167 + (j - 1) * 24 - k / 2, this.x + 47, this.F, false);
/* 118 */         a((bif)c);
/*     */         
/* 120 */         if (3 >= ☃) {
/* 121 */           c.o = false;
/* 122 */         } else if (this.F == this.G) {
/* 123 */           c.e(true);
/*     */         } 
/*     */       } 
/*     */     } 
/* 127 */     this.D.o = (this.t.h() && this.F != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(dfm ☃, int i, int j) {
/* 132 */     a(☃, this.o, B, 62, 10, 14737632);
/* 133 */     a(☃, this.o, C, 169, 10, 14737632);
/*     */     
/* 135 */     for (dlh dlh : this.m) {
/* 136 */       if (dlh.g()) {
/* 137 */         dlh.a(☃, i - this.w, j - this.x);
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/* 145 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 146 */     this.i.M().a(A);
/* 147 */     int k = (this.k - this.b) / 2;
/* 148 */     int m = (this.l - this.c) / 2;
/* 149 */     b(☃, k, m, 0, 0, this.b, this.c);
/*     */     
/* 151 */     this.j.b = 100.0F;
/* 152 */     this.j.b(new bmb(bmd.kj), k + 20, m + 109);
/* 153 */     this.j.b(new bmb(bmd.oV), k + 41, m + 109);
/* 154 */     this.j.b(new bmb(bmd.kg), k + 41 + 22, m + 109);
/* 155 */     this.j.b(new bmb(bmd.ki), k + 42 + 44, m + 109);
/* 156 */     this.j.b(new bmb(bmd.kh), k + 42 + 66, m + 109);
/* 157 */     this.j.b = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 162 */     a(☃);
/* 163 */     super.a(☃, i, j, f);
/* 164 */     a(☃, i, j);
/*     */   }
/*     */   
/*     */   static abstract class d extends dld {
/*     */     private boolean a;
/*     */     
/*     */     protected d(int ☃, int i) {
/* 171 */       super(☃, i, 22, 22, oe.d);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(dfm ☃, int i, int j, float f) {
/* 176 */       djz.C().M().a(dps.i());
/* 177 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/* 179 */       int k = 219;
/* 180 */       int m = 0;
/* 181 */       if (!this.o) {
/* 182 */         m += this.j * 2;
/* 183 */       } else if (this.a) {
/* 184 */         m += this.j * 1;
/* 185 */       } else if (g()) {
/* 186 */         m += this.j * 3;
/*     */       } 
/*     */       
/* 189 */       b(☃, this.l, this.m, m, 219, this.j, this.k);
/*     */       
/* 191 */       a(☃);
/*     */     }
/*     */     
/*     */     protected abstract void a(dfm param1dfm);
/*     */     
/*     */     public boolean a() {
/* 197 */       return this.a;
/*     */     }
/*     */     
/*     */     public void e(boolean ☃) {
/* 201 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   class c extends d {
/*     */     private final aps b;
/*     */     private final ekc c;
/*     */     private final boolean d;
/*     */     private final nr e;
/*     */     
/*     */     public c(dps this$0, int ☃, int i, aps aps1, boolean bool) {
/* 212 */       super(☃, i);
/* 213 */       this.b = aps1;
/* 214 */       this.c = djz.C().at().a(aps1);
/* 215 */       this.d = bool;
/* 216 */       this.e = a(aps1, bool);
/*     */     }
/*     */     
/*     */     private nr a(aps ☃, boolean bool) {
/* 220 */       nx nx = new of(☃.c());
/*     */       
/* 222 */       if (!bool && ☃ != apw.j) {
/* 223 */         nx.c(" II");
/*     */       }
/* 225 */       return nx;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b() {
/* 230 */       if (a()) {
/*     */         return;
/*     */       }
/*     */       
/* 234 */       if (this.d) {
/* 235 */         dps.a(this.a, this.b);
/*     */       } else {
/* 237 */         dps.b(this.a, this.b);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 242 */       dps.a(this.a).clear();
/* 243 */       dps.b(this.a).clear();
/* 244 */       this.a.b();
/* 245 */       this.a.d();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j) {
/* 250 */       this.a.b(☃, this.e, i, j);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃) {
/* 255 */       djz.C().M().a(this.c.m().g());
/* 256 */       a(☃, this.l + 2, this.m + 2, v(), 18, 18, this.c);
/*     */     }
/*     */   }
/*     */   
/*     */   static abstract class e extends d {
/*     */     private final int a;
/*     */     private final int b;
/*     */     
/*     */     protected e(int ☃, int i, int j, int k) {
/* 265 */       super(☃, i);
/* 266 */       this.a = j;
/* 267 */       this.b = k;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃) {
/* 272 */       b(☃, this.l + 2, this.m + 2, this.a, this.b, 18, 18);
/*     */     }
/*     */   }
/*     */   
/*     */   class b extends e {
/*     */     public b(dps this$0, int ☃, int i) {
/* 278 */       super(☃, i, 90, 220);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b() {
/* 283 */       dps.e(this.a).w().a(new ti(aps.a(dps.c(this.a)), aps.a(dps.d(this.a))));
/* 284 */       (dps.g(this.a)).s.e.a(new sl((dps.f(this.a)).s.bp.b));
/* 285 */       dps.h(this.a).a((dot)null);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j) {
/* 290 */       this.a.b(☃, nq.c, i, j);
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends e {
/*     */     public a(dps this$0, int ☃, int i) {
/* 296 */       super(☃, i, 112, 220);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b() {
/* 301 */       (dps.j(this.a)).s.e.a(new sl((dps.i(this.a)).s.bp.b));
/* 302 */       dps.k(this.a).a((dot)null);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j) {
/* 307 */       this.a.b(☃, nq.d, i, j);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */