/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class cnj
/*    */   extends cnl
/*    */ {
/*    */   public static final Codec<cnj> a;
/*    */   
/*    */   static {
/* 15 */     a = RecordCodecBuilder.create(☃ -> b(☃).apply((Applicative)☃, cnj::new));
/*    */   }
/*    */   public cnj(afw ☃, afw afw1) {
/* 18 */     super(☃, afw1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnm<?> a() {
/* 23 */     return cnm.i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bsb ☃, Random random, cmz cmz1, int i, cnl.b b1, int j, int k, Set<fx> set, int m, cra cra1) {
/* 28 */     fx fx = b1.a().b(m);
/* 29 */     boolean bool = b1.c();
/*    */     
/* 31 */     if (bool) {
/* 32 */       a(☃, random, cmz1, fx, k + 2, set, -1, bool, cra1);
/* 33 */       a(☃, random, cmz1, fx, k + 3, set, 0, bool, cra1);
/* 34 */       a(☃, random, cmz1, fx, k + 2, set, 1, bool, cra1);
/* 35 */       if (random.nextBoolean()) {
/* 36 */         a(☃, random, cmz1, fx, k, set, 2, bool, cra1);
/*    */       }
/*    */     } else {
/* 39 */       a(☃, random, cmz1, fx, k + 2, set, -1, bool, cra1);
/* 40 */       a(☃, random, cmz1, fx, k + 1, set, 0, bool, cra1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃, int i, cmz cmz1) {
/* 46 */     return 4;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 51 */     if (j == 0 && bool && (
/* 52 */       i == -m || i >= m) && (k == -m || k >= m)) {
/* 53 */       return true;
/*    */     }
/*    */     
/* 56 */     return super.b(☃, i, j, k, m, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 61 */     if (j == -1 && !bool) {
/* 62 */       return (i == m && k == m);
/*    */     }
/* 64 */     if (j == 1) {
/* 65 */       return (i + k > m * 2 - 2);
/*    */     }
/* 67 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */