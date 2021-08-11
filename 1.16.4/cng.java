/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class cng
/*    */   extends cnl
/*    */ {
/*    */   public static final Codec<cng> a;
/*    */   
/*    */   static {
/* 15 */     a = RecordCodecBuilder.create(☃ -> b(☃).apply((Applicative)☃, cng::new));
/*    */   }
/*    */   public cng(afw ☃, afw afw1) {
/* 18 */     super(☃, afw1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnm<?> a() {
/* 23 */     return cnm.d;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bsb ☃, Random random, cmz cmz1, int i, cnl.b b1, int j, int k, Set<fx> set, int m, cra cra1) {
/* 28 */     boolean bool = b1.c();
/* 29 */     fx fx = b1.a().b(m);
/*    */     
/* 31 */     a(☃, random, cmz1, fx, k + b1.b(), set, -1 - j, bool, cra1);
/* 32 */     a(☃, random, cmz1, fx, k - 1, set, -j, bool, cra1);
/* 33 */     a(☃, random, cmz1, fx, k + b1.b() - 1, set, 0, bool, cra1);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃, int i, cmz cmz1) {
/* 38 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 43 */     if (j == 0)
/*    */     {
/* 45 */       return ((i > 1 || k > 1) && i != 0 && k != 0);
/*    */     }
/* 47 */     return (i == m && k == m && m > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cng.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */