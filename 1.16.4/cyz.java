/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.JsonElement;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cyz
/*    */   extends acj
/*    */ {
/* 18 */   private static final Logger a = LogManager.getLogger();
/* 19 */   private static final Gson b = cys.c().create();
/*    */   
/* 21 */   private Map<vk, cyy> c = (Map<vk, cyy>)ImmutableMap.of();
/*    */   private final cza d;
/*    */   
/*    */   public cyz(cza ☃) {
/* 25 */     super(b, "loot_tables");
/* 26 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public cyy a(vk ☃) {
/* 30 */     return this.c.getOrDefault(☃, cyy.a);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(Map<vk, JsonElement> ☃, ach ach1, anw anw1) {
/* 35 */     ImmutableMap.Builder<vk, cyy> builder = ImmutableMap.builder();
/*    */     
/* 37 */     JsonElement jsonElement = ☃.remove(cyq.a);
/* 38 */     if (jsonElement != null) {
/* 39 */       a.warn("Datapack tried to redefine {} loot table, ignoring", cyq.a);
/*    */     }
/*    */     
/* 42 */     ☃.forEach((vk1, jsonElement) -> {
/*    */           try {
/*    */             cyy cyy = (cyy)b.fromJson(jsonElement, cyy.class);
/*    */             ☃.put(vk1, cyy);
/* 46 */           } catch (Exception exception) {
/*    */             a.error("Couldn't parse loot table {}", vk1, exception);
/*    */           } 
/*    */         });
/*    */     
/* 51 */     builder.put(cyq.a, cyy.a);
/*    */     
/* 53 */     ImmutableMap<vk, cyy> immutableMap = builder.build();
/* 54 */     czg czg = new czg(dbb.k, this.d::a, immutableMap::get);
/* 55 */     immutableMap.forEach((vk1, cyy1) -> a(☃, vk1, cyy1));
/* 56 */     czg.a().forEach((☃, str1) -> a.warn("Found validation problem in " + ☃ + ": " + str1));
/*    */     
/* 58 */     this.c = (Map<vk, cyy>)immutableMap;
/*    */   }
/*    */   
/*    */   public static void a(czg ☃, vk vk1, cyy cyy1) {
/* 62 */     cyy1.a(☃.a(cyy1.a()).a("{" + vk1 + "}", vk1));
/*    */   }
/*    */   
/*    */   public static JsonElement a(cyy ☃) {
/* 66 */     return b.toJsonTree(☃);
/*    */   }
/*    */   
/*    */   public Set<vk> a() {
/* 70 */     return this.c.keySet();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */