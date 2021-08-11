/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import java.util.function.Consumer;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ho
/*    */   implements hm
/*    */ {
/* 22 */   private static final Logger b = LogManager.getLogger();
/* 23 */   private static final Gson c = (new GsonBuilder()).setPrettyPrinting().create();
/*    */   
/*    */   private final hl d;
/* 26 */   private final List<Consumer<Consumer<y>>> e = (List<Consumer<Consumer<y>>>)ImmutableList.of(new ht(), new hq(), new hp(), new hr(), new hs());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ho(hl ☃) {
/* 35 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hn ☃) throws IOException {
/* 40 */     Path path = this.d.b();
/* 41 */     Set<vk> set = Sets.newHashSet();
/* 42 */     Consumer<y> consumer = y1 -> {
/*    */         if (!☃.add(y1.h())) {
/*    */           throw new IllegalStateException("Duplicate advancement " + y1.h());
/*    */         }
/*    */         
/*    */         Path path1 = a(path, y1);
/*    */         try {
/*    */           hm.a(c, hn1, (JsonElement)y1.a().b(), path1);
/* 50 */         } catch (IOException iOException) {
/*    */           b.error("Couldn't save advancement {}", path1, iOException);
/*    */         } 
/*    */       };
/*    */     
/* 55 */     for (Consumer<Consumer<y>> consumer1 : this.e) {
/* 56 */       consumer1.accept(consumer);
/*    */     }
/*    */   }
/*    */   
/*    */   private static Path a(Path ☃, y y1) {
/* 61 */     return ☃.resolve("data/" + y1.h().b() + "/advancements/" + y1.h().a() + ".json");
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 66 */     return "Advancements";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */