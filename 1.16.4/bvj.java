/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ public class bvj
/*     */   extends bvy
/*     */   implements bwm
/*     */ {
/*  31 */   public static final cfe<cfa> a = cex.aG;
/*     */   
/*     */   public bvj(ceg.c ☃) {
/*  34 */     super(☃);
/*  35 */     j(((ceh)this.n.b()).a(aq, gc.c).a(c, Boolean.valueOf(false)).a(a, cfa.a));
/*     */   }
/*     */ 
/*     */   
/*     */   protected int g(ceh ☃) {
/*  40 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(brc ☃, fx fx1, ceh ceh1) {
/*  45 */     ccj ccj = ☃.c(fx1);
/*  46 */     if (ccj instanceof ccp) {
/*  47 */       return ((ccp)ccj).d();
/*     */     }
/*     */     
/*  50 */     return 0;
/*     */   }
/*     */   
/*     */   private int e(brx ☃, fx fx1, ceh ceh1) {
/*  54 */     if (ceh1.c(a) == cfa.b) {
/*  55 */       return Math.max(b(☃, fx1, ceh1) - b(☃, fx1, ceh1), 0);
/*     */     }
/*     */     
/*  58 */     return b(☃, fx1, ceh1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(brx ☃, fx fx1, ceh ceh1) {
/*  63 */     int i = b(☃, fx1, ceh1);
/*  64 */     if (i == 0) {
/*  65 */       return false;
/*     */     }
/*     */     
/*  68 */     int j = b(☃, fx1, ceh1);
/*  69 */     if (i > j) {
/*  70 */       return true;
/*     */     }
/*     */     
/*  73 */     return (i == j && ceh1.c(a) == cfa.a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(brx ☃, fx fx1, ceh ceh1) {
/*  78 */     int i = super.b(☃, fx1, ceh1);
/*     */     
/*  80 */     gc gc = (gc)ceh1.c(aq);
/*  81 */     fx fx2 = fx1.a(gc);
/*  82 */     ceh ceh2 = ☃.d_(fx2);
/*     */     
/*  84 */     if (ceh2.j()) {
/*  85 */       i = ceh2.a(☃, fx2);
/*  86 */     } else if (i < 15 && ceh2.g(☃, fx2)) {
/*  87 */       fx2 = fx2.a(gc);
/*  88 */       ceh2 = ☃.d_(fx2);
/*  89 */       bcp bcp = a(☃, gc, fx2);
/*     */       
/*  91 */       int j = Math.max((bcp == null) ? Integer.MIN_VALUE : bcp
/*  92 */           .q(), 
/*  93 */           ceh2.j() ? ceh2.a(☃, fx2) : Integer.MIN_VALUE);
/*     */ 
/*     */       
/*  96 */       if (j != Integer.MIN_VALUE) {
/*  97 */         i = j;
/*     */       }
/*     */     } 
/*     */     
/* 101 */     return i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private bcp a(brx ☃, gc gc1, fx fx1) {
/* 106 */     List<bcp> list = ☃.a(bcp.class, new dci(fx1.u(), fx1.v(), fx1.w(), (fx1.u() + 1), (fx1.v() + 1), (fx1.w() + 1)), bcp1 -> (bcp1 != null && bcp1.bZ() == ☃));
/*     */     
/* 108 */     if (list.size() == 1) {
/* 109 */       return list.get(0);
/*     */     }
/*     */     
/* 112 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 117 */     if (!bfw1.bC.e) {
/* 118 */       return aou.c;
/*     */     }
/*     */     
/* 121 */     ☃ = ☃.a(a);
/* 122 */     float f = (☃.c(a) == cfa.b) ? 0.55F : 0.5F;
/* 123 */     brx1.a(bfw1, fx1, adq.bT, adr.e, 0.3F, f);
/*     */     
/* 125 */     brx1.a(fx1, ☃, 2);
/* 126 */     f(brx1, fx1, ☃);
/* 127 */     return aou.a(brx1.v);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(brx ☃, fx fx1, ceh ceh1) {
/* 132 */     if (☃.J().b(fx1, this)) {
/*     */       return;
/*     */     }
/*     */     
/* 136 */     int i = e(☃, fx1, ceh1);
/* 137 */     ccj ccj = ☃.c(fx1);
/* 138 */     int j = (ccj instanceof ccp) ? ((ccp)ccj).d() : 0;
/*     */     
/* 140 */     if (i != j || ((Boolean)ceh1.c(c)).booleanValue() != a(☃, fx1, ceh1)) {
/*     */       
/* 142 */       bsq bsq = c(☃, fx1, ceh1) ? bsq.c : bsq.d;
/* 143 */       ☃.J().a(fx1, this, 2, bsq);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void f(brx ☃, fx fx1, ceh ceh1) {
/* 148 */     int i = e(☃, fx1, ceh1);
/*     */     
/* 150 */     ccj ccj = ☃.c(fx1);
/* 151 */     int j = 0;
/* 152 */     if (ccj instanceof ccp) {
/* 153 */       ccp ccp = (ccp)ccj;
/*     */       
/* 155 */       j = ccp.d();
/* 156 */       ccp.a(i);
/*     */     } 
/*     */     
/* 159 */     if (j != i || ceh1.c(a) == cfa.a) {
/* 160 */       boolean bool1 = a(☃, fx1, ceh1);
/* 161 */       boolean bool2 = ((Boolean)ceh1.c(c)).booleanValue();
/*     */       
/* 163 */       if (bool2 && !bool1) {
/* 164 */         ☃.a(fx1, ceh1.a(c, Boolean.valueOf(false)), 2);
/* 165 */       } else if (!bool2 && bool1) {
/* 166 */         ☃.a(fx1, ceh1.a(c, Boolean.valueOf(true)), 2);
/*     */       } 
/*     */       
/* 169 */       d(☃, fx1, ceh1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 175 */     f(aag1, fx1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brx brx1, fx fx1, int i, int j) {
/* 180 */     super.a(☃, brx1, fx1, i, j);
/*     */     
/* 182 */     ccj ccj = brx1.c(fx1);
/* 183 */     return (ccj != null && ccj.a_(i, j));
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/* 188 */     return new ccp();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 193 */     ☃.a((cfj<?>[])new cfj[] { aq, a, c });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */