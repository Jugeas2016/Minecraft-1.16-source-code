/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cnt
/*    */ {
/* 11 */   public static final Codec<cnt> a = gm.aV.dispatch(cnt::a, cnu::a);
/*    */   
/*    */   protected abstract cnu<?> a();
/*    */   
/*    */   public abstract ceh a(Random paramRandom, fx paramfx);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */