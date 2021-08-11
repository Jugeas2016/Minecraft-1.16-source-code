/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public class ajh
/*     */   extends DataFix {
/*     */   private static final Map<String, String> a;
/*     */   private static final Set<String> b;
/*     */   
/*     */   public ajh(Schema ☃, boolean bool) {
/*  26 */     super(☃, bool);
/*     */   }
/*     */   static {
/*  29 */     a = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("minecraft:stone.0", "minecraft:stone");
/*     */           
/*     */           ☃.put("minecraft:stone.1", "minecraft:granite");
/*     */           
/*     */           ☃.put("minecraft:stone.2", "minecraft:polished_granite");
/*     */           ☃.put("minecraft:stone.3", "minecraft:diorite");
/*     */           ☃.put("minecraft:stone.4", "minecraft:polished_diorite");
/*     */           ☃.put("minecraft:stone.5", "minecraft:andesite");
/*     */           ☃.put("minecraft:stone.6", "minecraft:polished_andesite");
/*     */           ☃.put("minecraft:dirt.0", "minecraft:dirt");
/*     */           ☃.put("minecraft:dirt.1", "minecraft:coarse_dirt");
/*     */           ☃.put("minecraft:dirt.2", "minecraft:podzol");
/*     */           ☃.put("minecraft:leaves.0", "minecraft:oak_leaves");
/*     */           ☃.put("minecraft:leaves.1", "minecraft:spruce_leaves");
/*     */           ☃.put("minecraft:leaves.2", "minecraft:birch_leaves");
/*     */           ☃.put("minecraft:leaves.3", "minecraft:jungle_leaves");
/*     */           ☃.put("minecraft:leaves2.0", "minecraft:acacia_leaves");
/*     */           ☃.put("minecraft:leaves2.1", "minecraft:dark_oak_leaves");
/*     */           ☃.put("minecraft:log.0", "minecraft:oak_log");
/*     */           ☃.put("minecraft:log.1", "minecraft:spruce_log");
/*     */           ☃.put("minecraft:log.2", "minecraft:birch_log");
/*     */           ☃.put("minecraft:log.3", "minecraft:jungle_log");
/*     */           ☃.put("minecraft:log2.0", "minecraft:acacia_log");
/*     */           ☃.put("minecraft:log2.1", "minecraft:dark_oak_log");
/*     */           ☃.put("minecraft:sapling.0", "minecraft:oak_sapling");
/*     */           ☃.put("minecraft:sapling.1", "minecraft:spruce_sapling");
/*     */           ☃.put("minecraft:sapling.2", "minecraft:birch_sapling");
/*     */           ☃.put("minecraft:sapling.3", "minecraft:jungle_sapling");
/*     */           ☃.put("minecraft:sapling.4", "minecraft:acacia_sapling");
/*     */           ☃.put("minecraft:sapling.5", "minecraft:dark_oak_sapling");
/*     */           ☃.put("minecraft:planks.0", "minecraft:oak_planks");
/*     */           ☃.put("minecraft:planks.1", "minecraft:spruce_planks");
/*     */           ☃.put("minecraft:planks.2", "minecraft:birch_planks");
/*     */           ☃.put("minecraft:planks.3", "minecraft:jungle_planks");
/*     */           ☃.put("minecraft:planks.4", "minecraft:acacia_planks");
/*     */           ☃.put("minecraft:planks.5", "minecraft:dark_oak_planks");
/*     */           ☃.put("minecraft:sand.0", "minecraft:sand");
/*     */           ☃.put("minecraft:sand.1", "minecraft:red_sand");
/*     */           ☃.put("minecraft:quartz_block.0", "minecraft:quartz_block");
/*     */           ☃.put("minecraft:quartz_block.1", "minecraft:chiseled_quartz_block");
/*     */           ☃.put("minecraft:quartz_block.2", "minecraft:quartz_pillar");
/*     */           ☃.put("minecraft:anvil.0", "minecraft:anvil");
/*     */           ☃.put("minecraft:anvil.1", "minecraft:chipped_anvil");
/*     */           ☃.put("minecraft:anvil.2", "minecraft:damaged_anvil");
/*     */           ☃.put("minecraft:wool.0", "minecraft:white_wool");
/*     */           ☃.put("minecraft:wool.1", "minecraft:orange_wool");
/*     */           ☃.put("minecraft:wool.2", "minecraft:magenta_wool");
/*     */           ☃.put("minecraft:wool.3", "minecraft:light_blue_wool");
/*     */           ☃.put("minecraft:wool.4", "minecraft:yellow_wool");
/*     */           ☃.put("minecraft:wool.5", "minecraft:lime_wool");
/*     */           ☃.put("minecraft:wool.6", "minecraft:pink_wool");
/*     */           ☃.put("minecraft:wool.7", "minecraft:gray_wool");
/*     */           ☃.put("minecraft:wool.8", "minecraft:light_gray_wool");
/*     */           ☃.put("minecraft:wool.9", "minecraft:cyan_wool");
/*     */           ☃.put("minecraft:wool.10", "minecraft:purple_wool");
/*     */           ☃.put("minecraft:wool.11", "minecraft:blue_wool");
/*     */           ☃.put("minecraft:wool.12", "minecraft:brown_wool");
/*     */           ☃.put("minecraft:wool.13", "minecraft:green_wool");
/*     */           ☃.put("minecraft:wool.14", "minecraft:red_wool");
/*     */           ☃.put("minecraft:wool.15", "minecraft:black_wool");
/*     */           ☃.put("minecraft:carpet.0", "minecraft:white_carpet");
/*     */           ☃.put("minecraft:carpet.1", "minecraft:orange_carpet");
/*     */           ☃.put("minecraft:carpet.2", "minecraft:magenta_carpet");
/*     */           ☃.put("minecraft:carpet.3", "minecraft:light_blue_carpet");
/*     */           ☃.put("minecraft:carpet.4", "minecraft:yellow_carpet");
/*     */           ☃.put("minecraft:carpet.5", "minecraft:lime_carpet");
/*     */           ☃.put("minecraft:carpet.6", "minecraft:pink_carpet");
/*     */           ☃.put("minecraft:carpet.7", "minecraft:gray_carpet");
/*     */           ☃.put("minecraft:carpet.8", "minecraft:light_gray_carpet");
/*     */           ☃.put("minecraft:carpet.9", "minecraft:cyan_carpet");
/*     */           ☃.put("minecraft:carpet.10", "minecraft:purple_carpet");
/*     */           ☃.put("minecraft:carpet.11", "minecraft:blue_carpet");
/*     */           ☃.put("minecraft:carpet.12", "minecraft:brown_carpet");
/*     */           ☃.put("minecraft:carpet.13", "minecraft:green_carpet");
/*     */           ☃.put("minecraft:carpet.14", "minecraft:red_carpet");
/*     */           ☃.put("minecraft:carpet.15", "minecraft:black_carpet");
/*     */           ☃.put("minecraft:hardened_clay.0", "minecraft:terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.0", "minecraft:white_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.1", "minecraft:orange_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.2", "minecraft:magenta_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.3", "minecraft:light_blue_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.4", "minecraft:yellow_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.5", "minecraft:lime_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.6", "minecraft:pink_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.7", "minecraft:gray_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.8", "minecraft:light_gray_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.9", "minecraft:cyan_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.10", "minecraft:purple_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.11", "minecraft:blue_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.12", "minecraft:brown_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.13", "minecraft:green_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.14", "minecraft:red_terracotta");
/*     */           ☃.put("minecraft:stained_hardened_clay.15", "minecraft:black_terracotta");
/*     */           ☃.put("minecraft:silver_glazed_terracotta.0", "minecraft:light_gray_glazed_terracotta");
/*     */           ☃.put("minecraft:stained_glass.0", "minecraft:white_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.1", "minecraft:orange_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.2", "minecraft:magenta_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.3", "minecraft:light_blue_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.4", "minecraft:yellow_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.5", "minecraft:lime_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.6", "minecraft:pink_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.7", "minecraft:gray_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.8", "minecraft:light_gray_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.9", "minecraft:cyan_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.10", "minecraft:purple_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.11", "minecraft:blue_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.12", "minecraft:brown_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.13", "minecraft:green_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.14", "minecraft:red_stained_glass");
/*     */           ☃.put("minecraft:stained_glass.15", "minecraft:black_stained_glass");
/*     */           ☃.put("minecraft:stained_glass_pane.0", "minecraft:white_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.1", "minecraft:orange_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.2", "minecraft:magenta_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.3", "minecraft:light_blue_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.4", "minecraft:yellow_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.5", "minecraft:lime_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.6", "minecraft:pink_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.7", "minecraft:gray_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.8", "minecraft:light_gray_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.9", "minecraft:cyan_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.10", "minecraft:purple_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.11", "minecraft:blue_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.12", "minecraft:brown_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.13", "minecraft:green_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.14", "minecraft:red_stained_glass_pane");
/*     */           ☃.put("minecraft:stained_glass_pane.15", "minecraft:black_stained_glass_pane");
/*     */           ☃.put("minecraft:prismarine.0", "minecraft:prismarine");
/*     */           ☃.put("minecraft:prismarine.1", "minecraft:prismarine_bricks");
/*     */           ☃.put("minecraft:prismarine.2", "minecraft:dark_prismarine");
/*     */           ☃.put("minecraft:concrete.0", "minecraft:white_concrete");
/*     */           ☃.put("minecraft:concrete.1", "minecraft:orange_concrete");
/*     */           ☃.put("minecraft:concrete.2", "minecraft:magenta_concrete");
/*     */           ☃.put("minecraft:concrete.3", "minecraft:light_blue_concrete");
/*     */           ☃.put("minecraft:concrete.4", "minecraft:yellow_concrete");
/*     */           ☃.put("minecraft:concrete.5", "minecraft:lime_concrete");
/*     */           ☃.put("minecraft:concrete.6", "minecraft:pink_concrete");
/*     */           ☃.put("minecraft:concrete.7", "minecraft:gray_concrete");
/*     */           ☃.put("minecraft:concrete.8", "minecraft:light_gray_concrete");
/*     */           ☃.put("minecraft:concrete.9", "minecraft:cyan_concrete");
/*     */           ☃.put("minecraft:concrete.10", "minecraft:purple_concrete");
/*     */           ☃.put("minecraft:concrete.11", "minecraft:blue_concrete");
/*     */           ☃.put("minecraft:concrete.12", "minecraft:brown_concrete");
/*     */           ☃.put("minecraft:concrete.13", "minecraft:green_concrete");
/*     */           ☃.put("minecraft:concrete.14", "minecraft:red_concrete");
/*     */           ☃.put("minecraft:concrete.15", "minecraft:black_concrete");
/*     */           ☃.put("minecraft:concrete_powder.0", "minecraft:white_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.1", "minecraft:orange_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.2", "minecraft:magenta_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.3", "minecraft:light_blue_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.4", "minecraft:yellow_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.5", "minecraft:lime_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.6", "minecraft:pink_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.7", "minecraft:gray_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.8", "minecraft:light_gray_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.9", "minecraft:cyan_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.10", "minecraft:purple_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.11", "minecraft:blue_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.12", "minecraft:brown_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.13", "minecraft:green_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.14", "minecraft:red_concrete_powder");
/*     */           ☃.put("minecraft:concrete_powder.15", "minecraft:black_concrete_powder");
/*     */           ☃.put("minecraft:cobblestone_wall.0", "minecraft:cobblestone_wall");
/*     */           ☃.put("minecraft:cobblestone_wall.1", "minecraft:mossy_cobblestone_wall");
/*     */           ☃.put("minecraft:sandstone.0", "minecraft:sandstone");
/*     */           ☃.put("minecraft:sandstone.1", "minecraft:chiseled_sandstone");
/*     */           ☃.put("minecraft:sandstone.2", "minecraft:cut_sandstone");
/*     */           ☃.put("minecraft:red_sandstone.0", "minecraft:red_sandstone");
/*     */           ☃.put("minecraft:red_sandstone.1", "minecraft:chiseled_red_sandstone");
/*     */           ☃.put("minecraft:red_sandstone.2", "minecraft:cut_red_sandstone");
/*     */           ☃.put("minecraft:stonebrick.0", "minecraft:stone_bricks");
/*     */           ☃.put("minecraft:stonebrick.1", "minecraft:mossy_stone_bricks");
/*     */           ☃.put("minecraft:stonebrick.2", "minecraft:cracked_stone_bricks");
/*     */           ☃.put("minecraft:stonebrick.3", "minecraft:chiseled_stone_bricks");
/*     */           ☃.put("minecraft:monster_egg.0", "minecraft:infested_stone");
/*     */           ☃.put("minecraft:monster_egg.1", "minecraft:infested_cobblestone");
/*     */           ☃.put("minecraft:monster_egg.2", "minecraft:infested_stone_bricks");
/*     */           ☃.put("minecraft:monster_egg.3", "minecraft:infested_mossy_stone_bricks");
/*     */           ☃.put("minecraft:monster_egg.4", "minecraft:infested_cracked_stone_bricks");
/*     */           ☃.put("minecraft:monster_egg.5", "minecraft:infested_chiseled_stone_bricks");
/*     */           ☃.put("minecraft:yellow_flower.0", "minecraft:dandelion");
/*     */           ☃.put("minecraft:red_flower.0", "minecraft:poppy");
/*     */           ☃.put("minecraft:red_flower.1", "minecraft:blue_orchid");
/*     */           ☃.put("minecraft:red_flower.2", "minecraft:allium");
/*     */           ☃.put("minecraft:red_flower.3", "minecraft:azure_bluet");
/*     */           ☃.put("minecraft:red_flower.4", "minecraft:red_tulip");
/*     */           ☃.put("minecraft:red_flower.5", "minecraft:orange_tulip");
/*     */           ☃.put("minecraft:red_flower.6", "minecraft:white_tulip");
/*     */           ☃.put("minecraft:red_flower.7", "minecraft:pink_tulip");
/*     */           ☃.put("minecraft:red_flower.8", "minecraft:oxeye_daisy");
/*     */           ☃.put("minecraft:double_plant.0", "minecraft:sunflower");
/*     */           ☃.put("minecraft:double_plant.1", "minecraft:lilac");
/*     */           ☃.put("minecraft:double_plant.2", "minecraft:tall_grass");
/*     */           ☃.put("minecraft:double_plant.3", "minecraft:large_fern");
/*     */           ☃.put("minecraft:double_plant.4", "minecraft:rose_bush");
/*     */           ☃.put("minecraft:double_plant.5", "minecraft:peony");
/*     */           ☃.put("minecraft:deadbush.0", "minecraft:dead_bush");
/*     */           ☃.put("minecraft:tallgrass.0", "minecraft:dead_bush");
/*     */           ☃.put("minecraft:tallgrass.1", "minecraft:grass");
/*     */           ☃.put("minecraft:tallgrass.2", "minecraft:fern");
/*     */           ☃.put("minecraft:sponge.0", "minecraft:sponge");
/*     */           ☃.put("minecraft:sponge.1", "minecraft:wet_sponge");
/*     */           ☃.put("minecraft:purpur_slab.0", "minecraft:purpur_slab");
/*     */           ☃.put("minecraft:stone_slab.0", "minecraft:stone_slab");
/*     */           ☃.put("minecraft:stone_slab.1", "minecraft:sandstone_slab");
/*     */           ☃.put("minecraft:stone_slab.2", "minecraft:petrified_oak_slab");
/*     */           ☃.put("minecraft:stone_slab.3", "minecraft:cobblestone_slab");
/*     */           ☃.put("minecraft:stone_slab.4", "minecraft:brick_slab");
/*     */           ☃.put("minecraft:stone_slab.5", "minecraft:stone_brick_slab");
/*     */           ☃.put("minecraft:stone_slab.6", "minecraft:nether_brick_slab");
/*     */           ☃.put("minecraft:stone_slab.7", "minecraft:quartz_slab");
/*     */           ☃.put("minecraft:stone_slab2.0", "minecraft:red_sandstone_slab");
/*     */           ☃.put("minecraft:wooden_slab.0", "minecraft:oak_slab");
/*     */           ☃.put("minecraft:wooden_slab.1", "minecraft:spruce_slab");
/*     */           ☃.put("minecraft:wooden_slab.2", "minecraft:birch_slab");
/*     */           ☃.put("minecraft:wooden_slab.3", "minecraft:jungle_slab");
/*     */           ☃.put("minecraft:wooden_slab.4", "minecraft:acacia_slab");
/*     */           ☃.put("minecraft:wooden_slab.5", "minecraft:dark_oak_slab");
/*     */           ☃.put("minecraft:coal.0", "minecraft:coal");
/*     */           ☃.put("minecraft:coal.1", "minecraft:charcoal");
/*     */           ☃.put("minecraft:fish.0", "minecraft:cod");
/*     */           ☃.put("minecraft:fish.1", "minecraft:salmon");
/*     */           ☃.put("minecraft:fish.2", "minecraft:clownfish");
/*     */           ☃.put("minecraft:fish.3", "minecraft:pufferfish");
/*     */           ☃.put("minecraft:cooked_fish.0", "minecraft:cooked_cod");
/*     */           ☃.put("minecraft:cooked_fish.1", "minecraft:cooked_salmon");
/*     */           ☃.put("minecraft:skull.0", "minecraft:skeleton_skull");
/*     */           ☃.put("minecraft:skull.1", "minecraft:wither_skeleton_skull");
/*     */           ☃.put("minecraft:skull.2", "minecraft:zombie_head");
/*     */           ☃.put("minecraft:skull.3", "minecraft:player_head");
/*     */           ☃.put("minecraft:skull.4", "minecraft:creeper_head");
/*     */           ☃.put("minecraft:skull.5", "minecraft:dragon_head");
/*     */           ☃.put("minecraft:golden_apple.0", "minecraft:golden_apple");
/*     */           ☃.put("minecraft:golden_apple.1", "minecraft:enchanted_golden_apple");
/*     */           ☃.put("minecraft:fireworks.0", "minecraft:firework_rocket");
/*     */           ☃.put("minecraft:firework_charge.0", "minecraft:firework_star");
/*     */           ☃.put("minecraft:dye.0", "minecraft:ink_sac");
/*     */           ☃.put("minecraft:dye.1", "minecraft:rose_red");
/*     */           ☃.put("minecraft:dye.2", "minecraft:cactus_green");
/*     */           ☃.put("minecraft:dye.3", "minecraft:cocoa_beans");
/*     */           ☃.put("minecraft:dye.4", "minecraft:lapis_lazuli");
/*     */           ☃.put("minecraft:dye.5", "minecraft:purple_dye");
/*     */           ☃.put("minecraft:dye.6", "minecraft:cyan_dye");
/*     */           ☃.put("minecraft:dye.7", "minecraft:light_gray_dye");
/*     */           ☃.put("minecraft:dye.8", "minecraft:gray_dye");
/*     */           ☃.put("minecraft:dye.9", "minecraft:pink_dye");
/*     */           ☃.put("minecraft:dye.10", "minecraft:lime_dye");
/*     */           ☃.put("minecraft:dye.11", "minecraft:dandelion_yellow");
/*     */           ☃.put("minecraft:dye.12", "minecraft:light_blue_dye");
/*     */           ☃.put("minecraft:dye.13", "minecraft:magenta_dye");
/*     */           ☃.put("minecraft:dye.14", "minecraft:orange_dye");
/*     */           ☃.put("minecraft:dye.15", "minecraft:bone_meal");
/*     */           ☃.put("minecraft:silver_shulker_box.0", "minecraft:light_gray_shulker_box");
/*     */           ☃.put("minecraft:fence.0", "minecraft:oak_fence");
/*     */           ☃.put("minecraft:fence_gate.0", "minecraft:oak_fence_gate");
/*     */           ☃.put("minecraft:wooden_door.0", "minecraft:oak_door");
/*     */           ☃.put("minecraft:boat.0", "minecraft:oak_boat");
/*     */           ☃.put("minecraft:lit_pumpkin.0", "minecraft:jack_o_lantern");
/*     */           ☃.put("minecraft:pumpkin.0", "minecraft:carved_pumpkin");
/*     */           ☃.put("minecraft:trapdoor.0", "minecraft:oak_trapdoor");
/*     */           ☃.put("minecraft:nether_brick.0", "minecraft:nether_bricks");
/*     */           ☃.put("minecraft:red_nether_brick.0", "minecraft:red_nether_bricks");
/*     */           ☃.put("minecraft:netherbrick.0", "minecraft:nether_brick");
/*     */           ☃.put("minecraft:wooden_button.0", "minecraft:oak_button");
/*     */           ☃.put("minecraft:wooden_pressure_plate.0", "minecraft:oak_pressure_plate");
/*     */           ☃.put("minecraft:noteblock.0", "minecraft:note_block");
/*     */           ☃.put("minecraft:bed.0", "minecraft:white_bed");
/*     */           ☃.put("minecraft:bed.1", "minecraft:orange_bed");
/*     */           ☃.put("minecraft:bed.2", "minecraft:magenta_bed");
/*     */           ☃.put("minecraft:bed.3", "minecraft:light_blue_bed");
/*     */           ☃.put("minecraft:bed.4", "minecraft:yellow_bed");
/*     */           ☃.put("minecraft:bed.5", "minecraft:lime_bed");
/*     */           ☃.put("minecraft:bed.6", "minecraft:pink_bed");
/*     */           ☃.put("minecraft:bed.7", "minecraft:gray_bed");
/*     */           ☃.put("minecraft:bed.8", "minecraft:light_gray_bed");
/*     */           ☃.put("minecraft:bed.9", "minecraft:cyan_bed");
/*     */           ☃.put("minecraft:bed.10", "minecraft:purple_bed");
/*     */           ☃.put("minecraft:bed.11", "minecraft:blue_bed");
/*     */           ☃.put("minecraft:bed.12", "minecraft:brown_bed");
/*     */           ☃.put("minecraft:bed.13", "minecraft:green_bed");
/*     */           ☃.put("minecraft:bed.14", "minecraft:red_bed");
/*     */           ☃.put("minecraft:bed.15", "minecraft:black_bed");
/*     */           ☃.put("minecraft:banner.15", "minecraft:white_banner");
/*     */           ☃.put("minecraft:banner.14", "minecraft:orange_banner");
/*     */           ☃.put("minecraft:banner.13", "minecraft:magenta_banner");
/*     */           ☃.put("minecraft:banner.12", "minecraft:light_blue_banner");
/*     */           ☃.put("minecraft:banner.11", "minecraft:yellow_banner");
/*     */           ☃.put("minecraft:banner.10", "minecraft:lime_banner");
/*     */           ☃.put("minecraft:banner.9", "minecraft:pink_banner");
/*     */           ☃.put("minecraft:banner.8", "minecraft:gray_banner");
/*     */           ☃.put("minecraft:banner.7", "minecraft:light_gray_banner");
/*     */           ☃.put("minecraft:banner.6", "minecraft:cyan_banner");
/*     */           ☃.put("minecraft:banner.5", "minecraft:purple_banner");
/*     */           ☃.put("minecraft:banner.4", "minecraft:blue_banner");
/*     */           ☃.put("minecraft:banner.3", "minecraft:brown_banner");
/*     */           ☃.put("minecraft:banner.2", "minecraft:green_banner");
/*     */           ☃.put("minecraft:banner.1", "minecraft:red_banner");
/*     */           ☃.put("minecraft:banner.0", "minecraft:black_banner");
/*     */           ☃.put("minecraft:grass.0", "minecraft:grass_block");
/*     */           ☃.put("minecraft:brick_block.0", "minecraft:bricks");
/*     */           ☃.put("minecraft:end_bricks.0", "minecraft:end_stone_bricks");
/*     */           ☃.put("minecraft:golden_rail.0", "minecraft:powered_rail");
/*     */           ☃.put("minecraft:magma.0", "minecraft:magma_block");
/*     */           ☃.put("minecraft:quartz_ore.0", "minecraft:nether_quartz_ore");
/*     */           ☃.put("minecraft:reeds.0", "minecraft:sugar_cane");
/*     */           ☃.put("minecraft:slime.0", "minecraft:slime_block");
/*     */           ☃.put("minecraft:stone_stairs.0", "minecraft:cobblestone_stairs");
/*     */           ☃.put("minecraft:waterlily.0", "minecraft:lily_pad");
/*     */           ☃.put("minecraft:web.0", "minecraft:cobweb");
/*     */           ☃.put("minecraft:snow.0", "minecraft:snow_block");
/*     */           ☃.put("minecraft:snow_layer.0", "minecraft:snow");
/*     */           ☃.put("minecraft:record_11.0", "minecraft:music_disc_11");
/*     */           ☃.put("minecraft:record_13.0", "minecraft:music_disc_13");
/*     */           ☃.put("minecraft:record_blocks.0", "minecraft:music_disc_blocks");
/*     */           ☃.put("minecraft:record_cat.0", "minecraft:music_disc_cat");
/*     */           ☃.put("minecraft:record_chirp.0", "minecraft:music_disc_chirp");
/*     */           ☃.put("minecraft:record_far.0", "minecraft:music_disc_far");
/*     */           ☃.put("minecraft:record_mall.0", "minecraft:music_disc_mall");
/*     */           ☃.put("minecraft:record_mellohi.0", "minecraft:music_disc_mellohi");
/*     */           ☃.put("minecraft:record_stal.0", "minecraft:music_disc_stal");
/*     */           ☃.put("minecraft:record_strad.0", "minecraft:music_disc_strad");
/*     */           ☃.put("minecraft:record_wait.0", "minecraft:music_disc_wait");
/*     */           ☃.put("minecraft:record_ward.0", "minecraft:music_disc_ward");
/*     */         });
/* 353 */     b = (Set<String>)a.keySet().stream().map(☃ -> ☃.substring(0, ☃.indexOf('.'))).collect(Collectors.toSet());
/*     */   }
/* 355 */   private static final Set<String> c = Sets.newHashSet((Object[])new String[] { "minecraft:bow", "minecraft:carrot_on_a_stick", "minecraft:chainmail_boots", "minecraft:chainmail_chestplate", "minecraft:chainmail_helmet", "minecraft:chainmail_leggings", "minecraft:diamond_axe", "minecraft:diamond_boots", "minecraft:diamond_chestplate", "minecraft:diamond_helmet", "minecraft:diamond_hoe", "minecraft:diamond_leggings", "minecraft:diamond_pickaxe", "minecraft:diamond_shovel", "minecraft:diamond_sword", "minecraft:elytra", "minecraft:fishing_rod", "minecraft:flint_and_steel", "minecraft:golden_axe", "minecraft:golden_boots", "minecraft:golden_chestplate", "minecraft:golden_helmet", "minecraft:golden_hoe", "minecraft:golden_leggings", "minecraft:golden_pickaxe", "minecraft:golden_shovel", "minecraft:golden_sword", "minecraft:iron_axe", "minecraft:iron_boots", "minecraft:iron_chestplate", "minecraft:iron_helmet", "minecraft:iron_hoe", "minecraft:iron_leggings", "minecraft:iron_pickaxe", "minecraft:iron_shovel", "minecraft:iron_sword", "minecraft:leather_boots", "minecraft:leather_chestplate", "minecraft:leather_helmet", "minecraft:leather_leggings", "minecraft:shears", "minecraft:shield", "minecraft:stone_axe", "minecraft:stone_hoe", "minecraft:stone_pickaxe", "minecraft:stone_shovel", "minecraft:stone_sword", "minecraft:wooden_axe", "minecraft:wooden_hoe", "minecraft:wooden_pickaxe", "minecraft:wooden_shovel", "minecraft:wooden_sword" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/* 412 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/*     */     
/* 414 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 415 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/*     */     
/* 417 */     return fixTypeEverywhereTyped("ItemInstanceTheFlatteningFix", ☃, typed -> {
/*     */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*     */           if (!optional.isPresent()) {
/*     */             return typed;
/*     */           }
/*     */           ☃ = typed;
/*     */           Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*     */           int i = dynamic.get("Damage").asInt(0);
/*     */           String str = a((String)((Pair)optional.get()).getSecond(), i);
/*     */           if (str != null) {
/*     */             ☃ = ☃.set(☃, Pair.of(akn.r.typeName(), str));
/*     */           }
/*     */           if (c.contains(((Pair)optional.get()).getSecond())) {
/*     */             Typed<?> typed1 = typed.getOrCreateTyped(opticFinder1);
/*     */             Dynamic<?> dynamic1 = (Dynamic)typed1.get(DSL.remainderFinder());
/*     */             dynamic1 = dynamic1.set("Damage", dynamic1.createInt(i));
/*     */             ☃ = ☃.set(opticFinder1, typed1.set(DSL.remainderFinder(), dynamic1));
/*     */           } 
/*     */           return ☃.set(DSL.remainderFinder(), dynamic.remove("Damage"));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static String a(@Nullable String ☃, int i) {
/* 446 */     if (b.contains(☃)) {
/* 447 */       String str = a.get(☃ + '.' + i);
/* 448 */       return (str == null) ? a.get(☃ + ".0") : str;
/*     */     } 
/* 450 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */