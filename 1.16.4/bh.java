/*    */ import com.google.common.base.Joiner;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonPrimitive;
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
/*    */ public abstract class bh
/*    */ {
/* 18 */   public static final bh a = new bh()
/*    */     {
/*    */       public boolean a(aqe<?> ☃) {
/* 21 */         return true;
/*    */       }
/*    */ 
/*    */       
/*    */       public JsonElement a() {
/* 26 */         return (JsonElement)JsonNull.INSTANCE;
/*    */       }
/*    */     };
/*    */   
/* 30 */   private static final Joiner b = Joiner.on(", ");
/*    */ 
/*    */   
/*    */   static class b
/*    */     extends bh
/*    */   {
/*    */     private final aqe<?> b;
/*    */ 
/*    */     
/*    */     public b(aqe<?> ☃) {
/* 40 */       this.b = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean a(aqe<?> ☃) {
/* 45 */       return (this.b == ☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonElement a() {
/* 50 */       return (JsonElement)new JsonPrimitive(gm.S.b(this.b).toString());
/*    */     }
/*    */   }
/*    */   
/*    */   static class a extends bh {
/*    */     private final ael<aqe<?>> b;
/*    */     
/*    */     public a(ael<aqe<?>> ☃) {
/* 58 */       this.b = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean a(aqe<?> ☃) {
/* 63 */       return this.b.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonElement a() {
/* 68 */       return (JsonElement)new JsonPrimitive("#" + aeh.a().d().b(this.b));
/*    */     }
/*    */   }
/*    */   
/*    */   public static bh a(@Nullable JsonElement ☃) {
/* 73 */     if (☃ == null || ☃.isJsonNull()) {
/* 74 */       return a;
/*    */     }
/*    */     
/* 77 */     String str = afd.a(☃, "type");
/*    */     
/* 79 */     if (str.startsWith("#")) {
/* 80 */       vk vk1 = new vk(str.substring(1));
/* 81 */       return new a(aeh.a().d().b(vk1));
/*    */     } 
/* 83 */     vk vk = new vk(str);
/*    */     
/* 85 */     aqe<?> aqe = (aqe)gm.S.b(vk).orElseThrow(() -> new JsonSyntaxException("Unknown entity type '" + ☃ + "', valid types are: " + b.join(gm.S.c())));
/* 86 */     return new b(aqe);
/*    */   }
/*    */ 
/*    */   
/*    */   public static bh b(aqe<?> ☃) {
/* 91 */     return new b(☃);
/*    */   }
/*    */   
/*    */   public static bh a(ael<aqe<?>> ☃) {
/* 95 */     return new a(☃);
/*    */   }
/*    */   
/*    */   public abstract boolean a(aqe<?> paramaqe);
/*    */   
/*    */   public abstract JsonElement a();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */