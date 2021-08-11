/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.lang.reflect.Type;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agu
/*     */   extends ajv
/*     */ {
/*     */   public agu(Schema ☃, boolean bool) {
/*  24 */     super(☃, bool, "BlockEntitySignTextStrictJsonFix", akn.k, "Sign");
/*     */   }
/*     */   
/*  27 */   public static final Gson a = (new GsonBuilder())
/*  28 */     .registerTypeAdapter(nr.class, new JsonDeserializer<nr>()
/*     */       {
/*     */         public nx a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  31 */           if (☃.isJsonPrimitive())
/*     */           {
/*  33 */             return new oe(☃.getAsString()); } 
/*  34 */           if (☃.isJsonArray()) {
/*     */             
/*  36 */             JsonArray jsonArray = ☃.getAsJsonArray();
/*  37 */             nx nx = null;
/*     */             
/*  39 */             for (JsonElement jsonElement : jsonArray) {
/*  40 */               nx nx1 = a(jsonElement, jsonElement.getClass(), jsonDeserializationContext);
/*  41 */               if (nx == null) {
/*  42 */                 nx = nx1; continue;
/*     */               } 
/*  44 */               nx.a(nx1);
/*     */             } 
/*     */ 
/*     */             
/*  48 */             return nx;
/*     */           } 
/*  50 */           throw new JsonParseException("Don't know how to turn " + ☃ + " into a Component");
/*     */         }
/*  54 */       }).create();
/*     */   
/*     */   private Dynamic<?> a(Dynamic<?> ☃, String str) {
/*  57 */     String str1 = ☃.get(str).asString("");
/*     */     
/*  59 */     nr nr = null;
/*  60 */     if ("null".equals(str1) || StringUtils.isEmpty(str1)) {
/*  61 */       nr = oe.d;
/*  62 */     } else if ((str1
/*  63 */       .charAt(0) == '"' && str1.charAt(str1.length() - 1) == '"') || (str1
/*  64 */       .charAt(0) == '{' && str1.charAt(str1.length() - 1) == '}')) {
/*     */       
/*     */       try {
/*  67 */         nr = afd.<nr>a(a, str1, nr.class, true);
/*  68 */         if (nr == null) {
/*  69 */           nr = oe.d;
/*     */         }
/*  71 */       } catch (JsonParseException jsonParseException) {}
/*     */ 
/*     */       
/*  74 */       if (nr == null) {
/*     */         try {
/*  76 */           nr = nr.a.a(str1);
/*  77 */         } catch (JsonParseException jsonParseException) {}
/*     */       }
/*     */ 
/*     */       
/*  81 */       if (nr == null) {
/*     */         try {
/*  83 */           nr = nr.a.b(str1);
/*  84 */         } catch (JsonParseException jsonParseException) {}
/*     */       }
/*     */ 
/*     */       
/*  88 */       if (nr == null) {
/*  89 */         nr = new oe(str1);
/*     */       }
/*     */     } else {
/*  92 */       nr = new oe(str1);
/*     */     } 
/*     */     
/*  95 */     return ☃.set(str, ☃.createString(nr.a.a(nr)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected Typed<?> a(Typed<?> ☃) {
/* 100 */     return ☃.update(DSL.remainderFinder(), ☃ -> {
/*     */           ☃ = a(☃, "Text1");
/*     */           ☃ = a(☃, "Text2");
/*     */           ☃ = a(☃, "Text3");
/*     */           return a(☃, "Text4");
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */