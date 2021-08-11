/*     */ import javax.annotation.Nullable;
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
/*     */ public class azm
/*     */   implements brj
/*     */ {
/*  21 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private boolean b;
/*  24 */   private a c = a.c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   
/*     */   enum a {
/*  32 */     a,
/*  33 */     b,
/*  34 */     c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(aag ☃, boolean bool1, boolean bool2) {
/*  40 */     if (☃.M() || !bool1) {
/*  41 */       this.c = a.c;
/*  42 */       this.b = false;
/*  43 */       return 0;
/*     */     } 
/*     */     
/*  46 */     float f = ☃.f(0.0F);
/*  47 */     if (f == 0.5D) {
/*  48 */       this.c = (☃.t.nextInt(10) == 0) ? a.b : a.c;
/*     */     }
/*     */     
/*  51 */     if (this.c == a.c) {
/*  52 */       return 0;
/*     */     }
/*     */     
/*  55 */     if (!this.b) {
/*  56 */       if (a(☃)) {
/*  57 */         this.b = true;
/*     */       } else {
/*  59 */         return 0;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*  64 */     if (this.e > 0) {
/*  65 */       this.e--;
/*  66 */       return 0;
/*     */     } 
/*     */     
/*  69 */     this.e = 2;
/*  70 */     if (this.d > 0) {
/*  71 */       b(☃);
/*  72 */       this.d--;
/*     */     } else {
/*  74 */       this.c = a.c;
/*     */     } 
/*     */     
/*  77 */     return 1;
/*     */   }
/*     */   
/*     */   private boolean a(aag ☃) {
/*  81 */     for (bfw bfw : ☃.x()) {
/*  82 */       if (!bfw.a_()) {
/*  83 */         fx fx = bfw.cB();
/*  84 */         if (!☃.a_(fx) || ☃.v(fx).t() == bsv.b.p) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */         
/*  89 */         for (int i = 0; i < 10; i++) {
/*  90 */           float f = ☃.t.nextFloat() * 6.2831855F;
/*  91 */           this.f = fx.u() + afm.d(afm.b(f) * 32.0F);
/*  92 */           this.g = fx.v();
/*  93 */           this.h = fx.w() + afm.d(afm.a(f) * 32.0F);
/*     */           
/*  95 */           if (a(☃, new fx(this.f, this.g, this.h)) != null) {
/*  96 */             this.e = 0;
/*  97 */             this.d = 20;
/*     */             break;
/*     */           } 
/*     */         } 
/* 101 */         return true;
/*     */       } 
/*     */     } 
/* 104 */     return false;
/*     */   }
/*     */   private void b(aag ☃) {
/*     */     bej bej;
/* 108 */     dcn dcn = a(☃, new fx(this.f, this.g, this.h));
/* 109 */     if (dcn == null) {
/*     */       return;
/*     */     }
/*     */     
/*     */     try {
/* 114 */       bej = new bej(☃);
/* 115 */       bej.a(☃, ☃.d(bej.cB()), aqp.h, (arc)null, (md)null);
/* 116 */     } catch (Exception exception) {
/* 117 */       a.warn("Failed to create zombie for village siege at {}", dcn, exception);
/*     */       return;
/*     */     } 
/* 120 */     bej.b(dcn.b, dcn.c, dcn.d, ☃.t.nextFloat() * 360.0F, 0.0F);
/* 121 */     ☃.l(bej);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private dcn a(aag ☃, fx fx1) {
/* 127 */     for (int i = 0; i < 10; i++) {
/* 128 */       int j = fx1.u() + ☃.t.nextInt(16) - 8;
/* 129 */       int k = fx1.w() + ☃.t.nextInt(16) - 8;
/* 130 */       int m = ☃.a(chn.a.b, j, k);
/* 131 */       fx fx2 = new fx(j, m, k);
/*     */       
/* 133 */       if (☃.a_(fx2))
/*     */       {
/*     */         
/* 136 */         if (bdq.b((aqe)aqe.aY, ☃, aqp.h, fx2, ☃.t))
/* 137 */           return dcn.c(fx2); 
/*     */       }
/*     */     } 
/* 140 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */