/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dbk
/*    */   implements dbo
/*    */ {
/* 15 */   private static final dbk a = new dbk();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 22 */     return dbq.k;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 27 */     return (Set<daz<?>>)ImmutableSet.of(dbc.j);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 32 */     Float float_ = ☃.<Float>c(dbc.j);
/* 33 */     if (float_ != null) {
/* 34 */       Random random = ☃.a();
/* 35 */       float f = 1.0F / float_.floatValue();
/* 36 */       return (random.nextFloat() <= f);
/*    */     } 
/*    */     
/* 39 */     return true;
/*    */   }
/*    */   
/*    */   public static dbo.a c() {
/* 43 */     return () -> a;
/*    */   }
/*    */ 
/*    */   
/*    */   public static class a
/*    */     implements cze<dbk>
/*    */   {
/*    */     public void a(JsonObject ☃, dbk dbk1, JsonSerializationContext jsonSerializationContext) {}
/*    */     
/*    */     public dbk b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 53 */       return dbk.d();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */