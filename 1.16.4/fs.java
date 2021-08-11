/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fs
/*    */   implements fj<StringArgumentType>
/*    */ {
/*    */   public void a(StringArgumentType ☃, nf nf1) {
/* 11 */     nf1.a((Enum<?>)☃.getType());
/*    */   }
/*    */ 
/*    */   
/*    */   public StringArgumentType a(nf ☃) {
/* 16 */     StringArgumentType.StringType stringType = ☃.<StringArgumentType.StringType>a(StringArgumentType.StringType.class);
/* 17 */     switch (null.a[stringType.ordinal()]) {
/*    */       case 1:
/* 19 */         return StringArgumentType.word();
/*    */       case 2:
/* 21 */         return StringArgumentType.string();
/*    */     } 
/*    */     
/* 24 */     return StringArgumentType.greedyString();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(StringArgumentType ☃, JsonObject jsonObject) {
/* 30 */     switch (null.a[☃.getType().ordinal()]) {
/*    */       case 1:
/* 32 */         jsonObject.addProperty("type", "word");
/*    */         return;
/*    */       case 2:
/* 35 */         jsonObject.addProperty("type", "phrase");
/*    */         return;
/*    */     } 
/*    */     
/* 39 */     jsonObject.addProperty("type", "greedy");
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */