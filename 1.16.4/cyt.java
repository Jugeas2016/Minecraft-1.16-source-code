/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cyt
/*     */ {
/*     */   public static class a<E, T extends czf<E>>
/*     */   {
/*     */     private final gm<T> a;
/*     */     private final String b;
/*     */     private final String c;
/*     */     private final Function<E, T> d;
/*     */     @Nullable
/*     */     private Pair<T, cyt.b<? extends E>> e;
/*     */     
/*     */     private a(gm<T> ☃, String str1, String str2, Function<E, T> function) {
/*  33 */       this.a = ☃;
/*  34 */       this.b = str1;
/*  35 */       this.c = str2;
/*  36 */       this.d = function;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Object a() {
/*  45 */       return new cyt.c<>(this.a, this.b, this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */   
/*     */   public static <E, T extends czf<E>> a<E, T> a(gm<T> ☃, String str1, String str2, Function<E, T> function) {
/*  50 */     return new a<>(☃, str1, str2, function);
/*     */   }
/*     */ 
/*     */   
/*     */   static class c<E, T extends czf<E>>
/*     */     implements JsonDeserializer<E>, JsonSerializer<E>
/*     */   {
/*     */     private final gm<T> a;
/*     */     private final String b;
/*     */     private final String c;
/*     */     private final Function<E, T> d;
/*     */     @Nullable
/*     */     private final Pair<T, cyt.b<? extends E>> e;
/*     */     
/*     */     private c(gm<T> ☃, String str1, String str2, Function<E, T> function, @Nullable Pair<T, cyt.b<? extends E>> pair) {
/*  65 */       this.a = ☃;
/*  66 */       this.b = str1;
/*  67 */       this.c = str2;
/*  68 */       this.d = function;
/*  69 */       this.e = pair;
/*     */     }
/*     */ 
/*     */     
/*     */     public E deserialize(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  74 */       if (☃.isJsonObject()) {
/*  75 */         JsonObject jsonObject = afd.m(☃, this.b);
/*  76 */         vk vk = new vk(afd.h(jsonObject, this.c));
/*     */         
/*  78 */         czf<E> czf = (czf)this.a.a(vk);
/*  79 */         if (czf == null) {
/*  80 */           throw new JsonSyntaxException("Unknown type '" + vk + "'");
/*     */         }
/*     */         
/*  83 */         return czf.a().a(jsonObject, jsonDeserializationContext);
/*     */       } 
/*     */       
/*  86 */       if (this.e == null) {
/*  87 */         throw new UnsupportedOperationException("Object " + ☃ + " can't be deserialized");
/*     */       }
/*  89 */       return ((cyt.b<E>)this.e.getSecond()).a(☃, jsonDeserializationContext);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public JsonElement serialize(E ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/*  95 */       czf<E> czf = (czf)this.d.apply(☃);
/*  96 */       if (this.e != null && this.e.getFirst() == czf) {
/*  97 */         return ((cyt.b<E>)this.e.getSecond()).a(☃, jsonSerializationContext);
/*     */       }
/*     */       
/* 100 */       if (czf == null) {
/* 101 */         throw new JsonSyntaxException("Unknown type: " + ☃);
/*     */       }
/*     */       
/* 104 */       JsonObject jsonObject = new JsonObject();
/* 105 */       jsonObject.addProperty(this.c, this.a.b((T)czf).toString());
/* 106 */       czf.a().a(jsonObject, ☃, jsonSerializationContext);
/* 107 */       return (JsonElement)jsonObject;
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface b<T> {
/*     */     JsonElement a(T param1T, JsonSerializationContext param1JsonSerializationContext);
/*     */     
/*     */     T a(JsonElement param1JsonElement, JsonDeserializationContext param1JsonDeserializationContext);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */