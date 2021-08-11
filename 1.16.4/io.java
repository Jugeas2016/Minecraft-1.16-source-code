/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.TreeMap;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class io
/*    */   implements il
/*    */ {
/*    */   private final buo a;
/*    */   private final List<ir> b;
/* 22 */   private final Set<cfj<?>> c = Sets.newHashSet();
/* 23 */   private final List<ip> d = Lists.newArrayList();
/*    */   
/*    */   private io(buo ☃, List<ir> list) {
/* 26 */     this.a = ☃;
/* 27 */     this.b = list;
/*    */   }
/*    */   
/*    */   public io a(ip ☃) {
/* 31 */     ☃.b().forEach(☃ -> {
/*    */           if (this.a.m().a(☃.f()) != ☃) {
/*    */             throw new IllegalStateException("Property " + ☃ + " is not defined for block " + this.a);
/*    */           }
/*    */           
/*    */           if (!this.c.add(☃)) {
/*    */             throw new IllegalStateException("Values of property " + ☃ + " already defined for block " + this.a);
/*    */           }
/*    */         });
/* 40 */     this.d.add(☃);
/* 41 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement b() {
/* 46 */     Stream<Pair<iq, List<ir>>> ☃ = Stream.of(Pair.of(iq.a(), this.b));
/*    */     
/* 48 */     for (ip ip : this.d) {
/* 49 */       Map<iq, List<ir>> map1 = ip.a();
/* 50 */       ☃ = ☃.flatMap(pair -> ☃.entrySet().stream().map(()));
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     Map<String, JsonElement> map = new TreeMap<>();
/* 58 */     ☃.forEach(pair -> (JsonElement)☃.put(((iq)pair.getFirst()).b(), ir.a((List<ir>)pair.getSecond())));
/*    */ 
/*    */ 
/*    */     
/* 62 */     JsonObject jsonObject = new JsonObject();
/* 63 */     jsonObject.add("variants", (JsonElement)x.a(new JsonObject(), jsonObject -> ☃.forEach(jsonObject::add)));
/* 64 */     return (JsonElement)jsonObject;
/*    */   }
/*    */   
/*    */   private static List<ir> a(List<ir> ☃, List<ir> list1) {
/* 68 */     ImmutableList.Builder<ir> builder = ImmutableList.builder();
/*    */     
/* 70 */     ☃.forEach(ir1 -> ☃.forEach(()));
/* 71 */     return (List<ir>)builder.build();
/*    */   }
/*    */ 
/*    */   
/*    */   public buo a() {
/* 76 */     return this.a;
/*    */   }
/*    */   
/*    */   public static io a(buo ☃) {
/* 80 */     return new io(☃, (List<ir>)ImmutableList.of(ir.a()));
/*    */   }
/*    */   
/*    */   public static io a(buo ☃, ir ir1) {
/* 84 */     return new io(☃, (List<ir>)ImmutableList.of(ir1));
/*    */   }
/*    */   
/*    */   public static io a(buo ☃, ir... arrayOfIr) {
/* 88 */     return new io(☃, (List<ir>)ImmutableList.copyOf((Object[])arrayOfIr));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\io.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */