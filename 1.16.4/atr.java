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
/*     */ public class atr
/*     */   extends arv<bfj>
/*     */ {
/*     */   private final ayd<gf> b;
/*     */   private final float c;
/*     */   private final int d;
/*     */   private final int e;
/*     */   private final int f;
/*     */   
/*     */   public atr(ayd<gf> ☃, float f, int i, int j, int k) {
/*  34 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.D, aye.c, ayd.m, aye.b, ☃, aye.a));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  39 */     this.b = ☃;
/*  40 */     this.c = f;
/*  41 */     this.d = i;
/*  42 */     this.e = j;
/*  43 */     this.f = k;
/*     */   }
/*     */   
/*     */   private void a(bfj ☃, long l) {
/*  47 */     arf<?> arf = ☃.cJ();
/*     */     
/*  49 */     ☃.a(this.b);
/*  50 */     arf.b(this.b);
/*  51 */     arf.a(ayd.D, Long.valueOf(l));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, bfj bfj1, long l) {
/*  56 */     arf<?> arf = bfj1.cJ();
/*  57 */     arf.<gf>c(this.b).ifPresent(gf1 -> {
/*     */           if (a(☃, gf1) || a(☃, bfj1)) {
/*     */             a(bfj1, l);
/*     */           } else if (a(bfj1, gf1)) {
/*     */             dcn dcn = null;
/*     */             int i = 0;
/*     */             int j = 1000;
/*     */             while (i < 1000 && (dcn == null || a(bfj1, gf.a(☃.Y(), new fx(dcn))))) {
/*     */               dcn = azj.b(bfj1, 15, 7, dcn.c(gf1.b()));
/*     */               i++;
/*     */             } 
/*     */             if (i == 1000) {
/*     */               a(bfj1, l);
/*     */               return;
/*     */             } 
/*     */             arf1.a(ayd.m, new ayf(dcn, this.c, this.d));
/*     */           } else if (!a(☃, bfj1, gf1)) {
/*     */             arf1.a(ayd.m, new ayf(gf1.b(), this.c, this.d));
/*     */           } 
/*     */         });
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
/*     */   private boolean a(aag ☃, bfj bfj1) {
/*  88 */     Optional<Long> optional = bfj1.cJ().c(ayd.D);
/*  89 */     if (optional.isPresent()) {
/*  90 */       return (☃.T() - ((Long)optional.get()).longValue() > this.f);
/*     */     }
/*  92 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(bfj ☃, gf gf1) {
/*  96 */     return (gf1.b().k(☃.cB()) > this.e);
/*     */   }
/*     */   
/*     */   private boolean a(aag ☃, gf gf1) {
/* 100 */     return (gf1.a() != ☃.Y());
/*     */   }
/*     */   
/*     */   private boolean a(aag ☃, bfj bfj1, gf gf1) {
/* 104 */     return (gf1.a() == ☃.Y() && gf1
/* 105 */       .b().k(bfj1.cB()) <= this.d);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */