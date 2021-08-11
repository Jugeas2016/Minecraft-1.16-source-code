/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.function.IntUnaryOperator;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cyu
/*    */   implements IntUnaryOperator
/*    */ {
/*    */   private final Integer a;
/*    */   private final Integer b;
/*    */   private final IntUnaryOperator c;
/*    */   
/*    */   private cyu(@Nullable Integer ☃, @Nullable Integer integer1) {
/* 24 */     this.a = ☃;
/* 25 */     this.b = integer1;
/*    */     
/* 27 */     if (☃ == null) {
/* 28 */       if (integer1 == null) {
/* 29 */         this.c = (☃ -> ☃);
/*    */       } else {
/* 31 */         int i = integer1.intValue();
/* 32 */         this.c = (i -> Math.min(☃, i));
/*    */       } 
/*    */     } else {
/* 35 */       int i = ☃.intValue();
/* 36 */       if (integer1 == null) {
/* 37 */         this.c = (i -> Math.max(☃, i));
/*    */       } else {
/* 39 */         int j = integer1.intValue();
/* 40 */         this.c = (j -> afm.a(j, ☃, i));
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static cyu a(int ☃, int i) {
/* 46 */     return new cyu(Integer.valueOf(☃), Integer.valueOf(i));
/*    */   }
/*    */   
/*    */   public static cyu a(int ☃) {
/* 50 */     return new cyu(Integer.valueOf(☃), null);
/*    */   }
/*    */   
/*    */   public static cyu b(int ☃) {
/* 54 */     return new cyu(null, Integer.valueOf(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public int applyAsInt(int ☃) {
/* 59 */     return this.c.applyAsInt(☃);
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements JsonDeserializer<cyu>, JsonSerializer<cyu> {
/*    */     public cyu a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 65 */       JsonObject jsonObject = afd.m(☃, "value");
/* 66 */       Integer integer1 = jsonObject.has("min") ? Integer.valueOf(afd.n(jsonObject, "min")) : null;
/* 67 */       Integer integer2 = jsonObject.has("max") ? Integer.valueOf(afd.n(jsonObject, "max")) : null;
/* 68 */       return new cyu(integer1, integer2);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonElement a(cyu ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 73 */       JsonObject jsonObject = new JsonObject();
/* 74 */       if (cyu.a(☃) != null) {
/* 75 */         jsonObject.addProperty("max", cyu.a(☃));
/*    */       }
/*    */       
/* 78 */       if (cyu.b(☃) != null) {
/* 79 */         jsonObject.addProperty("min", cyu.b(☃));
/*    */       }
/*    */       
/* 82 */       return (JsonElement)jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */