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
/*     */ 
/*     */ public class aum
/*     */   extends arv<bfj>
/*     */ {
/*     */   private long b;
/*     */   
/*     */   public aum() {
/*  31 */     super(
/*  32 */         (Map<ayd<?>, aye>)ImmutableMap.of(ayd.r, aye.a, ayd.h, aye.a), 350, 350);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, bfj bfj1) {
/*  43 */     return a(bfj1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, bfj bfj1, long l) {
/*  48 */     return (l <= this.b && a(bfj1));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(aag ☃, bfj bfj1, long l) {
/*  53 */     apy apy = bfj1.cJ().<apy>c(ayd.r).get();
/*     */     
/*  55 */     arw.a(bfj1, apy, 0.5F);
/*     */     
/*  57 */     ☃.a(apy, (byte)18);
/*  58 */     ☃.a(bfj1, (byte)18);
/*     */     
/*  60 */     int i = 275 + bfj1.cY().nextInt(50);
/*  61 */     this.b = l + i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, bfj bfj1, long l) {
/*  66 */     bfj bfj2 = bfj1.cJ().<apy>c(ayd.r).get();
/*     */     
/*  68 */     if (bfj1.h(bfj2) > 5.0D) {
/*     */       return;
/*     */     }
/*     */     
/*  72 */     arw.a(bfj1, bfj2, 0.5F);
/*     */     
/*  74 */     if (l >= this.b) {
/*     */       
/*  76 */       bfj1.ff();
/*  77 */       bfj2.ff();
/*     */       
/*  79 */       a(☃, bfj1, bfj2);
/*  80 */     } else if (bfj1.cY().nextInt(35) == 0) {
/*  81 */       ☃.a(bfj2, (byte)12);
/*  82 */       ☃.a(bfj1, (byte)12);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(aag ☃, bfj bfj1, bfj bfj2) {
/*  88 */     Optional<fx> optional = b(☃, bfj1);
/*  89 */     if (!optional.isPresent()) {
/*     */       
/*  91 */       ☃.a(bfj2, (byte)13);
/*  92 */       ☃.a(bfj1, (byte)13);
/*     */     } else {
/*  94 */       Optional<bfj> optional1 = b(☃, bfj1, bfj2);
/*     */       
/*  96 */       if (optional1.isPresent()) {
/*  97 */         a(☃, optional1.get(), optional.get());
/*     */       } else {
/*  99 */         ☃.y().b(optional.get());
/* 100 */         rz.c(☃, optional.get());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(aag ☃, bfj bfj1, long l) {
/* 107 */     bfj1.cJ().b(ayd.r);
/*     */   }
/*     */   
/*     */   private boolean a(bfj ☃) {
/* 111 */     arf<bfj> arf = ☃.cJ();
/*     */     
/* 113 */     Optional<apy> optional = arf.<apy>c(ayd.r).filter(☃ -> (☃.X() == aqe.aP));
/* 114 */     if (!optional.isPresent()) {
/* 115 */       return false;
/*     */     }
/* 117 */     return (arw.a(arf, (ayd)ayd.r, aqe.aP) && ☃
/* 118 */       .f() && ((apy)optional
/* 119 */       .get()).f());
/*     */   }
/*     */   
/*     */   private Optional<fx> b(aag ☃, bfj bfj1) {
/* 123 */     return ☃.y().a(azr.r
/* 124 */         .c(), fx1 -> a(☃, fx1), bfj1
/*     */         
/* 126 */         .cB(), 48);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean a(bfj ☃, fx fx1) {
/* 132 */     cxd cxd = ☃.x().a(fx1, azr.r.d());
/* 133 */     return (cxd != null && cxd.j());
/*     */   }
/*     */   
/*     */   private Optional<bfj> b(aag ☃, bfj bfj1, bfj bfj2) {
/* 137 */     bfj bfj3 = bfj1.b(☃, bfj2);
/* 138 */     if (bfj3 == null) {
/* 139 */       return Optional.empty();
/*     */     }
/* 141 */     bfj1.c_(6000);
/* 142 */     bfj2.c_(6000);
/* 143 */     bfj3.c_(-24000);
/* 144 */     bfj3.b(bfj1.cD(), bfj1.cE(), bfj1.cH(), 0.0F, 0.0F);
/*     */     
/* 146 */     ☃.l(bfj3);
/* 147 */     ☃.a(bfj3, (byte)12);
/*     */     
/* 149 */     return Optional.of(bfj3);
/*     */   }
/*     */   
/*     */   private void a(aag ☃, bfj bfj1, fx fx1) {
/* 153 */     gf gf = gf.a(☃.Y(), fx1);
/* 154 */     bfj1.cJ().a(ayd.b, gf);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */