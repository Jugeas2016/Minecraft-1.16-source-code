/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Objects;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */ {
/*     */   private final blx a;
/*     */   private final int b;
/*     */   @Nullable
/*     */   private final md c;
/*     */   @Nullable
/*     */   private bmb d;
/*     */   
/*     */   c(blx ☃, int i, @Nullable md md1) {
/* 203 */     this.a = ☃;
/* 204 */     this.b = i;
/* 205 */     this.c = md1;
/*     */   }
/*     */   
/*     */   public c(bmb ☃) {
/* 209 */     this(☃.b(), ☃.E(), (☃.o() != null) ? ☃.o().g() : null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 214 */     if (this == ☃) return true; 
/* 215 */     if (☃ == null || getClass() != ☃.getClass()) return false;
/*     */     
/* 217 */     c c1 = (c)☃;
/* 218 */     return (this.b == c1.b && this.a.equals(c1.a) && Objects.equals(this.c, c1.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 223 */     int ☃ = this.a.hashCode();
/* 224 */     ☃ = 31 * ☃ + this.b;
/* 225 */     ☃ = 31 * ☃ + ((this.c != null) ? this.c.hashCode() : 0);
/* 226 */     return ☃;
/*     */   }
/*     */   
/*     */   public bmb a() {
/* 230 */     if (this.d == null) {
/* 231 */       this.d = new bmb(this.a, this.b);
/* 232 */       if (this.c != null) {
/* 233 */         this.d.c(this.c);
/*     */       }
/*     */     } 
/* 236 */     return this.d;
/*     */   }
/*     */   
/*     */   private static c b(JsonElement ☃) {
/* 240 */     if (☃.isJsonPrimitive()) {
/* 241 */       return new c(gm.T.a(new vk(☃.getAsString())), 1, null);
/*     */     }
/*     */     
/* 244 */     JsonObject jsonObject = afd.m(☃, "item");
/* 245 */     blx blx1 = gm.T.a(new vk(afd.h(jsonObject, "id")));
/* 246 */     int i = afd.a(jsonObject, "count", 1);
/* 247 */     if (jsonObject.has("tag")) {
/* 248 */       String str = afd.h(jsonObject, "tag");
/*     */       try {
/* 250 */         md md1 = mu.a(str);
/* 251 */         return new c(blx1, i, md1);
/* 252 */       } catch (CommandSyntaxException commandSyntaxException) {
/* 253 */         nv.c().warn("Failed to parse tag: {}", str, commandSyntaxException);
/*     */       } 
/*     */     } 
/*     */     
/* 257 */     return new c(blx1, i, null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static c b(nr ☃) {
/*     */     try {
/* 263 */       md md1 = mu.a(☃.getString());
/* 264 */       return new c(bmb.a(md1));
/* 265 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 266 */       nv.c().warn("Failed to parse item tag: {}", ☃, commandSyntaxException);
/* 267 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private JsonElement b() {
/* 272 */     JsonObject ☃ = new JsonObject();
/* 273 */     ☃.addProperty("id", gm.T.b(this.a).toString());
/* 274 */     if (this.b != 1) {
/* 275 */       ☃.addProperty("count", Integer.valueOf(this.b));
/*     */     }
/* 277 */     if (this.c != null) {
/* 278 */       ☃.addProperty("tag", this.c.toString());
/*     */     }
/* 280 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nv$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */