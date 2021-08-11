/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dbx
/*    */   implements dbo
/*    */ {
/*    */   @Nullable
/*    */   private final Boolean a;
/*    */   @Nullable
/*    */   private final Boolean b;
/*    */   
/*    */   private dbx(@Nullable Boolean ☃, @Nullable Boolean bool1) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = bool1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 26 */     return dbq.n;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 31 */     aag aag = ☃.c();
/*    */     
/* 33 */     if (this.a != null && this.a.booleanValue() != aag.X()) {
/* 34 */       return false;
/*    */     }
/*    */     
/* 37 */     if (this.b != null && this.b.booleanValue() != aag.W()) {
/* 38 */       return false;
/*    */     }
/*    */     
/* 41 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static class b
/*    */     implements cze<dbx>
/*    */   {
/*    */     public void a(JsonObject ☃, dbx dbx1, JsonSerializationContext jsonSerializationContext) {
/* 74 */       ☃.addProperty("raining", dbx.a(dbx1));
/* 75 */       ☃.addProperty("thundering", dbx.b(dbx1));
/*    */     }
/*    */ 
/*    */     
/*    */     public dbx b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 80 */       Boolean bool1 = ☃.has("raining") ? Boolean.valueOf(afd.j(☃, "raining")) : null;
/* 81 */       Boolean bool2 = ☃.has("thundering") ? Boolean.valueOf(afd.j(☃, "thundering")) : null;
/* 82 */       return new dbx(bool1, bool2);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */