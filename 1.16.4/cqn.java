/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqn
/*    */   extends cqo<cmo>
/*    */ {
/*    */   public cqn(Codec<cmo> ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, cmo cmo1, fx fx1) {
/* 17 */     int i = fx1.u();
/* 18 */     int j = fx1.w();
/* 19 */     int k = ☃.nextInt(cmo1.e - cmo1.d) + cmo1.c;
/* 20 */     return Stream.of(new fx(i, k, j));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */