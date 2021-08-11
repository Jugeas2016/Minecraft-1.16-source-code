/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.BitSet;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cia
/*     */   extends cig<cmk>
/*     */ {
/*     */   public cia(Codec<cmk> ☃, int i) {
/*  16 */     super(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Random ☃, int i, int j, cmk cmk1) {
/*  21 */     return (☃.nextFloat() <= cmk1.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cfw ☃, Function<fx, bsv> function, Random random, int i, int j, int k, int m, int n, BitSet bitSet, cmk cmk1) {
/*  26 */     int i1 = (d() * 2 - 1) * 16;
/*  27 */     int i2 = random.nextInt(random.nextInt(random.nextInt(a()) + 1) + 1);
/*     */     
/*  29 */     for (int i3 = 0; i3 < i2; i3++) {
/*     */       
/*  31 */       double d1 = (j * 16 + random.nextInt(16));
/*  32 */       double d2 = b(random);
/*  33 */       double d3 = (k * 16 + random.nextInt(16));
/*     */       
/*  35 */       int i4 = 1;
/*  36 */       if (random.nextInt(4) == 0) {
/*     */         
/*  38 */         double d = 0.5D;
/*  39 */         float f = 1.0F + random.nextFloat() * 6.0F;
/*  40 */         a(☃, function, random.nextLong(), i, m, n, d1, d2, d3, f, 0.5D, bitSet);
/*  41 */         i4 += random.nextInt(4);
/*     */       } 
/*     */       
/*  44 */       for (int i5 = 0; i5 < i4; i5++) {
/*     */         
/*  46 */         float f1 = random.nextFloat() * 6.2831855F;
/*  47 */         float f2 = (random.nextFloat() - 0.5F) / 4.0F;
/*  48 */         float f3 = a(random);
/*  49 */         int i6 = i1 - random.nextInt(i1 / 4);
/*  50 */         int i7 = 0;
/*  51 */         a(☃, function, random.nextLong(), i, m, n, d1, d2, d3, f3, f1, f2, 0, i6, b(), bitSet);
/*     */       } 
/*     */     } 
/*     */     
/*  55 */     return true;
/*     */   }
/*     */   
/*     */   protected int a() {
/*  59 */     return 15;
/*     */   }
/*     */   
/*     */   protected float a(Random ☃) {
/*  63 */     float f = ☃.nextFloat() * 2.0F + ☃.nextFloat();
/*  64 */     if (☃.nextInt(10) == 0) {
/*  65 */       f *= ☃.nextFloat() * ☃.nextFloat() * 3.0F + 1.0F;
/*     */     }
/*  67 */     return f;
/*     */   }
/*     */   
/*     */   protected double b() {
/*  71 */     return 1.0D;
/*     */   }
/*     */   
/*     */   protected int b(Random ☃) {
/*  75 */     return ☃.nextInt(☃.nextInt(120) + 8);
/*     */   }
/*     */   
/*     */   protected void a(cfw ☃, Function<fx, bsv> function, long l, int i, int j, int k, double d1, double d2, double d3, float f, double d4, BitSet bitSet) {
/*  79 */     double d5 = 1.5D + (afm.a(1.5707964F) * f);
/*  80 */     double d6 = d5 * d4;
/*     */     
/*  82 */     a(☃, function, l, i, j, k, d1 + 1.0D, d2, d3, d5, d6, bitSet);
/*     */   }
/*     */   
/*     */   protected void a(cfw ☃, Function<fx, bsv> function, long l, int i, int j, int k, double d1, double d2, double d3, float f1, float f2, float f3, int m, int n, double d4, BitSet bitSet) {
/*  86 */     Random random = new Random(l);
/*     */     
/*  88 */     int i1 = random.nextInt(n / 2) + n / 4;
/*  89 */     boolean bool = (random.nextInt(6) == 0);
/*     */     
/*  91 */     float f4 = 0.0F;
/*  92 */     float f5 = 0.0F;
/*     */     
/*  94 */     for (int i2 = m; i2 < n; i2++) {
/*  95 */       double d5 = 1.5D + (afm.a(3.1415927F * i2 / n) * f1);
/*  96 */       double d6 = d5 * d4;
/*     */       
/*  98 */       float f = afm.b(f3);
/*  99 */       d1 += (afm.b(f2) * f);
/* 100 */       d2 += afm.a(f3);
/* 101 */       d3 += (afm.a(f2) * f);
/*     */       
/* 103 */       f3 *= bool ? 0.92F : 0.7F;
/* 104 */       f3 += f5 * 0.1F;
/* 105 */       f2 += f4 * 0.1F;
/*     */       
/* 107 */       f5 *= 0.9F;
/* 108 */       f4 *= 0.75F;
/* 109 */       f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
/* 110 */       f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;
/*     */ 
/*     */       
/* 113 */       if (i2 == i1 && f1 > 1.0F) {
/* 114 */         a(☃, function, random.nextLong(), i, j, k, d1, d2, d3, random.nextFloat() * 0.5F + 0.5F, f2 - 1.5707964F, f3 / 3.0F, i2, n, 1.0D, bitSet);
/* 115 */         a(☃, function, random.nextLong(), i, j, k, d1, d2, d3, random.nextFloat() * 0.5F + 0.5F, f2 + 1.5707964F, f3 / 3.0F, i2, n, 1.0D, bitSet);
/*     */         
/*     */         return;
/*     */       } 
/* 119 */       if (random.nextInt(4) != 0) {
/*     */ 
/*     */ 
/*     */         
/* 123 */         if (!a(j, k, d1, d3, i2, n, f1)) {
/*     */           return;
/*     */         }
/* 126 */         a(☃, function, l, i, j, k, d1, d2, d3, d5, d6, bitSet);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(double ☃, double d1, double d2, int i) {
/* 132 */     return (d1 <= -0.7D || ☃ * ☃ + d1 * d1 + d2 * d2 >= 1.0D);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */