/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
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
/*     */ public interface bro
/*     */ {
/*     */   default <T extends aqa> List<T> b(Class<? extends T> ☃, dci dci1, @Nullable Predicate<? super T> predicate) {
/*  26 */     return a(☃, dci1, predicate);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default List<aqa> a(@Nullable aqa ☃, dci dci1) {
/*  32 */     return a(☃, dci1, aqd.g);
/*     */   }
/*     */   
/*     */   default boolean a(@Nullable aqa ☃, ddh ddh1) {
/*  36 */     if (ddh1.b()) {
/*  37 */       return true;
/*     */     }
/*     */     
/*  40 */     for (aqa aqa1 : a(☃, ddh1.a())) {
/*  41 */       if (!aqa1.y && aqa1.i && (☃ == null || !aqa1.x(☃)) && 
/*  42 */         dde.c(ddh1, dde.a(aqa1.cc()), dcr.i)) {
/*  43 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  47 */     return true;
/*     */   }
/*     */   
/*     */   default <T extends aqa> List<T> a(Class<? extends T> ☃, dci dci1) {
/*  51 */     return a(☃, dci1, (Predicate)aqd.g);
/*     */   }
/*     */   
/*     */   default <T extends aqa> List<T> b(Class<? extends T> ☃, dci dci1) {
/*  55 */     return b(☃, dci1, (Predicate)aqd.g);
/*     */   }
/*     */ 
/*     */   
/*     */   default Stream<ddh> c(@Nullable aqa ☃, dci dci1, Predicate<aqa> predicate) {
/*  60 */     if (dci1.a() < 1.0E-7D) {
/*  61 */       return Stream.empty();
/*     */     }
/*     */     
/*  64 */     dci dci2 = dci1.g(1.0E-7D);
/*     */     
/*  66 */     return a(☃, dci2, predicate.and(aqa2 -> (aqa2.cc().c(☃) && ((aqa1 == null) ? aqa2.aZ() : aqa1.j(aqa2)))))
/*  67 */       .stream()
/*  68 */       .map(aqa::cc)
/*  69 */       .map(dde::a);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   default bfw a(double ☃, double d1, double d2, double d3, @Nullable Predicate<aqa> predicate) {
/*  75 */     double d = -1.0D;
/*  76 */     bfw bfw = null;
/*     */     
/*  78 */     for (bfw bfw1 : x()) {
/*  79 */       if (predicate != null && !predicate.test(bfw1)) {
/*     */         continue;
/*     */       }
/*     */       
/*  83 */       double d4 = bfw1.h(☃, d1, d2);
/*  84 */       if ((d3 < 0.0D || d4 < d3 * d3) && (d == -1.0D || d4 < d)) {
/*  85 */         d = d4;
/*  86 */         bfw = bfw1;
/*     */       } 
/*     */     } 
/*  89 */     return bfw;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default bfw a(aqa ☃, double d) {
/*  94 */     return a(☃.cD(), ☃.cE(), ☃.cH(), d, false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default bfw a(double ☃, double d1, double d2, double d3, boolean bool) {
/*  99 */     Predicate<aqa> predicate = bool ? aqd.e : aqd.g;
/* 100 */     return a(☃, d1, d2, d3, predicate);
/*     */   }
/*     */   
/*     */   default boolean a(double ☃, double d1, double d2, double d3) {
/* 104 */     for (bfw bfw : x()) {
/* 105 */       if (!aqd.g.test(bfw) || !aqd.b.test(bfw)) {
/*     */         continue;
/*     */       }
/* 108 */       double d = bfw.h(☃, d1, d2);
/* 109 */       if (d3 < 0.0D || d < d3 * d3) {
/* 110 */         return true;
/*     */       }
/*     */     } 
/* 113 */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default bfw a(azg ☃, aqm aqm1) {
/* 118 */     return a(x(), ☃, aqm1, aqm1.cD(), aqm1.cE(), aqm1.cH());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default bfw a(azg ☃, aqm aqm1, double d1, double d2, double d3) {
/* 123 */     return a(x(), ☃, aqm1, d1, d2, d3);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default bfw a(azg ☃, double d1, double d2, double d3) {
/* 128 */     return a(x(), ☃, null, d1, d2, d3);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default <T extends aqm> T a(Class<? extends T> ☃, azg azg1, @Nullable aqm aqm1, double d1, double d2, double d3, dci dci1) {
/* 133 */     return a(a(☃, dci1, (Predicate<? super T>)null), azg1, aqm1, d1, d2, d3);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default <T extends aqm> T b(Class<? extends T> ☃, azg azg1, @Nullable aqm aqm1, double d1, double d2, double d3, dci dci1) {
/* 138 */     return a(b(☃, dci1, null), azg1, aqm1, d1, d2, d3);
/*     */   }
/*     */   @Nullable
/*     */   default <T extends aqm> T a(List<? extends T> ☃, azg azg1, @Nullable aqm aqm1, double d1, double d2, double d3) {
/*     */     aqm aqm2;
/* 143 */     double d = -1.0D;
/* 144 */     T t = null;
/* 145 */     for (aqm aqm3 : ☃) {
/* 146 */       if (!azg1.a(aqm1, aqm3)) {
/*     */         continue;
/*     */       }
/*     */       
/* 150 */       double d4 = aqm3.h(d1, d2, d3);
/* 151 */       if (d == -1.0D || d4 < d) {
/* 152 */         d = d4;
/* 153 */         aqm2 = aqm3;
/*     */       } 
/*     */     } 
/*     */     
/* 157 */     return (T)aqm2;
/*     */   }
/*     */   
/*     */   default List<bfw> a(azg ☃, aqm aqm1, dci dci1) {
/* 161 */     List<bfw> list = Lists.newArrayList();
/* 162 */     for (bfw bfw : x()) {
/* 163 */       if (dci1.e(bfw.cD(), bfw.cE(), bfw.cH()) && ☃.a(aqm1, bfw)) {
/* 164 */         list.add(bfw);
/*     */       }
/*     */     } 
/*     */     
/* 168 */     return list;
/*     */   }
/*     */   
/*     */   default <T extends aqm> List<T> a(Class<? extends T> ☃, azg azg1, aqm aqm1, dci dci1) {
/* 172 */     List<T> list1 = (List)a((Class)☃, dci1, (Predicate<? super aqa>)null);
/* 173 */     List<T> list2 = Lists.newArrayList();
/*     */     
/* 175 */     for (aqm aqm2 : list1) {
/* 176 */       if (azg1.a(aqm1, aqm2)) {
/* 177 */         list2.add((T)aqm2);
/*     */       }
/*     */     } 
/*     */     
/* 181 */     return list2;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default bfw b(UUID ☃) {
/* 186 */     for (int i = 0; i < x().size(); i++) {
/* 187 */       bfw bfw = x().get(i);
/* 188 */       if (☃.equals(bfw.bS())) {
/* 189 */         return bfw;
/*     */       }
/*     */     } 
/* 192 */     return null;
/*     */   }
/*     */   
/*     */   List<aqa> a(@Nullable aqa paramaqa, dci paramdci, @Nullable Predicate<? super aqa> paramPredicate);
/*     */   
/*     */   <T extends aqa> List<T> a(Class<? extends T> paramClass, dci paramdci, @Nullable Predicate<? super T> paramPredicate);
/*     */   
/*     */   List<? extends bfw> x();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bro.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */