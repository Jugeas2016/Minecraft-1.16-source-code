/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cix
/*    */   extends ciy
/*    */ {
/*    */   public cix(Codec<cmh> ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(bry ☃, Random random, fx fx1, ceh ceh1) {
/* 23 */     if (!b(☃, random, fx1, ceh1)) {
/* 24 */       return false;
/*    */     }
/*    */     
/* 27 */     gc gc = gc.c.a.a(random);
/* 28 */     int i = random.nextInt(2) + 2;
/*    */     
/* 30 */     List<gc> list1 = Lists.newArrayList((Object[])new gc[] { gc, gc.g(), gc.h() });
/* 31 */     Collections.shuffle(list1, random);
/* 32 */     List<gc> list2 = list1.subList(0, i);
/*    */     
/* 34 */     for (gc gc1 : list2) {
/* 35 */       int k; gc gc2; fx.a a = fx1.i();
/* 36 */       int j = random.nextInt(2) + 1;
/*    */ 
/*    */ 
/*    */       
/* 40 */       a.c(gc1);
/* 41 */       if (gc1 == gc) {
/* 42 */         gc2 = gc;
/* 43 */         k = random.nextInt(3) + 2;
/*    */       } else {
/* 45 */         a.c(gc.b);
/*    */ 
/*    */         
/* 48 */         gc[] arrayOfGc = { gc1, gc.b };
/* 49 */         gc2 = x.<gc>a(arrayOfGc, random);
/* 50 */         k = random.nextInt(3) + 3;
/*    */       } 
/*    */       int m;
/* 53 */       for (m = 0; m < j && 
/* 54 */         b(☃, random, a, ceh1); m++)
/*    */       {
/*    */         
/* 57 */         a.c(gc2);
/*    */       }
/* 59 */       a.c(gc2.f());
/* 60 */       a.c(gc.b);
/*    */       
/* 62 */       for (m = 0; m < k; m++) {
/* 63 */         a.c(gc);
/* 64 */         if (!b(☃, random, a, ceh1)) {
/*    */           break;
/*    */         }
/*    */         
/* 68 */         if (random.nextFloat() < 0.25F) {
/* 69 */           a.c(gc.b);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 74 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */