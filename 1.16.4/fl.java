/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fl<T extends ArgumentType<?>>
/*    */   implements fj<T>
/*    */ {
/*    */   private final Supplier<T> a;
/*    */   
/*    */   public fl(Supplier<T> ☃) {
/* 13 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(T ☃, nf nf1) {}
/*    */ 
/*    */   
/*    */   public T b(nf ☃) {
/* 22 */     return this.a.get();
/*    */   }
/*    */   
/*    */   public void a(T ☃, JsonObject jsonObject) {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */