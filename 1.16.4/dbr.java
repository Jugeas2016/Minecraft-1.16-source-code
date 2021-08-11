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
/*    */ 
/*    */ 
/*    */ public class dbr
/*    */   implements dbo
/*    */ {
/*    */   private final bg a;
/*    */   private final cyv.c b;
/*    */   
/*    */   private dbr(bg ☃, cyv.c c1) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = c1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 28 */     return dbq.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 33 */     return (Set<daz<?>>)ImmutableSet.of(dbc.f, this.b.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 38 */     aqa aqa = ☃.<aqa>c((daz)this.b.a());
/* 39 */     dcn dcn = ☃.<dcn>c(dbc.f);
/* 40 */     return this.a.a(☃.c(), dcn, aqa);
/*    */   }
/*    */   
/*    */   public static dbo.a a(cyv.c ☃) {
/* 44 */     return a(☃, bg.a.a());
/*    */   }
/*    */   
/*    */   public static dbo.a a(cyv.c ☃, bg.a a1) {
/* 48 */     return () -> new dbr(☃.b(), c1);
/*    */   }
/*    */   
/*    */   public static dbo.a a(cyv.c ☃, bg bg1) {
/* 52 */     return () -> new dbr(☃, c1);
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements cze<dbr> {
/*    */     public void a(JsonObject ☃, dbr dbr1, JsonSerializationContext jsonSerializationContext) {
/* 58 */       ☃.add("predicate", dbr.a(dbr1).a());
/* 59 */       ☃.add("entity", jsonSerializationContext.serialize(dbr.b(dbr1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dbr b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 64 */       bg bg = bg.a(☃.get("predicate"));
/* 65 */       return new dbr(bg, afd.<cyv.c>a(☃, "entity", jsonDeserializationContext, cyv.c.class));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */