/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.lang.reflect.Type;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   implements JsonDeserializer<ebm>
/*     */ {
/*     */   public ebm a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  96 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*     */     
/*  98 */     ebl ebl1 = a(jsonDeserializationContext, jsonObject, "thirdperson_righthand");
/*  99 */     ebl ebl2 = a(jsonDeserializationContext, jsonObject, "thirdperson_lefthand");
/* 100 */     if (ebl2 == ebl.a) {
/* 101 */       ebl2 = ebl1;
/*     */     }
/* 103 */     ebl ebl3 = a(jsonDeserializationContext, jsonObject, "firstperson_righthand");
/* 104 */     ebl ebl4 = a(jsonDeserializationContext, jsonObject, "firstperson_lefthand");
/* 105 */     if (ebl4 == ebl.a) {
/* 106 */       ebl4 = ebl3;
/*     */     }
/* 108 */     ebl ebl5 = a(jsonDeserializationContext, jsonObject, "head");
/* 109 */     ebl ebl6 = a(jsonDeserializationContext, jsonObject, "gui");
/* 110 */     ebl ebl7 = a(jsonDeserializationContext, jsonObject, "ground");
/* 111 */     ebl ebl8 = a(jsonDeserializationContext, jsonObject, "fixed");
/*     */     
/* 113 */     return new ebm(ebl2, ebl1, ebl4, ebl3, ebl5, ebl6, ebl7, ebl8);
/*     */   }
/*     */   
/*     */   private ebl a(JsonDeserializationContext ☃, JsonObject jsonObject, String str) {
/* 117 */     if (jsonObject.has(str)) {
/* 118 */       return (ebl)☃.deserialize(jsonObject.get(str), ebl.class);
/*     */     }
/* 120 */     return ebl.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */