/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dyy
/*     */   extends dzb
/*     */ {
/*     */   private dyy(dwt ☃, double d1, double d2, double d3) {
/*  10 */     super(☃, d1, d2 - 0.125D, d3);
/*     */     
/*  12 */     this.v = 0.4F;
/*  13 */     this.w = 0.4F;
/*  14 */     this.x = 0.7F;
/*  15 */     a(0.01F, 0.01F);
/*     */     
/*  17 */     this.B *= this.r.nextFloat() * 0.6F + 0.2F;
/*  18 */     this.t = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
/*  19 */     this.n = false;
/*     */   }
/*     */   
/*     */   private dyy(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  23 */     super(☃, d1, d2 - 0.125D, d3, d4, d5, d6);
/*     */     
/*  25 */     a(0.01F, 0.01F);
/*     */     
/*  27 */     this.B *= this.r.nextFloat() * 0.6F + 0.6F;
/*  28 */     this.t = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
/*  29 */     this.n = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public dyk b() {
/*  34 */     return dyk.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  39 */     this.d = this.g;
/*  40 */     this.e = this.h;
/*  41 */     this.f = this.i;
/*     */     
/*  43 */     if (this.t-- <= 0) {
/*  44 */       j();
/*     */       
/*     */       return;
/*     */     } 
/*  48 */     a(this.j, this.k, this.l);
/*     */   }
/*     */   
/*     */   public static class b implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public b(dyw ☃) {
/*  55 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  60 */       dyy dyy = new dyy(dwt1, d1, d2, d3);
/*  61 */       dyy.a(this.a);
/*  62 */       return dyy;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public a(dyw ☃) {
/*  70 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  75 */       Random random = dwt1.t;
/*  76 */       double d7 = random.nextGaussian() * 9.999999974752427E-7D;
/*  77 */       double d8 = random.nextGaussian() * 9.999999747378752E-5D;
/*  78 */       double d9 = random.nextGaussian() * 9.999999974752427E-7D;
/*  79 */       dyy dyy = new dyy(dwt1, d1, d2, d3, d7, d8, d9);
/*  80 */       dyy.a(this.a);
/*  81 */       dyy.a(0.9F, 0.4F, 0.5F);
/*  82 */       return dyy;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public c(dyw ☃) {
/*  90 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  95 */       double d = dwt1.t.nextFloat() * -1.9D * dwt1.t.nextFloat() * 0.1D;
/*  96 */       dyy dyy = new dyy(dwt1, d1, d2, d3, 0.0D, d, 0.0D);
/*  97 */       dyy.a(this.a);
/*  98 */       dyy.a(0.1F, 0.1F, 0.3F);
/*  99 */       dyy.a(0.001F, 0.001F);
/* 100 */       return dyy;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */