/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cku
/*    */   extends cjl<cmu>
/*    */ {
/*    */   public cku(Codec<cmu> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmu cmu1) {
/* 18 */     int i = random.nextInt(cmu1.b.size());
/* 19 */     civ<?, ?> civ = ((Supplier<civ<?, ?>>)cmu1.b.get(i)).get();
/* 20 */     return civ.a(☃, cfy1, random, fx1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */