/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public abstract class dpq<T extends bid>
/*     */   extends dpp<T>
/*     */   implements drv
/*     */ {
/*  17 */   private static final vk B = new vk("textures/gui/recipe_button.png");
/*     */   
/*     */   public final drl A;
/*     */   private boolean C;
/*     */   private final vk D;
/*     */   
/*     */   public dpq(T ☃, drl drl1, bfv bfv1, nr nr1, vk vk1) {
/*  24 */     super(☃, bfv1, nr1);
/*  25 */     this.A = drl1;
/*     */     
/*  27 */     this.D = vk1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  32 */     super.b();
/*     */     
/*  34 */     this.C = (this.k < 379);
/*  35 */     this.A.a(this.k, this.l, this.i, this.C, (bjj)this.t);
/*  36 */     this.w = this.A.a(this.C, this.k, this.b);
/*     */     
/*  38 */     a((T)new dlr(this.w + 20, this.l / 2 - 49, 20, 18, 0, 0, 19, B, ☃ -> {
/*     */             this.A.a(this.C);
/*     */             
/*     */             this.A.e();
/*     */             
/*     */             this.w = this.A.a(this.C, this.k, this.b);
/*     */             
/*     */             ((dlr)☃).a(this.w + 20, this.l / 2 - 49);
/*     */           }));
/*  47 */     this.p = (this.b - this.o.a(this.d)) / 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  52 */     super.d();
/*     */     
/*  54 */     this.A.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  59 */     a(☃);
/*     */     
/*  61 */     if (this.A.f() && this.C) {
/*  62 */       a(☃, f, i, j);
/*  63 */       this.A.a(☃, i, j, f);
/*     */     } else {
/*  65 */       this.A.a(☃, i, j, f);
/*  66 */       super.a(☃, i, j, f);
/*  67 */       this.A.a(☃, this.w, this.x, true, f);
/*     */     } 
/*     */     
/*  70 */     a(☃, i, j);
/*  71 */     this.A.c(☃, this.w, this.x, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/*  76 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  77 */     this.i.M().a(this.D);
/*  78 */     int k = this.w;
/*  79 */     int m = this.x;
/*  80 */     b(☃, k, m, 0, 0, this.b, this.c);
/*  81 */     if (((bid)this.t).l()) {
/*  82 */       int i1 = ((bid)this.t).k();
/*  83 */       b(☃, k + 56, m + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
/*     */     } 
/*     */     
/*  86 */     int n = ((bid)this.t).j();
/*  87 */     b(☃, k + 79, m + 34, 176, 14, n + 1, 16);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/*  92 */     if (this.A.a(☃, d1, i)) {
/*  93 */       return true;
/*     */     }
/*     */     
/*  96 */     if (this.C && this.A.f()) {
/*  97 */       return true;
/*     */     }
/*     */     
/* 100 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bjr ☃, int i, int j, bik bik1) {
/* 105 */     super.a(☃, i, j, bik1);
/*     */     
/* 107 */     this.A.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 112 */     if (this.A.a(☃, i, j)) {
/* 113 */       return false;
/*     */     }
/* 115 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(double ☃, double d1, int i, int j, int k) {
/* 120 */     boolean bool = (☃ < i || d1 < j || ☃ >= (i + this.b) || d1 >= (j + this.c));
/* 121 */     return (this.A.a(☃, d1, this.w, this.x, this.b, this.c, k) && bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(char ☃, int i) {
/* 126 */     if (this.A.a(☃, i)) {
/* 127 */       return true;
/*     */     }
/* 129 */     return super.a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void az_() {
/* 134 */     this.A.h();
/*     */   }
/*     */ 
/*     */   
/*     */   public drp k() {
/* 139 */     return this.A;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 144 */     this.A.d();
/* 145 */     super.e();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */