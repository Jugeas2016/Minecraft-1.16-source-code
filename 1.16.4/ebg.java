/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.io.Reader;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class ebg
/*     */ {
/*     */   public static final class a
/*     */   {
/*  33 */     protected final Gson a = (new GsonBuilder())
/*  34 */       .registerTypeAdapter(ebg.class, new ebg.b())
/*  35 */       .registerTypeAdapter(ebo.class, new ebo.a())
/*  36 */       .registerTypeAdapter(ebn.class, new ebn.a())
/*  37 */       .registerTypeAdapter(ebs.class, new ebs.a(this))
/*  38 */       .registerTypeAdapter(ebu.class, new ebu.a())
/*  39 */       .create();
/*     */     private cei<buo, ceh> b;
/*     */     
/*     */     public cei<buo, ceh> a() {
/*  43 */       return this.b;
/*     */     }
/*     */     
/*     */     public void a(cei<buo, ceh> ☃) {
/*  47 */       this.b = ☃;
/*     */     }
/*     */   }
/*     */   
/*  51 */   private final Map<String, ebn> a = Maps.newLinkedHashMap();
/*     */   private ebs b;
/*     */   
/*     */   public static ebg a(a ☃, Reader reader) {
/*  55 */     return afd.<ebg>a(☃.a, reader, ebg.class);
/*     */   }
/*     */   
/*     */   public ebg(Map<String, ebn> ☃, ebs ebs1) {
/*  59 */     this.b = ebs1;
/*  60 */     this.a.putAll(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ebg(List<ebg> ☃) {
/*  65 */     ebg ebg1 = null;
/*  66 */     for (ebg ebg2 : ☃) {
/*  67 */       if (ebg2.c()) {
/*  68 */         this.a.clear();
/*  69 */         ebg1 = ebg2;
/*     */       } 
/*  71 */       this.a.putAll(ebg2.a);
/*     */     } 
/*     */     
/*  74 */     if (ebg1 != null) {
/*  75 */       this.b = ebg1.b;
/*     */     }
/*     */   }
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
/*     */   public boolean equals(Object ☃) {
/*  93 */     if (this == ☃) {
/*  94 */       return true;
/*     */     }
/*  96 */     if (☃ instanceof ebg) {
/*  97 */       ebg ebg1 = (ebg)☃;
/*     */       
/*  99 */       if (this.a.equals(ebg1.a)) {
/* 100 */         return c() ? this.b.equals(ebg1.b) : (!ebg1.c());
/*     */       }
/*     */     } 
/* 103 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 108 */     return 31 * this.a.hashCode() + (c() ? this.b.hashCode() : 0);
/*     */   }
/*     */   
/*     */   public Map<String, ebn> a() {
/* 112 */     return this.a;
/*     */   }
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
/*     */   public boolean c() {
/* 126 */     return (this.b != null);
/*     */   }
/*     */   
/*     */   public ebs d() {
/* 130 */     return this.b;
/*     */   }
/*     */   
/*     */   public static class b
/*     */     implements JsonDeserializer<ebg> {
/*     */     public ebg a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 136 */       JsonObject jsonObject = ☃.getAsJsonObject();
/*     */       
/* 138 */       Map<String, ebn> map = a(jsonDeserializationContext, jsonObject);
/* 139 */       ebs ebs = b(jsonDeserializationContext, jsonObject);
/*     */       
/* 141 */       if (map.isEmpty() && (ebs == null || ebs.b().isEmpty())) {
/* 142 */         throw new JsonParseException("Neither 'variants' nor 'multipart' found");
/*     */       }
/*     */       
/* 145 */       return new ebg(map, ebs);
/*     */     }
/*     */     
/*     */     protected Map<String, ebn> a(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 149 */       Map<String, ebn> map = Maps.newHashMap();
/*     */       
/* 151 */       if (jsonObject.has("variants")) {
/* 152 */         JsonObject jsonObject1 = afd.t(jsonObject, "variants");
/* 153 */         for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject1.entrySet()) {
/* 154 */           map.put(entry.getKey(), ☃.deserialize(entry.getValue(), ebn.class));
/*     */         }
/*     */       } 
/*     */       
/* 158 */       return map;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     protected ebs b(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 163 */       if (!jsonObject.has("multipart")) {
/* 164 */         return null;
/*     */       }
/*     */       
/* 167 */       JsonArray jsonArray = afd.u(jsonObject, "multipart");
/* 168 */       return (ebs)☃.deserialize((JsonElement)jsonArray, ebs.class);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */