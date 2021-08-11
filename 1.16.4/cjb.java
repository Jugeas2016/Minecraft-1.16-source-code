/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import org.apache.commons.lang3.mutable.MutableBoolean;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cjb
/*    */   extends cjl<clv>
/*    */ {
/*    */   public cjb(Codec<clv> ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, clv clv1) {
/* 21 */     MutableBoolean mutableBoolean = new MutableBoolean();
/* 22 */     clv1.c.a(new cpv(☃, cfy1), random, fx1).forEach(fx1 -> {
/*    */           if (((civ)☃.b.get()).a(bsr1, cfy1, random, fx1)) {
/*    */             mutableBoolean.setTrue();
/*    */           }
/*    */         });
/* 27 */     return mutableBoolean.isTrue();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 32 */     return String.format("< %s [%s] >", new Object[] { getClass().getSimpleName(), gm.aE.b(this) });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */