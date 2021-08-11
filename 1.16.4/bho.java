/*     */ import java.util.function.Function;
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
/*     */ public class bho
/*     */ {
/*     */   public static int[][] a(gc ☃) {
/*  25 */     gc gc1 = ☃.g();
/*  26 */     gc gc2 = gc1.f();
/*  27 */     gc gc3 = ☃.f();
/*     */     
/*  29 */     return new int[][] { { gc1
/*  30 */           .i(), gc1.k() }, { gc2
/*  31 */           .i(), gc2.k() }, { gc3
/*  32 */           .i() + gc1.i(), gc3.k() + gc1.k() }, { gc3
/*  33 */           .i() + gc2.i(), gc3.k() + gc2.k() }, { ☃
/*  34 */           .i() + gc1.i(), ☃.k() + gc1.k() }, { ☃
/*  35 */           .i() + gc2.i(), ☃.k() + gc2.k() }, { gc3
/*  36 */           .i(), gc3.k() }, { ☃
/*  37 */           .i(), ☃.k() } };
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(double ☃) {
/*  42 */     return (!Double.isInfinite(☃) && ☃ < 1.0D);
/*     */   }
/*     */   
/*     */   public static boolean a(brg ☃, aqm aqm1, dci dci1) {
/*  46 */     return ☃.b(aqm1, dci1).allMatch(ddh::b);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcn a(brg ☃, double d1, double d2, double d3, aqm aqm1, aqx aqx1) {
/*  51 */     if (a(d2)) {
/*  52 */       dcn dcn = new dcn(d1, d2, d3);
/*  53 */       if (a(☃, aqm1, aqm1.f(aqx1).c(dcn))) {
/*  54 */         return dcn;
/*     */       }
/*     */     } 
/*  57 */     return null;
/*     */   }
/*     */   
/*     */   public static ddh a(brc ☃, fx fx1) {
/*  61 */     ceh ceh = ☃.d_(fx1);
/*  62 */     if (ceh.a(aed.at) || (ceh.b() instanceof cbb && ((Boolean)ceh.c(cbb.a)).booleanValue())) {
/*  63 */       return dde.a();
/*     */     }
/*  65 */     return ceh.k(☃, fx1);
/*     */   }
/*     */   
/*     */   public static double a(fx ☃, int i, Function<fx, ddh> function) {
/*  69 */     fx.a a = ☃.i();
/*  70 */     int j = 0;
/*  71 */     while (j < i) {
/*  72 */       ddh ddh = function.apply(a);
/*  73 */       if (!ddh.b()) {
/*  74 */         return (☃.v() + j) + ddh.b(gc.a.b);
/*     */       }
/*  76 */       j++;
/*  77 */       a.c(gc.b);
/*     */     } 
/*  79 */     return Double.POSITIVE_INFINITY;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcn a(aqe<?> ☃, brg brg1, fx fx1, boolean bool) {
/*  84 */     if (bool && ☃.a(brg1.d_(fx1))) {
/*  85 */       return null;
/*     */     }
/*     */     
/*  88 */     double d = brg1.a(a(brg1, fx1), () -> a(☃, fx1.c()));
/*  89 */     if (!a(d)) {
/*  90 */       return null;
/*     */     }
/*     */     
/*  93 */     if (bool && d <= 0.0D && ☃.a(brg1.d_(fx1.c()))) {
/*  94 */       return null;
/*     */     }
/*     */     
/*  97 */     dcn dcn = dcn.a(fx1, d);
/*  98 */     if (brg1.b((aqa)null, ☃.l().a(dcn)).allMatch(ddh::b)) {
/*  99 */       return dcn;
/*     */     }
/* 101 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */