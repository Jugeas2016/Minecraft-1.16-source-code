/*     */ import it.unimi.dsi.fastutil.ints.Int2IntMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum cwc
/*     */   implements cwn, cwt
/*     */ {
/*  14 */   a; private static final Int2IntMap c;
/*     */   static {
/*  16 */     b = LogManager.getLogger();
/*     */     
/*  18 */     c = (Int2IntMap)x.a(new Int2IntOpenHashMap(), ☃ -> {
/*     */           ☃.put(1, 129);
/*     */           ☃.put(2, 130);
/*     */           ☃.put(3, 131);
/*     */           ☃.put(4, 132);
/*     */           ☃.put(5, 133);
/*     */           ☃.put(6, 134);
/*     */           ☃.put(12, 140);
/*     */           ☃.put(21, 149);
/*     */           ☃.put(23, 151);
/*     */           ☃.put(27, 155);
/*     */           ☃.put(28, 156);
/*     */           ☃.put(29, 157);
/*     */           ☃.put(30, 158);
/*     */           ☃.put(32, 160);
/*     */           ☃.put(33, 161);
/*     */           ☃.put(34, 162);
/*     */           ☃.put(35, 163);
/*     */           ☃.put(36, 164);
/*     */           ☃.put(37, 165);
/*     */           ☃.put(38, 166);
/*     */           ☃.put(39, 167);
/*     */         });
/*     */   }
/*     */   private static final Logger b;
/*     */   public int a(cvk ☃, cvf cvf1, cvf cvf2, int i, int j) {
/*  44 */     int k = cvf1.a(a(i + 1), b(j + 1));
/*  45 */     int m = cvf2.a(a(i + 1), b(j + 1));
/*     */     
/*  47 */     if (k > 255) {
/*  48 */       b.debug("old! {}", Integer.valueOf(k));
/*     */     }
/*     */     
/*  51 */     int n = (m - 2) % 29;
/*  52 */     if (!cvx.b(k) && m >= 2 && n == 1) {
/*  53 */       return c.getOrDefault(k, k);
/*     */     }
/*     */     
/*  56 */     if (☃.a(3) == 0 || n == 0) {
/*  57 */       int i1 = k;
/*  58 */       if (k == 2) {
/*  59 */         i1 = 17;
/*  60 */       } else if (k == 4) {
/*  61 */         i1 = 18;
/*  62 */       } else if (k == 27) {
/*  63 */         i1 = 28;
/*  64 */       } else if (k == 29) {
/*  65 */         i1 = 1;
/*  66 */       } else if (k == 5) {
/*  67 */         i1 = 19;
/*  68 */       } else if (k == 32) {
/*  69 */         i1 = 33;
/*  70 */       } else if (k == 30) {
/*  71 */         i1 = 31;
/*  72 */       } else if (k == 1) {
/*  73 */         i1 = (☃.a(3) == 0) ? 18 : 4;
/*  74 */       } else if (k == 12) {
/*  75 */         i1 = 13;
/*  76 */       } else if (k == 21) {
/*  77 */         i1 = 22;
/*  78 */       } else if (k == 168) {
/*  79 */         i1 = 169;
/*  80 */       } else if (k == 0) {
/*  81 */         i1 = 24;
/*  82 */       } else if (k == 45) {
/*  83 */         i1 = 48;
/*  84 */       } else if (k == 46) {
/*  85 */         i1 = 49;
/*  86 */       } else if (k == 10) {
/*  87 */         i1 = 50;
/*  88 */       } else if (k == 3) {
/*  89 */         i1 = 34;
/*  90 */       } else if (k == 35) {
/*  91 */         i1 = 36;
/*  92 */       } else if (cvx.a(k, 38)) {
/*  93 */         i1 = 37;
/*  94 */       } else if ((k == 24 || k == 48 || k == 49 || k == 50) && 
/*  95 */         ☃.a(3) == 0) {
/*  96 */         i1 = (☃.a(2) == 0) ? 1 : 4;
/*     */       } 
/*     */       
/*  99 */       if (n == 0 && i1 != k) {
/* 100 */         i1 = c.getOrDefault(i1, k);
/*     */       }
/*     */       
/* 103 */       if (i1 != k) {
/* 104 */         int i2 = 0;
/* 105 */         if (cvx.a(cvf1.a(a(i + 1), b(j + 0)), k)) {
/* 106 */           i2++;
/*     */         }
/* 108 */         if (cvx.a(cvf1.a(a(i + 2), b(j + 1)), k)) {
/* 109 */           i2++;
/*     */         }
/* 111 */         if (cvx.a(cvf1.a(a(i + 0), b(j + 1)), k)) {
/* 112 */           i2++;
/*     */         }
/* 114 */         if (cvx.a(cvf1.a(a(i + 1), b(j + 2)), k)) {
/* 115 */           i2++;
/*     */         }
/* 117 */         if (i2 >= 3) {
/* 118 */           return i1;
/*     */         }
/*     */       } 
/*     */     } 
/* 122 */     return k;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cwc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */