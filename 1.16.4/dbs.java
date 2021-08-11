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
/*    */ public class dbs
/*    */   implements dbo
/*    */ {
/* 14 */   private static final dbs a = new dbs();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 21 */     return dbq.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 26 */     return (Set<daz<?>>)ImmutableSet.of(dbc.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 31 */     return ☃.a(dbc.b);
/*    */   }
/*    */   
/*    */   public static dbo.a c() {
/* 35 */     return () -> a;
/*    */   }
/*    */ 
/*    */   
/*    */   public static class a
/*    */     implements cze<dbs>
/*    */   {
/*    */     public void a(JsonObject ☃, dbs dbs1, JsonSerializationContext jsonSerializationContext) {}
/*    */     
/*    */     public dbs b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 45 */       return dbs.d();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */