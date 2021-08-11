/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ {
/* 331 */   public static final b a = new b(new dbo[0]);
/*     */   
/*     */   private final dbo[] b;
/*     */   private final Predicate<cyv> c;
/*     */   
/*     */   private b(dbo[] ☃) {
/* 337 */     this.b = ☃;
/* 338 */     this.c = dbq.a((Predicate<cyv>[])☃);
/*     */   }
/*     */   
/*     */   public static b a(dbo... ☃) {
/* 342 */     return new b(☃);
/*     */   }
/*     */   
/*     */   public static b a(JsonObject ☃, String str, ax ax1) {
/* 346 */     JsonElement jsonElement = ☃.get(str);
/* 347 */     return a(str, ax1, jsonElement);
/*     */   }
/*     */   
/*     */   public static b[] b(JsonObject ☃, String str, ax ax1) {
/* 351 */     JsonElement jsonElement = ☃.get(str);
/* 352 */     if (jsonElement == null || jsonElement.isJsonNull()) {
/* 353 */       return new b[0];
/*     */     }
/* 355 */     JsonArray jsonArray = afd.n(jsonElement, str);
/* 356 */     b[] arrayOfB = new b[jsonArray.size()];
/*     */     
/* 358 */     for (int i = 0; i < jsonArray.size(); i++) {
/* 359 */       arrayOfB[i] = a(str + "[" + i + "]", ax1, jsonArray.get(i));
/*     */     }
/*     */     
/* 362 */     return arrayOfB;
/*     */   }
/*     */   
/*     */   private static b a(String ☃, ax ax1, @Nullable JsonElement jsonElement) {
/* 366 */     if (jsonElement != null && jsonElement.isJsonArray()) {
/* 367 */       dbo[] arrayOfDbo = ax1.a(jsonElement.getAsJsonArray(), ax1.a().toString() + "/" + ☃, dbb.j);
/* 368 */       return new b(arrayOfDbo);
/*     */     } 
/*     */ 
/*     */     
/* 372 */     bg bg = bg.a(jsonElement);
/* 373 */     return a(bg);
/*     */   }
/*     */   
/*     */   public static b a(bg ☃) {
/* 377 */     if (☃ == bg.a) {
/* 378 */       return a;
/*     */     }
/* 380 */     dbo dbo1 = dbr.a(cyv.c.a, ☃).build();
/* 381 */     return new b(new dbo[] { dbo1 });
/*     */   }
/*     */   
/*     */   public boolean a(cyv ☃) {
/* 385 */     return this.c.test(☃);
/*     */   }
/*     */   
/*     */   public JsonElement a(ci ☃) {
/* 389 */     if (this.b.length == 0) {
/* 390 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 393 */     return ☃.a(this.b);
/*     */   }
/*     */   
/*     */   public static JsonElement a(b[] ☃, ci ci1) {
/* 397 */     if (☃.length == 0) {
/* 398 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 401 */     JsonArray jsonArray = new JsonArray();
/* 402 */     for (b b1 : ☃) {
/* 403 */       jsonArray.add(b1.a(ci1));
/*     */     }
/* 405 */     return (JsonElement)jsonArray;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bg$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */