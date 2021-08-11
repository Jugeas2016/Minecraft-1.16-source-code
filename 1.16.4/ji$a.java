/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
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
/*     */ public class a
/*     */   implements jf
/*     */ {
/*     */   private final vk a;
/*     */   private final blx b;
/*     */   private final int c;
/*     */   private final String d;
/*     */   private final List<bon> e;
/*     */   private final y.a f;
/*     */   private final vk g;
/*     */   
/*     */   public a(vk ☃, blx blx1, int i, String str, List<bon> list, y.a a1, vk vk1) {
/* 121 */     this.a = ☃;
/* 122 */     this.b = blx1;
/* 123 */     this.c = i;
/* 124 */     this.d = str;
/* 125 */     this.e = list;
/* 126 */     this.f = a1;
/* 127 */     this.g = vk1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(JsonObject ☃) {
/* 132 */     if (!this.d.isEmpty()) {
/* 133 */       ☃.addProperty("group", this.d);
/*     */     }
/*     */     
/* 136 */     JsonArray jsonArray = new JsonArray();
/* 137 */     for (bon bon : this.e) {
/* 138 */       jsonArray.add(bon.c());
/*     */     }
/* 140 */     ☃.add("ingredients", (JsonElement)jsonArray);
/*     */     
/* 142 */     JsonObject jsonObject = new JsonObject();
/* 143 */     jsonObject.addProperty("item", gm.T.b(this.b).toString());
/* 144 */     if (this.c > 1) {
/* 145 */       jsonObject.addProperty("count", Integer.valueOf(this.c));
/*     */     }
/* 147 */     ☃.add("result", (JsonElement)jsonObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> c() {
/* 152 */     return bos.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk b() {
/* 157 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonObject d() {
/* 163 */     return this.f.b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public vk e() {
/* 169 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ji$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */