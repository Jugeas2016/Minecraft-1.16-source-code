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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ccn
/*     */   extends cdd
/*     */   implements cdc, cdm
/*     */ {
/*  33 */   private gj<bmb> i = gj.a(27, bmb.b);
/*     */   
/*     */   protected float a;
/*     */   protected float b;
/*     */   protected int c;
/*     */   private int j;
/*     */   
/*     */   protected ccn(cck<?> ☃) {
/*  41 */     super(☃);
/*     */   }
/*     */   
/*     */   public ccn() {
/*  45 */     this(cck.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/*  50 */     return 27;
/*     */   }
/*     */ 
/*     */   
/*     */   protected nr g() {
/*  55 */     return new of("container.chest");
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  60 */     super.a(☃, md1);
/*     */     
/*  62 */     this.i = gj.a(Z_(), bmb.b);
/*  63 */     if (!b(md1)) {
/*  64 */       aoo.b(md1, this.i);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  70 */     super.a(☃);
/*     */     
/*  72 */     if (!c(☃)) {
/*  73 */       aoo.a(☃, this.i);
/*     */     }
/*  75 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/*  80 */     int ☃ = this.e.u();
/*  81 */     int i = this.e.v();
/*  82 */     int j = this.e.w();
/*     */     
/*  84 */     this.j++;
/*     */     
/*  86 */     this.c = a(this.d, this, this.j, ☃, i, j, this.c);
/*     */     
/*  88 */     this.b = this.a;
/*     */     
/*  90 */     float f = 0.1F;
/*  91 */     if (this.c > 0 && this.a == 0.0F) {
/*  92 */       a(adq.bG);
/*     */     }
/*  94 */     if ((this.c == 0 && this.a > 0.0F) || (this.c > 0 && this.a < 1.0F)) {
/*  95 */       float f1 = this.a;
/*  96 */       if (this.c > 0) {
/*  97 */         this.a += 0.1F;
/*     */       } else {
/*  99 */         this.a -= 0.1F;
/*     */       } 
/* 101 */       if (this.a > 1.0F) {
/* 102 */         this.a = 1.0F;
/*     */       }
/* 104 */       float f2 = 0.5F;
/* 105 */       if (this.a < 0.5F && f1 >= 0.5F) {
/* 106 */         a(adq.bE);
/*     */       }
/* 108 */       if (this.a < 0.0F) {
/* 109 */         this.a = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int a(brx ☃, ccd ccd1, int i, int j, int k, int m, int n) {
/* 115 */     if (!☃.v && n != 0 && (i + j + k + m) % 200 == 0) {
/* 116 */       n = a(☃, ccd1, j, k, m);
/*     */     }
/*     */     
/* 119 */     return n;
/*     */   }
/*     */   
/*     */   public static int a(brx ☃, ccd ccd1, int i, int j, int k) {
/* 123 */     int m = 0;
/*     */     
/* 125 */     float f = 5.0F;
/* 126 */     List<bfw> list = ☃.a(bfw.class, new dci((i - 5.0F), (j - 5.0F), (k - 5.0F), ((i + 1) + 5.0F), ((j + 1) + 5.0F), ((k + 1) + 5.0F)));
/* 127 */     for (bfw bfw : list) {
/* 128 */       if (bfw.bp instanceof bij) {
/* 129 */         aon aon = ((bij)bfw.bp).e();
/* 130 */         if (aon == ccd1 || (aon instanceof aom && ((aom)aon).a(ccd1))) {
/* 131 */           m++;
/*     */         }
/*     */       } 
/*     */     } 
/* 135 */     return m;
/*     */   }
/*     */   
/*     */   private void a(adp ☃) {
/* 139 */     cez cez = (cez)p().c(bve.c);
/* 140 */     if (cez == cez.b) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 145 */     double d1 = this.e.u() + 0.5D;
/* 146 */     double d2 = this.e.v() + 0.5D;
/* 147 */     double d3 = this.e.w() + 0.5D;
/*     */     
/* 149 */     if (cez == cez.c) {
/* 150 */       gc gc = bve.h(p());
/* 151 */       d1 += gc.i() * 0.5D;
/* 152 */       d3 += gc.k() * 0.5D;
/*     */     } 
/*     */     
/* 155 */     this.d.a((bfw)null, d1, d2, d3, ☃, adr.e, 0.5F, this.d.t.nextFloat() * 0.1F + 0.9F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, int i) {
/* 160 */     if (☃ == 1) {
/* 161 */       this.c = i;
/* 162 */       return true;
/*     */     } 
/* 164 */     return super.a_(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c_(bfw ☃) {
/* 169 */     if (!☃.a_()) {
/* 170 */       if (this.c < 0) {
/* 171 */         this.c = 0;
/*     */       }
/* 173 */       this.c++;
/* 174 */       h();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b_(bfw ☃) {
/* 180 */     if (!☃.a_()) {
/* 181 */       this.c--;
/* 182 */       h();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void h() {
/* 187 */     buo ☃ = p().b();
/* 188 */     if (☃ instanceof bve) {
/* 189 */       this.d.a(this.e, ☃, 1, this.c);
/* 190 */       this.d.b(this.e, ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected gj<bmb> f() {
/* 196 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gj<bmb> ☃) {
/* 201 */     this.i = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(float ☃) {
/* 206 */     return afm.g(☃, this.b, this.a);
/*     */   }
/*     */   
/*     */   public static int a(brc ☃, fx fx1) {
/* 210 */     ceh ceh = ☃.d_(fx1);
/* 211 */     if (ceh.b().q()) {
/* 212 */       ccj ccj = ☃.c(fx1);
/* 213 */       if (ccj instanceof ccn) {
/* 214 */         return ((ccn)ccj).c;
/*     */       }
/*     */     } 
/* 217 */     return 0;
/*     */   }
/*     */   
/*     */   public static void a(ccn ☃, ccn ccn1) {
/* 221 */     gj<bmb> gj1 = ☃.f();
/* 222 */     ☃.a(ccn1.f());
/* 223 */     ccn1.a(gj1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected bic a(int ☃, bfv bfv1) {
/* 228 */     return bij.a(☃, bfv1, this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */