/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dyl
/*     */   extends dzb
/*     */ {
/*     */   private final dyw a;
/*     */   
/*     */   private dyl(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyw dyw1) {
/*  12 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  13 */     this.a = dyw1;
/*     */     
/*  15 */     float f1 = 2.5F;
/*  16 */     this.j *= 0.10000000149011612D;
/*  17 */     this.k *= 0.10000000149011612D;
/*  18 */     this.l *= 0.10000000149011612D;
/*  19 */     this.j += d4;
/*  20 */     this.k += d5;
/*  21 */     this.l += d6;
/*     */     
/*  23 */     float f2 = 1.0F - (float)(Math.random() * 0.30000001192092896D);
/*  24 */     this.v = f2;
/*  25 */     this.w = f2;
/*  26 */     this.x = f2;
/*  27 */     this.B *= 1.875F;
/*     */     
/*  29 */     int i = (int)(8.0D / (Math.random() * 0.8D + 0.3D));
/*  30 */     this.t = (int)Math.max(i * 2.5F, 1.0F);
/*     */     
/*  32 */     this.n = false;
/*  33 */     b(dyw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public dyk b() {
/*  38 */     return dyk.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public float b(float ☃) {
/*  43 */     return this.B * afm.a((this.s + ☃) / this.t * 32.0F, 0.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  48 */     this.d = this.g;
/*  49 */     this.e = this.h;
/*  50 */     this.f = this.i;
/*     */     
/*  52 */     if (this.s++ >= this.t) {
/*  53 */       j();
/*     */       
/*     */       return;
/*     */     } 
/*  57 */     b(this.a);
/*     */     
/*  59 */     a(this.j, this.k, this.l);
/*  60 */     this.j *= 0.9599999785423279D;
/*  61 */     this.k *= 0.9599999785423279D;
/*  62 */     this.l *= 0.9599999785423279D;
/*  63 */     bfw ☃ = this.c.a(this.g, this.h, this.i, 2.0D, false);
/*  64 */     if (☃ != null) {
/*  65 */       double d = ☃.cE();
/*  66 */       if (this.h > d) {
/*  67 */         this.h += (d - this.h) * 0.2D;
/*  68 */         this.k += ((☃.cC()).c - this.k) * 0.2D;
/*  69 */         b(this.g, this.h, this.i);
/*     */       } 
/*     */     } 
/*     */     
/*  73 */     if (this.m) {
/*  74 */       this.j *= 0.699999988079071D;
/*  75 */       this.l *= 0.699999988079071D;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class a implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public a(dyw ☃) {
/*  83 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  88 */       return new dyl(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public b(dyw ☃) {
/*  96 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 101 */       dyg dyg = new dyl(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/* 102 */       dyg.a(200.0F, 50.0F, 120.0F);
/* 103 */       dyg.e(0.4F);
/* 104 */       return dyg;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */