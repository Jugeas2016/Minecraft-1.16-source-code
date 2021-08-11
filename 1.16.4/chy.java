/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.BitSet;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class chy
/*    */   extends cig<cmk>
/*    */ {
/* 16 */   private final float[] m = new float[1024];
/*    */   
/*    */   public chy(Codec<cmk> ☃) {
/* 19 */     super(☃, 256);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(Random ☃, int i, int j, cmk cmk1) {
/* 24 */     return (☃.nextFloat() <= cmk1.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cfw ☃, Function<fx, bsv> function, Random random, int i, int j, int k, int m, int n, BitSet bitSet, cmk cmk1) {
/* 29 */     int i1 = (d() * 2 - 1) * 16;
/*    */     
/* 31 */     double d1 = (j * 16 + random.nextInt(16));
/* 32 */     double d2 = (random.nextInt(random.nextInt(40) + 8) + 20);
/* 33 */     double d3 = (k * 16 + random.nextInt(16));
/*    */     
/* 35 */     float f1 = random.nextFloat() * 6.2831855F;
/* 36 */     float f2 = (random.nextFloat() - 0.5F) * 2.0F / 8.0F;
/* 37 */     double d4 = 3.0D;
/* 38 */     float f3 = (random.nextFloat() * 2.0F + random.nextFloat()) * 2.0F;
/* 39 */     int i2 = i1 - random.nextInt(i1 / 4);
/* 40 */     int i3 = 0;
/* 41 */     a(☃, function, random.nextLong(), i, m, n, d1, d2, d3, f3, f1, f2, 0, i2, 3.0D, bitSet);
/*    */     
/* 43 */     return true;
/*    */   }
/*    */   
/*    */   private void a(cfw ☃, Function<fx, bsv> function, long l, int i, int j, int k, double d1, double d2, double d3, float f1, float f2, float f3, int m, int n, double d4, BitSet bitSet) {
/* 47 */     Random random = new Random(l);
/*    */     
/* 49 */     float f4 = 1.0F;
/* 50 */     for (int i1 = 0; i1 < 256; i1++) {
/* 51 */       if (i1 == 0 || random.nextInt(3) == 0) {
/* 52 */         f4 = 1.0F + random.nextFloat() * random.nextFloat();
/*    */       }
/* 54 */       this.m[i1] = f4 * f4;
/*    */     } 
/*    */     
/* 57 */     float f5 = 0.0F;
/* 58 */     float f6 = 0.0F;
/*    */     
/* 60 */     for (int i2 = m; i2 < n; i2++) {
/* 61 */       double d5 = 1.5D + (afm.a(i2 * 3.1415927F / n) * f1);
/* 62 */       double d6 = d5 * d4;
/*    */       
/* 64 */       d5 *= random.nextFloat() * 0.25D + 0.75D;
/* 65 */       d6 *= random.nextFloat() * 0.25D + 0.75D;
/*    */       
/* 67 */       float f7 = afm.b(f3);
/* 68 */       float f8 = afm.a(f3);
/* 69 */       d1 += (afm.b(f2) * f7);
/* 70 */       d2 += f8;
/* 71 */       d3 += (afm.a(f2) * f7);
/*    */       
/* 73 */       f3 *= 0.7F;
/*    */       
/* 75 */       f3 += f6 * 0.05F;
/* 76 */       f2 += f5 * 0.05F;
/*    */       
/* 78 */       f6 *= 0.8F;
/* 79 */       f5 *= 0.5F;
/* 80 */       f6 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
/* 81 */       f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;
/*    */       
/* 83 */       if (random.nextInt(4) != 0) {
/*    */ 
/*    */ 
/*    */         
/* 87 */         if (!a(j, k, d1, d3, i2, n, f1)) {
/*    */           return;
/*    */         }
/*    */         
/* 91 */         a(☃, function, l, i, j, k, d1, d2, d3, d5, d6, bitSet);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   protected boolean a(double ☃, double d1, double d2, int i) {
/* 97 */     return ((☃ * ☃ + d2 * d2) * this.m[i - 1] + d1 * d1 / 6.0D >= 1.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */