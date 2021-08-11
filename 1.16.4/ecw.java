/*     */ import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
/*     */ import java.util.BitSet;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
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
/*     */ public class ecw
/*     */ {
/*  21 */   private static final int a = (int)Math.pow(16.0D, 0.0D);
/*  22 */   private static final int b = (int)Math.pow(16.0D, 1.0D);
/*  23 */   private static final int c = (int)Math.pow(16.0D, 2.0D);
/*     */   
/*  25 */   private static final gc[] d = gc.values();
/*     */   
/*  27 */   private final BitSet e = new BitSet(4096);
/*     */   static {
/*  29 */     f = x.<int[]>a(new int[1352], ☃ -> {
/*     */           int i = 0;
/*     */           int j = 15;
/*     */           int k = 0;
/*     */           for (int m = 0; m < 16; m++) {
/*     */             for (int n = 0; n < 16; n++) {
/*     */               for (int i1 = 0; i1 < 16; i1++) {
/*     */                 if (m == 0 || m == 15 || n == 0 || n == 15 || i1 == 0 || i1 == 15)
/*     */                   ☃[k++] = a(m, n, i1); 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         });
/*     */   }
/*     */   
/*     */   private static final int[] f;
/*  45 */   private int g = 4096;
/*     */   
/*     */   public void a(fx ☃) {
/*  48 */     this.e.set(c(☃), true);
/*  49 */     this.g--;
/*     */   }
/*     */   
/*     */   private static int c(fx ☃) {
/*  53 */     return a(☃.u() & 0xF, ☃.v() & 0xF, ☃.w() & 0xF);
/*     */   }
/*     */   
/*     */   private static int a(int ☃, int i, int j) {
/*  57 */     return ☃ << 0 | i << 8 | j << 4;
/*     */   }
/*     */   
/*     */   public ecx a() {
/*  61 */     ecx ☃ = new ecx();
/*     */     
/*  63 */     if (4096 - this.g < 256) {
/*  64 */       ☃.a(true);
/*  65 */     } else if (this.g == 0) {
/*  66 */       ☃.a(false);
/*     */     } else {
/*  68 */       for (int i : f) {
/*  69 */         if (!this.e.get(i)) {
/*  70 */           ☃.a(a(i));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  75 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Set<gc> a(int ☃) {
/*  83 */     Set<gc> set = EnumSet.noneOf(gc.class);
/*     */     
/*  85 */     IntArrayFIFOQueue intArrayFIFOQueue = new IntArrayFIFOQueue();
/*  86 */     intArrayFIFOQueue.enqueue(☃);
/*  87 */     this.e.set(☃, true);
/*     */     
/*  89 */     while (!intArrayFIFOQueue.isEmpty()) {
/*  90 */       int i = intArrayFIFOQueue.dequeueInt();
/*  91 */       a(i, set);
/*     */       
/*  93 */       for (gc gc1 : d) {
/*  94 */         int j = a(i, gc1);
/*  95 */         if (j >= 0 && !this.e.get(j)) {
/*  96 */           this.e.set(j, true);
/*  97 */           intArrayFIFOQueue.enqueue(j);
/*     */         } 
/*     */       } 
/*     */     } 
/* 101 */     return set;
/*     */   }
/*     */   
/*     */   private void a(int ☃, Set<gc> set) {
/* 105 */     int i = ☃ >> 0 & 0xF;
/* 106 */     if (i == 0) {
/* 107 */       set.add(gc.e);
/* 108 */     } else if (i == 15) {
/* 109 */       set.add(gc.f);
/*     */     } 
/*     */     
/* 112 */     int j = ☃ >> 8 & 0xF;
/* 113 */     if (j == 0) {
/* 114 */       set.add(gc.a);
/* 115 */     } else if (j == 15) {
/* 116 */       set.add(gc.b);
/*     */     } 
/*     */     
/* 119 */     int k = ☃ >> 4 & 0xF;
/* 120 */     if (k == 0) {
/* 121 */       set.add(gc.c);
/* 122 */     } else if (k == 15) {
/* 123 */       set.add(gc.d);
/*     */     } 
/*     */   }
/*     */   
/*     */   private int a(int ☃, gc gc1) {
/* 128 */     switch (null.a[gc1.ordinal()]) {
/*     */       
/*     */       case 1:
/* 131 */         if ((☃ >> 8 & 0xF) == 0) {
/* 132 */           return -1;
/*     */         }
/* 134 */         return ☃ - c;
/*     */       
/*     */       case 2:
/* 137 */         if ((☃ >> 8 & 0xF) == 15) {
/* 138 */           return -1;
/*     */         }
/* 140 */         return ☃ + c;
/*     */       
/*     */       case 3:
/* 143 */         if ((☃ >> 4 & 0xF) == 0) {
/* 144 */           return -1;
/*     */         }
/* 146 */         return ☃ - b;
/*     */       
/*     */       case 4:
/* 149 */         if ((☃ >> 4 & 0xF) == 15) {
/* 150 */           return -1;
/*     */         }
/* 152 */         return ☃ + b;
/*     */       
/*     */       case 5:
/* 155 */         if ((☃ >> 0 & 0xF) == 0) {
/* 156 */           return -1;
/*     */         }
/* 158 */         return ☃ - a;
/*     */       
/*     */       case 6:
/* 161 */         if ((☃ >> 0 & 0xF) == 15) {
/* 162 */           return -1;
/*     */         }
/* 164 */         return ☃ + a;
/*     */     } 
/* 166 */     return -1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */