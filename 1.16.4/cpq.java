/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cpq
/*    */   extends cqc<cmf>
/*    */ {
/*    */   public cpq(Codec<cmf> ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, cmf cmf1, fx fx1) {
/* 19 */     double d = bsv.f.a(fx1.u() / 200.0D, fx1.w() / 200.0D, false);
/* 20 */     int i = (d < cmf1.c) ? cmf1.d : cmf1.e;
/* 21 */     return IntStream.range(0, i).mapToObj(i -> ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */