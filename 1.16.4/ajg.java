/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class ajg
/*    */   extends DataFix
/*    */ {
/*    */   private static final Map<String, String> a;
/*    */   
/*    */   public ajg(Schema ☃, boolean bool) {
/* 22 */     super(☃, bool);
/*    */   }
/*    */   static {
/* 25 */     a = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*    */           ☃.put("minecraft:bat", "minecraft:bat_spawn_egg");
/*    */           ☃.put("minecraft:blaze", "minecraft:blaze_spawn_egg");
/*    */           ☃.put("minecraft:cave_spider", "minecraft:cave_spider_spawn_egg");
/*    */           ☃.put("minecraft:chicken", "minecraft:chicken_spawn_egg");
/*    */           ☃.put("minecraft:cow", "minecraft:cow_spawn_egg");
/*    */           ☃.put("minecraft:creeper", "minecraft:creeper_spawn_egg");
/*    */           ☃.put("minecraft:donkey", "minecraft:donkey_spawn_egg");
/*    */           ☃.put("minecraft:elder_guardian", "minecraft:elder_guardian_spawn_egg");
/*    */           ☃.put("minecraft:enderman", "minecraft:enderman_spawn_egg");
/*    */           ☃.put("minecraft:endermite", "minecraft:endermite_spawn_egg");
/*    */           ☃.put("minecraft:evocation_illager", "minecraft:evocation_illager_spawn_egg");
/*    */           ☃.put("minecraft:ghast", "minecraft:ghast_spawn_egg");
/*    */           ☃.put("minecraft:guardian", "minecraft:guardian_spawn_egg");
/*    */           ☃.put("minecraft:horse", "minecraft:horse_spawn_egg");
/*    */           ☃.put("minecraft:husk", "minecraft:husk_spawn_egg");
/*    */           ☃.put("minecraft:llama", "minecraft:llama_spawn_egg");
/*    */           ☃.put("minecraft:magma_cube", "minecraft:magma_cube_spawn_egg");
/*    */           ☃.put("minecraft:mooshroom", "minecraft:mooshroom_spawn_egg");
/*    */           ☃.put("minecraft:mule", "minecraft:mule_spawn_egg");
/*    */           ☃.put("minecraft:ocelot", "minecraft:ocelot_spawn_egg");
/*    */           ☃.put("minecraft:pufferfish", "minecraft:pufferfish_spawn_egg");
/*    */           ☃.put("minecraft:parrot", "minecraft:parrot_spawn_egg");
/*    */           ☃.put("minecraft:pig", "minecraft:pig_spawn_egg");
/*    */           ☃.put("minecraft:polar_bear", "minecraft:polar_bear_spawn_egg");
/*    */           ☃.put("minecraft:rabbit", "minecraft:rabbit_spawn_egg");
/*    */           ☃.put("minecraft:sheep", "minecraft:sheep_spawn_egg");
/*    */           ☃.put("minecraft:shulker", "minecraft:shulker_spawn_egg");
/*    */           ☃.put("minecraft:silverfish", "minecraft:silverfish_spawn_egg");
/*    */           ☃.put("minecraft:skeleton", "minecraft:skeleton_spawn_egg");
/*    */           ☃.put("minecraft:skeleton_horse", "minecraft:skeleton_horse_spawn_egg");
/*    */           ☃.put("minecraft:slime", "minecraft:slime_spawn_egg");
/*    */           ☃.put("minecraft:spider", "minecraft:spider_spawn_egg");
/*    */           ☃.put("minecraft:squid", "minecraft:squid_spawn_egg");
/*    */           ☃.put("minecraft:stray", "minecraft:stray_spawn_egg");
/*    */           ☃.put("minecraft:turtle", "minecraft:turtle_spawn_egg");
/*    */           ☃.put("minecraft:vex", "minecraft:vex_spawn_egg");
/*    */           ☃.put("minecraft:villager", "minecraft:villager_spawn_egg");
/*    */           ☃.put("minecraft:vindication_illager", "minecraft:vindication_illager_spawn_egg");
/*    */           ☃.put("minecraft:witch", "minecraft:witch_spawn_egg");
/*    */           ☃.put("minecraft:wither_skeleton", "minecraft:wither_skeleton_spawn_egg");
/*    */           ☃.put("minecraft:wolf", "minecraft:wolf_spawn_egg");
/*    */           ☃.put("minecraft:zombie", "minecraft:zombie_spawn_egg");
/*    */           ☃.put("minecraft:zombie_horse", "minecraft:zombie_horse_spawn_egg");
/*    */           ☃.put("minecraft:zombie_pigman", "minecraft:zombie_pigman_spawn_egg");
/*    */           ☃.put("minecraft:zombie_villager", "minecraft:zombie_villager_spawn_egg");
/*    */         });
/*    */   }
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 75 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/*    */     
/* 77 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 78 */     OpticFinder<String> opticFinder1 = DSL.fieldFinder("id", aln.a());
/* 79 */     OpticFinder<?> opticFinder2 = ☃.findField("tag");
/* 80 */     OpticFinder<?> opticFinder3 = opticFinder2.type().findField("EntityTag");
/*    */     
/* 82 */     return fixTypeEverywhereTyped("ItemInstanceSpawnEggFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:spawn_egg")) {
/*    */             Typed<?> typed1 = typed.getOrCreateTyped(opticFinder1);
/*    */             Typed<?> typed2 = typed1.getOrCreateTyped(opticFinder2);
/*    */             Optional<String> optional1 = typed2.getOptional(opticFinder3);
/*    */             if (optional1.isPresent())
/*    */               return typed.set(☃, Pair.of(akn.r.typeName(), a.getOrDefault(optional1.get(), "minecraft:pig_spawn_egg"))); 
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */