/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ public class dqg
/*     */   extends dpp<bis>
/*     */ {
/*  33 */   private static final vk H = new vk("textures/gui/container/enchanting_table.png");
/*  34 */   private static final vk I = new vk("textures/entity/enchanting_table_book.png");
/*  35 */   private static final dto J = new dto();
/*     */   
/*  37 */   private final Random K = new Random();
/*     */   
/*     */   public int A;
/*     */   
/*     */   public float B;
/*     */   public float C;
/*     */   public float D;
/*     */   public float E;
/*     */   public float F;
/*     */   public float G;
/*  47 */   private bmb L = bmb.b;
/*     */   
/*     */   public dqg(bis ☃, bfv bfv1, nr nr1) {
/*  50 */     super(☃, bfv1, nr1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  55 */     super.d();
/*  56 */     i();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/*  61 */     int j = (this.k - this.b) / 2;
/*  62 */     int k = (this.l - this.c) / 2;
/*  63 */     for (int m = 0; m < 3; m++) {
/*  64 */       double d2 = ☃ - (j + 60);
/*  65 */       double d3 = d1 - (k + 14 + 19 * m);
/*  66 */       if (d2 >= 0.0D && d3 >= 0.0D && d2 < 108.0D && d3 < 19.0D && 
/*  67 */         this.t.a(this.i.s, m)) {
/*  68 */         this.i.q.a(this.t.b, m);
/*  69 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/*  73 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/*  78 */     dep.c();
/*  79 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  80 */     this.i.M().a(H);
/*  81 */     int k = (this.k - this.b) / 2;
/*  82 */     int m = (this.l - this.c) / 2;
/*  83 */     b(☃, k, m, 0, 0, this.b, this.c);
/*     */     
/*  85 */     RenderSystem.matrixMode(5889);
/*  86 */     RenderSystem.pushMatrix();
/*  87 */     RenderSystem.loadIdentity();
/*     */     
/*  89 */     int n = (int)this.i.aD().s();
/*  90 */     RenderSystem.viewport((this.k - 320) / 2 * n, (this.l - 240) / 2 * n, 320 * n, 240 * n);
/*  91 */     RenderSystem.translatef(-0.34F, 0.23F, 0.0F);
/*     */     
/*  93 */     RenderSystem.multMatrix(b.a(90.0D, 1.3333334F, 9.0F, 80.0F));
/*     */     
/*  95 */     RenderSystem.matrixMode(5888);
/*     */     
/*  97 */     ☃.a();
/*  98 */     dfm.a a = ☃.c();
/*  99 */     a.a().a();
/* 100 */     a.b().c();
/*     */     
/* 102 */     ☃.a(0.0D, 3.299999952316284D, 1984.0D);
/* 103 */     float f1 = 5.0F;
/* 104 */     ☃.a(5.0F, 5.0F, 5.0F);
/* 105 */     ☃.a(g.f.a(180.0F));
/*     */     
/* 107 */     ☃.a(g.b.a(20.0F));
/* 108 */     float f2 = afm.g(f, this.G, this.F);
/* 109 */     ☃.a(((1.0F - f2) * 0.2F), ((1.0F - f2) * 0.1F), ((1.0F - f2) * 0.25F));
/* 110 */     float f3 = -(1.0F - f2) * 90.0F - 90.0F;
/* 111 */     ☃.a(g.d.a(f3));
/* 112 */     ☃.a(g.b.a(180.0F));
/*     */     
/* 114 */     float f4 = afm.g(f, this.C, this.B) + 0.25F;
/* 115 */     float f5 = afm.g(f, this.C, this.B) + 0.75F;
/* 116 */     f4 = (f4 - afm.b(f4)) * 1.6F - 0.3F;
/* 117 */     f5 = (f5 - afm.b(f5)) * 1.6F - 0.3F;
/*     */     
/* 119 */     if (f4 < 0.0F) {
/* 120 */       f4 = 0.0F;
/*     */     }
/* 122 */     if (f5 < 0.0F) {
/* 123 */       f5 = 0.0F;
/*     */     }
/* 125 */     if (f4 > 1.0F) {
/* 126 */       f4 = 1.0F;
/*     */     }
/* 128 */     if (f5 > 1.0F) {
/* 129 */       f5 = 1.0F;
/*     */     }
/*     */     
/* 132 */     RenderSystem.enableRescaleNormal();
/*     */     
/* 134 */     J.a(0.0F, f4, f5, f2);
/* 135 */     eag.a a1 = eag.a(dfo.a().c());
/* 136 */     dfq dfq = a1.getBuffer(J.a(I));
/* 137 */     J.a(☃, dfq, 15728880, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 139 */     a1.a();
/*     */     
/* 141 */     ☃.b();
/*     */     
/* 143 */     RenderSystem.matrixMode(5889);
/* 144 */     RenderSystem.viewport(0, 0, this.i.aD().k(), this.i.aD().l());
/* 145 */     RenderSystem.popMatrix();
/* 146 */     RenderSystem.matrixMode(5888);
/*     */     
/* 148 */     dep.d();
/*     */     
/* 150 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 152 */     dqf.a().a(this.t.f());
/*     */     
/* 154 */     int i1 = this.t.e();
/*     */     
/* 156 */     for (int i2 = 0; i2 < 3; i2++) {
/* 157 */       int i3 = k + 60;
/* 158 */       int i4 = i3 + 20;
/*     */       
/* 160 */       d(0);
/* 161 */       this.i.M().a(H);
/* 162 */       int i5 = this.t.c[i2];
/* 163 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 164 */       if (i5 == 0) {
/* 165 */         b(☃, i3, m + 14 + 19 * i2, 0, 185, 108, 19);
/*     */       } else {
/*     */         
/* 168 */         String str = "" + i5;
/* 169 */         int i6 = 86 - this.o.b(str);
/* 170 */         nu nu = dqf.a().a(this.o, i6);
/* 171 */         int i7 = 6839882;
/*     */         
/* 173 */         if ((i1 < i2 + 1 || this.i.s.bD < i5) && !this.i.s.bC.d) {
/* 174 */           b(☃, i3, m + 14 + 19 * i2, 0, 185, 108, 19);
/* 175 */           b(☃, i3 + 1, m + 15 + 19 * i2, 16 * i2, 239, 16, 16);
/* 176 */           this.o.a(nu, i4, m + 16 + 19 * i2, i6, (i7 & 0xFEFEFE) >> 1);
/* 177 */           i7 = 4226832;
/*     */         } else {
/* 179 */           int i8 = i - k + 60;
/* 180 */           int i9 = j - m + 14 + 19 * i2;
/* 181 */           if (i8 >= 0 && i9 >= 0 && i8 < 108 && i9 < 19) {
/* 182 */             b(☃, i3, m + 14 + 19 * i2, 0, 204, 108, 19);
/* 183 */             i7 = 16777088;
/*     */           } else {
/* 185 */             b(☃, i3, m + 14 + 19 * i2, 0, 166, 108, 19);
/*     */           } 
/* 187 */           b(☃, i3 + 1, m + 15 + 19 * i2, 16 * i2, 223, 16, 16);
/* 188 */           this.o.a(nu, i4, m + 16 + 19 * i2, i6, i7);
/* 189 */           i7 = 8453920;
/*     */         } 
/* 191 */         this.o.a(☃, str, (i4 + 86 - this.o.b(str)), (m + 16 + 19 * i2 + 7), i7);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 197 */     f = this.i.aj();
/*     */     
/* 199 */     a(☃);
/* 200 */     super.a(☃, i, j, f);
/* 201 */     a(☃, i, j);
/*     */     
/* 203 */     boolean bool = this.i.s.bC.d;
/* 204 */     int k = this.t.e();
/*     */     
/* 206 */     for (int m = 0; m < 3; m++) {
/* 207 */       int n = this.t.c[m];
/*     */       
/* 209 */       bps bps = bps.c(this.t.d[m]);
/* 210 */       int i1 = this.t.e[m];
/*     */       
/* 212 */       int i2 = m + 1;
/* 213 */       if (a(60, 14 + 19 * m, 108, 17, i, j) && n > 0 && i1 >= 0 && bps != null) {
/* 214 */         List<nr> list = Lists.newArrayList();
/*     */         
/* 216 */         list.add((new of("container.enchant.clue", new Object[] { bps.d(i1) })).a(k.p));
/*     */         
/* 218 */         if (!bool) {
/* 219 */           list.add(oe.d);
/* 220 */           if (this.i.s.bD < n) {
/* 221 */             list.add((new of("container.enchant.level.requirement", new Object[] { Integer.valueOf(this.t.c[m]) })).a(k.m));
/*     */           } else {
/*     */             nx nx1, nx2;
/* 224 */             if (i2 == 1) {
/* 225 */               nx1 = new of("container.enchant.lapis.one");
/*     */             } else {
/* 227 */               nx1 = new of("container.enchant.lapis.many", new Object[] { Integer.valueOf(i2) });
/*     */             } 
/* 229 */             list.add(nx1.a((k >= i2) ? k.h : k.m));
/*     */ 
/*     */             
/* 232 */             if (i2 == 1) {
/* 233 */               nx2 = new of("container.enchant.level.one");
/*     */             } else {
/* 235 */               nx2 = new of("container.enchant.level.many", new Object[] { Integer.valueOf(i2) });
/*     */             } 
/* 237 */             list.add(nx2.a(k.h));
/*     */           } 
/*     */         } 
/*     */         
/* 241 */         b(☃, list, i, j);
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void i() {
/* 248 */     bmb ☃ = this.t.a(0).e();
/*     */     
/* 250 */     if (!bmb.b(☃, this.L)) {
/* 251 */       this.L = ☃;
/*     */       do {
/* 253 */         this.D += (this.K.nextInt(4) - this.K.nextInt(4));
/* 254 */       } while (this.B <= this.D + 1.0F && this.B >= this.D - 1.0F);
/*     */     } 
/*     */     
/* 257 */     this.A++;
/* 258 */     this.C = this.B;
/* 259 */     this.G = this.F;
/*     */     
/* 261 */     boolean bool = false;
/* 262 */     for (int i = 0; i < 3; i++) {
/* 263 */       if (this.t.c[i] != 0) {
/* 264 */         bool = true;
/*     */       }
/*     */     } 
/*     */     
/* 268 */     if (bool) {
/* 269 */       this.F += 0.2F;
/*     */     } else {
/* 271 */       this.F -= 0.2F;
/*     */     } 
/* 273 */     this.F = afm.a(this.F, 0.0F, 1.0F);
/*     */     
/* 275 */     float f1 = (this.D - this.B) * 0.4F;
/* 276 */     float f2 = 0.2F;
/* 277 */     f1 = afm.a(f1, -0.2F, 0.2F);
/* 278 */     this.E += (f1 - this.E) * 0.9F;
/*     */     
/* 280 */     this.B += this.E;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */