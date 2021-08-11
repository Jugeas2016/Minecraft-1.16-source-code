/*    */ import com.google.gson.JsonElement;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface a
/*    */ {
/*    */   jb get(buo parambuo);
/*    */   
/*    */   default vk a(buo ☃, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 87 */     return get(☃).a(☃, biConsumer);
/*    */   }
/*    */   
/*    */   default vk a(buo ☃, String str, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 91 */     return get(☃).a(☃, str, biConsumer);
/*    */   }
/*    */   
/*    */   default a a(Consumer<iz> ☃) {
/* 95 */     return buo1 -> get(buo1).a(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */