/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class coz
/*    */   extends coy
/*    */ {
/*    */   public static final Codec<coz> b;
/*    */   
/*    */   static {
/* 18 */     b = RecordCodecBuilder.create(☃ -> a(☃).apply((Applicative)☃, coz::new));
/*    */   }
/*    */   public coz(int ☃, int i, int j) {
/* 21 */     super(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cpc<?> a() {
/* 26 */     return cpc.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<cnl.b> a(bsb ☃, Random random, int i, fx fx1, Set<fx> set, cra cra1, cmz cmz1) {
/* 31 */     List<cnl.b> list = Lists.newArrayList();
/* 32 */     list.addAll(super.a(☃, random, i, fx1, set, cra1, cmz1));
/*    */     
/*    */     int j;
/* 35 */     for (j = i - 2 - random.nextInt(4); j > i / 2; j -= 2 + random.nextInt(4)) {
/* 36 */       float f = random.nextFloat() * 6.2831855F;
/* 37 */       int k = 0;
/* 38 */       int m = 0;
/*    */       
/* 40 */       for (int n = 0; n < 5; n++) {
/* 41 */         k = (int)(1.5F + afm.b(f) * n);
/* 42 */         m = (int)(1.5F + afm.a(f) * n);
/* 43 */         fx fx2 = fx1.b(k, j - 3 + n / 2, m);
/* 44 */         a(☃, random, fx2, set, cra1, cmz1);
/*    */       } 
/*    */       
/* 47 */       list.add(new cnl.b(fx1.b(k, j, m), -2, false));
/*    */     } 
/*    */     
/* 50 */     return list;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\coz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */