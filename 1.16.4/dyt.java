/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dyt
/*     */   extends dzb
/*     */ {
/*   9 */   private static final Random a = new Random();
/*     */   
/*     */   private final dyw b;
/*     */   
/*     */   private dyt(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyw dyw1) {
/*  14 */     super(☃, d1, d2, d3, 0.5D - a.nextDouble(), d5, 0.5D - a.nextDouble());
/*  15 */     this.b = dyw1;
/*  16 */     this.k *= 0.20000000298023224D;
/*  17 */     if (d4 == 0.0D && d6 == 0.0D) {
/*  18 */       this.j *= 0.10000000149011612D;
/*  19 */       this.l *= 0.10000000149011612D;
/*     */     } 
/*     */     
/*  22 */     this.B *= 0.75F;
/*     */     
/*  24 */     this.t = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
/*     */     
/*  26 */     this.n = false;
/*  27 */     b(dyw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public dyk b() {
/*  32 */     return dyk.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  37 */     this.d = this.g;
/*  38 */     this.e = this.h;
/*  39 */     this.f = this.i;
/*     */     
/*  41 */     if (this.s++ >= this.t) {
/*  42 */       j();
/*     */       
/*     */       return;
/*     */     } 
/*  46 */     b(this.b);
/*     */     
/*  48 */     this.k += 0.004D;
/*  49 */     a(this.j, this.k, this.l);
/*  50 */     if (this.h == this.e) {
/*  51 */       this.j *= 1.1D;
/*  52 */       this.l *= 1.1D;
/*     */     } 
/*  54 */     this.j *= 0.9599999785423279D;
/*  55 */     this.k *= 0.9599999785423279D;
/*  56 */     this.l *= 0.9599999785423279D;
/*     */     
/*  58 */     if (this.m) {
/*  59 */       this.j *= 0.699999988079071D;
/*  60 */       this.l *= 0.699999988079071D;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class d implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public d(dyw ☃) {
/*  68 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  73 */       return new dyt(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public c(dyw ☃) {
/*  81 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  86 */       dyg dyg = new dyt(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*  87 */       dyg.a((float)d4, (float)d5, (float)d6);
/*  88 */       return dyg;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public a(dyw ☃) {
/*  96 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 101 */       dyg dyg = new dyt(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/* 102 */       dyg.e(0.15F);
/* 103 */       dyg.a((float)d4, (float)d5, (float)d6);
/* 104 */       return dyg;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class e implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public e(dyw ☃) {
/* 112 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 117 */       dyt dyt = new dyt(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/* 118 */       float f = dwt1.t.nextFloat() * 0.5F + 0.35F;
/* 119 */       dyt.a(1.0F * f, 0.0F * f, 1.0F * f);
/* 120 */       return dyt;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public b(dyw ☃) {
/* 128 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 133 */       return new dyt(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */