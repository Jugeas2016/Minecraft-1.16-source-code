/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
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
/*     */ public class bew
/*     */ {
/*     */   protected static arf<?> a(bev ☃, arf<bev> arf1) {
/*  56 */     b(☃, arf1);
/*     */     
/*  58 */     c(☃, arf1);
/*  59 */     d(☃, arf1);
/*     */     
/*  61 */     arf1.a((Set<bhf>)ImmutableSet.of(bhf.a));
/*  62 */     arf1.b(bhf.b);
/*  63 */     arf1.e();
/*     */     
/*  65 */     return arf1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected static void a(bev ☃) {
/*  70 */     gf gf = gf.a(☃.l.Y(), ☃.cB());
/*  71 */     ☃.cJ().a(ayd.b, gf);
/*     */   }
/*     */   
/*     */   private static void b(bev ☃, arf<bev> arf1) {
/*  75 */     arf1.a(bhf.a, 0, ImmutableList.of(new asu(45, 90), new asy(), new asp(), new atz<>()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void c(bev ☃, arf<bev> arf1) {
/*  84 */     arf1.a(bhf.b, 10, ImmutableList.of(new atw<>(bew::a), 
/*     */           
/*  86 */           a(), 
/*  87 */           b(), new atn(aqe.bc, 4)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void d(bev ☃, arf<bev> arf1) {
/*  93 */     arf1.a(bhf.k, 10, ImmutableList.of(new aty<>(aqm1 -> !a(☃, aqm1)), new atq(1.0F), new asv(20)), ayd.o);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static ati<bev> a() {
/* 101 */     return new ati<>((List<Pair<arv<? super bev>, Integer>>)ImmutableList.of(
/* 102 */           Pair.of(new atl(aqe.bc, 8.0F), Integer.valueOf(1)), 
/* 103 */           Pair.of(new atl(aqe.ai, 8.0F), Integer.valueOf(1)), 
/* 104 */           Pair.of(new atl(aqe.aj, 8.0F), Integer.valueOf(1)), 
/* 105 */           Pair.of(new atl(8.0F), Integer.valueOf(1)), 
/* 106 */           Pair.of(new asc(30, 60), Integer.valueOf(1))));
/*     */   }
/*     */ 
/*     */   
/*     */   private static ati<bev> b() {
/* 111 */     return new ati<>((List<Pair<arv<? super bev>, Integer>>)ImmutableList.of(
/* 112 */           Pair.of(new atc(0.6F), Integer.valueOf(2)), 
/* 113 */           Pair.of(aso.a((aqe)aqe.ai, 8, ayd.q, 0.6F, 2), Integer.valueOf(2)), 
/* 114 */           Pair.of(aso.a((aqe)aqe.aj, 8, ayd.q, 0.6F, 2), Integer.valueOf(2)), 
/* 115 */           Pair.of(new aub(ayd.b, 0.6F, 2, 100), Integer.valueOf(2)), 
/* 116 */           Pair.of(new aua(ayd.b, 0.6F, 5), Integer.valueOf(2)), 
/* 117 */           Pair.of(new asc(30, 60), Integer.valueOf(1))));
/*     */   }
/*     */ 
/*     */   
/*     */   protected static void b(bev ☃) {
/* 122 */     arf<bev> arf = ☃.cJ();
/*     */ 
/*     */ 
/*     */     
/* 126 */     bhf bhf1 = arf.f().orElse(null);
/*     */ 
/*     */ 
/*     */     
/* 130 */     arf.a((List<bhf>)ImmutableList.of(bhf.k, bhf.b));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     bhf bhf2 = arf.f().orElse(null);
/* 136 */     if (bhf1 != bhf2)
/*     */     {
/* 138 */       d(☃);
/*     */     }
/*     */ 
/*     */     
/* 142 */     ☃.s(arf.a(ayd.o));
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean a(ber ☃, aqm aqm1) {
/* 147 */     return a(☃)
/* 148 */       .filter(aqm1 -> (aqm1 == ☃))
/* 149 */       .isPresent();
/*     */   }
/*     */   
/*     */   private static Optional<? extends aqm> a(ber ☃) {
/* 153 */     Optional<aqm> optional = arw.a(☃, ayd.L);
/* 154 */     if (optional.isPresent() && a(optional.get())) {
/* 155 */       return optional;
/*     */     }
/*     */     
/* 158 */     Optional<? extends aqm> optional1 = a(☃, (ayd)ayd.l);
/* 159 */     if (optional1.isPresent()) {
/* 160 */       return optional1;
/*     */     }
/*     */     
/* 163 */     return ☃.cJ().c((ayd)ayd.K);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean a(aqm ☃) {
/* 170 */     return aqd.f.test(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private static Optional<? extends aqm> a(ber ☃, ayd<? extends aqm> ayd1) {
/* 175 */     return ☃.cJ().<aqm>c(ayd1).filter(aqm1 -> aqm1.a(☃, 12.0D));
/*     */   }
/*     */ 
/*     */   
/*     */   protected static void a(bev ☃, aqm aqm1) {
/* 180 */     if (aqm1 instanceof ber) {
/*     */       return;
/*     */     }
/*     */     
/* 184 */     bet.a(☃, aqm1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void c(bev ☃) {
/* 193 */     if (☃.l.t.nextFloat() < 0.0125D) {
/* 194 */       d(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static void d(bev ☃) {
/* 200 */     ☃.cJ().f().ifPresent(bhf1 -> {
/*     */           if (bhf1 == bhf.k)
/*     */             ☃.eT(); 
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */