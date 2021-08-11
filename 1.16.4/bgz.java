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
/*     */ public class bgz
/*     */   extends bgb
/*     */ {
/*  26 */   private static final us<Boolean> e = uv.a((Class)bgz.class, uu.i);
/*     */   
/*     */   public bgz(aqe<? extends bgz> ☃, brx brx1) {
/*  29 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bgz(brx ☃, aqm aqm1, double d1, double d2, double d3) {
/*  33 */     super((aqe)aqe.aV, aqm1, d1, d2, d3, ☃);
/*     */   }
/*     */   
/*     */   public bgz(brx ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  37 */     super((aqe)aqe.aV, d1, d2, d3, d4, d5, d6, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float i() {
/*  42 */     return k() ? 0.73F : super.i();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bq() {
/*  47 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(brp ☃, brc brc1, fx fx1, ceh ceh1, cux cux1, float f) {
/*  52 */     if (k() && bcl.c(ceh1)) {
/*  53 */       return Math.min(0.8F, f);
/*     */     }
/*     */     
/*  56 */     return f;
/*     */   }
/*     */   
/*     */   protected void a(dck ☃) {
/*     */     boolean bool;
/*  61 */     super.a(☃);
/*  62 */     if (this.l.v)
/*  63 */       return;  aqa aqa1 = ☃.a();
/*  64 */     aqa aqa2 = v();
/*     */     
/*  66 */     if (aqa2 instanceof aqm) {
/*  67 */       aqm aqm = (aqm)aqa2;
/*  68 */       bool = aqa1.a(apk.a(this, aqm), 8.0F);
/*  69 */       if (bool) {
/*  70 */         if (aqa1.aX()) {
/*  71 */           a(aqm, aqa1);
/*     */         } else {
/*  73 */           aqm.b(5.0F);
/*     */         } 
/*     */       }
/*     */     } else {
/*  77 */       bool = aqa1.a(apk.o, 5.0F);
/*     */     } 
/*  79 */     if (bool && aqa1 instanceof aqm) {
/*  80 */       int i = 0;
/*  81 */       if (this.l.ad() == aor.c) {
/*  82 */         i = 10;
/*  83 */       } else if (this.l.ad() == aor.d) {
/*  84 */         i = 40;
/*     */       } 
/*  86 */       if (i > 0) {
/*  87 */         ((aqm)aqa1).c(new apu(apw.t, 20 * i, 1));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcl ☃) {
/*  94 */     super.a(☃);
/*  95 */     if (!this.l.v) {
/*  96 */       brp.a a = this.l.V().b(brt.b) ? brp.a.c : brp.a.a;
/*  97 */       this.l.a(this, cD(), cE(), cH(), 1.0F, false, a);
/*  98 */       ad();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/* 104 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 109 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 114 */     this.R.a(e, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   public boolean k() {
/* 118 */     return ((Boolean)this.R.<Boolean>a(e)).booleanValue();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 122 */     this.R.b(e, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean W_() {
/* 127 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */