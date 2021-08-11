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
/*    */ public class a
/*    */   implements cze<dbm>
/*    */ {
/*    */   public void a(JsonObject ☃, dbm dbm1, JsonSerializationContext jsonSerializationContext) {
/* 45 */     ☃.add("predicate", dbm.a(dbm1).a());
/* 46 */     if (dbm.b(dbm1).u() != 0) {
/* 47 */       ☃.addProperty("offsetX", Integer.valueOf(dbm.b(dbm1).u()));
/*    */     }
/* 49 */     if (dbm.b(dbm1).v() != 0) {
/* 50 */       ☃.addProperty("offsetY", Integer.valueOf(dbm.b(dbm1).v()));
/*    */     }
/* 52 */     if (dbm.b(dbm1).w() != 0) {
/* 53 */       ☃.addProperty("offsetZ", Integer.valueOf(dbm.b(dbm1).w()));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public dbm b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 59 */     bw bw = bw.a(☃.get("predicate"));
/* 60 */     int i = afd.a(☃, "offsetX", 0);
/* 61 */     int j = afd.a(☃, "offsetY", 0);
/* 62 */     int k = afd.a(☃, "offsetZ", 0);
/* 63 */     return new dbm(bw, new fx(i, j, k), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */