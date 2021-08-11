/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.List;
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
/*     */ public class auq
/*     */   extends aur
/*     */ {
/*  22 */   private static final List<blx> b = (List<blx>)ImmutableList.of(bmd.kV, bmd.qg);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, bfj bfj1) {
/*  29 */     Optional<gf> optional = bfj1.cJ().c(ayd.c);
/*  30 */     if (!optional.isPresent()) {
/*     */       return;
/*     */     }
/*  33 */     gf gf = optional.get();
/*  34 */     ceh ceh = ☃.d_(gf.b());
/*     */     
/*  36 */     if (ceh.a(bup.na)) {
/*  37 */       a(bfj1);
/*     */       
/*  39 */       a(☃, bfj1, gf, ceh);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(aag ☃, bfj bfj1, gf gf1, ceh ceh1) {
/*  45 */     fx fx = gf1.b();
/*  46 */     if (((Integer)ceh1.c(bvk.a)).intValue() == 8) {
/*  47 */       ceh1 = bvk.d(ceh1, ☃, fx);
/*     */     }
/*     */ 
/*     */     
/*  51 */     int i = 20;
/*  52 */     int j = 10;
/*     */     
/*  54 */     int[] arrayOfInt = new int[b.size()];
/*     */     
/*  56 */     apa apa = bfj1.eU();
/*  57 */     int k = apa.Z_();
/*     */     
/*  59 */     ceh ceh2 = ceh1;
/*     */     
/*  61 */     for (int m = k - 1; m >= 0 && i > 0; m--) {
/*  62 */       bmb bmb = apa.a(m);
/*  63 */       int n = b.indexOf(bmb.b());
/*  64 */       if (n != -1) {
/*     */ 
/*     */ 
/*     */         
/*  68 */         int i1 = bmb.E();
/*  69 */         int i2 = arrayOfInt[n] + i1;
/*  70 */         arrayOfInt[n] = i2;
/*     */         
/*  72 */         int i3 = Math.min(Math.min(i2 - 10, i), i1);
/*  73 */         if (i3 > 0) {
/*  74 */           i -= i3;
/*  75 */           for (int i4 = 0; i4 < i3; i4++) {
/*  76 */             ceh2 = bvk.a(ceh2, ☃, bmb, fx);
/*  77 */             if (((Integer)ceh2.c(bvk.a)).intValue() == 7) {
/*  78 */               a(☃, ceh1, fx, ceh2);
/*     */               return;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  85 */     a(☃, ceh1, fx, ceh2);
/*     */   }
/*     */   
/*     */   private void a(aag ☃, ceh ceh1, fx fx1, ceh ceh2) {
/*  89 */     ☃.c(1500, fx1, (ceh2 != ceh1) ? 1 : 0);
/*     */   }
/*     */   
/*     */   private void a(bfj ☃) {
/*  93 */     apa apa = ☃.eU();
/*  94 */     if (apa.a(bmd.kX) > 36) {
/*     */       return;
/*     */     }
/*     */     
/*  98 */     int i = apa.a(bmd.kW);
/*  99 */     int j = 3;
/* 100 */     int k = 3;
/* 101 */     int m = Math.min(3, i / 3);
/* 102 */     if (m == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 106 */     int n = m * 3;
/* 107 */     apa.a(bmd.kW, n);
/* 108 */     bmb bmb = apa.a(new bmb(bmd.kX, m));
/* 109 */     if (!bmb.a())
/* 110 */       ☃.a(bmb, 0.5F); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\auq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */