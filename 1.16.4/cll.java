/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cll
/*    */ {
/* 12 */   public static final Codec<cll> a = gm.aW.dispatch(cll::a, clm::a);
/*    */   
/*    */   public abstract void a(bry parambry, fx paramfx, ceh paramceh, Random paramRandom);
/*    */   
/*    */   protected abstract clm<?> a();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cll.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */