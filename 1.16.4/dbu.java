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
/*    */ public class dbu
/*    */   implements dbo
/*    */ {
/*    */   private final float a;
/*    */   private final float b;
/*    */   
/*    */   private dbu(float ☃, float f1) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = f1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 28 */     return dbq.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 33 */     return (Set<daz<?>>)ImmutableSet.of(dbc.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 38 */     aqa aqa = ☃.<aqa>c(dbc.d);
/*    */     
/* 40 */     int i = 0;
/* 41 */     if (aqa instanceof aqm) {
/* 42 */       i = bpu.g((aqm)aqa);
/*    */     }
/* 44 */     return (☃.a().nextFloat() < this.a + i * this.b);
/*    */   }
/*    */   
/*    */   public static dbo.a a(float ☃, float f1) {
/* 48 */     return () -> new dbu(☃, f1);
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements cze<dbu> {
/*    */     public void a(JsonObject ☃, dbu dbu1, JsonSerializationContext jsonSerializationContext) {
/* 54 */       ☃.addProperty("chance", Float.valueOf(dbu.a(dbu1)));
/* 55 */       ☃.addProperty("looting_multiplier", Float.valueOf(dbu.b(dbu1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dbu b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 60 */       return new dbu(afd.l(☃, "chance"), afd.l(☃, "looting_multiplier"));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */