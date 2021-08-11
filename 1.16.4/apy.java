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
/*     */ public abstract class apy
/*     */   extends aqu
/*     */ {
/*  17 */   private static final us<Boolean> bo = uv.a((Class)apy.class, uu.i);
/*     */ 
/*     */   
/*     */   protected int b;
/*     */   
/*     */   protected int c;
/*     */   
/*     */   protected int d;
/*     */ 
/*     */   
/*     */   protected apy(aqe<? extends apy> ☃, brx brx1) {
/*  28 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  33 */     if (arc1 == null) {
/*  34 */       arc1 = new a(true);
/*     */     }
/*     */     
/*  37 */     a a = (a)arc1;
/*     */     
/*  39 */     if (a.c() && a.a() > 0 && this.J.nextFloat() <= a.d()) {
/*  40 */       c_(-24000);
/*     */     }
/*     */     
/*  43 */     a.b();
/*     */     
/*  45 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public abstract apy a(aag paramaag, apy paramapy);
/*     */   
/*     */   protected void e() {
/*  53 */     super.e();
/*  54 */     this.R.a(bo, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  58 */     return false;
/*     */   }
/*     */   
/*     */   public int i() {
/*  62 */     if (this.l.v) {
/*  63 */       return ((Boolean)this.R.<Boolean>a(bo)).booleanValue() ? -1 : 1;
/*     */     }
/*  65 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, boolean bool) {
/*  70 */     int i = i();
/*  71 */     int j = i;
/*  72 */     i += ☃ * 20;
/*  73 */     if (i > 0) {
/*  74 */       i = 0;
/*     */     }
/*  76 */     int k = i - j;
/*  77 */     c_(i);
/*  78 */     if (bool) {
/*  79 */       this.c += k;
/*  80 */       if (this.d == 0) {
/*  81 */         this.d = 40;
/*     */       }
/*     */     } 
/*  84 */     if (i() == 0) {
/*  85 */       c_(this.c);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  90 */     a(☃, false);
/*     */   }
/*     */   
/*     */   public void c_(int ☃) {
/*  94 */     int i = this.b;
/*  95 */     this.b = ☃;
/*     */     
/*  97 */     if ((i < 0 && ☃ >= 0) || (i >= 0 && ☃ < 0)) {
/*  98 */       this.R.b(bo, Boolean.valueOf((☃ < 0)));
/*  99 */       m();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 105 */     super.b(☃);
/* 106 */     ☃.b("Age", i());
/* 107 */     ☃.b("ForcedAge", this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 112 */     super.a(☃);
/* 113 */     c_(☃.h("Age"));
/* 114 */     this.c = ☃.h("ForcedAge");
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 119 */     if (bo.equals(☃)) {
/* 120 */       x_();
/*     */     }
/* 122 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 127 */     super.k();
/*     */     
/* 129 */     if (this.l.v) {
/* 130 */       if (this.d > 0) {
/* 131 */         if (this.d % 4 == 0) {
/* 132 */           this.l.a(hh.E, d(1.0D), cF() + 0.5D, g(1.0D), 0.0D, 0.0D, 0.0D);
/*     */         }
/* 134 */         this.d--;
/*     */       } 
/* 136 */     } else if (aX()) {
/* 137 */       int ☃ = i();
/* 138 */       if (☃ < 0) {
/* 139 */         ☃++;
/* 140 */         c_(☃);
/* 141 */       } else if (☃ > 0) {
/* 142 */         ☃--;
/* 143 */         c_(☃);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m() {}
/*     */ 
/*     */   
/*     */   public boolean w_() {
/* 153 */     return (i() < 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 158 */     c_(☃ ? -24000 : 0);
/*     */   }
/*     */   
/*     */   public static class a implements arc {
/*     */     private int a;
/*     */     private final boolean b;
/*     */     private final float c;
/*     */     
/*     */     private a(boolean ☃, float f) {
/* 167 */       this.b = ☃;
/* 168 */       this.c = f;
/*     */     }
/*     */     
/*     */     public a(boolean ☃) {
/* 172 */       this(☃, 0.05F);
/*     */     }
/*     */     
/*     */     public a(float ☃) {
/* 176 */       this(true, ☃);
/*     */     }
/*     */     
/*     */     public int a() {
/* 180 */       return this.a;
/*     */     }
/*     */     
/*     */     public void b() {
/* 184 */       this.a++;
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 188 */       return this.b;
/*     */     }
/*     */     
/*     */     public float d() {
/* 192 */       return this.c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\apy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */