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
/*     */ public class cxg
/*     */   extends cxc
/*     */ {
/*     */   private final boolean j;
/*     */   
/*     */   public cxg(boolean ☃) {
/*  18 */     this.j = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public cxb b() {
/*  23 */     return super.a(afm.c((this.b.cc()).a), afm.c((this.b.cc()).b + 0.5D), afm.c((this.b.cc()).c));
/*     */   }
/*     */ 
/*     */   
/*     */   public cxh a(double ☃, double d1, double d2) {
/*  28 */     return new cxh(super.a(afm.c(☃ - (this.b.cy() / 2.0F)), afm.c(d1 + 0.5D), afm.c(d2 - (this.b.cy() / 2.0F))));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(cxb[] ☃, cxb cxb1) {
/*  33 */     int i = 0;
/*     */     
/*  35 */     for (gc gc : gc.values()) {
/*  36 */       cxb cxb2 = b(cxb1.a + gc.i(), cxb1.b + gc.j(), cxb1.c + gc.k());
/*  37 */       if (cxb2 != null && !cxb2.i) {
/*  38 */         ☃[i++] = cxb2;
/*     */       }
/*     */     } 
/*     */     
/*  42 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public cwz a(brc ☃, int i, int j, int k, aqn aqn1, int m, int n, int i1, boolean bool1, boolean bool2) {
/*  47 */     return a(☃, i, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   public cwz a(brc ☃, int i, int j, int k) {
/*  52 */     fx fx = new fx(i, j, k);
/*  53 */     cux cux = ☃.b(fx);
/*  54 */     ceh ceh = ☃.d_(fx);
/*     */     
/*  56 */     if (cux.c() && ceh.a(☃, fx.c(), cxe.b) && ceh.g())
/*  57 */       return cwz.u; 
/*  58 */     if (!cux.a(aef.b) || !ceh.a(☃, fx, cxe.b)) {
/*  59 */       return cwz.a;
/*     */     }
/*     */     
/*  62 */     return cwz.h;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private cxb b(int ☃, int i, int j) {
/*  67 */     cwz cwz = c(☃, i, j);
/*     */     
/*  69 */     if ((this.j && cwz == cwz.u) || cwz == cwz.h) {
/*  70 */       return a(☃, i, j);
/*     */     }
/*  72 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected cxb a(int ☃, int i, int j) {
/*  78 */     cxb cxb = null;
/*     */     
/*  80 */     cwz cwz = a(this.b.l, ☃, i, j);
/*     */     
/*  82 */     float f = this.b.a(cwz);
/*     */ 
/*     */     
/*  85 */     cxb = super.a(☃, i, j);
/*  86 */     cxb.l = cwz;
/*  87 */     cxb.k = Math.max(cxb.k, f);
/*     */     
/*  89 */     if (f >= 0.0F && this.a.b(new fx(☃, i, j)).c()) {
/*  90 */       cxb.k += 8.0F;
/*     */     }
/*     */ 
/*     */     
/*  94 */     if (cwz == cwz.b) {
/*  95 */       return cxb;
/*     */     }
/*     */     
/*  98 */     return cxb;
/*     */   }
/*     */   
/*     */   private cwz c(int ☃, int i, int j) {
/* 102 */     fx.a a = new fx.a();
/* 103 */     for (int k = ☃; k < ☃ + this.d; k++) {
/* 104 */       for (int m = i; m < i + this.e; m++) {
/* 105 */         for (int n = j; n < j + this.f; n++) {
/* 106 */           cux cux = this.a.b(a.d(k, m, n));
/* 107 */           ceh ceh1 = this.a.d_(a.d(k, m, n));
/*     */           
/* 109 */           if (cux.c() && ceh1.a(this.a, a.c(), cxe.b) && ceh1.g())
/* 110 */             return cwz.u; 
/* 111 */           if (!cux.a(aef.b)) {
/* 112 */             return cwz.a;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 118 */     ceh ceh = this.a.d_(a);
/*     */ 
/*     */     
/* 121 */     if (ceh.a(this.a, a, cxe.b)) {
/* 122 */       return cwz.h;
/*     */     }
/*     */     
/* 125 */     return cwz.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */