/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class iv
/*    */   implements Supplier<JsonElement>
/*    */ {
/*    */   private final vk a;
/*    */   
/*    */   public iv(vk ☃) {
/* 13 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a() {
/* 18 */     JsonObject ☃ = new JsonObject();
/* 19 */     ☃.addProperty("parent", this.a.toString());
/* 20 */     return (JsonElement)☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\iv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */