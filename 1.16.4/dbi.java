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
/*    */ public class dbi
/*    */   implements dbo
/*    */ {
/*    */   private final aw a;
/*    */   
/*    */   private dbi(aw ☃) {
/* 20 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 25 */     return dbq.l;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 30 */     return (Set<daz<?>>)ImmutableSet.of(dbc.f, dbc.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 35 */     apk apk = ☃.<apk>c(dbc.c);
/* 36 */     dcn dcn = ☃.<dcn>c(dbc.f);
/*    */     
/* 38 */     return (dcn != null && apk != null && this.a.a(☃.c(), dcn, apk));
/*    */   }
/*    */   
/*    */   public static dbo.a a(aw.a ☃) {
/* 42 */     return () -> new dbi(☃.b());
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements cze<dbi> {
/*    */     public void a(JsonObject ☃, dbi dbi1, JsonSerializationContext jsonSerializationContext) {
/* 48 */       ☃.add("predicate", dbi.a(dbi1).a());
/*    */     }
/*    */ 
/*    */     
/*    */     public dbi b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 53 */       aw aw = aw.a(☃.get("predicate"));
/* 54 */       return new dbi(aw);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */