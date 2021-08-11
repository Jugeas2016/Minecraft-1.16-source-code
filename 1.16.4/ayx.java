/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
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
/*     */ public class ayx
/*     */   extends azb<aqm>
/*     */ {
/*     */   public Set<ayd<?>> a() {
/*  36 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.h, ayd.g, ayd.K, ayd.W, ayd.ae, ayd.U, (Object[])new ayd[] { ayd.V, ayd.Y, ayd.X, ayd.ac, ayd.ad, ayd.ag });
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
/*     */   protected void a(aag ☃, aqm aqm1) {
/*  57 */     arf<?> arf = aqm1.cJ();
/*     */     
/*  59 */     arf.a(ayd.ag, c(☃, aqm1));
/*     */     
/*  61 */     Optional<aqn> optional = Optional.empty();
/*  62 */     Optional<bem> optional1 = Optional.empty();
/*  63 */     Optional<bem> optional2 = Optional.empty();
/*  64 */     Optional<bes> optional3 = Optional.empty();
/*  65 */     Optional<aqm> optional4 = Optional.empty();
/*  66 */     Optional<bfw> optional5 = Optional.empty();
/*  67 */     Optional<bfw> optional6 = Optional.empty();
/*  68 */     int i = 0;
/*     */     
/*  70 */     List<ber> list1 = Lists.newArrayList();
/*  71 */     List<ber> list2 = Lists.newArrayList();
/*     */ 
/*     */     
/*  74 */     List<aqm> list3 = (List<aqm>)arf.c(ayd.h).orElse(ImmutableList.of());
/*  75 */     for (aqm aqm2 : list3) {
/*     */       
/*  77 */       if (aqm2 instanceof bem) {
/*  78 */         bem bem = (bem)aqm2;
/*  79 */         if (bem.w_() && !optional2.isPresent()) {
/*  80 */           optional2 = Optional.of(bem); continue;
/*  81 */         }  if (bem.eL()) {
/*  82 */           i++;
/*  83 */           if (!optional1.isPresent() && bem.eO())
/*  84 */             optional1 = Optional.of(bem); 
/*     */         } 
/*     */         continue;
/*     */       } 
/*  88 */       if (aqm2 instanceof bev) {
/*  89 */         list1.add((bev)aqm2); continue;
/*     */       } 
/*  91 */       if (aqm2 instanceof bes) {
/*  92 */         bes bes = (bes)aqm2;
/*  93 */         if (bes.w_() && !optional3.isPresent()) {
/*  94 */           optional3 = Optional.of(bes); continue;
/*  95 */         }  if (bes.eM())
/*  96 */           list1.add(bes); 
/*     */         continue;
/*     */       } 
/*  99 */       if (aqm2 instanceof bfw) {
/* 100 */         bfw bfw = (bfw)aqm2;
/* 101 */         if (!optional5.isPresent() && aqd.f.test(aqm2) && !bet.a(bfw)) {
/* 102 */           optional5 = Optional.of(bfw);
/*     */         }
/* 104 */         if (!optional6.isPresent() && !bfw.a_() && bet.b(bfw))
/* 105 */           optional6 = Optional.of(bfw); 
/*     */         continue;
/*     */       } 
/* 108 */       if (!optional.isPresent() && (aqm2 instanceof beh || aqm2 instanceof bcl)) {
/* 109 */         optional = Optional.of((aqn)aqm2); continue;
/*     */       } 
/* 111 */       if (!optional4.isPresent() && bet.a(aqm2.X())) {
/* 112 */         optional4 = Optional.of(aqm2);
/*     */       }
/*     */     } 
/*     */     
/* 116 */     List<aqm> list4 = (List<aqm>)arf.c(ayd.g).orElse(ImmutableList.of());
/* 117 */     for (aqm aqm2 : list4) {
/* 118 */       if (aqm2 instanceof ber && ((ber)aqm2).eM()) {
/* 119 */         list2.add((ber)aqm2);
/*     */       }
/*     */     } 
/*     */     
/* 123 */     arf.a(ayd.K, optional);
/* 124 */     arf.a(ayd.U, optional1);
/* 125 */     arf.a(ayd.V, optional2);
/* 126 */     arf.a(ayd.ab, optional4);
/* 127 */     arf.a(ayd.W, optional5);
/* 128 */     arf.a(ayd.ae, optional6);
/* 129 */     arf.a(ayd.X, list2);
/* 130 */     arf.a(ayd.Y, list1);
/* 131 */     arf.a(ayd.ac, Integer.valueOf(list1.size()));
/* 132 */     arf.a(ayd.ad, Integer.valueOf(i));
/*     */   }
/*     */   
/*     */   private static Optional<fx> c(aag ☃, aqm aqm1) {
/* 136 */     return fx.a(aqm1
/* 137 */         .cB(), 8, 4, fx1 -> a(☃, fx1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean a(aag ☃, fx fx1) {
/* 145 */     ceh ceh = ☃.d_(fx1);
/* 146 */     boolean bool = ceh.a(aed.P);
/* 147 */     if (bool && ceh.a(bup.mf)) {
/* 148 */       return buy.g(ceh);
/*     */     }
/* 150 */     return bool;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */