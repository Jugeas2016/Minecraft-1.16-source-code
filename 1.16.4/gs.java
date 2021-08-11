/*    */ import com.mojang.serialization.Lifecycle;
/*    */ import java.util.OptionalInt;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class gs<T>
/*    */   extends gm<T>
/*    */ {
/*    */   public gs(vj<? extends gm<T>> ☃, Lifecycle lifecycle) {
/* 10 */     super(☃, lifecycle);
/*    */   }
/*    */   
/*    */   public abstract <V extends T> V a(int paramInt, vj<T> paramvj, V paramV, Lifecycle paramLifecycle);
/*    */   
/*    */   public abstract <V extends T> V a(vj<T> paramvj, V paramV, Lifecycle paramLifecycle);
/*    */   
/*    */   public abstract <V extends T> V a(OptionalInt paramOptionalInt, vj<T> paramvj, V paramV, Lifecycle paramLifecycle);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */