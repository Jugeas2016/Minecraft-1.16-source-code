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
/*    */ public class cja
/*    */   extends ciy
/*    */ {
/*    */   public cja(Codec<cmh> ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(bry ☃, Random random, fx fx1, ceh ceh1) {
/* 22 */     fx.a a = fx1.i();
/*    */     
/* 24 */     int i = random.nextInt(3) + 1;
/* 25 */     for (int j = 0; j < i; j++) {
/* 26 */       if (!b(☃, random, a, ceh1)) {
/* 27 */         return true;
/*    */       }
/* 29 */       a.c(gc.b);
/*    */     } 
/* 31 */     fx fx2 = a.h();
/*    */     
/* 33 */     int k = random.nextInt(3) + 2;
/* 34 */     List<gc> list1 = Lists.newArrayList(gc.c.a);
/* 35 */     Collections.shuffle(list1, random);
/* 36 */     List<gc> list2 = list1.subList(0, k);
/*    */     
/* 38 */     for (gc gc : list2) {
/* 39 */       a.g(fx2);
/* 40 */       a.c(gc);
/*    */       
/* 42 */       int m = random.nextInt(5) + 2;
/* 43 */       int n = 0;
/* 44 */       for (int i1 = 0; i1 < m && 
/* 45 */         b(☃, random, a, ceh1); i1++) {
/*    */ 
/*    */         
/* 48 */         n++;
/* 49 */         a.c(gc.b);
/*    */         
/* 51 */         if (i1 == 0 || (n >= 2 && random.nextFloat() < 0.25F)) {
/* 52 */           a.c(gc);
/* 53 */           n = 0;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 58 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */