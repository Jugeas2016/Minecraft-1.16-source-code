/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class aje extends DataFix {
/*    */   static {
/* 17 */     a = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), ☃ -> {
/*    */           ☃.put(0, "minecraft:protection");
/*    */           ☃.put(1, "minecraft:fire_protection");
/*    */           ☃.put(2, "minecraft:feather_falling");
/*    */           ☃.put(3, "minecraft:blast_protection");
/*    */           ☃.put(4, "minecraft:projectile_protection");
/*    */           ☃.put(5, "minecraft:respiration");
/*    */           ☃.put(6, "minecraft:aqua_affinity");
/*    */           ☃.put(7, "minecraft:thorns");
/*    */           ☃.put(8, "minecraft:depth_strider");
/*    */           ☃.put(9, "minecraft:frost_walker");
/*    */           ☃.put(10, "minecraft:binding_curse");
/*    */           ☃.put(16, "minecraft:sharpness");
/*    */           ☃.put(17, "minecraft:smite");
/*    */           ☃.put(18, "minecraft:bane_of_arthropods");
/*    */           ☃.put(19, "minecraft:knockback");
/*    */           ☃.put(20, "minecraft:fire_aspect");
/*    */           ☃.put(21, "minecraft:looting");
/*    */           ☃.put(22, "minecraft:sweeping");
/*    */           ☃.put(32, "minecraft:efficiency");
/*    */           ☃.put(33, "minecraft:silk_touch");
/*    */           ☃.put(34, "minecraft:unbreaking");
/*    */           ☃.put(35, "minecraft:fortune");
/*    */           ☃.put(48, "minecraft:power");
/*    */           ☃.put(49, "minecraft:punch");
/*    */           ☃.put(50, "minecraft:flame");
/*    */           ☃.put(51, "minecraft:infinity");
/*    */           ☃.put(61, "minecraft:luck_of_the_sea");
/*    */           ☃.put(62, "minecraft:lure");
/*    */           ☃.put(65, "minecraft:loyalty");
/*    */           ☃.put(66, "minecraft:impaling");
/*    */           ☃.put(67, "minecraft:riptide");
/*    */           ☃.put(68, "minecraft:channeling");
/*    */           ☃.put(70, "minecraft:mending");
/*    */           ☃.put(71, "minecraft:vanishing_curse");
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final Int2ObjectMap<String> a;
/*    */ 
/*    */   
/*    */   public aje(Schema ☃, boolean bool) {
/* 61 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 66 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/* 67 */     OpticFinder<?> opticFinder = ☃.findField("tag");
/* 68 */     return fixTypeEverywhereTyped("ItemStackEnchantmentFix", ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃) {
/* 74 */     Optional<? extends Dynamic<?>> optional = ☃.get("ench").asStreamOpt().map(☃ -> ☃.map(())).map(☃::createList).result();
/*    */     
/* 76 */     if (optional.isPresent()) {
/* 77 */       ☃ = ☃.remove("ench").set("Enchantments", optional.get());
/*    */     }
/*    */     
/* 80 */     return ☃.update("StoredEnchantments", ☃ -> (Dynamic)DataFixUtils.orElse(☃.asStreamOpt().map(()).map(☃::createList).result(), ☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aje.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */