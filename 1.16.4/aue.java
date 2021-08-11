/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class aue
/*     */   extends arv<bfj>
/*     */ {
/*  26 */   private Set<blx> b = (Set<blx>)ImmutableSet.of();
/*     */   
/*     */   public aue() {
/*  29 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.q, aye.a, ayd.h, aye.a));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, bfj bfj1) {
/*  37 */     return arw.a(bfj1.cJ(), ayd.q, aqe.aP);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, bfj bfj1, long l) {
/*  42 */     return a(☃, bfj1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(aag ☃, bfj bfj1, long l) {
/*  47 */     bfj bfj2 = bfj1.cJ().<aqm>c(ayd.q).get();
/*  48 */     arw.a(bfj1, bfj2, 0.5F);
/*     */     
/*  50 */     this.b = a(bfj1, bfj2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, bfj bfj1, long l) {
/*  55 */     bfj bfj2 = bfj1.cJ().<aqm>c(ayd.q).get();
/*     */     
/*  57 */     if (bfj1.h(bfj2) > 5.0D) {
/*     */       return;
/*     */     }
/*     */     
/*  61 */     arw.a(bfj1, bfj2, 0.5F);
/*     */     
/*  63 */     bfj1.a(☃, bfj2, l);
/*     */     
/*  65 */     if (bfj1.fg() && (bfj1.eX().b() == bfm.f || bfj2.fh())) {
/*  66 */       a(bfj1, bfj.bp.keySet(), bfj2);
/*     */     }
/*     */     
/*  69 */     if (bfj2.eX().b() == bfm.f && bfj1.eU().a(bmd.kW) > bmd.kW.i() / 2) {
/*  70 */       a(bfj1, (Set<blx>)ImmutableSet.of(bmd.kW), bfj2);
/*     */     }
/*     */     
/*  73 */     if (!this.b.isEmpty() && bfj1.eU().a(this.b)) {
/*  74 */       a(bfj1, this.b, bfj2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(aag ☃, bfj bfj1, long l) {
/*  80 */     bfj1.cJ().b(ayd.q);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static Set<blx> a(bfj ☃, bfj bfj1) {
/*  86 */     ImmutableSet<blx> immutableSet1 = bfj1.eX().b().c();
/*  87 */     ImmutableSet<blx> immutableSet2 = ☃.eX().b().c();
/*  88 */     return (Set<blx>)immutableSet1.stream().filter(blx1 -> !☃.contains(blx1)).collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(bfj ☃, Set<blx> set, aqm aqm1) {
/*  95 */     apa apa = ☃.eU();
/*     */     
/*  97 */     bmb bmb = bmb.b;
/*  98 */     for (int i = 0; i < apa.Z_(); i++) {
/*  99 */       bmb bmb1 = apa.a(i);
/* 100 */       if (!bmb1.a()) {
/* 101 */         blx blx = bmb1.b();
/* 102 */         if (set.contains(blx)) {
/*     */           int j;
/* 104 */           if (bmb1.E() > bmb1.c() / 2) {
/* 105 */             j = bmb1.E() / 2;
/* 106 */           } else if (bmb1.E() > 24) {
/* 107 */             j = bmb1.E() - 24;
/*     */           } else {
/*     */             continue;
/*     */           } 
/* 111 */           bmb1.g(j);
/* 112 */           bmb = new bmb(blx, j);
/*     */           break;
/*     */         } 
/*     */       } 
/*     */       continue;
/*     */     } 
/* 118 */     if (!bmb.a())
/* 119 */       arw.a(☃, bmb, aqm1.cA()); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */