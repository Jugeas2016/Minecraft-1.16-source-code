/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dbv
/*    */   implements dbo
/*    */ {
/*    */   private final bq a;
/*    */   
/*    */   public dbv(bq ☃) {
/* 19 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 24 */     return dbq.i;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 29 */     return (Set<daz<?>>)ImmutableSet.of(dbc.i);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 34 */     bmb bmb = ☃.<bmb>c(dbc.i);
/* 35 */     return (bmb != null && this.a.a(bmb));
/*    */   }
/*    */   
/*    */   public static dbo.a a(bq.a ☃) {
/* 39 */     return () -> new dbv(☃.b());
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements cze<dbv> {
/*    */     public void a(JsonObject ☃, dbv dbv1, JsonSerializationContext jsonSerializationContext) {
/* 45 */       ☃.add("predicate", dbv.a(dbv1).a());
/*    */     }
/*    */ 
/*    */     
/*    */     public dbv b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 50 */       bq bq = bq.a(☃.get("predicate"));
/* 51 */       return new dbv(bq);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */