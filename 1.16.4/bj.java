/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bj
/*    */ {
/* 14 */   public static final bj a = new bj(false);
/*    */   
/*    */   private boolean b;
/*    */ 
/*    */   
/*    */   private bj(boolean ☃) {
/* 20 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public static bj a(boolean ☃) {
/* 24 */     return new bj(☃);
/*    */   }
/*    */   
/*    */   public static bj a(@Nullable JsonElement ☃) {
/* 28 */     if (☃ == null || ☃.isJsonNull()) {
/* 29 */       return a;
/*    */     }
/*    */     
/* 32 */     JsonObject jsonObject = afd.m(☃, "fishing_hook");
/* 33 */     JsonElement jsonElement = jsonObject.get("in_open_water");
/* 34 */     if (jsonElement != null) {
/* 35 */       return new bj(afd.c(jsonElement, "in_open_water"));
/*    */     }
/* 37 */     return a;
/*    */   }
/*    */   
/*    */   public JsonElement a() {
/* 41 */     if (this == a) {
/* 42 */       return (JsonElement)JsonNull.INSTANCE;
/*    */     }
/*    */     
/* 45 */     JsonObject ☃ = new JsonObject();
/* 46 */     ☃.add("in_open_water", (JsonElement)new JsonPrimitive(Boolean.valueOf(this.b)));
/* 47 */     return (JsonElement)☃;
/*    */   }
/*    */   
/*    */   public boolean a(aqa ☃) {
/* 51 */     if (this == a) {
/* 52 */       return true;
/*    */     }
/*    */     
/* 55 */     if (!(☃ instanceof bgi)) {
/* 56 */       return false;
/*    */     }
/*    */     
/* 59 */     bgi bgi = (bgi)☃;
/* 60 */     return (this.b == bgi.g());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */