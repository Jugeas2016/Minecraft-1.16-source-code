/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Map;
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
/*     */ public class dpe
/*     */   extends dkw
/*     */ {
/*     */   private final djz a;
/*     */   private final dpi b;
/*     */   private final dpf c;
/*     */   private final int d;
/*     */   private final y e;
/*     */   private final ah i;
/*     */   private final bmb j;
/*     */   private final nr k;
/*     */   private final dpg l;
/*  31 */   private final Map<y, dpg> m = Maps.newLinkedHashMap();
/*     */   private double n;
/*     */   private double o;
/*  34 */   private int p = Integer.MAX_VALUE;
/*  35 */   private int q = Integer.MAX_VALUE;
/*  36 */   private int r = Integer.MIN_VALUE;
/*  37 */   private int s = Integer.MIN_VALUE;
/*     */   private float t;
/*     */   private boolean u;
/*     */   
/*     */   public dpe(djz ☃, dpi dpi1, dpf dpf1, int i, y y1, ah ah1) {
/*  42 */     this.a = ☃;
/*  43 */     this.b = dpi1;
/*  44 */     this.c = dpf1;
/*  45 */     this.d = i;
/*  46 */     this.e = y1;
/*  47 */     this.i = ah1;
/*  48 */     this.j = ah1.c();
/*  49 */     this.k = ah1.a();
/*  50 */     this.l = new dpg(this, ☃, y1, ah1);
/*  51 */     a(this.l, y1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public y c() {
/*  63 */     return this.e;
/*     */   }
/*     */   
/*     */   public nr d() {
/*  67 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, boolean bool) {
/*  75 */     this.c.a(☃, this, i, j, bool, this.d);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, efo efo1) {
/*  79 */     this.c.a(☃, i, this.d, efo1, this.j);
/*     */   }
/*     */   
/*     */   public void a(dfm ☃) {
/*  83 */     if (!this.u) {
/*  84 */       this.n = (117 - (this.r + this.p) / 2);
/*  85 */       this.o = (56 - (this.s + this.q) / 2);
/*  86 */       this.u = true;
/*     */     } 
/*     */     
/*  89 */     RenderSystem.pushMatrix();
/*  90 */     RenderSystem.enableDepthTest();
/*  91 */     RenderSystem.translatef(0.0F, 0.0F, 950.0F);
/*     */     
/*  93 */     RenderSystem.colorMask(false, false, false, false);
/*  94 */     a(☃, 4680, 2260, -4680, -2260, -16777216);
/*  95 */     RenderSystem.colorMask(true, true, true, true);
/*  96 */     RenderSystem.translatef(0.0F, 0.0F, -950.0F);
/*  97 */     RenderSystem.depthFunc(518);
/*     */     
/*  99 */     a(☃, 234, 113, 0, 0, -16777216);
/* 100 */     RenderSystem.depthFunc(515);
/*     */     
/* 102 */     vk vk = this.i.d();
/* 103 */     if (vk != null) {
/* 104 */       this.a.M().a(vk);
/*     */     } else {
/* 106 */       this.a.M().a(ekd.a);
/*     */     } 
/* 108 */     int i = afm.c(this.n);
/* 109 */     int j = afm.c(this.o);
/* 110 */     int k = i % 16;
/* 111 */     int m = j % 16;
/*     */     
/* 113 */     for (int n = -1; n <= 15; n++) {
/* 114 */       for (int i1 = -1; i1 <= 8; i1++) {
/* 115 */         a(☃, k + 16 * n, m + 16 * i1, 0.0F, 0.0F, 16, 16, 16, 16);
/*     */       }
/*     */     } 
/*     */     
/* 119 */     this.l.a(☃, i, j, true);
/* 120 */     this.l.a(☃, i, j, false);
/* 121 */     this.l.a(☃, i, j);
/* 122 */     RenderSystem.depthFunc(518);
/*     */     
/* 124 */     RenderSystem.translatef(0.0F, 0.0F, -950.0F);
/* 125 */     RenderSystem.colorMask(false, false, false, false);
/* 126 */     a(☃, 4680, 2260, -4680, -2260, -16777216);
/* 127 */     RenderSystem.colorMask(true, true, true, true);
/* 128 */     RenderSystem.translatef(0.0F, 0.0F, 950.0F);
/* 129 */     RenderSystem.depthFunc(515);
/* 130 */     RenderSystem.popMatrix();
/*     */   }
/*     */   
/*     */   public void c(dfm ☃, int i, int j, int k, int m) {
/* 134 */     RenderSystem.pushMatrix();
/* 135 */     RenderSystem.translatef(0.0F, 0.0F, 200.0F);
/* 136 */     a(☃, 0, 0, 234, 113, afm.d(this.t * 255.0F) << 24);
/*     */     
/* 138 */     boolean bool = false;
/* 139 */     int n = afm.c(this.n);
/* 140 */     int i1 = afm.c(this.o);
/* 141 */     if (i > 0 && i < 234 && j > 0 && j < 113) {
/* 142 */       for (dpg dpg1 : this.m.values()) {
/* 143 */         if (dpg1.a(n, i1, i, j)) {
/* 144 */           bool = true;
/* 145 */           dpg1.a(☃, n, i1, this.t, k, m);
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 150 */     RenderSystem.popMatrix();
/*     */     
/* 152 */     if (bool) {
/* 153 */       this.t = afm.a(this.t + 0.02F, 0.0F, 0.3F);
/*     */     } else {
/* 155 */       this.t = afm.a(this.t - 0.04F, 0.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, int i, double d1, double d2) {
/* 160 */     return this.c.a(☃, i, this.d, d1, d2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dpe a(djz ☃, dpi dpi1, int i, y y1) {
/* 165 */     if (y1.c() == null) {
/* 166 */       return null;
/*     */     }
/* 168 */     for (dpf dpf1 : dpf.values()) {
/* 169 */       if (i >= dpf1.a()) {
/* 170 */         i -= dpf1.a();
/*     */       } else {
/*     */         
/* 173 */         return new dpe(☃, dpi1, dpf1, i, y1, y1.c());
/*     */       } 
/* 175 */     }  return null;
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1) {
/* 179 */     if (this.r - this.p > 234) {
/* 180 */       this.n = afm.a(this.n + ☃, -(this.r - 234), 0.0D);
/*     */     }
/* 182 */     if (this.s - this.q > 113) {
/* 183 */       this.o = afm.a(this.o + d1, -(this.s - 113), 0.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(y ☃) {
/* 188 */     if (☃.c() == null) {
/*     */       return;
/*     */     }
/*     */     
/* 192 */     dpg dpg1 = new dpg(this, this.a, ☃, ☃.c());
/* 193 */     a(dpg1, ☃);
/*     */   }
/*     */   
/*     */   private void a(dpg ☃, y y1) {
/* 197 */     this.m.put(y1, ☃);
/* 198 */     int i = ☃.d();
/* 199 */     int j = i + 28;
/* 200 */     int k = ☃.c();
/* 201 */     int m = k + 27;
/* 202 */     this.p = Math.min(this.p, i);
/* 203 */     this.r = Math.max(this.r, j);
/* 204 */     this.q = Math.min(this.q, k);
/* 205 */     this.s = Math.max(this.s, m);
/*     */     
/* 207 */     for (dpg dpg1 : this.m.values()) {
/* 208 */       dpg1.b();
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dpg b(y ☃) {
/* 214 */     return this.m.get(☃);
/*     */   }
/*     */   
/*     */   public dpi f() {
/* 218 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */