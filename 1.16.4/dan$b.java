/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.UUID;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class b
/*     */ {
/*     */   private final String a;
/*     */   private final arg b;
/*     */   private final arj.a c;
/*     */   private final czd d;
/*     */   @Nullable
/*     */   private final UUID e;
/*     */   private final aqf[] f;
/*     */   
/*     */   private b(String ☃, arg arg1, arj.a a1, czd czd1, aqf[] arrayOfAqf, @Nullable UUID uUID) {
/* 155 */     this.a = ☃;
/* 156 */     this.b = arg1;
/* 157 */     this.c = a1;
/* 158 */     this.d = czd1;
/* 159 */     this.e = uUID;
/* 160 */     this.f = arrayOfAqf;
/*     */   }
/*     */   
/*     */   public JsonObject a(JsonSerializationContext ☃) {
/* 164 */     JsonObject jsonObject = new JsonObject();
/* 165 */     jsonObject.addProperty("name", this.a);
/* 166 */     jsonObject.addProperty("attribute", gm.af.b(this.b).toString());
/* 167 */     jsonObject.addProperty("operation", a(this.c));
/* 168 */     jsonObject.add("amount", ☃.serialize(this.d));
/* 169 */     if (this.e != null) {
/* 170 */       jsonObject.addProperty("id", this.e.toString());
/*     */     }
/* 172 */     if (this.f.length == 1) {
/* 173 */       jsonObject.addProperty("slot", this.f[0].d());
/*     */     } else {
/* 175 */       JsonArray jsonArray = new JsonArray();
/* 176 */       for (aqf aqf1 : this.f) {
/* 177 */         jsonArray.add((JsonElement)new JsonPrimitive(aqf1.d()));
/*     */       }
/* 179 */       jsonObject.add("slot", (JsonElement)jsonArray);
/*     */     } 
/* 181 */     return jsonObject;
/*     */   }
/*     */   public static b a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*     */     aqf[] arrayOfAqf;
/* 185 */     String str = afd.h(☃, "name");
/* 186 */     vk vk = new vk(afd.h(☃, "attribute"));
/* 187 */     arg arg1 = gm.af.a(vk);
/* 188 */     if (arg1 == null) {
/* 189 */       throw new JsonSyntaxException("Unknown attribute: " + vk);
/*     */     }
/* 191 */     arj.a a1 = a(afd.h(☃, "operation"));
/* 192 */     czd czd1 = afd.<czd>a(☃, "amount", jsonDeserializationContext, czd.class);
/*     */     
/* 194 */     UUID uUID = null;
/*     */     
/* 196 */     if (afd.a(☃, "slot")) {
/* 197 */       arrayOfAqf = new aqf[] { aqf.a(afd.h(☃, "slot")) };
/* 198 */     } else if (afd.d(☃, "slot")) {
/* 199 */       JsonArray jsonArray = afd.u(☃, "slot");
/* 200 */       arrayOfAqf = new aqf[jsonArray.size()];
/* 201 */       int i = 0;
/* 202 */       for (JsonElement jsonElement : jsonArray) {
/* 203 */         arrayOfAqf[i++] = aqf.a(afd.a(jsonElement, "slot"));
/*     */       }
/* 205 */       if (arrayOfAqf.length == 0) {
/* 206 */         throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
/*     */       }
/*     */     } else {
/* 209 */       throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
/*     */     } 
/*     */     
/* 212 */     if (☃.has("id")) {
/* 213 */       String str1 = afd.h(☃, "id");
/*     */       try {
/* 215 */         uUID = UUID.fromString(str1);
/* 216 */       } catch (IllegalArgumentException illegalArgumentException) {
/* 217 */         throw new JsonSyntaxException("Invalid attribute modifier id '" + str1 + "' (must be UUID format, with dashes)");
/*     */       } 
/*     */     } 
/*     */     
/* 221 */     return new b(str, arg1, a1, czd1, arrayOfAqf, uUID);
/*     */   }
/*     */   
/*     */   private static String a(arj.a ☃) {
/* 225 */     switch (dan.null.a[☃.ordinal()]) {
/*     */       case 1:
/* 227 */         return "addition";
/*     */       case 2:
/* 229 */         return "multiply_base";
/*     */       case 3:
/* 231 */         return "multiply_total";
/*     */     } 
/* 233 */     throw new IllegalArgumentException("Unknown operation " + ☃);
/*     */   }
/*     */   
/*     */   private static arj.a a(String ☃) {
/* 237 */     switch (☃) {
/*     */       case "addition":
/* 239 */         return arj.a.a;
/*     */       case "multiply_base":
/* 241 */         return arj.a.b;
/*     */       case "multiply_total":
/* 243 */         return arj.a.c;
/*     */     } 
/* 245 */     throw new JsonSyntaxException("Unknown attribute modifier operation " + ☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dan$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */