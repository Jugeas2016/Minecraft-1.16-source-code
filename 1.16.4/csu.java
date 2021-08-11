/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class csu
/*    */ {
/* 10 */   public static final Codec<csu> c = gm.aa.dispatch("predicate_type", csu::a, csv::codec);
/*    */   
/*    */   public abstract boolean a(ceh paramceh, Random paramRandom);
/*    */   
/*    */   protected abstract csv<?> a();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */