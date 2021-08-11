/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonArray;
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
/*    */ 
/*    */ 
/*    */ public class hv
/*    */   implements hm
/*    */ {
/* 22 */   private static final Gson b = (new GsonBuilder()).setPrettyPrinting().create();
/*    */   private final hl c;
/*    */   
/*    */   public hv(hl ☃) {
/* 26 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hn ☃) throws IOException {
/* 31 */     JsonObject jsonObject = new JsonObject();
/*    */     
/* 33 */     for (buo buo : gm.Q) {
/* 34 */       vk vk = gm.Q.b(buo);
/* 35 */       JsonObject jsonObject1 = new JsonObject();
/* 36 */       cei<buo, ceh> cei = buo.m();
/*    */       
/* 38 */       if (!cei.d().isEmpty()) {
/* 39 */         JsonObject jsonObject2 = new JsonObject();
/* 40 */         for (cfj<?> cfj : cei.d()) {
/* 41 */           JsonArray jsonArray1 = new JsonArray();
/* 42 */           for (Comparable<?> comparable : cfj.a()) {
/* 43 */             jsonArray1.add(x.a(cfj, comparable));
/*    */           }
/* 45 */           jsonObject2.add(cfj.f(), (JsonElement)jsonArray1);
/*    */         } 
/*    */         
/* 48 */         jsonObject1.add("properties", (JsonElement)jsonObject2);
/*    */       } 
/*    */       
/* 51 */       JsonArray jsonArray = new JsonArray();
/* 52 */       for (UnmodifiableIterator<ceh> unmodifiableIterator = cei.a().iterator(); unmodifiableIterator.hasNext(); ) { ceh ceh = unmodifiableIterator.next();
/* 53 */         JsonObject jsonObject2 = new JsonObject();
/* 54 */         JsonObject jsonObject3 = new JsonObject();
/* 55 */         for (cfj<?> cfj : cei.d()) {
/* 56 */           jsonObject3.addProperty(cfj.f(), x.a(cfj, ceh.c(cfj)));
/*    */         }
/* 58 */         if (jsonObject3.size() > 0) {
/* 59 */           jsonObject2.add("properties", (JsonElement)jsonObject3);
/*    */         }
/* 61 */         jsonObject2.addProperty("id", Integer.valueOf(buo.i(ceh)));
/* 62 */         if (ceh == buo.n()) {
/* 63 */           jsonObject2.addProperty("default", Boolean.valueOf(true));
/*    */         }
/* 65 */         jsonArray.add((JsonElement)jsonObject2); }
/*    */ 
/*    */       
/* 68 */       jsonObject1.add("states", (JsonElement)jsonArray);
/* 69 */       jsonObject.add(vk.toString(), (JsonElement)jsonObject1);
/*    */     } 
/*    */     
/* 72 */     Path path = this.c.b().resolve("reports/blocks.json");
/* 73 */     hm.a(b, ☃, (JsonElement)jsonObject, path);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 78 */     return "Block List";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */