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
/*    */ public abstract class cii<U extends cma>
/*    */   extends cjl<U>
/*    */ {
/*    */   public cii(Codec<U> ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, U u) {
/* 22 */     ceh ceh = b(random, fx1, u);
/* 23 */     int i = 0;
/* 24 */     for (int j = 0; j < a(u); j++) {
/* 25 */       fx fx2 = a(random, fx1, u);
/*    */       
/* 27 */       if (☃.w(fx2) && fx2.v() < 255 && ceh.a(☃, fx2) && a(☃, fx2, u)) {
/* 28 */         ☃.a(fx2, ceh, 2);
/* 29 */         i++;
/*    */       } 
/*    */     } 
/*    */     
/* 33 */     return (i > 0);
/*    */   }
/*    */   
/*    */   public abstract boolean a(bry parambry, fx paramfx, U paramU);
/*    */   
/*    */   public abstract int a(U paramU);
/*    */   
/*    */   public abstract fx a(Random paramRandom, fx paramfx, U paramU);
/*    */   
/*    */   public abstract ceh b(Random paramRandom, fx paramfx, U paramU);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */