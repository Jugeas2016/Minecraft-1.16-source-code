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
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ebu
/*     */ {
/*     */   private final ebq a;
/*     */   private final ebn b;
/*     */   
/*     */   public ebu(ebq ☃, ebn ebn1) {
/*  28 */     if (☃ == null) {
/*  29 */       throw new IllegalArgumentException("Missing condition for selector");
/*     */     }
/*  31 */     if (ebn1 == null) {
/*  32 */       throw new IllegalArgumentException("Missing variant for selector");
/*     */     }
/*  34 */     this.a = ☃;
/*  35 */     this.b = ebn1;
/*     */   }
/*     */   
/*     */   public ebn a() {
/*  39 */     return this.b;
/*     */   }
/*     */   
/*     */   public Predicate<ceh> a(cei<buo, ceh> ☃) {
/*  43 */     return this.a.getPredicate(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  48 */     return (this == ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  53 */     return System.identityHashCode(this);
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<ebu> {
/*     */     public ebu a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  59 */       JsonObject jsonObject = ☃.getAsJsonObject();
/*     */       
/*  61 */       return new ebu(b(jsonObject), (ebn)jsonDeserializationContext.deserialize(jsonObject.get("apply"), ebn.class));
/*     */     }
/*     */     
/*     */     private ebq b(JsonObject ☃) {
/*  65 */       if (☃.has("when")) {
/*  66 */         return a(afd.t(☃, "when"));
/*     */       }
/*     */       
/*  69 */       return ebq.a;
/*     */     }
/*     */     
/*     */     @VisibleForTesting
/*     */     static ebq a(JsonObject ☃) {
/*  74 */       Set<Map.Entry<String, JsonElement>> set = ☃.entrySet();
/*     */       
/*  76 */       if (set.isEmpty()) {
/*  77 */         throw new JsonParseException("No elements found in selector");
/*     */       }
/*     */       
/*  80 */       if (set.size() == 1) {
/*  81 */         if (☃.has("OR")) {
/*     */ 
/*     */           
/*  84 */           List<ebq> list = (List<ebq>)Streams.stream((Iterable)afd.u(☃, "OR")).map(☃ -> a(☃.getAsJsonObject())).collect(Collectors.toList());
/*  85 */           return new ebt(list);
/*  86 */         }  if (☃.has("AND")) {
/*     */ 
/*     */           
/*  89 */           List<ebq> list = (List<ebq>)Streams.stream((Iterable)afd.u(☃, "AND")).map(☃ -> a(☃.getAsJsonObject())).collect(Collectors.toList());
/*  90 */           return new ebp(list);
/*     */         } 
/*  92 */         return a(set.iterator().next());
/*     */       } 
/*     */       
/*  95 */       return new ebp((Iterable<? extends ebq>)set.stream().map(a::a).collect(Collectors.toList()));
/*     */     }
/*     */ 
/*     */     
/*     */     private static ebq a(Map.Entry<String, JsonElement> ☃) {
/* 100 */       return new ebr(☃.getKey(), ((JsonElement)☃.getValue()).getAsString());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */