/*    */ import com.google.gson.JsonObject;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface jf
/*    */ {
/*    */   void a(JsonObject paramJsonObject);
/*    */   
/*    */   default JsonObject a() {
/* 14 */     JsonObject ☃ = new JsonObject();
/* 15 */     ☃.addProperty("type", gm.ae.b(c()).toString());
/* 16 */     a(☃);
/* 17 */     return ☃;
/*    */   }
/*    */   
/*    */   vk b();
/*    */   
/*    */   bos<?> c();
/*    */   
/*    */   @Nullable
/*    */   JsonObject d();
/*    */   
/*    */   @Nullable
/*    */   vk e();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */