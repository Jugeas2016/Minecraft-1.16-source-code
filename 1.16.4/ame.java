/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.templates.Hook;
/*     */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
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
/*     */ public class ame
/*     */   extends aln
/*     */ {
/*     */   public ame(int ☃, Schema schema) {
/*  50 */     super(☃, schema);
/*     */   }
/*     */   
/*     */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  54 */     ☃.register(map, str, () -> alo.a(☃));
/*     */   }
/*     */   
/*     */   protected static void b(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  58 */     ☃.register(map, str, () -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/*  65 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/*  67 */     ☃.registerSimple(map, "minecraft:area_effect_cloud");
/*  68 */     a(☃, map, "minecraft:armor_stand");
/*  69 */     ☃.register(map, "minecraft:arrow", str -> DSL.optionalFields("inBlockState", akn.m.in(☃)));
/*     */ 
/*     */     
/*  72 */     a(☃, map, "minecraft:bat");
/*  73 */     a(☃, map, "minecraft:blaze");
/*  74 */     ☃.registerSimple(map, "minecraft:boat");
/*  75 */     a(☃, map, "minecraft:cave_spider");
/*  76 */     ☃.register(map, "minecraft:chest_minecart", str -> DSL.optionalFields("DisplayState", akn.m.in(☃), "Items", DSL.list(akn.l.in(☃))));
/*     */ 
/*     */ 
/*     */     
/*  80 */     a(☃, map, "minecraft:chicken");
/*  81 */     ☃.register(map, "minecraft:commandblock_minecart", str -> DSL.optionalFields("DisplayState", akn.m.in(☃)));
/*     */ 
/*     */     
/*  84 */     a(☃, map, "minecraft:cow");
/*  85 */     a(☃, map, "minecraft:creeper");
/*  86 */     ☃.register(map, "minecraft:donkey", str -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  91 */     ☃.registerSimple(map, "minecraft:dragon_fireball");
/*  92 */     ☃.registerSimple(map, "minecraft:egg");
/*  93 */     a(☃, map, "minecraft:elder_guardian");
/*  94 */     ☃.registerSimple(map, "minecraft:ender_crystal");
/*  95 */     a(☃, map, "minecraft:ender_dragon");
/*  96 */     ☃.register(map, "minecraft:enderman", str -> DSL.optionalFields("carriedBlockState", akn.m.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 100 */     a(☃, map, "minecraft:endermite");
/* 101 */     ☃.registerSimple(map, "minecraft:ender_pearl");
/* 102 */     ☃.registerSimple(map, "minecraft:evocation_fangs");
/* 103 */     a(☃, map, "minecraft:evocation_illager");
/* 104 */     ☃.registerSimple(map, "minecraft:eye_of_ender_signal");
/* 105 */     ☃.register(map, "minecraft:falling_block", str -> DSL.optionalFields("BlockState", akn.m.in(☃), "TileEntityData", akn.k.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 109 */     ☃.registerSimple(map, "minecraft:fireball");
/* 110 */     ☃.register(map, "minecraft:fireworks_rocket", str -> DSL.optionalFields("FireworksItem", akn.l.in(☃)));
/*     */ 
/*     */     
/* 113 */     ☃.register(map, "minecraft:furnace_minecart", str -> DSL.optionalFields("DisplayState", akn.m.in(☃)));
/*     */ 
/*     */     
/* 116 */     a(☃, map, "minecraft:ghast");
/* 117 */     a(☃, map, "minecraft:giant");
/* 118 */     a(☃, map, "minecraft:guardian");
/* 119 */     ☃.register(map, "minecraft:hopper_minecart", str -> DSL.optionalFields("DisplayState", akn.m.in(☃), "Items", DSL.list(akn.l.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 123 */     ☃.register(map, "minecraft:horse", str -> DSL.optionalFields("ArmorItem", akn.l.in(☃), "SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 129 */     a(☃, map, "minecraft:husk");
/* 130 */     ☃.registerSimple(map, "minecraft:illusion_illager");
/* 131 */     ☃.register(map, "minecraft:item", str -> DSL.optionalFields("Item", akn.l.in(☃)));
/*     */ 
/*     */     
/* 134 */     ☃.register(map, "minecraft:item_frame", str -> DSL.optionalFields("Item", akn.l.in(☃)));
/*     */ 
/*     */     
/* 137 */     ☃.registerSimple(map, "minecraft:leash_knot");
/* 138 */     ☃.register(map, "minecraft:llama", str -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "SaddleItem", akn.l.in(☃), "DecorItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     ☃.registerSimple(map, "minecraft:llama_spit");
/* 145 */     a(☃, map, "minecraft:magma_cube");
/* 146 */     ☃.register(map, "minecraft:minecart", str -> DSL.optionalFields("DisplayState", akn.m.in(☃)));
/*     */ 
/*     */     
/* 149 */     a(☃, map, "minecraft:mooshroom");
/* 150 */     ☃.register(map, "minecraft:mule", str -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     a(☃, map, "minecraft:ocelot");
/* 156 */     ☃.registerSimple(map, "minecraft:painting");
/* 157 */     ☃.registerSimple(map, "minecraft:parrot");
/* 158 */     a(☃, map, "minecraft:pig");
/* 159 */     a(☃, map, "minecraft:polar_bear");
/* 160 */     ☃.register(map, "minecraft:potion", str -> DSL.optionalFields("Potion", akn.l.in(☃)));
/*     */ 
/*     */     
/* 163 */     a(☃, map, "minecraft:rabbit");
/* 164 */     a(☃, map, "minecraft:sheep");
/* 165 */     a(☃, map, "minecraft:shulker");
/* 166 */     ☃.registerSimple(map, "minecraft:shulker_bullet");
/* 167 */     a(☃, map, "minecraft:silverfish");
/* 168 */     a(☃, map, "minecraft:skeleton");
/* 169 */     ☃.register(map, "minecraft:skeleton_horse", str -> DSL.optionalFields("SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 173 */     a(☃, map, "minecraft:slime");
/* 174 */     ☃.registerSimple(map, "minecraft:small_fireball");
/* 175 */     ☃.registerSimple(map, "minecraft:snowball");
/* 176 */     a(☃, map, "minecraft:snowman");
/* 177 */     ☃.register(map, "minecraft:spawner_minecart", str -> DSL.optionalFields("DisplayState", akn.m.in(☃), akn.s.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 181 */     ☃.register(map, "minecraft:spectral_arrow", str -> DSL.optionalFields("inBlockState", akn.m.in(☃)));
/*     */ 
/*     */     
/* 184 */     a(☃, map, "minecraft:spider");
/* 185 */     a(☃, map, "minecraft:squid");
/* 186 */     a(☃, map, "minecraft:stray");
/* 187 */     ☃.registerSimple(map, "minecraft:tnt");
/* 188 */     ☃.register(map, "minecraft:tnt_minecart", str -> DSL.optionalFields("DisplayState", akn.m.in(☃)));
/*     */ 
/*     */     
/* 191 */     a(☃, map, "minecraft:vex");
/* 192 */     ☃.register(map, "minecraft:villager", str -> DSL.optionalFields("Inventory", DSL.list(akn.l.in(☃)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", akn.l.in(☃), "buyB", akn.l.in(☃), "sell", akn.l.in(☃)))), alo.a(☃)));
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
/* 205 */     a(☃, map, "minecraft:villager_golem");
/* 206 */     a(☃, map, "minecraft:vindication_illager");
/* 207 */     a(☃, map, "minecraft:witch");
/* 208 */     a(☃, map, "minecraft:wither");
/* 209 */     a(☃, map, "minecraft:wither_skeleton");
/* 210 */     ☃.registerSimple(map, "minecraft:wither_skull");
/* 211 */     a(☃, map, "minecraft:wolf");
/* 212 */     ☃.registerSimple(map, "minecraft:xp_bottle");
/* 213 */     ☃.registerSimple(map, "minecraft:xp_orb");
/* 214 */     a(☃, map, "minecraft:zombie");
/* 215 */     ☃.register(map, "minecraft:zombie_horse", str -> DSL.optionalFields("SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 219 */     a(☃, map, "minecraft:zombie_pigman");
/* 220 */     a(☃, map, "minecraft:zombie_villager");
/*     */     
/* 222 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 227 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/* 229 */     b(☃, map, "minecraft:furnace");
/* 230 */     b(☃, map, "minecraft:chest");
/* 231 */     b(☃, map, "minecraft:trapped_chest");
/* 232 */     ☃.registerSimple(map, "minecraft:ender_chest");
/* 233 */     ☃.register(map, "minecraft:jukebox", str -> DSL.optionalFields("RecordItem", akn.l.in(☃)));
/*     */ 
/*     */     
/* 236 */     b(☃, map, "minecraft:dispenser");
/* 237 */     b(☃, map, "minecraft:dropper");
/* 238 */     ☃.registerSimple(map, "minecraft:sign");
/* 239 */     ☃.register(map, "minecraft:mob_spawner", str -> akn.s.in(☃));
/* 240 */     ☃.register(map, "minecraft:piston", str -> DSL.optionalFields("blockState", akn.m.in(☃)));
/*     */ 
/*     */     
/* 243 */     b(☃, map, "minecraft:brewing_stand");
/* 244 */     ☃.registerSimple(map, "minecraft:enchanting_table");
/* 245 */     ☃.registerSimple(map, "minecraft:end_portal");
/* 246 */     ☃.registerSimple(map, "minecraft:beacon");
/* 247 */     ☃.registerSimple(map, "minecraft:skull");
/* 248 */     ☃.registerSimple(map, "minecraft:daylight_detector");
/* 249 */     b(☃, map, "minecraft:hopper");
/* 250 */     ☃.registerSimple(map, "minecraft:comparator");
/* 251 */     ☃.registerSimple(map, "minecraft:banner");
/* 252 */     ☃.registerSimple(map, "minecraft:structure_block");
/* 253 */     ☃.registerSimple(map, "minecraft:end_gateway");
/* 254 */     ☃.registerSimple(map, "minecraft:command_block");
/* 255 */     b(☃, map, "minecraft:shulker_box");
/* 256 */     ☃.registerSimple(map, "minecraft:bed");
/*     */     
/* 258 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 263 */     ☃.registerType(false, akn.a, DSL::remainder);
/* 264 */     ☃.registerType(false, akn.w, () -> DSL.constType(a()));
/* 265 */     ☃.registerType(false, akn.b, () -> DSL.optionalFields("RootVehicle", DSL.optionalFields("Entity", akn.o.in(☃)), "Inventory", DSL.list(akn.l.in(☃)), "EnderItems", DSL.list(akn.l.in(☃)), DSL.optionalFields("ShoulderEntityLeft", akn.o.in(☃), "ShoulderEntityRight", akn.o.in(☃), "recipeBook", DSL.optionalFields("recipes", DSL.list(akn.w.in(☃)), "toBeDisplayed", DSL.list(akn.w.in(☃))))));
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
/* 282 */     ☃.registerType(false, akn.c, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(akn.o.in(☃)), "TileEntities", DSL.list(akn.k.in(☃)), "TileTicks", DSL.list(DSL.fields("i", akn.q.in(☃))), "Sections", DSL.list(DSL.optionalFields("Palette", DSL.list(akn.m.in(☃)))))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 292 */     ☃.registerType(true, akn.k, () -> DSL.taggedChoiceLazy("id", a(), ☃));
/* 293 */     ☃.registerType(true, akn.o, () -> DSL.optionalFields("Passengers", DSL.list(akn.o.in(☃)), akn.p.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 297 */     ☃.registerType(true, akn.p, () -> DSL.taggedChoiceLazy("id", a(), ☃));
/* 298 */     ☃.registerType(true, akn.l, () -> DSL.hook(DSL.optionalFields("id", akn.r.in(☃), "tag", DSL.optionalFields("EntityTag", akn.o.in(☃), "BlockEntityTag", akn.k.in(☃), "CanDestroy", DSL.list(akn.q.in(☃)), "CanPlaceOn", DSL.list(akn.q.in(☃)))), anj.b, Hook.HookFunction.IDENTITY));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 307 */     ☃.registerType(false, akn.d, () -> DSL.compoundList(DSL.list(akn.l.in(☃))));
/* 308 */     ☃.registerType(false, akn.e, DSL::remainder);
/* 309 */     ☃.registerType(false, akn.f, () -> DSL.optionalFields("entities", DSL.list(DSL.optionalFields("nbt", akn.o.in(☃))), "blocks", DSL.list(DSL.optionalFields("nbt", akn.k.in(☃))), "palette", DSL.list(akn.m.in(☃))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 314 */     ☃.registerType(false, akn.q, () -> DSL.constType(a()));
/* 315 */     ☃.registerType(false, akn.r, () -> DSL.constType(a()));
/* 316 */     ☃.registerType(false, akn.m, DSL::remainder);
/* 317 */     Supplier<TypeTemplate> supplier = () -> DSL.compoundList(akn.r.in(☃), DSL.constType(DSL.intType()));
/*     */     
/* 319 */     ☃.registerType(false, akn.g, () -> DSL.optionalFields("stats", DSL.optionalFields("minecraft:mined", DSL.compoundList(akn.q.in(☃), DSL.constType(DSL.intType())), "minecraft:crafted", supplier.get(), "minecraft:used", supplier.get(), "minecraft:broken", supplier.get(), "minecraft:picked_up", supplier.get(), DSL.optionalFields("minecraft:dropped", supplier.get(), "minecraft:killed", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.intType())), "minecraft:killed_by", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.intType())), "minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType()))))));
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
/* 334 */     ☃.registerType(false, akn.h, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(akn.t.in(☃)), "Objectives", DSL.list(akn.u.in(☃)), "Teams", DSL.list(akn.v.in(☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 341 */     ☃.registerType(false, akn.t, () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", akn.m.in(☃), "CB", akn.m.in(☃), "CC", akn.m.in(☃), "CD", akn.m.in(☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 349 */     ☃.registerType(false, akn.u, DSL::remainder);
/* 350 */     ☃.registerType(false, akn.v, DSL::remainder);
/* 351 */     ☃.registerType(true, akn.s, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", akn.o.in(☃))), "SpawnData", akn.o.in(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 357 */     ☃.registerType(false, akn.i, () -> DSL.optionalFields("minecraft:adventure/adventuring_time", DSL.optionalFields("criteria", DSL.compoundList(akn.x.in(☃), DSL.constType(DSL.string()))), "minecraft:adventure/kill_a_mob", DSL.optionalFields("criteria", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.string()))), "minecraft:adventure/kill_all_mobs", DSL.optionalFields("criteria", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.string()))), "minecraft:husbandry/bred_all_animals", DSL.optionalFields("criteria", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.string())))));
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
/* 371 */     ☃.registerType(false, akn.x, () -> DSL.constType(a()));
/* 372 */     ☃.registerType(false, akn.n, () -> DSL.constType(a()));
/* 373 */     ☃.registerType(false, akn.j, DSL::remainder);
/* 374 */     ☃.registerType(true, akn.y, DSL::remainder);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */