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
/*     */ public class bvf
/*     */   extends buo
/*     */ {
/*  22 */   public static final cfg a = cex.ah;
/*     */   
/*     */   private final bvg b;
/*     */   
/*     */   protected bvf(bvg ☃, ceg.c c1) {
/*  27 */     super(c1);
/*  28 */     this.b = ☃;
/*  29 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  34 */     if (!☃.a(aag1, fx1)) {
/*  35 */       aag1.b(fx1, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/*  41 */     return (((Integer)☃.c(a)).intValue() < 5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  47 */     fx fx2 = fx1.b();
/*  48 */     if (!aag1.w(fx2) || fx2.v() >= 256) {
/*     */       return;
/*     */     }
/*     */     
/*  52 */     int i = ((Integer)☃.c(a)).intValue();
/*  53 */     if (i >= 5) {
/*     */       return;
/*     */     }
/*     */     
/*  57 */     boolean bool1 = false;
/*  58 */     boolean bool2 = false;
/*     */     
/*  60 */     ceh ceh1 = aag1.d_(fx1.c());
/*  61 */     buo buo1 = ceh1.b();
/*  62 */     if (buo1 == bup.ee) {
/*  63 */       bool1 = true;
/*  64 */     } else if (buo1 == this.b) {
/*  65 */       int j = 1;
/*  66 */       for (int k = 0; k < 4; k++) {
/*  67 */         buo buo2 = aag1.d_(fx1.c(j + 1)).b();
/*  68 */         if (buo2 == this.b) {
/*  69 */           j++;
/*     */         } else {
/*  71 */           if (buo2 == bup.ee) {
/*  72 */             bool2 = true;
/*     */           }
/*     */           break;
/*     */         } 
/*     */       } 
/*  77 */       if (j < 2 || j <= random.nextInt(bool2 ? 5 : 4)) {
/*  78 */         bool1 = true;
/*     */       }
/*  80 */     } else if (ceh1.g()) {
/*  81 */       bool1 = true;
/*     */     } 
/*     */     
/*  84 */     if (bool1 && b(aag1, fx2, (gc)null) && aag1.w(fx1.b(2))) {
/*  85 */       aag1.a(fx1, this.b.a(aag1, fx1), 2);
/*  86 */       a(aag1, fx2, i);
/*  87 */     } else if (i < 4) {
/*  88 */       int j = random.nextInt(4);
/*  89 */       if (bool2) {
/*  90 */         j++;
/*     */       }
/*     */       
/*  93 */       boolean bool = false;
/*  94 */       for (int k = 0; k < j; k++) {
/*  95 */         gc gc = gc.c.a.a(random);
/*  96 */         fx fx3 = fx1.a(gc);
/*  97 */         if (aag1.w(fx3) && aag1.w(fx3.c()) && b(aag1, fx3, gc.f())) {
/*  98 */           a(aag1, fx3, i + 1);
/*  99 */           bool = true;
/*     */         } 
/*     */       } 
/*     */       
/* 103 */       if (bool) {
/* 104 */         aag1.a(fx1, this.b.a(aag1, fx1), 2);
/*     */       } else {
/* 106 */         a(aag1, fx1);
/*     */       } 
/*     */     } else {
/* 109 */       a(aag1, fx1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, int i) {
/* 114 */     ☃.a(fx1, n().a(a, Integer.valueOf(i)), 2);
/* 115 */     ☃.c(1033, fx1, 0);
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1) {
/* 119 */     ☃.a(fx1, n().a(a, Integer.valueOf(5)), 2);
/* 120 */     ☃.c(1034, fx1, 0);
/*     */   }
/*     */   
/*     */   private static boolean b(brz ☃, fx fx1, @Nullable gc gc1) {
/* 124 */     for (gc gc2 : gc.c.a) {
/* 125 */       if (gc2 != gc1 && !☃.w(fx1.a(gc2))) {
/* 126 */         return false;
/*     */       }
/*     */     } 
/* 129 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 134 */     if (gc1 != gc.b && !☃.a(bry1, fx1)) {
/* 135 */       bry1.J().a(fx1, this, 1);
/*     */     }
/*     */     
/* 138 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 143 */     ceh ceh1 = brz1.d_(fx1.c());
/* 144 */     if (ceh1.b() == this.b || ceh1.a(bup.ee)) {
/* 145 */       return true;
/*     */     }
/* 147 */     if (!ceh1.g()) {
/* 148 */       return false;
/*     */     }
/*     */     
/* 151 */     boolean bool = false;
/* 152 */     for (gc gc : gc.c.a) {
/* 153 */       ceh ceh2 = brz1.d_(fx1.a(gc));
/* 154 */       if (ceh2.a(this.b)) {
/* 155 */         if (bool) {
/* 156 */           return false;
/*     */         }
/* 158 */         bool = true; continue;
/* 159 */       }  if (!ceh2.g()) {
/* 160 */         return false;
/*     */       }
/*     */     } 
/* 163 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 168 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */   
/*     */   public static void a(bry ☃, fx fx1, Random random, int i) {
/* 172 */     ☃.a(fx1, ((bvg)bup.ix).a(☃, fx1), 2);
/* 173 */     a(☃, fx1, random, fx1, i, 0);
/*     */   }
/*     */   
/*     */   private static void a(bry ☃, fx fx1, Random random, fx fx2, int i, int j) {
/* 177 */     bvg bvg1 = (bvg)bup.ix;
/*     */     
/* 179 */     int k = random.nextInt(4) + 1;
/* 180 */     if (j == 0) {
/* 181 */       k++;
/*     */     }
/*     */     
/* 184 */     for (int m = 0; m < k; m++) {
/* 185 */       fx fx3 = fx1.b(m + 1);
/* 186 */       if (!b(☃, fx3, (gc)null)) {
/*     */         return;
/*     */       }
/*     */       
/* 190 */       ☃.a(fx3, bvg1.a(☃, fx3), 2);
/* 191 */       ☃.a(fx3.c(), bvg1.a(☃, fx3.c()), 2);
/*     */     } 
/*     */     
/* 194 */     boolean bool = false;
/* 195 */     if (j < 4) {
/* 196 */       int n = random.nextInt(4);
/* 197 */       if (j == 0) {
/* 198 */         n++;
/*     */       }
/* 200 */       for (int i1 = 0; i1 < n; i1++) {
/* 201 */         gc gc = gc.c.a.a(random);
/* 202 */         fx fx3 = fx1.b(k).a(gc);
/* 203 */         if (Math.abs(fx3.u() - fx2.u()) < i && Math.abs(fx3.w() - fx2.w()) < i)
/*     */         {
/*     */           
/* 206 */           if (☃.w(fx3) && ☃.w(fx3.c()) && b(☃, fx3, gc.f())) {
/* 207 */             bool = true;
/* 208 */             ☃.a(fx3, bvg1.a(☃, fx3), 2);
/* 209 */             ☃.a(fx3.a(gc.f()), bvg1.a(☃, fx3.a(gc.f())), 2);
/* 210 */             a(☃, fx3, random, fx2, i, j + 1);
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/* 215 */     if (!bool) {
/* 216 */       ☃.a(fx1.b(k), bup.iy.n().a(a, Integer.valueOf(5)), 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, ceh ceh1, dcj dcj1, bgm bgm1) {
/* 222 */     if (bgm1.X().a(aee.f)) {
/* 223 */       fx fx = dcj1.a();
/* 224 */       ☃.a(fx, true, bgm1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */