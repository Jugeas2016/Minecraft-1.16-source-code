/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bb
/*    */ {
/* 17 */   public static final bb a = new bb();
/* 18 */   public static final bb[] b = new bb[0];
/*    */   
/*    */   private final bps c;
/*    */   private final bz.d d;
/*    */   
/*    */   public bb() {
/* 24 */     this.c = null;
/* 25 */     this.d = bz.d.e;
/*    */   }
/*    */   
/*    */   public bb(@Nullable bps ☃, bz.d d1) {
/* 29 */     this.c = ☃;
/* 30 */     this.d = d1;
/*    */   }
/*    */   
/*    */   public boolean a(Map<bps, Integer> ☃) {
/* 34 */     if (this.c != null) {
/*    */       
/* 36 */       if (!☃.containsKey(this.c)) {
/* 37 */         return false;
/*    */       }
/* 39 */       int i = ((Integer)☃.get(this.c)).intValue();
/* 40 */       if (this.d != null && !this.d.d(i)) {
/* 41 */         return false;
/*    */       }
/* 43 */     } else if (this.d != null) {
/*    */       
/* 45 */       for (Integer integer : ☃.values()) {
/* 46 */         if (this.d.d(integer.intValue())) {
/* 47 */           return true;
/*    */         }
/*    */       } 
/* 50 */       return false;
/*    */     } 
/*    */     
/* 53 */     return true;
/*    */   }
/*    */   
/*    */   public JsonElement a() {
/* 57 */     if (this == a) {
/* 58 */       return (JsonElement)JsonNull.INSTANCE;
/*    */     }
/*    */     
/* 61 */     JsonObject ☃ = new JsonObject();
/*    */     
/* 63 */     if (this.c != null) {
/* 64 */       ☃.addProperty("enchantment", gm.R.b(this.c).toString());
/*    */     }
/* 66 */     ☃.add("levels", this.d.d());
/*    */     
/* 68 */     return (JsonElement)☃;
/*    */   }
/*    */   
/*    */   public static bb a(@Nullable JsonElement ☃) {
/* 72 */     if (☃ == null || ☃.isJsonNull()) {
/* 73 */       return a;
/*    */     }
/* 75 */     JsonObject jsonObject = afd.m(☃, "enchantment");
/*    */     
/* 77 */     bps bps1 = null;
/* 78 */     if (jsonObject.has("enchantment")) {
/* 79 */       vk vk = new vk(afd.h(jsonObject, "enchantment"));
/* 80 */       bps1 = (bps)gm.R.b(vk).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + ☃ + "'"));
/*    */     } 
/* 82 */     bz.d d1 = bz.d.a(jsonObject.get("levels"));
/*    */     
/* 84 */     return new bb(bps1, d1);
/*    */   }
/*    */   
/*    */   public static bb[] b(@Nullable JsonElement ☃) {
/* 88 */     if (☃ == null || ☃.isJsonNull()) {
/* 89 */       return b;
/*    */     }
/*    */     
/* 92 */     JsonArray jsonArray = afd.n(☃, "enchantments");
/* 93 */     bb[] arrayOfBb = new bb[jsonArray.size()];
/* 94 */     for (int i = 0; i < arrayOfBb.length; i++) {
/* 95 */       arrayOfBb[i] = a(jsonArray.get(i));
/*    */     }
/*    */     
/* 98 */     return arrayOfBb;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */