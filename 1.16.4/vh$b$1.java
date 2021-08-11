/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParser;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Decoder;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.OptionalInt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class null
/*     */   implements vh.b
/*     */ {
/*     */   null(ach paramach) {}
/*     */   
/*     */   public Collection<vk> a(vj<? extends gm<?>> ☃) {
/* 190 */     return this.a.a(☃.a().a(), ☃ -> ☃.endsWith(".json"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <E> DataResult<Pair<E, OptionalInt>> a(DynamicOps<JsonElement> ☃, vj<? extends gm<E>> vj1, vj<E> vj2, Decoder<E> decoder) {
/* 196 */     vk vk1 = vj2.a();
/* 197 */     vk vk2 = new vk(vk1.b(), vj1.a().a() + "/" + vk1.a() + ".json");
/*     */     
/* 199 */     try(acg ☃ = this.a.a(vk2); 
/* 200 */         Reader ☃ = new InputStreamReader(acg.b(), StandardCharsets.UTF_8)) {
/*     */       
/* 202 */       JsonParser jsonParser = new JsonParser();
/* 203 */       JsonElement jsonElement = jsonParser.parse(reader);
/* 204 */       return decoder.parse(☃, jsonElement).map(☃ -> Pair.of(☃, OptionalInt.empty()));
/* 205 */     } catch (IOException|com.google.gson.JsonIOException|com.google.gson.JsonSyntaxException exception) {
/* 206 */       return DataResult.error("Failed to parse " + vk2 + " file: " + exception.getMessage());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 212 */     return "ResourceAccess[" + this.a + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vh$b$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */