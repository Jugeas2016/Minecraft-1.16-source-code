/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.templates.Hook;
/*     */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
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
/*     */ public class ani
/*     */   extends Schema
/*     */ {
/*     */   protected static final Map<String, String> a;
/*     */   
/*     */   public ani(int ☃, Schema schema) {
/*  35 */     super(☃, schema);
/*     */   }
/*     */   
/*     */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  39 */     ☃.register(map, str, () -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Type<?> getChoiceType(DSL.TypeReference ☃, String str) {
/*  46 */     if (Objects.equals(☃.typeName(), akn.k.typeName())) {
/*  47 */       return super.getChoiceType(☃, aln.a(str));
/*     */     }
/*  49 */     return super.getChoiceType(☃, str);
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/*  54 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/*  56 */     a(☃, map, "minecraft:furnace");
/*  57 */     a(☃, map, "minecraft:chest");
/*  58 */     ☃.registerSimple(map, "minecraft:ender_chest");
/*  59 */     ☃.register(map, "minecraft:jukebox", str -> DSL.optionalFields("RecordItem", akn.l.in(☃)));
/*     */ 
/*     */     
/*  62 */     a(☃, map, "minecraft:dispenser");
/*  63 */     a(☃, map, "minecraft:dropper");
/*  64 */     ☃.registerSimple(map, "minecraft:sign");
/*  65 */     ☃.register(map, "minecraft:mob_spawner", str -> akn.s.in(☃));
/*  66 */     ☃.registerSimple(map, "minecraft:noteblock");
/*  67 */     ☃.registerSimple(map, "minecraft:piston");
/*  68 */     a(☃, map, "minecraft:brewing_stand");
/*  69 */     ☃.registerSimple(map, "minecraft:enchanting_table");
/*  70 */     ☃.registerSimple(map, "minecraft:end_portal");
/*  71 */     ☃.registerSimple(map, "minecraft:beacon");
/*  72 */     ☃.registerSimple(map, "minecraft:skull");
/*  73 */     ☃.registerSimple(map, "minecraft:daylight_detector");
/*  74 */     a(☃, map, "minecraft:hopper");
/*  75 */     ☃.registerSimple(map, "minecraft:comparator");
/*  76 */     ☃.register(map, "minecraft:flower_pot", str -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), akn.r.in(☃))));
/*     */ 
/*     */     
/*  79 */     ☃.registerSimple(map, "minecraft:banner");
/*  80 */     ☃.registerSimple(map, "minecraft:structure_block");
/*  81 */     ☃.registerSimple(map, "minecraft:end_gateway");
/*  82 */     ☃.registerSimple(map, "minecraft:command_block");
/*     */     
/*  84 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/*  89 */     super.registerTypes(☃, map1, map2);
/*     */     
/*  91 */     ☃.registerType(false, akn.k, () -> DSL.taggedChoiceLazy("id", aln.a(), ☃));
/*     */     
/*  93 */     ☃.registerType(true, akn.l, () -> DSL.hook(DSL.optionalFields("id", akn.r.in(☃), "tag", DSL.optionalFields("EntityTag", akn.o.in(☃), "BlockEntityTag", akn.k.in(☃), "CanDestroy", DSL.list(akn.q.in(☃)), "CanPlaceOn", DSL.list(akn.q.in(☃)))), b, Hook.HookFunction.IDENTITY));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/* 104 */     a = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("minecraft:furnace", "minecraft:furnace");
/*     */           ☃.put("minecraft:lit_furnace", "minecraft:furnace");
/*     */           ☃.put("minecraft:chest", "minecraft:chest");
/*     */           ☃.put("minecraft:trapped_chest", "minecraft:chest");
/*     */           ☃.put("minecraft:ender_chest", "minecraft:ender_chest");
/*     */           ☃.put("minecraft:jukebox", "minecraft:jukebox");
/*     */           ☃.put("minecraft:dispenser", "minecraft:dispenser");
/*     */           ☃.put("minecraft:dropper", "minecraft:dropper");
/*     */           ☃.put("minecraft:sign", "minecraft:sign");
/*     */           ☃.put("minecraft:mob_spawner", "minecraft:mob_spawner");
/*     */           ☃.put("minecraft:noteblock", "minecraft:noteblock");
/*     */           ☃.put("minecraft:brewing_stand", "minecraft:brewing_stand");
/*     */           ☃.put("minecraft:enhanting_table", "minecraft:enchanting_table");
/*     */           ☃.put("minecraft:command_block", "minecraft:command_block");
/*     */           ☃.put("minecraft:beacon", "minecraft:beacon");
/*     */           ☃.put("minecraft:skull", "minecraft:skull");
/*     */           ☃.put("minecraft:daylight_detector", "minecraft:daylight_detector");
/*     */           ☃.put("minecraft:hopper", "minecraft:hopper");
/*     */           ☃.put("minecraft:banner", "minecraft:banner");
/*     */           ☃.put("minecraft:flower_pot", "minecraft:flower_pot");
/*     */           ☃.put("minecraft:repeating_command_block", "minecraft:command_block");
/*     */           ☃.put("minecraft:chain_command_block", "minecraft:command_block");
/*     */           ☃.put("minecraft:shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:white_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:orange_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:magenta_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:light_blue_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:yellow_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:lime_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:pink_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:gray_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:silver_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:cyan_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:purple_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:blue_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:brown_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:green_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:red_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:black_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:bed", "minecraft:bed");
/*     */           ☃.put("minecraft:light_gray_shulker_box", "minecraft:shulker_box");
/*     */           ☃.put("minecraft:banner", "minecraft:banner");
/*     */           ☃.put("minecraft:white_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:orange_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:magenta_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:light_blue_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:yellow_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:lime_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:pink_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:gray_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:silver_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:cyan_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:purple_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:blue_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:brown_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:green_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:red_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:black_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:standing_sign", "minecraft:sign");
/*     */           ☃.put("minecraft:wall_sign", "minecraft:sign");
/*     */           ☃.put("minecraft:piston_head", "minecraft:piston");
/*     */           ☃.put("minecraft:daylight_detector_inverted", "minecraft:daylight_detector");
/*     */           ☃.put("minecraft:unpowered_comparator", "minecraft:comparator");
/*     */           ☃.put("minecraft:powered_comparator", "minecraft:comparator");
/*     */           ☃.put("minecraft:wall_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:standing_banner", "minecraft:banner");
/*     */           ☃.put("minecraft:structure_block", "minecraft:structure_block");
/*     */           ☃.put("minecraft:end_portal", "minecraft:end_portal");
/*     */           ☃.put("minecraft:end_gateway", "minecraft:end_gateway");
/*     */           ☃.put("minecraft:sign", "minecraft:sign");
/*     */           ☃.put("minecraft:shield", "minecraft:banner");
/*     */         });
/*     */   }
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
/* 188 */   protected static final Hook.HookFunction b = new Hook.HookFunction()
/*     */     {
/*     */       public <T> T apply(DynamicOps<T> ☃, T t) {
/* 191 */         return anl.a(new Dynamic(☃, t), ani.a, "ArmorStand");
/*     */       }
/*     */     };
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ani.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */