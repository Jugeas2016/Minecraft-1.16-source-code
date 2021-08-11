/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class cnn
/*    */   extends cnl
/*    */ {
/*    */   public static final Codec<cnn> a;
/*    */   protected final int b;
/*    */   
/*    */   static {
/* 16 */     a = RecordCodecBuilder.create(☃ -> b(☃).and((App)Codec.intRange(0, 16).fieldOf("height").forGetter(())).apply((Applicative)☃, cnn::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cnn(afw ☃, afw afw1, int i) {
/* 23 */     super(☃, afw1);
/* 24 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnm<?> a() {
/* 29 */     return cnm.g;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(bsb ☃, Random random, cmz cmz1, int i, cnl.b b1, int j, int k, Set<fx> set, int m, cra cra1) {
/* 35 */     int n = b1.c() ? j : (1 + random.nextInt(2));
/*    */     
/* 37 */     for (int i1 = m; i1 >= m - n; i1--) {
/* 38 */       int i2 = k + b1.b() + 1 - i1;
/* 39 */       a(☃, random, cmz1, b1.a(), i2, set, i1, b1.c(), cra1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃, int i, cmz cmz1) {
/* 45 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 50 */     if (i + k >= 7) {
/* 51 */       return true;
/*    */     }
/* 53 */     return (i * i + k * k > m * m);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */