/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.templates.Hook;
/*     */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
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
/*     */ public class anj
/*     */   extends aln
/*     */ {
/*     */   public anj(int ☃, Schema schema) {
/*  27 */     super(☃, schema);
/*     */   }
/*     */   
/*     */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  31 */     ☃.register(map, str, () -> alo.a(☃));
/*     */   }
/*     */   
/*     */   protected static void b(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  35 */     ☃.register(map, str, () -> DSL.optionalFields("inTile", akn.q.in(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/*  42 */     Map<String, Supplier<TypeTemplate>> map = Maps.newHashMap();
/*     */     
/*  44 */     ☃.registerSimple(map, "minecraft:area_effect_cloud");
/*  45 */     a(☃, map, "minecraft:armor_stand");
/*  46 */     ☃.register(map, "minecraft:arrow", str -> DSL.optionalFields("inTile", akn.q.in(☃)));
/*     */ 
/*     */     
/*  49 */     a(☃, map, "minecraft:bat");
/*  50 */     a(☃, map, "minecraft:blaze");
/*  51 */     ☃.registerSimple(map, "minecraft:boat");
/*  52 */     a(☃, map, "minecraft:cave_spider");
/*  53 */     ☃.register(map, "minecraft:chest_minecart", str -> DSL.optionalFields("DisplayTile", akn.q.in(☃), "Items", DSL.list(akn.l.in(☃))));
/*     */ 
/*     */ 
/*     */     
/*  57 */     a(☃, map, "minecraft:chicken");
/*  58 */     ☃.register(map, "minecraft:commandblock_minecart", str -> DSL.optionalFields("DisplayTile", akn.q.in(☃)));
/*     */ 
/*     */     
/*  61 */     a(☃, map, "minecraft:cow");
/*  62 */     a(☃, map, "minecraft:creeper");
/*  63 */     ☃.register(map, "minecraft:donkey", str -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     ☃.registerSimple(map, "minecraft:dragon_fireball");
/*  69 */     b(☃, map, "minecraft:egg");
/*  70 */     a(☃, map, "minecraft:elder_guardian");
/*  71 */     ☃.registerSimple(map, "minecraft:ender_crystal");
/*  72 */     a(☃, map, "minecraft:ender_dragon");
/*  73 */     ☃.register(map, "minecraft:enderman", str -> DSL.optionalFields("carried", akn.q.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */     
/*  77 */     a(☃, map, "minecraft:endermite");
/*  78 */     b(☃, map, "minecraft:ender_pearl");
/*  79 */     ☃.registerSimple(map, "minecraft:eye_of_ender_signal");
/*  80 */     ☃.register(map, "minecraft:falling_block", str -> DSL.optionalFields("Block", akn.q.in(☃), "TileEntityData", akn.k.in(☃)));
/*     */ 
/*     */ 
/*     */     
/*  84 */     b(☃, map, "minecraft:fireball");
/*  85 */     ☃.register(map, "minecraft:fireworks_rocket", str -> DSL.optionalFields("FireworksItem", akn.l.in(☃)));
/*     */ 
/*     */     
/*  88 */     ☃.register(map, "minecraft:furnace_minecart", str -> DSL.optionalFields("DisplayTile", akn.q.in(☃)));
/*     */ 
/*     */     
/*  91 */     a(☃, map, "minecraft:ghast");
/*  92 */     a(☃, map, "minecraft:giant");
/*  93 */     a(☃, map, "minecraft:guardian");
/*  94 */     ☃.register(map, "minecraft:hopper_minecart", str -> DSL.optionalFields("DisplayTile", akn.q.in(☃), "Items", DSL.list(akn.l.in(☃))));
/*     */ 
/*     */ 
/*     */     
/*  98 */     ☃.register(map, "minecraft:horse", str -> DSL.optionalFields("ArmorItem", akn.l.in(☃), "SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     a(☃, map, "minecraft:husk");
/* 105 */     ☃.register(map, "minecraft:item", str -> DSL.optionalFields("Item", akn.l.in(☃)));
/*     */ 
/*     */     
/* 108 */     ☃.register(map, "minecraft:item_frame", str -> DSL.optionalFields("Item", akn.l.in(☃)));
/*     */ 
/*     */     
/* 111 */     ☃.registerSimple(map, "minecraft:leash_knot");
/* 112 */     a(☃, map, "minecraft:magma_cube");
/* 113 */     ☃.register(map, "minecraft:minecart", str -> DSL.optionalFields("DisplayTile", akn.q.in(☃)));
/*     */ 
/*     */     
/* 116 */     a(☃, map, "minecraft:mooshroom");
/* 117 */     ☃.register(map, "minecraft:mule", str -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     a(☃, map, "minecraft:ocelot");
/* 123 */     ☃.registerSimple(map, "minecraft:painting");
/* 124 */     ☃.registerSimple(map, "minecraft:parrot");
/* 125 */     a(☃, map, "minecraft:pig");
/* 126 */     a(☃, map, "minecraft:polar_bear");
/* 127 */     ☃.register(map, "minecraft:potion", str -> DSL.optionalFields("Potion", akn.l.in(☃), "inTile", akn.q.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 131 */     a(☃, map, "minecraft:rabbit");
/* 132 */     a(☃, map, "minecraft:sheep");
/* 133 */     a(☃, map, "minecraft:shulker");
/* 134 */     ☃.registerSimple(map, "minecraft:shulker_bullet");
/* 135 */     a(☃, map, "minecraft:silverfish");
/* 136 */     a(☃, map, "minecraft:skeleton");
/* 137 */     ☃.register(map, "minecraft:skeleton_horse", str -> DSL.optionalFields("SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 141 */     a(☃, map, "minecraft:slime");
/* 142 */     b(☃, map, "minecraft:small_fireball");
/* 143 */     b(☃, map, "minecraft:snowball");
/* 144 */     a(☃, map, "minecraft:snowman");
/* 145 */     ☃.register(map, "minecraft:spawner_minecart", str -> DSL.optionalFields("DisplayTile", akn.q.in(☃), akn.s.in(☃)));
/*     */ 
/*     */ 
/*     */     
/* 149 */     ☃.register(map, "minecraft:spectral_arrow", str -> DSL.optionalFields("inTile", akn.q.in(☃)));
/*     */ 
/*     */     
/* 152 */     a(☃, map, "minecraft:spider");
/* 153 */     a(☃, map, "minecraft:squid");
/* 154 */     a(☃, map, "minecraft:stray");
/* 155 */     ☃.registerSimple(map, "minecraft:tnt");
/* 156 */     ☃.register(map, "minecraft:tnt_minecart", str -> DSL.optionalFields("DisplayTile", akn.q.in(☃)));
/*     */ 
/*     */     
/* 159 */     ☃.register(map, "minecraft:villager", str -> DSL.optionalFields("Inventory", DSL.list(akn.l.in(☃)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", akn.l.in(☃), "buyB", akn.l.in(☃), "sell", akn.l.in(☃)))), alo.a(☃)));
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
/* 172 */     a(☃, map, "minecraft:villager_golem");
/* 173 */     a(☃, map, "minecraft:witch");
/* 174 */     a(☃, map, "minecraft:wither");
/* 175 */     a(☃, map, "minecraft:wither_skeleton");
/* 176 */     b(☃, map, "minecraft:wither_skull");
/* 177 */     a(☃, map, "minecraft:wolf");
/* 178 */     b(☃, map, "minecraft:xp_bottle");
/* 179 */     ☃.registerSimple(map, "minecraft:xp_orb");
/* 180 */     a(☃, map, "minecraft:zombie");
/* 181 */     ☃.register(map, "minecraft:zombie_horse", str -> DSL.optionalFields("SaddleItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */     
/* 185 */     a(☃, map, "minecraft:zombie_pigman");
/* 186 */     a(☃, map, "minecraft:zombie_villager");
/*     */ 
/*     */     
/* 189 */     ☃.registerSimple(map, "minecraft:evocation_fangs");
/* 190 */     a(☃, map, "minecraft:evocation_illager");
/* 191 */     ☃.registerSimple(map, "minecraft:illusion_illager");
/* 192 */     ☃.register(map, "minecraft:llama", str -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "SaddleItem", akn.l.in(☃), "DecorItem", akn.l.in(☃), alo.a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 198 */     ☃.registerSimple(map, "minecraft:llama_spit");
/* 199 */     a(☃, map, "minecraft:vex");
/* 200 */     a(☃, map, "minecraft:vindication_illager");
/*     */     
/* 202 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 207 */     super.registerTypes(☃, map1, map2);
/* 208 */     ☃.registerType(true, akn.p, () -> DSL.taggedChoiceLazy("id", a(), ☃));
/* 209 */     ☃.registerType(true, akn.l, () -> DSL.hook(DSL.optionalFields("id", akn.r.in(☃), "tag", DSL.optionalFields("EntityTag", akn.o.in(☃), "BlockEntityTag", akn.k.in(☃), "CanDestroy", DSL.list(akn.q.in(☃)), "CanPlaceOn", DSL.list(akn.q.in(☃)))), b, Hook.HookFunction.IDENTITY));
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
/* 220 */   protected static final Hook.HookFunction b = new Hook.HookFunction()
/*     */     {
/*     */       public <T> T apply(DynamicOps<T> ☃, T t) {
/* 223 */         return anl.a(new Dynamic(☃, t), ani.a, "minecraft:armor_stand");
/*     */       }
/*     */     };
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\anj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */