/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Queues;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Deque;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class dlk
/*     */   extends dkw
/*     */ {
/*  25 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final djz b;
/*     */   
/*  29 */   private final List<String> c = Lists.newArrayList();
/*  30 */   private final List<dju<nr>> d = Lists.newArrayList();
/*  31 */   private final List<dju<afa>> e = Lists.newArrayList();
/*  32 */   private final Deque<nr> i = Queues.newArrayDeque();
/*     */   private int j;
/*     */   private boolean k;
/*  35 */   private long l = 0L;
/*     */   
/*     */   public dlk(djz ☃) {
/*  38 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i) {
/*  42 */     if (h()) {
/*     */       return;
/*     */     }
/*     */     
/*  46 */     k();
/*     */     
/*  48 */     int j = g();
/*  49 */     int k = this.e.size();
/*     */     
/*  51 */     if (k <= 0) {
/*     */       return;
/*     */     }
/*     */     
/*  55 */     boolean bool = false;
/*  56 */     if (i()) {
/*  57 */       bool = true;
/*     */     }
/*     */     
/*  60 */     double d1 = f();
/*  61 */     int m = afm.f(d() / d1);
/*     */     
/*  63 */     RenderSystem.pushMatrix();
/*  64 */     RenderSystem.translatef(2.0F, 8.0F, 0.0F);
/*  65 */     RenderSystem.scaled(d1, d1, 1.0D);
/*     */     
/*  67 */     double d2 = this.b.k.k * 0.8999999761581421D + 0.10000000149011612D;
/*  68 */     double d3 = this.b.k.m;
/*     */     
/*  70 */     double d4 = 9.0D * (this.b.k.l + 1.0D);
/*  71 */     double d5 = -8.0D * (this.b.k.l + 1.0D) + 4.0D * this.b.k.l;
/*     */     
/*  73 */     int n = 0; int i1;
/*  74 */     for (i1 = 0; i1 + this.j < this.e.size() && i1 < j; i1++) {
/*  75 */       dju<afa> dju = this.e.get(i1 + this.j);
/*  76 */       if (dju != null) {
/*     */ 
/*     */         
/*  79 */         int i2 = i - dju.b();
/*     */         
/*  81 */         if (i2 < 200 || bool) {
/*  82 */           double d = bool ? 1.0D : a(i2);
/*  83 */           int i3 = (int)(255.0D * d * d2);
/*  84 */           int i4 = (int)(255.0D * d * d3);
/*     */           
/*  86 */           n++;
/*     */           
/*  88 */           if (i3 > 3) {
/*  89 */             int i5 = 0;
/*  90 */             double d6 = -i1 * d4;
/*  91 */             ☃.a();
/*  92 */             ☃.a(0.0D, 0.0D, 50.0D);
/*  93 */             a(☃, -2, (int)(d6 - d4), 0 + m + 4, (int)d6, i4 << 24);
/*     */             
/*  95 */             RenderSystem.enableBlend();
/*  96 */             ☃.a(0.0D, 0.0D, 50.0D);
/*  97 */             this.b.g.a(☃, dju.a(), 0.0F, (int)(d6 + d5), 16777215 + (i3 << 24));
/*  98 */             RenderSystem.disableAlphaTest();
/*  99 */             RenderSystem.disableBlend();
/* 100 */             ☃.b();
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 105 */     if (!this.i.isEmpty()) {
/* 106 */       i1 = (int)(128.0D * d2);
/* 107 */       int i2 = (int)(255.0D * d3);
/* 108 */       ☃.a();
/* 109 */       ☃.a(0.0D, 0.0D, 50.0D);
/* 110 */       a(☃, -2, 0, m + 4, 9, i2 << 24);
/*     */       
/* 112 */       RenderSystem.enableBlend();
/* 113 */       ☃.a(0.0D, 0.0D, 50.0D);
/* 114 */       this.b.g.a(☃, new of("chat.queue", new Object[] { Integer.valueOf(this.i.size()) }), 0.0F, 1.0F, 16777215 + (i1 << 24));
/* 115 */       ☃.b();
/* 116 */       RenderSystem.disableAlphaTest();
/* 117 */       RenderSystem.disableBlend();
/*     */     } 
/*     */     
/* 120 */     if (bool) {
/* 121 */       this.b.g.getClass(); i1 = 9;
/* 122 */       RenderSystem.translatef(-3.0F, 0.0F, 0.0F);
/*     */       
/* 124 */       int i2 = k * i1 + k;
/* 125 */       int i3 = n * i1 + n;
/* 126 */       int i4 = this.j * i3 / k;
/* 127 */       int i5 = i3 * i3 / i2;
/*     */       
/* 129 */       if (i2 != i3) {
/* 130 */         int i6 = (i4 > 0) ? 170 : 96;
/* 131 */         int i7 = this.k ? 13382451 : 3355562;
/*     */         
/* 133 */         a(☃, 0, -i4, 2, -i4 - i5, i7 + (i6 << 24));
/* 134 */         a(☃, 2, -i4, 1, -i4 - i5, 13421772 + (i6 << 24));
/*     */       } 
/*     */     } 
/*     */     
/* 138 */     RenderSystem.popMatrix();
/*     */   }
/*     */   
/*     */   private boolean h() {
/* 142 */     return (this.b.k.j == bfu.c);
/*     */   }
/*     */   
/*     */   private static double a(int ☃) {
/* 146 */     double d = ☃ / 200.0D;
/* 147 */     d = 1.0D - d;
/* 148 */     d *= 10.0D;
/* 149 */     d = afm.a(d, 0.0D, 1.0D);
/* 150 */     d *= d;
/* 151 */     return d;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 155 */     this.i.clear();
/* 156 */     this.e.clear();
/* 157 */     this.d.clear();
/* 158 */     if (☃) {
/* 159 */       this.c.clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(nr ☃) {
/* 164 */     a(☃, 0);
/*     */   }
/*     */   
/*     */   private void a(nr ☃, int i) {
/* 168 */     a(☃, i, this.b.j.d(), false);
/* 169 */     a.info("[CHAT] {}", ☃.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
/*     */   }
/*     */   
/*     */   private void a(nr ☃, int i, int j, boolean bool) {
/* 173 */     if (i != 0) {
/* 174 */       b(i);
/*     */     }
/*     */     
/* 177 */     int k = afm.c(d() / f());
/* 178 */     List<afa> list = dln.a(☃, k, this.b.g);
/*     */     
/* 180 */     boolean bool1 = i();
/* 181 */     for (afa afa : list) {
/* 182 */       if (bool1 && this.j > 0) {
/* 183 */         this.k = true;
/* 184 */         a(1.0D);
/*     */       } 
/*     */       
/* 187 */       this.e.add(0, new dju<>(j, afa, i));
/*     */     } 
/*     */     
/* 190 */     while (this.e.size() > 100) {
/* 191 */       this.e.remove(this.e.size() - 1);
/*     */     }
/*     */     
/* 194 */     if (!bool) {
/* 195 */       this.d.add(0, new dju<>(j, ☃, i));
/*     */       
/* 197 */       while (this.d.size() > 100) {
/* 198 */         this.d.remove(this.d.size() - 1);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/* 204 */     this.e.clear();
/* 205 */     c();
/*     */     
/* 207 */     for (int ☃ = this.d.size() - 1; ☃ >= 0; ☃--) {
/* 208 */       dju<nr> dju = this.d.get(☃);
/* 209 */       a(dju.a(), dju.c(), dju.b(), true);
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<String> b() {
/* 214 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 218 */     if (this.c.isEmpty() || !((String)this.c.get(this.c.size() - 1)).equals(☃)) {
/* 219 */       this.c.add(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void c() {
/* 224 */     this.j = 0;
/* 225 */     this.k = false;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 229 */     this.j = (int)(this.j + ☃);
/* 230 */     int i = this.e.size();
/*     */     
/* 232 */     if (this.j > i - g()) {
/* 233 */       this.j = i - g();
/*     */     }
/*     */     
/* 236 */     if (this.j <= 0) {
/* 237 */       this.j = 0;
/* 238 */       this.k = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(double ☃, double d1) {
/* 243 */     if (!i() || this.b.k.aI || h() || this.i.isEmpty()) {
/* 244 */       return false;
/*     */     }
/*     */     
/* 247 */     double d2 = ☃ - 2.0D;
/* 248 */     double d3 = this.b.aD().p() - d1 - 40.0D;
/*     */     
/* 250 */     if (d2 <= afm.c(d() / f()) && d3 < 0.0D && d3 > afm.c(-9.0D * f())) {
/* 251 */       a(this.i.remove());
/* 252 */       this.l = System.currentTimeMillis();
/* 253 */       return true;
/*     */     } 
/*     */     
/* 256 */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ob b(double ☃, double d1) {
/* 261 */     if (!i() || this.b.k.aI || h()) {
/* 262 */       return null;
/*     */     }
/*     */     
/* 265 */     double d2 = ☃ - 2.0D;
/* 266 */     double d3 = this.b.aD().p() - d1 - 40.0D;
/* 267 */     d2 = afm.c(d2 / f());
/* 268 */     d3 = afm.c(d3 / f() * (this.b.k.l + 1.0D));
/*     */     
/* 270 */     if (d2 < 0.0D || d3 < 0.0D) {
/* 271 */       return null;
/*     */     }
/*     */     
/* 274 */     int i = Math.min(g(), this.e.size());
/*     */     
/* 276 */     this.b.g.getClass(); if (d2 <= afm.c(d() / f()) && d3 < (9 * i + i)) {
/* 277 */       this.b.g.getClass(); int j = (int)(d3 / 9.0D + this.j);
/* 278 */       if (j >= 0 && j < this.e.size()) {
/* 279 */         dju<afa> dju = this.e.get(j);
/* 280 */         return this.b.g.b().a(dju.a(), (int)d2);
/*     */       } 
/*     */     } 
/*     */     
/* 284 */     return null;
/*     */   }
/*     */   
/*     */   private boolean i() {
/* 288 */     return this.b.y instanceof dnq;
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/* 292 */     this.e.removeIf(dju1 -> (dju1.c() == ☃));
/* 293 */     this.d.removeIf(dju1 -> (dju1.c() == ☃));
/*     */   }
/*     */   
/*     */   public int d() {
/* 297 */     return b(this.b.k.w);
/*     */   }
/*     */   
/*     */   public int e() {
/* 301 */     return c((i() ? this.b.k.y : this.b.k.x) / (this.b.k.l + 1.0D));
/*     */   }
/*     */   
/*     */   public double f() {
/* 305 */     return this.b.k.v;
/*     */   }
/*     */   
/*     */   public static int b(double ☃) {
/* 309 */     int i = 320;
/* 310 */     int j = 40;
/* 311 */     return afm.c(☃ * 280.0D + 40.0D);
/*     */   }
/*     */   
/*     */   public static int c(double ☃) {
/* 315 */     int i = 180;
/* 316 */     int j = 20;
/* 317 */     return afm.c(☃ * 160.0D + 20.0D);
/*     */   }
/*     */   
/*     */   public int g() {
/* 321 */     return e() / 9;
/*     */   }
/*     */   
/*     */   private long j() {
/* 325 */     return (long)(this.b.k.z * 1000.0D);
/*     */   }
/*     */   
/*     */   private void k() {
/* 329 */     if (this.i.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 333 */     long ☃ = System.currentTimeMillis();
/* 334 */     if (☃ - this.l >= j()) {
/* 335 */       a(this.i.remove());
/* 336 */       this.l = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(nr ☃) {
/* 341 */     if (this.b.k.z <= 0.0D) {
/* 342 */       a(☃);
/*     */     } else {
/* 344 */       long l = System.currentTimeMillis();
/* 345 */       if (l - this.l >= j()) {
/* 346 */         a(☃);
/* 347 */         this.l = l;
/*     */       } else {
/* 349 */         this.i.add(☃);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */