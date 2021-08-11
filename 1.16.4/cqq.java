/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqq
/*    */   extends cqo<cmg>
/*    */ {
/*    */   public cqq(Codec<cmg> ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, cmg cmg1, fx fx1) {
/* 17 */     int i = ☃.nextInt(16) + fx1.u();
/* 18 */     int j = ☃.nextInt(16) + fx1.w();
/* 19 */     int k = fx1.v();
/*    */     
/* 21 */     return Stream.of(new fx(i, k, j));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */