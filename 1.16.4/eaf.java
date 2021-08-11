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
/*     */ public class eaf
/*     */   implements AutoCloseable
/*     */ {
/*     */   private final ejs a;
/*     */   private final det b;
/*     */   private final vk c;
/*     */   private boolean d;
/*     */   private float e;
/*     */   private final dzz f;
/*     */   private final djz g;
/*     */   
/*     */   public eaf(dzz ☃, djz djz1) {
/*  30 */     this.f = ☃;
/*  31 */     this.g = djz1;
/*     */     
/*  33 */     this.a = new ejs(16, 16, false);
/*  34 */     this.c = this.g.M().a("light_map", this.a);
/*  35 */     this.b = this.a.e();
/*  36 */     for (int i = 0; i < 16; i++) {
/*  37 */       for (int j = 0; j < 16; j++) {
/*  38 */         this.b.a(j, i, -1);
/*     */       }
/*     */     } 
/*  41 */     this.a.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/*  46 */     this.a.close();
/*     */   }
/*     */   
/*     */   public void a() {
/*  50 */     this.e = (float)(this.e + (Math.random() - Math.random()) * Math.random() * Math.random() * 0.1D);
/*  51 */     this.e = (float)(this.e * 0.9D);
/*  52 */     this.d = true;
/*     */   }
/*     */   
/*     */   public void b() {
/*  56 */     RenderSystem.activeTexture(33986);
/*  57 */     RenderSystem.disableTexture();
/*  58 */     RenderSystem.activeTexture(33984);
/*     */   }
/*     */   
/*     */   public void c() {
/*  62 */     RenderSystem.activeTexture(33986);
/*  63 */     RenderSystem.matrixMode(5890);
/*  64 */     RenderSystem.loadIdentity();
/*  65 */     float ☃ = 0.00390625F;
/*  66 */     RenderSystem.scalef(0.00390625F, 0.00390625F, 0.00390625F);
/*  67 */     RenderSystem.translatef(8.0F, 8.0F, 8.0F);
/*  68 */     RenderSystem.matrixMode(5888);
/*     */     
/*  70 */     this.g.M().a(this.c);
/*  71 */     RenderSystem.texParameter(3553, 10241, 9729);
/*  72 */     RenderSystem.texParameter(3553, 10240, 9729);
/*  73 */     RenderSystem.texParameter(3553, 10242, 10496);
/*  74 */     RenderSystem.texParameter(3553, 10243, 10496);
/*  75 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  76 */     RenderSystem.enableTexture();
/*  77 */     RenderSystem.activeTexture(33984);
/*     */   }
/*     */   public void a(float ☃) {
/*     */     float f2, f3;
/*  81 */     if (!this.d) {
/*     */       return;
/*     */     }
/*  84 */     this.d = false;
/*  85 */     this.g.au().a("lightTex");
/*  86 */     dwt dwt = this.g.r;
/*  87 */     if (dwt == null) {
/*     */       return;
/*     */     }
/*     */     
/*  91 */     float f1 = dwt.g(1.0F);
/*     */     
/*  93 */     if (dwt.s() > 0) {
/*  94 */       f2 = 1.0F;
/*     */     } else {
/*  96 */       f2 = f1 * 0.95F + 0.05F;
/*     */     } 
/*     */ 
/*     */     
/* 100 */     float f4 = this.g.s.N();
/* 101 */     if (this.g.s.a(apw.p)) {
/* 102 */       f3 = dzz.a(this.g.s, ☃);
/* 103 */     } else if (f4 > 0.0F && this.g.s.a(apw.C)) {
/* 104 */       f3 = f4;
/*     */     } else {
/* 106 */       f3 = 0.0F;
/*     */     } 
/*     */ 
/*     */     
/* 110 */     g g1 = new g(f1, f1, 1.0F);
/* 111 */     g1.a(new g(1.0F, 1.0F, 1.0F), 0.35F);
/*     */ 
/*     */     
/* 114 */     float f5 = this.e + 1.5F;
/*     */     
/* 116 */     g g2 = new g();
/*     */     
/* 118 */     for (int i = 0; i < 16; i++) {
/* 119 */       for (int j = 0; j < 16; j++) {
/* 120 */         float f6 = a(dwt, i) * f2;
/* 121 */         float f7 = a(dwt, j) * f5;
/*     */ 
/*     */         
/* 124 */         float f8 = f7;
/* 125 */         float f9 = f7 * ((f7 * 0.6F + 0.4F) * 0.6F + 0.4F);
/* 126 */         float f10 = f7 * (f7 * f7 * 0.6F + 0.4F);
/*     */         
/* 128 */         g2.a(f8, f9, f10);
/*     */         
/* 130 */         if (dwt.a().d()) {
/* 131 */           g2.a(new g(0.99F, 1.12F, 1.0F), 0.25F);
/*     */         } else {
/* 133 */           g g3 = g1.e();
/* 134 */           g3.b(f6);
/*     */           
/* 136 */           g2.a(g3);
/*     */           
/* 138 */           g2.a(new g(0.75F, 0.75F, 0.75F), 0.04F);
/*     */           
/* 140 */           if (this.f.b(☃) > 0.0F) {
/* 141 */             float f = this.f.b(☃);
/*     */             
/* 143 */             g g4 = g2.e();
/* 144 */             g4.b(0.7F, 0.6F, 0.6F);
/* 145 */             g2.a(g4, f);
/*     */           } 
/*     */         } 
/*     */         
/* 149 */         g2.a(0.0F, 1.0F);
/*     */         
/* 151 */         if (f3 > 0.0F) {
/*     */           
/* 153 */           float f = Math.max(g2.a(), Math.max(g2.b(), g2.c()));
/* 154 */           if (f < 1.0F) {
/* 155 */             float f12 = 1.0F / f;
/*     */             
/* 157 */             g g3 = g2.e();
/* 158 */             g3.b(f12);
/*     */             
/* 160 */             g2.a(g3, f3);
/*     */           } 
/*     */         } 
/*     */         
/* 164 */         float f11 = (float)this.g.k.aR;
/*     */         
/* 166 */         g g = g2.e();
/* 167 */         g.a(this::b);
/* 168 */         g2.a(g, f11);
/*     */         
/* 170 */         g2.a(new g(0.75F, 0.75F, 0.75F), 0.04F);
/*     */         
/* 172 */         g2.a(0.0F, 1.0F);
/*     */         
/* 174 */         g2.b(255.0F);
/*     */         
/* 176 */         int k = 255;
/* 177 */         int m = (int)g2.a();
/* 178 */         int n = (int)g2.b();
/* 179 */         int i1 = (int)g2.c();
/*     */         
/* 181 */         this.b.a(j, i, 0xFF000000 | i1 << 16 | n << 8 | m);
/*     */       } 
/*     */     } 
/* 184 */     this.a.a();
/* 185 */     this.g.au().c();
/*     */   }
/*     */   
/*     */   private float b(float ☃) {
/* 189 */     float f = 1.0F - ☃;
/* 190 */     return 1.0F - f * f * f * f;
/*     */   }
/*     */ 
/*     */   
/*     */   private float a(brx ☃, int i) {
/* 195 */     return ☃.k().a(i);
/*     */   }
/*     */   
/*     */   public static int a(int ☃, int i) {
/* 199 */     return ☃ << 4 | i << 20;
/*     */   }
/*     */   
/*     */   public static int a(int ☃) {
/* 203 */     return ☃ >> 4 & 0xFFFF;
/*     */   }
/*     */   
/*     */   public static int b(int ☃) {
/* 207 */     return ☃ >> 20 & 0xFFFF;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eaf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */