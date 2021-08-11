/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.nio.IntBuffer;
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
/*     */ public class deg
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   public final boolean e;
/*     */   public int f;
/*     */   private int i;
/*     */   private int j;
/*     */   public final float[] g;
/*     */   public int h;
/*     */   
/*     */   public deg(int ☃, int i, boolean bool1, boolean bool2) {
/*  32 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  33 */     this.e = bool1;
/*     */     
/*  35 */     this.f = -1;
/*  36 */     this.i = -1;
/*  37 */     this.j = -1;
/*     */     
/*  39 */     this.g = new float[4];
/*  40 */     this.g[0] = 1.0F;
/*  41 */     this.g[1] = 1.0F;
/*  42 */     this.g[2] = 1.0F;
/*  43 */     this.g[3] = 0.0F;
/*     */     
/*  45 */     a(☃, i, bool2);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, boolean bool) {
/*  49 */     if (!RenderSystem.isOnRenderThread()) {
/*  50 */       RenderSystem.recordRenderCall(() -> d(☃, i, bool));
/*     */     }
/*     */     else {
/*     */       
/*  54 */       d(☃, i, bool);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(int ☃, int i, boolean bool) {
/*  59 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  60 */     dem.m();
/*     */     
/*  62 */     if (this.f >= 0) {
/*  63 */       a();
/*     */     }
/*  65 */     b(☃, i, bool);
/*     */ 
/*     */     
/*  68 */     dem.h(dek.a, 0);
/*     */   }
/*     */   
/*     */   public void a() {
/*  72 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  73 */     d();
/*  74 */     e();
/*     */     
/*  76 */     if (this.j > -1) {
/*  77 */       dex.a(this.j);
/*  78 */       this.j = -1;
/*     */     } 
/*  80 */     if (this.i > -1) {
/*  81 */       dex.a(this.i);
/*  82 */       this.i = -1;
/*     */     } 
/*  84 */     if (this.f > -1) {
/*  85 */       dem.h(dek.a, 0);
/*  86 */       dem.k(this.f);
/*  87 */       this.f = -1;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(deg ☃) {
/*  92 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*     */     
/*  94 */     if (dem.U()) {
/*  95 */       dem.h(36008, ☃.f);
/*  96 */       dem.h(36009, this.f);
/*  97 */       dem.a(0, 0, ☃.a, ☃.b, 0, 0, this.a, this.b, 256, 9728);
/*     */     } else {
/*  99 */       dem.h(dek.a, this.f);
/* 100 */       int i = dem.r();
/*     */       
/* 102 */       if (i != 0) {
/* 103 */         int j = dem.t();
/*     */         
/* 105 */         dem.s(i);
/* 106 */         dem.h(dek.a, ☃.f);
/* 107 */         dem.a(3553, 0, 0, 0, 0, 0, Math.min(this.a, ☃.a), Math.min(this.b, ☃.b));
/*     */         
/* 109 */         dem.s(j);
/*     */       } 
/*     */     } 
/*     */     
/* 113 */     dem.h(dek.a, 0);
/*     */   }
/*     */   
/*     */   public void b(int ☃, int i, boolean bool) {
/* 117 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 118 */     this.c = ☃;
/* 119 */     this.d = i;
/*     */     
/* 121 */     this.a = ☃;
/* 122 */     this.b = i;
/*     */     
/* 124 */     this.f = dem.s();
/* 125 */     this.i = dex.a();
/* 126 */     if (this.e) {
/* 127 */       this.j = dex.a();
/* 128 */       dem.s(this.j);
/* 129 */       dem.b(3553, 10241, 9728);
/* 130 */       dem.b(3553, 10240, 9728);
/* 131 */       dem.b(3553, 10242, 10496);
/* 132 */       dem.b(3553, 10243, 10496);
/* 133 */       dem.b(3553, 34892, 0);
/* 134 */       dem.a(3553, 0, 6402, this.a, this.b, 0, 6402, 5126, (IntBuffer)null);
/*     */     } 
/*     */     
/* 137 */     a(9728);
/* 138 */     dem.s(this.i);
/* 139 */     dem.a(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, (IntBuffer)null);
/*     */     
/* 141 */     dem.h(dek.a, this.f);
/* 142 */     dem.a(dek.a, dek.c, 3553, this.i, 0);
/*     */     
/* 144 */     if (this.e)
/*     */     {
/* 146 */       dem.a(dek.a, dek.d, 3553, this.j, 0);
/*     */     }
/*     */     
/* 149 */     b();
/*     */     
/* 151 */     b(bool);
/* 152 */     d();
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 156 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 157 */     this.h = ☃;
/* 158 */     dem.s(this.i);
/* 159 */     dem.b(3553, 10241, ☃);
/* 160 */     dem.b(3553, 10240, ☃);
/* 161 */     dem.b(3553, 10242, 10496);
/* 162 */     dem.b(3553, 10243, 10496);
/* 163 */     dem.s(0);
/*     */   }
/*     */   
/*     */   public void b() {
/* 167 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 168 */     int ☃ = dem.l(dek.a);
/* 169 */     if (☃ == dek.e)
/*     */       return; 
/* 171 */     if (☃ == dek.f)
/* 172 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT"); 
/* 173 */     if (☃ == dek.g)
/* 174 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT"); 
/* 175 */     if (☃ == dek.h)
/* 176 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER"); 
/* 177 */     if (☃ == dek.i) {
/* 178 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
/*     */     }
/* 180 */     throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 185 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 186 */     dem.s(this.i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/* 196 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 197 */     dem.s(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 202 */     if (!RenderSystem.isOnRenderThread()) {
/* 203 */       RenderSystem.recordRenderCall(() -> c(☃));
/*     */     }
/*     */     else {
/*     */       
/* 207 */       c(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/* 212 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 213 */     dem.h(dek.a, this.f);
/* 214 */     if (☃) {
/* 215 */       dem.d(0, 0, this.c, this.d);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 221 */     if (!RenderSystem.isOnRenderThread()) {
/* 222 */       RenderSystem.recordRenderCall(() -> dem.h(dek.a, 0));
/*     */     }
/*     */     else {
/*     */       
/* 226 */       dem.h(dek.a, 0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2, float f3) {
/* 231 */     this.g[0] = ☃;
/* 232 */     this.g[1] = f1;
/* 233 */     this.g[2] = f2;
/* 234 */     this.g[3] = f3;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/* 238 */     c(☃, i, true);
/*     */   }
/*     */   
/*     */   public void c(int ☃, int i, boolean bool) {
/* 242 */     RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
/* 243 */     if (!RenderSystem.isInInitPhase()) {
/* 244 */       RenderSystem.recordRenderCall(() -> e(☃, i, bool));
/*     */     }
/*     */     else {
/*     */       
/* 248 */       e(☃, i, bool);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void e(int ☃, int i, boolean bool) {
/* 253 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 254 */     dem.a(true, true, true, false);
/* 255 */     dem.l();
/* 256 */     dem.a(false);
/*     */     
/* 258 */     dem.w(5889);
/* 259 */     dem.P();
/* 260 */     dem.a(0.0D, ☃, i, 0.0D, 1000.0D, 3000.0D);
/* 261 */     dem.w(5888);
/* 262 */     dem.P();
/* 263 */     dem.c(0.0F, 0.0F, -2000.0F);
/*     */     
/* 265 */     dem.d(0, 0, ☃, i);
/*     */     
/* 267 */     dem.K();
/* 268 */     dem.g();
/* 269 */     dem.d();
/* 270 */     if (bool) {
/* 271 */       dem.n();
/* 272 */       dem.h();
/*     */     } 
/*     */     
/* 275 */     dem.d(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 277 */     c();
/*     */     
/* 279 */     float f1 = ☃;
/* 280 */     float f2 = i;
/* 281 */     float f3 = this.c / this.a;
/* 282 */     float f4 = this.d / this.b;
/*     */     
/* 284 */     dfo dfo = RenderSystem.renderThreadTesselator();
/* 285 */     dfh dfh = dfo.c();
/* 286 */     dfh.a(7, dfk.p);
/* 287 */     dfh.a(0.0D, f2, 0.0D).a(0.0F, 0.0F).a(255, 255, 255, 255).d();
/* 288 */     dfh.a(f1, f2, 0.0D).a(f3, 0.0F).a(255, 255, 255, 255).d();
/* 289 */     dfh.a(f1, 0.0D, 0.0D).a(f3, f4).a(255, 255, 255, 255).d();
/* 290 */     dfh.a(0.0D, 0.0D, 0.0D).a(0.0F, f4).a(255, 255, 255, 255).d();
/* 291 */     dfo.b();
/*     */     
/* 293 */     d();
/*     */     
/* 295 */     dem.a(true);
/* 296 */     dem.a(true, true, true, true);
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 300 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/* 301 */     a(true);
/* 302 */     dem.b(this.g[0], this.g[1], this.g[2], this.g[3]);
/* 303 */     int i = 16384;
/* 304 */     if (this.e) {
/* 305 */       dem.a(1.0D);
/* 306 */       i |= 0x100;
/*     */     } 
/* 308 */     dem.a(i, ☃);
/* 309 */     e();
/*     */   }
/*     */   
/*     */   public int f() {
/* 313 */     return this.i;
/*     */   }
/*     */   
/*     */   public int g() {
/* 317 */     return this.j;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\deg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */