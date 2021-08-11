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
/*    */ public class a
/*    */   extends dai.c<daq>
/*    */ {
/*    */   public void a(JsonObject ☃, daq daq1, JsonSerializationContext jsonSerializationContext) {
/* 38 */     super.a(☃, daq1, jsonSerializationContext);
/*    */     
/* 40 */     ☃.add("count", czc.a(daq.a(daq1), jsonSerializationContext));
/*    */   }
/*    */ 
/*    */   
/*    */   public daq a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 45 */     czb czb = czc.a(☃.get("count"), jsonDeserializationContext);
/* 46 */     return new daq(arrayOfDbo, czb, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\daq$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */