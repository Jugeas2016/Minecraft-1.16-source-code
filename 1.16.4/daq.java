/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class daq
/*    */   extends dai
/*    */ {
/*    */   private final czb a;
/*    */   
/*    */   private daq(dbo[] ☃, czb czb1) {
/* 16 */     super(☃);
/* 17 */     this.a = czb1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 22 */     return dal.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 27 */     ☃.e(this.a.a(cyv1.a()));
/* 28 */     return ☃;
/*    */   }
/*    */   
/*    */   public static dai.a<?> a(czb ☃) {
/* 32 */     return a(arrayOfDbo -> new daq(arrayOfDbo, ☃));
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends dai.c<daq> {
/*    */     public void a(JsonObject ☃, daq daq1, JsonSerializationContext jsonSerializationContext) {
/* 38 */       super.a(☃, daq1, jsonSerializationContext);
/*    */       
/* 40 */       ☃.add("count", czc.a(daq.a(daq1), jsonSerializationContext));
/*    */     }
/*    */ 
/*    */     
/*    */     public daq a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 45 */       czb czb = czc.a(☃.get("count"), jsonDeserializationContext);
/* 46 */       return new daq(arrayOfDbo, czb);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\daq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */