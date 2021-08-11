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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dxv
/*     */ {
/*     */   public static class e
/*     */     extends dye
/*     */   {
/*     */     private int a;
/*     */     private final dyi b;
/*     */     private mj B;
/*     */     private boolean C;
/*     */     
/*     */     public e(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyi dyi1, @Nullable md md1) {
/*  30 */       super(☃, d1, d2, d3);
/*  31 */       this.j = d4;
/*  32 */       this.k = d5;
/*  33 */       this.l = d6;
/*  34 */       this.b = dyi1;
/*  35 */       this.t = 8;
/*     */       
/*  37 */       if (md1 != null) {
/*  38 */         this.B = md1.d("Explosions", 10);
/*  39 */         if (this.B.isEmpty()) {
/*  40 */           this.B = null;
/*     */         } else {
/*  42 */           this.t = this.B.size() * 2 - 1;
/*     */ 
/*     */           
/*  45 */           for (int i = 0; i < this.B.size(); i++) {
/*  46 */             md md2 = this.B.a(i);
/*  47 */             if (md2.q("Flicker")) {
/*  48 */               this.C = true;
/*  49 */               this.t += 15;
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/*  59 */       if (this.a == 0 && this.B != null) {
/*  60 */         adp adp; boolean ☃ = c();
/*     */         
/*  62 */         boolean bool1 = false;
/*  63 */         if (this.B.size() >= 3) {
/*  64 */           bool1 = true;
/*     */         } else {
/*  66 */           for (int i = 0; i < this.B.size(); i++) {
/*  67 */             md md = this.B.a(i);
/*  68 */             if (blm.a.a(md.f("Type")) == blm.a.b) {
/*  69 */               bool1 = true;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/*  76 */         if (bool1) {
/*  77 */           adp = ☃ ? adq.ed : adq.ec;
/*     */         } else {
/*  79 */           adp = ☃ ? adq.eb : adq.ea;
/*     */         } 
/*  81 */         this.c.a(this.g, this.h, this.i, adp, adr.i, 20.0F, 0.95F + this.r.nextFloat() * 0.1F, true);
/*     */       } 
/*     */       
/*  84 */       if (this.a % 2 == 0 && this.B != null && this.a / 2 < this.B.size()) {
/*  85 */         int ☃ = this.a / 2;
/*  86 */         md md = this.B.a(☃);
/*     */         
/*  88 */         blm.a a = blm.a.a(md.f("Type"));
/*  89 */         boolean bool1 = md.q("Trail");
/*  90 */         boolean bool2 = md.q("Flicker");
/*  91 */         int[] arrayOfInt1 = md.n("Colors");
/*  92 */         int[] arrayOfInt2 = md.n("FadeColors");
/*     */         
/*  94 */         if (arrayOfInt1.length == 0) {
/*  95 */           arrayOfInt1 = new int[] { bkx.p.g() };
/*     */         }
/*     */         
/*  98 */         switch (dxv.null.a[a.ordinal()]) {
/*     */           
/*     */           default:
/* 101 */             a(0.25D, 2, arrayOfInt1, arrayOfInt2, bool1, bool2);
/*     */             break;
/*     */           case 2:
/* 104 */             a(0.5D, 4, arrayOfInt1, arrayOfInt2, bool1, bool2);
/*     */             break;
/*     */           case 3:
/* 107 */             a(0.5D, new double[][] { { 0.0D, 1.0D }, , { 0.3455D, 0.309D }, , { 0.9511D, 0.309D }, , { 0.3795918367346939D, -0.12653061224489795D }, , { 0.6122448979591837D, -0.8040816326530612D }, , { 0.0D, -0.35918367346938773D },  }, arrayOfInt1, arrayOfInt2, bool1, bool2, false);
/*     */             break;
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
/*     */           case 4:
/* 125 */             a(0.5D, new double[][] { { 0.0D, 0.2D }, , { 0.2D, 0.2D }, , { 0.2D, 0.6D }, , { 0.6D, 0.6D }, , { 0.6D, 0.2D }, , { 0.2D, 0.2D }, , { 0.2D, 0.0D }, , { 0.4D, 0.0D }, , { 0.4D, -0.6D }, , { 0.2D, -0.6D }, , { 0.2D, -0.4D }, , { 0.0D, -0.4D },  }, arrayOfInt1, arrayOfInt2, bool1, bool2, true);
/*     */             break;
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
/*     */           case 5:
/* 149 */             a(arrayOfInt1, arrayOfInt2, bool1, bool2);
/*     */             break;
/*     */         } 
/*     */         
/* 153 */         int i = arrayOfInt1[0];
/* 154 */         float f1 = ((i & 0xFF0000) >> 16) / 255.0F;
/* 155 */         float f2 = ((i & 0xFF00) >> 8) / 255.0F;
/* 156 */         float f3 = ((i & 0xFF) >> 0) / 255.0F;
/* 157 */         dyg dyg = this.b.a(hh.D, this.g, this.h, this.i, 0.0D, 0.0D, 0.0D);
/* 158 */         dyg.a(f1, f2, f3);
/*     */       } 
/* 160 */       this.a++;
/* 161 */       if (this.a > this.t) {
/* 162 */         if (this.C) {
/* 163 */           boolean ☃ = c();
/* 164 */           adp adp = ☃ ? adq.eh : adq.eg;
/* 165 */           this.c.a(this.g, this.h, this.i, adp, adr.i, 20.0F, 0.9F + this.r.nextFloat() * 0.15F, true);
/*     */         } 
/* 167 */         j();
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean c() {
/* 172 */       djz ☃ = djz.C();
/* 173 */       return (☃.h.k().b().c(this.g, this.h, this.i) >= 256.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     private void a(double ☃, double d1, double d2, double d3, double d4, double d5, int[] arrayOfInt1, int[] arrayOfInt2, boolean bool1, boolean bool2) {
/* 178 */       dxv.c c = (dxv.c)this.b.a(hh.y, ☃, d1, d2, d3, d4, d5);
/* 179 */       c.a(bool1);
/* 180 */       c.b(bool2);
/* 181 */       c.e(0.99F);
/*     */       
/* 183 */       int i = this.r.nextInt(arrayOfInt1.length);
/* 184 */       c.b(arrayOfInt1[i]);
/* 185 */       if (arrayOfInt2.length > 0) {
/* 186 */         c.c(x.a(arrayOfInt2, this.r));
/*     */       }
/*     */     }
/*     */     
/*     */     private void a(double ☃, int i, int[] arrayOfInt1, int[] arrayOfInt2, boolean bool1, boolean bool2) {
/* 191 */       double d1 = this.g;
/* 192 */       double d2 = this.h;
/* 193 */       double d3 = this.i;
/*     */       
/* 195 */       for (int j = -i; j <= i; j++) {
/* 196 */         for (int k = -i; k <= i; k++) {
/* 197 */           for (int m = -i; m <= i; m++) {
/* 198 */             double d4 = k + (this.r.nextDouble() - this.r.nextDouble()) * 0.5D;
/* 199 */             double d5 = j + (this.r.nextDouble() - this.r.nextDouble()) * 0.5D;
/* 200 */             double d6 = m + (this.r.nextDouble() - this.r.nextDouble()) * 0.5D;
/* 201 */             double d7 = afm.a(d4 * d4 + d5 * d5 + d6 * d6) / ☃ + this.r.nextGaussian() * 0.05D;
/*     */             
/* 203 */             a(d1, d2, d3, d4 / d7, d5 / d7, d6 / d7, arrayOfInt1, arrayOfInt2, bool1, bool2);
/*     */             
/* 205 */             if (j != -i && j != i && k != -i && k != i) {
/* 206 */               m += i * 2 - 1;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private void a(double ☃, double[][] arrayOfDouble, int[] arrayOfInt1, int[] arrayOfInt2, boolean bool1, boolean bool2, boolean bool3) {
/* 214 */       double d1 = arrayOfDouble[0][0];
/* 215 */       double d2 = arrayOfDouble[0][1];
/*     */       
/* 217 */       a(this.g, this.h, this.i, d1 * ☃, d2 * ☃, 0.0D, arrayOfInt1, arrayOfInt2, bool1, bool2);
/*     */       
/* 219 */       float f = this.r.nextFloat() * 3.1415927F;
/* 220 */       double d3 = bool3 ? 0.034D : 0.34D;
/* 221 */       for (int i = 0; i < 3; i++) {
/* 222 */         double d4 = f + (i * 3.1415927F) * d3;
/*     */         
/* 224 */         double d5 = d1;
/* 225 */         double d6 = d2;
/*     */         
/* 227 */         for (int j = 1; j < arrayOfDouble.length; j++) {
/* 228 */           double d7 = arrayOfDouble[j][0];
/* 229 */           double d8 = arrayOfDouble[j][1];
/*     */           double d9;
/* 231 */           for (d9 = 0.25D; d9 <= 1.0D; d9 += 0.25D) {
/* 232 */             double d10 = afm.d(d9, d5, d7) * ☃;
/* 233 */             double d11 = afm.d(d9, d6, d8) * ☃;
/*     */             
/* 235 */             double d12 = d10 * Math.sin(d4);
/* 236 */             d10 *= Math.cos(d4);
/*     */             double d13;
/* 238 */             for (d13 = -1.0D; d13 <= 1.0D; d13 += 2.0D) {
/* 239 */               a(this.g, this.h, this.i, d10 * d13, d11, d12 * d13, arrayOfInt1, arrayOfInt2, bool1, bool2);
/*     */             }
/*     */           } 
/* 242 */           d5 = d7;
/* 243 */           d6 = d8;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private void a(int[] ☃, int[] arrayOfInt1, boolean bool1, boolean bool2) {
/* 249 */       double d1 = this.r.nextGaussian() * 0.05D;
/* 250 */       double d2 = this.r.nextGaussian() * 0.05D;
/*     */       
/* 252 */       for (int i = 0; i < 70; i++) {
/* 253 */         double d3 = this.j * 0.5D + this.r.nextGaussian() * 0.15D + d1;
/* 254 */         double d4 = this.l * 0.5D + this.r.nextGaussian() * 0.15D + d2;
/* 255 */         double d5 = this.k * 0.5D + this.r.nextDouble() * 0.5D;
/*     */         
/* 257 */         a(this.g, this.h, this.i, d3, d5, d4, ☃, arrayOfInt1, bool1, bool2);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class c
/*     */     extends dyp {
/*     */     private boolean b;
/*     */     private boolean D;
/*     */     private final dyi E;
/*     */     private float F;
/*     */     private float G;
/*     */     private float H;
/*     */     private boolean I;
/*     */     
/*     */     private c(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyi dyi1, dyw dyw1) {
/* 273 */       super(☃, d1, d2, d3, dyw1, -0.004F);
/* 274 */       this.j = d4;
/* 275 */       this.k = d5;
/* 276 */       this.l = d6;
/* 277 */       this.E = dyi1;
/*     */       
/* 279 */       this.B *= 0.75F;
/*     */       
/* 281 */       this.t = 48 + this.r.nextInt(12);
/* 282 */       b(dyw1);
/*     */     }
/*     */     
/*     */     public void a(boolean ☃) {
/* 286 */       this.b = ☃;
/*     */     }
/*     */     
/*     */     public void b(boolean ☃) {
/* 290 */       this.D = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfq ☃, djk djk1, float f) {
/* 295 */       if (!this.D || this.s < this.t / 3 || (this.s + this.t) / 3 % 2 == 0) {
/* 296 */         super.a(☃, djk1, f);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 302 */       super.a();
/*     */       
/* 304 */       if (this.b && this.s < this.t / 2 && (this.s + this.t) % 2 == 0) {
/* 305 */         c ☃ = new c(this.c, this.g, this.h, this.i, 0.0D, 0.0D, 0.0D, this.E, this.a);
/* 306 */         ☃.e(0.99F);
/* 307 */         ☃.a(this.v, this.w, this.x);
/* 308 */         ☃.s = ☃.t / 2;
/* 309 */         if (this.I) {
/* 310 */           ☃.I = true;
/* 311 */           ☃.F = this.F;
/* 312 */           ☃.G = this.G;
/* 313 */           ☃.H = this.H;
/*     */         } 
/* 315 */         ☃.D = this.D;
/* 316 */         this.E.a(☃);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b extends dzb {
/*     */     private b(dwt ☃, double d1, double d2, double d3) {
/* 323 */       super(☃, d1, d2, d3);
/* 324 */       this.t = 4;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyk b() {
/* 329 */       return dyk.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfq ☃, djk djk1, float f) {
/* 334 */       e(0.6F - (this.s + f - 1.0F) * 0.25F * 0.5F);
/* 335 */       super.a(☃, djk1, f);
/*     */     }
/*     */ 
/*     */     
/*     */     public float b(float ☃) {
/* 340 */       return 7.1F * afm.a((this.s + ☃ - 1.0F) * 0.25F * 3.1415927F);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public a(dyw ☃) {
/* 348 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 353 */       dxv.b b = new dxv.b(dwt1, d1, d2, d3);
/* 354 */       b.a(this.a);
/* 355 */       return b;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class d implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public d(dyw ☃) {
/* 363 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 368 */       dxv.c c = new dxv.c(dwt1, d1, d2, d3, d4, d5, d6, (djz.C()).f, this.a);
/* 369 */       c.e(0.99F);
/* 370 */       return c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */