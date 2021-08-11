/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends crv<cmh>
/*     */ {
/*     */   public a(cla<cmh> ☃, int i, int j, cra cra1, int k, long l) {
/*  59 */     super(☃, i, j, cra1, k, l);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmh cmh1) {
/*  64 */     bzm bzm = bzm.a(this.d);
/*     */     
/*  66 */     int k = 5;
/*  67 */     int m = 5;
/*  68 */     if (bzm == bzm.b) {
/*  69 */       k = -5;
/*  70 */     } else if (bzm == bzm.c) {
/*  71 */       k = -5;
/*  72 */       m = -5;
/*  73 */     } else if (bzm == bzm.d) {
/*  74 */       m = -5;
/*     */     } 
/*     */     
/*  77 */     int n = (i << 4) + 7;
/*  78 */     int i1 = (j << 4) + 7;
/*  79 */     int i2 = cfy1.c(n, i1, chn.a.a);
/*  80 */     int i3 = cfy1.c(n, i1 + m, chn.a.a);
/*  81 */     int i4 = cfy1.c(n + k, i1, chn.a.a);
/*  82 */     int i5 = cfy1.c(n + k, i1 + m, chn.a.a);
/*     */     
/*  84 */     int i6 = Math.min(Math.min(i2, i3), Math.min(i4, i5));
/*     */ 
/*     */ 
/*     */     
/*  88 */     if (i6 < 60) {
/*     */       return;
/*     */     }
/*     */     
/*  92 */     fx fx = new fx(i * 16 + 8, i6 + 1, j * 16 + 8);
/*  93 */     List<cry.i> list = Lists.newLinkedList();
/*  94 */     cry.a(csw1, fx, bzm, list, this.d);
/*  95 */     this.b.addAll((Collection)list);
/*     */     
/*  97 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1) {
/* 102 */     super.a(☃, bsn1, cfy1, random, cra1, brd1);
/*     */ 
/*     */     
/* 105 */     int i = this.c.b;
/* 106 */     for (int j = cra1.a; j <= cra1.d; j++) {
/* 107 */       for (int k = cra1.c; k <= cra1.f; k++) {
/* 108 */         fx fx = new fx(j, i, k);
/* 109 */         if (!☃.w(fx) && this.c.b(fx)) {
/*     */           
/* 111 */           boolean bool = false;
/* 112 */           for (cru cru : this.b) {
/* 113 */             if (cru.g().b(fx)) {
/* 114 */               bool = true;
/*     */               break;
/*     */             } 
/*     */           } 
/* 118 */           if (bool)
/*     */           {
/*     */             
/* 121 */             for (int m = i - 1; m > 1; ) {
/* 122 */               fx fx1 = new fx(j, m, k);
/* 123 */               if (☃.w(fx1) || ☃.d_(fx1).c().a()) {
/* 124 */                 ☃.a(fx1, bup.m.n(), 2);
/*     */                 m--;
/*     */               } 
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */