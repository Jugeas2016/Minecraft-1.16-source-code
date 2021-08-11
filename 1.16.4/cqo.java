/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cqo<DC extends clw>
/*    */   extends cqc<DC>
/*    */ {
/*    */   public cqo(Codec<DC> ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public final Stream<fx> a(cpv ☃, Random random, DC dC, fx fx1) {
/* 17 */     return a(random, dC, fx1);
/*    */   }
/*    */   
/*    */   protected abstract Stream<fx> a(Random paramRandom, DC paramDC, fx paramfx);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */