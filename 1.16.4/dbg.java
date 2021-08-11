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
/*    */ public class dbg
/*    */   implements dbo
/*    */ {
/* 14 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final vk b;
/*    */   
/*    */   private dbg(vk ☃) {
/* 19 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 24 */     return dbq.o;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 29 */     if (☃.b(this.b)) {
/* 30 */       ☃.a("Condition " + this.b + " is recursively called");
/*    */       
/*    */       return;
/*    */     } 
/* 34 */     super.a(☃);
/*    */     
/* 36 */     dbo dbo1 = ☃.d(this.b);
/* 37 */     if (dbo1 == null) {
/* 38 */       ☃.a("Unknown condition table called " + this.b);
/*    */     } else {
/* 40 */       dbo1.a(☃.a(".{" + this.b + "}", this.b));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 46 */     dbo dbo1 = ☃.b(this.b);
/* 47 */     if (☃.a(dbo1)) {
/*    */       try {
/* 49 */         return dbo1.test(☃);
/*    */       } finally {
/* 51 */         ☃.b(dbo1);
/*    */       } 
/*    */     }
/* 54 */     a.warn("Detected infinite loop in loot tables");
/* 55 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static class a
/*    */     implements cze<dbg>
/*    */   {
/*    */     public void a(JsonObject ☃, dbg dbg1, JsonSerializationContext jsonSerializationContext) {
/* 66 */       ☃.addProperty("name", dbg.a(dbg1).toString());
/*    */     }
/*    */ 
/*    */     
/*    */     public dbg b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 71 */       vk vk = new vk(afd.h(☃, "name"));
/* 72 */       return new dbg(vk);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */