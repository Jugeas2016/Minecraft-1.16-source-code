/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class bl
/*    */ {
/* 20 */   public static final bl a = new bl(null, null, cm.a);
/*    */   
/*    */   @Nullable
/*    */   private final ael<cuw> b;
/*    */   @Nullable
/*    */   private final cuw c;
/*    */   private final cm d;
/*    */   
/*    */   public bl(@Nullable ael<cuw> ☃, @Nullable cuw cuw1, cm cm1) {
/* 29 */     this.b = ☃;
/* 30 */     this.c = cuw1;
/* 31 */     this.d = cm1;
/*    */   }
/*    */   
/*    */   public boolean a(aag ☃, fx fx1) {
/* 35 */     if (this == a) {
/* 36 */       return true;
/*    */     }
/* 38 */     if (!☃.p(fx1)) {
/* 39 */       return false;
/*    */     }
/* 41 */     cux cux = ☃.b(fx1);
/*    */     
/* 43 */     cuw cuw1 = cux.a();
/* 44 */     if (this.b != null && !this.b.a(cuw1)) {
/* 45 */       return false;
/*    */     }
/* 47 */     if (this.c != null && cuw1 != this.c) {
/* 48 */       return false;
/*    */     }
/* 50 */     if (!this.d.a(cux)) {
/* 51 */       return false;
/*    */     }
/* 53 */     return true;
/*    */   }
/*    */   
/*    */   public static bl a(@Nullable JsonElement ☃) {
/* 57 */     if (☃ == null || ☃.isJsonNull()) {
/* 58 */       return a;
/*    */     }
/* 60 */     JsonObject jsonObject = afd.m(☃, "fluid");
/*    */     
/* 62 */     cuw cuw1 = null;
/* 63 */     if (jsonObject.has("fluid")) {
/* 64 */       vk vk = new vk(afd.h(jsonObject, "fluid"));
/* 65 */       cuw1 = gm.O.a(vk);
/*    */     } 
/*    */     
/* 68 */     ael<cuw> ael1 = null;
/* 69 */     if (jsonObject.has("tag")) {
/* 70 */       vk vk = new vk(afd.h(jsonObject, "tag"));
/* 71 */       ael1 = aeh.a().c().a(vk);
/* 72 */       if (ael1 == null) {
/* 73 */         throw new JsonSyntaxException("Unknown fluid tag '" + vk + "'");
/*    */       }
/*    */     } 
/* 76 */     cm cm1 = cm.a(jsonObject.get("state"));
/* 77 */     return new bl(ael1, cuw1, cm1);
/*    */   }
/*    */   
/*    */   public JsonElement a() {
/* 81 */     if (this == a) {
/* 82 */       return (JsonElement)JsonNull.INSTANCE;
/*    */     }
/*    */     
/* 85 */     JsonObject ☃ = new JsonObject();
/* 86 */     if (this.c != null) {
/* 87 */       ☃.addProperty("fluid", gm.O.b(this.c).toString());
/*    */     }
/* 89 */     if (this.b != null) {
/* 90 */       ☃.addProperty("tag", aeh.a().c().b(this.b).toString());
/*    */     }
/* 92 */     ☃.add("state", this.d.a());
/*    */     
/* 94 */     return (JsonElement)☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */