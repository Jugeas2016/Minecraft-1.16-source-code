/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.List;
/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ems
/*    */   implements JsonDeserializer<emr>
/*    */ {
/*    */   public emr a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 19 */     JsonObject jsonObject = afd.m(☃, "entry");
/*    */     
/* 21 */     boolean bool = afd.a(jsonObject, "replace", false);
/* 22 */     String str = afd.a(jsonObject, "subtitle", (String)null);
/* 23 */     List<emq> list = a(jsonObject);
/*    */     
/* 25 */     return new emr(list, bool, str);
/*    */   }
/*    */   
/*    */   private List<emq> a(JsonObject ☃) {
/* 29 */     List<emq> list = Lists.newArrayList();
/*    */     
/* 31 */     if (☃.has("sounds")) {
/* 32 */       JsonArray jsonArray = afd.u(☃, "sounds");
/* 33 */       for (int i = 0; i < jsonArray.size(); i++) {
/* 34 */         JsonElement jsonElement = jsonArray.get(i);
/*    */         
/* 36 */         if (afd.a(jsonElement)) {
/* 37 */           String str = afd.a(jsonElement, "sound");
/* 38 */           list.add(new emq(str, 1.0F, 1.0F, 1, emq.a.a, false, false, 16));
/*    */         } else {
/* 40 */           list.add(b(afd.m(jsonElement, "sound")));
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 45 */     return list;
/*    */   }
/*    */   
/*    */   private emq b(JsonObject ☃) {
/* 49 */     String str = afd.h(☃, "name");
/*    */     
/* 51 */     emq.a a = a(☃, emq.a.a);
/*    */     
/* 53 */     float f1 = afd.a(☃, "volume", 1.0F);
/* 54 */     Validate.isTrue((f1 > 0.0F), "Invalid volume", new Object[0]);
/*    */     
/* 56 */     float f2 = afd.a(☃, "pitch", 1.0F);
/* 57 */     Validate.isTrue((f2 > 0.0F), "Invalid pitch", new Object[0]);
/*    */     
/* 59 */     int i = afd.a(☃, "weight", 1);
/* 60 */     Validate.isTrue((i > 0), "Invalid weight", new Object[0]);
/*    */     
/* 62 */     boolean bool1 = afd.a(☃, "preload", false);
/*    */     
/* 64 */     boolean bool2 = afd.a(☃, "stream", false);
/*    */     
/* 66 */     int j = afd.a(☃, "attenuation_distance", 16);
/*    */     
/* 68 */     return new emq(str, f1, f2, i, a, bool2, bool1, j);
/*    */   }
/*    */   
/*    */   private emq.a a(JsonObject ☃, emq.a a1) {
/* 72 */     emq.a a2 = a1;
/* 73 */     if (☃.has("type")) {
/* 74 */       a2 = emq.a.a(afd.h(☃, "type"));
/* 75 */       Validate.notNull(a2, "Invalid type", new Object[0]);
/*    */     } 
/* 77 */     return a2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ems.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */