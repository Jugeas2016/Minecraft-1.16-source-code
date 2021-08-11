/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dar
/*    */   extends dai
/*    */ {
/* 16 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final czd b;
/*    */   
/*    */   private dar(dbo[] ☃, czd czd1) {
/* 21 */     super(☃);
/* 22 */     this.b = czd1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 27 */     return dal.h;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 32 */     if (☃.e()) {
/* 33 */       float f = 1.0F - this.b.b(cyv1.a());
/* 34 */       ☃.b(afm.d(f * ☃.h()));
/*    */     } else {
/* 36 */       a.warn("Couldn't set damage of loot item {}", ☃);
/*    */     } 
/* 38 */     return ☃;
/*    */   }
/*    */   
/*    */   public static dai.a<?> a(czd ☃) {
/* 42 */     return a(arrayOfDbo -> new dar(arrayOfDbo, ☃));
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends dai.c<dar> {
/*    */     public void a(JsonObject ☃, dar dar1, JsonSerializationContext jsonSerializationContext) {
/* 48 */       super.a(☃, dar1, jsonSerializationContext);
/*    */       
/* 50 */       ☃.add("damage", jsonSerializationContext.serialize(dar.a(dar1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dar a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 55 */       return new dar(arrayOfDbo, afd.<czd>a(☃, "damage", jsonDeserializationContext, czd.class));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */