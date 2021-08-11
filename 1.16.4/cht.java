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
/*     */ public class cht
/*     */   implements brj
/*     */ {
/*     */   private int a;
/*     */   
/*     */   public int a(aag ☃, boolean bool1, boolean bool2) {
/*  24 */     if (!bool1) {
/*  25 */       return 0;
/*     */     }
/*     */     
/*  28 */     if (!☃.V().b(brt.D)) {
/*  29 */       return 0;
/*     */     }
/*     */     
/*  32 */     Random random = ☃.t;
/*     */     
/*  34 */     this.a--;
/*  35 */     if (this.a > 0) {
/*  36 */       return 0;
/*     */     }
/*     */     
/*  39 */     this.a += 12000 + random.nextInt(1200);
/*     */     
/*  41 */     long l = ☃.U() / 24000L;
/*  42 */     if (l < 5L || !☃.M()) {
/*  43 */       return 0;
/*     */     }
/*     */     
/*  46 */     if (random.nextInt(5) != 0) {
/*  47 */       return 0;
/*     */     }
/*     */     
/*  50 */     int i = ☃.x().size();
/*  51 */     if (i < 1) {
/*  52 */       return 0;
/*     */     }
/*     */     
/*  55 */     bfw bfw = ☃.x().get(random.nextInt(i));
/*  56 */     if (bfw.a_()) {
/*  57 */       return 0;
/*     */     }
/*     */     
/*  60 */     if (☃.a(bfw.cB(), 2)) {
/*  61 */       return 0;
/*     */     }
/*     */     
/*  64 */     int j = (24 + random.nextInt(24)) * (random.nextBoolean() ? -1 : 1);
/*  65 */     int k = (24 + random.nextInt(24)) * (random.nextBoolean() ? -1 : 1);
/*  66 */     fx.a a = bfw.cB().i().e(j, 0, k);
/*     */     
/*  68 */     if (!☃.a(a.u() - 10, a.v() - 10, a.w() - 10, a.u() + 10, a.v() + 10, a.w() + 10)) {
/*  69 */       return 0;
/*     */     }
/*     */     
/*  72 */     bsv bsv = ☃.v(a);
/*  73 */     bsv.b b = bsv.t();
/*  74 */     if (b == bsv.b.p) {
/*  75 */       return 0;
/*     */     }
/*     */     
/*  78 */     int m = 0;
/*     */     
/*  80 */     int n = (int)Math.ceil(☃.d(a).b()) + 1;
/*  81 */     for (int i1 = 0; i1 < n; i1++) {
/*  82 */       m++;
/*     */       
/*  84 */       a.p(☃.a(chn.a.f, a).v());
/*     */       
/*  86 */       if (i1 == 0) {
/*  87 */         if (!a(☃, a, random, true)) {
/*     */           break;
/*     */         }
/*     */       } else {
/*  91 */         a(☃, a, random, false);
/*     */       } 
/*     */       
/*  94 */       a.o(a.u() + random.nextInt(5) - random.nextInt(5));
/*  95 */       a.q(a.w() + random.nextInt(5) - random.nextInt(5));
/*     */     } 
/*     */     
/*  98 */     return m;
/*     */   }
/*     */   
/*     */   private boolean a(aag ☃, fx fx1, Random random, boolean bool) {
/* 102 */     ceh ceh = ☃.d_(fx1);
/* 103 */     if (!bsg.a(☃, fx1, ceh, ceh.m(), aqe.ak)) {
/* 104 */       return false;
/*     */     }
/*     */     
/* 107 */     if (!bdr.b((aqe)aqe.ak, ☃, aqp.p, fx1, random)) {
/* 108 */       return false;
/*     */     }
/*     */     
/* 111 */     bdr bdr = aqe.ak.a(☃);
/* 112 */     if (bdr != null) {
/* 113 */       if (bool) {
/* 114 */         bdr.t(true);
/* 115 */         bdr.eU();
/*     */       } 
/*     */       
/* 118 */       bdr.d(fx1.u(), fx1.v(), fx1.w());
/* 119 */       bdr.a(☃, ☃.d(fx1), aqp.p, (arc)null, (md)null);
/*     */       
/* 121 */       ☃.l(bdr);
/* 122 */       return true;
/*     */     } 
/*     */     
/* 125 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */