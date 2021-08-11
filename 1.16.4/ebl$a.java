/*     */ import com.google.gson.JsonArray;
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
/*     */ public class a
/*     */   implements JsonDeserializer<ebl>
/*     */ {
/*  73 */   private static final g a = new g(0.0F, 0.0F, 0.0F);
/*  74 */   private static final g b = new g(0.0F, 0.0F, 0.0F);
/*  75 */   private static final g c = new g(1.0F, 1.0F, 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ebl a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  81 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*     */     
/*  83 */     g g1 = a(jsonObject, "rotation", a);
/*     */     
/*  85 */     g g2 = a(jsonObject, "translation", b);
/*  86 */     g2.b(0.0625F);
/*  87 */     g2.a(-5.0F, 5.0F);
/*     */     
/*  89 */     g g3 = a(jsonObject, "scale", c);
/*  90 */     g3.a(-4.0F, 4.0F);
/*     */     
/*  92 */     return new ebl(g1, g2, g3);
/*     */   }
/*     */   
/*     */   private g a(JsonObject ☃, String str, g g1) {
/*  96 */     if (!☃.has(str)) {
/*  97 */       return g1;
/*     */     }
/*  99 */     JsonArray jsonArray = afd.u(☃, str);
/* 100 */     if (jsonArray.size() != 3) {
/* 101 */       throw new JsonParseException("Expected 3 " + str + " values, found: " + jsonArray.size());
/*     */     }
/*     */     
/* 104 */     float[] arrayOfFloat = new float[3];
/* 105 */     for (int i = 0; i < arrayOfFloat.length; i++) {
/* 106 */       arrayOfFloat[i] = afd.e(jsonArray.get(i), str + "[" + i + "]");
/*     */     }
/* 108 */     return new g(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2]);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebl$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */