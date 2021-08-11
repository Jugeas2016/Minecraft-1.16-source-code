/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ public class ahv extends DataFix {
/*     */   public ahv(Schema ☃, boolean bool) {
/*  15 */     super(☃, bool);
/*     */   } private static final Map<String, String> a;
/*     */   static {
/*  18 */     a = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("AreaEffectCloud", "minecraft:area_effect_cloud");
/*     */           ☃.put("ArmorStand", "minecraft:armor_stand");
/*     */           ☃.put("Arrow", "minecraft:arrow");
/*     */           ☃.put("Bat", "minecraft:bat");
/*     */           ☃.put("Blaze", "minecraft:blaze");
/*     */           ☃.put("Boat", "minecraft:boat");
/*     */           ☃.put("CaveSpider", "minecraft:cave_spider");
/*     */           ☃.put("Chicken", "minecraft:chicken");
/*     */           ☃.put("Cow", "minecraft:cow");
/*     */           ☃.put("Creeper", "minecraft:creeper");
/*     */           ☃.put("Donkey", "minecraft:donkey");
/*     */           ☃.put("DragonFireball", "minecraft:dragon_fireball");
/*     */           ☃.put("ElderGuardian", "minecraft:elder_guardian");
/*     */           ☃.put("EnderCrystal", "minecraft:ender_crystal");
/*     */           ☃.put("EnderDragon", "minecraft:ender_dragon");
/*     */           ☃.put("Enderman", "minecraft:enderman");
/*     */           ☃.put("Endermite", "minecraft:endermite");
/*     */           ☃.put("EyeOfEnderSignal", "minecraft:eye_of_ender_signal");
/*     */           ☃.put("FallingSand", "minecraft:falling_block");
/*     */           ☃.put("Fireball", "minecraft:fireball");
/*     */           ☃.put("FireworksRocketEntity", "minecraft:fireworks_rocket");
/*     */           ☃.put("Ghast", "minecraft:ghast");
/*     */           ☃.put("Giant", "minecraft:giant");
/*     */           ☃.put("Guardian", "minecraft:guardian");
/*     */           ☃.put("Horse", "minecraft:horse");
/*     */           ☃.put("Husk", "minecraft:husk");
/*     */           ☃.put("Item", "minecraft:item");
/*     */           ☃.put("ItemFrame", "minecraft:item_frame");
/*     */           ☃.put("LavaSlime", "minecraft:magma_cube");
/*     */           ☃.put("LeashKnot", "minecraft:leash_knot");
/*     */           ☃.put("MinecartChest", "minecraft:chest_minecart");
/*     */           ☃.put("MinecartCommandBlock", "minecraft:commandblock_minecart");
/*     */           ☃.put("MinecartFurnace", "minecraft:furnace_minecart");
/*     */           ☃.put("MinecartHopper", "minecraft:hopper_minecart");
/*     */           ☃.put("MinecartRideable", "minecraft:minecart");
/*     */           ☃.put("MinecartSpawner", "minecraft:spawner_minecart");
/*     */           ☃.put("MinecartTNT", "minecraft:tnt_minecart");
/*     */           ☃.put("Mule", "minecraft:mule");
/*     */           ☃.put("MushroomCow", "minecraft:mooshroom");
/*     */           ☃.put("Ozelot", "minecraft:ocelot");
/*     */           ☃.put("Painting", "minecraft:painting");
/*     */           ☃.put("Pig", "minecraft:pig");
/*     */           ☃.put("PigZombie", "minecraft:zombie_pigman");
/*     */           ☃.put("PolarBear", "minecraft:polar_bear");
/*     */           ☃.put("PrimedTnt", "minecraft:tnt");
/*     */           ☃.put("Rabbit", "minecraft:rabbit");
/*     */           ☃.put("Sheep", "minecraft:sheep");
/*     */           ☃.put("Shulker", "minecraft:shulker");
/*     */           ☃.put("ShulkerBullet", "minecraft:shulker_bullet");
/*     */           ☃.put("Silverfish", "minecraft:silverfish");
/*     */           ☃.put("Skeleton", "minecraft:skeleton");
/*     */           ☃.put("SkeletonHorse", "minecraft:skeleton_horse");
/*     */           ☃.put("Slime", "minecraft:slime");
/*     */           ☃.put("SmallFireball", "minecraft:small_fireball");
/*     */           ☃.put("SnowMan", "minecraft:snowman");
/*     */           ☃.put("Snowball", "minecraft:snowball");
/*     */           ☃.put("SpectralArrow", "minecraft:spectral_arrow");
/*     */           ☃.put("Spider", "minecraft:spider");
/*     */           ☃.put("Squid", "minecraft:squid");
/*     */           ☃.put("Stray", "minecraft:stray");
/*     */           ☃.put("ThrownEgg", "minecraft:egg");
/*     */           ☃.put("ThrownEnderpearl", "minecraft:ender_pearl");
/*     */           ☃.put("ThrownExpBottle", "minecraft:xp_bottle");
/*     */           ☃.put("ThrownPotion", "minecraft:potion");
/*     */           ☃.put("Villager", "minecraft:villager");
/*     */           ☃.put("VillagerGolem", "minecraft:villager_golem");
/*     */           ☃.put("Witch", "minecraft:witch");
/*     */           ☃.put("WitherBoss", "minecraft:wither");
/*     */           ☃.put("WitherSkeleton", "minecraft:wither_skeleton");
/*     */           ☃.put("WitherSkull", "minecraft:wither_skull");
/*     */           ☃.put("Wolf", "minecraft:wolf");
/*     */           ☃.put("XPOrb", "minecraft:xp_orb");
/*     */           ☃.put("Zombie", "minecraft:zombie");
/*     */           ☃.put("ZombieHorse", "minecraft:zombie_horse");
/*     */           ☃.put("ZombieVillager", "minecraft:zombie_villager");
/*     */         });
/*     */   }
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/*  98 */     TaggedChoice.TaggedChoiceType<String> ☃ = getInputSchema().findChoiceType(akn.p);
/*  99 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType1 = getOutputSchema().findChoiceType(akn.p);
/*     */     
/* 101 */     Type<?> type1 = getInputSchema().getType(akn.l);
/* 102 */     Type<?> type2 = getOutputSchema().getType(akn.l);
/*     */     
/* 104 */     return TypeRewriteRule.seq(
/* 105 */         convertUnchecked("item stack entity name hook converter", type1, type2), 
/* 106 */         fixTypeEverywhere("EntityIdFix", (Type)☃, (Type)taggedChoiceType1, ☃ -> ()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */