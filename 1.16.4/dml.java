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
/*     */ public class dml
/*     */   extends dkw
/*     */   implements dst
/*     */ {
/*  17 */   private static final vk b = new vk("textures/gui/widgets.png");
/*  18 */   public static final vk a = new vk("textures/gui/spectator_widgets.png");
/*     */   
/*     */   private final djz c;
/*     */   
/*     */   private long d;
/*     */   
/*     */   private dsq e;
/*     */   
/*     */   public dml(djz ☃) {
/*  27 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  31 */     this.d = x.b();
/*     */     
/*  33 */     if (this.e != null) {
/*  34 */       this.e.b(☃);
/*     */     } else {
/*  36 */       this.e = new dsq(this);
/*     */     } 
/*     */   }
/*     */   
/*     */   private float c() {
/*  41 */     long ☃ = this.d - x.b() + 5000L;
/*  42 */     return afm.a((float)☃ / 2000.0F, 0.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, float f) {
/*  46 */     if (this.e == null) {
/*     */       return;
/*     */     }
/*     */     
/*  50 */     float f1 = c();
/*  51 */     if (f1 <= 0.0F) {
/*  52 */       this.e.d();
/*     */       
/*     */       return;
/*     */     } 
/*  56 */     int i = this.c.aD().o() / 2;
/*  57 */     int j = v();
/*  58 */     d(-90);
/*  59 */     int k = afm.d(this.c.aD().p() - 22.0F * f1);
/*     */     
/*  61 */     dsu dsu = this.e.f();
/*     */     
/*  63 */     a(☃, f1, i, k, dsu);
/*     */     
/*  65 */     d(j);
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j, dsu dsu1) {
/*  69 */     RenderSystem.enableRescaleNormal();
/*  70 */     RenderSystem.enableBlend();
/*  71 */     RenderSystem.defaultBlendFunc();
/*  72 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, f);
/*  73 */     this.c.M().a(b);
/*  74 */     b(☃, i - 91, j, 0, 0, 182, 22);
/*     */     
/*  76 */     if (dsu1.b() >= 0) {
/*  77 */       b(☃, i - 91 - 1 + dsu1.b() * 20, j - 1, 0, 22, 24, 22);
/*     */     }
/*     */     
/*  80 */     for (int k = 0; k < 9; k++) {
/*  81 */       a(☃, k, this.c.aD().o() / 2 - 90 + k * 20 + 2, (j + 3), f, dsu1.a(k));
/*     */     }
/*     */     
/*  84 */     RenderSystem.disableRescaleNormal();
/*  85 */     RenderSystem.disableBlend();
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, float f1, float f2, dss dss1) {
/*  89 */     this.c.M().a(a);
/*     */     
/*  91 */     if (dss1 != dsq.a) {
/*  92 */       int k = (int)(f2 * 255.0F);
/*     */       
/*  94 */       RenderSystem.pushMatrix();
/*  95 */       RenderSystem.translatef(j, f1, 0.0F);
/*  96 */       float f = dss1.aB_() ? 1.0F : 0.25F;
/*  97 */       RenderSystem.color4f(f, f, f, f2);
/*  98 */       dss1.a(☃, f, k);
/*  99 */       RenderSystem.popMatrix();
/*     */       
/* 101 */       if (k > 3 && dss1.aB_()) {
/* 102 */         nr nr = this.c.k.aC[i].j();
/* 103 */         this.c.g.a(☃, nr, (j + 19 - 2 - this.c.g.a(nr)), f1 + 6.0F + 3.0F, 16777215 + (k << 24));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(dfm ☃) {
/* 109 */     int i = (int)(c() * 255.0F);
/*     */     
/* 111 */     if (i > 3 && this.e != null) {
/* 112 */       dss dss = this.e.b();
/* 113 */       nr nr = (dss == dsq.a) ? this.e.c().b() : dss.aA_();
/*     */       
/* 115 */       if (nr != null) {
/* 116 */         int j = (this.c.aD().o() - this.c.g.a(nr)) / 2;
/* 117 */         int k = this.c.aD().p() - 35;
/*     */         
/* 119 */         RenderSystem.pushMatrix();
/* 120 */         RenderSystem.enableBlend();
/* 121 */         RenderSystem.defaultBlendFunc();
/* 122 */         this.c.g.a(☃, nr, j, k, 16777215 + (i << 24));
/* 123 */         RenderSystem.disableBlend();
/* 124 */         RenderSystem.popMatrix();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dsq ☃) {
/* 131 */     this.e = null;
/* 132 */     this.d = 0L;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 136 */     return (this.e != null);
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 140 */     int i = this.e.e() + (int)☃;
/* 141 */     while (i >= 0 && i <= 8 && (this.e.a(i) == dsq.a || !this.e.a(i).aB_())) {
/* 142 */       i = (int)(i + ☃);
/*     */     }
/*     */     
/* 145 */     if (i >= 0 && i <= 8) {
/* 146 */       this.e.b(i);
/* 147 */       this.d = x.b();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b() {
/* 152 */     this.d = x.b();
/*     */     
/* 154 */     if (a()) {
/* 155 */       int ☃ = this.e.e();
/* 156 */       if (☃ != -1) {
/* 157 */         this.e.b(☃);
/*     */       }
/*     */     } else {
/* 160 */       this.e = new dsq(this);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */