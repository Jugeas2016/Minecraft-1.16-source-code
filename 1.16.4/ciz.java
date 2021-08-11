/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ciz
/*    */   extends ciy
/*    */ {
/*    */   public ciz(Codec<cmh> ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(bry ☃, Random random, fx fx1, ceh ceh1) {
/* 19 */     int i = random.nextInt(3) + 3;
/* 20 */     int j = random.nextInt(3) + 3;
/* 21 */     int k = random.nextInt(3) + 3;
/*    */     
/* 23 */     int m = random.nextInt(3) + 1;
/*    */     
/* 25 */     fx.a a = fx1.i();
/*    */ 
/*    */ 
/*    */     
/* 29 */     for (int n = 0; n <= j; n++) {
/* 30 */       for (int i1 = 0; i1 <= i; i1++) {
/* 31 */         for (int i2 = 0; i2 <= k; i2++) {
/* 32 */           a.d(n + fx1.u(), i1 + fx1.v(), i2 + fx1.w());
/* 33 */           a.c(gc.a, m);
/*    */ 
/*    */           
/* 36 */           if ((n != 0 && n != j) || (i1 != 0 && i1 != i))
/*    */           {
/*    */ 
/*    */             
/* 40 */             if ((i2 != 0 && i2 != k) || (i1 != 0 && i1 != i))
/*    */             {
/*    */ 
/*    */               
/* 44 */               if ((n != 0 && n != j) || (i2 != 0 && i2 != k))
/*    */               {
/*    */ 
/*    */ 
/*    */                 
/* 49 */                 if (n == 0 || n == j || i1 == 0 || i1 == i || i2 == 0 || i2 == k)
/*    */                 {
/*    */ 
/*    */ 
/*    */                   
/* 54 */                   if (random.nextFloat() >= 0.1F)
/*    */                   {
/*    */ 
/*    */                     
/* 58 */                     if (!b(☃, random, a, ceh1)); }  }  } 
/*    */             }
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 64 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ciz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */