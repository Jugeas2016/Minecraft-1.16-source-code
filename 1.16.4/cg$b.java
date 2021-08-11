/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonPrimitive;
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
/*    */   implements cg.c
/*    */ {
/*    */   private final boolean a;
/*    */   
/*    */   public b(boolean ☃) {
/* 43 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a() {
/* 48 */     return (JsonElement)new JsonPrimitive(Boolean.valueOf(this.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aa ☃) {
/* 53 */     return (☃.a() == this.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cg$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */