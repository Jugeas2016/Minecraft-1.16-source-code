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
/*     */ public class cfx
/*     */   implements bsx.a
/*     */ {
/*  16 */   private static final Logger d = LogManager.getLogger();
/*     */ 
/*     */   
/*  19 */   private static final int e = (int)Math.round(Math.log(16.0D) / Math.log(2.0D)) - 2;
/*  20 */   private static final int f = (int)Math.round(Math.log(256.0D) / Math.log(2.0D)) - 2;
/*     */   
/*  22 */   public static final int a = 1 << e + e + f;
/*  23 */   public static final int b = (1 << e) - 1;
/*  24 */   public static final int c = (1 << f) - 1;
/*     */   
/*     */   private final gg<bsv> g;
/*     */   private final bsv[] h;
/*     */   
/*     */   public cfx(gg<bsv> ☃, bsv[] arrayOfBsv) {
/*  30 */     this.g = ☃;
/*  31 */     this.h = arrayOfBsv;
/*     */   }
/*     */   
/*     */   private cfx(gg<bsv> ☃) {
/*  35 */     this(☃, new bsv[a]);
/*     */   }
/*     */   
/*     */   public cfx(gg<bsv> ☃, int[] arrayOfInt) {
/*  39 */     this(☃);
/*  40 */     for (int i = 0; i < this.h.length; i++) {
/*  41 */       int j = arrayOfInt[i];
/*  42 */       bsv bsv1 = ☃.a(j);
/*  43 */       if (bsv1 == null) {
/*  44 */         d.warn("Received invalid biome id: " + j);
/*  45 */         this.h[i] = ☃.a(0);
/*     */       } else {
/*  47 */         this.h[i] = bsv1;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public cfx(gg<bsv> ☃, brd brd1, bsy bsy1) {
/*  53 */     this(☃);
/*     */     
/*  55 */     int i = brd1.d() >> 2;
/*  56 */     int j = brd1.e() >> 2;
/*     */     
/*  58 */     for (int k = 0; k < this.h.length; k++) {
/*  59 */       int m = k & b;
/*  60 */       int n = k >> e + e & c;
/*  61 */       int i1 = k >> e & b;
/*  62 */       this.h[k] = bsy1.b(i + m, n, j + i1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public cfx(gg<bsv> ☃, brd brd1, bsy bsy1, @Nullable int[] arrayOfInt) {
/*  67 */     this(☃);
/*     */     
/*  69 */     int i = brd1.d() >> 2;
/*  70 */     int j = brd1.e() >> 2;
/*     */     
/*  72 */     if (arrayOfInt != null) {
/*  73 */       for (int k = 0; k < arrayOfInt.length; k++) {
/*  74 */         this.h[k] = ☃.a(arrayOfInt[k]);
/*  75 */         if (this.h[k] == null) {
/*  76 */           int m = k & b;
/*  77 */           int n = k >> e + e & c;
/*  78 */           int i1 = k >> e & b;
/*  79 */           this.h[k] = bsy1.b(i + m, n, j + i1);
/*     */         } 
/*     */       } 
/*     */     } else {
/*  83 */       for (int k = 0; k < this.h.length; k++) {
/*  84 */         int m = k & b;
/*  85 */         int n = k >> e + e & c;
/*  86 */         int i1 = k >> e & b;
/*  87 */         this.h[k] = bsy1.b(i + m, n, j + i1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public int[] a() {
/*  93 */     int[] ☃ = new int[this.h.length];
/*  94 */     for (int i = 0; i < this.h.length; i++) {
/*  95 */       ☃[i] = this.g.a((T)this.h[i]);
/*     */     }
/*  97 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public bsv b(int ☃, int i, int j) {
/* 102 */     int k = ☃ & b;
/* 103 */     int m = afm.a(i, 0, c);
/* 104 */     int n = j & b;
/* 105 */     return this.h[m << e + e | n << e | k];
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */