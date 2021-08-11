/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Streams;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collectors;
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
/*     */   implements JsonDeserializer<ebu>
/*     */ {
/*     */   public ebu a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  59 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*     */     
/*  61 */     return new ebu(b(jsonObject), (ebn)jsonDeserializationContext.deserialize(jsonObject.get("apply"), ebn.class));
/*     */   }
/*     */   
/*     */   private ebq b(JsonObject ☃) {
/*  65 */     if (☃.has("when")) {
/*  66 */       return a(afd.t(☃, "when"));
/*     */     }
/*     */     
/*  69 */     return ebq.a;
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   static ebq a(JsonObject ☃) {
/*  74 */     Set<Map.Entry<String, JsonElement>> set = ☃.entrySet();
/*     */     
/*  76 */     if (set.isEmpty()) {
/*  77 */       throw new JsonParseException("No elements found in selector");
/*     */     }
/*     */     
/*  80 */     if (set.size() == 1) {
/*  81 */       if (☃.has("OR")) {
/*     */ 
/*     */         
/*  84 */         List<ebq> list = (List<ebq>)Streams.stream((Iterable)afd.u(☃, "OR")).map(☃ -> a(☃.getAsJsonObject())).collect(Collectors.toList());
/*  85 */         return new ebt(list);
/*  86 */       }  if (☃.has("AND")) {
/*     */ 
/*     */         
/*  89 */         List<ebq> list = (List<ebq>)Streams.stream((Iterable)afd.u(☃, "AND")).map(☃ -> a(☃.getAsJsonObject())).collect(Collectors.toList());
/*  90 */         return new ebp(list);
/*     */       } 
/*  92 */       return a(set.iterator().next());
/*     */     } 
/*     */     
/*  95 */     return new ebp((Iterable<? extends ebq>)set.stream().map(a::a).collect(Collectors.toList()));
/*     */   }
/*     */ 
/*     */   
/*     */   private static ebq a(Map.Entry<String, JsonElement> ☃) {
/* 100 */     return new ebr(☃.getKey(), ((JsonElement)☃.getValue()).getAsString());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */