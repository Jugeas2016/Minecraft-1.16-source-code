/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*    */ public class cb
/*    */ {
/* 20 */   public static final cb a = new cb(null);
/*    */   
/*    */   @Nullable
/*    */   private final md b;
/*    */   
/*    */   public cb(@Nullable md ☃) {
/* 26 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public boolean a(bmb ☃) {
/* 30 */     if (this == a) {
/* 31 */       return true;
/*    */     }
/* 33 */     return a(☃.o());
/*    */   }
/*    */   
/*    */   public boolean a(aqa ☃) {
/* 37 */     if (this == a) {
/* 38 */       return true;
/*    */     }
/* 40 */     return a(b(☃));
/*    */   }
/*    */   
/*    */   public boolean a(@Nullable mt ☃) {
/* 44 */     if (☃ == null) {
/* 45 */       return (this == a);
/*    */     }
/*    */     
/* 48 */     if (this.b != null && !mp.a(this.b, ☃, true)) {
/* 49 */       return false;
/*    */     }
/*    */     
/* 52 */     return true;
/*    */   }
/*    */   
/*    */   public JsonElement a() {
/* 56 */     if (this == a || this.b == null) {
/* 57 */       return (JsonElement)JsonNull.INSTANCE;
/*    */     }
/*    */     
/* 60 */     return (JsonElement)new JsonPrimitive(this.b.toString());
/*    */   }
/*    */   public static cb a(@Nullable JsonElement ☃) {
/*    */     md md1;
/* 64 */     if (☃ == null || ☃.isJsonNull()) {
/* 65 */       return a;
/*    */     }
/*    */     
/*    */     try {
/* 69 */       md1 = mu.a(afd.a(☃, "nbt"));
/* 70 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 71 */       throw new JsonSyntaxException("Invalid nbt tag: " + commandSyntaxException.getMessage());
/*    */     } 
/* 73 */     return new cb(md1);
/*    */   }
/*    */   
/*    */   public static md b(aqa ☃) {
/* 77 */     md md1 = ☃.e(new md());
/* 78 */     if (☃ instanceof bfw) {
/* 79 */       bmb bmb = ((bfw)☃).bm.f();
/* 80 */       if (!bmb.a()) {
/* 81 */         md1.a("SelectedItem", bmb.b(new md()));
/*    */       }
/*    */     } 
/* 84 */     return md1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */