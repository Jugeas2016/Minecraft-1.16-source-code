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
/*    */ public class dbl
/*    */   implements dbo
/*    */ {
/*    */   private final dbo a;
/*    */   
/*    */   private dbl(dbo ☃) {
/* 17 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 22 */     return dbq.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public final boolean a(cyv ☃) {
/* 27 */     return !this.a.test(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 32 */     return this.a.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 37 */     super.a(☃);
/* 38 */     this.a.a(☃);
/*    */   }
/*    */   
/*    */   public static dbo.a a(dbo.a ☃) {
/* 42 */     dbl dbl1 = new dbl(☃.build());
/* 43 */     return () -> ☃;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements cze<dbl> {
/*    */     public void a(JsonObject ☃, dbl dbl1, JsonSerializationContext jsonSerializationContext) {
/* 49 */       ☃.add("term", jsonSerializationContext.serialize(dbl.a(dbl1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dbl b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 54 */       dbo dbo = afd.<dbo>a(☃, "term", jsonDeserializationContext, dbo.class);
/* 55 */       return new dbl(dbo);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */