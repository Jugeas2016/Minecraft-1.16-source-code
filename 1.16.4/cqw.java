/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqw
/*    */   extends cqc<cmg>
/*    */ {
/*    */   public cqw(Codec<cmg> ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, cmg cmg1, fx fx1) {
/* 19 */     int i = ☃.b();
/* 20 */     int j = i - 5 + random.nextInt(10);
/* 21 */     return Stream.of(new fx(fx1.u(), j, fx1.w()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */