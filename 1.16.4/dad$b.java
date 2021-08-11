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
/*    */ public class b
/*    */   extends dai.c<dad>
/*    */ {
/*    */   public void a(JsonObject ☃, dad dad1, JsonSerializationContext jsonSerializationContext) {
/* 68 */     super.a(☃, dad1, jsonSerializationContext);
/*    */     
/* 70 */     ☃.add("levels", czc.a(dad.a(dad1), jsonSerializationContext));
/* 71 */     ☃.addProperty("treasure", Boolean.valueOf(dad.b(dad1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dad a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 76 */     czb czb = czc.a(☃.get("levels"), jsonDeserializationContext);
/* 77 */     boolean bool = afd.a(☃, "treasure", false);
/* 78 */     return new dad(arrayOfDbo, czb, bool, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dad$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */