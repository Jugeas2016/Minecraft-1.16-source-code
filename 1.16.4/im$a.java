/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.List;
/*    */ import java.util.function.Supplier;
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
/*    */ public class a
/*    */   implements im
/*    */ {
/*    */   private final im.b a;
/*    */   private final List<im> b;
/*    */   
/*    */   private a(im.b ☃, List<im> list) {
/* 37 */     this.a = ☃;
/* 38 */     this.b = list;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cei<?, ?> ☃) {
/* 43 */     this.b.forEach(im1 -> im1.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement b() {
/* 48 */     JsonArray ☃ = new JsonArray();
/* 49 */     this.b.stream().map(Supplier::get).forEach(☃::add);
/*    */     
/* 51 */     JsonObject jsonObject = new JsonObject();
/* 52 */     jsonObject.add(im.b.a(this.a), (JsonElement)☃);
/* 53 */     return (JsonElement)jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\im$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */