/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ckg
/*    */   extends cjl<cmj>
/*    */ {
/*    */   ckg(Codec<cmj> ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmj cmj1) {
/* 29 */     int i = random.nextInt(cmj1.c + 1);
/* 30 */     fx.a a = new fx.a();
/*    */     
/* 32 */     for (int j = 0; j < i; j++) {
/*    */       
/* 34 */       a(a, random, fx1, Math.min(j, 7));
/*    */       
/* 36 */       if (cmj1.b.a(☃.d_(a), random) && !a(☃, a))
/*    */       {
/* 38 */         ☃.a(a, cmj1.d, 2);
/*    */       }
/*    */     } 
/* 41 */     return true;
/*    */   }
/*    */   
/*    */   private void a(fx.a ☃, Random random, fx fx1, int i) {
/* 45 */     int j = a(random, i);
/* 46 */     int k = a(random, i);
/* 47 */     int m = a(random, i);
/* 48 */     ☃.a(fx1, j, k, m);
/*    */   }
/*    */   
/*    */   private int a(Random ☃, int i) {
/* 52 */     return Math.round((☃.nextFloat() - ☃.nextFloat()) * i);
/*    */   }
/*    */   
/*    */   private boolean a(bry ☃, fx fx1) {
/* 56 */     fx.a a = new fx.a();
/* 57 */     for (gc gc : gc.values()) {
/* 58 */       a.a(fx1, gc);
/* 59 */       if (☃.d_(a).g()) {
/* 60 */         return true;
/*    */       }
/*    */     } 
/* 63 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */