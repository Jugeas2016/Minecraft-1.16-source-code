/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dxn
/*     */   extends dzb
/*     */ {
/*     */   private dxn(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*   9 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  10 */     this.j *= 0.10000000149011612D;
/*  11 */     this.k *= 0.10000000149011612D;
/*  12 */     this.l *= 0.10000000149011612D;
/*  13 */     this.j += d4 * 0.4D;
/*  14 */     this.k += d5 * 0.4D;
/*  15 */     this.l += d6 * 0.4D;
/*     */     
/*  17 */     float f = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D);
/*  18 */     this.v = f;
/*  19 */     this.w = f;
/*  20 */     this.x = f;
/*  21 */     this.B *= 0.75F;
/*     */     
/*  23 */     this.t = Math.max((int)(6.0D / (Math.random() * 0.8D + 0.6D)), 1);
/*     */     
/*  25 */     this.n = false;
/*  26 */     a();
/*     */   }
/*     */ 
/*     */   
/*     */   public float b(float ☃) {
/*  31 */     return this.B * afm.a((this.s + ☃) / this.t * 32.0F, 0.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  36 */     this.d = this.g;
/*  37 */     this.e = this.h;
/*  38 */     this.f = this.i;
/*     */     
/*  40 */     if (this.s++ >= this.t) {
/*  41 */       j();
/*     */       
/*     */       return;
/*     */     } 
/*  45 */     a(this.j, this.k, this.l);
/*  46 */     this.w = (float)(this.w * 0.96D);
/*  47 */     this.x = (float)(this.x * 0.9D);
/*     */     
/*  49 */     this.j *= 0.699999988079071D;
/*  50 */     this.k *= 0.699999988079071D;
/*  51 */     this.l *= 0.699999988079071D;
/*  52 */     this.k -= 0.019999999552965164D;
/*     */     
/*  54 */     if (this.m) {
/*  55 */       this.j *= 0.699999988079071D;
/*  56 */       this.l *= 0.699999988079071D;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public dyk b() {
/*  62 */     return dyk.b;
/*     */   }
/*     */   
/*     */   public static class c implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public c(dyw ☃) {
/*  69 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  74 */       dxn dxn = new dxn(dwt1, d1, d2, d3, d4, d5, d6);
/*  75 */       dxn.a(this.a);
/*  76 */       return dxn;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public b(dyw ☃) {
/*  84 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  89 */       dxn dxn = new dxn(dwt1, d1, d2, d3, d4, d5, d6);
/*  90 */       dxn.v *= 0.3F;
/*  91 */       dxn.w *= 0.8F;
/*  92 */       dxn.a(this.a);
/*  93 */       return dxn;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public a(dyw ☃) {
/* 101 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 106 */       dxn dxn = new dxn(dwt1, d1, d2, d3, d4, d5 + 1.0D, d6);
/* 107 */       dxn.a(20);
/* 108 */       dxn.a(this.a);
/* 109 */       return dxn;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */