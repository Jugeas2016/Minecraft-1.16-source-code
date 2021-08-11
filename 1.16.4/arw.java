/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
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
/*     */ public class arw
/*     */ {
/*     */   public static void a(aqm ☃, aqm aqm1, float f) {
/*  31 */     d(☃, aqm1);
/*  32 */     b(☃, aqm1, f);
/*     */   }
/*     */   
/*     */   public static boolean a(arf<?> ☃, aqm aqm1) {
/*  36 */     return ☃.<List<aqm>>c(ayd.h)
/*  37 */       .filter(list -> list.contains(☃))
/*  38 */       .isPresent();
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(arf<?> ☃, ayd<? extends aqm> ayd1, aqe<?> aqe1) {
/*  43 */     return a(☃, ayd1, aqm1 -> (aqm1.X() == ☃));
/*     */   }
/*     */   
/*     */   private static boolean a(arf<?> ☃, ayd<? extends aqm> ayd1, Predicate<aqm> predicate) {
/*  47 */     return ☃.<aqm>c((ayd)ayd1)
/*  48 */       .filter(predicate)
/*  49 */       .filter(aqm::aX)
/*  50 */       .filter(aqm1 -> a(☃, aqm1))
/*  51 */       .isPresent();
/*     */   }
/*     */   
/*     */   private static void d(aqm ☃, aqm aqm1) {
/*  55 */     a(☃, aqm1);
/*  56 */     a(aqm1, ☃);
/*     */   }
/*     */   
/*     */   public static void a(aqm ☃, aqm aqm1) {
/*  60 */     ☃.cJ().a(ayd.n, new asd(aqm1, true));
/*     */   }
/*     */   
/*     */   private static void b(aqm ☃, aqm aqm1, float f) {
/*  64 */     int i = 2;
/*  65 */     a(☃, aqm1, f, 2);
/*  66 */     a(aqm1, ☃, f, 2);
/*     */   }
/*     */   
/*     */   public static void a(aqm ☃, aqa aqa1, float f, int i) {
/*  70 */     ayf ayf = new ayf(new asd(aqa1, false), f, i);
/*  71 */     ☃.cJ().a(ayd.n, new asd(aqa1, true));
/*  72 */     ☃.cJ().a(ayd.m, ayf);
/*     */   }
/*     */   
/*     */   public static void a(aqm ☃, fx fx1, float f, int i) {
/*  76 */     ayf ayf = new ayf(new arx(fx1), f, i);
/*  77 */     ☃.cJ().a(ayd.n, new arx(fx1));
/*  78 */     ☃.cJ().a(ayd.m, ayf);
/*     */   }
/*     */   
/*     */   public static void a(aqm ☃, bmb bmb1, dcn dcn1) {
/*  82 */     double d = ☃.cG() - 0.30000001192092896D;
/*  83 */     bcv bcv = new bcv(☃.l, ☃.cD(), d, ☃.cH(), bmb1);
/*     */     
/*  85 */     float f = 0.3F;
/*  86 */     dcn dcn2 = dcn1.d(☃.cA());
/*  87 */     dcn2 = dcn2.d().a(0.30000001192092896D);
/*     */     
/*  89 */     bcv.f(dcn2);
/*  90 */     bcv.m();
/*  91 */     ☃.l.c(bcv);
/*     */   }
/*     */   
/*     */   public static gp a(aag ☃, gp gp1, int i) {
/*  95 */     int j = ☃.b(gp1);
/*     */     
/*  97 */     return gp.a(gp1, i)
/*  98 */       .filter(gp1 -> (☃.b(gp1) < i))
/*  99 */       .min(Comparator.comparingInt(☃::b))
/* 100 */       .orElse(gp1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(aqn ☃, aqm aqm1, int i) {
/* 107 */     blx blx = ☃.dD().b();
/* 108 */     if (blx instanceof bmo && ☃.a((bmo)blx)) {
/* 109 */       int j = ((bmo)blx).d() - i;
/* 110 */       return ☃.a(aqm1, j);
/*     */     } 
/* 112 */     return b(☃, aqm1);
/*     */   }
/*     */   
/*     */   public static boolean b(aqm ☃, aqm aqm1) {
/* 116 */     double d1 = ☃.h(aqm1.cD(), aqm1.cE(), aqm1.cH());
/* 117 */     double d2 = (☃.cy() * 2.0F * ☃.cy() * 2.0F + aqm1.cy());
/* 118 */     return (d1 <= d2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(aqm ☃, aqm aqm1, double d) {
/* 126 */     Optional<aqm> optional = ☃.cJ().c(ayd.o);
/* 127 */     if (!optional.isPresent()) {
/* 128 */       return false;
/*     */     }
/* 130 */     double d1 = ☃.e(((aqm)optional.get()).cA());
/* 131 */     double d2 = ☃.e(aqm1.cA());
/* 132 */     return (d2 > d1 + d * d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean c(aqm ☃, aqm aqm1) {
/* 139 */     arf<?> arf = ☃.cJ();
/* 140 */     if (!arf.a(ayd.h)) {
/* 141 */       return false;
/*     */     }
/* 143 */     return ((List)arf.<List>c((ayd)ayd.h).get()).contains(aqm1);
/*     */   }
/*     */   
/*     */   public static aqm a(aqm ☃, Optional<aqm> optional, aqm aqm1) {
/* 147 */     if (!optional.isPresent()) {
/* 148 */       return aqm1;
/*     */     }
/* 150 */     return a(☃, optional.get(), aqm1);
/*     */   }
/*     */   
/*     */   public static aqm a(aqm ☃, aqm aqm1, aqm aqm2) {
/* 154 */     dcn dcn1 = aqm1.cA();
/* 155 */     dcn dcn2 = aqm2.cA();
/* 156 */     return (☃.e(dcn1) < ☃.e(dcn2)) ? aqm1 : aqm2;
/*     */   }
/*     */   
/*     */   public static Optional<aqm> a(aqm ☃, ayd<UUID> ayd1) {
/* 160 */     Optional<UUID> optional = ☃.cJ().c(ayd1);
/*     */     
/* 162 */     return optional.map(uUID -> (aqm)((aag)☃.l).a(uUID));
/*     */   }
/*     */   
/*     */   public static Stream<bfj> a(bfj ☃, Predicate<bfj> predicate) {
/* 166 */     return ☃.cJ().<List<aqm>>c(ayd.g).map(list -> list.stream().filter(()).map(()).filter(aqm::aX).filter(predicate))
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 171 */       .orElseGet(Stream::empty);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */