/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class cnk
/*    */   extends cnh
/*    */ {
/*    */   public static final Codec<cnk> c;
/*    */   
/*    */   static {
/* 16 */     c = RecordCodecBuilder.create(☃ -> a(☃).apply((Applicative)☃, cnk::new));
/*    */   }
/*    */   public cnk(afw ☃, afw afw1, int i) {
/* 19 */     super(☃, afw1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnm<?> a() {
/* 24 */     return cnm.f;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bsb ☃, Random random, cmz cmz1, int i, cnl.b b1, int j, int k, Set<fx> set, int m, cra cra1) {
/* 29 */     for (int n = m; n >= m - j; n--) {
/* 30 */       int i1 = k + ((n == m || n == m - j) ? 0 : 1);
/* 31 */       a(☃, random, cmz1, b1.a(), i1, set, n, b1.c(), cra1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 37 */     return (afm.k(i + 0.5F) + afm.k(k + 0.5F) > (m * m));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */