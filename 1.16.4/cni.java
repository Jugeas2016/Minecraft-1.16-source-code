/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class cni
/*    */   extends cnh
/*    */ {
/*    */   public static final Codec<cni> c;
/*    */   
/*    */   static {
/* 15 */     c = RecordCodecBuilder.create(☃ -> a(☃).apply((Applicative)☃, cni::new));
/*    */   }
/*    */   public cni(afw ☃, afw afw1, int i) {
/* 18 */     super(☃, afw1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnm<?> a() {
/* 23 */     return cnm.e;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bsb ☃, Random random, cmz cmz1, int i, cnl.b b1, int j, int k, Set<fx> set, int m, cra cra1) {
/* 28 */     for (int n = m; n >= m - j; n--) {
/* 29 */       int i1 = k + b1.b() - 1 - n;
/* 30 */       a(☃, random, cmz1, b1.a(), i1, set, n, b1.c(), cra1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 36 */     return (i == m && k == m && ☃.nextInt(2) == 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cni.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */