/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqp
/*    */   extends cqc<cmg>
/*    */ {
/*    */   public cqp(Codec<cmg> ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, cmg cmg1, fx fx1) {
/* 17 */     int i = random.nextInt(fx1.v() + 32);
/* 18 */     return Stream.of(new fx(fx1.u(), i, fx1.w()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */