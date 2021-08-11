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
/*     */ public class dqa
/*     */   extends dpp<bip>
/*     */   implements drv
/*     */ {
/*  16 */   private static final vk A = new vk("textures/gui/container/crafting_table.png");
/*  17 */   private static final vk B = new vk("textures/gui/recipe_button.png");
/*     */   
/*  19 */   private final drp C = new drp();
/*     */   
/*     */   private boolean D;
/*     */   
/*     */   public dqa(bip ☃, bfv bfv1, nr nr1) {
/*  24 */     super(☃, bfv1, nr1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  29 */     super.b();
/*     */     
/*  31 */     this.D = (this.k < 379);
/*  32 */     this.C.a(this.k, this.l, this.i, this.D, this.t);
/*  33 */     this.w = this.C.a(this.D, this.k, this.b);
/*     */     
/*  35 */     this.e.add(this.C);
/*  36 */     b(this.C);
/*  37 */     a((bip)new dlr(this.w + 5, this.l / 2 - 49, 20, 18, 0, 0, 19, B, ☃ -> {
/*     */             this.C.a(this.D);
/*     */             
/*     */             this.C.e();
/*     */             
/*     */             this.w = this.C.a(this.D, this.k, this.b);
/*     */             
/*     */             ((dlr)☃).a(this.w + 5, this.l / 2 - 49);
/*     */           }));
/*  46 */     this.p = 29;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  51 */     super.d();
/*     */     
/*  53 */     this.C.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  58 */     a(☃);
/*     */     
/*  60 */     if (this.C.f() && this.D) {
/*  61 */       a(☃, f, i, j);
/*  62 */       this.C.a(☃, i, j, f);
/*     */     } else {
/*  64 */       this.C.a(☃, i, j, f);
/*  65 */       super.a(☃, i, j, f);
/*  66 */       this.C.a(☃, this.w, this.x, true, f);
/*     */     } 
/*     */     
/*  69 */     a(☃, i, j);
/*  70 */     this.C.c(☃, this.w, this.x, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/*  75 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  76 */     this.i.M().a(A);
/*  77 */     int k = this.w;
/*  78 */     int m = (this.l - this.c) / 2;
/*  79 */     b(☃, k, m, 0, 0, this.b, this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃, int i, int j, int k, double d1, double d2) {
/*  84 */     return ((!this.D || !this.C.f()) && super.a(☃, i, j, k, d1, d2));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/*  89 */     if (this.C.a(☃, d1, i)) {
/*  90 */       a(this.C);
/*  91 */       return true;
/*     */     } 
/*     */     
/*  94 */     if (this.D && this.C.f()) {
/*  95 */       return true;
/*     */     }
/*     */     
/*  98 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(double ☃, double d1, int i, int j, int k) {
/* 103 */     boolean bool = (☃ < i || d1 < j || ☃ >= (i + this.b) || d1 >= (j + this.c));
/* 104 */     return (this.C.a(☃, d1, this.w, this.x, this.b, this.c, k) && bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bjr ☃, int i, int j, bik bik1) {
/* 109 */     super.a(☃, i, j, bik1);
/*     */     
/* 111 */     this.C.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void az_() {
/* 116 */     this.C.h();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 121 */     this.C.d();
/* 122 */     super.e();
/*     */   }
/*     */ 
/*     */   
/*     */   public drp k() {
/* 127 */     return this.C;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */