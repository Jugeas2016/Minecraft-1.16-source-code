/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonElement;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ik
/*     */   implements hm
/*     */ {
/*  32 */   private static final Logger b = LogManager.getLogger();
/*  33 */   private static final Gson c = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
/*     */   
/*     */   private final hl d;
/*     */   
/*     */   public ik(hl ☃) {
/*  38 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hn ☃) {
/*  43 */     Path path = this.d.b();
/*     */     
/*  45 */     Map<buo, il> map = Maps.newHashMap();
/*  46 */     Consumer<il> consumer = il1 -> {
/*     */         buo buo = il1.a();
/*     */         
/*     */         il il2 = ☃.put(buo, il1);
/*     */         if (il2 != null) {
/*     */           throw new IllegalStateException("Duplicate blockstate definition for " + buo);
/*     */         }
/*     */       };
/*  54 */     Map<vk, Supplier<JsonElement>> map1 = Maps.newHashMap();
/*  55 */     Set<blx> set = Sets.newHashSet();
/*     */     
/*  57 */     BiConsumer<vk, Supplier<JsonElement>> biConsumer = (vk1, supplier) -> {
/*     */         Supplier<JsonElement> supplier1 = ☃.put(vk1, supplier);
/*     */         
/*     */         if (supplier1 != null) {
/*     */           throw new IllegalStateException("Duplicate model definition for " + vk1);
/*     */         }
/*     */       };
/*  64 */     Consumer<blx> consumer1 = set::add;
/*     */     
/*  66 */     (new ii(consumer, biConsumer, consumer1)).a();
/*  67 */     (new ij(biConsumer)).a();
/*     */     
/*  69 */     List<buo> list = (List<buo>)gm.Q.g().filter(buo1 -> !☃.containsKey(buo1)).collect(Collectors.toList());
/*  70 */     if (!list.isEmpty()) {
/*  71 */       throw new IllegalStateException("Missing blockstate definitions for: " + list);
/*     */     }
/*     */     
/*  74 */     gm.Q.forEach(buo1 -> {
/*     */           blx blx = blx.e.get(buo1);
/*     */           
/*     */           if (blx != null) {
/*     */             if (☃.contains(blx)) {
/*     */               return;
/*     */             }
/*     */             vk vk = iw.a(blx);
/*     */             if (!map.containsKey(vk)) {
/*     */               map.put(vk, new iv(iw.a(buo1)));
/*     */             }
/*     */           } 
/*     */         });
/*  87 */     a(☃, path, (Map)map, ik::a);
/*  88 */     a(☃, path, map1, ik::a);
/*     */   }
/*     */   
/*     */   private <T> void a(hn ☃, Path path, Map<T, ? extends Supplier<JsonElement>> map, BiFunction<Path, T, Path> biFunction) {
/*  92 */     map.forEach((object, supplier) -> {
/*     */           Path path1 = ☃.apply(path, object);
/*     */           try {
/*     */             hm.a(c, hn1, supplier.get(), path1);
/*  96 */           } catch (Exception exception) {
/*     */             b.error("Couldn't save {}", path1, exception);
/*     */           } 
/*     */         });
/*     */   }
/*     */   
/*     */   private static Path a(Path ☃, buo buo1) {
/* 103 */     vk vk = gm.Q.b(buo1);
/* 104 */     return ☃.resolve("assets/" + vk.b() + "/blockstates/" + vk.a() + ".json");
/*     */   }
/*     */   
/*     */   private static Path a(Path ☃, vk vk1) {
/* 108 */     return ☃.resolve("assets/" + vk1.b() + "/models/" + vk1.a() + ".json");
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 113 */     return "Block State Definitions";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */