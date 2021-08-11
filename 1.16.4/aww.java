/*     */ import java.util.EnumSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aww<T extends bdq & bdu>
/*     */   extends avv
/*     */ {
/*     */   private final T a;
/*     */   private final double b;
/*     */   private int c;
/*     */   private final float d;
/*  18 */   private int e = -1;
/*     */   private int f;
/*     */   private boolean g;
/*     */   private boolean h;
/*  22 */   private int i = -1;
/*     */   
/*     */   public aww(T ☃, double d, int i, float f) {
/*  25 */     this.a = ☃;
/*  26 */     this.b = d;
/*  27 */     this.c = i;
/*  28 */     this.d = f * f;
/*  29 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  33 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  38 */     if (this.a.A() == null) {
/*  39 */       return false;
/*     */     }
/*  41 */     return g();
/*     */   }
/*     */   
/*     */   protected boolean g() {
/*  45 */     return this.a.a(bmd.kc);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  50 */     return ((a() || !this.a.x().m()) && g());
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  55 */     super.c();
/*     */     
/*  57 */     this.a.s(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  62 */     super.d();
/*     */     
/*  64 */     this.a.s(false);
/*  65 */     this.f = 0;
/*  66 */     this.e = -1;
/*  67 */     this.a.ec();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  72 */     aqm ☃ = this.a.A();
/*  73 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*  76 */     double d = this.a.h(☃.cD(), ☃.cE(), ☃.cH());
/*  77 */     boolean bool1 = this.a.z().a(☃);
/*  78 */     boolean bool2 = (this.f > 0);
/*     */     
/*  80 */     if (bool1 != bool2) {
/*  81 */       this.f = 0;
/*     */     }
/*     */     
/*  84 */     if (bool1) {
/*  85 */       this.f++;
/*     */     } else {
/*  87 */       this.f--;
/*     */     } 
/*     */     
/*  90 */     if (d > this.d || this.f < 20) {
/*  91 */       this.a.x().a(☃, this.b);
/*  92 */       this.i = -1;
/*     */     } else {
/*  94 */       this.a.x().o();
/*  95 */       this.i++;
/*     */     } 
/*     */     
/*  98 */     if (this.i >= 20) {
/*  99 */       if (this.a.cY().nextFloat() < 0.3D) {
/* 100 */         this.g = !this.g;
/*     */       }
/* 102 */       if (this.a.cY().nextFloat() < 0.3D) {
/* 103 */         this.h = !this.h;
/*     */       }
/* 105 */       this.i = 0;
/*     */     } 
/*     */     
/* 108 */     if (this.i > -1) {
/* 109 */       if (d > (this.d * 0.75F)) {
/* 110 */         this.h = false;
/* 111 */       } else if (d < (this.d * 0.25F)) {
/* 112 */         this.h = true;
/*     */       } 
/* 114 */       this.a.u().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
/* 115 */       this.a.a(☃, 30.0F, 30.0F);
/*     */     } else {
/* 117 */       this.a.t().a(☃, 30.0F, 30.0F);
/*     */     } 
/*     */     
/* 120 */     if (this.a.dW()) {
/* 121 */       if (!bool1 && this.f < -60) {
/* 122 */         this.a.ec();
/* 123 */       } else if (bool1) {
/* 124 */         int i = this.a.ea();
/*     */         
/* 126 */         if (i >= 20) {
/* 127 */           this.a.ec();
/* 128 */           ((bdu)this.a).a(☃, bkm.a(i));
/* 129 */           this.e = this.c;
/*     */         } 
/*     */       } 
/* 132 */     } else if (--this.e <= 0 && this.f >= -60) {
/* 133 */       this.a.c(bgn.a((aqm)this.a, bmd.kc));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aww.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */