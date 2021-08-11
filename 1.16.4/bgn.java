/*     */ import java.util.Optional;
/*     */ import java.util.function.Predicate;
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
/*     */ public final class bgn
/*     */ {
/*     */   public static dcl a(aqa ☃, Predicate<aqa> predicate) {
/*  27 */     dcn dcn1 = ☃.cC();
/*  28 */     brx brx = ☃.l;
/*     */     
/*  30 */     dcn dcn2 = ☃.cA();
/*  31 */     dcn dcn3 = dcn2.e(dcn1);
/*  32 */     dcl dcl1 = brx.a(new brf(dcn2, dcn3, brf.a.a, brf.b.a, ☃));
/*     */     
/*  34 */     if (dcl1.c() != dcl.a.a) {
/*  35 */       dcn3 = dcl1.e();
/*     */     }
/*  37 */     dcl dcl2 = a(brx, ☃, dcn2, dcn3, ☃.cc().b(☃.cC()).g(1.0D), predicate);
/*     */     
/*  39 */     if (dcl2 != null) {
/*  40 */       dcl1 = dcl2;
/*     */     }
/*     */     
/*  43 */     return dcl1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dck a(aqa ☃, dcn dcn1, dcn dcn2, dci dci1, Predicate<aqa> predicate, double d) {
/*  48 */     brx brx = ☃.l;
/*  49 */     double d1 = d;
/*  50 */     aqa aqa1 = null;
/*  51 */     dcn dcn3 = null;
/*     */     
/*  53 */     for (aqa aqa2 : brx.a(☃, dci1, predicate)) {
/*  54 */       dci dci2 = aqa2.cc().g(aqa2.bg());
/*  55 */       Optional<dcn> optional = dci2.b(dcn1, dcn2);
/*  56 */       if (dci2.d(dcn1)) {
/*  57 */         if (d1 >= 0.0D) {
/*  58 */           aqa1 = aqa2;
/*  59 */           dcn3 = optional.orElse(dcn1);
/*  60 */           d1 = 0.0D;
/*     */         }  continue;
/*     */       } 
/*  63 */       if (optional.isPresent()) {
/*  64 */         dcn dcn4 = optional.get();
/*  65 */         double d2 = dcn1.g(dcn4);
/*  66 */         if (d2 < d1 || d1 == 0.0D) {
/*  67 */           if (aqa2.cr() == ☃.cr()) {
/*  68 */             if (d1 == 0.0D) {
/*  69 */               aqa1 = aqa2;
/*  70 */               dcn3 = dcn4;
/*     */             }  continue;
/*     */           } 
/*  73 */           aqa1 = aqa2;
/*  74 */           dcn3 = dcn4;
/*  75 */           d1 = d2;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  82 */     if (aqa1 == null) {
/*  83 */       return null;
/*     */     }
/*  85 */     return new dck(aqa1, dcn3);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dck a(brx ☃, aqa aqa1, dcn dcn1, dcn dcn2, dci dci1, Predicate<aqa> predicate) {
/*  90 */     double d = Double.MAX_VALUE;
/*  91 */     aqa aqa2 = null;
/*     */     
/*  93 */     for (aqa aqa3 : ☃.a(aqa1, dci1, predicate)) {
/*  94 */       dci dci2 = aqa3.cc().g(0.30000001192092896D);
/*  95 */       Optional<dcn> optional = dci2.b(dcn1, dcn2);
/*  96 */       if (optional.isPresent()) {
/*  97 */         double d1 = dcn1.g(optional.get());
/*  98 */         if (d1 < d) {
/*  99 */           aqa2 = aqa3;
/* 100 */           d = d1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 105 */     if (aqa2 == null) {
/* 106 */       return null;
/*     */     }
/* 108 */     return new dck(aqa2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void a(aqa ☃, float f) {
/* 118 */     dcn dcn = ☃.cC();
/*     */     
/* 120 */     if (dcn.g() == 0.0D) {
/*     */       return;
/*     */     }
/*     */     
/* 124 */     float f1 = afm.a(aqa.c(dcn));
/* 125 */     ☃.p = (float)(afm.d(dcn.d, dcn.b) * 57.2957763671875D) + 90.0F;
/* 126 */     ☃.q = (float)(afm.d(f1, dcn.c) * 57.2957763671875D) - 90.0F;
/*     */     
/* 128 */     while (☃.q - ☃.s < -180.0F) {
/* 129 */       ☃.s -= 360.0F;
/*     */     }
/* 131 */     while (☃.q - ☃.s >= 180.0F) {
/* 132 */       ☃.s += 360.0F;
/*     */     }
/*     */     
/* 135 */     while (☃.p - ☃.r < -180.0F) {
/* 136 */       ☃.r -= 360.0F;
/*     */     }
/* 138 */     while (☃.p - ☃.r >= 180.0F) {
/* 139 */       ☃.r += 360.0F;
/*     */     }
/*     */     
/* 142 */     ☃.q = afm.g(f, ☃.s, ☃.q);
/* 143 */     ☃.p = afm.g(f, ☃.r, ☃.p);
/*     */   }
/*     */   
/*     */   public static aot a(aqm ☃, blx blx1) {
/* 147 */     return (☃.dD().b() == blx1) ? aot.a : aot.b;
/*     */   }
/*     */   
/*     */   public static bga a(aqm ☃, bmb bmb1, float f) {
/* 151 */     bkc bkc = (bmb1.b() instanceof bkc) ? (bkc)bmb1.b() : (bkc)bmd.kd;
/* 152 */     bga bga = bkc.a(☃.l, bmb1, ☃);
/* 153 */     bga.a(☃, f);
/*     */     
/* 155 */     if (bmb1.b() == bmd.ql && 
/* 156 */       bga instanceof bgc) {
/* 157 */       ((bgc)bga).b(bmb1);
/*     */     }
/*     */ 
/*     */     
/* 161 */     return bga;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */