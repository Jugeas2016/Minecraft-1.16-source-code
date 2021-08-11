/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Multimap;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Supplier;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ie
/*    */   implements hm
/*    */ {
/* 33 */   private static final Logger b = LogManager.getLogger();
/* 34 */   private static final Gson c = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
/*    */   
/*    */   private final hl d;
/* 37 */   private final List<Pair<Supplier<Consumer<BiConsumer<vk, cyy.a>>>, dba>> e = (List<Pair<Supplier<Consumer<BiConsumer<vk, cyy.a>>>, dba>>)ImmutableList.of(
/* 38 */       Pair.of(ic::new, dbb.e), 
/* 39 */       Pair.of(ia::new, dbb.b), 
/* 40 */       Pair.of(ib::new, dbb.f), 
/* 41 */       Pair.of(hz::new, dbb.l), 
/* 42 */       Pair.of(ig::new, dbb.h), 
/* 43 */       Pair.of(id::new, dbb.g));
/*    */ 
/*    */   
/*    */   public ie(hl ☃) {
/* 47 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hn ☃) {
/* 52 */     Path path = this.d.b();
/*    */     
/* 54 */     Map<vk, cyy> map = Maps.newHashMap();
/*    */     
/* 56 */     this.e.forEach(pair -> ((Consumer<BiConsumer>)((Supplier<Consumer<BiConsumer>>)pair.getFirst()).get()).accept(()));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 64 */     czg czg = new czg(dbb.k, ☃ -> null, map::get);
/*    */     
/* 66 */     Sets.SetView setView = Sets.difference(cyq.a(), map.keySet());
/*    */     
/* 68 */     for (vk vk : setView) {
/* 69 */       czg.a("Missing built-in table: " + vk);
/*    */     }
/*    */     
/* 72 */     map.forEach((vk1, cyy1) -> cyz.a(☃, vk1, cyy1));
/*    */     
/* 74 */     Multimap<String, String> multimap = czg.a();
/* 75 */     if (!multimap.isEmpty()) {
/* 76 */       multimap.forEach((☃, str1) -> b.warn("Found validation problem in " + ☃ + ": " + str1));
/* 77 */       throw new IllegalStateException("Failed to validate loot tables, see logs");
/*    */     } 
/*    */     
/* 80 */     map.forEach((vk1, cyy1) -> {
/*    */           Path path = a(☃, vk1);
/*    */           try {
/*    */             hm.a(c, hn1, cyz.a(cyy1), path);
/* 84 */           } catch (IOException iOException) {
/*    */             b.error("Couldn't save loot table {}", path, iOException);
/*    */           } 
/*    */         });
/*    */   }
/*    */   
/*    */   private static Path a(Path ☃, vk vk1) {
/* 91 */     return ☃.resolve("data/" + vk1.b() + "/loot_tables/" + vk1.a() + ".json");
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 96 */     return "LootTables";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */