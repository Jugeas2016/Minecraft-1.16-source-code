/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
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
/*     */ 
/*     */ 
/*     */ public class bkj
/*     */   extends blx
/*     */ {
/*     */   public bkj(blx.a ☃) {
/*  33 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(boa ☃) {
/*  38 */     brx brx = ☃.p();
/*  39 */     fx fx1 = ☃.a();
/*  40 */     fx fx2 = fx1.a(☃.j());
/*     */ 
/*     */     
/*  43 */     if (a(☃.m(), brx, fx1)) {
/*  44 */       if (!brx.v) {
/*  45 */         brx.c(2005, fx1, 0);
/*     */       }
/*  47 */       return aou.a(brx.v);
/*     */     } 
/*     */ 
/*     */     
/*  51 */     ceh ceh = brx.d_(fx1);
/*  52 */     boolean bool = ceh.d(brx, fx1, ☃.j());
/*  53 */     if (bool && 
/*  54 */       a(☃.m(), brx, fx2, ☃.j())) {
/*  55 */       if (!brx.v) {
/*  56 */         brx.c(2005, fx2, 0);
/*     */       }
/*  58 */       return aou.a(brx.v);
/*     */     } 
/*     */ 
/*     */     
/*  62 */     return aou.c;
/*     */   }
/*     */   
/*     */   public static boolean a(bmb ☃, brx brx1, fx fx1) {
/*  66 */     ceh ceh = brx1.d_(fx1);
/*     */     
/*  68 */     if (ceh.b() instanceof buq) {
/*  69 */       buq buq = (buq)ceh.b();
/*     */       
/*  71 */       if (buq.a(brx1, fx1, ceh, brx1.v)) {
/*  72 */         if (brx1 instanceof aag) {
/*  73 */           if (buq.a(brx1, brx1.t, fx1, ceh)) {
/*  74 */             buq.a((aag)brx1, brx1.t, fx1, ceh);
/*     */           }
/*  76 */           ☃.g(1);
/*     */         } 
/*  78 */         return true;
/*     */       } 
/*     */     } 
/*  81 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(bmb ☃, brx brx1, fx fx1, @Nullable gc gc1) {
/*  85 */     if (!brx1.d_(fx1).a(bup.A) || brx1.b(fx1).e() != 8) {
/*  86 */       return false;
/*     */     }
/*     */     
/*  89 */     if (!(brx1 instanceof aag)) {
/*  90 */       return true;
/*     */     }
/*     */     
/*     */     int i;
/*  94 */     label47: for (i = 0; i < 128; i++) {
/*  95 */       fx fx2 = fx1;
/*  96 */       ceh ceh = bup.aU.n();
/*     */       
/*  98 */       for (int j = 0; j < i / 16; j++) {
/*  99 */         fx2 = fx2.b(h.nextInt(3) - 1, (h.nextInt(3) - 1) * h.nextInt(3) / 2, h.nextInt(3) - 1);
/*     */         
/* 101 */         if (brx1.d_(fx2).r(brx1, fx2)) {
/*     */           continue label47;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 107 */       Optional<vj<bsv>> optional = brx1.i(fx2);
/* 108 */       if (Objects.equals(optional, Optional.of(btb.S)) || Objects.equals(optional, Optional.of(btb.V))) {
/* 109 */         if (i == 0 && gc1 != null && gc1.n().d()) {
/*     */           
/* 111 */           ceh = ((buo)aed.Z.a(brx1.t)).n().a(buc.a, gc1);
/* 112 */         } else if (h.nextInt(4) == 0) {
/* 113 */           ceh = ((buo)aed.X.a(h)).n();
/*     */         } 
/*     */       }
/*     */       
/* 117 */       if (ceh.b().a(aed.Z)) {
/* 118 */         int k = 0;
/* 119 */         while (!ceh.a(brx1, fx2) && k < 4) {
/* 120 */           ceh = ceh.a(buc.a, gc.c.a.a(h));
/* 121 */           k++;
/*     */         } 
/*     */       } 
/*     */       
/* 125 */       if (ceh.a(brx1, fx2)) {
/*     */ 
/*     */ 
/*     */         
/* 129 */         ceh ceh1 = brx1.d_(fx2);
/* 130 */         if (ceh1.a(bup.A) && brx1.b(fx2).e() == 8) {
/* 131 */           brx1.a(fx2, ceh, 3);
/*     */         
/*     */         }
/* 134 */         else if (ceh1.a(bup.aU) && h.nextInt(10) == 0) {
/* 135 */           ((buq)bup.aU).a((aag)brx1, h, fx2, ceh1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 140 */     ☃.g(1);
/* 141 */     return true;
/*     */   }
/*     */   public static void a(bry ☃, fx fx1, int i) {
/*     */     double d2;
/* 145 */     if (i == 0) {
/* 146 */       i = 15;
/*     */     }
/*     */     
/* 149 */     ceh ceh = ☃.d_(fx1);
/* 150 */     if (ceh.g()) {
/*     */       return;
/*     */     }
/*     */     
/* 154 */     double d1 = 0.5D;
/*     */     
/* 156 */     if (ceh.a(bup.A)) {
/* 157 */       i *= 3;
/* 158 */       d2 = 1.0D;
/* 159 */       d1 = 3.0D;
/* 160 */     } else if (ceh.i(☃, fx1)) {
/* 161 */       fx1 = fx1.b();
/* 162 */       i *= 3;
/* 163 */       d1 = 3.0D;
/* 164 */       d2 = 1.0D;
/*     */     } else {
/* 166 */       d2 = ceh.j(☃, fx1).c(gc.a.b);
/*     */     } 
/*     */     
/* 169 */     ☃.a(hh.E, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, 0.0D, 0.0D, 0.0D);
/*     */     
/* 171 */     for (int j = 0; j < i; j++) {
/* 172 */       double d3 = h.nextGaussian() * 0.02D;
/* 173 */       double d4 = h.nextGaussian() * 0.02D;
/* 174 */       double d5 = h.nextGaussian() * 0.02D;
/*     */       
/* 176 */       double d6 = 0.5D - d1;
/* 177 */       double d7 = fx1.u() + d6 + h.nextDouble() * d1 * 2.0D;
/* 178 */       double d8 = fx1.v() + h.nextDouble() * d2;
/* 179 */       double d9 = fx1.w() + d6 + h.nextDouble() * d1 * 2.0D;
/*     */       
/* 181 */       if (!☃.d_((new fx(d7, d8, d9)).c()).g())
/* 182 */         ☃.a(hh.E, d7, d8, d9, d3, d4, d5); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */