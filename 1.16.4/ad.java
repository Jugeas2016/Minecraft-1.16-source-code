/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ad
/*    */ {
/*    */   private final ag a;
/*    */   
/*    */   public ad(ag ☃) {
/* 20 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public ad() {
/* 24 */     this.a = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) {}
/*    */   
/*    */   public static ad a(JsonObject ☃, ax ax1) {
/* 31 */     vk vk = new vk(afd.h(☃, "trigger"));
/* 32 */     af<?> af = ac.a(vk);
/* 33 */     if (af == null) {
/* 34 */       throw new JsonSyntaxException("Invalid criterion trigger: " + vk);
/*    */     }
/* 36 */     ag ag1 = (ag)af.a(afd.a(☃, "conditions", new JsonObject()), ax1);
/* 37 */     return new ad(ag1);
/*    */   }
/*    */   
/*    */   public static ad b(nf ☃) {
/* 41 */     return new ad();
/*    */   }
/*    */   
/*    */   public static Map<String, ad> b(JsonObject ☃, ax ax1) {
/* 45 */     Map<String, ad> map = Maps.newHashMap();
/* 46 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)☃.entrySet()) {
/* 47 */       map.put(entry.getKey(), a(afd.m(entry.getValue(), "criterion"), ax1));
/*    */     }
/* 49 */     return map;
/*    */   }
/*    */   
/*    */   public static Map<String, ad> c(nf ☃) {
/* 53 */     Map<String, ad> map = Maps.newHashMap();
/* 54 */     int i = ☃.i();
/* 55 */     for (int j = 0; j < i; j++) {
/* 56 */       map.put(☃.e(32767), b(☃));
/*    */     }
/* 58 */     return map;
/*    */   }
/*    */   
/*    */   public static void a(Map<String, ad> ☃, nf nf1) {
/* 62 */     nf1.d(☃.size());
/* 63 */     for (Map.Entry<String, ad> entry : ☃.entrySet()) {
/* 64 */       nf1.a(entry.getKey());
/* 65 */       ((ad)entry.getValue()).a(nf1);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public ag a() {
/* 71 */     return this.a;
/*    */   }
/*    */   
/*    */   public JsonElement b() {
/* 75 */     JsonObject ☃ = new JsonObject();
/* 76 */     ☃.addProperty("trigger", this.a.a().toString());
/* 77 */     JsonObject jsonObject1 = this.a.a(ci.a);
/* 78 */     if (jsonObject1.size() != 0) {
/* 79 */       ☃.add("conditions", (JsonElement)jsonObject1);
/*    */     }
/* 81 */     return (JsonElement)☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */