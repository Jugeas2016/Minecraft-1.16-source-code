/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqk
/*    */   extends cqo<cql>
/*    */ {
/*    */   public cqk(Codec<cql> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, cql cql1, fx fx1) {
/* 18 */     double d = bsv.f.a(fx1.u() / cql1.d, fx1.w() / cql1.d, false);
/* 19 */     int i = (int)Math.ceil((d + cql1.e) * cql1.c);
/* 20 */     return IntStream.range(0, i).mapToObj(i -> ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */