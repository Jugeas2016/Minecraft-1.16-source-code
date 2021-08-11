/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.templates.Hook;
/*     */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.function.Supplier;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class anl
/*     */   extends Schema
/*     */ {
/*  51 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   public anl(int ☃, Schema schema) {
/*  54 */     super(☃, schema);
/*     */   }
/*     */   private static final Map<String, String> c;
/*     */   protected static TypeTemplate a(Schema ☃) {
/*  58 */     return DSL.optionalFields("Equipment", 
/*  59 */         DSL.list(akn.l.in(☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  64 */     ☃.register(map, str, () -> a(☃));
/*     */   }
/*     */   
/*     */   protected static void b(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  68 */     ☃.register(map, str, () -> DSL.optionalFields("inTile", akn.q.in(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void c(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  75 */     ☃.register(map, str, () -> DSL.optionalFields("DisplayTile", akn.q.in(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void d(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  81 */     ☃.register(map, str, () -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/*  88 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/*  90 */     ☃.register(map, "Item", str -> DSL.optionalFields("Item", akn.l.in(☃)));
/*     */ 
/*     */     
/*  93 */     ☃.registerSimple(map, "XPOrb");
/*  94 */     b(☃, map, "ThrownEgg");
/*  95 */     ☃.registerSimple(map, "LeashKnot");
/*  96 */     ☃.registerSimple(map, "Painting");
/*  97 */     ☃.register(map, "Arrow", str -> DSL.optionalFields("inTile", akn.q.in(☃)));
/*     */ 
/*     */     
/* 100 */     ☃.register(map, "TippedArrow", str -> DSL.optionalFields("inTile", akn.q.in(☃)));
/*     */ 
/*     */     
/* 103 */     ☃.register(map, "SpectralArrow", str -> DSL.optionalFields("inTile", akn.q.in(☃)));
/*     */ 
/*     */     
/* 106 */     b(☃, map, "Snowball");
/* 107 */     b(☃, map, "Fireball");
/* 108 */     b(☃, map, "SmallFireball");
/* 109 */     b(☃, map, "ThrownEnderpearl");
/* 110 */     ☃.registerSimple(map, "EyeOfEnderSignal");
/* 111 */     ☃.register(map, "ThrownPotion", str -> DSL.optionalFields("inTile", akn.q.in(☃), "Potion", akn.l.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 115 */     b(☃, map, "ThrownExpBottle");
/* 116 */     ☃.register(map, "ItemFrame", str -> DSL.optionalFields("Item", akn.l.in(☃)));
/*     */ 
/*     */     
/* 119 */     b(☃, map, "WitherSkull");
/* 120 */     ☃.registerSimple(map, "PrimedTnt");
/* 121 */     ☃.register(map, "FallingSand", str -> DSL.optionalFields("Block", akn.q.in(☃), "TileEntityData", akn.k.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 125 */     ☃.register(map, "FireworksRocketEntity", str -> DSL.optionalFields("FireworksItem", akn.l.in(☃)));
/*     */ 
/*     */     
/* 128 */     ☃.registerSimple(map, "Boat");
/*     */ 
/*     */     
/* 131 */     ☃.register(map, "Minecart", () -> DSL.optionalFields("DisplayTile", akn.q.in(☃), "Items", DSL.list(akn.l.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 135 */     c(☃, map, "MinecartRideable");
/* 136 */     ☃.register(map, "MinecartChest", str -> DSL.optionalFields("DisplayTile", akn.q.in(☃), "Items", DSL.list(akn.l.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 140 */     c(☃, map, "MinecartFurnace");
/* 141 */     c(☃, map, "MinecartTNT");
/* 142 */     ☃.register(map, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", akn.q.in(☃), akn.s.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 146 */     ☃.register(map, "MinecartHopper", str -> DSL.optionalFields("DisplayTile", akn.q.in(☃), "Items", DSL.list(akn.l.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 150 */     c(☃, map, "MinecartCommandBlock");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     a(☃, map, "ArmorStand");
/* 156 */     a(☃, map, "Creeper");
/* 157 */     a(☃, map, "Skeleton");
/* 158 */     a(☃, map, "Spider");
/* 159 */     a(☃, map, "Giant");
/* 160 */     a(☃, map, "Zombie");
/* 161 */     a(☃, map, "Slime");
/* 162 */     a(☃, map, "Ghast");
/* 163 */     a(☃, map, "PigZombie");
/* 164 */     ☃.register(map, "Enderman", str -> DSL.optionalFields("carried", akn.q.in(☃), a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 168 */     a(☃, map, "CaveSpider");
/* 169 */     a(☃, map, "Silverfish");
/* 170 */     a(☃, map, "Blaze");
/* 171 */     a(☃, map, "LavaSlime");
/* 172 */     a(☃, map, "EnderDragon");
/* 173 */     a(☃, map, "WitherBoss");
/* 174 */     a(☃, map, "Bat");
/* 175 */     a(☃, map, "Witch");
/* 176 */     a(☃, map, "Endermite");
/* 177 */     a(☃, map, "Guardian");
/* 178 */     a(☃, map, "Pig");
/* 179 */     a(☃, map, "Sheep");
/* 180 */     a(☃, map, "Cow");
/* 181 */     a(☃, map, "Chicken");
/* 182 */     a(☃, map, "Squid");
/* 183 */     a(☃, map, "Wolf");
/* 184 */     a(☃, map, "MushroomCow");
/* 185 */     a(☃, map, "SnowMan");
/* 186 */     a(☃, map, "Ozelot");
/* 187 */     a(☃, map, "VillagerGolem");
/* 188 */     ☃.register(map, "EntityHorse", str -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "ArmorItem", akn.l.in(☃), "SaddleItem", akn.l.in(☃), a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 194 */     a(☃, map, "Rabbit");
/* 195 */     ☃.register(map, "Villager", str -> DSL.optionalFields("Inventory", DSL.list(akn.l.in(☃)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", akn.l.in(☃), "buyB", akn.l.in(☃), "sell", akn.l.in(☃)))), a(☃)));
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
/* 208 */     ☃.registerSimple(map, "EnderCrystal");
/*     */ 
/*     */ 
/*     */     
/* 212 */     ☃.registerSimple(map, "AreaEffectCloud");
/* 213 */     ☃.registerSimple(map, "ShulkerBullet");
/* 214 */     a(☃, map, "Shulker");
/*     */     
/* 216 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 221 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/* 223 */     d(☃, map, "Furnace");
/* 224 */     d(☃, map, "Chest");
/* 225 */     ☃.registerSimple(map, "EnderChest");
/* 226 */     ☃.register(map, "RecordPlayer", str -> DSL.optionalFields("RecordItem", akn.l.in(☃)));
/*     */ 
/*     */     
/* 229 */     d(☃, map, "Trap");
/* 230 */     d(☃, map, "Dropper");
/* 231 */     ☃.registerSimple(map, "Sign");
/* 232 */     ☃.register(map, "MobSpawner", str -> akn.s.in(☃));
/* 233 */     ☃.registerSimple(map, "Music");
/* 234 */     ☃.registerSimple(map, "Piston");
/* 235 */     d(☃, map, "Cauldron");
/* 236 */     ☃.registerSimple(map, "EnchantTable");
/* 237 */     ☃.registerSimple(map, "Airportal");
/* 238 */     ☃.registerSimple(map, "Control");
/* 239 */     ☃.registerSimple(map, "Beacon");
/* 240 */     ☃.registerSimple(map, "Skull");
/* 241 */     ☃.registerSimple(map, "DLDetector");
/* 242 */     d(☃, map, "Hopper");
/* 243 */     ☃.registerSimple(map, "Comparator");
/* 244 */     ☃.register(map, "FlowerPot", str -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), akn.r.in(☃))));
/*     */ 
/*     */     
/* 247 */     ☃.registerSimple(map, "Banner");
/*     */ 
/*     */ 
/*     */     
/* 251 */     ☃.registerSimple(map, "Structure");
/* 252 */     ☃.registerSimple(map, "EndGateway");
/* 253 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 258 */     ☃.registerType(false, akn.a, DSL::remainder);
/* 259 */     ☃.registerType(false, akn.b, () -> DSL.optionalFields("Inventory", DSL.list(akn.l.in(☃)), "EnderItems", DSL.list(akn.l.in(☃))));
/*     */ 
/*     */ 
/*     */     
/* 263 */     ☃.registerType(false, akn.c, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(akn.o.in(☃)), "TileEntities", DSL.list(akn.k.in(☃)), "TileTicks", DSL.list(DSL.fields("i", akn.q.in(☃))))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 270 */     ☃.registerType(true, akn.k, () -> DSL.taggedChoiceLazy("id", DSL.string(), ☃));
/* 271 */     ☃.registerType(true, akn.o, () -> DSL.optionalFields("Riding", akn.o.in(☃), akn.p.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 275 */     ☃.registerType(false, akn.n, () -> DSL.constType(aln.a()));
/* 276 */     ☃.registerType(true, akn.p, () -> DSL.taggedChoiceLazy("id", DSL.string(), ☃));
/* 277 */     ☃.registerType(true, akn.l, () -> DSL.hook(DSL.optionalFields("id", DSL.or(DSL.constType(DSL.intType()), akn.r.in(☃)), "tag", DSL.optionalFields("EntityTag", akn.o.in(☃), "BlockEntityTag", akn.k.in(☃), "CanDestroy", DSL.list(akn.q.in(☃)), "CanPlaceOn", DSL.list(akn.q.in(☃)))), a, Hook.HookFunction.IDENTITY));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 286 */     ☃.registerType(false, akn.e, DSL::remainder);
/* 287 */     ☃.registerType(false, akn.q, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(aln.a())));
/* 288 */     ☃.registerType(false, akn.r, () -> DSL.constType(aln.a()));
/* 289 */     ☃.registerType(false, akn.g, DSL::remainder);
/* 290 */     ☃.registerType(false, akn.h, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(akn.t.in(☃)), "Objectives", DSL.list(akn.u.in(☃)), "Teams", DSL.list(akn.v.in(☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 297 */     ☃.registerType(false, akn.t, DSL::remainder);
/* 298 */     ☃.registerType(false, akn.u, DSL::remainder);
/* 299 */     ☃.registerType(false, akn.v, DSL::remainder);
/*     */     
/* 301 */     ☃.registerType(true, akn.s, DSL::remainder);
/* 302 */     ☃.registerType(false, akn.j, DSL::remainder);
/* 303 */     ☃.registerType(true, akn.y, DSL::remainder);
/*     */   }
/*     */   static {
/* 306 */     c = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("minecraft:furnace", "Furnace");
/*     */           ☃.put("minecraft:lit_furnace", "Furnace");
/*     */           ☃.put("minecraft:chest", "Chest");
/*     */           ☃.put("minecraft:trapped_chest", "Chest");
/*     */           ☃.put("minecraft:ender_chest", "EnderChest");
/*     */           ☃.put("minecraft:jukebox", "RecordPlayer");
/*     */           ☃.put("minecraft:dispenser", "Trap");
/*     */           ☃.put("minecraft:dropper", "Dropper");
/*     */           ☃.put("minecraft:sign", "Sign");
/*     */           ☃.put("minecraft:mob_spawner", "MobSpawner");
/*     */           ☃.put("minecraft:noteblock", "Music");
/*     */           ☃.put("minecraft:brewing_stand", "Cauldron");
/*     */           ☃.put("minecraft:enhanting_table", "EnchantTable");
/*     */           ☃.put("minecraft:command_block", "CommandBlock");
/*     */           ☃.put("minecraft:beacon", "Beacon");
/*     */           ☃.put("minecraft:skull", "Skull");
/*     */           ☃.put("minecraft:daylight_detector", "DLDetector");
/*     */           ☃.put("minecraft:hopper", "Hopper");
/*     */           ☃.put("minecraft:banner", "Banner");
/*     */           ☃.put("minecraft:flower_pot", "FlowerPot");
/*     */           ☃.put("minecraft:repeating_command_block", "CommandBlock");
/*     */           ☃.put("minecraft:chain_command_block", "CommandBlock");
/*     */           ☃.put("minecraft:standing_sign", "Sign");
/*     */           ☃.put("minecraft:wall_sign", "Sign");
/*     */           ☃.put("minecraft:piston_head", "Piston");
/*     */           ☃.put("minecraft:daylight_detector_inverted", "DLDetector");
/*     */           ☃.put("minecraft:unpowered_comparator", "Comparator");
/*     */           ☃.put("minecraft:powered_comparator", "Comparator");
/*     */           ☃.put("minecraft:wall_banner", "Banner");
/*     */           ☃.put("minecraft:standing_banner", "Banner");
/*     */           ☃.put("minecraft:structure_block", "Structure");
/*     */           ☃.put("minecraft:end_portal", "Airportal");
/*     */           ☃.put("minecraft:end_gateway", "EndGateway");
/*     */           ☃.put("minecraft:shield", "Banner");
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 348 */   protected static final Hook.HookFunction a = new Hook.HookFunction()
/*     */     {
/*     */       public <T> T apply(DynamicOps<T> ☃, T t) {
/* 351 */         return anl.a(new Dynamic(☃, t), anl.a(), "ArmorStand");
/*     */       }
/*     */     };
/*     */   
/*     */   protected static <T> T a(Dynamic<T> ☃, Map<String, String> map, String str) {
/* 356 */     return (T)☃.update("tag", dynamic1 -> dynamic1.update("BlockEntityTag", ()).update("EntityTag", ()))
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
/* 372 */       .getValue();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\anl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */