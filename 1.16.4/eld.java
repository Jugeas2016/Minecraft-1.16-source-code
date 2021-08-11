/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.util.List;
/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eld
/*    */   implements abn<elc>
/*    */ {
/*    */   public elc b(JsonObject ☃) {
/* 17 */     List<elb> list = Lists.newArrayList();
/* 18 */     int i = afd.a(☃, "frametime", 1);
/* 19 */     if (i != 1) {
/* 20 */       Validate.inclusiveBetween(1L, 2147483647L, i, "Invalid default frame time");
/*    */     }
/*    */     
/* 23 */     if (☃.has("frames")) {
/*    */       try {
/* 25 */         JsonArray jsonArray = afd.u(☃, "frames");
/*    */         
/* 27 */         for (int m = 0; m < jsonArray.size(); m++) {
/* 28 */           JsonElement jsonElement = jsonArray.get(m);
/*    */           
/* 30 */           elb elb = a(m, jsonElement);
/* 31 */           if (elb != null) {
/* 32 */             list.add(elb);
/*    */           }
/*    */         } 
/* 35 */       } catch (ClassCastException classCastException) {
/* 36 */         throw new JsonParseException("Invalid animation->frames: expected array, was " + ☃.get("frames"), classCastException);
/*    */       } 
/*    */     }
/*    */     
/* 40 */     int j = afd.a(☃, "width", -1);
/* 41 */     int k = afd.a(☃, "height", -1);
/*    */     
/* 43 */     if (j != -1) {
/* 44 */       Validate.inclusiveBetween(1L, 2147483647L, j, "Invalid width");
/*    */     }
/* 46 */     if (k != -1) {
/* 47 */       Validate.inclusiveBetween(1L, 2147483647L, k, "Invalid height");
/*    */     }
/*    */     
/* 50 */     boolean bool = afd.a(☃, "interpolate", false);
/*    */     
/* 52 */     return new elc(list, j, k, i, bool);
/*    */   }
/*    */   
/*    */   private elb a(int ☃, JsonElement jsonElement) {
/* 56 */     if (jsonElement.isJsonPrimitive())
/* 57 */       return new elb(afd.g(jsonElement, "frames[" + ☃ + "]")); 
/* 58 */     if (jsonElement.isJsonObject()) {
/* 59 */       JsonObject jsonObject = afd.m(jsonElement, "frames[" + ☃ + "]");
/* 60 */       int i = afd.a(jsonObject, "time", -1);
/* 61 */       if (jsonObject.has("time")) {
/* 62 */         Validate.inclusiveBetween(1L, 2147483647L, i, "Invalid frame time");
/*    */       }
/* 64 */       int j = afd.n(jsonObject, "index");
/* 65 */       Validate.inclusiveBetween(0L, 2147483647L, j, "Invalid frame index");
/* 66 */       return new elb(j, i);
/*    */     } 
/*    */     
/* 69 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String a() {
/* 75 */     return "animation";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eld.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */