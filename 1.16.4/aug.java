/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
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
/*     */ public class aug
/*     */   extends arv<bfj>
/*     */ {
/*     */   private long b;
/*     */   private long c;
/*     */   private int d;
/*  30 */   private Optional<fx> e = Optional.empty();
/*     */   
/*     */   public aug() {
/*  33 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.n, aye.b, ayd.m, aye.b));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, bfj bfj1) {
/*  41 */     if (bfj1.K % 10 != 0 || (this.c != 0L && this.c + 160L > bfj1.K)) {
/*  42 */       return false;
/*     */     }
/*     */     
/*  45 */     if (bfj1.eU().a(bmd.mK) <= 0) {
/*  46 */       return false;
/*     */     }
/*  48 */     this.e = b(☃, bfj1);
/*  49 */     return this.e.isPresent();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, bfj bfj1, long l) {
/*  54 */     return (this.d < 80 && this.e.isPresent());
/*     */   }
/*     */   
/*     */   private Optional<fx> b(aag ☃, bfj bfj1) {
/*  58 */     fx.a a = new fx.a();
/*  59 */     Optional<fx> optional = Optional.empty();
/*  60 */     int i = 0;
/*  61 */     for (int j = -1; j <= 1; j++) {
/*  62 */       for (int k = -1; k <= 1; k++) {
/*  63 */         for (int m = -1; m <= 1; m++) {
/*  64 */           a.a(bfj1.cB(), j, k, m);
/*  65 */           if (a(a, ☃) && 
/*  66 */             ☃.t.nextInt(++i) == 0) {
/*  67 */             optional = Optional.of(a.h());
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  74 */     return optional;
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃, aag aag1) {
/*  78 */     ceh ceh = aag1.d_(☃);
/*  79 */     buo buo = ceh.b();
/*  80 */     return (buo instanceof bvs && !((bvs)buo).h(ceh));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(aag ☃, bfj bfj1, long l) {
/*  85 */     a(bfj1);
/*     */     
/*  87 */     bfj1.a(aqf.a, new bmb(bmd.mK));
/*     */     
/*  89 */     this.b = l;
/*  90 */     this.d = 0;
/*     */   }
/*     */   
/*     */   private void a(bfj ☃) {
/*  94 */     this.e.ifPresent(fx1 -> {
/*     */           arx arx = new arx(fx1);
/*     */           ☃.cJ().a(ayd.n, arx);
/*     */           ☃.cJ().a(ayd.m, new ayf(arx, 0.5F, 1));
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, bfj bfj1, long l) {
/* 103 */     bfj1.a(aqf.a, bmb.b);
/* 104 */     this.c = bfj1.K;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(aag ☃, bfj bfj1, long l) {
/* 109 */     fx fx = this.e.get();
/* 110 */     if (l < this.b || !fx.a(bfj1.cA(), 1.0D)) {
/*     */       return;
/*     */     }
/*     */     
/* 114 */     bmb bmb = bmb.b;
/* 115 */     apa apa = bfj1.eU();
/* 116 */     int i = apa.Z_();
/* 117 */     for (int j = 0; j < i; j++) {
/* 118 */       bmb bmb1 = apa.a(j);
/* 119 */       if (bmb1.b() == bmd.mK) {
/* 120 */         bmb = bmb1;
/*     */         break;
/*     */       } 
/*     */     } 
/* 124 */     if (!bmb.a() && bkj.a(bmb, ☃, fx)) {
/* 125 */       ☃.c(2005, fx, 0);
/*     */       
/* 127 */       this.e = b(☃, bfj1);
/* 128 */       a(bfj1);
/* 129 */       this.b = l + 40L;
/*     */     } 
/*     */     
/* 132 */     this.d++;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */