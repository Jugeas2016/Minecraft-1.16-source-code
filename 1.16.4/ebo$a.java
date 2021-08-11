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
/*     */ public class a
/*     */   implements JsonDeserializer<ebo>
/*     */ {
/*     */   public ebo a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  92 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*     */     
/*  94 */     vk vk = b(jsonObject);
/*  95 */     elp elp = a(jsonObject);
/*  96 */     boolean bool = d(jsonObject);
/*  97 */     int i = c(jsonObject);
/*     */     
/*  99 */     return new ebo(vk, elp.b(), bool, i);
/*     */   }
/*     */   
/*     */   private boolean d(JsonObject ☃) {
/* 103 */     return afd.a(☃, "uvlock", false);
/*     */   }
/*     */   
/*     */   protected elp a(JsonObject ☃) {
/* 107 */     int i = afd.a(☃, "x", 0);
/* 108 */     int j = afd.a(☃, "y", 0);
/*     */     
/* 110 */     elp elp = elp.a(i, j);
/* 111 */     if (elp == null) {
/* 112 */       throw new JsonParseException("Invalid BlockModelRotation x: " + i + ", y: " + j);
/*     */     }
/* 114 */     return elp;
/*     */   }
/*     */   
/*     */   protected vk b(JsonObject ☃) {
/* 118 */     return new vk(afd.h(☃, "model"));
/*     */   }
/*     */   
/*     */   protected int c(JsonObject ☃) {
/* 122 */     int i = afd.a(☃, "weight", 1);
/*     */     
/* 124 */     if (i < 1) {
/* 125 */       throw new JsonParseException("Invalid weight " + i + " found, expected integer >= 1");
/*     */     }
/* 127 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebo$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */