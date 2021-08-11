/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Random;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class ckc
/*     */   extends cjl<cmh>
/*     */ {
/*  26 */   private static final Logger a = LogManager.getLogger();
/*  27 */   private static final aqe<?>[] ab = new aqe[] { aqe.av, aqe.aY, aqe.aY, aqe.aC };
/*  28 */   private static final ceh ac = bup.lb.n();
/*     */   
/*     */   public ckc(Codec<cmh> ☃) {
/*  31 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/*  36 */     int i = 3;
/*  37 */     int j = random.nextInt(2) + 2;
/*  38 */     int k = -j - 1;
/*  39 */     int m = j + 1;
/*     */     
/*  41 */     int n = -1;
/*  42 */     int i1 = 4;
/*     */     
/*  44 */     int i2 = random.nextInt(2) + 2;
/*  45 */     int i3 = -i2 - 1;
/*  46 */     int i4 = i2 + 1;
/*     */     
/*  48 */     int i5 = 0; int i6;
/*  49 */     for (i6 = k; i6 <= m; i6++) {
/*  50 */       for (int i7 = -1; i7 <= 4; i7++) {
/*  51 */         for (int i8 = i3; i8 <= i4; i8++) {
/*  52 */           fx fx2 = fx1.b(i6, i7, i8);
/*  53 */           cva cva = ☃.d_(fx2).c();
/*  54 */           boolean bool = cva.b();
/*     */           
/*  56 */           if (i7 == -1 && !bool) {
/*  57 */             return false;
/*     */           }
/*  59 */           if (i7 == 4 && !bool) {
/*  60 */             return false;
/*     */           }
/*     */           
/*  63 */           if ((i6 == k || i6 == m || i8 == i3 || i8 == i4) && 
/*  64 */             i7 == 0 && ☃.w(fx2) && ☃.w(fx2.b())) {
/*  65 */             i5++;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  72 */     if (i5 < 1 || i5 > 5) {
/*  73 */       return false;
/*     */     }
/*     */     
/*  76 */     for (i6 = k; i6 <= m; i6++) {
/*  77 */       for (int i7 = 3; i7 >= -1; i7--) {
/*  78 */         for (int i8 = i3; i8 <= i4; i8++) {
/*  79 */           fx fx2 = fx1.b(i6, i7, i8);
/*     */           
/*  81 */           ceh ceh1 = ☃.d_(fx2);
/*  82 */           if (i6 == k || i7 == -1 || i8 == i3 || i6 == m || i7 == 4 || i8 == i4) {
/*  83 */             if (fx2.v() >= 0 && !☃.d_(fx2.c()).c().b()) {
/*  84 */               ☃.a(fx2, ac, 2);
/*  85 */             } else if (ceh1.c().b() && 
/*  86 */               !ceh1.a(bup.bR)) {
/*  87 */               if (i7 == -1 && random.nextInt(4) != 0) {
/*  88 */                 ☃.a(fx2, bup.bJ.n(), 2);
/*     */               } else {
/*  90 */                 ☃.a(fx2, bup.m.n(), 2);
/*     */               }
/*     */             
/*     */             }
/*     */           
/*  95 */           } else if (!ceh1.a(bup.bR) && !ceh1.a(bup.bP)) {
/*  96 */             ☃.a(fx2, ac, 2);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 103 */     for (i6 = 0; i6 < 2; i6++) {
/* 104 */       for (int i7 = 0; i7 < 3; i7++) {
/* 105 */         int i8 = fx1.u() + random.nextInt(j * 2 + 1) - j;
/* 106 */         int i9 = fx1.v();
/* 107 */         int i10 = fx1.w() + random.nextInt(i2 * 2 + 1) - i2;
/* 108 */         fx fx2 = new fx(i8, i9, i10);
/*     */         
/* 110 */         if (☃.w(fx2)) {
/*     */ 
/*     */ 
/*     */           
/* 114 */           int i11 = 0;
/* 115 */           for (gc gc : gc.c.a) {
/* 116 */             if (☃.d_(fx2.a(gc)).c().b()) {
/* 117 */               i11++;
/*     */             }
/*     */           } 
/*     */           
/* 121 */           if (i11 == 1) {
/*     */ 
/*     */ 
/*     */             
/* 125 */             ☃.a(fx2, cru.a(☃, fx2, bup.bR.n()), 2);
/* 126 */             cdd.a(☃, random, fx2, cyq.d);
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 132 */     ☃.a(fx1, bup.bP.n(), 2);
/* 133 */     ccj ccj = ☃.c(fx1);
/*     */     
/* 135 */     if (ccj instanceof cdi) {
/* 136 */       ((cdi)ccj).d().a(a(random));
/*     */     } else {
/* 138 */       a.error("Failed to fetch mob spawner entity at ({}, {}, {})", Integer.valueOf(fx1.u()), Integer.valueOf(fx1.v()), Integer.valueOf(fx1.w()));
/*     */     } 
/*     */     
/* 141 */     return true;
/*     */   }
/*     */   
/*     */   private aqe<?> a(Random ☃) {
/* 145 */     return x.<aqe>a((aqe[])ab, ☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */