/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonObject;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bv
/*    */ {
/* 13 */   public static final bv a = new bv(bz.d.e);
/*    */   
/*    */   private final bz.d b;
/*    */   
/*    */   private bv(bz.d ☃) {
/* 18 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public boolean a(aag ☃, fx fx1) {
/* 22 */     if (this == a) {
/* 23 */       return true;
/*    */     }
/* 25 */     if (!☃.p(fx1)) {
/* 26 */       return false;
/*    */     }
/* 28 */     if (!this.b.d(☃.B(fx1))) {
/* 29 */       return false;
/*    */     }
/* 31 */     return true;
/*    */   }
/*    */   
/*    */   public JsonElement a() {
/* 35 */     if (this == a) {
/* 36 */       return (JsonElement)JsonNull.INSTANCE;
/*    */     }
/*    */     
/* 39 */     JsonObject ☃ = new JsonObject();
/* 40 */     ☃.add("light", this.b.d());
/* 41 */     return (JsonElement)☃;
/*    */   }
/*    */   
/*    */   public static bv a(@Nullable JsonElement ☃) {
/* 45 */     if (☃ == null || ☃.isJsonNull()) {
/* 46 */       return a;
/*    */     }
/* 48 */     JsonObject jsonObject = afd.m(☃, "light");
/* 49 */     bz.d d1 = bz.d.a(jsonObject.get("light"));
/* 50 */     return new bv(d1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */