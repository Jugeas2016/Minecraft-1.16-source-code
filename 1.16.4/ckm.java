/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ckm
/*    */   extends cjl<cmm>
/*    */ {
/*    */   public ckm(Codec<cmm> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmm cmm1) {
/* 18 */     for (clj clj : cmm1.b) {
/* 19 */       if (random.nextFloat() < clj.c) {
/* 20 */         return clj.a(☃, cfy1, random, fx1);
/*    */       }
/*    */     } 
/* 23 */     return ((civ)cmm1.c.get()).a(☃, cfy1, random, fx1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */