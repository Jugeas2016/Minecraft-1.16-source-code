/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.ToDoubleFunction;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class azj
/*     */ {
/*     */   @Nullable
/*     */   public static dcn a(aqu ☃, int i, int j) {
/*  41 */     return a(☃, i, j, 0, null, true, 1.5707963705062866D, ☃::f, false, 0, 0, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static dcn a(aqu ☃, int i, int j, int k, @Nullable dcn dcn1, double d) {
/*  49 */     return a(☃, i, j, k, dcn1, true, d, ☃::f, true, 0, 0, false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcn b(aqu ☃, int i, int j) {
/*  54 */     return a(☃, i, j, ☃::f);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcn a(aqu ☃, int i, int j, ToDoubleFunction<fx> toDoubleFunction) {
/*  59 */     return a(☃, i, j, 0, null, false, 0.0D, toDoubleFunction, true, 0, 0, true);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcn a(aqu ☃, int i, int j, dcn dcn1, float f, int k, int m) {
/*  64 */     return a(☃, i, j, 0, dcn1, false, f, ☃::f, true, k, m, true);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcn a(aqu ☃, int i, int j, dcn dcn1) {
/*  69 */     dcn dcn2 = dcn1.a(☃.cD(), ☃.cE(), ☃.cH());
/*  70 */     return a(☃, i, j, 0, dcn2, false, 1.5707963705062866D, ☃::f, true, 0, 0, true);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcn b(aqu ☃, int i, int j, dcn dcn1) {
/*  75 */     dcn dcn2 = dcn1.a(☃.cD(), ☃.cE(), ☃.cH());
/*  76 */     return a(☃, i, j, 0, dcn2, true, 1.5707963705062866D, ☃::f, false, 0, 0, true);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcn a(aqu ☃, int i, int j, dcn dcn1, double d) {
/*  81 */     dcn dcn2 = dcn1.a(☃.cD(), ☃.cE(), ☃.cH());
/*  82 */     return a(☃, i, j, 0, dcn2, true, d, ☃::f, false, 0, 0, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static dcn b(aqu ☃, int i, int j, int k, dcn dcn1, double d) {
/*  91 */     dcn dcn2 = dcn1.a(☃.cD(), ☃.cE(), ☃.cH());
/*     */     
/*  93 */     return a(☃, i, j, k, dcn2, false, d, ☃::f, true, 0, 0, false);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static dcn c(aqu ☃, int i, int j, dcn dcn1) {
/*  99 */     dcn dcn2 = ☃.cA().d(dcn1);
/* 100 */     return a(☃, i, j, 0, dcn2, true, 1.5707963705062866D, ☃::f, false, 0, 0, true);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcn d(aqu ☃, int i, int j, dcn dcn1) {
/* 105 */     dcn dcn2 = ☃.cA().d(dcn1);
/* 106 */     return a(☃, i, j, 0, dcn2, false, 1.5707963705062866D, ☃::f, true, 0, 0, true);
/*     */   }
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
/*     */   @Nullable
/*     */   private static dcn a(aqu ☃, int i, int j, int k, @Nullable dcn dcn1, boolean bool1, double d, ToDoubleFunction<fx> toDoubleFunction, boolean bool2, int m, int n, boolean bool3) {
/*     */     boolean bool4;
/* 137 */     ayj ayj = ☃.x();
/* 138 */     Random random = ☃.cY();
/*     */ 
/*     */     
/* 141 */     if (☃.ez()) {
/* 142 */       bool4 = ☃.ew().a(☃.cA(), (☃.ex() + i) + 1.0D);
/*     */     } else {
/* 144 */       bool4 = false;
/*     */     } 
/*     */     
/* 147 */     boolean bool5 = false;
/* 148 */     double d1 = Double.NEGATIVE_INFINITY;
/*     */     
/* 150 */     fx fx = ☃.cB();
/*     */     
/* 152 */     for (int i1 = 0; i1 < 10; i1++) {
/* 153 */       fx fx1 = a(random, i, j, k, dcn1, d);
/* 154 */       if (fx1 != null) {
/*     */ 
/*     */ 
/*     */         
/* 158 */         int i2 = fx1.u();
/* 159 */         int i3 = fx1.v();
/* 160 */         int i4 = fx1.w();
/*     */         
/* 162 */         if (☃.ez() && i > 1) {
/* 163 */           fx fx3 = ☃.ew();
/* 164 */           if (☃.cD() > fx3.u()) {
/* 165 */             i2 -= random.nextInt(i / 2);
/*     */           } else {
/* 167 */             i2 += random.nextInt(i / 2);
/*     */           } 
/* 169 */           if (☃.cH() > fx3.w()) {
/* 170 */             i4 -= random.nextInt(i / 2);
/*     */           } else {
/* 172 */             i4 += random.nextInt(i / 2);
/*     */           } 
/*     */         } 
/*     */         
/* 176 */         fx fx2 = new fx(i2 + ☃.cD(), i3 + ☃.cE(), i4 + ☃.cH());
/* 177 */         if (fx2.v() >= 0 && fx2.v() <= ☃.l.L())
/*     */         {
/*     */ 
/*     */           
/* 181 */           if (!bool4 || ☃.a(fx2))
/*     */           {
/*     */ 
/*     */             
/* 185 */             if (!bool3 || ayj.a(fx2)) {
/*     */ 
/*     */ 
/*     */               
/* 189 */               if (bool2) {
/* 190 */                 fx2 = a(fx2, random.nextInt(m + 1) + n, ☃.l.L(), fx1 -> ☃.l.d_(fx1).c().b());
/*     */               }
/*     */               
/* 193 */               if (bool1 || !☃.l.b(fx2).a(aef.b))
/*     */               
/*     */               { 
/*     */                 
/* 197 */                 cwz cwz = cxj.a(☃.l, fx2.i());
/* 198 */                 if (☃.a(cwz) == 0.0F)
/*     */                 
/*     */                 { 
/*     */                   
/* 202 */                   double d2 = toDoubleFunction.applyAsDouble(fx2);
/* 203 */                   if (d2 > d1)
/* 204 */                   { d1 = d2;
/* 205 */                     fx = fx2;
/* 206 */                     bool5 = true; }  }  } 
/*     */             }  }  } 
/*     */       } 
/* 209 */     }  if (bool5) {
/* 210 */       return dcn.c(fx);
/*     */     }
/* 212 */     return null;
/*     */   }
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
/*     */   @Nullable
/*     */   private static fx a(Random ☃, int i, int j, int k, @Nullable dcn dcn1, double d) {
/* 234 */     if (dcn1 == null || d >= Math.PI) {
/* 235 */       int n = ☃.nextInt(2 * i + 1) - i;
/* 236 */       int i1 = ☃.nextInt(2 * j + 1) - j + k;
/* 237 */       int i2 = ☃.nextInt(2 * i + 1) - i;
/* 238 */       return new fx(n, i1, i2);
/*     */     } 
/* 240 */     double d1 = afm.d(dcn1.d, dcn1.b) - 1.5707963705062866D;
/* 241 */     double d2 = d1 + (2.0F * ☃.nextFloat() - 1.0F) * d;
/* 242 */     double d3 = Math.sqrt(☃.nextDouble()) * afm.a * i;
/* 243 */     double d4 = -d3 * Math.sin(d2);
/* 244 */     double d5 = d3 * Math.cos(d2);
/*     */     
/* 246 */     if (Math.abs(d4) > i || Math.abs(d5) > i) {
/* 247 */       return null;
/*     */     }
/* 249 */     int m = ☃.nextInt(2 * j + 1) - j + k;
/* 250 */     return new fx(d4, m, d5);
/*     */   }
/*     */   
/*     */   static fx a(fx ☃, int i, int j, Predicate<fx> predicate) {
/* 254 */     if (i < 0) {
/* 255 */       throw new IllegalArgumentException("aboveSolidAmount was " + i + ", expected >= 0");
/*     */     }
/* 257 */     if (predicate.test(☃)) {
/*     */       
/* 259 */       fx fx1 = ☃.b();
/* 260 */       while (fx1.v() < j && predicate.test(fx1)) {
/* 261 */         fx1 = fx1.b();
/*     */       }
/*     */       
/* 264 */       fx fx2 = fx1;
/* 265 */       while (fx2.v() < j && fx2.v() - fx1.v() < i) {
/* 266 */         fx fx3 = fx2.b();
/* 267 */         if (predicate.test(fx3)) {
/*     */           break;
/*     */         }
/* 270 */         fx2 = fx3;
/*     */       } 
/* 272 */       return fx2;
/*     */     } 
/* 274 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */