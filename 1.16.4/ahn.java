/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class ahn
/*    */   extends akv
/*    */ {
/*    */   public ahn(Schema ☃, boolean bool) {
/* 11 */     super("EntityCatSplitFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Pair<String, Dynamic<?>> a(String ☃, Dynamic<?> dynamic) {
/* 16 */     if (Objects.equals("minecraft:ocelot", ☃)) {
/* 17 */       int i = dynamic.get("CatType").asInt(0);
/* 18 */       if (i == 0) {
/* 19 */         String str1 = dynamic.get("Owner").asString("");
/* 20 */         String str2 = dynamic.get("OwnerUUID").asString("");
/* 21 */         if (str1.length() > 0 || str2.length() > 0) {
/* 22 */           dynamic.set("Trusting", dynamic.createBoolean(true));
/*    */         }
/* 24 */       } else if (i > 0 && i < 4) {
/* 25 */         dynamic = dynamic.set("CatType", dynamic.createInt(i));
/* 26 */         dynamic = dynamic.set("OwnerUUID", dynamic.createString(dynamic.get("OwnerUUID").asString("")));
/* 27 */         return Pair.of("minecraft:cat", dynamic);
/*    */       } 
/*    */     } 
/*    */     
/* 31 */     return Pair.of(☃, dynamic);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */