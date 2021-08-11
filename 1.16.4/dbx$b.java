/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
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
/*    */ public class b
/*    */   implements cze<dbx>
/*    */ {
/*    */   public void a(JsonObject ☃, dbx dbx1, JsonSerializationContext jsonSerializationContext) {
/* 74 */     ☃.addProperty("raining", dbx.a(dbx1));
/* 75 */     ☃.addProperty("thundering", dbx.b(dbx1));
/*    */   }
/*    */ 
/*    */   
/*    */   public dbx b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 80 */     Boolean bool1 = ☃.has("raining") ? Boolean.valueOf(afd.j(☃, "raining")) : null;
/* 81 */     Boolean bool2 = ☃.has("thundering") ? Boolean.valueOf(afd.j(☃, "thundering")) : null;
/* 82 */     return new dbx(bool1, bool2, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbx$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */