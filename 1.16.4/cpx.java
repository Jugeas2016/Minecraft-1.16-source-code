/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cpx
/*    */   extends cqo<cpw>
/*    */ {
/*    */   public cpx(Codec<cpw> ☃) {
/* 11 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, cpw cpw1, fx fx1) {
/* 16 */     int i = cpw1.c;
/* 17 */     int j = cpw1.d;
/*    */     
/* 19 */     int k = fx1.u();
/* 20 */     int m = fx1.w();
/* 21 */     int n = ☃.nextInt(j) + ☃.nextInt(j) - j + i;
/* 22 */     return Stream.of(new fx(k, n, m));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */