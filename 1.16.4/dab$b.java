/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class b
/*    */ {
/*    */   private final String a;
/*    */   private final dr.h b;
/*    */   private final String c;
/*    */   private final dr.h d;
/*    */   private final dab.d e;
/*    */   
/*    */   private b(String ☃, String str1, dab.d d1) {
/* 42 */     this.a = ☃;
/* 43 */     this.b = dab.a(☃);
/* 44 */     this.c = str1;
/* 45 */     this.d = dab.a(str1);
/* 46 */     this.e = d1;
/*    */   }
/*    */   
/*    */   public void a(Supplier<mt> ☃, mt mt1) {
/*    */     try {
/* 51 */       List<mt> list = this.b.a(mt1);
/* 52 */       if (!list.isEmpty()) {
/* 53 */         this.e.a(☃.get(), this.d, list);
/*    */       }
/* 55 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public JsonObject a() {
/* 61 */     JsonObject ☃ = new JsonObject();
/* 62 */     ☃.addProperty("source", this.a);
/* 63 */     ☃.addProperty("target", this.c);
/* 64 */     ☃.addProperty("op", dab.d.a(this.e));
/* 65 */     return ☃;
/*    */   }
/*    */   
/*    */   public static b a(JsonObject ☃) {
/* 69 */     String str1 = afd.h(☃, "source");
/* 70 */     String str2 = afd.h(☃, "target");
/* 71 */     dab.d d1 = dab.d.a(afd.h(☃, "op"));
/* 72 */     return new b(str1, str2, d1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dab$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */