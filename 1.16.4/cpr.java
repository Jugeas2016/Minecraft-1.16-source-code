/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cpr
/*    */   extends cqo<cqd>
/*    */ {
/*    */   public cpr(Codec<cqd> ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, cqd cqd1, fx fx1) {
/* 17 */     int i = cqd1.c + ((☃.nextFloat() < cqd1.d) ? cqd1.e : 0);
/* 18 */     return IntStream.range(0, i).mapToObj(i -> ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */