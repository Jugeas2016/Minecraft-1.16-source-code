/*     */ import java.util.BitSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class dcq
/*     */   extends dcw
/*     */ {
/*     */   private final BitSet d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   
/*     */   public dcq(int ☃, int i, int j) {
/*  17 */     this(☃, i, j, ☃, i, j, 0, 0, 0);
/*     */   }
/*     */   
/*     */   public dcq(int ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3) {
/*  21 */     super(☃, i, j);
/*  22 */     this.d = new BitSet(☃ * i * j);
/*  23 */     this.e = k;
/*  24 */     this.f = m;
/*  25 */     this.g = n;
/*  26 */     this.h = i1;
/*  27 */     this.i = i2;
/*  28 */     this.j = i3;
/*     */   }
/*     */   
/*     */   public dcq(dcw ☃) {
/*  32 */     super(☃.a, ☃.b, ☃.c);
/*     */ 
/*     */     
/*  35 */     if (☃ instanceof dcq) {
/*  36 */       this.d = (BitSet)((dcq)☃).d.clone();
/*     */     } else {
/*  38 */       this.d = new BitSet(this.a * this.b * this.c);
/*  39 */       for (int i = 0; i < this.a; i++) {
/*  40 */         for (int j = 0; j < this.b; j++) {
/*  41 */           for (int k = 0; k < this.c; k++) {
/*  42 */             if (☃.b(i, j, k)) {
/*  43 */               this.d.set(a(i, j, k));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  50 */     this.e = ☃.a(gc.a.a);
/*  51 */     this.f = ☃.a(gc.a.b);
/*  52 */     this.g = ☃.a(gc.a.c);
/*     */     
/*  54 */     this.h = ☃.b(gc.a.a);
/*  55 */     this.i = ☃.b(gc.a.b);
/*  56 */     this.j = ☃.b(gc.a.c);
/*     */   }
/*     */   
/*     */   protected int a(int ☃, int i, int j) {
/*  60 */     return (☃ * this.b + i) * this.c + j;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, int i, int j) {
/*  65 */     return this.d.get(a(☃, i, j));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool1, boolean bool2) {
/*  70 */     this.d.set(a(☃, i, j), bool2);
/*  71 */     if (bool1 && bool2) {
/*  72 */       this.e = Math.min(this.e, ☃);
/*  73 */       this.f = Math.min(this.f, i);
/*  74 */       this.g = Math.min(this.g, j);
/*     */       
/*  76 */       this.h = Math.max(this.h, ☃ + 1);
/*  77 */       this.i = Math.max(this.i, i + 1);
/*  78 */       this.j = Math.max(this.j, j + 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  84 */     return this.d.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(gc.a ☃) {
/*  89 */     return ☃.a(this.e, this.f, this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(gc.a ☃) {
/*  94 */     return ☃.a(this.h, this.i, this.j);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃, int i, int j, int k) {
/* 100 */     if (j < 0 || k < 0 || ☃ < 0) {
/* 101 */       return false;
/*     */     }
/* 103 */     if (j >= this.a || k >= this.b || i > this.c) {
/* 104 */       return false;
/*     */     }
/* 106 */     return (this.d.nextClearBit(a(j, k, ☃)) >= a(j, k, i));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int ☃, int i, int j, int k, boolean bool) {
/* 112 */     this.d.set(a(j, k, ☃), a(j, k, i), bool);
/*     */   }
/*     */   
/*     */   static dcq a(dcw ☃, dcw dcw1, dcz dcz1, dcz dcz2, dcz dcz3, dcr dcr1) {
/* 116 */     dcq dcq1 = new dcq(dcz1.a().size() - 1, dcz2.a().size() - 1, dcz3.a().size() - 1);
/* 117 */     int[] arrayOfInt = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     dcz1.a((i, j, k) -> {
/*     */           boolean[] arrayOfBoolean = { false };
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           boolean bool = ☃.a(());
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           if (arrayOfBoolean[0]) {
/*     */             arrayOfInt[0] = Math.min(arrayOfInt[0], k);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             arrayOfInt[3] = Math.max(arrayOfInt[3], k);
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/*     */           return bool;
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 153 */     dcq1.e = arrayOfInt[0];
/* 154 */     dcq1.f = arrayOfInt[1];
/* 155 */     dcq1.g = arrayOfInt[2];
/* 156 */     dcq1.h = arrayOfInt[3] + 1;
/* 157 */     dcq1.i = arrayOfInt[4] + 1;
/* 158 */     dcq1.j = arrayOfInt[5] + 1;
/* 159 */     return dcq1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */