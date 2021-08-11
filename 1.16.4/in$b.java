/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.List;
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
/*    */ class b
/*    */   implements Supplier<JsonElement>
/*    */ {
/*    */   private final List<ir> a;
/*    */   
/*    */   private b(List<ir> ☃) {
/* 71 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cei<?, ?> ☃) {}
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃) {}
/*    */ 
/*    */   
/*    */   public JsonElement a() {
/* 82 */     JsonObject ☃ = new JsonObject();
/* 83 */     a(☃);
/* 84 */     ☃.add("apply", ir.a(this.a));
/* 85 */     return (JsonElement)☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\in$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */