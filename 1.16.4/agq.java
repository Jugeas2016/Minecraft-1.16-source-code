/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class agq extends DataFix {
/*    */   public agq(Schema ☃, boolean bool) {
/* 16 */     super(☃, bool);
/*    */   } private static final Map<String, String> a;
/*    */   static {
/* 19 */     a = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*    */           ☃.put("Airportal", "minecraft:end_portal");
/*    */           ☃.put("Banner", "minecraft:banner");
/*    */           ☃.put("Beacon", "minecraft:beacon");
/*    */           ☃.put("Cauldron", "minecraft:brewing_stand");
/*    */           ☃.put("Chest", "minecraft:chest");
/*    */           ☃.put("Comparator", "minecraft:comparator");
/*    */           ☃.put("Control", "minecraft:command_block");
/*    */           ☃.put("DLDetector", "minecraft:daylight_detector");
/*    */           ☃.put("Dropper", "minecraft:dropper");
/*    */           ☃.put("EnchantTable", "minecraft:enchanting_table");
/*    */           ☃.put("EndGateway", "minecraft:end_gateway");
/*    */           ☃.put("EnderChest", "minecraft:ender_chest");
/*    */           ☃.put("FlowerPot", "minecraft:flower_pot");
/*    */           ☃.put("Furnace", "minecraft:furnace");
/*    */           ☃.put("Hopper", "minecraft:hopper");
/*    */           ☃.put("MobSpawner", "minecraft:mob_spawner");
/*    */           ☃.put("Music", "minecraft:noteblock");
/*    */           ☃.put("Piston", "minecraft:piston");
/*    */           ☃.put("RecordPlayer", "minecraft:jukebox");
/*    */           ☃.put("Sign", "minecraft:sign");
/*    */           ☃.put("Skull", "minecraft:skull");
/*    */           ☃.put("Structure", "minecraft:structure_block");
/*    */           ☃.put("Trap", "minecraft:dispenser");
/*    */         });
/*    */   }
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 47 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/* 48 */     Type<?> type1 = getOutputSchema().getType(akn.l);
/*    */     
/* 50 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType1 = getInputSchema().findChoiceType(akn.k);
/* 51 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType2 = getOutputSchema().findChoiceType(akn.k);
/*    */     
/* 53 */     return TypeRewriteRule.seq(
/* 54 */         convertUnchecked("item stack block entity name hook converter", ☃, type1), 
/* 55 */         fixTypeEverywhere("BlockEntityIdFix", (Type)taggedChoiceType1, (Type)taggedChoiceType2, ☃ -> ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */