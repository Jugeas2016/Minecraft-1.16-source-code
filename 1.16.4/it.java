/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class it<T>
/*    */ {
/*    */   private final String a;
/*    */   private final Function<T, JsonElement> b;
/*    */   
/*    */   public it(String ☃, Function<T, JsonElement> function) {
/* 13 */     this.a = ☃;
/* 14 */     this.b = function;
/*    */   }
/*    */   
/*    */   public a a(T ☃) {
/* 18 */     return new a(this, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 23 */     return this.a;
/*    */   }
/*    */   
/*    */   public class a {
/*    */     private final T b;
/*    */     
/*    */     public a(it ☃, T t) {
/* 30 */       this.b = t;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void a(JsonObject ☃) {
/* 38 */       ☃.add(it.a(this.a), it.b(this.a).apply(this.b));
/*    */     }
/*    */ 
/*    */     
/*    */     public String toString() {
/* 43 */       return it.a(this.a) + "=" + this.b;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\it.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */