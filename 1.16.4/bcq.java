/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bcq
/*     */   extends bco
/*     */ {
/*     */   public bcq(aqe<? extends bcq> ☃, brx brx1) {
/*  28 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bcq(brx ☃, fx fx1) {
/*  32 */     super((aqe)aqe.O, ☃, fx1);
/*     */     
/*  34 */     d(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D);
/*  35 */     float f1 = 0.125F;
/*  36 */     float f2 = 0.1875F;
/*  37 */     float f3 = 0.25F;
/*  38 */     a(new dci(cD() - 0.1875D, cE() - 0.25D + 0.125D, cH() - 0.1875D, cD() + 0.1875D, cE() + 0.25D + 0.125D, cH() + 0.1875D));
/*  39 */     this.k = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(double ☃, double d1, double d2) {
/*  44 */     super.d(afm.c(☃) + 0.5D, afm.c(d1) + 0.5D, afm.c(d2) + 0.5D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void g() {
/*  49 */     o(this.c.u() + 0.5D, this.c.v() + 0.5D, this.c.w() + 0.5D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(gc ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int i() {
/*  59 */     return 9;
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/*  64 */     return 9;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float a(aqx ☃, aqb aqb1) {
/*  69 */     return -0.0625F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/*  74 */     return (☃ < 1024.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable aqa ☃) {
/*  79 */     a(adq.gZ, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(md ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(md ☃) {}
/*     */ 
/*     */   
/*     */   public aou a(bfw ☃, aot aot1) {
/*  92 */     if (this.l.v) {
/*  93 */       return aou.a;
/*     */     }
/*     */     
/*  96 */     boolean bool = false;
/*  97 */     double d = 7.0D;
/*  98 */     List<aqn> list = this.l.a(aqn.class, new dci(cD() - 7.0D, cE() - 7.0D, cH() - 7.0D, cD() + 7.0D, cE() + 7.0D, cH() + 7.0D));
/*  99 */     for (aqn aqn : list) {
/* 100 */       if (aqn.eC() == ☃) {
/* 101 */         aqn.b(this, true);
/* 102 */         bool = true;
/*     */       } 
/*     */     } 
/*     */     
/* 106 */     if (!bool) {
/* 107 */       ad();
/* 108 */       if (☃.bC.d) {
/* 109 */         for (aqn aqn : list) {
/* 110 */           if (aqn.eB() && aqn.eC() == this) {
/* 111 */             aqn.a(true, false);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 117 */     return aou.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 123 */     return this.l.d_(this.c).b().a(aed.M);
/*     */   }
/*     */   
/*     */   public static bcq a(brx ☃, fx fx1) {
/* 127 */     int i = fx1.u();
/* 128 */     int j = fx1.v();
/* 129 */     int k = fx1.w();
/*     */     
/* 131 */     List<bcq> list = ☃.a(bcq.class, new dci(i - 1.0D, j - 1.0D, k - 1.0D, i + 1.0D, j + 1.0D, k + 1.0D));
/* 132 */     for (bcq bcq2 : list) {
/* 133 */       if (bcq2.n().equals(fx1)) {
/* 134 */         return bcq2;
/*     */       }
/*     */     } 
/*     */     
/* 138 */     bcq bcq1 = new bcq(☃, fx1);
/* 139 */     ☃.c(bcq1);
/* 140 */     bcq1.m();
/* 141 */     return bcq1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 146 */     a(adq.ha, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 151 */     return new on(this, X(), 0, n());
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn o(float ☃) {
/* 156 */     return l(☃).b(0.0D, 0.2D, 0.0D);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */