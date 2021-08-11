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
/*     */ 
/*     */ public abstract class axx
/*     */   extends avv
/*     */ {
/*     */   protected final aqn e;
/*     */   protected final boolean f;
/*     */   private final boolean a;
/*     */   private int b;
/*     */   private int c;
/*     */   private int d;
/*     */   protected aqm g;
/*  30 */   protected int h = 60;
/*     */   
/*     */   public axx(aqn ☃, boolean bool) {
/*  33 */     this(☃, bool, false);
/*     */   }
/*     */   
/*     */   public axx(aqn ☃, boolean bool1, boolean bool2) {
/*  37 */     this.e = ☃;
/*  38 */     this.f = bool1;
/*  39 */     this.a = bool2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  44 */     aqm ☃ = this.e.A();
/*  45 */     if (☃ == null) {
/*  46 */       ☃ = this.g;
/*     */     }
/*  48 */     if (☃ == null) {
/*  49 */       return false;
/*     */     }
/*  51 */     if (!☃.aX()) {
/*  52 */       return false;
/*     */     }
/*     */     
/*  55 */     ddp ddp1 = this.e.bG();
/*  56 */     ddp ddp2 = ☃.bG();
/*  57 */     if (ddp1 != null && ddp2 == ddp1) {
/*  58 */       return false;
/*     */     }
/*     */     
/*  61 */     double d = k();
/*  62 */     if (this.e.h(☃) > d * d) {
/*  63 */       return false;
/*     */     }
/*  65 */     if (this.f) {
/*  66 */       if (this.e.z().a(☃)) {
/*  67 */         this.d = 0;
/*     */       }
/*  69 */       else if (++this.d > this.h) {
/*  70 */         return false;
/*     */       } 
/*     */     }
/*     */     
/*  74 */     if (☃ instanceof bfw && 
/*  75 */       ((bfw)☃).bC.a) {
/*  76 */       return false;
/*     */     }
/*     */     
/*  79 */     this.e.h(☃);
/*  80 */     return true;
/*     */   }
/*     */   
/*     */   protected double k() {
/*  84 */     return this.e.b(arl.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  89 */     this.b = 0;
/*  90 */     this.c = 0;
/*  91 */     this.d = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  96 */     this.e.h((aqm)null);
/*  97 */     this.g = null;
/*     */   }
/*     */   
/*     */   protected boolean a(@Nullable aqm ☃, azg azg1) {
/* 101 */     if (☃ == null) {
/* 102 */       return false;
/*     */     }
/* 104 */     if (!azg1.a(this.e, ☃)) {
/* 105 */       return false;
/*     */     }
/* 107 */     if (!this.e.a(☃.cB())) {
/* 108 */       return false;
/*     */     }
/*     */     
/* 111 */     if (this.a) {
/* 112 */       if (--this.c <= 0) {
/* 113 */         this.b = 0;
/*     */       }
/* 115 */       if (this.b == 0) {
/* 116 */         this.b = a(☃) ? 1 : 2;
/*     */       }
/* 118 */       if (this.b == 2) {
/* 119 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 123 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(aqm ☃) {
/* 127 */     this.c = 10 + this.e.cY().nextInt(5);
/* 128 */     cxd cxd = this.e.x().a(☃, 0);
/* 129 */     if (cxd == null) {
/* 130 */       return false;
/*     */     }
/* 132 */     cxb cxb = cxd.d();
/* 133 */     if (cxb == null) {
/* 134 */       return false;
/*     */     }
/* 136 */     int i = cxb.a - afm.c(☃.cD());
/* 137 */     int j = cxb.c - afm.c(☃.cH());
/* 138 */     return ((i * i + j * j) <= 2.25D);
/*     */   }
/*     */   
/*     */   public axx a(int ☃) {
/* 142 */     this.h = ☃;
/* 143 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */