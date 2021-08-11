/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.templates.Tag;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.datafixers.util.Unit;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
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
/*     */ public class ahm
/*     */   extends DataFix
/*     */ {
/*     */   private static final Map<String, Integer> a;
/*     */   
/*     */   public ahm(Schema ☃, boolean bool) {
/*  34 */     super(☃, bool);
/*     */   }
/*     */   static {
/*  37 */     a = (Map<String, Integer>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("minecraft:air", Integer.valueOf(0));
/*     */           ☃.put("minecraft:stone", Integer.valueOf(1));
/*     */           ☃.put("minecraft:grass", Integer.valueOf(2));
/*     */           ☃.put("minecraft:dirt", Integer.valueOf(3));
/*     */           ☃.put("minecraft:cobblestone", Integer.valueOf(4));
/*     */           ☃.put("minecraft:planks", Integer.valueOf(5));
/*     */           ☃.put("minecraft:sapling", Integer.valueOf(6));
/*     */           ☃.put("minecraft:bedrock", Integer.valueOf(7));
/*     */           ☃.put("minecraft:flowing_water", Integer.valueOf(8));
/*     */           ☃.put("minecraft:water", Integer.valueOf(9));
/*     */           ☃.put("minecraft:flowing_lava", Integer.valueOf(10));
/*     */           ☃.put("minecraft:lava", Integer.valueOf(11));
/*     */           ☃.put("minecraft:sand", Integer.valueOf(12));
/*     */           ☃.put("minecraft:gravel", Integer.valueOf(13));
/*     */           ☃.put("minecraft:gold_ore", Integer.valueOf(14));
/*     */           ☃.put("minecraft:iron_ore", Integer.valueOf(15));
/*     */           ☃.put("minecraft:coal_ore", Integer.valueOf(16));
/*     */           ☃.put("minecraft:log", Integer.valueOf(17));
/*     */           ☃.put("minecraft:leaves", Integer.valueOf(18));
/*     */           ☃.put("minecraft:sponge", Integer.valueOf(19));
/*     */           ☃.put("minecraft:glass", Integer.valueOf(20));
/*     */           ☃.put("minecraft:lapis_ore", Integer.valueOf(21));
/*     */           ☃.put("minecraft:lapis_block", Integer.valueOf(22));
/*     */           ☃.put("minecraft:dispenser", Integer.valueOf(23));
/*     */           ☃.put("minecraft:sandstone", Integer.valueOf(24));
/*     */           ☃.put("minecraft:noteblock", Integer.valueOf(25));
/*     */           ☃.put("minecraft:bed", Integer.valueOf(26));
/*     */           ☃.put("minecraft:golden_rail", Integer.valueOf(27));
/*     */           ☃.put("minecraft:detector_rail", Integer.valueOf(28));
/*     */           ☃.put("minecraft:sticky_piston", Integer.valueOf(29));
/*     */           ☃.put("minecraft:web", Integer.valueOf(30));
/*     */           ☃.put("minecraft:tallgrass", Integer.valueOf(31));
/*     */           ☃.put("minecraft:deadbush", Integer.valueOf(32));
/*     */           ☃.put("minecraft:piston", Integer.valueOf(33));
/*     */           ☃.put("minecraft:piston_head", Integer.valueOf(34));
/*     */           ☃.put("minecraft:wool", Integer.valueOf(35));
/*     */           ☃.put("minecraft:piston_extension", Integer.valueOf(36));
/*     */           ☃.put("minecraft:yellow_flower", Integer.valueOf(37));
/*     */           ☃.put("minecraft:red_flower", Integer.valueOf(38));
/*     */           ☃.put("minecraft:brown_mushroom", Integer.valueOf(39));
/*     */           ☃.put("minecraft:red_mushroom", Integer.valueOf(40));
/*     */           ☃.put("minecraft:gold_block", Integer.valueOf(41));
/*     */           ☃.put("minecraft:iron_block", Integer.valueOf(42));
/*     */           ☃.put("minecraft:double_stone_slab", Integer.valueOf(43));
/*     */           ☃.put("minecraft:stone_slab", Integer.valueOf(44));
/*     */           ☃.put("minecraft:brick_block", Integer.valueOf(45));
/*     */           ☃.put("minecraft:tnt", Integer.valueOf(46));
/*     */           ☃.put("minecraft:bookshelf", Integer.valueOf(47));
/*     */           ☃.put("minecraft:mossy_cobblestone", Integer.valueOf(48));
/*     */           ☃.put("minecraft:obsidian", Integer.valueOf(49));
/*     */           ☃.put("minecraft:torch", Integer.valueOf(50));
/*     */           ☃.put("minecraft:fire", Integer.valueOf(51));
/*     */           ☃.put("minecraft:mob_spawner", Integer.valueOf(52));
/*     */           ☃.put("minecraft:oak_stairs", Integer.valueOf(53));
/*     */           ☃.put("minecraft:chest", Integer.valueOf(54));
/*     */           ☃.put("minecraft:redstone_wire", Integer.valueOf(55));
/*     */           ☃.put("minecraft:diamond_ore", Integer.valueOf(56));
/*     */           ☃.put("minecraft:diamond_block", Integer.valueOf(57));
/*     */           ☃.put("minecraft:crafting_table", Integer.valueOf(58));
/*     */           ☃.put("minecraft:wheat", Integer.valueOf(59));
/*     */           ☃.put("minecraft:farmland", Integer.valueOf(60));
/*     */           ☃.put("minecraft:furnace", Integer.valueOf(61));
/*     */           ☃.put("minecraft:lit_furnace", Integer.valueOf(62));
/*     */           ☃.put("minecraft:standing_sign", Integer.valueOf(63));
/*     */           ☃.put("minecraft:wooden_door", Integer.valueOf(64));
/*     */           ☃.put("minecraft:ladder", Integer.valueOf(65));
/*     */           ☃.put("minecraft:rail", Integer.valueOf(66));
/*     */           ☃.put("minecraft:stone_stairs", Integer.valueOf(67));
/*     */           ☃.put("minecraft:wall_sign", Integer.valueOf(68));
/*     */           ☃.put("minecraft:lever", Integer.valueOf(69));
/*     */           ☃.put("minecraft:stone_pressure_plate", Integer.valueOf(70));
/*     */           ☃.put("minecraft:iron_door", Integer.valueOf(71));
/*     */           ☃.put("minecraft:wooden_pressure_plate", Integer.valueOf(72));
/*     */           ☃.put("minecraft:redstone_ore", Integer.valueOf(73));
/*     */           ☃.put("minecraft:lit_redstone_ore", Integer.valueOf(74));
/*     */           ☃.put("minecraft:unlit_redstone_torch", Integer.valueOf(75));
/*     */           ☃.put("minecraft:redstone_torch", Integer.valueOf(76));
/*     */           ☃.put("minecraft:stone_button", Integer.valueOf(77));
/*     */           ☃.put("minecraft:snow_layer", Integer.valueOf(78));
/*     */           ☃.put("minecraft:ice", Integer.valueOf(79));
/*     */           ☃.put("minecraft:snow", Integer.valueOf(80));
/*     */           ☃.put("minecraft:cactus", Integer.valueOf(81));
/*     */           ☃.put("minecraft:clay", Integer.valueOf(82));
/*     */           ☃.put("minecraft:reeds", Integer.valueOf(83));
/*     */           ☃.put("minecraft:jukebox", Integer.valueOf(84));
/*     */           ☃.put("minecraft:fence", Integer.valueOf(85));
/*     */           ☃.put("minecraft:pumpkin", Integer.valueOf(86));
/*     */           ☃.put("minecraft:netherrack", Integer.valueOf(87));
/*     */           ☃.put("minecraft:soul_sand", Integer.valueOf(88));
/*     */           ☃.put("minecraft:glowstone", Integer.valueOf(89));
/*     */           ☃.put("minecraft:portal", Integer.valueOf(90));
/*     */           ☃.put("minecraft:lit_pumpkin", Integer.valueOf(91));
/*     */           ☃.put("minecraft:cake", Integer.valueOf(92));
/*     */           ☃.put("minecraft:unpowered_repeater", Integer.valueOf(93));
/*     */           ☃.put("minecraft:powered_repeater", Integer.valueOf(94));
/*     */           ☃.put("minecraft:stained_glass", Integer.valueOf(95));
/*     */           ☃.put("minecraft:trapdoor", Integer.valueOf(96));
/*     */           ☃.put("minecraft:monster_egg", Integer.valueOf(97));
/*     */           ☃.put("minecraft:stonebrick", Integer.valueOf(98));
/*     */           ☃.put("minecraft:brown_mushroom_block", Integer.valueOf(99));
/*     */           ☃.put("minecraft:red_mushroom_block", Integer.valueOf(100));
/*     */           ☃.put("minecraft:iron_bars", Integer.valueOf(101));
/*     */           ☃.put("minecraft:glass_pane", Integer.valueOf(102));
/*     */           ☃.put("minecraft:melon_block", Integer.valueOf(103));
/*     */           ☃.put("minecraft:pumpkin_stem", Integer.valueOf(104));
/*     */           ☃.put("minecraft:melon_stem", Integer.valueOf(105));
/*     */           ☃.put("minecraft:vine", Integer.valueOf(106));
/*     */           ☃.put("minecraft:fence_gate", Integer.valueOf(107));
/*     */           ☃.put("minecraft:brick_stairs", Integer.valueOf(108));
/*     */           ☃.put("minecraft:stone_brick_stairs", Integer.valueOf(109));
/*     */           ☃.put("minecraft:mycelium", Integer.valueOf(110));
/*     */           ☃.put("minecraft:waterlily", Integer.valueOf(111));
/*     */           ☃.put("minecraft:nether_brick", Integer.valueOf(112));
/*     */           ☃.put("minecraft:nether_brick_fence", Integer.valueOf(113));
/*     */           ☃.put("minecraft:nether_brick_stairs", Integer.valueOf(114));
/*     */           ☃.put("minecraft:nether_wart", Integer.valueOf(115));
/*     */           ☃.put("minecraft:enchanting_table", Integer.valueOf(116));
/*     */           ☃.put("minecraft:brewing_stand", Integer.valueOf(117));
/*     */           ☃.put("minecraft:cauldron", Integer.valueOf(118));
/*     */           ☃.put("minecraft:end_portal", Integer.valueOf(119));
/*     */           ☃.put("minecraft:end_portal_frame", Integer.valueOf(120));
/*     */           ☃.put("minecraft:end_stone", Integer.valueOf(121));
/*     */           ☃.put("minecraft:dragon_egg", Integer.valueOf(122));
/*     */           ☃.put("minecraft:redstone_lamp", Integer.valueOf(123));
/*     */           ☃.put("minecraft:lit_redstone_lamp", Integer.valueOf(124));
/*     */           ☃.put("minecraft:double_wooden_slab", Integer.valueOf(125));
/*     */           ☃.put("minecraft:wooden_slab", Integer.valueOf(126));
/*     */           ☃.put("minecraft:cocoa", Integer.valueOf(127));
/*     */           ☃.put("minecraft:sandstone_stairs", Integer.valueOf(128));
/*     */           ☃.put("minecraft:emerald_ore", Integer.valueOf(129));
/*     */           ☃.put("minecraft:ender_chest", Integer.valueOf(130));
/*     */           ☃.put("minecraft:tripwire_hook", Integer.valueOf(131));
/*     */           ☃.put("minecraft:tripwire", Integer.valueOf(132));
/*     */           ☃.put("minecraft:emerald_block", Integer.valueOf(133));
/*     */           ☃.put("minecraft:spruce_stairs", Integer.valueOf(134));
/*     */           ☃.put("minecraft:birch_stairs", Integer.valueOf(135));
/*     */           ☃.put("minecraft:jungle_stairs", Integer.valueOf(136));
/*     */           ☃.put("minecraft:command_block", Integer.valueOf(137));
/*     */           ☃.put("minecraft:beacon", Integer.valueOf(138));
/*     */           ☃.put("minecraft:cobblestone_wall", Integer.valueOf(139));
/*     */           ☃.put("minecraft:flower_pot", Integer.valueOf(140));
/*     */           ☃.put("minecraft:carrots", Integer.valueOf(141));
/*     */           ☃.put("minecraft:potatoes", Integer.valueOf(142));
/*     */           ☃.put("minecraft:wooden_button", Integer.valueOf(143));
/*     */           ☃.put("minecraft:skull", Integer.valueOf(144));
/*     */           ☃.put("minecraft:anvil", Integer.valueOf(145));
/*     */           ☃.put("minecraft:trapped_chest", Integer.valueOf(146));
/*     */           ☃.put("minecraft:light_weighted_pressure_plate", Integer.valueOf(147));
/*     */           ☃.put("minecraft:heavy_weighted_pressure_plate", Integer.valueOf(148));
/*     */           ☃.put("minecraft:unpowered_comparator", Integer.valueOf(149));
/*     */           ☃.put("minecraft:powered_comparator", Integer.valueOf(150));
/*     */           ☃.put("minecraft:daylight_detector", Integer.valueOf(151));
/*     */           ☃.put("minecraft:redstone_block", Integer.valueOf(152));
/*     */           ☃.put("minecraft:quartz_ore", Integer.valueOf(153));
/*     */           ☃.put("minecraft:hopper", Integer.valueOf(154));
/*     */           ☃.put("minecraft:quartz_block", Integer.valueOf(155));
/*     */           ☃.put("minecraft:quartz_stairs", Integer.valueOf(156));
/*     */           ☃.put("minecraft:activator_rail", Integer.valueOf(157));
/*     */           ☃.put("minecraft:dropper", Integer.valueOf(158));
/*     */           ☃.put("minecraft:stained_hardened_clay", Integer.valueOf(159));
/*     */           ☃.put("minecraft:stained_glass_pane", Integer.valueOf(160));
/*     */           ☃.put("minecraft:leaves2", Integer.valueOf(161));
/*     */           ☃.put("minecraft:log2", Integer.valueOf(162));
/*     */           ☃.put("minecraft:acacia_stairs", Integer.valueOf(163));
/*     */           ☃.put("minecraft:dark_oak_stairs", Integer.valueOf(164));
/*     */           ☃.put("minecraft:slime", Integer.valueOf(165));
/*     */           ☃.put("minecraft:barrier", Integer.valueOf(166));
/*     */           ☃.put("minecraft:iron_trapdoor", Integer.valueOf(167));
/*     */           ☃.put("minecraft:prismarine", Integer.valueOf(168));
/*     */           ☃.put("minecraft:sea_lantern", Integer.valueOf(169));
/*     */           ☃.put("minecraft:hay_block", Integer.valueOf(170));
/*     */           ☃.put("minecraft:carpet", Integer.valueOf(171));
/*     */           ☃.put("minecraft:hardened_clay", Integer.valueOf(172));
/*     */           ☃.put("minecraft:coal_block", Integer.valueOf(173));
/*     */           ☃.put("minecraft:packed_ice", Integer.valueOf(174));
/*     */           ☃.put("minecraft:double_plant", Integer.valueOf(175));
/*     */           ☃.put("minecraft:standing_banner", Integer.valueOf(176));
/*     */           ☃.put("minecraft:wall_banner", Integer.valueOf(177));
/*     */           ☃.put("minecraft:daylight_detector_inverted", Integer.valueOf(178));
/*     */           ☃.put("minecraft:red_sandstone", Integer.valueOf(179));
/*     */           ☃.put("minecraft:red_sandstone_stairs", Integer.valueOf(180));
/*     */           ☃.put("minecraft:double_stone_slab2", Integer.valueOf(181));
/*     */           ☃.put("minecraft:stone_slab2", Integer.valueOf(182));
/*     */           ☃.put("minecraft:spruce_fence_gate", Integer.valueOf(183));
/*     */           ☃.put("minecraft:birch_fence_gate", Integer.valueOf(184));
/*     */           ☃.put("minecraft:jungle_fence_gate", Integer.valueOf(185));
/*     */           ☃.put("minecraft:dark_oak_fence_gate", Integer.valueOf(186));
/*     */           ☃.put("minecraft:acacia_fence_gate", Integer.valueOf(187));
/*     */           ☃.put("minecraft:spruce_fence", Integer.valueOf(188));
/*     */           ☃.put("minecraft:birch_fence", Integer.valueOf(189));
/*     */           ☃.put("minecraft:jungle_fence", Integer.valueOf(190));
/*     */           ☃.put("minecraft:dark_oak_fence", Integer.valueOf(191));
/*     */           ☃.put("minecraft:acacia_fence", Integer.valueOf(192));
/*     */           ☃.put("minecraft:spruce_door", Integer.valueOf(193));
/*     */           ☃.put("minecraft:birch_door", Integer.valueOf(194));
/*     */           ☃.put("minecraft:jungle_door", Integer.valueOf(195));
/*     */           ☃.put("minecraft:acacia_door", Integer.valueOf(196));
/*     */           ☃.put("minecraft:dark_oak_door", Integer.valueOf(197));
/*     */           ☃.put("minecraft:end_rod", Integer.valueOf(198));
/*     */           ☃.put("minecraft:chorus_plant", Integer.valueOf(199));
/*     */           ☃.put("minecraft:chorus_flower", Integer.valueOf(200));
/*     */           ☃.put("minecraft:purpur_block", Integer.valueOf(201));
/*     */           ☃.put("minecraft:purpur_pillar", Integer.valueOf(202));
/*     */           ☃.put("minecraft:purpur_stairs", Integer.valueOf(203));
/*     */           ☃.put("minecraft:purpur_double_slab", Integer.valueOf(204));
/*     */           ☃.put("minecraft:purpur_slab", Integer.valueOf(205));
/*     */           ☃.put("minecraft:end_bricks", Integer.valueOf(206));
/*     */           ☃.put("minecraft:beetroots", Integer.valueOf(207));
/*     */           ☃.put("minecraft:grass_path", Integer.valueOf(208));
/*     */           ☃.put("minecraft:end_gateway", Integer.valueOf(209));
/*     */           ☃.put("minecraft:repeating_command_block", Integer.valueOf(210));
/*     */           ☃.put("minecraft:chain_command_block", Integer.valueOf(211));
/*     */           ☃.put("minecraft:frosted_ice", Integer.valueOf(212));
/*     */           ☃.put("minecraft:magma", Integer.valueOf(213));
/*     */           ☃.put("minecraft:nether_wart_block", Integer.valueOf(214));
/*     */           ☃.put("minecraft:red_nether_brick", Integer.valueOf(215));
/*     */           ☃.put("minecraft:bone_block", Integer.valueOf(216));
/*     */           ☃.put("minecraft:structure_void", Integer.valueOf(217));
/*     */           ☃.put("minecraft:observer", Integer.valueOf(218));
/*     */           ☃.put("minecraft:white_shulker_box", Integer.valueOf(219));
/*     */           ☃.put("minecraft:orange_shulker_box", Integer.valueOf(220));
/*     */           ☃.put("minecraft:magenta_shulker_box", Integer.valueOf(221));
/*     */           ☃.put("minecraft:light_blue_shulker_box", Integer.valueOf(222));
/*     */           ☃.put("minecraft:yellow_shulker_box", Integer.valueOf(223));
/*     */           ☃.put("minecraft:lime_shulker_box", Integer.valueOf(224));
/*     */           ☃.put("minecraft:pink_shulker_box", Integer.valueOf(225));
/*     */           ☃.put("minecraft:gray_shulker_box", Integer.valueOf(226));
/*     */           ☃.put("minecraft:silver_shulker_box", Integer.valueOf(227));
/*     */           ☃.put("minecraft:cyan_shulker_box", Integer.valueOf(228));
/*     */           ☃.put("minecraft:purple_shulker_box", Integer.valueOf(229));
/*     */           ☃.put("minecraft:blue_shulker_box", Integer.valueOf(230));
/*     */           ☃.put("minecraft:brown_shulker_box", Integer.valueOf(231));
/*     */           ☃.put("minecraft:green_shulker_box", Integer.valueOf(232));
/*     */           ☃.put("minecraft:red_shulker_box", Integer.valueOf(233));
/*     */           ☃.put("minecraft:black_shulker_box", Integer.valueOf(234));
/*     */           ☃.put("minecraft:white_glazed_terracotta", Integer.valueOf(235));
/*     */           ☃.put("minecraft:orange_glazed_terracotta", Integer.valueOf(236));
/*     */           ☃.put("minecraft:magenta_glazed_terracotta", Integer.valueOf(237));
/*     */           ☃.put("minecraft:light_blue_glazed_terracotta", Integer.valueOf(238));
/*     */           ☃.put("minecraft:yellow_glazed_terracotta", Integer.valueOf(239));
/*     */           ☃.put("minecraft:lime_glazed_terracotta", Integer.valueOf(240));
/*     */           ☃.put("minecraft:pink_glazed_terracotta", Integer.valueOf(241));
/*     */           ☃.put("minecraft:gray_glazed_terracotta", Integer.valueOf(242));
/*     */           ☃.put("minecraft:silver_glazed_terracotta", Integer.valueOf(243));
/*     */           ☃.put("minecraft:cyan_glazed_terracotta", Integer.valueOf(244));
/*     */           ☃.put("minecraft:purple_glazed_terracotta", Integer.valueOf(245));
/*     */           ☃.put("minecraft:blue_glazed_terracotta", Integer.valueOf(246));
/*     */           ☃.put("minecraft:brown_glazed_terracotta", Integer.valueOf(247));
/*     */           ☃.put("minecraft:green_glazed_terracotta", Integer.valueOf(248));
/*     */           ☃.put("minecraft:red_glazed_terracotta", Integer.valueOf(249));
/*     */           ☃.put("minecraft:black_glazed_terracotta", Integer.valueOf(250));
/*     */           ☃.put("minecraft:concrete", Integer.valueOf(251));
/*     */           ☃.put("minecraft:concrete_powder", Integer.valueOf(252));
/*     */           ☃.put("minecraft:structure_block", Integer.valueOf(255));
/*     */         });
/*     */   }
/*     */   public static int a(String ☃) {
/* 295 */     Integer integer = a.get(☃);
/* 296 */     return (integer == null) ? 0 : integer.intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/* 301 */     Schema ☃ = getInputSchema();
/* 302 */     Schema schema1 = getOutputSchema();
/*     */     
/* 304 */     Function<Typed<?>, Typed<?>> function1 = ☃ -> a(☃, "DisplayTile", "DisplayData", "DisplayState");
/* 305 */     Function<Typed<?>, Typed<?>> function2 = ☃ -> a(☃, "inTile", "inData", "inBlockState");
/*     */     
/* 307 */     Type<Pair<Either<Pair<String, Either<Integer, String>>, Unit>, Dynamic<?>>> type = DSL.and(
/* 308 */         DSL.optional((Type)DSL.field("inTile", DSL.named(akn.q.typeName(), DSL.or(DSL.intType(), aln.a())))), 
/* 309 */         DSL.remainderType());
/*     */ 
/*     */     
/* 312 */     Function<Typed<?>, Typed<?>> function3 = typed -> typed.update(☃.finder(), DSL.remainderType(), Pair::getSecond);
/*     */     
/* 314 */     return fixTypeEverywhereTyped("EntityBlockStateFix", ☃.getType(akn.p), schema1.getType(akn.p), typed -> {
/*     */           typed = a(typed, "minecraft:falling_block", this::a);
/*     */           typed = a(typed, "minecraft:enderman", ());
/*     */           typed = a(typed, "minecraft:arrow", ☃);
/*     */           typed = a(typed, "minecraft:spectral_arrow", ☃);
/*     */           typed = a(typed, "minecraft:egg", function1);
/*     */           typed = a(typed, "minecraft:ender_pearl", function1);
/*     */           typed = a(typed, "minecraft:fireball", function1);
/*     */           typed = a(typed, "minecraft:potion", function1);
/*     */           typed = a(typed, "minecraft:small_fireball", function1);
/*     */           typed = a(typed, "minecraft:snowball", function1);
/*     */           typed = a(typed, "minecraft:wither_skull", function1);
/*     */           typed = a(typed, "minecraft:xp_bottle", function1);
/*     */           typed = a(typed, "minecraft:commandblock_minecart", function2);
/*     */           typed = a(typed, "minecraft:minecart", function2);
/*     */           typed = a(typed, "minecraft:chest_minecart", function2);
/*     */           typed = a(typed, "minecraft:furnace_minecart", function2);
/*     */           typed = a(typed, "minecraft:tnt_minecart", function2);
/*     */           typed = a(typed, "minecraft:hopper_minecart", function2);
/*     */           return a(typed, "minecraft:spawner_minecart", function2);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private Typed<?> a(Typed<?> ☃) {
/* 339 */     Type<Either<Pair<String, Either<Integer, String>>, Unit>> type = DSL.optional((Type)DSL.field("Block", DSL.named(akn.q.typeName(), DSL.or(DSL.intType(), aln.a()))));
/* 340 */     Type<Either<Pair<String, Dynamic<?>>, Unit>> type1 = DSL.optional((Type)DSL.field("BlockState", DSL.named(akn.m.typeName(), DSL.remainderType())));
/*     */     
/* 342 */     Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/*     */     
/* 344 */     return ☃.update(type.finder(), type1, either -> {
/*     */           int i = ((Integer)either.map((), ())).intValue();
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           int j = ☃.get("Data").asInt(0) & 0xF;
/*     */ 
/*     */ 
/*     */           
/*     */           return Either.left(Pair.of(akn.m.typeName(), agz.b(i << 4 | j)));
/* 355 */         }).set(DSL.remainderFinder(), dynamic.remove("Data").remove("TileID").remove("Tile"));
/*     */   }
/*     */   
/*     */   private Typed<?> a(Typed<?> ☃, String str1, String str2, String str3) {
/* 359 */     Tag.TagType tagType1 = DSL.field(str1, DSL.named(akn.q.typeName(), DSL.or(DSL.intType(), aln.a())));
/* 360 */     Tag.TagType tagType2 = DSL.field(str3, DSL.named(akn.m.typeName(), DSL.remainderType()));
/*     */     
/* 362 */     Dynamic<?> dynamic = (Dynamic)☃.getOrCreate(DSL.remainderFinder());
/*     */     
/* 364 */     return ☃.update(tagType1.finder(), (Type)tagType2, pair -> {
/*     */           int i = ((Integer)((Either)pair.getSecond()).map((), ahm::a)).intValue();
/*     */           
/*     */           int j = ☃.get(str).asInt(0) & 0xF;
/*     */           return Pair.of(akn.m.typeName(), agz.b(i << 4 | j));
/* 369 */         }).set(DSL.remainderFinder(), dynamic.remove(str2));
/*     */   }
/*     */   
/*     */   private Typed<?> a(Typed<?> ☃, String str, Function<Typed<?>, Typed<?>> function) {
/* 373 */     Type<?> type1 = getInputSchema().getChoiceType(akn.p, str);
/* 374 */     Type<?> type2 = getOutputSchema().getChoiceType(akn.p, str);
/* 375 */     return ☃.updateTyped(DSL.namedChoice(str, type1), type2, function);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */