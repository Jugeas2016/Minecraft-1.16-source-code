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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class awx<T extends bdq & bdu & bdd>
/*     */   extends avv
/*     */ {
/*     */   private final T b;
/*  18 */   public static final afh a = new afh(20, 40);
/*     */   
/*     */   enum a {
/*  21 */     a,
/*  22 */     b,
/*  23 */     c,
/*  24 */     d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  29 */   private a c = a.a;
/*     */   private final double d;
/*     */   private final float e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   
/*     */   public awx(T ☃, double d, float f) {
/*  37 */     this.b = ☃;
/*  38 */     this.d = d;
/*  39 */     this.e = f * f;
/*  40 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  45 */     return (h() && g());
/*     */   }
/*     */   
/*     */   private boolean g() {
/*  49 */     return this.b.a(bmd.qQ);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  54 */     return (h() && (a() || !this.b.x().m()) && g());
/*     */   }
/*     */   
/*     */   private boolean h() {
/*  58 */     return (this.b.A() != null && this.b.A().aX());
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  63 */     super.d();
/*  64 */     this.b.s(false);
/*  65 */     this.b.h((aqm)null);
/*  66 */     this.f = 0;
/*  67 */     if (this.b.dW()) {
/*  68 */       this.b.ec();
/*  69 */       ((bdd)this.b).b(false);
/*  70 */       bkt.a(this.b.dY(), false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  76 */     aqm ☃ = this.b.A();
/*  77 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */     
/*  81 */     boolean bool1 = this.b.z().a(☃);
/*  82 */     boolean bool2 = (this.f > 0);
/*     */     
/*  84 */     if (bool1 != bool2) {
/*  85 */       this.f = 0;
/*     */     }
/*     */     
/*  88 */     if (bool1) {
/*  89 */       this.f++;
/*     */     } else {
/*  91 */       this.f--;
/*     */     } 
/*     */     
/*  94 */     double d = this.b.h(☃);
/*  95 */     boolean bool3 = ((d > this.e || this.f < 5) && this.g == 0);
/*  96 */     if (bool3) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 101 */       this.h--;
/* 102 */       if (this.h <= 0) {
/* 103 */         this.b.x().a(☃, j() ? this.d : (this.d * 0.5D));
/* 104 */         this.h = a.a(this.b.cY());
/*     */       } 
/*     */     } else {
/* 107 */       this.h = 0;
/* 108 */       this.b.x().o();
/*     */     } 
/*     */     
/* 111 */     this.b.t().a(☃, 30.0F, 30.0F);
/*     */     
/* 113 */     if (this.c == a.a) {
/* 114 */       if (!bool3) {
/* 115 */         this.b.c(bgn.a((aqm)this.b, bmd.qQ));
/* 116 */         this.c = a.b;
/* 117 */         ((bdd)this.b).b(true);
/*     */       } 
/* 119 */     } else if (this.c == a.b) {
/* 120 */       if (!this.b.dW()) {
/* 121 */         this.c = a.a;
/*     */       }
/* 123 */       int i = this.b.ea();
/* 124 */       bmb bmb = this.b.dY();
/* 125 */       if (i >= bkt.g(bmb)) {
/* 126 */         this.b.eb();
/*     */         
/* 128 */         this.c = a.c;
/* 129 */         this.g = 20 + this.b.cY().nextInt(20);
/* 130 */         ((bdd)this.b).b(false);
/*     */       } 
/* 132 */     } else if (this.c == a.c) {
/* 133 */       this.g--;
/* 134 */       if (this.g == 0) {
/* 135 */         this.c = a.d;
/*     */       }
/* 137 */     } else if (this.c == a.d && 
/* 138 */       bool1) {
/* 139 */       ((bdu)this.b).a(☃, 1.0F);
/*     */       
/* 141 */       bmb bmb = this.b.b(bgn.a((aqm)this.b, bmd.qQ));
/* 142 */       bkt.a(bmb, false);
/* 143 */       this.c = a.a;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean j() {
/* 149 */     return (this.c == a.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */