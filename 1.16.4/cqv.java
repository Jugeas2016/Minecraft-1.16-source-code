/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqv
/*    */   extends cqo<clu>
/*    */ {
/*    */   public cqv(Codec<clu> ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, clu clu1, fx fx1) {
/* 21 */     return IntStream.range(0, ☃.nextInt(☃.nextInt(clu1.a().a(☃)) + 1)).mapToObj(i -> {
/*    */           int j = ☃.nextInt(16) + fx1.u();
/*    */           int k = ☃.nextInt(16) + fx1.w();
/*    */           int m = ☃.nextInt(120) + 4;
/*    */           return new fx(j, m, k);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */