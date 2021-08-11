/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class a
/*     */   implements jf
/*     */ {
/*     */   private final vk b;
/*     */   private final blx c;
/*     */   private final int d;
/*     */   private final String e;
/*     */   private final List<String> f;
/*     */   private final Map<Character, bon> g;
/*     */   private final y.a h;
/*     */   private final vk i;
/*     */   
/*     */   public a(jh paramjh, vk ☃, blx blx1, int i, String str, List<String> list, Map<Character, bon> map, y.a a1, vk vk1) {
/* 153 */     this.b = ☃;
/* 154 */     this.c = blx1;
/* 155 */     this.d = i;
/* 156 */     this.e = str;
/* 157 */     this.f = list;
/* 158 */     this.g = map;
/* 159 */     this.h = a1;
/* 160 */     this.i = vk1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(JsonObject ☃) {
/* 165 */     if (!this.e.isEmpty()) {
/* 166 */       ☃.addProperty("group", this.e);
/*     */     }
/*     */     
/* 169 */     JsonArray jsonArray = new JsonArray();
/* 170 */     for (String str : this.f) {
/* 171 */       jsonArray.add(str);
/*     */     }
/* 173 */     ☃.add("pattern", (JsonElement)jsonArray);
/*     */     
/* 175 */     JsonObject jsonObject1 = new JsonObject();
/* 176 */     for (Map.Entry<Character, bon> entry : this.g.entrySet()) {
/* 177 */       jsonObject1.add(String.valueOf(entry.getKey()), ((bon)entry.getValue()).c());
/*     */     }
/* 179 */     ☃.add("key", (JsonElement)jsonObject1);
/*     */     
/* 181 */     JsonObject jsonObject2 = new JsonObject();
/* 182 */     jsonObject2.addProperty("item", gm.T.b(this.c).toString());
/* 183 */     if (this.d > 1) {
/* 184 */       jsonObject2.addProperty("count", Integer.valueOf(this.d));
/*     */     }
/* 186 */     ☃.add("result", (JsonElement)jsonObject2);
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> c() {
/* 191 */     return bos.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk b() {
/* 196 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonObject d() {
/* 202 */     return this.h.b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public vk e() {
/* 208 */     return this.i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jh$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */