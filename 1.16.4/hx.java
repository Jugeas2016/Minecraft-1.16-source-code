/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hx
/*    */   implements hm
/*    */ {
/* 18 */   private static final Gson b = (new GsonBuilder()).setPrettyPrinting().create();
/*    */   private final hl c;
/*    */   
/*    */   public hx(hl ☃) {
/* 22 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hn ☃) throws IOException {
/* 27 */     JsonObject jsonObject = new JsonObject();
/*    */     
/* 29 */     gm.f.c().forEach(vk1 -> ☃.add(vk1.toString(), a(gm.f.a(vk1))));
/*    */     
/* 31 */     Path path = this.c.b().resolve("reports/registries.json");
/* 32 */     hm.a(b, ☃, (JsonElement)jsonObject, path);
/*    */   }
/*    */ 
/*    */   
/*    */   private static <T> JsonElement a(gm<T> ☃) {
/* 37 */     JsonObject jsonObject1 = new JsonObject();
/*    */     
/* 39 */     if (☃ instanceof gb) {
/* 40 */       vk vk = ((gb)☃).a();
/* 41 */       jsonObject1.addProperty("default", vk.toString());
/*    */     } 
/*    */     
/* 44 */     int i = gm.f.a(☃);
/* 45 */     jsonObject1.addProperty("protocol_id", Integer.valueOf(i));
/*    */     
/* 47 */     JsonObject jsonObject2 = new JsonObject();
/* 48 */     for (vk vk : ☃.c()) {
/* 49 */       T t = ☃.a(vk);
/* 50 */       int j = ☃.a(t);
/*    */       
/* 52 */       JsonObject jsonObject = new JsonObject();
/* 53 */       jsonObject.addProperty("protocol_id", Integer.valueOf(j));
/*    */       
/* 55 */       jsonObject2.add(vk.toString(), (JsonElement)jsonObject);
/*    */     } 
/* 57 */     jsonObject1.add("entries", (JsonElement)jsonObject2);
/* 58 */     return (JsonElement)jsonObject1;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 63 */     return "Registry Dump";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */