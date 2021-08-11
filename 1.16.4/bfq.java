/*     */ import java.util.Optional;
/*     */ import java.util.Random;
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
/*     */ public class bfq
/*     */   implements brj
/*     */ {
/*  38 */   private final Random a = new Random();
/*     */   private final cym b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   
/*     */   public bfq(cym ☃) {
/*  45 */     this.b = ☃;
/*  46 */     this.c = 1200;
/*  47 */     this.d = ☃.v();
/*  48 */     this.e = ☃.w();
/*     */     
/*  50 */     if (this.d == 0 && this.e == 0) {
/*  51 */       this.d = 24000;
/*  52 */       ☃.g(this.d);
/*  53 */       this.e = 25;
/*  54 */       ☃.h(this.e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(aag ☃, boolean bool1, boolean bool2) {
/*  60 */     if (!☃.V().b(brt.E)) {
/*  61 */       return 0;
/*     */     }
/*     */     
/*  64 */     if (--this.c > 0) {
/*  65 */       return 0;
/*     */     }
/*  67 */     this.c = 1200;
/*     */     
/*  69 */     this.d -= 1200;
/*  70 */     this.b.g(this.d);
/*  71 */     if (this.d > 0) {
/*  72 */       return 0;
/*     */     }
/*  74 */     this.d = 24000;
/*     */     
/*  76 */     if (!☃.V().b(brt.d)) {
/*  77 */       return 0;
/*     */     }
/*     */     
/*  80 */     int i = this.e;
/*  81 */     this.e = afm.a(this.e + 25, 25, 75);
/*  82 */     this.b.h(this.e);
/*     */     
/*  84 */     if (this.a.nextInt(100) > i) {
/*  85 */       return 0;
/*     */     }
/*     */     
/*  88 */     if (a(☃)) {
/*  89 */       this.e = 25;
/*  90 */       return 1;
/*     */     } 
/*     */     
/*  93 */     return 0;
/*     */   }
/*     */   
/*     */   private boolean a(aag ☃) {
/*  97 */     bfw bfw = ☃.q_();
/*  98 */     if (bfw == null) {
/*  99 */       return true;
/*     */     }
/*     */     
/* 102 */     if (this.a.nextInt(10) != 0) {
/* 103 */       return false;
/*     */     }
/*     */     
/* 106 */     fx fx1 = bfw.cB();
/* 107 */     int i = 48;
/*     */     
/* 109 */     azo azo = ☃.y();
/* 110 */     Optional<fx> optional = azo.c(azr.s.c(), ☃ -> true, fx1, 48, azo.b.c);
/*     */     
/* 112 */     fx fx2 = optional.orElse(fx1);
/* 113 */     fx fx3 = a(☃, fx2, 48);
/*     */     
/* 115 */     if (fx3 != null && a(☃, fx3)) {
/* 116 */       if (☃.i(fx3).equals(Optional.of(btb.Z))) {
/* 117 */         return false;
/*     */       }
/*     */       
/* 120 */       bfp bfp = aqe.aR.a(☃, null, null, null, fx3, aqp.h, false, false);
/*     */       
/* 122 */       if (bfp != null) {
/* 123 */         for (int j = 0; j < 2; j++) {
/* 124 */           a(☃, bfp, 4);
/*     */         }
/* 126 */         this.b.a(bfp.bS());
/* 127 */         bfp.u(48000);
/*     */         
/* 129 */         bfp.g(fx2);
/* 130 */         bfp.a(fx2, 16);
/* 131 */         return true;
/*     */       } 
/*     */     } 
/* 134 */     return false;
/*     */   }
/*     */   
/*     */   private void a(aag ☃, bfp bfp1, int i) {
/* 138 */     fx fx = a(☃, bfp1.cB(), i);
/* 139 */     if (fx == null) {
/*     */       return;
/*     */     }
/*     */     
/* 143 */     bbj bbj = aqe.aL.a(☃, null, null, null, fx, aqp.h, false, false);
/* 144 */     if (bbj == null) {
/*     */       return;
/*     */     }
/*     */     
/* 148 */     bbj.b(bfp1, true);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private fx a(brz ☃, fx fx1, int i) {
/* 153 */     fx fx2 = null;
/*     */     
/* 155 */     for (int j = 0; j < 10; j++) {
/* 156 */       int k = fx1.u() + this.a.nextInt(i * 2) - i;
/* 157 */       int m = fx1.w() + this.a.nextInt(i * 2) - i;
/* 158 */       int n = ☃.a(chn.a.b, k, m);
/* 159 */       fx fx3 = new fx(k, n, m);
/*     */       
/* 161 */       if (bsg.a(ard.c.a, ☃, fx3, aqe.aR)) {
/* 162 */         fx2 = fx3;
/*     */         break;
/*     */       } 
/*     */     } 
/* 166 */     return fx2;
/*     */   }
/*     */   
/*     */   private boolean a(brc ☃, fx fx1) {
/* 170 */     for (fx fx2 : fx.a(fx1, fx1.b(1, 2, 1))) {
/* 171 */       if (!☃.d_(fx2).k(☃, fx2).b()) {
/* 172 */         return false;
/*     */       }
/*     */     } 
/* 175 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */