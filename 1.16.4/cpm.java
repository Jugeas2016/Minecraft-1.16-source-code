/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cpm
/*    */   extends cqo<cpn>
/*    */ {
/*    */   public cpm(Codec<cpn> ☃) {
/* 11 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, cpn cpn1, fx fx1) {
/* 16 */     if (☃.nextFloat() < 1.0F / cpn1.c) {
/* 17 */       return Stream.of(fx1);
/*    */     }
/*    */     
/* 20 */     return Stream.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */