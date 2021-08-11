/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum dnh
/*    */ {
/* 11 */   a("bitmap", dnf.a::a),
/* 12 */   b("ttf", dnj::a),
/* 13 */   c("legacy_unicode", dni.a::a);
/*    */   
/*    */   static {
/* 16 */     d = x.<Map<String, dnh>>a(Maps.newHashMap(), ☃ -> {
/*    */           for (dnh dnh1 : values())
/*    */             ☃.put(dnh1.e, dnh1); 
/*    */         });
/*    */   }
/*    */   private static final Map<String, dnh> d;
/*    */   private final String e;
/*    */   private final Function<JsonObject, dng> f;
/*    */   
/*    */   dnh(String ☃, Function<JsonObject, dng> function) {
/* 26 */     this.e = ☃;
/* 27 */     this.f = function;
/*    */   }
/*    */   
/*    */   public static dnh a(String ☃) {
/* 31 */     dnh dnh1 = d.get(☃);
/* 32 */     if (dnh1 == null) {
/* 33 */       throw new IllegalArgumentException("Invalid type: " + ☃);
/*    */     }
/* 35 */     return dnh1;
/*    */   }
/*    */   
/*    */   public dng a(JsonObject ☃) {
/* 39 */     return this.f.apply(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */