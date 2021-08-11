/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class coy
/*    */   extends cpb
/*    */ {
/*    */   public static final Codec<coy> a;
/*    */   
/*    */   static {
/* 17 */     a = RecordCodecBuilder.create(☃ -> a(☃).apply((Applicative)☃, coy::new));
/*    */   }
/*    */   public coy(int ☃, int i, int j) {
/* 20 */     super(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cpc<?> a() {
/* 25 */     return cpc.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<cnl.b> a(bsb ☃, Random random, int i, fx fx1, Set<fx> set, cra cra1, cmz cmz1) {
/* 30 */     fx fx2 = fx1.c();
/* 31 */     a(☃, fx2);
/* 32 */     a(☃, fx2.g());
/* 33 */     a(☃, fx2.e());
/* 34 */     a(☃, fx2.e().g());
/*    */     
/* 36 */     fx.a a = new fx.a();
/*    */     
/* 38 */     for (int j = 0; j < i; j++) {
/* 39 */       a(☃, random, a, set, cra1, cmz1, fx1, 0, j, 0);
/*    */       
/* 41 */       if (j < i - 1) {
/* 42 */         a(☃, random, a, set, cra1, cmz1, fx1, 1, j, 0);
/*    */         
/* 44 */         a(☃, random, a, set, cra1, cmz1, fx1, 1, j, 1);
/*    */         
/* 46 */         a(☃, random, a, set, cra1, cmz1, fx1, 0, j, 1);
/*    */       } 
/*    */     } 
/*    */     
/* 50 */     return (List<cnl.b>)ImmutableList.of(new cnl.b(fx1.b(i), 0, true));
/*    */   }
/*    */   
/*    */   private static void a(bsb ☃, Random random, fx.a a1, Set<fx> set, cra cra1, cmz cmz1, fx fx1, int i, int j, int k) {
/* 54 */     a1.a(fx1, i, j, k);
/* 55 */     a(☃, random, a1, set, cra1, cmz1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\coy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */