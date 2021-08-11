/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.BitSet;
/*    */ import java.util.Random;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cpk
/*    */   extends cqc<cpl>
/*    */ {
/*    */   public cpk(Codec<cpl> ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, cpl cpl1, fx fx1) {
/* 19 */     brd brd = new brd(fx1);
/* 20 */     BitSet bitSet = ☃.a(brd, cpl1.c);
/*    */     
/* 22 */     return IntStream.range(0, bitSet.length()).filter(i -> (☃.get(i) && random.nextFloat() < cpl1.d)).mapToObj(i -> {
/*    */           int j = i & 0xF;
/*    */           int k = i >> 4 & 0xF;
/*    */           int m = i >> 8;
/*    */           return new fx(☃.d() + j, m, ☃.e() + k);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */