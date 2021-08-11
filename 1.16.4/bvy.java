/*     */ import java.util.Random;
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
/*     */ public abstract class bvy
/*     */   extends bxm
/*     */ {
/*  24 */   protected static final ddh b = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
/*     */   
/*  26 */   public static final cey c = cex.w;
/*     */   
/*     */   protected bvy(ceg.c ☃) {
/*  29 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  34 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  39 */     return c(brz1, fx1.c());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  44 */     if (a(aag1, fx1, ☃)) {
/*     */       return;
/*     */     }
/*     */     
/*  48 */     boolean bool1 = ((Boolean)☃.c(c)).booleanValue();
/*  49 */     boolean bool2 = a(aag1, fx1, ☃);
/*  50 */     if (bool1 && !bool2) {
/*  51 */       aag1.a(fx1, ☃.a(c, Boolean.valueOf(false)), 2);
/*  52 */     } else if (!bool1) {
/*     */ 
/*     */       
/*  55 */       aag1.a(fx1, ☃.a(c, Boolean.valueOf(true)), 2);
/*  56 */       if (!bool2) {
/*  57 */         aag1.j().a(fx1, this, g(☃), bsq.b);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  64 */     return ☃.b(brc1, fx1, gc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  69 */     if (!((Boolean)☃.c(c)).booleanValue()) {
/*  70 */       return 0;
/*     */     }
/*     */     
/*  73 */     if (☃.c(aq) == gc1) {
/*  74 */       return b(brc1, fx1, ☃);
/*     */     }
/*     */     
/*  77 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  82 */     if (☃.a(brx1, fx1)) {
/*  83 */       c(brx1, fx1, ☃);
/*     */       
/*     */       return;
/*     */     } 
/*  87 */     ccj ccj = q() ? brx1.c(fx1) : null;
/*  88 */     a(☃, brx1, fx1, ccj);
/*  89 */     brx1.a(fx1, false);
/*  90 */     for (gc gc : gc.values()) {
/*  91 */       brx1.b(fx1.a(gc), this);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(brx ☃, fx fx1, ceh ceh1) {
/*  96 */     if (a(☃, fx1, ceh1)) {
/*     */       return;
/*     */     }
/*     */     
/* 100 */     boolean bool1 = ((Boolean)ceh1.c(c)).booleanValue();
/* 101 */     boolean bool2 = a(☃, fx1, ceh1);
/* 102 */     if (bool1 != bool2 && !☃.J().b(fx1, this)) {
/* 103 */       bsq bsq = bsq.c;
/*     */ 
/*     */       
/* 106 */       if (c(☃, fx1, ceh1)) {
/* 107 */         bsq = bsq.a;
/* 108 */       } else if (bool1) {
/* 109 */         bsq = bsq.b;
/*     */       } 
/*     */       
/* 112 */       ☃.J().a(fx1, this, g(ceh1), bsq);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(brz ☃, fx fx1, ceh ceh1) {
/* 117 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(brx ☃, fx fx1, ceh ceh1) {
/* 121 */     return (b(☃, fx1, ceh1) > 0);
/*     */   }
/*     */   
/*     */   protected int b(brx ☃, fx fx1, ceh ceh1) {
/* 125 */     gc gc = (gc)ceh1.c(aq);
/*     */     
/* 127 */     fx fx2 = fx1.a(gc);
/* 128 */     int i = ☃.b(fx2, gc);
/* 129 */     if (i >= 15) {
/* 130 */       return i;
/*     */     }
/*     */     
/* 133 */     ceh ceh2 = ☃.d_(fx2);
/* 134 */     return Math.max(i, ceh2.a(bup.bS) ? ((Integer)ceh2.c(bzd.e)).intValue() : 0);
/*     */   }
/*     */   
/*     */   protected int b(brz ☃, fx fx1, ceh ceh1) {
/* 138 */     gc gc1 = (gc)ceh1.c(aq);
/* 139 */     gc gc2 = gc1.g();
/* 140 */     gc gc3 = gc1.h();
/* 141 */     return Math.max(b(☃, fx1.a(gc2), gc2), b(☃, fx1.a(gc3), gc3));
/*     */   }
/*     */   
/*     */   protected int b(brz ☃, fx fx1, gc gc1) {
/* 145 */     ceh ceh = ☃.d_(fx1);
/* 146 */     if (h(ceh)) {
/* 147 */       if (ceh.a(bup.fw)) {
/* 148 */         return 15;
/*     */       }
/* 150 */       if (ceh.a(bup.bS)) {
/* 151 */         return ((Integer)ceh.c(bzd.e)).intValue();
/*     */       }
/* 153 */       return ☃.c(fx1, gc1);
/*     */     } 
/*     */     
/* 156 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/* 161 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 166 */     return n().a(aq, ☃.f().f());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/* 171 */     if (a(☃, fx1, ceh1)) {
/* 172 */       ☃.J().a(fx1, this, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 178 */     d(brx1, fx1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 183 */     if (bool || ☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/*     */     
/* 187 */     super.a(☃, brx1, fx1, ceh1, bool);
/* 188 */     d(brx1, fx1, ☃);
/*     */   }
/*     */   
/*     */   protected void d(brx ☃, fx fx1, ceh ceh1) {
/* 192 */     gc gc = (gc)ceh1.c(aq);
/* 193 */     fx fx2 = fx1.a(gc.f());
/*     */     
/* 195 */     ☃.a(fx2, this, fx1);
/* 196 */     ☃.a(fx2, this, gc);
/*     */   }
/*     */   
/*     */   protected boolean h(ceh ☃) {
/* 200 */     return ☃.i();
/*     */   }
/*     */   
/*     */   protected int b(brc ☃, fx fx1, ceh ceh1) {
/* 204 */     return 15;
/*     */   }
/*     */   
/*     */   public static boolean l(ceh ☃) {
/* 208 */     return ☃.b() instanceof bvy;
/*     */   }
/*     */   
/*     */   public boolean c(brc ☃, fx fx1, ceh ceh1) {
/* 212 */     gc gc = ((gc)ceh1.c(aq)).f();
/* 213 */     ceh ceh2 = ☃.d_(fx1.a(gc));
/*     */     
/* 215 */     return (l(ceh2) && ceh2.c(aq) != gc);
/*     */   }
/*     */   
/*     */   protected abstract int g(ceh paramceh);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */