/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Streams;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.List;
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
/*     */ public class b
/*     */   extends dai.c<das>
/*     */ {
/*     */   public void a(JsonObject ☃, das das1, JsonSerializationContext jsonSerializationContext) {
/* 140 */     super.a(☃, das1, jsonSerializationContext);
/*     */     
/* 142 */     ☃.addProperty("replace", Boolean.valueOf(das.a(das1)));
/*     */     
/* 144 */     JsonArray jsonArray = new JsonArray();
/* 145 */     for (nr nr : das.b(das1)) {
/* 146 */       jsonArray.add(nr.a.b(nr));
/*     */     }
/* 148 */     ☃.add("lore", (JsonElement)jsonArray);
/*     */     
/* 150 */     if (das.c(das1) != null) {
/* 151 */       ☃.add("entity", jsonSerializationContext.serialize(das.c(das1)));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public das a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 157 */     boolean bool = afd.a(☃, "replace", false);
/* 158 */     List<nr> list = (List<nr>)Streams.stream((Iterable)afd.u(☃, "lore")).map(nr.a::a).collect(ImmutableList.toImmutableList());
/* 159 */     cyv.c c1 = afd.<cyv.c>a(☃, "entity", null, jsonDeserializationContext, cyv.c.class);
/* 160 */     return new das(arrayOfDbo, bool, list, c1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\das$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */