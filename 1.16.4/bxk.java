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
/*     */ public class bxk
/*     */   extends bxi
/*     */ {
/*  61 */   protected static final ddh a = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
/*     */   
/*     */   public bxk(ceg.c ☃) {
/*  64 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean c(aqa ☃) {
/*  69 */     return (☃ instanceof aqm || ☃ instanceof bhl || ☃ instanceof bcw || ☃ instanceof bhn);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  77 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, aqa aqa1, float f) {
/*  82 */     aqa1.a(adq.fN, 1.0F, 1.0F);
/*     */     
/*  84 */     if (!☃.v)
/*     */     {
/*     */       
/*  87 */       ☃.a(aqa1, (byte)54);
/*     */     }
/*     */     
/*  90 */     if (aqa1.b(f, 0.2F)) {
/*  91 */       aqa1.a(this.aw.g(), this.aw.a() * 0.5F, this.aw.b() * 0.75F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/*  97 */     if (a(fx1, aqa1)) {
/*  98 */       a(aqa1, fx1);
/*  99 */       d(aqa1);
/* 100 */       a(brx1, aqa1);
/*     */     } 
/* 102 */     super.a(☃, brx1, fx1, aqa1);
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃, aqa aqa1) {
/* 106 */     if (aqa1.ao()) {
/* 107 */       return false;
/*     */     }
/* 109 */     if (aqa1.cE() > ☃.v() + 0.9375D - 1.0E-7D)
/*     */     {
/* 111 */       return false;
/*     */     }
/* 113 */     if ((aqa1.cC()).c >= -0.08D) {
/* 114 */       return false;
/*     */     }
/*     */     
/* 117 */     double d1 = Math.abs(☃.u() + 0.5D - aqa1.cD());
/* 118 */     double d2 = Math.abs(☃.w() + 0.5D - aqa1.cH());
/*     */     
/* 120 */     double d3 = 0.4375D + (aqa1.cy() / 2.0F);
/*     */     
/* 122 */     return (d1 + 1.0E-7D > d3 || d2 + 1.0E-7D > d3);
/*     */   }
/*     */   
/*     */   private void a(aqa ☃, fx fx1) {
/* 126 */     if (☃ instanceof aah && ☃.l.T() % 20L == 0L)
/*     */     {
/* 128 */       ac.J.a((aah)☃, ☃.l.d_(fx1));
/*     */     }
/*     */   }
/*     */   
/*     */   private void d(aqa ☃) {
/* 133 */     dcn dcn = ☃.cC();
/* 134 */     if (dcn.c < -0.13D) {
/*     */ 
/*     */ 
/*     */       
/* 138 */       double d = -0.05D / dcn.c;
/* 139 */       ☃.f(new dcn(dcn.b * d, -0.05D, dcn.d * d));
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 145 */       ☃.f(new dcn(dcn.b, -0.05D, dcn.d));
/*     */     } 
/* 147 */     ☃.C = 0.0F;
/*     */   }
/*     */   
/*     */   private void a(brx ☃, aqa aqa1) {
/* 151 */     if (c(aqa1)) {
/* 152 */       if (☃.t.nextInt(5) == 0)
/*     */       {
/* 154 */         aqa1.a(adq.fN, 1.0F, 1.0F);
/*     */       }
/*     */       
/* 157 */       if (!☃.v && ☃.t.nextInt(5) == 0)
/*     */       {
/* 159 */         ☃.a(aqa1, (byte)53);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(aqa ☃) {
/* 165 */     a(☃, 5);
/*     */   }
/*     */   
/*     */   public static void b(aqa ☃) {
/* 169 */     a(☃, 10);
/*     */   }
/*     */   
/*     */   private static void a(aqa ☃, int i) {
/* 173 */     if (!☃.l.v) {
/*     */       return;
/*     */     }
/*     */     
/* 177 */     ceh ceh = bup.ne.n();
/* 178 */     for (int j = 0; j < i; j++)
/*     */     {
/* 180 */       ☃.l.a(new hc(hh.d, ceh), ☃.cD(), ☃.cE(), ☃.cH(), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */