/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqb
/*    */   extends cqo<cmg>
/*    */ {
/*    */   public cqb(Codec<cmg> ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, cmg cmg1, fx fx1) {
/* 17 */     Stream<fx> stream = Stream.empty();
/*    */     
/* 19 */     if (☃.nextInt(14) == 0) {
/* 20 */       stream = Stream.concat(stream, Stream.of(fx1.b(☃.nextInt(16), 55 + ☃.nextInt(16), ☃.nextInt(16))));
/*    */       
/* 22 */       if (☃.nextInt(4) == 0) {
/* 23 */         stream = Stream.concat(stream, Stream.of(fx1.b(☃.nextInt(16), 55 + ☃.nextInt(16), ☃.nextInt(16))));
/*    */       }
/* 25 */       return stream;
/*    */     } 
/*    */     
/* 28 */     return Stream.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */