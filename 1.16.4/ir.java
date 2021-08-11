/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ir
/*    */   implements Supplier<JsonElement>
/*    */ {
/* 14 */   private final Map<it<?>, it<?>.a> a = Maps.newLinkedHashMap();
/*    */   
/*    */   public <T> ir a(it<T> ☃, T t) {
/* 17 */     it<?>.a a = this.a.put(☃, ☃.a(t));
/* 18 */     if (a != null) {
/* 19 */       throw new IllegalStateException("Replacing value of " + a + " with " + t);
/*    */     }
/* 21 */     return this;
/*    */   }
/*    */   
/*    */   public static ir a() {
/* 25 */     return new ir();
/*    */   }
/*    */   
/*    */   public static ir a(ir ☃, ir ir1) {
/* 29 */     ir ir2 = new ir();
/* 30 */     ir2.a.putAll(☃.a);
/* 31 */     ir2.a.putAll(ir1.a);
/* 32 */     return ir2;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement b() {
/* 37 */     JsonObject ☃ = new JsonObject();
/* 38 */     this.a.values().forEach(a1 -> a1.a(☃));
/* 39 */     return (JsonElement)☃;
/*    */   }
/*    */   
/*    */   public static JsonElement a(List<ir> ☃) {
/* 43 */     if (☃.size() == 1) {
/* 44 */       return ((ir)☃.get(0)).b();
/*    */     }
/*    */     
/* 47 */     JsonArray jsonArray = new JsonArray();
/* 48 */     ☃.forEach(ir1 -> ☃.add(ir1.b()));
/* 49 */     return (JsonElement)jsonArray;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */