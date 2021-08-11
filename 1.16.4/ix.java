/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Streams;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.Set;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ix
/*    */ {
/*    */   private final Optional<vk> a;
/*    */   private final Set<ja> b;
/*    */   private Optional<String> c;
/*    */   
/*    */   public ix(Optional<vk> ☃, Optional<String> optional, ja... arrayOfJa) {
/* 27 */     this.a = ☃;
/* 28 */     this.c = optional;
/* 29 */     this.b = (Set<ja>)ImmutableSet.copyOf((Object[])arrayOfJa);
/*    */   }
/*    */   
/*    */   public vk a(buo ☃, iz iz1, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 33 */     return a(iw.a(☃, this.c.orElse("")), iz1, biConsumer);
/*    */   }
/*    */   
/*    */   public vk a(buo ☃, String str, iz iz1, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 37 */     return a(iw.a(☃, str + (String)this.c.orElse("")), iz1, biConsumer);
/*    */   }
/*    */   
/*    */   public vk b(buo ☃, String str, iz iz1, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 41 */     return a(iw.a(☃, str), iz1, biConsumer);
/*    */   }
/*    */   
/*    */   public vk a(vk ☃, iz iz1, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 45 */     Map<ja, vk> map = a(iz1);
/*    */     
/* 47 */     biConsumer.accept(☃, () -> {
/*    */           JsonObject jsonObject = new JsonObject();
/*    */           
/*    */           this.a.ifPresent(());
/*    */           if (!☃.isEmpty()) {
/*    */             JsonObject jsonObject1 = new JsonObject();
/*    */             ☃.forEach(());
/*    */             jsonObject.add("textures", (JsonElement)jsonObject1);
/*    */           } 
/*    */           return (JsonElement)jsonObject;
/*    */         });
/* 58 */     return ☃;
/*    */   }
/*    */   
/*    */   private Map<ja, vk> a(iz ☃) {
/* 62 */     return (Map<ja, vk>)Streams.concat(new Stream[] { this.b.stream(), ☃.a() }).collect(ImmutableMap.toImmutableMap(Function.identity(), ☃::a));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */