/*    */ import com.mojang.datafixers.Products;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class cnh
/*    */   extends cnl {
/*    */   public static final Codec<cnh> a;
/*    */   protected final int b;
/*    */   
/*    */   static {
/* 16 */     a = RecordCodecBuilder.create(☃ -> a(☃).apply((Applicative)☃, cnh::new));
/*    */   }
/*    */   protected static <P extends cnh> Products.P3<RecordCodecBuilder.Mu<P>, afw, afw, Integer> a(RecordCodecBuilder.Instance<P> ☃) {
/* 19 */     return b((RecordCodecBuilder.Instance)☃).and(
/* 20 */         (App)Codec.intRange(0, 16).fieldOf("height").forGetter(☃ -> Integer.valueOf(☃.b)));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cnh(afw ☃, afw afw1, int i) {
/* 27 */     super(☃, afw1);
/* 28 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnm<?> a() {
/* 33 */     return cnm.a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bsb ☃, Random random, cmz cmz1, int i, cnl.b b1, int j, int k, Set<fx> set, int m, cra cra1) {
/* 38 */     for (int n = m; n >= m - j; n--) {
/* 39 */       int i1 = Math.max(k + b1.b() - 1 - n / 2, 0);
/* 40 */       a(☃, random, cmz1, b1.a(), i1, set, n, b1.c(), cra1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃, int i, cmz cmz1) {
/* 46 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 51 */     return (i == m && k == m && (☃.nextInt(2) == 0 || j == 0));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */