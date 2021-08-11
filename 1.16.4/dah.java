/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dah
/*    */   extends dai
/*    */ {
/*    */   private final cyu a;
/*    */   
/*    */   private dah(dbo[] ☃, cyu cyu1) {
/* 16 */     super(☃);
/* 17 */     this.a = cyu1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 22 */     return dal.o;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 27 */     int i = this.a.applyAsInt(☃.E());
/* 28 */     ☃.e(i);
/* 29 */     return ☃;
/*    */   }
/*    */   
/*    */   public static dai.a<?> a(cyu ☃) {
/* 33 */     return a(arrayOfDbo -> new dah(arrayOfDbo, ☃));
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends dai.c<dah> {
/*    */     public void a(JsonObject ☃, dah dah1, JsonSerializationContext jsonSerializationContext) {
/* 39 */       super.a(☃, dah1, jsonSerializationContext);
/*    */       
/* 41 */       ☃.add("limit", jsonSerializationContext.serialize(dah.a(dah1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dah a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 46 */       cyu cyu = afd.<cyu>a(☃, "limit", jsonDeserializationContext, cyu.class);
/* 47 */       return new dah(arrayOfDbo, cyu);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */