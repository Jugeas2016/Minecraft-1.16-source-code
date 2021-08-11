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
/*    */ 
/*    */ public class cov
/*    */   extends cpb
/*    */ {
/*    */   public static final Codec<cov> a;
/*    */   
/*    */   static {
/* 19 */     a = RecordCodecBuilder.create(☃ -> a(☃).apply((Applicative)☃, cov::new));
/*    */   }
/*    */   public cov(int ☃, int i, int j) {
/* 22 */     super(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cpc<?> a() {
/* 27 */     return cpc.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<cnl.b> a(bsb ☃, Random random, int i, fx fx1, Set<fx> set, cra cra1, cmz cmz1) {
/* 32 */     List<cnl.b> list = Lists.newArrayList();
/*    */     
/* 34 */     fx fx2 = fx1.c();
/* 35 */     a(☃, fx2);
/* 36 */     a(☃, fx2.g());
/* 37 */     a(☃, fx2.e());
/* 38 */     a(☃, fx2.e().g());
/*    */     
/* 40 */     gc gc = gc.c.a.a(random);
/* 41 */     int j = i - random.nextInt(4);
/* 42 */     int k = 2 - random.nextInt(3);
/*    */     
/* 44 */     int m = fx1.u();
/* 45 */     int n = fx1.v();
/* 46 */     int i1 = fx1.w();
/*    */     
/* 48 */     int i2 = m;
/* 49 */     int i3 = i1;
/* 50 */     int i4 = n + i - 1;
/*    */     
/*    */     int i5;
/* 53 */     for (i5 = 0; i5 < i; i5++) {
/* 54 */       if (i5 >= j && k > 0) {
/* 55 */         i2 += gc.i();
/* 56 */         i3 += gc.k();
/* 57 */         k--;
/*    */       } 
/*    */       
/* 60 */       int i6 = n + i5;
/* 61 */       fx fx3 = new fx(i2, i6, i3);
/* 62 */       if (cld.d(☃, fx3)) {
/* 63 */         a(☃, random, fx3, set, cra1, cmz1);
/* 64 */         a(☃, random, fx3.g(), set, cra1, cmz1);
/* 65 */         a(☃, random, fx3.e(), set, cra1, cmz1);
/* 66 */         a(☃, random, fx3.g().e(), set, cra1, cmz1);
/*    */       } 
/*    */     } 
/*    */     
/* 70 */     list.add(new cnl.b(new fx(i2, i4, i3), 0, true));
/*    */ 
/*    */     
/* 73 */     for (i5 = -1; i5 <= 2; i5++) {
/* 74 */       for (int i6 = -1; i6 <= 2; i6++) {
/* 75 */         if (i5 < 0 || i5 > 1 || i6 < 0 || i6 > 1)
/*    */         {
/*    */           
/* 78 */           if (random.nextInt(3) <= 0) {
/*    */ 
/*    */             
/* 81 */             int i7 = random.nextInt(3) + 2;
/* 82 */             for (int i8 = 0; i8 < i7; i8++) {
/* 83 */               a(☃, random, new fx(m + i5, i4 - i8 - 1, i1 + i6), set, cra1, cmz1);
/*    */             }
/*    */             
/* 86 */             list.add(new cnl.b(new fx(i2 + i5, i4, i3 + i6), 0, false));
/*    */           }  } 
/*    */       } 
/*    */     } 
/* 90 */     return list;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cov.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */