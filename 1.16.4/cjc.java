/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cjc
/*    */   extends cii<cmn>
/*    */ {
/*    */   public cjc(Codec<cmn> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bry ☃, fx fx1, cmn cmn1) {
/* 18 */     return !cmn1.e.contains(☃.d_(fx1));
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(cmn ☃) {
/* 23 */     return ☃.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public fx a(Random ☃, fx fx1, cmn cmn1) {
/* 28 */     return fx1.b(☃.nextInt(cmn1.g) - ☃.nextInt(cmn1.g), ☃.nextInt(cmn1.h) - ☃.nextInt(cmn1.h), ☃.nextInt(cmn1.i) - ☃.nextInt(cmn1.i));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh b(Random ☃, fx fx1, cmn cmn1) {
/* 33 */     return cmn1.b.a(☃, fx1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */