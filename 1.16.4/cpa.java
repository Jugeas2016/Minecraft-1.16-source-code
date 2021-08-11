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
/*    */ public class cpa
/*    */   extends cpb
/*    */ {
/*    */   public static final Codec<cpa> a;
/*    */   
/*    */   static {
/* 17 */     a = RecordCodecBuilder.create(☃ -> a(☃).apply((Applicative)☃, cpa::new));
/*    */   }
/*    */   public cpa(int ☃, int i, int j) {
/* 20 */     super(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cpc<?> a() {
/* 25 */     return cpc.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<cnl.b> a(bsb ☃, Random random, int i, fx fx1, Set<fx> set, cra cra1, cmz cmz1) {
/* 30 */     a(☃, fx1.c());
/*    */     
/* 32 */     for (int j = 0; j < i; j++) {
/* 33 */       a(☃, random, fx1.b(j), set, cra1, cmz1);
/*    */     }
/* 35 */     return (List<cnl.b>)ImmutableList.of(new cnl.b(fx1.b(i), 0, false));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */