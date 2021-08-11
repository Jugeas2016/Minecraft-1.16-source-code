/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import java.util.Optional;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class b
/*    */   extends cm.c
/*    */ {
/*    */   private final String a;
/*    */   
/*    */   public b(String ☃, String str1) {
/* 62 */     super(☃);
/* 63 */     this.a = str1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected <T extends Comparable<T>> boolean a(cej<?, ?> ☃, cfj<T> cfj1) {
/* 68 */     T t = ☃.c(cfj1);
/* 69 */     Optional<T> optional = cfj1.b(this.a);
/* 70 */     return (optional.isPresent() && t.compareTo(optional.get()) == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a() {
/* 75 */     return (JsonElement)new JsonPrimitive(this.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cm$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */