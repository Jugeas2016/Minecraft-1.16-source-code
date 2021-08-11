/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.serialization.Codec;
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
/*     */ public class cil
/*     */   extends cjl<clt>
/*     */ {
/*  19 */   private static final ImmutableList<buo> a = ImmutableList.of(bup.B, bup.z, bup.iJ, bup.cM, bup.dV, bup.dW, bup.dX, bup.dY, bup.bR, bup.bP);
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
/*     */   public cil(Codec<clt> ☃) {
/*  33 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, clt clt1) {
/*  38 */     int i = cfy1.f();
/*  39 */     if (!a(☃, i, fx1.i())) {
/*  40 */       return false;
/*     */     }
/*     */     
/*  43 */     int j = clt1.b().a(random);
/*     */     
/*  45 */     boolean bool1 = (random.nextFloat() < 0.9F);
/*  46 */     int k = Math.min(j, bool1 ? 5 : 8);
/*  47 */     int m = bool1 ? 50 : 15;
/*     */ 
/*     */     
/*  50 */     boolean bool2 = false;
/*  51 */     for (fx fx2 : fx.a(random, m, fx1.u() - k, fx1.v(), fx1.w() - k, fx1.u() + k, fx1.v(), fx1.w() + k)) {
/*  52 */       int n = j - fx2.k(fx1);
/*  53 */       if (n >= 0) {
/*  54 */         bool2 |= a(☃, i, fx2, n, clt1.am_().a(random));
/*     */       }
/*     */     } 
/*     */     
/*  58 */     return bool2;
/*     */   }
/*     */   
/*     */   private boolean a(bry ☃, int i, fx fx1, int j, int k) {
/*  62 */     boolean bool = false;
/*     */     
/*  64 */     for (fx fx2 : fx.b(fx1.u() - k, fx1.v(), fx1.w() - k, fx1.u() + k, fx1.v(), fx1.w() + k)) {
/*  65 */       int m = fx2.k(fx1);
/*     */ 
/*     */ 
/*     */       
/*  69 */       fx fx3 = a(☃, i, fx2) ? a(☃, i, fx2.i(), m) : a(☃, fx2.i(), m);
/*  70 */       if (fx3 == null) {
/*     */         continue;
/*     */       }
/*     */       
/*  74 */       int n = j - m / 2;
/*  75 */       fx.a a = fx3.i();
/*  76 */       while (n >= 0) {
/*  77 */         if (a(☃, i, a)) {
/*  78 */           a(☃, a, bup.cO.n());
/*  79 */           a.c(gc.b);
/*  80 */           bool = true;
/*  81 */         } else if (☃.d_(a).a(bup.cO)) {
/*  82 */           a.c(gc.b);
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */         
/*  87 */         n--;
/*     */       } 
/*     */     } 
/*     */     
/*  91 */     return bool;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static fx a(bry ☃, int i, fx.a a1, int j) {
/*  96 */     while (a1.v() > 1 && j > 0) {
/*  97 */       j--;
/*  98 */       if (a(☃, i, a1)) {
/*  99 */         return a1;
/*     */       }
/* 101 */       a1.c(gc.a);
/*     */     } 
/* 103 */     return null;
/*     */   }
/*     */   
/*     */   private static boolean a(bry ☃, int i, fx.a a1) {
/* 107 */     if (a(☃, i, a1)) {
/* 108 */       ceh ceh = ☃.d_(a1.c(gc.a));
/* 109 */       a1.c(gc.b);
/* 110 */       return (!ceh.g() && !a.contains(ceh.b()));
/*     */     } 
/* 112 */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static fx a(bry ☃, fx.a a1, int i) {
/* 117 */     while (a1.v() < ☃.L() && i > 0) {
/* 118 */       i--;
/*     */       
/* 120 */       ceh ceh = ☃.d_(a1);
/* 121 */       if (a.contains(ceh.b())) {
/* 122 */         return null;
/*     */       }
/*     */       
/* 125 */       if (ceh.g()) {
/* 126 */         return a1;
/*     */       }
/*     */       
/* 129 */       a1.c(gc.b);
/*     */     } 
/* 131 */     return null;
/*     */   }
/*     */   
/*     */   private static boolean a(bry ☃, int i, fx fx1) {
/* 135 */     ceh ceh = ☃.d_(fx1);
/* 136 */     return (ceh.g() || (ceh.a(bup.B) && fx1.v() <= i));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */