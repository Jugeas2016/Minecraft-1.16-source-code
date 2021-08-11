/*     */ import org.apache.commons.lang3.mutable.MutableInt;
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
/*     */ public final class cug
/*     */   extends cul<cuh.a, cuh>
/*     */ {
/*  16 */   private static final gc[] e = gc.values();
/*  17 */   private final fx.a f = new fx.a();
/*     */   
/*     */   public cug(cgj ☃) {
/*  20 */     super(☃, bsf.b, new cuh(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private int d(long ☃) {
/*  26 */     int i = fx.b(☃);
/*  27 */     int j = fx.c(☃);
/*  28 */     int k = fx.d(☃);
/*  29 */     brc brc = this.a.c(i >> 4, k >> 4);
/*  30 */     if (brc != null) {
/*  31 */       return brc.g(this.f.d(i, j, k));
/*     */     }
/*  33 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(long ☃, long l1, int i) {
/*  38 */     if (l1 == Long.MAX_VALUE) {
/*  39 */       return 15;
/*     */     }
/*  41 */     if (☃ == Long.MAX_VALUE) {
/*  42 */       return i + 15 - d(l1);
/*     */     }
/*  44 */     if (i >= 15) {
/*  45 */       return i;
/*     */     }
/*     */     
/*  48 */     int j = Integer.signum(fx.b(l1) - fx.b(☃));
/*  49 */     int k = Integer.signum(fx.c(l1) - fx.c(☃));
/*  50 */     int m = Integer.signum(fx.d(l1) - fx.d(☃));
/*  51 */     gc gc1 = gc.a(j, k, m);
/*  52 */     if (gc1 == null) {
/*  53 */       return 15;
/*     */     }
/*     */     
/*  56 */     MutableInt mutableInt = new MutableInt();
/*  57 */     ceh ceh1 = a(l1, mutableInt);
/*     */     
/*  59 */     if (mutableInt.getValue().intValue() >= 15) {
/*  60 */       return 15;
/*     */     }
/*     */     
/*  63 */     ceh ceh2 = a(☃, (MutableInt)null);
/*     */     
/*  65 */     ddh ddh1 = a(ceh2, ☃, gc1);
/*  66 */     ddh ddh2 = a(ceh1, l1, gc1.f());
/*     */     
/*  68 */     if (dde.b(ddh1, ddh2)) {
/*  69 */       return 15;
/*     */     }
/*  71 */     return i + Math.max(1, mutableInt.getValue().intValue());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(long ☃, int i, boolean bool) {
/*  76 */     long l = gp.e(☃);
/*  77 */     for (gc gc1 : e) {
/*  78 */       long l1 = fx.a(☃, gc1);
/*  79 */       long l2 = gp.e(l1);
/*  80 */       if (l == l2 || this.c.g(l2)) {
/*  81 */         b(☃, l1, i, bool);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected int a(long ☃, long l1, int i) {
/*  88 */     int j = i;
/*  89 */     if (Long.MAX_VALUE != l1) {
/*  90 */       int k = b(Long.MAX_VALUE, ☃, 0);
/*  91 */       if (j > k) {
/*  92 */         j = k;
/*     */       }
/*  94 */       if (j == 0) {
/*  95 */         return j;
/*     */       }
/*     */     } 
/*  98 */     long l = gp.e(☃);
/*  99 */     cgb cgb = this.c.a(l, true);
/* 100 */     for (gc gc1 : e) {
/* 101 */       long l2 = fx.a(☃, gc1);
/* 102 */       if (l2 != l1) {
/*     */         cgb cgb1;
/*     */         
/* 105 */         long l3 = gp.e(l2);
/*     */         
/* 107 */         if (l == l3) {
/* 108 */           cgb1 = cgb;
/*     */         } else {
/* 110 */           cgb1 = this.c.a(l3, true);
/*     */         } 
/* 112 */         if (cgb1 != null) {
/* 113 */           int k = b(l2, ☃, a(cgb1, l2));
/* 114 */           if (j > k) {
/* 115 */             j = k;
/*     */           }
/* 117 */           if (j == 0)
/* 118 */             return j; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 122 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fx ☃, int i) {
/* 128 */     this.c.d();
/* 129 */     a(Long.MAX_VALUE, ☃.a(), 15 - i, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */