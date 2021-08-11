/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abp
/*    */   implements abn<abo>
/*    */ {
/*    */   public abo b(JsonObject ☃) {
/* 12 */     nr nr = nr.a.a(☃.get("description"));
/* 13 */     if (nr == null) {
/* 14 */       throw new JsonParseException("Invalid/missing description!");
/*    */     }
/* 16 */     int i = afd.n(☃, "pack_format");
/* 17 */     return new abo(nr, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 22 */     return "pack";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */