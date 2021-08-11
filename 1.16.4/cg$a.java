/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
/*    */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
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
/*    */ class a
/*    */   implements cg.c
/*    */ {
/*    */   private final Object2BooleanMap<String> a;
/*    */   
/*    */   public a(Object2BooleanMap<String> ☃) {
/* 61 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a() {
/* 66 */     JsonObject ☃ = new JsonObject();
/* 67 */     this.a.forEach(☃::addProperty);
/* 68 */     return (JsonElement)☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aa ☃) {
/* 73 */     for (ObjectIterator<Object2BooleanMap.Entry<String>> objectIterator = this.a.object2BooleanEntrySet().iterator(); objectIterator.hasNext(); ) { Object2BooleanMap.Entry<String> entry = objectIterator.next();
/* 74 */       ae ae = ☃.c((String)entry.getKey());
/* 75 */       if (ae == null || ae.a() != entry.getBooleanValue()) {
/* 76 */         return false;
/*    */       } }
/*    */     
/* 79 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */