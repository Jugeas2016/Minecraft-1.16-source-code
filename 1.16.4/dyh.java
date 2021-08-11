/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Streams;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.List;
/*    */ import java.util.function.Function;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dyh
/*    */ {
/*    */   @Nullable
/*    */   private final List<vk> a;
/*    */   
/*    */   private dyh(@Nullable List<vk> ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public List<vk> a() {
/* 23 */     return this.a;
/*    */   }
/*    */   public static dyh a(JsonObject ☃) {
/*    */     List<vk> list;
/* 27 */     JsonArray jsonArray = afd.a(☃, "textures", (JsonArray)null);
/*    */ 
/*    */     
/* 30 */     if (jsonArray != null) {
/*    */ 
/*    */ 
/*    */       
/* 34 */       list = (List<vk>)Streams.stream((Iterable)jsonArray).map(☃ -> afd.a(☃, "texture")).map(vk::new).collect(ImmutableList.toImmutableList());
/*    */     } else {
/* 36 */       list = null;
/*    */     } 
/*    */     
/* 39 */     return new dyh(list);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */