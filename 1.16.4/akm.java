/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class akm
/*    */   extends DataFix {
/*    */   public akm(Schema ☃) {
/* 11 */     super(☃, false);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 16 */     Schema ☃ = getInputSchema();
/* 17 */     return fixTypeEverywhereTyped("RedstoneConnectionsFix", ☃.getType(akn.m), ☃ -> ☃.update(DSL.remainderFinder(), this::a));
/*    */   }
/*    */   
/*    */   private <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 21 */     boolean bool = ☃.get("Name").asString().result().filter("minecraft:redstone_wire"::equals).isPresent();
/* 22 */     if (!bool) {
/* 23 */       return ☃;
/*    */     }
/*    */     
/* 26 */     return ☃.update("Properties", ☃ -> {
/*    */           String str1 = ☃.get("east").asString("none");
/*    */           String str2 = ☃.get("west").asString("none");
/*    */           String str3 = ☃.get("north").asString("none");
/*    */           String str4 = ☃.get("south").asString("none");
/* 31 */           boolean bool1 = (a(str1) || a(str2));
/* 32 */           boolean bool2 = (a(str3) || a(str4));
/*    */           
/* 34 */           String str5 = (!a(str1) && !bool2) ? "side" : str1;
/* 35 */           String str6 = (!a(str2) && !bool2) ? "side" : str2;
/* 36 */           String str7 = (!a(str3) && !bool1) ? "side" : str3;
/* 37 */           String str8 = (!a(str4) && !bool1) ? "side" : str4;
/*    */           return ☃.update("east", ()).update("west", ()).update("north", ()).update("south", ());
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static boolean a(String ☃) {
/* 48 */     return !"none".equals(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */