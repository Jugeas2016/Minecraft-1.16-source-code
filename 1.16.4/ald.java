/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class ald
/*    */   extends ajv {
/*    */   public ald(Schema ☃, String str) {
/* 12 */     super(☃, false, "Villager profession data fix (" + str + ")", akn.p, str);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 17 */     Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/*    */     
/* 19 */     return ☃.set(DSL.remainderFinder(), dynamic
/* 20 */         .remove("Profession")
/* 21 */         .remove("Career")
/* 22 */         .remove("CareerLevel")
/* 23 */         .set("VillagerData", dynamic
/* 24 */           .createMap((Map)ImmutableMap.of(dynamic
/* 25 */               .createString("type"), dynamic.createString("minecraft:plains"), dynamic
/* 26 */               .createString("profession"), dynamic.createString(a(dynamic.get("Profession").asInt(0), dynamic.get("Career").asInt(0))), dynamic
/* 27 */               .createString("level"), DataFixUtils.orElse(dynamic.get("CareerLevel").result(), dynamic.createInt(1))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static String a(int ☃, int i) {
/* 34 */     if (☃ == 0) {
/* 35 */       if (i == 2)
/* 36 */         return "minecraft:fisherman"; 
/* 37 */       if (i == 3)
/* 38 */         return "minecraft:shepherd"; 
/* 39 */       if (i == 4) {
/* 40 */         return "minecraft:fletcher";
/*    */       }
/* 42 */       return "minecraft:farmer";
/*    */     } 
/* 44 */     if (☃ == 1) {
/* 45 */       if (i == 2) {
/* 46 */         return "minecraft:cartographer";
/*    */       }
/* 48 */       return "minecraft:librarian";
/*    */     } 
/* 50 */     if (☃ == 2)
/* 51 */       return "minecraft:cleric"; 
/* 52 */     if (☃ == 3) {
/* 53 */       if (i == 2)
/* 54 */         return "minecraft:weaponsmith"; 
/* 55 */       if (i == 3) {
/* 56 */         return "minecraft:toolsmith";
/*    */       }
/* 58 */       return "minecraft:armorer";
/*    */     } 
/* 60 */     if (☃ == 4) {
/* 61 */       if (i == 2) {
/* 62 */         return "minecraft:leatherworker";
/*    */       }
/* 64 */       return "minecraft:butcher";
/*    */     } 
/* 66 */     if (☃ == 5) {
/* 67 */       return "minecraft:nitwit";
/*    */     }
/* 69 */     return "minecraft:none";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ald.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */