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
/*    */ 
/*    */ 
/*    */ public class dbw
/*    */   implements dbo
/*    */ {
/*    */   @Nullable
/*    */   private final Long a;
/*    */   private final czd b;
/*    */   
/*    */   private dbw(@Nullable Long ☃, czd czd1) {
/* 21 */     this.a = ☃;
/* 22 */     this.b = czd1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 27 */     return dbq.p;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 32 */     aag aag = ☃.c();
/*    */     
/* 34 */     long l = aag.U();
/*    */     
/* 36 */     if (this.a != null) {
/* 37 */       l %= this.a.longValue();
/*    */     }
/*    */     
/* 40 */     return this.b.a((int)l);
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
/*    */   public static class b
/*    */     implements cze<dbw>
/*    */   {
/*    */     public void a(JsonObject ☃, dbw dbw1, JsonSerializationContext jsonSerializationContext) {
/* 71 */       ☃.addProperty("period", dbw.a(dbw1));
/* 72 */       ☃.add("value", jsonSerializationContext.serialize(dbw.b(dbw1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dbw b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 77 */       Long long_ = ☃.has("period") ? Long.valueOf(afd.m(☃, "period")) : null;
/* 78 */       czd czd = afd.<czd>a(☃, "value", jsonDeserializationContext, czd.class);
/* 79 */       return new dbw(long_, czd);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */