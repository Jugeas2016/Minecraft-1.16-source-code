/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.Encoder;
/*    */ import com.mojang.serialization.JsonOps;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
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
/*    */ public class ks
/*    */   implements hm
/*    */ {
/* 26 */   private static final Logger b = LogManager.getLogger();
/* 27 */   private static final Gson c = (new GsonBuilder()).setPrettyPrinting().create();
/*    */   
/*    */   private final hl d;
/*    */   
/*    */   public ks(hl ☃) {
/* 32 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hn ☃) {
/* 37 */     Path path = this.d.b();
/*    */     
/* 39 */     for (Map.Entry<vj<bsv>, bsv> entry : hk.i.d()) {
/* 40 */       Path path1 = a(path, ((vj)entry.getKey()).a());
/* 41 */       bsv bsv = entry.getValue();
/* 42 */       Function<Supplier<bsv>, DataResult<JsonElement>> function = JsonOps.INSTANCE.withEncoder((Encoder)bsv.d);
/*    */       try {
/* 44 */         Optional<JsonElement> optional = ((DataResult)function.apply(() -> ☃)).result();
/* 45 */         if (optional.isPresent()) {
/* 46 */           hm.a(c, ☃, optional.get(), path1); continue;
/*    */         } 
/* 48 */         b.error("Couldn't serialize biome {}", path1);
/*    */       }
/* 50 */       catch (IOException iOException) {
/* 51 */         b.error("Couldn't save biome {}", path1, iOException);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private static Path a(Path ☃, vk vk1) {
/* 57 */     return ☃.resolve("reports/biomes/" + vk1.a() + ".json");
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 62 */     return "Biomes";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */